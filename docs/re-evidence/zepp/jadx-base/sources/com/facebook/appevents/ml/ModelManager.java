package com.facebook.appevents.ml;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.tekartik.sqflite.Constant;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.collections.e;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002CDB\t\b\u0002¢\u0006\u0004\bA\u0010BJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J;\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0017H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010!J'\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010!R$\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020$0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0016\u0010(\u001a\u00020\u00198\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u0016\u0010)\u001a\u00020\u00198\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010'R\u0016\u0010+\u001a\u00020\u00198\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010'R\u0016\u0010,\u001a\u00020\u00198\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0016\u0010-\u001a\u00020\u00198\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010'R\u0016\u0010.\u001a\u00020\u00198\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010'R\u0016\u0010/\u001a\u00020\u00198\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010'R\u0016\u00100\u001a\u00020\u00198\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010'R\u0016\u00102\u001a\u00020\u00198\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010'R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020\u00198\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u0010'R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0019098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0019098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;R\u0016\u0010@\u001a\u00020\u00068B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010?¨\u0006E"}, d2 = {"Lcom/facebook/appevents/ml/ModelManager;", "", "", "enable", "", "timestamp", "", "e", "Lorg/json/JSONObject;", ModelManager.CACHE_KEY_MODELS, "a", "jsonObject", "g", "c", "b", "Lorg/json/JSONArray;", "jsonArray", "", "f", "Lcom/facebook/appevents/ml/ModelManager$Task;", "task", "Ljava/io/File;", "getRuleFile", "", "denses", "", "texts", "predict", "(Lcom/facebook/appevents/ml/ModelManager$Task;[[F[Ljava/lang/String;)[Ljava/lang/String;", "Lcom/facebook/appevents/ml/MTensor;", "res", ModelManager.THRESHOLD_KEY, "i", "(Lcom/facebook/appevents/ml/MTensor;[F)[Ljava/lang/String;", "h", "", "Lcom/facebook/appevents/ml/ModelManager$TaskHandler;", "Ljava/util/Map;", "taskHandlers", "Ljava/lang/String;", "SDK_MODEL_ASSET", "MODEL_ASSERT_STORE", GoogleApiAvailabilityLight.a, "CACHE_KEY_MODELS", "MTML_USE_CASE", "USE_CASE_KEY", "VERSION_ID_KEY", "ASSET_URI_KEY", "RULES_URI_KEY", z.j, "THRESHOLD_KEY", "", hl.k, LogUtil.I, "MODEL_REQUEST_INTERVAL_MILLISECONDS", "l", "CACHE_KEY_REQUEST_TIMESTAMP", "", "m", "Ljava/util/List;", "MTML_SUGGESTED_EVENTS_PREDICTION", GoogleApiAvailabilityLight.b, "MTML_INTEGRITY_DETECT_PREDICTION", "()Z", "isLocaleEnglish", "<init>", "()V", "Task", "TaskHandler", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class ModelManager {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String SDK_MODEL_ASSET = "%s/model_asset";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String MODEL_ASSERT_STORE = "com.facebook.internal.MODEL_STORE";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String CACHE_KEY_MODELS = "models";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final String MTML_USE_CASE = "MTML";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final String USE_CASE_KEY = "use_case";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final String VERSION_ID_KEY = "version_id";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final String ASSET_URI_KEY = "asset_uri";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final String RULES_URI_KEY = "rules_uri";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final String THRESHOLD_KEY = "thresholds";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final int MODEL_REQUEST_INTERVAL_MILLISECONDS = 259200000;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final String CACHE_KEY_REQUEST_TIMESTAMP = "model_request_timestamp";

    @NotNull
    public static final ModelManager INSTANCE = new ModelManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final Map<String, TaskHandler> taskHandlers = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final List<String> MTML_SUGGESTED_EVENTS_PREDICTION = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"other", AppEventsConstants.EVENT_NAME_COMPLETED_REGISTRATION, AppEventsConstants.EVENT_NAME_ADDED_TO_CART, AppEventsConstants.EVENT_NAME_PURCHASED, AppEventsConstants.EVENT_NAME_INITIATED_CHECKOUT});

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static final List<String> MTML_INTEGRITY_DETECT_PREDICTION = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"none", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "health"});

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/facebook/appevents/ml/ModelManager$Task;", "", "", "toKey", "toUseCase", "<init>", "(Ljava/lang/String;I)V", "MTML_INTEGRITY_DETECT", "MTML_APP_EVENT_PREDICTION", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public enum Task {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[Task.values().length];
                $EnumSwitchMapping$0 = iArr;
                Task task = Task.MTML_INTEGRITY_DETECT;
                iArr[task.ordinal()] = 1;
                Task task2 = Task.MTML_APP_EVENT_PREDICTION;
                iArr[task2.ordinal()] = 2;
                int[] iArr2 = new int[Task.values().length];
                $EnumSwitchMapping$1 = iArr2;
                iArr2[task.ordinal()] = 1;
                iArr2[task2.ordinal()] = 2;
            }
        }

        @NotNull
        public final String toKey() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return "integrity_detect";
            }
            if (i == 2) {
                return "app_event_pred";
            }
            throw new NoWhenBranchMatchedException();
        }

        @NotNull
        public final String toUseCase() {
            int i = WhenMappings.$EnumSwitchMapping$1[ordinal()];
            if (i == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\t\b\u0002\u0018\u0000 &2\u00020\u0001:\u00013B3\u0012\u0006\u0010\u001d\u001a\u00020\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0017\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010*\u001a\u00020#\u0012\b\u00100\u001a\u0004\u0018\u00010+¢\u0006\u0004\b1\u00102J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0015\u0010\u001a\"\u0004\b\u001e\u0010\u001cR$\u0010\"\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00100\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010,\u001a\u0004\b$\u0010-\"\u0004\b.\u0010/¨\u00064"}, d2 = {"Lcom/facebook/appevents/ml/ModelManager$TaskHandler;", "", "Ljava/lang/Runnable;", "onPostExecute", "l", "Ljava/io/File;", "a", "Ljava/io/File;", "e", "()Ljava/io/File;", "m", "(Ljava/io/File;)V", "ruleFile", "Lcom/facebook/appevents/ml/Model;", "b", "Lcom/facebook/appevents/ml/Model;", GoogleApiAvailabilityLight.a, "()Lcom/facebook/appevents/ml/Model;", hl.k, "(Lcom/facebook/appevents/ml/Model;)V", "model", "c", "Ljava/lang/Runnable;", "", "Ljava/lang/String;", "h", "()Ljava/lang/String;", com.google.android.exoplayer2.text.ttml.b.r, "(Ljava/lang/String;)V", "useCase", z.j, "assetUri", "f", GoogleApiAvailabilityLight.b, "ruleUri", "", "g", LogUtil.I, "i", "()I", DTransferConstants.SEARCH_KEY, "(I)V", "versionId", "", "[F", "()[F", "o", "([F)V", ModelManager.THRESHOLD_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[F)V", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class TaskHandler {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private File ruleFile;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private Model model;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private Runnable onPostExecute;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private String useCase;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private String assetUri;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        private String ruleUri;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private int versionId;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        private float[] thresholds;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\"\u0010\f\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000fJ\u001c\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014¨\u0006\u0018"}, d2 = {"Lcom/facebook/appevents/ml/ModelManager$TaskHandler$Companion;", "", "", "useCase", "", "versionId", "", "a", "uri", "name", "Lcom/facebook/appevents/internal/FileDownloadTask$Callback;", "onComplete", "b", "Lorg/json/JSONObject;", "json", "Lcom/facebook/appevents/ml/ModelManager$TaskHandler;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "handler", Constant.METHOD_EXECUTE, "master", "", "slaves", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/File;", "file", "", "onComplete", "(Ljava/io/File;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a implements FileDownloadTask.Callback {
                public final /* synthetic */ List a;

                /* JADX INFO: renamed from: com.facebook.appevents.ml.ModelManager$TaskHandler$Companion$a$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/File;", "file", "", "onComplete", "(Ljava/io/File;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C0131a implements FileDownloadTask.Callback {
                    public final /* synthetic */ TaskHandler a;
                    public final /* synthetic */ Model b;

                    public C0131a(TaskHandler taskHandler, Model model) {
                        this.a = taskHandler;
                        this.b = model;
                    }

                    @Override // com.facebook.appevents.internal.FileDownloadTask.Callback
                    public final void onComplete(@NotNull File file) {
                        this.a.k(this.b);
                        this.a.m(file);
                        Runnable runnable = this.a.onPostExecute;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }

                public a(List list) {
                    this.a = list;
                }

                @Override // com.facebook.appevents.internal.FileDownloadTask.Callback
                public final void onComplete(@NotNull File file) {
                    Model modelBuild = Model.INSTANCE.build(file);
                    if (modelBuild != null) {
                        for (TaskHandler taskHandler : this.a) {
                            TaskHandler.INSTANCE.b(taskHandler.getRuleUri(), taskHandler.getUseCase() + "_" + taskHandler.getVersionId() + "_rule", new C0131a(taskHandler, modelBuild));
                        }
                    }
                }
            }

            private Companion() {
            }

            private final void a(String useCase, int versionId) {
                File[] fileArrListFiles;
                File mlDir = Utils.getMlDir();
                if (mlDir == null || (fileArrListFiles = mlDir.listFiles()) == null) {
                    return;
                }
                if (fileArrListFiles.length == 0) {
                    return;
                }
                String str = useCase + "_" + versionId;
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    if (m.startsWith$default(name, useCase, false, 2, null) && !m.startsWith$default(name, str, false, 2, null)) {
                        file.delete();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void b(String uri, String name, FileDownloadTask.Callback onComplete) {
                File file = new File(Utils.getMlDir(), name);
                if (uri == null || file.exists()) {
                    onComplete.onComplete(file);
                } else {
                    new FileDownloadTask(uri, file, onComplete).execute(new String[0]);
                }
            }

            @Nullable
            public final TaskHandler build(@Nullable JSONObject json) {
                if (json == null) {
                    return null;
                }
                try {
                    return new TaskHandler(json.getString(ModelManager.USE_CASE_KEY), json.getString(ModelManager.ASSET_URI_KEY), json.optString(ModelManager.RULES_URI_KEY, null), json.getInt(ModelManager.VERSION_ID_KEY), ModelManager.access$parseJsonArray(ModelManager.INSTANCE, json.getJSONArray(ModelManager.THRESHOLD_KEY)));
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void execute(@NotNull TaskHandler handler) {
                execute(handler, e.listOf(handler));
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final void execute(@NotNull TaskHandler master, @NotNull List<TaskHandler> slaves) {
                a(master.getUseCase(), master.getVersionId());
                b(master.getAssetUri(), master.getUseCase() + "_" + master.getVersionId(), new a(slaves));
            }
        }

        public TaskHandler(@NotNull String str, @NotNull String str2, @Nullable String str3, int i, @Nullable float[] fArr) {
            this.useCase = str;
            this.assetUri = str2;
            this.ruleUri = str3;
            this.versionId = i;
            this.thresholds = fArr;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getAssetUri() {
            return this.assetUri;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Model getModel() {
            return this.model;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final File getRuleFile() {
            return this.ruleFile;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getRuleUri() {
            return this.ruleUri;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final float[] getThresholds() {
            return this.thresholds;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getUseCase() {
            return this.useCase;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final int getVersionId() {
            return this.versionId;
        }

        public final void j(@NotNull String str) {
            this.assetUri = str;
        }

        public final void k(@Nullable Model model) {
            this.model = model;
        }

        @NotNull
        public final TaskHandler l(@Nullable Runnable onPostExecute) {
            this.onPostExecute = onPostExecute;
            return this;
        }

        public final void m(@Nullable File file) {
            this.ruleFile = file;
        }

        public final void n(@Nullable String str) {
            this.ruleUri = str;
        }

        public final void o(@Nullable float[] fArr) {
            this.thresholds = fArr;
        }

        public final void p(@NotNull String str) {
            this.useCase = str;
        }

        public final void q(int i) {
            this.versionId = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Task.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements Runnable {
        public static final a a = new a();

        @Override // java.lang.Runnable
        public final void run() {
            JSONObject jSONObject;
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(ModelManager.MODEL_ASSERT_STORE, 0);
                String string = sharedPreferences.getString(ModelManager.CACHE_KEY_MODELS, null);
                if (string != null) {
                    jSONObject = string.length() == 0 ? new JSONObject() : new JSONObject(string);
                }
                long j = sharedPreferences.getLong(ModelManager.CACHE_KEY_REQUEST_TIMESTAMP, 0L);
                if (!FeatureManager.isEnabled(FeatureManager.Feature.ModelRequest) || jSONObject.length() == 0 || !ModelManager.access$isValidTimestamp(ModelManager.INSTANCE, j)) {
                    jSONObject = ModelManager.access$fetchModels(ModelManager.INSTANCE);
                    if (jSONObject == null) {
                        return;
                    } else {
                        sharedPreferences.edit().putString(ModelManager.CACHE_KEY_MODELS, jSONObject.toString()).putLong(ModelManager.CACHE_KEY_REQUEST_TIMESTAMP, System.currentTimeMillis()).apply();
                    }
                }
                ModelManager modelManager = ModelManager.INSTANCE;
                ModelManager.access$addModels(modelManager, jSONObject);
                ModelManager.access$enableMTML(modelManager);
            } catch (Exception unused) {
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements Runnable {
        public static final b a = new b();

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                SuggestedEventsManager.enable();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c implements Runnable {
        public static final c a = new c();

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                IntegrityManager.enable();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private ModelManager() {
    }

    private final void a(JSONObject models) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Iterator<String> itKeys = models.keys();
            while (itKeys.hasNext()) {
                try {
                    TaskHandler taskHandlerBuild = TaskHandler.INSTANCE.build(models.getJSONObject(itKeys.next()));
                    if (taskHandlerBuild != null) {
                        taskHandlers.put(taskHandlerBuild.getUseCase(), taskHandlerBuild);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final /* synthetic */ void access$addModels(ModelManager modelManager, JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return;
        }
        try {
            modelManager.a(jSONObject);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
        }
    }

    public static final /* synthetic */ void access$enableMTML(ModelManager modelManager) {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return;
        }
        try {
            modelManager.b();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
        }
    }

    public static final /* synthetic */ JSONObject access$fetchModels(ModelManager modelManager) {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return null;
        }
        try {
            return modelManager.c();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
            return null;
        }
    }

    public static final /* synthetic */ boolean access$isValidTimestamp(ModelManager modelManager, long j) {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return false;
        }
        try {
            return modelManager.e(j);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
            return false;
        }
    }

    public static final /* synthetic */ float[] access$parseJsonArray(ModelManager modelManager, JSONArray jSONArray) {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return null;
        }
        try {
            return modelManager.f(jSONArray);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
            return null;
        }
    }

    private final void b() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String assetUri = null;
            int iMax = 0;
            for (Map.Entry<String, TaskHandler> entry : taskHandlers.entrySet()) {
                String key = entry.getKey();
                TaskHandler value = entry.getValue();
                if (Intrinsics.areEqual(key, Task.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                    assetUri = value.getAssetUri();
                    iMax = Math.max(iMax, value.getVersionId());
                    if (FeatureManager.isEnabled(FeatureManager.Feature.SuggestedEvents) && d()) {
                        arrayList.add(value.l(b.a));
                    }
                }
                if (Intrinsics.areEqual(key, Task.MTML_INTEGRITY_DETECT.toUseCase())) {
                    String assetUri2 = value.getAssetUri();
                    int iMax2 = Math.max(iMax, value.getVersionId());
                    if (FeatureManager.isEnabled(FeatureManager.Feature.IntelligentIntegrity)) {
                        arrayList.add(value.l(c.a));
                    }
                    assetUri = assetUri2;
                    iMax = iMax2;
                }
            }
            if (assetUri == null || iMax <= 0 || arrayList.isEmpty()) {
                return;
            }
            TaskHandler.INSTANCE.execute(new TaskHandler(MTML_USE_CASE, assetUri, null, iMax, null), arrayList);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final JSONObject c() {
        JSONObject graphObject;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            String[] strArr = {USE_CASE_KEY, VERSION_ID_KEY, ASSET_URI_KEY, RULES_URI_KEY, THRESHOLD_KEY};
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.FIELDS_PARAM, TextUtils.join(",", strArr));
            if (Utility.isNullOrEmpty(FacebookSdk.getClientToken())) {
                GraphRequest.Companion companion = GraphRequest.INSTANCE;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                GraphRequest graphRequestNewGraphPathRequest = companion.newGraphPathRequest(null, String.format(SDK_MODEL_ASSET, Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1)), null);
                graphRequestNewGraphPathRequest.setSkipClientToken(true);
                graphRequestNewGraphPathRequest.setParameters(bundle);
                graphObject = graphRequestNewGraphPathRequest.executeAndWait().getGraphObject();
                if (graphObject == null) {
                    return null;
                }
            } else {
                GraphRequest graphRequestNewGraphPathRequest2 = GraphRequest.INSTANCE.newGraphPathRequest(null, "app/model_asset", null);
                graphRequestNewGraphPathRequest2.setParameters(bundle);
                graphObject = graphRequestNewGraphPathRequest2.executeAndWait().getGraphObject();
                if (graphObject == null) {
                    return null;
                }
            }
            return g(graphObject);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final boolean d() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            Locale resourceLocale = Utility.getResourceLocale();
            return resourceLocale == null || StringsKt__StringsKt.contains$default((CharSequence) resourceLocale.getLanguage(), (CharSequence) "en", false, 2, (Object) null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean e(long timestamp) {
        if (CrashShieldHandler.isObjectCrashing(this) || timestamp == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - timestamp < ((long) MODEL_REQUEST_INTERVAL_MILLISECONDS);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    @JvmStatic
    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return;
        }
        try {
            Utility.runOnNonUiThread(a.a);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
        }
    }

    private final float[] f(JSONArray jsonArray) {
        if (CrashShieldHandler.isObjectCrashing(this) || jsonArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jsonArray.length()];
            int length = jsonArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    fArr[i] = Float.parseFloat(jsonArray.getString(i));
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final JSONObject g(JSONObject jsonObject) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = jsonObject.getJSONArray("data");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(VERSION_ID_KEY, jSONObject2.getString(VERSION_ID_KEY));
                    jSONObject3.put(USE_CASE_KEY, jSONObject2.getString(USE_CASE_KEY));
                    jSONObject3.put(THRESHOLD_KEY, jSONObject2.getJSONArray(THRESHOLD_KEY));
                    jSONObject3.put(ASSET_URI_KEY, jSONObject2.getString(ASSET_URI_KEY));
                    if (jSONObject2.has(RULES_URI_KEY)) {
                        jSONObject3.put(RULES_URI_KEY, jSONObject2.getString(RULES_URI_KEY));
                    }
                    jSONObject.put(jSONObject2.getString(USE_CASE_KEY), jSONObject3);
                }
                return jSONObject;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final File getRuleFile(@NotNull Task task) {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return null;
        }
        try {
            TaskHandler taskHandler = taskHandlers.get(task.toUseCase());
            if (taskHandler != null) {
                return taskHandler.getRuleFile();
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
            return null;
        }
    }

    private final String[] h(MTensor res, float[] thresholds) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            int shape = res.getShape(0);
            int shape2 = res.getShape(1);
            float[] data = res.getData();
            if (shape2 != thresholds.length) {
                return null;
            }
            IntRange intRangeUntil = kotlin.ranges.e.until(0, shape);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it2 = intRangeUntil.iterator();
            while (it2.hasNext()) {
                int iNextInt = ((IntIterator) it2).nextInt();
                String str = "none";
                int length = thresholds.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (data[(iNextInt * shape2) + i2] >= thresholds[i]) {
                        str = MTML_INTEGRITY_DETECT_PREDICTION.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final String[] i(MTensor res, float[] thresholds) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            int shape = res.getShape(0);
            int shape2 = res.getShape(1);
            float[] data = res.getData();
            if (shape2 != thresholds.length) {
                return null;
            }
            IntRange intRangeUntil = kotlin.ranges.e.until(0, shape);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it2 = intRangeUntil.iterator();
            while (it2.hasNext()) {
                int iNextInt = ((IntIterator) it2).nextInt();
                String str = "other";
                int length = thresholds.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (data[(iNextInt * shape2) + i2] >= thresholds[i]) {
                        str = MTML_SUGGESTED_EVENTS_PREDICTION.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final String[] predict(@NotNull Task task, @NotNull float[][] denses, @NotNull String[] texts) {
        Model model;
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return null;
        }
        try {
            TaskHandler taskHandler = taskHandlers.get(task.toUseCase());
            if (taskHandler == null || (model = taskHandler.getModel()) == null) {
                return null;
            }
            float[] thresholds = taskHandler.getThresholds();
            int length = texts.length;
            int length2 = denses[0].length;
            MTensor mTensor = new MTensor(new int[]{length, length2});
            for (int i = 0; i < length; i++) {
                System.arraycopy(denses[i], 0, mTensor.getData(), i * length2, length2);
            }
            MTensor mTensorPredictOnMTML = model.predictOnMTML(mTensor, texts, task.toKey());
            if (mTensorPredictOnMTML == null || thresholds == null) {
                return null;
            }
            if (mTensorPredictOnMTML.getData().length == 0) {
                return null;
            }
            if (thresholds.length == 0) {
                return null;
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[task.ordinal()];
            if (i2 == 1) {
                return INSTANCE.i(mTensorPredictOnMTML, thresholds);
            }
            if (i2 == 2) {
                return INSTANCE.h(mTensorPredictOnMTML, thresholds);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
            return null;
        }
    }
}
