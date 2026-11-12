package com.zhouyou.recyclerview.refresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes22.dex */
public class BaseMoreFooter extends LinearLayout implements IMoreFooter {
    private int a;
    public String loadingDoneHint;
    public String loadingHint;
    public String noMoreHint;

    public BaseMoreFooter(Context context) {
        super(context);
        initView();
    }

    @Override // com.zhouyou.recyclerview.refresh.IMoreFooter
    public View getFooterView() {
        return this;
    }

    public void initView() {
        setGravity(17);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
    }

    @Override // com.zhouyou.recyclerview.refresh.IMoreFooter
    public boolean isLoadingMore() {
        return this.a == 0;
    }

    @Override // com.zhouyou.recyclerview.refresh.IMoreFooter
    public void setLoadingDoneHint(String str) {
        this.loadingDoneHint = str;
    }

    @Override // com.zhouyou.recyclerview.refresh.IMoreFooter
    public void setLoadingHint(String str) {
        this.loadingHint = str;
    }

    @Override // com.zhouyou.recyclerview.refresh.IMoreFooter
    public void setNoMoreHint(String str) {
        this.noMoreHint = str;
    }

    @Override // com.zhouyou.recyclerview.refresh.IMoreFooter
    public void setProgressStyle(int i) {
    }

    @Override // com.zhouyou.recyclerview.refresh.IMoreFooter
    public void setState(int i) {
        this.a = i;
    }

    public BaseMoreFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView();
    }
}
