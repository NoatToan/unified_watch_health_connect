package com.huawei.health.health.utils.functionsetcard;

import android.content.ContentValues;
import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hms.kit.awareness.status.CapabilityStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import defpackage.fft;
import defpackage.lsr;
import defpackage.lsy;
import defpackage.lua;
import health.compact.a.EnvironmentUtils;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class FunctionSetBeanHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile FunctionSetBeanHelper f7080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f7081b;
    private Context d;
    private String j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f7082c = "0";
    private List<SpBean> e = new CopyOnWriteArrayList();
    private List<String> i = new ArrayList<String>() { // from class: com.huawei.health.health.utils.functionsetcard.FunctionSetBeanHelper.2
        {
            add("FunctionSetWeightCardReader");
            add("FunctionSetHeartRateReader");
            add("FunctionSetStressCardReader");
            add("FunctionSetBloodSugarCardReader");
            add("FunctionSetTemperatureCardReader");
            add("SportsRecordingCardReader");
            add("FunctionSetBloodOxygenCardReader");
            add("FunctionSetSleepCardReader");
            add("FunctionSetBloodPressureReader");
        }
    };

    /* JADX INFO: renamed from: com.huawei.health.health.utils.functionsetcard.FunctionSetBeanHelper$3, reason: invalid class name */
    class AnonymousClass3 extends TypeToken<Map<String, HiHealthData>> {
    }

    /* JADX INFO: renamed from: com.huawei.health.health.utils.functionsetcard.FunctionSetBeanHelper$4, reason: invalid class name */
    class AnonymousClass4 extends TypeToken<Map<String, HiHealthData>> {
    }

    private FunctionSetBeanHelper() {
        Context contextB = BaseApplication.b();
        this.d = contextB;
        d(contextB);
        f();
        if (this.f7082c.equals("0")) {
            LogUtil.a("FunctionSetBeanHelper", "get mHuid");
            ThreadPoolManager.c().execute(new Runnable() { // from class: faf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33767c.d();
                }
            });
        }
    }

    public /* synthetic */ void d() {
        this.f7082c = LoginInit.getInstance(this.d).getUsetId();
    }

    public static final FunctionSetBeanHelper e() {
        if (f7080a == null) {
            synchronized (FunctionSetBeanHelper.class) {
                if (f7080a == null) {
                    f7080a = new FunctionSetBeanHelper();
                }
            }
        }
        return f7080a;
    }

    private void f() {
        this.j = lua.h(fft.f34005c, "health_model_data_cache");
    }

    public String a() {
        return this.j;
    }

    public void b(JSONObject jSONObject) {
        this.f7081b = jSONObject;
        SharedPreferenceManager.c(Integer.toString(CapabilityStatus.AWA_CAP_CODE_WIFI), "enterMemberListTime", jSONObject.toString());
    }

    public JSONObject b() {
        JSONObject jSONObject = this.f7081b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(SharedPreferenceManager.b(Integer.toString(CapabilityStatus.AWA_CAP_CODE_WIFI), "enterMemberListTime", ""));
        } catch (JSONException e) {
            LogUtil.e("FunctionSetBeanHelper", ExceptionUtils.c(e));
            return null;
        }
    }

    public HiHealthData c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (SpBean spBean : this.e) {
            if (str.equals(spBean.getKey())) {
                HiHealthData val = spBean.getVal();
                if (val == null) {
                    LogUtil.a("FunctionSetBeanHelper", str, ", data is null");
                    return null;
                }
                ContentValues valueHolder = val.getValueHolder();
                if (valueHolder != null && valueHolder.size() != 0) {
                    return val;
                }
                LogUtil.a("FunctionSetBeanHelper", str, ", contentValues is null");
                break;
            }
        }
        return null;
    }

    private void d(Context context) {
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            List<SpBean> listA = a(context);
            if (listA == null || listA.isEmpty()) {
                LogUtil.a("FunctionSetBeanHelper", "getCardSp is null");
                List<SpBean> listJ = j();
                if (listJ.isEmpty()) {
                    LogUtil.a("FunctionSetBeanHelper", "getEveryCardSp is null");
                    return;
                } else {
                    a(listJ);
                    lsy.a(new Runnable() { // from class: com.huawei.health.health.utils.functionsetcard.FunctionSetBeanHelper.1
                        @Override // java.lang.Runnable
                        public void run() {
                            FunctionSetBeanHelper.this.g();
                            FunctionSetBeanHelper functionSetBeanHelper = FunctionSetBeanHelper.this;
                            functionSetBeanHelper.b((List<SpBean>) functionSetBeanHelper.e);
                        }
                    });
                }
            } else {
                LogUtil.a("FunctionSetBeanHelper", listA.toString());
                a(listA);
            }
            LogUtil.a("FunctionSetBeanHelper", "readCacheData success. times=", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        } catch (ClassCastException unused) {
            LogUtil.e("FunctionSetBeanHelper", "ClassCastException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        for (int i = 0; i < this.i.size(); i++) {
            SharedPreferenceUtil.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).writeHealthData(this.i.get(i), null);
        }
        SharedPreferenceUtil.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).writeHealthData("version", EnvironmentUtils.a());
    }

    private void a(List<SpBean> list) {
        this.e.clear();
        for (SpBean spBean : list) {
            if (spBean != null) {
                String key = spBean.getKey();
                HiHealthData val = spBean.getVal();
                if (!TextUtils.isEmpty(key) && val != null) {
                    this.e.add(new SpBean(key, val));
                }
            }
        }
    }

    private List<SpBean> j() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.i.size(); i++) {
            String str = this.i.get(i);
            String healthData = SharedPreferenceUtil.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).readHealthData(str);
            if (TextUtils.isEmpty(healthData)) {
                LogUtil.a("FunctionSetBeanHelper", "cardData is null");
            } else {
                HiHealthData hiHealthData = (HiHealthData) lsr.b(healthData, HiHealthData.CREATOR, null);
                if (hiHealthData == null) {
                    LogUtil.a("FunctionSetBeanHelper", "healthData is null");
                } else {
                    LogUtil.a("FunctionSetBeanHelper", "has sp data: ", str);
                    arrayList.add(new SpBean(str, hiHealthData));
                }
            }
        }
        return arrayList;
    }

    private List<SpBean> a(Context context) {
        if (context == null) {
            LogUtil.a("FunctionSetBeanHelper", "context: ", null);
            return null;
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(10100), "AllCardReader");
        ArrayList arrayList = new ArrayList();
        lsr.c(strE, getClass().getClassLoader(), null, arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<SpBean> list) {
        if (SharedPreferenceManager.e(this.d, Integer.toString(10100), "AllCardReader", lsr.e(list, null), new StorageParams()) == 0) {
            LogUtil.a("FunctionSetBeanHelper", "saveCardSp success");
        } else {
            LogUtil.a("FunctionSetBeanHelper", "saveCardSp failed");
        }
    }

    public void c() {
        f7080a = null;
    }

    public final void b(final String str, final HiHealthData hiHealthData) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.health.utils.functionsetcard.FunctionSetBeanHelper.5
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetBeanHelper.this.c(str, hiHealthData);
                }
            });
        } else {
            c(str, hiHealthData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, HiHealthData hiHealthData) {
        HiHealthData val;
        String str2;
        int i;
        if (this.e == null) {
            LogUtil.a("FunctionSetBeanHelper", "mCardSpMap is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("FunctionSetBeanHelper", "tag is null");
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.e.size()) {
                val = null;
                str2 = "";
                i = -1;
                break;
            } else {
                SpBean spBean = this.e.get(i2);
                if (str.equals(spBean.getKey())) {
                    val = spBean.getVal();
                    i = i2;
                    str2 = str;
                    break;
                }
                i2++;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            this.e.add(new SpBean(str, hiHealthData));
            b(this.e);
            return;
        }
        if (val == null && hiHealthData == null) {
            LogUtil.a("FunctionSetBeanHelper", "isSameData");
            return;
        }
        if (val == null || hiHealthData == null) {
            this.e.set(i, new SpBean(str, hiHealthData));
            b(this.e);
        } else if (val.equals(hiHealthData)) {
            LogUtil.a("FunctionSetBeanHelper", "isSameData");
        } else {
            this.e.set(i, new SpBean(str, hiHealthData));
            b(this.e);
        }
    }

    public static class SpBean implements Parcelable {
        public static final Parcelable.Creator<SpBean> CREATOR = new Parcelable.Creator<SpBean>() { // from class: com.huawei.health.health.utils.functionsetcard.FunctionSetBeanHelper.SpBean.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SpBean createFromParcel(Parcel parcel) {
                return new SpBean(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public SpBean[] newArray(int i) {
                return new SpBean[i];
            }
        };

        @SerializedName(MedalConstants.EVENT_KEY)
        private String key;

        @SerializedName("val")
        private HiHealthData val;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SpBean(String str, HiHealthData hiHealthData) {
            this.key = str;
            this.val = hiHealthData;
        }

        public SpBean(Parcel parcel) {
            this.key = parcel.readString();
            this.val = (HiHealthData) parcel.readParcelable(HiHealthData.class.getClassLoader());
        }

        public String getKey() {
            return this.key;
        }

        public void setKey(String str) {
            this.key = str;
        }

        public HiHealthData getVal() {
            return this.val;
        }

        public void setVal(HiHealthData hiHealthData) {
            this.val = hiHealthData;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.key);
            parcel.writeParcelable(this.val, i);
        }
    }
}
