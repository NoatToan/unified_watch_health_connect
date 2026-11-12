package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.entity.health.Health;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.SettingsLanguage;
import com.huami.bluetooth.profile.channel.module.settings.entity.screenlock.ScreenLockAndPassword;
import com.huami.bluetooth.profile.channel.module.settings.entity.sport.Sport;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Flag;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntegerArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringEnum;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.TimeStamp;
import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008c\u0001\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001d*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b\u001a\u001c\u0010\u0011\u001a\u0004\u0018\u00010 *\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e\u001a\u001c\u0010\u001a\u001a\u0004\u0018\u00010!*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e\u001a\u001c\u0010\u0015\u001a\u0004\u0018\u00010\"*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e\u001a\u0014\u0010\u0013\u001a\u0004\u0018\u00010#*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b\u001a\u001c\u0010\u0007\u001a\u0004\u0018\u00010$*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e\u001a\u0014\u0010\u0015\u001a\u0004\u0018\u00010%*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b\u001a\u0014\u0010\u0003\u001a\u0004\u0018\u00010&*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b\u001a\u001c\u0010\t\u001a\u0004\u0018\u00010'*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e\u001a\u001c\u0010\u0003\u001a\u0004\u0018\u00010(*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e\u001a\u001c\u0010\u0013\u001a\u0004\u0018\u00010)*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e¨\u0006*"}, d2 = {"", "cmd", "Lis;", PluginDeviceInfo.FMODEL, "Ljava/nio/ByteBuffer;", "byteBuffer", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/SettingsLanguage;", PluginDeviceInfo.FBLUETOOTHPAIR, "Lmn;", PluginDeviceInfo.FLOCALIZATIONS, "Lww;", Constant.KeyValue.KEY_COLUMN, "Lcom/huami/bluetooth/profile/channel/module/settings/entity/screenlock/ScreenLockAndPassword;", "h", "Lus;", "i", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/Health;", PluginDeviceInfo.FICONOFFLINE, "Lc7;", PluginDeviceInfo.FDESC, "Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;", PluginDeviceInfo.FICONOFF, "Lcom/huami/bluetooth/profile/channel/module/settings/entity/sport/Sport;", "j", "Li5;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", PluginDeviceInfo.FICONON, "", "typeMsg", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "", "containDesc", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "Lnj;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntegerArray;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Flag;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringData;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/TimeStamp;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/BooleanData;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;", "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class fs {
    @NotNull
    public static final is a(@NotNull byte[] cmd) {
        Object objM886constructorimpl;
        is isVar;
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        try {
            Result.Companion companion = Result.Companion;
            if (cmd.length == 2) {
                isVar = new is(cmd[1], null, null, 6, null);
            } else {
                byte b2 = cmd[1];
                byte b3 = cmd[2];
                ArrayList arrayList = new ArrayList();
                int length = cmd.length;
                for (int i = 3; i < length; i++) {
                    SettingsGroupType settingsGroupTypeA = SettingsGroupType.INSTANCE.a(cmd[i]);
                    if (settingsGroupTypeA != null) {
                        arrayList.add(settingsGroupTypeA);
                    }
                }
                isVar = new is(b2, Integer.valueOf(b3), arrayList);
            }
            objM886constructorimpl = Result.m886constructorimpl(isVar);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m892isFailureimpl(objM886constructorimpl)) {
            objM886constructorimpl = null;
        }
        is isVar2 = (is) objM886constructorimpl;
        return isVar2 == null ? new is(-1, null, null, 6, null) : isVar2;
    }

    @Nullable
    public static final c7 b(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        int iW = z2.w(byteBuffer);
        if (iW <= 1) {
            return new d7().a(byteBuffer, iW);
        }
        t5t.d("SettingsParser", "parseDeviceInformation version not support. current: 1, device: " + iW);
        return null;
    }

    @Nullable
    public static final DisplayAndBrightness c(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        int iW = z2.w(byteBuffer);
        if (iW > 2) {
            t5t.d("SettingsParser", "parseDisplayAndBrightness version not support. current: 2, device: " + iW);
            return null;
        }
        if (iW == 1) {
            return new k8().a(byteBuffer, iW);
        }
        if (iW != 2) {
            return null;
        }
        return new l8().a(byteBuffer, iW);
    }

    @Nullable
    public static final General d(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        int iW = z2.w(byteBuffer);
        if (iW <= 2) {
            return new oc().a(byteBuffer, iW);
        }
        t5t.d("SettingsParser", "parseGeneral version not support. current: 2, device: " + iW);
        return null;
    }

    @Nullable
    public static final Health e(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        int iW = z2.w(byteBuffer);
        if (iW <= 2) {
            return new of().a(byteBuffer, iW);
        }
        t5t.d("SettingsParser", "parseHealth version not support. current: 2, device: " + iW);
        return null;
    }

    @Nullable
    public static final SettingsLanguage f(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        int iW = z2.w(byteBuffer);
        if (iW > 2) {
            t5t.d("SettingsParser", "parseLanguage version not support. current: 2, device: " + iW);
            return null;
        }
        if (iW == 1) {
            return new bk().a(byteBuffer, iW);
        }
        if (iW != 2) {
            return null;
        }
        return new ck().a(byteBuffer, iW);
    }

    @Nullable
    public static final mn g(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        int iW = z2.w(byteBuffer);
        if (iW > 2) {
            t5t.d("SettingsParser", "parseOfflineVoice version not support. current: 2, device: " + iW);
            return null;
        }
        if (iW == 1) {
            return new on().a(byteBuffer, iW);
        }
        if (iW != 2) {
            return null;
        }
        return new qn().a(byteBuffer, iW);
    }

    @Nullable
    public static final ScreenLockAndPassword h(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        int iW = z2.w(byteBuffer);
        if (iW <= 1) {
            return new or().a(byteBuffer, iW);
        }
        t5t.d("SettingsParser", "parseScreenLockAndPassword version not support. current: 1, device: " + iW);
        return null;
    }

    @Nullable
    public static final us i(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        int iW = z2.w(byteBuffer);
        if (iW > 2) {
            t5t.d("SettingsParser", "parseSoundAndVibrate version not support. current: 2, device: " + iW);
            return null;
        }
        if (iW == 1) {
            return new ws().a(byteBuffer, iW);
        }
        if (iW != 2) {
            return null;
        }
        return new ys().a(byteBuffer, iW);
    }

    @Nullable
    public static final Sport j(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        int iW = z2.w(byteBuffer);
        if (iW <= 1) {
            return new mt().a(byteBuffer, iW);
        }
        t5t.d("SettingsParser", "parseConnection version not support. current: 1, device: " + iW);
        return null;
    }

    @Nullable
    public static final ww k(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        int iW = z2.w(byteBuffer);
        if (iW > 2) {
            t5t.d("SettingsParser", "parseWearingWay version not support. current: 2, device: " + iW);
            return null;
        }
        if (iW == 1) {
            return new yw().a(byteBuffer, iW);
        }
        if (iW != 2) {
            return null;
        }
        return new zw().a(byteBuffer, iW);
    }

    @Nullable
    public static final Flag b(@NotNull ByteBuffer byteBuffer, @NotNull String typeMsg) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(typeMsg, "typeMsg");
        if (!z2.d(byteBuffer)) {
            t5t.d("SettingsParser", typeMsg + " type mismatch.");
            return null;
        }
        return z2.n(byteBuffer);
    }

    @Nullable
    public static final IntegerArray d(@NotNull ByteBuffer byteBuffer, @NotNull String typeMsg, boolean z) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(typeMsg, "typeMsg");
        if (!z2.g(byteBuffer)) {
            t5t.d("SettingsParser", typeMsg + " type mismatch.");
            return null;
        }
        return z2.d(byteBuffer, z);
    }

    @Nullable
    public static final IntData e(@NotNull ByteBuffer byteBuffer, @NotNull String typeMsg, boolean z) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(typeMsg, "typeMsg");
        if (!z2.e(byteBuffer)) {
            t5t.d("SettingsParser", typeMsg + " type mismatch.");
            return null;
        }
        return z2.e(byteBuffer, z);
    }

    @Nullable
    public static final StringData f(@NotNull ByteBuffer byteBuffer, @NotNull String typeMsg, boolean z) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(typeMsg, "typeMsg");
        if (!z2.h(byteBuffer)) {
            t5t.d("SettingsParser", typeMsg + " type mismatch.");
            return null;
        }
        return z2.f(byteBuffer, z);
    }

    @Nullable
    public static final Time c(@NotNull ByteBuffer byteBuffer, @NotNull String typeMsg) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(typeMsg, "typeMsg");
        if (!z2.j(byteBuffer)) {
            t5t.d("SettingsParser", typeMsg + " type mismatch.");
            return null;
        }
        return z2.r(byteBuffer);
    }

    @Nullable
    public static final StringEnum g(@NotNull ByteBuffer byteBuffer, @NotNull String typeMsg, boolean z) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(typeMsg, "typeMsg");
        if (!z2.i(byteBuffer)) {
            t5t.d("SettingsParser", typeMsg + " type mismatch");
            return null;
        }
        return z2.g(byteBuffer, z);
    }

    @Nullable
    public static final EnumArray b(@NotNull ByteBuffer byteBuffer, @NotNull String typeMsg, boolean z) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(typeMsg, "typeMsg");
        if (!z2.c(byteBuffer)) {
            t5t.d("SettingsParser", typeMsg + " type mismatch");
            return null;
        }
        return z2.a(byteBuffer, z);
    }

    @Nullable
    public static final TimeStamp d(@NotNull ByteBuffer byteBuffer, @NotNull String typeMsg) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(typeMsg, "typeMsg");
        if (!z2.k(byteBuffer)) {
            t5t.d("SettingsParser", typeMsg + " type mismatch.");
            return null;
        }
        return z2.s(byteBuffer);
    }

    @Nullable
    public static final Int32Data c(@NotNull ByteBuffer byteBuffer, @NotNull String typeMsg, boolean z) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(typeMsg, "typeMsg");
        if (!z2.f(byteBuffer)) {
            t5t.d("SettingsParser", typeMsg + " type mismatch.");
            return null;
        }
        return z2.c(byteBuffer, z);
    }

    @Nullable
    public static final i5 a(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        int iW = z2.w(byteBuffer);
        if (iW > 1) {
            t5t.d("SettingsParser", "parseConnection version not support. current: 1, device: " + iW);
            return null;
        }
        return new k5().a(byteBuffer, iW);
    }

    @Nullable
    public static final BooleanData a(@NotNull ByteBuffer byteBuffer, @NotNull String typeMsg) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(typeMsg, "typeMsg");
        if (!z2.a(byteBuffer)) {
            t5t.d("SettingsParser", typeMsg + " type mismatch.");
            return null;
        }
        return z2.m(byteBuffer);
    }

    @Nullable
    public static final EnumData a(@NotNull ByteBuffer byteBuffer, @NotNull String typeMsg, boolean z) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(typeMsg, "typeMsg");
        if (!z2.b(byteBuffer)) {
            t5t.d("SettingsParser", typeMsg + " type mismatch.");
            return null;
        }
        return z2.b(byteBuffer, z);
    }
}
