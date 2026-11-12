package defpackage;

import android.bluetooth.BluetoothGattService;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class z3t {
    public static final UUID e = tet.C(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n2 f40853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zbt f40854b;
    public sd c;
    public b d;

    public static class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public jet f40855a;

        public a(jet jetVar) {
            this.f40855a = jetVar;
        }

        @Override // z3t.b
        public void a(int i) {
            b().b(i);
        }

        public final sft b() {
            jet jetVar = this.f40855a;
            return jetVar != null ? jetVar.y0() : sft.a();
        }

        @Override // z3t.b
        public void a(urs ursVar) {
            jet jetVar = this.f40855a;
            if (jetVar != null) {
                jetVar.G0(ursVar);
            }
        }
    }

    public interface b {
        void a(int i);

        void a(urs ursVar);
    }

    public z3t(jet jetVar, sd sdVar) {
        this(new nd(jetVar, ats.Vb, e), sdVar, new a(jetVar));
    }

    public static boolean f(jet jetVar) {
        BluetoothGattService bluetoothGattServiceP = jetVar.p(ats.Vb);
        return (bluetoothGattServiceP == null || bluetoothGattServiceP.getCharacteristic(e) == null) ? false : true;
    }

    public final void a(int i) {
        t5t.d("HMLFProfile", "MTU_CHANGE:" + i);
        b bVar = this.d;
        if (bVar != null) {
            bVar.a(i);
        }
    }

    public final void b(urs ursVar) {
        b bVar = this.d;
        if (bVar != null) {
            bVar.a(ursVar);
        }
    }

    public void c(zbt zbtVar) {
        this.f40854b = zbtVar;
    }

    public final void d(byte[] bArr) {
        t5t.d("HMLFProfile", "LF value:" + tet.x(bArr));
        if (bArr == null || bArr.length < 1) {
            return;
        }
        ik ikVarA = ik.a(bArr[0] & 255);
        if (ikVarA == ik.MTU_CHANGE) {
            a(tet.d(bArr, 1, 2));
            return;
        }
        if (ikVarA == ik.ASYNC_PIECE) {
            b(new urs(bArr[1] & 255, bArr[2] & 255, bArr[3] & 255));
            return;
        }
        q1t q1tVar = new q1t(this.c, ikVarA);
        int length = bArr.length - 1;
        if (length > 0) {
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 1, bArr2, 0, length);
            q1tVar.a(bArr2);
        }
        t5t.d("HMLFProfile", "LF event:" + q1tVar);
        zbt zbtVar = this.f40854b;
        if (zbtVar != null) {
            zbtVar.a(q1tVar);
        }
    }

    public boolean e() {
        if (!this.f40853a.init()) {
            return false;
        }
        this.f40853a.a(new w5() { // from class: y3t
            @Override // defpackage.w5
            public final void a(byte[] bArr) {
                this.f39768a.d(bArr);
            }
        });
        return true;
    }

    public z3t(n2 n2Var, sd sdVar, b bVar) {
        this.f40853a = n2Var;
        this.c = sdVar;
        this.d = bVar;
    }
}
