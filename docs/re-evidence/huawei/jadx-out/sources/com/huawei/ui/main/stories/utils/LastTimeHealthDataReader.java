package com.huawei.ui.main.stories.utils;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.gwc;
import defpackage.iuo;
import defpackage.vbk;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class LastTimeHealthDataReader<T extends BaseActivity> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c<T> f29075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f29076b = BaseApplication.getContext().getApplicationContext();
    private long e;

    public enum CardData {
        SLEEP,
        BLOOD_OXYGEN,
        PRESSURE,
        WEIGHT,
        HEALTH_RATE,
        BLOOD_SUGAR,
        TEMPERATURE
    }

    public LastTimeHealthDataReader(T t, IBaseResponseCallback iBaseResponseCallback) {
        this.f29075a = new c<>(Looper.getMainLooper(), t, iBaseResponseCallback);
    }

    public void b(CardData cardData) {
        HiHealthManager.d(this.f29076b).readHiHealthData(e(cardData), new e(this.e, this.f29075a, cardData, this));
    }

    public static final class e implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<c> f29078a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<LastTimeHealthDataReader> f29079c;
        private CardData d;
        private long e;

        public e(long j, c cVar, CardData cardData, LastTimeHealthDataReader lastTimeHealthDataReader) {
            this.e = j;
            this.f29078a = new WeakReference<>(cVar);
            this.d = cardData;
            this.f29079c = new WeakReference<>(lastTimeHealthDataReader);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LastTimeHealthDataReader lastTimeHealthDataReader = this.f29079c.get();
            if (lastTimeHealthDataReader == null) {
                LogUtil.e("LastTimeHealthDataReader", "onResult handle abort, cause reader is null!");
                return;
            }
            LogUtil.a("LastTimeHealthDataReader", "readCardData ", " end, Time: ", Long.valueOf(System.currentTimeMillis() - this.e), " ms");
            c cVar = this.f29078a.get();
            if (cVar == null) {
                LogUtil.e("LastTimeHealthDataReader", "onResult handle abort, cause updateUiHandler is null!");
                return;
            }
            Message messageObtainMessage = cVar.obtainMessage();
            if (!(obj instanceof SparseArray)) {
                LogUtil.j("LastTimeHealthDataReader", this.d.name(), "data is null! errorCode=", Integer.valueOf(i));
                messageObtainMessage.what = -1;
                messageObtainMessage.arg1 = i;
                cVar.sendMessage(messageObtainMessage);
                return;
            }
            SparseArray<List<HiHealthData>> sparseArray = (SparseArray) obj;
            if (sparseArray.size() > 0) {
                HiDataReadOption hiDataReadOptionE = lastTimeHealthDataReader.e(this.d);
                HiHealthData hiHealthDataC = c(sparseArray, hiDataReadOptionE.getType());
                if (hiHealthDataC == null) {
                    LogUtil.j("LastTimeHealthDataReader", "read ", this.d.name(), "lastData == null ,errorCode=", Integer.valueOf(i));
                    messageObtainMessage.what = -1;
                    messageObtainMessage.arg1 = i;
                    cVar.sendMessage(messageObtainMessage);
                    return;
                }
                b(sparseArray, hiHealthDataC, this.d, hiDataReadOptionE.getType());
                LogUtil.a("LastTimeHealthDataReader", "read ", this.d.name(), "last data time=", Long.valueOf(hiHealthDataC.getStartTime()));
                messageObtainMessage.what = 0;
                messageObtainMessage.obj = hiHealthDataC;
                cVar.sendMessage(messageObtainMessage);
                return;
            }
            LogUtil.j("LastTimeHealthDataReader", this.d.name(), "map.size() <= 0,errorCode=", Integer.valueOf(i));
            messageObtainMessage.what = -1;
            messageObtainMessage.arg1 = i;
            cVar.sendMessage(messageObtainMessage);
        }

        private void b(SparseArray<List<HiHealthData>> sparseArray, HiHealthData hiHealthData, CardData cardData, int[] iArr) {
            if (cardData != CardData.SLEEP) {
                return;
            }
            long startTime = hiHealthData.getStartTime();
            int length = iArr.length;
            int i = 0;
            int i2 = 0;
            boolean zI = false;
            int intValue = 0;
            boolean z = false;
            while (i2 < length) {
                List<HiHealthData> list = sparseArray.get(iArr[i2]);
                if (list instanceof List) {
                    List<HiHealthData> list2 = list;
                    if (list2.get(i) != null) {
                        HiHealthData hiHealthData2 = list2.get(i);
                        LogUtil.a("LastTimeHealthDataReader", "hihealthdata ", hiHealthData2.toString(), " dayTime ", Long.valueOf(startTime));
                        if (hiHealthData2.getStartTime() == startTime) {
                            if (hiHealthData2.getType() == 44110) {
                                zI = gwc.i(hiHealthData2.getIntValue());
                            } else if (hiHealthData2.getType() == 44217) {
                                intValue = hiHealthData2.getIntValue();
                            }
                            if (hiHealthData2.getType() == 44235) {
                                z = hiHealthData2.getIntValue() == 5;
                            }
                        }
                    }
                }
                i2++;
                i = 0;
            }
            hiHealthData.putBoolean("HAS_BED_SCIENCE", zI && intValue > 0);
            hiHealthData.putBoolean("COULD_SHOW_BOOT_PAGE", z);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.d("LastTimeHealthDataReader", "onResultIntent");
        }

        private HiHealthData c(SparseArray<List<HiHealthData>> sparseArray, int[] iArr) {
            ArrayList arrayList = new ArrayList(sparseArray.size());
            for (int i : iArr) {
                List<HiHealthData> list = sparseArray.get(i);
                if (list instanceof List) {
                    arrayList.addAll(list);
                }
            }
            if (arrayList.size() == 0) {
                return null;
            }
            Collections.sort(arrayList, new Comparator() { // from class: wur
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((HiHealthData) obj2).getEndTime(), ((HiHealthData) obj).getEndTime());
                }
            });
            return (HiHealthData) arrayList.get(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HiDataReadOption e(CardData cardData) {
        int[] iArr;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.e = jCurrentTimeMillis;
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setCount(1);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setStartTime(0L);
        hiDataReadOption.setEndTime(jCurrentTimeMillis);
        switch (cardData) {
            case SLEEP:
                hiDataReadOption.setType(new int[]{44105, 44004, 44108, 44109, 44217, 44110, 44235});
                hiDataReadOption.setConstantsKey(new String[]{"core_sleep_total_sleep_time_key", "common_sleep_duration_sleep_sum_key", "core_sleep_day_sleep_time_key", "data_session_manual_sleep_bed_time_key", "core_sleep_bed_time_key", "sleep_device_category_key", "sleep_version"});
                break;
            case BLOOD_OXYGEN:
                hiDataReadOption.setType(new int[]{2103, 2107});
                break;
            case PRESSURE:
                hiDataReadOption.setType(new int[]{44307});
                break;
            case WEIGHT:
                hiDataReadOption.setType(new int[]{10006});
                hiDataReadOption.setConstantsKey(new String[]{BleConstants.WEIGHT_KEY});
                long jG = iuo.g();
                if (jG < jCurrentTimeMillis) {
                    hiDataReadOption.setStartTime(jG);
                }
                break;
            case HEALTH_RATE:
                hiDataReadOption.setType(new int[]{46019});
                break;
            case BLOOD_SUGAR:
                hiDataReadOption.setType(new int[]{10001, 2108});
                break;
            case TEMPERATURE:
                vbk vbkVarC = vbk.c();
                if (Utils.o()) {
                    iArr = new int[]{vbkVarC.l()};
                } else {
                    iArr = new int[]{vbkVarC.a(), 2104, vbkVarC.f(), vbkVarC.g(), vbkVarC.q(), vbkVarC.o()};
                }
                hiDataReadOption.setType(iArr);
                break;
            default:
                LogUtil.e("LastTimeHealthDataReader", "Unknown card data type");
                break;
        }
        return hiDataReadOption;
    }

    public static class c<T> extends BaseHandler<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final IBaseResponseCallback f29077b;

        c(Looper looper, T t, IBaseResponseCallback iBaseResponseCallback) {
            super(looper, t);
            this.f29077b = iBaseResponseCallback;
        }

        @Override // com.huawei.haf.handler.BaseHandler
        public void handleMessageWhenReferenceNotNull(T t, Message message) {
            if (t == null) {
                LogUtil.e("LastTimeHealthDataReader", "handleMessageWhenReferenceNotNull obj == null");
                return;
            }
            if (this.f29077b == null) {
                LogUtil.e("LastTimeHealthDataReader", "handleMessageWhenReferenceNotNull callback == null");
                return;
            }
            if (message == null) {
                LogUtil.e("LastTimeHealthDataReader", "handleMessageWhenReferenceNotNull msg == null");
                return;
            }
            if (message.what == 0 && (message.obj instanceof HiHealthData)) {
                LogUtil.a("LastTimeHealthDataReader", "handleMessage()MSG_READ_LAST_DATA_TIME_SUCCESS");
                this.f29077b.a(message.arg1, (HiHealthData) message.obj);
                return;
            }
            this.f29077b.a(message.arg1, null);
        }
    }
}
