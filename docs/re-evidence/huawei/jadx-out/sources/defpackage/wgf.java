package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class wgf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f52018a = "DataTypesOfSource";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f52019b = BaseApplication.getContext();
    private final Handler e = new Handler(Looper.getMainLooper());

    protected void c(int i, String str, String str2, int i2, DataSourceCallback<vzq> dataSourceCallback) {
        HiDataReadProOption hiDataReadProOptionD = d(i, str, str2, i2);
        HiHealthNativeApi hiHealthNativeApiA = HiHealthNativeApi.a(this.f52019b);
        LogUtil.a(f52018a, "getDataTypes start");
        hiHealthNativeApiA.readHiHealthDataPro(hiDataReadProOptionD, new AnonymousClass4(dataSourceCallback, str));
    }

    /* JADX INFO: renamed from: wgf$4, reason: invalid class name */
    class AnonymousClass4 implements HiDataReadResultListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52020b;
        final /* synthetic */ DataSourceCallback e;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        AnonymousClass4(DataSourceCallback dataSourceCallback, String str) {
            this.e = dataSourceCallback;
            this.f52020b = str;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a(wgf.f52018a, "getDataTypes end errorCode = ", Integer.valueOf(i));
            if (i != 0) {
                Handler handler = wgf.this.e;
                final DataSourceCallback dataSourceCallback = this.e;
                handler.post(new Runnable() { // from class: wgj
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback.onResponse(1, null);
                    }
                });
                return;
            }
            SparseArray sparseArray = new SparseArray();
            if (obj instanceof SparseArray) {
                sparseArray = (SparseArray) obj;
            }
            if (sparseArray.size() == 0) {
                LogUtil.e(wgf.f52018a, "has no data");
                Handler handler2 = wgf.this.e;
                final DataSourceCallback dataSourceCallback2 = this.e;
                handler2.post(new Runnable() { // from class: wgi
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback2.onResponse(0, null);
                    }
                });
                return;
            }
            HashMap map = new HashMap(sparseArray.size());
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                map.put(Integer.valueOf(sparseArray.keyAt(i3)), Integer.valueOf(i3));
            }
            final vzq vzqVarA = wgf.this.a(map);
            vzqVarA.a(this.f52020b);
            Handler handler3 = wgf.this.e;
            final DataSourceCallback dataSourceCallback3 = this.e;
            handler3.post(new Runnable() { // from class: wgl
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback3.onResponse(0, vzqVarA);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public vzq a(HashMap<Integer, Integer> map) {
        vzq vzqVar = new vzq();
        vzqVar.f(e(map, new int[]{2}));
        vzqVar.g(e(map, new int[]{3}));
        vzqVar.e(e(map, new int[]{4}));
        vzqVar.b(e(map, new int[]{5}));
        vzqVar.h(e(map, new int[]{2002, 2018, 2105}));
        vzqVar.k(e(map, new int[]{10006}));
        vzqVar.i(e(map, new int[]{22100, 22000, 22107, 22106}));
        vzqVar.j(e(map, new int[]{2034, 44307}));
        vzqVar.c(e(map, new int[]{2103, 47204}));
        vzqVar.d(e(map, new int[]{DicDataTypeUtil.DataType.BLOOD_PRESSURE_DIASTOLIC.value(), DicDataTypeUtil.DataType.BLOOD_PRESSURE_SYSTOLIC.value()}));
        vzqVar.a(e(map, new int[]{2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2106}));
        vzqVar.n(e(map, new int[]{2104, DicDataTypeUtil.DataType.BODY_TEMPERATURE.value(), DicDataTypeUtil.DataType.SKIN_TEMPERATURE.value(), DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE.value()}));
        return vzqVar;
    }

    private boolean e(HashMap<Integer, Integer> map, int[] iArr) {
        for (int i : iArr) {
            if (map.containsKey(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    private HiDataReadProOption d(int i, String str, String str2, int i2) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setType(b(i2, str, str2));
        hiDataReadOption.setReadType(i);
        hiDataReadOption.setDeviceUuid(str);
        hiDataReadOption.setStartTime(0L);
        hiDataReadOption.setEndTime(System.currentTimeMillis());
        hiDataReadOption.setCount(1);
        return HiDataReadProOption.builder().e(hiDataReadOption).a(str2).b();
    }

    private int[] b(int i, String str, String str2) {
        if (wgr.d(i, this.f52019b)) {
            return new int[]{DicDataTypeUtil.DataType.BLOOD_PRESSURE_DIASTOLIC.value(), DicDataTypeUtil.DataType.BLOOD_PRESSURE_SYSTOLIC.value()};
        }
        if (wgr.d(str2, str)) {
            return new int[]{DicDataTypeUtil.DataType.BLOOD_PRESSURE_DIASTOLIC.value(), DicDataTypeUtil.DataType.BLOOD_PRESSURE_SYSTOLIC.value(), 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2106, 2104, 2104, DicDataTypeUtil.DataType.BODY_TEMPERATURE.value(), DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE.value(), DicDataTypeUtil.DataType.SKIN_TEMPERATURE.value(), 10006, 22107, 22106};
        }
        return new int[]{2, 3, 4, 5, 2002, 2018, 2105, 10006, 22100, 22000, 2034, 44307, 2103, 47204, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2106, 2104, DicDataTypeUtil.DataType.BODY_TEMPERATURE.value(), DicDataTypeUtil.DataType.SKIN_TEMPERATURE.value(), DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE.value(), DicDataTypeUtil.DataType.BLOOD_PRESSURE_DIASTOLIC.value(), DicDataTypeUtil.DataType.BLOOD_PRESSURE_SYSTOLIC.value()};
    }
}
