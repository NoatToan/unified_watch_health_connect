package com.huami.sleepassistant.lib.ui.notification;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\"\u0016\u0010\u0001\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006*\u0016\u0010\n\"\b\u0012\u0004\u0012\u00020\t0\b2\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\u000b"}, d2 = {"", "TOGGLE_PAUSE_ACTION", "Ljava/lang/String;", "TOGGLE_COLLECTION_ACTION", "", "PAUSE_FLAG", LogUtil.I, "COLLECTION_FLAG", "Lkotlin/Function0;", "", "OnBitmapCallBack", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class NotificationManagersKt {
    public static final int COLLECTION_FLAG = 3;
    public static final int PAUSE_FLAG = 1;

    @NotNull
    public static final String TOGGLE_COLLECTION_ACTION = "com.huami.sleep.togglecollection";

    @NotNull
    public static final String TOGGLE_PAUSE_ACTION = "com.huami.sleep.togglepause";
}
