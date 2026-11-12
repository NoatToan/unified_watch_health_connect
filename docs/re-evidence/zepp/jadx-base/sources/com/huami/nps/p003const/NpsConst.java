package com.huami.nps.p003const;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import kotlin.Metadata;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\t\b\u0002¢\u0006\u0004\b\t\u0010\nR!\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/huami/nps/const/NpsConst;", "", "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "<init>", "()V", "ParamKey", "ParamValue", MAPCookie.KEY_PATH, "nps_release"}, k = 1, mv = {1, 5, 1})
public final class NpsConst {

    @NotNull
    public static final NpsConst INSTANCE = new NpsConst();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = NpsConst.class.getSimpleName();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/huami/nps/const/NpsConst$ParamKey;", "", "", "NPS_TYPE", "Ljava/lang/String;", "SERVEY_ID", "APP_CONFIG", "<init>", "()V", "nps_release"}, k = 1, mv = {1, 5, 1})
    public static final class ParamKey {

        @NotNull
        public static final String APP_CONFIG = "config";

        @NotNull
        public static final ParamKey INSTANCE = new ParamKey();

        @NotNull
        public static final String NPS_TYPE = "type";

        @NotNull
        public static final String SERVEY_ID = "servey_id";

        private ParamKey() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/huami/nps/const/NpsConst$ParamValue;", "", "", "SOCIAL_ZEPP", "Ljava/lang/String;", "SOCIAL_AMAZFIT", "DIAL_TYPE_VALUE", "SLEEP_TYPE_VALUE", "POST_TYPE", HTTP.SID, "<init>", "()V", "nps_release"}, k = 1, mv = {1, 5, 1})
    public static final class ParamValue {

        @NotNull
        public static final String DIAL_TYPE_VALUE = "watch_nps_model";

        @NotNull
        public static final ParamValue INSTANCE = new ParamValue();

        @NotNull
        public static final String POST_TYPE = "application/json; charset=utf-8";

        @NotNull
        public static final String SID = "sid";

        @NotNull
        public static final String SLEEP_TYPE_VALUE = "sleep_nps_model";

        @NotNull
        public static final String SOCIAL_AMAZFIT = "amazfit";

        @NotNull
        public static final String SOCIAL_ZEPP = "watch";

        private ParamValue() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/huami/nps/const/NpsConst$Path;", "", "", "a", "Ljava/lang/String;", "getDISCOVERY_BASE_URL", "()Ljava/lang/String;", "DISCOVERY_BASE_URL", "REPORT_RATING_URL", "<init>", "()V", "nps_release"}, k = 1, mv = {1, 5, 1})
    public static final class Path {

        @NotNull
        public static final String REPORT_RATING_URL = "survey/result/{servey_id}";

        @NotNull
        public static final Path INSTANCE = new Path();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private static final String DISCOVERY_BASE_URL = "discovery/{config}/cards/{type}";

        private Path() {
        }

        @NotNull
        public final String getDISCOVERY_BASE_URL() {
            return DISCOVERY_BASE_URL;
        }
    }

    private NpsConst() {
    }

    public final String getTAG() {
        return TAG;
    }
}
