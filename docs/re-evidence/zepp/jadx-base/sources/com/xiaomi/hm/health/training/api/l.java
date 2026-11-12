package com.xiaomi.hm.health.training.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.xiaomi.hm.health.training.api.bean.FilterItem;
import com.xiaomi.hm.health.training.api.bean.HistoryRecodListData;
import com.xiaomi.hm.health.training.api.bean.Items;
import com.xiaomi.hm.health.training.api.bean.Knowledge;
import com.xiaomi.hm.health.training.api.bean.Order;
import com.xiaomi.hm.health.training.api.bean.PaidOrder;
import com.xiaomi.hm.health.training.api.bean.PayOrder;
import com.xiaomi.hm.health.training.api.bean.RankingList;
import com.xiaomi.hm.health.training.api.bean.TrainingItem;
import com.xiaomi.hm.health.training.api.bean.TrainingRecordBody;
import com.xiaomi.hm.health.training.api.bean.VideoPostConfig;
import com.xiaomi.hm.health.training.api.bean.VideoUrls;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import com.xiaomi.hm.health.training.api.entity.PayChannel;
import com.xiaomi.hm.health.training.api.entity.VideoRecord;
import com.xiaomi.hm.health.training.api.entity.VideoUrl;
import com.xiaomi.hm.health.training.api.exception.HttpException;
import com.xiaomi.hm.health.training.api.exception.JsonParseFailException;
import com.xiaomi.hm.health.training.api.exception.WrappedRuntimeException;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
class l implements IWebApi {
    private static final String c = "Train-WebApiImpl";
    private Provider<String> a;
    private Gson b;

    public class a extends TypeToken<Items<Knowledge>> {
        public a() {
        }
    }

    public class b extends TypeToken<RankingList> {
        public b() {
        }
    }

    public class c extends TypeToken<Items<FilterItem>> {
        public c() {
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PayChannel.values().length];
            a = iArr;
            try {
                iArr[PayChannel.ALIPAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[PayChannel.WECHAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class e extends TypeToken<Items<TrainingItem>> {
        public e() {
        }
    }

    public class f extends TypeToken<Items<PaidOrder>> {
        public f() {
        }
    }

    public class g extends TypeToken<Items<TrainingItem>> {
        public g() {
        }
    }

    public class h extends TypeToken<TrainingItem> {
        public h() {
        }
    }

    public class i extends TypeToken<Order> {
        public i() {
        }
    }

    public class j extends TypeToken<VideoUrls> {
        public j() {
        }
    }

    public class k extends TypeToken<TrainingRecordBody> {
        public k() {
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.training.api.l$l, reason: collision with other inner class name */
    public class C1020l extends TypeToken<HistoryRecodListData> {
        public C1020l() {
        }
    }

    public class m extends TypeToken<VideoPostConfig> {
        public m() {
        }
    }

    public l() {
        this.a = new Provider() { // from class: rp8
            @Override // javax.inject.Provider
            public final Object get() {
                return HMServerDef.getHost();
            }
        };
        this.b = com.xiaomi.hm.health.training.api.m.b();
    }

    private Gson b() {
        return this.b;
    }

    private String c(HMHttpResponseData hMHttpResponseData) throws HttpException {
        if (!hMHttpResponseData.isSuccess()) {
            throw new HttpException(hMHttpResponseData.getStatusCode(), hMHttpResponseData.getUrl());
        }
        byte[] responseBody = hMHttpResponseData.getResponseBody();
        return responseBody == null ? "" : new String(responseBody, StandardCharsets.UTF_8);
    }

    private String d(String str) {
        return this.a.get() + str;
    }

    private boolean e(HMHttpResponseData hMHttpResponseData) throws RuntimeException {
        i(hMHttpResponseData);
        return hMHttpResponseData.isSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object f() {
        return "解析支付宝支付信息失败";
    }

    private Items<FilterItem> g(@NonNull String str) {
        return (Items) h(com.xiaomi.hm.health.training.api.m.f(d(TrainingWebConst.Path.DICTIONARIES).replace("{type}", str), null, Support.RequestSupport.GET), new c().getType());
    }

    private <T> T h(HMHttpResponseData hMHttpResponseData, Type type) throws JsonParseFailException, HttpException {
        i(hMHttpResponseData);
        if (!hMHttpResponseData.isSuccess()) {
            throw new HttpException(hMHttpResponseData.getStatusCode(), hMHttpResponseData.getUrl());
        }
        try {
            return (T) b().fromJson(new String(hMHttpResponseData.getResponseBody(), StandardCharsets.UTF_8), type);
        } catch (Exception e2) {
            throw new JsonParseFailException(e2);
        }
    }

    private void i(HMHttpResponseData hMHttpResponseData) throws RuntimeException {
        if (hMHttpResponseData.getError() != null) {
            if (!RuntimeException.class.isAssignableFrom(hMHttpResponseData.getError().getClass())) {
                throw new WrappedRuntimeException(hMHttpResponseData.getError());
            }
            throw ((RuntimeException) hMHttpResponseData.getError());
        }
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    public boolean deleteHistoryRecord(@NonNull String str, @NonNull String str2, long j2) {
        String strReplace = d(TrainingWebConst.Path.TRAINING_RECORD).replace("{userId}", str).replace("{trainingId}", str2);
        HashMap map = new HashMap(1);
        map.put("finishTime", Long.valueOf(j2));
        return e(com.xiaomi.hm.health.training.api.m.f(strReplace, map, Support.RequestSupport.DELETE));
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    public boolean exitTraining(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        String strReplace = d(TrainingWebConst.Path.JOIN_TRAININGS).replace("{userId}", str).replace("{id}", str2);
        HashMap map = new HashMap(1);
        if (str3 != null) {
            map.put(TrainingWebConst.QueryParam.SKUID, str3);
        }
        return e(com.xiaomi.hm.health.training.api.m.f(strReplace, map, Support.RequestSupport.DELETE));
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    @NonNull
    public String generatePayOrder(@NonNull String str, @NonNull PayChannel payChannel, @NonNull String str2, @Nullable String str3) {
        String str4;
        String strReplace = d("users/{userId}/orders").replace("{userId}", str);
        int i2 = d.a[payChannel.ordinal()];
        if (i2 == 1) {
            str4 = TrainingWebConst.Value.PayChannel.ALIPAY;
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException("不支持的支付渠道: " + payChannel);
            }
            str4 = TrainingWebConst.Value.PayChannel.WECHAT;
        }
        PayOrder payOrder = new PayOrder();
        PayOrder.PaymentBean paymentBean = new PayOrder.PaymentBean();
        payOrder.payment = paymentBean;
        paymentBean.payChannel = str4;
        PayOrder.OrderBean orderBean = new PayOrder.OrderBean();
        payOrder.order = orderBean;
        orderBean.description = str3;
        orderBean.items = new ArrayList();
        PayOrder.OrderBean.SkuBean skuBean = new PayOrder.OrderBean.SkuBean();
        skuBean.skuId = str2;
        skuBean.quantity = 1;
        payOrder.order.items.add(skuBean);
        String str5 = ((Order) h(com.xiaomi.hm.health.training.api.m.d(strReplace, b().toJson(payOrder)), new i().getType())).payment.prepaidData;
        if (payChannel == PayChannel.ALIPAY) {
            try {
                return new JSONObject(str5).optString("data");
            } catch (JSONException e2) {
                Loggers.getLogger().w(c, e2, new Supplier() { // from class: com.xiaomi.hm.health.training.api.k
                    @Override // com.xiaomi.hm.health.training.api.function.Supplier
                    public final Object get() {
                        return l.f();
                    }
                });
            }
        }
        return str5;
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    public boolean joinTraining(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        String strReplace = d(TrainingWebConst.Path.JOIN_TRAININGS).replace("{userId}", str).replace("{id}", str2);
        HashMap map = new HashMap(1);
        if (str3 != null) {
            map.put(TrainingWebConst.QueryParam.SKUID, str3);
        }
        return e(com.xiaomi.hm.health.training.api.m.f(strReplace, map, Support.RequestSupport.POST));
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    public Items<FilterItem> loadBodyParts() {
        return g(TrainingWebConst.Value.Dictionary.TRAINING_BODYPART);
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    @NonNull
    public HistoryRecodListData loadHistoryRecords(@NonNull String str, @Nullable Long l, @Nullable Long l2, @Nullable Integer num) {
        String strReplace = d(TrainingWebConst.Path.TRAINING_RECORDS).replace("{userId}", str);
        HashMap map = new HashMap(3);
        if (l != null) {
            map.put("startTime", l);
        }
        if (l2 != null) {
            map.put("endTime", l2);
        }
        if (num != null) {
            map.put("limit", num);
        }
        return (HistoryRecodListData) h(com.xiaomi.hm.health.training.api.m.f(strReplace, map, Support.RequestSupport.GET), new C1020l().getType());
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    public Items<FilterItem> loadInstruments() {
        return g(TrainingWebConst.Value.Dictionary.TRAINING_INSTRUMENT);
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    @NonNull
    public Items<TrainingItem> loadJoinedTrainings(@NonNull String str) {
        return (Items) h(com.xiaomi.hm.health.training.api.m.f(d("users/{userId}/joinedTrainings").replace("{userId}", str), null, Support.RequestSupport.GET), new g().getType());
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    @NonNull
    public Items<PaidOrder> loadPaidOrderList(@NonNull String str, @Nullable Long l, @Nullable String str2, @Nullable Integer num) {
        String strReplace = d("users/{userId}/orders").replace("{userId}", str);
        HashMap map = new HashMap(1);
        if (l != null) {
            map.put("next", l);
        }
        if (str2 != null) {
            map.put(TrainingWebConst.QueryParam.ORDERSTATUS, str2);
        }
        if (num != null) {
            map.put("limit", num);
        }
        return (Items) h(com.xiaomi.hm.health.training.api.m.f(strReplace, map, Support.RequestSupport.GET), new f().getType());
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    public RankingList loadPlayingRankingList(@NonNull String str, @Nullable Integer num) {
        String strD = d(TrainingWebConst.Path.RANKING_LIST);
        HashMap map = new HashMap(2);
        map.put("userId", str);
        map.put("name", TrainingWebConst.Value.Ranking.COURSE_PLAYING);
        int iIntValue = num != null ? num.intValue() : 0;
        map.put("start", Integer.valueOf(iIntValue));
        map.put("end", Integer.valueOf(iIntValue + 15));
        return (RankingList) h(com.xiaomi.hm.health.training.api.m.f(strD, map, Support.RequestSupport.GET), new b().getType());
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    @NonNull
    public TrainingItem loadTrainingDetail(@NonNull String str, @Nullable Boolean bool) {
        String strReplace = d(TrainingWebConst.Path.TRAINING_DETAIL).replace("{id}", str);
        HashMap map = new HashMap(1);
        if (bool != null) {
            map.put("gender", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        return (TrainingItem) h(com.xiaomi.hm.health.training.api.m.f(strReplace, map, Support.RequestSupport.GET), new h().getType());
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    public Items<Knowledge> loadTrainingKnowledge(@NonNull String str, @Nullable Long l, @Nullable Integer num) {
        String strReplace = d(TrainingWebConst.Path.TRAINING_KNOWLEDGE).replace("{userId}", str);
        HashMap map = new HashMap(2);
        if (l != null) {
            map.put("next", l);
        }
        if (num != null) {
            map.put("limit", num);
        }
        return (Items) h(com.xiaomi.hm.health.training.api.m.f(strReplace, map, Support.RequestSupport.GET), new a().getType());
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    @NonNull
    public Items<TrainingItem> loadTrainings(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Long l, @Nullable Integer num, @Nullable String str7, @Nullable Long l2) {
        String strD = d("trainings");
        HashMap map = new HashMap(1);
        if (str != null) {
            map.put("trainingType", str);
        }
        if (str2 != null) {
            map.put("displayLocation", str2);
        }
        if (bool != null) {
            map.put("gender", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (str3 != null) {
            map.put("addressCode", str3);
        }
        if (str4 != null) {
            map.put("difficultyDegree", str4);
        }
        if (str5 != null) {
            map.put("location", str5);
        }
        if (str6 != null) {
            map.put("instrument", str6);
        }
        if (l != null) {
            map.put("next", l);
        }
        if (num != null) {
            map.put("limit", num);
        }
        if (str7 != null) {
            map.put("partnerId", str7);
        }
        if (l2 != null) {
            map.put("trainingId", l2);
        }
        return (Items) h(com.xiaomi.hm.health.training.api.m.f(strD, map, Support.RequestSupport.GET), new e().getType());
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    public VideoPostConfig loadVideoPost() {
        String strD = d(TrainingWebConst.Path.SETTINGS);
        HashMap map = new HashMap(3);
        map.put("settingName", TrainingWebConst.Value.Settings.VIDEO_IMAGE_POST);
        map.put("mode", "RANGE");
        return (VideoPostConfig) h(com.xiaomi.hm.health.training.api.m.f(strD, map, Support.RequestSupport.GET), new m().getType());
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    public List<VideoUrl> loadVideoUrls(@NonNull String str, @NonNull String str2, @NonNull List<String> list) {
        String strReplace = d(TrainingWebConst.Path.VIDEO_URLS).replace("{userId}", str).replace("{productId}", str2);
        HashMap map = new HashMap(1);
        map.put(TrainingWebConst.QueryParam.DELIVERY_ID, TextUtils.join(",", list));
        map.put(TrainingWebConst.QueryParam.VIDEO_FORMAT, TrainingWebConst.Value.VideoFormat.MP4);
        map.put(TrainingWebConst.QueryParam.STREAM_TYPE, "video");
        map.put(TrainingWebConst.QueryParam.DEFINITION, TrainingWebConst.Value.Definition.LD);
        VideoUrls videoUrls = (VideoUrls) h(com.xiaomi.hm.health.training.api.m.f(strReplace, map, Support.RequestSupport.GET), new j().getType());
        ArrayList arrayList = new ArrayList();
        if (videoUrls.deliveryContent != null) {
            Iterator<String> it2 = list.iterator();
            Iterator<VideoUrls.Url> it3 = videoUrls.deliveryContent.iterator();
            while (it2.hasNext() && it3.hasNext()) {
                VideoUrl videoUrl = new VideoUrl();
                videoUrl.videoId = it2.next();
                videoUrl.playUrl = it3.next().playUrl;
                arrayList.add(videoUrl);
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.hm.health.training.api.IWebApi
    public long uploadHistoryRecord(@NonNull String str, @NonNull String str2, long j2, long j3, long j4, long j5, @Nullable List<VideoRecord> list) {
        String strReplace = d(TrainingWebConst.Path.SAVE_TRAINING_RECORD).replace("{userId}", str).replace("{trainingId}", str2);
        TrainingRecordBody trainingRecordBody = new TrainingRecordBody();
        trainingRecordBody.isFinished = true;
        trainingRecordBody.startTime = j2;
        trainingRecordBody.endTime = j3;
        trainingRecordBody.duration = j4;
        trainingRecordBody.consumption = j5;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (VideoRecord videoRecord : list) {
                TrainingRecordBody.FinishedVideo finishedVideo = new TrainingRecordBody.FinishedVideo();
                finishedVideo.id = videoRecord.id;
                finishedVideo.watchedCount = videoRecord.watchedCount;
                arrayList.add(finishedVideo);
            }
            trainingRecordBody.finishedVideos = arrayList;
        }
        return ((TrainingRecordBody) h(com.xiaomi.hm.health.training.api.m.e(strReplace, b().toJson(trainingRecordBody)), new k().getType())).syncTime.longValue();
    }

    @VisibleForTesting
    public l(Provider<String> provider, Gson gson) {
        this.a = provider;
        this.b = gson;
    }
}
