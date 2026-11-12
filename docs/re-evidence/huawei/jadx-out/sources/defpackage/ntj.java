package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartResponseWrapper;
import com.huawei.hwsmartinteractmgr.smarthttpmodel.SmartHttpCallback;
import com.huawei.hwsmartinteractmgr.smarthttpmodel.SmartObserver;
import com.huawei.hwsmartinteractmgr.userlabel.LabelObserver;
import com.huawei.login.ui.login.LoginInit;
import com.tencent.open.apireq.BaseResp;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ntj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f43684a;
    private String d;
    private nsv i;
    private static final ntj e = new ntj();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f43683c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f43682b = new Object();
    private ntc j = ntc.c();
    private List<LabelObserver> g = new ArrayList(3);

    private ntj() {
        Context context = BaseApplication.getContext();
        this.f43684a = context;
        this.i = nsv.e(context);
    }

    public static ntj a() {
        return e;
    }

    public boolean e(List<String> list) {
        if (list == null) {
            return false;
        }
        List<String> listB = b();
        LogUtil.d("SMART_UserLabelPuller", "all Label is ", listB, "&& ", list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (listB.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    private List<String> b() {
        return a(c(CommonUtil.USER_LABEL_STORAGE_KEY, this.i));
    }

    public void d() {
        LogUtil.a("SMART_UserLabelPuller", "enter doRefresh");
        String strC = c("_cacheTime_key", this.i);
        try {
            if (!TextUtils.isEmpty(strC) && !b(Long.parseLong(strC), 86400000L)) {
                LogUtil.a("SMART_UserLabelPuller", "cache not expired");
                return;
            }
            LogUtil.a("SMART_UserLabelPuller", "not cached yet! or cache expired! ", Boolean.valueOf(TextUtils.isEmpty(strC)));
            c((SmartHttpCallback<List<String>>) null);
        } catch (NumberFormatException e2) {
            LogUtil.e("SMART_UserLabelPuller", "doRefresh numberFormatException = ", e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> a(String str) {
        if (str == null) {
            str = "";
        }
        return Arrays.asList(str.split(","));
    }

    private boolean b(long j, long j2) {
        return j == 0 || System.currentTimeMillis() - j >= j2;
    }

    private void c(SmartHttpCallback<List<String>> smartHttpCallback) {
        LogUtil.a("SMART_UserLabelPuller", "to request server");
        d dVar = new d();
        this.j.e(1, new ntk(1));
        this.j.b(1, dVar);
        this.j.e(1, new HashMap(3), smartHttpCallback);
    }

    private int b(String str, String str2, HwBaseManager hwBaseManager) {
        String strC = c();
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("SMART_UserLabelPuller", "get huid failed!");
            return BaseResp.CODE_UNSUPPORTED_BRANCH;
        }
        return hwBaseManager.setSharedPreference(strC + str, str2, new StorageParams(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str, HwBaseManager hwBaseManager) {
        synchronized (f43683c) {
            String strC = c();
            if (TextUtils.isEmpty(strC)) {
                LogUtil.j("SMART_UserLabelPuller", "get huid failed!");
                return null;
            }
            return hwBaseManager.getSharedPreference(strC + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(Map<String, String> map, HwBaseManager hwBaseManager) {
        synchronized (f43683c) {
            if (map != null) {
                if (!map.isEmpty()) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (key != null && value != null) {
                            int iB = b(key, value, hwBaseManager);
                            LogUtil.a("SMART_UserLabelPuller", "save result = ", Integer.valueOf(iB));
                            if (iB != 0) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            }
            LogUtil.j("SMART_UserLabelPuller", "no values to cache!");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(List<String> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.a("SMART_UserLabelPuller", "userLabels none!");
            return "";
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        StringBuffer stringBuffer = new StringBuffer(3);
        stringBuffer.append(list.get(0));
        for (String str : list) {
            stringBuffer.append(",");
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }

    private String c() {
        return LoginInit.getInstance(this.f43684a).getAccountInfo(1011);
    }

    public void d(final LabelObserver labelObserver) {
        if (labelObserver == null) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: ntj.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (ntj.f43682b) {
                    if (!ntj.this.g.contains(labelObserver)) {
                        LogUtil.a("SMART_UserLabelPuller", "add observer!");
                        ntj.this.g.add(labelObserver);
                    }
                }
            }
        });
    }

    public void a(final LabelObserver labelObserver) {
        if (labelObserver == null) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: ntj.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (ntj.f43682b) {
                    ntj.this.g.remove(labelObserver);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Map<Integer, List<String>> map) {
        LogUtil.d("SMART_UserLabelPuller", "enter notifyUserLabelSmarter ", map);
        synchronized (f43682b) {
            Iterator<LabelObserver> it = this.g.iterator();
            while (it.hasNext()) {
                it.next().onChange(map);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, List<String>> b(List<String> list, List<String> list2) {
        LogUtil.d("SMART_UserLabelPuller", "enter diff : ", list, " olds.size : ", Integer.valueOf(list.size()), " && ", list2);
        HashMap map = new HashMap(3);
        boolean z = true;
        map.put(1, new ArrayList(3));
        map.put(2, new ArrayList(3));
        for (String str : list) {
            if (!list2.contains(str)) {
                ((List) map.get(2)).add(str);
            }
        }
        for (String str2 : list2) {
            if (!list.contains(str2)) {
                ((List) map.get(1)).add(str2);
            }
        }
        if (((List) map.get(1)).isEmpty()) {
            map.put(1, null);
            z = false;
        }
        if (((List) map.get(2)).isEmpty()) {
            map.put(2, null);
            if (!z) {
                LogUtil.a("SMART_UserLabelPuller", "no change");
            }
        }
        LogUtil.d("SMART_UserLabelPuller", map);
        return map;
    }

    class d implements SmartObserver {
        private d() {
        }

        @Override // com.huawei.hwsmartinteractmgr.smarthttpmodel.SmartObserver
        public void onDataChanged(SmartResponseWrapper smartResponseWrapper) {
            LogUtil.a("SMART_UserLabelPuller", "enter onDataChanged");
            ntj.this.j.d(1, this);
            if (smartResponseWrapper == null) {
                LogUtil.j("SMART_UserLabelPuller", "onDataChanged wrapper is null!");
                return;
            }
            int responseCode = smartResponseWrapper.getResponseCode();
            if (responseCode != 0 && responseCode != 101) {
                LogUtil.j("SMART_UserLabelPuller", "http connection success, response abnormal code is ", Integer.valueOf(responseCode));
                return;
            }
            if (!(smartResponseWrapper.getResponse() instanceof List)) {
                LogUtil.j("SMART_UserLabelPuller", "onDataChanged wrapper.getResponse() is null!");
                return;
            }
            List list = (List) smartResponseWrapper.getResponse();
            LogUtil.d("SMART_UserLabelPuller", "labels from notify ", list);
            nsv nsvVarE = nsv.e(ntj.this.f43684a);
            String strC = ntj.this.d == null ? ntj.this.c(CommonUtil.USER_LABEL_STORAGE_KEY, nsvVarE) : ntj.this.d;
            String strB = ntj.this.b((List<String>) list);
            LogUtil.d("SMART_UserLabelPuller", "labelStr = ", strB);
            HashMap map = new HashMap(3);
            map.put(CommonUtil.USER_LABEL_STORAGE_KEY, strB);
            if (TextUtils.isEmpty(strB)) {
                map.put("_cacheTime_key", String.valueOf(0));
            } else {
                map.put("_cacheTime_key", String.valueOf(System.currentTimeMillis()));
            }
            List listA = ntj.this.a(strC);
            if (ntj.this.e(map, nsvVarE)) {
                ntj.this.d = strB;
            } else {
                ntj.this.d = null;
            }
            Map mapB = ntj.this.b((List<String>) listA, (List<String>) list);
            if (mapB != null) {
                ntj.this.c((Map<Integer, List<String>>) mapB);
            }
        }
    }
}
