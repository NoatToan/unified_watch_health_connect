package com.huawei.health.manager.common;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.media3.common.C;
import com.huawei.common.Constant;
import com.huawei.health.manager.util.UserInfo;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lsl;
import health.compact.a.OneMinuteStepData;
import health.compact.a.SharedPerferenceUtils;
import health.compact.a.StepDataCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FlushableStepDataCache extends StepDataCache {
    private Context d = null;
    private int e = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8081b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<InsertEvent> f8082c = new ArrayList(10);
    private UserInfo g = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8080a = "unKnown";

    public interface MyFlushCallback {
        void onFailed();

        void onSuccess();
    }

    public FlushableStepDataCache(Context context) {
        b(context);
    }

    private void b(Context context) {
        synchronized (this) {
            if (context == null) {
                context = BaseApplication.getContext();
                this.d = context;
                this.g = UserInfo.a();
                this.e = SharedPerferenceUtils.ad(this.d);
            } else {
                this.d = context;
                this.g = UserInfo.a();
                this.e = SharedPerferenceUtils.ad(this.d);
            }
            throw th;
        }
    }

    public void e(MyFlushCallback myFlushCallback) {
        int i;
        SparseArray<OneMinuteStepData> sparseArrayC = c();
        if (sparseArrayC == null || sparseArrayC.size() <= 0) {
            LogUtil.a("Step_FlushableStepDataCache", "writeDataToDB(),dataList==null or dataList.size()== 0");
            if (myFlushCallback != null) {
                myFlushCallback.onSuccess();
                return;
            }
            return;
        }
        LogUtil.a("Step_FlushableStepDataCache", "writeDataToDB size ", Integer.valueOf(sparseArrayC.size()));
        synchronized (this) {
            i = this.e;
            for (InsertEvent insertEvent : this.f8082c) {
                if (insertEvent.f8087c > i) {
                    i = insertEvent.f8087c;
                }
            }
        }
        int iE = (int) sparseArrayC.valueAt(sparseArrayC.size() - 1).e();
        InsertEvent insertEvent2 = new InsertEvent();
        insertEvent2.d = System.currentTimeMillis();
        insertEvent2.f8085a = i;
        insertEvent2.f8087c = iE;
        synchronized (this) {
            this.f8082c.add(insertEvent2);
        }
        HiDataInsertOption hiDataInsertOptionA = a(sparseArrayC, i, iE);
        if (hiDataInsertOptionA != null) {
            HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOptionA, new InsertCallback(insertEvent2, myFlushCallback));
            return;
        }
        myFlushCallback.onSuccess();
        synchronized (this) {
            if (this.f8082c.contains(insertEvent2)) {
                this.f8082c.remove(insertEvent2);
            }
        }
    }

    private HiDataInsertOption a(SparseArray<OneMinuteStepData> sparseArray, int i, int i2) {
        if (sparseArray == null || sparseArray.size() == 0) {
            LogUtil.a("Step_FlushableStepDataCache", "upLoadOneMinuteDataToEngine(),oneMinuteData==null or dataArray.size() == 0");
            return null;
        }
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        ArrayList arrayList = new ArrayList(10);
        String str = this.f8080a;
        synchronized (this) {
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                OneMinuteStepData oneMinuteStepDataValueAt = sparseArray.valueAt(i3);
                if (oneMinuteStepDataValueAt.e() >= i && oneMinuteStepDataValueAt.e() <= i2 && oneMinuteStepDataValueAt.g()) {
                    if (oneMinuteStepDataValueAt.e() >= this.f8081b) {
                        LogUtil.d("Step_FlushableStepDataCache", "upLoadOneMinuteDataToEngine getTimestampInMinute() >= mTimeLogBegin");
                    }
                    oneMinuteStepDataValueAt.c(str, arrayList);
                    oneMinuteStepDataValueAt.a(str, this.g, arrayList);
                    oneMinuteStepDataValueAt.b(str, this.g, arrayList);
                    oneMinuteStepDataValueAt.a(str, arrayList);
                    oneMinuteStepDataValueAt.b(str, arrayList);
                }
            }
        }
        hiDataInsertOption.setDatas(arrayList);
        if (arrayList.size() > 0) {
            return hiDataInsertOption;
        }
        return null;
    }

    public void d(String str) {
        this.f8080a = str;
    }

    public void a() {
        synchronized (this) {
            SparseArray<OneMinuteStepData> sparseArrayC = c();
            if (sparseArrayC.size() > 80) {
                synchronized (this) {
                    int iR = (int) (lsl.r(System.currentTimeMillis()) / 60000);
                    int i = this.e;
                    if (i < iR) {
                        iR = i;
                    }
                    int i2 = 0;
                    for (int i3 = 0; i3 < sparseArrayC.size(); i3++) {
                        if (sparseArrayC.valueAt(i3).e() < iR + Constant.MORE_BENEFITS_ACTIVE_DEVICE_NO_CONNECT) {
                            i2++;
                        }
                    }
                    sparseArrayC.removeAtRange(0, i2);
                }
            }
        }
    }

    class InsertCallback implements HiDataOperateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private InsertEvent f8083b;
        private MyFlushCallback d;

        InsertCallback(InsertEvent insertEvent, MyFlushCallback myFlushCallback) {
            this.f8083b = insertEvent;
            this.d = myFlushCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
        public void onResult(int i, Object obj) {
            LogUtil.a("Step_FlushableStepDataCache", "InsertCallback() onSuccess type = ", Integer.valueOf(i));
            if (obj != null) {
                Bundle bundle = new Bundle();
                if (i == 0) {
                    e();
                    return;
                }
                LogUtil.a("Step_FlushableStepDataCache", "insert failed isError");
                bundle.putBoolean("result", false);
                MyFlushCallback myFlushCallback = this.d;
                if (myFlushCallback != null) {
                    myFlushCallback.onFailed();
                    return;
                }
                return;
            }
            LogUtil.a("Step_FlushableStepDataCache", "InsertCallback data = null", "cb=", this.d, " mFlushCallback no to callback");
        }

        private void e() {
            synchronized (FlushableStepDataCache.this) {
                this.f8083b.f8086b = true;
                Iterator it = FlushableStepDataCache.this.f8082c.iterator();
                while (it.hasNext()) {
                    InsertEvent insertEvent = (InsertEvent) it.next();
                    if (!insertEvent.f8086b) {
                        break;
                    }
                    FlushableStepDataCache.this.e = insertEvent.f8087c;
                    LogUtil.a("Step_FlushableStepDataCache", "InsertEvent mIsSuccess begin:", Integer.valueOf(this.f8083b.f8085a), " end:", Integer.valueOf(this.f8083b.f8087c));
                    SharedPerferenceUtils.a(FlushableStepDataCache.this.d, insertEvent.f8087c);
                    it.remove();
                }
                FlushableStepDataCache.this.b();
            }
            MyFlushCallback myFlushCallback = this.d;
            if (myFlushCallback != null) {
                myFlushCallback.onSuccess();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Iterator<InsertEvent> it = this.f8082c.iterator();
        if (it.hasNext()) {
            if (System.currentTimeMillis() - it.next().d > C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
                this.f8082c.clear();
            }
        }
    }

    @Override // health.compact.a.StepDataCache
    public void c(int i) {
        synchronized (this) {
            if (i < this.e) {
                this.e = i;
            }
            Iterator<InsertEvent> it = this.f8082c.iterator();
            while (it.hasNext()) {
                InsertEvent next = it.next();
                if (i < next.f8087c) {
                    LogUtil.a("Step_FlushableStepDataCache", "insert conflict event timeBegin ", Integer.valueOf(next.f8085a), " timeEnd ", Integer.valueOf(next.f8087c));
                    it.remove();
                }
            }
        }
    }

    static class InsertEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f8085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f8086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f8087c;
        long d;

        private InsertEvent() {
            this.f8086b = false;
            this.d = 0L;
            this.f8085a = 0;
            this.f8087c = 0;
        }
    }
}
