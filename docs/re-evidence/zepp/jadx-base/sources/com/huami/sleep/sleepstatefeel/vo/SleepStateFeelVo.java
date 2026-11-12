package com.huami.sleep.sleepstatefeel.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/huami/sleep/sleepstatefeel/vo/SleepStateFeelVo;", "", "", "component1", "component2", "", "component3", "component4", "", "component5", "resIconId", "resTextId", "type", "id", "selected", "copy", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getResIconId", "()I", "b", "getResTextId", "c", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, "getId", "e", "Z", "getSelected", "()Z", "setSelected", "(Z)V", "<init>", "(IILjava/lang/String;Ljava/lang/String;Z)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepStateFeelVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int resIconId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int resTextId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private boolean selected;

    public SleepStateFeelVo(int i, int i2, @NotNull String str, @NotNull String str2, boolean z) {
        this.resIconId = i;
        this.resTextId = i2;
        this.type = str;
        this.id = str2;
        this.selected = z;
    }

    public static /* synthetic */ SleepStateFeelVo copy$default(SleepStateFeelVo sleepStateFeelVo, int i, int i2, String str, String str2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = sleepStateFeelVo.resIconId;
        }
        if ((i3 & 2) != 0) {
            i2 = sleepStateFeelVo.resTextId;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            str = sleepStateFeelVo.type;
        }
        String str3 = str;
        if ((i3 & 8) != 0) {
            str2 = sleepStateFeelVo.id;
        }
        String str4 = str2;
        if ((i3 & 16) != 0) {
            z = sleepStateFeelVo.selected;
        }
        return sleepStateFeelVo.copy(i, i4, str3, str4, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResIconId() {
        return this.resIconId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getResTextId() {
        return this.resTextId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final SleepStateFeelVo copy(int resIconId, int resTextId, @NotNull String type, @NotNull String id, boolean selected) {
        return new SleepStateFeelVo(resIconId, resTextId, type, id, selected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepStateFeelVo)) {
            return false;
        }
        SleepStateFeelVo sleepStateFeelVo = (SleepStateFeelVo) other;
        return this.resIconId == sleepStateFeelVo.resIconId && this.resTextId == sleepStateFeelVo.resTextId && Intrinsics.areEqual(this.type, sleepStateFeelVo.type) && Intrinsics.areEqual(this.id, sleepStateFeelVo.id) && this.selected == sleepStateFeelVo.selected;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getResIconId() {
        return this.resIconId;
    }

    public final int getResTextId() {
        return this.resTextId;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        int iHashCode = ((((((this.resIconId * 31) + this.resTextId) * 31) + this.type.hashCode()) * 31) + this.id.hashCode()) * 31;
        boolean z = this.selected;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    @NotNull
    public String toString() {
        return "SleepStateFeelVo(resIconId=" + this.resIconId + ", resTextId=" + this.resTextId + ", type=" + this.type + ", id=" + this.id + ", selected=" + this.selected + ")";
    }
}
