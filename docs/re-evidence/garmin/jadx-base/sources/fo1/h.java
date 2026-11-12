package fo1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lmo1/d;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationRepo$createConversation$2", f = "ConversationRepo.kt", l = {142}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.l<t13.d<? super c83.a0<mo1.d>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f72557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f72558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f72559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mo1.d f72560e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, String str, String str2, mo1.d dVar, t13.d<? super h> dVar2) {
        super(1, dVar2);
        this.f72557b = fVar;
        this.f72558c = str;
        this.f72559d = str2;
        this.f72560e = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f72557b, this.f72558c, this.f72559d, this.f72560e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<mo1.d>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72556a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<mo1.d>> i0VarQ = this.f72557b.f72523a.q(this.f72558c, this.f72559d, this.f72560e);
        this.f72556a = 1;
        Object objAwait = i0VarQ.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
