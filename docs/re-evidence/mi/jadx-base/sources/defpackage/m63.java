package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import com.google.android.exoplayer2.source.n;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class m63 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nl8 f25798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public il8 f25799b;
    public jl8 c;

    public m63(nl8 nl8Var) {
        this.f25798a = nl8Var;
    }

    @Override // com.google.android.exoplayer2.source.n
    public void a(long j, long j2) {
        ((il8) rk1.e(this.f25799b)).a(j, j2);
    }

    @Override // com.google.android.exoplayer2.source.n
    public long b() {
        jl8 jl8Var = this.c;
        if (jl8Var != null) {
            return jl8Var.getPosition();
        }
        return -1L;
    }

    @Override // com.google.android.exoplayer2.source.n
    public void c() {
        il8 il8Var = this.f25799b;
        if (il8Var instanceof c9g) {
            ((c9g) il8Var).j();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    @Override // com.google.android.exoplayer2.source.n
    public void d(zm5 zm5Var, Uri uri, Map<String, List<String>> map, long j, long j2, kl8 kl8Var) throws IOException {
        xu5 xu5Var = new xu5(zm5Var, j, j2);
        this.c = xu5Var;
        if (this.f25799b != null) {
            return;
        }
        il8[] il8VarArrB = this.f25798a.b(uri, map);
        if (il8VarArrB.length == 1) {
            this.f25799b = il8VarArrB[0];
        } else {
            for (il8 il8Var : il8VarArrB) {
                try {
                    if (il8Var.g(xu5Var)) {
                        this.f25799b = il8Var;
                        rk1.g(true);
                        xu5Var.l();
                        break;
                    } else {
                        boolean z = this.f25799b != null || xu5Var.getPosition() == j;
                        rk1.g(z);
                        xu5Var.l();
                    }
                } catch (EOFException unused) {
                    if (this.f25799b != null || xu5Var.getPosition() == j) {
                    }
                } catch (Throwable th) {
                    rk1.g(this.f25799b != null || xu5Var.getPosition() == j);
                    xu5Var.l();
                    throw th;
                }
                rk1.g(z);
                xu5Var.l();
            }
            if (this.f25799b == null) {
                String strL = wlq.L(il8VarArrB);
                StringBuilder sb = new StringBuilder(String.valueOf(strL).length() + 58);
                sb.append("None of the available extractors (");
                sb.append(strL);
                sb.append(") could read the stream.");
                throw new UnrecognizedInputFormatException(sb.toString(), (Uri) rk1.e(uri));
            }
        }
        this.f25799b.b(kl8Var);
    }

    @Override // com.google.android.exoplayer2.source.n
    public int e(r4i r4iVar) throws IOException {
        return ((il8) rk1.e(this.f25799b)).f((jl8) rk1.e(this.c), r4iVar);
    }

    @Override // com.google.android.exoplayer2.source.n
    public void release() {
        il8 il8Var = this.f25799b;
        if (il8Var != null) {
            il8Var.release();
            this.f25799b = null;
        }
        this.c = null;
    }
}
