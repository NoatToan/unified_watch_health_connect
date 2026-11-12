package com.garmin.android.apps.connectmobile.devices.setup.wizard;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class a extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f34507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC0581a f34508g;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.devices.setup.wizard.a$a, reason: collision with other inner class name */
    public interface InterfaceC0581a {
        void a8(String str, boolean z14);
    }

    public static a u6(String str, int i14, String str2, String str3, String str4, String str5) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putString("ACTION_ID", str);
        bundle.putInt("ACTION_IMAGE_RES_ID", i14);
        bundle.putString("ACTION_TITLE", str2);
        bundle.putString("ACTION_DESCRIPTION", str3);
        bundle.putString("ACTION_POSITIVE_LABEL", str4);
        bundle.putString("ACTION_NEGATIVE_LABEL", str5);
        aVar.setArguments(bundle);
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        i2.a(a2.DEVICES, "ActionSelectionWizardFragment", ".onAttach()");
        try {
            this.f34508g = (InterfaceC0581a) context;
        } catch (ClassCastException unused) {
            com.nimbusds.jose.shaded.gson.internal.a.r(context.toString(), InterfaceC0581a.class.getSimpleName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f34502a = arguments.getString("ACTION_ID");
            this.f34503b = arguments.getInt("ACTION_IMAGE_RES_ID");
            this.f34504c = arguments.getString("ACTION_TITLE");
            this.f34505d = arguments.getString("ACTION_DESCRIPTION");
            this.f34506e = arguments.getString("ACTION_POSITIVE_LABEL");
            this.f34507f = arguments.getString("ACTION_NEGATIVE_LABEL");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.gcm3_device_setup_action_selection, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.action_image);
        TextView textView = (TextView) viewInflate.findViewById(R.id.action_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.action_description);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.button_positive_action);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.button_negative_action);
        imageView.setImageResource(this.f34503b);
        textView.setText(this.f34504c);
        textView2.setText(this.f34505d);
        textView3.setText(this.f34506e);
        final int i14 = 0;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: dd0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.setup.wizard.a f59155b;

            {
                this.f59155b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        com.garmin.android.apps.connectmobile.devices.setup.wizard.a aVar = this.f59155b;
                        aVar.f34508g.a8(aVar.f34502a, true);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.devices.setup.wizard.a aVar2 = this.f59155b;
                        aVar2.f34508g.a8(aVar2.f34502a, false);
                        break;
                }
            }
        });
        textView4.setText(this.f34507f);
        final int i15 = 1;
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: dd0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.setup.wizard.a f59155b;

            {
                this.f59155b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.devices.setup.wizard.a aVar = this.f59155b;
                        aVar.f34508g.a8(aVar.f34502a, true);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.devices.setup.wizard.a aVar2 = this.f59155b;
                        aVar2.f34508g.a8(aVar2.f34502a, false);
                        break;
                }
            }
        });
        return viewInflate;
    }
}
