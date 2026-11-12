package com.facebook.internal;

import android.net.Uri;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 S2\u00020\u0001:\u0002STBÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u001e\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u001d0\u001d\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020'\u0012\u0006\u0010/\u001a\u00020\u0006\u0012\u0006\u00102\u001a\u00020\u0006\u0012\u0006\u00105\u001a\u00020\u0002\u0012\u0006\u00108\u001a\u00020\u0002\u0012\b\u0010>\u001a\u0004\u0018\u000109\u0012\u0006\u0010A\u001a\u00020\u0006\u0012\u0006\u0010D\u001a\u00020\u0002\u0012\u0006\u0010G\u001a\u00020\u0002\u0012\b\u0010J\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010M\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010P\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bQ\u0010RJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0015\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR1\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u001d0\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010&\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u0005\u001a\u0004\b%\u0010\u000eR\u0019\u0010,\u001a\u00020'8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010/\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010\b\u001a\u0004\b.\u0010\nR\u0019\u00102\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010\b\u001a\u0004\b1\u0010\nR\u0019\u00105\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010\u0005\u001a\u0004\b4\u0010\u000eR\u0019\u00108\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010\u0005\u001a\u0004\b7\u0010\u000eR\u001b\u0010>\u001a\u0004\u0018\u0001098\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010A\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010\b\u001a\u0004\b@\u0010\nR\u0019\u0010D\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010\u0005\u001a\u0004\bC\u0010\u000eR\u0019\u0010G\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bE\u0010\u0005\u001a\u0004\bF\u0010\u000eR\u001b\u0010J\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\bH\u0010\b\u001a\u0004\bI\u0010\nR\u001b\u0010M\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\bK\u0010\b\u001a\u0004\bL\u0010\nR\u001b\u0010P\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\bN\u0010\b\u001a\u0004\bO\u0010\n¨\u0006U"}, d2 = {"Lcom/facebook/internal/FetchedAppSettings;", "", "", "supportsImplicitLogging", "a", "Z", "", "b", "Ljava/lang/String;", "getNuxContent", "()Ljava/lang/String;", "nuxContent", "c", "getNuxEnabled", "()Z", "nuxEnabled", "", GoogleApiAvailabilityLight.a, LogUtil.I, "getSessionTimeoutInSeconds", "()I", "sessionTimeoutInSeconds", "Ljava/util/EnumSet;", "Lcom/facebook/internal/SmartLoginOption;", "e", "Ljava/util/EnumSet;", "getSmartLoginOptions", "()Ljava/util/EnumSet;", "smartLoginOptions", "", "Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "f", "Ljava/util/Map;", "getDialogConfigurations", "()Ljava/util/Map;", "dialogConfigurations", "g", "getAutomaticLoggingEnabled", "automaticLoggingEnabled", "Lcom/facebook/internal/FacebookRequestErrorClassification;", "h", "Lcom/facebook/internal/FacebookRequestErrorClassification;", "getErrorClassification", "()Lcom/facebook/internal/FacebookRequestErrorClassification;", "errorClassification", "i", "getSmartLoginBookmarkIconURL", "smartLoginBookmarkIconURL", z.j, "getSmartLoginMenuIconURL", "smartLoginMenuIconURL", hl.k, "getIAPAutomaticLoggingEnabled", "iAPAutomaticLoggingEnabled", "l", "getCodelessEventsEnabled", "codelessEventsEnabled", "Lorg/json/JSONArray;", "m", "Lorg/json/JSONArray;", "getEventBindings", "()Lorg/json/JSONArray;", "eventBindings", GoogleApiAvailabilityLight.b, "getSdkUpdateMessage", "sdkUpdateMessage", "o", "getTrackUninstallEnabled", "trackUninstallEnabled", b.r, "getMonitorViaDialogEnabled", "monitorViaDialogEnabled", DTransferConstants.SEARCH_KEY, "getRawAamRules", "rawAamRules", "r", "getSuggestedEventsSetting", "suggestedEventsSetting", SOAP.XMLNS, "getRestrictiveDataSetting", "restrictiveDataSetting", "<init>", "(ZLjava/lang/String;ZILjava/util/EnumSet;Ljava/util/Map;ZLcom/facebook/internal/FacebookRequestErrorClassification;Ljava/lang/String;Ljava/lang/String;ZZLorg/json/JSONArray;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "DialogFeatureConfig", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FetchedAppSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean supportsImplicitLogging;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String nuxContent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean nuxEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int sessionTimeoutInSeconds;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final EnumSet<SmartLoginOption> smartLoginOptions;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Map<String, DialogFeatureConfig>> dialogConfigurations;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean automaticLoggingEnabled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final FacebookRequestErrorClassification errorClassification;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final String smartLoginBookmarkIconURL;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final String smartLoginMenuIconURL;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean iAPAutomaticLoggingEnabled;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean codelessEventsEnabled;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private final JSONArray eventBindings;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final String sdkUpdateMessage;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean trackUninstallEnabled;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final boolean monitorViaDialogEnabled;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private final String rawAamRules;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    private final String suggestedEventsSetting;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    private final String restrictiveDataSetting;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¨\u0006\n"}, d2 = {"Lcom/facebook/internal/FetchedAppSettings$Companion;", "", "", "applicationId", "actionName", "featureName", "Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "getDialogFeatureConfig", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @Nullable
        public final DialogFeatureConfig getDialogFeatureConfig(@NotNull String applicationId, @NotNull String actionName, @NotNull String featureName) {
            FetchedAppSettings appSettingsWithoutQuery;
            Map<String, DialogFeatureConfig> map;
            if (Utility.isNullOrEmpty(actionName) || Utility.isNullOrEmpty(featureName) || (appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(applicationId)) == null || (map = appSettingsWithoutQuery.getDialogConfigurations().get(actionName)) == null) {
                return null;
            }
            return map.get(featureName);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B-\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "", "", "a", "Ljava/lang/String;", "getDialogName", "()Ljava/lang/String;", "dialogName", "b", "getFeatureName", "featureName", "Landroid/net/Uri;", "c", "Landroid/net/Uri;", "getFallbackUrl", "()Landroid/net/Uri;", "fallbackUrl", "", GoogleApiAvailabilityLight.a, "[I", "getVersionSpec", "()[I", "versionSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;[I)V", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class DialogFeatureConfig {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final String e = "|";
        private static final String f = "name";
        private static final String g = "versions";
        private static final String h = "url";

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String dialogName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String featureName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private final Uri fallbackUrl;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        private final int[] versionSpec;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000e\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig$Companion;", "", "Lorg/json/JSONArray;", "versionsJSON", "", "a", "Lorg/json/JSONObject;", "dialogConfigJSON", "Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "parseDialogConfig", "", "DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR", "Ljava/lang/String;", "DIALOG_CONFIG_NAME_KEY", "DIALOG_CONFIG_URL_KEY", "DIALOG_CONFIG_VERSIONS_KEY", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            private Companion() {
            }

            private final int[] a(JSONArray versionsJSON) {
                if (versionsJSON == null) {
                    return null;
                }
                int length = versionsJSON.length();
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    int i2 = -1;
                    int iOptInt = versionsJSON.optInt(i, -1);
                    if (iOptInt == -1) {
                        String strOptString = versionsJSON.optString(i);
                        if (!Utility.isNullOrEmpty(strOptString)) {
                            try {
                                i2 = Integer.parseInt(strOptString);
                            } catch (NumberFormatException e) {
                                Utility.logd(Utility.LOG_TAG, e);
                            }
                            iOptInt = i2;
                        }
                    }
                    iArr[i] = iOptInt;
                }
                return iArr;
            }

            @Nullable
            public final DialogFeatureConfig parseDialogConfig(@NotNull JSONObject dialogConfigJSON) {
                String strOptString = dialogConfigJSON.optString("name");
                if (Utility.isNullOrEmpty(strOptString)) {
                    return null;
                }
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) strOptString, new String[]{"|"}, false, 0, 6, (Object) null);
                if (listSplit$default.size() != 2) {
                    return null;
                }
                String str = (String) CollectionsKt.first(listSplit$default);
                String str2 = (String) CollectionsKt.last(listSplit$default);
                if (Utility.isNullOrEmpty(str) || Utility.isNullOrEmpty(str2)) {
                    return null;
                }
                String strOptString2 = dialogConfigJSON.optString("url");
                return new DialogFeatureConfig(str, str2, Utility.isNullOrEmpty(strOptString2) ? null : Uri.parse(strOptString2), a(dialogConfigJSON.optJSONArray(DialogFeatureConfig.g)), null);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ DialogFeatureConfig(String str, String str2, Uri uri, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, uri, iArr);
        }

        @NotNull
        public final String getDialogName() {
            return this.dialogName;
        }

        @Nullable
        public final Uri getFallbackUrl() {
            return this.fallbackUrl;
        }

        @NotNull
        public final String getFeatureName() {
            return this.featureName;
        }

        @Nullable
        public final int[] getVersionSpec() {
            return this.versionSpec;
        }

        private DialogFeatureConfig(String str, String str2, Uri uri, int[] iArr) {
            this.dialogName = str;
            this.featureName = str2;
            this.fallbackUrl = uri;
            this.versionSpec = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FetchedAppSettings(boolean z, @NotNull String str, boolean z2, int i, @NotNull EnumSet<SmartLoginOption> enumSet, @NotNull Map<String, ? extends Map<String, DialogFeatureConfig>> map, boolean z3, @NotNull FacebookRequestErrorClassification facebookRequestErrorClassification, @NotNull String str2, @NotNull String str3, boolean z4, boolean z5, @Nullable JSONArray jSONArray, @NotNull String str4, boolean z6, boolean z7, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.supportsImplicitLogging = z;
        this.nuxContent = str;
        this.nuxEnabled = z2;
        this.sessionTimeoutInSeconds = i;
        this.smartLoginOptions = enumSet;
        this.dialogConfigurations = map;
        this.automaticLoggingEnabled = z3;
        this.errorClassification = facebookRequestErrorClassification;
        this.smartLoginBookmarkIconURL = str2;
        this.smartLoginMenuIconURL = str3;
        this.iAPAutomaticLoggingEnabled = z4;
        this.codelessEventsEnabled = z5;
        this.eventBindings = jSONArray;
        this.sdkUpdateMessage = str4;
        this.trackUninstallEnabled = z6;
        this.monitorViaDialogEnabled = z7;
        this.rawAamRules = str5;
        this.suggestedEventsSetting = str6;
        this.restrictiveDataSetting = str7;
    }

    @JvmStatic
    @Nullable
    public static final DialogFeatureConfig getDialogFeatureConfig(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return INSTANCE.getDialogFeatureConfig(str, str2, str3);
    }

    public final boolean getAutomaticLoggingEnabled() {
        return this.automaticLoggingEnabled;
    }

    public final boolean getCodelessEventsEnabled() {
        return this.codelessEventsEnabled;
    }

    @NotNull
    public final Map<String, Map<String, DialogFeatureConfig>> getDialogConfigurations() {
        return this.dialogConfigurations;
    }

    @NotNull
    public final FacebookRequestErrorClassification getErrorClassification() {
        return this.errorClassification;
    }

    @Nullable
    public final JSONArray getEventBindings() {
        return this.eventBindings;
    }

    public final boolean getIAPAutomaticLoggingEnabled() {
        return this.iAPAutomaticLoggingEnabled;
    }

    public final boolean getMonitorViaDialogEnabled() {
        return this.monitorViaDialogEnabled;
    }

    @NotNull
    public final String getNuxContent() {
        return this.nuxContent;
    }

    public final boolean getNuxEnabled() {
        return this.nuxEnabled;
    }

    @Nullable
    public final String getRawAamRules() {
        return this.rawAamRules;
    }

    @Nullable
    public final String getRestrictiveDataSetting() {
        return this.restrictiveDataSetting;
    }

    @NotNull
    public final String getSdkUpdateMessage() {
        return this.sdkUpdateMessage;
    }

    public final int getSessionTimeoutInSeconds() {
        return this.sessionTimeoutInSeconds;
    }

    @NotNull
    public final String getSmartLoginBookmarkIconURL() {
        return this.smartLoginBookmarkIconURL;
    }

    @NotNull
    public final String getSmartLoginMenuIconURL() {
        return this.smartLoginMenuIconURL;
    }

    @NotNull
    public final EnumSet<SmartLoginOption> getSmartLoginOptions() {
        return this.smartLoginOptions;
    }

    @Nullable
    public final String getSuggestedEventsSetting() {
        return this.suggestedEventsSetting;
    }

    public final boolean getTrackUninstallEnabled() {
        return this.trackUninstallEnabled;
    }

    /* JADX INFO: renamed from: supportsImplicitLogging, reason: from getter */
    public final boolean getSupportsImplicitLogging() {
        return this.supportsImplicitLogging;
    }
}
