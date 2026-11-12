package com.huami.assistant.ui.v2.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import com.huami.assistant.R;
import com.huami.tools.analytics.DbUtils;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b5\u00106B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b5\u00109J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0016\u0010\u000e\u001a\u00020\u00052\f\b\u0001\u0010\r\u001a\u00020\u000b\"\u00020\fH\u0016J \u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0016J \u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J \u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J(\u0010#\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0016J(\u0010$\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0016J \u0010(\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\fH\u0016J\b\u0010)\u001a\u00020\u0017H\u0016R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103¨\u0006:"}, d2 = {"Lcom/huami/assistant/ui/v2/view/SchedulePtrHeaderView;", "Landroid/widget/LinearLayout;", "Lcom/scwang/smartrefresh/layout/api/RefreshHeader;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "a", "Landroid/view/View;", "getView", "Lcom/scwang/smartrefresh/layout/constant/SpinnerStyle;", "getSpinnerStyle", "", "", "colors", "setPrimaryColors", "Lcom/scwang/smartrefresh/layout/api/RefreshKernel;", "kernel", "height", "extendHeight", "onInitialized", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "layout", "onStartAnimator", "", "success", "onFinish", "refreshLayout", "Lcom/scwang/smartrefresh/layout/constant/RefreshState;", "oldState", "newState", "onStateChanged", "", "percent", "offset", "headerHeight", "onPullingDown", "onReleasing", "percentx", "offsetx", "offsetMax", "onHorizontalDrag", "isSupportHorizontalDrag", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "mArrowImageView", "Landroid/widget/ProgressBar;", "b", "Landroid/widget/ProgressBar;", "mProgressView", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "mTitleText", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class SchedulePtrHeaderView extends LinearLayout implements RefreshHeader {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private ImageView mArrowImageView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ProgressBar mProgressView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private TextView mTitleText;

    public SchedulePtrHeaderView(@NotNull Context context) {
        super(context);
        a(context);
    }

    private final void a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_schedule_ptr_header, this);
        this.mArrowImageView = (ImageView) findViewById(R.id.pull_down_allow);
        this.mProgressView = (ProgressBar) findViewById(R.id.loading_progress);
        this.mTitleText = (TextView) findViewById(R.id.loading_text);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    @NotNull
    public SpinnerStyle getSpinnerStyle() {
        return SpinnerStyle.Translate;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    @NotNull
    public View getView() {
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public boolean isSupportHorizontalDrag() {
        return false;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public int onFinish(@NotNull RefreshLayout layout, boolean success) {
        return 50;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onHorizontalDrag(float percentx, int offsetx, int offsetMax) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onInitialized(@NotNull RefreshKernel kernel, int height, int extendHeight) {
        ImageView imageView = this.mArrowImageView;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setVisibility(0);
        ProgressBar progressBar = this.mProgressView;
        if (progressBar == null) {
            progressBar = null;
        }
        progressBar.setVisibility(8);
        TextView textView = this.mTitleText;
        (textView != null ? textView : null).setText(R.string.schedule_load_ago_three_day);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshHeader
    public void onPullingDown(float percent, int offset, int headerHeight, int extendHeight) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshHeader
    public void onReleasing(float percent, int offset, int headerHeight, int extendHeight) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onStartAnimator(@NotNull RefreshLayout layout, int height, int extendHeight) {
        ImageView imageView = this.mArrowImageView;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setVisibility(8);
        ProgressBar progressBar = this.mProgressView;
        if (progressBar == null) {
            progressBar = null;
        }
        progressBar.setVisibility(0);
        TextView textView = this.mTitleText;
        (textView != null ? textView : null).setText(R.string.schedule_loading);
    }

    @Override // com.scwang.smartrefresh.layout.listener.OnStateChangedListener
    public void onStateChanged(@NotNull RefreshLayout refreshLayout, @NotNull RefreshState oldState, @NotNull RefreshState newState) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void setPrimaryColors(@ColorInt @NotNull int... colors) {
    }

    public SchedulePtrHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }
}
