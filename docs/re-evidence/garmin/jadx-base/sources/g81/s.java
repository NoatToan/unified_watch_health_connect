package g81;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lg81/s;", "Landroid/os/Parcelable;", "", "progress", "", "progressText", "", "progressTypeText", "Li53/c;", "Lo13/p;", "ranges", "progressColor", "<init>", "(FLjava/lang/String;ILi53/c;I)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f76397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f76399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<o13.p<Float, Integer>> f76400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f76401e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            parcel.getClass();
            float f14 = parcel.readFloat();
            String string = parcel.readString();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList.add(parcel.readSerializable());
            }
            return new s(f14, string, i14, i53.a.j(arrayList), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i14) {
            return new s[i14];
        }
    }

    public s(float f14, String str, int i14, i53.c<o13.p<Float, Integer>> cVar, int i15) {
        str.getClass();
        cVar.getClass();
        this.f76397a = f14;
        this.f76398b = str;
        this.f76399c = i14;
        this.f76400d = cVar;
        this.f76401e = i15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f76397a, sVar.f76397a) == 0 && this.f76398b.equals(sVar.f76398b) && this.f76399c == sVar.f76399c && this.f76400d.equals(sVar.f76400d) && this.f76401e == sVar.f76401e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f76401e) + l2.a(this.f76400d, q2.d(this.f76399c, wr.g.j(Float.hashCode(this.f76397a) * 31, 31, this.f76398b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EnduranceScoreGaugeState(progress=");
        sb3.append(this.f76397a);
        sb3.append(", progressText=");
        sb3.append(this.f76398b);
        sb3.append(", progressTypeText=");
        sb3.append(this.f76399c);
        sb3.append(", ranges=");
        sb3.append(this.f76400d);
        sb3.append(", progressColor=");
        return am.j.q(sb3, this.f76401e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeFloat(this.f76397a);
        parcel.writeString(this.f76398b);
        parcel.writeInt(this.f76399c);
        Iterator itG = j20.x.g(this.f76400d, parcel);
        while (itG.hasNext()) {
            parcel.writeSerializable((Serializable) itG.next());
        }
        parcel.writeInt(this.f76401e);
    }
}
