package bo1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes10.dex */
public class b extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f19239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19240b = 5;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f19239a = (c) context;
        } catch (ClassCastException unused) {
            i2.d("TipOverlayFragment", "Activity must implement TipsListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f19240b = arguments.getInt("extra_tip");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i14;
        int i15 = this.f19240b;
        if (i15 == 1) {
            i14 = R.layout.gcm3_tip_chart_zoom_fragment;
        } else if (i15 != 3) {
            i14 = i15 != 4 ? R.layout.gcm3_tip_create_course_busy_fragment : R.layout.gcm3_tip_chart_double_tap_fragment;
        } else {
            i14 = R.layout.gcm3_tip_chart_tap_fragment;
        }
        View viewInflate = layoutInflater.inflate(i14, viewGroup, false);
        if (this.f19240b == 5) {
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        ImageView imageView = (ImageView) view2.findViewById(R.id.close_btn);
        if (imageView != null) {
            imageView.setOnClickListener(new a32.b(this, 18));
        }
    }
}
