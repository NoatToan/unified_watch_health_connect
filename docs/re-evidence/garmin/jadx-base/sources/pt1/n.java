package pt1;

import android.os.Parcel;
import android.os.Parcelable;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lpt1/n;", "Landroid/os/Parcelable;", "<init>", "()V", "g", "d", JWKParameterNames.RSA_EXPONENT, "f", "a", "c", "h", "b", "Lpt1/n$a;", "Lpt1/n$b;", "Lpt1/n$c;", "Lpt1/n$d;", "Lpt1/n$e;", "Lpt1/n$f;", "Lpt1/n$g;", "Lpt1/n$h;", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class n implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpt1/n$a;", "Lpt1/n;", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f140893a = new a();
        public static final Parcelable.Creator<a> CREATOR = new C2647a();

        /* JADX INFO: renamed from: pt1.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2647a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return a.f140893a;
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i14) {
                return new a[i14];
            }
        }

        private a() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 863633421;
        }

        public final String toString() {
            return "EditReview";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpt1/n$b;", "Lpt1/n;", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f140894a = new b();
        public static final Parcelable.Creator<b> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return b.f140894a;
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        private b() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 91009411;
        }

        public final String toString() {
            return "None";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpt1/n$d;", "Lpt1/n;", "Lus1/d;", "reportTrailIssueType", "<init>", "(Lus1/d;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends n {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final us1.d f140898a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new d(us1.d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(us1.d dVar) {
            super(null);
            dVar.getClass();
            this.f140898a = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f140898a == ((d) obj).f140898a;
        }

        public final int hashCode() {
            return this.f140898a.hashCode();
        }

        public final String toString() {
            return "ReportIssue(reportTrailIssueType=" + this.f140898a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f140898a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpt1/n$e;", "Lpt1/n;", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f140899a = new e();
        public static final Parcelable.Creator<e> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return e.f140899a;
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i14) {
                return new e[i14];
            }
        }

        private e() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -2144367048;
        }

        public final String toString() {
            return "ReportIssueTypeSelection";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpt1/n$f;", "Lpt1/n;", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f140900a = new f();
        public static final Parcelable.Creator<f> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            public final f createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return f.f140900a;
            }

            @Override // android.os.Parcelable.Creator
            public final f[] newArray(int i14) {
                return new f[i14];
            }
        }

        private f() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 18430171;
        }

        public final String toString() {
            return "SubmitReview";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpt1/n$h;", "Lpt1/n;", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f140902a = new h();
        public static final Parcelable.Creator<h> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            public final h createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return h.f140902a;
            }

            @Override // android.os.Parcelable.Creator
            public final h[] newArray(int i14) {
                return new h[i14];
            }
        }

        private h() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1356770408;
        }

        public final String toString() {
            return "ViewReview";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ n(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private n() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpt1/n$g;", "Lpt1/n;", "Lus1/d;", "reportTrailIssueType", "<init>", "(Lus1/d;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g extends n {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final us1.d f140901a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new g(parcel.readInt() == 0 ? null : us1.d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i14) {
                return new g[i14];
            }
        }

        public /* synthetic */ g(us1.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : dVar);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f140901a == ((g) obj).f140901a;
        }

        public final int hashCode() {
            us1.d dVar = this.f140901a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public final String toString() {
            return "SuggestEdit(reportTrailIssueType=" + this.f140901a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            us1.d dVar = this.f140901a;
            if (dVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(dVar.name());
            }
        }

        public g(us1.d dVar) {
            super(null);
            this.f140901a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public g() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpt1/n$c;", "Lpt1/n;", "Lus1/c;", "contentType", "", "contentId", "", "shouldAddLocale", "<init>", "(Lus1/c;JZ)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends n {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final us1.c f140895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f140896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f140897c;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new c(us1.c.valueOf(parcel.readString()), parcel.readLong(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(us1.c cVar, long j8, boolean z14) {
            super(null);
            cVar.getClass();
            this.f140895a = cVar;
            this.f140896b = j8;
            this.f140897c = z14;
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
            return this.f140895a == cVar.f140895a && this.f140896b == cVar.f140896b && this.f140897c == cVar.f140897c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f140897c) + q6.f.e(this.f140895a.hashCode() * 31, 31, this.f140896b);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ReportContent(contentType=");
            sb3.append(this.f140895a);
            sb3.append(", contentId=");
            sb3.append(this.f140896b);
            return com.airbnb.lottie.animation.keyframe.a.i(sb3, ", shouldAddLocale=", this.f140897c, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f140895a.name());
            parcel.writeLong(this.f140896b);
            parcel.writeInt(this.f140897c ? 1 : 0);
        }

        public /* synthetic */ c(us1.c cVar, long j8, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(cVar, j8, (i14 & 4) != 0 ? false : z14);
        }
    }
}
