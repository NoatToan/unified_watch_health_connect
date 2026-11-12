package com.huami.pai_service;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/huami/pai_service/PaiStatuInfo;", "", "", "desc", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "", "currentTotalPai", LogUtil.I, "getCurrentTotalPai", "()I", "<init>", "(Ljava/lang/String;I)V", "Lcom/huami/pai_service/PaiStatusSuccess;", "Lcom/huami/pai_service/PaiStatusProgress;", "pai-service_release"}, k = 1, mv = {1, 5, 1})
public abstract class PaiStatuInfo {
    private final int currentTotalPai;

    @NotNull
    private final String desc;

    private PaiStatuInfo(String str, int i) {
        this.desc = str;
        this.currentTotalPai = i;
    }

    public /* synthetic */ PaiStatuInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public int getCurrentTotalPai() {
        return this.currentTotalPai;
    }

    @NotNull
    public String getDesc() {
        return this.desc;
    }
}
