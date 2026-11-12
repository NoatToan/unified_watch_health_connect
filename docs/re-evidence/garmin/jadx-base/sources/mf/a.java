package mf;

import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import p005kotlin.Metadata;
import t13.h;
import w63.l;
import w63.u;
import w63.y;

/* JADX INFO: loaded from: classes7.dex */
public interface a {

    /* JADX INFO: renamed from: mf.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmf/a$a;", "", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2244a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f118240a = l.f183387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f118241b = 0.02d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f118242c = SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f118243d = 262144000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final h f118244e = h.f161748a;
    }

    public interface b {
        d.c a();

        void abort();
    }

    public interface c extends AutoCloseable {
        d.b T3();

        y getData();

        y getMetadata();
    }

    d.b a(String str);

    d.c b(String str);

    /* JADX INFO: renamed from: getFileSystem */
    l getF118285a();
}
