package com.huami.ecg.sync.health.config;

import android.util.Pair;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/ecg/sync/health/config/QLingConfig;", "", "", "DEFAULT_COEFFA", LogUtil.I, "DEFAULT_COEFFB", "Landroid/util/Pair;", "a", "Landroid/util/Pair;", "getCoeff", "()Landroid/util/Pair;", "setCoeff", "(Landroid/util/Pair;)V", "coeff", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class QLingConfig {
    public static final int DEFAULT_COEFFA = 1075;
    public static final QLingConfig INSTANCE = new QLingConfig();
    public static final int DEFAULT_COEFFB = 8518;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static Pair<Integer, Integer> coeff = new Pair<>(1075, Integer.valueOf(DEFAULT_COEFFB));

    private QLingConfig() {
    }

    @NotNull
    public final Pair<Integer, Integer> getCoeff() {
        return coeff;
    }

    public final void setCoeff(@NotNull Pair<Integer, Integer> pair) {
        coeff = pair;
    }
}
