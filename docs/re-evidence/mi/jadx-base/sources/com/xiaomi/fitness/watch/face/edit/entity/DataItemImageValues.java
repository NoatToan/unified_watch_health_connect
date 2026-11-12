package com.xiaomi.fitness.watch.face.edit.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Jh\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemImageValues;", "", "name", "", "source", "ref", "hasInvalidValueImage", "", "rotation", "", "supportRecolor", "paramList", "", "Lcom/xiaomi/fitness/watch/face/edit/entity/Param;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getSource", "getRef", "getHasInvalidValueImage", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRotation", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getSupportRecolor", "getParamList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/util/List;)Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemImageValues;", "equals", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DataItemImageValues {

    @Nullable
    private final Boolean hasInvalidValueImage;

    @Nullable
    private final String name;

    @Nullable
    private final List<Param> paramList;

    @Nullable
    private final String ref;

    @Nullable
    private final Float rotation;

    @Nullable
    private final String source;

    @Nullable
    private final Boolean supportRecolor;

    public DataItemImageValues() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataItemImageValues copy$default(DataItemImageValues dataItemImageValues, String str, String str2, String str3, Boolean bool, Float f, Boolean bool2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataItemImageValues.name;
        }
        if ((i & 2) != 0) {
            str2 = dataItemImageValues.source;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = dataItemImageValues.ref;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            bool = dataItemImageValues.hasInvalidValueImage;
        }
        Boolean bool3 = bool;
        if ((i & 16) != 0) {
            f = dataItemImageValues.rotation;
        }
        Float f2 = f;
        if ((i & 32) != 0) {
            bool2 = dataItemImageValues.supportRecolor;
        }
        Boolean bool4 = bool2;
        if ((i & 64) != 0) {
            list = dataItemImageValues.paramList;
        }
        return dataItemImageValues.copy(str, str4, str5, bool3, f2, bool4, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getHasInvalidValueImage() {
        return this.hasInvalidValueImage;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Float getRotation() {
        return this.rotation;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getSupportRecolor() {
        return this.supportRecolor;
    }

    @Nullable
    public final List<Param> component7() {
        return this.paramList;
    }

    @NotNull
    public final DataItemImageValues copy(@Nullable String name, @Nullable String source, @Nullable String ref, @Nullable Boolean hasInvalidValueImage, @Nullable Float rotation, @Nullable Boolean supportRecolor, @Nullable List<Param> paramList) {
        return new DataItemImageValues(name, source, ref, hasInvalidValueImage, rotation, supportRecolor, paramList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataItemImageValues)) {
            return false;
        }
        DataItemImageValues dataItemImageValues = (DataItemImageValues) other;
        return Intrinsics.areEqual(this.name, dataItemImageValues.name) && Intrinsics.areEqual(this.source, dataItemImageValues.source) && Intrinsics.areEqual(this.ref, dataItemImageValues.ref) && Intrinsics.areEqual(this.hasInvalidValueImage, dataItemImageValues.hasInvalidValueImage) && Intrinsics.areEqual((Object) this.rotation, (Object) dataItemImageValues.rotation) && Intrinsics.areEqual(this.supportRecolor, dataItemImageValues.supportRecolor) && Intrinsics.areEqual(this.paramList, dataItemImageValues.paramList);
    }

    @Nullable
    public final Boolean getHasInvalidValueImage() {
        return this.hasInvalidValueImage;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<Param> getParamList() {
        return this.paramList;
    }

    @Nullable
    public final String getRef() {
        return this.ref;
    }

    @Nullable
    public final Float getRotation() {
        return this.rotation;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final Boolean getSupportRecolor() {
        return this.supportRecolor;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.source;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ref;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.hasInvalidValueImage;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f = this.rotation;
        int iHashCode5 = (iHashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool2 = this.supportRecolor;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<Param> list = this.paramList;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DataItemImageValues(name=" + this.name + ", source=" + this.source + ", ref=" + this.ref + ", hasInvalidValueImage=" + this.hasInvalidValueImage + ", rotation=" + this.rotation + ", supportRecolor=" + this.supportRecolor + ", paramList=" + this.paramList + ")";
    }

    public DataItemImageValues(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Float f, @Nullable Boolean bool2, @Nullable List<Param> list) {
        this.name = str;
        this.source = str2;
        this.ref = str3;
        this.hasInvalidValueImage = bool;
        this.rotation = f;
        this.supportRecolor = bool2;
        this.paramList = list;
    }

    public /* synthetic */ DataItemImageValues(String str, String str2, String str3, Boolean bool, Float f, Boolean bool2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : f, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : list);
    }
}
