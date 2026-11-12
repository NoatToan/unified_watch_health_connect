package cl;

import c83.b0;
import com.google.gson.Gson;
import d83.g;
import h83.k;
import java.util.ArrayList;
import okhttp3.OkHttpClient;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcl/b;", "Lmd2/a;", "Lcl/a;", "analyticsApi", "<init>", "(Lcl/a;)V", "a", "analytics-gcs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements md2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27921b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cl.a f27922a;

    public b(cl.a aVar) {
        aVar.getClass();
        this.f27922a = aVar;
    }

    @Override // md2.a
    public final Object a(String str, md2.c cVar, md2.b bVar) {
        return md2.a.C2243a.b(this, str, cVar, bVar);
    }

    @Override // md2.a
    public final String getTag() {
        return "GcsAnalyticsRepo";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcl/b$a;", "", "<init>", "()V", "analytics-gcs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a(bl.a aVar) throws Exception {
            aVar.getClass();
            el.a.f64524a.getClass();
            String strN = fb1.c.n("https://", aVar.a().f2774a);
            OkHttpClient okHttpClientC = aVar.c();
            if (okHttpClientC == null) {
                q2.u("OkHttpClient has not been initialized! Cannot perform call.");
                return null;
            }
            b0.b bVar = new b0.b();
            mz2.c.f122004a.getClass();
            mz2.c cVarA = mz2.c.b.a();
            ArrayList arrayList = bVar.f25769d;
            arrayList.add(cVarA);
            arrayList.add(g.b());
            bVar.a(ld2.a.f112029a);
            bVar.a(k.c());
            bVar.a(e83.a.d(new Gson()));
            bVar.f25766a = okHttpClientC;
            bVar.b(strN);
            return new b((cl.a) bVar.c().b(cl.a.class));
        }

        private a() {
        }
    }
}
