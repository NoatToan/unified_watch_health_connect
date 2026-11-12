package n9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.c1;
import androidx.health.platform.client.proto.d2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ln9/k;", "Lg9/b;", "Landroidx/health/platform/client/proto/d2;", "proto", "<init>", "(Landroidx/health/platform/client/proto/d2;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k extends g9.b<d2> {
    public static final Parcelable.Creator<k> CREATOR;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d2 f124994b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"n9/k$b", "Landroid/os/Parcelable$Creator;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<k> {
        /* JADX WARN: Type inference failed for: r3v8, types: [g9.b, n9.k] */
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            if (i14 == 0) {
                byte[] bArrCreateByteArray = parcel.createByteArray();
                if (bArrCreateByteArray == null) {
                    return null;
                }
                d2 d2VarT = d2.t(bArrCreateByteArray);
                d2VarT.getClass();
                return new k(d2VarT);
            }
            if (i14 != 1) {
                vb.h.s(am.j.h(i14, "Unknown storage: "));
                return null;
            }
            g9.c cVar = g9.c.f76457a;
            l lVar = new l();
            cVar.getClass();
            return (g9.b) g9.c.a(parcel, lVar);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public k(d2 d2Var) {
        d2Var.getClass();
        this.f124994b = d2Var;
    }

    @Override // g9.a
    public final c1 b() {
        return this.f124994b;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln9/k$a;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Ln9/k;", "CREATOR", "Landroid/os/Parcelable$Creator;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
