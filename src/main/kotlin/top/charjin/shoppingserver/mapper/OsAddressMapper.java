package top.charjin.shoppingserver.mapper;

import org.apache.ibatis.annotations.Update;
import org.jetbrains.annotations.Nullable;
import top.charjin.shoppingserver.entity.OsAddress;

import java.util.List;

public interface OsAddressMapper {
    int deleteByPrimaryKey(Integer addressId);

    int insert(OsAddress record);

    int insertSelective(OsAddress record);

    OsAddress selectByPrimaryKey(Integer addressId);

    int updateByPrimaryKeySelective(OsAddress record);

    int updateByPrimaryKey(OsAddress record);

    List<OsAddress> getAllAddressByUserId(Integer userId);

    @Update("update os_address set is_default = 0 where user_id = #{userId} and is_default = 1")
    int resetDefaultAddress(int userId);

    @Nullable
    OsAddress getDefaultAddressByUserId(int userId);
}