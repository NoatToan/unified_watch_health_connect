package androidx.health.connect.client.impl.platform.aggregate;

import androidx.exifinterface.media.ExifInterface;
import java.time.temporal.Temporal;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0002\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/health/connect/client/impl/platform/aggregate/TimeRange;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/time/temporal/Temporal;", "", "startTime", "getStartTime", "()Ljava/time/temporal/Temporal;", "endTime", "getEndTime", "Landroidx/health/connect/client/impl/platform/aggregate/InstantTimeRange;", "Landroidx/health/connect/client/impl/platform/aggregate/LocalTimeRange;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TimeRange<T extends Temporal> {
    T getEndTime();

    T getStartTime();
}
