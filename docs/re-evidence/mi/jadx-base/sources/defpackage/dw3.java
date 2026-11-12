package defpackage;

import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface dw3 {

    public interface a {
        dw3 a(int i, Format format, boolean z, List<Format> list, snp snpVar);
    }

    public interface b {
        snp d(int i, int i2);
    }

    boolean a(jl8 jl8Var) throws IOException;

    void b(b bVar, long j, long j2);

    fw3 c();

    Format[] e();

    void release();
}
