package defpackage;

import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.profile.user.BirthDateExt;
import com.xiaomi.hm.health.bt.profile.user.GenderExt;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u001a\n\u0010\u0003\u001a\u00020\u0006*\u00020\u0002\u001a\f\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0002\u001a\u0010\u0010\u0003\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\tH\u0002\u001a\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u001a\u0010\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u000e*\u0004\u0018\u00010\u000bH\u0002¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/UserInfoExt;", "userInfoExt", "Lrv;", PluginDeviceInfo.FMODEL, "userInfoDto", PluginDeviceInfo.FICONON, "", "", PluginDeviceInfo.FDESC, "", "rawData", "Lqd;", "source", "flag", "", PluginDeviceInfo.FICONOFF, Constant.KeyValue.KEY_COLUMN, "i", PluginDeviceInfo.FBLUETOOTHPAIR, "j", "h", PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FLOCALIZATIONS, "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class tv {
    public static final boolean a(int i) {
        return (i & 1) != 0;
    }

    public static final boolean b(int i) {
        return (i & 128) != 0;
    }

    public static final boolean c(int i) {
        return (i & 2) != 0;
    }

    public static final boolean d(int i) {
        return (i & 4) != 0;
    }

    public static final boolean e(int i) {
        return (i & 512) != 0;
    }

    public static final boolean f(int i) {
        return (i & 32) != 0;
    }

    public static final boolean g(int i) {
        return (i & 1024) != 0;
    }

    public static final boolean h(int i) {
        return (i & 256) != 0;
    }

    public static final boolean i(int i) {
        return (i & 16) != 0;
    }

    public static final boolean j(int i) {
        return (i & 64) != 0;
    }

    public static final boolean k(int i) {
        return (i & 8) != 0;
    }

    @NotNull
    public static final UserInfoDto a(@NotNull UserInfoExt userInfoExt) {
        Intrinsics.checkNotNullParameter(userInfoExt, "userInfoExt");
        return new UserInfoDto(userInfoExt.getNickName(), new s1(userInfoExt.getBirthDate().getYear(), userInfoExt.getBirthDate().getMonth(), userInfoExt.getBirthDate().getDay()), mc.u.a(userInfoExt.getGender().getValue()), Integer.valueOf(userInfoExt.getHeight()), Float.valueOf(userInfoExt.getWeightFloat()), null, null, Long.valueOf(userInfoExt.isHuamiIdValid() ? userInfoExt.getHuamiId() : userInfoExt.getUid()), null, userInfoExt.getRegisterRegion(), Short.valueOf(userInfoExt.getIdc()));
    }

    @Nullable
    public static final byte[] b(@NotNull UserInfoDto userInfoDto) {
        Intrinsics.checkNotNullParameter(userInfoDto, "<this>");
        try {
            Result.Companion companion = Result.Companion;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(1);
            byteArrayOutputStream.write(tet.p(a(userInfoDto)));
            s1 birth = userInfoDto.getBirth();
            if (birth != null) {
                byteArrayOutputStream.write(tet.s(birth.getF33146a()));
                byteArrayOutputStream.write(birth.getF33147b());
                byteArrayOutputStream.write(birth.getC());
            }
            mc gender = userInfoDto.getGender();
            if (gender != null) {
                byteArrayOutputStream.write(gender.getT());
            }
            Integer height = userInfoDto.getHeight();
            if (height != null) {
                byteArrayOutputStream.write(tet.s((short) height.intValue()));
            }
            Float weight = userInfoDto.getWeight();
            if (weight != null) {
                byteArrayOutputStream.write(tet.s((short) (weight.floatValue() * 200)));
            }
            Long stepGoal = userInfoDto.getStepGoal();
            if (stepGoal != null) {
                byteArrayOutputStream.write(tet.p((int) stepGoal.longValue()));
            }
            kk location = userInfoDto.getLocation();
            if (location != null) {
                kk.b bVarD = location.d();
                byteArrayOutputStream.write((byte) ((location.a().a() << 7) | bVarD.a()));
            }
            Long uid = userInfoDto.getUid();
            if (uid != null) {
                byteArrayOutputStream.write(tet.q(uid.longValue()));
            }
            m2 bloodPressure = userInfoDto.getBloodPressure();
            if (bloodPressure != null) {
                byteArrayOutputStream.write(bloodPressure.getF25662a());
                byteArrayOutputStream.write(bloodPressure.getF25663b());
            }
            String strA = a(userInfoDto.getRegisterRegion());
            if (strA != null) {
                String lowerCase = strA.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                byte[] bytes = lowerCase.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                byteArrayOutputStream.write(bytes);
                byteArrayOutputStream.write(0);
            }
            Short idc = userInfoDto.getIdc();
            if (idc != null) {
                byteArrayOutputStream.write(idc.shortValue());
            }
            String strA2 = a(userInfoDto.getNickName());
            if (strA2 != null) {
                byte[] bytes2 = strA2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                byteArrayOutputStream.write(bytes2);
                byteArrayOutputStream.write(0);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
            Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
            if (thM889exceptionOrNullimpl != null) {
                t5t.d("UserInfoParser", "toBleBytes: " + thM889exceptionOrNullimpl);
            }
            if (Result.m892isFailureimpl(objM886constructorimpl)) {
                objM886constructorimpl = null;
            }
            return (byte[]) objM886constructorimpl;
        }
    }

    @Nullable
    public static final UserInfoExt c(@Nullable UserInfoDto userInfoDto) {
        if (userInfoDto == null) {
            return null;
        }
        UserInfoExt userInfoExt = new UserInfoExt();
        s1 birth = userInfoDto.getBirth();
        if (birth != null) {
            userInfoExt.setBirthDate(new BirthDateExt(birth.getF33146a(), birth.getF33147b(), birth.getC()));
        }
        mc gender = userInfoDto.getGender();
        if (gender != null) {
            userInfoExt.setGender(GenderExt.fromValue(gender.getT()));
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

    public static final int a(@NotNull UserInfoDto userInfoDto) {
        Intrinsics.checkNotNullParameter(userInfoDto, "<this>");
        int i = userInfoDto.getBirth() != null ? 1 : 0;
        if (userInfoDto.getGender() != null) {
            i |= 2;
        }
        if (userInfoDto.getHeight() != null) {
            i |= 4;
        }
        if (userInfoDto.getWeight() != null) {
            i |= 8;
        }
        if (userInfoDto.getStepGoal() != null) {
            i |= 16;
        }
        if (userInfoDto.getLocation() != null) {
            i |= 32;
        }
        if (userInfoDto.getUid() != null) {
            i |= 64;
        }
        if (userInfoDto.getBloodPressure() != null) {
            i |= 128;
        }
        if (a(userInfoDto.getRegisterRegion()) != null) {
            i |= 256;
        }
        if (userInfoDto.getIdc() != null) {
            i |= 512;
        }
        return a(userInfoDto.getNickName()) != null ? i | 1024 : i;
    }

    public static final String a(String str) {
        if (str == null || StringsKt__StringsKt.isBlank(str)) {
            return null;
        }
        return str;
    }

    @Nullable
    public static final UserInfoDto a(@NotNull byte[] rawData, @Nullable qd qdVar) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        UserInfoDto userInfoDto = new UserInfoDto(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        ByteBuffer byteBuffer = ByteBuffer.wrap(rawData);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        if (byteBuffer.get() != 4) {
            t5t.d("UserInfoParser", "type mismatch");
            return null;
        }
        if (byteBuffer.get() != 1) {
            t5t.d("UserInfoParser", "error");
            return null;
        }
        int i = byteBuffer.getInt();
        if (a(i)) {
            userInfoDto.a(new s1(byteBuffer.getShort(), byteBuffer.get(), byteBuffer.get()));
        }
        if (c(i)) {
            userInfoDto.a(mc.u.a(byteBuffer.get()));
        }
        if (d(i)) {
            Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
            userInfoDto.a(Integer.valueOf(z2.t(byteBuffer)));
        }
        if (k(i)) {
            Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
            userInfoDto.a(Float.valueOf(z2.t(byteBuffer) / 200.0f));
        }
        if (i(i)) {
            Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
            userInfoDto.a(Long.valueOf(z2.u(byteBuffer)));
        }
        if (f(i)) {
            Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
            userInfoDto.a(z2.o(byteBuffer));
        }
        if (j(i)) {
            userInfoDto.b(Long.valueOf(byteBuffer.getLong()));
        }
        if (b(i)) {
            Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
            userInfoDto.a(new m2(z2.v(byteBuffer), (short) z2.w(byteBuffer)));
        }
        if (h(i)) {
            Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
            userInfoDto.b(z2.q(byteBuffer));
        }
        if (e(i)) {
            Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
            userInfoDto.a(Short.valueOf(z2.v(byteBuffer)));
        }
        if (g(i)) {
            boolean zA = a(qdVar);
            t5t.d("UserInfoParser", "isGT2: " + zA);
            if (!zA) {
                Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
                userInfoDto.a(z2.q(byteBuffer));
            }
        }
        return userInfoDto;
    }

    public static final boolean a(qd qdVar) {
        if (qdVar == null) {
            return false;
        }
        return CollectionsKt__CollectionsKt.arrayListOf(qd.l1, qd.m1, qd.N2, qd.E1, qd.F1, qd.O2, qd.j1, qd.A1, qd.k1, qd.B1, qd.h1, qd.i1, qd.A2, qd.m2, qd.o2, qd.n2, qd.p2, qd.O1, qd.P1).contains(qdVar);
    }
}
