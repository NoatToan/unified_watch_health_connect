package lf;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import w63.b0;
import w63.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llf/n;", "Llf/o;", "Lw63/y;", "file", "Lw63/l;", "fileSystem", "", "diskCacheKey", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "Llf/o$a;", TtmlNode.TAG_METADATA, "<init>", "(Lw63/y;Lw63/l;Ljava/lang/String;Ljava/lang/AutoCloseable;Llf/o$a;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f112103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w63.l f112104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f112105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AutoCloseable f112106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o.a f112107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f112108f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f112109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b0 f112110h;

    public n(y yVar, w63.l lVar, String str, AutoCloseable autoCloseable, o.a aVar) {
        this.f112103a = yVar;
        this.f112104b = lVar;
        this.f112105c = str;
        this.f112106d = autoCloseable;
        this.f112107e = aVar;
    }

    @Override // lf.o
    public final y b3() {
        y yVar;
        synchronized (this.f112108f) {
            if (this.f112109g) {
                throw new IllegalStateException("closed");
            }
            yVar = this.f112103a;
        }
        return yVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0016 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x000a, B:8:0x000c, B:11:0x0011, B:12:0x0012, B:14:0x0016, B:15:0x0018, B:18:0x001f, B:19:0x0020), top: B:27:0x0004, inners: #3, #5, #4 }] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        AutoCloseable autoCloseable;
        synchronized (this.f112108f) {
            this.f112109g = true;
            b0 b0Var = this.f112110h;
            if (b0Var != null) {
                dg.t.a aVar = dg.t.f59501a;
                try {
                    b0Var.close();
                } catch (RuntimeException e4) {
                    throw e4;
                } catch (Exception unused) {
                }
                autoCloseable = this.f112106d;
                if (autoCloseable != null) {
                    dg.t.a aVar2 = dg.t.f59501a;
                    try {
                        vb.h.p(autoCloseable);
                    } catch (RuntimeException e14) {
                        throw e14;
                    } catch (Exception unused2) {
                    }
                }
                Unit unit = Unit.INSTANCE;
            } else {
                autoCloseable = this.f112106d;
                if (autoCloseable != null) {
                    dg.t.a aVar3 = dg.t.f59501a;
                    vb.h.p(autoCloseable);
                }
                Unit unit2 = Unit.INSTANCE;
            }
            throw th;
        }
    }

    @Override // lf.o
    /* JADX INFO: renamed from: getFileSystem, reason: from getter */
    public final w63.l getF112104b() {
        return this.f112104b;
    }

    @Override // lf.o
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final o.a getF112107e() {
        return this.f112107e;
    }

    @Override // lf.o
    public final w63.g source() {
        synchronized (this.f112108f) {
            if (this.f112109g) {
                throw new IllegalStateException("closed");
            }
            b0 b0Var = this.f112110h;
            if (b0Var != null) {
                return b0Var;
            }
            b0 b0VarD = w5.r.d(this.f112104b.w(this.f112103a));
            this.f112110h = b0VarD;
            return b0VarD;
        }
    }
}
