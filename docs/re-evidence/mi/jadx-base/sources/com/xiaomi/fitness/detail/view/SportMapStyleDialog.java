package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.RelativeLayout;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.dialog.a;
import com.xiaomi.fitness.detail.video.share.holder.SwitchStyleHolder;
import com.xiaomi.fitness.detail.view.SportMapStyleDialog;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import com.xiaomi.fitness.widget.button.SwitchButton;
import defpackage.bsi;
import defpackage.ivi;
import defpackage.j1j;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003ABCB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u000209H\u0014J\u000e\u0010:\u001a\u00020\u00172\u0006\u0010;\u001a\u00020\u0013J\u000e\u0010<\u001a\u00020\u00172\u0006\u0010;\u001a\u00020\u0013J\u000e\u0010=\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u001eJ\u000e\u0010?\u001a\u00020\u00172\u0006\u0010@\u001a\u00020&R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R7\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bRL\u0010\u001c\u001a4\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#RR\u0010$\u001a:\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020&0%¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110&¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R7\u0010*\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001bR\u001a\u0010-\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006D"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportMapStyleDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/detail/view/SportMapStyleDialog$MapDialogParams;", "<init>", "()V", "switchBtn", "Lcom/xiaomi/fitness/widget/button/SwitchButton;", "colorsSwitchBtn", "containerMailPoints", "Landroid/widget/RelativeLayout;", "mapStyleItemView1", "Lcom/xiaomi/fitness/detail/view/MapStyleItemView;", "mapStyleItemView2", "mapStyleItemView3", "traceStyleHolder", "Lcom/xiaomi/fitness/detail/video/share/holder/SwitchStyleHolder;", "mapStyleHolder", "mailPointsSwitch", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "bool", "", "getMailPointsSwitch", "()Lkotlin/jvm/functions/Function1;", "setMailPointsSwitch", "(Lkotlin/jvm/functions/Function1;)V", "pathMapStyle", "Lkotlin/Function2;", "", "type", "getPathMapStyle", "()Lkotlin/jvm/functions/Function2;", "setPathMapStyle", "(Lkotlin/jvm/functions/Function2;)V", "editMapStyle", "", "", "index", "getEditMapStyle", "setEditMapStyle", "paceColorsSwitch", "getPaceColorsSwitch", "setPaceColorsSwitch", "currentStyle", "getCurrentStyle", "()Ljava/lang/String;", "setCurrentStyle", "(Ljava/lang/String;)V", "currentIndex", "getCurrentIndex", "()I", "setCurrentIndex", "(I)V", "initCustomView", "rootView", "Landroid/view/View;", "setSwitchStatue", "switch", "setColorSwitchStatue", "setMapStyle", "mapStyle", "setMapEditIndex", "editIndex", "Builder", "MapDialogParams", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportMapStyleDialog extends CommonDialog<MapDialogParams> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private SwitchButton colorsSwitchBtn;
    private RelativeLayout containerMailPoints;
    private int currentIndex;

    @NotNull
    private String currentStyle = "";

    @Nullable
    private Function2<? super List<Integer>, ? super Integer, Unit> editMapStyle;

    @Nullable
    private Function1<? super Boolean, Unit> mailPointsSwitch;
    private SwitchStyleHolder mapStyleHolder;
    private MapStyleItemView mapStyleItemView1;
    private MapStyleItemView mapStyleItemView2;
    private MapStyleItemView mapStyleItemView3;

    @Nullable
    private Function1<? super Boolean, Unit> paceColorsSwitch;

    @Nullable
    private Function2<? super String, ? super String, Unit> pathMapStyle;
    private SwitchButton switchBtn;
    private SwitchStyleHolder traceStyleHolder;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportMapStyleDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/a;", "Lcom/xiaomi/fitness/detail/view/SportMapStyleDialog$MapDialogParams;", "Lcom/xiaomi/fitness/detail/view/SportMapStyleDialog;", "getThis", "()Lcom/xiaomi/fitness/detail/view/SportMapStyleDialog$Builder;", "internalCreate", "()Lcom/xiaomi/fitness/detail/view/SportMapStyleDialog;", "", "showMailPoints", "setShowMailPoints", "(Z)Lcom/xiaomi/fitness/detail/view/SportMapStyleDialog$Builder;", "", "name", "<init>", "(Ljava/lang/String;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends a<Builder, MapDialogParams, SportMapStyleDialog> {
        public Builder(@Nullable String str) {
            super(new MapDialogParams(str, false, false, null, false, 30, null));
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportMapStyleDialog$Companion;", "", "<init>", "()V", "defaultBuilder", "Lcom/xiaomi/fitness/detail/view/SportMapStyleDialog$Builder;", "name", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder defaultBuilder(@Nullable String name) {
            Builder negativeText = new Builder(name).setCustomLayoutId(ivi.P1).setPositiveText(j1j.c).setNegativeText(j1j.f22329b);
            Intrinsics.checkNotNullExpressionValue(negativeText, "setNegativeText(...)");
            return negativeText;
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportMapStyleDialog$MapDialogParams;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "name", "", "showMailPoints", "", "switchStatue", "mapStyle", "colorSwitchStatus", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getShowMailPoints", "()Z", "setShowMailPoints", "(Z)V", "getSwitchStatue", "setSwitchStatue", "getMapStyle", "setMapStyle", "(Ljava/lang/String;)V", "getColorSwitchStatus", "setColorSwitchStatus", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MapDialogParams extends DialogParams {

        @NotNull
        public static final Parcelable.Creator<MapDialogParams> CREATOR = new Creator();
        private boolean colorSwitchStatus;

        @NotNull
        private String mapStyle;

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
                return new MapDialogParams(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MapDialogParams[] newArray(int i) {
                return new MapDialogParams[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MapDialogParams(@Nullable String str, boolean z, boolean z2, @NotNull String mapStyle, boolean z3) {
            super(str);
            Intrinsics.checkNotNullParameter(mapStyle, "mapStyle");
            this.name = str;
            this.showMailPoints = z;
            this.switchStatue = z2;
            this.mapStyle = mapStyle;
            this.colorSwitchStatus = z3;
        }

        public final boolean getColorSwitchStatus() {
            return this.colorSwitchStatus;
        }

        @NotNull
        public final String getMapStyle() {
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

        public final void setColorSwitchStatus(boolean z) {
            this.colorSwitchStatus = z;
        }

        public final void setMapStyle(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.mapStyle = str;
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
            dest.writeString(this.mapStyle);
            dest.writeInt(this.colorSwitchStatus ? 1 : 0);
        }

        public /* synthetic */ MapDialogParams(String str, boolean z, boolean z2, String str2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? true : z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCustomView$lambda$0(SportMapStyleDialog this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Boolean, Unit> function1 = this$0.mailPointsSwitch;
        if (function1 != null) {
            function1.invoke2(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCustomView$lambda$1(SportMapStyleDialog this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Boolean, Unit> function1 = this$0.paceColorsSwitch;
        if (function1 != null) {
            function1.invoke2(Boolean.valueOf(z));
        }
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    @NotNull
    public final String getCurrentStyle() {
        return this.currentStyle;
    }

    @Nullable
    public final Function2<List<Integer>, Integer, Unit> getEditMapStyle() {
        return this.editMapStyle;
    }

    @Nullable
    public final Function1<Boolean, Unit> getMailPointsSwitch() {
        return this.mailPointsSwitch;
    }

    @Nullable
    public final Function1<Boolean, Unit> getPaceColorsSwitch() {
        return this.paceColorsSwitch;
    }

    @Nullable
    public final Function2<String, String, Unit> getPathMapStyle() {
        return this.pathMapStyle;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@NotNull View rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        super.initCustomView(rootView);
        this.switchBtn = (SwitchButton) rootView.findViewById(bsi.k7);
        this.colorsSwitchBtn = (SwitchButton) rootView.findViewById(bsi.K);
        this.containerMailPoints = (RelativeLayout) rootView.findViewById(bsi.H5);
        this.containerMailPoints = (RelativeLayout) rootView.findViewById(bsi.H5);
        View viewFindViewById = rootView.findViewById(bsi.b4);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = rootView.findViewById(bsi.S7);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        SportSwitchStyleHolder sportSwitchStyleHolder = new SportSwitchStyleHolder(contextRequireContext, viewFindViewById, true, this.currentStyle, this.currentIndex);
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        SportSwitchStyleHolder sportSwitchStyleHolder2 = new SportSwitchStyleHolder(contextRequireContext2, viewFindViewById2, false, this.currentStyle, this.currentIndex);
        sportSwitchStyleHolder.initHolder();
        sportSwitchStyleHolder2.initHolder();
        sportSwitchStyleHolder.initMapAdapterOnClickCallback(this.pathMapStyle);
        sportSwitchStyleHolder2.initEditAdapterOnClickCallback(this.editMapStyle);
        RelativeLayout relativeLayout = this.containerMailPoints;
        SwitchButton switchButton = null;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerMailPoints");
            relativeLayout = null;
        }
        relativeLayout.setVisibility(getDialogParams().getShowMailPoints() ? 0 : 8);
        SwitchButton switchButton2 = this.switchBtn;
        if (switchButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchBtn");
            switchButton2 = null;
        }
        switchButton2.setChecked(getDialogParams().getSwitchStatue());
        SwitchButton switchButton3 = this.colorsSwitchBtn;
        if (switchButton3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorsSwitchBtn");
            switchButton3 = null;
        }
        switchButton3.setChecked(getDialogParams().getColorSwitchStatus());
        SwitchButton switchButton4 = this.switchBtn;
        if (switchButton4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchBtn");
            switchButton4 = null;
        }
        switchButton4.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: grn
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SportMapStyleDialog.initCustomView$lambda$0(this.f19279a, z, iSwitchButton);
            }
        });
        SwitchButton switchButton5 = this.colorsSwitchBtn;
        if (switchButton5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorsSwitchBtn");
        } else {
            switchButton = switchButton5;
        }
        switchButton.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: irn
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SportMapStyleDialog.initCustomView$lambda$1(this.f22025a, z, iSwitchButton);
            }
        });
    }

    public final void setColorSwitchStatue(boolean z) {
        getDialogParams().setColorSwitchStatus(z);
    }

    public final void setCurrentIndex(int i) {
        this.currentIndex = i;
    }

    public final void setCurrentStyle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentStyle = str;
    }

    public final void setEditMapStyle(@Nullable Function2<? super List<Integer>, ? super Integer, Unit> function2) {
        this.editMapStyle = function2;
    }

    public final void setMailPointsSwitch(@Nullable Function1<? super Boolean, Unit> function1) {
        this.mailPointsSwitch = function1;
    }

    public final void setMapEditIndex(int editIndex) {
        this.currentIndex = editIndex;
    }

    public final void setMapStyle(@NotNull String mapStyle) {
        Intrinsics.checkNotNullParameter(mapStyle, "mapStyle");
        this.currentStyle = mapStyle;
    }

    public final void setPaceColorsSwitch(@Nullable Function1<? super Boolean, Unit> function1) {
        this.paceColorsSwitch = function1;
    }

    public final void setPathMapStyle(@Nullable Function2<? super String, ? super String, Unit> function2) {
        this.pathMapStyle = function2;
    }

    public final void setSwitchStatue(boolean z) {
        getDialogParams().setSwitchStatue(z);
    }
}
