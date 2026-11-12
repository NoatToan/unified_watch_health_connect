package com.huawei.health.suggestion.ui.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes9.dex */
public class AniBlackView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ObjectAnimator f10167a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10168c;

    public AniBlackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AniBlackView(Context context) {
        super(context);
    }

    public void e(boolean z) {
        this.f10168c = z;
        if (!CommonUtil.ca()) {
            setBackgroundColor(ContextCompat.getColor(getContext(), R.color.emui_color_bg_dark));
        }
        if (z) {
            a(this, 0.0f, 1.0f, 500);
        } else {
            a(this, 1.0f, 0.0f, 300);
        }
    }

    private void a(View view, float f, float f2, int i) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "Alpha", f, f2);
        objectAnimatorOfFloat.setDuration(i);
        objectAnimatorOfFloat.start();
        this.f10167a = objectAnimatorOfFloat;
    }

    public void d() {
        LogUtil.a("Suggestion_AniBlackView", "enter cancellAlphaAnimator");
        ObjectAnimator objectAnimator = this.f10167a;
        if (objectAnimator != null && this.f10168c) {
            objectAnimator.setCurrentPlayTime(0L);
            this.f10167a.cancel();
            LogUtil.a("Suggestion_AniBlackView", "cancellAlphaAnimator mIsToBlack");
        }
    }
}
