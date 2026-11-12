package b71;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.g1;
import androidx.core.view.s0;
import b82.t0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.y;
import com.garmin.android.apps.connectmobile.settings.devices.vivomove3.Vivomove3AppearanceActivity;
import java.util.WeakHashMap;
import p005kotlin.Unit;
import p5.h0;
import p5.k0;
import r1.u0;
import x5.l0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16364a;

    public /* synthetic */ o(int i14) {
        this.f16364a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        bb2.i iVar = null;
        switch (this.f16364a) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                FrameLayout frameLayout = new FrameLayout(context);
                LayoutInflater.from(context).inflate(R.layout.gcm_training_acute_load_graph, (ViewGroup) frameLayout, true);
                return frameLayout;
            case 1:
                ((View) obj).getClass();
                return Unit.INSTANCE;
            case 2:
                Context context2 = (Context) obj;
                context2.getClass();
                return LayoutInflater.from(context2).inflate(R.layout.endurance_score_chart, (ViewGroup) null);
            case 3:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 4:
                t0 t0Var = t0.f16792a;
                ((r1.n) obj).getClass();
                return r1.b.c(u0.d(s1.l.d(150, 0, null, 6), 2), u0.e(s1.l.d(150, 0, null, 6), 2));
            case 5:
                l0 l0Var = (l0) obj;
                t0 t0Var2 = t0.f16792a;
                l0Var.getClass();
                return l0Var;
            case 6:
                l0 l0Var2 = (l0) obj;
                t0 t0Var3 = t0.f16792a;
                l0Var2.getClass();
                return l0Var2;
            case 7:
                k0 k0Var = (k0) obj;
                t0 t0Var4 = t0.f16792a;
                k0Var.getClass();
                h0.g(k0Var);
                return Unit.INSTANCE;
            case 8:
                ud.a aVar = (ud.a) obj;
                bb2.c.C0243c c0243c = bb2.c.f17328d;
                aVar.getClass();
                ud.c cVarM0 = aVar.M0("DELETE FROM activity_polyline");
                try {
                    cVarM0.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM0.close();
                }
            case 9:
                ud.a aVar2 = (ud.a) obj;
                bb2.g.c cVar = bb2.g.f17352c;
                aVar2.getClass();
                ud.c cVarM1 = aVar2.M0("DELETE FROM activity_summaries");
                try {
                    cVarM1.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM1.close();
                }
            case 10:
                ud.a aVar3 = (ud.a) obj;
                bb2.k.b bVar = bb2.k.f17367c;
                aVar3.getClass();
                ud.c cVarM2 = aVar3.M0("DELETE FROM device_needs_bond");
                try {
                    cVarM2.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM2.close();
                }
            case 11:
                ud.a aVar4 = (ud.a) obj;
                bb2.k.b bVar2 = bb2.k.f17367c;
                aVar4.getClass();
                ud.c cVarM3 = aVar4.M0("SELECT * FROM device_needs_bond WHERE DEVICE_DIALOG_SHOWN = 0 LIMIT 1");
                try {
                    int iB = ge1.b.B(cVarM3, "device_unit_id");
                    int iB2 = ge1.b.B(cVarM3, "device_mac_address");
                    int iB3 = ge1.b.B(cVarM3, "device_product_number");
                    int iB4 = ge1.b.B(cVarM3, "device_name");
                    int iB5 = ge1.b.B(cVarM3, "device_image_url");
                    int iB6 = ge1.b.B(cVarM3, "device_dialog_shown");
                    if (cVarM3.J0()) {
                        iVar = new bb2.i(cVarM3.getLong(iB), cVarM3.M1(iB2), cVarM3.M1(iB3), cVarM3.M1(iB4), cVarM3.M1(iB5), ((int) cVarM3.getLong(iB6)) != 0);
                    }
                    return iVar;
                } finally {
                    cVarM3.close();
                }
            case 12:
                ud.a aVar5 = (ud.a) obj;
                bb2.o.c cVar2 = bb2.o.f17378d;
                aVar5.getClass();
                ud.c cVarM4 = aVar5.M0("DELETE FROM device_work_input");
                try {
                    cVarM4.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM4.close();
                }
            case 13:
                ud.a aVar6 = (ud.a) obj;
                bb2.q.c cVar3 = bb2.q.f17382c;
                aVar6.getClass();
                ud.c cVarM5 = aVar6.M0("DELETE FROM response_cache");
                try {
                    cVarM5.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM5.close();
                }
            case 14:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                h0.g(k0Var2);
                return Unit.INSTANCE;
            case 16:
                y yVar = (y) obj;
                int i14 = Vivomove3AppearanceActivity.f43190p;
                yVar.getClass();
                return Boolean.valueOf(yVar.f34329b == -1);
            case 17:
                return ((bi1.a) obj).f18013b;
            case 18:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 19:
                oi0.b bVar3 = (oi0.b) obj;
                bVar3.getClass();
                bVar3.X();
                bVar3.M();
                return Unit.INSTANCE;
            case 20:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 21:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 23:
                int i15 = bm.q.D;
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                ((View) obj).requestApplyInsets();
                return Unit.INSTANCE;
            case 24:
                k0 k0Var3 = (k0) obj;
                k0Var3.getClass();
                h0.n(k0Var3, "");
                h0.g(k0Var3);
                return Unit.INSTANCE;
            case 25:
                ((qs1.n) obj).getClass();
                return Unit.INSTANCE;
            case 26:
                oi0.b bVar4 = (oi0.b) obj;
                bVar4.getClass();
                bVar4.s();
                bVar4.B();
                return Unit.INSTANCE;
            case 27:
                ((qs1.n) obj).getClass();
                return Unit.INSTANCE;
            case 28:
                oi0.b bVar5 = (oi0.b) obj;
                bVar5.getClass();
                bVar5.y();
                bVar5.g();
                return Unit.INSTANCE;
            default:
                oi0.b bVar6 = (oi0.b) obj;
                bVar6.getClass();
                bVar6.y();
                bVar6.g();
                return Unit.INSTANCE;
        }
    }
}
