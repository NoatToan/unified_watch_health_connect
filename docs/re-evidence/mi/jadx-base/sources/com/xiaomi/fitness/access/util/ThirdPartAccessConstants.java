package com.xiaomi.fitness.access.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b(\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/access/util/ThirdPartAccessConstants;", "", "<init>", "()V", "AUTHORIZE_URL", "", "CLIENT_ID", "STRAVA_SCHEME", "STRAVA_SCOPE", "STRAVA_REDIRECT_URI", "PARAM_THIRD_PARTY", "DEVICE_DID", "DEVICE_MODLE_NAME", "KEY_CLIENT_ID", "KEY_RESPONSE_TYPE", "KEY_PROMPT", "KEY_REDIRECT_URI", "KEY_ACCESS_TYPE", "KEY_SCOPE", "PARAM_AUTH_CODE", "KEY_GOOGLE_FIT_STATE", "KEY_CODE", "KEY_PATH", "GOOGLE_FIT_SCHEME", "GOOGLE_FIT_STATE", "GOOGLE_FIT_RESPONSE_TYPE", "GOOGLE_FIT_PROMPT", "GOOGLE_FIT_ACCESS_TYPE", "GOOGLE_FIT_AUTHORIZATION_URL", "GOOGLE_FIT_CLIENT_ID", "GOOGLE_FIT_SCOPE", "COMMON_MI_FITNESS_REDIRECT_URI", "STRAVA_EXTRA_KEY_CODE", "THIRD_PARTY_GOOGLE_FIT", "THIRD_PARTY_SUUNTO", "SUUNTO_AUTHORIZATION_URL", "SUUNTO_CLIENT_ID", "SUUNTO_PATH_PARAM", "SUUNTO_REDIRECT_URI", "SUUNTO_PARTNERS_H5_URL", "URL_SUUNTO_PROMOTION_PAGE_BG_1", "URL_SUUNTO_PROMOTION_PAGE_BG_2", "URL_SUUNTO_PROMOTION_PAGE_BG_3", "URL_SUUNTO_PROMOTION_PAGE_BG_4", "URL_SUUNTO_ICON", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThirdPartAccessConstants {

    @NotNull
    public static final String AUTHORIZE_URL = "http://www.strava.com/oauth/authorize";

    @NotNull
    public static final String CLIENT_ID = "55505";

    @NotNull
    public static final String COMMON_MI_FITNESS_REDIRECT_URI = "https://region.hlth.io.mi.com/third-oauth/v3/callback";

    @NotNull
    public static final String DEVICE_DID = "action_device_did";

    @NotNull
    public static final String DEVICE_MODLE_NAME = "action_device_model_name";

    @NotNull
    public static final String GOOGLE_FIT_ACCESS_TYPE = "offline";

    @NotNull
    public static final String GOOGLE_FIT_AUTHORIZATION_URL = "https://accounts.google.com/o/oauth2/v2/auth";

    @NotNull
    public static final String GOOGLE_FIT_CLIENT_ID = "51546947359-dgkobv8sd2hf01rfquq88v9iocjgllir.apps.googleusercontent.com";

    @NotNull
    public static final String GOOGLE_FIT_PROMPT = "consent";

    @NotNull
    public static final String GOOGLE_FIT_RESPONSE_TYPE = "code";

    @NotNull
    public static final String GOOGLE_FIT_SCHEME = "wearable-googlefit";

    @NotNull
    public static final String GOOGLE_FIT_SCOPE = "https://www.googleapis.com/auth/fitness.activity.write https://www.googleapis.com/auth/fitness.heart_rate.write https://www.googleapis.com/auth/fitness.location.write https://www.googleapis.com/auth/fitness.sleep.write https://www.googleapis.com/auth/userinfo.profile";

    @NotNull
    public static final String GOOGLE_FIT_STATE = "/googlefit";

    @NotNull
    public static final ThirdPartAccessConstants INSTANCE = new ThirdPartAccessConstants();

    @NotNull
    public static final String KEY_ACCESS_TYPE = "access_type";

    @NotNull
    public static final String KEY_CLIENT_ID = "client_id";

    @NotNull
    public static final String KEY_CODE = "code";

    @NotNull
    public static final String KEY_GOOGLE_FIT_STATE = "state";

    @NotNull
    public static final String KEY_PATH = "path";

    @NotNull
    public static final String KEY_PROMPT = "prompt";

    @NotNull
    public static final String KEY_REDIRECT_URI = "redirect_uri";

    @NotNull
    public static final String KEY_RESPONSE_TYPE = "response_type";

    @NotNull
    public static final String KEY_SCOPE = "scope";

    @NotNull
    public static final String PARAM_AUTH_CODE = "auth_code";

    @NotNull
    public static final String PARAM_THIRD_PARTY = "third_party";

    @NotNull
    public static final String STRAVA_EXTRA_KEY_CODE = "extra_key_code";

    @NotNull
    public static final String STRAVA_REDIRECT_URI = "wearable-strava://hlththird.io.mi.com";

    @NotNull
    public static final String STRAVA_SCHEME = "wearable-strava";

    @NotNull
    public static final String STRAVA_SCOPE = "read,activity:write,activity:read,profile:write,profile:read_all";

    @NotNull
    public static final String SUUNTO_AUTHORIZATION_URL = "https://cloudapi-oauth.suunto.com/oauth/authorize";

    @NotNull
    public static final String SUUNTO_CLIENT_ID = "1fb10b43-1f0e-4080-8066-37eebd7c4f41";

    @NotNull
    public static final String SUUNTO_PARTNERS_H5_URL = "https://app.suunto.com/partners/";

    @NotNull
    public static final String SUUNTO_PATH_PARAM = "suunto";

    @NotNull
    public static final String SUUNTO_REDIRECT_URI = "https://region.hlth.io.mi.com/third-oauth/v3/callback?path=suunto&state=/applinks/auth";

    @NotNull
    public static final String THIRD_PARTY_GOOGLE_FIT = "google";

    @NotNull
    public static final String THIRD_PARTY_SUUNTO = "suunto";

    @NotNull
    public static final String URL_SUUNTO_ICON = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/suunto/ic_suunto.webp   ";

    @NotNull
    public static final String URL_SUUNTO_PROMOTION_PAGE_BG_1 = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/suunto/trends_pink.webp";

    @NotNull
    public static final String URL_SUUNTO_PROMOTION_PAGE_BG_2 = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/suunto/trends_purple.webp";

    @NotNull
    public static final String URL_SUUNTO_PROMOTION_PAGE_BG_3 = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/suunto/outdoor_maps.webp";

    @NotNull
    public static final String URL_SUUNTO_PROMOTION_PAGE_BG_4 = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/suunto/partners.webp";

    private ThirdPartAccessConstants() {
    }
}
