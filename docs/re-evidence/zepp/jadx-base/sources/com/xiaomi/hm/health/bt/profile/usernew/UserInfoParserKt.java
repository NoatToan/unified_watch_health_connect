package com.xiaomi.hm.health.bt.profile.usernew;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.profile.user.BirthDateExt;
import com.xiaomi.hm.health.bt.profile.user.GenderExt;
import com.xiaomi.hm.health.bt.profile.user.LocationExt;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0002\u001a\f\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0002\u001a\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n*\u0004\u0018\u00010\nH\u0002\u001a\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u001a\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0002\u001a\u000e\u0010\u001d\u001a\u00020\u0011*\u0004\u0018\u00010\rH\u0002\"\u0016\u0010\u001f\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u001e¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/bt/model/UserInfoExt;", "userInfoExt", "Lcom/xiaomi/hm/health/bt/profile/usernew/UserInfoDto;", "userInfoExt2Dto", "userInfoDto", "userInfoDto2Ext", "", "getFlag", "", "toBleBytes", "", "a", "rawData", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "toUserInfoDto", "flag", "", "b", GoogleApiAvailabilityLight.a, "e", "l", z.j, "g", hl.k, "c", "i", "f", "h", "m", "Ljava/lang/String;", "TAG", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class UserInfoParserKt {

    @NotNull
    private static final String a = "UserInfoParser";

    private static final String a(String str) {
        if (str == null || m.isBlank(str)) {
            return null;
        }
        return str;
    }

    private static final boolean b(int i) {
        return (i & 1) != 0;
    }

    private static final boolean c(int i) {
        return (i & 128) != 0;
    }

    private static final boolean d(int i) {
        return (i & 2) != 0;
    }

    private static final boolean e(int i) {
        return (i & 4) != 0;
    }

    private static final boolean f(int i) {
        return (i & 512) != 0;
    }

    private static final boolean g(int i) {
        return (i & 32) != 0;
    }

    public static final int getFlag(@NotNull UserInfoDto userInfoDto) {
        int i = userInfoDto.getBirth() == null ? 0 : 1;
        if (userInfoDto.getGender() != null) {
            i |= 2;
        }
        Integer height = userInfoDto.getHeight();
        if (height != null) {
            height.intValue();
            i |= 4;
        }
        Float weight = userInfoDto.getWeight();
        if (weight != null) {
            weight.floatValue();
            i |= 8;
        }
        Long stepGoal = userInfoDto.getStepGoal();
        if (stepGoal != null) {
            stepGoal.longValue();
            i |= 16;
        }
        if (userInfoDto.getLocation() != null) {
            i |= 32;
        }
        Long uid = userInfoDto.getUid();
        if (uid != null) {
            uid.longValue();
            i |= 64;
        }
        if (userInfoDto.getBloodPressure() != null) {
            i |= 128;
        }
        if (a(userInfoDto.getRegisterRegion()) != null) {
            i |= 256;
        }
        Short idc = userInfoDto.getIdc();
        if (idc != null) {
            idc.shortValue();
            i |= 512;
        }
        return a(userInfoDto.getNickName()) == null ? i : i | 1024;
    }

    private static final boolean h(int i) {
        return (i & 1024) != 0;
    }

    private static final boolean i(int i) {
        return (i & 256) != 0;
    }

    private static final boolean j(int i) {
        return (i & 16) != 0;
    }

    private static final boolean k(int i) {
        return (i & 64) != 0;
    }

    private static final boolean l(int i) {
        return (i & 8) != 0;
    }

    private static final boolean m(HMDeviceSource hMDeviceSource) {
        if (hMDeviceSource == null) {
            return false;
        }
        return CollectionsKt__CollectionsKt.arrayListOf(HMDeviceSource.MILI_LISBON, HMDeviceSource.MILI_LISBON_W, HMDeviceSource.MILI_LISBON_WL, HMDeviceSource.MILI_NEWTON, HMDeviceSource.MILI_NEWTON_W, HMDeviceSource.MILI_NEWTON_WL, HMDeviceSource.MILI_ONYX, HMDeviceSource.MILI_ONYX_W, HMDeviceSource.MILI_CORSICA, HMDeviceSource.MILI_CORSICA_W, HMDeviceSource.MILI_OSPREY, HMDeviceSource.MILI_OSPREY_W, HMDeviceSource.MILI_OSPREY_C, HMDeviceSource.MILI_HAMBURG, HMDeviceSource.MILI_HAMBURG_W, HMDeviceSource.MILI_BONN, HMDeviceSource.MILI_BONN_W, HMDeviceSource.MILI_VOLGA, HMDeviceSource.MILI_VOLGA_W).contains(hMDeviceSource);
    }

    @Nullable
    public static final byte[] toBleBytes(@NotNull UserInfoDto userInfoDto) {
        try {
            Result.Companion companion = Result.Companion;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(1);
            byteArrayOutputStream.write(GattUtils.intToBytes(getFlag(userInfoDto)));
            Birth birth = userInfoDto.getBirth();
            if (birth != null) {
                byteArrayOutputStream.write(GattUtils.shortToBytes(birth.getYear()));
                byteArrayOutputStream.write(birth.getMonth());
                byteArrayOutputStream.write(birth.getDay());
            }
            Gender gender = userInfoDto.getGender();
            if (gender != null) {
                byteArrayOutputStream.write(gender.getValue());
            }
            Integer height = userInfoDto.getHeight();
            if (height != null) {
                byteArrayOutputStream.write(GattUtils.shortToBytes((short) height.intValue()));
            }
            Float weight = userInfoDto.getWeight();
            if (weight != null) {
                byteArrayOutputStream.write(GattUtils.shortToBytes((short) (weight.floatValue() * 200)));
            }
            Long stepGoal = userInfoDto.getStepGoal();
            if (stepGoal != null) {
                byteArrayOutputStream.write(GattUtils.intToBytes((int) stepGoal.longValue()));
            }
            LocationExt location = userInfoDto.getLocation();
            if (location != null) {
                LocationExt.Wear wear = location.getWear();
                byteArrayOutputStream.write((byte) ((location.getWay().getValue() << 7) | wear.getValue()));
            }
            Long uid = userInfoDto.getUid();
            if (uid != null) {
                byteArrayOutputStream.write(GattUtils.longToBytes(uid.longValue()));
            }
            BloodPressure bloodPressure = userInfoDto.getBloodPressure();
            if (bloodPressure != null) {
                byteArrayOutputStream.write(bloodPressure.getDiastolic());
                byteArrayOutputStream.write(bloodPressure.getSystolic());
            }
            String strA = a(userInfoDto.getRegisterRegion());
            if (strA != null) {
                String lowerCase = strA.toLowerCase(Locale.getDefault());
                Charset charset = Charsets.UTF_8;
                if (lowerCase == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byteArrayOutputStream.write(lowerCase.getBytes(charset));
                byteArrayOutputStream.write(0);
            }
            Short idc = userInfoDto.getIdc();
            if (idc != null) {
                byteArrayOutputStream.write(idc.shortValue());
            }
            String strA2 = a(userInfoDto.getNickName());
            if (strA2 != null) {
                byteArrayOutputStream.write(strA2.getBytes(Charsets.UTF_8));
                byteArrayOutputStream.write(0);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                Debug.fi(a, Intrinsics.stringPlus("toBleBytes: ", thM3848exceptionOrNullimpl));
            }
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = null;
            }
            return (byte[]) objM3845constructorimpl;
        }
    }

    @Nullable
    public static final UserInfoDto toUserInfoDto(@NotNull byte[] bArr, @Nullable HMDeviceSource hMDeviceSource) {
        UserInfoDto userInfoDto = new UserInfoDto(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        if (byteBufferWrap.get() != 4) {
            Debug.fi(a, "type mismatch");
            return null;
        }
        if (byteBufferWrap.get() != 1) {
            Debug.fi(a, "error");
            return null;
        }
        int i = byteBufferWrap.getInt();
        if (b(i)) {
            userInfoDto.setBirth(new Birth(byteBufferWrap.getShort(), byteBufferWrap.get(), byteBufferWrap.get()));
        }
        if (d(i)) {
            userInfoDto.setGender(Gender.INSTANCE.fromValue(byteBufferWrap.get()));
        }
        if (e(i)) {
            userInfoDto.setHeight(Integer.valueOf(ByteBufferExtendsKt.getUInt16(byteBufferWrap)));
        }
        if (l(i)) {
            userInfoDto.setWeight(Float.valueOf(ByteBufferExtendsKt.getUInt16(byteBufferWrap) / 200.0f));
        }
        if (j(i)) {
            userInfoDto.setStepGoal(Long.valueOf(ByteBufferExtendsKt.getUInt32(byteBufferWrap)));
        }
        if (g(i)) {
            userInfoDto.setLocation(ByteBufferExtendsKt.getLocation(byteBufferWrap));
        }
        if (k(i)) {
            userInfoDto.setUid(Long.valueOf(byteBufferWrap.getLong()));
        }
        if (c(i)) {
            userInfoDto.setBloodPressure(new BloodPressure(ByteBufferExtendsKt.getUInt8(byteBufferWrap), (short) ByteBufferExtendsKt.getUInt8ToInt(byteBufferWrap)));
        }
        if (i(i)) {
            userInfoDto.setRegisterRegion(ByteBufferExtendsKt.getString(byteBufferWrap));
        }
        if (f(i)) {
            userInfoDto.setIdc(Short.valueOf(ByteBufferExtendsKt.getUInt8(byteBufferWrap)));
        }
        if (h(i)) {
            boolean zM = m(hMDeviceSource);
            Debug.fi(a, Intrinsics.stringPlus("isGT2: ", Boolean.valueOf(zM)));
            if (!zM) {
                userInfoDto.setNickName(ByteBufferExtendsKt.getString(byteBufferWrap));
            }
        }
        return userInfoDto;
    }

    @Nullable
    public static final UserInfoExt userInfoDto2Ext(@Nullable UserInfoDto userInfoDto) {
        if (userInfoDto == null) {
            return null;
        }
        UserInfoExt userInfoExt = new UserInfoExt();
        Birth birth = userInfoDto.getBirth();
        if (birth != null) {
            userInfoExt.setBirthDate(new BirthDateExt(birth.getYear(), birth.getMonth(), birth.getDay()));
        }
        Gender gender = userInfoDto.getGender();
        if (gender != null) {
            userInfoExt.setGender(GenderExt.fromValue(gender.getValue()));
        }
        Integer height = userInfoDto.getHeight();
        if (height != null) {
            userInfoExt.setHeight((short) height.intValue());
        }
        Float weight = userInfoDto.getWeight();
        if (weight != null) {
            userInfoExt.setWeight((short) weight.floatValue());
        }
        Long stepGoal = userInfoDto.getStepGoal();
        if (stepGoal != null) {
            userInfoExt.setGoal((int) stepGoal.longValue());
        }
        Long uid = userInfoDto.getUid();
        if (uid != null) {
            userInfoExt.setUid(uid.longValue());
        }
        String registerRegion = userInfoDto.getRegisterRegion();
        if (registerRegion != null) {
            userInfoExt.setRegisterRegion(registerRegion);
        }
        Short idc = userInfoDto.getIdc();
        if (idc != null) {
            userInfoExt.setIdc(idc.shortValue());
        }
        String nickName = userInfoDto.getNickName();
        if (nickName != null) {
            userInfoExt.setNickName(nickName);
        }
        return userInfoExt;
    }

    @NotNull
    public static final UserInfoDto userInfoExt2Dto(@NotNull UserInfoExt userInfoExt) {
        return new UserInfoDto(userInfoExt.getNickName(), new Birth(userInfoExt.getBirthDate().getYear(), userInfoExt.getBirthDate().getMonth(), userInfoExt.getBirthDate().getDay()), Gender.INSTANCE.fromValue(userInfoExt.getGender().getValue()), Integer.valueOf(userInfoExt.getHeight()), Float.valueOf(userInfoExt.getWeightFloat()), null, null, Long.valueOf(userInfoExt.isHuamiIdValid() ? userInfoExt.getHuamiId() : userInfoExt.getUid()), null, userInfoExt.getRegisterRegion(), Short.valueOf(userInfoExt.getIdc()));
    }
}
