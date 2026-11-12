package com.huami.watchfacesstore.ui.manager;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.device.channel.IDeviceManager;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.ui.manager.WatchFaceHeaderView;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001.B%\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\n¢\u0006\u0004\b,\u0010-J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J5\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001e\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001d\u0010!\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010%¨\u0006/"}, d2 = {"Lcom/huami/watchfacesstore/ui/manager/WatchFaceHeaderView;", "Landroid/widget/LinearLayout;", "Lcom/huami/watchfacesstore/ui/manager/WatchFaceHeaderView$DeviceConnStatus;", "status", "", "setConnectState", "", "deviceImagePath", "previewImagePath", "transImagePath", "", "color", "setWatchFaceImage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Lcom/huami/watchfacesstore/device/channel/IDeviceManager;", "a", "Lcom/huami/watchfacesstore/device/channel/IDeviceManager;", "deviceManager", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "b", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "deviceSizeManager", "Landroid/widget/ImageView;", "c", "Lkotlin/Lazy;", "getIvDeviceBg", "()Landroid/widget/ImageView;", "ivDeviceBg", GoogleApiAvailabilityLight.a, "getIvDevicePreview", "ivDevicePreview", "e", "getIvDeviceTransparent", "ivDeviceTransparent", "Landroid/widget/TextView;", "f", "getTvHeaderWatchName", "()Landroid/widget/TextView;", "tvHeaderWatchName", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "DeviceConnStatus", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WatchFaceHeaderView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IDeviceManager deviceManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DeviceConfigManager deviceSizeManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivDeviceBg;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivDevicePreview;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivDeviceTransparent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvHeaderWatchName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/huami/watchfacesstore/ui/manager/WatchFaceHeaderView$DeviceConnStatus;", "", "", "msgResId", LogUtil.I, "getMsgResId", "()I", "<init>", "(Ljava/lang/String;II)V", "BLUETOOTH_NOT_OPEN", "CONNECT_FAIL", "CONNECTING", "CONNECT_SUCCESS", "CHARGING", "lib_release"}, k = 1, mv = {1, 5, 1})
    public enum DeviceConnStatus {
        BLUETOOTH_NOT_OPEN(R.string.wf_manager_ble_not_open),
        CONNECT_FAIL(R.string.wf_manager_ble_conn_fail),
        CONNECTING(R.string.wf_manager_ble_connecting),
        CONNECT_SUCCESS(R.string.wf_manager_ble_conn_success),
        CHARGING(R.string.wf_setting_charging);

        private final int msgResId;

        DeviceConnStatus(int i) {
            this.msgResId = i;
        }

        public final int getMsgResId() {
            return this.msgResId;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceConnStatus.values().length];
            iArr[DeviceConnStatus.BLUETOOTH_NOT_OPEN.ordinal()] = 1;
            iArr[DeviceConnStatus.CONNECT_FAIL.ordinal()] = 2;
            iArr[DeviceConnStatus.CONNECTING.ordinal()] = 3;
            iArr[DeviceConnStatus.CHARGING.ordinal()] = 4;
            iArr[DeviceConnStatus.CONNECT_SUCCESS.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ImageView> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageView invoke() {
            return (ImageView) WatchFaceHeaderView.this.findViewById(R.id.iv_device_bg);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ImageView> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageView invoke() {
            return (ImageView) WatchFaceHeaderView.this.findViewById(R.id.iv_device_preview);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<ImageView> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageView invoke() {
            return (ImageView) WatchFaceHeaderView.this.findViewById(R.id.iv_device_transparent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<TextView> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) WatchFaceHeaderView.this.findViewById(R.id.tv_header_watch_name);
        }
    }

    public /* synthetic */ WatchFaceHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(WatchFaceHeaderView watchFaceHeaderView, View view) {
        watchFaceHeaderView.getContext().startActivity(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(WatchFaceHeaderView watchFaceHeaderView, View view) {
        watchFaceHeaderView.setConnectState(DeviceConnStatus.CONNECTING);
    }

    private final ImageView getIvDeviceBg() {
        return (ImageView) this.ivDeviceBg.getValue();
    }

    private final ImageView getIvDevicePreview() {
        return (ImageView) this.ivDevicePreview.getValue();
    }

    private final ImageView getIvDeviceTransparent() {
        return (ImageView) this.ivDeviceTransparent.getValue();
    }

    private final TextView getTvHeaderWatchName() {
        return (TextView) this.tvHeaderWatchName.getValue();
    }

    public final void setConnectState(@NotNull DeviceConnStatus status) {
        TextView textView = (TextView) findViewById(R.id.tv_status);
        int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1 || i == 2) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(getContext(), R.drawable.wf_ic_more), (Drawable) null);
            textView.setText(status.getMsgResId());
            if (status == DeviceConnStatus.BLUETOOTH_NOT_OPEN) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: nf8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        WatchFaceHeaderView.c(this.a, view);
                    }
                });
                return;
            } else {
                textView.setOnClickListener(new View.OnClickListener() { // from class: mf8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        WatchFaceHeaderView.d(this.a, view);
                    }
                });
                return;
            }
        }
        if (i == 3 || i == 4) {
            textView.setOnClickListener(null);
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setText(status.getMsgResId());
        } else {
            if (i != 5) {
                return;
            }
            textView.setOnClickListener(null);
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setText(getContext().getString(R.string.wf_manager_ble_conn_success, this.deviceManager.getBatteryLevel() + "%"));
        }
    }

    public final void setWatchFaceImage(@Nullable String deviceImagePath, @Nullable String previewImagePath, @Nullable String transImagePath, @Nullable Integer color) {
        Unit unit;
        ExtensionsKt.loadUrl(getIvDeviceBg(), deviceImagePath);
        ExtensionsKt.loadWithRadius(getIvDevicePreview(), previewImagePath, this.deviceSizeManager.getHeadDialRadius());
        if (transImagePath == null) {
            unit = null;
        } else {
            ExtensionsKt.visible(getIvDeviceTransparent());
            ExtensionsKt.loadUrlAndHintColor(getIvDeviceTransparent(), transImagePath, color);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            ExtensionsKt.gone(getIvDeviceTransparent());
        }
    }

    public WatchFaceHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.deviceManager = KoinExtKt.getDeviceManager();
        DeviceConfigManager deviceConfigManager = KoinExtKt.getDeviceConfigManager();
        this.deviceSizeManager = deviceConfigManager;
        this.ivDeviceBg = LazyKt__LazyJVMKt.lazy(new a());
        this.ivDevicePreview = LazyKt__LazyJVMKt.lazy(new b());
        this.ivDeviceTransparent = LazyKt__LazyJVMKt.lazy(new c());
        this.tvHeaderWatchName = LazyKt__LazyJVMKt.lazy(new d());
        LayoutInflater.from(context).inflate(R.layout.wf_headview_manager, (ViewGroup) this, true);
        setBackgroundResource(R.drawable.wf_item_common_bg);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, ExtensionsKt.getDp(73));
        layoutParams.topMargin = ExtensionsKt.getDp(16);
        layoutParams.leftMargin = ExtensionsKt.getDp(15);
        layoutParams.rightMargin = ExtensionsKt.getDp(15);
        Unit unit = Unit.INSTANCE;
        setLayoutParams(layoutParams);
        getIvDeviceBg().setImageResource(deviceConfigManager.getCurrentDeviceConfig().getDefaultDeviceImage());
        deviceConfigManager.setViewLayoutParams(getIvDevicePreview(), deviceConfigManager.getDeviceSmallDialSize());
        deviceConfigManager.setViewLayoutParams(getIvDeviceTransparent(), deviceConfigManager.getDeviceSmallDialSize());
        getTvHeaderWatchName().setText(KoinExtKt.getDeviceInfo().getDeviceName());
    }
}
