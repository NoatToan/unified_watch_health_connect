package com.xiaomi.hm.health.device.service;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.snore.ui.fragment.SnoreListFragment;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPData;
import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPType;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0002R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/service/DeviceSettingsUploader;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", SnoreListFragment.TYPE_UPLOAD, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "data", "a", "", "Ljava/lang/String;", "TAG", "b", "PROPERTY", "c", "PROPERTY_SOURCE", GoogleApiAvailabilityLight.a, "PROPERTY_CONFIGURATION", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceSettingsUploader {

    @NotNull
    public static final DeviceSettingsUploader INSTANCE = new DeviceSettingsUploader();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "DeviceSettingsUploader";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String PROPERTY = "huami.mifit.user.settings.device.settings.configuration";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String PROPERTY_SOURCE = "deviceSource";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String PROPERTY_CONFIGURATION = "configuration";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ JsonObject a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JsonObject jsonObject) {
            super(0);
            this.a = jsonObject;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Save: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Device not support!";
        }
    }

    private DeviceSettingsUploader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(HMDeviceSource source, Object data) {
        JsonElement jsonElement = ProtoBufferUtils.toJsonElement(data);
        if (jsonElement == null) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("deviceSource", Integer.valueOf(source.getValue()));
        jsonObject.add(PROPERTY_CONFIGURATION, jsonElement);
        HMLog.info(TAG, new a(jsonObject));
        DeviceXFunctionsKt.getPropertyStoreApi().setProperty(PROPERTY, jsonObject.toString());
        DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
    }

    @JvmStatic
    public static final void upload(@NotNull final HMBaseDevice device) {
        if (device instanceof HMMiLiProDevice) {
            ((HMMiLiProDevice) device).gdspSync(HMGDSPType.DEVICE_SETTINGS, Calendar.getInstance(), new IHMDataCallback<HMGDSPData>() { // from class: com.xiaomi.hm.health.device.service.DeviceSettingsUploader.upload.2

                /* JADX INFO: renamed from: com.xiaomi.hm.health.device.service.DeviceSettingsUploader$upload$2$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ Progress a;
                    public final /* synthetic */ Progress b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(Progress progress, Progress progress2) {
                        super(0);
                        this.a = progress;
                        this.b = progress2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "Pull device settings: " + this.a + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.b.total;
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.device.service.DeviceSettingsUploader$upload$2$b */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class b extends Lambda implements Function0<String> {
                    public static final b a = new b();

                    public b() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "Pull device settings";
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.device.service.DeviceSettingsUploader$upload$2$c */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class c extends Lambda implements Function0<String> {
                    public final /* synthetic */ HMDeviceError a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public c(HMDeviceError hMDeviceError) {
                        super(0);
                        this.a = hMDeviceError;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        HMDeviceError hMDeviceError = this.a;
                        return "Pull device settings completed: " + (hMDeviceError == null ? null : Integer.valueOf(hMDeviceError.getError()));
                    }
                }

                @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
                public void onProgress(@Nullable Progress progress) {
                    if (progress == null) {
                        return;
                    }
                    HMLog.info(DeviceSettingsUploader.TAG, new a(progress, progress));
                }

                @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
                public void onStart() {
                    HMLog.info(DeviceSettingsUploader.TAG, b.a);
                }

                @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
                public void onStop(@Nullable HMGDSPData data, @Nullable HMDeviceError error) {
                    Object obj;
                    HMLog.info(DeviceSettingsUploader.TAG, new c(error));
                    if (data == null || (obj = data.get()) == null) {
                        return;
                    }
                    DeviceSettingsUploader.INSTANCE.a(((HMMiLiProDevice) device).getMDeviceSource(), obj);
                }
            });
        } else {
            HMLog.info(TAG, b.a);
        }
    }
}
