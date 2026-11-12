package fo1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lmo1/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationRepo$getLikesByResourceTypeV2$2", f = "ConversationRepo.kt", l = {46}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends mo1.f>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f72727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ am.c2 f72728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f72729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Integer f72730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Integer f72731f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(f fVar, am.c2 c2Var, String str, Integer num, Integer num2, t13.d<? super r> dVar) {
        super(1, dVar);
        this.f72727b = fVar;
        this.f72728c = c2Var;
        this.f72729d = str;
        this.f72730e = num;
        this.f72731f = num2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new r(this.f72727b, this.f72728c, this.f72729d, this.f72730e, this.f72731f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends mo1.f>>> dVar) {
        return ((r) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72726a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<mo1.f>>> i0VarA = this.f72727b.f72523a.A(this.f72728c.name(), this.f72729d, this.f72730e, this.f72731f);
        this.f72726a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
