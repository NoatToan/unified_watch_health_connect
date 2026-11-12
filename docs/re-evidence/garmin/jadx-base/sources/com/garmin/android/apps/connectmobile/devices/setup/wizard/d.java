package com.garmin.android.apps.connectmobile.devices.setup.wizard;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connectiq.x;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class d extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ProgressBar f34519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f34520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f34521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f34522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f34523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f34526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f34528j;

    public interface a {
        void C8();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        i2.a(a2.DEVICES, "DeviceSetupProgressWizardFragment", ".onAttach()");
        try {
            this.f34528j = (a) context;
        } catch (ClassCastException unused) {
            com.nimbusds.jose.shaded.gson.internal.a.r(context.toString(), a.class.getSimpleName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f34524f = arguments.getInt("DEVICE_SETUP_PROGRESS_IMAGE_RES_ID");
            this.f34525g = arguments.getInt("DEVICE_SETUP_COMPLETE_IMAGE_RES_ID");
            this.f34526h = arguments.getString("DEVICE_SETUP_MESSAGE");
            this.f34527i = arguments.getInt("DEVICE_SETUP_PROGRESS_MAX");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.gcm3_device_setup_progress, viewGroup, false);
        this.f34523e = (ImageView) viewInflate.findViewById(R.id.device_setup_image);
        TextView textView = (TextView) viewInflate.findViewById(R.id.device_setup_message);
        this.f34519a = (ProgressBar) viewInflate.findViewById(R.id.device_setup_progress_bar);
        this.f34520b = (ImageView) viewInflate.findViewById(R.id.device_setup_successful_image);
        this.f34521c = (TextView) viewInflate.findViewById(R.id.device_setup_status);
        this.f34522d = (TextView) viewInflate.findViewById(R.id.button_exit_setup);
        this.f34523e.setImageResource(this.f34524f);
        textView.setText(this.f34526h);
        this.f34519a.setMax(this.f34527i);
        this.f34519a.setProgress(0);
        this.f34521c.setText(getString(R.string.lbl_setup_in_progress));
        this.f34522d.setOnClickListener(new x(this, 14));
        return viewInflate;
    }
}
