package com.huami.algo;

import android.text.TextUtils;
import com.huami.algo.healthcare.HealthCare;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/huami/algo/AlgoUtils;", "", "", "getHealthVer", "a", "Ljava/lang/String;", "HEALTH_CARE_VER", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class AlgoUtils {
    public static final AlgoUtils INSTANCE = new AlgoUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static String HEALTH_CARE_VER = "";

    private AlgoUtils() {
    }

    @NotNull
    public final synchronized String getHealthVer() {
        if (TextUtils.isEmpty(HEALTH_CARE_VER)) {
            HealthCare healthCare = new HealthCare(250);
            HEALTH_CARE_VER = healthCare.getVersion();
            healthCare.dispose();
        }
        return HEALTH_CARE_VER;
    }
}
