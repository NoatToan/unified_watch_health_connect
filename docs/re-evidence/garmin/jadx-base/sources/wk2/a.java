package wk2;

import android.annotation.SuppressLint;
import android.os.Build;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lwk2/a;", "Lwk2/b;", "Lrs2/c;", "deviceInfo", "Lwk2/f;", TtmlNode.TAG_METADATA, "Ljava/io/File;", "file", "<init>", "(Lrs2/c;Lwk2/f;Ljava/io/File;)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f185827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f185828e;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(rs2.c cVar, f fVar, File file, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 4) != 0) {
            cl2.h.f27950a.getClass();
            fVar.getClass();
            cVar.getClass();
            file = cl2.h.b(tn.k.g(cl2.h.f27953d, "/sink"), fVar, cVar.getF92746j());
        }
        this(cVar, fVar, file);
    }

    @Override // wk2.d
    public final dz2.b b() {
        return new dz2.i(this.f185827d);
    }

    @Override // wk2.b, dz2.a
    public final synchronized void close() {
        super.close();
        this.f185827d.delete();
    }

    @Override // wk2.b, dz2.a
    public final long getSize() {
        return this.f185827d.length();
    }

    @Override // wk2.d
    @SuppressLint({"NewApi"})
    public final synchronized boolean reset() {
        a();
        if (this.f185827d.delete()) {
            return true;
        }
        try {
            if (this.f185828e >= 26) {
                BufferedWriter bufferedWriterNewBufferedWriter = Files.newBufferedWriter(this.f185827d.toPath(), new OpenOption[0]);
                bufferedWriterNewBufferedWriter.write("");
                bufferedWriterNewBufferedWriter.flush();
                bufferedWriterNewBufferedWriter.close();
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(rs2.c cVar, f fVar, File file) {
        super(new dz2.g(file, 2));
        cVar.getClass();
        fVar.getClass();
        file.getClass();
        this.f185827d = file;
        this.f185828e = Build.VERSION.SDK_INT;
    }
}
