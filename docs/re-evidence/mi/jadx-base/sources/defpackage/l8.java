package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2.DisplayAndBrightnessV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringEnum;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Ll8;", "Lsi;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "groupVersion", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class l8 implements si<DisplayAndBrightnessV2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f24754a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ll8$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Nullable
    public IPrimaryData a(@NotNull ByteBuffer byteBuffer, boolean z, int i) {
        return si.a.a(this, byteBuffer, z, i);
    }

    @Nullable
    public DisplayAndBrightnessV2 a(@NotNull ByteBuffer byteBuffer, int groupVersion) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        DisplayAndBrightnessV2 displayAndBrightnessV2 = new DisplayAndBrightnessV2();
        displayAndBrightnessV2.setGroupVersion(groupVersion);
        boolean zL = z2.l(byteBuffer);
        byte b2 = byteBuffer.get();
        for (int i = 0; i < b2; i++) {
            byte b3 = byteBuffer.get();
            DisplayAndBrightnessV2.Companion companion = DisplayAndBrightnessV2.INSTANCE;
            if (b3 == companion.a()) {
                BooleanData booleanDataA = fs.a(byteBuffer, "autoBrightness");
                if (booleanDataA == null) {
                    return null;
                }
                displayAndBrightnessV2.setAutoBrightness(Boolean.valueOf(booleanDataA.getValue()));
            } else if (b3 == companion.b()) {
                IntData intDataE = fs.e(byteBuffer, "brightness", zL);
                if (intDataE == null) {
                    return null;
                }
                displayAndBrightnessV2.setBrightness(intDataE);
            } else if (b3 == companion.k()) {
                EnumData enumDataA = fs.a(byteBuffer, "screenOffTime", zL);
                if (enumDataA == null) {
                    return null;
                }
                displayAndBrightnessV2.setScreenOffTime(enumDataA);
            } else if (b3 == companion.f()) {
                EnumData enumDataA2 = fs.a(byteBuffer, "screenOffDisplayMode", zL);
                if (enumDataA2 == null) {
                    return null;
                }
                displayAndBrightnessV2.setScreenOffDisplayMode(enumDataA2);
            } else if (b3 == companion.d()) {
                Time timeC = fs.c(byteBuffer, "screenOffDisplayBeginTime");
                if (timeC == null) {
                    return null;
                }
                displayAndBrightnessV2.setScreenOffDisplayBeginTime(timeC);
            } else if (b3 == companion.e()) {
                Time timeC2 = fs.c(byteBuffer, "screenOffDisplayEndTime");
                if (timeC2 == null) {
                    return null;
                }
                displayAndBrightnessV2.setScreenOffDisplayEndTime(timeC2);
            } else if (b3 == companion.i()) {
                EnumData enumDataA3 = fs.a(byteBuffer, "screenOffDialPlateType", zL);
                if (enumDataA3 == null) {
                    return null;
                }
                displayAndBrightnessV2.setScreenOffDialPlateType(enumDataA3);
            } else if (b3 == companion.p()) {
                EnumData enumDataA4 = fs.a(byteBuffer, "screenOnByTurningWristMode", zL);
                if (enumDataA4 == null) {
                    return null;
                }
                displayAndBrightnessV2.setScreenOnByTurningWristMode(enumDataA4);
            } else if (b3 == companion.n()) {
                Time timeC3 = fs.c(byteBuffer, "screenOnByTurningWristBeginTime");
                if (timeC3 == null) {
                    return null;
                }
                displayAndBrightnessV2.setScreenOnByTurningWristBeginTime(timeC3);
            } else if (b3 == companion.o()) {
                Time timeC4 = fs.c(byteBuffer, "screenOnByTurningWristEndTime");
                if (timeC4 == null) {
                    return null;
                }
                displayAndBrightnessV2.setScreenOnByTurningWristEndTime(timeC4);
            } else if (b3 == companion.m()) {
                EnumData enumDataA5 = fs.a(byteBuffer, "screenOnByTurningWristActiveSpeed", zL);
                if (enumDataA5 == null) {
                    return null;
                }
                displayAndBrightnessV2.setScreenOnByTurningWristActiveSpeed(enumDataA5);
            } else if (b3 == companion.l()) {
                BooleanData booleanDataA2 = fs.a(byteBuffer, "screenOnByNewNotificationSwitch");
                if (booleanDataA2 == null) {
                    return null;
                }
                displayAndBrightnessV2.setScreenOnByNewNotificationSwitch(Boolean.valueOf(booleanDataA2.getValue()));
            } else if (b3 == companion.q()) {
                BooleanData booleanDataA3 = fs.a(byteBuffer, "screenOnDuringSportSwitch");
                if (booleanDataA3 == null) {
                    return null;
                }
                displayAndBrightnessV2.setScreenOnDuringSportSwitch(Boolean.valueOf(booleanDataA3.getValue()));
            } else if (b3 == companion.j()) {
                BooleanData booleanDataA4 = fs.a(byteBuffer, "screenOffFollowCurrentDialSwitch");
                if (booleanDataA4 == null) {
                    return null;
                }
                displayAndBrightnessV2.setScreenOffFollowCurrentDialSwitch(Boolean.valueOf(booleanDataA4.getValue()));
            } else if (b3 == companion.h()) {
                StringEnum stringEnumG = fs.g(byteBuffer, "screenOffDialId", zL);
                if (stringEnumG == null) {
                    return null;
                }
                displayAndBrightnessV2.setScreenOffDialId(stringEnumG);
            } else if (b3 == companion.c()) {
                StringEnum stringEnumG2 = fs.g(byteBuffer, "homeScreenStyle", zL);
                if (stringEnumG2 == null) {
                    return null;
                }
                displayAndBrightnessV2.setHomeScreenStyle(stringEnumG2);
            } else if (b3 == companion.g()) {
                EnumData enumDataA6 = fs.a(byteBuffer, "", zL);
                if (enumDataA6 == null) {
                    return null;
                }
                displayAndBrightnessV2.setScreenColorStyle(enumDataA6);
            } else {
                IPrimaryData iPrimaryDataA = a(byteBuffer, zL, b3);
                t5t.d("DisplayAndBrightnessV2Parser", "[WARNING] parseDisplayAndBrightnessV2 unknown key: " + ((int) b3) + ", position: " + byteBuffer.position() + ", parsed: " + iPrimaryDataA);
                if (iPrimaryDataA == null) {
                    return null;
                }
            }
        }
        return displayAndBrightnessV2;
    }
}
