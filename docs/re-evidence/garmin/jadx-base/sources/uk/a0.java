package uk;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Luk/a0;", "", "Ljava/io/InputStream;", "input", "<init>", "(Ljava/io/InputStream;)V", "a", "vivoki_release"}, k = 1, mv = {1, 4, 0})
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f171612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final it2.d f171613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f171614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Thread f171615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k.a f171616e;

    static {
        new a(null);
    }

    public a0(InputStream inputStream) {
        inputStream.getClass();
        this.f171612a = LoggerFactory.getLogger("Vivoki#MessageReader");
        this.f171613b = new it2.d(inputStream);
        this.f171614c = new AtomicBoolean();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luk/a0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "vivoki_release"}, k = 1, mv = {1, 4, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }
}
