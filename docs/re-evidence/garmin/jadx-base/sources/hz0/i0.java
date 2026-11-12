package hz0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Loz0/h;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.YoutubeRepo$fetchYoutubeVideoMetadata$2", f = "YoutubeRepo.kt", l = {44}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.l<t13.d<? super c83.a0<oz0.h>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f86445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f86446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f86447d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, String str, String str2, t13.d<? super i0> dVar) {
        super(1, dVar);
        this.f86445b = j0Var;
        this.f86446c = str;
        this.f86447d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i0(this.f86445b, this.f86446c, this.f86447d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<oz0.h>> dVar) {
        return ((i0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86444a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        Object value = this.f86445b.f86454b.getValue();
        value.getClass();
        o53.i0<c83.a0<oz0.h>> i0VarA = ((pz0.e) value).a(this.f86446c, this.f86447d, "snippet");
        this.f86444a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
