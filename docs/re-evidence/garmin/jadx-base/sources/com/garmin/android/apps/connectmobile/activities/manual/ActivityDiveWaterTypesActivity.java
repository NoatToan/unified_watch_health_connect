package com.garmin.android.apps.connectmobile.activities.manual;

import a7.b;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import gg1.b1;
import lc.u0;

/* JADX INFO: loaded from: classes7.dex */
public class ActivityDiveWaterTypesActivity extends c implements View.OnClickListener, b1.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f29137j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f29138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f29139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Double f29140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Double f29141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f29143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f29144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f29145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f29146i;

    public final void ca(double d14) {
        if (d14 < 1.0d) {
            this.f29141d = Double.valueOf(1.0d);
        } else if (d14 > 1.25d) {
            this.f29141d = Double.valueOf(1.25d);
        } else {
            this.f29141d = Double.valueOf(d14);
        }
        Button button = this.f29145h;
        l3.f23124b.getClass();
        button.setText(l3.a.L(d14, 3));
    }

    public final void da() {
        if (this.f29142e) {
            Intent intent = new Intent();
            intent.putExtra("activity_dive_water_type", this.f29139b);
            if (this.f29139b.intValue() == 3) {
                intent.putExtra("activity_dive_water_density", this.f29141d);
            }
            setResult(-1, intent);
        } else {
            setResult(0, null);
        }
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        da();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view2) {
        Double d14;
        this.f29143f.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        this.f29144g.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        this.f29145h.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        this.f29145h.setVisibility(8);
        Button button = this.f29143f;
        if (view2 == button) {
            button.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.check, 0);
            this.f29143f.setCompoundDrawableTintList(ColorStateList.valueOf(b.getColor(this, R.color.gcm_icon_primary_action)));
            this.f29139b = 0;
        } else {
            Button button2 = this.f29144g;
            if (view2 == button2) {
                button2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.check, 0);
                this.f29144g.setCompoundDrawableTintList(ColorStateList.valueOf(b.getColor(this, R.color.gcm_icon_primary_action)));
                this.f29139b = 1;
            } else {
                Button button3 = this.f29145h;
                if (view2 == button3) {
                    button3.setVisibility(0);
                    this.f29145h.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.check, 0);
                    this.f29145h.setCompoundDrawableTintList(ColorStateList.valueOf(b.getColor(this, R.color.gcm_icon_primary_action)));
                    this.f29139b = 3;
                    if (this.f29141d == null) {
                        Double d15 = this.f29140c;
                        ca(d15 != null ? d15.doubleValue() : 1.0d);
                    }
                } else if (view2 == this.f29146i) {
                    button3.setVisibility(0);
                    this.f29145h.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.check, 0);
                    this.f29145h.setCompoundDrawableTintList(ColorStateList.valueOf(b.getColor(this, R.color.gcm_icon_primary_action)));
                    this.f29139b = 3;
                    if (this.f29141d == null) {
                        Double d16 = this.f29140c;
                        ca(d16 != null ? d16.doubleValue() : 1.0d);
                    }
                    new b1(this, this, this.f29141d, 1.0f, 1.25f, 0.05f);
                }
            }
        }
        Integer num = this.f29139b;
        if (num != null) {
            if (!num.equals(this.f29138a) || ((d14 = this.f29141d) != null && d14.equals(this.f29140c))) {
                this.f29142e = true;
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_water_type);
        initActionBar(true, R.string.activity_details_water_type);
        Integer numValueOf = Integer.valueOf(getIntent().getIntExtra("activity_dive_water_type", -1));
        this.f29138a = numValueOf;
        if (numValueOf.intValue() == -1) {
            this.f29138a = null;
        }
        Double dValueOf = Double.valueOf(getIntent().getDoubleExtra("activity_dive_water_density", -1.0d));
        this.f29140c = dValueOf;
        if (dValueOf.doubleValue() == -1.0d) {
            this.f29140c = null;
        } else {
            this.f29140c = u0.h(1000.0d, this.f29140c);
        }
        this.f29143f = (Button) findViewById(R.id.type_fresh_button);
        this.f29144g = (Button) findViewById(R.id.type_salt_button);
        this.f29146i = findViewById(R.id.type_custom_layout);
        this.f29145h = (Button) findViewById(R.id.type_custom_density_button);
        this.f29143f.setOnClickListener(this);
        this.f29144g.setOnClickListener(this);
        this.f29146i.setOnClickListener(this);
        Integer num = this.f29138a;
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                onClick(this.f29143f);
            } else if (iIntValue == 1) {
                onClick(this.f29144g);
            } else {
                if (iIntValue != 3) {
                    return;
                }
                onClick(this.f29145h);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        da();
        return true;
    }
}
