package com.xiaomi.hm.health.bodyfat.manager;

import android.text.TextUtils;
import android.util.Base64;
import androidx.p008lifecycle.LiveData;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.twitter.sdk.android.core.identity.AuthHandler;
import com.xiaomi.hm.health.bodyfat.event.EventFromServerWeightInfos;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.model.SyncResult;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bodyfat.webapi.WeightInfoApi;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.databases.LiveDataSupportKt;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import org.greenrobot.greendao.Property;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes19.dex */
public class WeightInfoManager {
    private static final String d = "Weight-WeightInfoManager";
    private static WeightInfoManager e;
    private Set<WeightChangeListener> a = new HashSet();
    private WeightAdvData b;
    private WeightInfos c;

    public class a extends IHMHttpResponseHandler {
        public final /* synthetic */ List a;

        public a(List list) {
            this.a = list;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMLog.d(WeightInfoManager.d, "Sync WeightInfos To Server Failure!!", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess()) {
                WeightInfoManager.this.u(this.a);
            } else {
                HMLog.d(WeightInfoManager.d, "Sync No Owner WeightInfos To Server Failure!!", new Object[0]);
            }
        }
    }

    public class b extends IHMHttpResponseHandler {
        public final /* synthetic */ SyncResult a;
        public final /* synthetic */ List b;

        public b(SyncResult syncResult, List list) {
            this.a = syncResult;
            this.b = list;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMLog.i(WeightInfoManager.d, "Sync Deleted WeightInfos To Server Failure!!", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            if (!hMHttpResponseData.isSuccess()) {
                HMLog.i(WeightInfoManager.d, "Sync Deleted WeightInfos To Server failure!!", new Object[0]);
                return;
            }
            String str = new String(hMHttpResponseData.getResponseBody());
            HMLog.d(WeightInfoManager.d, "Response : " + str, new Object[0]);
            if (!WebResponse.parse(str).success()) {
                HMLog.i(WeightInfoManager.d, "Sync Deleted WeightInfos To Server failure!!", new Object[0]);
                return;
            }
            HMLog.i(WeightInfoManager.d, "Result OK!!", new Object[0]);
            HMLog.i(WeightInfoManager.d, "Sync Deleted WeightInfos To Server Success!!", new Object[0]);
            this.a.result = true;
            WeightInfoManager.this.u(this.b);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (WeightInfos weightInfos : this.b) {
                if (HMWeightUtils.isSelf(weightInfos.getUserId().toString())) {
                    if (weightInfos.getHeartRate() > 0) {
                        arrayList.add(Long.valueOf(ExtentionUtilsKt.millsToSecond(weightInfos.getTimestamp().longValue(), false)));
                    }
                    if (weightInfos.getPressure() > 0) {
                        arrayList2.add(Long.valueOf(ExtentionUtilsKt.millsToSecond(weightInfos.getTimestamp().longValue(), true)));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                BFCallback.getInstance().deleteHeart(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            BFCallback.getInstance().deleteStress(arrayList2);
        }
    }

    public class c extends HMWeightUtils.SyncCallback {
        public final /* synthetic */ HMWeightUtils.SyncCallback a;
        public final /* synthetic */ long b;
        public final /* synthetic */ UserInfos c;

        public c(HMWeightUtils.SyncCallback syncCallback, long j, UserInfos userInfos) {
            this.a = syncCallback;
            this.b = j;
            this.c = userInfos;
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils.SyncCallback
        public void onCancel() {
            HMLog.i(WeightInfoManager.d, "Sync weightInfos from server ,onCancel ! ", new Object[0]);
            HMWeightUtils.SyncCallback syncCallback = this.a;
            if (syncCallback != null) {
                syncCallback.onCancel();
            }
            EventBus.getDefault().post(new EventFromServerWeightInfos(this.b, false));
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils.SyncCallback
        public void onFailure() {
            HMLog.i(WeightInfoManager.d, "Sync weightInfos from server ,onFailure ! ", new Object[0]);
            HMWeightUtils.SyncCallback syncCallback = this.a;
            if (syncCallback != null) {
                syncCallback.onFailure();
            }
            EventBus.getDefault().post(new EventFromServerWeightInfos(this.b, false));
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils.SyncCallback
        public void onSuccess() {
            HMLog.i(WeightInfoManager.d, "Sync weightInfos from server ,onSuccess ! ", new Object[0]);
            this.c.setDownloaded(Boolean.TRUE);
            UserInfoManager.getManager().updateInfo(this.c, false);
            HMLog.v(WeightInfoManager.d, UserInfoManager.getManager().getSelf().getDownloaded().toString(), new Object[0]);
            HMWeightUtils.SyncCallback syncCallback = this.a;
            if (syncCallback != null) {
                syncCallback.onSuccess();
            }
            EventBus.getDefault().post(new EventFromServerWeightInfos(this.b, true));
        }
    }

    public class d extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ long[] a;
        public final /* synthetic */ List b;
        public final /* synthetic */ SyncResult c;
        public final /* synthetic */ long d;
        public final /* synthetic */ HMWeightUtils.SyncCallback e;

        public d(long[] jArr, List list, SyncResult syncResult, long j, HMWeightUtils.SyncCallback syncCallback) {
            this.a = jArr;
            this.b = list;
            this.c = syncResult;
            this.d = j;
            this.e = syncCallback;
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            this.a[0] = 0;
            this.c.result = false;
            HMWeightUtils.SyncCallback syncCallback = this.e;
            if (syncCallback != null) {
                if (i == 4) {
                    syncCallback.onFailure();
                } else if (i == 3) {
                    syncCallback.onCancel();
                }
            }
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            this.a[0] = 0;
            this.c.result = false;
            HMWeightUtils.SyncCallback syncCallback = this.e;
            if (syncCallback != null) {
                syncCallback.onFailure();
            }
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            HMWeightUtils.SyncCallback syncCallback;
            this.a[0] = 0;
            byte[] responseBody = hMHttpResponseData.getResponseBody();
            if (responseBody != null) {
                String str = new String(responseBody);
                HMLog.i(WeightInfoManager.d, "Response : " + str, new Object[0]);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<WeightInfos> infos = WeightInfoManager.this.parseInfos(jSONObject.getJSONArray("items"));
                    if (infos != null && !infos.isEmpty()) {
                        this.b.addAll(infos);
                    }
                    if (jSONObject.has("next")) {
                        this.a[0] = jSONObject.getLong("next");
                        return;
                    }
                    this.c.result = true;
                    boolean zQ = WeightInfoManager.this.q(this.d, this.b);
                    HMLog.i(WeightInfoManager.d, "insert is Success = " + zQ, new Object[0]);
                    if (!zQ || (syncCallback = this.e) == null) {
                        return;
                    }
                    syncCallback.onSuccess();
                } catch (JSONException e) {
                    e.printStackTrace();
                    this.c.result = false;
                    HMWeightUtils.SyncCallback syncCallback2 = this.e;
                    if (syncCallback2 != null) {
                        syncCallback2.onFailure();
                    }
                }
            }
        }
    }

    private WeightInfoManager() {
    }

    private boolean A(float f) {
        return f <= 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(WeightInfos weightInfos, Subscriber subscriber) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(weightInfos);
        syncInfosDeletedToServer(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String C(Throwable th) {
        return "请求云端接口删除体重信息处理失败:  " + th.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D(final Throwable th) {
        HMLog.warn(d, new Function0() { // from class: bt8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WeightInfoManager.C(th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List E(long j, int i, Property property) {
        return WeightInfoRepository.INSTANCE.getInstance().getWeightInfosByProperty(j, i, property);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String I(Exception exc) {
        return "timeZone = " + exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String J(Exception exc) {
        return "get weight info score exception > " + exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String K(Exception exc) {
        return "deviceSource = " + exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String L(WeightInfos weightInfos) {
        return "parse weight : " + HMWeightUtils.toString(weightInfos);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(List list, Subscriber subscriber) {
        T(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String N(Throwable th) {
        return "请求云端接口更新体重信息处理失败:  " + th.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O(final Throwable th) {
        HMLog.warn(d, new Function0() { // from class: ct8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WeightInfoManager.N(th);
            }
        });
    }

    private void P(WeightInfos... weightInfosArr) {
        Iterator<WeightChangeListener> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().onDelete(weightInfosArr);
        }
    }

    private void Q(WeightInfos... weightInfosArr) {
        Iterator<WeightChangeListener> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().onUpdate(weightInfosArr);
        }
    }

    private List<WeightInfos> R() {
        return WeightInfoRepository.INSTANCE.getInstance().getWeightInfosDelete(0);
    }

    private List<WeightInfos> S() {
        return WeightInfoRepository.INSTANCE.getInstance().getWeightInfosNeedSync(0);
    }

    private boolean T(List<WeightInfos> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        List<WeightInfos> listOwnerRecords = WeightSyncUtilsKt.ownerRecords(list);
        U(WeightSyncUtilsKt.noOwnerRecords(list));
        return WeightInfoRemoteRepository.INSTANCE.getInstance().uploadWeightInfos(listOwnerRecords);
    }

    private void U(List<WeightInfos> list) {
        Map<String, List<WeightInfos>> mapGroupNoOwnerUserByMac = WeightSyncUtilsKt.groupNoOwnerUserByMac(list);
        for (String str : mapGroupNoOwnerUserByMac.keySet()) {
            List<WeightInfos> list2 = mapGroupNoOwnerUserByMac.get(str);
            if (list2 != null && !list2.isEmpty()) {
                WeightInfoApi.syncNoOwnerDataToServer(str, Z(list2), new a(list2));
            }
        }
    }

    private void V(WeightInfos weightInfos) {
        W(weightInfos, false);
    }

    private void W(WeightInfos weightInfos, boolean z) {
        HMLog.i(d, "Update Info : " + HMWeightUtils.toString(weightInfos) + ", markUpdated : " + z, new Object[0]);
        if (z && weightInfos.getSync().intValue() == 1) {
            weightInfos.setSync(0);
        }
        WeightInfoRepository.INSTANCE.getInstance().updateWeightInfo(weightInfos);
        Q(weightInfos);
    }

    private boolean X(List<WeightInfos> list) {
        boolean z = false;
        HMLog.i(d, "Update Infos : " + list.size(), new Object[0]);
        try {
            WeightInfoRepository.INSTANCE.getInstance().updateWeightInfos(list);
            try {
                Q((WeightInfos[]) list.toArray(new WeightInfos[0]));
                return true;
            } catch (Exception e2) {
                e = e2;
                z = true;
                e.printStackTrace();
                return z;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    private void Y(final List<WeightInfos> list) {
        Observable.unsafeCreate(new Observable.OnSubscribe() { // from class: rs8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.M(list, (Subscriber) obj);
            }
        }).subscribeOn(Schedulers.io()).subscribe(Actions.empty(), new Action1() { // from class: ss8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                WeightInfoManager.O((Throwable) obj);
            }
        });
    }

    private String Z(List<WeightInfos> list) {
        String string;
        try {
            JSONArray jSONArray = new JSONArray();
            for (WeightInfos weightInfos : list) {
                JSONObject jSONObject = new JSONObject();
                if (weightInfos.getTimestamp() != null) {
                    jSONObject.put("generatedTime", ExtentionUtilsKt.millsToSecond(weightInfos.getTimestamp().longValue(), false));
                }
                if (weightInfos.getWeight() != null) {
                    jSONObject.put("weight", weightInfos.getWeight());
                }
                jSONObject.put(ParamKey.singleStress, weightInfos.getPressure());
                if (weightInfos.getImpedance() != null) {
                    jSONObject.put(ParamKey.impedance, weightInfos.getImpedance());
                }
                if (weightInfos.getEncryptImpedance() != null) {
                    jSONObject.put("encryptImpedance", weightInfos.getEncryptImpedance());
                }
                jSONObject.put(ParamKey.heartRateData, Base64.encodeToString(new byte[]{(byte) weightInfos.getHeartRate()}, 2));
                jSONArray.put(jSONObject);
            }
            string = jSONArray.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            string = "";
        }
        HMLog.d(d, "Sync WeightInfos : " + string, new Object[0]);
        return string;
    }

    private String a0(List<WeightInfos> list) {
        String string;
        long j = Long.parseLong(BFCallback.getHMPersonInfo().getUserid());
        try {
            JSONArray jSONArray = new JSONArray();
            for (WeightInfos weightInfos : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("fuid", weightInfos.getUserId());
                jSONObject.put("wt", weightInfos.getWeight());
                jSONObject.put(AuthHandler.d, weightInfos.getTimestamp().longValue() / 1000);
                if (!TextUtils.isEmpty(weightInfos.getDevice_id())) {
                    jSONObject.put("did", weightInfos.getDevice_id());
                }
                jSONObject.put("uid", String.valueOf(j));
                int i = 1;
                jSONObject.put("dt", 1);
                jSONObject.put("ht", UserInfoManager.getManager().getInfo(weightInfos.getUserId().longValue()).getHeight());
                jSONObject.put("ofmt", weightInfos.getOfmt());
                if (weightInfos.getType() != null) {
                    int iIntValue = weightInfos.getType().intValue();
                    if (iIntValue == 1) {
                        i = 2;
                    } else if (iIntValue != 2) {
                        i = iIntValue;
                    }
                    jSONObject.put("wdt", i);
                }
                if (weightInfos.getBmi() != null) {
                    jSONObject.put("bmi", weightInfos.getBmi());
                }
                if (weightInfos.getSource() != null || (!BFCallback.getHMDeviceManager().hasBound(HMDeviceSource.WEIGHT) && BFCallback.getHMDeviceManager().hasBound(HMDeviceType.WEIGHT))) {
                    if (weightInfos.getMoisture() != null) {
                        jSONObject.put("bwr", weightInfos.getMoisture());
                    }
                    if (weightInfos.getMuscle() != null) {
                        jSONObject.put("mr", weightInfos.getMuscle());
                    }
                    if (weightInfos.getBasal_metabolism() != null) {
                        jSONObject.put("ml", weightInfos.getBasal_metabolism());
                    }
                    if (weightInfos.getBody_fat() != null) {
                        jSONObject.put("fr", weightInfos.getBody_fat());
                    }
                    if (weightInfos.getBone_mass() != null) {
                        jSONObject.put("bw", weightInfos.getBone_mass());
                    }
                    if (weightInfos.getVisceral_fat() != null) {
                        jSONObject.put("vf", weightInfos.getVisceral_fat());
                    }
                    if (weightInfos.getImpedance() != null) {
                        jSONObject.put("im", weightInfos.getImpedance());
                    }
                    if (weightInfos.getScore() != null) {
                        jSONObject.put("bs", weightInfos.getScore());
                    }
                    if (weightInfos.getBody_shape_type() != null) {
                        jSONObject.put("bt", weightInfos.getBody_shape_type());
                    }
                    if (weightInfos.getSource() != null) {
                        jSONObject.put("src", weightInfos.getSource());
                    }
                    if (weightInfos.getMa() != null) {
                        jSONObject.put(ParamKey.muscleAge, weightInfos.getMa());
                    }
                    if (weightInfos.getPmr() != null) {
                        jSONObject.put(ParamKey.proteinRatio, weightInfos.getPmr());
                    }
                    if (weightInfos.getSbw() != null) {
                        jSONObject.put(ParamKey.standBodyWeight, weightInfos.getSbw());
                    }
                    jSONArray.put(jSONObject);
                } else {
                    jSONObject.put("src", HMDeviceType.WEIGHT.getValue());
                    jSONArray.put(jSONObject);
                }
            }
            string = jSONArray.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            string = "";
        }
        HMLog.d(d, "Sync WeightInfos : " + string, new Object[0]);
        return string;
    }

    private String b0(List<WeightInfos> list) {
        String string;
        try {
            JSONArray jSONArray = new JSONArray();
            for (WeightInfos weightInfos : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AuthHandler.d, weightInfos.getTimestamp().longValue() / 1000);
                jSONObject.put("fuid", weightInfos.getUserId());
                jSONArray.put(jSONObject);
            }
            string = jSONArray.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            string = "";
        }
        HMLog.d(d, "Sync Deleted WeightInfos : " + string, new Object[0]);
        return string;
    }

    public static WeightInfoManager getManager() {
        if (e == null) {
            e = new WeightInfoManager();
        }
        return e;
    }

    public static boolean isInfoUncertainDelete(WeightInfos weightInfos) {
        HMLog.d(d, "weight = " + weightInfos, new Object[0]);
        StringBuilder sb = new StringBuilder();
        sb.append("weight = ");
        sb.append(weightInfos == null ? "" : weightInfos.getSync());
        HMLog.d(d, sb.toString(), new Object[0]);
        return weightInfos != null && weightInfos.getSync().intValue() == -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q(long j, List<WeightInfos> list) {
        WeightInfos latestInfo;
        HMLog.v("getUserinfos", j + "-list size=" + list.size(), new Object[0]);
        boolean z = true;
        if (list.size() == 0) {
            return true;
        }
        try {
            WeightInfoRepository.INSTANCE.getInstance().addWeightInfos(list);
            notifyDataInsert((WeightInfos[]) list.toArray(new WeightInfos[0]));
        } catch (Exception e2) {
            e2.printStackTrace();
            z = false;
        }
        if (z && HMWeightUtils.isSelf(String.valueOf(j)) && (latestInfo = getLatestInfo(-1L)) != null) {
            float fFloatValue = latestInfo.getWeight().floatValue();
            HMLog.d(d, " weight = " + fFloatValue, new Object[0]);
            if (fFloatValue > 0.0f) {
                BFCallback.getHMPersonInfo().saveWeight(fFloatValue);
            } else {
                HMLog.i(d, "when update userinfo weight , but weight <=0, return !!", new Object[0]);
            }
        }
        return z;
    }

    private boolean r(long j) {
        return WeightInfoRepository.INSTANCE.getInstance().compareWithSeverTime(j) == 0;
    }

    private void s(final WeightInfos weightInfos) {
        Observable.unsafeCreate(new Observable.OnSubscribe() { // from class: qs8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.B(weightInfos, (Subscriber) obj);
            }
        }).subscribeOn(Schedulers.io()).subscribe(Actions.empty(), new Action1() { // from class: ts8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                WeightInfoManager.D((Throwable) obj);
            }
        });
    }

    private void t(WeightInfos weightInfos) {
        if (weightInfos.getSync().intValue() == 2) {
            weightInfos.setSync(-2);
        } else {
            weightInfos.setSync(-1);
        }
        V(weightInfos);
        s(weightInfos);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean u(List<WeightInfos> list) {
        HMLog.i(d, "Delete Infos Local : " + list.size(), new Object[0]);
        try {
            WeightInfoRepository.INSTANCE.getInstance().deleteWeightInfos(list);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private List<WeightInfos> v(int i) {
        return WeightInfoRepository.INSTANCE.getInstance().getWeightInfosDelete(i);
    }

    private int w() {
        List<WeightInfos> listR = R();
        int size = listR == null ? 0 : listR.size();
        HMLog.d(d, "Get Infos Deleted Count : " + size, new Object[0]);
        return size;
    }

    private List<WeightInfos> x(int i) {
        return WeightInfoRepository.INSTANCE.getInstance().getWeightInfosNeedSync(i);
    }

    private int y() {
        List<WeightInfos> listS = S();
        int size = listS == null ? 0 : listS.size();
        HMLog.d(d, "Get Infos NeedSync Count : " + size, new Object[0]);
        return size;
    }

    private long z(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        WeightInfos latestInfoFromDevice = WeightInfoRepository.INSTANCE.getInstance().getLatestInfoFromDevice(j);
        if (latestInfoFromDevice == null) {
            latestInfoFromDevice = getLatestInfo(j);
        }
        if (latestInfoFromDevice != null) {
            jCurrentTimeMillis = latestInfoFromDevice.getTimestamp().longValue();
        }
        return ExtentionUtilsKt.millsToSecond(jCurrentTimeMillis, false);
    }

    public void addChangeListener(WeightChangeListener weightChangeListener) {
        this.a.add(weightChangeListener);
    }

    public void addInfo(WeightInfos weightInfos) {
        if (A(weightInfos.getWeight().floatValue())) {
            HMLog.i(d, "add wData is invalid . wData = " + weightInfos.getWeight(), new Object[0]);
            return;
        }
        WeightInfoRepository.INSTANCE.getInstance().addWeightInfo(weightInfos);
        if (weightInfos.getSync().intValue() == 0) {
            HMWeightUtils.updateLoginUserWeight(weightInfos);
            ArrayList arrayList = new ArrayList();
            arrayList.add(weightInfos);
            Y(arrayList);
        }
    }

    public void addInfos(List<WeightInfos> list) {
        List<WeightInfos> listAddWeightInfos = WeightInfoRepository.INSTANCE.getInstance().addWeightInfos(list);
        if (listAddWeightInfos.size() > 0) {
            notifyDataInsert((WeightInfos[]) listAddWeightInfos.toArray(new WeightInfos[0]));
            ArrayList arrayList = new ArrayList();
            for (WeightInfos weightInfos : listAddWeightInfos) {
                if (weightInfos.getSync().intValue() == 0) {
                    arrayList.add(weightInfos);
                }
            }
            Y(arrayList);
        }
    }

    public void cleanAllInfosLocal() {
        HMLog.i(d, "Delete All Infos!!", new Object[0]);
        WeightInfoRepository.INSTANCE.getInstance().deleteAll();
    }

    public void deleteInfo(WeightInfos weightInfos) {
        if (weightInfos.getSync().intValue() == 0) {
            deleteInfoLocal(weightInfos);
        } else {
            t(weightInfos);
        }
        P(weightInfos);
    }

    public void deleteInfoLocal(WeightInfos weightInfos) {
        HMLog.i(d, "Delete Info Local : " + HMWeightUtils.toString(weightInfos), new Object[0]);
        WeightInfoRepository.INSTANCE.getInstance().deleteWeightInfo(weightInfos);
    }

    public List<WeightInfos> getBodyFatInfosAsc(long j) {
        return WeightInfoRepository.INSTANCE.getInstance().getBodyFatInfosAsc(j);
    }

    public WeightInfos getFirstWwightInfo(long j) {
        return WeightInfoRepository.INSTANCE.getInstance().getFirstWeightInfo(j);
    }

    public WeightInfos getGuestOneFootInfo() {
        return this.c;
    }

    public WeightAdvData getGuestWeightData() {
        return this.b;
    }

    public WeightInfos getInfo(long j) {
        return getInfo(j, false);
    }

    public List<WeightInfos> getInfosAsc(long j) {
        return WeightInfoRepository.INSTANCE.getInstance().getWeightInfos(j, false);
    }

    public LiveData<List<WeightInfos>> getInfosByLiveData(final long j, final int i, final Property property) {
        return LiveDataSupportKt.queryByLiveData(new String[]{"WEIGHT_INFOS"}, new Function0() { // from class: ps8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WeightInfoManager.E(j, i, property);
            }
        });
    }

    public int getInfosCount(long j) {
        return WeightInfoRepository.INSTANCE.getInstance().getWeightInfosCount(j);
    }

    public List<WeightInfos> getInfosDesc(long j) {
        return WeightInfoRepository.INSTANCE.getInstance().getWeightInfos(j, true);
    }

    public WeightInfos getLatestBdfatInfo(long j) {
        return WeightInfoRepository.INSTANCE.getInstance().getLatestBdfatInfo(j);
    }

    /* JADX INFO: renamed from: getLatestBmiInfos, reason: merged with bridge method [inline-methods] */
    public List<WeightInfos> F(long j, int i) {
        return WeightInfoRepository.INSTANCE.getInstance().getLatestBmiInfos(j, i);
    }

    public LiveData<List<WeightInfos>> getLatestBmiInfosByLiveData(final long j, final int i) {
        return LiveDataSupportKt.queryByLiveData(new String[]{"WEIGHT_INFOS"}, new Function0() { // from class: vs8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.F(j, i);
            }
        });
    }

    /* JADX INFO: renamed from: getLatestBodyScoreInfos, reason: merged with bridge method [inline-methods] */
    public List<WeightInfos> G(long j, int i) {
        return WeightInfoRepository.INSTANCE.getInstance().getLatestBodyScoreInfos(j, i);
    }

    public LiveData<List<WeightInfos>> getLatestBodyScoreInfosByLiveData(final long j, final int i) {
        return LiveDataSupportKt.queryByLiveData(new String[]{"WEIGHT_INFOS"}, new Function0() { // from class: ws8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.G(j, i);
            }
        });
    }

    public WeightInfos getLatestInfo(long j) {
        return WeightInfoRepository.INSTANCE.getInstance().getLatestInfo(j);
    }

    /* JADX INFO: renamed from: getLatestInfos, reason: merged with bridge method [inline-methods] */
    public List<WeightInfos> H(long j, int i) {
        return WeightInfoRepository.INSTANCE.getInstance().getLatestInfos(j, i);
    }

    public LiveData<List<WeightInfos>> getLatestInfosByLiveData(final long j, final int i) {
        return LiveDataSupportKt.queryByLiveData(new String[]{"WEIGHT_INFOS"}, new Function0() { // from class: us8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.H(j, i);
            }
        });
    }

    public List<WeightInfos> getLatestOftInfos(long j, int i) {
        return WeightInfoRepository.INSTANCE.getInstance().getLatestOftInfos(j, i);
    }

    public int getOftInfosCount(long j) {
        return WeightInfoRepository.INSTANCE.getInstance().getOftInfosCount(j);
    }

    public WeightInfos getOftRecordByIndex(long j, int i) {
        return WeightInfoRepository.INSTANCE.getInstance().getOftRecordByIndex(j, i);
    }

    public int getUserWeightCount(long j) {
        return WeightInfoRepository.INSTANCE.getInstance().getUserWeightCount(j);
    }

    public boolean isShowBodyFatPage() {
        if (BFCallback.getHMDeviceManager().hasBoundBfs()) {
            return true;
        }
        long weightInfoBodyFatCount = WeightInfoRepository.INSTANCE.getInstance().getWeightInfoBodyFatCount();
        HMLog.d(d, "size = " + weightInfoBodyFatCount, new Object[0]);
        return weightInfoBodyFatCount > 0;
    }

    public void notifyDataInsert(WeightInfos... weightInfosArr) {
        Iterator<WeightChangeListener> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().onInsert(weightInfosArr);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public List<WeightInfos> parseInfos(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        UserInfoManager manager = UserInfoManager.getManager();
        int i = 0;
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                JSONObject jSONObject2 = jSONObject.getJSONObject("summary");
                final WeightInfos weightInfos = new WeightInfos();
                if (jSONObject2.getDouble("weight") < -2.0d) {
                    HMLog.d(d, "weight data is wrong ,set synced = needDelete , data = " + jSONObject2, new Object[i]);
                    weightInfos.setSync(-1);
                } else {
                    weightInfos.setSync(1);
                }
                long j = jSONObject.getLong("generatedTime");
                if (j < 0) {
                    HMLog.i(d, "timestamp is invalid, filter data = " + j, new Object[i]);
                } else {
                    long j2 = j * 1000;
                    if (HMWeightUtils.checkWeightTimeIsValid(j2)) {
                        HMLog.i(d, "isHasSameTime = " + r(j2), new Object[i]);
                        if (r(j2)) {
                            long j3 = Long.parseLong(jSONObject.getString(ParamKey.memberId));
                            UserInfos info = manager.getInfo(j3);
                            if (info == null) {
                                HMLog.d(d, "weightInfo memberId = " + j3 + " , query userinfo is null , return !!!", new Object[0]);
                            } else {
                                weightInfos.setId(Long.valueOf(j2));
                                weightInfos.setUserId(Long.valueOf(j3));
                                try {
                                    float f = (float) jSONObject2.getDouble("weight");
                                    if (A(f)) {
                                        HMLog.i(d, "weightdata syncing from server is invalid , return ! wData =" + f, new Object[0]);
                                    } else {
                                        weightInfos.setWeight(Float.valueOf(f));
                                        weightInfos.setTimestamp(Long.valueOf(j2));
                                        try {
                                            double d2 = jSONObject2.getDouble(ParamKey.boneMass);
                                            if (d2 > 0.0d) {
                                                weightInfos.setBone_mass(Float.valueOf((float) d2));
                                            }
                                        } catch (Exception e2) {
                                            HMLog.d(d, "boneMass = " + e2, new Object[0]);
                                        }
                                        try {
                                            int i3 = jSONObject2.getInt(ParamKey.metabolism);
                                            if (i3 > 0) {
                                                weightInfos.setBasal_metabolism(Integer.valueOf(i3));
                                            }
                                        } catch (Exception e3) {
                                            HMLog.d(d, "metabolism = " + e3, new Object[0]);
                                        }
                                        try {
                                            double d3 = jSONObject2.getDouble(ParamKey.fatRate);
                                            if (d3 > 0.0d) {
                                                weightInfos.setBody_fat(Float.valueOf((float) d3));
                                            }
                                        } catch (Exception e4) {
                                            HMLog.d(d, "fatRate = " + e4, new Object[0]);
                                        }
                                        try {
                                            double d4 = jSONObject2.getDouble(ParamKey.muscleRate);
                                            if (d4 > 0.0d) {
                                                weightInfos.setMuscle(Float.valueOf((float) d4));
                                            }
                                        } catch (Exception e5) {
                                            HMLog.d(d, "muscleRate = " + e5, new Object[0]);
                                        }
                                        try {
                                            double d5 = jSONObject2.getDouble(ParamKey.visceralFat);
                                            if (d5 > 0.0d) {
                                                weightInfos.setVisceral_fat(Float.valueOf((float) d5));
                                            }
                                        } catch (Exception e6) {
                                            HMLog.d(d, "visceralFat = " + e6, new Object[0]);
                                        }
                                        try {
                                            double d6 = jSONObject2.getDouble(ParamKey.bodyWaterRate);
                                            if (d6 > 0.0d) {
                                                weightInfos.setMoisture(Float.valueOf((float) d6));
                                            }
                                        } catch (Exception e7) {
                                            HMLog.d(d, "bodyWaterRate = " + e7, new Object[0]);
                                        }
                                        try {
                                            String string = jSONObject.getString("deviceId");
                                            if (string != null && !"".equals(string)) {
                                                weightInfos.setDevice_id(string);
                                            }
                                        } catch (Exception e8) {
                                            HMLog.d(d, "deviceId = " + e8, new Object[0]);
                                        }
                                        try {
                                            int i4 = jSONObject.getInt(ParamKey.weightType);
                                            int i5 = 2;
                                            if (i4 != 1) {
                                                i5 = i4 == 2 ? 1 : i4;
                                            }
                                            weightInfos.setType(Integer.valueOf(i5));
                                        } catch (Exception e9) {
                                            HMLog.d(d, "weightType = " + e9, new Object[0]);
                                        }
                                        try {
                                            if (weightInfos.getType().intValue() == 4) {
                                                weightInfos.setOfmt(Float.valueOf(jSONObject2.getInt(ParamKey.bodyBalanceScore)));
                                            } else if (weightInfos.getType().intValue() == 3) {
                                                weightInfos.setOfmt(Float.valueOf((float) jSONObject2.optDouble(ParamKey.oneFootMeasureTime)));
                                            }
                                        } catch (Exception e10) {
                                            weightInfos.setOfmt(Float.valueOf(0.0f));
                                            HMLog.d(d, "ofmt = " + e10, new Object[0]);
                                        }
                                        try {
                                            int i6 = jSONObject2.getInt(ParamKey.impedance);
                                            if (i6 > 0) {
                                                weightInfos.setImpedance(Integer.valueOf(i6));
                                            }
                                        } catch (Exception e11) {
                                            HMLog.d(d, "impedance = " + e11, new Object[0]);
                                        }
                                        try {
                                            int i7 = jSONObject2.getInt("encryptImpedance");
                                            if (i7 > 0) {
                                                weightInfos.setEncryptImpedance(Integer.valueOf(i7));
                                            }
                                        } catch (Exception e12) {
                                            HMLog.d(d, "encryptImpedance = " + e12, new Object[0]);
                                        }
                                        try {
                                            int i8 = jSONObject2.getInt(ParamKey.muscleAge);
                                            if (i8 > 0) {
                                                weightInfos.setMa(Integer.valueOf(i8));
                                            }
                                        } catch (Exception e13) {
                                            HMLog.d(d, "muscle age = " + e13, new Object[0]);
                                        }
                                        try {
                                            float f2 = (float) jSONObject2.getDouble(ParamKey.proteinRatio);
                                            if (f2 > 0.0f) {
                                                weightInfos.setPmr(Float.valueOf(f2));
                                            }
                                        } catch (Exception e14) {
                                            HMLog.d(d, "pmr = " + e14, new Object[0]);
                                        }
                                        try {
                                            float f3 = (float) jSONObject2.getDouble(ParamKey.standBodyWeight);
                                            if (f3 > 0.0f) {
                                                weightInfos.setSbw(Float.valueOf(f3));
                                            }
                                        } catch (Exception e15) {
                                            HMLog.d(d, "stand body weight = " + e15, new Object[0]);
                                        }
                                        int weightAge = BodyParamsUtils.getWeightAge(weightInfos.getTimestamp().longValue(), info.getBirthday());
                                        HMLog.d(d, "weight_age = " + weightAge, new Object[0]);
                                        info.getGender().intValue();
                                        int iIntValue = info.getHeight().intValue();
                                        try {
                                            int i9 = jSONObject2.getInt("height");
                                            if (i9 > 0) {
                                                weightInfos.setHeight(Integer.valueOf(i9));
                                            } else {
                                                weightInfos.setHeight(Integer.valueOf(iIntValue));
                                            }
                                        } catch (Exception e16) {
                                            HMLog.d(d, "height = " + e16, new Object[0]);
                                        }
                                        try {
                                            double d7 = jSONObject2.getDouble("bmi");
                                            if (d7 > 0.0d) {
                                                weightInfos.setBmi(Float.valueOf((float) d7));
                                            } else {
                                                weightInfos.setBmi(Float.valueOf(HMWeightUtils.calcuBMI(weightInfos.getHeight() == null ? weightInfos.getHeight().intValue() : info.getHeight().intValue(), weightInfos.getWeight().floatValue())));
                                            }
                                        } catch (Exception e17) {
                                            HMLog.d(d, "bmi = " + e17, new Object[0]);
                                        }
                                        try {
                                            weightInfos.setBody_shape_type(Integer.valueOf(jSONObject2.getInt(ParamKey.bodyStyle)));
                                        } catch (Exception e18) {
                                            HMLog.d(d, "e1 = " + e18, new Object[0]);
                                            weightInfos.setBody_shape_type(0);
                                        }
                                        try {
                                            weightInfos.setTime_zone(Integer.valueOf(Integer.parseInt(jSONObject2.optString("timeZone", null))));
                                        } catch (Exception e19) {
                                            HMLog.error(d, new Function0() { // from class: at8
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return WeightInfoManager.I(e19);
                                                }
                                            });
                                        }
                                        weightInfos.setSubcutaneousFat((float) jSONObject2.optDouble(ParamKey.subcutaneousFat, 0.0d));
                                        weightInfos.setSkeletalMuscle((float) jSONObject2.optDouble(ParamKey.skeletalMuscle, 0.0d));
                                        weightInfos.setPressure(jSONObject2.optInt(ParamKey.singleStress, 0));
                                        weightInfos.setHeartRate(HMWeightUtils.parseHeartRate(jSONObject2.optString(ParamKey.heartRateData)));
                                        try {
                                            int bodyScore = jSONObject2.has(ParamKey.bodyScore) ? jSONObject2.getInt(ParamKey.bodyScore) : 0;
                                            if (bodyScore <= 0 && weightInfos.getEncryptImpedance() != null && weightInfos.getImpedance() != null) {
                                                bodyScore = BodyParamsUtils.getBodyScore(weightInfos, info, weightAge);
                                            }
                                            if (bodyScore > 0) {
                                                weightInfos.setScore(Integer.valueOf(bodyScore));
                                            }
                                        } catch (Exception e20) {
                                            HMLog.error(d, new Function0() { // from class: zs8
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return WeightInfoManager.J(e20);
                                                }
                                            });
                                        }
                                        try {
                                            int i10 = jSONObject.getInt("deviceSource");
                                            if (i10 > 0) {
                                                weightInfos.setSource(Integer.valueOf(i10));
                                            }
                                        } catch (Exception e21) {
                                            HMLog.error(d, new Function0() { // from class: ys8
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return WeightInfoManager.K(e21);
                                                }
                                            });
                                        }
                                        HMLog.info(d, new Function0() { // from class: xs8
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return WeightInfoManager.L(weightInfos);
                                            }
                                        });
                                        arrayList.add(weightInfos);
                                    }
                                } catch (Exception e22) {
                                    HMLog.d(d, "weight = " + e22, new Object[0]);
                                }
                            }
                        } else {
                            HMLog.i(d, "sync from server weightInfos compare local ,has  Timestamp the same , filter !", new Object[i]);
                        }
                    } else {
                        HMLog.i(d, "timestamp is invalid, filter data = " + j, new Object[i]);
                    }
                }
                i2++;
                i = 0;
            } catch (Exception e23) {
                e23.printStackTrace();
                arrayList = null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("after parser weightsize = ");
        sb.append(arrayList == null ? 0 : arrayList.size());
        HMLog.i(d, sb.toString(), new Object[0]);
        return arrayList;
    }

    public void removeAllChangeListener() {
        this.a.clear();
    }

    public void removeChangeListener(WeightChangeListener weightChangeListener) {
        this.a.remove(weightChangeListener);
    }

    public void setGuestOneFootInfo(WeightInfos weightInfos) {
        this.c = weightInfos;
    }

    public void setGuestWeightData(WeightAdvData weightAdvData) {
        this.b = weightAdvData;
        if (weightAdvData.getMeasureData() == null || weightAdvData.getMeasureData().getImpedance() == -1) {
            return;
        }
        this.b.setImpedance(weightAdvData.getMeasureData().getImpedance());
    }

    public boolean syncInfosDeletedToServer(List<WeightInfos> list) {
        HMLog.d(d, "Sync Deleted WeightInfos To Server!!", new Object[0]);
        if (list == null || list.isEmpty()) {
            return true;
        }
        String strB0 = b0(list);
        SyncResult syncResult = new SyncResult();
        WeightInfoApi.syncDeletedWeightInfosToServer(strB0, new b(syncResult, list));
        return syncResult.result;
    }

    public boolean syncInfosNeedSyncAndDeletedWithServer() {
        int iY = y();
        int i = iY % 50 == 0 ? iY / 50 : (iY / 50) + 1;
        HMLog.d(d, "totalNeedSyncCount = " + iY + " , retryCount = " + i, new Object[0]);
        boolean zSyncInfosDeletedToServer = true;
        while (i > 0) {
            HMLog.d(d, "retryCount = " + i, new Object[0]);
            List<WeightInfos> listX = x(50);
            StringBuilder sb = new StringBuilder();
            sb.append("Need Sync WeightInfos to Server , size = ");
            sb.append(listX == null ? 0 : listX.size());
            HMLog.d(d, sb.toString(), new Object[0]);
            if (listX != null && !listX.isEmpty()) {
                zSyncInfosDeletedToServer &= T(listX);
            }
            i--;
        }
        int iW = w();
        int i2 = iW % 50 == 0 ? iW / 50 : 1 + (iW / 50);
        HMLog.d(d, "totalNeedDeleteCount = " + iW + " , retryCount = " + i2, new Object[0]);
        while (i2 > 0) {
            HMLog.d(d, "retryCount = " + i2, new Object[0]);
            List<WeightInfos> listV = v(50);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Need Sync Delete WeightInfos to Server , size = ");
            sb2.append(listV == null ? 0 : listV.size());
            HMLog.d(d, sb2.toString(), new Object[0]);
            if (listV != null && !listV.isEmpty()) {
                zSyncInfosDeletedToServer = syncInfosDeletedToServer(listV) & zSyncInfosDeletedToServer;
            }
            i2--;
        }
        return zSyncInfosDeletedToServer;
    }

    public boolean syncInfosToLocal(long j, long j2, HMWeightUtils.SyncCallback syncCallback) {
        HMLog.d(d, "Sync WeightInfos To Local!!", new Object[0]);
        SyncResult syncResult = new SyncResult();
        ArrayList arrayList = new ArrayList();
        long[] jArr = {-1};
        while (jArr[0] != 0) {
            WeightInfoApi.syncWeightInfosToLocal(j2, jArr[0], j, new d(jArr, arrayList, syncResult, j, syncCallback));
        }
        HMLog.i(d, "while is finish !", new Object[0]);
        return syncResult.result;
    }

    public boolean syncInfosWithServer(long j, HMWeightUtils.SyncCallback syncCallback) {
        UserInfos info = UserInfoManager.getManager().getInfo(j);
        if (info == null) {
            return false;
        }
        boolean z = info.getDownloaded() == null || !info.getDownloaded().booleanValue();
        long jZ = z ? -1L : z(j);
        HMLog.d(d, "Sync weightInfos from server, needSyncFlag = " + z + ", userId = " + j, new Object[0]);
        if (syncCallback != null) {
            syncCallback.onStart();
        }
        return syncInfosToLocal(j, jZ, new c(syncCallback, j, info));
    }

    public WeightInfos getInfo(long j, boolean z) {
        return WeightInfoRepository.INSTANCE.getInstance().getWeightInfoByTimestamp(j, z);
    }

    public WeightInfos getLatestInfo() {
        return WeightInfoRepository.INSTANCE.getInstance().getLatestInfo();
    }

    public List<WeightInfos> getLatestOftInfos(long j) {
        return WeightInfoRepository.INSTANCE.getInstance().getOftInfos(j);
    }
}
