package m41;

import b63.o;
import c83.h;
import com.garmin.android.apps.connectmobile.f0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lm41/b;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lm41/a;", "Lv31/a;", "api", "overnightHRVNullOrEmptyApiService", "<init>", "(Lv31/a;Lv31/a;)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements f0, m41.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f116598c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v31.a f116599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v31.a f116600b;

    public b(v31.a aVar, v31.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        this.f116599a = aVar;
        this.f116600b = aVar2;
    }

    @Override // m41.a
    public final Object a(o oVar, o oVar2, v13.c cVar) {
        return f0.J(this, new c(this, oVar, oVar2, null), cVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm41/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a(a aVar) {
            ez0.b bVar = ez0.b.f67468a;
            ez0.c cVar = ez0.c.GC;
            v31.a aVar2 = (v31.a) ez0.b.a(bVar, cVar, v31.a.class, new h.a[0], null, null, null, 120);
            v31.a aVar3 = (v31.a) ez0.b.a(bVar, cVar, v31.a.class, new h.a[]{new fz0.b()}, null, null, null, 120);
            aVar.getClass();
            aVar2.getClass();
            aVar3.getClass();
            return new b(aVar2, aVar3);
        }

        private a() {
        }
    }
}
