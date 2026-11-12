package mt0;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.BadgeChallengeDetailsFragment$updateUI$1", f = "BadgeChallengeDetailsFragment.kt", l = {263, 455}, m = "invokeSuspend", v = 2)
public final class r1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f120835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f120836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.s f120837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.model.p f120838d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.BadgeChallengeDetailsFragment$updateUI$1$6", f = "BadgeChallengeDetailsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f120839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f120840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.model.p f120841c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.s f120842d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ArrayList<ot0.d> f120843e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z14, com.garmin.android.apps.connectmobile.leaderboard.model.p pVar, com.garmin.android.apps.connectmobile.leaderboard.challenges.s sVar, ArrayList<ot0.d> arrayList, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f120840b = z14;
            this.f120841c = pVar;
            this.f120842d = sVar;
            this.f120843e = arrayList;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f120840b, this.f120841c, this.f120842d, this.f120843e, dVar);
            aVar.f120839a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            boolean z14 = this.f120840b;
            String strH = com.airbnb.lottie.animation.keyframe.a.h("displayRules hasGCPlusSocialFeature = ", z14);
            com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar2.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "BadgeChallengeDetailsFragment", strH);
            ArrayList<ot0.d> arrayList = this.f120843e;
            com.garmin.android.apps.connectmobile.leaderboard.challenges.s sVar = this.f120842d;
            if (z14) {
                com.garmin.android.apps.connectmobile.leaderboard.model.p pVar = this.f120841c;
                Integer numN0 = pVar.n0();
                int iIntValue = numN0 != null ? numN0.intValue() : 1;
                if (pVar.k0()) {
                    String string = sVar.getString(R.string.badge_challenge_rule_multiplier_point, new Integer(iIntValue));
                    string.getClass();
                    arrayList.add(new ot0.d(ot0.e.MULTIPLIER_POINT, string));
                }
            }
            com.garmin.android.apps.connectmobile.leaderboard.challenges.s.z6(sVar, arrayList);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120844a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.leaderboard.model.o.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.o.VIRTUAL_HIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.o.VIRTUAL_CLIMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f120844a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.BadgeChallengeDetailsFragment$updateUI$1$hasGCPlusSocialFeature$1", f = "BadgeChallengeDetailsFragment.kt", l = {263}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f120845a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
            return new c(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f120845a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            zd0.j1 j1Var = (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null);
            c80.q qVar = c80.q.SOCIAL;
            this.f120845a = 1;
            Object objL = j1Var.l(qVar, this);
            return objL == aVar ? aVar : objL;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.garmin.android.apps.connectmobile.leaderboard.challenges.s sVar, com.garmin.android.apps.connectmobile.leaderboard.model.p pVar, t13.d<? super r1> dVar) {
        super(2, dVar);
        this.f120837c = sVar;
        this.f120838d = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r1(this.f120837c, this.f120838d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:178:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:185:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:196:0x0629  */
    /* JADX WARN: Code duplicated, block: B:199:0x0641  */
    /* JADX WARN: Code duplicated, block: B:200:0x0643  */
    /* JADX WARN: Code duplicated, block: B:203:0x0657  */
    /* JADX WARN: Code duplicated, block: B:204:0x065f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:205:0x0661  */
    /* JADX WARN: Code duplicated, block: B:206:0x0669  */
    /* JADX WARN: Code duplicated, block: B:212:0x068e  */
    /* JADX WARN: Code duplicated, block: B:213:0x0690  */
    /* JADX WARN: Code duplicated, block: B:216:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:217:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:226:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:234:0x0717  */
    /* JADX WARN: Code duplicated, block: B:237:0x0722  */
    /* JADX WARN: Code duplicated, block: B:238:0x072a  */
    /* JADX WARN: Code duplicated, block: B:246:0x0753  */
    /* JADX WARN: Code duplicated, block: B:249:0x075e  */
    /* JADX WARN: Code duplicated, block: B:250:0x0766  */
    /* JADX WARN: Code duplicated, block: B:253:0x0788  */
    /* JADX WARN: Code duplicated, block: B:254:0x078a  */
    /* JADX WARN: Code duplicated, block: B:257:0x0791  */
    /* JADX WARN: Code duplicated, block: B:259:0x07a9  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        boolean zBooleanValue;
        String string;
        int i14;
        boolean z14;
        int length;
        DateTime joinDateLocal;
        String str;
        String strZ;
        o13.t tVar;
        int i15;
        String strA0;
        int i16;
        String strC0;
        int i17;
        boolean zJ0;
        int i18;
        String string2;
        DateTime joinDateLocal2;
        DateTime badgeEarnedDate;
        int i19;
        int i24;
        String string3;
        int i25;
        String string4;
        boolean zD;
        int i26;
        String badgeUuid;
        String strG;
        int i27;
        int iC;
        int i28;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i29 = this.f120836b;
        com.garmin.android.apps.connectmobile.leaderboard.challenges.s sVar = this.f120837c;
        com.garmin.android.apps.connectmobile.leaderboard.model.p pVar = this.f120838d;
        if (i29 == 0) {
            o13.r.b(obj);
            x53.c cVar = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            c cVar2 = new c(null);
            this.f120836b = 1;
            objE0 = ge1.b.e0(bVar, cVar2, this);
            if (objE0 != aVar) {
            }
            return aVar;
        }
        if (i29 == 1) {
            o13.r.b(obj);
            objE0 = obj;
        } else {
            if (i29 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = this.f120835a;
            o13.r.b(obj);
            pVar = pVar;
            i14 = 0;
        }
        zBooleanValue = z14;
        strZ = pVar.Z();
        o13.t tVar2 = sVar.f37854m;
        tVar = sVar.f37850i;
        o13.t tVar3 = sVar.f37849h;
        o13.t tVar4 = sVar.f37855n;
        o13.t tVar5 = sVar.f37856o;
        Object value = tVar2.getValue();
        value.getClass();
        v22.d.c((TextView) value, strZ);
        Object value2 = sVar.f37854m.getValue();
        value2.getClass();
        TextView textView = (TextView) value2;
        if (strZ != null || strZ.length() == 0) {
            i15 = 8;
        } else {
            i15 = i14;
        }
        textView.setVisibility(i15);
        strA0 = pVar.a0();
        Object value3 = tVar5.getValue();
        value3.getClass();
        v22.d.c((TextView) value3, strA0);
        Object value4 = tVar5.getValue();
        value4.getClass();
        TextView textView2 = (TextView) value4;
        if (strA0 != null || strA0.length() == 0) {
            i16 = 8;
        } else {
            i16 = i14;
        }
        textView2.setVisibility(i16);
        strC0 = pVar.c0();
        Object value5 = tVar4.getValue();
        value5.getClass();
        v22.d.c((TextView) value5, strC0);
        Object value6 = tVar4.getValue();
        value6.getClass();
        TextView textView3 = (TextView) value6;
        if (strC0 != null || strC0.length() == 0 || strA0 == null || strA0.length() == 0) {
            i17 = 8;
        } else {
            i17 = i14;
        }
        textView3.setVisibility(i17);
        zJ0 = pVar.J0();
        Object value7 = tVar3.getValue();
        value7.getClass();
        TextView textView4 = (TextView) value7;
        if (pVar.P0()) {
            i18 = i14;
        } else {
            i18 = 8;
        }
        textView4.setVisibility(i18);
        Object value8 = tVar3.getValue();
        value8.getClass();
        TextView textView5 = (TextView) value8;
        if (pVar.L0()) {
            string2 = sVar.getString(R.string.social_expedition_completed_msg);
        } else if (zJ0) {
            string2 = sVar.getString(R.string.msg_partner_badge_challenge_earned);
        } else {
            string2 = sVar.getString(R.string.msg_badge_challenge_earned);
        }
        textView5.setText(string2);
        joinDateLocal2 = pVar.getJoinDateLocal();
        badgeEarnedDate = pVar.getBadgeEarnedDate();
        if (joinDateLocal2 != null && badgeEarnedDate != null) {
            Object value9 = tVar.getValue();
            value9.getClass();
            TextView textView6 = (TextView) value9;
            if (pVar.P0()) {
                i27 = i14;
            } else {
                i27 = 8;
            }
            textView6.setVisibility(i27);
            LocalDate localDate = joinDateLocal2.toLocalDate();
            localDate.getClass();
            LocalDate localDate2 = badgeEarnedDate.toLocalDate();
            localDate2.getClass();
            iC = o53.f0.I(localDate, localDate2).c();
            if (iC == 1) {
                i28 = R.string.expedition_completed_day_singular;
            } else {
                i28 = R.string.expedition_completed_days_plural;
            }
            Object value10 = tVar.getValue();
            value10.getClass();
            ((TextView) value10).setText(sVar.getString(i28, String.valueOf(iC)));
            Unit unit = Unit.INSTANCE;
        }
        Object value11 = sVar.f37863x.getValue();
        value11.getClass();
        TextView textView7 = (TextView) value11;
        if (zJ0 || (strG = pVar.G()) == null || !(!d53.w.J(strG))) {
            i19 = 8;
        } else {
            i19 = i14;
        }
        textView7.setVisibility(i19);
        v22.d.c(textView7, pVar.G());
        Object value12 = sVar.f37864y.getValue();
        value12.getClass();
        TextView textView8 = (TextView) value12;
        if (pVar.getUserJoined() && (pVar.V0() || pVar.getLimitedCapacity())) {
            i24 = i14;
        } else {
            i24 = 8;
        }
        textView8.setVisibility(i24);
        if (pVar.V0()) {
            string3 = sVar.getString(R.string.lbl_limited_capacity_full_title);
        } else {
            string3 = sVar.getString(R.string.lbl_limited_capacity_title);
        }
        textView8.setText(string3);
        Object value13 = sVar.f37865z.getValue();
        value13.getClass();
        TextView textView9 = (TextView) value13;
        if (pVar.getUserJoined() && (pVar.V0() || pVar.getLimitedCapacity())) {
            i25 = i14;
        } else {
            i25 = 8;
        }
        textView9.setVisibility(i25);
        if (pVar.V0()) {
            string4 = sVar.getString(R.string.msg_limited_capacity_full_description);
        } else {
            string4 = sVar.getString(R.string.msg_limited_capacity_description);
        }
        textView9.setText(string4);
        com.garmin.android.apps.connectmobile.leaderboard.challenges.s.y6(sVar, zBooleanValue);
        zD = g22.n.d(pVar.getPartnerName());
        Object value14 = sVar.A.getValue();
        value14.getClass();
        View view2 = (View) value14;
        if (zD) {
            i26 = i14;
        } else {
            i26 = 8;
        }
        view2.setVisibility(i26);
        if (zD) {
            Object value15 = sVar.B.getValue();
            value15.getClass();
            ((TextView) value15).setText(pVar.getPartnerName());
            badgeUuid = pVar.getBadgeUuid();
            if (badgeUuid != null) {
                Context contextRequireContext = sVar.requireContext();
                contextRequireContext.getClass();
                zp0.c cVar3 = new zp0.c(contextRequireContext);
                String strG2 = uu.i0.g();
                String strI = ((bv.d) KoinJavaComponent.get(bv.d.class)).i();
                String strF = uu.i0.f();
                ((c22.o) KoinJavaComponent.get(c22.o.class)).getClass();
                cVar3.f206565e = String.format(Locale.US, "%s/%simages/badges/%s/logo_%s_sml.png?appVer=".concat(String.valueOf(11657)), strI, strF, strG2, badgeUuid);
                cVar3.f206578r = "cache_availability_today";
                Object value16 = sVar.C.getValue();
                value16.getClass();
                cVar3.h((ImageView) value16);
                Unit unit2 = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
        zBooleanValue = ((Boolean) objE0).booleanValue();
        bv.d dVar = sVar.f37844c;
        o13.t tVar6 = sVar.f37862w;
        o13.t tVar7 = sVar.f37861v;
        o13.t tVar8 = sVar.f37852k;
        o13.t tVar9 = sVar.f37848g;
        o13.t tVar10 = sVar.f37860t;
        gg1.o0 o0VarG = dVar.g();
        Object value17 = sVar.f37846e.getValue();
        value17.getClass();
        ((ViewGroup) value17).setVisibility(0);
        sVar.requireActivity().invalidateOptionsMenu();
        Object value18 = sVar.f37847f.getValue();
        value18.getClass();
        ((TextView) value18).setText(pVar.k());
        if (pVar.L0()) {
            Object value19 = tVar9.getValue();
            value19.getClass();
            TextView textView10 = (TextView) value19;
            Context contextRequireContext2 = sVar.requireContext();
            contextRequireContext2.getClass();
            com.garmin.android.apps.connectmobile.leaderboard.challenges.x xVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.x.f37955a;
            o0VarG.getClass();
            com.garmin.android.apps.connectmobile.leaderboard.model.o oVarC = pVar.C();
            int i30 = oVarC == null ? -1 : com.garmin.android.apps.connectmobile.leaderboard.challenges.x.a.f37957b[oVarC.ordinal()];
            if (i30 == 1) {
                String string5 = contextRequireContext2.getString(R.string.string_space_bullet_string_pattern);
                string5.getClass();
                str = String.format(string5, Arrays.copyOf(new Object[]{contextRequireContext2.getString(R.string.social_adventure_type_hike), pVar.j()}, 2));
            } else if (i30 != 2) {
                str = "";
            } else {
                String string6 = contextRequireContext2.getString(R.string.string_space_bullet_string_pattern);
                string6.getClass();
                str = String.format(string6, Arrays.copyOf(new Object[]{contextRequireContext2.getString(R.string.social_adventure_type_climb), pVar.j()}, 2));
            }
            textView10.setText(str + "\n" + com.garmin.android.apps.connectmobile.leaderboard.challenges.x.c(contextRequireContext2, pVar, o0VarG));
        } else {
            Object value20 = tVar9.getValue();
            value20.getClass();
            Context contextRequireContext3 = sVar.requireContext();
            contextRequireContext3.getClass();
            ((TextView) value20).setText(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.j(contextRequireContext3, pVar.getStartDate(), pVar.getEndDate(), pVar.getUserJoined(), false));
            Object value21 = tVar9.getValue();
            value21.getClass();
            Context contextRequireContext4 = sVar.requireContext();
            contextRequireContext4.getClass();
            ((TextView) value21).setContentDescription(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.j(contextRequireContext4, pVar.getStartDate(), pVar.getEndDate(), pVar.getUserJoined(), true));
        }
        String strA = pVar.A();
        if (strA != null) {
            Context contextRequireContext5 = sVar.requireContext();
            contextRequireContext5.getClass();
            zp0.c cVar4 = new zp0.c(contextRequireContext5);
            cVar4.f206565e = strA;
            cVar4.f206578r = "cache_availability_today";
            Object value22 = sVar.f37851j.getValue();
            value22.getClass();
            cVar4.h((ImageView) value22);
            Unit unit3 = Unit.INSTANCE;
        }
        Object value23 = sVar.f37857p.getValue();
        value23.getClass();
        ((TextView) value23).setOnClickListener(new lq.g(9, pVar, sVar));
        String strH = pVar.h();
        if (strH != null) {
            Context contextRequireContext6 = sVar.requireContext();
            contextRequireContext6.getClass();
            zp0.c cVar5 = new zp0.c(contextRequireContext6);
            cVar5.f206565e = strH;
            cVar5.f206570j = 2131231128;
            cVar5.f206578r = "cache_availability_today";
            Object value24 = tVar8.getValue();
            value24.getClass();
            cVar5.h((ImageView) value24);
            Unit unit4 = Unit.INSTANCE;
        }
        Object value25 = tVar8.getValue();
        value25.getClass();
        ((ImageView) value25).setColorFilter(uu.p.c(pVar.getUserJoined() && !pVar.P0()));
        if (pVar.getUserJoined() && (pVar.S0() || pVar.L0())) {
            Double badgeProgressValue = pVar.getBadgeProgressValue();
            if (badgeProgressValue != null) {
                double dDoubleValue = badgeProgressValue.doubleValue();
                if (pVar.P0()) {
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.s.v6(sVar).setIndicatorColor(a7.b.getColor(sVar.requireContext(), R.color.gcm_challenges_progress_indicator_completed));
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.s.v6(sVar).setProgress(100);
                } else {
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.s.v6(sVar).setIndicatorColor(a7.b.getColor(sVar.requireContext(), R.color.gcm_challenges_progress_indicator));
                    Double badgeTargetValue = pVar.getBadgeTargetValue();
                    Integer num = badgeTargetValue != null ? new Integer((int) ((dDoubleValue / badgeTargetValue.doubleValue()) * ((double) 100))) : null;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.s.v6(sVar).setProgress(num != null ? num.intValue() : 0);
                }
                Object value26 = tVar10.getValue();
                value26.getClass();
                ((Group) value26).setVisibility(0);
                Unit unit5 = Unit.INSTANCE;
            }
            if (pVar.L0()) {
                Object value27 = tVar7.getValue();
                value27.getClass();
                TextView textView11 = (TextView) value27;
                Context contextRequireContext7 = sVar.requireContext();
                contextRequireContext7.getClass();
                Double badgeProgressValue2 = pVar.getBadgeProgressValue();
                double dDoubleValue2 = badgeProgressValue2 != null ? badgeProgressValue2.doubleValue() : 0.0d;
                Double badgeTargetValue2 = pVar.getBadgeTargetValue();
                double dDoubleValue3 = badgeTargetValue2 != null ? badgeTargetValue2.doubleValue() : 0.0d;
                Integer badgeUnitId = pVar.getBadgeUnitId();
                textView11.setText(com.garmin.android.apps.connectmobile.leaderboard.challenges.x.a(contextRequireContext7, dDoubleValue2, dDoubleValue3, badgeUnitId != null ? badgeUnitId.intValue() : 0, o0VarG, false));
                if (!pVar.R0() && (joinDateLocal = pVar.getJoinDateLocal()) != null) {
                    Object value28 = tVar6.getValue();
                    value28.getClass();
                    ((TextView) value28).setVisibility(0);
                    Object value29 = tVar6.getValue();
                    value29.getClass();
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.x xVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.x.f37955a;
                    Context contextRequireContext8 = sVar.requireContext();
                    contextRequireContext8.getClass();
                    xVar2.getClass();
                    String string7 = contextRequireContext8.getString(R.string.lbl_started, c22.j0.n(joinDateLocal, 'M'));
                    string7.getClass();
                    ((TextView) value29).setText(string7);
                    Unit unit6 = Unit.INSTANCE;
                }
            } else {
                Object value30 = tVar7.getValue();
                value30.getClass();
                TextView textView12 = (TextView) value30;
                Context contextRequireContext9 = sVar.requireContext();
                contextRequireContext9.getClass();
                Double badgeProgressValue3 = pVar.getBadgeProgressValue();
                double dDoubleValue4 = badgeProgressValue3 != null ? badgeProgressValue3.doubleValue() : 0.0d;
                Double badgeTargetValue3 = pVar.getBadgeTargetValue();
                double dDoubleValue5 = badgeTargetValue3 != null ? badgeTargetValue3.doubleValue() : 0.0d;
                Integer badgeUnitId2 = pVar.getBadgeUnitId();
                textView12.setText(uu.p.a(contextRequireContext9, dDoubleValue4, dDoubleValue5, badgeUnitId2 != null ? badgeUnitId2.intValue() : 0, false, o0VarG, false));
                Object value31 = tVar7.getValue();
                value31.getClass();
                TextView textView13 = (TextView) value31;
                Context contextRequireContext10 = sVar.requireContext();
                contextRequireContext10.getClass();
                Double badgeProgressValue4 = pVar.getBadgeProgressValue();
                double dDoubleValue6 = badgeProgressValue4 != null ? badgeProgressValue4.doubleValue() : 0.0d;
                Double badgeTargetValue4 = pVar.getBadgeTargetValue();
                double dDoubleValue7 = badgeTargetValue4 != null ? badgeTargetValue4.doubleValue() : 0.0d;
                Integer badgeUnitId3 = pVar.getBadgeUnitId();
                textView13.setContentDescription(uu.p.a(contextRequireContext10, dDoubleValue6, dDoubleValue7, badgeUnitId3 != null ? badgeUnitId3.intValue() : 0, false, o0VarG, false));
            }
            Object value32 = tVar10.getValue();
            value32.getClass();
            ((Group) value32).setVisibility(!pVar.P0() ? 0 : 8);
        } else {
            Object value33 = tVar10.getValue();
            value33.getClass();
            ((Group) value33).setVisibility(8);
        }
        if (!p005kotlin.jvm.internal.s.g(pVar.getJoinable(), Boolean.FALSE) || pVar.getUserJoined()) {
            com.garmin.android.apps.connectmobile.leaderboard.challenges.s.u6(sVar).setVisibility(8);
        } else {
            com.garmin.android.apps.connectmobile.leaderboard.model.o oVarC2 = pVar.C();
            int i34 = oVarC2 != null ? b.f120844a[oVarC2.ordinal()] : -1;
            if (i34 == 1) {
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.u6(sVar).setVisibility(0);
                TextView textViewU6 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.u6(sVar);
                String string8 = sVar.getString(R.string.social_adventure_type_hike);
                string8.getClass();
                String lowerCase = string8.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                textViewU6.setText(sVar.getString(R.string.social_start_expedition_warning_msg, lowerCase));
            } else if (i34 != 2) {
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.u6(sVar).setVisibility(8);
            } else {
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.u6(sVar).setVisibility(0);
                TextView textViewU7 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.u6(sVar);
                String string9 = sVar.getString(R.string.social_adventure_type_climb);
                string9.getClass();
                String lowerCase2 = string9.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                textViewU7.setText(sVar.getString(R.string.social_start_expedition_warning_msg, lowerCase2));
            }
        }
        if (!pVar.L0()) {
            DateTime startDate = pVar.getStartDate();
            DateTime endDate = pVar.getEndDate();
            if (startDate == null || endDate == null) {
                string = sVar.requireContext().getString(R.string.lbl_value_range, com.nimbusds.jose.shaded.gson.internal.a.i("MMMM d", startDate), com.nimbusds.jose.shaded.gson.internal.a.i("MMMM d", endDate));
            } else {
                Context contextRequireContext11 = sVar.requireContext();
                contextRequireContext11.getClass();
                string = new pi0.e(contextRequireContext11).l(startDate, endDate, pi0.f.SHORT_MONTH_NO_WEEKDAY);
            }
            string.getClass();
            ArrayList arrayListD = p13.x.d(new ot0.d(ot0.e.NORMAL, string));
            if (p005kotlin.jvm.internal.s.g(pVar.getIsAutoChallengeLink(), Boolean.TRUE)) {
                ot0.e eVar = ot0.e.AUTO_CHALLENGE_DEPENDENCY;
                String string10 = sVar.getResources().getString(R.string.badges_lbl_auto_challenge_rule);
                string10.getClass();
                com.garmin.android.apps.connectmobile.leaderboard.challenges.t tVar11 = new com.garmin.android.apps.connectmobile.leaderboard.challenges.t(sVar);
                com.garmin.android.apps.connectmobile.leaderboard.challenges.x xVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.x.f37955a;
                d53.k kVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.I;
                xVar3.getClass();
                kVar.getClass();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i35 = 0;
                while (true) {
                    d53.j jVarB = kVar.b(i35, string10);
                    if (jVarB != null) {
                        i14 = 0;
                        spannableStringBuilder.append(string10.subSequence(i35, jVarB.b().f96796a)).append((CharSequence) ((d53.j.a) jVarB.a()).get(1), tVar11, 0);
                        length = jVarB.b().f96797b + 1;
                    } else {
                        i14 = 0;
                        spannableStringBuilder.append(string10.subSequence(i35, string10.length()));
                        length = string10.length();
                    }
                    i35 = length;
                    if (jVarB == null) {
                        break;
                    }
                    pVar = pVar;
                }
                arrayListD.add(new ot0.d(eVar, spannableStringBuilder));
            } else {
                pVar = pVar;
                i14 = 0;
            }
            String strI2 = pVar.I();
            if (strI2 != null && strI2.length() != 0) {
                arrayListD.add(new ot0.d(ot0.e.NORMAL, strI2));
            }
            String strY = pVar.y();
            if (strY != null && strY.length() != 0) {
                arrayListD.add(new ot0.d(ot0.e.NORMAL, strY));
            }
            String strZ2 = pVar.z();
            if (strZ2 != null && strZ2.length() != 0) {
                arrayListD.add(new ot0.d(ot0.e.NORMAL, strZ2));
            }
            x53.c cVar6 = o53.s0.f129406a;
            o53.t1 t1Var = u53.o.f168762a;
            a aVar2 = new a(zBooleanValue, this.f120838d, this.f120837c, arrayListD, null);
            this.f120835a = zBooleanValue;
            this.f120836b = 2;
            if (ge1.b.e0(t1Var, aVar2, this) != aVar) {
                z14 = zBooleanValue;
                zBooleanValue = z14;
            }
            return aVar;
        }
        com.garmin.android.apps.connectmobile.leaderboard.challenges.s.z6(sVar, p13.j0.f134944a);
        pVar = pVar;
        i14 = 0;
        strZ = pVar.Z();
        o13.t tVar12 = sVar.f37854m;
        tVar = sVar.f37850i;
        o13.t tVar13 = sVar.f37849h;
        o13.t tVar14 = sVar.f37855n;
        o13.t tVar15 = sVar.f37856o;
        Object value34 = tVar12.getValue();
        value34.getClass();
        v22.d.c((TextView) value34, strZ);
        Object value35 = sVar.f37854m.getValue();
        value35.getClass();
        TextView textView14 = (TextView) value35;
        if (strZ != null) {
            i15 = 8;
        } else {
            i15 = 8;
        }
        textView14.setVisibility(i15);
        strA0 = pVar.a0();
        Object value36 = tVar15.getValue();
        value36.getClass();
        v22.d.c((TextView) value36, strA0);
        Object value37 = tVar15.getValue();
        value37.getClass();
        TextView textView15 = (TextView) value37;
        if (strA0 != null) {
            i16 = 8;
        } else {
            i16 = 8;
        }
        textView15.setVisibility(i16);
        strC0 = pVar.c0();
        Object value38 = tVar14.getValue();
        value38.getClass();
        v22.d.c((TextView) value38, strC0);
        Object value39 = tVar14.getValue();
        value39.getClass();
        TextView textView16 = (TextView) value39;
        if (strC0 != null) {
            i17 = 8;
        } else {
            i17 = 8;
        }
        textView16.setVisibility(i17);
        zJ0 = pVar.J0();
        Object value40 = tVar13.getValue();
        value40.getClass();
        TextView textView17 = (TextView) value40;
        if (pVar.P0()) {
            i18 = i14;
        } else {
            i18 = 8;
        }
        textView17.setVisibility(i18);
        Object value41 = tVar13.getValue();
        value41.getClass();
        TextView textView18 = (TextView) value41;
        if (pVar.L0()) {
            string2 = sVar.getString(R.string.social_expedition_completed_msg);
        } else if (zJ0) {
            string2 = sVar.getString(R.string.msg_partner_badge_challenge_earned);
        } else {
            string2 = sVar.getString(R.string.msg_badge_challenge_earned);
        }
        textView18.setText(string2);
        joinDateLocal2 = pVar.getJoinDateLocal();
        badgeEarnedDate = pVar.getBadgeEarnedDate();
        if (joinDateLocal2 != null) {
            Object value42 = tVar.getValue();
            value42.getClass();
            TextView textView19 = (TextView) value42;
            if (pVar.P0()) {
                i27 = i14;
            } else {
                i27 = 8;
            }
            textView19.setVisibility(i27);
            LocalDate localDate3 = joinDateLocal2.toLocalDate();
            localDate3.getClass();
            LocalDate localDate4 = badgeEarnedDate.toLocalDate();
            localDate4.getClass();
            iC = o53.f0.I(localDate3, localDate4).c();
            if (iC == 1) {
                i28 = R.string.expedition_completed_day_singular;
            } else {
                i28 = R.string.expedition_completed_days_plural;
            }
            Object value110 = tVar.getValue();
            value110.getClass();
            ((TextView) value110).setText(sVar.getString(i28, String.valueOf(iC)));
            Unit unit7 = Unit.INSTANCE;
        }
        Object value111 = sVar.f37863x.getValue();
        value111.getClass();
        TextView textView20 = (TextView) value111;
        if (zJ0) {
            i19 = 8;
        } else {
            i19 = 8;
        }
        textView20.setVisibility(i19);
        v22.d.c(textView20, pVar.G());
        Object value112 = sVar.f37864y.getValue();
        value112.getClass();
        TextView textView21 = (TextView) value112;
        if (pVar.getUserJoined()) {
            i24 = 8;
        } else {
            i24 = 8;
        }
        textView21.setVisibility(i24);
        if (pVar.V0()) {
            string3 = sVar.getString(R.string.lbl_limited_capacity_full_title);
        } else {
            string3 = sVar.getString(R.string.lbl_limited_capacity_title);
        }
        textView21.setText(string3);
        Object value113 = sVar.f37865z.getValue();
        value113.getClass();
        TextView textView22 = (TextView) value113;
        if (pVar.getUserJoined()) {
            i25 = 8;
        } else {
            i25 = 8;
        }
        textView22.setVisibility(i25);
        if (pVar.V0()) {
            string4 = sVar.getString(R.string.msg_limited_capacity_full_description);
        } else {
            string4 = sVar.getString(R.string.msg_limited_capacity_description);
        }
        textView22.setText(string4);
        com.garmin.android.apps.connectmobile.leaderboard.challenges.s.y6(sVar, zBooleanValue);
        zD = g22.n.d(pVar.getPartnerName());
        Object value114 = sVar.A.getValue();
        value114.getClass();
        View view3 = (View) value114;
        if (zD) {
            i26 = i14;
        } else {
            i26 = 8;
        }
        view3.setVisibility(i26);
        if (zD) {
            Object value115 = sVar.B.getValue();
            value115.getClass();
            ((TextView) value115).setText(pVar.getPartnerName());
            badgeUuid = pVar.getBadgeUuid();
            if (badgeUuid != null) {
                Context contextRequireContext12 = sVar.requireContext();
                contextRequireContext12.getClass();
                zp0.c cVar7 = new zp0.c(contextRequireContext12);
                String strG3 = uu.i0.g();
                String strI3 = ((bv.d) KoinJavaComponent.get(bv.d.class)).i();
                String strF2 = uu.i0.f();
                ((c22.o) KoinJavaComponent.get(c22.o.class)).getClass();
                cVar7.f206565e = String.format(Locale.US, "%s/%simages/badges/%s/logo_%s_sml.png?appVer=".concat(String.valueOf(11657)), strI3, strF2, strG3, badgeUuid);
                cVar7.f206578r = "cache_availability_today";
                Object value116 = sVar.C.getValue();
                value116.getClass();
                cVar7.h((ImageView) value116);
                Unit unit8 = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
