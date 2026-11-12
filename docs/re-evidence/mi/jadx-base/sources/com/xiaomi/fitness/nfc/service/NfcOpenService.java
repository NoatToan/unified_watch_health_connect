package com.xiaomi.fitness.nfc.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.mibi.sdk.component.Constants;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoManager;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.BaseTransitCardModel;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.sesdk.CardCategory;
import com.tsmclient.smartcard.model.TradeLog;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.service.NfcOpenService;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import defpackage.bg4;
import defpackage.j5h;
import defpackage.jg1;
import defpackage.ltg;
import defpackage.na4;
import defpackage.o0j;
import defpackage.o4h;
import defpackage.s3q;
import defpackage.tyo;
import defpackage.v4h;
import defpackage.vqg;
import defpackage.z0d;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class NfcOpenService extends Service {
    public static final String[] c = {"1da20e2bdfa678ae888e81e5ca0ec4744ebbbbbd", "fc38d60de58f9dea1851c6ec57abff2aed053e7c", "8B0DA281EBC8AAE71FB07C97DAFB25F042AF8C22", "8b0da281ebc8aae71fb07c97dafb25f042af8c22", "7B6DC7079C34739CE81159719FB5EB61D2A03225"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public na4 f12542a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f12543b = new a();

    public class a extends z0d.a {

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.service.NfcOpenService$a$a, reason: collision with other inner class name */
        public class C0651a implements Function1<WearableDeviceModel, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ WearableDeviceManager f12545a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CountDownLatch f12546b;

            public C0651a(WearableDeviceManager wearableDeviceManager, CountDownLatch countDownLatch) {
                this.f12545a = wearableDeviceManager;
                this.f12546b = countDownLatch;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unit invoke2(WearableDeviceModel wearableDeviceModel) {
                vqg.d("addDeviceChangeListener callback");
                this.f12545a.removeDeviceChangeListener(this);
                this.f12546b.countDown();
                return null;
            }
        }

        public static /* synthetic */ void A5(String[] strArr, CountDownLatch countDownLatch, String str) throws Exception {
            strArr[0] = str;
            countDownLatch.countDown();
        }

        public static /* synthetic */ void C5(String[] strArr, CountDownLatch countDownLatch, String str) throws Exception {
            strArr[1] = str;
            countDownLatch.countDown();
        }

        public static /* synthetic */ void E5(String str, v4h v4hVar) throws Exception {
            BaseTransitCardModel baseTransitCardModel = new BaseTransitCardModel();
            baseTransitCardModel.init(AppUtil.getApp(), null);
            for (CardInfo cardInfo : baseTransitCardModel.getCardsFromNetwork(null, new Bundle())) {
                if (cardInfo.isCardId(str)) {
                    BaseResponse baseResponseUpdateCards = CardInfoManager.getInstance(AppUtil.getApp()).updateCards(cardInfo);
                    if (!baseResponseUpdateCards.isSuccess()) {
                        v4hVar.onError(new AuthApiException(baseResponseUpdateCards.mResultCode, baseResponseUpdateCards.mMsg));
                        return;
                    } else {
                        v4hVar.onNext(cardInfo);
                        v4hVar.onComplete();
                        return;
                    }
                }
            }
            v4hVar.onError(new AuthApiException(4, AppUtil.getApp().getString(o0j.k5)));
        }

        public static /* synthetic */ void F5(AtomicInteger atomicInteger, StringBuilder sb, JSONObject jSONObject, CountDownLatch countDownLatch, CardInfo cardInfo) throws Exception {
            atomicInteger.set(0);
            sb.append("success");
            jSONObject.put(TSMAuthContants.PARAM_CARDNO, cardInfo.mCardNo);
            jSONObject.put("logicCardNo", cardInfo.mRealCardNo);
            jSONObject.put("balance", cardInfo.mCardBalance);
            jSONObject.put("validityDate", cardInfo.mEndDate);
            JSONArray jSONArray = new JSONArray();
            List<TradeLog> list = cardInfo.mTradeLogs;
            if (list != null && !list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(Constants.KEY_TRADE_ID, list.get(i).getTradeID());
                    jSONObject2.put("tradeType", list.get(i).getTradeType());
                    jSONObject2.put("tradeAmount", list.get(i).getAuAmount());
                    jSONObject2.put("tradeDate", list.get(i).getTradeDate() + list.get(i).getTradeTime());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("tradeRecords", jSONArray);
            countDownLatch.countDown();
        }

        public static /* synthetic */ void G5(AtomicInteger atomicInteger, StringBuilder sb, CountDownLatch countDownLatch, Throwable th) throws Exception {
            if (th instanceof AuthApiException) {
                AuthApiException authApiException = (AuthApiException) th;
                atomicInteger.set(authApiException.mErrorCode);
                sb.append(authApiException.mErrorMsg);
            } else {
                atomicInteger.set(99);
                sb.append(AppUtil.getApp().getString(o0j.i5));
            }
            vqg.c("queryCardInfo error", th);
            countDownLatch.countDown();
        }

        public static /* synthetic */ void x5(String str, v4h v4hVar) throws Exception {
            BaseTransitCardModel baseTransitCardModel = new BaseTransitCardModel();
            baseTransitCardModel.init(AppUtil.getApp(), null);
            for (CardInfo cardInfo : baseTransitCardModel.getCardsFromNetwork(null, new Bundle())) {
                if (cardInfo.isCardId(str)) {
                    CardInfo transCard = CardInfoManager.getInstance(AppUtil.getApp()).getTransCard(null, cardInfo);
                    if (transCard != null && transCard.mIsReadSECorrectly && transCard.mHasIssue) {
                        cardInfo.updateInfo(transCard);
                        cardInfo.mDataSource = CardInfo.DataSource.DB;
                    } else {
                        CardInfoManager.getInstance(AppUtil.getApp()).updateCards(cardInfo);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean(com.miui.tsmclient.util.Constants.EXTRA_OUT_OPERATION, true);
                    BaseResponse baseResponseReturnCard = CardInfoManager.getInstance(AppUtil.getApp()).returnCard(cardInfo, bundle);
                    if (!baseResponseReturnCard.isSuccess()) {
                        v4hVar.onError(new AuthApiException(baseResponseReturnCard.mResultCode, baseResponseReturnCard.mMsg));
                        return;
                    }
                    ltg.c().r(new CardWrapper(CardCategory.TRANSIT, cardInfo));
                    v4hVar.onNext(cardInfo);
                    v4hVar.onComplete();
                    return;
                }
            }
            v4hVar.onError(new AuthApiException(4, AppUtil.getApp().getString(o0j.k5)));
        }

        public static /* synthetic */ void y5(AtomicInteger atomicInteger, StringBuilder sb, CountDownLatch countDownLatch, CardInfo cardInfo) throws Exception {
            atomicInteger.set(0);
            sb.append("success");
            countDownLatch.countDown();
        }

        public static /* synthetic */ void z5(AtomicInteger atomicInteger, StringBuilder sb, CountDownLatch countDownLatch, Throwable th) throws Exception {
            if (th instanceof AuthApiException) {
                AuthApiException authApiException = (AuthApiException) th;
                atomicInteger.set(authApiException.mErrorCode);
                sb.append(authApiException.mErrorMsg);
            } else {
                atomicInteger.set(99);
                sb.append(AppUtil.getApp().getString(o0j.i5));
            }
            vqg.c("deleteCard error", th);
            countDownLatch.countDown();
        }

        @Override // defpackage.z0d
        public String J(Map map) throws RemoteException {
            String string;
            JSONObject jSONObject = new JSONObject();
            if (!NfcOpenService.this.g()) {
                return NfcOpenService.this.e(1, AppUtil.getApp().getString(o0j.l5), jSONObject, null);
            }
            int i = 2;
            if (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).isConnected()) {
                final String[] strArr = new String[2];
                final CountDownLatch countDownLatch = new CountDownLatch(2);
                NfcOpenService.this.f12542a.a(s3q.f0().l0().O(new bg4() { // from class: irg
                    @Override // defpackage.bg4
                    public final void accept(Object obj) throws Exception {
                        NfcOpenService.a.A5(strArr, countDownLatch, (String) obj);
                    }
                }, new bg4() { // from class: jrg
                    @Override // defpackage.bg4
                    public final void accept(Object obj) {
                        vqg.c("getSeId error", (Throwable) obj);
                    }
                }));
                NfcOpenService.this.f12542a.a(s3q.f0().a0().O(new bg4() { // from class: krg
                    @Override // defpackage.bg4
                    public final void accept(Object obj) throws Exception {
                        NfcOpenService.a.C5(strArr, countDownLatch, (String) obj);
                    }
                }, new bg4() { // from class: lrg
                    @Override // defpackage.bg4
                    public final void accept(Object obj) {
                        vqg.c("getCplc error", (Throwable) obj);
                    }
                }));
                try {
                    countDownLatch.await(120L, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    vqg.c("getSeId InterruptedException", e);
                }
                i = 0;
                if (TextUtils.isEmpty(strArr[0]) || TextUtils.isEmpty(strArr[1])) {
                    string = AppUtil.getApp().getString(o0j.i5);
                    i = 99;
                } else {
                    try {
                        jSONObject.put(TSMAuthContants.PARAM_SEID, strArr[0]);
                        jSONObject.put("cplc", strArr[1]);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    string = "success";
                }
            } else {
                string = AppUtil.getApp().getString(o0j.j5);
            }
            return NfcOpenService.this.e(i, string, jSONObject, null);
        }

        @Override // defpackage.z0d
        public String deleteCard(Map map) throws RemoteException {
            final AtomicInteger atomicInteger = new AtomicInteger(-1);
            final StringBuilder sb = new StringBuilder();
            JSONObject jSONObject = new JSONObject();
            if (!NfcOpenService.this.g()) {
                return NfcOpenService.this.e(1, AppUtil.getApp().getString(o0j.l5), jSONObject, null);
            }
            if (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).isConnected()) {
                final String str = (String) map.get("aid");
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                NfcOpenService.this.f12542a.a(o4h.f(new j5h() { // from class: prg
                    @Override // defpackage.j5h
                    public final void subscribe(v4h v4hVar) throws Exception {
                        NfcOpenService.a.x5(str, v4hVar);
                    }
                }).S(tyo.c).O(new bg4() { // from class: qrg
                    @Override // defpackage.bg4
                    public final void accept(Object obj) throws Exception {
                        NfcOpenService.a.y5(atomicInteger, sb, countDownLatch, (CardInfo) obj);
                    }
                }, new bg4() { // from class: rrg
                    @Override // defpackage.bg4
                    public final void accept(Object obj) throws Exception {
                        NfcOpenService.a.z5(atomicInteger, sb, countDownLatch, (Throwable) obj);
                    }
                }));
                try {
                    countDownLatch.await(60L, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    vqg.c("deleteCard InterruptedException", e);
                }
            } else {
                atomicInteger.set(2);
                sb.append(AppUtil.getApp().getString(o0j.j5));
            }
            return NfcOpenService.this.e(atomicInteger.get(), sb.toString(), jSONObject, null);
        }

        @Override // defpackage.z0d
        public String j() throws RemoteException {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            vqg.b("NfcMierService  getWearDid");
            if (!NfcOpenService.this.g()) {
                return NfcOpenService.this.e(-100, "no permission", jSONObject, jSONArray);
            }
            try {
                WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
                if (deviceManagerExtKt.getDeviceModels().isEmpty()) {
                    vqg.d("addDeviceChangeListener when devicesModels is empty");
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    deviceManagerExtKt.addDeviceChangeListener(new C0651a(deviceManagerExtKt, countDownLatch));
                    countDownLatch.await(30L, TimeUnit.SECONDS);
                }
                List<T> deviceModels = deviceManagerExtKt.getDeviceModels();
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getCurrentDeviceModel();
                if (wearableDeviceModel != null) {
                    boolean zIsSupportNfc = NfcUtils.isSupportNfc(wearableDeviceModel);
                    if (zIsSupportNfc) {
                        vqg.d("NfcMierService currentDeviceMode did:" + wearableDeviceModel.getDid() + " isSupportNFC:" + zIsSupportNfc);
                        jSONObject.put("did", wearableDeviceModel.getDid());
                    } else {
                        vqg.d("NfcMierService currentDeviceMode   did:" + wearableDeviceModel.getDid() + " isSupportNFC:" + zIsSupportNfc);
                    }
                } else {
                    vqg.d("NfcMierService currentDeviceMode is null wait device list");
                }
                vqg.d("NfcMierService size:" + deviceModels.size());
                for (T t : deviceModels) {
                    if (NfcUtils.isSupportNfc(t)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", t.getDid());
                        jSONObject2.put("model", t.getAlias());
                        jSONObject2.put("type", DeviceModelExtKt.isBandType(t) ? 1 : 2);
                        jSONObject2.put("name", DeviceModelExtKt.getName(t));
                        jSONArray.put(jSONObject2);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                vqg.c("NfcMierService", e);
            }
            return NfcOpenService.this.f(0, "success", jSONObject, jSONArray);
        }

        @Override // defpackage.z0d
        public String queryCardInfo(Map map) throws RemoteException {
            final AtomicInteger atomicInteger = new AtomicInteger(-1);
            final StringBuilder sb = new StringBuilder();
            final JSONObject jSONObject = new JSONObject();
            if (!NfcOpenService.this.g()) {
                return NfcOpenService.this.e(1, AppUtil.getApp().getString(o0j.l5), jSONObject, null);
            }
            if (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).isConnected()) {
                final String str = (String) map.get("aid");
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                NfcOpenService.this.f12542a.a(o4h.f(new j5h() { // from class: mrg
                    @Override // defpackage.j5h
                    public final void subscribe(v4h v4hVar) throws Exception {
                        NfcOpenService.a.E5(str, v4hVar);
                    }
                }).S(tyo.c).O(new bg4() { // from class: nrg
                    @Override // defpackage.bg4
                    public final void accept(Object obj) throws Exception {
                        NfcOpenService.a.F5(atomicInteger, sb, jSONObject, countDownLatch, (CardInfo) obj);
                    }
                }, new bg4() { // from class: org
                    @Override // defpackage.bg4
                    public final void accept(Object obj) throws Exception {
                        NfcOpenService.a.G5(atomicInteger, sb, countDownLatch, (Throwable) obj);
                    }
                }));
                try {
                    countDownLatch.await(60L, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    vqg.c("queryCardInfo InterruptedException", e);
                }
            } else {
                atomicInteger.set(2);
                sb.append(AppUtil.getApp().getString(o0j.j5));
            }
            return NfcOpenService.this.e(atomicInteger.get(), sb.toString(), jSONObject, null);
        }

        public a() {
        }
    }

    public final String e(int i, String str, JSONObject jSONObject, JSONArray jSONArray) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("resultCode", i);
            jSONObject2.put("resultMsg", str);
            jSONObject2.put("data", jSONObject);
            if (jSONArray != null) {
                jSONObject2.put("list", jSONArray);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String string = jSONObject2.toString();
        vqg.d("result = " + string);
        return string;
    }

    public final String f(int i, String str, JSONObject jSONObject, JSONArray jSONArray) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("resultCode", i);
            jSONObject2.put("resultMsg", str);
            jSONObject2.put("data", jSONObject.toString());
            if (jSONArray != null) {
                jSONObject2.put("list", jSONArray);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String string = jSONObject2.toString();
        vqg.d("result = " + string);
        return string;
    }

    public final boolean g() {
        String strC = null;
        for (String str : getPackageManager().getPackagesForUid(Binder.getCallingUid())) {
            strC = jg1.c(this, str, "SHA1");
            if (strC != null) {
                break;
            }
        }
        vqg.d("calling app sign:" + strC);
        String[] strArr = c;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (strArr[i].equalsIgnoreCase(strC)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f12543b;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f12542a = new na4();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f12542a.d();
        super.onDestroy();
    }
}
