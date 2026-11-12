package hz0;

import am.x0;
import am.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Loz0/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedRepo$checkNewsfeedUnreadStatus$2", f = "NewsFeedRepo.kt", l = {56}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.l<t13.d<? super c83.a0<oz0.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f86462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f86463c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, String str, t13.d<? super n> dVar) {
        super(1, dVar);
        this.f86462b = mVar;
        this.f86463c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new n(this.f86462b, this.f86463c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<oz0.b>> dVar) {
        return ((n) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86461a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        mz0.a.f121640a.getClass();
        Set<x0> set = mz0.a.a().f128380b;
        ArrayList arrayList = new ArrayList(p13.y.r(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(new Integer(z0.n((x0) it.next())));
        }
        o53.i0<c83.a0<oz0.b>> i0VarA = this.f86462b.f86459a.a(arrayList, this.f86463c);
        this.f86461a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
