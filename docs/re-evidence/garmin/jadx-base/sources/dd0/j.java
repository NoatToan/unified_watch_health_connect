package dd0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public class j extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f59170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f59171b;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f59170a = arguments.getInt("LOADING_IMAGE_RES_ID");
            this.f59171b = arguments.getString("LOADING_MESSAGE");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.gcm3_device_setup_info, viewGroup, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.info_message);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.device_image);
        textView.setText(this.f59171b);
        textView.setGravity(17);
        imageView.setImageResource(this.f59170a);
        return viewInflate;
    }
}
