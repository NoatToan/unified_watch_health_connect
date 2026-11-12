package com.garmin.android.apps.connectmobile.devices.setup.wizard;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
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
public class f extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f34534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34537d;

    public interface a {
        void X6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        i2.a(a2.DEVICES, "HowToPairWizardFragment", ".onAttach()");
        try {
            this.f34534a = (a) context;
        } catch (ClassCastException unused) {
            com.nimbusds.jose.shaded.gson.internal.a.r(context.toString(), a.class.getSimpleName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f34535b = arguments.getInt("HOW_TO_PAIR_LAYOUT_RES_ID", -1);
            this.f34536c = arguments.getInt("HOW_TO_PAIR_IMAGE_RES_ID", -1);
            this.f34537d = arguments.getString("INFO_MESSAGE");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.gcm3_pair_tutorial, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        TextView textView = (TextView) view2.findViewById(R.id.info_message);
        if (!TextUtils.isEmpty(this.f34537d)) {
            textView.setText(this.f34537d);
        }
        ViewGroup viewGroup = (FrameLayout) view2.findViewById(R.id.device_pair_image_container);
        if (this.f34535b != -1) {
            LayoutInflater.from(getActivity()).inflate(this.f34535b, viewGroup, true);
        } else if (this.f34536c != -1) {
            ImageView imageView = new ImageView(getActivity());
            imageView.setImageResource(this.f34536c);
            viewGroup.addView(imageView);
        }
        ((Button) view2.findViewById(R.id.button_next)).setOnClickListener(new x(this, 16));
    }
}
