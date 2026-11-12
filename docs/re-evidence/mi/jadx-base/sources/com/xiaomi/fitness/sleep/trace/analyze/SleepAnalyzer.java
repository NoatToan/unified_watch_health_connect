package com.xiaomi.fitness.sleep.trace.analyze;

import android.content.Context;
import com.xiaomi.fitness.sleep.trace.db.SleepReport;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH'R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/analyze/SleepAnalyzer;", "", "name", "", "getName", "()Ljava/lang/String;", "version", "", "getVersion", "()I", "analyzeSleep", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "appContext", "Landroid/content/Context;", "dateNum", "", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SleepAnalyzer {
    @Nullable
    SleepReport analyzeSleep(@NotNull Context appContext, long dateNum);

    @NotNull
    String getName();

    int getVersion();
}
