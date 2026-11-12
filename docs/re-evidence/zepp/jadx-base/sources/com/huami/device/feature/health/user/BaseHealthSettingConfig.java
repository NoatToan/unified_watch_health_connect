package com.huami.device.feature.health.user;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.IDeviceAppApi;
import com.huami.tools.log.HMLog;
import com.loc.z;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \b&\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b=\u0010>J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u00020\u001a8\u0000@\u0000X\u0080D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001d\u0010%\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b\u001b\u0010#R\u001d\u0010&\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b\u0017\u0010#R$\u0010+\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010.\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R$\u00103\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00106\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b4\u0010(\"\u0004\b5\u0010*R$\u00109\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b7\u0010(\"\u0004\b8\u0010*R$\u0010<\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b:\u0010(\"\u0004\b;\u0010*¨\u0006@"}, d2 = {"Lcom/huami/device/feature/health/user/BaseHealthSettingConfig;", "Lcom/huami/device/feature/health/user/HealthSettingConfig;", "", "h", "enable", "", GoogleApiAvailabilityLight.b, "g", "m", "f", "l", "i", "o", "", "b", "value", hl.k, "a", z.j, "Lcom/huami/device/feature/health/device/HealthDevice;", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "Lcom/huami/device/feature/health/device/IDeviceAppApi;", "c", "Lcom/huami/device/feature/health/device/IDeviceAppApi;", "appApi", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getTAG$health_base_release", "()Ljava/lang/String;", "TAG", "Lorg/json/JSONObject;", "e", "Lkotlin/Lazy;", "()Lorg/json/JSONObject;", "mPressureSettingObj", "mOsaSettingObj", "mBloodPressureObj", "getOsaEnable", "()Z", "setOsaEnable", "(Z)V", "osaEnable", "getSmartSpo2Enable", "setSmartSpo2Enable", "smartSpo2Enable", "getLowSpo2AlertValue", "()I", "setLowSpo2AlertValue", "(I)V", "lowSpo2AlertValue", "getPressureEnable", "setPressureEnable", "pressureEnable", "getPressureAlertEnable", "setPressureAlertEnable", "pressureAlertEnable", "getSleepingBloodPressureMonitorEnable", "setSleepingBloodPressureMonitorEnable", "sleepingBloodPressureMonitorEnable", "<init>", "(Lcom/huami/device/feature/health/device/HealthDevice;Lcom/huami/device/feature/health/device/IDeviceAppApi;)V", "Companion", "health-base_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseHealthSettingConfig extends HealthSettingConfig {

    @NotNull
    private static final String h = "huami.mifit.user.settings.stress.config";

    @NotNull
    private static final String i = "huami.mifit.user.settings.osa.config";

    @NotNull
    private static final String j = "huami.mifit.user.settings.bloodpressure.config";

    @NotNull
    private static final String k = "all_day_stress_enable";

    @NotNull
    private static final String l = "stress_relax_alert_enable";

    @NotNull
    private static final String m = "osa_enable";

    @NotNull
    private static final String n = "smart_spo2_enable";

    @NotNull
    private static final String o = "low_spo2_alert";

    @NotNull
    private static final String p = "night_enable";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HealthDevice device;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final IDeviceAppApi appApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String TAG = "HealthSetting";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mPressureSettingObj = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy mOsaSettingObj = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy mBloodPressureObj = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<JSONObject> {

        /* JADX INFO: renamed from: com.huami.device.feature.health.user.BaseHealthSettingConfig$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0367a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0367a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "get property: huami.mifit.user.settings.bloodpressure.config, value: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "parse blood pressure failed, e: " + this.a.getMessage();
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject invoke() {
            JSONObject jSONObject;
            String userProperty = BaseHealthSettingConfig.this.appApi.getUserProperty(BaseHealthSettingConfig.j);
            HMLog.info(BaseHealthSettingConfig.this.getTAG(), new C0367a(userProperty));
            try {
                jSONObject = new JSONObject(userProperty);
            } catch (Exception e) {
                HMLog.error(BaseHealthSettingConfig.this.getTAG(), "", e, new b(e));
                jSONObject = null;
            }
            return jSONObject == null ? new JSONObject() : jSONObject;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<JSONObject> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "get property:huami.mifit.user.settings.osa.config, value:" + this.a;
            }
        }

        /* JADX INFO: renamed from: com.huami.device.feature.health.user.BaseHealthSettingConfig$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0368b extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0368b(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "parse osa setting fail, e: " + this.a.getMessage();
            }
        }

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject invoke() {
            JSONObject jSONObject;
            String userProperty = BaseHealthSettingConfig.this.appApi.getUserProperty(BaseHealthSettingConfig.i);
            HMLog.info(BaseHealthSettingConfig.this.getTAG(), new a(userProperty));
            try {
                jSONObject = new JSONObject(userProperty);
            } catch (Exception e) {
                HMLog.error(BaseHealthSettingConfig.this.getTAG(), "", e, new C0368b(e));
                jSONObject = null;
            }
            return jSONObject == null ? new JSONObject() : jSONObject;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<JSONObject> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "get property:huami.mifit.user.settings.stress.config, value:" + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "parse pressure setting fail, e: " + this.a.getMessage();
            }
        }

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject invoke() {
            JSONObject jSONObject;
            String userProperty = BaseHealthSettingConfig.this.appApi.getUserProperty(BaseHealthSettingConfig.h);
            HMLog.info(BaseHealthSettingConfig.this.getTAG(), new a(userProperty));
            try {
                jSONObject = new JSONObject(userProperty);
            } catch (Exception e) {
                HMLog.error(BaseHealthSettingConfig.this.getTAG(), "", e, new b(e));
                jSONObject = null;
            }
            return jSONObject == null ? new JSONObject() : jSONObject;
        }
    }

    public BaseHealthSettingConfig(@NotNull HealthDevice healthDevice, @NotNull IDeviceAppApi iDeviceAppApi) {
        this.device = healthDevice;
        this.appApi = iDeviceAppApi;
    }

    private final boolean a() {
        return c().optInt(p, 0) == 1;
    }

    private final int b() {
        return d().optInt(o, 0);
    }

    private final JSONObject c() {
        return (JSONObject) this.mBloodPressureObj.getValue();
    }

    private final JSONObject d() {
        return (JSONObject) this.mOsaSettingObj.getValue();
    }

    private final JSONObject e() {
        return (JSONObject) this.mPressureSettingObj.getValue();
    }

    private final boolean f() {
        return d().optBoolean(m, false);
    }

    private final boolean g() {
        return e().optBoolean(l, false);
    }

    private final boolean h() {
        return e().optBoolean(k, false);
    }

    private final boolean i() {
        return d().optBoolean(n, false);
    }

    private final void j(boolean enable) throws JSONException {
        c().put(p, enable ? 1 : 0);
        this.appApi.saveUserProperty(j, c().toString());
        this.appApi.uploadUserProperty(j);
    }

    private final void k(int value) throws JSONException {
        d().put(o, value);
        this.appApi.saveUserProperty(i, d().toString());
        this.appApi.uploadUserProperty(i);
    }

    private final void l(boolean enable) throws JSONException {
        d().put(m, enable);
        this.appApi.saveUserProperty(i, d().toString());
        this.appApi.uploadUserProperty(i);
    }

    private final void m(boolean enable) throws JSONException {
        e().put(l, enable);
        this.appApi.saveUserProperty(h, e().toString());
        this.appApi.uploadUserProperty(h);
    }

    private final void n(boolean enable) throws JSONException {
        e().put(k, enable);
        this.appApi.saveUserProperty(h, e().toString());
        this.appApi.uploadUserProperty(h);
    }

    private final void o(boolean enable) throws JSONException {
        d().put(n, enable);
        this.appApi.saveUserProperty(i, d().toString());
        this.appApi.uploadUserProperty(i);
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public int getLowSpo2AlertValue() {
        return b();
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public boolean getOsaEnable() {
        return f();
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public boolean getPressureAlertEnable() {
        return g();
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public boolean getPressureEnable() {
        return h();
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public boolean getSleepingBloodPressureMonitorEnable() {
        return a();
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public boolean getSmartSpo2Enable() {
        return i();
    }

    @NotNull
    /* JADX INFO: renamed from: getTAG$health_base_release, reason: from getter */
    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setLowSpo2AlertValue(int i2) throws JSONException {
        k(i2);
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setOsaEnable(boolean z) throws JSONException {
        l(z);
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setPressureAlertEnable(boolean z) throws JSONException {
        m(z);
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setPressureEnable(boolean z) throws JSONException {
        n(z);
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setSleepingBloodPressureMonitorEnable(boolean z) throws JSONException {
        j(z);
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setSmartSpo2Enable(boolean z) throws JSONException {
        o(z);
    }
}
