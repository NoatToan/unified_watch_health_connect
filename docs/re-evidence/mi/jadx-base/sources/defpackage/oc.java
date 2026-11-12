package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
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
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Loc;", "Lsi;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "groupVersion", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class oc implements si<General> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f28984a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Loc$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
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
    public General a(@NotNull ByteBuffer byteBuffer, int groupVersion) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        General general = new General();
        general.setGroupVersion(groupVersion);
        boolean zL = z2.l(byteBuffer);
        byte b2 = byteBuffer.get();
        for (int i = 0; i < b2; i++) {
            byte b3 = byteBuffer.get();
            General.Companion companion = General.INSTANCE;
            if (b3 == companion.E()) {
                EnumData enumDataA = fs.a(byteBuffer, "timeFormat", zL);
                if (enumDataA == null) {
                    return null;
                }
                general.setTimeFormat(enumDataA);
            } else if (b3 == companion.h()) {
                StringData stringDataF = fs.f(byteBuffer, "dateDisplayStyle", zL);
                if (stringDataF == null) {
                    return null;
                }
                general.setDateDisplayStyle(stringDataF);
            } else if (b3 == companion.y()) {
                EnumData enumDataA2 = fs.a(byteBuffer, "otherCalendar", zL);
                if (enumDataA2 == null) {
                    return null;
                }
                general.setOtherCalendar(enumDataA2);
            } else if (b3 == companion.G()) {
                EnumData enumDataA3 = fs.a(byteBuffer, "weeklyStartTime", zL);
                if (enumDataA3 == null) {
                    return null;
                }
                general.setWeeklyStartTime(enumDataA3);
            } else if (b3 == companion.u()) {
                EnumData enumDataA4 = fs.a(byteBuffer, "mileageUnit", zL);
                if (enumDataA4 == null) {
                    return null;
                }
                general.setMileageUnit(enumDataA4);
            } else if (b3 == companion.q()) {
                BooleanData booleanDataA = fs.a(byteBuffer, "hourlyAnnounceSwitch");
                if (booleanDataA == null) {
                    return null;
                }
                general.setHourlyAnnounceSwitch(Boolean.valueOf(booleanDataA.getValue()));
            } else if (b3 == companion.o()) {
                Time timeC = fs.c(byteBuffer, "hourlyAnnounceStartTime");
                if (timeC == null) {
                    return null;
                }
                general.setHourlyAnnounceStartTime(timeC);
            } else if (b3 == companion.p()) {
                Time timeC2 = fs.c(byteBuffer, "hourlyAnnounceStopTime");
                if (timeC2 == null) {
                    return null;
                }
                general.setHourlyAnnounceStopTime(timeC2);
            } else if (b3 == companion.m()) {
                BooleanData booleanDataA2 = fs.a(byteBuffer, "enableDevice");
                if (booleanDataA2 == null) {
                    return null;
                }
                general.setEnableDevice(Boolean.valueOf(booleanDataA2.getValue()));
            } else if (b3 == companion.j()) {
                EnumData enumDataA5 = fs.a(byteBuffer, "dndMode", zL);
                if (enumDataA5 == null) {
                    return null;
                }
                general.setDndMode(enumDataA5);
            } else if (b3 == companion.k()) {
                Time timeC3 = fs.c(byteBuffer, "dndStartTime");
                if (timeC3 == null) {
                    return null;
                }
                general.setDndStartTime(timeC3);
            } else if (b3 == companion.l()) {
                Time timeC4 = fs.c(byteBuffer, "dndStopTime");
                if (timeC4 == null) {
                    return null;
                }
                general.setDndStopTime(timeC4);
            } else if (b3 == companion.I()) {
                BooleanData booleanDataA3 = fs.a(byteBuffer, "wristBrightInDNDSwitch");
                if (booleanDataA3 == null) {
                    return null;
                }
                general.setWristBrightInDNDSwitch(Boolean.valueOf(booleanDataA3.getValue()));
            } else if (b3 == companion.g()) {
                BooleanData booleanDataA4 = fs.a(byteBuffer, "connLostRemindSwitch");
                if (booleanDataA4 == null) {
                    return null;
                }
                general.setConnLostRemindSwitch(Boolean.valueOf(booleanDataA4.getValue()));
            } else if (b3 == companion.e()) {
                Time timeC5 = fs.c(byteBuffer, "connLostRemindStartTime");
                if (timeC5 == null) {
                    return null;
                }
                general.setConnLostRemindStartTime(timeC5);
            } else if (b3 == companion.f()) {
                Time timeC6 = fs.c(byteBuffer, "connLostRemindStopTime");
                if (timeC6 == null) {
                    return null;
                }
                general.setConnLostRemindStopTime(timeC6);
            } else if (b3 == General.KEY_INCOMING_CALL_DELAY_TIME) {
                IntData intDataE = fs.e(byteBuffer, "incomingCallDelayTime", zL);
                if (intDataE == null) {
                    return null;
                }
                general.setIncomingCallDelayTime(intDataE);
            } else if (b3 == companion.D()) {
                EnumData enumDataA6 = fs.a(byteBuffer, "temperatureUnit", zL);
                if (enumDataA6 == null) {
                    return null;
                }
                general.setTemperatureUnit(enumDataA6);
            } else if (b3 == companion.F()) {
                BooleanData booleanDataA5 = fs.a(byteBuffer, "timeFormatFollowMobilePhoneSwitch");
                if (booleanDataA5 == null) {
                    return null;
                }
                general.setTimeFormatFollowMobilePhoneSwitch(Boolean.valueOf(booleanDataA5.getValue()));
            } else if (b3 == companion.s()) {
                StringEnum stringEnumG = fs.g(byteBuffer, "longPressSideApp", zL);
                if (stringEnumG == null) {
                    return null;
                }
                general.setLongPressSideApp(stringEnumG);
            } else if (b3 == companion.t()) {
                StringEnum stringEnumG2 = fs.g(byteBuffer, "longPressUpApp", zL);
                if (stringEnumG2 == null) {
                    return null;
                }
                general.setLongPressUpApp(stringEnumG2);
            } else if (b3 == companion.c()) {
                StringEnum stringEnumG3 = fs.g(byteBuffer, "clickDownApp", zL);
                if (stringEnumG3 == null) {
                    return null;
                }
                general.setClickDownApp(stringEnumG3);
            } else if (b3 == companion.d()) {
                StringEnum stringEnumG4 = fs.g(byteBuffer, "clickSelectApp", zL);
                if (stringEnumG4 == null) {
                    return null;
                }
                general.setClickSelectApp(stringEnumG4);
            } else if (b3 == companion.r()) {
                BooleanData booleanDataA6 = fs.a(byteBuffer, "inComingCallDisplayContactsSwitch");
                if (booleanDataA6 == null) {
                    return null;
                }
                general.setInComingCallDisplayContactsSwitch(Boolean.valueOf(booleanDataA6.getValue()));
            } else if (b3 == companion.C()) {
                BooleanData booleanDataA7 = fs.a(byteBuffer, "smsDisplayContactsSwitch");
                if (booleanDataA7 == null) {
                    return null;
                }
                general.setSmsDisplayContactsSwitch(Boolean.valueOf(booleanDataA7.getValue()));
            } else if (b3 == companion.H()) {
                EnumData enumDataA7 = fs.a(byteBuffer, "weightUnit", zL);
                if (enumDataA7 == null) {
                    return null;
                }
                general.setWeightUnit(enumDataA7);
            } else if (b3 == companion.v()) {
                EnumData enumDataA8 = fs.a(byteBuffer, "nightMode", zL);
                if (enumDataA8 == null) {
                    return null;
                }
                general.setNightMode(enumDataA8);
            } else if (b3 == companion.w()) {
                Time timeC7 = fs.c(byteBuffer, "nightModeStartTime");
                if (timeC7 == null) {
                    return null;
                }
                general.setNightModeStartTime(timeC7);
            } else if (b3 == companion.x()) {
                Time timeC8 = fs.c(byteBuffer, "nightModeStopTime");
                if (timeC8 == null) {
                    return null;
                }
                general.setNightModeStopTime(timeC8);
            } else if (b3 == companion.b()) {
                BooleanData booleanDataA8 = fs.a(byteBuffer, "autoOtaAtNightSwitch");
                if (booleanDataA8 == null) {
                    return null;
                }
                general.setAutoOtaAtNightSwitch(Boolean.valueOf(booleanDataA8.getValue()));
            } else if (b3 == companion.i()) {
                BooleanData booleanDataA9 = fs.a(byteBuffer, "disableHid");
                if (booleanDataA9 == null) {
                    return null;
                }
                general.setDisableHid(Boolean.valueOf(booleanDataA9.getValue()));
            } else if (b3 == companion.B()) {
                BooleanData booleanDataA10 = fs.a(byteBuffer, "sleepModeSwitch");
                if (booleanDataA10 == null) {
                    return null;
                }
                general.setSleepModeSwitch(Boolean.valueOf(booleanDataA10.getValue()));
            } else if (b3 == companion.z()) {
                BooleanData booleanDataA11 = fs.a(byteBuffer, "sleepModeForDisplaySwitch");
                if (booleanDataA11 == null) {
                    return null;
                }
                general.setSleepModeForDisplaySwitch(Boolean.valueOf(booleanDataA11.getValue()));
            } else if (b3 == companion.A()) {
                BooleanData booleanDataA12 = fs.a(byteBuffer, "sleepModeSmartEnableSwitch");
                if (booleanDataA12 == null) {
                    return null;
                }
                general.setSleepModeSmartEnableSwitch(Boolean.valueOf(booleanDataA12.getValue()));
            } else if (b3 == companion.n()) {
                BooleanData booleanDataA13 = fs.a(byteBuffer, "hidConnect");
                if (booleanDataA13 == null) {
                    return null;
                }
                general.setHidConnect(Boolean.valueOf(booleanDataA13.getValue()));
            } else {
                IPrimaryData iPrimaryDataA = a(byteBuffer, zL, b3);
                t5t.d("GeneralParser", "[WARNING] parseGeneral unknown key: " + ((int) b3) + ", position: " + byteBuffer.position() + ", parsed: " + iPrimaryDataA);
                if (iPrimaryDataA == null) {
                    return null;
                }
            }
        }
        return general;
    }
}
