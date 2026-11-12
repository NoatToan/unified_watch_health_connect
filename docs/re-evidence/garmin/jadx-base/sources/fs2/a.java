package fs2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.classic.Logger;
import com.google.gson.Gson;
import fb1.d0;
import gt2.c;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import qs2.d;
import qs2.f;
import qs2.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\t"}, d2 = {"Lfs2/a;", "Lqs2/d;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "b", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a implements d, Parcelable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Logger f73425p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f73426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public is2.b f73427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qs2.a f73428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f73429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f73430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f73431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f73432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f73433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f73434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f73435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f73436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f73437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f73438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f73423n = new b(null);
    public static final Parcelable.Creator<a> CREATOR = new C1482a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final t f73424o = m.b(new d0(27));

    /* JADX INFO: renamed from: fs2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"fs2/a$a", "Landroid/os/Parcelable$Creator;", "Lfs2/a;", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1482a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        int i14 = c.f79010a;
        f73425p = gt2.b.f79005a.i("PAY#DeviceWalletItem");
    }

    public a(Parcel parcel) {
        parcel.getClass();
        this.f73426a = "";
        this.f73429d = "";
        this.f73434i = "";
        this.f73435j = "";
        String string = parcel.readString();
        this.f73426a = string == null ? "" : string;
        new gs2.a();
        this.f73427b = gs2.a.d(parcel.readString());
        new gs2.a();
        this.f73428c = gs2.a.a(parcel.readString());
        String string2 = parcel.readString();
        this.f73429d = string2 == null ? "" : string2;
        this.f73430e = parcel.readLong();
        this.f73431f = parcel.readLong();
        new gs2.a();
        this.f73433h = gs2.a.b(parcel.readString());
        String string3 = parcel.readString();
        this.f73435j = string3 == null ? "" : string3;
        String string4 = parcel.readString();
        this.f73434i = string4 != null ? string4 : "";
        this.f73436k = parcel.readLong();
        this.f73437l = parcel.readString();
        this.f73438m = parcel.readInt() == 1;
    }

    public static Object f(a aVar, Class cls) {
        f73423n.getClass();
        Object value = f73424o.getValue();
        value.getClass();
        Gson gson = (Gson) value;
        aVar.getClass();
        if (s.g(aVar.f73435j, "")) {
            return null;
        }
        try {
            return gson.fromJson(aVar.f73435j, cls);
        } catch (Exception e4) {
            f73425p.error("safeParseProviderData error:", (Throwable) e4);
            return null;
        }
    }

    public static void k(a aVar, Object obj) {
        f73423n.getClass();
        Object value = f73424o.getValue();
        value.getClass();
        aVar.getClass();
        String json = ((Gson) value).toJson(obj);
        json.getClass();
        aVar.f73435j = json;
    }

    @Override // qs2.d
    /* JADX INFO: renamed from: R1, reason: from getter */
    public final boolean getF73438m() {
        return this.f73438m;
    }

    @Override // qs2.c
    /* JADX INFO: renamed from: W2, reason: from getter */
    public final is2.b getF73427b() {
        return this.f73427b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF73426a() {
        return this.f73426a;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f getF73433h() {
        return this.f73433h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void g(String str) {
        str.getClass();
        this.f73429d = str;
    }

    @Override // qs2.d
    /* JADX INFO: renamed from: getDeviceDisplayName, reason: from getter */
    public final String getF73437l() {
        return this.f73437l;
    }

    @Override // qs2.d
    /* JADX INFO: renamed from: getUnitId, reason: from getter */
    public final long getF73431f() {
        return this.f73431f;
    }

    public final void h(String str) {
        str.getClass();
        this.f73426a = str;
    }

    public final void i(String str) {
        str.getClass();
        this.f73435j = str;
    }

    public final void j(String str) {
        str.getClass();
        this.f73434i = str;
    }

    @Override // qs2.d
    /* JADX INFO: renamed from: k1, reason: from getter */
    public final String getF73434i() {
        return this.f73434i;
    }

    @Override // qs2.d
    /* JADX INFO: renamed from: n, reason: from getter */
    public final qs2.a getF73428c() {
        return this.f73428c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f73426a);
        is2.b bVar = this.f73427b;
        parcel.writeString(bVar != null ? bVar.name() : null);
        qs2.a aVar = this.f73428c;
        parcel.writeString(aVar != null ? aVar.name() : null);
        parcel.writeString(this.f73429d);
        parcel.writeLong(this.f73430e);
        parcel.writeLong(this.f73431f);
        f fVar = this.f73433h;
        parcel.writeString(fVar != null ? fVar.name() : null);
        parcel.writeString(this.f73435j);
        parcel.writeString(this.f73434i);
        parcel.writeLong(this.f73436k);
        parcel.writeString(this.f73437l);
        parcel.writeInt(this.f73438m ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lfs2/a$b;", "", "<init>", "()V", "", "WALLET_ITEM_DTO_ITEM_ID", "Ljava/lang/String;", "WALLET_ITEM_DTO_PROVIDER_TYPE", "WALLET_ITEM_DTO_BUSINESS_OPERATOR", "WALLET_ITEM_DTO_DISPLAY_NAME", "Lch/qos/logback/classic/Logger;", "LOGGER", "Lch/qos/logback/classic/Logger;", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public a() {
        this.f73426a = "";
        this.f73429d = "";
        this.f73434i = "";
        this.f73435j = "";
    }
}
