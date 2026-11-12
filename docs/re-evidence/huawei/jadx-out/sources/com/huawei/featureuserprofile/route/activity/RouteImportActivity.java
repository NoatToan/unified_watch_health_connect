package com.huawei.featureuserprofile.route.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.route.adapter.RouteImportAdapter;
import com.huawei.featureuserprofile.route.bean.KomootRouteBean;
import com.huawei.featureuserprofile.route.bean.KomootRouteData;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.userprofilemgr.model.RouteResultCallBack;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.ResultCallback;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.RouteData;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.operation.utils.Constants;
import com.huawei.route.GetRouteDetailRsp;
import com.huawei.route.Manger.RouteDataStorageManager;
import com.huawei.thirdpartservice.komootapi.KomootProviderApi;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.cxu;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qre;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.util.LogUtil;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class RouteImportActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f5626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f5627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RouteImportAdapter f5628c;
    private List<Long> d;
    private KomootProviderApi f;
    private RelativeLayout g;
    private RelativeLayout h;
    private boolean j;
    private HealthRecycleView o;
    private CustomTitleBar q;
    private Map<Long, KomootRouteBean.Tour> r;
    private HealthTextView s;
    private RelativeLayout t;
    private int u;
    private CustomViewDialog v;
    private int w;
    private HashMap<String, InputStream> y = new LinkedHashMap();
    private HashMap<String, Integer> l = new HashMap<>();
    private HashMap<String, String> x = new LinkedHashMap();
    private List<String> e = new ArrayList();
    private int k = 5;
    private int m = 0;
    private final String[] n = {"All", "hike", "touringbicycle", "e_touringbicycle", "mtb", "e_mtb", "racebike", "e_racebike", "jogging", "mtb_easy", "e_mtb_easy", "mtb_advanced", "e_mtb_advanced"};
    private String p = "All";
    private final Handler i = new e();

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hw_import_user_route_activity);
        d();
        a(bundle);
    }

    private void d() {
        Intent intent = getIntent();
        if (intent != null) {
            this.k = intent.getIntExtra("maxCapacity", 5);
            boolean booleanExtra = intent.getBooleanExtra(BasePairManagerJsApi.FROM_H5_KEY, false);
            this.j = booleanExtra;
            if (booleanExtra) {
                this.k = Math.min(50 - intent.getIntExtra("routeNumber", 5), 5);
            }
        }
        this.q = (CustomTitleBar) findViewById(R.id.title_bar);
        this.f5626a = (LinearLayout) findViewById(R.id.ll_category);
        b();
        this.s = (HealthTextView) findViewById(R.id.sub_title);
        this.g = (RelativeLayout) findViewById(R.id.rel_route_loading);
        this.h = (RelativeLayout) findViewById(R.id.rel_route_empty);
        this.o = (HealthRecycleView) findViewById(R.id.rv_route);
        this.t = (RelativeLayout) findViewById(R.id.rv_loading);
        c(false);
        this.q.setLeftButtonVisibility(0);
        this.q.setLeftButtonDrawable(getDrawable(R.drawable.hwsearchview_ic_public_back), qre.f(R.string.accessibility_go_back));
        this.o.setLayoutManager(new LinearLayoutManager(this));
        RouteImportAdapter routeImportAdapter = new RouteImportAdapter(this, this.o, new RouteImportAdapter.CallBack() { // from class: com.huawei.featureuserprofile.route.activity.RouteImportActivity.4
            @Override // com.huawei.featureuserprofile.route.adapter.RouteImportAdapter.CallBack
            public void onItemCheckedChanged() {
                RouteImportActivity.this.c();
            }

            @Override // com.huawei.featureuserprofile.route.adapter.RouteImportAdapter.CallBack
            public void onLoadingMore() {
                RouteImportActivity routeImportActivity = RouteImportActivity.this;
                routeImportActivity.e(routeImportActivity.m);
            }
        });
        this.f5628c = routeImportAdapter;
        routeImportAdapter.c(this.k);
        this.o.setAdapter(this.f5628c);
        f();
        this.q.setRightButtonDrawable(getDrawable(R.drawable.ic_appbar_confirm), qre.f(R.string.IDS_contact_confirm));
        this.q.setRightButtonOnClickListener(new View.OnClickListener() { // from class: cxl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31471c.e(view);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final int i) {
        LogUtil.e("RouteImportActivity", "loadMoreData" + i + " , Pages=" + this.w);
        if (i < this.w) {
            new Handler().post(new Runnable() { // from class: cxk
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d(i);
                }
            });
        } else {
            this.f5628c.e();
        }
    }

    public /* synthetic */ void d(int i) {
        a(this.p, i);
    }

    private void b() {
        for (String str : this.n) {
            a(str);
        }
    }

    private void a(Bundle bundle) {
        this.f = (KomootProviderApi) Services.b("FeatureDataOpen", KomootProviderApi.class);
        if (!CommonUtil.ab(this)) {
            b(true);
            qpx.e(this, R.string.IDS_connect_network);
        } else {
            d(true);
            d(bundle);
            j();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("SelectedType", this.p);
        bundle.putParcelableArray("SelectedCache", b(this.f5628c.d()));
    }

    private KomootRouteBean.Tour[] b(Map<Long, KomootRouteBean.Tour> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Long, KomootRouteBean.Tour>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        KomootRouteBean.Tour[] tourArr = new KomootRouteBean.Tour[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            tourArr[i] = (KomootRouteBean.Tour) arrayList.get(i);
        }
        return tourArr;
    }

    private void d(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.p = bundle.getString("SelectedType");
        g();
        Parcelable[] parcelableArray = bundle.getParcelableArray("SelectedCache");
        if (parcelableArray instanceof KomootRouteBean.Tour[]) {
            KomootRouteBean.Tour[] tourArr = (KomootRouteBean.Tour[]) parcelableArray;
            if (this.f5628c == null || njy.e(Arrays.asList(tourArr))) {
                return;
            }
            this.f5628c.b(Arrays.asList(tourArr));
        }
    }

    private void a(final String str) {
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.item_route_category, (ViewGroup) this.f5626a, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.btn_route_category);
        textView.setTag(str);
        textView.setText(cxu.a(this, str));
        textView.setOnClickListener(new View.OnClickListener() { // from class: cxi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31468c.a(str, view);
            }
        });
        if ("All".equalsIgnoreCase(str)) {
            textView.setBackgroundResource(R.drawable.route_category_bg_selected);
        }
        this.f5626a.addView(viewInflate);
        this.f5626a.invalidate();
    }

    public /* synthetic */ void a(String str, View view) {
        if (this.f5627b) {
            LogUtil.d("RouteImportActivity", "category selected return because is loading more");
            return;
        }
        c(true);
        this.m = 0;
        this.p = str;
        a(str, 0);
        g();
    }

    private void g() {
        RouteImportAdapter routeImportAdapter = this.f5628c;
        if (routeImportAdapter != null) {
            routeImportAdapter.c(this.p);
        }
        for (int i = 0; i < this.f5626a.getChildCount(); i++) {
            View childAt = this.f5626a.getChildAt(i);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setBackgroundResource(childAt.getTag().toString().equalsIgnoreCase(this.p) ? R.drawable.route_category_bg_selected : R.drawable.route_category_bg_normal);
            }
        }
    }

    private void f() {
        String quantityString;
        RouteImportAdapter routeImportAdapter = this.f5628c;
        if (routeImportAdapter == null) {
            return;
        }
        this.r = routeImportAdapter.a();
        int size = this.f5628c.d().size();
        CustomTitleBar customTitleBar = this.q;
        if (size == 0) {
            quantityString = getString(R.string.IDS_my_route_selectNone);
        } else {
            quantityString = getResources().getQuantityString(R.plurals.IDS_my_route_selected, size, Integer.valueOf(size), Integer.valueOf(Math.min(this.k, 5)));
        }
        customTitleBar.setTitleText(quantityString);
        this.q.setRightButtonVisibility(this.r.size() == 0 ? 4 : 0);
    }

    private void d(boolean z) {
        this.g.setVisibility(z ? 0 : 8);
        a(!z);
    }

    private void c(boolean z) {
        this.t.setVisibility(z ? 0 : 8);
        this.o.setVisibility(z ? 4 : 0);
        if (this.h.getVisibility() == 0) {
            this.h.setVisibility(8);
        }
    }

    private void b(boolean z) {
        boolean z2 = z && "All".equalsIgnoreCase(this.p) && this.m == 0;
        this.h.setVisibility(z2 ? 0 : 8);
        a(!z2);
    }

    private void a(boolean z) {
        this.f5626a.setVisibility(z ? 0 : 8);
        this.s.setVisibility(z ? 0 : 8);
        this.o.setVisibility(z ? 0 : 8);
    }

    private void h() {
        if (getSystemService("layout_inflater") instanceof LayoutInflater) {
            CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(this).b(false).d(((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.dialog_route_uploading, (ViewGroup) null)).d();
            this.v = customViewDialogD;
            customViewDialogD.setCancelable(false);
            this.v.show();
        }
    }

    private void a() {
        if (this.v.isShowing()) {
            this.v.dismiss();
        }
    }

    private void e() {
        if (!CommonUtil.ab(this)) {
            qpx.e(this, R.string.IDS_connect_network);
            return;
        }
        if (this.f5627b) {
            LogUtil.d("RouteImportActivity", "executeUploadRoad return because is loading more");
            return;
        }
        RouteImportAdapter routeImportAdapter = this.f5628c;
        if (routeImportAdapter == null) {
            return;
        }
        Map<Long, KomootRouteBean.Tour> mapA = routeImportAdapter.a();
        this.r = mapA;
        if (mapA.isEmpty()) {
            return;
        }
        h();
        Iterator<Map.Entry<Long, KomootRouteBean.Tour>> it = this.r.entrySet().iterator();
        while (it.hasNext()) {
            e(it.next());
        }
    }

    private void j() {
        cxu.c(new RouteResultCallBack<GetRouteDetailRsp>() { // from class: com.huawei.featureuserprofile.route.activity.RouteImportActivity.2
            @Override // com.huawei.health.userprofilemgr.model.RouteResultCallBack
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(GetRouteDetailRsp getRouteDetailRsp) {
                LogUtil.e("RouteImportActivity", "queryRouteSummary onSuccess :" + getRouteDetailRsp.toString());
                Message messageObtainMessage = RouteImportActivity.this.i.obtainMessage();
                messageObtainMessage.what = 0;
                messageObtainMessage.obj = getRouteDetailRsp;
                RouteImportActivity.this.i.sendMessage(messageObtainMessage);
            }

            @Override // com.huawei.health.userprofilemgr.model.RouteResultCallBack
            public void onFailure(Throwable th) {
                LogUtil.c("RouteImportActivity", "queryRouteSummary onFailure :" + th.toString());
                Message messageObtainMessage = RouteImportActivity.this.i.obtainMessage();
                messageObtainMessage.what = 0;
                messageObtainMessage.obj = -1;
                RouteImportActivity.this.i.sendMessage(messageObtainMessage);
            }
        });
    }

    private void a(String str, int i) {
        this.f5627b = true;
        LogUtil.a("RouteImportActivity", "getRoadListFromService type=" + str + " , page=" + i);
        if ("All".equalsIgnoreCase(str)) {
            str = "";
        }
        this.f.getRoadList(str, i, new ResultCallback<String>() { // from class: com.huawei.featureuserprofile.route.activity.RouteImportActivity.5
            @Override // com.huawei.hms.framework.network.restclient.ResultCallback
            public void onResponse(Response<String> response) {
                String string = response.getRawResponse().getBody().toString();
                LogUtil.e("RouteImportActivity", "getRoadList response code:" + response.getCode());
                Message messageObtainMessage = RouteImportActivity.this.i.obtainMessage();
                messageObtainMessage.what = 1;
                messageObtainMessage.obj = string;
                RouteImportActivity.this.i.sendMessage(messageObtainMessage);
            }

            @Override // com.huawei.hms.framework.network.restclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.c("RouteImportActivity", "getRoadList onFailure:" + th.toString());
                Message messageObtainMessage = RouteImportActivity.this.i.obtainMessage();
                messageObtainMessage.what = 1;
                messageObtainMessage.obj = -1;
                RouteImportActivity.this.i.sendMessage(messageObtainMessage);
            }
        });
    }

    private void e(Map.Entry<Long, KomootRouteBean.Tour> entry) {
        if (entry == null) {
            a();
            return;
        }
        final String string = entry.getKey().toString();
        KomootRouteBean.Tour value = entry.getValue();
        final String strA = cxu.a(value, b(value));
        LogUtil.a("RouteImportActivity", "getRoadFromService ID=" + cxu.c(string) + ", Name = " + cxu.c(value.getName()));
        this.f.getRoad(string, new ResultCallback<String>() { // from class: com.huawei.featureuserprofile.route.activity.RouteImportActivity.1
            @Override // com.huawei.hms.framework.network.restclient.ResultCallback
            public void onResponse(Response<String> response) {
                String body = response.getRawResponse().getBody();
                LogUtil.e("RouteImportActivity", "getRoad response code:" + response.getCode());
                Message messageObtainMessage = RouteImportActivity.this.i.obtainMessage();
                messageObtainMessage.what = 2;
                messageObtainMessage.obj = body;
                Bundle bundle = new Bundle();
                bundle.putString("id", string);
                bundle.putString("name", strA);
                messageObtainMessage.setData(bundle);
                RouteImportActivity.this.i.sendMessage(messageObtainMessage);
            }

            @Override // com.huawei.hms.framework.network.restclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.c("RouteImportActivity", "getRoad onFailure:" + th.toString());
                Message messageObtainMessage = RouteImportActivity.this.i.obtainMessage();
                messageObtainMessage.what = 2;
                messageObtainMessage.obj = -1;
                Bundle bundle = new Bundle();
                bundle.putString("id", string);
                bundle.putString("name", strA);
                messageObtainMessage.setData(bundle);
                RouteImportActivity.this.i.sendMessage(messageObtainMessage);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        f();
        if (this.f5628c.d().size() == 5) {
            qpx.e(this, getResources().getQuantityString(R.plurals.IDS_my_route_selected_limit, 5, 5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        if (message == null) {
            return;
        }
        if ((message.obj instanceof Integer) && ((Integer) message.obj).intValue() == -1) {
            LogUtil.d("RouteImportActivity", "handleRouteSummaryRsp receive msg fail");
        }
        if (message.obj instanceof GetRouteDetailRsp) {
            GetRouteDetailRsp getRouteDetailRsp = (GetRouteDetailRsp) message.obj;
            List<RouteData> routeDatas = getRouteDetailRsp.getRouteDatas();
            LogUtil.e("RouteImportActivity", "handleRouteSummaryRsp receive msg rsp:" + getRouteDetailRsp.toString());
            b(routeDatas);
        }
        a(this.p, this.m);
    }

    private void b(List<RouteData> list) {
        if (njy.e(list)) {
            return;
        }
        Iterator<RouteData> it = list.iterator();
        while (it.hasNext()) {
            this.e.add(it.next().getRouteName());
        }
        this.d = cxu.a(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        this.f5627b = false;
        d(false);
        c(false);
        if (message == null) {
            return;
        }
        if ((message.obj instanceof Integer) && ((Integer) message.obj).intValue() == -1) {
            LogUtil.d("RouteImportActivity", "handleUpdateRoadList receive msg fail");
        }
        if (message.obj instanceof String) {
            KomootRouteBean komootRouteBeanE = cxu.e((String) message.obj);
            int totalElements = komootRouteBeanE.getTotalElements();
            this.u = totalElements;
            b(totalElements == 0);
            this.w = komootRouteBeanE.getTotalPages();
            this.m = komootRouteBeanE.getPageNumber();
            LogUtil.e("RouteImportActivity", "handleUpdateRoadList Type=" + this.p + " , Total=" + this.u + " , Pages=" + this.w + ", Number=" + this.m);
            List<KomootRouteData> listA = cxu.a(komootRouteBeanE, this.d);
            if (njy.e(listA) && this.m == 0) {
                this.o.setVisibility(8);
                this.h.setVisibility(0);
                e(this.m + 1);
                return;
            }
            this.h.setVisibility(8);
            this.o.setVisibility(0);
            RouteImportAdapter routeImportAdapter = this.f5628c;
            if (routeImportAdapter != null) {
                routeImportAdapter.a(listA, this.m == 0);
            }
            f();
            this.m++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        if (message == null) {
            a();
            return;
        }
        String string = message.getData().getString("id");
        String string2 = message.getData().getString("name");
        if (message.obj instanceof String) {
            LogUtil.a("RouteImportActivity", "handleUploadRoad receive msg road id = " + cxu.c(string));
            this.y.put(string2, new ByteArrayInputStream(((String) message.obj).getBytes(StandardCharsets.UTF_8)));
        }
        if ((message.obj instanceof Integer) && ((Integer) message.obj).intValue() == -1) {
            LogUtil.d("RouteImportActivity", "handleUploadRoad receive msg road fail , id =" + cxu.c(string));
            this.x.put(string, string2);
        }
        if (this.y.size() + this.x.size() == this.r.size()) {
            if (!this.y.isEmpty()) {
                LogUtil.e("RouteImportActivity", "handleUploadRoad start road upload -->" + this.y.size());
                cxu.a(this.y, new RouteResultCallBack<CloudCommonReponse>() { // from class: com.huawei.featureuserprofile.route.activity.RouteImportActivity.3
                    @Override // com.huawei.health.userprofilemgr.model.RouteResultCallBack
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(CloudCommonReponse cloudCommonReponse) {
                        LogUtil.a("RouteImportActivity", "handleUploadRoad onSuccess : " + cloudCommonReponse.getResultCode());
                        RouteImportActivity.this.d(cloudCommonReponse);
                    }

                    @Override // com.huawei.health.userprofilemgr.model.RouteResultCallBack
                    public void onFailure(Throwable th) {
                        LogUtil.c("RouteImportActivity", "handleUploadRoad onFailure :" + th.getMessage());
                        RouteImportActivity.this.d((CloudCommonReponse) null);
                    }
                });
                return;
            }
            LogUtil.d("RouteImportActivity", "handleUploadRoad UploadMap is empty");
            d((CloudCommonReponse) null);
        }
    }

    private String b(KomootRouteBean.Tour tour) {
        if (!njy.e(this.e)) {
            Iterator<String> it = this.e.iterator();
            while (it.hasNext()) {
                e(it.next());
            }
        }
        String name = tour.getName();
        if (!this.l.containsKey(name)) {
            this.l.put(name, 0);
            return "";
        }
        String strB = cxu.b(tour.getDate());
        if (name.contains(strB)) {
            return d(name);
        }
        return " " + strB + d(name + " " + strB);
    }

    private void e(String str) {
        if (this.l.containsKey(str)) {
            HashMap<String, Integer> map = this.l;
            map.put(str, map.get(str));
        } else {
            this.l.put(str, 0);
        }
    }

    private String d(String str) {
        StringBuilder sb = new StringBuilder();
        if (this.l.containsKey(str)) {
            HashMap<String, Integer> map = this.l;
            map.put(str, Integer.valueOf(map.get(str).intValue() + 1));
            sb.append(Constants.LEFT_BRACKET_ONLY);
            sb.append(this.l.get(str));
            sb.append(Constants.RIGHT_BRACKET_ONLY);
            String str2 = str + sb.toString();
            if (this.l.containsKey(str2)) {
                sb.append(d(str2));
            }
        } else {
            this.l.put(str, 0);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(CloudCommonReponse cloudCommonReponse) {
        this.y.clear();
        this.x.clear();
        this.l.clear();
        a();
        if (cloudCommonReponse == null) {
            qpx.e(this, getString(R.string.IDS_upload_fail_try_again));
            LogUtil.d("RouteImportActivity", "handleUploadRoadResponse data is null");
            return;
        }
        int iIntValue = cloudCommonReponse.getResultCode().intValue();
        if (iIntValue == 0) {
            if (njy.e(RouteDataStorageManager.getRouteDataList())) {
                qpx.e(this, getString(R.string.IDS_device_wifi_my_qrcode_add_member_success_title));
            }
            if (this.j) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("resultCode", 0);
                    Intent intent = new Intent();
                    intent.putExtra("result", HiJsonUtil.d(jSONObject));
                    setResult(-1, intent);
                    LogUtil.a("RouteImportActivity", "setResultToH5 success");
                } catch (JSONException e2) {
                    LogUtil.c("RouteImportActivity", "setResultToH5 error: %s", e2.getMessage());
                }
            } else {
                setResult(-1);
            }
            finish();
            return;
        }
        if (iIntValue != 1001) {
            switch (iIntValue) {
                case 31013:
                    qpx.e(this, getString(R.string.IDS_add_track_route_exists));
                    break;
                case 31014:
                    qpx.e(this, getString(R.string.IDS_add_track_already_exit));
                    break;
                case 31015:
                    qpx.e(this, getString(R.string.IDS_add_track_more_than_max));
                    break;
                default:
                    qpx.e(this, getString(R.string.IDS_upload_fail_try_again));
                    LogUtil.c("RouteImportActivity", "handleUploadRoadResponse:" + cloudCommonReponse.getResultDesc());
                    break;
            }
            return;
        }
        qpx.e(this, getString(R.string.IDS_upload_fail_try_again));
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class e extends BaseHandler<RouteImportActivity> {
        private e(RouteImportActivity routeImportActivity) {
            super(routeImportActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(RouteImportActivity routeImportActivity, Message message) {
            int i = message.what;
            if (i == 0) {
                routeImportActivity.b(message);
            } else if (i == 1) {
                routeImportActivity.c(message);
            } else {
                if (i != 2) {
                    return;
                }
                routeImportActivity.e(message);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
