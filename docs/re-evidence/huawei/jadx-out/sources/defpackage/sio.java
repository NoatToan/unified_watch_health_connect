package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.utils.functionsetcard.CardFlowInteractors;
import com.huawei.health.health.utils.functionsetcard.manager.OnCardChangedListener;
import com.huawei.health.health.utils.functionsetcard.manager.constructor.CardConstructor;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver;
import com.huawei.ui.homehealth.functionsetcard.manager.ICardManager;
import com.huawei.ui.homehealth.functionsetcard.manager.constructor.BloodSugarRecordCardConstructor;
import com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeContainer;
import com.huawei.ui.homehealth.util.FunctionCardBannerHelper;
import com.huawei.ui.homehealth.util.FunctionSetCardMarketingUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class sio implements ICardManager, OnCardChangedListener, FunctionSetCardObserver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile sio f48127c;
    private sjd ab;
    private FunctionCardBannerHelper e;
    private sit f;
    private sit g;
    private a h;
    private int i;
    private List<String> j;
    private sjg k;
    private sjf o;
    private boolean r;
    private sit w;
    private FunctionSetCardMarketingUtil y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ReentrantReadWriteLock f48129b = new ReentrantReadWriteLock();
    private List<FunctionSetCardObserver> l = new CopyOnWriteArrayList();
    private List<CardConfig> z = new CopyOnWriteArrayList();
    private List<CardConfig> q = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, CardConstructor> f48128a = new ConcurrentHashMap();
    private Map<String, String> d = new HashMap();
    private SparseArray<List<String>> m = new SparseArray<>();
    private boolean s = false;
    private boolean t = false;
    private boolean x = false;
    private boolean u = false;
    private boolean p = false;
    private int v = -1;
    private BroadcastReceiver n = new BroadcastReceiver() { // from class: sio.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getIntExtra("refresh_type", -1) == 0) {
                LogUtil.a("FunctionCard_CardManager", "onReceive data sync completed");
                sio.this.s();
                sio.this.e.c(sio.this.b());
            }
        }
    };

    private sio() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        w();
        ReleaseLogUtil.d("FunctionSet_TIME", "init cost:", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public static sio c() {
        synchronized (sio.class) {
            if (f48127c == null) {
                f48127c = new sio();
            }
        }
        return f48127c;
    }

    public void n() {
        ReleaseLogUtil.d("FunctionCard_CardManager", "context has been released, be careful of calling CardManager.xxx");
    }

    public static void d() {
        ReleaseLogUtil.d("FunctionCard_CardManager", "releaseInstance()");
        synchronized (sio.class) {
            if (f48127c != null) {
                f48127c.al();
                f48127c = null;
            }
        }
    }

    private void al() {
        ReleaseLogUtil.d("FunctionCard_CardManager", "release");
        Map<String, CardConstructor> map = this.f48128a;
        if (map != null) {
            Iterator<CardConstructor> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().release();
            }
            ReleaseLogUtil.d("FunctionCard_CardManager", "release PhysiologicalCycleCardConstructor broadCast over");
        }
        this.h.getLooper().quit();
        aw();
        sjf sjfVar = this.o;
        if (sjfVar != null) {
            sjfVar.release();
        }
        sjd sjdVar = this.ab;
        if (sjdVar != null) {
            sjdVar.release();
        }
        sjg sjgVar = this.k;
        if (sjgVar != null) {
            sjgVar.release();
        }
    }

    public void a(FunctionSetCardObserver functionSetCardObserver) {
        ReleaseLogUtil.d("FunctionCard_CardManager", "registerDataSetObserver ", functionSetCardObserver);
        if (functionSetCardObserver != null) {
            this.l.add(functionSetCardObserver);
        }
    }

    public void d(FunctionSetCardObserver functionSetCardObserver) {
        ReleaseLogUtil.d("FunctionCard_CardManager", "unregisterDataSetObserver ", functionSetCardObserver);
        if (functionSetCardObserver != null) {
            this.l.remove(functionSetCardObserver);
        }
    }

    public boolean g() {
        return this.u;
    }

    public List<CardConstructor> a() {
        LogUtil.a("FunctionCard_CardManager", "getAllShowCardConstructor start");
        List<CardConfig> listJ = j();
        ArrayList arrayList = new ArrayList(listJ.size());
        boolean zO = Utils.o();
        ReleaseLogUtil.d("FunctionCard_CardManager", "getAllShowCardConstructor isOversea:", Boolean.valueOf(zO));
        for (CardConfig cardConfig : listJ) {
            if (cardConfig == null) {
                LogUtil.e("FunctionCard_CardManager", "cardConfig is null");
            } else {
                String cardId = cardConfig.getCardId();
                if (cardId == null) {
                    LogUtil.e("FunctionCard_CardManager", "cardId is null");
                } else {
                    CardConstructor cardConstructor = this.f48128a.get(cardId);
                    if (cardConstructor == null) {
                        LogUtil.e("FunctionCard_CardManager", "constructor is null");
                    } else if (!cardConstructor.isSupport(zO, this.i)) {
                        LogUtil.e("FunctionCard_CardManager", "notSupport constructor: ", cardConstructor);
                    } else {
                        arrayList.add(cardConstructor);
                    }
                }
            }
        }
        ReleaseLogUtil.d("FunctionCard_CardManager", "getAllShowCardConstructor size:", Integer.valueOf(arrayList.size()));
        return fua.r() ? b(arrayList) : arrayList;
    }

    private List<CardConstructor> b(List<CardConstructor> list) {
        BloodSugarRecordCardConstructor bloodSugarRecordCardConstructor;
        ArrayList arrayList = new ArrayList(list);
        CardConstructor cardConstructor = list.get(1);
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                bloodSugarRecordCardConstructor = null;
                break;
            }
            CardConstructor cardConstructor2 = (CardConstructor) it.next();
            if ("BLOODSUGAR_CARD_KEY_NEW".equals(cardConstructor2.getCardId())) {
                bloodSugarRecordCardConstructor = (BloodSugarRecordCardConstructor) cardConstructor2;
                LogUtil.a("FunctionCard_CardManager", "bloodsugar card's position is ", Integer.valueOf(i));
                break;
            }
            i++;
        }
        if (bloodSugarRecordCardConstructor == null) {
            return arrayList;
        }
        arrayList.set(1, bloodSugarRecordCardConstructor);
        arrayList.set(i, cardConstructor);
        return arrayList;
    }

    public List<CardConfig> f() {
        this.f48129b.readLock().lock();
        if (njy.e(this.q)) {
            this.f48129b.readLock().unlock();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(this.q.size());
        for (CardConfig cardConfig : this.q) {
            if (cardConfig != null) {
                arrayList.add(new CardConfig(cardConfig));
            }
        }
        this.f48129b.readLock().unlock();
        ReleaseLogUtil.d("FunctionCard_CardManager", "getHideCardConfigsFromCache size:", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public List<CardConfig> j() {
        this.f48129b.readLock().lock();
        if (njy.e(this.z)) {
            this.f48129b.readLock().unlock();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(this.z.size());
        Iterator<CardConfig> it = this.z.iterator();
        while (it.hasNext()) {
            arrayList.add(new CardConfig(it.next()));
        }
        this.f48129b.readLock().unlock();
        ReleaseLogUtil.d("FunctionCard_CardManager", "getShowCardConfigsFromCache size:", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.ICardManager
    public List<CardConfig> getUninitializedCardsFromCache() {
        this.f48129b.readLock().lock();
        if (njy.e(this.q)) {
            this.f48129b.readLock().unlock();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(this.q.size());
        for (CardConfig cardConfig : this.q) {
            if (cardConfig != null && !cardConfig.isInitialized()) {
                arrayList.add(new CardConfig(cardConfig));
            }
        }
        this.f48129b.readLock().unlock();
        ReleaseLogUtil.d("FunctionCard_CardManager", "getUninitializedCardsFromCache size:", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public void m() {
        if (this.w == null) {
            aj();
        } else {
            s();
        }
    }

    public void o() {
        FunctionCardBannerHelper functionCardBannerHelper = this.e;
        if (functionCardBannerHelper == null) {
            LogUtil.j("R_FunctionCard_CardManager", "functionCardBannerHelper is null");
        } else {
            functionCardBannerHelper.c(b());
        }
    }

    private void w() {
        z();
        af();
        LogUtil.a("FunctionCard_CardManager", "mDefaultConfig-----");
        ae();
        a(this.f);
        ak();
        an();
        LogUtil.a("FunctionCard_CardManager", "mLastConfig-----");
        a(this.w);
        this.o = new sjf(this);
        if (fua.s()) {
            y();
            LogUtil.a("FunctionCard_CardManager", "ori mCurrentConfig-----");
            a(this.g);
            v();
            return;
        }
        u();
        LogUtil.a("FunctionCard_CardManager", "ori mCurrentConfig-----");
        a(this.g);
        this.ab = new sjd(this);
        this.f48129b.writeLock().lock();
        this.ab.doStrategy();
        this.f48129b.writeLock().unlock();
        this.k = new sjg(this);
        LogUtil.a("FunctionCard_CardManager", "mCurrentConfig-----");
        a(this.g);
        aq();
        v();
        av();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final sit sitVar) {
        if (fua.b(BaseApplication.getContext())) {
            this.r = false;
        } else {
            this.h.post(new Runnable() { // from class: sip
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e(sitVar);
                }
            });
        }
    }

    /* synthetic */ void e(sit sitVar) {
        this.y.a(sitVar.c(), new d());
    }

    public void a(boolean z) {
        LogUtil.a("FunctionCard_CardManager", "setIsUpdateByMarketing: ", Boolean.valueOf(z));
        this.x = z;
        if (z) {
            this.u = false;
        }
        tfb.a(z);
        this.y.e(z, new d());
        c(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<String> list) {
        LogUtil.a("FunctionCard_CardManager", "updateMessageCardConfig");
        if (!d(list)) {
            am();
        } else if (this.y == null) {
            LogUtil.a("FunctionCard_CardManager", "mMarketingUtil is null");
            am();
        } else {
            a(true);
            j(list, true);
        }
    }

    private void j(final List<String> list, final boolean z) {
        if (fua.b(BaseApplication.getContext())) {
            return;
        }
        LogUtil.a("FunctionCard_CardManager", "refreshCardByMessageOrUser, msg: " + z);
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "three_circle_edited_hide_or_show");
        String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "health_life_edited_hide_or_show");
        String name = CardFlowInteractors.CardNameConstants.THREE_CIRCLE_CARD.getName();
        if (siu.e(strE, strE2)) {
            if ("threeLeafCard".equals(tbf.e()) && list.contains("HEALTH_MODEL_CARD_KEY_NEW") && !list.contains(name)) {
                list.set(list.indexOf("HEALTH_MODEL_CARD_KEY_NEW"), name);
            }
            if ("threeCircleCard".equals(tbf.e()) && list.contains(name) && !list.contains("HEALTH_MODEL_CARD_KEY_NEW")) {
                list.set(list.indexOf(name), "HEALTH_MODEL_CARD_KEY_NEW");
            }
        }
        String name2 = CardFlowInteractors.CardNameConstants.HEALTH_RECORD_CARD.getName();
        boolean zB = SharedPreferenceManager.b(String.valueOf(10100), "health_record_auto_show", false);
        if (!z && zB && !list.contains(name2)) {
            list.add(name2);
        }
        this.j = list;
        HandlerExecutor.c(new Runnable() { // from class: siw
            @Override // java.lang.Runnable
            public final void run() {
                this.f48158c.b(list, z);
            }
        });
    }

    /* synthetic */ void b(List list, boolean z) {
        boolean z2 = this.r;
        if (z2) {
            ReleaseLogUtil.d("R_FunctionCard_CardManager", "refreshCardByMessageOrUser isSortingByStrategy:", Boolean.valueOf(z2));
            return;
        }
        this.f48129b.writeLock().lock();
        h(list, z);
        at();
        this.f48129b.writeLock().unlock();
        if (!z) {
            aq();
        }
        v();
        notifyAllCardChanged();
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.ICardManager
    public void replaceTwoModelCard(String str, String str2) {
        LinkedList<CardConfig> linkedList = new LinkedList<>();
        linkedList.addAll(this.g.c());
        CardConfig cardConfigC = c(str, linkedList);
        CardConfig cardConfigC2 = c(str2, linkedList);
        if (cardConfigC2 == null || cardConfigC == null) {
            return;
        }
        cardConfigC.setShow(false);
        cardConfigC2.setShow(true);
        int iIndexOf = linkedList.indexOf(cardConfigC);
        linkedList.remove(cardConfigC);
        linkedList.remove(cardConfigC2);
        if (iIndexOf < linkedList.size()) {
            linkedList.add(iIndexOf, cardConfigC2);
        } else {
            linkedList.add(cardConfigC2);
        }
        linkedList.add(cardConfigC);
        this.g.e(linkedList);
        at();
        aq();
        v();
        notifyCardReplace(str, str2);
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.ICardManager
    public void addTwoModelCard(int i, String str) {
        LinkedList<CardConfig> linkedList = new LinkedList<>();
        linkedList.addAll(this.g.c());
        CardConfig cardConfigC = c(str, linkedList);
        if (cardConfigC == null) {
            return;
        }
        linkedList.remove(cardConfigC);
        cardConfigC.setShow(true);
        if (i < linkedList.size()) {
            linkedList.add(i, cardConfigC);
        } else {
            linkedList.add(cardConfigC);
        }
        this.g.e(linkedList);
        at();
        aq();
        v();
        notifyAllCardChanged();
    }

    public void a(int i, List<String> list, boolean z) {
        if (njy.e(list)) {
            LogUtil.a("FunctionCard_CardManager", "insertCardsAndUpload cardIds is empty");
            return;
        }
        this.r = true;
        d(i, list, z);
        c(this.g);
    }

    public void d(int i, List<String> list, boolean z) {
        if (njy.e(list)) {
            LogUtil.a("FunctionCard_CardManager", "insertCards cardIds is empty");
            return;
        }
        LogUtil.a("FunctionCard_CardManager", "insertCards cardIds:", list);
        LinkedList<CardConfig> linkedList = new LinkedList<>(this.g.c());
        if (njy.e(linkedList)) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            CardConfig cardConfigC = c(it.next(), linkedList);
            if (cardConfigC != null) {
                linkedList.remove(cardConfigC);
                cardConfigC.setShow(z);
                if (i < linkedList.size()) {
                    linkedList.add(i, cardConfigC);
                } else {
                    linkedList.add(cardConfigC);
                }
            }
        }
        this.f48129b.writeLock().lock();
        this.g.e(linkedList);
        at();
        this.f48129b.writeLock().unlock();
        aq();
        v();
        notifyAllCardChanged();
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.ICardManager
    public void updateHealthModelCard() {
        notifyAllCardChanged();
    }

    private boolean r() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10100), "IS_OPEN_SMART_RECOMMEND_BY_USER");
        if (strE != null && strE.equals(Boolean.toString(true))) {
            LogUtil.a("FunctionCard_CardManager", "recommend is opened by user");
            return false;
        }
        return this.g.e();
    }

    private void a(sit sitVar) {
        if (sitVar == null) {
            LogUtil.a("FunctionCard_CardManager", "currentConfig is null");
            return;
        }
        LinkedList<CardConfig> linkedListC = sitVar.c();
        if (njy.e(linkedListC)) {
            LogUtil.a("FunctionCard_CardManager", "cardConfigLinkedList is null");
            return;
        }
        for (int i = 0; i < linkedListC.size(); i++) {
            LogUtil.a("FunctionCard_CardManager", "currentConfig: ", Integer.valueOf(i), " ", linkedListC.get(i).getCardId(), " ", Integer.valueOf(linkedListC.get(i).getShowFlag()));
        }
    }

    private boolean d(List<String> list) {
        if (fua.b(BaseApplication.getContext())) {
            return false;
        }
        if (list == null) {
            LogUtil.a("FunctionCard_CardManager", "data is null");
            return false;
        }
        if (this.f == null) {
            return false;
        }
        if (!njy.e(list)) {
            return true;
        }
        LogUtil.a("FunctionCard_CardManager", "content size is invalid");
        return false;
    }

    private void ar() {
        if (r()) {
            LogUtil.a("FunctionCard_CardManager", "hasLastUserCacheConfig");
        } else if ("0".equals(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "personalized_recommend"))) {
            LogUtil.a("FunctionCard_CardManager", "PRIVACY_SWITCH_CLOSED");
            am();
        } else {
            this.y.a(new HiDataReadResultListener() { // from class: sio.8
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i, int i2) {
                    if (obj == null) {
                        LogUtil.a("FunctionCard_CardManager", "object is null");
                        sio.this.am();
                        return;
                    }
                    LogUtil.a("FunctionCard_CardManager", "getUserRecommendSwitch errorCode: ", Integer.valueOf(i), ", object: ", obj.toString());
                    if (i != 0 || !sio.this.a(obj)) {
                        sio.this.ao();
                    } else {
                        LogUtil.a("FunctionCard_CardManager", "UserRecommendSwitch closed");
                        sio.this.am();
                    }
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i, Object obj, int i2, int i3) {
                    LogUtil.a("FunctionCard_CardManager", "getUserRecommendSwitch intentType ", Integer.valueOf(i), " object ", obj, " errorCode ", Integer.valueOf(i2), " anchor ", Integer.valueOf(i3));
                    sio.this.ao();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Object obj) {
        if (!(obj instanceof List)) {
            LogUtil.a("FunctionCard_CardManager", "not list");
            return false;
        }
        List list = (List) obj;
        if (list == null || list.size() == 0) {
            LogUtil.a("FunctionCard_CardManager", "list is null");
            return false;
        }
        Object obj2 = list.get(0);
        if (!(obj2 instanceof HiSampleConfig)) {
            LogUtil.a("FunctionCard_CardManager", "HiSampleConfig is null");
            return false;
        }
        String configData = ((HiSampleConfig) obj2).getConfigData();
        LogUtil.a("FunctionCard_CardManager", "data: ", configData);
        try {
            if (new JSONObject(configData).optInt("recommendOrderFlag") != 0) {
                return false;
            }
            LogUtil.a("FunctionCard_CardManager", "CLOSED");
            return true;
        } catch (JSONException unused) {
            LogUtil.a("FunctionCard_CardManager", "JSONException");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void am() {
        a(false);
        if (r()) {
            LogUtil.a("FunctionCard_CardManager", "hasLastUserCacheConfig");
        } else {
            this.y.c(new HiDataReadResultListener() { // from class: sio.6
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i, int i2) {
                    LogUtil.a("FunctionCard_CardManager", "recoveryUserConfig errorCode: ", Integer.valueOf(i), ", object: ", obj);
                    if (i == 0) {
                        JSONObject jSONObjectA = sio.this.y.a(obj);
                        if (jSONObjectA != null) {
                            sio.this.c(jSONObjectA);
                        } else {
                            LogUtil.a("FunctionCard_CardManager", "config is null");
                        }
                    }
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i, Object obj, int i2, int i3) {
                    LogUtil.a("FunctionCard_CardManager", "getUserConfig intentType ", Integer.valueOf(i), " object ", obj, " errorCode ", Integer.valueOf(i2), " anchor ", Integer.valueOf(i3));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        LogUtil.a("FunctionCard_CardManager", "updateCardByUserConfig");
        if (jSONObject == null) {
            LogUtil.a("FunctionCard_CardManager", "JSONObject is null");
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("userCardOrders");
        if (jSONArrayOptJSONArray == null) {
            LogUtil.a("FunctionCard_CardManager", "array is null");
            return;
        }
        LogUtil.a("FunctionCard_CardManager", "updateCardByUserConfig : ", jSONObject.toString());
        LinkedList<CardConfig> linkedListC = this.g.c();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (jSONArrayOptJSONArray.opt(i) instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) jSONArrayOptJSONArray.opt(i);
                String strOptString = jSONObject2.optString("cardId");
                String strOptString2 = jSONObject2.optString("showFlag");
                if (jSONObject2.has("isEdit")) {
                    int iOptInt = jSONObject2.optInt("isEdit");
                    CardConfig cardConfigC = c(strOptString, linkedListC);
                    if (cardConfigC != null) {
                        cardConfigC.setEditFlag(iOptInt);
                    }
                }
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && "1".equals(strOptString2)) {
                    arrayList.add(strOptString);
                }
            }
        }
        LogUtil.a("FunctionCard_CardManager", "userCards: ", arrayList);
        this.u = true;
        j(arrayList, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        ReleaseLogUtil.d("R_FunctionCard_CardManager", "getAbStrategy");
        ThreadPoolManager.c().execute(new Runnable() { // from class: sio.9
            @Override // java.lang.Runnable
            public void run() {
                lqo.b(BaseApplication.getContext()).b("function_card", new lop(), new ResultCallback<loq>() { // from class: sio.9.2
                    @Override // com.huawei.networkclient.ResultCallback
                    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(loq loqVar) {
                        sio.this.c(loqVar);
                    }

                    @Override // com.huawei.networkclient.ResultCallback
                    public void onFailure(Throwable th) {
                        ReleaseLogUtil.a("R_FunctionCard_CardManager", "get strategy error:", ExceptionUtils.c(th));
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(loq loqVar) {
        if (loqVar == null) {
            ReleaseLogUtil.e("R_FunctionCard_CardManager", "rsp is null.");
            ax();
            return;
        }
        LogUtil.a("FunctionCard_CardManager", "rsp: ", loqVar.toString());
        if (loqVar.getResultCode().intValue() != 0) {
            ReleaseLogUtil.e("R_FunctionCard_CardManager", "getStrategy rsp resultCode is ", loqVar.getResultCode());
            ax();
            return;
        }
        if (njy.e(loqVar.a()) || njy.e(loqVar.e()) || njy.e(loqVar.c())) {
            ReleaseLogUtil.e("R_FunctionCard_CardManager", "getStrategy rsp data empty");
            ax();
            return;
        }
        String str = loqVar.c().get(0);
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("R_FunctionCard_CardManager", "getStrategyName empty");
            ax();
            return;
        }
        LogUtil.a("FunctionCard_CardManager", "json: ", qqt.b(loqVar));
        if (str.equals("[B]")) {
            ReleaseLogUtil.d("R_FunctionCard_CardManager", "test B");
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "FUNCTION_SET_AB_SP_KEY", "[B]", null);
            ar();
        } else {
            ax();
            ReleaseLogUtil.d("R_FunctionCard_CardManager", "test A");
        }
    }

    private void ax() {
        am();
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "FUNCTION_SET_AB_SP_KEY", "[A]", null);
    }

    public boolean l() {
        if (this.v == -1) {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "FUNCTION_SET_AB_SP_KEY");
            if (TextUtils.isEmpty(strE)) {
                this.v = 0;
            }
            this.v = strE.equals("[B]") ? 1 : 0;
        }
        return this.v == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ao() {
        LogUtil.a("FunctionCard_CardManager", "all switch is opened, requestMessageCenter");
        this.y.d(new HttpResCallback() { // from class: sio.10
            @Override // com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback
            public void onFinished(int i, String str) {
                LogUtil.a("FunctionCard_CardManager", "resCode: ", Integer.valueOf(i), ", response: ", str);
                if (TextUtils.isEmpty(str)) {
                    LogUtil.e("FunctionCard_CardManager", "response is null");
                    sio.this.am();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                try {
                    JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("sortedCardIds");
                    if (jSONArrayOptJSONArray == null) {
                        LogUtil.e("FunctionCard_CardManager", "array is null");
                        sio.this.am();
                        return;
                    }
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        Object obj = jSONArrayOptJSONArray.get(i2);
                        if (obj instanceof String) {
                            arrayList.add((String) obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        sio.this.a((List<String>) arrayList);
                    } else {
                        LogUtil.e("FunctionCard_CardManager", "list is null");
                        sio.this.am();
                    }
                } catch (JsonSyntaxException | JSONException unused) {
                    LogUtil.e("FunctionCard_CardManager", "JsonSyntaxException");
                    sio.this.am();
                }
            }
        });
    }

    public boolean i() {
        return this.x;
    }

    private void z() {
        int iD = siu.d();
        this.i = iD;
        ReleaseLogUtil.d("FunctionCard_CardManager", "initGlobalEnvironment mCurrentVersionFlag: ", Integer.valueOf(iD));
    }

    private void af() {
        HandlerThread handlerThread = new HandlerThread("card_manager_thread");
        handlerThread.start();
        this.h = new a(handlerThread.getLooper(), this);
        if (this.y == null) {
            this.y = new FunctionSetCardMarketingUtil(BaseApplication.getContext());
        }
        if (this.e == null) {
            this.e = new FunctionCardBannerHelper(BaseApplication.getContext(), new b(this));
        }
    }

    private void aj() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.hihealth.action_data_refresh");
        LocalBroadcastManager.getInstance().registerReceiver(this.n, intentFilter);
        LogUtil.a("FunctionCard_CardManager", "register success", this);
    }

    private void aw() {
        if (this.n != null) {
            try {
                LocalBroadcastManager.getInstance().unregisterReceiver(this.n);
                LogUtil.a("FunctionCard_CardManager", "unregister", this);
            } catch (IllegalArgumentException unused) {
                LogUtil.e("FunctionCard_CardManager", "IllegalArgumentException unregister");
            }
        }
    }

    private void aq() {
        this.h.post(new Runnable() { // from class: sio.7
            @Override // java.lang.Runnable
            public void run() {
                sio.this.f48129b.readLock().lock();
                if (sio.this.g != null) {
                    sio sioVar = sio.this;
                    sioVar.e(sioVar.g, 2);
                }
                sio.this.f48129b.readLock().unlock();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final boolean z) {
        this.h.post(new Runnable() { // from class: sio.12
            @Override // java.lang.Runnable
            public void run() {
                sio.this.f48129b.readLock().lock();
                if (sio.this.g != null) {
                    sio sioVar = sio.this;
                    sioVar.e(sioVar.g, 2);
                }
                sio.this.f48129b.readLock().unlock();
                if (z) {
                    sio sioVar2 = sio.this;
                    sioVar2.c(sioVar2.g);
                    sio.this.a(!z);
                    return;
                }
                LogUtil.a("FunctionCard_CardManager", "edition this time not involve user data");
            }
        });
    }

    private void v() {
        List<CardConfig> listJ = j();
        for (int i = 0; i < listJ.size(); i++) {
            LogUtil.a("FunctionCard_CardManager", "showCard: " + listJ.get(i).getCardId());
        }
        List<CardConfig> listF = f();
        for (int i2 = 0; i2 < listF.size(); i2++) {
            LogUtil.a("FunctionCard_CardManager", "hideCard: " + listF.get(i2).getCardId());
        }
        c(listJ);
        c(listF);
        ReleaseLogUtil.d("FunctionCard_CardManager", "initAllCardConstructor size:", Integer.valueOf(this.f48128a.size()));
    }

    public void c(List<CardConfig> list) {
        CardConstructor cardConstructorC;
        for (int i = 0; i < list.size(); i++) {
            CardConfig cardConfig = list.get(i);
            if (cardConfig != null) {
                String cardId = cardConfig.getCardId();
                if (!TextUtils.isEmpty(cardId) && this.f48128a.get(cardId) == null && (cardConstructorC = c(cardConfig)) != null) {
                    this.f48128a.put(cardId, cardConstructorC);
                }
            }
        }
    }

    private CardConstructor b(String str, CardConfig cardConfig) {
        try {
            Object objNewInstance = Class.forName(str).getConstructor(CardConfig.class).newInstance(cardConfig);
            if (objNewInstance instanceof CardConstructor) {
                return (CardConstructor) objNewInstance;
            }
            return null;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            ReleaseLogUtil.a("FunctionCard_CardManager", "getConstructor failed, clsName", str, LogAnonymous.b(e));
            return null;
        }
    }

    private void av() {
        List<CardConfig> uninitializedCardsFromCache = getUninitializedCardsFromCache();
        if (njy.e(uninitializedCardsFromCache)) {
            ReleaseLogUtil.e("FunctionCard_CardManager", "startLongTermStrategy uninitializedCards is empty");
            return;
        }
        if (!fua.s()) {
            sjg sjgVar = this.k;
            if (sjgVar != null) {
                sjgVar.doStrategy();
            }
            sjf sjfVar = this.o;
            if (sjfVar != null) {
                sjfVar.doStrategy();
            }
        }
        ReleaseLogUtil.d("FunctionCard_CardManager", "startLongTermStrategy end", Integer.valueOf(uninitializedCardsFromCache.size()));
    }

    private void u() {
        this.f48129b.writeLock().lock();
        if (ah()) {
            LogUtil.a("FunctionCard_CardManager", "start type: isRestartApp");
            aa();
        } else if (ag()) {
            LogUtil.a("FunctionCard_CardManager", "start type: isNewVersionUpdate");
            ad();
        } else {
            LogUtil.a("FunctionCard_CardManager", "start type: Old or same Version");
            ab();
        }
        this.f48129b.writeLock().unlock();
        ReleaseLogUtil.d("FunctionCard_CardManager", "initCurrentConfig() end");
    }

    private void y() {
        this.f48129b.writeLock().lock();
        sit sitVar = this.f;
        if (sitVar != null && this.w != null && sitVar.b().equals(this.w.b())) {
            LogUtil.a("FunctionCard_CardManager", "start type: restart app");
            aa();
        } else {
            LogUtil.a("FunctionCard_CardManager", "start type: first start app");
            this.g = this.f;
            at();
            aq();
            d(this.m.get(5), false);
            sjf sjfVar = this.o;
            if (sjfVar != null) {
                sjfVar.a();
            }
        }
        this.f48129b.writeLock().unlock();
        ReleaseLogUtil.d("FunctionCard_CardManager", "initCurrentConfig() end");
    }

    private void h(List<String> list, boolean z) {
        List<six> listA = this.g.a();
        if (listA.size() < 4) {
            LogUtil.j("FunctionCard_CardManager", "group type size is less than 4, please check");
            return;
        }
        listA.get(3).c(list);
        LogUtil.a("FunctionCard_CardManager", "cardShowGroupList size: ", Integer.valueOf(listA.size()));
        sit sitVarA = a(list, z);
        this.g = sitVarA;
        LinkedList<CardConfig> linkedListC = sitVarA.c();
        for (int i = 0; i < linkedListC.size(); i++) {
            LogUtil.a("FunctionCard_CardManager", "UpdateByMarketing, cardId: ", linkedListC.get(i).getCardId(), ", show: ", Boolean.valueOf(linkedListC.get(i).isShow()));
        }
        LogUtil.a("FunctionCard_CardManager", "cardIds: ", list);
    }

    private void ad() {
        sit sitVar = this.f;
        if (sitVar == null || this.w == null) {
            return;
        }
        String strB = sitVar.b();
        t();
        x();
        this.w.a(strB);
        this.g = this.w;
        at();
    }

    private void x() {
        if (njy.e(this.f.c()) || njy.e(this.w.c())) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<CardConfig> it = this.w.c().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getCardId());
        }
        for (CardConfig cardConfig : this.f.c()) {
            if (!hashSet.contains(cardConfig.getCardId())) {
                this.w.c().add(cardConfig);
            }
        }
    }

    private void t() {
        if (njy.e(this.f.c()) || njy.e(this.w.c())) {
            return;
        }
        HashMap map = new HashMap(this.f.c().size());
        for (CardConfig cardConfig : this.f.c()) {
            if (cardConfig != null) {
                map.put(cardConfig.getCardId(), cardConfig);
            }
        }
        for (CardConfig cardConfig2 : this.w.c()) {
            if (cardConfig2 != null) {
                cardConfig2.update((CardConfig) map.get(cardConfig2.getCardId()));
            }
        }
        if (this.m.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.m.size(); i++) {
            int iKeyAt = this.m.keyAt(i);
            arrayList.clear();
            arrayList.addAll(this.m.get(iKeyAt));
            six sixVar = new six();
            sixVar.b(iKeyAt);
            sixVar.c(arrayList);
            arrayList2.add(sixVar);
        }
        this.w.d(arrayList2);
    }

    private void ab() {
        sit sitVar = this.f;
        if (!p()) {
            ReleaseLogUtil.d("FunctionCard_CardManager", "initCurrentConfigWithOldVersion oldVersion");
            this.g = new CardUpgradeContainer(BaseApplication.getContext()).c(sitVar);
            at();
            aq();
        }
        if (sitVar.e()) {
            return;
        }
        ac();
    }

    private sit a(List<String> list, boolean z) {
        LinkedList<CardConfig> linkedListC = this.g.c();
        if (linkedListC == null) {
            return this.g;
        }
        LinkedList<CardConfig> linkedList = new LinkedList<>();
        boolean zE = siu.e();
        for (int i = 0; i < list.size(); i++) {
            CardConfig cardConfigC = c(list.get(i), linkedListC);
            if (cardConfigC != null && (!z || !"PHYSIOLOGICAL_CYCLE_CARD_KEY_NEW".equals(cardConfigC.getCardId()) || zE)) {
                cardConfigC.setShow(true);
                linkedList.add(cardConfigC);
            }
        }
        for (CardConfig cardConfig : linkedListC) {
            if (cardConfig != null && !linkedList.contains(cardConfig)) {
                cardConfig.setShow(false);
                linkedList.add(cardConfig);
            }
        }
        this.g.e(linkedList);
        return this.g;
    }

    private CardConfig c(String str, LinkedList<CardConfig> linkedList) {
        for (CardConfig cardConfig : linkedList) {
            if (str.equals(cardConfig.getCardId())) {
                return cardConfig;
            }
        }
        return null;
    }

    private void ac() {
        this.g = this.f;
        at();
        ReleaseLogUtil.d("FunctionCard_CardManager", "initialization strategy start ");
        if (fua.b(BaseApplication.getContext())) {
            d(this.m.get(3), false);
        } else {
            d(this.m.get(4), false);
        }
        sjf sjfVar = this.o;
        if (sjfVar != null) {
            sjfVar.e();
        }
    }

    private void at() {
        ReleaseLogUtil.d("FunctionCard_CardManager", "setMemoryByCurrentSetConfig");
        sit sitVar = this.g;
        if (sitVar == null || njy.e(sitVar.c())) {
            ReleaseLogUtil.e("FunctionCard_CardManager", "setMemoryByCurrentSetConfig mCurrentConfig is null ", Boolean.valueOf(this.g == null));
            return;
        }
        this.z.clear();
        this.q.clear();
        for (CardConfig cardConfig : this.g.c()) {
            if (cardConfig != null) {
                if (cardConfig.isShow()) {
                    this.z.add(cardConfig);
                } else {
                    this.q.add(cardConfig);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void as() {
        ReleaseLogUtil.d("FunctionCard_CardManager", "setCardConfigsByMemory");
        sit sitVar = this.g;
        if (sitVar == null || sitVar.c() == null) {
            ReleaseLogUtil.e("FunctionCard_CardManager", "setCardConfigsByMemory mCurrentConfig is null ", Boolean.valueOf(this.g == null));
            return;
        }
        LinkedList<CardConfig> linkedList = new LinkedList<>();
        if (njy.b(this.z)) {
            linkedList.addAll(this.z);
        }
        if (njy.b(this.q)) {
            linkedList.addAll(this.q);
        }
        if (njy.b(linkedList)) {
            this.g.e(linkedList);
        }
    }

    private void d(List<String> list, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        if (z) {
            onShowStatusChanged(list, true, -1);
        } else {
            b(list, true, -1);
        }
    }

    private void ak() {
        if (this.f == null) {
            ReleaseLogUtil.a("FunctionCard_CardManager", "loadDefaultShowTypeGroups failed with null mDefaultConfig");
            return;
        }
        this.m.clear();
        for (six sixVar : this.f.a()) {
            this.m.put(sixVar.e(), sixVar.a());
        }
    }

    private void aa() {
        this.g = this.w;
        at();
    }

    private boolean ah() {
        sit sitVar = this.f;
        return sitVar != null && this.w != null && sitVar.b().equals(this.w.b()) && c(this.f.c(), this.w.c());
    }

    private boolean c(LinkedList<CardConfig> linkedList, LinkedList<CardConfig> linkedList2) {
        if (linkedList == null && linkedList2 == null) {
            return true;
        }
        return (linkedList == null || linkedList2 == null || linkedList.size() != linkedList2.size()) ? false : true;
    }

    private boolean ag() {
        sit sitVar = this.f;
        boolean z = (sitVar == null || this.w == null || (!a(sitVar.b(), this.w.b()) && c(this.f.c(), this.w.c()))) ? false : true;
        this.p = z;
        return z;
    }

    private boolean a(String str, String str2) {
        return CommonUtil.e(str, str2) > 0;
    }

    private boolean p() {
        return (ai() || this.w == null) ? false : true;
    }

    private boolean ai() {
        return this.f == null && this.w == null;
    }

    private void ae() {
        if (this.f == null) {
            AssetManager assets = BaseApplication.getContext().getAssets();
            try {
                if (assets.open("FunctionSetCardConfig.json") != null) {
                    this.f = (sit) lls.a(assets.open("FunctionSetCardConfig.json"), sit.class);
                }
            } catch (IOException e) {
                ReleaseLogUtil.a("FunctionCard_CardManager", "loadDefaultCardSetConfig failed, ", LogAnonymous.b(e));
            }
            sit sitVar = this.f;
            ReleaseLogUtil.d("FunctionCard_CardManager", "mDefaultConfig : ", sitVar == null ? 0 : sitVar.b());
        }
    }

    private void an() {
        if (this.f == null) {
            ReleaseLogUtil.a("FunctionCard_CardManager", "loadLastCardSetConfig failed with defaultConfig is null ");
            return;
        }
        sit sitVarH = h();
        this.w = sitVarH;
        ReleaseLogUtil.d("FunctionCard_CardManager", "mLastConfig : ", sitVarH == null ? 0 : sitVarH.b());
    }

    public sit h() {
        try {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10100), this.f.d());
            if (TextUtils.isEmpty(strE)) {
                return null;
            }
            return (sit) qqt.e(strE, sit.class);
        } catch (JsonSyntaxException e) {
            ReleaseLogUtil.a("FunctionCard_CardManager", "getCardConfigFromDb failed, ", LogAnonymous.b(e));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final sit sitVar, final int i) {
        if (sitVar == null || i <= 0) {
            ReleaseLogUtil.e("FunctionCard_CardManager", "setCardSetConfigToDb failed with error input config:", sitVar, "saveTryTimes： ", Integer.valueOf(i));
            return;
        }
        try {
            this.f48129b.readLock().lock();
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10100), sitVar.d(), qqt.b(sitVar), null);
            LogUtil.a("FunctionCard_CardManager", "setCardSetConfigToSp with config is ", sitVar.toString());
            sit sitVarH = h();
            if (sitVarH != null && sitVarH.d() != null && sitVarH.d().equals(sitVar.d())) {
                this.f48129b.readLock().unlock();
                return;
            }
            ReleaseLogUtil.a("FunctionCard_CardManager", "setCardSetConfigToDb error, get config is :", sitVarH == null ? Constants.NULL : sitVarH.toString());
            a aVar = this.h;
            if (aVar != null) {
                aVar.postDelayed(new Runnable() { // from class: sio.15
                    @Override // java.lang.Runnable
                    public void run() {
                        sio.this.e(sitVar, i - 1);
                    }
                }, TimeUnit.SECONDS.toMillis(2L));
            }
            this.f48129b.readLock().unlock();
        } catch (JsonIOException | ConcurrentModificationException e) {
            ReleaseLogUtil.a("FunctionCard_CardManager", "setCardSetConfigToDb failed, ", LogAnonymous.b(e));
            a aVar2 = this.h;
            if (aVar2 != null) {
                aVar2.postDelayed(new Runnable() { // from class: sio.11
                    @Override // java.lang.Runnable
                    public void run() {
                        sio.this.e(sitVar, i - 1);
                    }
                }, TimeUnit.SECONDS.toMillis(2L));
            }
        }
    }

    public CardConfig e(String str, String str2) {
        LogUtil.a(str, "getCardConfigById cardId:", str2);
        return a(str2);
    }

    private CardConfig a(String str) {
        this.f48129b.readLock().lock();
        ArrayList<CardConfig> arrayList = new ArrayList(this.z.size() + this.q.size());
        arrayList.addAll(this.z);
        arrayList.addAll(this.q);
        for (CardConfig cardConfig : arrayList) {
            if (cardConfig != null && cardConfig.getCardId().equals(str)) {
                this.f48129b.readLock().unlock();
                return cardConfig;
            }
        }
        this.f48129b.readLock().unlock();
        return null;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.manager.OnCardChangedListener
    public void onShowStatusChanged(final String str, final boolean z, final int i) {
        this.h.post(new Runnable() { // from class: sio.2
            @Override // java.lang.Runnable
            public void run() {
                sio.this.e(str, z, i);
            }
        });
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.ICardManager
    public void onShowStatusChanged(final List<String> list, final boolean z, final int i) {
        if (njy.e(list)) {
            return;
        }
        this.h.post(new Runnable() { // from class: sio.4
            @Override // java.lang.Runnable
            public void run() {
                sio.this.b(list, z, i);
            }
        });
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.ICardManager
    public List<String> getCardIdsByGroupId(int i) {
        return this.m.get(i, Collections.EMPTY_LIST);
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.ICardManager
    public sit getCurrentConfigs() {
        return this.g;
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.ICardManager
    public sit getDefaultConfigs() {
        return this.f;
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.ICardManager
    public List<CardConfig> getCardConfigList(boolean z) {
        if (z) {
            return j();
        }
        return f();
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.ICardManager
    public CardConstructor getCardConstructorById(String str) {
        return this.f48128a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, boolean z, int i) {
        ReleaseLogUtil.d("FunctionCard_CardManager", "cardId:", str, " isShow:", Boolean.valueOf(z), " source", Integer.valueOf(i));
        CardConfig cardConfigA = a(str);
        if (cardConfigA == null) {
            return;
        }
        if ("PHYSIOLOGICAL_CYCLE_CARD_KEY_NEW".equals(str) && g()) {
            LogUtil.a("FunctionCard_CardManager", "IsUpdateBuUser, PHYSIOLOGICAL no changed by gender");
            return;
        }
        this.f48129b.writeLock().lock();
        if (cardConfigA.isInitialized() && cardConfigA.isShow() == z) {
            ReleaseLogUtil.d("FunctionCard_CardManager", "cardConfig is not changed,cardId:", cardConfigA.getCardId(), " cardConfig showFlag:", Integer.valueOf(cardConfigA.getShowFlag()), " changed type: ", Boolean.valueOf(z));
            this.f48129b.writeLock().unlock();
            return;
        }
        if (i == -1 && cardConfigA.isInitialized()) {
            this.f48129b.writeLock().unlock();
            return;
        }
        cardConfigA.setShow(z);
        if (i == 1) {
            cardConfigA.setEditFlag(i);
            this.g.a(true);
        }
        d(cardConfigA);
        as();
        this.f48129b.writeLock().unlock();
        aq();
        notifyCardShowStatusChanged(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<String> list, boolean z, int i) {
        ReleaseLogUtil.d("FunctionCard_CardManager", "cardId:", list == null ? null : Arrays.toString(list.toArray()), " isShow:", Boolean.valueOf(z), " source", Integer.valueOf(i));
        if (njy.e(list)) {
            return;
        }
        this.f48129b.writeLock().lock();
        List<CardConfig> listC = c(list, z);
        if (njy.e(listC)) {
            this.f48129b.writeLock().unlock();
            return;
        }
        ArrayList arrayList = new ArrayList(listC.size());
        for (CardConfig cardConfig : listC) {
            if (i != -1 || !cardConfig.isInitialized()) {
                cardConfig.setShow(z);
                arrayList.add(cardConfig.getCardId());
                d(cardConfig);
                if (i == 1) {
                    this.g.a(true);
                    cardConfig.setEditFlag(i);
                }
            }
        }
        as();
        this.f48129b.writeLock().unlock();
        aq();
        if (njy.b(arrayList)) {
            notifyCardShowStatusChanged(arrayList, z);
        }
    }

    private List<CardConfig> c(List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str == null) {
                LogUtil.j("FunctionCard_CardManager", "cardId is null");
            } else {
                CardConfig cardConfigA = a(str);
                if (cardConfigA == null) {
                    LogUtil.j("FunctionCard_CardManager", "cardConfig is null, cardId:", str);
                } else if (cardConfigA.isInitialized() && cardConfigA.isShow() == z) {
                    LogUtil.j("FunctionCard_CardManager", "cardConfig is not changed,cardId:", cardConfigA.getCardId(), " cardConfig showFlag:", Integer.valueOf(cardConfigA.getShowFlag()), " changed type: ", Boolean.valueOf(z));
                } else {
                    arrayList.add(cardConfigA);
                }
            }
        }
        return arrayList;
    }

    private void d(CardConfig cardConfig) {
        if (cardConfig.isShow() && this.q.contains(cardConfig)) {
            this.q.remove(cardConfig);
            this.z.add(cardConfig);
        }
        if (cardConfig.isShow() || !this.z.contains(cardConfig)) {
            return;
        }
        this.z.remove(cardConfig);
        this.q.add(cardConfig);
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver
    public void notifyAllCardChanged() {
        if (njy.e(this.l)) {
            return;
        }
        Iterator<FunctionSetCardObserver> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().notifyAllCardChanged();
        }
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver
    public void notifyCardShowStatusChanged(String str, boolean z) {
        if (njy.e(this.l)) {
            return;
        }
        Iterator<FunctionSetCardObserver> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().notifyCardShowStatusChanged(str, z);
        }
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver
    public void notifyCardShowStatusChanged(List<String> list, boolean z) {
        if (njy.e(this.l)) {
            return;
        }
        Iterator<FunctionSetCardObserver> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().notifyCardShowStatusChanged(list, z);
        }
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver
    public void notifyCardOrderChanged(String str) {
        if (njy.e(this.l)) {
            return;
        }
        Iterator<FunctionSetCardObserver> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().notifyCardOrderChanged(str);
        }
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver
    public void notifyCardInsert(String str) {
        if (njy.e(this.l)) {
            return;
        }
        Iterator<FunctionSetCardObserver> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().notifyCardInsert(str);
        }
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver
    public void notifyCardReplace(String str, String str2) {
        if (njy.e(this.l)) {
            return;
        }
        Iterator<FunctionSetCardObserver> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().notifyCardReplace(str, str2);
        }
    }

    public List<CardConfig> e() {
        LinkedList linkedList = new LinkedList();
        boolean zO = Utils.o();
        for (CardConfig cardConfig : j()) {
            CardConstructor cardConstructor = this.f48128a.get(cardConfig.getCardId());
            if (cardConstructor != null && cardConstructor.isSupport(zO, this.i)) {
                linkedList.add(new CardConfig(cardConfig));
            }
        }
        for (CardConfig cardConfig2 : f()) {
            CardConstructor cardConstructor2 = this.f48128a.get(cardConfig2.getCardId());
            if (cardConstructor2 != null && cardConstructor2.isSupport(zO, this.i)) {
                linkedList.add(new CardConfig(cardConfig2));
            }
        }
        return linkedList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<CardConfig> q() {
        ArrayList arrayList = new ArrayList(this.z.size() + this.q.size());
        arrayList.addAll(this.z);
        arrayList.addAll(this.q);
        return arrayList;
    }

    public void d(String str, String str2) {
        ReleaseLogUtil.d(str, " startHandler：", str2, "mCardManagerHandler", this.h);
        a aVar = this.h;
        if (aVar != null) {
            aVar.d();
        }
    }

    public void c(String str, String str2) {
        ReleaseLogUtil.d(str, " resumeHandler：", str2, "mCardManagerHandler", this.h);
        a aVar = this.h;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void b(String str, String str2) {
        ReleaseLogUtil.d(str, " pauseHandler：", str2, "mCardManagerHandler", this.h);
        a aVar = this.h;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void e(final List<skw> list, final boolean z) {
        ReleaseLogUtil.d("FunctionCard_CardManager", "save edit cards:", list == null ? null : Arrays.toString(list.toArray()));
        if (z) {
            LogUtil.a("FunctionCard_CardManager", "saveEditCards, tryRequestMarketing again");
            this.e.c(b());
        }
        this.h.post(new Runnable() { // from class: sio.1
            @Override // java.lang.Runnable
            public void run() {
                sio.this.f(list, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(List<skw> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.f48129b.writeLock().lock();
        sit sitVar = this.g;
        if (sitVar != null && z) {
            sitVar.a(true);
            arrayList.addAll(this.g.c());
        }
        this.f48129b.writeLock().unlock();
        if (!this.x) {
            e(list, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (skw skwVar : list) {
            CardConfig cardConfigA = a(skwVar.b());
            if (cardConfigA != null && cardConfigA.getShowFlag() != skwVar.e()) {
                cardConfigA.setShowFlag(skwVar.e());
                cardConfigA.setEditFlag(1);
            }
            arrayList2.add(cardConfigA);
        }
        ArrayList arrayList3 = new ArrayList();
        for (CardConfig cardConfig : q()) {
            if (!arrayList2.contains(cardConfig)) {
                arrayList3.add(cardConfig);
            }
        }
        b(arrayList2, arrayList3);
        b(z);
        sis.e().b();
        notifyAllCardChanged();
    }

    private void b(List<CardConfig> list, List<CardConfig> list2) {
        this.f48129b.writeLock().lock();
        this.z.clear();
        this.q.clear();
        for (CardConfig cardConfig : list) {
            if (cardConfig.isShow()) {
                this.z.add(cardConfig);
            } else {
                this.q.add(cardConfig);
            }
        }
        for (CardConfig cardConfig2 : list2) {
            if (cardConfig2.isShow()) {
                this.z.add(cardConfig2);
            } else {
                this.q.add(cardConfig2);
            }
        }
        as();
        this.f48129b.writeLock().unlock();
    }

    private void e(List<skw> list, List<CardConfig> list2) {
        int iB = b(list2, "HEALTH_MODEL_CARD_KEY_NEW");
        int iB2 = b(list2, CardFlowInteractors.CardNameConstants.THREE_CIRCLE_CARD.getName());
        int iE = e(list, "HEALTH_MODEL_CARD_KEY_NEW");
        int iE2 = e(list, CardFlowInteractors.CardNameConstants.THREE_CIRCLE_CARD.getName());
        if (iB != iE) {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "health_life_edited_hide_or_show", Integer.toString(iE), new StorageParams());
        }
        if (iB2 != iE2) {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "three_circle_edited_hide_or_show", Integer.toString(iE2), new StorageParams());
        }
    }

    private int e(List<skw> list, String str) {
        if (njy.e(list)) {
            return -1;
        }
        for (skw skwVar : list) {
            if (skwVar != null && skwVar.b().equals(str)) {
                return skwVar.e();
            }
        }
        return -1;
    }

    private int b(List<CardConfig> list, String str) {
        if (njy.e(list)) {
            return -1;
        }
        for (CardConfig cardConfig : list) {
            if (cardConfig != null && cardConfig.getCardId().equals(str)) {
                return cardConfig.getShowFlag();
            }
        }
        return -1;
    }

    private void e(CardConfig cardConfig) {
        if (cardConfig != null && cardConfig.getCardId().equals("HEALTH_MODEL_CARD_KEY_NEW")) {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "health_life_edited_hide_or_show", Integer.toString(2), new StorageParams());
        }
        if (cardConfig == null || !cardConfig.getCardId().equals(CardFlowInteractors.CardNameConstants.THREE_CIRCLE_CARD.getName())) {
            return;
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "three_circle_edited_hide_or_show", Integer.toString(2), new StorageParams());
    }

    public void b(final CardConfig cardConfig) {
        LogUtil.a("FunctionCard_CardManager", "saveEditDeleteCard, cardId: ", cardConfig.getCardId());
        e(cardConfig);
        this.h.post(new Runnable() { // from class: sio.3
            @Override // java.lang.Runnable
            public void run() {
                new ArrayList();
                sio.this.f48129b.writeLock().lock();
                if (sio.this.g != null) {
                    sio.this.g.a(true);
                }
                sio.this.f48129b.writeLock().unlock();
                String cardId = cardConfig.getCardId();
                List<CardConfig> listQ = sio.this.q();
                for (CardConfig cardConfig2 : listQ) {
                    if (cardConfig2.getCardId().equals(cardId)) {
                        cardConfig2.setShowFlag(2);
                        cardConfig2.setEditFlag(1);
                    }
                }
                sio.this.f48129b.writeLock().lock();
                sio.this.z.clear();
                sio.this.q.clear();
                for (CardConfig cardConfig3 : listQ) {
                    if (cardConfig3.isShow()) {
                        sio.this.z.add(cardConfig3);
                    } else {
                        sio.this.q.add(cardConfig3);
                    }
                }
                sio.this.as();
                sio.this.f48129b.writeLock().unlock();
                sio.this.b(true);
                sio.this.a(false);
                if (sio.this.z.size() == 0) {
                    sio.this.notifyAllCardChanged();
                }
            }
        });
    }

    public void c(boolean z) {
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10100), "IS_OPEN_SMART_RECOMMEND_BY_USER", Boolean.toString(z), null);
        if (z) {
            ap();
        }
    }

    private void ap() {
        SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(10000), "three_circle_edited_hide_or_show");
        SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(10000), "health_life_edited_hide_or_show");
    }

    static class a extends BaseHandler<sio> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final LinkedList<Message> f48142a;
        private volatile boolean e;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(sio sioVar, Message message) {
        }

        a(Looper looper, sio sioVar) {
            super(looper, sioVar);
            this.f48142a = new LinkedList<>();
        }

        public final void b() {
            this.e = true;
        }

        public final void d() {
            this.e = false;
        }

        public final void a() {
            this.e = false;
            while (this.f48142a.size() > 0) {
                Message messagePollFirst = this.f48142a.pollFirst();
                if (messagePollFirst != null) {
                    sendMessage(messagePollFirst);
                }
            }
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            if (this.e) {
                Message messageObtain = Message.obtain();
                messageObtain.copyFrom(message);
                this.f48142a.add(messageObtain);
                return;
            }
            super.dispatchMessage(message);
        }
    }

    private CardConstructor c(CardConfig cardConfig) {
        CardConstructor cardConstructorB = b(cardConfig.getCardConstructorCls(), cardConfig);
        if (cardConstructorB != null) {
            cardConstructorB.init();
            cardConstructorB.setOnChangedListener(this);
        }
        return cardConstructorB;
    }

    static class d implements ResponseCallback<Object> {
        private WeakReference<sio> e;

        private d() {
        }

        private d(sio sioVar) {
            this.e = new WeakReference<>(sioVar);
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        public void onResponse(int i, Object obj) {
            LogUtil.a("FunctionCard_CardManager", "status: ", Integer.valueOf(i), ", data: ", obj);
            WeakReference<sio> weakReference = this.e;
            if (weakReference == null) {
                return;
            }
            sio sioVar = weakReference.get();
            if (sioVar != null) {
                sioVar.r = false;
            } else {
                LogUtil.a("FunctionCard_CardManager", "cardManager has been recycled, do nothing...");
            }
        }
    }

    static class b implements FunctionCardBannerHelper.IResponseCallback {
        private final WeakReference<sio> d;

        b(sio sioVar) {
            this.d = new WeakReference<>(sioVar);
        }

        @Override // com.huawei.ui.homehealth.util.FunctionCardBannerHelper.IResponseCallback
        public void onResponse(int i) {
            sio sioVar = this.d.get();
            if (sioVar == null) {
                LogUtil.a("FunctionCard_CardManager", "cardManager has been recycled, do nothing...");
            } else if (i == 0) {
                LogUtil.e("FunctionCard_CardManager", "request bottom banner view success, refresh function card...");
                sioVar.notifyAllCardChanged();
            } else {
                LogUtil.e("FunctionCard_CardManager", "request bottom banner view failed...");
            }
        }
    }

    public View c(String str, int i) {
        return this.e.a(str, i);
    }

    public List<String> b() {
        CardConstructor cardConstructor;
        LogUtil.a("FunctionCard_CardManager", "getCardIds");
        boolean zO = Utils.o();
        List<CardConfig> listJ = j();
        ArrayList arrayList = new ArrayList();
        for (CardConfig cardConfig : listJ) {
            if (cardConfig != null && (cardConstructor = this.f48128a.get(cardConfig.getCardId())) != null && cardConfig.isShow() && cardConstructor.isSupport(zO, this.i)) {
                arrayList.add(cardConfig.getCardId());
            }
        }
        return arrayList;
    }

    public boolean k() {
        sit sitVar = this.g;
        if (sitVar == null) {
            return false;
        }
        return sitVar.e();
    }
}
