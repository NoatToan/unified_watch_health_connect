package kv1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import jv1.e0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkv1/y;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lkv1/x;", "userSettingsAPI", "<init>", "(Lkv1/x;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f106802b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f106803a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ljv1/e0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.network.UserSettingsRepo$getUserSettings$2", f = "UserSettingsRepo.kt", l = {21}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.l<t13.d<? super c83.a0<e0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f106804a;

        public b(t13.d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return y.this.new b(dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<e0>> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f106804a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            i0<c83.a0<e0>> i0VarA = y.this.f106803a.a();
            this.f106804a = 1;
            Object objAwait = i0VarA.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    public y(x xVar) {
        xVar.getClass();
        this.f106803a = xVar;
    }

    public final Object a(t13.d<? super v2<e0>> dVar) {
        return f0.J(this, new b(null), dVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkv1/y$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static y a(a aVar) {
            x xVar = (x) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x.class, new c83.h.a[0], null, null, null, 120);
            aVar.getClass();
            xVar.getClass();
            return new y(xVar);
        }

        private a() {
        }
    }
}
