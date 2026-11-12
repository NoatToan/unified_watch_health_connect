package com.huawei.health.awarenessdonate;

import android.text.TextUtils;
import com.alipay.sdk.m.s.e;
import com.huawei.agconnect.common.aaid.AaidUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.kit.awareness.Awareness;
import com.huawei.hms.kit.awareness.DonateClient;
import com.huawei.hms.kit.awareness.donate.DonateResponse;
import com.huawei.hms.kit.awareness.donate.message.Content;
import com.huawei.hms.kit.awareness.donate.message.ContentData;
import com.huawei.hms.kit.awareness.donate.message.Message;
import com.huawei.hms.kit.awareness.donate.message.Session;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ddt;
import defpackage.qqt;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
@ApiDefine(uri = AwarenessDonateApi.class)
@Singleton
public class AwarenessDonateImpl implements AwarenessDonateApi {
    public static final String AWARENESS_FEATURE_MODULE_ID = "awareness_feature_module";
    private static final String CONTENT_VERSION = "2.1";
    private static final int DELETE_OPERATION = 1;
    private static final int DONATE_OPERATION = 0;
    private static final int MIN_TIME_PERIOD = 600000;
    private static final String NAMESPACE = "event";
    private static final int ONE_MINUTE = 60000;
    private static final String RELEASE_TAG = "R_AwarenessDonateImpl";
    private static final String REMOVE_DONATE_DATA = "controlProtocol";
    private static final String REMOVE_DONATE_DATA_NAME = "removeData";
    private static final String SECURE_ALGORITHM = "SHA1PRNG";
    private static final String TAG = "AwarenessDonateImpl";

    @Override // com.huawei.health.awarenessdonate.AwarenessDonateApi
    public boolean isSupportDonate() {
        if (!CommonUtil.bc()) {
            LogUtil.j(TAG, "is not harmonyOS, not support");
            return false;
        }
        boolean zC = AuthorizationUtils.c(BaseApplication.b());
        LogUtil.a(TAG, "isOpenDonate: ", Boolean.valueOf(zC));
        return zC;
    }

    @Override // com.huawei.health.awarenessdonate.AwarenessDonateApi
    public void donateFeature(ddt ddtVar) {
        ReleaseLogUtil.d(RELEASE_TAG, "enter donateFeature");
        dealData(ddtVar, 0);
    }

    @Override // com.huawei.health.awarenessdonate.AwarenessDonateApi
    public void deleteDonateFeature(ddt ddtVar) {
        ReleaseLogUtil.d(RELEASE_TAG, "enter deleteDonateFeature");
        dealData(ddtVar, 1);
    }

    private void dealData(ddt ddtVar, int i) {
        LogUtil.d(TAG, "DonateBean: ", ddtVar);
        DonateClient donateClient = Awareness.getDonateClient(BaseApplication.b());
        Session session = new Session();
        session.setMessageName(ddtVar.l());
        session.setMessageId(ddtVar.n());
        session.setDeviceModel(ddtVar.a());
        session.setDeviceCategory(ddtVar.e());
        session.setDeviceName(ddtVar.h());
        List<ContentData> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList<ddt> arrayList3 = new ArrayList();
        if (i == 0) {
            for (String str : SharedPreferenceManager.a(BaseApplication.b(), AWARENESS_FEATURE_MODULE_ID)) {
                ddt donateBeanFromSp = getDonateBeanFromSp(str);
                if (donateBeanFromSp == null) {
                    ReleaseLogUtil.e(RELEASE_TAG, "sp value is null, key is", str);
                } else if (str.equals(ddtVar.f())) {
                    LogUtil.a(TAG, "already donate feature, not add old one into list, continue");
                    ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(donateBeanFromSp);
                    Iterator<ddt.b> it = dealConflict(arrayList4, ddtVar).get(0).r().iterator();
                    while (it.hasNext()) {
                        ddtVar.r().add(it.next());
                    }
                    LogUtil.d(TAG, "after add oldBean: ", ddtVar);
                } else {
                    arrayList2.add(donateBeanFromSp);
                }
            }
            LogUtil.a(TAG, "before dealConflict: ", arrayList2);
            arrayList3.addAll(dealConflict(arrayList2, ddtVar));
            LogUtil.a(TAG, "after dealConflict: ", arrayList3);
            for (ddt ddtVar2 : arrayList3) {
                if (ddtVar2.r().isEmpty()) {
                    ReleaseLogUtil.d(RELEASE_TAG, "timePeriods is empty: ", ddtVar2.f());
                    long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                    ddtVar2.r().add(new ddt.b(jCurrentTimeMillis, jCurrentTimeMillis));
                }
                arrayList.add(getContentData(ddtVar2));
            }
        } else if (i == 1) {
            SharedPreferenceManager.b(AWARENESS_FEATURE_MODULE_ID, ddtVar.f());
            long jCurrentTimeMillis2 = System.currentTimeMillis() + 60000;
            ddtVar.r().add(new ddt.b(jCurrentTimeMillis2, jCurrentTimeMillis2));
            arrayList = Arrays.asList(getContentData(ddtVar));
        }
        Content content = new Content();
        content.setContentVersion(CONTENT_VERSION);
        content.setContentData(arrayList);
        Message message = new Message();
        message.setSession(session);
        message.setContent(content);
        donateClient.sendMessage(message).addOnSuccessListener(new OnSuccessListener<DonateResponse>() { // from class: com.huawei.health.awarenessdonate.AwarenessDonateImpl.5
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(DonateResponse donateResponse) {
                ReleaseLogUtil.d(AwarenessDonateImpl.RELEASE_TAG, "sendMessage success: ", donateResponse.getDonateStatus());
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    AwarenessDonateImpl.this.saveDonateBeanToSp((ddt) it2.next());
                }
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.health.awarenessdonate.AwarenessDonateImpl.3
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                ReleaseLogUtil.d(AwarenessDonateImpl.RELEASE_TAG, "sendMessage failed: ", exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveDonateBeanToSp(ddt ddtVar) {
        SharedPreferenceManager.c(AWARENESS_FEATURE_MODULE_ID, ddtVar.f(), qqt.b(ddtVar));
    }

    private ddt getDonateBeanFromSp(String str) {
        LogUtil.a(TAG, "enter getContentDataFromSp");
        String strB = SharedPreferenceManager.b(AWARENESS_FEATURE_MODULE_ID, str, (String) null);
        if (TextUtils.isEmpty(strB)) {
            ReleaseLogUtil.d(RELEASE_TAG, "key: ", str, ", value is null");
            return null;
        }
        ddt ddtVar = (ddt) qqt.e(strB, ddt.class);
        LogUtil.a(TAG, "key: ", str, ", getDonateBeanFromSp: ", ddtVar);
        return ddtVar;
    }

    private ContentData getContentData(ddt ddtVar) {
        ContentData contentData = new ContentData();
        contentData.setHeader(e.j, "event");
        contentData.setHeader("name", "featurePrediction");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("timeZone", ddtVar.t());
            jSONObject.put(AaidUtils.f4804b, ddtVar.d());
            jSONObject.put("effectiveTime", ddtVar.g());
            jSONObject.put("expirationTime", ddtVar.j());
            jSONObject2.put("bundleName", ddtVar.b());
            jSONObject2.put("moduleName", ddtVar.o());
            jSONObject2.put("abilityName", ddtVar.c());
            jSONObject2.put("formName", ddtVar.m());
            jSONObject2.put("formDimension", ddtVar.k());
            jSONObject3.put("featureName", ddtVar.f());
            JSONArray jSONArray = new JSONArray();
            List<ddt.b> listR = ddtVar.r();
            if (listR == null) {
                ReleaseLogUtil.d(RELEASE_TAG, "in donateFeature, but timePeriods is null, leave dealData");
                return contentData;
            }
            for (ddt.b bVar : listR) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("startTime", bVar.b());
                jSONObject4.put("endTime", bVar.d());
                jSONArray.put(jSONObject4);
            }
            jSONObject3.put("timelineInfo", jSONArray);
            contentData.setPayload("eventCommonInfo", jSONObject);
            contentData.setPayload("predictInfo", jSONObject3);
            contentData.setPayload("faFormInfo", jSONObject2);
            LogUtil.d(TAG, "contentData: ", contentData.toJson());
            return contentData;
        } catch (JSONException e) {
            LogUtil.j(TAG, "dataReport JSONException: ", e);
        }
    }

    private List<ddt> dealConflict(List<ddt> list, ddt ddtVar) {
        if (list.isEmpty()) {
            LogUtil.a(TAG, "no oldDonateBeans, leave dealConflict");
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(ddtVar);
            return arrayList;
        }
        CopyOnWriteArrayList<ddt> copyOnWriteArrayList = new CopyOnWriteArrayList(list);
        int i = ddtVar.i();
        Iterator<ddt.b> it = ddtVar.r().iterator();
        while (it.hasNext()) {
            ddt.b next = it.next();
            for (ddt ddtVar2 : copyOnWriteArrayList) {
                if (compareOldDonateBeans(ddtVar2, next, it, i, ddtVar2.i())) {
                    break;
                }
            }
        }
        copyOnWriteArrayList.add(ddtVar);
        return copyOnWriteArrayList;
    }

    private boolean compareOldDonateBeans(ddt ddtVar, ddt.b bVar, Iterator it, int i, int i2) {
        ddt.b bVar2 = bVar;
        Iterator<ddt.b> it2 = ddtVar.r().iterator();
        while (it2.hasNext()) {
            ddt.b next = it2.next();
            if (next.d() <= System.currentTimeMillis()) {
                LogUtil.a(TAG, "timePeriod expiration: ", next, ", featureName: ", ddtVar.f());
                it2.remove();
            } else if (isConflict(next, bVar2)) {
                long jB = next.b();
                long jD = next.d();
                long jB2 = bVar.b();
                long jD2 = bVar.d();
                long jMax = Math.max(jB, jB2);
                long jMin = Math.min(jD, jD2);
                if (i >= i2) {
                    ReleaseLogUtil.d(RELEASE_TAG, "newFeatureType is bigger than old");
                    if (jMax == jB) {
                        jB = jMin;
                    }
                    if (jMin == jD) {
                        jD = jMax;
                    }
                    if (jD - jB < 600000) {
                        ReleaseLogUtil.d(RELEASE_TAG, "timePeriod is less than 10 min, remove old timePeriod");
                        it2.remove();
                    } else {
                        next.d(jB, jD);
                    }
                    bVar2 = bVar;
                } else {
                    ReleaseLogUtil.d(RELEASE_TAG, "oldFeatureType is bigger than new");
                    if (jMax == jB2) {
                        jB = jMin;
                    }
                    if (jMin == jD2) {
                        jD = jMax;
                    }
                    if (jD - jB < 600000) {
                        ReleaseLogUtil.d(RELEASE_TAG, "timePeriod is less than 10 min, remove new timePeriod");
                        it.remove();
                        return true;
                    }
                    bVar2 = bVar;
                    bVar2.d(jB, jD);
                }
            }
        }
        return false;
    }

    private boolean isConflict(ddt.b bVar, ddt.b bVar2) {
        if (bVar.b() > bVar2.b()) {
            return bVar2.d() > bVar.b();
        }
        return bVar.d() > bVar2.b();
    }

    @Override // com.huawei.health.awarenessdonate.AwarenessDonateApi
    public void removeData() {
        SecureRandom secureRandom;
        DonateClient donateClient = Awareness.getDonateClient(BaseApplication.b());
        Session session = new Session();
        session.setMessageName(REMOVE_DONATE_DATA);
        try {
            secureRandom = SecureRandom.getInstance(SECURE_ALGORITHM);
        } catch (NoSuchAlgorithmException unused) {
            secureRandom = new SecureRandom();
            ReleaseLogUtil.a(RELEASE_TAG, "NoSuchAlgorithmException");
        }
        session.setMessageId(String.valueOf(secureRandom.nextInt(90000000) + ExceptionCode.CRASH_EXCEPTION));
        ContentData contentData = new ContentData();
        contentData.setHeader(e.j, "event");
        contentData.setHeader("name", REMOVE_DONATE_DATA_NAME);
        contentData.setPayload("eventCommonInfo", contentData.getDefaultEventCommonInfo());
        Content content = new Content();
        content.setContentVersion(CONTENT_VERSION);
        content.setContentData(Collections.singletonList(contentData));
        Message message = new Message();
        message.setSession(session);
        message.setContent(content);
        donateClient.sendMessage(message).addOnSuccessListener(new OnSuccessListener<DonateResponse>() { // from class: com.huawei.health.awarenessdonate.AwarenessDonateImpl.1
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(DonateResponse donateResponse) {
                ReleaseLogUtil.d(AwarenessDonateImpl.RELEASE_TAG, "removeData success");
                SharedPreferenceManager.d(AwarenessDonateImpl.AWARENESS_FEATURE_MODULE_ID, (String[]) SharedPreferenceManager.a(BaseApplication.b(), AwarenessDonateImpl.AWARENESS_FEATURE_MODULE_ID).toArray(new String[0]));
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.health.awarenessdonate.AwarenessDonateImpl.2
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                ReleaseLogUtil.e(AwarenessDonateImpl.RELEASE_TAG, "removeData failed: ", exc);
            }
        });
    }
}
