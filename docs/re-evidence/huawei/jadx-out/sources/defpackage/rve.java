package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.homehealth.R;
import health.compact.a.KeyValDbManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class rve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView f47756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Activity f47757b;
    private final HealthViewPager d;
    private final ConstraintLayout e;

    public rve(Activity activity, View view) {
        this.f47757b = activity;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.main_guide_root_layout);
        this.e = constraintLayout;
        this.d = (HealthViewPager) constraintLayout.findViewById(R.id.view_pager);
        this.f47756a = (ImageView) constraintLayout.findViewById(R.id.close_img);
    }

    public void c(List<View> list, final int i) {
        Activity activity = this.f47757b;
        if (activity == null || activity.isFinishing() || this.f47757b.isDestroyed()) {
            LogUtil.j("DeviceGuideViewManager", "activity is null or activity is not running");
            return;
        }
        if (this.e == null) {
            LogUtil.j("DeviceGuideViewManager", "rootView is null");
            return;
        }
        this.f47756a.setOnClickListener(new View.OnClickListener() { // from class: rvg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(i, view);
            }
        });
        ArrayList<View> arrayList = new ArrayList<>();
        arrayList.addAll(list);
        this.d.setAdapter(new qto(arrayList));
        this.d.setTag(0);
        d(arrayList);
        this.e.setVisibility(0);
    }

    /* synthetic */ void b(int i, View view) {
        LogUtil.a("DeviceGuideViewManager", "close btn clicked indexKey:", Integer.valueOf(i));
        c();
        a(i == 0 ? "DEVICE_GUIDE_VIEW_FLAG" : "VMALL_GUIDE_VIEW_FLAG");
    }

    public void d() {
        HealthViewPager healthViewPager = this.d;
        if (healthViewPager == null) {
            LogUtil.j("DeviceGuideViewManager", "showNextPage sViewPager == null");
        } else {
            healthViewPager.nextPage(true);
        }
    }

    public void c() {
        ConstraintLayout constraintLayout = this.e;
        if (constraintLayout == null) {
            LogUtil.j("DeviceGuideViewManager", "hideGuide rootView == null");
        } else {
            constraintLayout.setVisibility(8);
        }
    }

    private void d(ArrayList<View> arrayList) {
        int dimensionPixelSize = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_28dp);
        int i = 0;
        for (View view : arrayList) {
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.text);
            HealthButton healthButton = (HealthButton) view.findViewById(R.id.button);
            i++;
            healthButton.setTag(Integer.valueOf(i));
            if (qrs.v()) {
                float f = dimensionPixelSize;
                healthTextView.setTextSize(0, f);
                healthButton.setAutoTextSize(0, f);
                healthButton.setAutoTextInfo(dimensionPixelSize, 1, 0);
            }
        }
    }

    public boolean a(int i) {
        String str;
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        LogUtil.a("DeviceGuideViewManager", "shouldLoadGuideView mCurrentIndex :", Integer.valueOf(i));
        if (i == 0) {
            str = strC + "DEVICE_GUIDE_VIEW_FLAG";
        } else {
            str = strC + "VMALL_GUIDE_VIEW_FLAG";
        }
        LogUtil.a("DeviceGuideViewManager", "storageKey:", str);
        String sharedPreference = lvb.e().getSharedPreference(str);
        LogUtil.a("DeviceGuideViewManager", "complete:", sharedPreference);
        return !"complete".equals(sharedPreference);
    }

    public void a(String str) {
        String str2 = KeyValDbManager.d(BaseApplication.getContext()).c("user_id") + str;
        LogUtil.a("DeviceGuideViewManager", "setGuideComplete storageKey:", str2);
        lvb.e().setSharedPreference(str2, "complete", null);
    }

    public boolean e() {
        ConstraintLayout constraintLayout = this.e;
        return constraintLayout != null && constraintLayout.getVisibility() == 0;
    }
}
