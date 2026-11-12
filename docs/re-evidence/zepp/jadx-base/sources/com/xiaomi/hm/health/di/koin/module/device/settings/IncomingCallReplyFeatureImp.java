package com.xiaomi.hm.health.di.koin.module.device.settings;

import android.content.Context;
import com.huami.phone_call.sms.PhoneCallSmsReplyFeature;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R\u001d\u0010\u000e\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/module/device/settings/IncomingCallReplyFeatureImp;", "Lcom/huami/phone_call/sms/PhoneCallSmsReplyFeature;", "Landroid/content/Context;", "getContext", "", "isFeatureEnable", "isEnable", "enable", "", "saveEnable", "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "a", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "<init>", "()V", "b", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class IncomingCallReplyFeatureImp implements PhoneCallSmsReplyFeature {

    @NotNull
    private static final a b = new a(null);

    @Deprecated
    @NotNull
    private static final String c = "IncomingCallReplyFeatureImp";

    @Deprecated
    @NotNull
    private static final String d = "huami.mifit.user.settings.sms.reply";

    @Deprecated
    @NotNull
    private static final String e = "incomingCallReply";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceCenter = KoinJavaComponent.inject$default(DeviceCenter.class, null, null, 6, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"com/xiaomi/hm/health/di/koin/module/device/settings/IncomingCallReplyFeatureImp$a", "", "", "PROPERTY", "Ljava/lang/String;", "PROPERTY_KEY_INCOMING_CALL_REPLY", "TAG", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Parse huami.mifit.user.settings.sms.reply failed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Parse huami.mifit.user.settings.sms.reply failed: " + this.a;
        }
    }

    private final DeviceCenter a() {
        return (DeviceCenter) this.deviceCenter.getValue();
    }

    @Override // com.huami.phone_call.sms.PhoneCallSmsReplyFeature
    @NotNull
    public Context getContext() {
        return BraceletApp.getContext();
    }

    @Override // com.huami.phone_call.sms.PhoneCallSmsReplyFeature
    public boolean isEnable() {
        String property = HMPropertyUtil.getProperty(d, "");
        if (property == null || property.length() == 0) {
            return true;
        }
        try {
            return new JSONObject(property).optBoolean(e, true);
        } catch (Exception e2) {
            HMLog.warn(c, e2, new b(property));
            return true;
        }
    }

    @Override // com.huami.phone_call.sms.PhoneCallSmsReplyFeature
    public boolean isFeatureEnable() {
        DeviceInfo deviceInfo;
        Feature deviceFeature;
        HMBaseDevice device = a().getDevice();
        if (device == null || (deviceInfo = device.getDeviceInfo()) == null || (deviceFeature = deviceInfo.getDeviceFeature()) == null) {
            return false;
        }
        return deviceFeature.hasSw(26);
    }

    @Override // com.huami.phone_call.sms.PhoneCallSmsReplyFeature
    public void saveEnable(boolean enable) throws JSONException {
        JSONObject jSONObject;
        String property = HMPropertyUtil.getProperty(d, "");
        if (property == null || property.length() == 0) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(property);
            } catch (Exception e2) {
                HMLog.warn(c, e2, new c(property));
                jSONObject = new JSONObject();
            }
        }
        jSONObject.put(e, enable);
        HMPropertyUtil.setProperty(d, jSONObject.toString());
        HMPropertyUtil.postPropertisToServer(true);
    }
}
