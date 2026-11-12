package aw1;

import android.content.Context;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$getAvailableTrainingDaysSelectionUIModel$1", f = "FBTPlanWizardViewModel.kt", l = {2046}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f13606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f13607d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13608a;

        static {
            int[] iArr = new int[vt1.o.values().length];
            try {
                iArr[vt1.o.f180176g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vt1.o.f180175f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vt1.o.f180178i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13608a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(h hVar, Context context, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f13606c = hVar;
        this.f13607d = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        z zVar = new z(this.f13606c, this.f13607d, dVar);
        zVar.f13605b = obj;
        return zVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0220  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        List<String> listI;
        List listF;
        boolean z14;
        boolean z15;
        String str;
        String string;
        List<String> list;
        o53.b0 b0Var = (o53.b0) this.f13605b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13604a;
        String str2 = null;
        h hVar = this.f13606c;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = h.S1;
            hVar.k6().j(g3.a.c(g3.f35298f));
            kv1.y yVarH6 = hVar.h6();
            this.f13605b = b0Var;
            this.f13604a = 1;
            objA = yVarH6.a(this);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objA = obj;
        }
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            jv1.e0 e0Var = (jv1.e0) ((v2.b) v2Var).f47386a;
            int i16 = h.S1;
            jv1.s sVarI6 = hVar.i6();
            boolean z16 = false;
            if (!hVar.f13385r1 || sVarI6 == null) {
                listI = null;
            } else {
                listI = sVarI6.i(hVar.M6() || hVar.Y6());
            }
            List<String> list2 = (!hVar.f13385r1 || sVarI6 == null) ? null : sVarI6.f101136o;
            hVar.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, e0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, 511) : null);
            if (sVarI6 == null || (list = sVarI6.f101134m) == null || !(!list.isEmpty())) {
                List<String> listB = e0Var.b();
                if (listB == null || !(!listB.isEmpty())) {
                    w13.c cVar = wt1.q.f187129o;
                    cVar.getClass();
                    listF = i53.a.f(p005kotlin.jvm.internal.i.d(cVar, new wt1.q[0]));
                } else {
                    List<String> listB2 = e0Var.b();
                    ArrayList arrayList = new ArrayList(p13.y.r(listB2, 10));
                    Iterator<T> it = listB2.iterator();
                    while (it.hasNext()) {
                        wr.g.z(wt1.q.f187120f, (String) it.next(), arrayList);
                    }
                    listF = i53.a.e(arrayList);
                }
            } else if (list != null) {
                ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    wr.g.z(wt1.q.f187120f, (String) it3.next(), arrayList2);
                }
                listF = i53.a.e(arrayList2);
            } else {
                listF = null;
            }
            w13.c cVar2 = wt1.q.f187129o;
            ArrayList arrayList3 = new ArrayList(p13.y.r(cVar2, 10));
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                wt1.q qVar = (wt1.q) bVar.next();
                boolean z17 = (listF == null || !listF.contains(qVar)) ? z16 : true;
                if (listI != null && !listI.isEmpty()) {
                    Iterator<T> it4 = listI.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            z14 = z16;
                            break;
                        }
                        if (d53.w.z((String) it4.next(), qVar.toString(), true)) {
                            z14 = true;
                            break;
                        }
                    }
                } else {
                    z14 = z16;
                    break;
                }
                if (list2 != null && !list2.isEmpty()) {
                    Iterator<T> it5 = list2.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            z15 = z16;
                            break;
                        }
                        if (d53.w.z((String) it5.next(), qVar.toString(), true)) {
                            z15 = true;
                            break;
                        }
                    }
                } else {
                    z15 = z16;
                    break;
                }
                String str3 = "";
                if (z14 || z15) {
                    vt1.o oVarS5 = hVar.S5();
                    int i17 = oVarS5 == null ? -1 : a.f13608a[oVarS5.ordinal()];
                    str = str2;
                    Context context = this.f13607d;
                    if (i17 == -1) {
                        string = context.getString(R.string.atp_lbl_long_run_day);
                    } else if (i17 == 1) {
                        string = context.getString(R.string.itp_setup_option_long_day);
                    } else if (i17 == 2) {
                        string = context.getString(R.string.atp_lbl_long_run_day);
                    } else if (i17 != 3) {
                        string = str;
                    } else if (z14 && z15) {
                        string = e5.g(context.getString(R.string.long_workout_day), ", ", context.getString(R.string.swim_day));
                    } else if (z14) {
                        string = context.getString(R.string.long_workout_day);
                        string.getClass();
                    } else {
                        string = context.getString(R.string.swim_day);
                        string.getClass();
                    }
                } else {
                    str = str2;
                    string = "";
                }
                if (string != null) {
                    str3 = string;
                }
                arrayList3.add(new mv1.f(qVar, str3, z17, true));
                str2 = str;
                z16 = false;
            }
            y0<g3<List<mv1.f>>> y0VarK6 = hVar.k6();
            g3.f35298f.getClass();
            y0VarK6.j(g3.a.d(arrayList3));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            int i18 = h.S1;
            v2.a aVar2 = (v2.a) v2Var;
            hVar.k6().j(g3.a.a(g3.f35298f, null, aVar2.f47383a, null, null, 13));
            String str4 = "availableDays selection " + aVar2.f47384b + " ::  " + aVar2.f47383a;
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "FBTPlanWizardViewModel", str4);
        }
        return Unit.INSTANCE;
    }
}
