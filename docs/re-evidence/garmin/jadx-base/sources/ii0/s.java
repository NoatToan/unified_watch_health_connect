package ii0;

import androidx.lifecycle.v1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.c2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.presentation.FriendListScreenKt$FriendListScreen$3$1", f = "FriendListScreen.kt", l = {114}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f93735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u2.h f93736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mi0.f f93737c;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.presentation.FriendListScreenKt$FriendListScreen$3$1$2", f = "FriendListScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<String, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f93738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mi0.f f93739b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mi0.f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f93739b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f93739b, dVar);
            aVar.f93738a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(String str, t13.d<? super Unit> dVar) {
            return ((a) create(str, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.f93738a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            mi0.f fVar = this.f93739b;
            fVar.getClass();
            str.getClass();
            ge1.b.T(v1.a(fVar), null, null, new mi0.h(fVar, str, null), 3);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u2.h hVar, mi0.f fVar, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f93736b = hVar;
        this.f93737c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f93736b, this.f93737c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f93735a;
        if (i14 == 0) {
            o13.r.b(obj);
            c2 c2VarS = p3.p0.s(new an0.b(this.f93736b, 4));
            a aVar2 = new a(this.f93737c, null);
            this.f93735a = 1;
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
