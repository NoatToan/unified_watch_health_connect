package bp;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lda1/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.photos.GroupPostViewImageRepo$flagPostImage$2", f = "GroupPostViewImageRepo.kt", l = {23}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.l<t13.d<? super a0<da1.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f19364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f19366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ da1.a f19367e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, String str2, da1.a aVar, t13.d<? super c> dVar2) {
        super(1, dVar2);
        this.f19364b = dVar;
        this.f19365c = str;
        this.f19366d = str2;
        this.f19367e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f19364b, this.f19365c, this.f19366d, this.f19367e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<da1.b>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f19363a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<da1.b>> i0VarA = this.f19364b.f19368a.a(this.f19365c, this.f19366d, this.f19367e);
        this.f19363a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
