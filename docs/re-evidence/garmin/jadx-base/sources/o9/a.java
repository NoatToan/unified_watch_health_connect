package o9;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.c1;
import androidx.health.platform.client.proto.l0;
import androidx.health.platform.client.proto.m2;
import g9.c;
import java.util.List;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lo9/a;", "Lg9/b;", "Landroidx/health/platform/client/proto/m2;", "", "", "dataPointUids", "<init>", "(Ljava/util/List;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends g9.b<m2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f130959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2486a f130958c = new C2486a(null);
    public static final Parcelable.Creator<a> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"o9/a$b", "Landroid/os/Parcelable$Creator;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<a> {
        /* JADX WARN: Type inference failed for: r3v9, types: [g9.b, o9.a] */
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            if (i14 != 0) {
                if (i14 != 1) {
                    h.s(j.h(i14, "Unknown storage: "));
                    return null;
                }
                c cVar = c.f76457a;
                o9.b bVar = new o9.b();
                cVar.getClass();
                return (g9.b) c.a(parcel, bVar);
            }
            byte[] bArrCreateByteArray = parcel.createByteArray();
            if (bArrCreateByteArray == null) {
                return null;
            }
            m2 m2VarW = m2.w(bArrCreateByteArray);
            C2486a c2486a = a.f130958c;
            m2VarW.getClass();
            c2486a.getClass();
            l0.d dVarU = m2VarW.u();
            dVarU.getClass();
            return new a(dVarU);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(List<String> list) {
        list.getClass();
        this.f130959b = list;
    }

    @Override // g9.a
    public final c1 b() {
        m2.a aVarV = m2.v();
        aVarV.g();
        m2.t((m2) aVarV.f7677b, this.f130959b);
        return aVarV.e();
    }

    /* JADX INFO: renamed from: o9.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo9/a$a;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lo9/a;", "CREATOR", "Landroid/os/Parcelable$Creator;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2486a {
        public /* synthetic */ C2486a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2486a() {
        }
    }
}
