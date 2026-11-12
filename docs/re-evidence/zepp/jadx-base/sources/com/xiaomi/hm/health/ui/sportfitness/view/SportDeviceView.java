package com.xiaomi.hm.health.ui.sportfitness.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.dataflow.Constant;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.ui.sportfitness.manager.SportDeviceManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001+B!\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(B\u001b\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b'\u0010)B\u0011\b\u0016\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b'\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002R.\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0016\u0010 \u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/ui/sportfitness/view/SportDeviceView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "", "b", "Lcom/xiaomi/hm/health/ui/sportfitness/view/SportDeviceView$DeviceDataSource;", ParamKey.dataSource, "a", "c", "notifyDataChanged", "notifyHeartRateChanged", "value", "Lcom/xiaomi/hm/health/ui/sportfitness/view/SportDeviceView$DeviceDataSource;", "getDeviceDataSource", "()Lcom/xiaomi/hm/health/ui/sportfitness/view/SportDeviceView$DeviceDataSource;", "setDeviceDataSource", "(Lcom/xiaomi/hm/health/ui/sportfitness/view/SportDeviceView$DeviceDataSource;)V", "deviceDataSource", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "deviceIcon1", "deviceIcon2", "Landroid/view/View;", GoogleApiAvailabilityLight.a, "Landroid/view/View;", "heartRateInfoContainer", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "heartRateInfo", "f", "hardwareInfoContainer", "g", "hardwareInfo", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "DeviceDataSource", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SportDeviceView extends LinearLayoutCompat {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private DeviceDataSource deviceDataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private ImageView deviceIcon1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private ImageView deviceIcon2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private View heartRateInfoContainer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private TextView heartRateInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private View hardwareInfoContainer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private TextView hardwareInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\u0005H&¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/ui/sportfitness/view/SportDeviceView$DeviceDataSource;", "", "", "Lcom/xiaomi/hm/health/ui/sportfitness/view/SportDeviceView$DeviceDataSource$DeviceInfo;", "availableDevices", "", "hasHeartRateDevice", "isHeartRateConnected", "", Constant.KEY_HR_VALUE, "hasHardwareDataDevice", "isHardwareDataConnected", CompanionModule.KEY_DEVICE_INFO, "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public interface DeviceDataSource {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/ui/sportfitness/view/SportDeviceView$DeviceDataSource$DeviceInfo;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
        public interface DeviceInfo {
            @NotNull
            HMDeviceSource deviceSource();
        }

        @NotNull
        List<DeviceInfo> availableDevices();

        boolean hasHardwareDataDevice();

        boolean hasHeartRateDevice();

        int heartRate();

        boolean isHardwareDataConnected();

        boolean isHeartRateConnected();
    }

    public SportDeviceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.view_sport_prepare_device, this);
        setOrientation(0);
        this.deviceIcon1 = (ImageView) findViewById(R.id.iv_ic_device_1);
        this.deviceIcon2 = (ImageView) findViewById(R.id.iv_ic_device_2);
        this.heartRateInfoContainer = findViewById(R.id.ll_heart_rate_info);
        this.heartRateInfo = (TextView) findViewById(R.id.tv_heart_rate);
        this.hardwareInfoContainer = findViewById(R.id.ll_hardware_info);
        this.hardwareInfo = (TextView) findViewById(R.id.tv_hardware);
        b();
    }

    private final void a(DeviceDataSource dataSource) {
        List<DeviceDataSource.DeviceInfo> listAvailableDevices = dataSource.availableDevices();
        if (listAvailableDevices.isEmpty()) {
            b();
            return;
        }
        setBackground(ContextCompat.getDrawable(getContext(), R.drawable.bg_sport_prepare_device_info));
        if (listAvailableDevices.size() == 1) {
            this.deviceIcon1.setVisibility(0);
            this.deviceIcon2.setVisibility(8);
            this.deviceIcon1.setImageResource(SportDeviceManager.getInstance(getContext()).deviceIconResId(listAvailableDevices.get(0).deviceSource().getValue(), true));
        } else if (listAvailableDevices.size() >= 2) {
            this.deviceIcon1.setVisibility(0);
            this.deviceIcon2.setVisibility(0);
            int iDeviceIconResId = SportDeviceManager.getInstance(getContext()).deviceIconResId(listAvailableDevices.get(0).deviceSource().getValue(), true);
            int iDeviceIconResId2 = SportDeviceManager.getInstance(getContext()).deviceIconResId(listAvailableDevices.get(1).deviceSource().getValue(), true);
            this.deviceIcon2.setImageResource(iDeviceIconResId);
            this.deviceIcon1.setImageResource(iDeviceIconResId2);
        }
        c(dataSource);
        if (!dataSource.hasHardwareDataDevice()) {
            this.hardwareInfoContainer.setVisibility(8);
        } else {
            this.hardwareInfoContainer.setVisibility(0);
            this.hardwareInfo.setText(dataSource.isHardwareDataConnected() ? "OK" : "NO");
        }
    }

    private final void b() {
        setBackground(null);
        this.deviceIcon1.setVisibility(0);
        this.deviceIcon1.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_sport_prepare_default_device));
        this.deviceIcon2.setVisibility(8);
        this.heartRateInfoContainer.setVisibility(8);
        this.hardwareInfoContainer.setVisibility(8);
    }

    private final void c(DeviceDataSource dataSource) {
        if (!dataSource.hasHeartRateDevice()) {
            this.heartRateInfoContainer.setVisibility(8);
            return;
        }
        this.heartRateInfoContainer.setVisibility(0);
        int iHeartRate = dataSource.heartRate();
        this.heartRateInfo.setText((!dataSource.isHeartRateConnected() || iHeartRate <= 0) ? "--" : String.valueOf(iHeartRate));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final DeviceDataSource getDeviceDataSource() {
        return this.deviceDataSource;
    }

    public final void notifyDataChanged() {
        Unit unit;
        DeviceDataSource deviceDataSource = this.deviceDataSource;
        if (deviceDataSource == null) {
            unit = null;
        } else {
            a(deviceDataSource);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            b();
        }
    }

    public final void notifyHeartRateChanged() {
        DeviceDataSource deviceDataSource = this.deviceDataSource;
        if (deviceDataSource == null) {
            return;
        }
        c(deviceDataSource);
    }

    public final void setDeviceDataSource(@Nullable DeviceDataSource deviceDataSource) {
        this.deviceDataSource = deviceDataSource;
        notifyDataChanged();
    }

    public SportDeviceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SportDeviceView(@NotNull Context context) {
        this(context, null);
    }
}
