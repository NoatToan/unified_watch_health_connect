package com.huawei.health.hwuserlabelmgr.manager;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.fmf;
import defpackage.lsy;
import defpackage.njy;
import health.compact.a.HiDateUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class UpdateTrackDataListener implements HiSubscribeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f7142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f7143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IBaseResponseCallback f7144c = new IBaseResponseCallback() { // from class: com.huawei.health.hwuserlabelmgr.manager.UpdateTrackDataListener.3
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (obj instanceof List) {
                List<HiHealthData> list = (List) obj;
                if (njy.e(list)) {
                    return;
                }
                Context context = UpdateTrackDataListener.this.f7143b;
                Context unused = UpdateTrackDataListener.this.f7143b;
                boolean z = false;
                SharedPreferences sharedPreferences = context.getSharedPreferences("user label last modify time", 0);
                long unused2 = UpdateTrackDataListener.f7142a = sharedPreferences.getLong("user label last modify time", 0L);
                ArrayList arrayList = new ArrayList(10);
                for (HiHealthData hiHealthData : list) {
                    if (hiHealthData != null && hiHealthData.getModifiedTime() >= UpdateTrackDataListener.f7142a) {
                        arrayList.add(hiHealthData);
                        fmf.b(UpdateTrackDataListener.this.f7143b, hiHealthData);
                        if (HiDateUtil.h(System.currentTimeMillis()) - hiHealthData.getStartTime() > 1123200000) {
                            z = true;
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    long jD = UpdateTrackDataListener.this.d(arrayList);
                    if (jD > UpdateTrackDataListener.f7142a) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putLong("user label last modify time", jD);
                        editorEdit.commit();
                    }
                    LogUtil.a("HiH_UpdateTrackDataListener", "onChange,uploadThirtyDaysTrackDataFlag= ", Boolean.valueOf(z), " newModifyTime = ", Long.valueOf(jD));
                    if (z) {
                        fmf.d(UpdateTrackDataListener.this.f7143b);
                    }
                }
            }
        }
    };
    private List<Integer> e;

    public UpdateTrackDataListener(Context context) {
        this.f7143b = context.getApplicationContext();
    }

    public List<Integer> b() {
        return this.e;
    }

    @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
    public void onResult(List<Integer> list, List<Integer> list2) {
        if (list == null || list2 == null) {
            LogUtil.a("HiH_UpdateTrackDataListener", "onResult list is null");
        } else {
            LogUtil.a("HiH_UpdateTrackDataListener", "onResult successList size = ", Integer.valueOf(list.size()), " ,failList size = ", Integer.valueOf(list2.size()));
        }
        this.e = list;
    }

    @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
    public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
        LogUtil.a("HiH_UpdateTrackDataListener", "onChange");
        lsy.a(new Runnable() { // from class: com.huawei.health.hwuserlabelmgr.manager.UpdateTrackDataListener.1
            @Override // java.lang.Runnable
            public void run() {
                UpdateTrackDataListener updateTrackDataListener = UpdateTrackDataListener.this;
                updateTrackDataListener.e(updateTrackDataListener.f7143b, UpdateTrackDataListener.this.f7144c);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long d(ArrayList<HiHealthData> arrayList) {
        if (njy.e(arrayList)) {
            return 0L;
        }
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr[i] = arrayList.get(i).getModifiedTime();
        }
        Arrays.sort(jArr);
        return jArr[size - 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, final IBaseResponseCallback iBaseResponseCallback) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(jCurrentTimeMillis - 2592000000L);
        hiDataReadOption.setEndTime(jCurrentTimeMillis2);
        hiDataReadOption.setType(new int[]{30002});
        HiHealthManager.d(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.health.hwuserlabelmgr.manager.UpdateTrackDataListener.4
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (i == 0 && (obj instanceof SparseArray)) {
                    SparseArray sparseArray = (SparseArray) obj;
                    if (sparseArray.get(30002) instanceof List) {
                        iBaseResponseCallback.a(0, (List) sparseArray.get(30002));
                    }
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                LogUtil.d("HiH_UpdateTrackDataListener", "getThirtyDaysTrackMetaData onResultIntent");
            }
        });
    }
}
