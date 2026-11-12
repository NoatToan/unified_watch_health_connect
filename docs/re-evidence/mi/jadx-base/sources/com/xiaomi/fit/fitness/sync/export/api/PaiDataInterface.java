package com.xiaomi.fit.fitness.sync.export.api;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fit/fitness/sync/export/api/PaiDataInterface;", "", "getPaiTargetDisparity", "", "getPaiSuggestHr", "getPaiSuggestTime", "Companion", "fitness-sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PaiDataInterface {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fit/fitness/sync/export/api/PaiDataInterface$Companion;", "", "<init>", "()V", "fitness-sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    int getPaiSuggestHr();

    int getPaiSuggestTime();

    int getPaiTargetDisparity();
}
