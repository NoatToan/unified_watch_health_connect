package fo1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lmo1/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationRepo$getLikesByResourceType$2", f = "ConversationRepo.kt", l = {31}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends mo1.f>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f72716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ am.c2 f72717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f72718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Integer f72719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Integer f72720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f72721g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(f fVar, am.c2 c2Var, String str, Integer num, Integer num2, boolean z14, t13.d<? super q> dVar) {
        super(1, dVar);
        this.f72716b = fVar;
        this.f72717c = c2Var;
        this.f72718d = str;
        this.f72719e = num;
        this.f72720f = num2;
        this.f72721g = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new q(this.f72716b, this.f72717c, this.f72718d, this.f72719e, this.f72720f, this.f72721g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends mo1.f>>> dVar) {
        return ((q) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72715a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<mo1.f>>> i0VarF = this.f72716b.f72523a.f(this.f72717c.name(), this.f72718d, this.f72719e, this.f72720f, this.f72721g);
        this.f72715a = 1;
        Object objAwait = i0VarF.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
