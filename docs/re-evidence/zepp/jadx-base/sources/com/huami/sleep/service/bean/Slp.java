package com.huami.sleep.service.bean;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.loc.z;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b?\u0010@J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\u008d\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u0002HÆ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\t\u0010 \u001a\u00020\u0002HÖ\u0001J\u0013\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0011\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0012\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001c\u0010\u0013\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u001c\u0010\u0014\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u001c\u0010\u0015\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b\u0015\u0010'R\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0017\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b4\u0010'R\u001c\u0010\u0018\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b6\u0010'R\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u00102R\u001c\u0010\u001a\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010%\u001a\u0004\b:\u0010'R\u001c\u0010\u001b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010%\u001a\u0004\b<\u0010'R\u0019\u0010\u001c\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b=\u0010%\u001a\u0004\b>\u0010'¨\u0006A"}, d2 = {"Lcom/huami/sleep/service/bean/Slp;", "", "", "component1", "component2", "component3", "component4", "component5", "", "Lcom/huami/sleep/service/bean/Stage;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", Constant.PAI_KEY_DAILY_PAI, "dt", "ed", "lt", "isX", "oddStage", "ss", UserDataStore.STATE, StepsInfo.KEY_STAGE, "wc", StepsInfo.KEY_STEP_WALK_TIME, "selected", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getDp", "()I", "b", "getDt", "c", "getEd", GoogleApiAvailabilityLight.a, "getLt", "e", "f", "Ljava/util/List;", "getOddStage", "()Ljava/util/List;", "g", "getSs", "h", "getSt", "i", "getStage", z.j, "getWc", hl.k, "getWk", "l", "getSelected", "<init>", "(IIIIILjava/util/List;IILjava/util/List;III)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Slp {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName(Constant.PAI_KEY_DAILY_PAI)
    private final int dp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("dt")
    private final int dt;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("ed")
    private final int ed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("lt")
    private final int lt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("is")
    private final int isX;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("odd_stage")
    @NotNull
    private final List<Stage> oddStage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("ss")
    private final int ss;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName(UserDataStore.STATE)
    private final int st;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName(StepsInfo.KEY_STAGE)
    @NotNull
    private final List<Stage> stage;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @SerializedName("wc")
    private final int wc;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @SerializedName(StepsInfo.KEY_STEP_WALK_TIME)
    private final int wk;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private final int selected;

    public Slp() {
        this(0, 0, 0, 0, 0, null, 0, 0, null, 0, 0, 0, 4095, null);
    }

    public Slp(int i, int i2, int i3, int i4, int i5, @NotNull List<Stage> list, int i6, int i7, @NotNull List<Stage> list2, int i8, int i9, int i10) {
        this.dp = i;
        this.dt = i2;
        this.ed = i3;
        this.lt = i4;
        this.isX = i5;
        this.oddStage = list;
        this.ss = i6;
        this.st = i7;
        this.stage = list2;
        this.wc = i8;
        this.wk = i9;
        this.selected = i10;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDp() {
        return this.dp;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getWc() {
        return this.wc;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getWk() {
        return this.wk;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDt() {
        return this.dt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEd() {
        return this.ed;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLt() {
        return this.lt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getIsX() {
        return this.isX;
    }

    @NotNull
    public final List<Stage> component6() {
        return this.oddStage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getSs() {
        return this.ss;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getSt() {
        return this.st;
    }

    @NotNull
    public final List<Stage> component9() {
        return this.stage;
    }

    @NotNull
    public final Slp copy(int dp, int dt, int ed, int lt, int isX, @NotNull List<Stage> oddStage, int ss, int st, @NotNull List<Stage> stage, int wc, int wk, int selected) {
        return new Slp(dp, dt, ed, lt, isX, oddStage, ss, st, stage, wc, wk, selected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Slp)) {
            return false;
        }
        Slp slp = (Slp) other;
        return this.dp == slp.dp && this.dt == slp.dt && this.ed == slp.ed && this.lt == slp.lt && this.isX == slp.isX && Intrinsics.areEqual(this.oddStage, slp.oddStage) && this.ss == slp.ss && this.st == slp.st && Intrinsics.areEqual(this.stage, slp.stage) && this.wc == slp.wc && this.wk == slp.wk && this.selected == slp.selected;
    }

    public final int getDp() {
        return this.dp;
    }

    public final int getDt() {
        return this.dt;
    }

    public final int getEd() {
        return this.ed;
    }

    public final int getLt() {
        return this.lt;
    }

    @NotNull
    public final List<Stage> getOddStage() {
        return this.oddStage;
    }

    public final int getSelected() {
        return this.selected;
    }

    public final int getSs() {
        return this.ss;
    }

    public final int getSt() {
        return this.st;
    }

    @NotNull
    public final List<Stage> getStage() {
        return this.stage;
    }

    public final int getWc() {
        return this.wc;
    }

    public final int getWk() {
        return this.wk;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.dp * 31) + this.dt) * 31) + this.ed) * 31) + this.lt) * 31) + this.isX) * 31) + this.oddStage.hashCode()) * 31) + this.ss) * 31) + this.st) * 31) + this.stage.hashCode()) * 31) + this.wc) * 31) + this.wk) * 31) + this.selected;
    }

    public final int isX() {
        return this.isX;
    }

    @NotNull
    public String toString() {
        return "Slp(dp=" + this.dp + ", dt=" + this.dt + ", ed=" + this.ed + ", lt=" + this.lt + ", isX=" + this.isX + ", oddStage=" + this.oddStage + ", ss=" + this.ss + ", st=" + this.st + ", stage=" + this.stage + ", wc=" + this.wc + ", wk=" + this.wk + ", selected=" + this.selected + ")";
    }

    public /* synthetic */ Slp(int i, int i2, int i3, int i4, int i5, List list, int i6, int i7, List list2, int i8, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i, (i11 & 2) != 0 ? 0 : i2, (i11 & 4) != 0 ? 0 : i3, (i11 & 8) != 0 ? 0 : i4, (i11 & 16) != 0 ? 0 : i5, (i11 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i11 & 64) != 0 ? 0 : i6, (i11 & 128) != 0 ? 0 : i7, (i11 & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i11 & 512) != 0 ? 0 : i8, (i11 & 1024) != 0 ? 0 : i9, (i11 & 2048) == 0 ? i10 : 0);
    }
}
