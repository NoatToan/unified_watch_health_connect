package com.huawei.health.ecologydevice.ui.measure.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.huawei.ecologydevice.R;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.util.FAUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.njy;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceUsageDescriptionActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<elh.c> f6613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UsageDescriptionAdapter f6614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6615c;
    private RelativeLayout d;
    private ArrayList<String> e = new ArrayList<>(10);
    private ListView g;
    private elh i;
    private List<elh.c> j;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_device_usage_description);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("productId");
        this.f6615c = stringExtra;
        if (stringExtra == null) {
            finish();
            return;
        }
        this.d = (RelativeLayout) findViewById(R.id.list_load_progress);
        LogUtil.a("EcologyDevice_DeviceUsageDescriptionActivity", "onCreate mProductId = ", this.f6615c);
        elh elhVarD = ResourceManager.c().d(this.f6615c);
        this.i = elhVarD;
        if (elhVarD == null) {
            this.d.setVisibility(0);
            a();
        } else {
            this.d.setVisibility(8);
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.g = (ListView) findViewById(R.id.user_guide_list_view);
        elh elhVarD = ResourceManager.c().d(this.f6615c);
        this.i = elhVarD;
        if (elhVarD != null) {
            this.f6613a = elhVarD.d();
            if ("db83f5aa-a63d-4041-b930-24b0eac65680".equals(this.f6615c) && this.f6613a.size() > 3) {
                List<elh.c> list = this.f6613a;
                this.f6613a = list.subList(3, list.size());
            }
            this.j = this.i.ad();
            HonourDeviceConstantsApi honourDeviceConstantsApi = (HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class);
            if (!njy.e(this.j) && !honourDeviceConstantsApi.isHuaweiOrHonourDevice(this.f6615c) && !honourDeviceConstantsApi.isHonourDevice(this.f6615c)) {
                c(this.j);
                return;
            } else if (!njy.e(this.f6613a)) {
                c(this.f6613a);
                return;
            } else {
                LogUtil.a("EcologyDevice_DeviceUsageDescriptionActivity", "onCreate mDescriptionList is null");
                return;
            }
        }
        finish();
    }

    private void c(List<elh.c> list) {
        Iterator<elh.c> it = list.iterator();
        while (it.hasNext()) {
            elh.c next = it.next();
            this.e.add(elg.e().d(this.f6615c, next == null ? null : next.d()));
        }
        UsageDescriptionAdapter usageDescriptionAdapter = new UsageDescriptionAdapter(list, this);
        this.f6614b = usageDescriptionAdapter;
        this.g.setAdapter((ListAdapter) usageDescriptionAdapter);
    }

    private void a() {
        if (!Utils.h() || Utils.i()) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: epb
            @Override // java.lang.Runnable
            public final void run() {
                this.f33295b.d();
            }
        });
    }

    public /* synthetic */ void d() {
        FAUtil.a(new FAUtil.ResultCallback() { // from class: eoy
            @Override // com.huawei.health.ecologydevice.util.FAUtil.ResultCallback
            public final void onResult(boolean z) {
                this.f33289b.e(z);
            }
        });
    }

    public /* synthetic */ void e(boolean z) {
        if (z) {
            c();
        }
    }

    private void c() {
        runOnUiThread(new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.activity.DeviceUsageDescriptionActivity.2
            @Override // java.lang.Runnable
            public void run() {
                DeviceUsageDescriptionActivity.this.d.setVisibility(8);
                DeviceUsageDescriptionActivity.this.b();
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("EcologyDevice_DeviceUsageDescriptionActivity", "onDestroy to enter");
    }

    public class UsageDescriptionAdapter extends BaseAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LruCache<String, Bitmap> f6616b = new LruCache<>(1048576);
        private List<elh.c> d;
        private LayoutInflater e;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        public UsageDescriptionAdapter(List<elh.c> list, Context context) {
            this.d = list;
            this.e = LayoutInflater.from(context);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<elh.c> list = this.d;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (njy.e(this.d, i)) {
                return null;
            }
            return this.d.get(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) throws Throwable {
            Bitmap bitmapC;
            c cVar = null;
            Object[] objArr = 0;
            if (view == null) {
                c cVar2 = new c();
                View viewInflate = this.e.inflate(R.layout.device_usage_description_item, (ViewGroup) null);
                cVar2.e = (HealthTextView) viewInflate.findViewById(R.id.device_description_tv);
                cVar2.f6618a = (ImageView) viewInflate.findViewById(R.id.device_description_image);
                viewInflate.setTag(cVar2);
                cVar = cVar2;
                view = viewInflate;
            } else if (view.getTag() == null || !(view.getTag() instanceof c)) {
                LogUtil.j("EcologyDevice_DeviceUsageDescriptionActivity", "invalid view");
            } else {
                cVar = (c) view.getTag();
            }
            if (cVar == null) {
                LogUtil.j("EcologyDevice_DeviceUsageDescriptionActivity", "getView holder is null");
                return view;
            }
            if (!njy.e(this.d, i)) {
                cVar.e.setText(elo.a(DeviceUsageDescriptionActivity.this.f6615c, this.d.get(i).c()));
                if (!njy.e(DeviceUsageDescriptionActivity.this.e) && !njy.e(DeviceUsageDescriptionActivity.this.e, i)) {
                    if (this.f6616b.get((String) DeviceUsageDescriptionActivity.this.e.get(i)) == null) {
                        String str = (String) DeviceUsageDescriptionActivity.this.e.get(i);
                        bitmapC = elo.c(str);
                        if (new File(str).exists() && bitmapC != null) {
                            LogUtil.a("EcologyDevice_DeviceUsageDescriptionActivity", "getView cache Image");
                            this.f6616b.put(str, bitmapC);
                        }
                    } else {
                        String str2 = (String) DeviceUsageDescriptionActivity.this.e.get(i);
                        LogUtil.a("EcologyDevice_DeviceUsageDescriptionActivity", "getView load exists Image");
                        bitmapC = this.f6616b.get(str2);
                    }
                    if (bitmapC == null) {
                        LogUtil.j("EcologyDevice_DeviceUsageDescriptionActivity", "getView bitmap is null");
                    } else {
                        cVar.f6618a.setImageBitmap(bitmapC);
                    }
                    cVar.f6618a.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    return view;
                }
                LogUtil.j("EcologyDevice_DeviceUsageDescriptionActivity", "getView mImagePathList is null or position isOutOfBounds mImagePathList");
                return view;
            }
            LogUtil.j("EcologyDevice_DeviceUsageDescriptionActivity", "getView isOutOfBounds");
            return view;
        }

        class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private ImageView f6618a;
            private HealthTextView e;

            private c() {
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
