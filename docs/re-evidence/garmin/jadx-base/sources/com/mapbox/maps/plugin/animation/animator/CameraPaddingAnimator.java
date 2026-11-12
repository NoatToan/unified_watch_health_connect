package com.mapbox.maps.plugin.animation.animator;

import android.animation.ValueAnimator;
import com.garmin.android.gncs.NotificationConstants;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.plugin.animation.CameraAnimatorOptions;
import com.mapbox.maps.plugin.animation.CameraAnimatorType;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/mapbox/maps/plugin/animation/animator/CameraPaddingAnimator;", "Lcom/mapbox/maps/plugin/animation/animator/CameraAnimator;", "Lcom/mapbox/maps/EdgeInsets;", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions;", "options", "Lkotlin/Function1;", "Landroid/animation/ValueAnimator;", "", "block", "<init>", "(Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions;Le23/l;)V", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorType;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lcom/mapbox/maps/plugin/animation/CameraAnimatorType;", "getType", "()Lcom/mapbox/maps/plugin/animation/CameraAnimatorType;", "plugin-animation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CameraPaddingAnimator extends CameraAnimator<EdgeInsets> {
    private final CameraAnimatorType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraPaddingAnimator(CameraAnimatorOptions<EdgeInsets> cameraAnimatorOptions, l<? super ValueAnimator, Unit> lVar) {
        super(Evaluators.INSTANCE.getEDGE_INSET(), cameraAnimatorOptions);
        cameraAnimatorOptions.getClass();
        if (lVar != null) {
            lVar.invoke(this);
        }
        this.type = CameraAnimatorType.PADDING;
    }

    @Override // com.mapbox.maps.plugin.animation.animator.CameraAnimator
    public CameraAnimatorType getType() {
        return this.type;
    }

    public /* synthetic */ CameraPaddingAnimator(CameraAnimatorOptions cameraAnimatorOptions, l lVar, int i14, j jVar) {
        this(cameraAnimatorOptions, (i14 & 2) != 0 ? null : lVar);
    }
}
