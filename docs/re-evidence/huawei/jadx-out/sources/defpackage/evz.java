package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class evz {
    private List<String> d = new ArrayList();

    public boolean e(final String str) {
        if (TextUtils.isEmpty(str) || njy.e(a(str))) {
            return true;
        }
        if (!fxl.a(a(str))) {
            LogUtil.a("MarketingUserLabelsMgr", "RecommendSwitch is closed.");
            return false;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ThreadPoolManager.c().execute(new Runnable() { // from class: evz.5
            @Override // java.lang.Runnable
            public void run() {
                evz evzVar = evz.this;
                evzVar.d = evzVar.b(str);
                LogUtil.a("MarketingUserLabelsMgr", "resourceUserLabels = ", str);
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
            if (njy.e(this.d) || a(str).size() > this.d.size()) {
                LogUtil.a("MarketingUserLabelsMgr", "User didn't have enough label to match.Resource label size: ", Integer.valueOf(a(str).size()), "; User's label size: ", Integer.valueOf(this.d.size()));
                return false;
            }
            LogUtil.a("MarketingUserLabelsMgr", "mUserLabelList = ", this.d.toString());
            List<String> listD = d(str);
            for (String str2 : this.d) {
                if (str2.contains("SportDeviceType")) {
                    if (!a(str2, listD)) {
                        return false;
                    }
                } else if (str2.contains("SportDeviceTime")) {
                    if (b(str2, listD)) {
                        return false;
                    }
                } else if (!d(listD, str2)) {
                    LogUtil.a("MarketingUserLabelsMgr", "User label didn't match. return false: ", str2);
                    return false;
                }
            }
            return true;
        } catch (InterruptedException unused) {
            LogUtil.e("MarketingUserLabelsMgr", "get user label InterruptedException");
            return false;
        }
    }

    private boolean d(List<String> list, String str) {
        for (String str2 : str.split(",")) {
            if (list.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    private boolean a(String str, List<String> list) {
        try {
            for (String str2 : str.split(",")) {
                if (!list.contains(str2)) {
                    String str3 = str2.split("_")[1];
                    if (Integer.parseInt(str3) % 2 == 0) {
                        if (list.contains(str2.replace(str3, String.valueOf(Integer.parseInt(str3) + 1)))) {
                            return false;
                        }
                    } else if (list.contains(str2.replace(str3, String.valueOf(Integer.parseInt(str3) - 1)))) {
                        return false;
                    }
                }
            }
        } catch (NumberFormatException e) {
            LogUtil.e("MarketingUserLabelsMgr", "NumberFormatException", e.getMessage());
        }
        return true;
    }

    private boolean b(String str, List<String> list) {
        for (String str2 : str.split(",")) {
            if (!list.contains(str2)) {
                String str3 = str2.split("_")[1];
                try {
                    if (!c(list, str2, str3, Integer.parseInt(str3) % 4)) {
                        return false;
                    }
                } catch (NumberFormatException e) {
                    LogUtil.e("MarketingUserLabelsMgr", "NumberFormatException", e.getMessage());
                }
            }
        }
        return true;
    }

    private boolean c(List<String> list, String str, String str2, int i) {
        int i2 = -i;
        for (int i3 = i2; i3 < i2 + 4; i3++) {
            try {
                String strReplace = str.replace(str2, String.valueOf(Integer.parseInt(str2) + i3));
                if (list.contains(strReplace) && !strReplace.equals(str)) {
                    return false;
                }
            } catch (NumberFormatException e) {
                LogUtil.e("MarketingUserLabelsMgr", "NumberFormatException", e.getMessage());
                return true;
            }
        }
        return true;
    }

    private List<String> a(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        try {
            Iterator<String> itKeys = new JSONObject(str).keys();
            while (itKeys.hasNext()) {
                arrayList.add(itKeys.next().toString());
            }
            LogUtil.a("MarketingUserLabelsMgr", "getLabelKeys labelKeysList.size:", Integer.valueOf(arrayList.size()));
            return arrayList;
        } catch (JSONException unused) {
            LogUtil.e("MarketingUserLabelsMgr", "getLabelKeys resourceUserLabelList get fail");
            return arrayList;
        }
    }

    private List<String> d(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (true) {
                if (!itKeys.hasNext()) {
                    LogUtil.a("MarketingUserLabelsMgr", "getLabelValues labelValuesList.size:", Integer.valueOf(arrayList.size()));
                    return arrayList;
                }
                JSONArray jSONArray = jSONObject.getJSONArray(itKeys.next().toString());
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
            }
        } catch (JSONException unused) {
            LogUtil.e("MarketingUserLabelsMgr", "getLabelValues resourceUserLabelList get fail");
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> b(String str) {
        return ((UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class)).getLabels(a(str), LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011));
    }
}
