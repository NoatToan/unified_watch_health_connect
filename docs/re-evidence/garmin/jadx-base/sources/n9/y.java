package n9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.c1;
import androidx.health.platform.client.proto.k2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ln9/y;", "Lg9/b;", "Landroidx/health/platform/client/proto/k2;", "", "sessionUid", "Landroidx/health/platform/client/proto/p;", "route", "<init>", "(Ljava/lang/String;Landroidx/health/platform/client/proto/p;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y extends g9.b<k2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.health.platform.client.proto.p f125009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f125007d = new a(null);
    public static final Parcelable.Creator<y> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"n9/y$b", "Landroid/os/Parcelable$Creator;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<y> {
        /* JADX WARN: Type inference failed for: r3v9, types: [g9.b, n9.y] */
        @Override // android.os.Parcelable.Creator
        public final y createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            if (i14 != 0) {
                if (i14 != 1) {
                    vb.h.s(am.j.h(i14, "Unknown storage: "));
                    return null;
                }
                g9.c cVar = g9.c.f76457a;
                z zVar = new z();
                cVar.getClass();
                return (g9.b) g9.c.a(parcel, zVar);
            }
            byte[] bArrCreateByteArray = parcel.createByteArray();
            if (bArrCreateByteArray == null) {
                return null;
            }
            k2 k2VarY = k2.y(bArrCreateByteArray);
            a aVar = y.f125007d;
            k2VarY.getClass();
            aVar.getClass();
            String strW = k2VarY.w();
            strW.getClass();
            androidx.health.platform.client.proto.p pVarV = k2VarY.v();
            pVarV.getClass();
            return new y(strW, pVarV);
        }

        @Override // android.os.Parcelable.Creator
        public final y[] newArray(int i14) {
            return new y[i14];
        }
    }

    public y(String str, androidx.health.platform.client.proto.p pVar) {
        str.getClass();
        pVar.getClass();
        this.f125008b = str;
        this.f125009c = pVar;
    }

    @Override // g9.a
    public final c1 b() {
        k2.a aVarX = k2.x();
        aVarX.g();
        k2.t((k2) aVarX.f7677b, this.f125008b);
        aVarX.g();
        k2.u((k2) aVarX.f7677b, this.f125009c);
        return aVarX.e();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln9/y$a;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Ln9/y;", "CREATOR", "Landroid/os/Parcelable$Creator;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
