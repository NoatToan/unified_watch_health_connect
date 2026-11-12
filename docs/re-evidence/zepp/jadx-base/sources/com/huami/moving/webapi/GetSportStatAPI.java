package com.huami.moving.webapi;

import com.huami.moving.ui.sport.home.manager.SportStatManager;
import com.huami.moving.ui.utils.SportRecordQueryConstrainUtils;
import com.huami.moving.webapi.GetSportStatAPI;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Emitter;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.FuncN;

/* JADX INFO: loaded from: classes5.dex */
public class GetSportStatAPI {
    private static String a = "v2/sport/stat.json";
    private static final String b = "code";
    private static final String c = "data";
    private static final String d = "type";
    private static final String e = "dis";
    private static final String f = "count";
    private static final String g = "calorie";
    private static final String h = "run_time";

    public static class StatDataEntity {
        public float calorie;
        public int costTime;
        public int count;
        public float distance;
        public int sportType;
        public List<StatDataEntity> subStatList;
    }

    public class a extends IHMHttpResponseHandler {
        public final /* synthetic */ Emitter a;

        public a(Emitter emitter) {
            this.a = emitter;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            this.a.onCompleted();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            StatDataEntity statDataEntityE = hMHttpResponseData.isSuccess() ? GetSportStatAPI.e(new String(hMHttpResponseData.getResponseBody(), StandardCharsets.UTF_8)) : null;
            if (statDataEntityE == null) {
                this.a.onError(new IllegalStateException("Sport Stat Info is null"));
            } else {
                this.a.onNext(statDataEntityE);
                this.a.onCompleted();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static StatDataEntity e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.getInt("code") != 1) {
                return null;
            }
            StatDataEntity statDataEntity = new StatDataEntity();
            statDataEntity.subStatList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("data");
            if (jSONArray.length() != 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    double dOptDouble = jSONObject2.optDouble("dis");
                    int iOptInt = jSONObject2.optInt("count");
                    int iOptInt2 = jSONObject2.optInt("run_time");
                    int iOptInt3 = jSONObject2.optInt("type");
                    double dOptDouble2 = jSONObject2.optDouble("calorie");
                    if (!SportRecordQueryConstrainUtils.isSilentProcessSportType(iOptInt3)) {
                        StatDataEntity statDataEntity2 = new StatDataEntity();
                        float f2 = (float) dOptDouble;
                        statDataEntity2.distance = f2;
                        statDataEntity2.count = iOptInt;
                        statDataEntity2.costTime = iOptInt2;
                        statDataEntity2.sportType = iOptInt3;
                        statDataEntity2.calorie = (float) dOptDouble2;
                        if (!SportRecordQueryConstrainUtils.isSubSportType(iOptInt3)) {
                            statDataEntity.distance += f2;
                            statDataEntity.count += iOptInt;
                            statDataEntity.costTime += iOptInt2;
                            statDataEntity.calorie = (float) (((double) statDataEntity.calorie) + dOptDouble2);
                        }
                        if (statDataEntity2.count > 0) {
                            statDataEntity.subStatList.add(statDataEntity2);
                        }
                    }
                }
            }
            return statDataEntity;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ StatDataEntity f() throws Exception {
        return SportStatManager.getInstance().getRecordsStatInfo(null, null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ StatDataEntity g(Object[] objArr) {
        StatDataEntity statDataEntity = new StatDataEntity();
        statDataEntity.subStatList = new ArrayList();
        statDataEntity.distance = 0.0f;
        statDataEntity.count = 0;
        statDataEntity.costTime = 0;
        ArrayList<StatDataEntity> arrayList = new ArrayList();
        HashMap map = new HashMap();
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj instanceof StatDataEntity) {
                    StatDataEntity statDataEntity2 = (StatDataEntity) obj;
                    statDataEntity.distance += statDataEntity2.distance;
                    statDataEntity.count += statDataEntity2.count;
                    statDataEntity.costTime += statDataEntity2.costTime;
                    statDataEntity.calorie += statDataEntity2.calorie;
                    arrayList.addAll(statDataEntity2.subStatList);
                }
            }
            for (StatDataEntity statDataEntity3 : arrayList) {
                int i = statDataEntity3.sportType;
                if (map.containsKey(Integer.valueOf(i))) {
                    StatDataEntity statDataEntity4 = (StatDataEntity) map.get(Integer.valueOf(i));
                    statDataEntity4.distance += statDataEntity3.distance;
                    statDataEntity4.count += statDataEntity3.count;
                    statDataEntity4.costTime += statDataEntity3.costTime;
                    statDataEntity4.calorie += statDataEntity3.calorie;
                } else {
                    map.put(Integer.valueOf(i), statDataEntity3);
                }
            }
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                statDataEntity.subStatList.add((StatDataEntity) map.get((Integer) it2.next()));
            }
        }
        return statDataEntity;
    }

    public static Observable<StatDataEntity> getAllRecordsStatInfoInRx() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Observable.fromCallable(new Callable() { // from class: wf2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return GetSportStatAPI.f();
            }
        }));
        arrayList.add(getRXSportTotalStat());
        return Observable.zip(arrayList, new FuncN() { // from class: yf2
            @Override // rx.functions.FuncN
            public final Object call(Object[] objArr) {
                return GetSportStatAPI.g(objArr);
            }
        });
    }

    public static Observable<StatDataEntity> getRXSportTotalStat() {
        return Observable.create(new Action1() { // from class: xf2
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                GetSportStatAPI.h((Emitter) obj);
            }
        }, Emitter.BackpressureMode.BUFFER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Emitter emitter) {
        String url = HMServerDef.getUrl(a);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("type", 0);
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.GET, new a(emitter));
    }
}
