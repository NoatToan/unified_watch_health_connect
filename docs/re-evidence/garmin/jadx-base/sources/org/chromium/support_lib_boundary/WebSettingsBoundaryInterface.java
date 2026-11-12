package org.chromium.support_lib_boundary;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface WebSettingsBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface AttributionBehavior {
        public static final int APP_SOURCE_AND_APP_TRIGGER = 3;
        public static final int APP_SOURCE_AND_WEB_TRIGGER = 1;
        public static final int DISABLED = 0;
        public static final int WEB_SOURCE_AND_WEB_TRIGGER = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDarkBehavior {
        public static final int FORCE_DARK_ONLY = 0;
        public static final int MEDIA_QUERY_ONLY = 1;
        public static final int PREFER_MEDIA_QUERY_OVER_FORCE_DARK = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface HyperlinkContextMenuItems {
        public static final int COPY_LINK_ADDRESS = 1;
        public static final int COPY_LINK_TEXT = 2;
        public static final int DISABLED = 0;
        public static final int OPEN_LINK = 4;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SpeculativeLoadingStatus {
        public static final int DISABLED = 0;
        public static final int PRERENDER_ENABLED = 1;
    }

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface WebViewMediaIntegrityApiStatus {
        public static final int DISABLED = 0;
        public static final int ENABLED = 2;
        public static final int ENABLED_WITHOUT_APP_IDENTITY = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface WebauthnSupport {
        public static final int APP = 1;
        public static final int BROWSER = 2;
        public static final int NONE = 0;
    }

    int getAttributionBehavior();

    boolean getBackForwardCacheEnabled();

    InvocationHandler getBackForwardCacheSettings();

    int getDisabledActionModeMenuItems();

    boolean getEnterpriseAuthenticationAppLinkPolicyEnabled();

    int getForceDark();

    int getForceDarkBehavior();

    boolean getHasEnrolledInstrumentEnabled();

    boolean getIncludeCookiesOnIntercept();

    boolean getOffscreenPreRaster();

    boolean getPaymentRequestEnabled();

    boolean getSafeBrowsingEnabled();

    int getSpeculativeLoadingStatus();

    Map<String, Object> getUserAgentMetadataMap();

    int getWebViewMediaIntegrityApiDefaultStatus();

    Map<String, Integer> getWebViewMediaIntegrityApiOverrideRules();

    int getWebauthnSupport();

    boolean getWillSuppressErrorPage();

    boolean isAlgorithmicDarkeningAllowed();

    void setAlgorithmicDarkeningAllowed(boolean z14);

    void setAttributionBehavior(int i14);

    void setBackForwardCacheEnabled(boolean z14);

    void setBackForwardCacheSettings(InvocationHandler invocationHandler);

    void setDisabledActionModeMenuItems(int i14);

    void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z14);

    void setForceDark(int i14);

    void setForceDarkBehavior(int i14);

    void setHasEnrolledInstrumentEnabled(boolean z14);

    void setHyperlinkContextMenuItems(int i14);

    void setIncludeCookiesOnIntercept(boolean z14);

    void setOffscreenPreRaster(boolean z14);

    void setPaymentRequestEnabled(boolean z14);

    void setSafeBrowsingEnabled(boolean z14);

    void setSpeculativeLoadingStatus(int i14);

    void setUserAgentMetadataFromMap(Map<String, Object> map);

    void setWebViewMediaIntegrityApiStatus(int i14, Map<String, Integer> map);

    void setWebauthnSupport(int i14);

    void setWillSuppressErrorPage(boolean z14);
}
