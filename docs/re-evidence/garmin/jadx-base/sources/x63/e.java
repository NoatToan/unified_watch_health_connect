package x63;

import java.io.IOException;
import p005kotlin.Metadata;
import w63.g0;
import w63.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lx63/e;", "Lw63/o;", "Lw63/g0;", "delegate", "", "size", "", "truncate", "<init>", "(Lw63/g0;JZ)V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f189320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f189321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f189322c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g0 g0Var, long j8, boolean z14) {
        super(g0Var);
        g0Var.getClass();
        this.f189320a = j8;
        this.f189321b = z14;
    }

    @Override // w63.o, w63.g0
    public final long read(w63.e eVar, long j8) throws IOException {
        eVar.getClass();
        long j14 = this.f189322c;
        long j15 = this.f189320a;
        if (j14 > j15) {
            j8 = 0;
        } else if (this.f189321b) {
            long j16 = j15 - j14;
            if (j16 == 0) {
                return -1L;
            }
            j8 = Math.min(j8, j16);
        }
        long j17 = super.read(eVar, j8);
        if (j17 != -1) {
            this.f189322c += j17;
        }
        long j18 = this.f189322c;
        if ((j18 >= j15 || j17 != -1) && j18 <= j15) {
            return j17;
        }
        if (j17 > 0 && j18 > j15) {
            long j19 = eVar.f183349b - (j18 - j15);
            w63.e eVar2 = new w63.e();
            eVar2.G3(eVar);
            eVar.write(eVar2, j19);
            eVar2.a();
        }
        throw new IOException("expected " + j15 + " bytes but got " + this.f189322c);
    }
}
