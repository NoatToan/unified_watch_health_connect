package zb0;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.GCMComplexOneLineButton;

/* JADX INFO: loaded from: classes8.dex */
public class o0 extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMComplexOneLineButton f203606a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y0 f203607b = null;

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        sd2.f fVarR2 = this.f203607b.r2();
        if (fVarR2 == null || TextUtils.isEmpty(fVarR2.r1())) {
            getView().setVisibility(8);
            return;
        }
        getView().setVisibility(0);
        String strR1 = fVarR2.r1();
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) getView().findViewById(R.id.custom_bttn_video_1);
        this.f203606a = gCMComplexOneLineButton;
        gCMComplexOneLineButton.setButtonLeftLabel(strR1);
        this.f203606a.setTag(strR1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f203607b = (y0) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.gcm_device_videos, (ViewGroup) null);
    }
}
