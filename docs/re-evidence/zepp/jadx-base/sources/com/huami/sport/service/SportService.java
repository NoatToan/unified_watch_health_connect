package com.huami.sport.service;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.huami.tools.analytics.DbUtils;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J(\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J(\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J&\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e0\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\tH&¨\u0006\u0010"}, d2 = {"Lcom/huami/sport/service/SportService;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/util/Date;", "start", "end", "Lkotlinx/coroutines/flow/Flow;", "", "loadSportCount", "", "loadSportDuration", "count", "", "loadLatestSportRecords", "sport-service_release"}, k = 1, mv = {1, 5, 1})
public interface SportService<T> {
    @NotNull
    Flow<List<T>> loadLatestSportRecords(@NotNull Context context, int count);

    @NotNull
    Flow<Integer> loadSportCount(@NotNull Context context, @NotNull Date start, @NotNull Date end);

    @NotNull
    Flow<Long> loadSportDuration(@NotNull Context context, @NotNull Date start, @NotNull Date end);
}
