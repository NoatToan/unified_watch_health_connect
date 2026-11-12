package lf;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import w63.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Llf/r;", "Llf/o;", "Lw63/g;", "source", "Lw63/l;", "fileSystem", "Llf/o$a;", TtmlNode.TAG_METADATA, "<init>", "(Lw63/g;Lw63/l;Llf/o$a;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w63.l f112113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o.a f112114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f112115c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f112116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w63.g f112117e;

    public r(w63.g gVar, w63.l lVar, o.a aVar) {
        this.f112113a = lVar;
        this.f112114b = aVar;
        this.f112117e = gVar;
    }

    @Override // lf.o
    public final y b3() {
        synchronized (this.f112115c) {
            if (this.f112116d) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f112115c) {
            this.f112116d = true;
            w63.g gVar = this.f112117e;
            if (gVar != null) {
                dg.t.a aVar = dg.t.f59501a;
                try {
                    gVar.close();
                } catch (RuntimeException e4) {
                    throw e4;
                } catch (Exception unused) {
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // lf.o
    /* JADX INFO: renamed from: getFileSystem, reason: from getter */
    public final w63.l getF112113a() {
        return this.f112113a;
    }

    @Override // lf.o
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final o.a getF112114b() {
        return this.f112114b;
    }

    @Override // lf.o
    public final w63.g source() {
        w63.g gVar;
        synchronized (this.f112115c) {
            try {
                if (this.f112116d) {
                    throw new IllegalStateException("closed");
                }
                gVar = this.f112117e;
                if (gVar == null) {
                    throw null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return gVar;
    }
}
