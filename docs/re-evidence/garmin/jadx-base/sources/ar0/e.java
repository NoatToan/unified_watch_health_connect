package ar0;

import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import tq0.f;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Ltq0/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.insights.repo.InsightsRepo$saveInsightsPreferences$2", f = "InsightsRepo.kt", l = {26}, m = "invokeSuspend", v = 2)
public final class e extends i implements l<t13.d<? super a0<List<? extends f>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f12541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<f> f12542c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, List<f> list, t13.d<? super e> dVar) {
        super(1, dVar);
        this.f12541b = aVar;
        this.f12542c = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e(this.f12541b, this.f12542c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends f>>> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12540a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<f>>> i0VarC = this.f12541b.f12522a.c(this.f12542c);
        this.f12540a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
