package com.huami.hmdateformat.duration;

import android.content.Context;
import com.huami.hmdateformat.R;
import com.huami.tools.analytics.DbUtils;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u0007¨\u0006\u000e"}, d2 = {"Lcom/huami/hmdateformat/duration/HMDurationFormat;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/util/Date;", "startMillis", "endMillis", "", "isShort", "", "getTimeDuration", "", "<init>", "()V", "library_release"}, k = 1, mv = {1, 5, 1})
public final class HMDurationFormat {

    @NotNull
    public static final HMDurationFormat INSTANCE = new HMDurationFormat();

    private HMDurationFormat() {
    }

    public static /* synthetic */ String getTimeDuration$default(HMDurationFormat hMDurationFormat, Context context, Date date, Date date2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return hMDurationFormat.getTimeDuration(context, date, date2, z);
    }

    @NotNull
    public final String getTimeDuration(@NotNull Context context, @NotNull Date startMillis, @NotNull Date endMillis, boolean isShort) {
        return getTimeDuration(context, startMillis.getTime(), endMillis.getTime(), isShort);
    }

    @NotNull
    public final String getTimeDuration(@NotNull Context context, long startMillis, long endMillis, boolean isShort) {
        StringBuilder sb = new StringBuilder();
        long j = endMillis - startMillis;
        long j2 = 3600000;
        long j3 = j / j2;
        long j4 = (j % j2) / ((long) 60000);
        if (j3 > 0) {
            if (isShort) {
                sb.append(j3);
                sb.append(context.getString(R.string.hour_short));
            } else {
                sb.append(j3);
                sb.append(context.getString(R.string.hour_full));
            }
        }
        if (j4 > 0) {
            if (isShort) {
                sb.append(j3);
                sb.append(context.getString(R.string.minute_short));
            } else {
                sb.append(j3);
                sb.append(context.getString(R.string.minute_full));
            }
        }
        return sb.toString();
    }
}
