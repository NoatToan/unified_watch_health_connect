package com.xiaomi.fitness.watch.face.export.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 12\u00020\u0001:\u00011BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000b\u0010\u000fJ\u0018\u0010 \u001a\u00020!2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0007H\u0016J\b\u0010#\u001a\u00020\u0007H\u0016J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u0007HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/FaceEditLiteralBean;", "Landroid/os/Parcelable;", "name", "", "defaultTextList", "", "show", "", "maxStringCount", "fontName", "source", "<init>", "(Ljava/lang/String;Ljava/util/List;IILjava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getDefaultTextList", "()Ljava/util/List;", "setDefaultTextList", "(Ljava/util/List;)V", "getShow", "()I", "setShow", "(I)V", "getMaxStringCount", "setMaxStringCount", "getFontName", "getSource", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceEditLiteralBean.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditLiteralBean.kt\ncom/xiaomi/fitness/watch/face/export/data/FaceEditLiteralBean\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,47:1\n37#2:48\n36#2,3:49\n*S KotlinDebug\n*F\n+ 1 FaceEditLiteralBean.kt\ncom/xiaomi/fitness/watch/face/export/data/FaceEditLiteralBean\n*L\n26#1:48\n26#1:49,3\n*E\n"})
public final /* data */ class FaceEditLiteralBean implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private List<String> defaultTextList;

    @Nullable
    private final String fontName;
    private int maxStringCount;

    @NotNull
    private String name;
    private int show;

    @Nullable
    private final String source;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.export.data.FaceEditLiteralBean$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/FaceEditLiteralBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditLiteralBean;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/watch/face/export/data/FaceEditLiteralBean;", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<FaceEditLiteralBean> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public FaceEditLiteralBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FaceEditLiteralBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public FaceEditLiteralBean[] newArray(int size) {
            return new FaceEditLiteralBean[size];
        }
    }

    public FaceEditLiteralBean(@NotNull String name, @NotNull List<String> defaultTextList, int i, int i2, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(defaultTextList, "defaultTextList");
        this.name = name;
        this.defaultTextList = defaultTextList;
        this.show = i;
        this.maxStringCount = i2;
        this.fontName = str;
        this.source = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaceEditLiteralBean copy$default(FaceEditLiteralBean faceEditLiteralBean, String str, List list, int i, int i2, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = faceEditLiteralBean.name;
        }
        if ((i3 & 2) != 0) {
            list = faceEditLiteralBean.defaultTextList;
        }
        List list2 = list;
        if ((i3 & 4) != 0) {
            i = faceEditLiteralBean.show;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = faceEditLiteralBean.maxStringCount;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            str2 = faceEditLiteralBean.fontName;
        }
        String str4 = str2;
        if ((i3 & 32) != 0) {
            str3 = faceEditLiteralBean.source;
        }
        return faceEditLiteralBean.copy(str, list2, i4, i5, str4, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<String> component2() {
        return this.defaultTextList;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getShow() {
        return this.show;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxStringCount() {
        return this.maxStringCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFontName() {
        return this.fontName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final FaceEditLiteralBean copy(@NotNull String name, @NotNull List<String> defaultTextList, int show, int maxStringCount, @Nullable String fontName, @Nullable String source) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(defaultTextList, "defaultTextList");
        return new FaceEditLiteralBean(name, defaultTextList, show, maxStringCount, fontName, source);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceEditLiteralBean)) {
            return false;
        }
        FaceEditLiteralBean faceEditLiteralBean = (FaceEditLiteralBean) other;
        return Intrinsics.areEqual(this.name, faceEditLiteralBean.name) && Intrinsics.areEqual(this.defaultTextList, faceEditLiteralBean.defaultTextList) && this.show == faceEditLiteralBean.show && this.maxStringCount == faceEditLiteralBean.maxStringCount && Intrinsics.areEqual(this.fontName, faceEditLiteralBean.fontName) && Intrinsics.areEqual(this.source, faceEditLiteralBean.source);
    }

    @NotNull
    public final List<String> getDefaultTextList() {
        return this.defaultTextList;
    }

    @Nullable
    public final String getFontName() {
        return this.fontName;
    }

    public final int getMaxStringCount() {
        return this.maxStringCount;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getShow() {
        return this.show;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int iHashCode = ((((((this.name.hashCode() * 31) + this.defaultTextList.hashCode()) * 31) + Integer.hashCode(this.show)) * 31) + Integer.hashCode(this.maxStringCount)) * 31;
        String str = this.fontName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDefaultTextList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.defaultTextList = list;
    }

    public final void setMaxStringCount(int i) {
        this.maxStringCount = i;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setShow(int i) {
        this.show = i;
    }

    @NotNull
    public String toString() {
        return "FaceEditLiteralBean(name=" + this.name + ", defaultTextList=" + this.defaultTextList + ", show=" + this.show + ", maxStringCount=" + this.maxStringCount + ", fontName=" + this.fontName + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.name);
        parcel.writeStringArray((String[]) this.defaultTextList.toArray(new String[0]));
        parcel.writeInt(this.show);
        parcel.writeInt(this.maxStringCount);
        parcel.writeString(this.fontName);
        parcel.writeString(this.source);
    }

    public /* synthetic */ FaceEditLiteralBean(String str, List list, int i, int i2, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : str3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FaceEditLiteralBean(@NotNull Parcel parcel) {
        List mutableList;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        String str = string == null ? "" : string;
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        this(str, (arrayListCreateStringArrayList == null || (mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayListCreateStringArrayList)) == null) ? new ArrayList() : mutableList, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
    }
}
