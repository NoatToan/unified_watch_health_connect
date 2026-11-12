package com.huami.nfc.web;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0012\u001a\u0016\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000\"\u0016\u0010\u0004\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005\"\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005\"\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005\"\u0016\u0010\t\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0005\"\u0016\u0010\n\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0005\"\u0016\u0010\u000b\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005\"\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005\"\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005\"\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005\"\u001d\u0010\u0013\u001a\u00020\u00028@@\u0000X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/huami/nfc/web/PayHeader;", "", "", "toMap", "HEADER_CPLC", "Ljava/lang/String;", "HEADER_MODEL", "HEADER_XIAO_MI_USER_ID", "HEADER_XIAO_MI_TOKEN", "HEADER_IMEI", "HEADER_ROM_VERSION", "HEADER_OS_VERSION", "WEB_API_BASE_URL", "WEB_API_BASE_URL_STAGING", "WEB_API_BASE_URL_STAGING_NFC", "a", "Lkotlin/Lazy;", "getANDROID_VERSION", "()Ljava/lang/String;", "ANDROID_VERSION", "web_release"}, k = 2, mv = {1, 5, 1})
public final class PayHeaderKt {

    @NotNull
    public static final String HEADER_CPLC = "x-snbps-cplc";

    @NotNull
    public static final String HEADER_IMEI = "x-snbps-imei";

    @NotNull
    public static final String HEADER_MODEL = "x-snbps-module";

    @NotNull
    public static final String HEADER_OS_VERSION = "x-snbps-os-version";

    @NotNull
    public static final String HEADER_ROM_VERSION = "x-snbps-rom-version";

    @NotNull
    public static final String HEADER_XIAO_MI_TOKEN = "x-snbps-token";

    @NotNull
    public static final String HEADER_XIAO_MI_USER_ID = "x-snbps-userid";

    @NotNull
    public static final String WEB_API_BASE_URL = "https://api-mifit-cn.huami.com/";

    @NotNull
    public static final String WEB_API_BASE_URL_STAGING = "https://api-mifit-staging.huami.com/";

    @NotNull
    public static final String WEB_API_BASE_URL_STAGING_NFC = "http://mifit-device-service-staging-nfc.mi-ae.net/";

    @NotNull
    private static final Lazy a = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return String.valueOf(Build.VERSION.SDK_INT);
        }
    }

    @NotNull
    public static final String getANDROID_VERSION() {
        return (String) a.getValue();
    }

    @NotNull
    public static final Map<String, String> toMap(@NotNull PayHeader payHeader) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(HEADER_CPLC, payHeader.getCplc());
        linkedHashMap.put(HEADER_MODEL, payHeader.getModel());
        linkedHashMap.put(HEADER_IMEI, payHeader.getImei());
        linkedHashMap.put(HEADER_ROM_VERSION, payHeader.getRomVersion());
        linkedHashMap.put(HEADER_OS_VERSION, payHeader.getOsVersion());
        return linkedHashMap;
    }
}
