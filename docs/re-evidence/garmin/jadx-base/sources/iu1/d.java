package iu1;

import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import java.util.List;
import java.util.Map;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0015By\b\u0004\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Liu1/d;", "T", "Liu1/a;", "Liu1/e;", "objectParser", "Ld80/h;", "cacheHandler", "", "cacheFetchEnabled", "Ljava/lang/Class;", "clazz", "Liu1/k;", "objectResultListener", "Liu1/i;", "listResultListener", "Liu1/j;", "noParsingListener", "Liu1/l;", "resultHeaderParsingListener", "<init>", "(Liu1/e;Ld80/h;ZLjava/lang/Class;Liu1/k;Liu1/i;Liu1/j;Liu1/l;)V", "a", "gcm-legacy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d<T> implements iu1.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f95045k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e<T> f95046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d80.h f95047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f95048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<T> f95049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k<T> f95050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i<T> f95051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f95052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f95053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public iu1.b f95054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ju1.a f95055j;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"iu1/d$b", "Lju1/b;", "gcm-legacy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements ju1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d<T> f95056a;

        public b(d<T> dVar) {
            this.f95056a = dVar;
        }

        @Override // ju1.b
        public final void a(com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "ConnectTask", "ConnectTask onError: " + cVar);
            int i14 = d.f95045k;
            this.f95056a.b(cVar);
        }

        @Override // ju1.b
        public final void b(String str, int i14, Map map) {
            d80.h hVar;
            d<T> dVar = this.f95056a;
            if (str != null && (hVar = dVar.f95047b) != null) {
                hVar.b(str);
            }
            Integer numValueOf = Integer.valueOf(i14);
            int i15 = d.f95045k;
            dVar.e(numValueOf, str, map);
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ d(e eVar, d80.h hVar, boolean z14, Class cls, k kVar, i iVar, j jVar, l lVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? new g() : eVar, (i14 & 2) != 0 ? null : hVar, (i14 & 4) != 0 ? false : z14, cls, (i14 & 16) != 0 ? null : kVar, (i14 & 32) != 0 ? null : iVar, (i14 & 64) != 0 ? null : jVar, (i14 & 128) != 0 ? null : lVar);
    }

    @Override // iu1.a
    public final void a(iu1.b bVar) {
        this.f95054i = bVar;
    }

    public final void b(com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        k<T> kVar = this.f95050e;
        if (kVar != null) {
            kVar.a(cVar);
        }
        if (this.f95051f != null) {
            cVar.getClass();
            m.a(cVar);
        }
        if (this.f95052g != null) {
            j.a(cVar);
        }
        iu1.b bVar = this.f95054i;
        if (bVar != null) {
            bVar.d(cVar);
        }
    }

    public final void c() {
        iu1.b bVar = this.f95054i;
        if (bVar != null) {
            bVar.d(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // iu1.a
    public final void cancel() {
        ju1.a aVar = this.f95055j;
        if (aVar != null) {
            aVar.a();
        }
    }

    public abstract ju1.c d(b bVar);

    public final void e(Integer num, String str, Map map) {
        Class<T> cls = this.f95049d;
        e<T> eVar = this.f95046a;
        k<T> kVar = this.f95050e;
        if (kVar != null) {
            if (str == null) {
                b(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                return;
            }
            Object objB = eVar.b(cls, str);
            if (objB == null) {
                b(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                return;
            } else {
                kVar.onSuccess((T) objB);
                c();
                return;
            }
        }
        i<T> iVar = this.f95051f;
        if (iVar != null) {
            if (str == null) {
                b(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                return;
            }
            List<? extends T> listA = eVar.a(cls, str);
            if (listA == null) {
                b(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                return;
            } else {
                iVar.b(listA);
                c();
                return;
            }
        }
        j jVar = this.f95052g;
        if (jVar != null) {
            jVar.c(str);
            c();
            return;
        }
        l lVar = this.f95053h;
        if (lVar != null) {
            lVar.a(str, map);
            c();
        }
    }

    @Override // iu1.a
    public final void execute() {
        com.garmin.android.library.backgroundtaskmanagement.b.c cVar;
        d80.h hVar;
        String strA;
        if (this.f95048c && (hVar = this.f95047b) != null && (strA = hVar.a()) != null) {
            e(null, strA, null);
            return;
        }
        ju1.c cVarD = d(new b(this));
        this.f95055j = cVarD;
        ju1.b bVar = cVarD.f100938b;
        c83.d<String> dVar = cVarD.f100937a;
        try {
            a0<String> a0VarExecute = dVar.execute();
            Response response = a0VarExecute.f25745a;
            int iCode = response.code();
            if (response.isSuccessful()) {
                String str = dVar.request() + " SUCCESS responseCode[" + iCode + "]";
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "RestApiRetrofitCaller", str);
                bVar.b(a0VarExecute.f25746b, iCode, response.headers().toMultimap());
                return;
            }
            String str2 = dVar.request() + " FAILURE responseCode[" + iCode + "}]";
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var2, "RestApiRetrofitCaller", str2);
            if (iCode != 401) {
                cVar = iCode != 403 ? com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE : com.garmin.android.library.backgroundtaskmanagement.b.c.USER_NOT_AUTHORIZED;
            } else {
                cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.USER_NOT_AUTHENTICATED;
            }
            bVar.a(cVar);
        } catch (Exception e4) {
            String str3 = dVar.request() + " FAILURE exception[" + e4 + "}]";
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var3, "RestApiRetrofitCaller", str3);
            bVar.a(e4 instanceof NoNetworkException ? com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK : com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Liu1/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-legacy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(e<T> eVar, d80.h hVar, boolean z14, Class<T> cls, k<? super T> kVar, i<? super T> iVar, j jVar, l lVar) {
        eVar.getClass();
        cls.getClass();
        this.f95046a = eVar;
        this.f95047b = hVar;
        this.f95048c = z14;
        this.f95049d = cls;
        this.f95050e = kVar;
        this.f95051f = iVar;
        this.f95052g = jVar;
        this.f95053h = lVar;
    }
}
