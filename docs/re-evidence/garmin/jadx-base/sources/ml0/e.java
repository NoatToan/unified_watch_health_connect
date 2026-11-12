package ml0;

import am.x0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.Editable;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.j1;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.rounds.edit.EditExerciseSetsActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.nutrition.NutritionHydrationActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.a0;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.c0;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.d0;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.h0;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.r0;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.v;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.w0;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.x;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.i0;
import com.garmin.android.apps.connectmobile.v2;
import com.mapbox.maps.TransitionOptions;
import com.mapbox.maps.extension.style.StyleExtensionImpl;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.image.ImageUtils;
import com.mapbox.maps.extension.style.sources.generated.RasterDemSourceKt;
import com.mapbox.maps.extension.style.terrain.generated.TerrainKt;
import gw0.u;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.m0;
import lc.u0;
import mt0.h4;
import mt0.i2;
import mt0.i4;
import mt0.m2;
import nc.w;
import ne2.t;
import ne2.z;
import o53.s0;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p13.t0;
import p13.y;
import p3.p1;
import p3.x3;
import r53.p2;
import rk0.f0;
import rk0.o0;
import v41.b0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f119207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f119208c;

    public /* synthetic */ e(int i14, Object obj, Object obj2) {
        this.f119206a = i14;
        this.f119207b = obj;
        this.f119208c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v40, types: [mp.b] */
    /* JADX WARN: Type inference failed for: r14v46 */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14;
        String string;
        String string2;
        androidx.fragment.app.m activity;
        Boolean boolValueOf;
        Object value;
        Object next;
        Object value2;
        e23.l lVar;
        j1 j1VarA;
        j1 j1VarA2;
        j1 j1VarA3;
        j1 j1VarA4;
        j1 j1VarA5;
        List listK;
        Map mapC;
        i53.d<mp.j, Boolean> dVar;
        ?? r14;
        Object obj2;
        mp.g gVar;
        int i15 = this.f119206a;
        int i16 = 16;
        int i17 = 8;
        int i18 = 6;
        int days = -1;
        int i19 = 10;
        boolean zIsBefore = false;
        int i24 = 2;
        final int i25 = 1;
        i53.c cVar = null;
        Object obj3 = this.f119208c;
        Object obj4 = this.f119207b;
        switch (i15) {
            case 0:
                p pVar = (p) obj4;
                p1 p1Var = (p1) obj3;
                il0.a aVar = (il0.a) obj;
                aVar.getClass();
                if (cl0.e.b()) {
                    p1Var.setValue(Boolean.TRUE);
                } else {
                    ge1.b.T(v1.a(pVar), null, null, new q(pVar, aVar, null), 3);
                }
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.c cVar2 = (com.garmin.android.apps.connectmobile.leaderboard.challenges.c) obj4;
                String str = (String) obj3;
                g3 g3Var = (g3) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.c.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.c.f37365h;
                g3Var.getClass();
                int i26 = com.garmin.android.apps.connectmobile.leaderboard.challenges.c.b.f37373a[g3Var.f35300a.ordinal()];
                if (i26 == 1) {
                    g22.e.l(cVar2);
                } else if (i26 == 2) {
                    g22.e.f(cVar2);
                    AdHocChallengeDTO adHocChallengeDTO = cVar2.f37368c;
                    if (adHocChallengeDTO == null) {
                        p005kotlin.jvm.internal.s.m("challengeDTO");
                        throw null;
                    }
                    adHocChallengeDTO.f37990d = cVar2.f37369d;
                    Toast.makeText(cVar2.requireContext(), cVar2.getString(R.string.txt_error_occurred), 0).show();
                } else {
                    if (i26 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(cVar2);
                    ((mt0.q) cVar2.f37371f.getValue()).f120815b.j(str);
                    cVar2.f37370e = false;
                    ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
                    cVar2.u6();
                }
                return Unit.INSTANCE;
            case 2:
                v vVar = (v) obj4;
                View view2 = (View) obj3;
                v.a aVar3 = v.f37909g;
                com.garmin.android.apps.connectmobile.leaderboard.model.p pVar2 = (com.garmin.android.apps.connectmobile.leaderboard.model.p) ((g3) obj).f35301b;
                if (pVar2 != null) {
                    vVar.f37911b = pVar2;
                    boolean zL0 = pVar2.L0();
                    TextView textView = vVar.f37913d;
                    if (zL0) {
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("joinedTitle");
                            throw null;
                        }
                        textView.setText(vVar.getString(R.string.social_expedition_started_title));
                        TextView textView2 = vVar.f37914e;
                        if (textView2 == null) {
                            p005kotlin.jvm.internal.s.m("challengeDuration");
                            throw null;
                        }
                        textView2.setVisibility(8);
                        TextView textView3 = vVar.f37915f;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("challengeRules");
                            throw null;
                        }
                        textView3.setText(vVar.getString(R.string.social_expedition_started_msg));
                    } else {
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("joinedTitle");
                            throw null;
                        }
                        textView.setText(vVar.getString(R.string.social_badge_challenge_accepted_title));
                        TextView textView4 = vVar.f37914e;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("challengeDuration");
                            throw null;
                        }
                        x xVar = x.f37955a;
                        Context contextRequireContext = vVar.requireContext();
                        contextRequireContext.getClass();
                        DateTime startDate = pVar2.getStartDate();
                        DateTime endDate = pVar2.getEndDate();
                        xVar.getClass();
                        DateTime dateTimeNow = DateTime.now();
                        if (startDate == null || endDate == null) {
                            i14 = -1;
                        } else {
                            zIsBefore = startDate.isBefore(dateTimeNow);
                            int days2 = Days.daysBetween(dateTimeNow.withTimeAtStartOfDay(), startDate.withTimeAtStartOfDay()).getDays();
                            days = Days.daysBetween(dateTimeNow.withTimeAtStartOfDay(), endDate.withTimeAtStartOfDay()).getDays();
                            i14 = days2;
                        }
                        if (!zIsBefore) {
                            if (i14 == 1) {
                                string2 = contextRequireContext.getString(R.string.mct_next_phase_day);
                                string2.getClass();
                            } else {
                                string2 = contextRequireContext.getString(R.string.mct_next_phase_days, String.valueOf(i14));
                                string2.getClass();
                            }
                            if (i14 == 1) {
                                string = contextRequireContext.getString(R.string.lbl_starts, contextRequireContext.getString(R.string.common_tomorrow));
                                string.getClass();
                            } else {
                                string = contextRequireContext.getString(R.string.common_starts_in, string2);
                                string.getClass();
                            }
                        } else if (days == 1) {
                            contextRequireContext.getString(R.string.mct_next_phase_day).getClass();
                            string = contextRequireContext.getString(R.string.lbl_one_day_remaining);
                            string.getClass();
                        } else if (days > 1) {
                            contextRequireContext.getString(R.string.mct_next_phase_days, String.valueOf(days)).getClass();
                            string = contextRequireContext.getString(R.string.lbl_days_remaining, NumberFormat.getInstance().format(days));
                            string.getClass();
                        } else {
                            string = "";
                        }
                        textView4.setText(string);
                        TextView textView5 = vVar.f37915f;
                        if (textView5 == null) {
                            p005kotlin.jvm.internal.s.m("challengeRules");
                            throw null;
                        }
                        textView5.setText(vVar.getString(R.string.social_badge_challenge_accepted_msg));
                    }
                    String strF = pVar2.F();
                    if (strF != null) {
                        Context contextRequireContext2 = vVar.requireContext();
                        contextRequireContext2.getClass();
                        zp0.c cVar3 = new zp0.c(contextRequireContext2);
                        cVar3.f206565e = strF;
                        ImageView imageView = vVar.f37912c;
                        if (imageView == null) {
                            p005kotlin.jvm.internal.s.m("joinedBackgroundImage");
                            throw null;
                        }
                        cVar3.h(imageView);
                    }
                    ((Button) view2.findViewById(R.id.done_button)).setOnClickListener(new lq.g(10, vVar, pVar2));
                }
                return Unit.INSTANCE;
            case 3:
                a0 a0Var = (a0) obj4;
                List list = (List) obj3;
                g3 g3Var2 = (g3) obj;
                a0.a aVar4 = a0.f37297w;
                g3Var2.getClass();
                int i27 = a0.b.f37306a[g3Var2.f35300a.ordinal()];
                if (i27 == 1) {
                    a0Var.w6();
                    i2 i2Var = a0Var.f37302q;
                    if (i2Var != null) {
                        list.getClass();
                        c0 c0Var = i2Var.f120656c;
                        c0Var.getClass();
                        c0Var.f37384d.addAll(list);
                        c0Var.g();
                    }
                    a0Var.X6(list.size());
                } else if (i27 != 2) {
                    a0Var.w6();
                    a0Var.T6(false);
                    a0Var.Y6(false);
                } else {
                    a0Var.G6();
                }
                return Unit.INSTANCE;
            case 4:
                d0 d0Var = (d0) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                g3 g3Var3 = (g3) obj;
                int i28 = d0.E;
                g3Var3.getClass();
                d0Var.D = false;
                int i29 = d0.b.f37416a[g3Var3.f35300a.ordinal()];
                if (i29 == 1) {
                    d0Var.f39649v.f149667d = (d0Var.e7().getCount() - arrayList.size()) + 1;
                    m2 m2VarE7 = d0Var.e7();
                    for (int count = m2VarE7.getCount() - 1; -1 < count; count--) {
                        AdHocChallengePlayerDTO adHocChallengePlayerDTO = (AdHocChallengePlayerDTO) m2VarE7.getItem(count);
                        if (adHocChallengePlayerDTO != null && arrayList.contains(adHocChallengePlayerDTO.f38007a)) {
                            m2VarE7.remove(adHocChallengePlayerDTO);
                        }
                    }
                    if (!arrayList.isEmpty() && (activity = d0Var.getActivity()) != null) {
                        activity.setResult(-1);
                    }
                    d0Var.F6();
                    com.garmin.android.apps.connectmobile.c cVar4 = (com.garmin.android.apps.connectmobile.c) d0Var.getActivity();
                    if (cVar4 != null) {
                        cVar4.hideProgressOverlay();
                    }
                } else if (i29 == 2) {
                    m2 m2VarE8 = d0Var.e7();
                    SparseBooleanArray sparseBooleanArray = m2VarE8.f120715a;
                    if (sparseBooleanArray != null) {
                        sparseBooleanArray.clear();
                        m2VarE8.notifyDataSetChanged();
                    }
                    Toast.makeText(d0Var.getContext(), R.string.txt_error_occurred, 0).show();
                    d0Var.F6();
                    com.garmin.android.apps.connectmobile.c cVar5 = (com.garmin.android.apps.connectmobile.c) d0Var.getActivity();
                    if (cVar5 != null) {
                        cVar5.hideProgressOverlay();
                    }
                } else {
                    if (i29 != 3) {
                        u0.r();
                        return null;
                    }
                    d0Var.S6();
                    androidx.fragment.app.m activity2 = d0Var.getActivity();
                    com.garmin.android.apps.connectmobile.c cVar6 = activity2 instanceof com.garmin.android.apps.connectmobile.c ? (com.garmin.android.apps.connectmobile.c) activity2 : null;
                    if (cVar6 != null) {
                        cVar6.showProgressOverlay();
                    }
                }
                return Unit.INSTANCE;
            case 5:
                com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var2 = (com.garmin.android.apps.connectmobile.leaderboard.model.a0) obj4;
                h0 h0Var = (h0) obj3;
                h0.a aVar5 = h0.f37562o;
                if (((g3) obj).f35301b == null || a0Var2.getBadgeUuid() == null || a0Var2.getBadgeId() == null) {
                    g22.e.c(h0Var);
                } else {
                    h0Var.M6(a0Var2);
                }
                return Unit.INSTANCE;
            case 6:
                r0 r0Var = (r0) obj4;
                Editable editable = (Editable) obj3;
                v2 v2Var = (v2) obj;
                r0.a aVar6 = r0.K0;
                v2Var.getClass();
                if (v2Var instanceof v2.b) {
                    r0Var.A = (mo1.d) ((v2.b) v2Var).f47386a;
                    r0Var.v7(editable);
                } else if (r0Var.isAdded()) {
                    r0Var.hideProgressOverlay();
                    r0Var.n7();
                }
                return Unit.INSTANCE;
            case 7:
                w0 w0Var = (w0) obj4;
                Editable editable2 = (Editable) obj3;
                v2 v2Var2 = (v2) obj;
                w0.a aVar7 = w0.M0;
                v2Var2.getClass();
                if (v2Var2 instanceof v2.b) {
                    w0Var.A = (mo1.d) ((v2.b) v2Var2).f47386a;
                    w0Var.w7(editable2);
                } else if (w0Var.isAdded()) {
                    w0Var.hideProgressOverlay();
                    w0Var.n7();
                }
                return Unit.INSTANCE;
            case 8:
                androidx.lifecycle.w0 w0Var2 = (androidx.lifecycle.w0) obj4;
                h4 h4Var = (h4) obj3;
                i0 i0Var = (i0) obj;
                i4.f120659a.debug("transformUserJoined");
                if (i0Var == null || (boolValueOf = i0Var.getIsAcceptedChallenge()) == null) {
                    boolValueOf = Boolean.valueOf(h4Var.f120603c.length() == 0);
                }
                w0Var2.m(boolValueOf);
                return Unit.INSTANCE;
            case 9:
                u uVar = (u) obj4;
                mw0.o oVar = (mw0.o) ((w13.a) obj3).get(((Integer) obj).intValue());
                if (oVar != null) {
                    p2 p2Var = uVar.f79771l;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, gw0.h0.a((gw0.h0) value, null, oVar, null, false, false, false, false, false, null, 509)));
                } else {
                    uVar.getClass();
                }
                return Unit.INSTANCE;
            case 10:
                p51.c cVar7 = (p51.c) obj4;
                Context context = (Context) obj3;
                if (((Boolean) obj).booleanValue()) {
                    cVar7.getClass();
                    context.getClass();
                    b0 b0Var = cVar7.f136154c;
                    b0Var.getClass();
                    o53.b0 b0Var2 = b0Var.f175571a;
                    x53.c cVar8 = s0.f129406a;
                    ge1.b.T(b0Var2, x53.b.f189152a, null, new v41.a0(b0Var, context, null), 2);
                }
                return Unit.INSTANCE;
            case 11:
                p51.c cVar9 = (p51.c) obj4;
                c.q qVar = (c.q) obj3;
                long jLongValue = ((Long) obj).longValue();
                Iterator it = ((Iterable) cVar9.f136157f.getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        Long l14 = ((com.garmin.android.apps.connectmobile.pacepro.data.dto.b) next).f39764a;
                        if (l14 != null && l14.longValue() == jLongValue) {
                        }
                    } else {
                        next = null;
                    }
                }
                com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar = (com.garmin.android.apps.connectmobile.pacepro.data.dto.b) next;
                if (bVar != null) {
                    b0 b0Var3 = cVar9.f136154c;
                    b0Var3.getClass();
                    p2 p2Var2 = b0Var3.f175574d;
                    do {
                        value2 = p2Var2.getValue();
                    } while (!p2Var2.b(value2, bVar));
                }
                qVar.a(com.garmin.android.library.mapsdkadapter.i.b.WGS84, null);
                return Unit.INSTANCE;
            case 12:
                ((m0) obj4).u((n0) obj3);
                return new w();
            case 13:
                return new nc.x((x3) obj4, (nc.e) obj3);
            case 14:
                Bitmap bitmap = (Bitmap) obj4;
                Bitmap bitmap2 = (Bitmap) obj3;
                StyleExtensionImpl.Builder builder = (StyleExtensionImpl.Builder) obj;
                builder.getClass();
                TransitionOptions.Builder builder2 = new TransitionOptions.Builder();
                builder2.duration(0L);
                builder2.delay(0L);
                builder2.enablePlacementTransitions(Boolean.FALSE);
                TransitionOptions transitionOptionsBuild = builder2.build();
                transitionOptionsBuild.getClass();
                builder.setTransition(transitionOptionsBuild);
                int i30 = 4;
                if (bitmap != null) {
                    lVar = null;
                    builder.addImage(ImageUtils.image$default("unclustered_icon_tag", bitmap, (e23.l) null, 4, (Object) null));
                } else {
                    lVar = null;
                }
                if (bitmap2 != null) {
                    builder.addImage(ImageUtils.image$default("cluster_icon_tag", bitmap2, lVar, 4, lVar));
                }
                builder.addSource(RasterDemSourceKt.rasterDemSource("TERRAIN_SOURCE", new t(i30)));
                builder.setTerrain(TerrainKt.terrain$default("TERRAIN_SOURCE", lVar, 2, lVar));
                return Unit.INSTANCE;
            case 15:
                List<o13.p> list2 = (List) obj4;
                ne2.d0 d0Var2 = (ne2.d0) obj3;
                Expression.InterpolatorBuilder interpolatorBuilder = (Expression.InterpolatorBuilder) obj;
                int i34 = ne2.d0.f125576h;
                interpolatorBuilder.getClass();
                interpolatorBuilder.linear();
                interpolatorBuilder.lineProgress();
                if (list2.isEmpty()) {
                    interpolatorBuilder.stop(new z(d0Var2, 0));
                } else {
                    for (o13.p pVar3 : list2) {
                        final float fFloatValue = ((Number) pVar3.f128594a).floatValue();
                        final o13.u uVar2 = (o13.u) pVar3.f128595b;
                        final int i35 = false ? 1 : 0;
                        interpolatorBuilder.stop(new e23.l() { // from class: ne2.y
                            @Override // e23.l
                            public final Object invoke(Object obj5) {
                                int i36 = i35;
                                final o13.u uVar3 = uVar2;
                                float f14 = fFloatValue;
                                Expression.ExpressionBuilder expressionBuilder = (Expression.ExpressionBuilder) obj5;
                                switch (i36) {
                                    case 0:
                                        int i37 = d0.f125576h;
                                        expressionBuilder.getClass();
                                        expressionBuilder.literal(f14);
                                        final int i38 = 0;
                                        expressionBuilder.rgb(new e23.l() { // from class: ne2.a0
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // e23.l
                                            public final Object invoke(Object obj6) {
                                                int i39 = i38;
                                                o13.u uVar4 = uVar3;
                                                Expression.ExpressionBuilder expressionBuilder2 = (Expression.ExpressionBuilder) obj6;
                                                switch (i39) {
                                                    case 0:
                                                        int i44 = d0.f125576h;
                                                        expressionBuilder2.getClass();
                                                        expressionBuilder2.literal(((Number) uVar4.f128605a).floatValue());
                                                        expressionBuilder2.literal(((Number) uVar4.f128606b).floatValue());
                                                        expressionBuilder2.literal(((Number) uVar4.f128607c).floatValue());
                                                        break;
                                                    default:
                                                        int i45 = d0.f125576h;
                                                        expressionBuilder2.getClass();
                                                        expressionBuilder2.literal(((Number) uVar4.f128605a).floatValue());
                                                        expressionBuilder2.literal(((Number) uVar4.f128606b).floatValue());
                                                        expressionBuilder2.literal(((Number) uVar4.f128607c).floatValue());
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        });
                                        break;
                                    default:
                                        int i39 = d0.f125576h;
                                        expressionBuilder.getClass();
                                        expressionBuilder.literal(f14);
                                        final int i44 = 1;
                                        expressionBuilder.rgb(new e23.l() { // from class: ne2.a0
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // e23.l
                                            public final Object invoke(Object obj6) {
                                                int i310 = i44;
                                                o13.u uVar4 = uVar3;
                                                Expression.ExpressionBuilder expressionBuilder2 = (Expression.ExpressionBuilder) obj6;
                                                switch (i310) {
                                                    case 0:
                                                        int i45 = d0.f125576h;
                                                        expressionBuilder2.getClass();
                                                        expressionBuilder2.literal(((Number) uVar4.f128605a).floatValue());
                                                        expressionBuilder2.literal(((Number) uVar4.f128606b).floatValue());
                                                        expressionBuilder2.literal(((Number) uVar4.f128607c).floatValue());
                                                        break;
                                                    default:
                                                        int i46 = d0.f125576h;
                                                        expressionBuilder2.getClass();
                                                        expressionBuilder2.literal(((Number) uVar4.f128605a).floatValue());
                                                        expressionBuilder2.literal(((Number) uVar4.f128606b).floatValue());
                                                        expressionBuilder2.literal(((Number) uVar4.f128607c).floatValue());
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        });
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            case 16:
                Expression.ExpressionBuilder expressionBuilder = (Expression.ExpressionBuilder) obj;
                int i36 = ne2.d0.f125576h;
                expressionBuilder.getClass();
                expressionBuilder.lineProgress();
                expressionBuilder.rgb(new c2.s0((p005kotlin.jvm.internal.r0) obj3, i19));
                for (o13.p pVar4 : (List) obj4) {
                    final float fFloatValue2 = ((Number) pVar4.f128594a).floatValue();
                    final o13.u uVar3 = (o13.u) pVar4.f128595b;
                    expressionBuilder.stop(new e23.l() { // from class: ne2.y
                        @Override // e23.l
                        public final Object invoke(Object obj5) {
                            int i37 = i25;
                            final o13.u uVar4 = uVar3;
                            float f14 = fFloatValue2;
                            Expression.ExpressionBuilder expressionBuilder2 = (Expression.ExpressionBuilder) obj5;
                            switch (i37) {
                                case 0:
                                    int i38 = d0.f125576h;
                                    expressionBuilder2.getClass();
                                    expressionBuilder2.literal(f14);
                                    final int i39 = 0;
                                    expressionBuilder2.rgb(new e23.l() { // from class: ne2.a0
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // e23.l
                                        public final Object invoke(Object obj6) {
                                            int i310 = i39;
                                            o13.u uVar5 = uVar4;
                                            Expression.ExpressionBuilder expressionBuilder3 = (Expression.ExpressionBuilder) obj6;
                                            switch (i310) {
                                                case 0:
                                                    int i45 = d0.f125576h;
                                                    expressionBuilder3.getClass();
                                                    expressionBuilder3.literal(((Number) uVar5.f128605a).floatValue());
                                                    expressionBuilder3.literal(((Number) uVar5.f128606b).floatValue());
                                                    expressionBuilder3.literal(((Number) uVar5.f128607c).floatValue());
                                                    break;
                                                default:
                                                    int i46 = d0.f125576h;
                                                    expressionBuilder3.getClass();
                                                    expressionBuilder3.literal(((Number) uVar5.f128605a).floatValue());
                                                    expressionBuilder3.literal(((Number) uVar5.f128606b).floatValue());
                                                    expressionBuilder3.literal(((Number) uVar5.f128607c).floatValue());
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                                    break;
                                default:
                                    int i310 = d0.f125576h;
                                    expressionBuilder2.getClass();
                                    expressionBuilder2.literal(f14);
                                    final int i44 = 1;
                                    expressionBuilder2.rgb(new e23.l() { // from class: ne2.a0
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // e23.l
                                        public final Object invoke(Object obj6) {
                                            int i311 = i44;
                                            o13.u uVar5 = uVar4;
                                            Expression.ExpressionBuilder expressionBuilder3 = (Expression.ExpressionBuilder) obj6;
                                            switch (i311) {
                                                case 0:
                                                    int i45 = d0.f125576h;
                                                    expressionBuilder3.getClass();
                                                    expressionBuilder3.literal(((Number) uVar5.f128605a).floatValue());
                                                    expressionBuilder3.literal(((Number) uVar5.f128606b).floatValue());
                                                    expressionBuilder3.literal(((Number) uVar5.f128607c).floatValue());
                                                    break;
                                                default:
                                                    int i46 = d0.f125576h;
                                                    expressionBuilder3.getClass();
                                                    expressionBuilder3.literal(((Number) uVar5.f128605a).floatValue());
                                                    expressionBuilder3.literal(((Number) uVar5.f128606b).floatValue());
                                                    expressionBuilder3.literal(((Number) uVar5.f128607c).floatValue());
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
                return Unit.INSTANCE;
            case 17:
                o53.b0 b0Var4 = (o53.b0) obj4;
                n82.n nVar = (n82.n) obj3;
                t82.f fVar = (t82.f) obj;
                fVar.getClass();
                int i37 = nf1.g.a.f125895a[fVar.ordinal()];
                if (i37 == 1) {
                    ge1.b.T(b0Var4, null, null, new nf1.e(nVar, null), 3);
                } else {
                    if (i37 != 2) {
                        u0.r();
                        return null;
                    }
                    ge1.b.T(b0Var4, null, null, new nf1.f(nVar, null), 3);
                }
                return Unit.INSTANCE;
            case 18:
                m0 m0Var = (m0) obj4;
                GearRoute.b bVar2 = (GearRoute.b) obj3;
                jk0.x xVar2 = (jk0.x) obj;
                GearActivity.a aVar8 = GearActivity.f35500b;
                xVar2.getClass();
                lc.v vVarF = m0Var.f();
                if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                    j1VarA.f(xVar2, "AddGearScreen_Created");
                }
                if (bVar2.f35624a) {
                    f0.INSTANCE.getClass();
                    m0Var.h(new t(12), new GearRoute.i(f0.Companion.a(xVar2), (Long) null, i24, (p005kotlin.jvm.internal.j) (false ? 1 : 0)));
                } else {
                    m0Var.n();
                }
                return Unit.INSTANCE;
            case 19:
                m0 m0Var2 = (m0) obj4;
                jk0.j jVar = (jk0.j) obj;
                GearActivity.a aVar9 = GearActivity.f35500b;
                jVar.getClass();
                lc.v vVarF2 = m0Var2.f();
                if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                    j1VarA2.f(Boolean.TRUE, "AddCollectionScreen_Created");
                }
                String str2 = jVar.f99264c;
                if (str2 != null) {
                    m0Var2.h(new t(i16), new GearRoute.d(str2));
                } else {
                    m0Var2.n();
                }
                return Unit.INSTANCE;
            case 20:
                m0 m0Var3 = (m0) obj4;
                GearActivity gearActivity = (GearActivity) obj3;
                o0 o0Var = (o0) obj;
                GearActivity.a aVar10 = GearActivity.f35500b;
                o0Var.getClass();
                lc.v vVarF3 = m0Var3.f();
                if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                    j1VarA3.f(o0Var, "GearDetailsScreen_Edited");
                }
                if (!m0Var3.n()) {
                    Intent intent = new Intent();
                    intent.putExtra("GearDetailsScreen_Edited", o0Var);
                    gearActivity.setResult(-1, intent);
                    gearActivity.finish();
                }
                return Unit.INSTANCE;
            case 21:
                m0 m0Var4 = (m0) obj4;
                List<jk0.n> list3 = (List) obj;
                GearActivity.a aVar11 = GearActivity.f35500b;
                list3.getClass();
                String str3 = ((GearRoute.i) obj3).f35644a.f153101a;
                ArrayList arrayList2 = new ArrayList(y.r(list3, 10));
                for (jk0.n nVar2 : list3) {
                    nVar2.getClass();
                    arrayList2.add(new y22.w(Uri.parse(nVar2.f99298d), nVar2.f99295a));
                }
                lc.y.l(m0Var4, new GearRoute.n(str3, arrayList2));
                return Unit.INSTANCE;
            case 22:
                m0 m0Var5 = (m0) obj3;
                String str4 = (String) obj;
                GearActivity.a aVar12 = GearActivity.f35500b;
                str4.getClass();
                pk0.f fVar2 = new pk0.f(((GearRoute.q) obj4).f35677b, str4, false, false, 12, null);
                k23.d dVarB = p005kotlin.jvm.internal.s0.f105811a.b(GearRoute.p.class);
                boolean z14 = lc.y.f111902i;
                boolean zO = m0Var5.o(dVarB, true);
                qc.h hVar = m0Var5.f111904b;
                if (zO) {
                    lc.v vVarI = hVar.i();
                    if (vVarI != null && (j1VarA5 = vVarI.a()) != null) {
                        j1VarA5.f(fVar2, "BrandModelSelectionResult");
                    }
                } else {
                    m0Var5.n();
                    lc.v vVarI2 = hVar.i();
                    if (vVarI2 != null && (j1VarA4 = vVarI2.a()) != null) {
                        j1VarA4.f(fVar2, "BrandModelSelectionResult");
                    }
                }
                return Unit.INSTANCE;
            case 23:
                m0 m0Var6 = (m0) obj4;
                List<jk0.n> list4 = (List) obj;
                GearActivity.a aVar13 = GearActivity.f35500b;
                list4.getClass();
                String str5 = ((GearRoute.d) obj3).f35634a;
                ArrayList arrayList3 = new ArrayList(y.r(list4, 10));
                for (jk0.n nVar3 : list4) {
                    nVar3.getClass();
                    arrayList3.add(new y22.w(Uri.parse(nVar3.f99298d), nVar3.f99295a));
                }
                lc.y.l(m0Var6, new GearRoute.m(str5, arrayList3));
                return Unit.INSTANCE;
            case 24:
                long jLongValue2 = ((Long) obj).longValue();
                GearActivity.a aVar14 = GearActivity.f35500b;
                return ((mk0.e) obj4).a((GearActivity) obj3, jLongValue2);
            case 25:
                c80.u uVar4 = (c80.u) obj;
                GearActivity.a aVar15 = GearActivity.f35500b;
                uVar4.getClass();
                ((m0) obj4).h(new t(14), new GearRoute.b(((GearRoute.r) obj3).f35681a, uVar4));
                return Unit.INSTANCE;
            case 26:
                np.c cVar10 = (np.c) obj4;
                o82.g gVar2 = (o82.g) obj3;
                mp.k kVar = (mp.k) obj;
                kVar.getClass();
                cVar10.getClass();
                gVar2.getClass();
                p2 p2Var3 = cVar10.f126788f;
                while (true) {
                    Object value3 = p2Var3.getValue();
                    qp.d dVar2 = (qp.d) value3;
                    String string3 = new np.h(gVar2, kVar).toString();
                    mp.k.a aVar16 = mp.k.f120007d;
                    mp.b bVar3 = (mp.b) cVar10.f126786d.getValue();
                    aVar16.getClass();
                    int i38 = mp.k.a.C2279a.f120031a[kVar.ordinal()];
                    if (i38 == i18) {
                        listK = p13.x.k(mp.j.AVG_WIN_STRESS, mp.j.AVG_LOSS_STRESS, mp.j.AVG_DRAW_STRESS);
                    } else if (i38 == 7) {
                        listK = p13.w.c(mp.j.MATCHES);
                    } else if (i38 == i17) {
                        if (bVar3 instanceof mp.g) {
                            gVar = (mp.g) bVar3;
                        } else {
                            r14 = cVar;
                        }
                        if (r14 != 0) {
                            r14 = gVar;
                            obj2 = r14.f119948a;
                        } else {
                            r14 = gVar;
                            obj2 = cVar;
                        }
                        if (obj2 == x0.E3) {
                            listK = p13.w.c(mp.j.PACK_CALORIE_DETAILS);
                        } else {
                            listK = cVar;
                        }
                    } else {
                        listK = cVar;
                    }
                    i53.c cVarE = listK != null ? i53.a.e(listK) : cVar;
                    if (cVarE != null) {
                        int iA = t0.a(y.r(cVarE, 10));
                        if (iA < 16) {
                            iA = 16;
                        }
                        mapC = new LinkedHashMap(iA);
                        for (Object obj5 : cVarE) {
                            mapC.put(obj5, Boolean.valueOf(p13.w.c(mp.j.PACK_CALORIE_DETAILS).contains((mp.j) obj5)));
                        }
                    } else {
                        mapC = null;
                    }
                    i53.d<String, i53.d<mp.j, Boolean>> dVar3 = dVar2.f146015i;
                    if (dVar3.containsKey(string3) && (dVar = dVar3.get(string3)) != null) {
                        mapC = dVar;
                    }
                    if (mapC == null) {
                        mapC = i53.a.c();
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(dVar3);
                    linkedHashMap.put(string3, i53.a.g(mapC));
                    i53.d dVarG = i53.a.g(linkedHashMap);
                    if (cVarE == null) {
                        cVarE = j53.l.b();
                    }
                    mp.k kVar2 = kVar;
                    if (p2Var3.b(value3, qp.d.a(dVar2, false, false, null, kVar2, null, null, cVarE, dVarG, 111))) {
                        return Unit.INSTANCE;
                    }
                    kVar = kVar2;
                    i17 = 8;
                    i18 = 6;
                    cVar = null;
                }
                break;
            case 27:
                return EditExerciseSetsActivity.ca((EditExerciseSetsActivity) obj4, (com.garmin.android.apps.connectmobile.activities.newmodel.f) obj3, (fw.m) obj);
            case 28:
                nw0.g gVar3 = (nw0.g) obj4;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                gVar3.getClass();
                ge1.b.T(v1.a(gVar3), null, null, new nw0.j(zBooleanValue, gVar3, null), 3);
                ((e23.l) obj3).invoke(Boolean.TRUE);
                return Unit.INSTANCE;
            default:
                NutritionHydrationActivity nutritionHydrationActivity = (NutritionHydrationActivity) obj4;
                ho.d0 d0Var3 = (ho.d0) obj3;
                g3 g3Var4 = (g3) obj;
                NutritionHydrationActivity.a aVar17 = NutritionHydrationActivity.f33067b;
                if (g3Var4 != null) {
                    int i39 = NutritionHydrationActivity.c.f33072a[g3Var4.f35300a.ordinal()];
                    if (i39 == 1) {
                        nutritionHydrationActivity.showProgressOverlay();
                    } else if (i39 == 2) {
                        nutritionHydrationActivity.hideProgressOverlay();
                        d0Var3.invoke();
                    } else {
                        if (i39 != 3) {
                            u0.r();
                            return null;
                        }
                        nutritionHydrationActivity.hideProgressOverlay();
                        nutritionHydrationActivity.displayFailedMessage();
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
