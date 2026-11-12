package bp;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.photos.GroupPostViewImageRepo$deletePostImage$2", f = "GroupPostViewImageRepo.kt", l = {17}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f19360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f19362d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, String str, String str2, t13.d<? super b> dVar2) {
        super(1, dVar2);
        this.f19360b = dVar;
        this.f19361c = str;
        this.f19362d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f19360b, this.f19361c, this.f19362d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f19359a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<Unit>> i0VarL = this.f19360b.f19368a.l(this.f19361c, this.f19362d);
        this.f19359a = 1;
        Object objAwait = i0VarL.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
