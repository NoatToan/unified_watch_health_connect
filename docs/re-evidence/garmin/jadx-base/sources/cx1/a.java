package cx1;

import c83.a0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import o13.r;
import o53.i0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lyw1/g;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.network.repo.FitnessStatsRepo$getActivitiesPerformanceStats$2", f = "FitnessStatsRepo.kt", l = {85}, m = "invokeSuspend", v = 2)
public final class a extends v13.i implements e23.l<t13.d<? super a0<List<? extends yw1.g>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f56604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f56605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalDate f56606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<String> f56607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<String> f56608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Boolean f56609g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o oVar, LocalDate localDate, LocalDate localDate2, List<String> list, List<String> list2, Boolean bool, t13.d<? super a> dVar) {
        super(1, dVar);
        this.f56604b = oVar;
        this.f56605c = localDate;
        this.f56606d = localDate2;
        this.f56607e = list;
        this.f56608f = list2;
        this.f56609g = bool;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new a(this.f56604b, this.f56605c, this.f56606d, this.f56607e, this.f56608f, this.f56609g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends yw1.g>>> dVar) {
        return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f56603a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        bx1.a aVar2 = this.f56604b.f56664a;
        Boolean bool = this.f56609g;
        i0<a0<List<yw1.g>>> i0VarA = aVar2.a(this.f56605c, this.f56606d, this.f56607e, this.f56608f, true, true, bool != null ? bool.booleanValue() : false, TtmlNode.COMBINE_ALL);
        this.f56603a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
