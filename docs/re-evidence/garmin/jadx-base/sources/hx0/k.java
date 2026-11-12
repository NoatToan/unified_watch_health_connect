package hx0;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import c22.l3;
import c22.m3;
import ch.qos.logback.classic.Logger;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupActivityFeedTypeMainFragment;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupActivityFeedTypeSubTypeSelectionFragment;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.RangeCalendarDay;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.MCTSetupActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.charts.ActivityTimeChartFullscreenActivity;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import ig1.a1;
import ig1.e2;
import ig1.g2;
import ig1.m1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f86092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f86093c;

    public /* synthetic */ k(int i14, Object obj, Object obj2) {
        this.f86091a = i14;
        this.f86092b = obj;
        this.f86093c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [hx0.b0] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, k32.e] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
        f fVar;
        RangeCalendarDay.b bVarX;
        s0 s0Var;
        s0 s0Var2;
        LocalDate localDatePlusDays;
        c22.h0 h0VarI;
        s0 s0Var3;
        s0 s0Var4;
        jj1.a.InterfaceC1904a interfaceC1904a;
        u0 u0Var;
        com.garmin.android.apps.connectmobile.onboarding.education.a.c cVar;
        int i14 = this.f86091a;
        int i15 = 4;
        Unit unit = null;
        Unit unit2 = null;
        int i16 = 0;
        int i17 = 1;
        Object obj = this.f86093c;
        Object obj2 = this.f86092b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                Context context = ((View) obj).getContext();
                context.getClass();
                ((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d) obj2).startActivityForResult(MCTSetupActivity.a.a(MCTSetupActivity.f39100c, context, 6), 104);
                return;
            case 1:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d dVar = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d) obj2;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                ax0.a aVar3 = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
                Context contextRequireContext = dVar.requireContext();
                contextRequireContext.getClass();
                aVar3.C(contextRequireContext, dVar.S6(), false, (db1.m) obj);
                return;
            case 2:
                d0 d0Var = (d0) obj2;
                d0.a aVar4 = (d0.a) obj;
                int i18 = d0.a.f86041c;
                ArrayList<b0> arrayList = d0Var.f86039e;
                ?? r14 = d0Var.f86037c;
                b0 b0Var = arrayList.get(aVar4.getBindingAdapterPosition());
                b0Var.getClass();
                b0 b0Var2 = b0Var;
                aVar4.f86042a.b(!b0Var2.f86024b);
                if (!d0Var.f86035a && b0Var2.f86024b) {
                    d0.r(d0Var, aVar4.getBindingAdapterPosition());
                }
                if (r14 != null && r14.f86024b) {
                    if (r14.equals(b0Var2)) {
                        d0.r(d0Var, aVar4.getBindingAdapterPosition());
                    } else {
                        ex0.a aVar5 = d0Var.f86040f.get(r14.f86023a);
                        if (aVar5 != null) {
                            aVar5.b(false);
                        }
                    }
                }
                n0 n0Var = d0Var.f86038d;
                if (n0Var != null) {
                    n0Var.B0();
                    return;
                }
                return;
            case 3:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i iVar = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i) obj2;
                RangeCalendarDay rangeCalendarDay = (RangeCalendarDay) obj;
                int i19 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.c.f39000d;
                boolean zU = iVar.u();
                HashSet<LocalDate> hashSet = iVar.f38988f;
                if (!zU) {
                    if (rangeCalendarDay.getDate() != null) {
                        LocalDate date = rangeCalendarDay.getDate();
                        date.getClass();
                        if (date.isAfter(LocalDate.now()) || (fVar = iVar.f38984b) == null) {
                            return;
                        }
                        LocalDate date2 = rangeCalendarDay.getDate();
                        date2.getClass();
                        fVar.f2(date2);
                        return;
                    }
                    return;
                }
                view2.getClass();
                RangeCalendarDay rangeCalendarDay2 = (RangeCalendarDay) view2;
                LocalDate date3 = rangeCalendarDay2.getDate();
                if (date3 == null || iVar.f38986d.compareTo((ReadablePartial) date3) < 0) {
                    return;
                }
                RangeCalendarDay.b editState = rangeCalendarDay2.getEditState();
                int i24 = editState != null ? com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.c.a.f39004a[editState.ordinal()] : -1;
                if (i24 == 1 || i24 == 2 || i24 == 3) {
                    com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.r(iVar, date3, true);
                    hashSet.remove(date3);
                    bVarX = iVar.x(date3);
                } else if (i24 == 4) {
                    hashSet.add(date3);
                    com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.r(iVar, date3, false);
                    bVarX = (date3.compareTo((ReadablePartial) LocalDate.now()) <= 0 || hashSet.contains(LocalDate.now())) ? iVar.x(date3) : RangeCalendarDay.b.FuturePeriodStart;
                } else if (i24 != 5) {
                    return;
                } else {
                    bVarX = RangeCalendarDay.b.FuturePeriodStart;
                }
                rangeCalendarDay2.m(bVarX);
                if (!hashSet.contains(date3)) {
                    if (LocalDate.now().compareTo((ReadablePartial) date3) < 0) {
                        if (!hashSet.contains(LocalDate.now())) {
                            LocalDate localDateG = jg.b.G(date3);
                            i52.a.f91796a.getClass();
                            LocalDate localDatePlusDays2 = localDateG.plusDays(i52.a.b() - 1);
                            localDatePlusDays2.getClass();
                            iVar.t(o53.f0.I(localDateG, localDatePlusDays2));
                            return;
                        }
                        c22.h0 h0VarI2 = o53.f0.I(jg.b.G(date3), iVar.f38986d);
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            LocalDate localDate = (LocalDate) it.next();
                            localDate.getClass();
                            if (j23.g.a.a(h0VarI2, localDate)) {
                                it.remove();
                            }
                        }
                        iVar.f38986d = date3;
                        iVar.D(h0VarI2);
                        return;
                    }
                    if (!p005kotlin.jvm.internal.s.g(LocalDate.now(), date3) || !com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.A(hashSet)) {
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.A(hashSet) || LocalDate.now().compareTo((ReadablePartial) iVar.f38986d) >= 0) {
                            return;
                        }
                        LocalDate localDate2 = iVar.f38986d;
                        LocalDate localDateNow = LocalDate.now();
                        localDateNow.getClass();
                        iVar.f38986d = localDateNow;
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            LocalDate localDate3 = (LocalDate) it3.next();
                            localDate3.getClass();
                            if ((LocalDate.now().compareTo((ReadablePartial) localDate3) < 0) == true) {
                                it3.remove();
                            }
                        }
                        LocalDate localDateNow2 = LocalDate.now();
                        localDateNow2.getClass();
                        iVar.D(o53.f0.I(jg.b.G(localDateNow2), localDate2));
                        return;
                    }
                    LocalDate localDateNow3 = LocalDate.now();
                    localDateNow3.getClass();
                    LocalDate localDateG2 = jg.b.G(localDateNow3);
                    if (hashSet.contains(localDateG2)) {
                        LocalDate localDateNow4 = LocalDate.now();
                        localDateNow4.getClass();
                        if (!hashSet.contains(jg.b.J(localDateNow4))) {
                            i52.a.f91796a.getClass();
                            LocalDate localDatePlusDays3 = localDateG2.plusDays(i52.a.b() - 1);
                            localDatePlusDays3.getClass();
                            iVar.t(o53.f0.I(localDateG2, localDatePlusDays3));
                            return;
                        }
                    }
                    LocalDate localDate4 = iVar.f38986d;
                    LocalDate localDateNow5 = LocalDate.now();
                    localDateNow5.getClass();
                    iVar.f38986d = localDateNow5;
                    Iterator it4 = hashSet.iterator();
                    while (it4.hasNext()) {
                        LocalDate localDate5 = (LocalDate) it4.next();
                        localDate5.getClass();
                        if ((LocalDate.now().compareTo((ReadablePartial) localDate5) < 0) == true) {
                            it4.remove();
                        }
                    }
                    iVar.D(o53.f0.I(localDateG2, localDate4));
                    return;
                }
                HashMap<LocalDate, s0> map = iVar.f38992j;
                if (date3.compareTo((ReadablePartial) LocalDate.now()) >= 0) {
                    if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.A(hashSet)) {
                        if (!date3.equals(LocalDate.now())) {
                            if (hashSet.contains(LocalDate.now())) {
                                LocalDate localDateG3 = jg.b.G(iVar.f38986d);
                                iVar.f38986d = localDateG3;
                                iVar.C(localDateG3);
                                return;
                            } else {
                                i52.a.f91796a.getClass();
                                LocalDate localDatePlusDays4 = date3.plusDays(i52.a.b() - 1);
                                localDatePlusDays4.getClass();
                                iVar.t(o53.f0.I(date3, localDatePlusDays4));
                                return;
                            }
                        }
                        LocalDate localDateNow6 = LocalDate.now();
                        localDateNow6.getClass();
                        if (hashSet.contains(jg.b.G(localDateNow6))) {
                            LocalDate localDateNow7 = LocalDate.now();
                            localDateNow7.getClass();
                            iVar.D(o53.f0.I(jg.b.G(localDateNow7), iVar.f38986d));
                            return;
                        }
                        Iterator it5 = hashSet.iterator();
                        while (it5.hasNext()) {
                            LocalDate localDate6 = (LocalDate) it5.next();
                            localDate6.getClass();
                            if ((localDate6.compareTo((ReadablePartial) LocalDate.now()) > 0) == true) {
                                it5.remove();
                            }
                        }
                        LocalDate localDate7 = iVar.f38986d;
                        LocalDate localDateNow8 = LocalDate.now();
                        localDateNow8.getClass();
                        iVar.f38986d = jg.b.G(localDateNow8);
                        LocalDate localDateNow9 = LocalDate.now();
                        localDateNow9.getClass();
                        LocalDate localDateJ = localDateNow9;
                        while (hashSet.contains(jg.b.J(localDateJ))) {
                            localDateJ = jg.b.J(localDateJ);
                        }
                        c22.h0 h0VarI3 = o53.f0.I(localDateJ, com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.B(localDateNow9, hashSet));
                        LocalDate localDate8 = h0VarI3.f23062b;
                        LocalDate localDate9 = h0VarI3.f23061a;
                        i52.a.f91796a.getClass();
                        int iB = i52.a.b();
                        if (lc.u0.e(localDate9, localDate8, 1) < iB) {
                            LocalDate localDatePlusDays5 = localDate9.plusDays(iB - 1);
                            LocalDate localDateG4 = jg.b.G(localDate8);
                            localDatePlusDays5.getClass();
                            Iterator<LocalDate> it6 = o53.f0.I(localDateG4, localDatePlusDays5).iterator();
                            while (true) {
                                c22.h0.a aVar6 = (c22.h0.a) it6;
                                if (aVar6.hasNext()) {
                                    LocalDate localDate10 = (LocalDate) aVar6.next();
                                    s0 s0Var5 = map.get(localDate10);
                                    if ((s0Var5 != null && s0Var5.f86170g && (s0Var2 = map.get(localDate10)) != null && s0Var2.f86171h) || (s0Var = map.get(localDate10)) == null || !s0Var.f86170g) {
                                        hashSet.add(localDate10);
                                    }
                                } else {
                                    LocalDate localDateG5 = jg.b.G(localDatePlusDays5);
                                    iVar.f38986d = localDateG5;
                                    if (localDate7.compareTo((ReadablePartial) localDateG5) < 0) {
                                        localDate7 = iVar.f38986d;
                                    }
                                }
                            }
                        }
                        LocalDate localDateNow10 = LocalDate.now();
                        localDateNow10.getClass();
                        iVar.D(o53.f0.I(jg.b.G(localDateNow10), localDate7));
                        return;
                    }
                    return;
                }
                i52.a.f91796a.getClass();
                int iB2 = i52.a.b();
                if (iB2 < 2) {
                    return;
                }
                LocalDate localDateMinusDays = date3.minusDays(6);
                localDateMinusDays.getClass();
                LocalDate localDatePlusDays6 = date3.plusDays(iB2 + 5);
                localDatePlusDays6.getClass();
                Iterator<LocalDate> it7 = o53.f0.I(localDateMinusDays, localDatePlusDays6).iterator();
                while (true) {
                    c22.h0.a aVar7 = (c22.h0.a) it7;
                    if (aVar7.hasNext()) {
                        LocalDate localDate11 = (LocalDate) aVar7.next();
                        if (!localDate11.equals(date3) && hashSet.contains(localDate11)) {
                            return;
                        }
                    } else {
                        boolean zA = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.A(hashSet);
                        if (zA) {
                            localDatePlusDays = date3.plusDays(iB2 - 1);
                        } else {
                            LocalDate localDatePlusDays7 = date3.plusDays(iB2 - 1);
                            localDatePlusDays7.getClass();
                            LocalDate localDateNow11 = LocalDate.now();
                            localDateNow11.getClass();
                            localDatePlusDays = (LocalDate) r13.b.e(localDatePlusDays7, localDateNow11);
                        }
                        LocalDate localDateG6 = jg.b.G(date3);
                        localDatePlusDays.getClass();
                        Iterator<LocalDate> it8 = o53.f0.I(localDateG6, localDatePlusDays).iterator();
                        while (true) {
                            c22.h0.a aVar8 = (c22.h0.a) it8;
                            if (!aVar8.hasNext()) {
                                if (LocalDate.now().compareTo((ReadablePartial) localDatePlusDays) > 0 || !zA) {
                                    h0VarI = o53.f0.I(jg.b.G(date3), localDatePlusDays);
                                } else {
                                    LocalDate localDate12 = iVar.f38986d;
                                    iVar.f38986d = jg.b.G(localDatePlusDays);
                                    Iterator it9 = hashSet.iterator();
                                    while (it9.hasNext()) {
                                        LocalDate localDate13 = (LocalDate) it9.next();
                                        localDate13.getClass();
                                        if ((iVar.f38986d.compareTo((ReadablePartial) localDate13) <= 0) == true) {
                                            it9.remove();
                                        }
                                    }
                                    h0VarI = o53.f0.I(jg.b.G(date3), (LocalDate) r13.b.d(jg.b.G(localDatePlusDays), localDate12));
                                }
                                iVar.D(h0VarI);
                                return;
                            }
                            LocalDate localDate14 = (LocalDate) aVar8.next();
                            s0 s0Var6 = map.get(localDate14);
                            if ((s0Var6 != null && s0Var6.f86170g && (s0Var4 = map.get(localDate14)) != null && s0Var4.f86171h) || (s0Var3 = map.get(localDate14)) == null || !s0Var3.f86170g) {
                                hashSet.add(localDate14);
                            }
                        }
                    }
                }
                break;
            case 4:
                GroupChallengePlayerDTO groupChallengePlayerDTO = (GroupChallengePlayerDTO) obj;
                UserProfileActivity.a aVar9 = UserProfileActivity.f46494x;
                Context context2 = ((i10.a) obj2).f86997d;
                String str = groupChallengePlayerDTO.f31539c;
                str.getClass();
                String str2 = groupChallengePlayerDTO.f31538b;
                String str3 = groupChallengePlayerDTO.f31540d;
                aVar9.getClass();
                UserProfileActivity.a.c(context2, str, str2, str3);
                return;
            case 5:
                ((com.garmin.android.apps.connectmobile.contacts.edit.a.C0530a) obj2).f32530a.requestFocus();
                com.garmin.android.apps.connectmobile.contacts.edit.a.f fVar2 = ((com.garmin.android.apps.connectmobile.contacts.edit.a) obj).f32525a;
                if (fVar2 != null) {
                    fVar2.A8(null);
                    return;
                }
                return;
            case 6:
                ((com.garmin.android.apps.connectmobile.contacts.edit.a.b) obj2).f32531a.requestFocus();
                com.garmin.android.apps.connectmobile.contacts.edit.a.f fVar3 = ((com.garmin.android.apps.connectmobile.contacts.edit.a) obj).f32525a;
                if (fVar3 != null) {
                    fVar3.W8(null);
                    return;
                }
                return;
            case 7:
                i20.x xVar = (i20.x) obj2;
                int i25 = i20.x.b.f87228c;
                int bindingAdapterPosition = ((i20.x.b) obj).getBindingAdapterPosition();
                i20.r rVar = xVar.f87226a;
                List<l20.d> list = xVar.f87227b;
                Iterator<l20.d> it10 = list.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        i16 = -1;
                    } else if (!p005kotlin.jvm.internal.s.g(it10.next(), rVar.f87184a)) {
                        i16++;
                    }
                }
                if (i16 == bindingAdapterPosition) {
                    return;
                }
                l20.d dVar2 = list.get(bindingAdapterPosition);
                rVar.getClass();
                dVar2.getClass();
                rVar.f87184a = dVar2;
                xVar.notifyItemChanged(bindingAdapterPosition);
                if (i16 != -1) {
                    xVar.notifyItemChanged(i16);
                    return;
                }
                return;
            case 8:
                i20.y yVar = (i20.y) obj2;
                int i26 = i20.y.b.f87233d;
                int bindingAdapterPosition2 = ((i20.y.b) obj).getBindingAdapterPosition();
                ?? r15 = yVar.f87232b;
                i20.r rVar2 = yVar.f87231a;
                Iterator it11 = r15.iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        i16 = -1;
                    } else if (!p005kotlin.jvm.internal.s.g(rVar2.f87190g, (f20.c0) it11.next())) {
                        i16++;
                    }
                }
                if (i16 == bindingAdapterPosition2) {
                    return;
                }
                rVar2.f87190g = (f20.c0) r15.get(bindingAdapterPosition2);
                yVar.notifyItemChanged(bindingAdapterPosition2);
                if (i16 != -1) {
                    yVar.notifyItemChanged(i16);
                    return;
                }
                return;
            case 9:
                ig1.h hVar = (ig1.h) obj2;
                WeakReference weakReference = (WeakReference) obj;
                int[] iArr = ig1.h.f93330j;
                double dF = ((com.garmin.android.apps.connectmobile.devices.model.f) hVar.f70344b).F();
                int i27 = 0;
                while (true) {
                    int[] iArr2 = ig1.h.f93330j;
                    if (i27 < 2) {
                        int i28 = (int) dF;
                        double d14 = iArr2[i27];
                        m3 m3VarR = ig1.h.r();
                        l3.f23124b.getClass();
                        if (i28 == ((int) l3.a.h(d14, m3VarR))) {
                            i16 = i27;
                        } else {
                            i27++;
                        }
                    }
                }
                CharSequence[] charSequenceArrQ = hVar.q();
                androidx.appcompat.app.e.a aVar10 = new androidx.appcompat.app.e.a(hVar.f70343a);
                aVar10.setTitle(R.string.lbl_distance).setSingleChoiceItems(charSequenceArrQ, i16, new ig1.g(hVar, charSequenceArrQ));
                Activity activity = (Activity) weakReference.get();
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                aVar10.create().show();
                return;
            case 10:
                ig1.d0 d0Var2 = (ig1.d0) obj2;
                com.garmin.android.apps.connectmobile.devices.model.f fVar4 = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
                int i29 = ig1.d0.f93294l;
                m3 m3VarR2 = d0Var2.r(fVar4);
                int i30 = 0;
                while (true) {
                    m3[] m3VarArr = d0Var2.f93296k;
                    if (i30 < m3VarArr.length) {
                        if (m3VarR2 == m3VarArr[i30]) {
                            i16 = i30;
                        } else {
                            i30++;
                        }
                    }
                }
                CharSequence[] charSequenceArrS = d0Var2.s();
                androidx.appcompat.app.e.a aVar11 = new androidx.appcompat.app.e.a(d0Var2.f70343a);
                aVar11.setTitle(R.string.lbl_units).setSingleChoiceItems(charSequenceArrS, i16, new hg1.g(8, d0Var2, fVar4));
                aVar11.create().show();
                oe2.f.f0(aVar11.show(), d0Var2.f70343a.getString(R.string.lbl_miles), d0Var2.f70343a.getString(R.string.lbl_kilometers));
                return;
            case 11:
                m1 m1Var = (m1) obj2;
                com.garmin.android.apps.connectmobile.devices.model.f fVar5 = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
                int i34 = m1.f93365j;
                Context context3 = m1Var.f70343a;
                new com.garmin.android.apps.connectmobile.settings.activityoptions.d(context3, context3.getString(R.string.run_mode_alerts_setting_virtual_pacer), new hc0.c(i15, m1Var, fVar5), hg1.j.ALERT_TYPE_VIRTUAL_PACER, fVar5.J0());
                return;
            case 12:
                e2 e2Var = (e2) obj2;
                int i35 = e2.f93302k;
                rk1.b.C2900b c2900b = new rk1.b.C2900b(e2Var.f70343a);
                c2900b.e(1);
                c2900b.d(100);
                rk1.b.d dVar3 = c2900b.f153344b;
                dVar3.f153345a = 1;
                dVar3.f153346b = e2Var.b(R.string.lbl_length);
                c2900b.c(Integer.valueOf(e2Var.f93303j));
                c2900b.f(new a1(i17, e2Var, (com.garmin.android.apps.connectmobile.devices.model.f) obj));
                c2900b.b().show();
                return;
            case 13:
                g2 g2Var = (g2) obj2;
                com.garmin.android.apps.connectmobile.devices.model.f fVar6 = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
                int i36 = g2.f93329j;
                new com.garmin.android.apps.connectmobile.settings.activityoptions.e(g2Var.f70343a, new hc0.c(7, g2Var, fVar6), fVar6.E0());
                return;
            case 14:
                com.garmin.android.apps.connectmobile.activities.charts.a aVar12 = (com.garmin.android.apps.connectmobile.activities.charts.a) obj2;
                ?? r16 = (k32.e) obj;
                Object obj3 = r16.f102677b;
                boolean z14 = aVar12.f28957c;
                com.garmin.android.apps.connectmobile.activities.charts.a.InterfaceC0444a interfaceC0444a = aVar12.f28956b;
                if (z14) {
                    obj3.getClass();
                    interfaceC0444a.c6((zm.p) obj3);
                    boolean zB = r16.b();
                    r16.c(!zB);
                    if (zB) {
                        interfaceC0444a.v6();
                    } else {
                        obj3.getClass();
                        interfaceC0444a.c6((zm.p) obj3);
                    }
                    for (k32.e<Object> eVar : aVar12.f28960f) {
                        if (!r16.equals(eVar)) {
                            eVar.c(false);
                        }
                    }
                    return;
                }
                return;
            case 15:
                com.garmin.android.apps.connectmobile.activities.charts.c cVar2 = (com.garmin.android.apps.connectmobile.activities.charts.c) obj2;
                k32.e eVar2 = (k32.e) obj;
                if (cVar2.f28978g && cVar2.f28974c > 0) {
                    boolean zB2 = eVar2.b();
                    ArrayList<k32.e<Object>> arrayList2 = cVar2.f28977f;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator<k32.e<Object>> it12 = arrayList2.iterator();
                        while (it12.hasNext()) {
                            if (it12.next().b() && (i16 = i16 + 1) < 0) {
                                p13.x.p();
                                throw null;
                            }
                        }
                    }
                    if (zB2 || i16 < cVar2.f28974c) {
                        if (!zB2 || i16 > cVar2.f28975d) {
                            boolean z15 = !zB2;
                            eVar2.c(z15);
                            Object obj4 = eVar2.f102677b;
                            com.garmin.android.apps.connectmobile.activities.charts.c.b bVar = cVar2.f28973b;
                            if (bVar != null) {
                                bVar.A6(obj4, z15);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                int i37 = com.garmin.feature.garminpay.ui.dev.devices.a.c.f51927q;
                ((com.garmin.feature.garminpay.ui.dev.devices.a.b) obj2).a((sd2.f) obj);
                return;
            case 17:
                iv2.g gVar = (iv2.g) obj2;
                DialogInterface dialogInterface = (DialogInterface) obj;
                cx2.i.a aVar13 = cx2.i.f56681a;
                Fragment fragment = gVar.f95233a;
                aVar13.getClass();
                if (!cx2.i.a.a(fragment)) {
                    gVar.f95237e.getClass();
                    return;
                }
                EditText editText = gVar.f95239g;
                if (editText == null) {
                    p005kotlin.jvm.internal.s.m("inputField");
                    throw null;
                }
                if (gVar.a(editText.getText())) {
                    iv2.e eVar3 = gVar.f95234b;
                    dx2.c cVar3 = gVar.f95235c;
                    Map<String, Object> map2 = gVar.f95236d;
                    EditText editText2 = gVar.f95239g;
                    if (editText2 == null) {
                        p005kotlin.jvm.internal.s.m("inputField");
                        throw null;
                    }
                    eVar3.h(cVar3, map2, editText2.getText());
                    dialogInterface.dismiss();
                    return;
                }
                EditText editText3 = gVar.f95239g;
                if (editText3 == null) {
                    p005kotlin.jvm.internal.s.m("inputField");
                    throw null;
                }
                Editable text = editText3.getText();
                text.getClass();
                if (text.length() == 0) {
                    dialogInterface.dismiss();
                    return;
                }
                return;
            case 18:
                Context context4 = (Context) obj2;
                iy0.f fVar7 = (iy0.f) obj;
                ActivityTimeChartFullscreenActivity.f39226a.getClass();
                context4.getClass();
                fVar7.getClass();
                Intent intent = new Intent(context4, (Class<?>) ActivityTimeChartFullscreenActivity.class);
                intent.putExtra("extra_chart_data", fVar7);
                context4.startActivity(intent);
                return;
            case 19:
                ((GroupActivityFeedTypeMainFragment.a.c) obj2).f31385a.invoke((com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b) ((com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a) obj));
                return;
            case 20:
                ((GroupActivityFeedTypeSubTypeSelectionFragment.d.a) obj2).f31407b.invoke((GroupActivityFeedTypeSubTypeSelectionFragment.b) obj);
                return;
            case 21:
                j22.e eVar4 = (j22.e) obj2;
                String str4 = eVar4.f96745a;
                i2.a aVar14 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar14.getClass();
                i2.a.b(a2Var, str4, "showBluetoothPermissionDeniedDialog: positive button clicked");
                ((p005kotlin.jvm.internal.m0) obj).f105804a = true;
                j22.b bVar2 = j22.b.f96736a;
                f.c<String[]> cVar4 = eVar4.f96750f;
                j22.g gVar2 = j22.g.f96759d;
                bVar2.getClass();
                j22.b.v(cVar4, gVar2);
                return;
            case 22:
                jj1.a.b bVar3 = (jj1.a.b) obj2;
                jj1.a aVar15 = (jj1.a) obj;
                if (bVar3.getAbsoluteAdapterPosition() == aVar15.f98956g || (interfaceC1904a = aVar15.f98955f) == null) {
                    return;
                }
                interfaceC1904a.S1(aVar15.f98952c.get(bVar3.getAbsoluteAdapterPosition()));
                return;
            case 23:
                LocalDate localDate15 = (LocalDate) obj2;
                jx0.h hVar2 = (jx0.h) obj;
                int i38 = jx0.h.b.f101462f;
                if (localDate15 == null || (u0Var = hVar2.f101461e) == null) {
                    return;
                }
                u0Var.l0(localDate15);
                return;
            case 24:
                int i39 = com.garmin.android.apps.connectmobile.connections.groups.details.settings.defaultimage.a.C0514a.f31499c;
                ((com.garmin.android.apps.connectmobile.connections.groups.details.settings.defaultimage.a) obj2).f31497a.d6((l10.a) obj);
                return;
            case 25:
                com.garmin.android.apps.connectmobile.onboarding.education.c cVar5 = (com.garmin.android.apps.connectmobile.onboarding.education.c) obj2;
                com.garmin.android.apps.connectmobile.onboarding.education.c.a aVar16 = com.garmin.android.apps.connectmobile.onboarding.education.c.f39715b;
                String string = ((Bundle) obj).getString("argEnumName");
                if (string != null) {
                    com.garmin.android.apps.connectmobile.onboarding.education.a.c.f39699f.getClass();
                    com.garmin.android.apps.connectmobile.onboarding.education.a.c[] cVarArrValues = com.garmin.android.apps.connectmobile.onboarding.education.a.c.values();
                    int length = cVarArrValues.length;
                    while (true) {
                        if (i16 < length) {
                            cVar = cVarArrValues[i16];
                            if (!p005kotlin.jvm.internal.s.g(cVar.name(), string)) {
                                i16++;
                            }
                        } else {
                            cVar = null;
                        }
                    }
                    com.garmin.android.apps.connectmobile.onboarding.education.c.b bVar4 = cVar5.f39716a;
                    if (bVar4 != null) {
                        bVar4.x4(cVar != null ? cVar.f39704c : null);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                String str5 = (String) obj2;
                lh2.k kVar = (lh2.k) obj;
                int i44 = lh2.k.f112507d;
                hi2.d dVar4 = kVar.f112508b;
                if (str5 != null) {
                    dVar4.getClass();
                    kVar.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str5)));
                    unit2 = Unit.INSTANCE;
                }
                if (unit2 == null) {
                    Logger logger = hi2.d.f83889c;
                    dVar4.getClass();
                    return;
                }
                return;
            case 27:
                String str6 = (String) obj2;
                lh2.m mVar = (lh2.m) obj;
                int i45 = lh2.m.f112515d;
                hi2.d dVar5 = mVar.f112516b;
                if (str6 != null) {
                    dVar5.getClass();
                    mVar.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str6)));
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    Logger logger2 = hi2.d.f83889c;
                    dVar5.getClass();
                    return;
                }
                return;
            case 28:
                int i46 = lp1.b.a.f114133h;
                ((lp1.b) obj2).f114130c.invoke((ip1.a) obj);
                return;
            default:
                lp1.g gVar3 = (lp1.g) obj;
                int i47 = lp1.g.a.f114147j;
                DateTime dateTimeAtStartOfDay = ((LocalDate) obj2).toDateTimeAtStartOfDay();
                if (dateTimeAtStartOfDay != null) {
                    gVar3.f114144c.p4(e32.o.f62806i, dateTimeAtStartOfDay);
                    return;
                }
                return;
        }
    }
}
