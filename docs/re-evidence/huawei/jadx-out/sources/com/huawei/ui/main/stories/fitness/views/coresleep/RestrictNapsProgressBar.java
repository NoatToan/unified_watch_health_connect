package com.huawei.ui.main.stories.fitness.views.coresleep;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.main.R;

/* JADX INFO: loaded from: classes2.dex */
public class RestrictNapsProgressBar extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f27259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Guideline f27260c;
    private HealthProgressBar e;

    public RestrictNapsProgressBar(Context context) {
        super(context);
        e(context);
    }

    public RestrictNapsProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    public RestrictNapsProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context);
    }

    public void setProgress(int i) {
        this.e.setProgress(i);
        ViewGroup.LayoutParams layoutParams = this.f27260c.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).guidePercent = i / 100.0f;
            this.f27260c.setLayoutParams(layoutParams);
        }
    }

    public void setTile(String str) {
        this.f27259b.setText(str);
    }

    private void e(Context context) {
        setClipToPadding(false);
        setClipChildren(false);
        LayoutInflater.from(context).inflate(R.layout.sleep_task_progress_bar, this);
        this.e = (HealthProgressBar) findViewById(R.id.sleep_task_progress);
        this.f27259b = (HealthTextView) findViewById(R.id.sleep_naps_time);
        this.f27260c = (Guideline) findViewById(R.id.progress_guide_line);
    }
}
