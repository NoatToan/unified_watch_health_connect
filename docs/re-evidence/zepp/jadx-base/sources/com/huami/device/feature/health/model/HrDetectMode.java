package com.huami.device.feature.health.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/huami/device/feature/health/model/HrDetectMode;", "", "", "MODE_CLOSE", LogUtil.I, "MODE_AUTO", "MODE_SLEEP", "MODE_AUTO_SLEEP", "MODE_ATRIAL", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
public final class HrDetectMode {

    @NotNull
    public static final HrDetectMode INSTANCE = new HrDetectMode();
    public static final int MODE_ATRIAL = 4;
    public static final int MODE_AUTO = 2;
    public static final int MODE_AUTO_SLEEP = 3;
    public static final int MODE_CLOSE = 0;
    public static final int MODE_SLEEP = 1;

    private HrDetectMode() {
    }
}
