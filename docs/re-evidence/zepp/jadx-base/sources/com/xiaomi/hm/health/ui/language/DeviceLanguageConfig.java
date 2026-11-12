package com.xiaomi.hm.health.ui.language;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.account.UserLegalInfoManager;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.service.entity.remote.PushResult;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/ui/language/DeviceLanguageConfig;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "getCurrentDeviceLanguage", "deviceSource", "Lcom/xiaomi/hm/health/ui/language/DeviceLanguage;", "getDeviceLanguage", "Lcom/xiaomi/hm/health/bt/model/HMLanguage;", UserLegalInfoManager.KEY_LANGUAGE, "", "saveDeviceLanguageProperty", "", "a", "Ljava/lang/String;", "TAG", "PROPERTY_DEVICE_LANGUAGE", "IS_FOLLOW_SYSTEM_CODE", LogUtil.I, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceLanguageConfig {

    @NotNull
    public static final DeviceLanguageConfig INSTANCE = new DeviceLanguageConfig();
    public static final int IS_FOLLOW_SYSTEM_CODE = -1;

    @NotNull
    public static final String PROPERTY_DEVICE_LANGUAGE = "com.huami.amazfit.device.language";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "DeviceLanguageConfig";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/userproperty/service/entity/remote/PushResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<PushResult, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.language.DeviceLanguageConfig$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C1024a extends Lambda implements Function0<String> {
            public final /* synthetic */ PushResult a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1024a(PushResult pushResult) {
                super(0);
                this.a = pushResult;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return this.a.toString();
            }
        }

        public a() {
            super(1);
        }

        public final void a(@NotNull PushResult pushResult) {
            HMLog.info(DeviceLanguageConfig.TAG, new C1024a(pushResult));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PushResult pushResult) {
            a(pushResult);
            return Unit.INSTANCE;
        }
    }

    private DeviceLanguageConfig() {
    }

    public final int getCurrentDeviceLanguage(@NotNull HMDeviceSource source) {
        DeviceLanguage deviceLanguage = getDeviceLanguage(source.getValue());
        if (deviceLanguage == null) {
            return 0;
        }
        return deviceLanguage.getDeviceLanguage();
    }

    @Nullable
    public final DeviceLanguage getDeviceLanguage(int deviceSource) {
        HashMap<String, DeviceLanguage> map = DeviceLanguageProperty.INSTANCE.getDeviceLanguage().get();
        if (map == null) {
            return null;
        }
        return map.get(String.valueOf(deviceSource));
    }

    public final void saveDeviceLanguageProperty(@Nullable HMLanguage language, @NotNull HMDeviceSource source) {
        if (source == HMDeviceSource.VDEVICE || language == null) {
            return;
        }
        DeviceLanguageProperty deviceLanguageProperty = DeviceLanguageProperty.INSTANCE;
        HashMap<String, DeviceLanguage> map = deviceLanguageProperty.getDeviceLanguage().get();
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(String.valueOf(source.getValue()), new DeviceLanguage(language.getLanguage(), language.getLanguage() == -1));
        deviceLanguageProperty.getDeviceLanguage().set(map);
        deviceLanguageProperty.getDeviceLanguage().push().get(a.a);
    }
}
