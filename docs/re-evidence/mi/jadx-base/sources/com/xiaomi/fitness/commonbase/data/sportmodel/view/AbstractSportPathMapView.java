package com.xiaomi.fitness.commonbase.data.sportmodel.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.mi.health.map.data.sportmodel.view.MapStyleSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\nB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u000fH&J\b\u0010\u0016\u001a\u00020\u000fH&J\b\u0010\u0017\u001a\u00020\u000fH&J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0014H&R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/commonbase/data/sportmodel/view/AbstractSportPathMapView;", "T", "Landroid/view/View;", "Lcom/xiaomi/fitness/commonbase/data/sportmodel/view/BaseMapView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "loadMapStyle", "", "style", "", "showMailsPoints", "boolean", "", "locationPath", "saveMapStyle", "recoverMapSetting", "showColorPace", "switch", "mapStyleSetting", "Lcom/mi/health/map/data/sportmodel/view/MapStyleSetting;", "getMapStyleSetting", "()Lcom/mi/health/map/data/sportmodel/view/MapStyleSetting;", "setMapStyleSetting", "(Lcom/mi/health/map/data/sportmodel/view/MapStyleSetting;)V", "map-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AbstractSportPathMapView<T extends View> extends BaseMapView<T> {

    @Nullable
    private MapStyleSetting mapStyleSetting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractSportPathMapView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final MapStyleSetting getMapStyleSetting() {
        return this.mapStyleSetting;
    }

    public abstract void loadMapStyle(int style);

    public abstract void loadMapStyle(@NotNull String style);

    public abstract void locationPath();

    public abstract void recoverMapSetting();

    public abstract void saveMapStyle();

    public final void setMapStyleSetting(@Nullable MapStyleSetting mapStyleSetting) {
        this.mapStyleSetting = mapStyleSetting;
    }

    public abstract void showColorPace(boolean z);

    public abstract void showMailsPoints(boolean z);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractSportPathMapView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractSportPathMapView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
