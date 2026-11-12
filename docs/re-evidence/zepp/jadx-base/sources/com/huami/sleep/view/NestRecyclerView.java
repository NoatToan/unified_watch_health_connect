package com.huami.sleep.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eB\u001b\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001d\u0010!B#\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010\"\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lcom/huami/sleep/view/NestRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "a", "Z", "getIntercept", "()Z", "setIntercept", "(Z)V", "intercept", "", "b", "F", "xDistance", "c", "yDistance", GoogleApiAvailabilityLight.a, "xLast", "e", "yLast", "", "f", LogUtil.I, "scaledTouchSlop", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class NestRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean intercept;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float xDistance;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float yDistance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float xLast;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float yLast;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int scaledTouchSlop;

    public NestRecyclerView(@NotNull Context context) {
        super(context);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
        int action = ev.getAction();
        if (action == 0) {
            this.xDistance = 0.0f;
            this.yDistance = 0.0f;
            this.xLast = ev.getX();
            this.yLast = ev.getY();
        } else if (action == 2) {
            float x = ev.getX();
            float y = ev.getY();
            this.xDistance += Math.abs(x - this.xLast);
            this.yDistance += Math.abs(y - this.yLast);
            this.xLast = x;
            this.yLast = y;
        }
        float f = this.xDistance;
        float f2 = this.yDistance;
        boolean z = false;
        boolean z2 = f >= f2 || f2 < ((float) this.scaledTouchSlop);
        ViewParent parent = getParent();
        if (z2 && this.intercept) {
            z = true;
        }
        parent.requestDisallowInterceptTouchEvent(z);
        return super.dispatchTouchEvent(ev);
    }

    public final boolean getIntercept() {
        return this.intercept;
    }

    public final void setIntercept(boolean z) {
        this.intercept = z;
    }

    public NestRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NestRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
