package cy2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcy2/j;", "Landroid/os/Parcelable;", "<init>", "()V", "a", JWKParameterNames.RSA_EXPONENT, "c", "f", "d", "h", "g", "j", IntegerTokenConverter.CONVERTER_KEY, "b", "Lcy2/j$a;", "Lcy2/j$b;", "Lcy2/j$c;", "Lcy2/j$d;", "Lcy2/j$e;", "Lcy2/j$f;", "Lcy2/j$g;", "Lcy2/j$h;", "Lcy2/j$i;", "Lcy2/j$j;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class j implements Parcelable {

    /* JADX INFO: renamed from: cy2.j$j, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcy2/j$j;", "Lcy2/j;", "<init>", "()V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1217j extends j {
        public static final Parcelable.Creator<C1217j> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f56872a;

        /* JADX INFO: renamed from: cy2.j$j$a */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<C1217j> {
            @Override // android.os.Parcelable.Creator
            public final C1217j createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return new C1217j();
            }

            @Override // android.os.Parcelable.Creator
            public final C1217j[] newArray(int i14) {
                return new C1217j[i14];
            }
        }

        public C1217j() {
            super(null);
            this.f56872a = "UpdateSOSInfo";
        }

        @Override // cy2.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF56872a() {
            return this.f56872a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ j(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    /* JADX INFO: renamed from: b */
    public abstract String getF56872a();

    private j() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcy2/j$a;", "Lcy2/j;", "", "unitId", "partNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends j {
        public static final Parcelable.Creator<a> CREATOR = new C1216a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f56839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f56840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f56841c;

        /* JADX INFO: renamed from: cy2.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C1216a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new a(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i14) {
                return new a[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(null);
            str.getClass();
            this.f56839a = str;
            this.f56840b = str2;
            if (str.length() != 0) {
                this.f56841c = "ActivationV2";
            } else {
                vb.h.s("unitId is required");
                throw null;
            }
        }

        @Override // cy2.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF56872a() {
            return this.f56841c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f56839a);
            parcel.writeString(this.f56840b);
        }

        public /* synthetic */ a(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcy2/j$b;", "Lcy2/j;", "", "unitId", "referenceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends j {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f56842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f56843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f56844c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(null);
            str.getClass();
            this.f56842a = str;
            this.f56843b = str2;
            if (str.length() != 0) {
                this.f56844c = "CWSActivation";
            } else {
                vb.h.s("unitId is required");
                throw null;
            }
        }

        @Override // cy2.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF56872a() {
            return this.f56844c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f56842a);
            parcel.writeString(this.f56843b);
        }

        public /* synthetic */ b(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcy2/j$c;", "Lcy2/j;", "", "unitId", "partNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends j {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f56845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f56846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f56847c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new c(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(null);
            str.getClass();
            this.f56845a = str;
            this.f56846b = str2;
            if (str.length() != 0) {
                this.f56847c = "";
            } else {
                vb.h.s("unitId is required");
                throw null;
            }
        }

        @Override // cy2.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF56872a() {
            return this.f56847c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f56845a);
            parcel.writeString(this.f56846b);
        }

        public /* synthetic */ c(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcy2/j$f;", "Lcy2/j;", "", "metaPackageSku", "partNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f extends j {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f56857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f56858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f56859c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            public final f createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new f(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final f[] newArray(int i14) {
                return new f[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2) {
            super(null);
            str.getClass();
            this.f56857a = str;
            this.f56858b = str2;
            if (str.length() != 0) {
                this.f56859c = "";
            } else {
                vb.h.s("unitId is required");
                throw null;
            }
        }

        @Override // cy2.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF56872a() {
            return this.f56859c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f56857a);
            parcel.writeString(this.f56858b);
        }

        public /* synthetic */ f(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcy2/j$g;", "Lcy2/j;", "", "packageInstanceId", "referenceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g extends j {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f56860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f56861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f56862c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new g(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i14) {
                return new g[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2) {
            super(null);
            str.getClass();
            this.f56860a = str;
            this.f56861b = str2;
            if (str.length() != 0) {
                this.f56862c = "Cancel";
            } else {
                vb.h.s("packageInstanceId is required");
                throw null;
            }
        }

        @Override // cy2.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF56872a() {
            return this.f56862c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f56860a);
            parcel.writeString(this.f56861b);
        }

        public /* synthetic */ g(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcy2/j$d;", "Lcy2/j;", "", "unitId", "partNumber", "referenceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends j {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f56848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f56849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f56850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f56851d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new d(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3) {
            super(null);
            str.getClass();
            this.f56848a = str;
            this.f56849b = str2;
            this.f56850c = str3;
            if (str.length() != 0) {
                this.f56851d = "SOSActivation";
            } else {
                vb.h.s("unitId is required");
                throw null;
            }
        }

        @Override // cy2.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF56872a() {
            return this.f56851d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f56848a);
            parcel.writeString(this.f56849b);
            parcel.writeString(this.f56850c);
        }

        public /* synthetic */ d(String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcy2/j$h;", "Lcy2/j;", "", "packageInstanceId", "partNumber", "referenceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h extends j {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f56863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f56864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f56865c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f56866d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            public final h createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new h(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final h[] newArray(int i14) {
                return new h[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2, String str3) {
            super(null);
            str.getClass();
            this.f56863a = str;
            this.f56864b = str2;
            this.f56865c = str3;
            if (str.length() != 0) {
                this.f56866d = "UpdatePlan";
            } else {
                vb.h.s("packageInstanceId is required");
                throw null;
            }
        }

        @Override // cy2.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF56872a() {
            return this.f56866d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f56863a);
            parcel.writeString(this.f56864b);
            parcel.writeString(this.f56865c);
        }

        public /* synthetic */ h(String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcy2/j$e;", "Lcy2/j;", "", "metaPackageSku", "partNumber", "referenceId", "promoCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends j {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f56852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f56853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f56854c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f56855d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f56856e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new e(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i14) {
                return new e[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, String str3, String str4) {
            super(null);
            str.getClass();
            this.f56852a = str;
            this.f56853b = str2;
            this.f56854c = str3;
            this.f56855d = str4;
            if (str.length() != 0) {
                this.f56856e = "devicelessactivation";
            } else {
                vb.h.s("metaPackageSku is required");
                throw null;
            }
        }

        @Override // cy2.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF56872a() {
            return this.f56856e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f56852a);
            parcel.writeString(this.f56853b);
            parcel.writeString(this.f56854c);
            parcel.writeString(this.f56855d);
        }

        public /* synthetic */ e(String str, String str2, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcy2/j$i;", "Lcy2/j;", "", "sourceUnitId", "targetUnitId", "packageInstanceId", "referenceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i extends j {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f56867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f56868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f56869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f56870d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f56871e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            public final i createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new i(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final i[] newArray(int i14) {
                return new i[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2, String str3, String str4) {
            super(null);
            com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
            this.f56867a = str;
            this.f56868b = str2;
            this.f56869c = str3;
            this.f56870d = str4;
            if (str.length() == 0 || str2.length() == 0 || str3.length() == 0) {
                vb.h.s("sourceUnitId, targetUnitId, and packageInstanceId are required");
                throw null;
            }
            this.f56871e = "ServiceTransfer";
        }

        @Override // cy2.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF56872a() {
            return this.f56871e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f56867a);
            parcel.writeString(this.f56868b);
            parcel.writeString(this.f56869c);
            parcel.writeString(this.f56870d);
        }

        public /* synthetic */ i(String str, String str2, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, str2, str3, (i14 & 8) != 0 ? null : str4);
        }
    }
}
