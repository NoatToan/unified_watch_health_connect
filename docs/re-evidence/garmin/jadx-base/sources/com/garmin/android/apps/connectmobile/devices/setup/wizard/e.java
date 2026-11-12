package com.garmin.android.apps.connectmobile.devices.setup.wizard;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connectiq.x;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class e extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f34529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34533e;

    public interface a {
        void V0();
    }

    public static e u6(int i14, String str, String str2) {
        e eVar = new e();
        Bundle bundle = new Bundle();
        bundle.putInt("DEVICE_IMAGE_RES_ID", i14);
        bundle.putString("TITLE_MESSAGE", str);
        bundle.putString("INFO_MESSAGE", str2);
        eVar.setArguments(bundle);
        return eVar;
    }

    public static e v6(int i14, String str, String str2) {
        e eVar = new e();
        Bundle bundle = new Bundle();
        bundle.putInt("DEVICE_LAYOUT_RES_ID", i14);
        bundle.putString("TITLE_MESSAGE", str);
        bundle.putString("INFO_MESSAGE", str2);
        eVar.setArguments(bundle);
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        i2.a(a2.DEVICES, "FailureWizardFragment", ".onAttach()");
        try {
            this.f34529a = (a) context;
        } catch (ClassCastException unused) {
            com.nimbusds.jose.shaded.gson.internal.a.r(context.toString(), a.class.getSimpleName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f34530b = arguments.getInt("DEVICE_LAYOUT_RES_ID", -1);
            this.f34531c = arguments.getInt("DEVICE_IMAGE_RES_ID", -1);
            this.f34533e = arguments.getString("TITLE_MESSAGE");
            this.f34532d = arguments.getString("INFO_MESSAGE");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.gcm3_device_setup_failure, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        ((TextView) view2.findViewById(R.id.failure_title)).setText(this.f34533e);
        ((TextView) view2.findViewById(R.id.failure_description)).setText(this.f34532d);
        ViewGroup viewGroup = (FrameLayout) view2.findViewById(R.id.failure_image_container);
        if (this.f34530b != -1) {
            LayoutInflater.from(getActivity()).inflate(this.f34530b, viewGroup, true);
        } else if (this.f34531c != -1) {
            ImageView imageView = new ImageView(getActivity());
            imageView.setImageResource(this.f34531c);
            viewGroup.addView(imageView);
        }
        Button button = (Button) view2.findViewById(R.id.button_action);
        button.setText(R.string.common_retry);
        button.setOnClickListener(new x(this, 15));
    }
}
