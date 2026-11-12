package mi;

import java.text.SimpleDateFormat;
import java.util.Locale;
import o13.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f118679a = 0;

    /* JADX INFO: renamed from: mi.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/text/SimpleDateFormat;", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class C2248a extends w implements e23.a<SimpleDateFormat> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2248a f118680a = new C2248a();

        public C2248a() {
            super(0);
        }

        @Override // e23.a
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("HH:mm:ss.SSS", Locale.ROOT);
        }
    }

    static {
        m.b(C2248a.f118680a);
    }
}
