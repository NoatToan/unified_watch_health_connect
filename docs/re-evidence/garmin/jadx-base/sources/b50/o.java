package b50;

import android.app.Activity;
import android.content.Context;
import android.database.SQLException;
import android.view.Window;
import android.widget.Button;
import androidx.core.view.o1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import b21.l4;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivitiesActivity;
import com.garmin.android.apps.connectmobile.steps.presentation.StepsActivity;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTime;
import org.koin.androidx.scope.FragmentExtKt;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import r53.c2;
import r53.m1;
import r53.y1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16016c;

    public /* synthetic */ o(Object obj, boolean z14, int i14) {
        this.f16014a = i14;
        this.f16016c = obj;
        this.f16015b = z14;
    }

    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, o13.l] */
    @Override // e23.a
    public final Object invoke() {
        Window window;
        String str;
        int i14 = this.f16014a;
        boolean z14 = this.f16015b;
        Object obj = this.f16016c;
        switch (i14) {
            case 0:
                p pVar = (p) obj;
                if (z14) {
                    w20.a aVar = ((e50.d) pVar.f16041y.getValue()).f62992d;
                    com.garmin.android.apps.connectmobile.courses.model.e eVar = aVar != null ? aVar.f181476a : null;
                    if (eVar != null) {
                        e30.t tVar = pVar.f16028j;
                        tVar.getClass();
                        r53.u uVar = new r53.u(new m1(new r53.v(new q(pVar, null), new c2(new e30.s(tVar, null))), new r(eVar, pVar, null)), new s(pVar, null));
                        x53.c cVar = o53.s0.f129406a;
                        r53.s.C(r53.s.A(uVar, x53.b.f189152a), v1.a(pVar));
                    }
                }
                return Unit.INSTANCE;
            case 1:
                return ((ep0.b) obj).f64861a.getString(z14 ? R.string.lbl_none : R.string.no_value);
            case 2:
                m4.b0 b0Var = (m4.b0) obj;
                if (z14) {
                    m4.b0.a(b0Var);
                }
                return Unit.INSTANCE;
            case 3:
                jd.e eVar2 = (jd.e) obj;
                String str2 = z14 ? "reader" : "writer";
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Timed out attempting to acquire a " + str2 + " connection.");
                sb3.append("\n\nWriter pool:\n");
                eVar2.f98193b.d(sb3);
                sb3.append("Reader pool:");
                sb3.append('\n');
                eVar2.f98192a.d(sb3);
                try {
                    oe2.f.a0(5, sb3.toString());
                    throw null;
                } catch (SQLException e4) {
                    int i15 = eVar2.f98198g;
                    if (i15 == 1) {
                        throw e4;
                    }
                    if (i15 == 2) {
                        e4.printStackTrace();
                    }
                    return Unit.INSTANCE;
                }
            case 4:
                ((gv0.d) obj).O4(!z14);
                return Unit.INSTANCE;
            case 5:
                ((e23.p) obj).invoke(Boolean.valueOf(z14), Boolean.FALSE);
                return Unit.INSTANCE;
            case 6:
                y1 y1Var = (y1) obj;
                if (z14) {
                    y1Var.d(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case 7:
                v2.b1 b1Var = (v2.b1) obj;
                if (z14) {
                    b1Var.i();
                }
                return Unit.INSTANCE;
            case 8:
                return FragmentExtKt.createFragmentScope((Fragment) obj, z14);
            case 9:
                return ParametersHolderKt.parametersOf((n80.a) obj, Boolean.valueOf(z14));
            case 10:
                ix.j jVar = (ix.j) obj;
                if (z14) {
                    jVar.A4();
                }
                return Unit.INSTANCE;
            case 11:
                Context context = (Context) obj;
                ht.s sVar = ht.s.f85508a;
                lt.e.C2183e c2183e = new lt.e.C2183e(lt.e.a.Tapped, o70.i.f130002j);
                sVar.getClass();
                ht.s.a(c2183e);
                if (z14) {
                    context.startActivity(((mq1.a) KoinJavaComponent.get$default(mq1.a.class, null, null, 6, null)).b(DateTime.now(), false));
                } else {
                    context.startActivity(dh.b.z(StepsActivity.class, context, DateTime.now(), false));
                }
                return Unit.INSTANCE;
            case 12:
                ArrayList<j70.b> arrayListG = j70.g.g((List) ((v2.b) ((v2) obj)).f47386a, z14);
                ArrayList arrayList = new ArrayList();
                for (j70.b bVar : arrayListG) {
                    o70.c.a aVar2 = o70.c.f129930b;
                    String cardType = bVar.getCardType();
                    aVar2.getClass();
                    Enum enumA = o70.c.a.a(cardType);
                    if (enumA == null) {
                        o70.o.a aVar3 = o70.o.f130039b;
                        String cardType2 = bVar.getCardType();
                        aVar3.getClass();
                        enumA = o70.o.a.a(cardType2);
                    }
                    if (enumA != null) {
                        arrayList.add(enumA);
                    }
                }
                return arrayList;
            case 13:
                Activity activity = (Activity) obj;
                if (activity != null && (window = activity.getWindow()) != null) {
                    new o1(window, window.getDecorView()).b(!z14);
                }
                return Unit.INSTANCE;
            case 14:
                double d14 = ((pe0.j) obj).f137456f;
                if (d14 > 0.0d) {
                    l3.f23124b.getClass();
                    double dQ1 = l3.a.Q1((long) d14, z14);
                    p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                    str = String.format("%.0f", Arrays.copyOf(new Object[]{Double.valueOf(dQ1)}, 1));
                } else {
                    str = "";
                }
                return p3.p0.n(str);
            case 15:
                PendingActivitiesActivity pendingActivitiesActivity = (PendingActivitiesActivity) obj;
                PendingActivitiesActivity.a aVar4 = PendingActivitiesActivity.f39793d;
                if (!z14) {
                    ((w51.h0) pendingActivitiesActivity.f39794a.getValue()).A4();
                }
                sn.a.o(f12.l.f68084a, true);
                return Unit.INSTANCE;
            case 16:
                vu1.w wVar = ((wu1.h) obj).f187316b;
                if (wVar != null) {
                    wVar.o5(z14);
                }
                return Unit.INSTANCE;
            case 17:
                NutritionActivity.a aVar5 = NutritionActivity.f39581f;
                return ParametersHolderKt.parametersOf((l4) obj, Boolean.valueOf(z14));
            case 18:
                Button button = ((xe2.z) obj).f190604a;
                if (button != null) {
                    button.setEnabled(z14);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("buttonNext");
                throw null;
            default:
                ((com.garmin.android.library.mobileauth.ui.g) obj).w6(z14);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ o(boolean z14, Object obj, int i14) {
        this.f16014a = i14;
        this.f16015b = z14;
        this.f16016c = obj;
    }
}
