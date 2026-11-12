package o71;

import a61.s;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListDTO;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import lc.u0;
import o13.r;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.viewmodel.StrengthStatsViewModel$getAllActivities$2", f = "StrengthStatsViewModel.kt", l = {82, 92}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<r53.j<? super ActivityListItemDTO>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f130281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f130282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f130283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f130284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f130285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LocalDate f130286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ LocalDate f130287g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, LocalDate localDate, LocalDate localDate2, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f130285e = iVar;
        this.f130286f = localDate;
        this.f130287g = localDate2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f130285e, this.f130286f, this.f130287g, dVar);
        kVar.f130284d = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super ActivityListItemDTO> jVar, t13.d<? super Unit> dVar) {
        return ((k) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r53.s.v(r0, r13, r12) == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0085 -> B:23:0x0088). Please report as a decompilation issue!!! */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        int size;
        int i14;
        v2 v2Var;
        ArrayList<ActivityListItemDTO> arrayList;
        r53.j jVar = (r53.j) this.f130284d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f130283c;
        if (i15 == 0) {
            r.b(obj);
            size = 1;
            a61.r rVar = this.f130285e.f130239a;
            DateTime dateTimeAtStartOfDay = this.f130286f.toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay.getClass();
            DateTime dateTimeAtStartOfDay2 = this.f130287g.plusDays(1).toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay2.getClass();
            this.f130284d = jVar;
            this.f130281a = null;
            this.f130282b = size;
            this.f130283c = 1;
            rVar.getClass();
            obj = f0.J(rVar, new s(rVar, dateTimeAtStartOfDay, dateTimeAtStartOfDay2, size, 1000, null), this);
            if (obj != aVar) {
                i14 = size;
                v2Var = (v2) obj;
                if (v2Var instanceof v2.a) {
                    throw ((v2.a) v2Var).f47383a;
                }
                if (!(v2Var instanceof v2.b)) {
                    u0.r();
                    return null;
                }
                arrayList = ((ActivityListDTO) ((v2.b) v2Var).f47386a).f29242a;
                arrayList.getClass();
                r53.k kVar = new r53.k(arrayList);
                this.f130284d = jVar;
                this.f130281a = arrayList;
                this.f130282b = i14;
                this.f130283c = 2;
            }
            return aVar;
        }
        if (i15 == 1) {
            i14 = this.f130282b;
            r.b(obj);
            v2Var = (v2) obj;
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            arrayList = ((ActivityListDTO) ((v2.b) v2Var).f47386a).f29242a;
            arrayList.getClass();
            r53.k kVar2 = new r53.k(arrayList);
            this.f130284d = jVar;
            this.f130281a = arrayList;
            this.f130282b = i14;
            this.f130283c = 2;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = this.f130282b;
            arrayList = this.f130281a;
            r.b(obj);
        }
        if (arrayList.size() != 1000) {
            return Unit.INSTANCE;
        }
        size = arrayList.size() + i14;
        a61.r rVar2 = this.f130285e.f130239a;
        DateTime dateTimeAtStartOfDay3 = this.f130286f.toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay3.getClass();
        DateTime dateTimeAtStartOfDay4 = this.f130287g.plusDays(1).toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay4.getClass();
        this.f130284d = jVar;
        this.f130281a = null;
        this.f130282b = size;
        this.f130283c = 1;
        rVar2.getClass();
        obj = f0.J(rVar2, new s(rVar2, dateTimeAtStartOfDay3, dateTimeAtStartOfDay4, size, 1000, null), this);
        if (obj != aVar) {
            i14 = size;
            v2Var = (v2) obj;
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            arrayList = ((ActivityListDTO) ((v2.b) v2Var).f47386a).f29242a;
            arrayList.getClass();
            r53.k kVar3 = new r53.k(arrayList);
            this.f130284d = jVar;
            this.f130281a = arrayList;
            this.f130282b = i14;
            this.f130283c = 2;
        }
        return aVar;
    }
}
