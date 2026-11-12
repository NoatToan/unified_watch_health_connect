package b1;

import android.net.Uri;
import java.io.File;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import z0.o;
import z0.p;
import z0.r;
import z0.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lb1/g;", "", "Lz0/s;", "outputOptions", "<init>", "(Lz0/s;)V", "a", "camera-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f14197a;

    static {
        new a(null);
    }

    public g(s sVar) {
        sVar.getClass();
        this.f14197a = sVar;
    }

    public final long a() {
        s sVar = this.f14197a;
        try {
            if (sVar instanceof p) {
                File parentFile = ((p) sVar).f200703b.b().getParentFile();
                parentFile.getClass();
                return h1.d.b(parentFile);
            }
            if (sVar instanceof r) {
                Uri uriB = ((r) sVar).f200706b.b();
                uriB.getClass();
                return h1.d.c(uriB);
            }
            if (sVar instanceof o) {
                return Long.MAX_VALUE;
            }
            throw new AssertionError("Unknown OutputOptions: " + sVar);
        } catch (RuntimeException unused) {
            return Long.MAX_VALUE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb1/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "camera-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
