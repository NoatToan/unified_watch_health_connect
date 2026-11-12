package nw0;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.j1;
import androidx.lifecycle.v1;
import c22.o0;
import c22.t3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgDetailActivity;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.chart.EcgChartActivity;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupDetailMemberListFragment;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupTransferOwnershipActivity;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.EditRepsActivity;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.garmin.realtimesettings.app.baseviews.edittext.utils.StyledInlineTextFieldViewDark;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TreeMap;
import l72.b2;
import l72.c2;
import lc.m0;
import o53.l1;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.r0;
import p3.p1;
import p3.x3;
import r22.t1;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f128074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f128075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f128076d;

    public /* synthetic */ p(e23.a aVar, p1 p1Var, ov1.c cVar) {
        this.f128073a = 13;
        this.f128076d = aVar;
        this.f128074b = p1Var;
        this.f128075c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:186:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:190:0x040c  */
    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code duplicated, block: B:326:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        lc.v vVarF;
        j1 j1VarA;
        String str;
        jv1.o oVar;
        List<jv1.o> list;
        Object next;
        fg0.k kVar;
        fg0.k kVar2;
        j61.f courseProfileDTO;
        a01.a aVar;
        boolean z14;
        Iterable iterableE;
        Character chValueOf;
        String strValueOf;
        t1 t1Var;
        po.h.a aVar2;
        boolean z15 = true;
        Object obj = null;
        switch (this.f128073a) {
            case 0:
                j0 j0Var = (j0) this.f128074b;
                r rVar = (r) this.f128075c;
                e23.a aVar3 = (e23.a) this.f128076d;
                if (j0Var != null) {
                    rVar.B4(null);
                } else {
                    aVar3.invoke();
                }
                return Unit.INSTANCE;
            case 1:
                e23.l lVar = (e23.l) this.f128074b;
                a0 a0Var = (a0) this.f128075c;
                x3 x3Var = (x3) this.f128076d;
                if ((((g0) x3Var.getF182175a()).f128037a instanceof f0.a) || (((g0) x3Var.getF182175a()).f128038b instanceof i0.a)) {
                    lVar.invoke(Boolean.valueOf(a0Var.f127990f));
                } else {
                    a0Var.getClass();
                    ge1.b.T(v1.a(a0Var), null, null, new c0(a0Var, null), 3);
                }
                return Unit.INSTANCE;
            case 2:
                sy0.k kVar3 = (sy0.k) this.f128074b;
                p1 p1Var = (p1) this.f128075c;
                p1 p1Var2 = (p1) this.f128076d;
                kVar3.getClass();
                if (kVar3.f161241i == sy0.m.EVERYONE) {
                    p1Var.setValue(Boolean.TRUE);
                } else {
                    p1Var2.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 3:
                EditRepsActivity editRepsActivity = (EditRepsActivity) this.f128074b;
                p1 p1Var3 = (p1) this.f128075c;
                p1 p1Var4 = (p1) this.f128076d;
                EditRepsActivity.a aVar4 = EditRepsActivity.f49554a;
                Intent intent = new Intent();
                Integer numI = d53.t.i((String) p1Var3.getF182175a());
                intent.putExtra("reps", numI != null ? numI.intValue() : 0);
                intent.putExtra("is_reps_plus_enabled", ((Boolean) p1Var4.getF182175a()).booleanValue());
                editRepsActivity.setResult(-1, intent);
                editRepsActivity.finish();
                return Unit.INSTANCE;
            case 4:
                m32.c.b((Context) this.f128074b, Double.valueOf(((com.garmin.android.apps.connectmobile.workouts.data.model.j0) this.f128075c).J0), v52.f.s(), R.string.lbl_pack_weight, v52.f.s() ? 100.0d : 220.0d, (e23.l) this.f128076d).show();
                return Unit.INSTANCE;
            case 5:
                Context context = (Context) this.f128074b;
                b2 b2Var = (b2) this.f128075c;
                c2 c2Var = (c2) this.f128076d;
                String strName = b2Var.name();
                Locale locale = Locale.ROOT;
                String lowerCase = strName.toLowerCase(locale);
                lowerCase.getClass();
                String strG = p72.d.g(lowerCase);
                String lowerCase2 = c2Var.name().toLowerCase(locale);
                lowerCase2.getClass();
                Toast.makeText(context, com.nimbusds.jose.shaded.gson.internal.a.h(strG, StringUtils.SPACE, p72.d.g(lowerCase2), " button clicked"), 0).show();
                return Unit.INSTANCE;
            case 6:
                p1 p1Var5 = (p1) this.f128074b;
                List list2 = (List) this.f128075c;
                e2.i0 i0Var = (e2.i0) this.f128076d;
                p1Var5.setValue(list2);
                e2.i0.a aVar5 = e2.i0.f62432x;
                i0Var.k(0, 0);
                return Unit.INSTANCE;
            case 7:
                x3 x3Var2 = (x3) this.f128074b;
                Collator collator = (Collator) this.f128075c;
                Context context2 = (Context) this.f128076d;
                List list3 = (List) x3Var2.getF182175a();
                if (list3 == null) {
                    return null;
                }
                collator.getClass();
                List listN0 = p13.h0.N0(list3, new ok0.e.c(collator, context2));
                if (listN0 != null) {
                    return i53.a.e(listN0);
                }
                return null;
            case 8:
                ((e23.p) this.f128074b).invoke((al2.b) this.f128075c, (CoreTransferException) this.f128076d);
                return Unit.INSTANCE;
            case 9:
                zc.d dVar = (zc.d) this.f128074b;
                GroupDetailMemberListFragment groupDetailMemberListFragment = (GroupDetailMemberListFragment) this.f128075c;
                ((p1) this.f128076d).setValue(Boolean.TRUE);
                dVar.e();
                nm0.f fVar = (nm0.f) groupDetailMemberListFragment.f36181b.getValue();
                fVar.f126579d = null;
                fVar.f126580e = null;
                fVar.f126581f.clear();
                ge1.b.T(v1.a(fVar), null, null, new nm0.g(fVar, null), 3);
                return Unit.INSTANCE;
            case 10:
                com.garmin.android.apps.connectmobile.group.details.about.member.a aVar6 = (com.garmin.android.apps.connectmobile.group.details.about.member.a) this.f128074b;
                p1 p1Var6 = (p1) this.f128075c;
                p1 p1Var7 = (p1) this.f128076d;
                GroupTransferOwnershipActivity.a aVar7 = GroupTransferOwnershipActivity.f36209d;
                p1Var6.setValue(((com.garmin.android.apps.connectmobile.group.details.about.member.a.b) aVar6).f36221a);
                p1Var7.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 11:
                m0 m0Var = (m0) this.f128074b;
                pt1.p pVar = (pt1.p) this.f128075c;
                qt1.a aVar8 = (qt1.a) this.f128076d;
                ot1.v vVar = ot1.v.f133840a;
                com.garmin.android.library.mapsdkadapter.i.d dVar2 = pVar.f140951w;
                vVar.getClass();
                if (dVar2 != ((qw0.s) KoinJavaComponent.get$default(qw0.s.class, null, null, 6, null)).l() && (vVarF = m0Var.f()) != null && (j1VarA = vVarF.a()) != null) {
                    j1VarA.f(Boolean.TRUE, "mapSettingsChanged");
                }
                if (!m0Var.n()) {
                    aVar8.E4();
                }
                return Unit.INSTANCE;
            case 12:
                ov1.b bVar = (ov1.b) this.f128074b;
                jv1.o oVar2 = (jv1.o) this.f128075c;
                Double d14 = (Double) this.f128076d;
                ov1.b.a aVar9 = ov1.b.f134135c;
                p2 p2Var = bVar.u6().N0;
                if (oVar2 == null || (str = oVar2.f101105a) == null) {
                    if (d14 != null) {
                        double dDoubleValue = d14.doubleValue();
                        mv1.a aVar10 = (mv1.a) p2Var.getValue();
                        if (aVar10 == null || (list = aVar10.f121171i) == null) {
                            oVar = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    jv1.o oVar3 = (jv1.o) next;
                                    double d15 = oVar3.f101107c;
                                    if (dDoubleValue > oVar3.f101108d || d15 > dDoubleValue) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            oVar = (jv1.o) next;
                        }
                        if (oVar != null) {
                            String str2 = oVar.f101105a;
                            str = str2;
                        }
                    }
                    str = null;
                } else {
                    str = str2;
                }
                if (str != null) {
                    mv1.a aVar11 = (mv1.a) p2Var.getValue();
                    j61.f fVar2 = (aVar11 == null || (kVar2 = aVar11.f121169g) == null || (courseProfileDTO = kVar2.getCourseProfileDTO()) == null) ? new j61.f(d14, str, null, 4, null) : j61.f.b(courseProfileDTO, d14, str, null, 4);
                    mv1.a aVar12 = (mv1.a) p2Var.getValue();
                    fg0.k kVarD = (aVar12 == null || (kVar = aVar12.f121169g) == null) ? null : fg0.k.d(kVar, null, null, fVar2, null, null, null, null, -513);
                    mv1.a aVar13 = (mv1.a) p2Var.getValue();
                    p2Var.setValue(aVar13 != null ? mv1.a.a(aVar13, null, null, null, null, kVarD, null, null, 447) : null);
                }
                return Unit.INSTANCE;
            case 13:
                e23.a aVar14 = (e23.a) this.f128076d;
                p1 p1Var8 = (p1) this.f128074b;
                ov1.c cVar = (ov1.c) this.f128075c;
                ov1.c.a aVar15 = ov1.c.f134143b;
                ArrayList arrayListX = tu1.a.x((List) p1Var8.getF182175a());
                p2 p2Var2 = ((pv1.b) cVar.f134144a.getValue()).V0;
                mv1.d dVar3 = (mv1.d) p2Var2.getValue();
                p2Var2.setValue(dVar3 != null ? new mv1.d(arrayListX, dVar3.f121183b) : null);
                aVar14.invoke();
                return Unit.INSTANCE;
            case 14:
                Fragment fragment = (Fragment) this.f128074b;
                ov2.f fVar3 = (ov2.f) this.f128075c;
                String str3 = (String) this.f128076d;
                int i14 = ov2.f.f134271b;
                StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = fVar3.editTextView;
                ((com.garmin.realtimesettings.app.presentationlayer.c) fragment).f52657q = styledInlineTextFieldViewDark.getEditText();
                styledInlineTextFieldViewDark.getEditText().setText(str3);
                return Unit.INSTANCE;
            case 15:
                e23.l lVar2 = (e23.l) this.f128074b;
                oy0.i iVar = (oy0.i) this.f128075c;
                p1 p1Var9 = (p1) this.f128076d;
                lVar2.invoke(iVar);
                p1Var9.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 16:
                p40.k kVar4 = (p40.k) this.f128074b;
                q40.b bVar2 = (q40.b) this.f128075c;
                ((p1) this.f128076d).setValue(Boolean.FALSE);
                kVar4.invoke(bVar2);
                return Unit.INSTANCE;
            case 17:
                p40.k kVar5 = (p40.k) this.f128074b;
                q40.b bVar3 = (q40.b) this.f128075c;
                ((p1) this.f128076d).setValue(Boolean.FALSE);
                kVar5.invoke(bVar3);
                return Unit.INSTANCE;
            case 18:
                e23.l lVar3 = (e23.l) this.f128074b;
                q40.b bVar4 = (q40.b) this.f128075c;
                ((p1) this.f128076d).setValue(Boolean.FALSE);
                lVar3.invoke(bVar4);
                return Unit.INSTANCE;
            case 19:
                p0 p0Var = (p0) this.f128074b;
                p1 p1Var10 = (p1) this.f128075c;
                p1 p1Var11 = (p1) this.f128076d;
                int i15 = ((a01.a) p1Var10.getF182175a()).f54a;
                int i16 = p0Var.f105807a;
                if (i15 != i16) {
                    a01.a.f48c.getClass();
                    for (Object obj2 : a01.a.f53h) {
                        if (((a01.a) obj2).f54a == i16) {
                            obj = obj2;
                            aVar = (a01.a) obj;
                            if (aVar == null) {
                                aVar = a01.a.TODAY;
                            }
                            p1Var10.setValue(aVar);
                            p1Var11.setValue(Boolean.valueOf(((a01.a) p1Var10.getF182175a()) == a01.a.CUSTOM));
                        }
                    }
                    aVar = (a01.a) obj;
                    if (aVar == null) {
                        aVar = a01.a.TODAY;
                    }
                    p1Var10.setValue(aVar);
                    p1Var11.setValue(Boolean.valueOf(((a01.a) p1Var10.getF182175a()) == a01.a.CUSTOM));
                }
                return Unit.INSTANCE;
            case 20:
                p90.d dVar4 = (p90.d) this.f128074b;
                r0 r0Var = (r0) this.f128075c;
                qm2.a aVar16 = (qm2.a) this.f128076d;
                dVar4.f136471c.p("BleDevicePairUseCase", false);
                dVar4.f136471c.G();
                mv.a.f121121a.getClass();
                mv.a.a();
                dd0.i.f59167a.getClass();
                dd0.i.a();
                um2.b bVar5 = (um2.b) r0Var.f105810a;
                if (bVar5 != null) {
                    synchronized (bVar5.f172023h) {
                        Timer timer = bVar5.f172024i;
                        if (timer != null) {
                            timer.cancel();
                            Unit unit = Unit.INSTANCE;
                        }
                        break;
                    }
                    bVar5.f172022g.j(bVar5.f172028m);
                }
                aVar16.a();
                return Unit.INSTANCE;
            case 21:
                p90.i iVar2 = (p90.i) this.f128074b;
                r0 r0Var2 = (r0) this.f128075c;
                qm2.b bVar6 = (qm2.b) this.f128076d;
                iVar2.f136518c.p("BluetoothClassicDevicePairUseCase", false);
                l1 l1Var = (l1) r0Var2.f105810a;
                if (l1Var != null) {
                    l1Var.c(null);
                }
                synchronized (bVar6.f145661f) {
                    z14 = bVar6.f145667l == null;
                }
                if (z14) {
                    synchronized (bVar6.f145661f) {
                        if (bVar6.f145662g == qm2.b.EnumC2745b.RUNNING) {
                            bm2.d dVar5 = bVar6.f145673r;
                            if (dVar5 == null || ((em2.d) lm2.h.e()).f(dVar5).f128594a == null) {
                                z15 = false;
                            }
                            if (!z15) {
                                bVar6.f145662g = qm2.b.EnumC2745b.CANCELLED;
                                qm2.b.B.warn("***** BTC PAIRING CANCELLED *****");
                                bVar6.d();
                                bVar6.f();
                                String strH = bVar6.h();
                                if (strH != null) {
                                    lm2.g gVar = bVar6.f145658c;
                                    yl2.e eVar = yl2.e.ABORTED;
                                    fm2.c cVar2 = (fm2.c) gVar;
                                    cVar2.getClass();
                                    cVar2.p(da2.j.FINISHED_WITH_FAILURE, strH, eVar, "User Cancelled Pairing");
                                }
                                bVar6.g();
                                Unit unit2 = Unit.INSTANCE;
                                bVar6.m(qm2.k.INVALID);
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 22:
                pa0.m mVar = (pa0.m) this.f128074b;
                e23.a aVar17 = (e23.a) this.f128076d;
                e23.a aVar18 = (e23.a) this.f128075c;
                if (((pa0.m.b) mVar).f136760a) {
                    aVar17.invoke();
                } else {
                    aVar18.invoke();
                }
                return Unit.INSTANCE;
            case 23:
                pa0.h hVar = (pa0.h) this.f128074b;
                e23.a aVar19 = (e23.a) this.f128076d;
                e23.l lVar4 = (e23.l) this.f128075c;
                List<j90.g> list4 = hVar.f136732a;
                if (list4.size() > 1) {
                    aVar19.invoke();
                } else if (list4.size() == 1) {
                    lVar4.invoke(Long.valueOf(((j90.g) p13.h0.b0(list4)).f97815a));
                }
                return Unit.INSTANCE;
            case 24:
                hf0.a aVar20 = (hf0.a) this.f128074b;
                View view2 = (View) this.f128075c;
                EcgDetailActivity ecgDetailActivity = (EcgDetailActivity) this.f128076d;
                EcgDetailActivity.a aVar21 = EcgDetailActivity.f34869p;
                aVar20.a();
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                EcgChartActivity.a aVar22 = EcgChartActivity.f34905a;
                pf0.s sVar = ecgDetailActivity.f34871b;
                if (sVar == null) {
                    p005kotlin.jvm.internal.s.m("ecgFormatter");
                    throw null;
                }
                gf0.a aVar23 = ecgDetailActivity.f34872c;
                if (aVar23 == null) {
                    p005kotlin.jvm.internal.s.m("ecgActivity");
                    throw null;
                }
                String strB = sVar.b(aVar23);
                gf0.d dVar6 = ecgDetailActivity.f34873d;
                aVar22.getClass();
                Intent intent2 = new Intent(ecgDetailActivity, (Class<?>) EcgChartActivity.class);
                intent2.putExtra("CHART_EXTRA", dVar6);
                intent2.putExtra("TITLE_EXTRA", strB);
                ecgDetailActivity.startActivity(intent2);
                return Unit.INSTANCE;
            case 25:
                i53.c cVar3 = (i53.c) this.f128074b;
                x3 x3Var3 = (x3) this.f128075c;
                p1 p1Var12 = (p1) this.f128076d;
                boolean zBooleanValue = ((Boolean) x3Var3.getF182175a()).booleanValue();
                Object f182175a = p1Var12.getF182175a();
                String str4 = (String) (d53.w.J((String) f182175a) ? null : f182175a);
                return (!zBooleanValue || str4 == null) ? cVar3 : i53.a.e(zf.b.f(cVar3, str4, false, new p40.h(11)));
            case 26:
                x3 x3Var4 = (x3) this.f128074b;
                String str5 = (String) this.f128075c;
                x3 x3Var5 = (x3) this.f128076d;
                List list5 = (List) x3Var4.getF182175a();
                boolean zBooleanValue2 = ((Boolean) x3Var5.getF182175a()).booleanValue();
                if (list5.isEmpty()) {
                    return j53.l.b();
                }
                Collator collator2 = Collator.getInstance();
                collator2.setStrength(1);
                List<String> listN1 = p13.h0.N0(list5, collator2);
                if (zBooleanValue2) {
                    ArrayList arrayList = new ArrayList(p13.y.r(listN1, 10));
                    for (String str6 : listN1) {
                        arrayList.add(new pk0.r.b(str6, p005kotlin.jvm.internal.s.g(str5, str6)));
                    }
                    iterableE = i53.a.e(arrayList);
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj3 : listN1) {
                        String str7 = (String) obj3;
                        String strG2 = "#";
                        str7.getClass();
                        String string = d53.w.m0(str7).toString();
                        Character chQ0 = d53.y.q0(string);
                        if (chQ0 != null && !Character.isDigit(chQ0.charValue())) {
                            if (Character.isLetter(chQ0.charValue())) {
                                strValueOf = String.valueOf(chQ0.charValue());
                            } else {
                                int i17 = 0;
                                while (true) {
                                    if (i17 < string.length()) {
                                        char cCharAt = string.charAt(i17);
                                        if (Character.isLetter(cCharAt)) {
                                            chValueOf = Character.valueOf(cCharAt);
                                        } else {
                                            i17++;
                                        }
                                    } else {
                                        chValueOf = null;
                                    }
                                }
                                if (chValueOf != null && (strValueOf = String.valueOf(chValueOf.charValue())) != null) {
                                }
                            }
                            strG2 = sn.a.g(strValueOf);
                        }
                        Object arrayList2 = linkedHashMap.get(strG2);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap.put(strG2, arrayList2);
                        }
                        ((List) arrayList2).add(obj3);
                    }
                    TreeMap treeMap = new TreeMap(new a61.c(new pk0.l(collator2, 0), 16));
                    treeMap.putAll(linkedHashMap);
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : treeMap.entrySet()) {
                        String str8 = (String) entry.getKey();
                        List<String> list6 = (List) entry.getValue();
                        q13.b bVarB = p13.w.b();
                        str8.getClass();
                        bVarB.add(new pk0.r.a(str8));
                        list6.getClass();
                        ArrayList arrayList4 = new ArrayList(p13.y.r(list6, 10));
                        for (String str9 : list6) {
                            arrayList4.add(new pk0.r.b(str9, p005kotlin.jvm.internal.s.g(str5, str9)));
                        }
                        bVarB.addAll(arrayList4);
                        p13.d0.v(arrayList3, p13.w.a(bVarB));
                    }
                    iterableE = arrayList3;
                }
                return i53.a.e(iterableE);
            case 27:
                UpdateBirthdateActivity updateBirthdateActivity = (UpdateBirthdateActivity) this.f128074b;
                JSONObject jSONObject = (JSONObject) this.f128075c;
                com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> interfaceC0995b = (com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b) this.f128076d;
                if (updateBirthdateActivity.f44013b) {
                    updateBirthdateActivity.finish();
                } else {
                    o0 o0Var = updateBirthdateActivity.f44012a;
                    UserSettingsDTO userSettingsDTOB = o0Var.b();
                    JSONObject jSONObjectB = t3.b(userSettingsDTOB.t1(), jSONObject);
                    if (jSONObjectB != null) {
                        updateBirthdateActivity.showProgressOverlay();
                        o0Var.a(userSettingsDTOB, jSONObjectB, interfaceC0995b);
                    } else {
                        updateBirthdateActivity.finish();
                    }
                }
                return Unit.INSTANCE;
            case 28:
                ArrayList arrayList5 = (ArrayList) this.f128074b;
                List<qw0.u> list7 = (List) this.f128075c;
                po.k kVar6 = (po.k) this.f128076d;
                po.k.a aVar24 = po.k.f138917m;
                for (Object obj4 : arrayList5) {
                    if (((t1) obj4).f149897g) {
                        obj = obj4;
                        t1Var = (t1) obj;
                        if (t1Var != null) {
                            for (qw0.u uVar : list7) {
                                aVar2 = kVar6.f138918g;
                                if (aVar2 != null) {
                                    qw0.v vVar2 = uVar.f148348a;
                                    aVar2.c(vVar2, p005kotlin.jvm.internal.s.g(vVar2.name(), t1Var.f149891a));
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                t1Var = (t1) obj;
                if (t1Var != null) {
                    while (r0.hasNext()) {
                        aVar2 = kVar6.f138918g;
                        if (aVar2 != null) {
                            qw0.v vVar3 = uVar.f148348a;
                            aVar2.c(vVar3, p005kotlin.jvm.internal.s.g(vVar3.name(), t1Var.f149891a));
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                e23.p pVar2 = (e23.p) this.f128074b;
                yp.d dVar7 = (yp.d) this.f128075c;
                p1 p1Var13 = (p1) this.f128076d;
                Long lValueOf = Long.valueOf(dVar7.f198609b);
                String str10 = dVar7.f198608a;
                if (str10 == null) {
                    str10 = "";
                }
                pVar2.invoke(lValueOf, str10);
                p1Var13.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ p(int i14, e23.a aVar, Object obj, o13.h hVar) {
        this.f128073a = i14;
        this.f128074b = obj;
        this.f128076d = aVar;
        this.f128075c = hVar;
    }

    public /* synthetic */ p(Object obj, int i14, Object obj2, Object obj3) {
        this.f128073a = i14;
        this.f128074b = obj;
        this.f128075c = obj2;
        this.f128076d = obj3;
    }
}
