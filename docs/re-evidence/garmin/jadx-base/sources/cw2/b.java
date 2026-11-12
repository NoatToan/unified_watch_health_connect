package cw2;

import am.x0;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.RangeCalendar;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.GCMComplexInLineEditText;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancyTwoLineButton;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentLeaderboardRowDTO;
import com.garmin.android.apps.connectmobile.settings.activityoptions.HeartRateAlertsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.g;
import com.garmin.android.apps.connectmobile.social.VideoPlayerActivity;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.tag.TaggableEditText;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import com.garmin.android.apps.connectmobile.userprofile.model.q;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import com.garmin.android.apps.connectmobile.view.view_3_0.PostCommentView;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import com.garmin.feature.garminpay.providers.gpay.challenge.ChallengeActivity;
import com.garmin.proto.generated.WifiSetup;
import di1.m;
import dv0.n;
import e23.l;
import eg1.j;
import er2.p;
import er2.w;
import fu1.u;
import fv1.i;
import gg1.w0;
import hq.h;
import hq.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import li0.d0;
import li0.o;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.t0;
import p13.x;
import p13.y;
import r22.q0;
import wg0.k;
import z10.i3;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f56270c;

    public /* synthetic */ b(int i14, Object obj, Object obj2) {
        this.f56268a = i14;
        this.f56269b = obj;
        this.f56270c = obj2;
    }

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
        Long l14;
        d0 d0Var;
        Editable text;
        PostCommentView.b bVar;
        Long scheduleWorkoutId;
        x0 x0VarC;
        int i14 = this.f56268a;
        int i15 = 2;
        int i16 = 0;
        boolean zContains = true;
        char c14 = 1;
        str = null;
        String str = null;
        Object obj = this.f56270c;
        Object obj2 = this.f56269b;
        switch (i14) {
            case 0:
                int i17 = c.f56271d;
                ((c) obj2).l((String) obj);
                return;
            case 1:
                g.a aVar = g.f43302b;
                ((l) obj2).invoke((WifiSetup.ScannedAccessPoint) obj);
                return;
            case 2:
                m.a aVar2 = m.f59764b;
                ((l) obj2).invoke((WifiSetup.StoredAccessPoint) obj);
                return;
            case 3:
                ConversationCommentDTO conversationCommentDTO = (ConversationCommentDTO) obj;
                int i18 = com.garmin.android.apps.connectmobile.social.e.f44576m;
                bv.g gVar = (bv.g) KoinJavaComponent.get$default(bv.g.class, null, null, 6, null);
                Activity activity = ((com.garmin.android.apps.connectmobile.social.e) obj2).f44577a;
                String str2 = conversationCommentDTO.f44550e;
                str2.getClass();
                gVar.b(activity, str2, conversationCommentDTO.f44551f);
                return;
            case 4:
                VideoPlayerActivity.a aVar3 = VideoPlayerActivity.f44499a;
                ((VideoPlayerActivity) obj2).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((k) obj).f185100c)));
                return;
            case 5:
                ChallengeActivity.a aVar4 = ChallengeActivity.f51119n;
                ((ChallengeActivity) obj2).ca((String) obj);
                return;
            case 6:
                ((dp1.d) obj2).f60650d.invoke((yo1.k) obj);
                return;
            case 7:
                e40.b.c cVar = (e40.b.c) obj2;
                e40.b bVar2 = (e40.b) obj;
                int i19 = e40.b.c.f62840e;
                int bindingAdapterPosition = cVar.getBindingAdapterPosition();
                if (bindingAdapterPosition >= 0) {
                    Object obj3 = bVar2.f62836b.get(bindingAdapterPosition);
                    e40.f.b bVar3 = obj3 instanceof e40.f.b ? (e40.f.b) obj3 : null;
                    if (bVar3 != null) {
                        n nVar = bVar2.f62838d;
                        if (nVar == null || ((Boolean) nVar.invoke(bVar3)).booleanValue()) {
                            int bindingAdapterPosition2 = cVar.getBindingAdapterPosition();
                            e23.a<Unit> aVar5 = bVar2.f62835a;
                            if (bindingAdapterPosition2 < 0) {
                                return;
                            }
                            int i24 = bVar2.f62837c;
                            if (bindingAdapterPosition2 == i24) {
                                bVar2.r(bindingAdapterPosition2);
                                bVar2.f62837c = -1;
                                if (aVar5 != null) {
                                    aVar5.invoke();
                                    return;
                                }
                                return;
                            }
                            bVar2.r(i24);
                            bVar2.r(bindingAdapterPosition2);
                            bVar2.f62837c = bindingAdapterPosition2;
                            if (aVar5 != null) {
                                aVar5.invoke();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                Context context = (Context) obj;
                MultiLineImeEditText multiLineImeEditText = ((GCMComplexInLineEditText) obj2).f40431a;
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
            case 9:
                SegmentLeaderboardRowDTO segmentLeaderboardRowDTO = (SegmentLeaderboardRowDTO) obj2;
                j jVar = j.f64004a;
                ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).j((Activity) obj, segmentLeaderboardRowDTO.f41241q, segmentLeaderboardRowDTO.f41242r, segmentLeaderboardRowDTO.f41240p);
                return;
            case 10:
                eh1.b bVar4 = (eh1.b) obj2;
                bVar4.k(obj);
                bVar4.f(obj);
                i2.k(a2.SETTINGS, "ValueSelectionViewDecorator", "onValueRemoved(): notifyListener with selectedFieldValue=" + obj);
                return;
            case 11:
                int i25 = p.f65105d;
                ((l) obj2).invoke(Integer.valueOf(((p) obj).getBindingAdapterPosition()));
                return;
            case 12:
                int i26 = w.f65129e;
                ((l) obj2).invoke(Integer.valueOf(((w) obj).getBindingAdapterPosition()));
                return;
            case 13:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.a aVar6 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.a) obj2;
                int i27 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.a.b.f40454b;
                List<db1.g> list = aVar6.f40451b;
                db1.g gVar2 = list.get(((com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.a.b) obj).getBindingAdapterPosition());
                Boolean bool = (Boolean) aVar6.f40453d.get(gVar2);
                if (bool == null || !bool.equals(Boolean.TRUE)) {
                    int iA = t0.a(y.r(list, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        linkedHashMap.put((db1.g) it.next(), Boolean.FALSE);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                    aVar6.f40453d = linkedHashMap2;
                    linkedHashMap2.put(gVar2, Boolean.TRUE);
                    LinkedHashMap linkedHashMap3 = aVar6.f40453d;
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap3.entrySet()) {
                        if (((Boolean) entry.getValue()).booleanValue()) {
                            linkedHashMap4.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Set<? extends db1.g> setKeySet = linkedHashMap4.keySet();
                    if (setKeySet.isEmpty()) {
                        Boolean bool2 = (Boolean) aVar6.f40453d.get(gVar2);
                        if (bool2 != null) {
                            aVar6.f40453d.put(gVar2, Boolean.valueOf(!bool2.booleanValue()));
                            return;
                        }
                        return;
                    }
                    for (Object obj4 : list) {
                        int i28 = i16 + 1;
                        if (i16 < 0) {
                            x.q();
                            throw null;
                        }
                        for (db1.g gVar3 : list) {
                            aVar6.notifyItemChanged(i16);
                        }
                        i16 = i28;
                    }
                    com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.a.InterfaceC0761a interfaceC0761a = aVar6.f40452c;
                    if (interfaceC0761a != null) {
                        interfaceC0761a.o(setKeySet);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.c cVar2 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.c) obj2;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.c.b bVar5 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.c.b) obj;
                int i29 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.c.b.f40564b;
                db1.d dVar = cVar2.f40561b.get(bVar5.getBindingAdapterPosition());
                LinkedHashMap linkedHashMap5 = cVar2.f40563d;
                Boolean bool3 = (Boolean) linkedHashMap5.get(dVar);
                if (bool3 != null) {
                    linkedHashMap5.put(dVar, Boolean.valueOf(!bool3.booleanValue()));
                } else {
                    linkedHashMap5.put(dVar, Boolean.FALSE);
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
                    if (((Boolean) entry2.getValue()).booleanValue()) {
                        linkedHashMap6.put(entry2.getKey(), entry2.getValue());
                    }
                }
                Set<? extends db1.d> setKeySet2 = linkedHashMap6.keySet();
                if (setKeySet2.isEmpty()) {
                    Boolean bool4 = (Boolean) linkedHashMap5.get(dVar);
                    if (bool4 != null) {
                        linkedHashMap5.put(dVar, Boolean.valueOf(!bool4.booleanValue()));
                        return;
                    }
                    return;
                }
                cVar2.notifyItemChanged(bVar5.getBindingAdapterPosition());
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.c.a aVar7 = cVar2.f40562c;
                if (aVar7 != null) {
                    aVar7.o(setKeySet2);
                    return;
                }
                return;
            case 15:
                com.garmin.android.apps.connectmobile.devices.targetedselection.l.a aVar8 = (com.garmin.android.apps.connectmobile.devices.targetedselection.l.a) obj2;
                com.garmin.android.apps.connectmobile.devices.targetedselection.e eVar = (com.garmin.android.apps.connectmobile.devices.targetedselection.e) obj;
                int i30 = com.garmin.android.apps.connectmobile.devices.targetedselection.e.f34594c;
                if (aVar8.f34617f) {
                    return;
                }
                eVar.f34595a.a3(aVar8);
                return;
            case 16:
                vt1.f fVar = (vt1.f) obj;
                bw1.b<vt1.f> bVar6 = ((i) obj2).f73725b;
                if (bVar6 == null) {
                    s.m("itemAdapter");
                    throw null;
                }
                bVar6.f21570c = bVar6.f21568a.indexOf(fVar);
                bVar6.notifyDataSetChanged();
                return;
            case 17:
                q0 q0Var = (q0) obj2;
                UserProfileActivity userProfileActivity = (UserProfileActivity) obj;
                UserProfileActivity.a aVar9 = UserProfileActivity.f46494x;
                q0Var.dismiss();
                com.garmin.android.apps.connectmobile.userprofile.i iVarGa = userProfileActivity.ga();
                Context context2 = q0Var.getContext();
                context2.getClass();
                q qVar = userProfileActivity.f46496f;
                Long lJ = qVar != null ? qVar.j() : null;
                com.garmin.android.apps.connectmobile.userprofile.i.e eVar2 = iVarGa.F;
                com.garmin.android.apps.connectmobile.userprofile.i.d dVarD = iVarGa.f46766r.d();
                if (dVarD != null) {
                    d0Var = d0.b(dVarD.f46789b, null, null, null, null, null, lJ, null, 383);
                    l14 = lJ;
                } else {
                    Long l15 = lJ;
                    l14 = l15;
                    d0Var = new d0(null, null, null, null, false, null, null, l15, null, 383, null);
                }
                eVar2.getClass();
                li0.f.b bVar7 = new li0.f.b();
                bVar7.f112666a = new g12.k(iVarGa, i15);
                bVar7.f112667b = new g12.l(iVarGa, bVar7, l14, c14 == true ? 1 : 0);
                Unit unit = Unit.INSTANCE;
                ge1.b.T(eVar2.f112660a, null, null, new o(bVar7, eVar2, d0Var, context2, null), 3);
                return;
            case 18:
                ((gg1.d) obj2).f77204c.o4((gg1.e) obj);
                return;
            case 19:
                com.garmin.android.apps.connectmobile.settings.e.a aVar10 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                ((com.garmin.android.apps.connectmobile.settings.e) obj2).u6((String) obj, null);
                return;
            case 20:
                c22.l lVar = (c22.l) ((Map.Entry) obj).getKey();
                LinkedHashMap linkedHashMap7 = ((w0) obj2).f77361a;
                Iterator it3 = linkedHashMap7.entrySet().iterator();
                while (it3.hasNext()) {
                    ((GCMCheckableRow) ((Map.Entry) it3.next()).getValue()).setChecked(false);
                }
                GCMCheckableRow gCMCheckableRow = (GCMCheckableRow) linkedHashMap7.get(lVar);
                if (gCMCheckableRow != null) {
                    gCMCheckableRow.setChecked(true);
                }
                f12.l.f68084a.getClass();
                f12.l.a.a().h3(lVar);
                c22.m.a(lVar);
                return;
            case 21:
                GroupDTO groupDTO = (GroupDTO) obj;
                h10.b bVar8 = ((h10.f) obj2).f80755c;
                if (bVar8 != null) {
                    bVar8.h9(groupDTO);
                    return;
                }
                return;
            case 22:
                PostCommentView postCommentView = (PostCommentView) obj2;
                int i34 = PostCommentView.f47845f;
                Object systemService2 = postCommentView.getContext().getSystemService("input_method");
                systemService2.getClass();
                ((InputMethodManager) systemService2).hideSoftInputFromWindow(((View) obj).getWindowToken(), 0);
                postCommentView.clearFocus();
                TaggableEditText taggableEditText = postCommentView.f47848c;
                if (taggableEditText == null || (text = taggableEditText.getText()) == null || (bVar = postCommentView.f47850e) == null) {
                    return;
                }
                bVar.m6(text);
                return;
            case 23:
                androidx.fragment.app.m mVar = (androidx.fragment.app.m) obj2;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a aVar11 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a) obj;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.C0766a c0766a = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.f40578o;
                mVar.getSupportFragmentManager();
                String string = mVar.getString(R.string.lbl_name);
                string.getClass();
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = aVar11.f40581b;
                if (gCMPregnancyTwoLineButton == null) {
                    s.m("mPregnancyNameButton");
                    throw null;
                }
                String buttonValueLabel = gCMPregnancyTwoLineButton.getButtonValueLabel();
                xg1.o.a aVar12 = xg1.o.f190914b;
                String str3 = buttonValueLabel == null ? "" : buttonValueLabel;
                String str4 = buttonValueLabel != null ? buttonValueLabel : "";
                aVar12.getClass();
                xg1.o oVarA = xg1.o.a.a(string, str3, str4);
                oVarA.f190915a = new hb1.g(aVar11, mVar);
                oVarA.show(mVar.getSupportFragmentManager(), aVar11.getTag());
                return;
            case 24:
                HeartRateAlertsActivity heartRateAlertsActivity = (HeartRateAlertsActivity) obj2;
                LinearLayout linearLayout = (LinearLayout) obj;
                com.garmin.android.apps.connectmobile.devices.model.f fVar2 = heartRateAlertsActivity.f41681i;
                fVar2.getClass();
                int iH0 = fVar2.h0();
                new androidx.appcompat.app.e.a(heartRateAlertsActivity).setTitle(R.string.devices_lbl_heart_rate_zones).setSingleChoiceItems(heartRateAlertsActivity.f41680h, iH0 == 0 ? 5 : iH0 - 1, new hg1.g(i16, linearLayout, heartRateAlertsActivity)).show();
                return;
            case 25:
                int i35 = hq.g.a.f85015c;
                ((l) obj2).invoke((h) obj);
                return;
            case 26:
                int i36 = com.garmin.android.apps.connectmobile.activities.stats.exercises.b.C0458b.f29868b;
                ((com.garmin.android.apps.connectmobile.activities.stats.exercises.b.c.InterfaceC0459b) obj2).a((com.garmin.android.apps.connectmobile.repcounting.model.d) obj);
                return;
            case 27:
                ((s0) obj2).f85146a.invoke((com.garmin.android.apps.connectmobile.repcounting.model.d) obj);
                return;
            case 28:
                u uVar = (u) obj2;
                hu1.c.a aVar13 = ((hu1.c) obj).f85713c;
                fu1.q qVar2 = uVar.f73557b;
                Long activityId = qVar2 != null ? qVar2.getActivityId() : null;
                WorkoutDTO workoutDTO = uVar.f73558c;
                if (activityId != null) {
                    if (aVar13 != null) {
                        long jLongValue = activityId.longValue();
                        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = uVar.f73559d;
                        if (hVar != null && (x0VarC = hVar.C()) != null) {
                            str = x0VarC.f4358a;
                        }
                        aVar13.b(jLongValue, str);
                        return;
                    }
                    return;
                }
                if (workoutDTO == null || aVar13 == null) {
                    return;
                }
                fu1.q qVar3 = uVar.f73557b;
                long jLongValue2 = (qVar3 == null || (scheduleWorkoutId = qVar3.getScheduleWorkoutId()) == null) ? 0L : scheduleWorkoutId.longValue();
                fu1.q qVar4 = uVar.f73557b;
                boolean zM = qVar4 != null ? qVar4.m() : false;
                fu1.q qVar5 = uVar.f73557b;
                aVar13.a(jLongValue2, zM, qVar5 != null ? qVar5.o() : false);
                return;
            default:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a aVar14 = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a) obj2;
                View view3 = (View) obj;
                if (aVar14.f38864h) {
                    return;
                }
                RangeCalendar rangeCalendar = aVar14.f38867k;
                if (rangeCalendar == null) {
                    s.m("cycleRangeCalendar");
                    throw null;
                }
                if (!rangeCalendar.l()) {
                    i3 i3Var = (i3) aVar14.f38858b.getValue();
                    Context contextRequireContext = aVar14.requireContext();
                    contextRequireContext.getClass();
                    i3Var.x4(contextRequireContext, false, new hx0.g(aVar14, i15));
                    return;
                }
                RangeCalendar rangeCalendar2 = aVar14.f38867k;
                if (rangeCalendar2 == null) {
                    s.m("cycleRangeCalendar");
                    throw null;
                }
                Set<LocalDate> periodDates = rangeCalendar2.getPeriodDates();
                RangeCalendar rangeCalendar3 = aVar14.f38867k;
                if (rangeCalendar3 == null) {
                    s.m("cycleRangeCalendar");
                    throw null;
                }
                Set<LocalDate> updatedPeriodDates = rangeCalendar3.getUpdatedPeriodDates();
                RangeCalendar rangeCalendar4 = aVar14.f38867k;
                if (rangeCalendar4 == null) {
                    s.m("cycleRangeCalendar");
                    throw null;
                }
                LocalDate selectionRangeEnd = rangeCalendar4.getSelectionRangeEnd();
                if (updatedPeriodDates.isEmpty()) {
                    LocalDate localDate = aVar14.u6().f38894m;
                    if (localDate != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj5 : periodDates) {
                            if (!updatedPeriodDates.contains((LocalDate) obj5)) {
                                arrayList.add(obj5);
                            }
                        }
                        zContains = arrayList.contains(localDate);
                    }
                    if (zContains) {
                        new androidx.appcompat.app.e.a(view3.getContext()).setTitle(aVar14.getString(R.string.mct_delete_all_periods)).setMessage(aVar14.getString(R.string.mct_without_period_data)).setPositiveButton(aVar14.getString(R.string.delete_all_title), new c32.c(aVar14, periodDates, updatedPeriodDates, selectionRangeEnd, 6)).setNegativeButton(aVar14.getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).show();
                        return;
                    }
                }
                aVar14.z6(periodDates, updatedPeriodDates, selectionRangeEnd, false);
                return;
        }
    }
}
