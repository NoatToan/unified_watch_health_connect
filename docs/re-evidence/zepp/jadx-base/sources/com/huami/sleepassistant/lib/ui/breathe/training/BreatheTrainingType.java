package com.huami.sleepassistant.lib.ui.breathe.training;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/breathe/training/BreatheTrainingType;", "", "", "SLEEP", LogUtil.I, "STRESS", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class BreatheTrainingType {

    @NotNull
    public static final BreatheTrainingType INSTANCE = new BreatheTrainingType();
    public static final int SLEEP = 1;
    public static final int STRESS = 2;

    private BreatheTrainingType() {
    }
}
