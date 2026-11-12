package fo1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lmo1/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationRepo$getCommentLikesV2$2", f = "ConversationRepo.kt", l = {96}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.l<t13.d<? super c83.a0<mo1.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f72614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f72615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f72616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Integer f72617e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f fVar, String str, Integer num, Integer num2, t13.d<? super l> dVar) {
        super(1, dVar);
        this.f72614b = fVar;
        this.f72615c = str;
        this.f72616d = num;
        this.f72617e = num2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l(this.f72614b, this.f72615c, this.f72616d, this.f72617e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<mo1.c>> dVar) {
        return ((l) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72613a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<mo1.c>> i0VarO = this.f72614b.f72523a.o(this.f72615c, this.f72616d, this.f72617e);
        this.f72613a = 1;
        Object objAwait = i0VarO.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
