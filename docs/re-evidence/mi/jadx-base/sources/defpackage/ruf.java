package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public class ruf extends puf {

    public class a implements puf.f {
        public a(b bVar) {
        }

        @Override // puf.f
        public void a(int i, byte[] bArr) {
            if (i == 1) {
                if (bArr != null) {
                    byte b2 = bArr[0];
                }
                throw null;
            }
        }
    }

    public interface b {
    }

    public ruf(Context context, String str, puf.e eVar) {
        super(context, str, eVar);
    }

    public boolean n(String str) {
        if (!k()) {
            return false;
        }
        try {
            return this.f30792b.O0(this.f30791a, this.e, str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean o(int i) {
        if (!k()) {
            return false;
        }
        try {
            return this.f30792b.J2(this.f30791a, this.e, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean p() {
        if (!k()) {
            return false;
        }
        try {
            return this.f30792b.m4(this.f30791a, this.e);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void registerUnlockListener(b bVar) {
        if (bVar == null) {
            return;
        }
        l(1, new a(bVar));
    }
}
