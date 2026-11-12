package com.xiaomi.fitness.detail.util;

import androidx.fragment.app.FragmentActivity;
import com.mi.health.map.data.sportmodel.view.MapStyleSetting;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.single.Weak;
import com.xiaomi.fitness.common.utils.SingleHolder;
import com.xiaomi.fitness.detail.view.SportMapPlayStyleDialog;
import com.xiaomi.fitness.detail.view.SportMapStyleDialog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ#\u0010\u001b\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eR/\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/detail/util/SportDetailHelper;", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "<set-?>", "act", "getAct", "()Landroidx/fragment/app/FragmentActivity;", "setAct", "act$delegate", "Lcom/xiaomi/fitness/common/single/Weak;", "mSportMapStyleDialog", "Lcom/xiaomi/fitness/detail/view/SportMapStyleDialog;", "mSportMapPlayStyleDialog", "Lcom/xiaomi/fitness/detail/view/SportMapPlayStyleDialog;", "createSportMapStyleDialog", "mapStyleSetting", "Lcom/mi/health/map/data/sportmodel/view/MapStyleSetting;", "currentStyle", "", "currentEditIndex", "", "showMailPoints", "", "(Lcom/mi/health/map/data/sportmodel/view/MapStyleSetting;Ljava/lang/String;ILjava/lang/Boolean;)Lcom/xiaomi/fitness/detail/view/SportMapStyleDialog;", "createSportMapPlayStyleDialog", "(Lcom/mi/health/map/data/sportmodel/view/MapStyleSetting;Ljava/lang/Boolean;)Lcom/xiaomi/fitness/detail/view/SportMapPlayStyleDialog;", "setDialogNull", "", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportDetailHelper {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportDetailHelper.class, "act", "getAct()Landroidx/fragment/app/FragmentActivity;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: act$delegate, reason: from kotlin metadata */
    @NotNull
    private final Weak act;

    @Nullable
    private SportMapPlayStyleDialog mSportMapPlayStyleDialog;

    @Nullable
    private SportMapStyleDialog mSportMapStyleDialog;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/detail/util/SportDetailHelper$Companion;", "Lcom/xiaomi/fitness/common/utils/SingleHolder;", "Lcom/xiaomi/fitness/detail/util/SportDetailHelper;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion extends SingleHolder<SportDetailHelper, FragmentActivity> {

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.util.SportDetailHelper$Companion$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<FragmentActivity, SportDetailHelper> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1, SportDetailHelper.class, "<init>", "<init>(Landroidx/fragment/app/FragmentActivity;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final SportDetailHelper invoke2(FragmentActivity p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new SportDetailHelper(p0, null);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(AnonymousClass1.INSTANCE);
        }
    }

    public /* synthetic */ SportDetailHelper(FragmentActivity fragmentActivity, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity);
    }

    public static /* synthetic */ SportMapPlayStyleDialog createSportMapPlayStyleDialog$default(SportDetailHelper sportDetailHelper, MapStyleSetting mapStyleSetting, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = Boolean.TRUE;
        }
        return sportDetailHelper.createSportMapPlayStyleDialog(mapStyleSetting, bool);
    }

    public static /* synthetic */ SportMapStyleDialog createSportMapStyleDialog$default(SportDetailHelper sportDetailHelper, MapStyleSetting mapStyleSetting, String str, int i, Boolean bool, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            bool = Boolean.TRUE;
        }
        return sportDetailHelper.createSportMapStyleDialog(mapStyleSetting, str, i, bool);
    }

    @Nullable
    public final SportMapPlayStyleDialog createSportMapPlayStyleDialog(@Nullable MapStyleSetting mapStyleSetting, @Nullable Boolean showMailPoints) {
        if (this.mSportMapStyleDialog == null) {
            this.mSportMapPlayStyleDialog = SportMapPlayStyleDialog.INSTANCE.defaultBuilder("").setShowMailPoints(showMailPoints != null ? showMailPoints.booleanValue() : true).create();
        }
        SportMapPlayStyleDialog sportMapPlayStyleDialog = this.mSportMapPlayStyleDialog;
        if (sportMapPlayStyleDialog != null) {
            sportMapPlayStyleDialog.setMailPointsSwitch(mapStyleSetting != null ? mapStyleSetting.getShowMailPoints() : null);
        }
        SportMapPlayStyleDialog sportMapPlayStyleDialog2 = this.mSportMapPlayStyleDialog;
        if (sportMapPlayStyleDialog2 != null) {
            sportMapPlayStyleDialog2.setPathMapStyle(mapStyleSetting != null ? mapStyleSetting.getMapPlayStyleSet() : null);
        }
        return this.mSportMapPlayStyleDialog;
    }

    @Nullable
    public final SportMapStyleDialog createSportMapStyleDialog(@Nullable MapStyleSetting mapStyleSetting, @NotNull String currentStyle, int currentEditIndex, @Nullable Boolean showMailPoints) {
        Intrinsics.checkNotNullParameter(currentStyle, "currentStyle");
        if (this.mSportMapStyleDialog == null) {
            this.mSportMapStyleDialog = SportMapStyleDialog.INSTANCE.defaultBuilder("").setShowMailPoints(showMailPoints != null ? showMailPoints.booleanValue() : true).create();
        }
        SportMapStyleDialog sportMapStyleDialog = this.mSportMapStyleDialog;
        if (sportMapStyleDialog != null) {
            sportMapStyleDialog.setMailPointsSwitch(mapStyleSetting != null ? mapStyleSetting.getShowMailPoints() : null);
        }
        SportMapStyleDialog sportMapStyleDialog2 = this.mSportMapStyleDialog;
        if (sportMapStyleDialog2 != null) {
            sportMapStyleDialog2.setPathMapStyle(mapStyleSetting != null ? mapStyleSetting.getMapStyleSet() : null);
        }
        SportMapStyleDialog sportMapStyleDialog3 = this.mSportMapStyleDialog;
        if (sportMapStyleDialog3 != null) {
            sportMapStyleDialog3.setEditMapStyle(mapStyleSetting != null ? mapStyleSetting.getMapEditStyle() : null);
        }
        SportMapStyleDialog sportMapStyleDialog4 = this.mSportMapStyleDialog;
        if (sportMapStyleDialog4 != null) {
            sportMapStyleDialog4.setPaceColorsSwitch(mapStyleSetting != null ? mapStyleSetting.getShowPaceColors() : null);
        }
        SportMapStyleDialog sportMapStyleDialog5 = this.mSportMapStyleDialog;
        if (sportMapStyleDialog5 != null) {
            sportMapStyleDialog5.setCurrentStyle(currentStyle);
        }
        SportMapStyleDialog sportMapStyleDialog6 = this.mSportMapStyleDialog;
        if (sportMapStyleDialog6 != null) {
            sportMapStyleDialog6.setCurrentIndex(currentEditIndex);
        }
        return this.mSportMapStyleDialog;
    }

    @Nullable
    public final FragmentActivity getAct() {
        return (FragmentActivity) this.act.getValue(this, $$delegatedProperties[0]);
    }

    public final void setAct(@Nullable FragmentActivity fragmentActivity) {
        this.act.setValue(this, $$delegatedProperties[0], fragmentActivity);
    }

    public final void setDialogNull() {
        this.mSportMapStyleDialog = null;
    }

    private SportDetailHelper(FragmentActivity fragmentActivity) {
        this.act = new Weak();
        setAct(fragmentActivity);
    }
}
