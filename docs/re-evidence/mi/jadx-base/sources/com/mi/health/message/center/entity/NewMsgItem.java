package com.mi.health.message.center.entity;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/mi/health/message/center/entity/NewMsgItem;", "", RnReportConst.ApiReport.PARAM_MODULE, "", "hasNew", "", "<init>", "(IZ)V", "getModule", "()I", "getHasNew", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "message-center_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NewMsgItem {

    @SerializedName("is_new")
    private final boolean hasNew;

    @SerializedName(RnReportConst.ApiReport.PARAM_MODULE)
    private final int module;

    public NewMsgItem(int i, boolean z) {
        this.module = i;
        this.hasNew = z;
    }

    public static /* synthetic */ NewMsgItem copy$default(NewMsgItem newMsgItem, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = newMsgItem.module;
        }
        if ((i2 & 2) != 0) {
            z = newMsgItem.hasNew;
        }
        return newMsgItem.copy(i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getModule() {
        return this.module;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasNew() {
        return this.hasNew;
    }

    @NotNull
    public final NewMsgItem copy(int module, boolean hasNew) {
        return new NewMsgItem(module, hasNew);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewMsgItem)) {
            return false;
        }
        NewMsgItem newMsgItem = (NewMsgItem) other;
        return this.module == newMsgItem.module && this.hasNew == newMsgItem.hasNew;
    }

    public final boolean getHasNew() {
        return this.hasNew;
    }

    public final int getModule() {
        return this.module;
    }

    public int hashCode() {
        return (Integer.hashCode(this.module) * 31) + Boolean.hashCode(this.hasNew);
    }

    @NotNull
    public String toString() {
        return "NewMsgItem(module=" + this.module + ", hasNew=" + this.hasNew + ")";
    }
}
