package he2;

import android.content.Context;
import e23.l;
import ed2.c;
import o13.r;
import okhttp3.OkHttpClient;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhe2/a;", "", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f83529a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static OkHttpClient f83530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Logger f83531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f83532d;

    /* JADX INFO: renamed from: he2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @e(c = "com.garmin.android.library.livetrack.networking.HttpClientManager$createGcsHttpClient$2", f = "HttpClientManager.kt", l = {63}, m = "invokeSuspend", v = 2)
    public static final class C1647a extends i implements l<d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f83533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.livetrack.a f83534b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1647a(com.garmin.android.library.livetrack.a aVar, d<? super C1647a> dVar) {
            super(1, dVar);
            this.f83534b = aVar;
        }

        @Override // v13.a
        public final d<Unit> create(d<?> dVar) {
            return new C1647a(this.f83534b, dVar);
        }

        @Override // e23.l
        public final Object invoke(d<? super String> dVar) {
            return ((C1647a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f83533a;
            if (i14 == 0) {
                r.b(obj);
                this.f83533a = 1;
                obj = this.f83534b.b(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return ((wd2.i) obj).f184496b;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @e(c = "com.garmin.android.library.livetrack.networking.HttpClientManager$createGcsHttpClient$3", f = "HttpClientManager.kt", l = {64}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements l<d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f83535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.livetrack.a f83536b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.garmin.android.library.livetrack.a aVar, d<? super b> dVar) {
            super(1, dVar);
            this.f83536b = aVar;
        }

        @Override // v13.a
        public final d<Unit> create(d<?> dVar) {
            return new b(this.f83536b, dVar);
        }

        @Override // e23.l
        public final Object invoke(d<? super String> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f83535a;
            if (i14 == 0) {
                r.b(obj);
                this.f83535a = 1;
                obj = this.f83536b.c(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return ((wd2.i) obj).f184496b;
        }
    }

    private a() {
    }

    public static OkHttpClient a(com.garmin.android.library.livetrack.a aVar, Context context, wd2.b bVar) {
        c cVar = new c(context, 0, null, null, 0L, 0L, 0L, false, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0, 33554430, null);
        cVar.f63884a = bVar.f184387b;
        cVar.f63896m = new ha0.b(15);
        c.b(cVar, new C1647a(aVar, null), null, new b(aVar, null), 2);
        cVar.f63894k = aVar.a();
        cVar.f63895l = true;
        OkHttpClient okHttpClientA = cVar.a();
        if (f83532d) {
            jd2.b.b(okHttpClientA, jd2.a.HTTP_EVENTS);
            return okHttpClientA;
        }
        jd2.b.a(okHttpClientA, jd2.a.HTTP_EVENTS);
        return okHttpClientA;
    }
}
