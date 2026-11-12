package com.huami.bluetooth.profile.channel.module.hearing.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingCmdResponse;", "", "", "toString", "", "component1", "component2", "component3", "component4", "responseSubType", "receivedSubType", Constant.h, "status", "copy", "hashCode", "other", "", "equals", "a", LogUtil.I, "getResponseSubType", "()I", "b", "getReceivedSubType", "c", "getCmd", GoogleApiAvailabilityLight.a, "getStatus", "<init>", "(IIII)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HearingCmdResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int responseSubType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int receivedSubType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int cmd;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int status;

    public HearingCmdResponse(int i, int i2, int i3, int i4) {
        this.responseSubType = i;
        this.receivedSubType = i2;
        this.cmd = i3;
        this.status = i4;
    }

    public static /* synthetic */ HearingCmdResponse copy$default(HearingCmdResponse hearingCmdResponse, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = hearingCmdResponse.responseSubType;
        }
        if ((i5 & 2) != 0) {
            i2 = hearingCmdResponse.receivedSubType;
        }
        if ((i5 & 4) != 0) {
            i3 = hearingCmdResponse.cmd;
        }
        if ((i5 & 8) != 0) {
            i4 = hearingCmdResponse.status;
        }
        return hearingCmdResponse.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResponseSubType() {
        return this.responseSubType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getReceivedSubType() {
        return this.receivedSubType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCmd() {
        return this.cmd;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final HearingCmdResponse copy(int responseSubType, int receivedSubType, int cmd, int status) {
        return new HearingCmdResponse(responseSubType, receivedSubType, cmd, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HearingCmdResponse)) {
            return false;
        }
        HearingCmdResponse hearingCmdResponse = (HearingCmdResponse) other;
        return this.responseSubType == hearingCmdResponse.responseSubType && this.receivedSubType == hearingCmdResponse.receivedSubType && this.cmd == hearingCmdResponse.cmd && this.status == hearingCmdResponse.status;
    }

    public final int getCmd() {
        return this.cmd;
    }

    public final int getReceivedSubType() {
        return this.receivedSubType;
    }

    public final int getResponseSubType() {
        return this.responseSubType;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((this.responseSubType * 31) + this.receivedSubType) * 31) + this.cmd) * 31) + this.status;
    }

    @NotNull
    public String toString() {
        return "HearingCmdResponse{responseSubType=" + this.responseSubType + ", receivedSubType=" + this.receivedSubType + ", cmd=" + this.cmd + ", status=" + this.status + ", }";
    }
}
