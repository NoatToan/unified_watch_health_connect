package n9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.a2;
import androidx.health.platform.client.proto.c1;
import androidx.health.platform.client.proto.l0;
import androidx.health.platform.client.proto.y1;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ln9/e;", "Lg9/b;", "Landroidx/health/platform/client/proto/a2;", "", "Landroidx/health/platform/client/proto/y1;", "uids", "clientIds", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends g9.b<a2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<y1> f124990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<y1> f124991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f124989d = new a(null);
    public static final Parcelable.Creator<e> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"n9/e$b", "Landroid/os/Parcelable$Creator;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<e> {
        /* JADX WARN: Type inference failed for: r3v9, types: [g9.b, n9.e] */
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            if (i14 != 0) {
                if (i14 != 1) {
                    vb.h.s(am.j.h(i14, "Unknown storage: "));
                    return null;
                }
                g9.c cVar = g9.c.f76457a;
                f fVar = new f();
                cVar.getClass();
                return (g9.b) g9.c.a(parcel, fVar);
            }
            byte[] bArrCreateByteArray = parcel.createByteArray();
            if (bArrCreateByteArray == null) {
                return null;
            }
            a2 a2VarY = a2.y(bArrCreateByteArray);
            a aVar = e.f124989d;
            a2VarY.getClass();
            aVar.getClass();
            l0.d dVarW = a2VarY.w();
            dVarW.getClass();
            l0.d dVarV = a2VarY.v();
            dVarV.getClass();
            return new e(dVarW, dVarV);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public e(List<y1> list, List<y1> list2) {
        list.getClass();
        list2.getClass();
        this.f124990b = list;
        this.f124991c = list2;
    }

    @Override // g9.a
    public final c1 b() {
        a2.a aVarX = a2.x();
        aVarX.g();
        a2.t((a2) aVarX.f7677b, this.f124990b);
        aVarX.g();
        a2.u((a2) aVarX.f7677b, this.f124991c);
        return aVarX.e();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln9/e$a;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Ln9/e;", "CREATOR", "Landroid/os/Parcelable$Creator;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
