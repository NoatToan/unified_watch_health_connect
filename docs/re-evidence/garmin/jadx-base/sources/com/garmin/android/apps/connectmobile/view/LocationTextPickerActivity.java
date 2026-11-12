package com.garmin.android.apps.connectmobile.view;

import am.w1;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.e;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.library.mapsdkadapter.f;
import d53.w;
import lo.t;
import ng1.c1;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import po.x;
import po.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/LocationTextPickerActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LocationTextPickerActivity extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f47490f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f47491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f47492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EditText f47493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f47494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f47495e;

    public static final void ca(t tVar, String str, x xVar, x xVar2, int i14) {
        f47490f.getClass();
        tVar.getClass();
        str.getClass();
        Intent intent = new Intent(tVar.getContext(), (Class<?>) LocationTextPickerActivity.class);
        intent.putExtra("EXTRA_LOCATION_EDITABLE", xVar);
        intent.putExtra("EXTRA_LOCATION_READONLY", xVar2);
        intent.putExtra("EXTRA_TITLE", str);
        tVar.startActivityForResult(intent, i14);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Parcelable parcelable;
        String strI;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 150 && i15 == -1 && intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("EXTRA_LOCATION_EDITABLE", x.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("EXTRA_LOCATION_EDITABLE");
                if (!(parcelableExtra instanceof x)) {
                    parcelableExtra = null;
                }
                parcelable = (x) parcelableExtra;
            }
            x xVar = (x) parcelable;
            this.f47491a = xVar;
            String strI2 = "";
            if (xVar != null) {
                f fVar = xVar.f138992a;
                if (Double.isNaN(fVar.f50283a.latitude)) {
                    strI = "";
                } else {
                    l3.a aVar = l3.f23124b;
                    double d14 = fVar.f50283a.latitude;
                    aVar.getClass();
                    strI = l3.a.I(this, d14);
                }
            } else {
                strI = "";
            }
            EditText editText = this.f47493c;
            if (editText == null) {
                s.m("enterLatitudeEditText");
                throw null;
            }
            editText.setText(strI);
            if (xVar != null) {
                f fVar2 = xVar.f138992a;
                if (!Double.isNaN(fVar2.f50283a.longitude)) {
                    l3.a aVar2 = l3.f23124b;
                    double d15 = fVar2.f50283a.longitude;
                    aVar2.getClass();
                    strI2 = l3.a.I(this, d15);
                }
            }
            EditText editText2 = this.f47494d;
            if (editText2 != null) {
                editText2.setText(strI2);
            } else {
                s.m("enterLongitudeEditText");
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        EditText editText = this.f47493c;
        p pVar = null;
        if (editText == null) {
            s.m("enterLatitudeEditText");
            throw null;
        }
        Editable text = editText.getText();
        if (text == null || w.J(text)) {
            EditText editText2 = this.f47494d;
            if (editText2 == null) {
                s.m("enterLongitudeEditText");
                throw null;
            }
            Editable text2 = editText2.getText();
            if (text2 == null || w.J(text2)) {
                super.onBackPressed();
                return;
            }
        }
        new w1();
        EditText editText3 = this.f47493c;
        if (editText3 == null) {
            s.m("enterLatitudeEditText");
            throw null;
        }
        String string = editText3.getText().toString();
        EditText editText4 = this.f47494d;
        if (editText4 == null) {
            s.m("enterLongitudeEditText");
            throw null;
        }
        try {
            pVar = new p(Double.valueOf(w1.a(string)), Double.valueOf(w1.b(editText4.getText().toString())));
        } catch (Exception unused) {
        }
        if (pVar == null) {
            new e.a(this).setTitle(getTitle()).setMessage(R.string.activity_details_dive_invalid_location_msg).setNeutralButton(R.string.lbl_ok, new c1(this, 21)).setCancelable(false).show();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("latitude", ((Number) pVar.f128594a).doubleValue());
        intent.putExtra("longitude", ((Number) pVar.f128595b).doubleValue());
        setResult(-1, intent);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Parcelable parcelable2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_input_decimal_location);
        initActionBar(true, getIntent().getStringExtra("EXTRA_TITLE"));
        View viewFindViewById = findViewById(R.id.enter_latitude_edit_text);
        viewFindViewById.getClass();
        this.f47493c = (EditText) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.enter_longitude_edit_text);
        viewFindViewById2.getClass();
        this.f47494d = (EditText) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.set_entry_location_button);
        viewFindViewById3.getClass();
        this.f47495e = (TextView) viewFindViewById3;
        Intent intent = getIntent();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("EXTRA_LOCATION_EDITABLE", x.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("EXTRA_LOCATION_EDITABLE") : null;
            if (!(parcelableExtra instanceof x)) {
                parcelableExtra = null;
            }
            parcelable = (x) parcelableExtra;
        }
        this.f47491a = (x) parcelable;
        Intent intent2 = getIntent();
        if (i14 >= 33) {
            parcelable2 = intent2 != null ? (Parcelable) intent2.getParcelableExtra("EXTRA_LOCATION_READONLY", x.class) : null;
        } else {
            Parcelable parcelableExtra2 = intent2 != null ? intent2.getParcelableExtra("EXTRA_LOCATION_READONLY") : null;
            if (!(parcelableExtra2 instanceof x)) {
                parcelableExtra2 = null;
            }
            parcelable2 = (x) parcelableExtra2;
        }
        this.f47492b = (x) parcelable2;
        x xVar = this.f47491a;
        if (xVar != null) {
            if (!xVar.b()) {
                xVar = null;
            }
            if (xVar != null) {
                f fVar = xVar.f138992a;
                EditText editText = this.f47493c;
                if (editText == null) {
                    s.m("enterLatitudeEditText");
                    throw null;
                }
                l3.a aVar = l3.f23124b;
                double d14 = fVar.f50283a.latitude;
                aVar.getClass();
                editText.setText(l3.a.I(this, d14));
                EditText editText2 = this.f47494d;
                if (editText2 == null) {
                    s.m("enterLongitudeEditText");
                    throw null;
                }
                editText2.setText(l3.a.I(this, fVar.f50283a.longitude));
            }
        }
        TextView textView = this.f47495e;
        if (textView == null) {
            s.m("setEntryLocationButton");
            throw null;
        }
        x xVar2 = this.f47491a;
        textView.setText((xVar2 != null ? xVar2.f138993b : null) == y.START ? R.string.activity_details_dive_location_set_map_entry_location : R.string.activity_details_dive_location_set_map_exit_location);
        TextView textView2 = this.f47495e;
        if (textView2 != null) {
            textView2.setOnClickListener(new oq.a(this, 15));
        } else {
            s.m("setEntryLocationButton");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/LocationTextPickerActivity$a;", "", "<init>", "()V", "", "MAP_LOCATION_REQUEST_CODE", "I", "", "KEY_TITLE", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
