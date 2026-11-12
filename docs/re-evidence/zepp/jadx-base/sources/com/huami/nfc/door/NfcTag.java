package com.huami.nfc.door;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parceler;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0001GB^\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u000f\b\u0002\u0010\u001e\u001a\t\u0018\u00010\u0013¢\u0006\u0002\b\u0014¢\u0006\u0004\bE\u0010FJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\bHÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0002HÆ\u0003J\u0010\u0010\u0015\u001a\t\u0018\u00010\u0013¢\u0006\u0002\b\u0014HÆ\u0003Jp\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u00022\u000f\b\u0002\u0010\u001e\u001a\t\u0018\u00010\u0013¢\u0006\u0002\b\u0014HÆ\u0001J\t\u0010 \u001a\u00020\u0002HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001J\u0013\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010%\u001a\u00020\bHÖ\u0001J\u0019\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\bHÖ\u0001R\u0019\u0010\u0016\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0017\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b.\u0010-R\u0019\u0010\u0018\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0019\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010-R\u0019\u0010\u001a\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00102R\u0019\u0010\u001b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u00102R\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u001d\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b=\u00100\u001a\u0004\b>\u00102R)\u0010\u001e\u001a\t\u0018\u00010\u0013¢\u0006\u0002\b\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lcom/huami/nfc/door/NfcTag;", "Landroid/os/Parcelable;", "", "b", "a", "getBlockData", "", "isAssignmentEmptyBlock", "", "component1", "component2", "component3", "component4", "component5", "component6", "", "Lcom/huami/nfc/door/Block;", "component7", "component8", "Lcom/huami/nfc/door/WorkerInfo;", "Lkotlinx/android/parcel/RawValue;", "component9", "header", "result", "uid", "uidLen", "sak", "atqa", "blockInfo", "blockContent", "workerInfo", "copy", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", LogUtil.I, "getHeader", "()I", "getResult", "c", "Ljava/lang/String;", "getUid", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, "getUidLen", "e", "getSak", "f", "getAtqa", "g", "Ljava/util/List;", "getBlockInfo", "()Ljava/util/List;", "h", "getBlockContent", "i", "Lcom/huami/nfc/door/WorkerInfo;", "getWorkerInfo", "()Lcom/huami/nfc/door/WorkerInfo;", "setWorkerInfo", "(Lcom/huami/nfc/door/WorkerInfo;)V", "<init>", "(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/huami/nfc/door/WorkerInfo;)V", "Companion", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NfcTag implements Parcelable {
    public static final int RESULT_ENCRYPT_CARD = 9;
    public static final int RESULT_FAILED = 3;
    public static final int RESULT_NOT_M1 = 8;
    public static final int RESULT_NOT_SUPPORT = 64;
    public static final int RESULT_OK = 0;
    public static final int RESULT_READ_FAILED = 65;
    public static final int RESULT_UNDEFINED = 254;
    public static final int RESULT_UNKNOWN = 255;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int result;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String uid;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int uidLen;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String sak;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String atqa;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<Block> blockInfo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final String blockContent;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private WorkerInfo workerInfo;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<NfcTag> CREATOR = new Creator();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0016\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/huami/nfc/door/NfcTag$Companion;", "Lkotlinx/android/parcel/Parceler;", "Lcom/huami/nfc/door/NfcTag;", "Landroid/os/Parcel;", "parcel", "create", "", DataCacher.j, "", "write", "RESULT_ENCRYPT_CARD", LogUtil.I, "RESULT_FAILED", "RESULT_NOT_M1", "RESULT_NOT_SUPPORT", "RESULT_OK", "RESULT_READ_FAILED", "RESULT_UNDEFINED", "RESULT_UNKNOWN", "<init>", "()V", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion implements Parceler<NfcTag> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.android.parcel.Parceler
        @NotNull
        public NfcTag[] newArray(int i) {
            return (NfcTag[]) Parceler.DefaultImpls.newArray(this, i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.android.parcel.Parceler
        @NotNull
        public NfcTag create(@NotNull Parcel parcel) {
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string = parcel.readString();
            String str = string == null ? "" : string;
            int i3 = parcel.readInt();
            String string2 = parcel.readString();
            String str2 = string2 == null ? "" : string2;
            String string3 = parcel.readString();
            String str3 = string3 == null ? "" : string3;
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Block.class.getClassLoader());
            String string4 = parcel.readString();
            return new NfcTag(i, i2, str, i3, str2, str3, arrayList, string4 == null ? "" : string4, (WorkerInfo) parcel.readParcelable(WorkerInfo.class.getClassLoader()));
        }

        @Override // kotlinx.android.parcel.Parceler
        public void write(@NotNull NfcTag nfcTag, @NotNull Parcel parcel, int i) {
            parcel.writeInt(nfcTag.getHeader());
            parcel.writeInt(nfcTag.getResult());
            parcel.writeString(nfcTag.getUid());
            parcel.writeInt(nfcTag.getUidLen());
            parcel.writeString(nfcTag.getSak());
            parcel.writeString(nfcTag.getAtqa());
            parcel.writeList(nfcTag.getBlockInfo());
            parcel.writeString(nfcTag.getBlockContent());
            parcel.writeParcelable(nfcTag.getWorkerInfo(), i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<NfcTag> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NfcTag createFromParcel(@NotNull Parcel parcel) {
            return NfcTag.INSTANCE.create(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NfcTag[] newArray(int i) {
            return new NfcTag[i];
        }
    }

    public NfcTag(int i, int i2, @NotNull String str, int i3, @NotNull String str2, @NotNull String str3, @NotNull List<Block> list, @NotNull String str4, @Nullable WorkerInfo workerInfo) {
        this.header = i;
        this.result = i2;
        this.uid = str;
        this.uidLen = i3;
        this.sak = str2;
        this.atqa = str3;
        this.blockInfo = list;
        this.blockContent = str4;
        this.workerInfo = workerInfo;
    }

    private final String a() {
        String strStringPlus = "";
        int i = 0;
        do {
            i++;
            strStringPlus = Intrinsics.stringPlus(Intrinsics.stringPlus(Intrinsics.stringPlus(Intrinsics.stringPlus(strStringPlus, "00000000000000000000000000000000"), "00000000000000000000000000000000"), "00000000000000000000000000000000"), "FFFFFFFFFFFFFF078069FFFFFFFFFFFF");
        } while (i < 16);
        return strStringPlus;
    }

    private final String b() {
        Iterator<Block> it2 = this.blockInfo.iterator();
        String strStringPlus = "";
        while (it2.hasNext()) {
            strStringPlus = Intrinsics.stringPlus(strStringPlus, it2.next().getData());
        }
        return strStringPlus;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getResult() {
        return this.result;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getUidLen() {
        return this.uidLen;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSak() {
        return this.sak;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAtqa() {
        return this.atqa;
    }

    @NotNull
    public final List<Block> component7() {
        return this.blockInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBlockContent() {
        return this.blockContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final WorkerInfo getWorkerInfo() {
        return this.workerInfo;
    }

    @NotNull
    public final NfcTag copy(int header, int result, @NotNull String uid, int uidLen, @NotNull String sak, @NotNull String atqa, @NotNull List<Block> blockInfo, @NotNull String blockContent, @Nullable WorkerInfo workerInfo) {
        return new NfcTag(header, result, uid, uidLen, sak, atqa, blockInfo, blockContent, workerInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcTag)) {
            return false;
        }
        NfcTag nfcTag = (NfcTag) other;
        return this.header == nfcTag.header && this.result == nfcTag.result && Intrinsics.areEqual(this.uid, nfcTag.uid) && this.uidLen == nfcTag.uidLen && Intrinsics.areEqual(this.sak, nfcTag.sak) && Intrinsics.areEqual(this.atqa, nfcTag.atqa) && Intrinsics.areEqual(this.blockInfo, nfcTag.blockInfo) && Intrinsics.areEqual(this.blockContent, nfcTag.blockContent) && Intrinsics.areEqual(this.workerInfo, nfcTag.workerInfo);
    }

    @NotNull
    public final String getAtqa() {
        return this.atqa;
    }

    @NotNull
    public final String getBlockContent() {
        return this.blockContent;
    }

    @NotNull
    public final String getBlockData() {
        return getBlockData(true);
    }

    @NotNull
    public final List<Block> getBlockInfo() {
        return this.blockInfo;
    }

    public final int getHeader() {
        return this.header;
    }

    public final int getResult() {
        return this.result;
    }

    @NotNull
    public final String getSak() {
        return this.sak;
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    public final int getUidLen() {
        return this.uidLen;
    }

    @Nullable
    public final WorkerInfo getWorkerInfo() {
        return this.workerInfo;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.header * 31) + this.result) * 31) + this.uid.hashCode()) * 31) + this.uidLen) * 31) + this.sak.hashCode()) * 31) + this.atqa.hashCode()) * 31) + this.blockInfo.hashCode()) * 31) + this.blockContent.hashCode()) * 31;
        WorkerInfo workerInfo = this.workerInfo;
        return iHashCode + (workerInfo == null ? 0 : workerInfo.hashCode());
    }

    public final void setWorkerInfo(@Nullable WorkerInfo workerInfo) {
        this.workerInfo = workerInfo;
    }

    @NotNull
    public String toString() {
        return "NfcTag(header=" + this.header + ", result=" + this.result + ", uid=" + this.uid + ", uidLen=" + this.uidLen + ", sak=" + this.sak + ", atqa=" + this.atqa + ", blockInfo=" + this.blockInfo + ", blockContent=" + this.blockContent + ", workerInfo=" + this.workerInfo + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        INSTANCE.write(this, parcel, flags);
    }

    @NotNull
    public final String getBlockData(boolean isAssignmentEmptyBlock) {
        String strB = b();
        return ((strB.length() == 0) && isAssignmentEmptyBlock) ? a() : strB;
    }

    public /* synthetic */ NfcTag(int i, int i2, String str, int i3, String str2, String str3, List list, String str4, WorkerInfo workerInfo, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, i3, str2, str3, list, str4, (i4 & 256) != 0 ? null : workerInfo);
    }
}
