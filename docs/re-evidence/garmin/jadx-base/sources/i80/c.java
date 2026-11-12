package i80;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.z1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li80/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c extends Fragment {
    public final void u6(String str) {
        m activity = getActivity();
        activity.getClass();
        ((z1) activity).setSubtitle(str);
    }
}
