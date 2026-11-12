package t61;

import androidx.lifecycle.t0;
import c22.j0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.performance.model.StressScoresSummaryDTO;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lcom/garmin/android/apps/connectmobile/performance/model/StressScoresSummaryDTO;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.StressScoreLevelViewModel$getStressScoresDailyStats$1", f = "StressScoreLevelViewModel.kt", l = {23, 25, 30, 32}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<t0<g3<? extends StressScoresSummaryDTO>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f162764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f162765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f162766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f162767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DateTime f162768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DateTime f162769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f162770g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DateTime dateTime, DateTime dateTime2, k kVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f162768e = dateTime;
        this.f162769f = dateTime2;
        this.f162770g = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f162768e, this.f162769f, this.f162770g, dVar);
        jVar.f162767d = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends StressScoresSummaryDTO>> t0Var, t13.d<? super Unit> dVar) {
        return ((j) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        if (r0.emit(r2, r14) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
    
        if (r0.emit(r2, r14) == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object objJ;
        v2 v2Var;
        t0 t0Var = (t0) this.f162767d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f162766c;
        if (i14 == 0) {
            o13.r.b(obj);
            String strB = j0.b(this.f162768e, "yyyy-MM-dd", null);
            if (strB == null) {
                strB = "";
            }
            String strB2 = j0.b(this.f162769f, "yyyy-MM-dd", null);
            String str3 = strB2 != null ? strB2 : "";
            g3 g3VarC = g3.a.c(g3.f35298f);
            this.f162767d = t0Var;
            this.f162764a = strB;
            this.f162765b = str3;
            this.f162766c = 1;
            if (t0Var.emit(g3VarC, this) != aVar) {
                str = strB;
                str2 = str3;
            }
            return aVar;
        }
        if (i14 == 1) {
            str2 = this.f162765b;
            str = this.f162764a;
            o13.r.b(obj);
        } else if (i14 == 2) {
            str2 = this.f162765b;
            String str4 = this.f162764a;
            o13.r.b(obj);
            str = str4;
            objJ = obj;
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                StressScoresSummaryDTO stressScoresSummaryDTO = (StressScoresSummaryDTO) ((v2.b) v2Var).f47386a;
                stressScoresSummaryDTO.f39906c = str;
                stressScoresSummaryDTO.f39907d = str2;
                g3.f35298f.getClass();
                g3 g3VarD = g3.a.d(stressScoresSummaryDTO);
                this.f162767d = null;
                this.f162764a = null;
                this.f162765b = null;
                this.f162766c = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                v2.a aVar2 = (v2.a) v2Var;
                g3 g3VarA = g3.a.a(g3.f35298f, aVar2.f47385c, aVar2.f47383a, null, null, 12);
                this.f162767d = null;
                this.f162764a = null;
                this.f162765b = null;
                this.f162766c = 4;
            }
        } else {
            if (i14 != 3 && i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        s61.a aVar3 = this.f162770g.f162771a;
        this.f162767d = t0Var;
        this.f162764a = str;
        this.f162765b = str2;
        this.f162766c = 2;
        aVar3.getClass();
        objJ = f0.J(aVar3, new s61.e(aVar3, str, str2, null), this);
        if (objJ != aVar) {
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                StressScoresSummaryDTO stressScoresSummaryDTO2 = (StressScoresSummaryDTO) ((v2.b) v2Var).f47386a;
                stressScoresSummaryDTO2.f39906c = str;
                stressScoresSummaryDTO2.f39907d = str2;
                g3.f35298f.getClass();
                g3 g3VarD2 = g3.a.d(stressScoresSummaryDTO2);
                this.f162767d = null;
                this.f162764a = null;
                this.f162765b = null;
                this.f162766c = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                v2.a aVar4 = (v2.a) v2Var;
                g3 g3VarA2 = g3.a.a(g3.f35298f, aVar4.f47385c, aVar4.f47383a, null, null, 12);
                this.f162767d = null;
                this.f162764a = null;
                this.f162765b = null;
                this.f162766c = 4;
            }
        }
        return aVar;
    }
}
