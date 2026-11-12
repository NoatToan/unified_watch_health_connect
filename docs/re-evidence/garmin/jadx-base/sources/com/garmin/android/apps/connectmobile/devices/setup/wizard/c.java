package com.garmin.android.apps.connectmobile.devices.setup.wizard;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.x;

/* JADX INFO: loaded from: classes8.dex */
public class c extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f34518d;

    public interface a {
        void L3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof a) {
            this.f34518d = (a) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement DeviceSetupCompleteExtraScreenListener");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f34515a = getArguments().getInt("DEVICE_IMAGE_RES_ID", 2131231969);
            this.f34516b = getArguments().getString("TITLE_MESSAGE");
            this.f34517c = getArguments().getString("INFO_MESSAGE");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.device_setup_complete_extra_screen, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f34518d = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        ImageView imageView = (ImageView) view2.findViewById(R.id.setup_compete_extra_device_image);
        TextView textView = (TextView) view2.findViewById(R.id.setup_compete_extra_title);
        TextView textView2 = (TextView) view2.findViewById(R.id.setup_compete_extra_description);
        Button button = (Button) view2.findViewById(R.id.setup_compete_extra_button_action);
        imageView.setImageResource(this.f34515a);
        textView.setText(this.f34516b);
        textView2.setText(this.f34517c);
        button.setOnClickListener(new x(this, 13));
    }
}
