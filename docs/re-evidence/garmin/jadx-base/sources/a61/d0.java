package a61;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.NumberPicker;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.w1;
import androidx.lifecycle.y0;
import aq.a2;
import aq.b2;
import aq.d2;
import aq.f2;
import aq.h2;
import c2.o3;
import c22.j2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.events.components.GCMEditTextTrainingInitiative;
import com.garmin.android.apps.connectmobile.groupride.GroupRideShareActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.r1;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.EditTabBarActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.material.snackbar.Snackbar;
import gg1.v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lc.u0;
import mt0.q3;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p13.o0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1562c;

    public /* synthetic */ d0(int i14, Object obj, Object obj2) {
        this.f1560a = i14;
        this.f1561b = obj;
        this.f1562c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v31, types: [com.garmin.android.apps.connectmobile.training.atp.create.steps.a$b, com.garmin.android.apps.connectmobile.training.atp.create.steps.b] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        y0<bi1.a> y0Var;
        y0<bi1.a> y0Var2;
        List<com.garmin.android.apps.connectmobile.devices.model.b0> list;
        nr.b bVar;
        e23.a<Unit> aVar;
        Intent intent;
        int i14 = this.f1560a;
        Object obj = null;
        Object obj2 = null;
        bi1.a aVarA = null;
        Object obj3 = this.f1562c;
        Object obj4 = this.f1561b;
        switch (i14) {
            case 0:
                o71.b.a aVar2 = (o71.b.a) obj3;
                ((com.garmin.android.apps.connectmobile.performance.b) obj4).f39855b.I8(new com.garmin.android.apps.connectmobile.performance.a.C0729a(aVar2.f130161g, aVar2.f130166l));
                return;
            case 1:
                ((com.garmin.android.apps.connectmobile.performance.b) obj4).f39855b.I8(new com.garmin.android.apps.connectmobile.performance.a.b(((o71.b.C2480b) obj3).f130170g));
                return;
            case 2:
                com.garmin.android.apps.connectmobile.performance.b bVar2 = (com.garmin.android.apps.connectmobile.performance.b) obj4;
                Map<LocalDate, o71.e.c> map = ((o71.e) obj3).f130177b;
                o71.i iVar = bVar2.f39859f;
                e32.l<com.garmin.android.apps.connectmobile.performance.a> lVar = bVar2.f39855b;
                int i15 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39874c[iVar.z4().ordinal()];
                if (i15 == 1) {
                    if (map != null) {
                        lVar.I8(new com.garmin.android.apps.connectmobile.performance.a.d(c53.c0.u(new c53.c(c53.c0.o(c53.q.c(c53.c0.p(p13.h0.M(map.values()), new o62.a(8)), new o3(16)), new o62.a(9)), new com.google.maps.android.compose.clustering.d(21)))));
                        return;
                    } else {
                        kg.f.n("No stats available");
                        return;
                    }
                }
                if (i15 != 2) {
                    u0.r();
                    return;
                }
                if (map == null) {
                    kg.f.n("No stats available");
                    return;
                }
                Collection<o71.e.c> collectionValues = map.values();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    List<com.garmin.android.apps.connectmobile.performance.dto.d> list2 = ((o71.e.c) it.next()).f130187b;
                    if (list2 != null) {
                        arrayList.add(list2);
                    }
                }
                ArrayList arrayListS = p13.y.s(arrayList);
                ArrayList arrayList2 = new ArrayList(p13.y.r(arrayListS, 10));
                Iterator it3 = arrayListS.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((com.garmin.android.apps.connectmobile.performance.dto.d) it3.next()).b());
                }
                List<com.garmin.android.apps.connectmobile.performance.dto.c> listB1 = p13.h0.b1(p13.h0.f1(arrayList2));
                i0.f1604c.getClass();
                Set<String> setKeySet = i0.f1607f.keySet();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : setKeySet) {
                    String str = (String) obj5;
                    if (listB1 == null || !listB1.isEmpty()) {
                        for (com.garmin.android.apps.connectmobile.performance.dto.c cVar : listB1) {
                            i0.f1604c.getClass();
                            if (i0.a.a(cVar, str)) {
                                arrayList3.add(obj5);
                            }
                            break;
                        }
                    }
                }
                lVar.I8(new com.garmin.android.apps.connectmobile.performance.a.e(p13.h0.g1(arrayList3)));
                return;
            case 3:
                Context context = (Context) obj3;
                MultiLineImeEditText multiLineImeEditText = ((GCMEditTextTrainingInitiative) obj4).f34926b;
                if (String.valueOf(multiLineImeEditText.getText()).equals(context.getString(R.string.no_value))) {
                    multiLineImeEditText.setText("");
                }
                multiLineImeEditText.setFocusable(true);
                multiLineImeEditText.requestFocus();
                multiLineImeEditText.setCursorVisible(true);
                multiLineImeEditText.setPressed(true);
                multiLineImeEditText.invalidate();
                Object systemService = context.getSystemService("input_method");
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                if (inputMethodManager != null) {
                    inputMethodManager.toggleSoftInput(2, 0);
                    return;
                }
                return;
            case 4:
                int i16 = a2.f11811f;
                ((com.garmin.android.apps.connectmobile.repcounting.model.e) obj4).f41123m = true;
                ((a2) obj3).f11816e.Q1(-1L, null);
                return;
            case 5:
                int i17 = b2.f11835f;
                ((com.garmin.android.apps.connectmobile.repcounting.model.e) obj4).f41123m = true;
                ((b2) obj3).f11840e.Q1(-1L, null);
                return;
            case 6:
                int i18 = d2.f11903g;
                ((com.garmin.android.apps.connectmobile.repcounting.model.e) obj3).f41123m = true;
                q3 q3Var = ((d2) obj4).f11908e;
                if (q3Var != null) {
                    q3Var.Q1(-1L, null);
                    return;
                }
                return;
            case 7:
                f2.g gVar = (f2.g) obj3;
                ((f2) obj4).f11940c.c5(gVar.getBindingAdapterPosition(), gVar.f11953b.isChecked());
                return;
            case 8:
                int i19 = h2.f11979f;
                ((com.garmin.android.apps.connectmobile.repcounting.model.e) obj4).f41123m = true;
                ((h2) obj3).f11984e.Q1(-1L, null);
                return;
            case 9:
                ?? r14 = ((com.garmin.android.apps.connectmobile.training.atp.create.steps.a) obj4).f45242e;
                if (r14 != 0) {
                    r14.C(obj3);
                    return;
                }
                return;
            case 10:
                az1.e eVar = (az1.e) obj4;
                fg0.k kVar = (fg0.k) obj3;
                zy1.b bVar3 = eVar.f13724b;
                if (bVar3 != null) {
                    EventDetailsActivity.a aVar3 = EventDetailsActivity.f45692o;
                    Context contextRequireContext = eVar.requireContext();
                    contextRequireContext.getClass();
                    aVar3.getClass();
                    kVar.getClass();
                    Intent intent2 = new Intent(contextRequireContext, (Class<?>) EventDetailsActivity.class);
                    intent2.putExtra("GCM_extra_sharable_event_dto", kVar);
                    Intent intentPutExtra = intent2.putExtra("navigating_from_event_dashboard", true);
                    intentPutExtra.getClass();
                    bVar3.N7(intentPutExtra);
                    return;
                }
                return;
            case 11:
                bi1.t tVar = (bi1.t) obj3;
                bi1.c.a aVar4 = bi1.c.f18016c;
                bi1.r rVar = (bi1.r) ((bi1.c) obj4).f18017a.getValue();
                bi1.v vVarD = rVar.f18064a.d();
                if (vVarD == null || (y0Var = rVar.f18065b.get(vVarD)) == null) {
                    return;
                }
                bi1.a aVarD = y0Var.d();
                y0Var.m(aVarD != null ? bi1.a.a(aVarD, null, tVar, 3) : null);
                return;
            case 12:
                bi1.h.a aVar5 = bi1.h.f18034b;
                ((bi1.r) ((bi1.h) obj4).f18035a.getValue()).f18064a.m((bi1.v) obj3);
                return;
            case 13:
                NumberPicker numberPicker = (NumberPicker) obj4;
                bi1.k kVar2 = (bi1.k) obj3;
                w1 w1Var = kVar2.f18045a;
                o13.t tVar2 = kVar2.f18046b;
                bi1.k.a aVar6 = bi1.k.f18044d;
                if (numberPicker.getValue() == 0) {
                    bi1.u uVar = (bi1.u) tVar2.getValue();
                    bi1.u uVar2 = bi1.u.Top;
                    if (uVar == uVar2) {
                        uVar2 = bi1.u.Bottom;
                    }
                    bi1.a aVarX4 = ((bi1.r) w1Var.getValue()).x4();
                    if (((aVarX4 == null || (list = aVarX4.f18013b) == null) ? null : list.get(uVar2.f18086a)) == com.garmin.android.apps.connectmobile.devices.model.b0.NONE) {
                        androidx.fragment.app.v fragmentManager = kVar2.getFragmentManager();
                        if (fragmentManager != null) {
                            androidx.fragment.app.a aVar7 = new androidx.fragment.app.a(fragmentManager);
                            bi1.l.f18052a.getClass();
                            aVar7.j(0, new bi1.l(), "InvalidSelectionAlertDialog", 1);
                            aVar7.d(null);
                            aVar7.e();
                            return;
                        }
                        return;
                    }
                }
                bi1.r rVar2 = (bi1.r) w1Var.getValue();
                List<? extends com.garmin.android.apps.connectmobile.devices.model.b0> list3 = kVar2.f18047c;
                if (list3 == null) {
                    p005kotlin.jvm.internal.s.m("supportedComplications");
                    throw null;
                }
                com.garmin.android.apps.connectmobile.devices.model.b0 b0Var = list3.get(numberPicker.getValue());
                bi1.u uVar3 = (bi1.u) tVar2.getValue();
                b0Var.getClass();
                uVar3.getClass();
                bi1.v vVarD2 = rVar2.f18064a.d();
                if (vVarD2 != null && (y0Var2 = rVar2.f18065b.get(vVarD2)) != null) {
                    bi1.a aVarD2 = y0Var2.d();
                    if (aVarD2 != null) {
                        ArrayList arrayListD1 = p13.h0.d1(aVarD2.f18013b);
                        arrayListD1.set(uVar3.f18086a, b0Var);
                        aVarA = bi1.a.a(aVarD2, arrayListD1, null, 5);
                    }
                    y0Var2.m(aVarA);
                }
                kVar2.dismiss();
                return;
            case 14:
                bi2.f fVar = (bi2.f) obj4;
                DialogInterface dialogInterface = (DialogInterface) obj3;
                EditText editText = fVar.f18144i;
                if (fVar.m(editText.getText())) {
                    fVar.f18137b.n(fVar.f18138c, fVar.f18139d, editText.getText());
                    dialogInterface.dismiss();
                    return;
                }
                Editable text = editText.getText();
                text.getClass();
                if (text.length() == 0) {
                    dialogInterface.dismiss();
                    return;
                }
                return;
            case 15:
                GroupRideShareActivity groupRideShareActivity = (GroupRideShareActivity) obj4;
                cn0.b bVar4 = (cn0.b) obj3;
                GroupRideShareActivity.a aVar8 = GroupRideShareActivity.f36417i;
                Intent intent3 = new Intent("android.intent.action.SEND");
                intent3.setType("text/plain");
                intent3.addFlags(1);
                com.garmin.android.apps.connectmobile.groupride.a aVar9 = groupRideShareActivity.f36424f;
                if (aVar9 == null) {
                    p005kotlin.jvm.internal.s.m("formatter");
                    throw null;
                }
                bVar4.getClass();
                intent3.putExtra("android.intent.extra.SUBJECT", aVar9.f36438a.a(R.string.msg_group_ride_code_share, bVar4.getCode()));
                com.garmin.android.apps.connectmobile.groupride.a aVar10 = groupRideShareActivity.f36424f;
                if (aVar10 == null) {
                    p005kotlin.jvm.internal.s.m("formatter");
                    throw null;
                }
                String code = bVar4.getCode();
                l22.b bVar5 = aVar10.f36438a;
                String string = bVar5.getString(R.string.instr_group_ride_code_share);
                String strA = bVar5.a(R.string.msg_group_ride_code_share_details, code);
                code.getClass();
                v0.T.getClass();
                String string2 = Uri.parse(v0.a.b().b() + bn0.k.f19007b + "?id=" + code).toString();
                string2.getClass();
                intent3.putExtra("android.intent.extra.TEXT", j20.x.d(string, "\n\n", strA, "\n", string2));
                int i24 = j2.f23107a;
                List<ResolveInfo> listQueryIntentActivities = groupRideShareActivity.getPackageManager().queryIntentActivities(intent3, 65536);
                listQueryIntentActivities.getClass();
                if (listQueryIntentActivities.size() > 0) {
                    groupRideShareActivity.startActivity(Intent.createChooser(intent3, groupRideShareActivity.getString(R.string.sharing_title)));
                    return;
                }
                return;
            case 16:
                ((bp2.a) obj4).f19422b.c(new bp2.a.e.b((zo2.a) obj3));
                return;
            case 17:
                ((bp2.d) obj4).f19459b.c(new bp2.d.b.a((zo2.a) obj3));
                return;
            case 18:
                zm.p pVar = (zm.p) obj4;
                bq.c cVar2 = (bq.c) obj3;
                im.e eVar2 = new im.e(pVar.getF113498h1(), pVar.K0(), cVar2.f19478d);
                androidx.media3.exoplayer.w wVar = cVar2.f19479e;
                if (wVar == null) {
                    p005kotlin.jvm.internal.s.m("onChartSelectedCallback");
                    throw null;
                }
                List list4 = wVar.f9872b;
                im.k.a aVar11 = im.k.f94150e;
                for (Object obj6 : list4) {
                    if (((nr.b) obj6).f126986d.getF113498h1() == eVar2.f94141a) {
                        obj2 = obj6;
                        bVar = (nr.b) obj2;
                        if (bVar != null || (aVar = bVar.f126989g) == null) {
                            return;
                        }
                        aVar.invoke();
                        return;
                    }
                }
                bVar = (nr.b) obj2;
                if (bVar != null) {
                    return;
                } else {
                    return;
                }
            case 19:
                zw2.b bVar6 = (zw2.b) obj4;
                bv2.e eVar3 = (bv2.e) obj3;
                int i25 = bv2.e.f21474h;
                int i26 = zw2.b.C3867b.f207279a[bVar6.f207275d.ordinal()];
                cx2.h hVar = bVar6.f207273b;
                if (i26 == 1) {
                    hVar.getClass();
                    intent = new Intent("android.settings.BLUETOOTH_SETTINGS");
                } else {
                    hVar.getClass();
                    intent = new Intent("android.intent.action.VIEW", Uri.parse(bVar6.f207282a.getString(R.string.rts_pairing_issue_FAQ_url_path)));
                }
                eVar3.getContext().startActivity(intent);
                return;
            case 20:
                bv2.m mVar = (bv2.m) obj3;
                int i27 = bv2.m.f21539j;
                cx2.i.f56681a.getClass();
                if (cx2.i.a.b((Fragment) obj4)) {
                    mVar.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(mVar.getContext().getString(R.string.rts_preferred_activity_tracker_learn_more_FAQ_url_path))));
                    return;
                }
                return;
            case 21:
                com.garmin.android.apps.connectmobile.devices.model.y yVar = (com.garmin.android.apps.connectmobile.devices.model.y) obj3;
                ci1.b bVar7 = ci1.b.this;
                if (yVar.equals(bVar7.f27669i.get(1)) && bVar7.f27669i.get(2).f34328a.equals("APP_NATIVE_ID_HEART_RATE")) {
                    bVar7.f27664d = 2;
                    bVar7.f27665e = false;
                }
                if (yVar.f34330c) {
                    yVar.f34330c = false;
                    bVar7.f27669i.remove(yVar);
                    List<com.garmin.android.apps.connectmobile.devices.model.y> list5 = bVar7.f27669i;
                    int i28 = e22.a.f62640a;
                    list5.getClass();
                    Iterator it4 = p13.h0.j1(list5).iterator();
                    while (true) {
                        o0 o0Var = (o0) it4;
                        if (o0Var.f134956a.hasNext()) {
                            Object next = o0Var.next();
                            T t7 = ((p13.m0) next).f134952b;
                            int i29 = e22.a.f62640a;
                            Set<String> set = ci1.b.f27660n;
                            if (bVar7.t((com.garmin.android.apps.connectmobile.devices.model.y) t7)) {
                                obj = next;
                            }
                        } else {
                            p13.m0 m0Var = (p13.m0) obj;
                            bVar7.f27669i.add((m0Var != null ? m0Var.f134951a : -1) + 1, yVar);
                        }
                    }
                } else {
                    yVar.f34330c = true;
                    bVar7.f27669i.remove(yVar);
                    bVar7.f27669i.add(bVar7.f27663c + 1, yVar);
                }
                Set<String> set2 = ci1.b.f27660n;
                bVar7.A();
                bVar7.z(bVar7.f27669i);
                bVar7.r();
                bVar7.notifyDataSetChanged();
                return;
            case 22:
                com.garmin.androiddynamicsettings.app.presentationlayer.a aVar12 = (com.garmin.androiddynamicsettings.app.presentationlayer.a) obj4;
                int i30 = com.garmin.androiddynamicsettings.app.presentationlayer.a.c.f50683d;
                aVar12.getClass();
                int i34 = aVar12.f50679b;
                int adapterPosition = ((com.garmin.androiddynamicsettings.app.presentationlayer.a.c) obj3).getAdapterPosition();
                aVar12.f50679b = adapterPosition;
                if (i34 != adapterPosition) {
                    aVar12.notifyItemChanged(adapterPosition);
                    aVar12.notifyItemChanged(i34);
                    return;
                }
                return;
            case 23:
                com.garmin.android.library.mapsdkadapter.i.d dVar = (com.garmin.android.library.mapsdkadapter.i.d) obj4;
                r1 r1Var = (r1) obj3;
                int i35 = r1.f41076d;
                if (dVar != com.garmin.android.library.mapsdkadapter.i.d.GOOGLE) {
                    i2.a.c(i2.f36769a, "GCMMapPreviewSection", "Baidu map is unavailable");
                    return;
                }
                Dialog errorDialog = GooglePlayServicesUtil.getErrorDialog(-1, r1Var.requireActivity(), -1);
                if (errorDialog != null) {
                    errorDialog.show();
                    return;
                }
                return;
            case 24:
                ((com.garmin.android.apps.connectmobile.connectiq.w.f) obj4).f32073a.invoke((o10.b) obj3);
                return;
            case 25:
                ((Snackbar) obj4).lambda$setAction$0((View.OnClickListener) obj3, view2);
                return;
            case 26:
                fu1.h hVar2 = (fu1.h) obj3;
                cu1.l lVar2 = ((cu1.a) obj4).f55611c;
                if (lVar2 != null) {
                    lVar2.I0(hVar2);
                    return;
                }
                return;
            case 27:
                xw1.o oVar = (xw1.o) obj3;
                cu1.l lVar3 = ((cu1.a) obj4).f55611c;
                if (lVar3 != null) {
                    lVar3.P(oVar);
                    return;
                }
                return;
            case 28:
                EditTabBarActivity editTabBarActivity = (EditTabBarActivity) obj4;
                String[] strArr = (String[]) obj3;
                String str2 = EditTabBarActivity.f45352f;
                if (str2 == null) {
                    p005kotlin.jvm.internal.s.m("newItem");
                    throw null;
                }
                String[] strArr2 = new String[3];
                for (int i36 = 0; i36 < 3; i36++) {
                    strArr2[i36] = ((GCMCheckableRow) editTabBarActivity.f45353a.get(i36)).isChecked() ? str2 : strArr[i36];
                }
                f12.l.f68084a.getClass();
                f12.l.a.a().t2(strArr2);
                editTabBarActivity.setResult(-1);
                editTabBarActivity.finish();
                return;
            default:
                fu1.t tVar3 = (fu1.t) obj4;
                cu1.w wVar2 = (cu1.w) obj3;
                fu1.a aVar13 = tVar3.f73554a;
                Long scheduleWorkoutId = aVar13 != null ? aVar13.f73505a.getScheduleWorkoutId() : null;
                fu1.a aVar14 = tVar3.f73554a;
                boolean zM = aVar14 != null ? aVar14.f73505a.m() : false;
                fu1.a aVar15 = tVar3.f73554a;
                boolean zO = aVar15 != null ? aVar15.f73505a.o() : false;
                if (scheduleWorkoutId != null) {
                    long jLongValue = scheduleWorkoutId.longValue();
                    cu1.l lVar4 = wVar2.f55715b;
                    if (lVar4 != null) {
                        lVar4.q0(jLongValue, zM, zO);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
