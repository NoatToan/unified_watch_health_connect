package wk2;

import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.garmin.device.filetransfer.core.util.UrlSourceException;
import com.garmin.sync.gc.exception.ServerException;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ds.e0;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.util.concurrent.atomic.AtomicReference;
import o53.b0;
import o53.c0;
import o53.r;
import o53.s;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000eB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"Lwk2/o;", "Lwk2/c;", "Ljava/io/File;", "file", "Lwk2/f;", TtmlNode.TAG_METADATA, "", "url", "<init>", "(Ljava/io/File;Lwk2/f;Ljava/lang/String;)V", "Lrs2/c;", "deviceInfo", "(Lrs2/c;Lwk2/f;Ljava/lang/String;)V", "(Ljava/io/File;Lwk2/f;)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class o extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f185870i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f185871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f185872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f185873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u53.d f185874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference<r<Unit>> f185875h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.core.data.UrlDataSource$startDownload$1", f = "UrlDataSource.kt", l = {90}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f185876a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r<Unit> f185878c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r<Unit> rVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f185878c = rVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return o.this.new b(this.f185878c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f185876a;
            r<Unit> rVar = this.f185878c;
            o oVar = o.this;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    File file = oVar.f185871d;
                    this.f185876a = 1;
                    if (oVar.h(file, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                rVar.p(Unit.INSTANCE);
            } catch (Exception e4) {
                f fVar = oVar.f185872e;
                File file2 = oVar.f185871d;
                if (fVar.f185845d <= 0 && file2.length() > 0) {
                    Logger logger = o.f185870i;
                    StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(file2.length(), "Failed download ", e4.getMessage(), ". Remove partial file(");
                    sbJ.append("B)");
                    logger.warn(sbJ.toString());
                    file2.delete();
                }
                rVar.O(e4);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        f185870i = LoggerFactory.getLogger("UrlDataSource");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(rs2.c cVar, f fVar, String str) {
        this(cl2.h.b(tn.k.g(cl2.h.f27953d, "//source"), fVar, cVar.getF172494b()), fVar, str);
        cVar.getClass();
        fVar.getClass();
        str.getClass();
        cl2.h.f27950a.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [wk2.o] */
    /* JADX WARN: Type inference failed for: r7v1, types: [wk2.o] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Unit] */
    public static Object i(o oVar, v13.c cVar) throws Exception {
        p pVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f185882d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f185882d = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(oVar, cVar);
            }
        } else {
            pVar = new p(oVar, cVar);
        }
        Object obj = pVar.f185880b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f185882d;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                oVar.j();
                r<Unit> rVar = oVar.f185875h.get();
                if (rVar != null) {
                    pVar.f185879a = oVar;
                    pVar.f185882d = 1;
                    if (rVar.await(pVar) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o oVar2 = pVar.f185879a;
                o13.r.b(obj);
            }
            oVar = Unit.INSTANCE;
            return oVar;
        } catch (Exception e4) {
            if (e4 instanceof CoreTransferException) {
                throw e4;
            }
            f185870i.error("Failed doDownload", (Throwable) e4);
            throw new UrlSourceException(e4, fb1.c.n("Failed doDownload with unexpected exception: ", e4.getMessage()), null, oVar.f185873f, 4, null);
        }
    }

    @Override // wk2.c, wk2.e
    public final Object c(v13.i iVar) {
        return i(this, iVar);
    }

    @Override // wk2.c, dz2.b
    public final synchronized void close() {
        super.close();
        this.f185871d.delete();
        c0.c(this.f185874g, null);
    }

    public final CoreTransferException g(Exception exc) {
        if (exc instanceof NoNetworkException) {
            return new CoreTransferException(ok2.e.f132643k, exc);
        }
        if (!(exc instanceof ServerException)) {
            if (exc instanceof CoreTransferException) {
                return (CoreTransferException) exc;
            }
            f185870i.error("Failed doDownload", (Throwable) exc);
            return new UrlSourceException(exc, fb1.c.n("Failed doDownload with unexpected exception: ", exc.getMessage()), null, this.f185873f, 4, null);
        }
        ServerException serverException = (ServerException) exc;
        if (serverException.getFailure() == gy2.i.NO_NETWORK_CONNECTIVITY) {
            return new CoreTransferException(ok2.e.f132643k, exc);
        }
        if (!hy2.b.f86375c.get()) {
            return new CoreTransferException(ok2.e.f132642j, "SYNC Service is not available", exc);
        }
        return new UrlSourceException(exc, "Failed doDownload with " + serverException.getFailure(), serverException.getHttpCode(), this.f185873f);
    }

    @Override // wk2.c, dz2.b
    /* JADX INFO: renamed from: getSize */
    public final long getF61810d() {
        return this.f185871d.length();
    }

    public Object h(File file, t13.d<? super Unit> dVar) throws CoreTransferException {
        String str = this.f185873f;
        if (str.length() > 0) {
            try {
                new FileOutputStream(file).getChannel().transferFrom(Channels.newChannel(new URL(str).openConnection().getInputStream()), 0L, Long.MAX_VALUE);
            } catch (Exception e4) {
                throw g(e4);
            }
        }
        return Unit.INSTANCE;
    }

    public final boolean j() {
        f fVar = this.f185872e;
        long j8 = fVar.f185845d;
        AtomicReference<r<Unit>> atomicReference = this.f185875h;
        File file = this.f185871d;
        if (j8 > 0 && file.length() != 0) {
            long length = file.length();
            long j14 = fVar.f185845d;
            if (length != j14) {
                long length2 = file.length();
                StringBuilder sbK = e0.k(j14, "Delete invalid file: Metadata(", "B), File(");
                sbK.append(length2);
                sbK.append(")B");
                f185870i.warn(sbK.toString());
                file.delete();
                atomicReference.set(null);
            }
        }
        boolean z14 = false;
        if (file.length() != 0) {
            return false;
        }
        s sVarB = gl.b.b();
        do {
            if (atomicReference.compareAndSet(null, sVarB)) {
                ge1.b.T(this.f185874g, null, null, new b(sVarB, null), 3);
                break;
            }
        } while (atomicReference.get() == null);
        r<Unit> rVar = atomicReference.get();
        if (rVar != null && rVar.e()) {
            z14 = true;
        }
        return !z14;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwk2/o$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "LOGGER", "Lorg/slf4j/Logger;", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    private o(File file, f fVar, String str) {
        super(new dz2.g(file, 3));
        this.f185871d = file;
        this.f185872e = fVar;
        this.f185873f = str;
        this.f185874g = q2.l("UrlDataSource");
        this.f185875h = new AtomicReference<>(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(File file, f fVar) {
        this(file, fVar, "");
        file.getClass();
        fVar.getClass();
    }
}
