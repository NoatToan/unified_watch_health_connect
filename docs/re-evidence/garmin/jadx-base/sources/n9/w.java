package n9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.c1;
import androidx.health.platform.client.proto.j2;
import androidx.health.platform.client.proto.l0;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ln9/w;", "Lg9/b;", "Landroidx/health/platform/client/proto/j2;", "", "Landroidx/health/platform/client/proto/p;", "dataPoints", "<init>", "(Ljava/util/List;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w extends g9.b<j2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<androidx.health.platform.client.proto.p> f125006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f125005c = new a(null);
    public static final Parcelable.Creator<w> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"n9/w$b", "Landroid/os/Parcelable$Creator;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<w> {
        /* JADX WARN: Type inference failed for: r3v9, types: [g9.b, n9.w] */
        @Override // android.os.Parcelable.Creator
        public final w createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            if (i14 != 0) {
                if (i14 != 1) {
                    vb.h.s(am.j.h(i14, "Unknown storage: "));
                    return null;
                }
                g9.c cVar = g9.c.f76457a;
                x xVar = new x();
                cVar.getClass();
                return (g9.b) g9.c.a(parcel, xVar);
            }
            byte[] bArrCreateByteArray = parcel.createByteArray();
            if (bArrCreateByteArray == null) {
                return null;
            }
            j2 j2VarW = j2.w(bArrCreateByteArray);
            a aVar = w.f125005c;
            j2VarW.getClass();
            aVar.getClass();
            l0.d dVarU = j2VarW.u();
            dVarU.getClass();
            return new w(dVarU);
        }

        @Override // android.os.Parcelable.Creator
        public final w[] newArray(int i14) {
            return new w[i14];
        }
    }

    public w(List<androidx.health.platform.client.proto.p> list) {
        list.getClass();
        this.f125006b = list;
    }

    @Override // g9.a
    public final c1 b() {
        j2.a aVarV = j2.v();
        aVarV.g();
        j2.t((j2) aVarV.f7677b, this.f125006b);
        return aVarV.e();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln9/w$a;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Ln9/w;", "CREATOR", "Landroid/os/Parcelable$Creator;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
