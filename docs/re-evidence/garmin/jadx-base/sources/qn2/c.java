package qn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 ¨\u0006*"}, d2 = {"Lqn2/c;", "Lpn2/d;", "Lqn2/w;", "seInfo", "Lqn2/l;", "deviceIdentificationInfo", "", "Lqn2/a;", "appletInfoList", "", "tsmConfiguration", "Lqn2/x;", "sdInfoList", "<init>", "(Lqn2/w;Lqn2/l;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "a", "Lqn2/w;", "getSeInfo", "()Lqn2/w;", "setSeInfo", "(Lqn2/w;)V", "b", "Lqn2/l;", "getDeviceIdentificationInfo", "()Lqn2/l;", "setDeviceIdentificationInfo", "(Lqn2/l;)V", "c", "Ljava/util/List;", "getAppletInfoList", "()Ljava/util/List;", "setAppletInfoList", "(Ljava/util/List;)V", "d", "Ljava/lang/String;", "getTsmConfiguration", "()Ljava/lang/String;", "setTsmConfiguration", "(Ljava/lang/String;)V", JWKParameterNames.RSA_EXPONENT, "getSdInfoList", "setSdInfoList", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements pn2.d {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("seInfo")
    private w seInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceIdentificationInfo")
    private l deviceIdentificationInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("appletInfoList")
    private List<qn2.a> appletInfoList;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tsmConfiguration")
    private String tsmConfiguration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sdInfoList")
    private List<x> sdInfoList;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            w wVarCreateFromParcel = w.CREATOR.createFromParcel(parcel);
            l lVarCreateFromParcel = l.CREATOR.createFromParcel(parcel);
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i14) {
                iA2 = kg.f.a(qn2.a.CREATOR, parcel, arrayList, iA2, 1);
            }
            String string = parcel.readString();
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            while (iA != i15) {
                iA = kg.f.a(x.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new c(wVarCreateFromParcel, lVarCreateFromParcel, arrayList, string, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(w wVar, l lVar, List<qn2.a> list, String str, List<x> list2) {
        wVar.getClass();
        lVar.getClass();
        list.getClass();
        str.getClass();
        list2.getClass();
        this.seInfo = wVar;
        this.deviceIdentificationInfo = lVar;
        this.appletInfoList = list;
        this.tsmConfiguration = str;
        this.sdInfoList = list2;
        if (str.length() == 32) {
            return;
        }
        vb.h.x(am.j.h(this.tsmConfiguration.length(), "tsmConfiguration length(32): "));
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.seInfo, cVar.seInfo) && p005kotlin.jvm.internal.s.g(this.deviceIdentificationInfo, cVar.deviceIdentificationInfo) && p005kotlin.jvm.internal.s.g(this.appletInfoList, cVar.appletInfoList) && p005kotlin.jvm.internal.s.g(this.tsmConfiguration, cVar.tsmConfiguration) && p005kotlin.jvm.internal.s.g(this.sdInfoList, cVar.sdInfoList);
    }

    public final int hashCode() {
        return this.sdInfoList.hashCode() + wr.g.j(u0.b((this.deviceIdentificationInfo.hashCode() + (this.seInfo.hashCode() * 31)) * 31, 31, this.appletInfoList), 31, this.tsmConfiguration);
    }

    public final String toString() {
        w wVar = this.seInfo;
        l lVar = this.deviceIdentificationInfo;
        List<qn2.a> list = this.appletInfoList;
        String str = this.tsmConfiguration;
        List<x> list2 = this.sdInfoList;
        StringBuilder sb3 = new StringBuilder("FNBeginInitializeChipPayloadDto(seInfo=");
        sb3.append(wVar);
        sb3.append(", deviceIdentificationInfo=");
        sb3.append(lVar);
        sb3.append(", appletInfoList=");
        o2.c.n(", tsmConfiguration='", str, "', sdInfoList=", sb3, list);
        return u62.z.c(sb3, list2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.seInfo.writeToParcel(parcel, i14);
        this.deviceIdentificationInfo.writeToParcel(parcel, i14);
        Iterator itE = kg.f.e(this.appletInfoList, parcel);
        while (itE.hasNext()) {
            ((qn2.a) itE.next()).writeToParcel(parcel, i14);
        }
        parcel.writeString(this.tsmConfiguration);
        Iterator itE2 = kg.f.e(this.sdInfoList, parcel);
        while (itE2.hasNext()) {
            ((x) itE2.next()).writeToParcel(parcel, i14);
        }
    }
}
