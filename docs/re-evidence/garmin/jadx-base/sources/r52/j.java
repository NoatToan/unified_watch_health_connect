package r52;

import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import i62.p;
import java.util.ArrayList;
import java.util.List;
import l52.y;
import lc.u0;
import m52.k;
import o13.r;
import p005kotlin.Metadata;
import yc.h3;
import yc.i3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lr52/j;", "Lyc/h3;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO;", "Ll52/y;", "workoutsRepo", "", "Lm52/k;", "workoutTypes", "<init>", "(Ll52/y;Ljava/util/List;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends h3<Integer, WorkoutDTO> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f150515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<k> f150516c;

    /* JADX WARN: Multi-variable type inference failed */
    public j(y yVar, List<? extends k> list) {
        yVar.getClass();
        list.getClass();
        this.f150515b = yVar;
        this.f150516c = list;
    }

    @Override // yc.h3
    public final Integer c(i3<Integer, WorkoutDTO> i3Var) {
        Integer num;
        Integer num2;
        Integer num3 = i3Var.f196062b;
        if (num3 == null) {
            return null;
        }
        h3.b.c<Integer, WorkoutDTO> cVarA = i3Var.a(num3.intValue());
        if (cVarA != null && (num2 = cVarA.f196017b) != null) {
            return wr.g.m(1, num2);
        }
        if (cVarA == null || (num = cVarA.f196018c) == null) {
            return null;
        }
        return b71.i.e(1, num);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        i iVar;
        int iIntValue;
        Object objF;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f150514e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f150514e = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object obj = iVar.f150512c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f150514e;
        if (i15 == 0) {
            r.b(obj);
            Integer num = (Integer) aVar.a();
            iIntValue = num != null ? num.intValue() : 0;
            int i16 = aVar.f196007a;
            iVar.f150510a = aVar;
            iVar.f150511b = iIntValue;
            iVar.f150514e = 1;
            objF = this.f150515b.f(this.f150516c, (iIntValue * i16) + 1, i16, iVar);
            if (objF == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i17 = iVar.f150511b;
            h3.a aVar3 = iVar.f150510a;
            r.b(obj);
            iIntValue = i17;
            aVar = aVar3;
            objF = obj;
        }
        v2 v2Var = (v2) objF;
        if (v2Var instanceof v2.a) {
            return new h3.b.a(((v2.a) v2Var).f47383a);
        }
        if (!(v2Var instanceof v2.b)) {
            u0.r();
            return null;
        }
        T t7 = ((v2.b) v2Var).f47386a;
        ArrayList<WorkoutDTO> arrayList = new ArrayList();
        for (Object obj2 : (Iterable) t7) {
            WorkoutDTO workoutDTO = (WorkoutDTO) obj2;
            if (workoutDTO.H() || workoutDTO.F()) {
                String str = workoutDTO.E;
                if (str != null && str.length() != 0) {
                    arrayList.add(obj2);
                }
            }
        }
        for (WorkoutDTO workoutDTO2 : arrayList) {
            p pVar = p.f91878a;
            String str2 = workoutDTO2.E;
            Long l14 = new Long(workoutDTO2.f48040a);
            pVar.getClass();
            p.a(l14, str2);
        }
        List list = (List) t7;
        return new h3.b.c(list, iIntValue == 0 ? null : new Integer(iIntValue - 1), list.size() == aVar.f196007a ? new Integer(iIntValue + 1) : null);
    }
}
