package com.zhouyou.recyclerview.refresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.zhouyou.recyclerview.progressindicator.AVLoadingIndicatorView;
import com.zhouyou.recyclerviewsdk.R;

/* JADX INFO: loaded from: classes22.dex */
public class LoadingMoreFooter extends BaseMoreFooter {
    private SimpleViewSwitcher b;
    private TextView c;

    public LoadingMoreFooter(Context context) {
        super(context);
    }

    @Override // com.zhouyou.recyclerview.refresh.BaseMoreFooter
    public void initView() {
        super.initView();
        SimpleViewSwitcher simpleViewSwitcher = new SimpleViewSwitcher(getContext());
        this.b = simpleViewSwitcher;
        simpleViewSwitcher.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        AVLoadingIndicatorView aVLoadingIndicatorView = new AVLoadingIndicatorView(getContext());
        aVLoadingIndicatorView.setIndicatorColor(-4868683);
        aVLoadingIndicatorView.setIndicatorId(22);
        this.b.setView(aVLoadingIndicatorView);
        addView(this.b);
        TextView textView = new TextView(getContext());
        this.c = textView;
        textView.setText("正在加载...");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins((int) getResources().getDimension(R.dimen.textandiconmargin), 0, 0, 0);
        this.c.setLayoutParams(layoutParams);
        addView(this.c);
    }

    @Override // com.zhouyou.recyclerview.refresh.BaseMoreFooter, com.zhouyou.recyclerview.refresh.IMoreFooter
    public void setProgressStyle(int i) {
        if (i == -1) {
            this.b.setView(new ProgressBar(getContext(), null, android.R.attr.progressBarStyle));
            return;
        }
        AVLoadingIndicatorView aVLoadingIndicatorView = new AVLoadingIndicatorView(getContext());
        aVLoadingIndicatorView.setIndicatorColor(-4868683);
        aVLoadingIndicatorView.setIndicatorId(i);
        this.b.setView(aVLoadingIndicatorView);
    }

    @Override // com.zhouyou.recyclerview.refresh.BaseMoreFooter, com.zhouyou.recyclerview.refresh.IMoreFooter
    public void setState(int i) {
        super.setState(i);
        if (i == 0) {
            this.b.setVisibility(0);
            this.c.setText(this.loadingHint);
            setVisibility(0);
        } else if (i == 1) {
            this.c.setText(this.loadingDoneHint);
            setVisibility(8);
        } else {
            if (i != 2) {
                return;
            }
            this.c.setText(this.noMoreHint);
            this.b.setVisibility(8);
            setVisibility(0);
        }
    }

    public LoadingMoreFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
