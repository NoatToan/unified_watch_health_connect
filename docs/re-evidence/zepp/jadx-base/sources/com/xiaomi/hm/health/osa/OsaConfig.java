package com.xiaomi.hm.health.osa;

import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/osa/OsaConfig;", "", "", "isOsaEnable", "enable", "", "setOsaEnable", "", "a", "Ljava/lang/String;", "TAG", "b", "PROPERTY_OSA", "c", "KEY_OSA", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class OsaConfig {

    @NotNull
    public static final OsaConfig INSTANCE = new OsaConfig();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "OsaConfig";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String PROPERTY_OSA = "huami.mifit.user.settings.osa.config";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_OSA = "osa_enable";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "isOsaEnable e: " + this.a;
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
            return "setOsaEnable e: " + this.a;
        }
    }

    private OsaConfig() {
    }

    @JvmStatic
    public static final boolean isOsaEnable() {
        try {
            return new JSONObject(DeviceXFunctionsKt.getPropertyStoreApi().getProperty(PROPERTY_OSA, "")).optBoolean(KEY_OSA);
        } catch (Exception e) {
            HMLog.info(TAG, new a(e));
            return false;
        }
    }

    @JvmStatic
    public static final void setOsaEnable(boolean enable) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(KEY_OSA, enable);
            DeviceXFunctionsKt.getPropertyStoreApi().setProperty(PROPERTY_OSA, jSONObject.toString());
            DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
        } catch (Exception e) {
            HMLog.info(TAG, new b(e));
        }
    }
}
