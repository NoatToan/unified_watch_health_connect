package g81;

import android.os.Parcel;
import android.os.Parcelable;
import c22.c3;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lg81/m;", "Landroid/os/Parcelable;", "", "progressText", "", "progressTypeText", "Li53/c;", "Lg81/m$b;", "pieSlices", "<init>", "(Ljava/lang/String;ILi53/c;)V", "b", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f76367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<b> f76368c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i15);
            int iA = 0;
            while (iA != i15) {
                iA = kg.f.a(b.CREATOR, parcel, arrayList, iA, 1);
            }
            return new m(string, i14, i53.a.j(arrayList));
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public m(String str, int i14, i53.c<b> cVar) {
        str.getClass();
        cVar.getClass();
        this.f76366a = str;
        this.f76367b = i14;
        this.f76368c = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f76366a.equals(mVar.f76366a) && this.f76367b == mVar.f76367b && this.f76368c.equals(mVar.f76368c);
    }

    public final int hashCode() {
        return this.f76368c.hashCode() + q2.d(this.f76367b, this.f76366a.hashCode() * 31, 31);
    }

    public final String toString() {
        return l2.e(androidx.core.view.j.k(this.f76367b, "EnduranceScoreContributorsPieState(progressText=", this.f76366a, ", progressTypeText=", ", pieSlices="), this.f76368c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f76366a);
        parcel.writeInt(this.f76367b);
        Iterator itG = j20.x.g(this.f76368c, parcel);
        while (itG.hasNext()) {
            ((b) itG.next()).writeToParcel(parcel, i14);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lg81/m$b;", "Landroid/os/Parcelable;", "Lc22/c3;", "activityTypeLabelRes", "", "contribution", "", "colorRes", "", "isMiscellaneous", "<init>", "(Lc22/c3;FIZ)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c3 f76369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f76370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f76371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f76372d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b((c3) parcel.readParcelable(b.class.getClassLoader()), parcel.readFloat(), parcel.readInt(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public b(c3 c3Var, float f14, int i14, boolean z14) {
            c3Var.getClass();
            this.f76369a = c3Var;
            this.f76370b = f14;
            this.f76371c = i14;
            this.f76372d = z14;
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
            return p005kotlin.jvm.internal.s.g(this.f76369a, bVar.f76369a) && Float.compare(this.f76370b, bVar.f76370b) == 0 && this.f76371c == bVar.f76371c && this.f76372d == bVar.f76372d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f76372d) + q2.d(this.f76371c, q6.f.d(this.f76370b, this.f76369a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            return "PieSliceItem(activityTypeLabelRes=" + this.f76369a + ", contribution=" + this.f76370b + ", colorRes=" + this.f76371c + ", isMiscellaneous=" + this.f76372d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeParcelable(this.f76369a, i14);
            parcel.writeFloat(this.f76370b);
            parcel.writeInt(this.f76371c);
            parcel.writeInt(this.f76372d ? 1 : 0);
        }

        public /* synthetic */ b(c3 c3Var, float f14, int i14, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
            this(c3Var, f14, i14, (i15 & 8) != 0 ? false : z14);
        }
    }
}
