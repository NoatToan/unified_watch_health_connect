package defpackage;

import android.util.Pair;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.systrace.Systrace;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class qyo extends mb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31989a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, Pair<Integer, String>> f31990b = new HashMap();
    public Map<String, Pair<Integer, String>> c = new HashMap();

    @Override // defpackage.mb2, defpackage.hbi
    public void a(String str, String str2) {
        if (Systrace.h(0L)) {
            Pair<Integer, String> pairCreate = Pair.create(Integer.valueOf(this.f31989a), "FRESCO_PRODUCER_" + str2.replace(AbstractJsonLexerKt.COLON, '_'));
            Systrace.a(0L, (String) pairCreate.second, this.f31989a);
            this.f31990b.put(str, pairCreate);
            this.f31989a = this.f31989a + 1;
        }
    }

    @Override // defpackage.mb2, defpackage.ook
    public void b(ImageRequest imageRequest, String str, boolean z) {
        if (Systrace.h(0L) && this.c.containsKey(str)) {
            Pair<Integer, String> pair = this.c.get(str);
            Systrace.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.c.remove(str);
        }
    }

    @Override // defpackage.mb2, defpackage.hbi
    public void c(String str, String str2, Throwable th, Map<String, String> map) {
        if (Systrace.h(0L) && this.f31990b.containsKey(str)) {
            Pair<Integer, String> pair = this.f31990b.get(str);
            Systrace.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f31990b.remove(str);
        }
    }

    @Override // defpackage.mb2, defpackage.hbi
    public void d(String str, String str2, String str3) {
        if (Systrace.h(0L)) {
            Systrace.l(0L, "FRESCO_PRODUCER_EVENT_" + str.replace(AbstractJsonLexerKt.COLON, '_') + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + str2.replace(AbstractJsonLexerKt.COLON, '_') + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + str3.replace(AbstractJsonLexerKt.COLON, '_'), Systrace.EventScope.THREAD);
        }
    }

    @Override // defpackage.mb2, defpackage.ook
    public void e(ImageRequest imageRequest, Object obj, String str, boolean z) {
        if (Systrace.h(0L)) {
            Pair<Integer, String> pairCreate = Pair.create(Integer.valueOf(this.f31989a), "FRESCO_REQUEST_" + imageRequest.q().toString().replace(AbstractJsonLexerKt.COLON, '_'));
            Systrace.a(0L, (String) pairCreate.second, this.f31989a);
            this.c.put(str, pairCreate);
            this.f31989a = this.f31989a + 1;
        }
    }

    @Override // defpackage.mb2, defpackage.hbi
    public boolean f(String str) {
        return false;
    }

    @Override // defpackage.mb2, defpackage.hbi
    public void g(String str, String str2, Map<String, String> map) {
        if (Systrace.h(0L) && this.f31990b.containsKey(str)) {
            Pair<Integer, String> pair = this.f31990b.get(str);
            Systrace.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f31990b.remove(str);
        }
    }

    @Override // defpackage.mb2, defpackage.hbi
    public void h(String str, String str2, Map<String, String> map) {
        if (Systrace.h(0L) && this.f31990b.containsKey(str)) {
            Pair<Integer, String> pair = this.f31990b.get(str);
            Systrace.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f31990b.remove(str);
        }
    }

    @Override // defpackage.mb2, defpackage.ook
    public void j(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        if (Systrace.h(0L) && this.c.containsKey(str)) {
            Pair<Integer, String> pair = this.c.get(str);
            Systrace.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.c.remove(str);
        }
    }

    @Override // defpackage.mb2, defpackage.ook
    public void k(String str) {
        if (Systrace.h(0L) && this.c.containsKey(str)) {
            Pair<Integer, String> pair = this.c.get(str);
            Systrace.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.c.remove(str);
        }
    }
}
