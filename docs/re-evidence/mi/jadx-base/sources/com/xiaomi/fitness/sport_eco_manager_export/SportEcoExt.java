package com.xiaomi.fitness.sport_eco_manager_export;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager_export/SportEcoExt;", "", "<init>", "()V", "fromUri", "", "getFromUri", "()Ljava/lang/String;", "setFromUri", "(Ljava/lang/String;)V", "sport-eco-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportEcoExt {

    @NotNull
    public static final SportEcoExt INSTANCE = new SportEcoExt();

    @Nullable
    private static String fromUri = "";

    private SportEcoExt() {
    }

    @Nullable
    public final String getFromUri() {
        return fromUri;
    }

    public final void setFromUri(@Nullable String str) {
        fromUri = str;
    }
}
