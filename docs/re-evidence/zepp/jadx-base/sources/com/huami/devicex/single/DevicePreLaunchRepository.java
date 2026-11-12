package com.huami.devicex.single;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002J\b\u0010\r\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002J\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0015J\u0016\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0015R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0019R+\u0010+\u001a\u00020#2\u0006\u0010$\u001a\u00020#8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/huami/devicex/single/DevicePreLaunchRepository;", "", "", "deviceName", "", "savePreReleaseDeviceName", "getPreReleaseDeviceName", "iconUrl", "savePreReleaseDeviceIconUrl", "getPreReleaseDeviceIconUrl", "savePreReleaseOpenSportIconUrl", "getPreReleaseOpenSportIconUrl", "savePreReleaseSportDetailIconUrl", "getPreReleaseSportDetailIconUrl", "savePreReleaseWatchFaceBgIconUrl", "getPreReleaseWatchFaceBgIconUrl", "key", "default", "fetchString", "value", "putString", "", "getBoolean", "putBoolean", "b", "Ljava/lang/String;", "PRE_RELEASE_DEVICE_CLOUD_CONFIGURATION_DEVICE_NAME", "c", "PRE_RELEASE_DEVICE_CLOUD_CONFIGURATION_DEVICE_ICON_URL", GoogleApiAvailabilityLight.a, "PRE_RELEASE_DEVICE_CLOUD_CONFIGURATION_OPEN_SPORT_ICON_URL", "e", "PRE_RELEASE_DEVICE_CLOUD_CONFIGURATION_SPORT_RECORD_DETAIL_ICON_URL", "f", "PRE_RELEASE_DEVICE_CLOUD_CONFIGURATION_WATCH_FACE_BG_ICON_URL", "Lcom/huami/devicex/single/DeviceXKVStore;", "<set-?>", "g", "Lkotlin/properties/ReadWriteProperty;", "getDeviceXKVStore", "()Lcom/huami/devicex/single/DeviceXKVStore;", "setDeviceXKVStore", "(Lcom/huami/devicex/single/DeviceXKVStore;)V", "deviceXKVStore", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DevicePreLaunchRepository {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String PRE_RELEASE_DEVICE_CLOUD_CONFIGURATION_DEVICE_NAME = "pre_release_device_name";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String PRE_RELEASE_DEVICE_CLOUD_CONFIGURATION_DEVICE_ICON_URL = "pre_release_device_icon_url";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String PRE_RELEASE_DEVICE_CLOUD_CONFIGURATION_OPEN_SPORT_ICON_URL = "pre_release_open_sport_icon_url";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String PRE_RELEASE_DEVICE_CLOUD_CONFIGURATION_SPORT_RECORD_DETAIL_ICON_URL = "pre_release_sport_record_icon_url";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String PRE_RELEASE_DEVICE_CLOUD_CONFIGURATION_WATCH_FACE_BG_ICON_URL = "pre_release_watch_face_icon_url";
    public static final /* synthetic */ KProperty<Object>[] a = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DevicePreLaunchRepository.class), "deviceXKVStore", "getDeviceXKVStore()Lcom/huami/devicex/single/DeviceXKVStore;"))};

    @NotNull
    public static final DevicePreLaunchRepository INSTANCE = new DevicePreLaunchRepository();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty deviceXKVStore = Delegates.INSTANCE.notNull();

    private DevicePreLaunchRepository() {
    }

    public static /* synthetic */ boolean getBoolean$default(DevicePreLaunchRepository devicePreLaunchRepository, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return devicePreLaunchRepository.getBoolean(str, z);
    }

    @Nullable
    public final String fetchString(@Nullable String key, @Nullable String str) {
        return getDeviceXKVStore().fetchString(key, str);
    }

    public final boolean getBoolean(@NotNull String key, boolean z) {
        return getDeviceXKVStore().getBoolean(key, z);
    }

    @NotNull
    public final DeviceXKVStore getDeviceXKVStore() {
        return (DeviceXKVStore) deviceXKVStore.getValue(this, a[0]);
    }

    @Nullable
    public final String getPreReleaseDeviceIconUrl() {
        return getDeviceXKVStore().fetchString(PRE_RELEASE_DEVICE_CLOUD_CONFIGURATION_DEVICE_ICON_URL, "");
    }

    @Nullable
    public final String getPreReleaseDeviceName() {
        return getDeviceXKVStore().fetchString(PRE_RELEASE_DEVICE_CLOUD_CONFIGURATION_DEVICE_NAME, "");
    }

    @Nullable
    public final String getPreReleaseOpenSportIconUrl() {
        return getDeviceXKVStore().fetchString(PRE_RELEASE_DEVICE_CLOUD_CONFIGURATION_OPEN_SPORT_ICON_URL, "");
    }

    @Nullable
    public final String getPreReleaseSportDetailIconUrl() {
        return getDeviceXKVStore().fetchString(PRE_RELEASE_DEVICE_CLOUD_CONFIGURATION_SPORT_RECORD_DETAIL_ICON_URL, "");
    }

    @Nullable
    public final String getPreReleaseWatchFaceBgIconUrl() {
        return getDeviceXKVStore().fetchString(PRE_RELEASE_DEVICE_CLOUD_CONFIGURATION_WATCH_FACE_BG_ICON_URL, "");
    }

    public final void putBoolean(@NotNull String key, boolean value) {
        getDeviceXKVStore().putBoolean(key, value);
    }

    public final void putString(@Nullable String key, @Nullable String value) {
        getDeviceXKVStore().putString(key, value);
    }

    public final void savePreReleaseDeviceIconUrl(@Nullable String iconUrl) {
        getDeviceXKVStore().putString(PRE_RELEASE_DEVICE_CLOUD_CONFIGURATION_DEVICE_ICON_URL, iconUrl);
    }

    public final void savePreReleaseDeviceName(@Nullable String deviceName) {
        getDeviceXKVStore().putString(PRE_RELEASE_DEVICE_CLOUD_CONFIGURATION_DEVICE_NAME, deviceName);
    }

    public final void savePreReleaseOpenSportIconUrl(@Nullable String iconUrl) {
        getDeviceXKVStore().putString(PRE_RELEASE_DEVICE_CLOUD_CONFIGURATION_OPEN_SPORT_ICON_URL, iconUrl);
    }

    public final void savePreReleaseSportDetailIconUrl(@Nullable String iconUrl) {
        getDeviceXKVStore().putString(PRE_RELEASE_DEVICE_CLOUD_CONFIGURATION_SPORT_RECORD_DETAIL_ICON_URL, iconUrl);
    }

    public final void savePreReleaseWatchFaceBgIconUrl(@Nullable String iconUrl) {
        getDeviceXKVStore().putString(PRE_RELEASE_DEVICE_CLOUD_CONFIGURATION_WATCH_FACE_BG_ICON_URL, iconUrl);
    }

    public final void setDeviceXKVStore(@NotNull DeviceXKVStore deviceXKVStore2) {
        deviceXKVStore.setValue(this, a[0], deviceXKVStore2);
    }
}
