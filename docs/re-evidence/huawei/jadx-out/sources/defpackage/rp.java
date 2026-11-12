package defpackage;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.braintreepayments.api.AnalyticsDatabase;
import com.braintreepayments.api.AnalyticsEventBlobDao;
import com.braintreepayments.api.AnalyticsUploadWorker;
import com.braintreepayments.api.AnalyticsWriteToDbWorker;
import com.braintreepayments.api.Authorization;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.hianalytics.core.storage.Event;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwWorkoutServiceUtils;
import com.huawei.openalliance.ad.constant.ParamConstants;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ(\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ8\u0010!\u001a\u00020\"2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010\u00192\b\u0010&\u001a\u0004\u0018\u00010\u00192\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012JB\u0010!\u001a\u00020\"2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010\u00192\b\u0010&\u001a\u0004\u0018\u00010\u00192\u0006\u0010'\u001a\u00020(2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J,\u0010)\u001a\u00020*2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010\u00192\b\u0010&\u001a\u0004\u0018\u00010\u0019H\u0002J\u0018\u0010+\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J2\u0010,\u001a\u00020*2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010\u00192\b\u0010&\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000e*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/braintreepayments/api/AnalyticsClient;", "", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "httpClient", "Lcom/braintreepayments/api/BraintreeHttpClient;", "analyticsDatabase", "Lcom/braintreepayments/api/AnalyticsDatabase;", "workManager", "Landroidx/work/WorkManager;", "deviceInspector", "Lcom/braintreepayments/api/DeviceInspector;", "(Landroid/content/Context;Lcom/braintreepayments/api/BraintreeHttpClient;Lcom/braintreepayments/api/AnalyticsDatabase;Landroidx/work/WorkManager;Lcom/braintreepayments/api/DeviceInspector;)V", "applicationContext", "kotlin.jvm.PlatformType", "createFPTIPayload", "Lorg/json/JSONObject;", "authorization", "Lcom/braintreepayments/api/Authorization;", "eventBlobs", "", "Lcom/braintreepayments/api/AnalyticsEventBlob;", "metadata", "Lcom/braintreepayments/api/DeviceMetadata;", "mapAnalyticsEventToFPTIEventJSON", "", "event", "Lcom/braintreepayments/api/AnalyticsEvent;", "performAnalyticsUpload", "Landroidx/work/ListenableWorker$Result;", "inputData", "Landroidx/work/Data;", "performAnalyticsWrite", "reportCrash", "", "configuration", "Lcom/braintreepayments/api/Configuration;", "sessionId", "integration", "timestamp", "", "scheduleAnalyticsUploadInBackground", "Ljava/util/UUID;", "scheduleAnalyticsWriteInBackground", "sendEvent", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class rp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f47554b = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final to f47555a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final su f47556c;
    private final AnalyticsDatabase d;
    private final Context e;
    private final WorkManager g;

    public rp(Context context, su suVar, AnalyticsDatabase analyticsDatabase, WorkManager workManager, to toVar) {
        zcp.c(context, "");
        zcp.c(suVar, "");
        zcp.c(analyticsDatabase, "");
        zcp.c(workManager, "");
        zcp.c(toVar, "");
        this.f47556c = suVar;
        this.d = analyticsDatabase;
        this.g = workManager;
        this.f47555a = toVar;
        this.e = context.getApplicationContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ rp(Context context, su suVar, AnalyticsDatabase analyticsDatabase, WorkManager workManager, to toVar, int i, zcm zcmVar) {
        if ((i & 2) != 0) {
            suVar = new su(null, 1, 0 == true ? 1 : 0);
        }
        su suVar2 = suVar;
        if ((i & 4) != 0) {
            AnalyticsDatabase.Companion companion = AnalyticsDatabase.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            zcp.b((Object) applicationContext, "");
            analyticsDatabase = companion.e(applicationContext);
        }
        AnalyticsDatabase analyticsDatabase2 = analyticsDatabase;
        if ((i & 8) != 0) {
            workManager = WorkManager.getInstance(context.getApplicationContext());
            zcp.b((Object) workManager, "");
        }
        this(context, suVar2, analyticsDatabase2, workManager, (i & 16) != 0 ? new to() : toVar);
    }

    public final UUID a(tf tfVar, rr rrVar, String str, String str2, Authorization authorization) throws Throwable {
        zcp.c(tfVar, "");
        zcp.c(rrVar, "");
        zcp.c(authorization, "");
        a(rrVar, authorization);
        return c(tfVar, authorization, str, str2);
    }

    private final void a(rr rrVar, Authorization authorization) throws Throwable {
        Data dataBuild = new Data.Builder().putString("authorization", authorization.getRawValue()).putString("analyticsJson", b(rrVar)).build();
        zcp.b((Object) dataBuild, "");
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(AnalyticsWriteToDbWorker.class).setInputData(dataBuild).build();
        zcp.b((Object) oneTimeWorkRequestBuild, "");
        this.g.enqueueUniqueWork("writeAnalyticsToDb", ExistingWorkPolicy.APPEND_OR_REPLACE, oneTimeWorkRequestBuild);
    }

    public final ListenableWorker.Result a(Data data) {
        zcp.c(data, "");
        String string = data.getString("analyticsJson");
        if (string == null) {
            ListenableWorker.Result resultFailure = ListenableWorker.Result.failure();
            zcp.b((Object) resultFailure, "");
            return resultFailure;
        }
        this.d.analyticsEventBlobDao().insertEventBlob(new sa(string, 0L, 2, null));
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        zcp.b((Object) resultSuccess, "");
        return resultSuccess;
    }

    private final UUID c(tf tfVar, Authorization authorization, String str, String str2) throws Throwable {
        Data dataBuild = new Data.Builder().putString("authorization", authorization.getRawValue()).putString("configuration", tfVar.getG()).putString("sessionId", str).putString("integration", str2).build();
        zcp.b((Object) dataBuild, "");
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(AnalyticsUploadWorker.class).setInitialDelay(30L, TimeUnit.SECONDS).setInputData(dataBuild).build();
        zcp.b((Object) oneTimeWorkRequestBuild, "");
        OneTimeWorkRequest oneTimeWorkRequest = oneTimeWorkRequestBuild;
        this.g.enqueueUniqueWork("uploadAnalytics", ExistingWorkPolicy.KEEP, oneTimeWorkRequest);
        UUID id = oneTimeWorkRequest.getId();
        zcp.b((Object) id, "");
        return id;
    }

    public final ListenableWorker.Result d(Data data) {
        ListenableWorker.Result resultFailure;
        zcp.c(data, "");
        c cVar = f47554b;
        tf tfVarD = cVar.d(data);
        Authorization authorizationB = cVar.b(data);
        String string = data.getString("sessionId");
        String string2 = data.getString("integration");
        if (yzp.c(tfVarD, authorizationB, string, string2).contains(null)) {
            ListenableWorker.Result resultFailure2 = ListenableWorker.Result.failure();
            zcp.b((Object) resultFailure2, "");
            return resultFailure2;
        }
        try {
            AnalyticsEventBlobDao analyticsEventBlobDao = this.d.analyticsEventBlobDao();
            List<sa> allEventBlobs = analyticsEventBlobDao.getAllEventBlobs();
            if (!allEventBlobs.isEmpty()) {
                JSONObject jSONObjectE = e(authorizationB, allEventBlobs, this.f47555a.e(this.e, tfVarD, string, string2));
                su suVar = this.f47556c;
                String string3 = jSONObjectE.toString();
                zcp.b((Object) string3, "");
                suVar.c("https://api-m.paypal.com/v1/tracking/batch/events", string3, tfVarD, authorizationB);
                analyticsEventBlobDao.deleteEventBlobs(allEventBlobs);
            }
            resultFailure = ListenableWorker.Result.success();
        } catch (Exception unused) {
            resultFailure = ListenableWorker.Result.failure();
        }
        zcp.b((Object) resultFailure, "");
        return resultFailure;
    }

    public final void d(Context context, tf tfVar, String str, String str2, Authorization authorization) {
        a(context, tfVar, str, str2, System.currentTimeMillis(), authorization);
    }

    public final void a(Context context, tf tfVar, String str, String str2, long j, Authorization authorization) {
        if (authorization == null) {
            return;
        }
        try {
            JSONObject jSONObjectE = e(authorization, yzp.e(new sa(b(new rr(CrashHianalyticsData.EVENT_ID_CRASH, null, null, false, false, null, null, null, j, HwWorkoutServiceUtils.HEART_RATE_TRUST_VALUE, null)), 0L, 2, null)), this.f47555a.e(context, tfVar, str, str2));
            su suVar = this.f47556c;
            String string = jSONObjectE.toString();
            zcp.b((Object) string, "");
            su.a(suVar, "https://api-m.paypal.com/v1/tracking/batch/events", string, null, authorization, null, null, 16, null);
        } catch (JSONException unused) {
        }
    }

    private final JSONObject e(Authorization authorization, List<sa> list, tk tkVar) throws JSONException {
        JSONObject jSONObjectB = tkVar.b();
        if (authorization != null) {
            if (authorization instanceof tj) {
                jSONObjectB.put("authorization_fingerprint", ((tj) authorization).getE());
            } else {
                jSONObjectB.put("tokenization_key", authorization.getE());
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("batch_params", jSONObjectB);
        JSONArray jSONArray = new JSONArray();
        Iterator<sa> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(new JSONObject(it.next().getF47890b()));
        }
        jSONObject.put("event_params", jSONArray);
        JSONObject jSONObjectPut = new JSONObject().put(Event.EventConstants.EVENTS, new JSONArray(new JSONObject[]{jSONObject}));
        zcp.b((Object) jSONObjectPut, "");
        return jSONObjectPut;
    }

    private final String b(rr rrVar) {
        String string = new JSONObject().put("event_name", "android." + rrVar.getF47583a()).put(FitRunPlayAudio.PLAY_TYPE_T, rrVar.getH()).put("venmo_installed", rrVar.getF()).put("is_vault", rrVar.getF47584b()).put("tenant_name", "Braintree").putOpt("paypal_context_id", rrVar.getJ()).putOpt("link_type", rrVar.getD()).putOpt("start_time", rrVar.getI()).putOpt("end_time", rrVar.getE()).putOpt("endpoint", rrVar.getF47585c()).toString();
        zcp.b((Object) string, "");
        return string;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0014\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/braintreepayments/api/AnalyticsClient$Companion;", "", "()V", "DELAY_TIME_SECONDS", "", "FPTI_ANALYTICS_URL", "", "FPTI_KEY_AUTH_FINGERPRINT", "FPTI_KEY_BATCH_PARAMS", "FPTI_KEY_ENDPOINT", "FPTI_KEY_END_TIME", "FPTI_KEY_EVENTS", "FPTI_KEY_EVENT_NAME", "FPTI_KEY_EVENT_PARAMS", "FPTI_KEY_IS_VAULT", "FPTI_KEY_LINK_TYPE", "FPTI_KEY_PAYPAL_CONTEXT_ID", "FPTI_KEY_START_TIME", "FPTI_KEY_TENANT_NAME", "FPTI_KEY_TIMESTAMP", "FPTI_KEY_TOKENIZATION_KEY", "FPTI_KEY_VENMO_INSTALLED", "WORK_INPUT_KEY_ANALYTICS_JSON", "WORK_INPUT_KEY_AUTHORIZATION", "WORK_INPUT_KEY_CONFIGURATION", "WORK_INPUT_KEY_INTEGRATION", "WORK_INPUT_KEY_SESSION_ID", "WORK_NAME_ANALYTICS_UPLOAD", "WORK_NAME_ANALYTICS_WRITE", "getAuthorizationFromData", "Lcom/braintreepayments/api/Authorization;", "inputData", "Landroidx/work/Data;", "getConfigurationFromData", "Lcom/braintreepayments/api/Configuration;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class c {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Authorization b(Data data) {
            String string;
            if (data == null || (string = data.getString("authorization")) == null) {
                return null;
            }
            return Authorization.INSTANCE.d(string);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final tf d(Data data) {
            String string;
            if (data == null || (string = data.getString("configuration")) == null) {
                return null;
            }
            try {
                return tf.f49044c.e(string);
            } catch (JSONException unused) {
                return null;
            }
        }

        public /* synthetic */ c(zcm zcmVar) {
            this();
        }
    }
}
