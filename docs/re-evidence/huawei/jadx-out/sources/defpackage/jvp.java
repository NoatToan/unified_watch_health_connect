package defpackage;

import android.widget.RelativeLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes10.dex */
public class jvp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f39119a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f39120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f39121c;
    private HealthTextView d;

    public jvp(HealthTextView healthTextView, HealthTextView healthTextView2, RelativeLayout relativeLayout) {
        this.d = healthTextView;
        this.f39120b = healthTextView2;
        this.f39121c = relativeLayout;
        if (healthTextView != null) {
            healthTextView.setTypeface(jxk.d());
        }
    }

    public RelativeLayout a() {
        return this.f39121c;
    }

    public HealthTextView c() {
        return this.f39120b;
    }

    public void b(jvw jvwVar) {
        if (jvwVar == null) {
            LogUtil.e("Track_TrackMainViewHolderItem", "trackShowItemValue mTrackMainPageData is null,");
            return;
        }
        HealthTextView healthTextView = this.f39120b;
        if (healthTextView != null) {
            healthTextView.setText(jvwVar.d());
        }
        HealthTextView healthTextView2 = this.d;
        if (healthTextView2 != null) {
            healthTextView2.setText(jvwVar.c());
        }
        HealthTextView healthTextView3 = this.f39119a;
        if (healthTextView3 != null) {
            healthTextView3.setText(jvwVar.e());
        }
    }

    public void d(String str, String str2) {
        HealthTextView healthTextView = this.d;
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
        HealthTextView healthTextView2 = this.f39120b;
        if (healthTextView2 != null) {
            healthTextView2.setText(str2);
        }
    }
}
