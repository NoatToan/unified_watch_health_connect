package hg0;

import bz0.o;
import c83.b0;
import com.garmin.android.apps.connectmobile.f0;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import d83.g;
import h83.k;
import java.util.ArrayList;
import okhttp3.OkHttpClient;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import zy0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lhg0/b;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lhg0/a;", "activityAPI", "<init>", "(Lhg0/a;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f83652b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hg0.a f83653a;

    public b(hg0.a aVar) {
        aVar.getClass();
        this.f83653a = aVar;
    }

    public static Object a(b bVar, String str, String str2, String str3, String str4, int i14, v13.c cVar) {
        bVar.getClass();
        return f0.J(bVar, new d(bVar, str, str2, str3, str4, i14, "desc", null, null), cVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhg0/b$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a(a aVar) {
            String strK = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).k(ez0.c.GC);
            o.f22274a.getClass();
            OkHttpClient okHttpClientB = o.b();
            Gson gsonCreate = new GsonBuilder().serializeNulls().create();
            gsonCreate.getClass();
            aVar.getClass();
            b0.b bVar = new b0.b();
            mz2.c.f122004a.getClass();
            mz2.c cVarA = mz2.c.b.a();
            ArrayList arrayList = bVar.f25769d;
            arrayList.add(cVarA);
            arrayList.add(g.b());
            bVar.a(ez0.d.f67493a);
            bVar.a(k.c());
            bVar.a(e83.a.d(gsonCreate));
            bVar.d(okHttpClientB);
            bVar.b(strK);
            hg0.a aVar2 = (hg0.a) bVar.c().b(hg0.a.class);
            aVar.getClass();
            aVar2.getClass();
            return new b(aVar2);
        }

        private a() {
        }
    }
}
