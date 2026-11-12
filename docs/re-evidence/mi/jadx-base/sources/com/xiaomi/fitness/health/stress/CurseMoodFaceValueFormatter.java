package com.xiaomi.fitness.health.stress;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import defpackage.c0j;
import defpackage.gv5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u0013\b\u0016\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/health/stress/CurseMoodFaceValueFormatter;", "Lgv5;", "", "moodValue", "", "getMoodType", "(I)Ljava/lang/String;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "getBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)Ljava/lang/String;", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "digits", "<init>", "(I)V", "context", "(Landroid/content/Context;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CurseMoodFaceValueFormatter extends gv5 {

    @Nullable
    private Context mContext;

    public CurseMoodFaceValueFormatter(int i) {
        super(i);
    }

    private final String getMoodType(int moodValue) {
        if (moodValue == 0) {
            String string = ApplicationExtKt.getApplication().getString(c0j.Vp);
            Intrinsics.checkNotNull(string);
            return string;
        }
        if (moodValue != 1) {
            String string2 = ApplicationExtKt.getApplication().getString(c0j.Xp);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        String string3 = ApplicationExtKt.getApplication().getString(c0j.Wp);
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    @Override // defpackage.gv5, defpackage.onq
    @NotNull
    public String getBarLabel(@NotNull RecyclerBarEntry barEntry) {
        Intrinsics.checkNotNullParameter(barEntry, "barEntry");
        ApplicationExtKt.getApplication();
        return getMoodType((int) barEntry.getY());
    }

    public CurseMoodFaceValueFormatter(@Nullable Context context) {
        this(0);
        this.mContext = context;
    }
}
