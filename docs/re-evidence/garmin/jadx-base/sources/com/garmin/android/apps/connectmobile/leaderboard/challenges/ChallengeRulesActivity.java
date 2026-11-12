package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import i3.e5;
import mt0.u1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/ChallengeRulesActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChallengeRulesActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f37225j = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DateTime f37227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DateTime f37228c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.leaderboard.model.p f37232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f37233h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37226a = o13.m.a(o13.n.NONE, new e(this, null, null, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37229d = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f37234i = new c();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f37236b;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37235a = iArr;
            int[] iArr2 = new int[com.garmin.android.apps.connectmobile.leaderboard.model.s.values().length];
            try {
                iArr2[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38311g.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38315k.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f37236b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/ChallengeRulesActivity$c", "Lb/s;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = ChallengeRulesActivity.f37225j;
            ChallengeRulesActivity.this.da();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37238a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f37238a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37238a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37238a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<pt0.p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f37239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37242d;

        public e(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f37239a = gVar;
            this.f37240b = qualifier;
            this.f37241c = aVar;
            this.f37242d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, pt0.p] */
        @Override // e23.a
        public final pt0.p invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f37239a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f37241c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(pt0.p.class), f189591b, null, defaultViewModelCreationExtras, this.f37240b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f37242d, 4, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:179:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:58:0x013e  */
    public final void ca() {
        String strZ;
        String strZ2;
        String strG;
        String strG2;
        String strH;
        String strH2;
        String strJ0;
        String strI0;
        String strA0;
        String strC0;
        com.garmin.android.apps.connectmobile.leaderboard.model.p pVar;
        String strA1;
        String strH0;
        String string;
        int i14;
        int i15;
        int i16;
        com.garmin.android.apps.connectmobile.leaderboard.model.p pVar2 = this.f37232g;
        if (pVar2 == null) {
            initActionBar(true, getString(R.string.social_challenge_rules));
        } else if (pVar2.L0()) {
            initActionBar(true, getString(R.string.social_expedition_details_title));
        } else {
            initActionBar(true, getString(R.string.lbl_challenge_details));
        }
        com.garmin.android.apps.connectmobile.leaderboard.model.s sVarB = com.garmin.android.apps.connectmobile.leaderboard.model.s.b(this.f37229d);
        com.garmin.android.apps.connectmobile.leaderboard.model.p pVar3 = this.f37232g;
        boolean z14 = pVar3 != null;
        boolean z15 = pVar3 != null && pVar3.L0();
        View viewFindViewById = findViewById(R.id.challenge_info_section);
        viewFindViewById.getClass();
        viewFindViewById.setVisibility(!z15 ? 0 : 8);
        if (!z15) {
            TextView textView = (TextView) findViewById(R.id.challenge_name);
            if (z14) {
                com.garmin.android.apps.connectmobile.leaderboard.model.o.a aVar = com.garmin.android.apps.connectmobile.leaderboard.model.o.f38245b;
                Integer numValueOf = Integer.valueOf(this.f37229d);
                aVar.getClass();
                string = getString(com.garmin.android.apps.connectmobile.leaderboard.model.o.a.b(com.garmin.android.apps.connectmobile.leaderboard.model.o.a.a(numValueOf)));
            } else if (this.f37231f) {
                int iOrdinal = sVarB.ordinal();
                if (iOrdinal != 4) {
                    i14 = iOrdinal != 7 ? R.string.challenge_title : R.string.social_challenge_team_steps_average;
                } else {
                    i14 = R.string.social_challenge_team_steps;
                }
                string = getString(i14);
            } else {
                string = getString(com.garmin.android.apps.connectmobile.leaderboard.model.s.a(sVarB));
            }
            textView.setText(string);
            LocalDate localDate = new LocalDate(this.f37227b);
            LocalDate localDate2 = new LocalDate(this.f37228c);
            x.f37955a.getClass();
            String strI = x.i(localDate, false);
            String strI2 = x.i(localDate2, false);
            String strI3 = x.i(localDate, true);
            String strI4 = x.i(localDate2, true);
            String strR = c22.j0.r(this, this.f37227b);
            String strR2 = c22.j0.r(this, this.f37228c);
            ((TextView) findViewById(R.id.challenge_start)).setText(strI3);
            ((TextView) findViewById(R.id.challenge_end)).setText(strI4);
            String string2 = getString(R.string.social_challenge_interval_msg, strR, strI, strR2, strI2);
            string2.getClass();
            TextView textView2 = (TextView) findViewById(R.id.challenge_description);
            if (!z14) {
                if (this.f37231f) {
                    int iOrdinal2 = sVarB.ordinal();
                    if (iOrdinal2 != 4) {
                        i16 = iOrdinal2 != 7 ? R.string.challenge_title : R.string.social_challenge_rules_team_steps_average_msg;
                    } else {
                        i16 = R.string.social_challenge_rules_team_steps_msg;
                    }
                    string2 = getString(i16);
                } else {
                    int iOrdinal3 = sVarB.ordinal();
                    if (iOrdinal3 == 1) {
                        i15 = R.string.social_challenge_rules_running_msg;
                    } else if (iOrdinal3 == 2) {
                        i15 = R.string.social_challenge_rules_cycling_msg;
                    } else if (iOrdinal3 == 3) {
                        i15 = R.string.social_challenge_rules_swimming_msg;
                    } else if (iOrdinal3 != 4) {
                        switch (iOrdinal3) {
                            case 8:
                                i15 = R.string.social_challenge_rules_pushes_msg;
                                break;
                            case 9:
                                i15 = R.string.social_challenge_rules_pushing_msg;
                                break;
                            case 10:
                                i15 = R.string.social_challenge_rules_cycling_msg;
                                break;
                            default:
                                i15 = R.string.challenge_title;
                                break;
                        }
                    } else {
                        i15 = R.string.social_challenge_rules_steps_msg;
                    }
                    string2 = e5.g(string2, StringUtils.SPACE, getString(i15));
                }
            }
            textView2.setText(string2);
        }
        View viewFindViewById2 = findViewById(R.id.vvfjr_terms_message);
        viewFindViewById2.getClass();
        viewFindViewById2.setVisibility(this.f37230e ? 0 : 8);
        TextView textView3 = (TextView) findViewById(R.id.consent_message);
        textView3.getClass();
        textView3.setVisibility(!z14 ? 0 : 8);
        int i17 = sVarB == null ? -1 : b.f37236b[sVarB.ordinal()];
        String string3 = (i17 == 1 || i17 != 2) ? getString(R.string.lbl_adhoc_challenge_rules) : getString(R.string.lbl_adhoc_challenge_rules_wheelchair);
        textView3.setText(string3);
        if (z14) {
            TextView textView4 = (TextView) findViewById(R.id.challenge_rules_summary);
            textView4.getClass();
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar4 = this.f37232g;
            textView4.setVisibility((!z15 ? !(pVar4 == null || (strZ = pVar4.Z()) == null || !(d53.w.J(strZ) ^ true)) : !(pVar4 == null || (strH0 = pVar4.h0()) == null || !g22.n.d(strH0))) ? 8 : 0);
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar5 = this.f37232g;
            if (z15) {
                if (pVar5 != null) {
                    strZ2 = pVar5.h0();
                } else {
                    strZ2 = null;
                }
            } else if (pVar5 != null) {
                strZ2 = pVar5.Z();
            } else {
                strZ2 = null;
            }
            v22.d.c(textView4, strZ2);
            TextView textView5 = (TextView) findViewById(R.id.challenge_rules_additional_subhead);
            textView5.getClass();
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar6 = this.f37232g;
            textView5.setVisibility((pVar6 == null || (strC0 = pVar6.c0()) == null || !(d53.w.J(strC0) ^ true) || (pVar = this.f37232g) == null || (strA1 = pVar.a0()) == null || !(d53.w.J(strA1) ^ true)) ? 8 : 0);
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar7 = this.f37232g;
            v22.d.c(textView5, pVar7 != null ? pVar7.c0() : null);
            TextView textView6 = (TextView) findViewById(R.id.challenge_rules_additional_summary);
            textView6.getClass();
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar8 = this.f37232g;
            textView6.setVisibility((pVar8 == null || (strA0 = pVar8.a0()) == null || !(d53.w.J(strA0) ^ true)) ? 8 : 0);
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar9 = this.f37232g;
            v22.d.c(textView6, pVar9 != null ? pVar9.a0() : null);
            TextView textView7 = (TextView) findViewById(R.id.challenge_reward_details);
            textView7.getClass();
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar10 = this.f37232g;
            textView7.setVisibility((!z15 ? !(pVar10 == null || (strG = pVar10.G()) == null || !(d53.w.J(strG) ^ true)) : !(pVar10 == null || (strI0 = pVar10.i0()) == null || !g22.n.d(strI0))) ? 8 : 0);
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar11 = this.f37232g;
            if (z15) {
                if (pVar11 != null) {
                    strG2 = pVar11.i0();
                } else {
                    strG2 = null;
                }
            } else if (pVar11 != null) {
                strG2 = pVar11.G();
            } else {
                strG2 = null;
            }
            v22.d.c(textView7, strG2);
            TextView textView8 = (TextView) findViewById(R.id.challenge_reward_terms);
            textView8.getClass();
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar12 = this.f37232g;
            textView8.setVisibility((!z15 ? !(pVar12 == null || (strH = pVar12.H()) == null || !(d53.w.J(strH) ^ true)) : !(pVar12 == null || (strJ0 = pVar12.j0()) == null || !g22.n.d(strJ0))) ? 8 : 0);
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar13 = this.f37232g;
            if (z15) {
                if (pVar13 != null) {
                    strH2 = pVar13.j0();
                } else {
                    strH2 = null;
                }
            } else if (pVar13 != null) {
                strH2 = pVar13.H();
            } else {
                strH2 = null;
            }
            v22.d.c(textView8, strH2);
            TextView textView9 = (TextView) findViewById(R.id.challenge_rules);
            textView9.getClass();
            textView9.setVisibility(!z15 ? 0 : 8);
            if (!z15) {
                textView9.setText(getString(R.string.social_badge_challenge_rules_msg_1) + StringUtils.SPACE + ((Object) textView9.getText()));
            }
        }
        androidx.lifecycle.i0 i0VarW = o53.f0.w(this);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(i0VarW, x53.b.f189152a, null, new u1(this, null), 2);
    }

    public final void da() {
        bv.b.f21239a.getClass();
        ((kd0.m) bv.b.a()).a(this, null, 268468224);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        DateTime dateTime;
        DateTime dateTime2;
        com.garmin.android.apps.connectmobile.leaderboard.model.p pVar;
        Parcelable parcelable;
        Object serializable;
        Object serializable2;
        super.onCreate(bundle);
        setContentView(R.layout.gcm_ad_hoc_challenge_rules);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable2 = extras.getSerializable("ad_hoc_challenge_start_date", DateTime.class);
            } else {
                Object serializable3 = extras.getSerializable("ad_hoc_challenge_start_date");
                if (!(serializable3 instanceof DateTime)) {
                    serializable3 = null;
                }
                serializable2 = (DateTime) serializable3;
            }
            dateTime = (DateTime) serializable2;
        } else {
            dateTime = null;
        }
        this.f37227b = dateTime;
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras2.getSerializable("ad_hoc_challenge_end_date", DateTime.class);
            } else {
                Object serializable4 = extras2.getSerializable("ad_hoc_challenge_end_date");
                if (!(serializable4 instanceof DateTime)) {
                    serializable4 = null;
                }
                serializable = (DateTime) serializable4;
            }
            dateTime2 = (DateTime) serializable;
        } else {
            dateTime2 = null;
        }
        this.f37228c = dateTime2;
        Bundle extras3 = getIntent().getExtras();
        this.f37229d = extras3 != null ? extras3.getInt("ad_hoc_challenge_activity_type_id") : 0;
        Bundle extras4 = getIntent().getExtras();
        this.f37230e = extras4 != null ? extras4.getBoolean("GCM_challenge_is_vivokid", false) : false;
        Bundle extras5 = getIntent().getExtras();
        this.f37231f = extras5 != null ? extras5.getBoolean("GCM_challenge_is_team", false) : false;
        Bundle extras6 = getIntent().getExtras();
        if (extras6 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras6.getParcelable("badge_challenge", com.garmin.android.apps.connectmobile.leaderboard.model.p.class);
            } else {
                Parcelable parcelable2 = extras6.getParcelable("badge_challenge");
                if (!(parcelable2 instanceof com.garmin.android.apps.connectmobile.leaderboard.model.p)) {
                    parcelable2 = null;
                }
                parcelable = (com.garmin.android.apps.connectmobile.leaderboard.model.p) parcelable2;
            }
            pVar = (com.garmin.android.apps.connectmobile.leaderboard.model.p) parcelable;
        } else {
            pVar = null;
        }
        this.f37232g = pVar;
        Bundle extras7 = getIntent().getExtras();
        boolean z14 = extras7 != null ? extras7.getBoolean("from_badge_challenge_web_link", false) : false;
        this.f37233h = z14;
        if (!z14) {
            ca();
            return;
        }
        getOnBackPressedDispatcher().b(this.f37234i, this);
        View viewFindViewById = findViewById(R.id.challenge_rules_content);
        viewFindViewById.getClass();
        viewFindViewById.setVisibility(8);
        Bundle extras8 = getIntent().getExtras();
        String string = extras8 != null ? extras8.getString("badge_challenge_uuid") : null;
        if (string == null || d53.w.J(string)) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "ChallengeRulesActivity", "Challenge uuid is blank");
            da();
            return;
        }
        ?? r14 = this.f37226a;
        ((pt0.p) r14.getValue()).f140757d.f(this, new d(new mh1.x(this, 8)));
        pt0.p pVar2 = (pt0.p) r14.getValue();
        pVar2.getClass();
        xy2.b.L(pVar2, pVar2.f140756c, new pt0.u(pVar2, string, null));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        if (!this.f37233h) {
            return super.onNavigateUp();
        }
        da();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/ChallengeRulesActivity$a;", "", "<init>", "()V", "", "EXTRA_AD_HOC_CHALLENGE_START_DATE", "Ljava/lang/String;", "EXTRA_AD_HOC_CHALLENGE_END_DATE", "EXTRA_AD_HOC_CHALLENGE_ACTIVITY_TYPE_ID", "EXTRA_BADGE_CHALLENGE", "EXTRA_BADGE_CHALLENGE_UUID", "EXTRA_FROM_BADGE_CHALLENGE_WEB_LINK", "TAG", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
