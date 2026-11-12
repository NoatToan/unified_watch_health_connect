package com.huawei.ui.homehealth.knit;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.utils.functionsetcard.CardFlowInteractors;
import com.huawei.health.health.utils.functionsetcard.manager.constructor.CardConstructor;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.datatype.templates.FunctionCardTemplate;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.ui.widget.XiaomiWidgetProvider;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.phoneprocess.mgr.hwmenstrualmanager.bean.MenstrualSwitchStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver;
import com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementActivity;
import defpackage.fto;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qdm;
import defpackage.sio;
import defpackage.sis;
import defpackage.skg;
import defpackage.sox;
import defpackage.tfc;
import defpackage.tfi;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
public class FunctionSetCardProvider extends BaseKnitDataProvider implements FunctionSetCardObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private sio f25582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f25583c;
    private long f;
    private NoTitleCustomAlertDialog k;
    private Observer l;
    private SectionBean m;
    private BroadcastReceiver o;
    private long i = 0;
    private final Object g = new Object();
    private Handler d = new Handler(Looper.getMainLooper());
    private List<FunctionSetSubCardData> h = new ArrayList(10);
    private HashMap<String, Object> j = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25581a = true;
    private View.OnClickListener n = new View.OnClickListener() { // from class: com.huawei.ui.homehealth.knit.FunctionSetCardProvider.5
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FunctionSetCardProvider.this.a();
            HashMap map = new HashMap(1);
            map.put("click", 1);
            map.put("from", 0);
            map.put("smartRecommend", Boolean.valueOf(FunctionSetCardProvider.this.f25582b.i()));
            lmf.d().c(FunctionSetCardProvider.this.f25583c.getApplicationContext(), AnalyticsValue.HEALTH_HOME_MANAGERMENT_CARD_2010032.value(), map, 0);
        }
    };
    private BroadcastReceiver e = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.knit.FunctionSetCardProvider.9
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            int intExtra = intent.getIntExtra("refresh_type", -1);
            boolean zIsRunningForeground = BaseApplication.isRunningForeground();
            if (intExtra == 0) {
                sis.e().b();
                FunctionSetCardProvider.this.a(zIsRunningForeground);
            }
            if (intExtra == 9) {
                for (FunctionSetSubCardData functionSetSubCardData : FunctionSetCardProvider.this.h) {
                    if (functionSetSubCardData instanceof skg) {
                        if (!zIsRunningForeground) {
                            functionSetSubCardData.setDataChangeOnBg(true);
                        } else {
                            functionSetSubCardData.readCardData();
                        }
                    }
                }
            }
        }
    };

    public interface IRequestCallback {
        void onSuccess(FunctionCardTemplate functionCardTemplate);
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver
    public void notifyCardOrderChanged(String str) {
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        super.loadDefaultData(sectionBean);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        LogUtil.a("FunctionSetCardProvider", "loadData");
        this.f25583c = context;
        this.m = sectionBean;
        if (this.f25581a) {
            sio sioVarC = sio.c();
            this.f25582b = sioVarC;
            sioVarC.a((FunctionSetCardObserver) this);
            i();
            g();
            b();
            c();
            j();
            this.f25581a = false;
        }
        e();
        this.j.put("REFRESH_NO_CARD_LAYOUT_SHOW_STATUS", true);
        this.m.c(new Object());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        ReleaseLogUtil.d("R_FunctionSetCardProvider", "onResume mLastRequestSummaryTime ", Long.valueOf(this.f));
        if (Math.abs(System.currentTimeMillis() - this.f) > 600000 || !lsl.aa(this.f)) {
            j();
        }
        LogUtil.a("FunctionSetCardProvider", "resume");
        synchronized (this.g) {
            if (njy.e(this.h)) {
                return;
            }
            for (FunctionSetSubCardData functionSetSubCardData : this.h) {
                if (functionSetSubCardData != null) {
                    functionSetSubCardData.onResume();
                }
            }
            this.f25582b.o();
        }
    }

    private void j() {
        List<String> listB = sio.c().b();
        ReleaseLogUtil.d("R_FunctionSetCardProvider", "initSummary cardList ", listB);
        if (njy.e(listB)) {
            return;
        }
        List<String> listC = c(listB);
        qdm.a(listC, listB.size());
        ReleaseLogUtil.d("R_FunctionSetCardProvider", "initSummary list ", listC, " mLastRequestSummaryTime ", Long.valueOf(this.f));
        this.f = System.currentTimeMillis();
    }

    private List<String> c(List<String> list) {
        ArrayList arrayList = new ArrayList(3);
        if (list.contains(CardFlowInteractors.CardNameConstants.THREE_CIRCLE_CARD.getName())) {
            arrayList.add("activityRings");
        }
        if (list.contains(CardFlowInteractors.CardNameConstants.BLOODPRESSURE_CARD.getName())) {
            arrayList.add(MessageConstant.BLOOD_PRESSURE_TYPE);
        }
        if (list.contains(CardFlowInteractors.CardNameConstants.STRESS_CARD.getName())) {
            arrayList.add("emotionalHealth");
        }
        if (list.contains(CardFlowInteractors.CardNameConstants.HEARTRATE_CARD.getName())) {
            arrayList.add("heartHealth");
        }
        return arrayList;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        LogUtil.a("FunctionSetCardProvider", "parseParams");
        map.clear();
        map.putAll(this.j);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        fto.d(this.f25583c, this.h, this.f25582b.i());
        super.onDestroy();
        sio.d();
        synchronized (this.g) {
            for (FunctionSetSubCardData functionSetSubCardData : this.h) {
                if (functionSetSubCardData != null) {
                    functionSetSubCardData.onDestroy();
                }
            }
        }
        this.f25582b.d(this);
        m();
        n();
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.d = null;
        }
        synchronized (this.g) {
            this.h.clear();
        }
        ObserverManagerUtil.a(this.l, "PRESS_HODLE_DELETE_CARD");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.j.clear();
        this.j.put("ADD_CARD_TEXT", this.f25583c.getString(R.string.IDS_hw_show_main_home_page_add_card));
        this.j.put("EMPTY_CARD_PROMPT_TEXT", this.f25583c.getString(R.string.IDS_hw_show_main_home_page_no_card_tips));
        this.j.put("BTN_MODIFY_CARDS", this.f25583c.getString(R.string.IDS_hw_health_home_edit_card));
        this.j.put("FUNCTION_SET_NO_CARD_CLICK_EVENT", this.n);
        this.j.put("SMART_RECOMMEND", Boolean.valueOf(this.f25582b.i()));
    }

    private void e() {
        d();
        List<CardConstructor> listA = this.f25582b.a();
        if (njy.e(listA)) {
            LogUtil.j("FunctionSetCardProvider", "initCard mViewAdapter or cardConstructors is null");
            return;
        }
        synchronized (this.g) {
            this.h.clear();
            this.h.addAll(tfc.a(this.f25583c, listA, null));
            this.j.put("DATA_LIST", this.h);
        }
        this.j.put("NOTIFY_DATA_SET_CHANGED", true);
    }

    private void i() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.hihealth.action_data_refresh");
        LocalBroadcastManager.getInstance().registerReceiver(this.e, intentFilter);
        LogUtil.a("FunctionSetCardProvider", "mHiBroadcastReceiver register success", this);
    }

    private void m() {
        if (this.e != null) {
            try {
                LocalBroadcastManager.getInstance().unregisterReceiver(this.e);
                LogUtil.a("FunctionSetCardProvider", "mHiBroadcastReceiver unregister", this);
            } catch (IllegalArgumentException unused) {
                LogUtil.e("FunctionSetCardProvider", "IllegalArgumentException mHiBroadcastReceiver unregister");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        LogUtil.a("FunctionSetCardProvider", "refreshAllCard");
        synchronized (this.g) {
            for (FunctionSetSubCardData functionSetSubCardData : this.h) {
                LogUtil.a("FunctionSetCardProvider", "refreshAllCard, reader: ", functionSetSubCardData);
                if (functionSetSubCardData != null) {
                    if (functionSetSubCardData instanceof FunctionSetBeanReader) {
                        ((FunctionSetBeanReader) functionSetSubCardData).setRefreshReason(0);
                    }
                    if (!z) {
                        functionSetSubCardData.setDataChangeOnBg(true);
                    } else {
                        functionSetSubCardData.readCardData();
                    }
                }
            }
            d();
            this.j.put("DATA_LIST", this.h);
        }
        this.m.c(new Object());
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver
    public void notifyAllCardChanged() {
        if (this.d == null) {
            LogUtil.j("FunctionSetCardProvider", "notifyAllCardChanged mHandler is null");
        } else {
            LogUtil.a("FunctionSetCardProvider", "notifyAllCardChanged");
            this.d.post(new Runnable() { // from class: com.huawei.ui.homehealth.knit.FunctionSetCardProvider.7
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (FunctionSetCardProvider.this.g) {
                        List<CardConstructor> listA = FunctionSetCardProvider.this.f25582b.a();
                        FunctionSetCardProvider.this.h.clear();
                        FunctionSetCardProvider.this.h.addAll(tfc.d(FunctionSetCardProvider.this.f25583c, FunctionSetCardProvider.this.h, listA, null));
                        FunctionSetCardProvider.this.d();
                        FunctionSetCardProvider.this.j.put("DATA_LIST", FunctionSetCardProvider.this.h);
                    }
                    FunctionSetCardProvider.this.j.put("SET_ADAPTER", true);
                    FunctionSetCardProvider.this.j.put("REFRESH_NO_CARD_LAYOUT_SHOW_STATUS", true);
                    FunctionSetCardProvider.this.m.c(new Object());
                    FunctionSetCardProvider.this.k();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        lsy.a(new Runnable() { // from class: com.huawei.ui.homehealth.knit.FunctionSetCardProvider.8
            @Override // java.lang.Runnable
            public void run() {
                FunctionSetCardProvider.this.l();
            }
        });
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver
    public void notifyCardShowStatusChanged(final String str, final boolean z) {
        LogUtil.a("FunctionSetCardProvider", "notifyCardShowStatusChanged cardId");
        Handler handler = this.d;
        if (handler == null) {
            LogUtil.j("FunctionSetCardProvider", "notifyCardShowStatusChanged mHandler is null");
        } else {
            handler.post(new Runnable() { // from class: com.huawei.ui.homehealth.knit.FunctionSetCardProvider.6
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetCardProvider.this.d();
                    FunctionSetCardProvider.this.b(str, z, false);
                    FunctionSetCardProvider.this.b(str, z);
                    FunctionSetCardProvider.this.j.put("REFRESH_NO_CARD_LAYOUT_SHOW_STATUS", true);
                    synchronized (FunctionSetCardProvider.this.g) {
                        FunctionSetCardProvider.this.j.put("DATA_LIST", FunctionSetCardProvider.this.h);
                    }
                    FunctionSetCardProvider.this.m.c(new Object());
                }
            });
        }
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver
    public void notifyCardShowStatusChanged(final List<String> list, final boolean z) {
        LogUtil.a("FunctionSetCardProvider", "notifyCardShowStatusChanged cardIds");
        Handler handler = this.d;
        if (handler == null) {
            LogUtil.j("FunctionSetCardProvider", "notifyCardShowStatusChanged mHandler is null");
        } else {
            handler.post(new Runnable() { // from class: com.huawei.ui.homehealth.knit.FunctionSetCardProvider.10
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetCardProvider.this.d();
                    for (String str : list) {
                        FunctionSetCardProvider.this.b(str, z, false);
                        FunctionSetCardProvider.this.b(str, z);
                    }
                    FunctionSetCardProvider.this.j.put("REFRESH_NO_CARD_LAYOUT_SHOW_STATUS", true);
                    synchronized (FunctionSetCardProvider.this.g) {
                        FunctionSetCardProvider.this.j.put("DATA_LIST", FunctionSetCardProvider.this.h);
                    }
                    FunctionSetCardProvider.this.m.c(new Object());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, boolean z, boolean z2) {
        int i;
        LogUtil.a("FunctionSetCardProvider", "changeCardShowStatus cardId = ", str, " isShow = ", Boolean.valueOf(z));
        if (StringUtils.g(str)) {
            LogUtil.j("FunctionSetCardProvider", "changeCardShowStatus cardId or mViewAdapter is null");
            return;
        }
        if (!z2 && "PHYSIOLOGICAL_CYCLE_CARD_KEY_NEW".equals(str) && this.f25582b.g()) {
            LogUtil.a("FunctionSetCardProvider", "IsUpdateBuUser, PHYSIOLOGICAL no changed by gender");
            return;
        }
        synchronized (this.g) {
            i = 0;
            while (true) {
                if (i >= this.h.size()) {
                    i = -1;
                    break;
                } else if (str.equals(this.h.get(i).getCardId())) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (z) {
            LogUtil.a("FunctionSetCardProvider", "changeCardShowStatus add card,  position = ", Integer.valueOf(i));
            c(str, i);
        } else if (i >= 0) {
            LogUtil.a("FunctionSetCardProvider", "changeCardShowStatus remove card,  position = ", Integer.valueOf(i));
            synchronized (this.g) {
                d(i);
            }
        }
    }

    private void d(int i) {
        FunctionSetSubCardData functionSetSubCardData = this.h.get(i);
        this.h.remove(i);
        this.j.put("NOTIFY_ITEM_REMOVED", Integer.valueOf(i));
        if (i != this.h.size()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(this.h.size() - i));
            this.j.put("NOTIFY_ITEM_RANGE_CHANGED", arrayList);
        }
        if (functionSetSubCardData != null) {
            functionSetSubCardData.onDestroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, int i) {
        List<CardConstructor> listA = this.f25582b.a();
        for (int i2 = 0; i2 < listA.size(); i2++) {
            CardConstructor cardConstructor = listA.get(i2);
            if (str.equals(cardConstructor.getCardId())) {
                if (i != i2) {
                    LogUtil.a("FunctionSetCardProvider", "addNewCardByCardId fromPosition = ", Integer.valueOf(i), " toPosition = ", Integer.valueOf(i2));
                    fto.c(this.f25583c, e(cardConstructor, i, i2), this.f25582b.i(), 2);
                    return;
                }
                return;
            }
        }
    }

    private FunctionSetSubCardData e(CardConstructor cardConstructor, int i, int i2) {
        synchronized (this.g) {
            if (i2 < this.h.size()) {
                if (i >= 0) {
                    Collections.swap(this.h, i, i2);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(i));
                    arrayList.add(Integer.valueOf(i2));
                    this.j.put("NOTIFY_ITEM_MOVED", arrayList);
                    LogUtil.a("FunctionSetCardProvider", "swap card, fromPosition = ", Integer.valueOf(i), " toPosition = ", Integer.valueOf(i2));
                } else {
                    LogUtil.j("FunctionSetCardProvider", "add new card to position, toPosition = ", Integer.valueOf(i2));
                    FunctionSetSubCardData functionSetSubCardDataCreateCardReader = cardConstructor.createCardReader(this.f25583c);
                    functionSetSubCardDataCreateCardReader.setCardConstructor(cardConstructor);
                    this.h.add(i2, functionSetSubCardDataCreateCardReader);
                    this.j.put("NOTIFY_ITEM_INSERTED", Integer.valueOf(i2));
                    return functionSetSubCardDataCreateCardReader;
                }
            } else {
                if (i < 0) {
                    FunctionSetSubCardData functionSetSubCardDataCreateCardReader2 = cardConstructor.createCardReader(this.f25583c);
                    functionSetSubCardDataCreateCardReader2.setCardConstructor(cardConstructor);
                    this.h.add(functionSetSubCardDataCreateCardReader2);
                    this.j.put("NOTIFY_ITEM_INSERTED", Integer.valueOf(this.h.size() - 1));
                    LogUtil.a("FunctionSetCardProvider", "add new card to end");
                    return functionSetSubCardDataCreateCardReader2;
                }
                LogUtil.j("FunctionSetCardProvider", "swap card fromPosition = ", Integer.valueOf(i));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2) {
        int i;
        FunctionSetSubCardData functionSetSubCardData;
        LogUtil.a("FunctionSetCardProvider", "replaceCard showCardId = ", str2, " hideCardId = ", str);
        if (StringUtils.g(str2) || StringUtils.g(str)) {
            LogUtil.j("FunctionSetCardProvider", "changeCardShowStatus cardId or mViewAdapter is null");
            return;
        }
        synchronized (this.g) {
            i = 0;
            while (true) {
                if (i >= this.h.size()) {
                    i = -1;
                    break;
                } else if (str.equals(this.h.get(i).getCardId())) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (i >= 0) {
            LogUtil.a("FunctionSetCardProvider", "changeCardShowStatus remove card,  position = ", Integer.valueOf(i));
            synchronized (this.g) {
                functionSetSubCardData = this.h.get(i);
                this.h.remove(i);
                this.j.put("NOTIFY_ITEM_REMOVED", Integer.valueOf(i));
            }
            if (functionSetSubCardData != null) {
                functionSetSubCardData.onDestroy();
            }
            e(str2, -1);
        }
    }

    private void e(String str, int i) {
        List<CardConstructor> listA = this.f25582b.a();
        for (int i2 = 0; i2 < listA.size(); i2++) {
            CardConstructor cardConstructor = listA.get(i2);
            if (str.equals(cardConstructor.getCardId())) {
                LogUtil.a("FunctionSetCardProvider", "insertNewCardByCardId fromPosition = ", Integer.valueOf(i), " toPosition = ", Integer.valueOf(i2));
                fto.c(this.f25583c, e(cardConstructor, i, i2), this.f25582b.i(), 2);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, boolean z) {
        if ("PHYSIOLOGICAL_CYCLE_CARD_KEY_NEW".equals(str)) {
            SharedPreferenceManager.e(this.f25583c, Integer.toString(10100), "PHYSIOLOGICAL_SHOW_STATE_KEY", z ? "true" : "false", new StorageParams());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("FunctionSetCardProvider", "go to Card Management activity");
        if (this.f25583c != null) {
            try {
                this.f25583c.startActivity(new Intent(this.f25583c, (Class<?>) FunctionSetCardManagementActivity.class));
            } catch (ActivityNotFoundException e) {
                LogUtil.e("FunctionSetCardProvider", "ActivityNotFoundException", e.getMessage());
            }
        }
    }

    static class a implements Observer {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<FunctionSetCardProvider> f25599c;

        a(FunctionSetCardProvider functionSetCardProvider) {
            this.f25599c = new WeakReference<>(functionSetCardProvider);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            if (objArr == null) {
                LogUtil.j("FunctionSetCardProvider", "args is null");
                return;
            }
            if (objArr.length >= 2 && (objArr[1] instanceof String)) {
                FunctionSetCardProvider functionSetCardProvider = this.f25599c.get();
                if (functionSetCardProvider != null) {
                    functionSetCardProvider.a((String) objArr[1], (FunctionSetSubCardData) objArr[0]);
                } else {
                    LogUtil.j("FunctionSetCardProvider", "DeleteCardObserver provider is null");
                }
            }
        }
    }

    public void b() {
        a aVar = new a(this);
        this.l = aVar;
        ObserverManagerUtil.d(aVar, "PRESS_HODLE_DELETE_CARD");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, FunctionSetSubCardData functionSetSubCardData) {
        CardConfig cardConfig;
        if ("1".equals(str)) {
            if (functionSetSubCardData == null || (cardConfig = functionSetSubCardData.getCardConfig()) == null) {
                return;
            }
            b(cardConfig, functionSetSubCardData);
            return;
        }
        if ("2".equals(str)) {
            a();
            fto.a(this.f25583c, this.f25582b.i(), 2);
            fto.e(this.f25583c, this.f25582b.i(), 1, functionSetSubCardData);
        } else {
            if ("3".equals(str)) {
                fto.a(this.f25583c, functionSetSubCardData);
                return;
            }
            if ("4".equals(str)) {
                fto.a(this.f25583c, this.f25582b.i(), 0);
            } else if ("5".equals(str)) {
                fto.a(this.f25583c, this.f25582b.i(), 3);
            } else if ("6".equals(str)) {
                fto.b(this.f25583c, functionSetSubCardData);
            }
        }
    }

    private void b(CardConfig cardConfig, FunctionSetSubCardData functionSetSubCardData) {
        if ("PHYSIOLOGICAL_CYCLE_CARD_KEY_NEW".equals(cardConfig.getCardId())) {
            d(cardConfig, functionSetSubCardData);
        } else {
            c(cardConfig, functionSetSubCardData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final CardConfig cardConfig, final FunctionSetSubCardData functionSetSubCardData) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.homehealth.knit.FunctionSetCardProvider.12
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetCardProvider.this.c(cardConfig, functionSetSubCardData);
                }
            });
            return;
        }
        b(cardConfig.getCardId(), false);
        fto.e(this.f25583c, 0, functionSetSubCardData, this.h, this.f25582b.i(), 0);
        d();
        b(cardConfig.getCardId(), false, true);
        synchronized (this.g) {
            this.j.put("DATA_LIST", this.h);
        }
        this.m.c(new Object());
        this.f25582b.b(cardConfig);
        LogUtil.a("FunctionSetCardProvider", "hide card cardId: " + cardConfig.getCardId());
        fto.a(this.f25583c, this.f25582b.i(), 1);
        fto.b(functionSetSubCardData, 3, sio.c().i());
    }

    private void d(final CardConfig cardConfig, final FunctionSetSubCardData functionSetSubCardData) {
        LogUtil.a("FunctionSetCardProvider", "processPhysiologicalCycleCardDelete");
        ThreadPoolManager.c().execute(new Runnable() { // from class: spg
            @Override // java.lang.Runnable
            public final void run() {
                this.f48490a.e(cardConfig, functionSetSubCardData);
            }
        });
    }

    public /* synthetic */ void e(CardConfig cardConfig, FunctionSetSubCardData functionSetSubCardData) {
        String strJ = tfi.j(this.f25583c);
        if (strJ == null) {
            LogUtil.e("FunctionSetCardProvider", "getMenstrualSwitch is null.");
            c(cardConfig, functionSetSubCardData);
        } else {
            if ("".equals(strJ)) {
                a(cardConfig, functionSetSubCardData, strJ);
                return;
            }
            try {
                if (new JSONObject(strJ).getInt("masterSwitch") == 1) {
                    a(cardConfig, functionSetSubCardData, strJ);
                    return;
                }
            } catch (JSONException unused) {
                LogUtil.e("FunctionSetCardProvider", "setPhysicalCycleSwitch JSONException.");
            }
            c(cardConfig, functionSetSubCardData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final CardConfig cardConfig, final FunctionSetSubCardData functionSetSubCardData, final String str) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.homehealth.knit.FunctionSetCardProvider.11
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetCardProvider.this.a(cardConfig, functionSetSubCardData, str);
                }
            });
            return;
        }
        if (this.k == null) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f25583c);
            builder.a(this.f25583c.getResources().getString(R.string.IDS_physiological_cycle_hide_card_dialog_content)).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.knit.FunctionSetCardProvider.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            }).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.knit.FunctionSetCardProvider.13
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    FunctionSetCardProvider.this.b(str);
                    FunctionSetCardProvider.this.f();
                    FunctionSetCardProvider.this.c(cardConfig, functionSetSubCardData);
                }
            });
            this.k = builder.c();
        }
        if (this.k.isShowing()) {
            return;
        }
        this.k.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final String str) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: spe
            @Override // java.lang.Runnable
            public final void run() {
                this.f48488b.e(str);
            }
        });
    }

    public /* synthetic */ void e(String str) {
        try {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add("masterSwitch");
            arrayList.add("menstrualStartSwitch");
            arrayList.add("menstrualEndSwitch");
            arrayList.add("easyPregnancyStartSwitch");
            arrayList.add("easyPregnancyEndSwitch");
            JSONObject jSONObject = new JSONObject(str);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONObject.put((String) it.next(), 0);
            }
            HiUserPreference userPreference = HiHealthManager.d(this.f25583c).getUserPreference("com.huawei.health.mc");
            if (userPreference == null) {
                ReleaseLogUtil.e("FunctionSetCardProvider", "setPhysicalCycleSwitch userPreference is null");
                return;
            }
            userPreference.setValue(jSONObject.toString());
            userPreference.setSyncStatus(0);
            HiHealthManager.d(this.f25583c).setUserPreference(userPreference);
        } catch (JSONException unused) {
            LogUtil.e("FunctionSetCardProvider", "setPhysicalCycleSwitch JSONException.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        MenstrualSwitchStatus menstrualSwitchStatus = new MenstrualSwitchStatus();
        menstrualSwitchStatus.setMasterSwitch(0);
        menstrualSwitchStatus.setMenstruationStartRemindSwitch(0);
        menstrualSwitchStatus.setMenstruationEndRemindSwitch(0);
        menstrualSwitchStatus.setEasyPregnancyStartSwitch(0);
        menstrualSwitchStatus.setEasyPregnancyEndSwitch(0);
        sox.d().a(menstrualSwitchStatus);
    }

    private void g() {
        if (this.o != null) {
            LogUtil.j("FunctionSetCardProvider", "registerProcessRestart mProcessReceiver has registered");
            return;
        }
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.knit.FunctionSetCardProvider.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String stringExtra = intent.getStringExtra("processName");
                boolean booleanExtra = intent.getBooleanExtra("isRunning", false);
                LogUtil.a("FunctionSetCardProvider", "processName: ", stringExtra, " isRunning: ", Boolean.valueOf(booleanExtra), " time: ", Long.valueOf(intent.getLongExtra("time", 0L)));
                if (XiaomiWidgetProvider.DAEMON_SERVICE_PROCESS.equals(stringExtra) && booleanExtra) {
                    ReleaseLogUtil.d("FunctionSetCardProvider", "DaemonService restart, subscribe again");
                    FunctionSetCardProvider.this.h();
                    WheelChairStateManager.a().i();
                    WheelChairStateManager.a().j();
                }
            }
        };
        this.o = broadcastReceiver;
        BroadcastManager.a(broadcastReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        LogUtil.a("FunctionSetCardProvider", "resubscribeAllCard");
        for (FunctionSetSubCardData functionSetSubCardData : this.h) {
            LogUtil.a("FunctionSetCardProvider", "resubscribeAllCard, reader: ", functionSetSubCardData);
            if (functionSetSubCardData != null) {
                functionSetSubCardData.unsubscribeDataChange();
                functionSetSubCardData.subscribeDataChange();
            }
        }
    }

    private void n() {
        BroadcastReceiver broadcastReceiver = this.o;
        if (broadcastReceiver != null) {
            BroadcastManager.m(broadcastReceiver);
            this.o = null;
        }
    }

    private void c() {
        HandlerExecutor.c(new d(this), 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        CardConfig cardConfig;
        for (FunctionSetSubCardData functionSetSubCardData : this.h) {
            if (functionSetSubCardData != null && (cardConfig = functionSetSubCardData.getCardConfig()) != null && "PHYSIOLOGICAL_CYCLE_CARD_KEY_NEW".equals(cardConfig.getCardId())) {
                SharedPreferenceManager.e(this.f25583c, Integer.toString(10100), "PHYSIOLOGICAL_SHOW_STATE_KEY", "true", new StorageParams());
                return;
            }
        }
        SharedPreferenceManager.e(this.f25583c, Integer.toString(10100), "PHYSIOLOGICAL_SHOW_STATE_KEY", "false", new StorageParams());
    }

    static class d implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<FunctionSetCardProvider> f25600c;

        d(FunctionSetCardProvider functionSetCardProvider) {
            this.f25600c = new WeakReference<>(functionSetCardProvider);
        }

        @Override // java.lang.Runnable
        public void run() {
            FunctionSetCardProvider functionSetCardProvider = this.f25600c.get();
            if (functionSetCardProvider == null) {
                LogUtil.a("FunctionSetCardProvider", "holder ref is null");
                return;
            }
            String strE = SharedPreferenceManager.e(functionSetCardProvider.f25583c, Integer.toString(10100), "PHYSIOLOGICAL_SHOW_STATE_KEY");
            LogUtil.a("FunctionSetCardProvider", "initPhyscialCycleShowStatusSp value: ", strE);
            if (TextUtils.isEmpty(strE)) {
                functionSetCardProvider.l();
            }
        }
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver
    public void notifyCardInsert(final String str) {
        LogUtil.a("FunctionSetCardProvider", "notifyCardInsert cardId: ", str);
        Handler handler = this.d;
        if (handler == null) {
            LogUtil.j("FunctionSetCardProvider", "notifyCardInsert mHandler is null");
        } else {
            handler.post(new Runnable() { // from class: com.huawei.ui.homehealth.knit.FunctionSetCardProvider.1
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetCardProvider.this.d();
                    FunctionSetCardProvider.this.c(str, -1);
                    FunctionSetCardProvider.this.j.put("REFRESH_NO_CARD_LAYOUT_SHOW_STATUS", true);
                    synchronized (FunctionSetCardProvider.this.g) {
                        FunctionSetCardProvider.this.j.put("DATA_LIST", FunctionSetCardProvider.this.h);
                    }
                    FunctionSetCardProvider.this.m.c(new Object());
                }
            });
        }
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver
    public void notifyCardReplace(final String str, final String str2) {
        LogUtil.a("FunctionSetCardProvider", "notifyCardReplace hideCardId: ", str, " showCardId", str2);
        Handler handler = this.d;
        if (handler == null) {
            LogUtil.j("FunctionSetCardProvider", "notifyCardReplace mHandler is null");
        } else {
            handler.post(new Runnable() { // from class: com.huawei.ui.homehealth.knit.FunctionSetCardProvider.4
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetCardProvider.this.d();
                    FunctionSetCardProvider.this.d(str, str2);
                    FunctionSetCardProvider.this.j.put("REFRESH_NO_CARD_LAYOUT_SHOW_STATUS", true);
                    synchronized (FunctionSetCardProvider.this.g) {
                        FunctionSetCardProvider.this.j.put("DATA_LIST", FunctionSetCardProvider.this.h);
                    }
                    FunctionSetCardProvider.this.m.c(new Object());
                }
            });
        }
    }
}
