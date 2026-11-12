package com.garmin.android.apps.connectmobile.activities.stats.rounds.edit.pickers;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.repcounting.model.d;
import f12.l;
import g22.n;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import o13.p;
import oq.b;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/rounds/edit/pickers/ExerciseWeightPickerActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ExerciseWeightPickerActivity extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f29943f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f29945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public oq.c f29946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f29947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EditText f29948e;

    public final EditText ca() {
        EditText editText = this.f29948e;
        if (editText != null) {
            return editText;
        }
        s.m("weightEditText");
        throw null;
    }

    public final TextView da() {
        TextView textView = this.f29947d;
        if (textView != null) {
            return textView;
        }
        s.m("weightUnit");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ea() {
        double d14;
        p pVar;
        p pVar2;
        Intent intent = new Intent();
        oq.c cVar = this.f29946c;
        if (cVar == null) {
            s.m("exerciseWeightResolver");
            throw null;
        }
        String string = ca().getText().toString();
        String str = this.f29944a;
        if (str == null) {
            s.m("exerciseCategoryKey");
            throw null;
        }
        String str2 = this.f29945b;
        if (str2 == null) {
            s.m("exerciseKey");
            throw null;
        }
        Double dValueOf = Double.valueOf(-1.0d);
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar2 = cVar.f133263a;
        string.getClass();
        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
        if (string.length() > 0 && zY) {
            d14 = Double.parseDouble(string);
        } else if (string.length() <= 0 || zY) {
            d14 = 0.0d;
        } else {
            l3.a aVar = l3.f23124b;
            double d15 = Double.parseDouble(string);
            aVar.getClass();
            d14 = d15 / 2.20462d;
        }
        boolean zH = cVar2.H(str, str2);
        d dVarD = cVar2.D(str, str2);
        String str3 = dVarD != null ? dVarD.f41104c : null;
        if (str3 == null) {
            str3 = "";
        }
        boolean zD = n.d(str3);
        if (d14 > 0.0d && !zH) {
            pVar = new p(Double.valueOf(d14), str2);
        } else if (d14 == 0.0d && zH) {
            pVar = new p(dValueOf, str2);
        } else {
            if (d14 > 0.0d && zH && zD) {
                pVar2 = new p(Double.valueOf(d14), str3);
            } else if (d14 > 0.0d && zH && !zD) {
                pVar = new p(Double.valueOf(d14), str2);
            } else if (d14 == 0.0d && !zH && zD) {
                pVar2 = new p(dValueOf, str3);
            } else {
                pVar = (d14 != 0.0d || zH || zD) ? new p(Double.valueOf(-2.0d), "UNKNOWN") : new p(Double.valueOf(0.0d), str2);
            }
            pVar = pVar2;
        }
        intent.putExtra("weight", ((Number) pVar.f128594a).doubleValue());
        String str4 = this.f29944a;
        if (str4 == null) {
            s.m("exerciseCategoryKey");
            throw null;
        }
        intent.putExtra("exerciseCategoryKey", str4);
        intent.putExtra("exerciseKey", (String) pVar.f128595b);
        setResult(-1, intent);
        finish();
    }

    public final boolean fa(com.garmin.android.apps.connectmobile.repcounting.model.c cVar) {
        String str;
        String str2 = this.f29944a;
        if (str2 == null) {
            s.m("exerciseCategoryKey");
            throw null;
        }
        String str3 = this.f29945b;
        if (str3 == null) {
            s.m("exerciseKey");
            throw null;
        }
        d dVarD = cVar.D(str2, str3);
        Editable text = ca().getText();
        if (text == null || text.length() == 0) {
            return (dVarD != null && dVarD.f41105d) || !(dVarD == null || (str = dVarD.f41104c) == null || str.length() <= 0);
        }
        return false;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        ea();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.activity_edit_round_exercise_weight);
        initActionBar(true, R.string.workout_set_weight);
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        double d14 = bundleA != null ? bundleA.getDouble("weight", -1.0d) : -1.0d;
        View viewFindViewById = findViewById(R.id.weight_unit);
        viewFindViewById.getClass();
        this.f29947d = (TextView) viewFindViewById;
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = null;
        da().setText(getString(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? R.string.lbl_kg : R.string.lbl_lbs));
        View viewFindViewById2 = findViewById(R.id.weight_edit_text);
        viewFindViewById2.getClass();
        this.f29948e = (EditText) viewFindViewById2;
        if (bundleA != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundleA.getParcelable("exerciseList", com.garmin.android.apps.connectmobile.repcounting.model.c.class);
            } else {
                Parcelable parcelable2 = bundleA.getParcelable("exerciseList");
                parcelable = (com.garmin.android.apps.connectmobile.repcounting.model.c) (parcelable2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.c ? parcelable2 : null);
            }
            cVar = (com.garmin.android.apps.connectmobile.repcounting.model.c) parcelable;
        }
        this.f29946c = new oq.c(cVar == null ? new com.garmin.android.apps.connectmobile.repcounting.model.c() : cVar);
        String str = "UNKNOWN";
        if (bundleA == null || (string = bundleA.getString("exerciseCategoryKey", "UNKNOWN")) == null) {
            string = "UNKNOWN";
        }
        this.f29944a = string;
        if (bundleA != null && (string2 = bundleA.getString("exerciseKey", "UNKNOWN")) != null) {
            str = string2;
        }
        this.f29945b = str;
        if (cVar != null) {
            oq.d dVar = new oq.d(0.0d, 999.0d);
            dVar.f133266c = 1;
            dVar.f133267d = DecimalFormatSymbols.getInstance(Locale.getDefault()).getDecimalSeparator();
            int i14 = 0;
            ca().setFilters(new InputFilter[]{dVar, new InputFilter.LengthFilter(5)});
            if (d14 <= 0.0d) {
                da().setVisibility(8);
                if (fa(cVar)) {
                    ca().setHint(R.string.strength_training_body);
                } else {
                    ca().setHint("");
                    ca().requestFocus();
                }
            } else {
                da().setVisibility(0);
                ca().setText(l3.f23126d.format(d14));
            }
            ca().setOnClickListener(new oq.a(this, i14));
            ca().setOnFocusChangeListener(new ew1.l(4, this, cVar));
            ca().addTextChangedListener(new b(this, cVar));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == 16908332) {
            ea();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/rounds/edit/pickers/ExerciseWeightPickerActivity$a;", "", "<init>", "()V", "", "WEIGHT_PICKER_REQUEST_CODE", "I", "", "WEIGHT_KEY", "Ljava/lang/String;", "EXERCISE_CATEGORY_KEY", "EXERCISE_KEY", "EXERCISE_LIST_KEY", "UNKNOWN_VALUE", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
