package com.garmin.android.apps.connectmobile.hydration.presentation.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import fw.p;
import java.text.DecimalFormat;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import u20.f;
import wd2.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/hydration/presentation/settings/HydrationGoalSettingsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HydrationGoalSettingsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f36691k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f36692l = "HydrationGoalSettingsActivity";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EditText f36693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexOneLineButton f36694b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f36700h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f36695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f36696d = this.f36695c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f36697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f36698f = this.f36697e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q22.b f36699g = q22.b.MILLILITER;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f36701i = m.a(n.NONE, new c(this, null, null, null));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h0 f36702j = new h0(this, 10);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36703a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36703a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<pp0.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f36705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f36706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f36707d;

        public c(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f36704a = gVar;
            this.f36705b = qualifier;
            this.f36706c = aVar;
            this.f36707d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, pp0.c] */
        @Override // e23.a
        public final pp0.c invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f36704a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f36706c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(pp0.c.class), f189591b, null, defaultViewModelCreationExtras, this.f36705b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f36707d, 4, null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        op0.c cVar = new op0.c(null, null, null, null, 15, null);
        EditText editText = this.f36693a;
        if (editText == null) {
            s.m("goalEditText");
            throw null;
        }
        String string = editText.getText().toString();
        if (string.length() > 0) {
            double dA = q22.a.a(Double.parseDouble(string), this.f36699g, q22.b.MILLILITER);
            int i14 = jp0.c.f99873k;
            if (dA < 1.0d) {
                dA = 1.0d;
            }
            this.f36695c = dA;
        }
        double d14 = this.f36696d;
        double d15 = this.f36695c;
        if (d14 != d15) {
            cVar.m(Double.valueOf(d15));
        }
        if (this.f36697e != null) {
            GCMComplexOneLineButton gCMComplexOneLineButton = this.f36694b;
            if (gCMComplexOneLineButton == null) {
                s.m("autoGoalButton");
                throw null;
            }
            Boolean boolValueOf = Boolean.valueOf(gCMComplexOneLineButton.f47771k.isChecked());
            this.f36697e = boolValueOf;
            if (!s.g(this.f36698f, boolValueOf)) {
                cVar.q(this.f36697e);
            }
        }
        if (this.f36700h) {
            Intent intent = new Intent();
            intent.putExtra("GCM_extra_current_daily_goal", this.f36695c);
            setResult(-1, intent);
            finish();
            return;
        }
        if (cVar.k()) {
            setResult(0);
            finish();
        } else {
            showProgressOverlay();
            pp0.c cVar2 = (pp0.c) this.f36701i.getValue();
            cVar2.getClass();
            xy2.b.K(cVar2, new pp0.b(cVar2, cVar, null)).f(this, this.f36702j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        q22.b bVar;
        Bundle extras2;
        Object serializable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm_hydration_goal_settings);
        initActionBar(true, R.string.lbl_daily_goal);
        Intent intent = getIntent();
        double d14 = Double.NaN;
        if (intent != null && (extras = intent.getExtras()) != null) {
            d14 = extras.getDouble("GCM_extra_current_daily_goal", Double.NaN);
            this.f36695c = d14;
            this.f36696d = d14;
            if (extras.containsKey("autoGoal")) {
                Boolean boolValueOf = Boolean.valueOf(extras.getBoolean("autoGoal"));
                this.f36697e = boolValueOf;
                this.f36698f = boolValueOf;
            }
            Intent intent2 = getIntent();
            if (intent2 == null || (extras2 = intent2.getExtras()) == null) {
                bVar = q22.b.MILLILITER;
            } else {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = extras2.getSerializable("measurementUnit", q22.b.class);
                } else {
                    Object serializable2 = extras2.getSerializable("measurementUnit");
                    if (!(serializable2 instanceof q22.b)) {
                        serializable2 = null;
                    }
                    serializable = (q22.b) serializable2;
                }
                bVar = (q22.b) serializable;
                if (bVar == null) {
                    bVar = q22.b.MILLILITER;
                }
            }
            this.f36699g = bVar;
            boolean z14 = extras.getBoolean("EXTRA_FROM_PREGNANCY", false);
            this.f36700h = z14;
            if (z14) {
                findViewById(R.id.hydration_footer_text).setVisibility(8);
            }
        }
        if (Double.isNaN(d14)) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, f36692l, "Expected valid goal value");
            finish();
            return;
        }
        View viewFindViewById = findViewById(R.id.hydration_goal_edit_text);
        EditText editText = (EditText) viewFindViewById;
        wp0.a aVar2 = new wp0.a(new l22.a(this));
        double d15 = this.f36695c;
        q22.b bVar2 = this.f36699g;
        bVar2.getClass();
        wp0.a.f186524b.getClass();
        DecimalFormat decimalFormatB = wp0.a.C3469a.b(bVar2);
        decimalFormatB.setGroupingUsed(false);
        q22.b bVar3 = q22.b.MILLILITER;
        String strB = aVar2.b(q22.a.a(d15, bVar3, bVar2), bVar2, false, decimalFormatB, false);
        decimalFormatB.setGroupingUsed(true);
        if (strB.length() > 0) {
            editText.setText(strB);
        }
        double dI = jp0.c.i(this.f36699g);
        Double d16 = (Double) jp0.c.g().get(this.f36699g);
        editText.setFilters(new f[]{new f(Math.floor(q22.a.a(dI, bVar3, this.f36699g)), Math.floor(q22.a.a(d16 != null ? d16.doubleValue() : Double.MAX_VALUE, bVar3, this.f36699g)), "(([0-9]+)?)")});
        editText.setInputType(2);
        editText.requestFocus();
        editText.setSelection(0, editText.length());
        getWindow().setSoftInputMode(4);
        viewFindViewById.getClass();
        this.f36693a = (EditText) viewFindViewById;
        ((TextView) findViewById(R.id.hydration_goal_unit_text_view)).setText(this.f36699g.f142313b);
        View viewFindViewById2 = findViewById(R.id.hydration_auto_goal_button);
        viewFindViewById2.getClass();
        this.f36694b = (GCMComplexOneLineButton) viewFindViewById2;
        TextView textView = (TextView) findViewById(R.id.hydration_auto_goal_description);
        Boolean bool = this.f36697e;
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f36694b;
        if (bool == null) {
            if (gCMComplexOneLineButton == null) {
                s.m("autoGoalButton");
                throw null;
            }
            gCMComplexOneLineButton.setVisibility(8);
            textView.getClass();
            textView.setVisibility(8);
            return;
        }
        if (gCMComplexOneLineButton == null) {
            s.m("autoGoalButton");
            throw null;
        }
        gCMComplexOneLineButton.setVisibility(0);
        textView.getClass();
        textView.setVisibility(0);
        Boolean bool2 = this.f36697e;
        if (bool2 != null) {
            boolean zBooleanValue = bool2.booleanValue();
            GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f36694b;
            if (gCMComplexOneLineButton2 != null) {
                gCMComplexOneLineButton2.i(zBooleanValue);
            } else {
                s.m("autoGoalButton");
                throw null;
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        hideProgressOverlay();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/hydration/presentation/settings/HydrationGoalSettingsActivity$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "EXTRA_AUTO_GOAL", "EXTRA_MEASUREMENT_UNIT", "EXTRA_FROM_PREGNANCY", "REGEXP_INTEGER", "", "DEFAULT_MIN_VOLUME", "D", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, double d14, Boolean bool, q22.b bVar, boolean z14) {
            bVar.getClass();
            Intent intent = new Intent(context, (Class<?>) HydrationGoalSettingsActivity.class);
            intent.putExtra("GCM_extra_current_daily_goal", d14);
            intent.putExtra("measurementUnit", bVar);
            intent.putExtra("EXTRA_FROM_PREGNANCY", z14);
            if (bool != null) {
                intent.putExtra("autoGoal", bool.booleanValue());
            }
            return intent;
        }

        private a() {
        }
    }
}
