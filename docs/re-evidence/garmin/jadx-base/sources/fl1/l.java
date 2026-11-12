package fl1;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lzf2/d;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.domain.GetWorkoutSupportedActivityTypesUseCase$invoke$2", f = "GetWorkoutSupportedActivityTypesUseCase.kt", l = {20, 21, 26}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super List<? extends zf2.d>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f72022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f72023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f72024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f72025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, long j8, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f72024c = kVar;
        this.f72025d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f72024c, this.f72025d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super List<? extends zf2.d>> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List list;
        Object objG;
        List list2;
        v2 v2Var;
        com.garmin.android.apps.connectmobile.devices.model.m mVar;
        ArrayList arrayList;
        Boolean runningWorkoutCapable;
        boolean zBooleanValue;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72023b;
        k kVar = this.f72024c;
        if (i14 == 0) {
            r.b(obj);
            ws.a aVar2 = kVar.f72019b;
            this.f72023b = 1;
            obj = aVar2.d(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 == 2) {
                r.b(obj);
                list = (List) obj;
                pc0.j jVar = kVar.f72018a;
                String strValueOf = String.valueOf(this.f72025d);
                this.f72022a = list;
                this.f72023b = 3;
                objG = jVar.g(strValueOf, this);
                if (objG != aVar) {
                    list2 = list;
                    obj = objG;
                }
                return aVar;
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = this.f72022a;
            r.b(obj);
        }
        v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            if (v2Var instanceof v2.a) {
                return j0.f134944a;
            }
            u0.r();
            return null;
        }
        mVar = (com.garmin.android.apps.connectmobile.devices.model.m) ((v2.b) v2Var).f47386a;
        arrayList = new ArrayList();
        for (Object obj2 : list2) {
            kVar.getClass();
            switch (k.a.f72021a[((zf2.d) obj2).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    runningWorkoutCapable = mVar.getRunningWorkoutCapable();
                    break;
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                    runningWorkoutCapable = mVar.getCyclingWorkoutCapable();
                    break;
                case 31:
                    runningWorkoutCapable = mVar.getSwimWorkoutCapable();
                    break;
                case 32:
                    runningWorkoutCapable = mVar.getStrengthWorkoutCapable();
                    break;
                case 33:
                    runningWorkoutCapable = mVar.getCardioWorkoutCapable();
                    break;
                case 34:
                    runningWorkoutCapable = mVar.getMobilityWorkoutCapable();
                    break;
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                    runningWorkoutCapable = mVar.getHiitWorkoutCapable();
                    break;
                case 40:
                    runningWorkoutCapable = mVar.getYogaWorkoutCapable();
                    break;
                case 41:
                    runningWorkoutCapable = mVar.getPilatesWorkoutCapable();
                    break;
                case 42:
                    runningWorkoutCapable = mVar.getCustomWorkoutCapable();
                    break;
                default:
                    runningWorkoutCapable = Boolean.FALSE;
                    break;
            }
            if (runningWorkoutCapable != null) {
                zBooleanValue = runningWorkoutCapable.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
        if (!((Boolean) obj).booleanValue()) {
            return j0.f134944a;
        }
        ws.a aVar3 = kVar.f72019b;
        this.f72023b = 2;
        obj = aVar3.a(this);
        if (obj != aVar) {
            list = (List) obj;
            pc0.j jVar2 = kVar.f72018a;
            String strValueOf2 = String.valueOf(this.f72025d);
            this.f72022a = list;
            this.f72023b = 3;
            objG = jVar2.g(strValueOf2, this);
            if (objG != aVar) {
                list2 = list;
                obj = objG;
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    if (v2Var instanceof v2.a) {
                        return j0.f134944a;
                    }
                    u0.r();
                    return null;
                }
                mVar = (com.garmin.android.apps.connectmobile.devices.model.m) ((v2.b) v2Var).f47386a;
                arrayList = new ArrayList();
                while (r0.hasNext()) {
                    kVar.getClass();
                    switch (k.a.f72021a[((zf2.d) obj2).ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            runningWorkoutCapable = mVar.getRunningWorkoutCapable();
                            break;
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                            runningWorkoutCapable = mVar.getCyclingWorkoutCapable();
                            break;
                        case 31:
                            runningWorkoutCapable = mVar.getSwimWorkoutCapable();
                            break;
                        case 32:
                            runningWorkoutCapable = mVar.getStrengthWorkoutCapable();
                            break;
                        case 33:
                            runningWorkoutCapable = mVar.getCardioWorkoutCapable();
                            break;
                        case 34:
                            runningWorkoutCapable = mVar.getMobilityWorkoutCapable();
                            break;
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            runningWorkoutCapable = mVar.getHiitWorkoutCapable();
                            break;
                        case 40:
                            runningWorkoutCapable = mVar.getYogaWorkoutCapable();
                            break;
                        case 41:
                            runningWorkoutCapable = mVar.getPilatesWorkoutCapable();
                            break;
                        case 42:
                            runningWorkoutCapable = mVar.getCustomWorkoutCapable();
                            break;
                        default:
                            runningWorkoutCapable = Boolean.FALSE;
                            break;
                    }
                    if (runningWorkoutCapable != null) {
                        zBooleanValue = runningWorkoutCapable.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
        }
        return aVar;
    }
}
