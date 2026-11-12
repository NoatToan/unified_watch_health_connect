package ng1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lng1/t;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f126008c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f126009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f126010b;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f126009a = Long.valueOf(arguments.getLong("GCM_deviceUnitID"));
            this.f126010b = arguments.getString("GCM_deviceProductNbr");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.index_connect_to_wifi_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ((TextView) view2.findViewById(R.id.product_support_textview)).setOnClickListener(new mt0.h0(this, 14));
        TextView textView = (TextView) view2.findViewById(R.id.connect_device_to_wifi_title);
        TextView textView2 = (TextView) view2.findViewById(R.id.connect_device_to_wifi_tv);
        if (zb0.u0.n(this.f126010b, zb0.u0.S5)) {
            textView2.setText(R.string.msg_mercury_device_connect_to_wifi);
            textView.setText(getString(R.string.lbl_connecting_device_to_wifi, getString(R.string.lbl_index_bpm)));
        } else {
            textView2.setText(R.string.lbl_index_scale_reset_description);
            textView.setText(getString(R.string.title_connecting_scale_to_wifi));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lng1/t$a;", "", "<init>", "()V", "", "FRAGMENT_NAME", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
