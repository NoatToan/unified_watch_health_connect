package com.xiaomi.fitness.health.ecg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/NestChildRecycleView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "onInterceptTouchEvent", PluginDeviceInfo.FICONOFFLINE, "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NestChildRecycleView extends RecyclerView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestChildRecycleView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        Integer numValueOf = ev != null ? Integer.valueOf(ev.getAction()) : null;
        if ((numValueOf != null && numValueOf.intValue() == 0) || (numValueOf != null && numValueOf.intValue() == 1)) {
            getParent().requestDisallowInterceptTouchEvent(true);
            return super.dispatchTouchEvent(ev);
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@Nullable MotionEvent e) {
        Integer numValueOf = e != null ? Integer.valueOf(e.getAction()) : null;
        if ((numValueOf != null && numValueOf.intValue() == 0) || (numValueOf != null && numValueOf.intValue() == 1)) {
            getParent().requestDisallowInterceptTouchEvent(true);
            return super.onInterceptTouchEvent(e);
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestChildRecycleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
