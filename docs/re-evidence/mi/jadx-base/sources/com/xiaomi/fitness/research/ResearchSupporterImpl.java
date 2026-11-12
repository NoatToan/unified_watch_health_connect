package com.xiaomi.fitness.research;

import android.content.Context;
import com.xiaomi.fitness.research.export.ResearchSupporter;
import com.xiaomi.fitness.research.upgrade.AppDownloader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/research/ResearchSupporterImpl;", "Lcom/xiaomi/fitness/research/export/ResearchSupporter;", "<init>", "()V", "init", "", "context", "Landroid/content/Context;", "installApp", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResearchSupporterImpl implements ResearchSupporter {
    @Override // com.xiaomi.fitness.research.export.ResearchSupporter
    public void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.xiaomi.fitness.research.export.ResearchSupporter
    public void installApp(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        new AppDownloader().downloadApk(context, "com.mi.healthresearch");
    }
}
