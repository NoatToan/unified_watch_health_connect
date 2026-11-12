package com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload;

import android.content.Context;
import android.util.AttributeSet;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;

/* JADX INFO: loaded from: classes10.dex */
public class RecyclerPreloadView extends HealthRecycleView {
    private boolean d;
    private ScrollFastListener e;

    public interface ScrollFastListener {
        void scrollFast();

        void scrollSlow();
    }

    public RecyclerPreloadView(Context context) {
        super(context);
        this.e = null;
        this.d = false;
    }

    public RecyclerPreloadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = null;
        this.d = false;
    }

    public RecyclerPreloadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = null;
        this.d = false;
    }

    public void setListenter(ScrollFastListener scrollFastListener) {
        this.e = scrollFastListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        if (i == 0) {
            this.e.scrollSlow();
            this.d = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        LogUtil.a("RecyclerPreloadView", "dy is ", Integer.valueOf(Math.abs(i2)));
        boolean z = Math.abs(i2) >= 90;
        if (z != this.d) {
            this.d = z;
            if (z) {
                this.e.scrollFast();
            } else {
                this.e.scrollSlow();
            }
        }
        super.onScrolled(i, i2);
    }
}
