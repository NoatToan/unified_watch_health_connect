package av;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.mapbox.common.HttpHeaders;
import java.util.Arrays;
import o53.i0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.t0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lav/e;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lav/c0;", "badgeTranslationsAPI", "Lzy0/b;", "cachedDataSource", "Lru/e;", "badgesPreferences", "<init>", "(Lav/c0;Lzy0/b;Lru/e;)V", "gcm-domain-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f13079d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f13080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zy0.b f13081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ru.e f13082c;

    public e(c0 c0Var, zy0.b bVar, ru.e eVar) {
        c0Var.getClass();
        bVar.getClass();
        eVar.getClass();
        this.f13080a = c0Var;
        this.f13081b = bVar;
        this.f13082c = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, v13.c cVar) {
        a aVar;
        String strConcat;
        String str2;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f13068d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f13068d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f13066b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar2.f13068d;
        if (i15 == 0) {
            o13.r.b(obj);
            if (g22.n.d(str)) {
                str.getClass();
                strConcat = !d53.w.J(str) ? "_".concat(str) : str;
            } else {
                strConcat = "";
            }
            aVar2.f13065a = strConcat;
            aVar2.f13068d = 1;
            Object objB = b(str, aVar2);
            if (objB != obj2) {
                String str3 = strConcat;
                obj = objB;
                str2 = str3;
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = aVar2.f13065a;
        o13.r.b(obj);
        String str4 = (String) obj;
        boolean zD = g22.n.d(str4);
        ru.e eVar = this.f13082c;
        if (zD) {
            eVar.c(str4);
        }
        String strA = zy0.q.a(t0.b(new o13.p(HttpHeaders.LAST_MODIFIED, eVar.d())), String.format(zy0.a.BADGES_TRANSLATIONS.f207440a, Arrays.copyOf(new Object[]{str2}, 1)), new Object[0]);
        b bVar = new b();
        c cVar2 = new c(this, str2, null);
        Long l14 = new Long(2592000000L);
        aVar2.f13065a = null;
        aVar2.f13068d = 2;
        Object objB2 = zy0.b.b(this.f13081b, cVar2, bVar, false, strA, l14, aVar2, 32);
        return objB2 == obj2 ? obj2 : objB2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, v13.c cVar) {
        d dVar;
        Object th3;
        Logger logger;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f13078d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f13078d = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj = dVar.f13076b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f13078d;
        if (i15 == 0) {
            o13.r.b(obj);
            Logger loggerB = gt2.c.b(a2.GENERAL.f28756a);
            if (g22.n.d(str)) {
                str.getClass();
                if (!d53.w.J(str)) {
                    str = "_".concat(str);
                }
            } else {
                str = "";
            }
            try {
                i0<c83.a0<Unit>> i0VarB = this.f13080a.b(str);
                dVar.f13075a = loggerB;
                dVar.f13078d = 1;
                Object objAwait = i0VarB.await(dVar);
                if (objAwait == aVar) {
                    return aVar;
                }
                obj = objAwait;
            } catch (Throwable th4) {
                th3 = th4;
                logger = loggerB;
                logger.error("BaseRepository -badgeTranslationsHead  -> error message=[" + th3 + "].");
                return "";
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            logger = dVar.f13075a;
            try {
                o13.r.b(obj);
            } catch (Throwable th5) {
                th3 = th5;
                logger.error("BaseRepository -badgeTranslationsHead  -> error message=[" + th3 + "].");
                return "";
            }
        }
        String str2 = ((c83.a0) obj).f25745a.headers().get(HttpHeaders.LAST_MODIFIED);
        return str2 == null ? "" : str2;
    }
}
