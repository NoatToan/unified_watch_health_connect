package defpackage;

import android.view.View;
import com.huawei.health.device.ui.measure.fragment.GuestUserInfoGuideFragment;
import health.compact.a.util.LogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class dva implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference<GuestUserInfoGuideFragment> f32406c;
    private int d;

    public dva(GuestUserInfoGuideFragment guestUserInfoGuideFragment, int i) {
        this.f32406c = new WeakReference<>(guestUserInfoGuideFragment);
        this.d = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        LogUtil.a("GenderSelectListener", "GenderSelectListener onClick(), gender:", Integer.valueOf(this.d));
        GuestUserInfoGuideFragment guestUserInfoGuideFragment = this.f32406c.get();
        if (guestUserInfoGuideFragment == null) {
            LogUtil.c("GenderSelectListener", "GenderSelectListener UserInfoActivity =null");
        } else {
            guestUserInfoGuideFragment.dealGenderClicked(this.d);
        }
    }
}
