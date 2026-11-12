package com.huami.ecg.core.web;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.EcgCore;
import com.loc.z;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b'\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002J\u0010\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002J\u0016\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u0002R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0011R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0011R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0011¨\u0006)"}, d2 = {"Lcom/huami/ecg/core/web/EcgWebUtil;", "", "", "userId", "urlEcg", "followeeId", "urlEcgFollowee", "appName", "ecgFileUri", "urlEcgUpload", "urlEcgTag", "urlEcgHelp", "urlEcgAnalysis", "orgId", "urlEcgAnalysisResult", "urlEcgAnalysisOrg", "a", "Ljava/lang/String;", "API_ECG", "b", "API_ECG_FOLLOWEE", "c", "API_ECG_TAG", GoogleApiAvailabilityLight.a, "API_ECG_FILE_URI", "e", "API_ECG_UPLOAD", "f", "URL_ECG_HELP", "g", "URL_ECG_ANALYSIS", "h", "DOCTOR_HOST", "i", "DOCTOR_STAGING_HOST", z.j, "URL_ECG_ANALYSIS_RESULT", hl.k, "URL_ECG_ANALYSIS_ORG", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class EcgWebUtil {
    public static final EcgWebUtil INSTANCE = new EcgWebUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String API_ECG = "/users/%s/ECGHealthData";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String API_ECG_FOLLOWEE = "/users/%s/followee/%s/ECGHealthData";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String API_ECG_TAG = "/users/%s/stateTags/ECG_TAG";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String API_ECG_FILE_URI = "/users/%s/apps/%s/fileUploadURIs";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final String API_ECG_UPLOAD = "/users/%s/ECGHealthData/upload";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final String URL_ECG_HELP = "/t/posts/watch?meta_key=tag&category=%s&meta_value=faq";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final String URL_ECG_ANALYSIS = "/apps/%s/settings";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final String DOCTOR_HOST = "https://api-doctor-cn.huami.com";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final String DOCTOR_STAGING_HOST = "https://api-doctor-staging.huami.com";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final String URL_ECG_ANALYSIS_RESULT = "/saas/user/%s/ecg/%s/analysisResult";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final String URL_ECG_ANALYSIS_ORG = "/health/orgs/types/3";

    private EcgWebUtil() {
    }

    public static /* synthetic */ String urlEcgAnalysis$default(EcgWebUtil ecgWebUtil, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = EcgCore.INSTANCE.getWebSetting().appName();
        }
        return ecgWebUtil.urlEcgAnalysis(str);
    }

    @NotNull
    public final String ecgFileUri(@NotNull String userId, @NotNull String appName) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(API_ECG_FILE_URI, Arrays.copyOf(new Object[]{userId, appName}, 2));
    }

    @NotNull
    public final String urlEcg(@NotNull String userId) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(API_ECG, Arrays.copyOf(new Object[]{userId}, 1));
    }

    @NotNull
    public final String urlEcgAnalysis(@NotNull String appName) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("/apps/%s/settings", Arrays.copyOf(new Object[]{appName}, 1));
    }

    @NotNull
    public final String urlEcgAnalysisOrg() {
        StringBuilder sb = new StringBuilder();
        sb.append(EcgCore.INSTANCE.getWebSetting().isStaging() ? DOCTOR_STAGING_HOST : DOCTOR_HOST);
        sb.append(URL_ECG_ANALYSIS_ORG);
        return sb.toString();
    }

    @NotNull
    public final String urlEcgAnalysisResult(@NotNull String userId, @NotNull String orgId) {
        StringBuilder sb = new StringBuilder();
        sb.append(EcgCore.INSTANCE.getWebSetting().isStaging() ? DOCTOR_STAGING_HOST : DOCTOR_HOST);
        sb.append(String.format(URL_ECG_ANALYSIS_RESULT, Arrays.copyOf(new Object[]{userId, orgId}, 2)));
        return sb.toString();
    }

    @NotNull
    public final String urlEcgFollowee(@NotNull String userId, @NotNull String followeeId) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(API_ECG_FOLLOWEE, Arrays.copyOf(new Object[]{userId, followeeId}, 2));
    }

    @NotNull
    public final String urlEcgHelp() {
        return EcgCore.INSTANCE.getWebSetting().host() + URL_ECG_HELP;
    }

    @NotNull
    public final String urlEcgTag(@NotNull String userId) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(API_ECG_TAG, Arrays.copyOf(new Object[]{userId}, 1));
    }

    @NotNull
    public final String urlEcgUpload(@NotNull String userId) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(API_ECG_UPLOAD, Arrays.copyOf(new Object[]{userId}, 1));
    }
}
