package com.xiaomi.fitness.commonbase.data.sportmodel.view;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 \u001b*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\u00020\u0003:\u0001\u001bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\nB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\rJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\b\u0010\u0012\u001a\u00020\u000fH&J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0011H&J\b\u0010\u0015\u001a\u00020\u000fH&J\b\u0010\u0016\u001a\u00020\u000fH&J\b\u0010\u0017\u001a\u00020\u000fH&R\u0012\u0010\u0018\u001a\u00028\u0000X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/commonbase/data/sportmodel/view/BaseMapView;", "T", "Landroid/view/View;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onCreate", "", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", LifecycleConstantKt.ON_RESUME, "onSaveInstanceState", "outState", LifecycleConstantKt.ON_PAUSE, LifecycleConstantKt.ON_DESTROY, "onLowMemory", "mapView", "getMapView", "()Landroid/view/View;", "Companion", "map-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseMapView<T extends View> extends FrameLayout {
    public static final float TRACE_WIDTH = 4.0f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMapView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public abstract T getMapView();

    public abstract void onCreate(@Nullable Bundle bundle);

    public abstract void onDestroy();

    public abstract void onLowMemory();

    public abstract void onPause();

    public abstract void onResume();

    public abstract void onSaveInstanceState(@NotNull Bundle outState);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMapView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMapView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
