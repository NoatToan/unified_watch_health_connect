package com.xiaomi.fitness.device.manager.ui.tab;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.miui.circulate.device.api.Column;
import com.miui.tsmclient.common.net.NetConstants;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.bean.BatteryInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.ui.tab.AccessoryDeviceStatusView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.dui;
import defpackage.h4j;
import defpackage.hni;
import defpackage.s7r;
import defpackage.txo;
import defpackage.uzi;
import defpackage.vwo;
import defpackage.xqi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u0012\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0015H\u0002J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0007H\u0002J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0007H\u0002J\b\u0010!\u001a\u00020\u0018H\u0002J\u0012\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u0015H\u0002J\u0012\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010$\u001a\u00020\u0018H\u0002J\u0010\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0007H\u0002J$\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00180+H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/AccessoryDeviceStatusView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mIcon", "Landroid/widget/ImageView;", "mTvName", "Landroid/widget/TextView;", "mTvStatus", "mTvSynchronized", "mLoadingIcon", "Landroid/graphics/drawable/Drawable;", "mLoadingAnimator", "Landroid/animation/Animator;", "mConnectText", "", "currentStatus", "setDeviceMode", "", "mode", "setIcon", "icon", "url", "setStatus", "status", "setButtonText", "text", "showLoading", "setName", "name", "updateBattery", "refreshBatteryText", Column.BATTERY, "readBattery", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "callback", "Lkotlin/Function1;", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccessoryDeviceStatusView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessoryDeviceStatusView.kt\ncom/xiaomi/fitness/device/manager/ui/tab/AccessoryDeviceStatusView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,233:1\n54#2,3:234\n24#2:237\n59#2,6:238\n*S KotlinDebug\n*F\n+ 1 AccessoryDeviceStatusView.kt\ncom/xiaomi/fitness/device/manager/ui/tab/AccessoryDeviceStatusView\n*L\n134#1:234,3\n134#1:237\n134#1:238,6\n*E\n"})
public final class AccessoryDeviceStatusView extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "AccessoryDeviceStatusView";
    private int currentStatus;

    @NotNull
    private String mConnectText;

    @NotNull
    private final ImageView mIcon;

    @Nullable
    private Animator mLoadingAnimator;

    @Nullable
    private Drawable mLoadingIcon;

    @NotNull
    private final TextView mTvName;

    @NotNull
    private final TextView mTvStatus;

    @NotNull
    private final TextView mTvSynchronized;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007J\u001a\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0007J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0005H\u0007J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\rH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/AccessoryDeviceStatusView$Companion;", "", "<init>", "()V", "TAG", "", "setName", "", "view", "Lcom/xiaomi/fitness/device/manager/ui/tab/AccessoryDeviceStatusView;", "name", "setStatus", "status", "", "setIcon", "icon", "Landroid/graphics/drawable/Drawable;", "setBeanPreviewUrl", "setDeviceMode", "mode", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void setBeanPreviewUrl(@NotNull AccessoryDeviceStatusView view, @NotNull String icon) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(icon, "icon");
            view.setIcon(icon);
        }

        @JvmStatic
        public final void setDeviceMode(@NotNull AccessoryDeviceStatusView view, int mode) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setDeviceMode(mode);
        }

        @JvmStatic
        public final void setIcon(@NotNull AccessoryDeviceStatusView view, @Nullable Drawable icon) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setIcon(icon);
        }

        @JvmStatic
        public final void setName(@NotNull AccessoryDeviceStatusView view, @Nullable String name) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setName(name);
        }

        @JvmStatic
        public final void setStatus(@NotNull AccessoryDeviceStatusView view, @Nullable String status) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setStatus(status);
        }

        @JvmStatic
        public final void setStatus(@NotNull AccessoryDeviceStatusView view, int status) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setStatus(status);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AccessoryDeviceStatusView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void readBattery(final WearableDeviceModel deviceModel, final Function1<? super Integer, Unit> callback) {
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 1;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), deviceModel.getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.device.manager.ui.tab.AccessoryDeviceStatusView.readBattery.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(AccessoryDeviceStatusView.TAG, "getAccessoryDevice fail: " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                txo txoVarE;
                vwo vwoVarS;
                vwo.a aVar;
                int i = (result == null || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null || (vwoVarS = txoVarE.s()) == null || (aVar = vwoVarS.c) == null) ? -1 : aVar.c;
                deviceModel.getDeviceInfo().getBatteryInfo().setBattery(i);
                Logger.i(AccessoryDeviceStatusView.TAG, "getAccessoryDevice battery: " + i);
                AnyExtKt.main$default(null, new AccessoryDeviceStatusView$readBattery$1$onSuccess$1(callback, i, null), 1, null);
            }
        }, 0, 16, (Object) null);
    }

    private final void refreshBatteryText(int battery) {
        int i;
        String string = ResourceExtKt.getString(uzi.h0, Integer.valueOf(battery));
        if (string.length() <= 0 || !((i = this.currentStatus) == 3 || i == 7 || i == 6 || i == 5)) {
            this.mTvStatus.setText(this.mConnectText);
        } else {
            this.mTvStatus.setText(ResourceExtKt.getString(uzi.R1, this.mConnectText, string));
        }
    }

    @JvmStatic
    public static final void setBeanPreviewUrl(@NotNull AccessoryDeviceStatusView accessoryDeviceStatusView, @NotNull String str) {
        INSTANCE.setBeanPreviewUrl(accessoryDeviceStatusView, str);
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

    @JvmStatic
    public static final void setDeviceMode(@NotNull AccessoryDeviceStatusView accessoryDeviceStatusView, int i) {
        INSTANCE.setDeviceMode(accessoryDeviceStatusView, i);
    }

    @JvmStatic
    public static final void setIcon(@NotNull AccessoryDeviceStatusView accessoryDeviceStatusView, @Nullable Drawable drawable) {
        INSTANCE.setIcon(accessoryDeviceStatusView, drawable);
    }

    @JvmStatic
    public static final void setName(@NotNull AccessoryDeviceStatusView accessoryDeviceStatusView, @Nullable String str) {
        INSTANCE.setName(accessoryDeviceStatusView, str);
    }

    @JvmStatic
    public static final void setStatus(@NotNull AccessoryDeviceStatusView accessoryDeviceStatusView, int i) {
        INSTANCE.setStatus(accessoryDeviceStatusView, i);
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

    private final void updateBattery() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) CollectionsKt___CollectionsKt.firstOrNull((List) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getAccessoryDeviceModels());
        if (wearableDeviceModel == null) {
            return;
        }
        BatteryInfo batteryInfo = wearableDeviceModel.getDeviceInfo().getBatteryInfo();
        if (batteryInfo.getBattery() < 0) {
            readBattery(wearableDeviceModel, new Function1() { // from class: u80
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AccessoryDeviceStatusView.updateBattery$lambda$2(this.f35507a, ((Integer) obj).intValue());
                }
            });
        } else {
            refreshBatteryText(batteryInfo.getBattery());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateBattery$lambda$2(AccessoryDeviceStatusView this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshBatteryText(i);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AccessoryDeviceStatusView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDeviceMode(int mode) {
        if (mode == 1) {
            setName(ResourceExtKt.getString(uzi.n));
        } else {
            setName(ResourceExtKt.getString(uzi.n));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setIcon(Drawable icon) {
        this.mIcon.setImageDrawable(icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setName(String name) {
        this.mTvName.setText(name);
    }

    @JvmStatic
    public static final void setStatus(@NotNull AccessoryDeviceStatusView accessoryDeviceStatusView, @Nullable String str) {
        INSTANCE.setStatus(accessoryDeviceStatusView, str);
    }

    public /* synthetic */ AccessoryDeviceStatusView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setIcon(String url) {
        ImageView imageView = this.mIcon;
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(url).target(imageView);
        builderTarget.addHeader(NetConstants.COOKIE, "auth_key=rwelJuWBFJxmbMKD");
        imageLoader.enqueue(builderTarget.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStatus(int status) {
        this.currentStatus = status;
        switch (status) {
            case 1:
            case 4:
            case 8:
            case 9:
                this.mConnectText = ResourceExtKt.getString(uzi.S1);
                setButtonText(uzi.m);
                break;
            case 2:
                this.mConnectText = ResourceExtKt.getString(uzi.Q1);
                showLoading();
                break;
            case 3:
            case 5:
            case 6:
            case 7:
                this.mConnectText = ResourceExtKt.getString(uzi.P1);
                setButtonText(uzi.f);
                break;
        }
        this.mTvStatus.setText(this.mConnectText);
        updateBattery();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AccessoryDeviceStatusView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mConnectText = "";
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(h4j.f19683a);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        typedArrayObtainStyledAttributes.getString(h4j.d);
        String string = typedArrayObtainStyledAttributes.getString(h4j.e);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(h4j.f19684b);
        int i2 = typedArrayObtainStyledAttributes.getInt(h4j.c, -1);
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = View.inflate(context, dui.N, this);
        this.mIcon = (ImageView) viewInflate.findViewById(xqi.u);
        this.mTvName = (TextView) viewInflate.findViewById(xqi.I);
        this.mTvStatus = (TextView) viewInflate.findViewById(xqi.L);
        this.mTvSynchronized = (TextView) viewInflate.findViewById(xqi.f39366a);
        setStatus(string);
        setIcon(drawable);
        setDeviceMode(i2);
        updateBattery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStatus(String status) {
        this.mTvStatus.setText(status);
    }
}
