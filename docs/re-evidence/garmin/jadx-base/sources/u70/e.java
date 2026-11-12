package u70;

import com.garmin.android.apps.connectmobile.g3;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;
import r53.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.focus.SelectHomeLayoutScreenKt$SelectHomeLayoutScreen$4$1", f = "SelectHomeLayoutScreen.kt", l = {97}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f169409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f169410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f169411c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/g3;", "", RemoteConfigConstants.ResponseFieldKey.STATE, "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/g3;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.focus.SelectHomeLayoutScreenKt$SelectHomeLayoutScreen$4$1$1", f = "SelectHomeLayoutScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<g3<? extends Unit>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f169412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f169413b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f169413b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f169413b, dVar);
            aVar.f169412a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(g3<? extends Unit> g3Var, t13.d<? super Unit> dVar) {
            return ((a) create(g3Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            g3 g3Var = (g3) this.f169412a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (g3Var.f35300a != fw.p.LOADING) {
                this.f169413b.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, e23.a<Unit> aVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f169410b = iVar;
        this.f169411c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f169410b, this.f169411c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169409a;
        if (i14 == 0) {
            r.b(obj);
            e2 e2Var = this.f169410b.f169435g;
            a aVar2 = new a(this.f169411c, null);
            this.f169409a = 1;
            if (s.k(e2Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
