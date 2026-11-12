package com.huami.worldclock.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.worldclock.add.alphabetic.ISuspensionInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/huami/worldclock/bean/BaseIndexBean;", "Lcom/huami/worldclock/add/alphabetic/ISuspensionInterface;", "", "getBaseIndexTag", "baseIndexTag", "setBaseIndexTag", "", "isShowSuspension", "suspensionTag", "", "a", LogUtil.I, "getIndex", "()I", "setIndex", "(I)V", "index", "b", "Ljava/lang/String;", "<init>", "()V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseIndexBean implements ISuspensionInterface {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int index = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String baseIndexTag;

    @Nullable
    public final String getBaseIndexTag() {
        return this.baseIndexTag;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // com.huami.worldclock.add.alphabetic.ISuspensionInterface
    public boolean isShowSuspension() {
        return true;
    }

    @NotNull
    public final BaseIndexBean setBaseIndexTag(@NotNull String baseIndexTag) {
        this.baseIndexTag = baseIndexTag;
        return this;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    @Override // com.huami.worldclock.add.alphabetic.ISuspensionInterface
    @NotNull
    public String suspensionTag() {
        String str = this.baseIndexTag;
        return str == null ? "" : str;
    }
}
