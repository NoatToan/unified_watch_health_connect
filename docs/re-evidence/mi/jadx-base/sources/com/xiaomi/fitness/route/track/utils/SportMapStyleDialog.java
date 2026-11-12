package com.xiaomi.fitness.route.track.utils;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.RelativeLayout;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.dialog.a;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.route.track.utils.MapStyleItemView;
import com.xiaomi.fitness.route.track.utils.SportMapStyleDialog;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import com.xiaomi.fitness.widget.button.SwitchButton;
import defpackage.bvi;
import defpackage.doi;
import defpackage.vri;
import defpackage.x0j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003$%&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u000e\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u000fJ\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R7\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R7\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0017¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/route/track/utils/SportMapStyleDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/route/track/utils/SportMapStyleDialog$MapDialogParams;", "<init>", "()V", "switchBtn", "Lcom/xiaomi/fitness/widget/button/SwitchButton;", "containerMailPoints", "Landroid/widget/RelativeLayout;", "mapStyleItemView1", "Lcom/xiaomi/fitness/route/track/utils/MapStyleItemView;", "mapStyleItemView2", "mapStyleItemView3", "mailPointsSwitch", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "bool", "", "getMailPointsSwitch", "()Lkotlin/jvm/functions/Function1;", "setMailPointsSwitch", "(Lkotlin/jvm/functions/Function1;)V", "pathMapStyle", "", "int", "getPathMapStyle", "setPathMapStyle", "initCustomView", "rootView", "Landroid/view/View;", "setSwitchStatue", "switch", "setMapStyle", "mapStyle", "Builder", "MapDialogParams", "Companion", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportMapStyleDialog extends CommonDialog<MapDialogParams> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private RelativeLayout containerMailPoints;

    @Nullable
    private Function1<? super Boolean, Unit> mailPointsSwitch;
    private MapStyleItemView mapStyleItemView1;
    private MapStyleItemView mapStyleItemView2;
    private MapStyleItemView mapStyleItemView3;

    @Nullable
    private Function1<? super Integer, Unit> pathMapStyle;
    private SwitchButton switchBtn;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/route/track/utils/SportMapStyleDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/a;", "Lcom/xiaomi/fitness/route/track/utils/SportMapStyleDialog$MapDialogParams;", "Lcom/xiaomi/fitness/route/track/utils/SportMapStyleDialog;", "getThis", "()Lcom/xiaomi/fitness/route/track/utils/SportMapStyleDialog$Builder;", "internalCreate", "()Lcom/xiaomi/fitness/route/track/utils/SportMapStyleDialog;", "", "showMailPoints", "setShowMailPoints", "(Z)Lcom/xiaomi/fitness/route/track/utils/SportMapStyleDialog$Builder;", "", "name", "<init>", "(Ljava/lang/String;)V", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends a<Builder, MapDialogParams, SportMapStyleDialog> {
        public Builder(@Nullable String str) {
            super(new MapDialogParams(str, false, false, 0, 14, null));
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public Builder getThis() {
            return this;
        }

        @NotNull
        public final Builder setShowMailPoints(boolean showMailPoints) {
            requireDialogParams().setShowMailPoints(showMailPoints);
            return getThis();
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public SportMapStyleDialog internalCreate() {
            return new SportMapStyleDialog();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/route/track/utils/SportMapStyleDialog$Companion;", "", "<init>", "()V", "defaultBuilder", "Lcom/xiaomi/fitness/route/track/utils/SportMapStyleDialog$Builder;", "name", "", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder defaultBuilder(@Nullable String name) {
            Builder negativeText = new Builder(name).setCustomLayoutId(bvi.m).setPositiveText(x0j.f38548b).setNegativeText(x0j.f38547a);
            Intrinsics.checkNotNullExpressionValue(negativeText, "setNegativeText(...)");
            return negativeText;
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/route/track/utils/SportMapStyleDialog$MapDialogParams;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "name", "", "showMailPoints", "", "switchStatue", "mapStyle", "", "<init>", "(Ljava/lang/String;ZZI)V", "getName", "()Ljava/lang/String;", "getShowMailPoints", "()Z", "setShowMailPoints", "(Z)V", "getSwitchStatue", "setSwitchStatue", "getMapStyle", "()I", "setMapStyle", "(I)V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MapDialogParams extends DialogParams {

        @NotNull
        public static final Parcelable.Creator<MapDialogParams> CREATOR = new Creator();
        private int mapStyle;

        @Nullable
        private final String name;
        private boolean showMailPoints;
        private boolean switchStatue;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MapDialogParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MapDialogParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MapDialogParams(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MapDialogParams[] newArray(int i) {
                return new MapDialogParams[i];
            }
        }

        public MapDialogParams(@Nullable String str, boolean z, boolean z2, int i) {
            super(str);
            this.name = str;
            this.showMailPoints = z;
            this.switchStatue = z2;
            this.mapStyle = i;
        }

        public final int getMapStyle() {
            return this.mapStyle;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public final boolean getShowMailPoints() {
            return this.showMailPoints;
        }

        public final boolean getSwitchStatue() {
            return this.switchStatue;
        }

        public final void setMapStyle(int i) {
            this.mapStyle = i;
        }

        public final void setShowMailPoints(boolean z) {
            this.showMailPoints = z;
        }

        public final void setSwitchStatue(boolean z) {
            this.switchStatue = z;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.DialogParams, android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name);
            dest.writeInt(this.showMailPoints ? 1 : 0);
            dest.writeInt(this.switchStatue ? 1 : 0);
            dest.writeInt(this.mapStyle);
        }

        public /* synthetic */ MapDialogParams(String str, boolean z, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? 1 : i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initCustomView$lambda$0(SportMapStyleDialog this$0, MapStyleItemView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.getSelectStatue()) {
            it.resetSelectStatue(true);
            MapStyleItemView mapStyleItemView = this$0.mapStyleItemView2;
            MapStyleItemView mapStyleItemView2 = null;
            if (mapStyleItemView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapStyleItemView2");
                mapStyleItemView = null;
            }
            mapStyleItemView.resetSelectStatue(false);
            MapStyleItemView mapStyleItemView3 = this$0.mapStyleItemView3;
            if (mapStyleItemView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapStyleItemView3");
            } else {
                mapStyleItemView2 = mapStyleItemView3;
            }
            mapStyleItemView2.resetSelectStatue(false);
            Function1<? super Integer, Unit> function1 = this$0.pathMapStyle;
            if (function1 != null) {
                function1.invoke2(1);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initCustomView$lambda$1(SportMapStyleDialog this$0, MapStyleItemView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.getSelectStatue()) {
            it.resetSelectStatue(true);
            MapStyleItemView mapStyleItemView = this$0.mapStyleItemView1;
            MapStyleItemView mapStyleItemView2 = null;
            if (mapStyleItemView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapStyleItemView1");
                mapStyleItemView = null;
            }
            mapStyleItemView.resetSelectStatue(false);
            MapStyleItemView mapStyleItemView3 = this$0.mapStyleItemView3;
            if (mapStyleItemView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapStyleItemView3");
            } else {
                mapStyleItemView2 = mapStyleItemView3;
            }
            mapStyleItemView2.resetSelectStatue(false);
            Function1<? super Integer, Unit> function1 = this$0.pathMapStyle;
            if (function1 != null) {
                function1.invoke2(2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initCustomView$lambda$2(SportMapStyleDialog this$0, MapStyleItemView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.getSelectStatue()) {
            it.resetSelectStatue(true);
            MapStyleItemView mapStyleItemView = this$0.mapStyleItemView1;
            MapStyleItemView mapStyleItemView2 = null;
            if (mapStyleItemView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapStyleItemView1");
                mapStyleItemView = null;
            }
            mapStyleItemView.resetSelectStatue(false);
            MapStyleItemView mapStyleItemView3 = this$0.mapStyleItemView2;
            if (mapStyleItemView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapStyleItemView2");
            } else {
                mapStyleItemView2 = mapStyleItemView3;
            }
            mapStyleItemView2.resetSelectStatue(false);
            Function1<? super Integer, Unit> function1 = this$0.pathMapStyle;
            if (function1 != null) {
                function1.invoke2(3);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCustomView$lambda$3(SportMapStyleDialog this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Boolean, Unit> function1 = this$0.mailPointsSwitch;
        if (function1 != null) {
            function1.invoke2(Boolean.valueOf(z));
        }
    }

    @Nullable
    public final Function1<Boolean, Unit> getMailPointsSwitch() {
        return this.mailPointsSwitch;
    }

    @Nullable
    public final Function1<Integer, Unit> getPathMapStyle() {
        return this.pathMapStyle;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@NotNull View rootView) {
        MapStyleItemView mapStyleItemView;
        MapStyleItemView mapStyleItemView2;
        MapStyleItemView mapStyleItemView3;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        super.initCustomView(rootView);
        this.switchBtn = (SwitchButton) rootView.findViewById(vri.P);
        this.containerMailPoints = (RelativeLayout) rootView.findViewById(vri.H);
        this.containerMailPoints = (RelativeLayout) rootView.findViewById(vri.H);
        this.mapStyleItemView1 = (MapStyleItemView) rootView.findViewById(vri.t);
        this.mapStyleItemView2 = (MapStyleItemView) rootView.findViewById(vri.u);
        this.mapStyleItemView3 = (MapStyleItemView) rootView.findViewById(vri.v);
        MapStyleItemView mapStyleItemView4 = this.mapStyleItemView1;
        SwitchButton switchButton = null;
        if (mapStyleItemView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapStyleItemView1");
            mapStyleItemView4 = null;
        }
        int i = doi.o;
        String string = getString(x0j.s);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        mapStyleItemView4.bindData(i, string, getDialogParams().getMapStyle() == 1);
        MapStyleItemView mapStyleItemView5 = this.mapStyleItemView2;
        if (mapStyleItemView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapStyleItemView2");
            mapStyleItemView5 = null;
        }
        int i2 = doi.n;
        String string2 = getString(x0j.u);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        mapStyleItemView5.bindData(i2, string2, getDialogParams().getMapStyle() == 2);
        MapStyleItemView mapStyleItemView6 = this.mapStyleItemView3;
        if (mapStyleItemView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapStyleItemView3");
            mapStyleItemView6 = null;
        }
        int i3 = doi.m;
        String string3 = getString(x0j.t);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        mapStyleItemView6.bindData(i3, string3, getDialogParams().getMapStyle() == 3);
        RelativeLayout relativeLayout = this.containerMailPoints;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerMailPoints");
            relativeLayout = null;
        }
        relativeLayout.setVisibility(8);
        SwitchButton switchButton2 = this.switchBtn;
        if (switchButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchBtn");
            switchButton2 = null;
        }
        switchButton2.setChecked(getDialogParams().getSwitchStatue());
        MapStyleItemView mapStyleItemView7 = this.mapStyleItemView1;
        if (mapStyleItemView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapStyleItemView1");
            mapStyleItemView = null;
        } else {
            mapStyleItemView = mapStyleItemView7;
        }
        ViewExtKt.clickWithTrigger$default(mapStyleItemView, 0L, new Function1() { // from class: frn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportMapStyleDialog.initCustomView$lambda$0(this.f18134a, (MapStyleItemView) obj);
            }
        }, 1, null);
        MapStyleItemView mapStyleItemView8 = this.mapStyleItemView2;
        if (mapStyleItemView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapStyleItemView2");
            mapStyleItemView2 = null;
        } else {
            mapStyleItemView2 = mapStyleItemView8;
        }
        ViewExtKt.clickWithTrigger$default(mapStyleItemView2, 0L, new Function1() { // from class: hrn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportMapStyleDialog.initCustomView$lambda$1(this.f20381a, (MapStyleItemView) obj);
            }
        }, 1, null);
        MapStyleItemView mapStyleItemView9 = this.mapStyleItemView3;
        if (mapStyleItemView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapStyleItemView3");
            mapStyleItemView3 = null;
        } else {
            mapStyleItemView3 = mapStyleItemView9;
        }
        ViewExtKt.clickWithTrigger$default(mapStyleItemView3, 0L, new Function1() { // from class: jrn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportMapStyleDialog.initCustomView$lambda$2(this.f23072a, (MapStyleItemView) obj);
            }
        }, 1, null);
        SwitchButton switchButton3 = this.switchBtn;
        if (switchButton3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchBtn");
        } else {
            switchButton = switchButton3;
        }
        switchButton.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: krn
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SportMapStyleDialog.initCustomView$lambda$3(this.f24236a, z, iSwitchButton);
            }
        });
    }

    public final void setMailPointsSwitch(@Nullable Function1<? super Boolean, Unit> function1) {
        this.mailPointsSwitch = function1;
    }

    public final void setMapStyle(int mapStyle) {
        getDialogParams().setMapStyle(mapStyle);
    }

    public final void setPathMapStyle(@Nullable Function1<? super Integer, Unit> function1) {
        this.pathMapStyle = function1;
    }

    public final void setSwitchStatue(boolean z) {
        getDialogParams().setSwitchStatue(z);
    }
}
