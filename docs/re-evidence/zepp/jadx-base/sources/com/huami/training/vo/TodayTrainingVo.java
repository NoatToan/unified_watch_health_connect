package com.huami.training.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003JE\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0019\u0010\u000f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0010\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/huami/training/vo/TodayTrainingVo;", "", "", "component1", "component2", "component3", "component4", "", "component5", "", "component6", "id", "imgUrl", "name", WatchFaceDetailActivity.FROM_RANK, "cal", "studyNumber", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getImgUrl", "c", "getName", GoogleApiAvailabilityLight.a, "getRank", "e", LogUtil.I, "getCal", "()I", "f", "J", "getStudyNumber", "()J", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJ)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TodayTrainingVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String imgUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String rank;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int cal;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final long studyNumber;

    public TodayTrainingVo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, long j) {
        this.id = str;
        this.imgUrl = str2;
        this.name = str3;
        this.rank = str4;
        this.cal = i;
        this.studyNumber = j;
    }

    public static /* synthetic */ TodayTrainingVo copy$default(TodayTrainingVo todayTrainingVo, String str, String str2, String str3, String str4, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = todayTrainingVo.id;
        }
        if ((i2 & 2) != 0) {
            str2 = todayTrainingVo.imgUrl;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = todayTrainingVo.name;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = todayTrainingVo.rank;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            i = todayTrainingVo.cal;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            j = todayTrainingVo.studyNumber;
        }
        return todayTrainingVo.copy(str, str5, str6, str7, i3, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCal() {
        return this.cal;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getStudyNumber() {
        return this.studyNumber;
    }

    @NotNull
    public final TodayTrainingVo copy(@NotNull String id, @NotNull String imgUrl, @NotNull String name, @NotNull String rank, int cal, long studyNumber) {
        return new TodayTrainingVo(id, imgUrl, name, rank, cal, studyNumber);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TodayTrainingVo)) {
            return false;
        }
        TodayTrainingVo todayTrainingVo = (TodayTrainingVo) other;
        return Intrinsics.areEqual(this.id, todayTrainingVo.id) && Intrinsics.areEqual(this.imgUrl, todayTrainingVo.imgUrl) && Intrinsics.areEqual(this.name, todayTrainingVo.name) && Intrinsics.areEqual(this.rank, todayTrainingVo.rank) && this.cal == todayTrainingVo.cal && this.studyNumber == todayTrainingVo.studyNumber;
    }

    public final int getCal() {
        return this.cal;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getRank() {
        return this.rank;
    }

    public final long getStudyNumber() {
        return this.studyNumber;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.imgUrl.hashCode()) * 31) + this.name.hashCode()) * 31) + this.rank.hashCode()) * 31) + this.cal) * 31) + b.a(this.studyNumber);
    }

    @NotNull
    public String toString() {
        return "TodayTrainingVo(id=" + this.id + ", imgUrl=" + this.imgUrl + ", name=" + this.name + ", rank=" + this.rank + ", cal=" + this.cal + ", studyNumber=" + this.studyNumber + ')';
    }
}
