package com.huami.wallet.ui.helper;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.huami.wallet.ui.R;

/* JADX INFO: loaded from: classes16.dex */
public class EmptyViewHelper {
    private final BaseQuickAdapter a;

    public EmptyViewHelper(BaseQuickAdapter baseQuickAdapter) {
        this.a = baseQuickAdapter;
    }

    @SuppressLint({"UseCompatTextViewDrawableApis"})
    private void a() {
        View emptyView;
        if (Build.VERSION.SDK_INT >= 23 && (emptyView = this.a.getEmptyView()) != null) {
            TextView textView = (TextView) emptyView.findViewById(R.id.hint_text);
            textView.setCompoundDrawableTintList(ColorStateList.valueOf(textView.getContext().getColor(R.color.s2)));
        }
    }

    public void removeEmptyView() {
        ViewGroup viewGroup = (ViewGroup) this.a.getEmptyView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    public void showEmptyView() {
        this.a.setEmptyView(R.layout.wl_empty);
        a();
    }

    public void showFailView() {
        this.a.setEmptyView(R.layout.wl_empty);
        View emptyView = this.a.getEmptyView();
        a();
        ((TextView) emptyView.findViewById(R.id.hint_text)).setText(R.string.wl_loading_fail);
    }

    public void showRetryView(View.OnClickListener onClickListener) {
        this.a.setEmptyView(R.layout.wl_empty);
        a();
        View emptyView = this.a.getEmptyView();
        ((TextView) emptyView.findViewById(R.id.hint_text)).setText(R.string.wl_loading_fail_and_retry);
        emptyView.findViewById(R.id.empty_container).setOnClickListener(onClickListener);
    }
}
