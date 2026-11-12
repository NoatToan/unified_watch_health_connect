package com.xiaomi.fitness.device.manager.ui.tab;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil.Coil;
import coil.request.ImageRequest;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DevicePreference;
import com.xiaomi.fitness.device.manager.bean.BatteryInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.report.DeviceActiveTracker;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.export.FaceHelper;
import com.xiaomi.fitness.watch.face.export.FaceHelperExtKt;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;
import defpackage.dui;
import defpackage.h4j;
import defpackage.hni;
import defpackage.pyi;
import defpackage.uzi;
import defpackage.xqi;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015J\u0010\u0010 \u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\"\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0007J\b\u0010$\u001a\u00020\u001cH\u0002J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0007H\u0002J\u0010\u0010'\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0007H\u0002J\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-J\b\u0010.\u001a\u00020\u001cH\u0002J\b\u0010/\u001a\u00020\u001cH\u0002J\u001a\u00100\u001a\u00020\u00152\b\u00101\u001a\u0004\u0018\u0001022\u0006\u0010)\u001a\u00020*H\u0002J\u001a\u00103\u001a\u0004\u0018\u00010\u00152\u0006\u00104\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*H\u0002J\u0018\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*H\u0002J\u0012\u00106\u001a\u00020\u001c2\b\u00107\u001a\u0004\u0018\u000108H\u0014J\b\u00109\u001a\u00020\u001cH\u0002J\b\u0010:\u001a\u00020\u001cH\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceStatusView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBandIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "mBottomFaceIcon", "Lcom/xiaomi/fitness/watch/face/export/exportview/FaceInfoView;", "mTopFaceIcon", "mTvName", "Landroid/widget/TextView;", "mTvStatus", "mSwitchWearMode", "mTvSynchronized", "mBatteryValue", "", "mConnectText", "mLoadingIcon", "Landroid/graphics/drawable/Drawable;", "mLoadingAnimator", "Landroid/animation/Animator;", "setName", "", "name", "setStatus", "status", "setIcon", "icon", "setFaceIcon", "currentStatus", "showLoading", "setButtonText", "text", "setConnectStatusText", "setBatteryValue", "batteryInfo", "Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo;", "setSupportSwitchWearMode", "support", "", "setDeviceStatusText", "updateBatteryText", "getBatteryText", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getHuaMiChargeText", "did", "getChargeDays", "onConfigurationChanged", StandardComponentEvent.KEY_NEW_CONFIG, "Landroid/content/res/Configuration;", "applyConnect", "onAttachedToWindow", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceStatusView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceStatusView.kt\ncom/xiaomi/fitness/device/manager/ui/tab/DeviceStatusView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,474:1\n54#2,3:475\n24#2:478\n57#2,6:479\n63#2,2:486\n54#2,3:488\n24#2:491\n57#2,6:492\n63#2,2:499\n57#3:485\n57#3:498\n*S KotlinDebug\n*F\n+ 1 DeviceStatusView.kt\ncom/xiaomi/fitness/device/manager/ui/tab/DeviceStatusView\n*L\n118#1:475,3\n118#1:478\n118#1:479,6\n118#1:486,2\n119#1:488,3\n119#1:491\n119#1:492,6\n119#1:499,2\n118#1:485\n119#1:498\n*E\n"})
public final class DeviceStatusView extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int STATUS_UPDATE_BATTERY = -100;

    @NotNull
    public static final String URL_LOAD_WATCH_FACE = "url_load_watch_face";
    private int currentStatus;

    @NotNull
    private final AppCompatImageView mBandIcon;

    @NotNull
    private String mBatteryValue;

    @NotNull
    private final FaceInfoView mBottomFaceIcon;

    @NotNull
    private String mConnectText;

    @Nullable
    private Animator mLoadingAnimator;

    @Nullable
    private Drawable mLoadingIcon;

    @Nullable
    private final TextView mSwitchWearMode;

    @NotNull
    private final FaceInfoView mTopFaceIcon;

    @NotNull
    private final TextView mTvName;

    @NotNull
    private final TextView mTvStatus;

    @NotNull
    private final TextView mTvSynchronized;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0007J\u001a\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0007J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007J\u001a\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0007J\u001a\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0007J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceStatusView$Companion;", "", "<init>", "()V", "URL_LOAD_WATCH_FACE", "", "STATUS_UPDATE_BATTERY", "", "setName", "", "view", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceStatusView;", "name", "setStatus", "status", "setIcon", "icon", "setFaceIcon", "support", "", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void setFaceIcon(@NotNull DeviceStatusView view, @Nullable String icon) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setFaceIcon(icon);
        }

        @JvmStatic
        public final void setIcon(@NotNull DeviceStatusView view, @Nullable String icon) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setIcon(icon);
        }

        @JvmStatic
        public final void setName(@NotNull DeviceStatusView view, @Nullable String name) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setName(name);
        }

        @JvmStatic
        public final void setStatus(@NotNull DeviceStatusView view, @Nullable String status) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setStatus(status);
        }

        @JvmStatic
        public final void setFaceIcon(@NotNull DeviceStatusView view, boolean support) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setSupportSwitchWearMode(support);
        }

        @JvmStatic
        public final void setStatus(@NotNull DeviceStatusView view, int status) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setStatus(status);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceStatusView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyConnect() {
        this.mTopFaceIcon.setDeviceScaleFactor(0.6d);
        this.mBottomFaceIcon.setDeviceScaleFactor(0.6d);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x01b3  */
    private final String getBatteryText(WearableDeviceModel deviceModel, BatteryInfo batteryInfo) {
        String string;
        String huaMiChargeText;
        String string2;
        DeviceModelExtKt.logi("getBatteryText: batteryInfo=" + batteryInfo);
        int battery = batteryInfo.getBattery();
        if (deviceModel == null || !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(deviceModel)) {
            int chargeStatus = batteryInfo.getChargeStatus();
            if (chargeStatus == 1) {
                string = ResourceExtKt.getString(uzi.h0, Integer.valueOf(battery)) + "，" + ResourceExtKt.getString(uzi.U);
            } else if (chargeStatus == 2 || chargeStatus == 3) {
                BatteryInfo.ChargeInfo chargeInfo = batteryInfo.getChargeInfo();
                if (chargeInfo == null) {
                    DeviceModelExtKt.logi("chargestatus = NOT_CHARGING or FULL,but chargeInfo is null");
                    string = ResourceExtKt.getString(uzi.h0, Integer.valueOf(battery));
                } else {
                    if (chargeInfo.getState() == 0) {
                        string2 = ResourceExtKt.getString(uzi.h0, Integer.valueOf(battery));
                    } else if (chargeInfo.getState() == 1) {
                        string2 = ResourceExtKt.getString(uzi.h0, Integer.valueOf(battery)) + "，" + ResourceExtKt.getString(uzi.Q);
                    } else {
                        int chargeDays = batteryInfo.getChargeDays();
                        if (chargeDays < 0) {
                            string2 = ResourceExtKt.getString(uzi.h0, Integer.valueOf(battery));
                        } else if (chargeDays == 0) {
                            string2 = ResourceExtKt.getString(uzi.h0, Integer.valueOf(battery)) + "，" + ResourceExtKt.getString(uzi.S);
                        } else if (chargeDays == 1) {
                            string2 = ResourceExtKt.getString(uzi.h0, Integer.valueOf(battery)) + "，" + ResourceExtKt.getString(uzi.T);
                        } else if (batteryInfo.getIsChargeFull()) {
                            string2 = ResourceExtKt.getString(uzi.h0, Integer.valueOf(battery)) + "，" + (chargeDays >= 30 ? getResources().getString(uzi.F0) : getResources().getQuantityString(pyi.f30901b, chargeDays, Integer.valueOf(chargeDays)));
                        } else {
                            string2 = ResourceExtKt.getString(uzi.h0, Integer.valueOf(battery)) + "，" + (chargeDays >= 30 ? getResources().getString(uzi.E0) : getResources().getQuantityString(pyi.f30900a, chargeDays, Integer.valueOf(chargeDays)));
                        }
                    }
                    string = string2;
                    if (string == null) {
                        DeviceModelExtKt.logi("chargestatus = NOT_CHARGING or FULL,but chargeInfo is null");
                        string = ResourceExtKt.getString(uzi.h0, Integer.valueOf(battery));
                    }
                }
            } else {
                string = ResourceExtKt.getString(uzi.h0, Integer.valueOf(battery));
            }
            huaMiChargeText = null;
        } else {
            String string3 = ResourceExtKt.getString(uzi.h0, Integer.valueOf(battery));
            huaMiChargeText = getHuaMiChargeText(deviceModel.getDid(), batteryInfo);
            string = huaMiChargeText != null ? ResourceExtKt.getString(uzi.R, string3, huaMiChargeText) : ResourceExtKt.getString(uzi.h0, Integer.valueOf(battery));
        }
        Logger.i("DeviceStatusView", "batteryText = " + string);
        DeviceActiveTracker.INSTANCE.reportBatteryValue(deviceModel != null ? com.xiaomi.fitness.device.manager.DeviceModelExtKt.getModel(deviceModel) : null, deviceModel != null ? com.xiaomi.fitness.device.manager.DeviceModelExtKt.getFirmwareVersion(deviceModel) : null, battery, huaMiChargeText);
        return string;
    }

    private final int getChargeDays(String did, BatteryInfo batteryInfo) {
        long deviceBindTime = DevicePreference.INSTANCE.getDeviceBindTime(did);
        Calendar lastCharge = batteryInfo.getLastCharge();
        long timeInMillis = lastCharge != null ? lastCharge.getTimeInMillis() : 0L;
        DeviceModelExtKt.logi("deviceBindTime:" + deviceBindTime + ", lastCharge:" + timeInMillis);
        if (timeInMillis == 0 || timeInMillis >= deviceBindTime) {
            return batteryInfo.getChargeDays();
        }
        Calendar lastCharge2 = batteryInfo.getLastCharge();
        Intrinsics.checkNotNull(lastCharge2);
        return lastCharge2.get(1) == 1970 ? -2 : -1;
    }

    private final String getHuaMiChargeText(String did, BatteryInfo batteryInfo) {
        if (batteryInfo.getIsCharging()) {
            return ResourceExtKt.getString(uzi.U);
        }
        int chargeDays = getChargeDays(did, batteryInfo);
        if (chargeDays == -2) {
            return null;
        }
        if (chargeDays == -1) {
            return ResourceExtKt.getString(uzi.Q);
        }
        if (chargeDays == 0) {
            return ResourceExtKt.getString(uzi.S);
        }
        if (chargeDays == 1) {
            return ResourceExtKt.getString(uzi.T);
        }
        if (batteryInfo.getIsChargeFull()) {
            if (chargeDays >= 30) {
                return getContext().getString(uzi.F0);
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return ResourceExtKt.getQuantityString(context, pyi.f30901b, chargeDays, Integer.valueOf(chargeDays));
        }
        if (chargeDays >= 30) {
            return getContext().getString(uzi.E0);
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return ResourceExtKt.getQuantityString(context2, pyi.f30900a, chargeDays, Integer.valueOf(chargeDays));
    }

    private final void setButtonText(int text) {
        this.mTvSynchronized.setEnabled(true);
        this.mTvSynchronized.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        Animator animator = this.mLoadingAnimator;
        if (animator != null) {
            animator.cancel();
        }
        this.mTvSynchronized.setText(text);
    }

    private final void setConnectStatusText(int text) {
        this.mConnectText = ResourceExtKt.getString(text);
        setDeviceStatusText();
        setButtonText(uzi.V1);
    }

    private final void setDeviceStatusText() {
        if (TextUtils.isEmpty(this.mBatteryValue)) {
            this.mTvStatus.setText(StringsKt__StringsJVMKt.replace$default(ResourceExtKt.getString(uzi.R1, this.mConnectText, ""), "|", "", false, 4, (Object) null));
        } else {
            String string = ResourceExtKt.getString(uzi.R1, this.mConnectText, this.mBatteryValue);
            this.mTvStatus.setText(string);
            this.mTvStatus.setContentDescription(string);
        }
    }

    @JvmStatic
    public static final void setFaceIcon(@NotNull DeviceStatusView deviceStatusView, @Nullable String str) {
        INSTANCE.setFaceIcon(deviceStatusView, str);
    }

    @JvmStatic
    public static final void setIcon(@NotNull DeviceStatusView deviceStatusView, @Nullable String str) {
        INSTANCE.setIcon(deviceStatusView, str);
    }

    @JvmStatic
    public static final void setName(@NotNull DeviceStatusView deviceStatusView, @Nullable String str) {
        INSTANCE.setName(deviceStatusView, str);
    }

    @JvmStatic
    public static final void setStatus(@NotNull DeviceStatusView deviceStatusView, int i) {
        INSTANCE.setStatus(deviceStatusView, i);
    }

    private final void showLoading() {
        this.mTvSynchronized.setEnabled(false);
        if (this.mLoadingIcon == null) {
            Drawable drawable = ViewExtKt.getDrawable(this, hni.q);
            this.mLoadingIcon = drawable;
            Intrinsics.checkNotNull(drawable);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, "level", 0, 10000);
            objectAnimatorOfInt.setRepeatCount(-1);
            objectAnimatorOfInt.setDuration(500L);
            objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
            this.mLoadingAnimator = objectAnimatorOfInt;
        }
        this.mTvSynchronized.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.mLoadingIcon, (Drawable) null);
        this.mTvSynchronized.setText("");
        Animator animator = this.mLoadingAnimator;
        if (animator != null) {
            animator.start();
        }
    }

    private final void updateBatteryText() {
        BatteryInfo batteryInfo;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        DeviceModelExtKt.logi("updateBatteryText: currentDeviceModel = " + DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel());
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        try {
            batteryInfo = wearableDeviceModel.getDeviceInfo().getBatteryInfo();
        } catch (Exception e) {
            DeviceModelExtKt.loge("can not get battery info because " + e);
            batteryInfo = null;
        }
        DeviceModelExtKt.logi("updateBatteryText: batteryInfo = " + batteryInfo + ",battery = " + (batteryInfo != null ? Integer.valueOf(batteryInfo.getBattery()) : null));
        if (batteryInfo == null || batteryInfo.getBattery() < 0) {
            return;
        }
        setBatteryValue(batteryInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.currentStatus;
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("expose_v3", "56.51.0.1.36387"), "name", "Device_page_Connect", "status", Integer.valueOf((i > 4 || i == 3) ? 1 : 0));
    }

    @Override // android.view.View
    public void onConfigurationChanged(@Nullable Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        applyConnect();
    }

    public final void setBatteryValue(@NotNull BatteryInfo batteryInfo) {
        Intrinsics.checkNotNullParameter(batteryInfo, "batteryInfo");
        this.mBatteryValue = getBatteryText((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel(), batteryInfo);
        setDeviceStatusText();
    }

    public final void setSupportSwitchWearMode(boolean support) {
        TextView textView = this.mSwitchWearMode;
        if (textView != null) {
            ViewExtKt.setVisible(textView, support);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceStatusView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @JvmStatic
    public static final void setFaceIcon(@NotNull DeviceStatusView deviceStatusView, boolean z) {
        INSTANCE.setFaceIcon(deviceStatusView, z);
    }

    @JvmStatic
    public static final void setStatus(@NotNull DeviceStatusView deviceStatusView, @Nullable String str) {
        INSTANCE.setStatus(deviceStatusView, str);
    }

    public final void setIcon(@Nullable String icon) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (Intrinsics.areEqual(wearableDeviceModel != null ? Boolean.valueOf(com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel)) : null, Boolean.TRUE)) {
            AppCompatImageView appCompatImageView = this.mBandIcon;
            Coil.imageLoader(appCompatImageView.getContext()).enqueue(new ImageRequest.Builder(appCompatImageView.getContext()).data(wearableDeviceModel.getProduct().getBigPreview()).target(appCompatImageView).build());
        } else {
            AppCompatImageView appCompatImageView2 = this.mBandIcon;
            Coil.imageLoader(appCompatImageView2.getContext()).enqueue(new ImageRequest.Builder(appCompatImageView2.getContext()).data(icon).target(appCompatImageView2).build());
        }
    }

    public final void setName(@Nullable String name) {
        this.mTvName.setText(name);
        this.mTvName.requestLayout();
    }

    public /* synthetic */ DeviceStatusView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void setFaceIcon(@Nullable String icon) {
        Logger.d("setFaceIcon " + icon, new Object[0]);
        if (icon != null) {
            FaceHelperExtKt.getInstance(FaceHelper.INSTANCE).loadFace(this.mBottomFaceIcon, this.mTopFaceIcon);
        }
    }

    public final void setStatus(@Nullable String status) {
        this.mTvStatus.setText(status);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceStatusView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mBatteryValue = "";
        this.mConnectText = "";
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(h4j.Q0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(h4j.S0);
        String string2 = typedArrayObtainStyledAttributes.getString(h4j.T0);
        String string3 = typedArrayObtainStyledAttributes.getString(h4j.R0);
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = View.inflate(context, dui.Q, this);
        this.mBandIcon = (AppCompatImageView) viewInflate.findViewById(xqi.t);
        this.mBottomFaceIcon = (FaceInfoView) viewInflate.findViewById(xqi.x);
        this.mTopFaceIcon = (FaceInfoView) viewInflate.findViewById(xqi.y);
        this.mTvName = (TextView) viewInflate.findViewById(xqi.O);
        this.mTvStatus = (TextView) viewInflate.findViewById(xqi.V);
        this.mSwitchWearMode = (TextView) viewInflate.findViewById(xqi.W);
        this.mTvSynchronized = (TextView) viewInflate.findViewById(xqi.X);
        setName(string);
        setStatus(string2);
        setIcon(string3);
        applyConnect();
    }

    public final void setStatus(int status) {
        Logger.i("Set status(" + status + ") for View", new Object[0]);
        int i = this.currentStatus;
        this.currentStatus = status;
        if (status == -100) {
            if (i != 6) {
                updateBatteryText();
            }
            return;
        }
        switch (status) {
            case 1:
            case 4:
                this.mTvStatus.setText(uzi.T1);
                setButtonText(uzi.O1);
                break;
            case 2:
                this.mTvStatus.setText(uzi.Q1);
                showLoading();
                break;
            case 3:
                setConnectStatusText(uzi.P1);
                updateBatteryText();
                break;
            case 5:
                setConnectStatusText(uzi.P1);
                updateBatteryText();
                break;
            case 6:
                this.mTvStatus.setText(uzi.W1);
                showLoading();
                break;
            case 7:
                setConnectStatusText(uzi.P1);
                updateBatteryText();
                break;
            case 8:
                setConnectStatusText(uzi.S1);
                setButtonText(uzi.u);
                break;
            case 9:
                this.mBatteryValue = "";
                setConnectStatusText(uzi.S1);
                setButtonText(uzi.u);
                break;
        }
    }
}
