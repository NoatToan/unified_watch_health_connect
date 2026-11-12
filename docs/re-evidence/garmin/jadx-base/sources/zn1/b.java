package zn1;

import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.smartscale.repo.SmartScaleRepo$getAllRegisteredShortNames$2", f = "SmartScaleRepo.kt", l = {14}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<t13.d<? super a0<List<? extends String>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f205394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f205395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f205396c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, long j8, t13.d<? super b> dVar) {
        super(1, dVar);
        this.f205395b = aVar;
        this.f205396c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f205395b, this.f205396c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends String>>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f205394a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<String>>> i0VarB = this.f205395b.f205393a.b(this.f205396c);
        this.f205394a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
