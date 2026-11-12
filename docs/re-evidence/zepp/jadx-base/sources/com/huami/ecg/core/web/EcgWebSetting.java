package com.huami.ecg.core.web;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.EcgCore;
import com.huami.ecg.core.util.AppUtil;
import com.loc.z;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0007H&J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tH\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tH\u0016¨\u0006\r"}, d2 = {"Lcom/huami/ecg/core/web/EcgWebSetting;", "", "", "host", "userId", "userToken", "appName", "", "isStaging", "", "getSystemHeader", "getSystemParam", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public interface EcgWebSetting {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004¨\u0006 "}, d2 = {"Lcom/huami/ecg/core/web/EcgWebSetting$Companion;", "", "", "a", "Ljava/lang/String;", "ANDROID_PHONE", "b", "APP_VERSION", "c", "CONSTANT_APPNAME", GoogleApiAvailabilityLight.a, "CONSTANT_APPTOKEN", "e", "CONSTANT_CALLID", "f", "CONSTANT_COUNTRY", "g", "CONSTANT_TIMEZONE", "h", "CONSTANT_LANG", "i", "CONSTANT_CHANNEL", z.j, "CONSTANT_APPPLATFORM", hl.k, "CONSTANT_CV", "l", "CONSTANT_V", "m", "CONSTANT_USER_ID", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private static final String ANDROID_PHONE = "android_phone";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final String APP_VERSION = "1.0";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final String CONSTANT_APPNAME = "appname";

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private static final String CONSTANT_APPTOKEN = "apptoken";

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private static final String CONSTANT_CALLID = "callid";

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private static final String CONSTANT_COUNTRY = "country";

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private static final String CONSTANT_TIMEZONE = "timezone";

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private static final String CONSTANT_LANG = "lang";

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private static final String CONSTANT_CHANNEL = "channel";

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private static final String CONSTANT_APPPLATFORM = "appplatform";

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private static final String CONSTANT_CV = "cv";

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private static final String CONSTANT_V = "v";

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private static final String CONSTANT_USER_ID = "userid";
        public static final /* synthetic */ Companion n = new Companion();

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
    public static final class DefaultImpls {
        @NotNull
        public static Map<String, String> getSystemHeader(EcgWebSetting ecgWebSetting) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("callid", String.valueOf(System.currentTimeMillis()));
            linkedHashMap.put("apptoken", ecgWebSetting.userToken());
            linkedHashMap.put("appname", ecgWebSetting.appName());
            return linkedHashMap;
        }

        @NotNull
        public static Map<String, String> getSystemParam(EcgWebSetting ecgWebSetting) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AppUtil appUtil = AppUtil.INSTANCE;
            EcgCore ecgCore = EcgCore.INSTANCE;
            linkedHashMap.put("channel", appUtil.getMetaDataChannel(ecgCore.getContext()));
            linkedHashMap.put("appplatform", "android_phone");
            linkedHashMap.put("cv", appUtil.getVersionCode(ecgCore.getContext()) + '_' + appUtil.getVersionName(ecgCore.getContext()));
            linkedHashMap.put("v", "1.0");
            return linkedHashMap;
        }
    }

    @NotNull
    String appName();

    @NotNull
    Map<String, String> getSystemHeader();

    @NotNull
    Map<String, String> getSystemParam();

    @NotNull
    String host();

    boolean isStaging();

    @NotNull
    String userId();

    @NotNull
    String userToken();
}
