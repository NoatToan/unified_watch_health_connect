package com.huawei.health.ecologydevice.ui.healthdata.fragment;

import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.huawei.ecologydevice.R;
import com.huawei.health.ecologydevice.ui.healthdata.adapter.BloodSugarFoodAdapter;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.emm;
import defpackage.emq;
import defpackage.epc;
import defpackage.fda;
import defpackage.fdy;
import defpackage.lsy;
import defpackage.pil;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import io.jsonwebtoken.Header;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public class BloodSugarFeedbackFragment extends BloodSugarBaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BloodSugarFoodAdapter f6606a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f6608c;
    private HealthTextView d;
    private HealthColumnLinearLayout e;
    private String g;
    private boolean h;
    private HealthRecycleView i;
    private String j;
    private String m;
    private final Handler f = new Handler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<epc> f6607b = new ArrayList(16);

    public interface BloodSugarCallback {
        void result(int i, JSONObject jSONObject);
    }

    public interface UpDataFileListener {
        void onFinish();
    }

    @Override // com.huawei.health.ecologydevice.ui.healthdata.fragment.BloodSugarBaseFragment
    protected void initView(View view) {
        super.initView(view);
        View viewInflate = LayoutInflater.from(this.mActivity).inflate(R.layout.item_blood_sugar_feedback, (ViewGroup) null);
        if (viewInflate == null) {
            LogUtil.j("BloodSugarFeedbackFragment", "viewChild is null");
            return;
        }
        this.mContainerLayout.addView(viewInflate);
        this.d = (HealthTextView) viewInflate.findViewById(R.id.blood_sugar_desc);
        this.f6608c = (HealthTextView) viewInflate.findViewById(R.id.blood_sugar_desc_by_blood_number);
        this.e = (HealthColumnLinearLayout) viewInflate.findViewById(R.id.blood_sugar_food_container);
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.blood_sugar_foods_recycler_view);
        this.i = healthRecycleView;
        healthRecycleView.setLayoutManager(new GridLayoutManager(this.mActivity, 4) { // from class: com.huawei.health.ecologydevice.ui.healthdata.fragment.BloodSugarFeedbackFragment.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        this.mButtonConfirm.setText(R.string.IDS_hw_show_healthdata_bloodsugar_know);
        this.mButtonConfirm.setOnClickListener(new View.OnClickListener() { // from class: eou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws IllegalAccessException, InstantiationException {
                this.f33286c.d(view2);
            }
        });
    }

    public /* synthetic */ void d(View view) throws IllegalAccessException, InstantiationException {
        if (this.mActivity.a() == 0) {
            this.mActivity.j();
        } else {
            this.mActivity.n();
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.healthdata.fragment.BloodSugarBaseFragment
    protected void initData() {
        super.initData();
        this.g = CommonUtil.e();
        String strU = CommonUtil.u();
        this.j = strU;
        LogUtil.d("BloodSugarFeedbackFragment", "current language : ", this.g, strU);
        if (this.f6606a == null) {
            this.f6606a = new BloodSugarFoodAdapter(this.mActivity);
        }
        this.i.setAdapter(this.f6606a);
    }

    private void f() {
        this.f6608c.setText(emq.c(this.mTimePeriod));
    }

    @Override // com.huawei.health.ecologydevice.ui.healthdata.fragment.BloodSugarBaseFragment
    protected HiHealthData getHealthData() {
        return this.mActivity.i();
    }

    @Override // com.huawei.health.ecologydevice.ui.healthdata.fragment.BloodSugarBaseFragment
    protected void updateView() {
        super.updateView();
        updateTopDateView(true);
        final int iC = emq.c(this.mActivity, this.mTimePeriod, this.mValue);
        if (iC == 1001) {
            this.h = true;
        } else {
            this.h = false;
            this.e.setVisibility(8);
        }
        d(new UpDataFileListener() { // from class: eoo
            @Override // com.huawei.health.ecologydevice.ui.healthdata.fragment.BloodSugarFeedbackFragment.UpDataFileListener
            public final void onFinish() {
                this.f33279a.d(iC);
            }
        });
        f();
    }

    public /* synthetic */ void d(int i) {
        LogUtil.a("BloodSugarFeedbackFragment", "download onFinish");
        e(i);
        if (this.h) {
            d();
        }
    }

    private void d(UpDataFileListener upDataFileListener) {
        LogUtil.a("BloodSugarFeedbackFragment", "startDownload");
        HashMap map = new HashMap(2);
        map.put("configType", "bloodsugar");
        fdy.d(new fda("com.huawei.health_Sport_Common", map), "blood_sugar_suggestion", 7, new e(upDataFileListener));
    }

    private void e(int i) {
        final String strValueOf = String.valueOf(i);
        if (i == 1003) {
            strValueOf = i + "_" + this.mTimePeriod;
        }
        LogUtil.a("BloodSugarFeedbackFragment", "read file current level : ", strValueOf);
        e(new BloodSugarCallback() { // from class: eor
            @Override // com.huawei.health.ecologydevice.ui.healthdata.fragment.BloodSugarFeedbackFragment.BloodSugarCallback
            public final void result(int i2, JSONObject jSONObject) throws Throwable {
                this.e.b(strValueOf, i2, jSONObject);
            }
        });
    }

    public /* synthetic */ void b(String str, int i, JSONObject jSONObject) throws Throwable {
        LogUtil.a("BloodSugarFeedbackFragment", "load blood file result code : ", Integer.valueOf(i));
        if (i != 0 || jSONObject == null) {
            LogUtil.j("BloodSugarFeedbackFragment", "load blood file fail");
            return;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("bloodSugarLevel");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                e(jSONObject2, jSONObject2.getString(OpAnalyticsConstants.OPERATION_ID), str);
            }
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("BloodSugarFeedbackFragment", "not find res id");
        } catch (NumberFormatException unused2) {
            LogUtil.e("BloodSugarFeedbackFragment", "num error");
        } catch (JSONException unused3) {
            LogUtil.e("BloodSugarFeedbackFragment", "JSONException ");
        }
    }

    private void e(final BloodSugarCallback bloodSugarCallback) {
        lsy.a(new Runnable() { // from class: eos
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.d.d(bloodSugarCallback);
            }
        });
    }

    public /* synthetic */ void d(BloodSugarCallback bloodSugarCallback) throws Throwable {
        String strC = Utils.c(b() + "sugar_suggestion_config.json");
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("BloodSugarFeedbackFragment", "getBloodSuggestionDesc read json is null");
            bloodSugarCallback.result(1, null);
        } else {
            try {
                bloodSugarCallback.result(0, new JSONObject(strC));
            } catch (JSONException unused) {
                LogUtil.e("BloodSugarFeedbackFragment", "getBloodSuggestionDesc JSONException");
                bloodSugarCallback.result(1, null);
            }
        }
    }

    private void e(JSONObject jSONObject, String str, String str2) throws Throwable {
        final String strReplace;
        LogUtil.a("BloodSugarFeedbackFragment", "current id is ", str, ", compare id is ", str2);
        if (!str2.equals(str)) {
            LogUtil.d("BloodSugarFeedbackFragment", "id is different from compareId");
            return;
        }
        String string = jSONObject.getString("suggesionDesc");
        LogUtil.a("BloodSugarFeedbackFragment", "serviceId is ", string);
        if (TextUtils.isEmpty(string)) {
            LogUtil.j("BloodSugarFeedbackFragment", "serviceId is null");
            return;
        }
        String str3 = b() + "strings";
        String strA = emm.a(string, str3, this.g, this.j);
        LogUtil.a("BloodSugarFeedbackFragment", "path is ", str3);
        if (TextUtils.isEmpty(strA)) {
            strReplace = emm.c(str3 + "/strings.xml", string);
        } else {
            strReplace = strA.replace("\\", "");
            LogUtil.a("BloodSugarFeedbackFragment", "desc is ", strReplace);
        }
        c(jSONObject, jSONObject.keys(), strReplace);
        LogUtil.a("BloodSugarFeedbackFragment", "current desc ", this.m);
        this.f.post(new Runnable() { // from class: eoq
            @Override // java.lang.Runnable
            public final void run() {
                this.f33282c.c(strReplace);
            }
        });
    }

    public /* synthetic */ void c(String str) {
        if (!TextUtils.isEmpty(this.m)) {
            this.d.setText(this.m);
        } else {
            this.d.setText(str);
        }
    }

    private void c(JSONObject jSONObject, Iterator<String> it, String str) throws JSONException {
        this.m = "";
        while (it.hasNext()) {
            String next = it.next();
            LogUtil.a("BloodSugarFeedbackFragment", "replace key is ", next, ", desc is ", str);
            if ("placeholder".equals(next)) {
                this.m = a(str, jSONObject.getJSONArray("placeholder"));
            }
        }
    }

    private String a(String str, JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || TextUtils.isEmpty(str)) {
            LogUtil.j("BloodSugarFeedbackFragment", "placeholder or description is null");
            return str;
        }
        LogUtil.d("BloodSugarFeedbackFragment", "current desc ", str);
        int length = jSONArray.length();
        if (length == 1) {
            return b(str, jSONArray);
        }
        if (length == 2) {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            String string = jSONObject.getString("type");
            String string2 = jSONObject.getString("value");
            JSONObject jSONObject2 = jSONArray.getJSONObject(1);
            return c(str, string, string2, jSONObject2.getString("type"), jSONObject2.getString("value"));
        }
        return b(str, jSONArray);
    }

    private String c(String str, String str2, String str3, String str4, String str5) {
        if ("100".equals(str2)) {
            if ("100".equals(str4)) {
                return String.format(Locale.ROOT, str, Integer.valueOf(qrs.a(str3)), Integer.valueOf(qrs.a(str5)));
            }
            return String.format(Locale.ROOT, str, Integer.valueOf(qrs.a(str3)), Float.valueOf(qrs.h(str5)));
        }
        if ("101".equals(str2)) {
            if ("101".equals(str4)) {
                return String.format(Locale.ROOT, str, Float.valueOf(qrs.h(str3)), Float.valueOf(qrs.h(str5)));
            }
            return String.format(Locale.ROOT, str, Float.valueOf(qrs.h(str3)), Integer.valueOf(qrs.a(str5)));
        }
        LogUtil.d("BloodSugarFeedbackFragment", "no replace");
        return "";
    }

    private String b(String str, JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject = jSONArray.getJSONObject(0);
        String string = jSONObject.getString("type");
        String string2 = jSONObject.getString("value");
        if ("100".equals(string)) {
            return String.format(Locale.ROOT, str, Integer.valueOf(qrs.a(string2)));
        }
        if (string.equals("101")) {
            return String.format(Locale.ROOT, str, Float.valueOf(qrs.h(string2)));
        }
        LogUtil.d("BloodSugarFeedbackFragment", "no replace");
        return "";
    }

    private void d() {
        b(new BloodSugarCallback() { // from class: eop
            @Override // com.huawei.health.ecologydevice.ui.healthdata.fragment.BloodSugarFeedbackFragment.BloodSugarCallback
            public final void result(int i, JSONObject jSONObject) throws Throwable {
                this.f33281a.d(i, jSONObject);
            }
        });
    }

    public /* synthetic */ void d(int i, JSONObject jSONObject) throws Throwable {
        if (i != 0 || jSONObject == null) {
            LogUtil.j("BloodSugarFeedbackFragment", "readBloodSugarFoodList fail");
            return;
        }
        try {
            b(jSONObject.getJSONArray("sugarFood"));
            this.f.post(new Runnable() { // from class: eol
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33276b.a();
                }
            });
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("BloodSugarFeedbackFragment", "not find res id");
        } catch (JSONException unused2) {
            LogUtil.e("BloodSugarFeedbackFragment", "JSONException ");
        }
    }

    public /* synthetic */ void a() {
        this.f6606a.a(this.f6607b);
        this.e.setVisibility(0);
    }

    private void b(JSONArray jSONArray) throws Throwable {
        this.f6607b.clear();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            epc epcVar = new epc();
            c(jSONObject, epcVar, jSONObject.getString("name"));
            epcVar.e(b() + "images" + File.separator + jSONObject.getString("pictureUrl"));
            if (this.f6607b.size() < 4) {
                this.f6607b.add(epcVar);
            }
        }
    }

    private void c(JSONObject jSONObject, epc epcVar, String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("BloodSugarFeedbackFragment", "serviceId is null");
            return;
        }
        String strA = emm.a(str, b() + "strings", this.g, this.j);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            LogUtil.d("BloodSugarFeedbackFragment", "replace key is ", next);
            if ("placeholder".equals(next)) {
                strA = a(strA, jSONObject.getJSONArray("placeholder"));
            }
        }
        epcVar.d(strA);
    }

    private void b(final BloodSugarCallback bloodSugarCallback) {
        lsy.a(new Runnable() { // from class: eot
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f33285b.a(bloodSugarCallback);
            }
        });
    }

    public /* synthetic */ void a(BloodSugarCallback bloodSugarCallback) throws Throwable {
        String strC = Utils.c(b() + "sugar_food_config.json");
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("BloodSugarFeedbackFragment", "getSugarFoodList json is null");
            bloodSugarCallback.result(1, null);
        } else {
            try {
                bloodSugarCallback.result(0, new JSONObject(strC));
            } catch (JSONException unused) {
                LogUtil.e("BloodSugarFeedbackFragment", "getTaskCardPathList JSONException");
                bloodSugarCallback.result(1, null);
            }
        }
    }

    static class e implements DownloadCallback<File> {
        private final WeakReference<UpDataFileListener> e;

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        public void onProgress(long j, long j2, boolean z, String str) {
        }

        e(UpDataFileListener upDataFileListener) {
            this.e = new WeakReference<>(upDataFileListener);
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFinish(File file) throws Throwable {
            if (!file.exists()) {
                LogUtil.j("BloodSugarFeedbackFragment", "onFinish data is: file is null");
                return;
            }
            LogUtil.a("BloodSugarFeedbackFragment", "download success");
            pil.e(BloodSugarFeedbackFragment.e(), file.getParent());
            UpDataFileListener upDataFileListener = this.e.get();
            if (upDataFileListener == null) {
                LogUtil.j("BloodSugarFeedbackFragment", "upDataFileListener is null");
            } else {
                upDataFileListener.onFinish();
            }
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        public void onFail(int i, Throwable th) {
            LogUtil.e("BloodSugarFeedbackFragment", "onFail: errCode = ", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e() {
        return fdy.d("com.huawei.health_Sport_Common", "blood_sugar_suggestion", Header.COMPRESSION_ALGORITHM);
    }

    private String b() {
        String strE = e();
        if (TextUtils.isEmpty(strE)) {
            return "";
        }
        File file = new File(strE);
        if (!file.exists()) {
            return "";
        }
        return file.getParent() + File.separator + "blood_sugar_suggestions" + File.separator;
    }
}
