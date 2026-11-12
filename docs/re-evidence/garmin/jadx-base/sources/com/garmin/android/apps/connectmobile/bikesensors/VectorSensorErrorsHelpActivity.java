package com.garmin.android.apps.connectmobile.bikesensors;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.m;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.util.Objects;
import zb0.u0;

/* JADX INFO: loaded from: classes7.dex */
public class VectorSensorErrorsHelpActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f30819o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f30821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f30822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f30823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f30824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f30825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f30826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f30827h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f30828i = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f30829j = new c();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f30830k = new d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f30831l = new e();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f30832m = new f();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g f30833n = new g();

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.bikesensors.VectorSensorErrorsHelpActivity$a$a, reason: collision with other inner class name */
        public class RunnableC0489a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ColorStateList f30835a;

            public RunnableC0489a(ColorStateList colorStateList) {
                this.f30835a = colorStateList;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                VectorSensorErrorsHelpActivity.this.f30821b.setImageResource(2131232091);
                VectorSensorErrorsHelpActivity.this.f30821b.setImageTintList(this.f30835a);
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int i14 = VectorSensorErrorsHelpActivity.f30819o;
            VectorSensorErrorsHelpActivity vectorSensorErrorsHelpActivity = VectorSensorErrorsHelpActivity.this;
            vectorSensorErrorsHelpActivity.ca();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(a7.b.getColor(view2.getContext(), R.color.gcm_icon_primary));
            zp0.c cVar = new zp0.c((m) vectorSensorErrorsHelpActivity);
            cVar.f206567g = 2131233613;
            cVar.h(vectorSensorErrorsHelpActivity.f30821b);
            vectorSensorErrorsHelpActivity.f30821b.postDelayed(new RunnableC0489a(colorStateListValueOf), 500L);
        }
    }

    public class b implements View.OnClickListener {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ColorStateList f30838a;

            public a(ColorStateList colorStateList) {
                this.f30838a = colorStateList;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                VectorSensorErrorsHelpActivity.this.f30821b.setImageResource(2131232091);
                VectorSensorErrorsHelpActivity.this.f30821b.setImageTintList(this.f30838a);
            }
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int i14 = VectorSensorErrorsHelpActivity.f30819o;
            VectorSensorErrorsHelpActivity vectorSensorErrorsHelpActivity = VectorSensorErrorsHelpActivity.this;
            vectorSensorErrorsHelpActivity.ca();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(a7.b.getColor(view2.getContext(), R.color.gcm_icon_primary));
            zp0.c cVar = new zp0.c((m) vectorSensorErrorsHelpActivity);
            cVar.f206567g = 2131233609;
            cVar.h(vectorSensorErrorsHelpActivity.f30821b);
            vectorSensorErrorsHelpActivity.f30821b.postDelayed(new a(colorStateListValueOf), 5000L);
        }
    }

    public class c implements View.OnClickListener {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ColorStateList f30841a;

            public a(ColorStateList colorStateList) {
                this.f30841a = colorStateList;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                VectorSensorErrorsHelpActivity.this.f30823d.setImageResource(2131232091);
                VectorSensorErrorsHelpActivity.this.f30823d.setImageTintList(this.f30841a);
            }
        }

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int i14 = VectorSensorErrorsHelpActivity.f30819o;
            VectorSensorErrorsHelpActivity vectorSensorErrorsHelpActivity = VectorSensorErrorsHelpActivity.this;
            vectorSensorErrorsHelpActivity.ca();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(a7.b.getColor(view2.getContext(), R.color.gcm_icon_primary));
            zp0.c cVar = new zp0.c((m) vectorSensorErrorsHelpActivity);
            cVar.f206567g = 2131233617;
            cVar.h(vectorSensorErrorsHelpActivity.f30823d);
            vectorSensorErrorsHelpActivity.f30823d.postDelayed(new a(colorStateListValueOf), 5000L);
        }
    }

    public class d implements View.OnClickListener {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ColorStateList f30844a;

            public a(ColorStateList colorStateList) {
                this.f30844a = colorStateList;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                VectorSensorErrorsHelpActivity.this.f30822c.setImageResource(2131232091);
                VectorSensorErrorsHelpActivity.this.f30822c.setImageTintList(this.f30844a);
            }
        }

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int i14 = VectorSensorErrorsHelpActivity.f30819o;
            VectorSensorErrorsHelpActivity vectorSensorErrorsHelpActivity = VectorSensorErrorsHelpActivity.this;
            vectorSensorErrorsHelpActivity.ca();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(a7.b.getColor(view2.getContext(), R.color.gcm_icon_primary));
            zp0.c cVar = new zp0.c((m) vectorSensorErrorsHelpActivity);
            cVar.f206567g = 2131233612;
            cVar.h(vectorSensorErrorsHelpActivity.f30822c);
            vectorSensorErrorsHelpActivity.f30822c.postDelayed(new a(colorStateListValueOf), 5000L);
        }
    }

    public class e implements View.OnClickListener {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ColorStateList f30847a;

            public a(ColorStateList colorStateList) {
                this.f30847a = colorStateList;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                VectorSensorErrorsHelpActivity.this.f30824e.setImageResource(2131232091);
                VectorSensorErrorsHelpActivity.this.f30824e.setImageTintList(this.f30847a);
            }
        }

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int i14 = VectorSensorErrorsHelpActivity.f30819o;
            VectorSensorErrorsHelpActivity vectorSensorErrorsHelpActivity = VectorSensorErrorsHelpActivity.this;
            vectorSensorErrorsHelpActivity.ca();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(a7.b.getColor(view2.getContext(), R.color.gcm_icon_primary));
            zp0.c cVar = new zp0.c((m) vectorSensorErrorsHelpActivity);
            cVar.f206567g = 2131233610;
            cVar.h(vectorSensorErrorsHelpActivity.f30824e);
            vectorSensorErrorsHelpActivity.f30824e.postDelayed(new a(colorStateListValueOf), 11000L);
        }
    }

    public class f implements View.OnClickListener {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ColorStateList f30850a;

            public a(ColorStateList colorStateList) {
                this.f30850a = colorStateList;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f fVar = f.this;
                VectorSensorErrorsHelpActivity.this.f30825f.setImageResource(2131232091);
                VectorSensorErrorsHelpActivity.this.f30825f.setImageTintList(this.f30850a);
            }
        }

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int i14 = VectorSensorErrorsHelpActivity.f30819o;
            VectorSensorErrorsHelpActivity vectorSensorErrorsHelpActivity = VectorSensorErrorsHelpActivity.this;
            vectorSensorErrorsHelpActivity.ca();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(a7.b.getColor(view2.getContext(), R.color.gcm_icon_primary));
            zp0.c cVar = new zp0.c((m) vectorSensorErrorsHelpActivity);
            cVar.f206567g = 2131233611;
            cVar.h(vectorSensorErrorsHelpActivity.f30825f);
            vectorSensorErrorsHelpActivity.f30825f.postDelayed(new a(colorStateListValueOf), 11000L);
        }
    }

    public class g implements View.OnClickListener {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ColorStateList f30853a;

            public a(ColorStateList colorStateList) {
                this.f30853a = colorStateList;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g gVar = g.this;
                VectorSensorErrorsHelpActivity.this.f30826g.setImageResource(2131232091);
                VectorSensorErrorsHelpActivity.this.f30826g.setImageTintList(this.f30853a);
            }
        }

        public g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int i14 = VectorSensorErrorsHelpActivity.f30819o;
            VectorSensorErrorsHelpActivity vectorSensorErrorsHelpActivity = VectorSensorErrorsHelpActivity.this;
            vectorSensorErrorsHelpActivity.ca();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(a7.b.getColor(view2.getContext(), R.color.gcm_icon_primary));
            zp0.c cVar = new zp0.c((m) vectorSensorErrorsHelpActivity);
            cVar.f206567g = 2131233615;
            cVar.h(vectorSensorErrorsHelpActivity.f30826g);
            vectorSensorErrorsHelpActivity.f30826g.postDelayed(new a(colorStateListValueOf), AbstractComponentTracker.LINGERING_TIMEOUT);
        }
    }

    public final void ca() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(a7.b.getColor(this, R.color.gcm_icon_primary));
        this.f30821b.setImageResource(2131232091);
        this.f30821b.setImageTintList(colorStateListValueOf);
        this.f30823d.setImageResource(2131232091);
        this.f30823d.setImageTintList(colorStateListValueOf);
        this.f30822c.setImageResource(2131232091);
        this.f30822c.setImageTintList(colorStateListValueOf);
        this.f30824e.setImageResource(2131232091);
        this.f30824e.setImageTintList(colorStateListValueOf);
        this.f30825f.setImageResource(2131232091);
        this.f30825f.setImageTintList(colorStateListValueOf);
        this.f30826g.setImageResource(2131232091);
        this.f30826g.setImageTintList(colorStateListValueOf);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_vector_settings_sensor_errors);
        boolean booleanExtra = getIntent().getBooleanExtra("isErrorCodeActivity", true);
        String stringExtra = getIntent().getStringExtra("GCM_deviceProductNbr");
        Objects.requireNonNull(stringExtra);
        this.f30820a = stringExtra;
        initActionBar(true, getString(booleanExtra ? R.string.device_settings_vector_sensor_errors_label : R.string.device_settings_vector_firmware_update_title));
        ((LinearLayout) findViewById(R.id.firmware_update_completion_info)).setVisibility(booleanExtra ? 8 : 0);
        TextView textView = (TextView) findViewById(R.id.pedal_disconnect_title_label);
        TextView textView2 = (TextView) findViewById(R.id.pedal_disconnect_description);
        TextView textView3 = (TextView) findViewById(R.id.check_pedal_description);
        TextView textView4 = (TextView) findViewById(R.id.sensor_error_description_label);
        String string = getString(R.string.title_garmin);
        textView.setText(getString(R.string.device_settings_vector_disconnect_info_title, string));
        textView2.setText(getString(R.string.device_settings_vector_disconnect_info_notes, string));
        textView3.setText(getString(R.string.device_settings_vector_status_info_notes, string));
        textView4.setText(getString(R.string.device_settings_vector_sensor_errors_header, string));
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) findViewById(R.id.sensor_error_wake_up);
        String str = this.f30820a;
        u0 u0Var = u0.R5;
        if (u0.n(str, u0Var) || u0.n(this.f30820a, u0.U5)) {
            gCMComplexTwoLineButton.setButtonTopLabel(getString(R.string.lbl_power_on));
            gCMComplexTwoLineButton.setButtonBottomLeftLabel(getString(R.string.lbl_sensor_indicators_power_on_description));
            gCMComplexTwoLineButton.setOnClickListener(this.f30828i);
        } else {
            gCMComplexTwoLineButton.setOnClickListener(this.f30827h);
        }
        ImageView imageView = (ImageView) gCMComplexTwoLineButton.findViewById(R.id.icon_right);
        this.f30821b = imageView;
        imageView.setVisibility(0);
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = (GCMComplexTwoLineButton) findViewById(R.id.sensor_error_firmware_updating);
        ImageView imageView2 = (ImageView) gCMComplexTwoLineButton2.findViewById(R.id.icon_right);
        this.f30823d = imageView2;
        imageView2.setVisibility(0);
        gCMComplexTwoLineButton2.setOnClickListener(this.f30829j);
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = (GCMComplexTwoLineButton) findViewById(R.id.sensor_error_firmware_update_in_progress);
        ImageView imageView3 = (ImageView) gCMComplexTwoLineButton3.findViewById(R.id.icon_right);
        this.f30822c = imageView3;
        imageView3.setVisibility(0);
        gCMComplexTwoLineButton3.setOnClickListener(this.f30830k);
        if (u0.n(this.f30820a, u0Var) || u0.n(this.f30820a, u0.U5)) {
            gCMComplexTwoLineButton3.setVisible(true);
        } else {
            gCMComplexTwoLineButton3.setVisible(false);
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = (GCMComplexTwoLineButton) findViewById(R.id.sensor_error_firmware_update_failure);
        ImageView imageView4 = (ImageView) gCMComplexTwoLineButton4.findViewById(R.id.icon_right);
        this.f30824e = imageView4;
        imageView4.setVisibility(0);
        gCMComplexTwoLineButton4.setOnClickListener(this.f30831l);
        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = (GCMComplexTwoLineButton) findViewById(R.id.sensor_error_firmware_update_success);
        ImageView imageView5 = (ImageView) gCMComplexTwoLineButton5.findViewById(R.id.icon_right);
        this.f30825f = imageView5;
        imageView5.setVisibility(0);
        gCMComplexTwoLineButton5.setOnClickListener(this.f30832m);
        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = (GCMComplexTwoLineButton) findViewById(R.id.sensor_error_searching_for_paired_pedal);
        ImageView imageView6 = (ImageView) gCMComplexTwoLineButton6.findViewById(R.id.icon_right);
        this.f30826g = imageView6;
        imageView6.setVisibility(0);
        gCMComplexTwoLineButton6.setOnClickListener(this.f30833n);
        ca();
    }
}
