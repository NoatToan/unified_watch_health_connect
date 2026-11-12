package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class sks extends ucb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f48290a;

    public sks(Context context, List<Integer> list, List<String> list2, List<String> list3) {
        super(context, list, list2, list3);
        this.f48290a = context;
    }

    @Override // defpackage.ucb
    protected void c(View view, int i, HealthTextView healthTextView, ImageView imageView) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.float_content);
        if (linearLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.addRule(10, -1);
            layoutParams.addRule(20, -1);
            layoutParams.topMargin = vdo.b(this.f48290a, 148.0f);
            linearLayout.setLayoutParams(layoutParams);
        }
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        int dimensionPixelSize = this.f48290a.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
        if (imageView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams2.width = vdo.b(this.f48290a, 206.0f);
            layoutParams2.height = vdo.b(this.f48290a, 168.0f);
            layoutParams2.gravity = GravityCompat.START;
            layoutParams2.setMarginStart(dimensionPixelSize + ((Integer) safeRegionWidth.first).intValue());
            imageView.setLayoutParams(layoutParams2);
        }
    }
}
