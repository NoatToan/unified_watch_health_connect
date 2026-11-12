package com.huami.nfc.applet;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\"\u0016\u0010\u0003\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004\"\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\"\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b\"\u0016\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"", "aid", "getWebApiMode", "FETCH_APDU_MODE_SYNC", "Ljava/lang/String;", "FETCH_APDU_MODE_ASYNC", "", "TRANS_TYPE_CHARGE", LogUtil.I, "TRANS_TYPE_CONSUME", "TRANS_TYPE_REFUND", "TRANS_TYPE_ISSUE_CARD", "nfc-applet_release"}, k = 2, mv = {1, 5, 1})
public final class EntityKt {

    @NotNull
    public static final String FETCH_APDU_MODE_ASYNC = "ASYNC";

    @NotNull
    public static final String FETCH_APDU_MODE_SYNC = "SYNC";
    public static final int TRANS_TYPE_CHARGE = 2;
    public static final int TRANS_TYPE_CONSUME = 6;
    public static final int TRANS_TYPE_ISSUE_CARD = -2;
    public static final int TRANS_TYPE_REFUND = -1;

    @NotNull
    public static final String getWebApiMode(@NotNull String str) {
        return Intrinsics.areEqual(str, ConstantKt.AID_SHANG_HAI) ? true : Intrinsics.areEqual(str, ConstantKt.AID_SHANG_HAI_MOT) ? FETCH_APDU_MODE_ASYNC : FETCH_APDU_MODE_SYNC;
    }
}
