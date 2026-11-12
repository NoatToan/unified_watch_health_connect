package q92;

import i3.e5;
import java.util.Locale;
import okhttp3.OkHttpClient;
import p005kotlin.Metadata;
import z10.g0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lq92/f;", "", "Lr92/a;", "consentGCService", "Lr92/b;", "consentITService", "consentITAccountProcessService", "Lq92/z;", "dispatcherProvider", "<init>", "(Lr92/a;Lr92/b;Lr92/b;Lq92/z;)V", "a", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f143627e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r92.a f143628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r92.b f143629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r92.b f143630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f143631d;

    public f(r92.a aVar, r92.b bVar, r92.b bVar2, z zVar) {
        aVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        zVar.getClass();
        this.f143628a = aVar;
        this.f143629b = bVar;
        this.f143630c = bVar2;
        this.f143631d = zVar;
    }

    public static s92.d a(s92.g gVar, String str, boolean z14, s92.l lVar) {
        String strG = e5.g(Locale.getDefault().getLanguage(), "-", Locale.getDefault().getCountry());
        if (!d53.w.J(gVar.getLocale())) {
            strG = gVar.getLocale();
        }
        return new s92.d(str, strG, gVar.getVersion(), z14, lVar != null ? lVar.f158101a : null);
    }

    public static s92.h b(s92.g gVar, String str, s92.l lVar) {
        String strG = e5.g(Locale.getDefault().getLanguage(), "-", Locale.getDefault().getCountry());
        if (!d53.w.J(gVar.getLocale())) {
            strG = gVar.getLocale();
        }
        return new s92.h(str, strG, gVar.getVersion(), lVar != null ? lVar.f158101a : null);
    }

    public final Object c(x xVar, s92.l lVar, v13.c cVar) {
        return ge1.b.e0(this.f143631d.f143828c, new j(xVar, this, lVar, null), cVar);
    }

    public final Object d(String str, Locale locale, v13.c cVar) {
        return ge1.b.e0(this.f143631d.f143828c, new l(str, locale, this, null), cVar);
    }

    public final Object e(x xVar, y yVar, s92.g gVar, s92.l lVar, v13.c cVar) {
        return ge1.b.e0(this.f143631d.f143828c, new r(xVar, yVar, this, gVar, lVar, null), cVar);
    }

    public final Object f(boolean z14, boolean z15, v13.c cVar) {
        return ge1.b.e0(this.f143631d.f143828c, new s(z15, this, z14, null), cVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lq92/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "DEFAULT_TEXT_LOCALE", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static f a(a aVar) {
            r92.j.a aVar2 = r92.j.f151451a;
            aVar2.getClass();
            p92.o oVar = p92.o.f136619a;
            oVar.getClass();
            String strN = fb1.c.n("https://", ((g0) p92.o.l()).f().f136569a);
            r92.f fVar = r92.f.f151442a;
            fVar.getClass();
            r92.a aVar3 = (r92.a) r92.j.a.a(r92.a.class, strN, (OkHttpClient) r92.f.f151444c.getValue());
            aVar2.getClass();
            oVar.getClass();
            String str = ((g0) p92.o.l()).f().f136570b;
            fVar.getClass();
            o13.t tVar = r92.f.f151443b;
            r92.b bVar = (r92.b) r92.j.a.a(r92.b.class, str, (OkHttpClient) tVar.getValue());
            aVar2.getClass();
            oVar.getClass();
            String str2 = ((g0) p92.o.l()).f().f136571c;
            fVar.getClass();
            r92.b bVar2 = (r92.b) r92.j.a.a(r92.b.class, str2, (OkHttpClient) tVar.getValue());
            z zVar = new z(null, null, null, 7, null);
            aVar.getClass();
            aVar3.getClass();
            bVar.getClass();
            bVar2.getClass();
            return new f(aVar3, bVar, bVar2, zVar);
        }

        private a() {
        }
    }
}
