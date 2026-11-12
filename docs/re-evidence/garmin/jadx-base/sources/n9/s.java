package n9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.c1;
import androidx.health.platform.client.proto.h2;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ln9/s;", "Lg9/b;", "Landroidx/health/platform/client/proto/h2;", "", "callingPackage", "", RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "permissionToken", "", "isInForeground", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s extends g9.b<h2> {
    public static final Parcelable.Creator<s> CREATOR;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f124999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f125000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f125001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f125002f;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/health/platform/client/proto/h2;", "kotlin.jvm.PlatformType", "invoke", "()Landroidx/health/platform/client/proto/h2;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<h2> {
        public b() {
            super(0);
        }

        @Override // e23.a
        public final h2 invoke() {
            h2.a aVarB = h2.B();
            s sVar = s.this;
            String str = sVar.f124998b;
            aVarB.g();
            h2.t((h2) aVarB.f7677b, str);
            int i14 = sVar.f124999c;
            aVarB.g();
            h2.u((h2) aVarB.f7677b, i14);
            String str2 = sVar.f125000d;
            if (str2 != null) {
                aVarB.g();
                h2.v((h2) aVarB.f7677b, str2);
            }
            boolean z14 = sVar.f125001e;
            aVarB.g();
            h2.w((h2) aVarB.f7677b, z14);
            return aVarB.e();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"n9/s$c", "Landroid/os/Parcelable$Creator;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<s> {
        /* JADX WARN: Type inference failed for: r5v9, types: [g9.b, n9.s] */
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            if (i14 != 0) {
                if (i14 != 1) {
                    vb.h.s(am.j.h(i14, "Unknown storage: "));
                    return null;
                }
                g9.c cVar = g9.c.f76457a;
                t tVar = new t();
                cVar.getClass();
                return (g9.b) g9.c.a(parcel, tVar);
            }
            byte[] bArrCreateByteArray = parcel.createByteArray();
            if (bArrCreateByteArray == null) {
                return null;
            }
            h2 h2VarC = h2.C(bArrCreateByteArray);
            String strX = h2VarC.x();
            strX.getClass();
            return new s(strX, h2VarC.A(), h2VarC.z(), h2VarC.y());
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i14) {
            return new s[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new c();
    }

    public s(String str, int i14, String str2, boolean z14) {
        str.getClass();
        this.f124998b = str;
        this.f124999c = i14;
        this.f125000d = str2;
        this.f125001e = z14;
        this.f125002f = o13.m.b(new b());
    }

    @Override // g9.a
    public final c1 b() {
        Object value = this.f125002f.getValue();
        value.getClass();
        return (h2) value;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln9/s$a;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Ln9/s;", "CREATOR", "Landroid/os/Parcelable$Creator;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
