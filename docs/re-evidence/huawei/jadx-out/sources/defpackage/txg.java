package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class txg extends ucb {
    private Context e;

    public txg(Context context, List<Integer> list, List<String> list2, List<String> list3) {
        super(context, list, list2, list3);
        this.e = context;
    }

    @Override // defpackage.ucb
    protected void c(View view, int i, HealthTextView healthTextView, ImageView imageView) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.float_content);
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
        int dimensionPixelSize2 = this.e.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
        int i2 = this.e.getResources().getDisplayMetrics().widthPixels;
        if (linearLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.addRule(15, -1);
            layoutParams.setMargins(((Integer) safeRegionWidth.first).intValue() + dimensionPixelSize, 0, ((Integer) safeRegionWidth.second).intValue() + dimensionPixelSize2, 0);
            linearLayout.setLayoutParams(layoutParams);
        }
        d(safeRegionWidth, dimensionPixelSize, dimensionPixelSize2, i2, imageView);
    }
}
