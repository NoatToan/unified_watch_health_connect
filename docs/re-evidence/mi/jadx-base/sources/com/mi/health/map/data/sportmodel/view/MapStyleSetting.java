package com.mi.health.map.data.sportmodel.view;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0014\u0018\u00002\u00020\u0001Bð\u0001\u0012#\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u00128\u0010\t\u001a4\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012>\u0010\r\u001a:\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012#\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012#\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014R7\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018RL\u0010\t\u001a4\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cRR\u0010\r\u001a:\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR7\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R7\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018¨\u0006#"}, d2 = {"Lcom/mi/health/map/data/sportmodel/view/MapStyleSetting;", "", "showMailPoints", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "bool", "", "mapStyleSet", "Lkotlin/Function2;", "", "style", "mapEditStyle", "", "", "index", "mapPlayStyleSet", "showPaceColors", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getShowMailPoints", "()Lkotlin/jvm/functions/Function1;", "setShowMailPoints", "(Lkotlin/jvm/functions/Function1;)V", "getMapStyleSet", "()Lkotlin/jvm/functions/Function2;", "setMapStyleSet", "(Lkotlin/jvm/functions/Function2;)V", "getMapEditStyle", "setMapEditStyle", "getMapPlayStyleSet", "setMapPlayStyleSet", "getShowPaceColors", "setShowPaceColors", "map-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MapStyleSetting {

    @Nullable
    private Function2<? super List<Integer>, ? super Integer, Unit> mapEditStyle;

    @Nullable
    private Function1<? super Integer, Unit> mapPlayStyleSet;

    @Nullable
    private Function2<? super String, ? super String, Unit> mapStyleSet;

    @Nullable
    private Function1<? super Boolean, Unit> showMailPoints;

    @Nullable
    private Function1<? super Boolean, Unit> showPaceColors;

    public MapStyleSetting(@Nullable Function1<? super Boolean, Unit> function1, @Nullable Function2<? super String, ? super String, Unit> function2, @Nullable Function2<? super List<Integer>, ? super Integer, Unit> function3, @Nullable Function1<? super Integer, Unit> function4, @Nullable Function1<? super Boolean, Unit> function5) {
        this.showMailPoints = function1;
        this.mapStyleSet = function2;
        this.mapEditStyle = function3;
        this.mapPlayStyleSet = function4;
        this.showPaceColors = function5;
    }

    @Nullable
    public final Function2<List<Integer>, Integer, Unit> getMapEditStyle() {
        return this.mapEditStyle;
    }

    @Nullable
    public final Function1<Integer, Unit> getMapPlayStyleSet() {
        return this.mapPlayStyleSet;
    }

    @Nullable
    public final Function2<String, String, Unit> getMapStyleSet() {
        return this.mapStyleSet;
    }

    @Nullable
    public final Function1<Boolean, Unit> getShowMailPoints() {
        return this.showMailPoints;
    }

    @Nullable
    public final Function1<Boolean, Unit> getShowPaceColors() {
        return this.showPaceColors;
    }

    public final void setMapEditStyle(@Nullable Function2<? super List<Integer>, ? super Integer, Unit> function2) {
        this.mapEditStyle = function2;
    }

    public final void setMapPlayStyleSet(@Nullable Function1<? super Integer, Unit> function1) {
        this.mapPlayStyleSet = function1;
    }

    public final void setMapStyleSet(@Nullable Function2<? super String, ? super String, Unit> function2) {
        this.mapStyleSet = function2;
    }

    public final void setShowMailPoints(@Nullable Function1<? super Boolean, Unit> function1) {
        this.showMailPoints = function1;
    }

    public final void setShowPaceColors(@Nullable Function1<? super Boolean, Unit> function1) {
        this.showPaceColors = function1;
    }
}
