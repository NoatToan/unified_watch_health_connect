package io1;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.follow.tag.FollowTaggingSuggestionListScreenKt$FollowTaggingSuggestionListScreen$2$1", f = "FollowTaggingSuggestionListScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zc.d<ds1.a> f94599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.tag.b f94600b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(zc.d<ds1.a> dVar, com.garmin.android.apps.connectmobile.tag.b bVar, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f94599a = dVar;
        this.f94600b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f94599a, this.f94600b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        cs1.f fVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        if (this.f94599a.d().f196391g && (fVar = this.f94600b.f45063d) != null) {
            fVar.v3(new com.garmin.android.apps.connectmobile.tag.a.C0860a(new Exception()));
        }
        return Unit.INSTANCE;
    }
}
