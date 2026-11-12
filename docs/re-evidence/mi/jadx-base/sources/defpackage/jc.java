package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2Data;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B'\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\b\u0010\u0014¨\u0006\u001d"}, d2 = {"Ljc;", "Lf1;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "Lf4s;", "header", "data", "Ljava/util/Calendar;", PluginDeviceInfo.FMODEL, "(Lf4s;Ljava/util/List;)Ljava/util/Calendar;", "Lb6;", "dataReturnTime", "Lb6;", PluginDeviceInfo.FDESC, "()Lb6;", "setDataReturnTime", "(Lb6;)V", "Lbi;", "dataReceiver", "Lbi;", "()Lbi;", "startTime", "", "type", "", "supportSpo2Version", "version", "<init>", "(Ljava/util/Calendar;IZI)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class jc extends f1<List<? extends Spo2Data>> {

    @NotNull
    public b6 h;

    @NotNull
    public final bi<List<Spo2Data>> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(@NotNull Calendar startTime, int i, boolean z, int i2) {
        super(startTime, i, i2);
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        this.h = b6.a.f3837a;
        this.i = new at((byte) i, z);
    }

    @Override // defpackage.f1
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public b6 getH() {
        return this.h;
    }

    @Override // defpackage.f1
    @NotNull
    public bi<List<? extends Spo2Data>> a() {
        return this.i;
    }

    @Override // defpackage.f1
    @Nullable
    public Calendar a(@Nullable f4s header, @NotNull List<? extends Spo2Data> data) {
        long timeStamp;
        Intrinsics.checkNotNullParameter(data, "data");
        if (header != null) {
            Spo2Data spo2Data = (Spo2Data) CollectionsKt___CollectionsKt.lastOrNull((List) data);
            if (spo2Data == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance();
            if (((byte) getF17276b()) == 40) {
                timeStamp = spo2Data.getTimeStamp() * ((long) 1000);
            } else {
                timeStamp = (spo2Data.getTimeStamp() * ((long) 1000)) + ((long) 30000);
            }
            calendar.setTimeInMillis(timeStamp);
            return calendar;
        }
        return getF17275a();
    }
}
