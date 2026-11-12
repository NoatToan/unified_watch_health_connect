package ro;

import b63.o;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListDTO;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import lc.u0;
import o13.r;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;
import r53.k;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.activities.map.domain.validators.PromosGCMaps3DValidatorImpl$getMap3DActivities$2", f = "PromosGCMaps3DValidatorImpl.kt", l = {105, 115}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<j<? super ActivityListItemDTO>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f153741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f153742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f153743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f153744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f153745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f153746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f153747g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, o oVar, o oVar2, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f153745e = aVar;
        this.f153746f = oVar;
        this.f153747g = oVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f153745e, this.f153746f, this.f153747g, dVar);
        dVar2.f153744d = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(j<? super ActivityListItemDTO> jVar, t13.d<? super Unit> dVar) {
        return ((d) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r53.s.v(r0, r10, r9) == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0072 -> B:23:0x0075). Please report as a decompilation issue!!! */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        int size;
        int i14;
        v2 v2Var;
        ArrayList<ActivityListItemDTO> arrayList;
        Object objA;
        j jVar = (j) this.f153744d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f153743c;
        if (i15 == 0) {
            r.b(obj);
            size = 1;
            so.a aVar2 = this.f153745e.f153730m;
            DateTime dateTimeK = h.k(this.f153746f);
            DateTime dateTimeK2 = h.k(this.f153747g);
            this.f153744d = jVar;
            this.f153741a = null;
            this.f153742b = size;
            this.f153743c = 1;
            objA = aVar2.a(dateTimeK, dateTimeK2, size, this);
            if (objA != aVar) {
                i14 = size;
                obj = objA;
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
                k kVar = new k(arrayList);
                this.f153744d = jVar;
                this.f153741a = arrayList;
                this.f153742b = i14;
                this.f153743c = 2;
            }
            return aVar;
        }
        if (i15 == 1) {
            i14 = this.f153742b;
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
            k kVar2 = new k(arrayList);
            this.f153744d = jVar;
            this.f153741a = arrayList;
            this.f153742b = i14;
            this.f153743c = 2;
        } else {
            if (i15 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = this.f153742b;
            arrayList = this.f153741a;
            r.b(obj);
        }
        if (arrayList.size() != 20) {
            return Unit.INSTANCE;
        }
        size = arrayList.size() + i14;
        so.a aVar3 = this.f153745e.f153730m;
        DateTime dateTimeK3 = h.k(this.f153746f);
        DateTime dateTimeK4 = h.k(this.f153747g);
        this.f153744d = jVar;
        this.f153741a = null;
        this.f153742b = size;
        this.f153743c = 1;
        objA = aVar3.a(dateTimeK3, dateTimeK4, size, this);
        if (objA != aVar) {
            i14 = size;
            obj = objA;
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
            k kVar3 = new k(arrayList);
            this.f153744d = jVar;
            this.f153741a = arrayList;
            this.f153742b = i14;
            this.f153743c = 2;
        }
        return aVar;
    }
}
