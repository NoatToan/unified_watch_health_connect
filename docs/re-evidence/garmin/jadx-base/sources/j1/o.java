package j1;

import android.os.Trace;
import androidx.camera.core.impl.j0;
import androidx.lifecycle.n0;
import b0.i1;
import b0.j1;
import b0.s0;
import java.util.Arrays;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0.f f96296a;

    public o(x0.f fVar) {
        this.f96296a = fVar;
    }

    @Override // j1.n
    public final void a(i1... i1VarArr) {
        int iB;
        x0.f fVar = this.f96296a;
        fVar.getClass();
        x0.d dVar = fVar.f188232a;
        i1[] i1VarArr2 = (i1[]) Arrays.copyOf(i1VarArr, i1VarArr.length);
        dVar.getClass();
        Trace.beginSection(ce.a.d("CX:unbind"));
        try {
            j0.u.a();
            b0.x xVar = dVar.f188217e;
            if (xVar == null) {
                iB = 0;
            } else {
                j0 j0Var = xVar.f14095g;
                if (j0Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                iB = j0Var.f().b();
            }
            if (iB == 2) {
                throw new UnsupportedOperationException("Unbind UseCase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            dVar.f188216d.i(new s0(p13.u.C(i1VarArr2), null, null, 6, null), dVar.f188220h);
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    @Override // j1.n
    public final x0.b b(n0 n0Var, b0.t tVar, j1 j1Var) {
        int iB;
        x0.f fVar = this.f96296a;
        fVar.getClass();
        n0Var.getClass();
        tVar.getClass();
        x0.d dVar = fVar.f188232a;
        dVar.getClass();
        Trace.beginSection(ce.a.d("CX:bindToLifecycle-UseCaseGroup"));
        try {
            b0.x xVar = dVar.f188217e;
            if (xVar == null) {
                iB = 0;
            } else {
                j0 j0Var = xVar.f14095g;
                if (j0Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                iB = j0Var.f().b();
            }
            if (iB == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
            }
            x0.d.b(dVar, 1);
            x0.b bVarC = x0.d.c(dVar, n0Var, tVar, new s0(j1Var));
            Trace.endSection();
            return bVarC;
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    @Override // j1.n
    public final void c() {
        this.f96296a.f188232a.e();
    }

    @Override // j1.n
    public final androidx.camera.core.impl.c d(b0.t tVar) {
        x0.f fVar = this.f96296a;
        fVar.getClass();
        tVar.getClass();
        return fVar.f188232a.d(tVar);
    }
}
