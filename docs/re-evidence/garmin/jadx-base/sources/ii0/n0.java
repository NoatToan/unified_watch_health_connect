package ii0;

import androidx.lifecycle.v1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.c2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.presentation.OthersFriendListScreenKt$OthersFriendListScreen$3$1", f = "OthersFriendListScreen.kt", l = {77}, m = "invokeSuspend", v = 2)
public final class n0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f93695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u2.h f93696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mi0.j f93697c;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.presentation.OthersFriendListScreenKt$OthersFriendListScreen$3$1$2", f = "OthersFriendListScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<String, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f93698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mi0.j f93699b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mi0.j jVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f93699b = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f93699b, dVar);
            aVar.f93698a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(String str, t13.d<? super Unit> dVar) {
            return ((a) create(str, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.f93698a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            mi0.j jVar = this.f93699b;
            jVar.getClass();
            str.getClass();
            ge1.b.T(v1.a(jVar), null, null, new mi0.l(jVar, str, null), 3);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(u2.h hVar, mi0.j jVar, t13.d<? super n0> dVar) {
        super(2, dVar);
        this.f93696b = hVar;
        this.f93697c = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n0(this.f93696b, this.f93697c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f93695a;
        if (i14 == 0) {
            o13.r.b(obj);
            c2 c2VarS = p3.p0.s(new an0.b(this.f93696b, 6));
            a aVar2 = new a(this.f93697c, null);
            this.f93695a = 1;
            if (r53.s.k(c2VarS, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
