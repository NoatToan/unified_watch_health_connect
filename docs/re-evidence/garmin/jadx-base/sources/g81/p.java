package g81;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lg81/p;", "Landroid/os/Parcelable;", "", FirebaseAnalytics.Param.SCORE, "classificationId", "feedbackPhraseId", "", "Lg81/l;", "topContributors", "", "primaryTrainingDevice", "", "primaryTrainingDeviceName", "Lg81/s;", "gaugeState", "Lg81/m;", "pieState", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lg81/s;Lg81/m;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f76389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f76390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f76391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<l> f76392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f76393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f76394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f76395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f76396h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(l.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new p(numValueOf, numValueOf2, numValueOf3, arrayList, boolValueOf, parcel.readString(), s.CREATOR.createFromParcel(parcel), m.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i14) {
            return new p[i14];
        }
    }

    public /* synthetic */ p(Integer num, Integer num2, Integer num3, List list, Boolean bool, String str, s sVar, m mVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : num3, (i14 & 8) != 0 ? null : list, (i14 & 16) != 0 ? null : bool, (i14 & 32) != 0 ? null : str, sVar, mVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.f76389a, pVar.f76389a) && p005kotlin.jvm.internal.s.g(this.f76390b, pVar.f76390b) && p005kotlin.jvm.internal.s.g(this.f76391c, pVar.f76391c) && p005kotlin.jvm.internal.s.g(this.f76392d, pVar.f76392d) && p005kotlin.jvm.internal.s.g(this.f76393e, pVar.f76393e) && p005kotlin.jvm.internal.s.g(this.f76394f, pVar.f76394f) && p005kotlin.jvm.internal.s.g(this.f76395g, pVar.f76395g) && p005kotlin.jvm.internal.s.g(this.f76396h, pVar.f76396h);
    }

    public final int hashCode() {
        Integer num = this.f76389a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f76390b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f76391c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<l> list = this.f76392d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f76393e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f76394f;
        return this.f76396h.hashCode() + ((this.f76395g.hashCode() + ((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(this.f76389a, "EnduranceScoreDailyUIState(score=", ", classificationId=", ", feedbackPhraseId=", this.f76390b);
        sbL.append(this.f76391c);
        sbL.append(", topContributors=");
        sbL.append(this.f76392d);
        sbL.append(", primaryTrainingDevice=");
        b71.i.s(sbL, this.f76393e, ", primaryTrainingDeviceName=", this.f76394f, ", gaugeState=");
        sbL.append(this.f76395g);
        sbL.append(", pieState=");
        sbL.append(this.f76396h);
        sbL.append(")");
        return sbL.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.f76389a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.f76390b;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.f76391c;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        List<l> list = this.f76392d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((l) itO.next()).writeToParcel(parcel, i14);
            }
        }
        Boolean bool = this.f76393e;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeString(this.f76394f);
        this.f76395g.writeToParcel(parcel, i14);
        this.f76396h.writeToParcel(parcel, i14);
    }

    public p(Integer num, Integer num2, Integer num3, List<l> list, Boolean bool, String str, s sVar, m mVar) {
        sVar.getClass();
        mVar.getClass();
        this.f76389a = num;
        this.f76390b = num2;
        this.f76391c = num3;
        this.f76392d = list;
        this.f76393e = bool;
        this.f76394f = str;
        this.f76395g = sVar;
        this.f76396h = mVar;
    }
}
