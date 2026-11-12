package fo1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationRepo$unlikeConversation$2", f = "ConversationRepo.kt", l = {68}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f72469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f72470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f72471d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(f fVar, String str, String str2, t13.d<? super b0> dVar) {
        super(1, dVar);
        this.f72469b = fVar;
        this.f72470c = str;
        this.f72471d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b0(this.f72469b, this.f72470c, this.f72471d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((b0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72468a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<Unit>> i0VarM = this.f72469b.f72523a.m(this.f72470c, this.f72471d);
        this.f72468a = 1;
        Object objAwait = i0VarM.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
