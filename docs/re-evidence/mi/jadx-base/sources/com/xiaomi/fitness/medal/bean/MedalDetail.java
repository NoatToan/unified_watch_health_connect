package com.xiaomi.fitness.medal.bean;

import defpackage.ecf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJB\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001c\u0010\u0004R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010\f¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/medal/bean/MedalDetail;", "", "", "component1", "()Ljava/lang/String;", "component2", "", "component3", "()Z", "", "Lecf$a$a;", "component4", "()Ljava/util/List;", "coverText", "coverName", "hasSubType", "data", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)Lcom/xiaomi/fitness/medal/bean/MedalDetail;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCoverText", "getCoverName", "Z", "getHasSubType", "Ljava/util/List;", "getData", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final /* data */ class MedalDetail {

    @Nullable
    private final String coverName;

    @Nullable
    private final String coverText;

    @NotNull
    private final List<ecf.a.C0923a> data;
    private final boolean hasSubType;

    /* JADX WARN: Multi-variable type inference failed */
    public MedalDetail(@Nullable String str, @Nullable String str2, boolean z, @NotNull List<? extends ecf.a.C0923a> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.coverText = str;
        this.coverName = str2;
        this.hasSubType = z;
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MedalDetail copy$default(MedalDetail medalDetail, String str, String str2, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = medalDetail.coverText;
        }
        if ((i & 2) != 0) {
            str2 = medalDetail.coverName;
        }
        if ((i & 4) != 0) {
            z = medalDetail.hasSubType;
        }
        if ((i & 8) != 0) {
            list = medalDetail.data;
        }
        return medalDetail.copy(str, str2, z, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCoverText() {
        return this.coverText;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCoverName() {
        return this.coverName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasSubType() {
        return this.hasSubType;
    }

    @NotNull
    public final List<ecf.a.C0923a> component4() {
        return this.data;
    }

    @NotNull
    public final MedalDetail copy(@Nullable String coverText, @Nullable String coverName, boolean hasSubType, @NotNull List<? extends ecf.a.C0923a> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new MedalDetail(coverText, coverName, hasSubType, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MedalDetail)) {
            return false;
        }
        MedalDetail medalDetail = (MedalDetail) other;
        return Intrinsics.areEqual(this.coverText, medalDetail.coverText) && Intrinsics.areEqual(this.coverName, medalDetail.coverName) && this.hasSubType == medalDetail.hasSubType && Intrinsics.areEqual(this.data, medalDetail.data);
    }

    @Nullable
    public final String getCoverName() {
        return this.coverName;
    }

    @Nullable
    public final String getCoverText() {
        return this.coverText;
    }

    @NotNull
    public final List<ecf.a.C0923a> getData() {
        return this.data;
    }

    public final boolean getHasSubType() {
        return this.hasSubType;
    }

    public int hashCode() {
        String str = this.coverText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.coverName;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasSubType)) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "MedalDetail(coverText=" + this.coverText + ", coverName=" + this.coverName + ", hasSubType=" + this.hasSubType + ", data=" + this.data + ")";
    }
}
