package tv1;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lvv1/d;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.data.repo.FBTProgressReportRepo$getRacePredictor$2", f = "FBTProgressReportRepo.kt", l = {18}, m = "invokeSuspend", v = 2)
public final class a extends i implements l<d<? super a0<vv1.d>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f166649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f166650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f166651c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, String str, d<? super a> dVar) {
        super(1, dVar);
        this.f166650b = cVar;
        this.f166651c = str;
    }

    @Override // v13.a
    public final d<Unit> create(d<?> dVar) {
        return new a(this.f166650b, this.f166651c, dVar);
    }

    @Override // e23.l
    public final Object invoke(d<? super a0<vv1.d>> dVar) {
        return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f166649a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<vv1.d>> i0VarA = this.f166650b.f166657a.a(this.f166651c);
        this.f166649a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
