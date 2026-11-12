package com.huami.account.selectArea.baseui;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/huami/account/selectArea/baseui/BaseIndexBean;", "", "", "a", "Ljava/lang/String;", "getDataToSort", "()Ljava/lang/String;", "setDataToSort", "(Ljava/lang/String;)V", "dataToSort", "", "b", LogUtil.I, "getIndex", "()I", "setIndex", "(I)V", "index", "c", "getBaseIndexTag", "setBaseIndexTag", "baseIndexTag", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseIndexBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String dataToSort;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int index = -1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String baseIndexTag;

    @Nullable
    public final String getBaseIndexTag() {
        return this.baseIndexTag;
    }

    @Nullable
    public final String getDataToSort() {
        return this.dataToSort;
    }

    public final int getIndex() {
        return this.index;
    }

    public final void setBaseIndexTag(@Nullable String str) {
        this.baseIndexTag = str;
    }

    public final void setDataToSort(@Nullable String str) {
        this.dataToSort = str;
    }

    public final void setIndex(int i) {
        this.index = i;
    }
}
