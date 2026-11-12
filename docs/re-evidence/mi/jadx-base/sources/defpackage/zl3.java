package defpackage;

import android.text.TextUtils;
import com.miui.tsmclient.sesdk.CardCategory;
import com.miui.tsmclient.sesdk.OrderData;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.login.utils.RegionUtil;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
public class zl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OrderData.Coupon f41418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<OrderData.Coupon> f41419b;
    public CardWrapper c;
    public List<CardWrapper> d;
    public List<CardWrapper> e;
    public List<CardWrapper> f;
    public List<CardWrapper> g;
    public List<CardWrapper> h;
    public List<CardWrapper> i;
    public List<CardWrapper> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<CardWrapper> f41420k;
    public WearableDeviceModel l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static zl3 f41421a = new zl3();
    }

    public static zl3 g() {
        return a.f41421a;
    }

    public void a() {
        this.e.clear();
        this.d.clear();
        this.f.clear();
        this.h.clear();
        this.j.clear();
        this.f41420k.clear();
        this.l = null;
        c();
    }

    public void b(String str) {
        NfcPreference.putString(str + "_TYPE_TRANS_CARD", "");
        NfcPreference.putString(str + "_TYPE_DOOR_CARD", "");
        NfcPreference.putString(str + "_TYPE_BANK_CARD", "");
    }

    public void c() {
        for (T t : DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModels()) {
            if (t != null) {
                b(t.getDeviceInfo().getDid());
            }
        }
    }

    public List<CardWrapper> d() {
        return e("_TYPE_CAR_CARD", CardCategory.DIGITAL_KEY);
    }

    public final List<CardWrapper> e(String str, CardCategory cardCategory) {
        ArrayList arrayList = new ArrayList();
        WearableDeviceModel wearableDeviceModel = this.l;
        if (wearableDeviceModel != null && !TextUtils.isEmpty(wearableDeviceModel.getDeviceInfo().getDid())) {
            try {
                String str2 = this.l.getDeviceInfo().getDid() + str + RegionUtil.getCurrentLocalCountry().toUpperCase() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + yhq.c.a();
                vqg.a("getCardListFromLocal typs:" + str + "  spKey:" + str2);
                String string = NfcPreference.getString(str2);
                if (TextUtils.isEmpty(string)) {
                    return arrayList;
                }
                JSONArray jSONArray = new JSONArray(string);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add("_TYPE_MASTER_CARD".equals(str) ? new CardWrapper(cardCategory, jSONArray.getJSONObject(i)) : new CardWrapper(cardCategory, jSONArray.getJSONObject(i)));
                }
            } catch (Exception e) {
                vqg.c("getCards error : ", e);
            }
            vqg.a("getCardListFromLocal type = " + str + ", size = " + arrayList.size());
        }
        return arrayList;
    }

    public List<CardWrapper> f() {
        return e("_TYPE_DOOR_CARD", CardCategory.DOOR);
    }

    public List<CardWrapper> h() {
        return e("_TYPE_MASTER_CARD", null);
    }

    public CardWrapper i() {
        return this.c;
    }

    public List<CardWrapper> j() {
        return e("_TYPE_TRANS_CARD", CardCategory.TRANSIT);
    }

    public void k(WearableDeviceModel wearableDeviceModel) {
        this.l = wearableDeviceModel;
    }

    public void l(CardWrapper cardWrapper) {
        this.c = cardWrapper;
    }

    public void m() {
        o("_TYPE_BANK_CARD", this.h);
    }

    public void n() {
        o("_TYPE_CAR_CARD", this.g);
    }

    public final void o(String str, List<CardWrapper> list) {
        WearableDeviceModel wearableDeviceModel = this.l;
        if (wearableDeviceModel == null || TextUtils.isEmpty(wearableDeviceModel.getDeviceInfo().getDid())) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<CardWrapper> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().serialize());
        }
        String str2 = this.l.getDeviceInfo().getDid() + str + RegionUtil.getCurrentLocalCountry().toUpperCase() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + yhq.c.a();
        vqg.a("syncCardList2Local typs:" + str + "  spKey:" + str2);
        NfcPreference.putString(str2, jSONArray.toString());
    }

    public void p() {
        o("_TYPE_DOOR_CARD", this.f);
    }

    public void q() {
        o("_TYPE_MASTER_CARD", this.j);
    }

    public void r() {
        o("_TYPE_TRANS_CARD", this.e);
    }

    public synchronized void s(List<CardWrapper> list) {
        g().d.clear();
        g().d.addAll(list);
        g().t();
    }

    public synchronized void t() {
        g().e.clear();
        for (int i = 0; i < g().d.size(); i++) {
            if (g().d.get(i).isIssued()) {
                g().e.add(g().d.get(i));
            }
        }
    }

    public zl3() {
        this.f41419b = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.f41420k = new ArrayList();
    }
}
