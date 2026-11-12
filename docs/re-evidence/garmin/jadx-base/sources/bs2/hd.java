package bs2;

import com.garmin.fit.FitRuntimeException;
import com.google.common.base.Ascii;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.zip.CheckedOutputStream;

/* JADX INFO: loaded from: classes11.dex */
public class hd implements hk, gk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f20184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheckedOutputStream f20185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p4 f20186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fk[] f20187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sd.a f20188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ao f20189f;

    public hd(File file, sd.a aVar) {
        this.f20187d = new fk[16];
        this.f20188e = aVar;
        this.f20189f = bo.f19755a[aVar.ordinal()] != 1 ? new h00() : new g00();
        file.delete();
        this.f20186c = new p4();
        this.f20184a = file;
        f();
        try {
            this.f20185b = new CheckedOutputStream(new FileOutputStream(this.f20184a, true), this.f20186c);
        } catch (IOException e4) {
            throw new FitRuntimeException(e4);
        }
    }

    @Override // bs2.hk
    public final void a(bk bkVar) {
        d(bkVar);
    }

    @Override // bs2.gk
    public final void b(fk fkVar) {
        e(fkVar);
    }

    public final void c() {
        if (this.f20184a == null) {
            throw new FitRuntimeException("File not open.");
        }
        try {
            f();
            long value = this.f20185b.getChecksum().getValue();
            this.f20185b.write((int) (value & 255));
            this.f20185b.write((int) ((value >> 8) & 255));
            this.f20185b.close();
            this.f20184a = null;
        } catch (IOException e4) {
            throw new FitRuntimeException(e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009e A[EDGE_INSN: B:52:0x009e->B:44:0x009e BREAK  A[LOOP:0: B:15:0x002f->B:54:?], EDGE_INSN: B:58:0x009e->B:44:0x009e BREAK  A[LOOP:0: B:15:0x002f->B:54:?], EDGE_INSN: B:59:0x009e->B:44:0x009e BREAK  A[LOOP:0: B:15:0x002f->B:54:?], EDGE_INSN: B:44:0x009e->B:45:0x00a6 BREAK  A[LOOP:2: B:29:0x0065->B:61:?]] */
    public final void d(bk bkVar) {
        wc wcVar;
        h7 next;
        wc next2;
        if (this.f20184a == null) {
            throw new FitRuntimeException("File not open.");
        }
        if (!this.f20189f.b(bkVar)) {
            throw new FitRuntimeException("Incompatible Protocol Features");
        }
        int i14 = bkVar.f19752b;
        fk[] fkVarArr = this.f20187d;
        fk fkVar = fkVarArr[i14];
        if (fkVar != null) {
            fk fkVar2 = new fk(bkVar);
            if (fkVar.f20133a == fkVar2.f20133a && fkVar.f20134b == fkVar2.f20134b) {
                Iterator<wc> it = fkVar2.f20136d.iterator();
                do {
                    wcVar = null;
                    if (it.hasNext()) {
                        next2 = it.next();
                        int i15 = next2.f20643a;
                        for (wc wcVar2 : fkVar.f20136d) {
                            if (wcVar2.f20643a == i15) {
                                wcVar = wcVar2;
                                break;
                            }
                        }
                        if (wcVar == null) {
                            break;
                        }
                    } else {
                        for (h7 h7Var : fkVar2.f20137e) {
                            short sB = h7Var.b();
                            short s8 = h7Var.f20182e;
                            Iterator<h7> it3 = fkVar.f20137e.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                                if (next.f20182e == s8 && next.b() == sB) {
                                    break;
                                }
                            }
                            if (next == null || h7Var.f20180c > next.f20180c) {
                                break;
                            }
                        }
                    }
                } while (next2.f20644b <= wcVar.f20644b);
                e(new fk(bkVar));
            } else {
                e(new fk(bkVar));
            }
        } else {
            e(new fk(bkVar));
        }
        bkVar.q(this.f20185b, fkVarArr[bkVar.f19752b]);
    }

    public final void e(fk fkVar) {
        if (this.f20184a == null) {
            throw new FitRuntimeException("File not open.");
        }
        if (!this.f20189f.a(fkVar)) {
            throw new FitRuntimeException("Incompatible Protocol Features");
        }
        fkVar.b(this.f20185b);
        this.f20187d[fkVar.f20134b] = fkVar;
    }

    public final void f() {
        if (this.f20184a == null) {
            throw new FitRuntimeException("File not open.");
        }
        try {
            p4 p4Var = new p4();
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f20184a, "rw");
            long length = this.f20184a.length() - 14;
            if (length < 0) {
                length = 0;
            }
            sd.a aVar = this.f20188e;
            byte[] bArr = {Ascii.SO, (byte) (aVar.f20507b | (aVar.f20506a << 4)), -82, 82, (byte) (length & 255), (byte) ((length >> 8) & 255), (byte) ((length >> 16) & 255), (byte) ((length >> 24) & 255), 46, 70, 73, 84};
            randomAccessFile.write(bArr);
            p4Var.update(bArr, 0, 12);
            long j8 = p4Var.f20397a;
            randomAccessFile.write((byte) (j8 & 255));
            randomAccessFile.write((byte) ((j8 >> 8) & 255));
            randomAccessFile.close();
        } catch (IOException e4) {
            throw new FitRuntimeException(e4);
        }
    }

    @Deprecated
    public hd(File file) {
        this(file, sd.a.V1_0);
    }

    public hd() {
        this.f20187d = new fk[16];
    }
}
