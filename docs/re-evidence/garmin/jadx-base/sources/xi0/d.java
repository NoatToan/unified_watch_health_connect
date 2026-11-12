package xi0;

import am.t1;
import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lwi0/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ftp.reports.data.repo.FtpRepositoryImpl$getPowerToWeightSummaryReport$2", f = "FtpRepositoryImpl.kt", l = {33}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<List<? extends wi0.a>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f191119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f191120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f191121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz0.c f191122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz0.c f191123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<String> f191124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t1 f191125g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, fz0.c cVar, fz0.c cVar2, List<String> list, t1 t1Var, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f191120b = eVar;
        this.f191121c = str;
        this.f191122d = cVar;
        this.f191123e = cVar2;
        this.f191124f = list;
        this.f191125g = t1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f191120b, this.f191121c, this.f191122d, this.f191123e, this.f191124f, this.f191125g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends wi0.a>>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f191119a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        vi0.a aVar2 = this.f191120b.f191126a;
        this.f191119a = 1;
        Object objA = aVar2.a(this.f191121c, this.f191122d, this.f191123e, this.f191124f, this.f191125g, this);
        return objA == aVar ? aVar : objA;
    }
}
