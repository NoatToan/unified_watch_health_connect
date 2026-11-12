package com.huami.hid.statistics;

import com.alipay.sdk.m.f0.c;
import com.huami.ecg.core.model.constant.MeasureStateValue;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/huami/hid/statistics/TakePic;", "", "", "PAIR", "Ljava/lang/String;", "UN_PAIR", c.p, "FAIL", MeasureStateValue.OTHER, "<init>", "()V", "hid_release"}, k = 1, mv = {1, 5, 1})
public final class TakePic {

    @NotNull
    public static final String FAIL = "Fail";

    @NotNull
    public static final TakePic INSTANCE = new TakePic();

    @NotNull
    public static final String OTHER = "other";

    @NotNull
    public static final String PAIR = "Bluetooth_Pair";

    @NotNull
    public static final String SUCCESS = "Success";

    @NotNull
    public static final String UN_PAIR = "Bluetooth_UnPair";

    private TakePic() {
    }
}
