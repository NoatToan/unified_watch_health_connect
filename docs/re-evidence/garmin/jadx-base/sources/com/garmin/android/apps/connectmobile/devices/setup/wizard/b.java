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
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class b extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f34509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f34514f;

    public interface a {
        void Y5();

        void a2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        i2.a(a2.DEVICES, "ConfirmDeviceWizardFragment", ".onAttach()");
        try {
            this.f34509a = (a) context;
        } catch (ClassCastException unused) {
            com.nimbusds.jose.shaded.gson.internal.a.r(context.toString(), a.class.getSimpleName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f34510b = arguments.getInt("MATCH_DEVICE_IMAGE_RES_ID", -1);
            this.f34511c = arguments.getInt("MATCH_DEVICE_LAYOUT_RES_ID", -1);
            this.f34512d = arguments.getInt("MATCH_DEVICE_LAYOUT_TEXT_VIEW_ID", -1);
            this.f34513e = arguments.getString("INFO_MESSAGE");
            this.f34514f = arguments.getString("PASS_KEY_MESSAGE");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.gcm3_device_pair_code, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        ((TextView) view2.findViewById(R.id.device_pair_code_info_text)).setText(this.f34513e);
        ((TextView) view2.findViewById(R.id.device_pair_code_value_text)).setText(this.f34514f);
        final int i14 = 0;
        ((Button) view2.findViewById(R.id.device_pair_code_button_deny)).setOnClickListener(new View.OnClickListener(this) { // from class: dd0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.setup.wizard.b f59166b;

            {
                this.f59166b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        this.f59166b.f34509a.Y5();
                        break;
                    default:
                        this.f59166b.f34509a.a2();
                        break;
                }
            }
        });
        final int i15 = 1;
        ((Button) view2.findViewById(R.id.device_pair_code_button_confirm)).setOnClickListener(new View.OnClickListener(this) { // from class: dd0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.setup.wizard.b f59166b;

            {
                this.f59166b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        this.f59166b.f34509a.Y5();
                        break;
                    default:
                        this.f59166b.f34509a.a2();
                        break;
                }
            }
        });
        ViewGroup viewGroup = (FrameLayout) view2.findViewById(R.id.device_pair_code_image_container);
        if (this.f34511c != -1 && this.f34512d != -1) {
            LayoutInflater.from(getActivity()).inflate(this.f34511c, viewGroup, true);
            ((TextView) viewGroup.findViewById(this.f34512d)).setText(this.f34514f);
        } else if (this.f34510b != -1) {
            ImageView imageView = new ImageView(getActivity());
            imageView.setImageResource(this.f34510b);
            viewGroup.addView(imageView);
        }
    }
}
