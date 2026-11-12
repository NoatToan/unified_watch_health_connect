package com.huami.utils.easypermission.utils;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/utils/easypermission/utils/FastClickUtils;", "", "", "isFastClick", "", "a", LogUtil.I, "MIN_CLICK_DELAY_TIME", "", "b", "J", "lastClickTime", "<init>", "()V", "easypermission_release"}, k = 1, mv = {1, 5, 1})
public final class FastClickUtils {

    @NotNull
    public static final FastClickUtils INSTANCE = new FastClickUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int MIN_CLICK_DELAY_TIME = 500;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static long lastClickTime;

    private FastClickUtils() {
    }

    @JvmStatic
    public static final boolean isFastClick() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - lastClickTime < 500) {
            return true;
        }
        lastClickTime = jCurrentTimeMillis;
        return false;
    }
}
