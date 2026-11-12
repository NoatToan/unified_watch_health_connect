package com.xiaomi.hm.health.traininglib.webapi;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.dataflow.Constant;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.databases.model.trainning.HaveDoneAction;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourse;
import com.xiaomi.hm.health.databases.model.trainning.TrainingHeartRate;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import com.xiaomi.hm.health.training.api.function.Consumer;
import com.xiaomi.hm.health.training.api.function.Function;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.traininglib.event.EventReqTrainingData;
import com.xiaomi.hm.health.traininglib.model.ReqAllTrainingParam;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import com.xiaomi.hm.health.traininglib.model.TrainingHistoryDetail;
import com.xiaomi.hm.health.traininglib.model.TrainingHistoryListData;
import com.xiaomi.hm.health.traininglib.model.TrainingRecordStatInfo;
import com.xiaomi.hm.health.traininglib.model.TrainingStatInfo;
import com.xiaomi.hm.health.traininglib.util.TrainerUtil;
import com.xiaomi.hm.health.traininglib.util.TrainingConstant;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import com.xiaomi.hm.health.traininglib.util.TrainingKeeper;
import com.xiaomi.hm.health.traininglib.webapi.RequestTrainingAPI;
import de.greenrobot.event.EventBus;
import defpackage.id6;
import defpackage.jd6;
import defpackage.kd6;
import defpackage.ld6;
import defpackage.tc6;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.helpers.MessageFormatter;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes22.dex */
public class RequestTrainingAPI {
    private static final String A = "startTime";
    private static final String B = "endTime";
    private static final String C = "limit";
    private static final String D = "next";
    private static final String E = "isDetail";
    private static final String F = "trainingType";
    private static final String G = "SettingEntryName";
    private static final String H = "mode";
    private static final String I = "SettingsList";
    private static final String J = "difficultyDegree";
    private static final String K = "location";
    private static final String L = "instrument";
    private static Supplier<TrainerInfo> M = new Supplier() { // from class: hc6
        @Override // com.xiaomi.hm.health.training.api.function.Supplier
        public final Object get() {
            return TrainerInfo.get();
        }
    };
    public static final String TAG = "Train-RequestTrainingAPI";
    private static final String a = "users/{userId}/trainingStatistics";
    private static final String b = "users/{userId}/trainingRecords";
    private static final String c = "users/{userId}/trainingRecords";
    private static final String d = "users/{userId}/trainingRecords/{trainingId}";
    private static final String e = "trainings";
    private static final String f = "trainings/{id}";
    private static final String g = "users/{userId}/trainings/{id}";
    private static final String h = "users/{userId}/joinedTrainings";
    private static final String i = "users/{userId}/recommendedCollections";
    public static boolean isCache = false;
    private static final String j = "users/{userId}/recommendedArticles";
    private static final String k = "users/{userId}/trainingBanners";
    private static final String l = "dictionaries/{type}";
    private static final String m = "users/{userId}/trainingPlan?isDetail={isDetail}";
    private static final String n = "users/{userId}/trainingPlan";
    private static final String o = "trainingCollections/{collectionId}";
    private static final String p = "users/{userId}/joinTrainings/{id}";
    private static final String q = "runCirclePosts";
    private static final String r = "users/{userId}/trainingKnowledge";
    private static final String s = "users/{userId}/trainingPlans/{trainingPlanId}";
    private static final String t = "users/{userId}/trainings/{trainingId}";
    private static final String u = "users/{userId}/trainingRecords/{trainingId}";
    private static final String v = "legacy/userProperties";
    private static final String w = "gender";
    private static final String x = "BMIType";
    private static final String y = "displayLocation";
    private static final String z = "finishTime";

    public class a extends IHMHttpResponseHandler {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.d(RequestTrainingAPI.TAG, "onCompleted ", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            th.printStackTrace();
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            String str = new String(hMHttpResponseData.getResponseBody());
            HMLog.d(RequestTrainingAPI.TAG, "load from web onSuccess:" + str, new Object[0]);
            String str2 = this.a;
            if (str2 == null || !str2.equals(str)) {
                HMLog.d(RequestTrainingAPI.TAG, "local need update by web:", new Object[0]);
                EventReqTrainingData.MethodType methodType = EventReqTrainingData.DATA_TRAINING_DICTIONARIES_LIST;
                List listFromItems = ParseJsonUtil.getListFromItems(str, methodType.type);
                Bundle bundle = new Bundle();
                bundle.putString(TrainingConstant.KEY_TYPE, this.b);
                EventBus.getDefault().post(new EventReqTrainingData(methodType.method, listFromItems, bundle));
            }
        }
    }

    public class b extends IHMHttpResponseHandler {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.d(RequestTrainingAPI.TAG, "onCancel " + i, new Object[0]);
            RequestTrainingAPI.w0(i, EventReqTrainingData.DATA_TRAIN_COLLECTION_LIST);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.d(RequestTrainingAPI.TAG, "onCompleted ", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            th.printStackTrace();
            RequestTrainingAPI.x0(th, EventReqTrainingData.DATA_TRAIN_COLLECTION_LIST);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            RequestTrainingAPI.N(this.a, this.b, hMHttpResponseData, EventReqTrainingData.DATA_TRAIN_COLLECTION_LIST);
        }
    }

    public class c extends IHMHttpResponseHandler {
        public final /* synthetic */ boolean a;

        public c(boolean z) {
            this.a = z;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.d(RequestTrainingAPI.TAG, "onCancel " + i, new Object[0]);
            RequestTrainingAPI.w0(i, EventReqTrainingData.DATA_JOIN_TRAININGS);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.d(RequestTrainingAPI.TAG, "onCompleted ", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            th.printStackTrace();
            RequestTrainingAPI.x0(th, EventReqTrainingData.DATA_JOIN_TRAININGS);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            hMHttpResponseData.setTag(String.valueOf(this.a));
            RequestTrainingAPI.z0(hMHttpResponseData, EventReqTrainingData.DATA_JOIN_TRAININGS);
        }
    }

    public class d extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ HMHttpResponseData a;

        public d(HMHttpResponseData hMHttpResponseData) {
            this.a = hMHttpResponseData;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess()) {
                this.a.copy(hMHttpResponseData);
            }
        }
    }

    public class e extends Subscriber<Map<String, String>> {
        public final /* synthetic */ boolean f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;
        public final /* synthetic */ Date i;

        public class a extends IHMHttpResponseHandler {
            public a() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int i) {
                HMLog.d(RequestTrainingAPI.TAG, "onCancel " + i, new Object[0]);
                RequestTrainingAPI.w0(i, EventReqTrainingData.DATA_TRAINING_PLAN);
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
                HMLog.d(RequestTrainingAPI.TAG, "onCompleted ", new Object[0]);
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(Throwable th) {
                th.printStackTrace();
                RequestTrainingAPI.x0(th, EventReqTrainingData.DATA_TRAINING_PLAN);
            }

            @Override // com.huami.network.base.handler.IHMHttpResponseHandler
            public void onItem(HMHttpResponseData hMHttpResponseData) {
                RequestTrainingAPI.B0(hMHttpResponseData, EventReqTrainingData.DATA_TRAINING_PLAN);
            }
        }

        public e(boolean z, String str, String str2, Date date) {
            this.f = z;
            this.g = str;
            this.h = str2;
            this.i = date;
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(Map<String, String> map) {
            try {
                TrainerInfo trainerInfo = (TrainerInfo) RequestTrainingAPI.M.get();
                String strReplace = HMServerDef.getUrl(RequestTrainingAPI.m).replace("{userId}", trainerInfo.uid).replace("{isDetail}", String.valueOf(this.f));
                HMLog.d(RequestTrainingAPI.TAG, "reqTrainingPlan url==" + strReplace, new Object[0]);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("trainingType", this.g);
                jSONObject.put("difficultyDegree", this.h);
                SimpleDateFormat simpleDateFormat = (SimpleDateFormat) DateFormat.getDateInstance();
                simpleDateFormat.applyPattern(TrainingDateUtils.PATTERN_YMD);
                jSONObject.put("startDate", simpleDateFormat.format(this.i));
                jSONObject.put("gender", trainerInfo.gender);
                HashSet hashSet = new HashSet();
                hashSet.add(jSONObject.toString());
                hashSet.add("application/json");
                HMWebUtil.doSeparateRequest(strReplace, map, (Set<Object>) hashSet, Support.RequestSupport.POST, true, true, (IHMBasicHttpResponseHandler) new a(), new HMHttpConfig[0]);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            th.printStackTrace();
            HMLog.i(RequestTrainingAPI.TAG, Log.getStackTraceString(th), new Object[0]);
            RequestTrainingAPI.x0(th, EventReqTrainingData.DATA_TRAINING_PLAN);
        }
    }

    public class f implements Callable<Map<String, String>> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<String, String> call() throws Exception {
            return HMWebUtil.getSystemHeader();
        }
    }

    public class g extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ TrainingRecord a;
        public final /* synthetic */ HMHttpResponseData b;

        public g(TrainingRecord trainingRecord, HMHttpResponseData hMHttpResponseData) {
            this.a = trainingRecord;
            this.b = hMHttpResponseData;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess()) {
                HMLog.d(RequestTrainingAPI.TAG, String.format(Locale.getDefault(), "上传训练历史记录[trainingId:%s][finishNumber:%s]成功的返回值：\n%s", String.valueOf(this.a.getTrainingId()), String.valueOf(this.a.getFinishNumber()), new String(hMHttpResponseData.getResponseBody())), new Object[0]);
                this.b.copy(hMHttpResponseData);
            }
        }
    }

    public class h extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ TrainingRecord a;
        public final /* synthetic */ HMHttpResponseData b;

        public h(TrainingRecord trainingRecord, HMHttpResponseData hMHttpResponseData) {
            this.a = trainingRecord;
            this.b = hMHttpResponseData;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess()) {
                HMLog.d(RequestTrainingAPI.TAG, String.format(Locale.getDefault(), "上传训练历史记录[trainingId:%s][finishNumber:%s]成功的返回值：\n%s", String.valueOf(this.a.getTrainingId()), String.valueOf(this.a.getFinishNumber()), new String(hMHttpResponseData.getResponseBody())), new Object[0]);
                this.b.copy(hMHttpResponseData);
            }
        }
    }

    public class i extends IHMHttpResponseHandler {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public i(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.d(RequestTrainingAPI.TAG, "onCancel " + i, new Object[0]);
            RequestTrainingAPI.w0(i, EventReqTrainingData.DATA_TRAINING_KNOWLEDGE);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.d(RequestTrainingAPI.TAG, "onCompleted ", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            th.printStackTrace();
            RequestTrainingAPI.x0(th, EventReqTrainingData.DATA_TRAINING_KNOWLEDGE);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            RequestTrainingAPI.N(this.a, this.b, hMHttpResponseData, EventReqTrainingData.DATA_TRAINING_KNOWLEDGE);
        }
    }

    public class j extends Subscriber<Map<String, String>> {
        public final /* synthetic */ long f;
        public final /* synthetic */ Date g;

        public class a extends IHMHttpResponseHandler {
            public a() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int i) {
                HMLog.d(RequestTrainingAPI.TAG, "onCancel " + i, new Object[0]);
                RequestTrainingAPI.w0(i, EventReqTrainingData.DATA_TRAINING_PLANS);
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
                HMLog.d(RequestTrainingAPI.TAG, "onCompleted ", new Object[0]);
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(Throwable th) {
                th.printStackTrace();
                RequestTrainingAPI.x0(th, EventReqTrainingData.DATA_TRAINING_PLANS);
            }

            @Override // com.huami.network.base.handler.IHMHttpResponseHandler
            public void onItem(HMHttpResponseData hMHttpResponseData) {
                hMHttpResponseData.setTag(String.valueOf(true));
                RequestTrainingAPI.z0(hMHttpResponseData, EventReqTrainingData.DATA_TRAINING_PLANS);
            }
        }

        public j(long j, Date date) {
            this.f = j;
            this.g = date;
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(Map<String, String> map) {
            try {
                String strReplace = HMServerDef.getUrl(RequestTrainingAPI.s).replace("{trainingPlanId}", String.valueOf(this.f)).replace("{userId}", ((TrainerInfo) RequestTrainingAPI.M.get()).uid);
                HMLog.d(RequestTrainingAPI.TAG, "reqTrainingPlans url==" + strReplace, new Object[0]);
                JSONObject jSONObject = new JSONObject();
                SimpleDateFormat simpleDateFormat = (SimpleDateFormat) DateFormat.getDateInstance();
                simpleDateFormat.applyPattern(TrainingDateUtils.PATTERN_YMD);
                jSONObject.put("startDay", simpleDateFormat.format(this.g));
                HashSet hashSet = new HashSet();
                hashSet.add(jSONObject.toString());
                hashSet.add("application/json");
                HMWebUtil.doSeparateRequest(strReplace, map, (Set<Object>) hashSet, Support.RequestSupport.POST, true, true, (IHMBasicHttpResponseHandler) new a(), new HMHttpConfig[0]);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            th.printStackTrace();
            HMLog.i(RequestTrainingAPI.TAG, Log.getStackTraceString(th), new Object[0]);
            RequestTrainingAPI.x0(th, EventReqTrainingData.DATA_TRAINING_PLANS);
        }
    }

    public class k extends IHMHttpResponseHandler {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public k(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.d(RequestTrainingAPI.TAG, "onCancel " + i, new Object[0]);
            RequestTrainingAPI.w0(i, EventReqTrainingData.DATA_TRAIN_ALL_LIST);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.d(RequestTrainingAPI.TAG, "onCompleted ", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            th.printStackTrace();
            RequestTrainingAPI.x0(th, EventReqTrainingData.DATA_TRAIN_ALL_LIST);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            RequestTrainingAPI.N(this.a, this.b, hMHttpResponseData, EventReqTrainingData.DATA_TRAIN_ALL_LIST);
        }
    }

    public class l implements Callable<Map<String, String>> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<String, String> call() throws Exception {
            return HMWebUtil.getSystemHeader();
        }
    }

    public class m extends IHMHttpResponseHandler {
        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.d(RequestTrainingAPI.TAG, "onCancel " + i, new Object[0]);
            RequestTrainingAPI.w0(i, EventReqTrainingData.DATA_TRAINING_PLANS_EXIT);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.d(RequestTrainingAPI.TAG, "onCompleted ", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            th.printStackTrace();
            RequestTrainingAPI.x0(th, EventReqTrainingData.DATA_TRAINING_PLANS_EXIT);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            hMHttpResponseData.setTag(String.valueOf(false));
            RequestTrainingAPI.z0(hMHttpResponseData, EventReqTrainingData.DATA_TRAINING_PLANS_EXIT);
        }
    }

    public class n extends IHMHttpResponseHandler {
        public final /* synthetic */ TrainingCourse[] a;

        public n(TrainingCourse[] trainingCourseArr) {
            this.a = trainingCourseArr;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.d(RequestTrainingAPI.TAG, "onCancel " + i, new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.d(RequestTrainingAPI.TAG, "onCompleted ", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            th.printStackTrace();
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess()) {
                this.a[0] = (TrainingCourse) ParseJsonUtil.parse2Object(new String(hMHttpResponseData.getResponseBody()), EventReqTrainingData.DATA_TRAINING_PLAN_VIEWDETAIL.type);
            }
        }
    }

    public class o extends IHMHttpResponseHandler {
        public final /* synthetic */ TrainingHistoryListData[] a;
        public final /* synthetic */ Long b;
        public final /* synthetic */ Long c;
        public final /* synthetic */ int d;

        public o(TrainingHistoryListData[] trainingHistoryListDataArr, Long l, Long l2, int i) {
            this.a = trainingHistoryListDataArr;
            this.b = l;
            this.c = l2;
            this.d = i;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.d(RequestTrainingAPI.TAG, "onCancel " + i, new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.d(RequestTrainingAPI.TAG, "onCompleted ", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            th.printStackTrace();
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess()) {
                String str = new String(hMHttpResponseData.getResponseBody());
                this.a[0] = (TrainingHistoryListData) ParseJsonUtil.parse2Object(str, EventReqTrainingData.DATA_TRAINING_HISTORY_LIST.type);
                HMLog.d(RequestTrainingAPI.TAG, String.format(Locale.getDefault(), "请求训练历史记录列表网络数据[startTime:%s][endTime:%s][limit:%d]，返回的json：%s\n", String.valueOf(this.b), String.valueOf(this.c), Integer.valueOf(this.d), str), new Object[0]);
            }
        }
    }

    public class p extends IHMHttpResponseHandler {
        public final /* synthetic */ TrainingRecordStatInfo[] a;

        public p(TrainingRecordStatInfo[] trainingRecordStatInfoArr) {
            this.a = trainingRecordStatInfoArr;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.d(RequestTrainingAPI.TAG, "onCancel " + i, new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.d(RequestTrainingAPI.TAG, "onCompleted ", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            th.printStackTrace();
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            TrainingStatInfo.OldUserBean oldUserBean;
            if (hMHttpResponseData.isSuccess()) {
                String str = new String(hMHttpResponseData.getResponseBody());
                TrainingStatInfo trainingStatInfo = (TrainingStatInfo) ParseJsonUtil.parse2Object(str, EventReqTrainingData.DATA_TRAINING_HISTORY_STAT.type);
                TrainingRecordStatInfo trainingRecordStatInfo = new TrainingRecordStatInfo();
                if (trainingStatInfo == null || (oldUserBean = trainingStatInfo.oldUser) == null) {
                    trainingRecordStatInfo.totalCount = 0L;
                    trainingRecordStatInfo.totalDuration = 0L;
                    trainingRecordStatInfo.totalConsumption = 0L;
                } else {
                    int i = oldUserBean.finishNumber;
                    trainingRecordStatInfo.totalCount = i > 0 ? i : 0L;
                    long j = oldUserBean.trainingTime;
                    if (j <= 0) {
                        j = 0;
                    }
                    trainingRecordStatInfo.totalDuration = j;
                    int i2 = oldUserBean.accumulationConsumption;
                    trainingRecordStatInfo.totalConsumption = i2 > 0 ? i2 : 0L;
                }
                this.a[0] = trainingRecordStatInfo;
                HMLog.d(RequestTrainingAPI.TAG, String.format(Locale.getDefault(), "请求训练历史记录统计信息网络数据，返回的json：%s", str), new Object[0]);
            }
        }
    }

    public class q extends IHMHttpResponseHandler {
        public final /* synthetic */ TrainingHistoryDetail[] a;

        public q(TrainingHistoryDetail[] trainingHistoryDetailArr) {
            this.a = trainingHistoryDetailArr;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.d(RequestTrainingAPI.TAG, "onCancel " + i, new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.d(RequestTrainingAPI.TAG, "onCompleted ", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            th.printStackTrace();
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess()) {
                this.a[0] = (TrainingHistoryDetail) ParseJsonUtil.parse2Object(new String(hMHttpResponseData.getResponseBody()), EventReqTrainingData.DATA_TRAINING_HISTORY_DETAIL.type);
            }
        }
    }

    public class r extends IHMHttpResponseHandler {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public r(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.d(RequestTrainingAPI.TAG, "onCancel " + i, new Object[0]);
            RequestTrainingAPI.w0(i, EventReqTrainingData.DATA_TRAIN_MINE_LIST);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.d(RequestTrainingAPI.TAG, "onCompleted ", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            th.printStackTrace();
            RequestTrainingAPI.x0(th, EventReqTrainingData.DATA_TRAIN_MINE_LIST);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            RequestTrainingAPI.N(this.a, this.b, hMHttpResponseData, EventReqTrainingData.DATA_TRAIN_MINE_LIST);
        }
    }

    public class s extends IHMHttpResponseHandler {
        public final /* synthetic */ int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public s(int i, String str, String str2) {
            this.a = i;
            this.b = str;
            this.c = str2;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.d(RequestTrainingAPI.TAG, "onCancel " + i, new Object[0]);
            RequestTrainingAPI.w0(i, EventReqTrainingData.DATA_SUBJECT_LIST);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.d(RequestTrainingAPI.TAG, "onCompleted ", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            th.printStackTrace();
            RequestTrainingAPI.x0(th, EventReqTrainingData.DATA_SUBJECT_LIST);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            Bundle bundle = new Bundle();
            bundle.putInt(TrainingConstant.TOPIC_DISPLACE_LOCATION, this.a);
            RequestTrainingAPI.O(this.b, this.c, hMHttpResponseData, EventReqTrainingData.DATA_SUBJECT_LIST, bundle);
        }
    }

    public class t extends IHMHttpResponseHandler {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public t(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.d(RequestTrainingAPI.TAG, "onCancel " + i, new Object[0]);
            RequestTrainingAPI.w0(i, EventReqTrainingData.DATA_TRAIN_DETAIL);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.d(RequestTrainingAPI.TAG, "onCompleted ", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            th.printStackTrace();
            RequestTrainingAPI.x0(th, EventReqTrainingData.DATA_TRAIN_DETAIL);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            RequestTrainingAPI.L(this.a, this.b, hMHttpResponseData, EventReqTrainingData.DATA_TRAIN_DETAIL);
        }
    }

    public class u extends IHMHttpResponseHandler {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public u(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.d(RequestTrainingAPI.TAG, "onCancel " + i, new Object[0]);
            RequestTrainingAPI.w0(i, EventReqTrainingData.DATA_TRAIN_ARTICLE_LIST);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.d(RequestTrainingAPI.TAG, "onCompleted ", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            th.printStackTrace();
            RequestTrainingAPI.x0(th, EventReqTrainingData.DATA_TRAIN_ARTICLE_LIST);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            RequestTrainingAPI.N(this.a, this.b, hMHttpResponseData, EventReqTrainingData.DATA_TRAIN_ARTICLE_LIST);
        }
    }

    public class v extends IHMHttpResponseHandler {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public v(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.d(RequestTrainingAPI.TAG, "onCancel " + i, new Object[0]);
            RequestTrainingAPI.w0(i, EventReqTrainingData.DATA_TRAIN_BANNER_LIST);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.d(RequestTrainingAPI.TAG, "onCompleted ", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            th.printStackTrace();
            RequestTrainingAPI.x0(th, EventReqTrainingData.DATA_TRAIN_BANNER_LIST);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            RequestTrainingAPI.N(this.a, this.b, hMHttpResponseData, EventReqTrainingData.DATA_TRAIN_BANNER_LIST);
        }
    }

    private static void A0(HMHttpResponseData hMHttpResponseData, EventReqTrainingData.MethodType methodType, Bundle bundle) {
        if (hMHttpResponseData.isSuccess()) {
            EventBus.getDefault().post(new EventReqTrainingData(methodType.method, hMHttpResponseData, bundle));
        } else {
            EventBus.getDefault().post(new EventReqTrainingData(methodType.method, (Object) null, bundle));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void B0(HMHttpResponseData hMHttpResponseData, EventReqTrainingData.MethodType methodType) {
        if (hMHttpResponseData.isSuccess()) {
            String str = new String(hMHttpResponseData.getResponseBody());
            HMLog.d(TAG, "load from web onSuccess:" + str, new Object[0]);
            EventBus.getDefault().post(new EventReqTrainingData(methodType.method, (MessageFormatter.c.equals(str) || "[]".equals(str)) ? null : ParseJsonUtil.parse2Object(str, methodType.type)));
            return;
        }
        EventBus.getDefault().post(new EventReqTrainingData(methodType.method, new IllegalStateException("TrainingMethod:" + methodType.method + " . Response code:" + hMHttpResponseData.getStatusCode()), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void L(String str, String str2, HMHttpResponseData hMHttpResponseData, EventReqTrainingData.MethodType methodType) {
        M(str, str2, hMHttpResponseData, methodType, null);
    }

    private static void M(String str, String str2, HMHttpResponseData hMHttpResponseData, EventReqTrainingData.MethodType methodType, Bundle bundle) {
        if (!hMHttpResponseData.isSuccess()) {
            EventBus.getDefault().post(new EventReqTrainingData(methodType.method, (Object) null, bundle));
            return;
        }
        String str3 = new String(hMHttpResponseData.getResponseBody());
        HMLog.d(TAG, "load from web onSuccess:" + str3, new Object[0]);
        if (str2 == null || !str2.equals(str3)) {
            HMLog.d(TAG, "local need update by web:", new Object[0]);
            Object obj = ParseJsonUtil.parse2Object(str3, methodType.type);
            if (isCache) {
                TrainingKeeper.putCache(str, str3);
            }
            EventBus.getDefault().post(new EventReqTrainingData(methodType.method, obj, bundle));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void N(String str, String str2, HMHttpResponseData hMHttpResponseData, EventReqTrainingData.MethodType methodType) {
        O(str, str2, hMHttpResponseData, methodType, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void O(String str, String str2, HMHttpResponseData hMHttpResponseData, EventReqTrainingData.MethodType methodType, Bundle bundle) {
        if (!hMHttpResponseData.isSuccess()) {
            EventBus.getDefault().post(new EventReqTrainingData(methodType.method, (Object) null, bundle));
            return;
        }
        String str3 = new String(hMHttpResponseData.getResponseBody());
        HMLog.d(TAG, "load from web onSuccess:" + str3, new Object[0]);
        if (str2 == null || !str2.equals(str3)) {
            HMLog.d(TAG, "local need update by web:", new Object[0]);
            List listFromItems = ParseJsonUtil.getListFromItems(str3, methodType.type);
            if (isCache) {
                TrainingKeeper.putCache(str, str3);
            }
            EventBus.getDefault().post(new EventReqTrainingData(methodType.method, listFromItems, bundle));
        }
    }

    @Nullable
    private static String P(String str, EventReqTrainingData.MethodType methodType) {
        return Q(str, methodType, null);
    }

    @Nullable
    private static String Q(String str, EventReqTrainingData.MethodType methodType, Bundle bundle) {
        Object obj;
        if (!isCache) {
            return null;
        }
        String cache = TrainingKeeper.getCache(str);
        HMLog.d(TAG, "load from cache onSuccess:" + cache, new Object[0]);
        if (cache == null || (obj = ParseJsonUtil.parse2Object(cache, methodType.type)) == null) {
            return cache;
        }
        EventBus.getDefault().post(new EventReqTrainingData(methodType.method, obj, bundle));
        return cache;
    }

    @Nullable
    private static <T> String R(String str, EventReqTrainingData.MethodType methodType) {
        return S(str, methodType, null);
    }

    @Nullable
    private static <T> String S(String str, EventReqTrainingData.MethodType methodType, Bundle bundle) {
        if (!isCache) {
            return null;
        }
        String cache = TrainingKeeper.getCache(str);
        HMLog.d(TAG, "load from cache onSuccess:" + cache, new Object[0]);
        if (cache == null) {
            return cache;
        }
        EventBus.getDefault().post(new EventReqTrainingData(methodType.method, ParseJsonUtil.getListFromItems(cache, methodType.type), bundle));
        return cache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T(long j2, TrainerInfo trainerInfo) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        String strReplace = HMServerDef.getUrl(s).replace("{trainingPlanId}", String.valueOf(j2)).replace("{userId}", trainerInfo.uid);
        HMLog.d(TAG, "reqExitTrainingPlans url==" + strReplace, new Object[0]);
        HMWebUtil.doRequest(strReplace, systemParams, Support.RequestSupport.DELETE, new m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TrainerInfo U() throws Exception {
        return M.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V(Throwable th) {
        Loggers.getLogger().w(TAG, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void W(long j2, boolean z2, TrainerInfo trainerInfo) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        String strReplace = HMServerDef.getUrl("users/{userId}/joinTrainings/{id}").replace("{id}", String.valueOf(j2)).replace("{userId}", trainerInfo.uid);
        HMLog.d(TAG, "reqJoinTraining url==" + strReplace, new Object[0]);
        HMWebUtil.doRequest(strReplace, systemParams, z2 ? Support.RequestSupport.POST : Support.RequestSupport.DELETE, new c(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TrainerInfo X() throws Exception {
        return M.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Y(Throwable th) {
        Loggers.getLogger().w(TAG, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Z(TrainerInfo trainerInfo) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        String strReplace = HMServerDef.getUrl("users/{userId}/joinedTrainings").replace("{userId}", trainerInfo.uid);
        HMWebUtil.doRequest(strReplace, systemParams, Support.RequestSupport.GET, new r(strReplace, R(strReplace, EventReqTrainingData.DATA_TRAIN_MINE_LIST)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TrainerInfo a0() throws Exception {
        return M.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b0(Throwable th) {
        Loggers.getLogger().w(TAG, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c0(TrainerInfo trainerInfo) {
        HashMap map = new HashMap();
        map.put("gender", Integer.valueOf(trainerInfo.gender));
        map.put(x, TrainerUtil.getTrainerBodyState(trainerInfo));
        String strReplace = HMServerDef.getUrl(j).replace("{userId}", trainerInfo.uid);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.putAll(map);
        String key = TrainingKeeper.getKey(strReplace, map);
        HMWebUtil.doRequest(strReplace, systemParams, Support.RequestSupport.GET, new u(key, R(key, EventReqTrainingData.DATA_TRAIN_ARTICLE_LIST)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TrainerInfo d0() throws Exception {
        return M.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e0(Throwable th) {
        Loggers.getLogger().w(TAG, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f0(TrainerInfo trainerInfo) {
        HashMap map = new HashMap();
        map.put("gender", Integer.valueOf(trainerInfo.gender));
        map.put(x, TrainerUtil.getTrainerBodyState(trainerInfo));
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.putAll(map);
        String strReplace = HMServerDef.getUrl(k).replace("{userId}", trainerInfo.uid);
        String key = TrainingKeeper.getKey(strReplace, map);
        HMWebUtil.doRequest(strReplace, systemParams, Support.RequestSupport.GET, new v(key, R(key, EventReqTrainingData.DATA_TRAIN_BANNER_LIST)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TrainerInfo g0() throws Exception {
        return M.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h0(Throwable th) {
        Loggers.getLogger().w(TAG, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TrainerInfo i0() throws Exception {
        return M.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j0(Throwable th) {
        Loggers.getLogger().w(TAG, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k0(boolean[] zArr, long j2, TrainerInfo trainerInfo) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        String url = HMServerDef.getUrl("trainings/{id}");
        if (zArr != null && zArr.length == 1 && zArr[0]) {
            url = HMServerDef.getUrl(g);
        }
        String strReplace = url.replace("{id}", String.valueOf(j2)).replace("{userId}", trainerInfo.uid);
        HMLog.d(TAG, "reqTrainingDetail url==" + strReplace, new Object[0]);
        HMWebUtil.doRequest(strReplace, systemParams, Support.RequestSupport.GET, new t(strReplace, P(strReplace, EventReqTrainingData.DATA_TRAIN_DETAIL)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l0(int i2, int i3, TrainerInfo trainerInfo) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        HashMap map = new HashMap();
        map.put("limit", Integer.valueOf(i2));
        map.put("next", Integer.valueOf(i3));
        systemParams.putAll(map);
        String strReplace = HMServerDef.getUrl("users/{userId}/trainingKnowledge").replace("{userId}", trainerInfo.uid);
        HMLog.d(TAG, "reqTrainingKnowledge url==" + strReplace, new Object[0]);
        String key = TrainingKeeper.getKey(strReplace, map);
        HMWebUtil.doRequest(strReplace, systemParams, Support.RequestSupport.GET, new i(key, R(key, EventReqTrainingData.DATA_TRAINING_KNOWLEDGE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TrainerInfo m0() throws Exception {
        return M.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n0(Throwable th) {
        Loggers.getLogger().w(TAG, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o0(ReqAllTrainingParam reqAllTrainingParam, boolean z2, TrainerInfo trainerInfo) {
        HashMap map = new HashMap();
        if (reqAllTrainingParam != null) {
            int i2 = reqAllTrainingParam.level;
            if (i2 > 0) {
                map.put("difficultyDegree", Integer.valueOf(i2));
            }
            if (!TextUtils.isEmpty(reqAllTrainingParam.location)) {
                map.put("location", reqAllTrainingParam.location);
            }
            if (!TextUtils.isEmpty(reqAllTrainingParam.instrument)) {
                map.put("instrument", reqAllTrainingParam.instrument);
            }
            map.put("gender", Integer.valueOf(trainerInfo.gender));
            if (!z2) {
                map.put("next", Integer.valueOf(reqAllTrainingParam.next));
            }
            map.put("limit", Integer.valueOf(reqAllTrainingParam.limit));
            map.put("isDetail", Boolean.FALSE);
            map.put("trainingType", "SINGLE_TRAINING,YOGA");
        }
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.putAll(map);
        String url = HMServerDef.getUrl("trainings");
        String key = TrainingKeeper.getKey(url, map);
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.GET, new k(key, R(key, EventReqTrainingData.DATA_TRAIN_ALL_LIST)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TrainerInfo p0() throws Exception {
        return M.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q0(Throwable th) {
        Loggers.getLogger().w(TAG, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TrainingCourse r0(TrainerInfo trainerInfo) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        String strReplace = HMServerDef.getUrl("users/{userId}/trainingPlan").replace("{userId}", trainerInfo.uid);
        HMLog.d(TAG, "reqExitTrainingPlans url==" + strReplace, new Object[0]);
        systemParams.put("isDetail", Boolean.TRUE);
        TrainingCourse[] trainingCourseArr = new TrainingCourse[1];
        HMWebUtil.doRequest(strReplace, systemParams, Support.RequestSupport.GET, true, new n(trainingCourseArr));
        return trainingCourseArr[0];
    }

    public static void reqCollectionTrainList(long j2) {
        HashMap map = new HashMap();
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.putAll(map);
        String strReplace = HMServerDef.getUrl(o).replace("{collectionId}", String.valueOf(j2));
        String key = TrainingKeeper.getKey(strReplace, map);
        HMWebUtil.doRequest(strReplace, systemParams, Support.RequestSupport.GET, new b(key, R(key, EventReqTrainingData.DATA_TRAIN_COLLECTION_LIST)));
    }

    public static boolean reqDeleteTrainingHistoryRecordSync(long j2, long j3) {
        String strReplace = HMServerDef.getUrl(TrainingWebConst.Path.TRAINING_RECORD).replace("{userId}", M.get().uid).replace("{trainingId}", String.valueOf(j2));
        HMLog.d(TAG, "reqJoinTraining url==" + strReplace, new Object[0]);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("finishTime", Long.valueOf(j3));
        HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
        HMWebUtil.doRequest(strReplace, systemParams, Support.RequestSupport.DELETE, true, new d(hMHttpResponseData));
        return hMHttpResponseData.isSuccess();
    }

    public static void reqExitTrainingPlans(final long j2) {
        Observable.fromCallable(new Callable() { // from class: sc6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RequestTrainingAPI.U();
            }
        }).subscribeOn(Schedulers.io()).subscribe(new tc6(new Consumer() { // from class: rc6
            @Override // com.xiaomi.hm.health.training.api.function.Consumer
            public final void accept(Object obj) {
                RequestTrainingAPI.T(j2, (TrainerInfo) obj);
            }
        }), new Action1() { // from class: yc6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                RequestTrainingAPI.V((Throwable) obj);
            }
        });
    }

    public static void reqJoinTraining(final long j2, final boolean z2) {
        Observable.fromCallable(new Callable() { // from class: pc6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RequestTrainingAPI.X();
            }
        }).subscribeOn(Schedulers.io()).subscribe(new tc6(new Consumer() { // from class: cd6
            @Override // com.xiaomi.hm.health.training.api.function.Consumer
            public final void accept(Object obj) {
                RequestTrainingAPI.W(j2, z2, (TrainerInfo) obj);
            }
        }), new Action1() { // from class: xc6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                RequestTrainingAPI.Y((Throwable) obj);
            }
        });
    }

    public static void reqMineTrainList() {
        id6 id6Var = new Consumer() { // from class: id6
            @Override // com.xiaomi.hm.health.training.api.function.Consumer
            public final void accept(Object obj) {
                RequestTrainingAPI.Z((TrainerInfo) obj);
            }
        };
        Observable observableSubscribeOn = Observable.fromCallable(new Callable() { // from class: lc6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RequestTrainingAPI.a0();
            }
        }).subscribeOn(Schedulers.io());
        Objects.requireNonNull(id6Var);
        observableSubscribeOn.subscribe(new tc6(id6Var), new Action1() { // from class: zc6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                RequestTrainingAPI.b0((Throwable) obj);
            }
        });
    }

    public static void reqRecommendArticleList() {
        kd6 kd6Var = new Consumer() { // from class: kd6
            @Override // com.xiaomi.hm.health.training.api.function.Consumer
            public final void accept(Object obj) {
                RequestTrainingAPI.c0((TrainerInfo) obj);
            }
        };
        Observable observableSubscribeOn = Observable.fromCallable(new Callable() { // from class: kc6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RequestTrainingAPI.d0();
            }
        }).subscribeOn(Schedulers.io());
        Objects.requireNonNull(kd6Var);
        observableSubscribeOn.subscribe(new tc6(kd6Var), new Action1() { // from class: uc6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                RequestTrainingAPI.e0((Throwable) obj);
            }
        });
    }

    public static void reqTrainingBannerList() {
        jd6 jd6Var = new Consumer() { // from class: jd6
            @Override // com.xiaomi.hm.health.training.api.function.Consumer
            public final void accept(Object obj) {
                RequestTrainingAPI.f0((TrainerInfo) obj);
            }
        };
        Observable observableSubscribeOn = Observable.fromCallable(new Callable() { // from class: oc6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RequestTrainingAPI.g0();
            }
        }).subscribeOn(Schedulers.io());
        Objects.requireNonNull(jd6Var);
        observableSubscribeOn.subscribe(new tc6(jd6Var), new Action1() { // from class: vc6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                RequestTrainingAPI.h0((Throwable) obj);
            }
        });
    }

    public static void reqTrainingDetail(final long j2, final boolean... zArr) {
        Observable.fromCallable(new Callable() { // from class: nc6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RequestTrainingAPI.i0();
            }
        }).subscribeOn(Schedulers.io()).subscribe(new tc6(new Consumer() { // from class: hd6
            @Override // com.xiaomi.hm.health.training.api.function.Consumer
            public final void accept(Object obj) {
                RequestTrainingAPI.k0(zArr, j2, (TrainerInfo) obj);
            }
        }), new Action1() { // from class: wc6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                RequestTrainingAPI.j0((Throwable) obj);
            }
        });
    }

    public static void reqTrainingDictionaries(String str) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        String strReplace = HMServerDef.getUrl("dictionaries/{type}").replace("{type}", str);
        HMWebUtil.doRequest(strReplace, systemParams, Support.RequestSupport.GET, new a(P(strReplace, EventReqTrainingData.DATA_TRAINING_DICTIONARIES_LIST), str));
    }

    public static TrainingHistoryDetail reqTrainingHistoryDetailSync(long j2, long j3) {
        TrainerInfo trainerInfo = M.get();
        HashMap map = new HashMap();
        map.put("finishTime", Long.valueOf(j3));
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.putAll(map);
        TrainingHistoryDetail[] trainingHistoryDetailArr = new TrainingHistoryDetail[1];
        HMWebUtil.doRequest(HMServerDef.getUrl(TrainingWebConst.Path.TRAINING_RECORD).replace("{userId}", trainerInfo.uid).replace("{trainingId}", String.valueOf(j2)), systemParams, Support.RequestSupport.GET, true, new q(trainingHistoryDetailArr));
        return trainingHistoryDetailArr[0];
    }

    public static TrainingHistoryListData reqTrainingHistoryListSync(Long l2, Long l3, int i2) {
        Bundle bundle = new Bundle();
        TrainerInfo trainerInfo = M.get();
        HashMap map = new HashMap();
        if (i2 > 0) {
            map.put("limit", Integer.valueOf(i2));
        } else {
            map.put("limit", 100000);
        }
        bundle.putInt("limit", i2);
        if (l2 != null) {
            map.put("startTime", l2);
            bundle.putLong("startTime", l2.longValue());
        }
        if (l3 != null) {
            map.put("endTime", l3);
            bundle.putLong("endTime", l3.longValue());
        }
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.putAll(map);
        TrainingHistoryListData[] trainingHistoryListDataArr = new TrainingHistoryListData[1];
        HMWebUtil.doRequest(HMServerDef.getUrl(TrainingWebConst.Path.TRAINING_RECORDS).replace("{userId}", trainerInfo.uid), systemParams, Support.RequestSupport.GET, true, new o(trainingHistoryListDataArr, l2, l3, i2));
        return trainingHistoryListDataArr[0];
    }

    public static TrainingRecordStatInfo reqTrainingHistoryStatSync() {
        TrainingRecordStatInfo[] trainingRecordStatInfoArr = new TrainingRecordStatInfo[1];
        HMWebUtil.doRequest(HMServerDef.getUrl(a).replace("{userId}", M.get().uid), HMWebUtil.getSystemParams(), Support.RequestSupport.GET, true, new p(trainingRecordStatInfoArr));
        return trainingRecordStatInfoArr[0];
    }

    public static void reqTrainingKnowledge(final int i2, final int i3) {
        Observable.fromCallable(new Callable() { // from class: mc6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RequestTrainingAPI.m0();
            }
        }).subscribeOn(Schedulers.io()).subscribe(new tc6(new Consumer() { // from class: gc6
            @Override // com.xiaomi.hm.health.training.api.function.Consumer
            public final void accept(Object obj) {
                RequestTrainingAPI.l0(i2, i3, (TrainerInfo) obj);
            }
        }), new Action1() { // from class: dd6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                RequestTrainingAPI.n0((Throwable) obj);
            }
        });
    }

    public static void reqTrainingList(final ReqAllTrainingParam reqAllTrainingParam, final boolean z2) {
        Observable.fromCallable(new Callable() { // from class: jc6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RequestTrainingAPI.p0();
            }
        }).subscribeOn(Schedulers.io()).subscribe(new tc6(new Consumer() { // from class: fd6
            @Override // com.xiaomi.hm.health.training.api.function.Consumer
            public final void accept(Object obj) {
                RequestTrainingAPI.o0(reqAllTrainingParam, z2, (TrainerInfo) obj);
            }
        }), new Action1() { // from class: ad6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                RequestTrainingAPI.q0((Throwable) obj);
            }
        });
    }

    public static void reqTrainingPlan(String str, String str2, Date date, boolean z2) {
        Observable.fromCallable(new f()).subscribeOn(Schedulers.io()).subscribe((Subscriber) new e(z2, str, str2, date));
    }

    public static void reqTrainingPlans(long j2, Date date) {
        Observable.fromCallable(new l()).subscribeOn(Schedulers.io()).subscribe((Subscriber) new j(j2, date));
    }

    public static Observable<TrainingCourse> reqTrainingPlansDetail() {
        final ld6 ld6Var = new Function() { // from class: ld6
            @Override // com.xiaomi.hm.health.training.api.function.Function
            public final Object apply(Object obj) {
                return RequestTrainingAPI.r0((TrainerInfo) obj);
            }
        };
        Observable observableFromCallable = Observable.fromCallable(new Callable() { // from class: ic6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RequestTrainingAPI.s0();
            }
        });
        Objects.requireNonNull(ld6Var);
        return observableFromCallable.map(new Func1() { // from class: ed6
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return (TrainingCourse) ld6Var.apply((TrainerInfo) obj);
            }
        }).subscribeOn(Schedulers.io());
    }

    public static long reqTrainingRecordSync(TrainingRecord trainingRecord) {
        try {
            Map<String, String> systemHeader = HMWebUtil.getSystemHeader();
            String strReplace = HMServerDef.getUrl("users/{userId}/trainings/{trainingId}").replace("{userId}", M.get().uid).replace("{trainingId}", String.valueOf(trainingRecord.trainingId));
            Long l2 = trainingRecord.trainingPlanId;
            if (l2 != null && l2.longValue() != 0) {
                strReplace = strReplace + "?trainingPlanId=" + trainingRecord.trainingPlanId;
            }
            String string = "";
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isFinished", true);
                jSONObject.put("startTime", trainingRecord.startTime);
                jSONObject.put(EcgData.TIMESTAMP_SERVER_UPDATED, trainingRecord.endTime);
                jSONObject.put("duration", trainingRecord.duration);
                jSONObject.put("isBindingHeartRateBracelet", trainingRecord.hasBoundHrDevice);
                if (!TextUtils.isEmpty(trainingRecord.pause)) {
                    jSONObject.put("pause", trainingRecord.pause);
                }
                Integer num = trainingRecord.trainingPlanDayIndex;
                if (num != null) {
                    jSONObject.put("trainingPlanDayIndex", num);
                }
                Integer num2 = trainingRecord.consumption;
                if (num2 != null && num2.intValue() > 0) {
                    jSONObject.put("consumption", trainingRecord.consumption);
                }
                List<HaveDoneAction> list = trainingRecord.actions;
                if (list != null && !list.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    Iterator<HaveDoneAction> it2 = trainingRecord.getActions().iterator();
                    while (it2.hasNext()) {
                        sb.append(it2.next().actionAudioId);
                        sb.append(",");
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    jSONObject.put("finishedAudioIds", sb.toString());
                }
                List<TrainingHeartRate> list2 = trainingRecord.heartRateList;
                if (list2 != null && !list2.isEmpty()) {
                    JSONObject jSONObject2 = new JSONObject();
                    Iterator<TrainingHeartRate> it3 = trainingRecord.heartRateList.iterator();
                    int i2 = 0;
                    int i3 = 0;
                    while (it3.hasNext()) {
                        int iIntValue = it3.next().heartRate.intValue();
                        i2 += iIntValue;
                        if (iIntValue > i3) {
                            i3 = iIntValue;
                        }
                    }
                    int size = (int) ((i2 * 1.0f) / trainingRecord.heartRateList.size());
                    jSONObject2.put(Constant.KEY_HR_VALUE, trainingRecord.generateHeartRateCsvString());
                    jSONObject2.put("maxHeartRate", i3);
                    jSONObject2.put("averageHeartRate", size);
                    jSONObject2.put("startTime", trainingRecord.startTime);
                    jSONObject.put(ParamKey.heartRateData, jSONObject2);
                }
                String str = trainingRecord.finishedVideos;
                if (str != null && !str.isEmpty()) {
                    try {
                        jSONObject.put("finishedVideos", new JSONArray(trainingRecord.finishedVideos));
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
                string = jSONObject.toString();
                HMLog.d(TAG, "上传训练历史记录 -> putBody : \n" + string, new Object[0]);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
            g gVar = new g(trainingRecord, hMHttpResponseData);
            HashSet hashSet = new HashSet();
            hashSet.add(string);
            hashSet.add("application/json");
            HMWebUtil.doSeparateRequest(strReplace, systemHeader, (Set<Object>) hashSet, Support.RequestSupport.PUT, true, true, (IHMBasicHttpResponseHandler) gVar, new HMHttpConfig[0]);
            if (hMHttpResponseData.isSuccess()) {
                try {
                    return new JSONObject(new String(hMHttpResponseData.getResponseBody())).getLong(ParamKey.createTime);
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
            }
            return -1L;
        } catch (Exception e5) {
            e5.printStackTrace();
            return -1L;
        }
    }

    public static long reqTrainingRecordSyncForTreadmill(TrainingRecord trainingRecord, Trackrecord trackrecord) {
        try {
            Map<String, String> systemHeader = HMWebUtil.getSystemHeader();
            String strReplace = HMServerDef.getUrl("users/{userId}/trainings/{trainingId}").replace("{userId}", M.get().uid).replace("{trainingId}", String.valueOf(trainingRecord.trainingId));
            Long l2 = trainingRecord.trainingPlanId;
            if (l2 != null && l2.longValue() != 0) {
                strReplace = strReplace + "?trainingPlanId=" + trainingRecord.trainingPlanId;
            }
            String string = "";
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isFinished", true);
                jSONObject.put("startTime", trainingRecord.startTime);
                jSONObject.put(EcgData.TIMESTAMP_SERVER_UPDATED, trainingRecord.endTime);
                jSONObject.put("duration", trainingRecord.duration);
                jSONObject.put("isBindingHeartRateBracelet", trainingRecord.hasBoundHrDevice);
                jSONObject.put("distance", trackrecord.getDistance());
                jSONObject.put("source", "run.600.huami.com");
                jSONObject.put("trackId", trackrecord.getTrackid());
                if (!TextUtils.isEmpty(trainingRecord.pause)) {
                    jSONObject.put("pause", trainingRecord.pause);
                }
                Integer num = trainingRecord.trainingPlanDayIndex;
                if (num != null) {
                    jSONObject.put("trainingPlanDayIndex", num);
                }
                Integer num2 = trainingRecord.consumption;
                if (num2 != null && num2.intValue() > 0) {
                    jSONObject.put("consumption", trainingRecord.consumption);
                }
                List<HaveDoneAction> list = trainingRecord.actions;
                if (list != null && !list.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    Iterator<HaveDoneAction> it2 = trainingRecord.getActions().iterator();
                    while (it2.hasNext()) {
                        sb.append(it2.next().actionAudioId);
                        sb.append(",");
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    jSONObject.put("finishedAudioIds", sb.toString());
                }
                List<TrainingHeartRate> list2 = trainingRecord.heartRateList;
                if (list2 != null && !list2.isEmpty()) {
                    JSONObject jSONObject2 = new JSONObject();
                    Iterator<TrainingHeartRate> it3 = trainingRecord.heartRateList.iterator();
                    int i2 = 0;
                    int i3 = 0;
                    while (it3.hasNext()) {
                        int iIntValue = it3.next().heartRate.intValue();
                        i2 += iIntValue;
                        if (iIntValue > i3) {
                            i3 = iIntValue;
                        }
                    }
                    int size = (int) ((i2 * 1.0f) / trainingRecord.heartRateList.size());
                    jSONObject2.put(Constant.KEY_HR_VALUE, trainingRecord.generateHeartRateCsvString());
                    jSONObject2.put("maxHeartRate", i3);
                    jSONObject2.put("averageHeartRate", size);
                    jSONObject2.put("startTime", trainingRecord.startTime);
                    jSONObject.put(ParamKey.heartRateData, jSONObject2);
                }
                String str = trainingRecord.finishedVideos;
                if (str != null && !str.isEmpty()) {
                    try {
                        jSONObject.put("finishedVideos", new JSONArray(trainingRecord.finishedVideos));
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
                string = jSONObject.toString();
                HMLog.d(TAG, "上传训练历史记录 -> putBody : \n" + string, new Object[0]);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
            h hVar = new h(trainingRecord, hMHttpResponseData);
            HashSet hashSet = new HashSet();
            hashSet.add(string);
            hashSet.add("application/json");
            HMWebUtil.doSeparateRequest(strReplace, systemHeader, (Set<Object>) hashSet, Support.RequestSupport.PUT, true, true, (IHMBasicHttpResponseHandler) hVar, new HMHttpConfig[0]);
            if (hMHttpResponseData.isSuccess()) {
                try {
                    return new JSONObject(new String(hMHttpResponseData.getResponseBody())).getLong(ParamKey.createTime);
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
            }
            return -1L;
        } catch (Exception e5) {
            e5.printStackTrace();
            return -1L;
        }
    }

    public static void reqTrainingSubjectList(final boolean z2) {
        Observable.fromCallable(new Callable() { // from class: qc6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RequestTrainingAPI.u0();
            }
        }).subscribeOn(Schedulers.io()).subscribe(new tc6(new Consumer() { // from class: gd6
            @Override // com.xiaomi.hm.health.training.api.function.Consumer
            public final void accept(Object obj) {
                RequestTrainingAPI.t0(z2, (TrainerInfo) obj);
            }
        }), new Action1() { // from class: bd6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                RequestTrainingAPI.v0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TrainerInfo s0() throws Exception {
        return M.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t0(boolean z2, TrainerInfo trainerInfo) {
        HashMap map = new HashMap();
        map.put("gender", Integer.valueOf(trainerInfo.gender));
        map.put(x, TrainerUtil.getTrainerBodyState(trainerInfo));
        map.put("displayLocation", Integer.valueOf(z2 ? 1 : 0));
        map.put("trainingType", "SINGLE_TRAINING,YOGA");
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.putAll(map);
        String strReplace = HMServerDef.getUrl(i).replace("{userId}", trainerInfo.uid);
        String key = TrainingKeeper.getKey(strReplace, map);
        HMWebUtil.doRequest(strReplace, systemParams, Support.RequestSupport.GET, new s(z2 ? 1 : 0, key, R(key, EventReqTrainingData.DATA_SUBJECT_LIST)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TrainerInfo u0() throws Exception {
        return M.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v0(Throwable th) {
        Loggers.getLogger().w(TAG, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void w0(int i2, EventReqTrainingData.MethodType methodType) {
        EventBus.getDefault().post(new EventReqTrainingData(methodType.method, i2, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void x0(Throwable th, EventReqTrainingData.MethodType methodType) {
        EventBus.getDefault().post(new EventReqTrainingData(methodType.method, th, 1));
    }

    private static <T> void y0(HMHttpResponseData hMHttpResponseData, EventReqTrainingData.MethodType methodType) {
        if (!hMHttpResponseData.isSuccess()) {
            EventBus.getDefault().post(new EventReqTrainingData(methodType.method, null));
            return;
        }
        String str = new String(hMHttpResponseData.getResponseBody());
        HMLog.d(TAG, "load from web onSuccess:" + str, new Object[0]);
        EventBus.getDefault().post(new EventReqTrainingData(methodType.method, ParseJsonUtil.getListFromItems(str, methodType.type)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z0(HMHttpResponseData hMHttpResponseData, EventReqTrainingData.MethodType methodType) {
        A0(hMHttpResponseData, methodType, null);
    }
}
