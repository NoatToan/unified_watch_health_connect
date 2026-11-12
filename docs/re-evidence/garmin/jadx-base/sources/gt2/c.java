package gt2;

import a23.g;
import android.content.Context;
import ch.qos.logback.classic.LoggerContext;
import java.io.File;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgt2/c;", "", "<init>", "()V", "glogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f79010a = 0;

    static {
        new c();
    }

    private c() {
    }

    public static final void a(String str) {
        str.getClass();
        b.a.e(b.f79005a, new a(str, ""), 6);
    }

    public static final Logger b(String str) {
        str.getClass();
        return b.f79005a.h(str);
    }

    public static final void c(Context context, d dVar) {
        context.getClass();
        synchronized (b.f79005a) {
            try {
                String absolutePath = context.getFilesDir().getAbsolutePath();
                absolutePath.getClass();
                b.f79006b = absolutePath;
                b.f79007c = dVar;
                if (dVar.f79019h) {
                    File file = new File(context.getFilesDir(), "logs");
                    if (file.exists() && file.isDirectory()) {
                        g.d(file);
                    }
                }
                synchronized (s0.f105811a.b(LoggerFactory.class)) {
                    d dVar2 = b.f79007c;
                    if (dVar2 == null) {
                        s.m("config");
                        throw null;
                    }
                    int i14 = dVar2.f79016e;
                    while (!(LoggerFactory.getILoggerFactory() instanceof LoggerContext)) {
                        int i15 = i14 - 1;
                        if (i14 <= 0) {
                            break;
                        }
                        Thread.sleep(100L);
                        i14 = i15;
                    }
                    try {
                        ILoggerFactory iLoggerFactory = LoggerFactory.getILoggerFactory();
                        if (iLoggerFactory == null) {
                            throw new NullPointerException("null cannot be cast to non-null type ch.qos.logback.classic.LoggerContext");
                        }
                        LoggerContext loggerContext = (LoggerContext) iLoggerFactory;
                        loggerContext.reset();
                        b.f79005a.b(loggerContext);
                        Unit unit = Unit.INSTANCE;
                    } catch (ClassCastException | IllegalStateException unused) {
                    }
                }
                b.f79009e.countDown();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
