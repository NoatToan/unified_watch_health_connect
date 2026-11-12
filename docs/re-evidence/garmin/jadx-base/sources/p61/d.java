package p61;

import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import o53.i0;
import o61.k;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lo61/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.network.TrainingEffectRepo$getTrainingEffectDailyStats$2", f = "TrainingEffectRepo.kt", l = {34}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<List<? extends k>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f136204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f136205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l<DateTime, String> f136206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f136207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DateTime f136208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f136209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<String> f136210g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(e eVar, l<? super DateTime, String> lVar, DateTime dateTime, DateTime dateTime2, boolean z14, List<String> list, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f136205b = eVar;
        this.f136206c = lVar;
        this.f136207d = dateTime;
        this.f136208e = dateTime2;
        this.f136209f = z14;
        this.f136210g = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f136205b, this.f136206c, this.f136207d, this.f136208e, this.f136209f, this.f136210g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends k>>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f136204a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        b bVar = this.f136205b.f136212a;
        DateTime dateTime = this.f136207d;
        l<DateTime, String> lVar = this.f136206c;
        i0<a0<List<k>>> i0VarB = bVar.b(lVar.invoke(dateTime), lVar.invoke(this.f136208e), this.f136209f, this.f136210g);
        this.f136204a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
