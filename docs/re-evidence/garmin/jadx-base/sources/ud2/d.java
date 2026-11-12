package ud2;

import android.content.Context;
import e23.p;
import o13.r;
import o53.a0;
import o53.b0;
import o53.i0;
import o53.j0;
import o53.s0;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.g;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.geolocationrestapi.GeoLocationServiceKt$locateMe$2", f = "GeoLocationService.kt", l = {105, 105}, m = "invokeSuspend")
public final class d extends i implements p<b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f170022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f170023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f170024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f170025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f170026e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.geolocationrestapi.GeoLocationServiceKt$locateMe$2$usingCnDomain$1", f = "GeoLocationService.kt", l = {104}, m = "invokeSuspend")
    public static final class a extends i implements p<b0, t13.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f170027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f170028b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f170028b = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f170028b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f170027a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            ve2.e eVar = ve2.e.f177705e;
            this.f170027a = 1;
            Object objQ = og.a.q(eVar, this.f170028b, this);
            return objQ == aVar ? aVar : objQ;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.geolocationrestapi.GeoLocationServiceKt$locateMe$2$usingComDomain$1", f = "GeoLocationService.kt", l = {103}, m = "invokeSuspend")
    public static final class b extends i implements p<b0, t13.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f170029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f170030b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f170030b = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f170030b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f170029a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            ve2.e eVar = ve2.e.f177704d;
            this.f170029a = 1;
            Object objQ = og.a.q(eVar, this.f170030b, this);
            return objQ == aVar ? aVar : objQ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f170025d = context;
        this.f170026e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f170025d, this.f170026e, dVar);
        dVar2.f170024c = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        i0 i0VarJ;
        String strN;
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170023b;
        if (i14 == 0) {
            r.b(obj);
            b0 b0Var = (b0) this.f170024c;
            context = this.f170025d;
            if (!hb2.i.a(context)) {
                return og.a.N(new Exception("no network connection"), context);
            }
            a0 a0Var = new a0("GeoLocationService.locateMe.usingComDomain");
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            g gVarPlus = a0Var.plus(bVar);
            String str2 = this.f170026e;
            j0 j0VarJ = ge1.b.j(b0Var, gVarPlus, null, new b(str2, null), 2);
            i0VarJ = ge1.b.j(b0Var, new a0("GeoLocationService.locateMe.usingCnDomain").plus(bVar), null, new a(str2, null), 2);
            this.f170024c = i0VarJ;
            this.f170022a = context;
            this.f170023b = 1;
            obj = j0VarJ.C(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            context = (Context) this.f170022a;
            i0VarJ = (i0) this.f170024c;
            r.b(obj);
        } else {
            if (i14 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            strN = (String) this.f170022a;
            context = (Context) this.f170024c;
            r.b(obj);
        }
        str = (String) obj;
        if (strN == null) {
            if (str == null) {
                strN = og.a.N(new Exception("neither GET call produced a country"), context);
            } else {
                strN = str;
            }
        }
        LoggerFactory.getLogger("GeoLocationService").debug("locateMe: ".concat(strN));
        ud2.b.f170019a.getClass();
        ud2.b.c(context, strN);
        return strN;
        String str3 = (String) obj;
        this.f170024c = context;
        this.f170022a = str3;
        this.f170023b = 2;
        Object objAwait = i0VarJ.await(this);
        if (objAwait != aVar) {
            strN = str3;
            obj = objAwait;
            str = (String) obj;
            if (strN == null) {
                if (str == null) {
                    strN = og.a.N(new Exception("neither GET call produced a country"), context);
                } else {
                    strN = str;
                }
            }
            LoggerFactory.getLogger("GeoLocationService").debug("locateMe: ".concat(strN));
            ud2.b.f170019a.getClass();
            ud2.b.c(context, strN);
            return strN;
        }
        return aVar;
    }
}
