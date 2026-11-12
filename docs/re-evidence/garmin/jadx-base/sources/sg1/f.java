package sg1;

import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.util.Comparator;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class f<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f159215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f159216b;

    public f(long j8, long j14) {
        this.f159215a = j8;
        this.f159216b = j14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        Long lValueOf;
        Long lValueOf2 = Long.valueOf(TimestampAdjuster.MODE_SHARED);
        qg1.b bVar = (qg1.b) t14;
        Long deviceId = bVar.getDeviceId();
        long j8 = this.f159216b;
        long j14 = this.f159215a;
        if (deviceId != null && j14 == deviceId.longValue()) {
            lValueOf = Long.MAX_VALUE;
        } else {
            Long deviceId2 = bVar.getDeviceId();
            if (deviceId2 != null && j8 == deviceId2.longValue()) {
                lValueOf = lValueOf2;
            } else {
                DateTime date = bVar.getDate();
                lValueOf = date != null ? Long.valueOf(date.getMillis()) : null;
            }
        }
        qg1.b bVar2 = (qg1.b) t7;
        Long deviceId3 = bVar2.getDeviceId();
        if (deviceId3 != null && j14 == deviceId3.longValue()) {
            lValueOf2 = Long.MAX_VALUE;
        } else {
            Long deviceId4 = bVar2.getDeviceId();
            if (deviceId4 == null || j8 != deviceId4.longValue()) {
                DateTime date2 = bVar2.getDate();
                lValueOf2 = date2 != null ? Long.valueOf(date2.getMillis()) : null;
            }
        }
        return r13.a.b(lValueOf, lValueOf2);
    }
}
