package com.garmin.android.apps.connectmobile.performance.stats;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import aq.o3;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import im.d0;
import o13.m;
import o13.n;
import o13.t;
import o53.f0;
import o61.l;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import qs.u;
import t21.f;
import t61.r;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/stats/TrainingEffectDetailActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TrainingEffectDetailActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f40000v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f40001w = TrainingEffectDetailActivity.class.getName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f40002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MenuItem f40003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f40004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ComposeView f40005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ComposeView f40006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComposeView f40007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f40008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f40009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f40010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f40011j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f40013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f40014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f40015n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d0 f40016o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d0 f40017p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public l f40018q;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f40012k = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f40019r = m.a(n.NONE, new b(this, null, null, null));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t f40020t = m.b(new f(19));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f40021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f40022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f40023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f40024d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f40021a = gVar;
            this.f40022b = qualifier;
            this.f40023c = aVar;
            this.f40024d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, t61.r] */
        @Override // e23.a
        public final r invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f40021a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f40023c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(r.class), f189591b, null, defaultViewModelCreationExtras, this.f40022b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f40024d, 4, null);
        }
    }

    public static boolean da(Double d14) {
        return (d14 == null || Double.isNaN(d14.doubleValue())) ? false : true;
    }

    public final void ca(d0 d0Var, d0 d0Var2) {
        ViewGroup viewGroup = this.f40002a;
        if (viewGroup == null) {
            s.m("mRootLayout");
            throw null;
        }
        viewGroup.setVisibility(0);
        invalidateOptionsMenu();
        ComposeView composeView = this.f40006e;
        if (composeView == null) {
            s.m("mAerobicView");
            throw null;
        }
        int i14 = 1;
        if (d0Var != null) {
            composeView.setContent(new e(-1305341222, true, new u61.e(i14, d0Var.f94140b, d0Var, 0)));
        }
        ComposeView composeView2 = this.f40007f;
        if (composeView2 == null) {
            s.m("mAnaerobicView");
            throw null;
        }
        if (d0Var2 != null) {
            composeView2.setContent(new e(-1305341222, true, new u61.e(2, d0Var2.f94140b, d0Var2, 0)));
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        setResult(12);
        super.finish();
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0194  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        boolean z14;
        d0 d0Var;
        d0 d0Var2;
        Parcelable parcelable;
        Parcelable parcelable2;
        Parcelable parcelable3;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_trg_effect_detail_summary);
        boolean z15 = true;
        initActionBar(true, R.string.activity_details_training_effect);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33) {
                parcelable = (Parcelable) extras.getParcelable("EXTRA_TRAINING_EFFECT_SUMMARY", l.class);
            } else {
                Parcelable parcelable4 = extras.getParcelable("EXTRA_TRAINING_EFFECT_SUMMARY");
                if (!(parcelable4 instanceof l)) {
                    parcelable4 = null;
                }
                parcelable = (l) parcelable4;
            }
            this.f40018q = (l) parcelable;
            if (i14 >= 33) {
                parcelable2 = (Parcelable) extras.getParcelable("EXTRA_AEROBIC_TRAINING_EFFECT", d0.class);
            } else {
                Parcelable parcelable5 = extras.getParcelable("EXTRA_AEROBIC_TRAINING_EFFECT");
                if (!(parcelable5 instanceof d0)) {
                    parcelable5 = null;
                }
                parcelable2 = (d0) parcelable5;
            }
            this.f40016o = (d0) parcelable2;
            if (i14 >= 33) {
                parcelable3 = (Parcelable) extras.getParcelable("EXTRA_ANAEROBIC_TRAINING_EFFECT", d0.class);
            } else {
                Parcelable parcelable6 = extras.getParcelable("EXTRA_ANAEROBIC_TRAINING_EFFECT");
                if (!(parcelable6 instanceof d0)) {
                    parcelable6 = null;
                }
                parcelable3 = (d0) parcelable6;
            }
            this.f40017p = (d0) parcelable3;
            this.f40012k = extras.getString("EXTRA_TRAINING_EFFECT_LABEL");
            this.f40013l = extras.getBoolean("EXTRA_TRAINING_DISPLAY_RELATED_ACTIVITIES", false);
        }
        if (this.f40018q == null && this.f40016o == null && this.f40017p == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, f40001w, "We shouldn't be here. We should have at least one TrainingEffect Data object");
            finish();
        }
        View viewFindViewById = findViewById(R.id.training_effect_summary_container);
        viewFindViewById.getClass();
        this.f40002a = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.activities_list_container);
        viewFindViewById2.getClass();
        this.f40005d = (ComposeView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.activities_section_header_title);
        viewFindViewById3.getClass();
        this.f40004c = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.primary_benefit_container);
        viewFindViewById4.getClass();
        this.f40010i = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.primary_benefit_text_title);
        viewFindViewById5.getClass();
        this.f40008g = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.primary_benefit_text_description);
        viewFindViewById6.getClass();
        this.f40009h = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.aerobic_summary_container);
        viewFindViewById7.getClass();
        this.f40006e = (ComposeView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.anaerobic_summary_container);
        viewFindViewById8.getClass();
        this.f40007f = (ComposeView) viewFindViewById8;
        l lVar = this.f40018q;
        if (lVar == null || (str = lVar.f129609e) == null) {
            str = this.f40012k;
        }
        if (TextUtils.isEmpty(str)) {
            z14 = false;
        } else {
            u.f147173f.getClass();
            u uVarA = u.a.a(str);
            if (uVarA != null) {
                String string = getString(uVarA.f147182b);
                this.f40011j = string;
                String strH = com.nimbusds.jose.shaded.gson.internal.a.h(string, " (", getString(uVarA.f147185e), ")");
                TextView textView = this.f40008g;
                if (textView == null) {
                    s.m("mPrimaryBenefitTextTitle");
                    throw null;
                }
                textView.setText(strH);
                Drawable drawable = a7.b.getDrawable(this, R.drawable.circle_gray_fixed_size);
                if (drawable != null) {
                    drawable.mutate();
                    drawable.setColorFilter(a7.b.getColor(this, uVarA.f147184d), PorterDuff.Mode.SRC);
                    TextView textView2 = this.f40008g;
                    if (textView2 == null) {
                        s.m("mPrimaryBenefitTextTitle");
                        throw null;
                    }
                    textView2.setCompoundDrawablePadding(getResources().getDimensionPixelSize(R.dimen.spacing_small));
                    TextView textView3 = this.f40008g;
                    if (textView3 == null) {
                        s.m("mPrimaryBenefitTextTitle");
                        throw null;
                    }
                    textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                TextView textView4 = this.f40009h;
                if (textView4 == null) {
                    s.m("mPrimaryBenefitTextDescription");
                    throw null;
                }
                textView4.setText(uVarA.f147183c);
                z14 = true;
            } else {
                z14 = false;
            }
        }
        LinearLayout linearLayout = this.f40010i;
        if (linearLayout == null) {
            s.m("mPrimaryBenefitContainer");
            throw null;
        }
        linearLayout.setVisibility(z14 ? 0 : 8);
        l lVar2 = this.f40018q;
        boolean z16 = (lVar2 != null && da(Double.valueOf(lVar2.f129606b))) || ((d0Var = this.f40016o) != null && da(Double.valueOf(d0Var.f94139a)));
        this.f40014m = z16;
        ComposeView composeView = this.f40006e;
        if (composeView == null) {
            s.m("mAerobicView");
            throw null;
        }
        composeView.setVisibility(z16 ? 0 : 8);
        l lVar3 = this.f40018q;
        if ((lVar3 == null || !da(Double.valueOf(lVar3.f129607c))) && (this.f40016o == null || (d0Var2 = this.f40017p) == null || !da(Double.valueOf(d0Var2.f94139a)))) {
            z15 = false;
        }
        this.f40015n = z15;
        ComposeView composeView2 = this.f40007f;
        if (composeView2 != null) {
            composeView2.setVisibility(z15 ? 0 : 8);
        } else {
            s.m("mAnaerobicView");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        MenuItem menuItemAdd = menu.add(0, 48, 0, R.string.lbl_help);
        menuItemAdd.setShowAsActionFlags(1);
        this.f40003b = menuItemAdd;
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        o3.b bVar;
        menuItem.getClass();
        if (menuItem.getItemId() != 48) {
            return super.onOptionsItemSelected(menuItem);
        }
        boolean z14 = this.f40014m;
        if (z14 && this.f40015n) {
            bVar = o3.b.TRAINING_EFFECT_HELP_BOTH;
        } else {
            bVar = z14 ? o3.b.TRAINING_EFFECT_HELP_AEROBIC : o3.b.TRAINING_EFFECT_HELP_ANAEROBIC;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("help_mode_key", bVar);
        bundle.putBoolean("has_primary_benefit", !TextUtils.isEmpty(this.f40011j));
        HelpActivity.a aVar = HelpActivity.f36653a;
        ro0.l lVar = ro0.l.TRAINING_EFFECT;
        aVar.getClass();
        HelpActivity.a.d(this, lVar, "DEFAULT_ACTION", bundle);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        MenuItem menuItem = this.f40003b;
        if (menuItem == null) {
            s.m("mHelpMenu");
            throw null;
        }
        ViewGroup viewGroup = this.f40002a;
        if (viewGroup != null) {
            menuItem.setEnabled(viewGroup.getVisibility() == 0);
            return super.onPrepareOptionsMenu(menu);
        }
        s.m("mRootLayout");
        throw null;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.f40013l) {
            ca(this.f40016o, this.f40017p);
            return;
        }
        l lVar = this.f40018q;
        if (lVar != null) {
            showProgressOverlay();
            ge1.b.T(f0.w(this), null, null, new t61.l(this, lVar, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u001c\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/stats/TrainingEffectDetailActivity$a;", "", "<init>", "()V", "", "EXTRA_ANAEROBIC_TRAINING_EFFECT", "Ljava/lang/String;", "EXTRA_AEROBIC_TRAINING_EFFECT", "EXTRA_TRAINING_EFFECT_LABEL", "EXTRA_TRAINING_EFFECT_SUMMARY", "EXTRA_TRAINING_DISPLAY_RELATED_ACTIVITIES", "kotlin.jvm.PlatformType", "TAG", "", "REQUEST_CODE_ACTIVITY_VIEW", "I", "MENU_ITEM_ITEM_HELP", "RESULT_EDIT", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
