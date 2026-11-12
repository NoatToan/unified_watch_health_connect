package io2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.annotations.SerializedName;
import ep2.l;
import fo2.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lio2/b;", "Landroid/os/Parcelable;", "", "encryptedData", "Lep2/l;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "Lfo2/y;", "usages", "Lep2/a;", "capabilities", "<init>", "(Ljava/lang/String;Lep2/l;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/lang/String;", "getEncryptedData", "()Ljava/lang/String;", "b", "Lep2/l;", "getType", "()Lep2/l;", "c", "Ljava/util/List;", "getUsages", "()Ljava/util/List;", "d", "getCapabilities", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("encryptedData")
    private final String encryptedData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final l type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("usages")
    private final List<y> usages;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("capabilities")
    private final List<ep2.a> capabilities;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            l lVarValueOf = l.valueOf(parcel.readString());
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList.add(y.valueOf(parcel.readString()));
            }
            int i16 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                arrayList2.add(ep2.a.valueOf(parcel.readString()));
            }
            return new b(string, lVarValueOf, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, l lVar, List<? extends y> list, List<? extends ep2.a> list2) {
        str.getClass();
        lVar.getClass();
        list.getClass();
        list2.getClass();
        this.encryptedData = str;
        this.type = lVar;
        this.usages = list;
        this.capabilities = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.encryptedData, bVar.encryptedData) && this.type == bVar.type && s.g(this.usages, bVar.usages) && s.g(this.capabilities, bVar.capabilities);
    }

    public final int hashCode() {
        return this.capabilities.hashCode() + u0.b((this.type.hashCode() + (this.encryptedData.hashCode() * 31)) * 31, 31, this.usages);
    }

    public final String toString() {
        String str = this.encryptedData;
        l lVar = this.type;
        List<y> list = this.usages;
        List<ep2.a> list2 = this.capabilities;
        StringBuilder sb3 = new StringBuilder("DPPEncryptedData(encryptedData=");
        sb3.append(str);
        sb3.append(", type=");
        sb3.append(lVar);
        sb3.append(", usages=");
        return j.j(sb3, list, ", capabilities=", list2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.encryptedData);
        parcel.writeString(this.type.name());
        Iterator itE = kg.f.e(this.usages, parcel);
        while (itE.hasNext()) {
            parcel.writeString(((y) itE.next()).name());
        }
        Iterator itE2 = kg.f.e(this.capabilities, parcel);
        while (itE2.hasNext()) {
            parcel.writeString(((ep2.a) itE2.next()).name());
        }
    }
}
