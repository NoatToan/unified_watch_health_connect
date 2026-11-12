package zf0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lzf0/d;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lzf0/h0;", "Lzf0/b;", "eventAPI", "<init>", "(Lzf0/b;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements com.garmin.android.apps.connectmobile.f0, h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f204343b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zf0.b f204344a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.events.EventRepo$updateShareableEventCustomizationAsync$2", f = "EventRepo.kt", l = {89}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f204345a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f204347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ fg0.j f204348d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, fg0.j jVar, t13.d<? super b> dVar) {
            super(1, dVar);
            this.f204347c = str;
            this.f204348d = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return d.this.new b(this.f204347c, this.f204348d, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f204345a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            o53.i0<c83.a0<Unit>> i0VarJ = d.this.f204344a.j(this.f204347c, this.f204348d);
            this.f204345a = 1;
            Object objAwait = i0VarJ.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    public d(zf0.b bVar) {
        bVar.getClass();
        this.f204344a = bVar;
    }

    @Override // zf0.h0
    public final Object b(int i14, String str, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new u(this, 365, i14, str, null), iVar);
    }

    public final Object c(long j8, v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new m(this, j8, "1995-01-01", null), cVar);
    }

    public final Object d(long j8, v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new p(this, j8, null), cVar);
    }

    public final Object f(String str, v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new s(this, str, null), cVar);
    }

    public final Object g(String str, String str2, String str3, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new w(this, str, str2, "", str3, null), iVar);
    }

    public final Object h(long j8, fg0.k kVar, v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new d0(this, j8, kVar, null), cVar);
    }

    public final Object i(String str, fg0.j jVar, t13.d<? super v2<Unit>> dVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new b(str, jVar, null), dVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzf0/d$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static d a(a aVar) {
            zf0.b bVar = (zf0.b) ez0.b.a(ez0.b.f67468a, ez0.c.GC, zf0.b.class, new c83.h.a[0], null, null, null, 120);
            aVar.getClass();
            bVar.getClass();
            return new d(bVar);
        }

        private a() {
        }
    }
}
