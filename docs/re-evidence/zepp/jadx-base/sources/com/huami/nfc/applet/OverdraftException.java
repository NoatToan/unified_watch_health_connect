package com.huami.nfc.applet;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.huami.nfc.applet.HuamiPayOverdraftException, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/huami/nfc/applet/HuamiPayOverdraftException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "toString", "", "a", LogUtil.I, "getBalance", "()I", StatEvent.SPORT_TP_VALUE_BALANCE, "b", "getOverDraft", "overDraft", "<init>", "(II)V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class OverdraftException extends Exception {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int balance;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int overDraft;

    public OverdraftException(int i, int i2) {
        this.balance = i;
        this.overDraft = i2;
    }

    public final int getBalance() {
        return this.balance;
    }

    public final int getOverDraft() {
        return this.overDraft;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "OverdraftException(balance=" + this.balance + ", overDraft=" + this.overDraft + ") 透支区负值";
    }
}
