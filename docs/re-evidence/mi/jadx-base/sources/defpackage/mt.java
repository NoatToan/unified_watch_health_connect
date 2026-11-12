package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.entity.sport.Sport;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntegerArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Lmt;", "Lsi;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/sport/Sport;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "groupVersion", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class mt implements si<Sport> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f27170a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lmt$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
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
    public Sport a(@NotNull ByteBuffer byteBuffer, int groupVersion) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Sport sport = new Sport();
        sport.setGroupVersion(groupVersion);
        boolean zL = z2.l(byteBuffer);
        byte b2 = byteBuffer.get();
        for (int i = 0; i < b2; i++) {
            byte b3 = byteBuffer.get();
            Sport.Companion companion = Sport.INSTANCE;
            if (b3 == companion.g()) {
                BooleanData booleanDataA = fs.a(byteBuffer, "autoStopSwitch");
                if (booleanDataA == null) {
                    return null;
                }
                sport.setAutoStopSwitch(Boolean.valueOf(booleanDataA.getValue()));
            } else if (b3 == companion.m()) {
                BooleanData booleanDataA2 = fs.a(byteBuffer, "swimLogSwitch");
                if (booleanDataA2 == null) {
                    return null;
                }
                sport.setSwimLogSwitch(Boolean.valueOf(booleanDataA2.getValue()));
            } else if (b3 == companion.j()) {
                EnumData enumDataA = fs.a(byteBuffer, "reserveHeartRateMode", zL);
                if (enumDataA == null) {
                    return null;
                }
                sport.setReserveHeartRateMode(enumDataA);
            } else if (b3 == companion.k()) {
                IntegerArray integerArrayD = fs.d(byteBuffer, "reserveHeartRateValueList", zL);
                if (integerArrayD == null) {
                    return null;
                }
                sport.setReserveHeartRateValueList(integerArrayD);
            } else if (b3 == companion.i()) {
                IntegerArray integerArrayD2 = fs.d(byteBuffer, "maximumHeartRateValueList", zL);
                if (integerArrayD2 == null) {
                    return null;
                }
                sport.setMaximumHeartRateValueList(integerArrayD2);
            } else if (b3 == companion.l()) {
                IntData intDataE = fs.e(byteBuffer, "restHeartRate", zL);
                if (intDataE == null) {
                    return null;
                }
                sport.setRestHeartRate(intDataE);
            } else if (b3 == companion.h()) {
                EnumData enumDataA2 = fs.a(byteBuffer, "gpsMode", zL);
                if (enumDataA2 == null) {
                    return null;
                }
                sport.setGpsMode(enumDataA2);
            } else if (b3 == companion.d()) {
                EnumData enumDataA3 = fs.a(byteBuffer, "gpsFrequencyBand", zL);
                if (enumDataA3 == null) {
                    return null;
                }
                sport.setGpsFrequencyBand(enumDataA3);
            } else if (b3 == companion.f()) {
                EnumData enumDataA4 = fs.a(byteBuffer, "gpsSystemChoice", zL);
                if (enumDataA4 == null) {
                    return null;
                }
                sport.setGpsSystemChoice(enumDataA4);
            } else if (b3 == companion.e()) {
                EnumData enumDataA5 = fs.a(byteBuffer, "gpsSearchingPreference", zL);
                if (enumDataA5 == null) {
                    return null;
                }
                sport.setGpsSearchingPreference(enumDataA5);
            } else if (b3 == companion.c()) {
                EnumData enumDataA6 = fs.a(byteBuffer, "gpsDataInterval", zL);
                if (enumDataA6 == null) {
                    return null;
                }
                sport.setGpsDataInterval(enumDataA6);
            } else if (b3 == companion.a()) {
                BooleanData booleanDataA3 = fs.a(byteBuffer, "aGpsOutOfDateRemindSwitch");
                if (booleanDataA3 == null) {
                    return null;
                }
                sport.setAGpsOutOfDateRemindSwitch(Boolean.valueOf(booleanDataA3.getValue()));
            } else if (b3 == companion.b()) {
                Time timeC = fs.c(byteBuffer, "aGpsOutOfDateRemindTime");
                if (timeC == null) {
                    return null;
                }
                sport.setAGpsOutOfDateRemindTime(timeC);
            } else if (b3 == companion.q()) {
                EnumArray enumArrayB = fs.b(byteBuffer, "sportRecognitionTypes", zL);
                if (enumArrayB == null) {
                    return null;
                }
                sport.setSportRecognitionTypes(enumArrayB);
            } else if (b3 == companion.r()) {
                BooleanData booleanDataA4 = fs.a(byteBuffer, "sportRecognizedRemindSwitch");
                if (booleanDataA4 == null) {
                    return null;
                }
                sport.setSportRecognizedRemindSwitch(Boolean.valueOf(booleanDataA4.getValue()));
            } else if (b3 == companion.p()) {
                EnumData enumDataA7 = fs.a(byteBuffer, "sportRecognitionSensitivity", zL);
                if (enumDataA7 == null) {
                    return null;
                }
                sport.setSportRecognitionSensitivity(enumDataA7);
            } else if (b3 == companion.o()) {
                EnumData enumDataA8 = fs.a(byteBuffer, "rowingMachineWearingWrist", zL);
                if (enumDataA8 == null) {
                    return null;
                }
                sport.setRowingMachineWearingWrist(enumDataA8);
            } else if (b3 == companion.n()) {
                EnumData enumDataA9 = fs.a(byteBuffer, "poolSwimmingLaneLength", zL);
                if (enumDataA9 == null) {
                    return null;
                }
                sport.setPoolSwimmingLaneLength(enumDataA9);
            } else {
                IPrimaryData iPrimaryDataA = a(byteBuffer, zL, b3);
                t5t.d("SportParser", "[WARNING] parseSport unknown key: " + ((int) b3) + ", position: " + byteBuffer.position() + ", parsed: " + iPrimaryDataA);
                if (iPrimaryDataA == null) {
                    return null;
                }
            }
        }
        return sport;
    }
}
