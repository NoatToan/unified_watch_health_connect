package g02;

import android.content.Context;
import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepTargetTypeActivity;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class u implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f74574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f74575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f74576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f74577e;

    public /* synthetic */ u(i53.c cVar, boolean z14, boolean z15, e23.a aVar) {
        this.f74573a = 1;
        this.f74576d = cVar;
        this.f74574b = z14;
        this.f74575c = z15;
        this.f74577e = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x019c  */
    /* JADX WARN: Code duplicated, block: B:37:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:41:0x01b6  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        String str;
        int i14 = this.f74573a;
        boolean z14 = false;
        boolean z15 = this.f74575c;
        boolean z16 = this.f74574b;
        Object obj2 = this.f74577e;
        Object obj3 = this.f74576d;
        switch (i14) {
            case 0:
                e23.l lVar = (e23.l) obj3;
                p3.p1 p1Var = (p3.p1) obj2;
                x5.l0 l0Var = (x5.l0) obj;
                l0Var.getClass();
                s5.c cVar = l0Var.f188878a;
                if (!z16) {
                    if (!new d53.k("[.,]").a(cVar.f157138b)) {
                        if (z15 || !d53.w.z(cVar.f157138b, "-", false)) {
                            str = cVar.f157138b;
                            if (d53.w.J(str) || d53.s.f(str) != null) {
                                p1Var.setValue(l0Var);
                                lVar.invoke(str);
                            }
                        }
                    }
                } else if (z15) {
                    str = cVar.f157138b;
                    if (d53.w.J(str)) {
                        p1Var.setValue(l0Var);
                        lVar.invoke(str);
                    } else {
                        p1Var.setValue(l0Var);
                        lVar.invoke(str);
                    }
                } else {
                    str = cVar.f157138b;
                    if (d53.w.J(str)) {
                        p1Var.setValue(l0Var);
                        lVar.invoke(str);
                    } else {
                        p1Var.setValue(l0Var);
                        lVar.invoke(str);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                i53.c<o20.a> cVar2 = (i53.c) obj3;
                e23.a aVar = (e23.a) obj2;
                Context context = (Context) obj;
                context.getClass();
                ts1.a aVar2 = (ts1.a) KoinJavaComponent.get$default(ts1.a.class, null, null, 6, null);
                ArrayList arrayList = new ArrayList(p13.y.r(cVar2, 10));
                for (o20.a aVar3 : cVar2) {
                    arrayList.add(new GeoPointDTO(0.0d, 0.0d, aVar3.D(), aVar3.C()));
                }
                return aVar2.i(context, arrayList, this.f74574b, this.f74575c, aVar);
            case 2:
                WorkoutStepTargetTypeActivity workoutStepTargetTypeActivity = (WorkoutStepTargetTypeActivity) obj3;
                r22.u1 u1Var = (r22.u1) obj2;
                r22.t1 t1Var = (r22.t1) obj;
                int i15 = WorkoutStepTargetTypeActivity.f49603b;
                t1Var.getClass();
                if (!t1Var.f149897g) {
                    if (z16 && z15 && x52.f.valueOf(t1Var.f149891a) == x52.f.f189079h) {
                        new androidx.appcompat.app.e.a(workoutStepTargetTypeActivity).setMessage(R.string.workout_remove_secondary_target_confirmation).setPositiveButton(R.string.lbl_common_continue, new ng1.c1(new mt0.s1(21, u1Var, t1Var), 4)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).show();
                    } else {
                        z14 = true;
                    }
                }
                return Boolean.valueOf(z14);
            default:
                tn2.w wVar = (tn2.w) obj3;
                ul2.c cVar3 = (ul2.c) obj2;
                byte[] bArr = (byte[]) obj;
                Logger logger = tn2.w.f165679d;
                bArr.getClass();
                int i16 = 27;
                if (z16 && z15) {
                    e13.o oVarP = wVar.p(cVar3);
                    r22.a aVar4 = new r22.a(new rp.b(wVar, i16, cVar3, bArr), 24);
                    int i17 = w03.b.f181178a;
                    return q03.r.l(new b13.k(new b13.f(new e13.l(oVarP, aVar4), new yr2.l(new tn2.x())), new e13.b(new tn2.y())), new e13.j(wVar.p(cVar3), new r22.a(new sy.i(wVar, cVar3, bArr), 22)), new tn.k(4));
                }
                if (z16) {
                    e13.o oVarP2 = wVar.p(cVar3);
                    r22.a aVar5 = new r22.a(new rp.b(wVar, i16, cVar3, bArr), 24);
                    int i18 = w03.b.f181178a;
                    return new b13.k(new b13.f(new e13.l(oVarP2, aVar5), new yr2.l(new tn2.z())), new e13.b(new tn2.a0()));
                }
                if (!z15) {
                    vb.h.s("Both withBalance and withPunchingStatus are false.");
                    return null;
                }
                e13.o oVarP3 = wVar.p(cVar3);
                r22.a aVar6 = new r22.a(new sy.i(wVar, cVar3, bArr), 22);
                int i19 = w03.b.f181178a;
                return new e13.o(new e13.j(oVarP3, aVar6), new tn2.v(new tn2.m(12), 13));
        }
    }

    public /* synthetic */ u(boolean z14, boolean z15, Object obj, Object obj2, int i14) {
        this.f74573a = i14;
        this.f74574b = z14;
        this.f74575c = z15;
        this.f74576d = obj;
        this.f74577e = obj2;
    }
}
