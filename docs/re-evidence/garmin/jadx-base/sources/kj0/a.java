package kj0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lkj0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "d", "b", "f", JWKParameterNames.RSA_EXPONENT, "c", "a", "Lkj0/a$a;", "Lkj0/a$b;", "Lkj0/a$c;", "Lkj0/a$d;", "Lkj0/a$e;", "Lkj0/a$f;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a implements Parcelable {

    /* JADX INFO: renamed from: kj0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkj0/a$a;", "Lkj0/a;", "", "shouldShowDialog", "", "deviceUnitId", "<init>", "(ZJ)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2012a extends a {
        public static final Parcelable.Creator<C2012a> CREATOR = new C2013a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f104930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f104931b;

        /* JADX INFO: renamed from: kj0.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2013a implements Parcelable.Creator<C2012a> {
            @Override // android.os.Parcelable.Creator
            public final C2012a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new C2012a(parcel.readInt() != 0, parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final C2012a[] newArray(int i14) {
                return new C2012a[i14];
            }
        }

        public C2012a(boolean z14, long j8) {
            super(null);
            this.f104930a = z14;
            this.f104931b = j8;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2012a)) {
                return false;
            }
            C2012a c2012a = (C2012a) obj;
            return this.f104930a == c2012a.f104930a && this.f104931b == c2012a.f104931b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f104931b) + (Boolean.hashCode(this.f104930a) * 31);
        }

        public final String toString() {
            return "AlipayDeepLinkingEntry(shouldShowDialog=" + this.f104930a + ", deviceUnitId=" + this.f104931b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(this.f104930a ? 1 : 0);
            parcel.writeLong(this.f104931b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkj0/a$b;", "Lkj0/a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f104932a = new b();
        public static final Parcelable.Creator<b> CREATOR = new C2014a();

        /* JADX INFO: renamed from: kj0.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2014a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return b.f104932a;
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
            return 867547974;
        }

        public final String toString() {
            return "EcomFeatureEntry";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkj0/a$d;", "Lkj0/a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f104937a = new d();
        public static final Parcelable.Creator<d> CREATOR = new C2016a();

        /* JADX INFO: renamed from: kj0.a$d$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2016a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return d.f104937a;
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        private d() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 926999996;
        }

        public final String toString() {
            return "GarminPayFeatureEntry";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkj0/a$f;", "Lkj0/a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f104939a = new f();
        public static final Parcelable.Creator<f> CREATOR = new C2018a();

        /* JADX INFO: renamed from: kj0.a$f$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2018a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            public final f createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return f.f104939a;
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
            return -447052477;
        }

        public final String toString() {
            return "WalletFeatureEntry";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ a(j jVar) {
        this();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkj0/a$c;", "Lkj0/a;", "", "unitId", "", "deviceImageUrl", "deviceName", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f104934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f104935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f104936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C2015a f104933d = new C2015a(null);
        public static final Parcelable.Creator<c> CREATOR = new b();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new c(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        public /* synthetic */ c(Long l14, String str, String str2, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2);
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
            return s.g(this.f104934a, cVar.f104934a) && s.g(this.f104935b, cVar.f104935b) && s.g(this.f104936c, cVar.f104936c);
        }

        public final int hashCode() {
            Long l14 = this.f104934a;
            int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
            String str = this.f104935b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f104936c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return am.j.o(this.f104936c, ")", i.j("GCMDeviceSettings(unitId=", ", deviceImageUrl=", this.f104935b, this.f104934a, ", deviceName="));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Long l14 = this.f104934a;
            if (l14 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.n(parcel, 1, l14);
            }
            parcel.writeString(this.f104935b);
            parcel.writeString(this.f104936c);
        }

        /* JADX INFO: renamed from: kj0.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkj0/a$c$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C2015a {
            public /* synthetic */ C2015a(j jVar) {
                this();
            }

            public static c a(long j8) {
                rd2.f.a().f152045a.getClass();
                sd2.f fVarI = rd2.j.i(j8, null);
                return new c(fVarI != null ? Long.valueOf(fVarI.getUnitID()) : null, fVarI != null ? fVarI.getImageURL() : null, fVarI != null ? fVarI.getProductDisplayName() : null);
            }

            private C2015a() {
            }
        }

        public c(Long l14, String str, String str2) {
            super(null);
            this.f104934a = l14;
            this.f104935b = str;
            this.f104936c = str2;
        }

        public c() {
            this(null, null, null, 7, null);
        }
    }

    private a() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkj0/a$e;", "Lkj0/a;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends a {
        public static final Parcelable.Creator<e> CREATOR = new C2017a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f104938a;

        /* JADX INFO: renamed from: kj0.a$e$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2017a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new e(parcel.readBundle(e.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i14) {
                return new e[i14];
            }
        }

        public /* synthetic */ e(Bundle bundle, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : bundle);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && s.g(this.f104938a, ((e) obj).f104938a);
        }

        public final int hashCode() {
            Bundle bundle = this.f104938a;
            if (bundle == null) {
                return 0;
            }
            return bundle.hashCode();
        }

        public final String toString() {
            return "PushProvisioningEntry(bundle=" + this.f104938a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeBundle(this.f104938a);
        }

        public e(Bundle bundle) {
            super(null);
            this.f104938a = bundle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
