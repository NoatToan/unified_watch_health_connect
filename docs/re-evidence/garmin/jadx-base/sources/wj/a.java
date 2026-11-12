package wj;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import bk.l;
import com.dsi.ant.channel.AntCommandFailedException;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3452a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xj.a f185705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f185706b = new b(this, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f185707c;

    /* JADX INFO: renamed from: wj.a$a, reason: collision with other inner class name */
    public static class C3452a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(yj.a.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(xj.a aVar) {
        this.f185707c = false;
        if (aVar == null) {
            vb.h.s("Channel communicator provided  was null");
            throw null;
        }
        this.f185705a = aVar;
        this.f185707c = true;
    }

    public static void b(ck.k kVar, Bundle bundle) {
        Parcelable.Creator<xj.b> creator = xj.b.CREATOR;
        bundle.setClassLoader(xj.b.class.getClassLoader());
        xj.b bVar = (xj.b) bundle.getParcelable("com.dsi.ant.serviceerror");
        if (bVar.f191151a) {
            return;
        }
        if (!bVar.f191155e.f191156a) {
            throw new DeadObjectException();
        }
        throw new AntCommandFailedException(kVar, bVar);
    }

    public final void d(int i14) {
        Bundle bundle = new Bundle();
        this.f185705a.A(i14, bundle);
        b(ck.k.CONFIG_ID_LIST, bundle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void f() {
        try {
            this.f185707c = false;
            this.f185705a.f();
        } catch (RemoteException unused) {
        }
    }

    public final void g(h hVar) {
        Bundle bundle = new Bundle();
        if (vj.a.f178442c > 40000) {
            this.f185705a.r(hVar, bundle);
        } else {
            bundle.putParcelable("com.dsi.ant.serviceerror", new xj.b(c.INVALID_REQUEST));
        }
        b(ck.k.CONFIGURE_EVENT_BUFFER, bundle);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        xj.a aVar = this.f185705a;
        if (aVar instanceof yj.a) {
            ((yj.a) aVar).writeToParcel(parcel, i14);
        }
    }

    public final class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public nk.a.C2430a f185708a;

        private b() {
        }

        @Override // wj.i
        public final void a(l lVar, dk.a aVar) {
            if (a.this.f185707c) {
                this.f185708a.a(lVar, aVar);
            }
        }

        @Override // wj.i
        public final void b() {
            if (a.this.f185707c) {
                this.f185708a.b();
            }
        }

        public /* synthetic */ b(a aVar, C3452a c3452a) {
            this();
        }
    }
}
