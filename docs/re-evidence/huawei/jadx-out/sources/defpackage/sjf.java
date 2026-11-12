package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.functionsetcard.manager.ICardManager;
import com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardShowStrategy;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class sjf implements CardShowStrategy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f48165c;
    protected ICardManager d;

    public sjf(ICardManager iCardManager) {
        this.d = iCardManager;
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardShowStrategy
    public void doStrategy() {
        c();
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardShowStrategy
    public void release() {
        d();
    }

    public void e() {
        if (fua.b(BaseApplication.getContext())) {
            j();
        } else {
            g();
        }
    }

    public void a() {
        a((Object) Boolean.valueOf(siu.e()), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: sjf.5
                @Override // java.lang.Runnable
                public void run() {
                    sjf.this.c();
                }
            });
            return;
        }
        final Map<String, List<Integer>> mapB = b();
        HashSet hashSet = new HashSet();
        for (List<Integer> list : mapB.values()) {
            if (njy.b(list)) {
                hashSet.addAll(list);
            }
        }
        ReleaseLogUtil.d("FunctionCard_HasDataStrategy", "doDataStatusStrategy() types size:", Integer.valueOf(hashSet.size()));
        if (njy.e(hashSet)) {
            return;
        }
        siu.e(BaseApplication.getContext(), siu.a(hashSet), new IBaseResponseCallback() { // from class: sjf.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                List listA = sjf.this.a(obj, (Map<String, List<Integer>>) mapB);
                if (njy.b(listA)) {
                    sjf.this.b(listA);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> a(Object obj, Map<String, List<Integer>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        if (njy.b(obj, Integer.class)) {
            List list = (List) obj;
            for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
                Iterator<Integer> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    if (list.contains(it.next()) && !arrayList.contains(entry.getKey())) {
                        arrayList.add(entry.getKey());
                    }
                }
            }
        }
        return arrayList;
    }

    private Map<String, List<Integer>> b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ICardManager iCardManager = this.d;
        if (iCardManager == null) {
            LogUtil.j("FunctionCard_HasDataStrategy", "getAllUninitializedCardTypes mCardImpl is null");
            return linkedHashMap;
        }
        for (CardConfig cardConfig : iCardManager.getUninitializedCardsFromCache()) {
            linkedHashMap.put(cardConfig.getCardId(), cardConfig.getDataTypes());
        }
        return linkedHashMap;
    }

    private void j() {
        a((Object) Boolean.valueOf(siu.e()), true);
    }

    private void g() {
        ICardManager iCardManager = this.d;
        if (iCardManager == null) {
            LogUtil.j("FunctionCard_HasDataStrategy", "initCardOrder mCardImpl is null");
        } else {
            this.d.onShowStatusChanged(iCardManager.getCardIdsByGroupId(4), true, -1);
        }
    }

    private void a(Object obj, boolean z) {
        List<String> cardIdsByGroupId;
        LogUtil.a("FunctionCard_HasDataStrategy", "setInitNoDataByGenderSetDefaultConfig isFemale:", obj);
        if (obj instanceof Boolean) {
            if (this.d == null) {
                LogUtil.j("FunctionCard_HasDataStrategy", "mCardImpl is null");
                return;
            }
            if (((Boolean) obj).booleanValue()) {
                int i = z ? 2 : 5;
                if (CommonUtil.bd() && CommonUtil.z(BaseApplication.getContext())) {
                    i = z ? 1 : 6;
                }
                cardIdsByGroupId = this.d.getCardIdsByGroupId(i);
            } else {
                cardIdsByGroupId = this.d.getCardIdsByGroupId(z ? 1 : 6);
            }
            this.d.onShowStatusChanged(cardIdsByGroupId, true, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj) {
        ReleaseLogUtil.d("FunctionCard_HasDataStrategy", "setMemoryByCurrentSetHasDataConfig has data ");
        if (njy.b(obj, String.class)) {
            ICardManager iCardManager = this.d;
            if (iCardManager == null) {
                LogUtil.j("FunctionCard_HasDataStrategy", "setMemoryByCurrentSetHasDataConfig mCardImpl is null");
            } else {
                iCardManager.onShowStatusChanged((List) obj, true, -1);
            }
        }
    }

    public void d() {
        try {
            if (this.f48165c != null) {
                BaseApplication.getContext().unregisterReceiver(this.f48165c);
            }
        } catch (IllegalArgumentException unused) {
            LogUtil.e("FunctionCard_HasDataStrategy", "DeviceStatusBroadcast not register before");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Intent intent) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
            if (parcelableExtra instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
                ReleaseLogUtil.d("FunctionCard_HasDataStrategy", "deviceStatusChangeAction connectState is", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                if (deviceInfo.getDeviceConnectState() != 2) {
                    return;
                }
                if (deviceInfo.getProductType() == 275) {
                    c("BLOODSUGAR_CARD_KEY_NEW");
                } else if (eey.d(deviceInfo, 59)) {
                    c("BLOODPRESSURE_CARD_KEY_NEW");
                }
                if (njy.c(fad.d(), fad.f33763a, false)) {
                    ReleaseLogUtil.d("FunctionCard_HasDataStrategy", "deviceStatusChangeAction no card need change");
                    d();
                }
            }
        } catch (ClassCastException unused) {
            ReleaseLogUtil.a("FunctionCard_HasDataStrategy", "deviceStatusChangeAction bind ClassCastException.");
        }
    }

    private void c(String str) {
        ReleaseLogUtil.d("FunctionCard_HasDataStrategy", "changeCardOrderOrStatus cardId:", str);
        if (fad.d().contains(str)) {
            ReleaseLogUtil.e("FunctionCard_HasDataStrategy", "changeCardOrderOrStatus no need to change card status");
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        List<String> listB = sio.c().b();
        if (sio.c().k() || !njy.b(listB) || !listB.contains(str) || listB.indexOf(str) >= 4) {
            arrayList.add(str);
        }
        if (njy.b(arrayList)) {
            fad.c(str);
            sio.c().a(2, arrayList, true);
        }
    }

    class d extends BroadcastReceiver {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ sjf f48168c;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                ReleaseLogUtil.e("FunctionCard_HasDataStrategy", "DeviceStatusReceiver onReceive intent is null.");
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                ReleaseLogUtil.e("FunctionCard_HasDataStrategy", "DeviceStatusReceiver onReceive action is null");
                return;
            }
            ReleaseLogUtil.d("FunctionCard_HasDataStrategy", "DeviceStatusReceiver onReceive action :", action);
            if (TextUtils.equals(action, "com.huawei.bone.action.CONNECTION_STATE_CHANGED")) {
                this.f48168c.c(intent);
            }
        }
    }
}
