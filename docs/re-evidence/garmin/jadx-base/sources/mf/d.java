package mf;

import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import t13.g;
import vb.h;
import w63.l;
import w63.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lmf/d;", "Lmf/a;", "", "maxSize", "Lw63/y;", "directory", "Lw63/l;", "fileSystem", "Lt13/g;", "cleanupCoroutineContext", "<init>", "(JLw63/y;Lw63/l;Lt13/g;)V", "c", "b", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements mf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f118285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mf.b f118286b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmf/d$b;", "Lmf/a$b;", "Lmf/b$b;", "Lmf/b;", "editor", "<init>", "(Lmf/b$b;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mf.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mf.b.C2245b f118287a;

        public b(mf.b.C2245b c2245b) {
            this.f118287a = c2245b;
        }

        @Override // mf.a.b
        public final c a() {
            mf.b.d dVarE;
            mf.b.C2245b c2245b = this.f118287a;
            mf.b bVar = mf.b.this;
            synchronized (bVar.f118255j) {
                c2245b.a(true);
                dVarE = bVar.e(c2245b.f118265a.f118269a);
            }
            if (dVarE != null) {
                return new c(dVarE);
            }
            return null;
        }

        @Override // mf.a.b
        public final void abort() {
            this.f118287a.a(false);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmf/d$c;", "Lmf/a$c;", "Lmf/b$d;", "Lmf/b;", "snapshot", "<init>", "(Lmf/b$d;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mf.a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mf.b.d f118288a;

        public c(mf.b.d dVar) {
            this.f118288a = dVar;
        }

        @Override // mf.a.c
        public final b T3() {
            mf.b.C2245b c2245bC;
            mf.b.d dVar = this.f118288a;
            mf.b bVar = mf.b.this;
            synchronized (bVar.f118255j) {
                dVar.close();
                c2245bC = bVar.c(dVar.f118278a.f118269a);
            }
            if (c2245bC != null) {
                return new b(c2245bC);
            }
            return null;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.f118288a.close();
        }

        @Override // mf.a.c
        public final y getData() {
            mf.b.d dVar = this.f118288a;
            if (!dVar.f118279b) {
                return dVar.f118278a.f118271c.get(1);
            }
            h.z("snapshot is closed");
            return null;
        }

        @Override // mf.a.c
        public final y getMetadata() {
            mf.b.d dVar = this.f118288a;
            if (!dVar.f118279b) {
                return dVar.f118278a.f118271c.get(0);
            }
            h.z("snapshot is closed");
            return null;
        }
    }

    static {
        new a(null);
    }

    public d(long j8, y yVar, l lVar, g gVar) {
        this.f118285a = lVar;
        this.f118286b = new mf.b(lVar, yVar, gVar, j8, 3, 2);
    }

    @Override // mf.a
    public final b a(String str) {
        w63.h.f183361d.getClass();
        mf.b.C2245b c2245bC = this.f118286b.c(w63.h.a.c(str).c(MessageDigestAlgorithms.SHA_256).e());
        if (c2245bC != null) {
            return new b(c2245bC);
        }
        return null;
    }

    @Override // mf.a
    public final c b(String str) {
        w63.h.f183361d.getClass();
        mf.b.d dVarE = this.f118286b.e(w63.h.a.c(str).c(MessageDigestAlgorithms.SHA_256).e());
        if (dVarE != null) {
            return new c(dVarE);
        }
        return null;
    }

    @Override // mf.a
    /* JADX INFO: renamed from: getFileSystem, reason: from getter */
    public final l getF118285a() {
        return this.f118285a;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lmf/d$a;", "", "<init>", "()V", "", "ENTRY_METADATA", "I", "ENTRY_DATA", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
