package o73;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.util.Locale;
import p005kotlin.Metadata;
import p3.y3;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f130762a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f130763b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"o73/i$a", "", "library_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f130764a = new b();

        public b() {
            super(0);
        }

        @Override // e23.a
        public final Object invoke() {
            return i.f130762a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.a<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f130765a = new c();

        public c() {
            super(0, m.class, "getSystemEnvironment", "getSystemEnvironment()Lorg/jetbrains/compose/resources/ResourceEnvironment;", 1);
        }

        @Override // e23.a
        public final h invoke() {
            Locale locale = Locale.getDefault();
            Configuration configuration = Resources.getSystem().getConfiguration();
            boolean z14 = (configuration.uiMode & 48) == 32;
            int i14 = configuration.densityDpi;
            String language = locale.getLanguage();
            language.getClass();
            d dVar = new d(language);
            String country = locale.getCountry();
            country.getClass();
            f fVar = new f(country);
            a0.f130738a.getClass();
            a0 a0Var = z14 ? a0.DARK : a0.LIGHT;
            o73.c.f130744b.getClass();
            o73.c cVar = o73.c.LDPI;
            if (i14 > cVar.f130753a) {
                cVar = o73.c.MDPI;
                if (i14 > cVar.f130753a) {
                    cVar = o73.c.HDPI;
                    if (i14 > cVar.f130753a) {
                        cVar = o73.c.XHDPI;
                        if (i14 > cVar.f130753a) {
                            cVar = o73.c.XXHDPI;
                            if (i14 > cVar.f130753a) {
                                cVar = o73.c.XXXHDPI;
                            }
                        }
                    }
                }
            }
            return new h(dVar, fVar, a0Var, cVar);
        }
    }

    static {
        new y3(b.f130764a);
        f130763b = c.f130765a;
    }
}
