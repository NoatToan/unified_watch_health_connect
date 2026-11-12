package com.huawei.ui.main.stories.me.activity.thirdparty;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.amap.api.services.core.AMapException;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiHealthUserPermission;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.util.HiScopeUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.me.activity.thirdparty.HealthKitThirdPartyAuthActivity;
import com.huawei.ui.main.stories.me.activity.thirdparty.adapter.ThirdPartAuthAdapter;
import defpackage.kwi;
import defpackage.lev;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qrk;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.vvr;
import defpackage.vwh;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes43.dex */
public class HealthKitThirdPartyAuthActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f28485a;
    private static int d;
    private HiAppInfo f;
    private String g;
    private CustomTitleBar k;
    private HealthButton m;
    private HealthButton n;
    private Intent p;
    private HealthRecycleView q;
    private ThirdPartAuthAdapter r;
    private String s;
    private boolean t;
    private Drawable v;
    private String w;
    private int x;
    private vvr y;
    private static ArrayList<Integer> h = HiHealthDataType.q();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ArrayList<Integer> f28487c = HiHealthDataType.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ArrayList<Integer> f28486b = HiHealthDataType.a();
    private static ArrayList<Integer> e = HiHealthDataType.k();
    private List<vvr> j = new ArrayList(10);
    private List<Boolean> i = new ArrayList(10);
    private List<Boolean> o = new ArrayList(10);
    private String u = "TYPE_ONE";
    private Handler l = new Handler() { // from class: com.huawei.ui.main.stories.me.activity.thirdparty.HealthKitThirdPartyAuthActivity.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message == null) {
                return;
            }
            if (message.what == 0) {
                HealthKitThirdPartyAuthActivity.this.h();
            } else if (message.what == 1) {
                HealthKitThirdPartyAuthActivity.this.n();
            } else {
                LogUtil.a("HealthKitThirdPartyAuthActivity", "Bag handle message.what");
            }
        }
    };

    public static /* synthetic */ void a(View view) {
    }

    private boolean b(int i) {
        switch (i) {
            case AMapException.CODE_AMAP_CLIENT_UPLOADAUTO_STARTED_ERROR /* 2200 */:
            case 10006:
            case 10007:
            case 10008:
            case 10010:
            case 30005:
            case 30006:
            case 30007:
            case 31001:
            case 31002:
            case 44000:
            case 50001:
            case 101001:
            case 101002:
            case 101003:
            case 101201:
            case 101202:
            case 101204:
                return true;
            default:
                return false;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        qrs.c(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.activity_third_party_auth);
        if (getIntent() == null) {
            finish();
            return;
        }
        this.p = getIntent();
        e();
        o();
        g();
        this.n.setOnClickListener(new View.OnClickListener() { // from class: vvh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51624c.e(view);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        if (this.w == null && !m()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.w = String.valueOf(jCurrentTimeMillis);
            String strB = qrk.b(jCurrentTimeMillis);
            this.s = strB;
            LogUtil.a("HealthKitThirdPartyAuthActivity", "new mModifiedTime: ", strB);
        } else if (m()) {
            this.s = null;
            this.w = null;
            LogUtil.a("HealthKitThirdPartyAuthActivity", "all cancel mModifiedTime: ", null);
        } else {
            LogUtil.a("HealthKitThirdPartyAuthActivity", "save mModifiedTime: ", this.s);
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "auth_time_" + f28485a, this.w, new StorageParams());
        for (vvr vvrVar : this.j) {
            int iE = vvrVar.e();
            int iG = vvrVar.g();
            if (iE == 1 || iE == 4) {
                if (iG == 0) {
                    a(vvrVar.d(), vvrVar.i(), d);
                } else if (iG == 1 || iG == 2) {
                    c(vvrVar.d(), vvrVar.i(), d);
                } else {
                    LogUtil.a("HealthKitThirdPartyAuthActivity", "onClickCallback other condition");
                }
            }
        }
        finish();
    }

    private void e() {
        this.q = (HealthRecycleView) qsp.a(this, R.id.rv_third_part_auth);
        this.k = (CustomTitleBar) qsp.a(this, R.id.tb_third_party_auth);
        this.m = (HealthButton) qsp.a(this, R.id.hw_show_delete);
        HealthButton healthButton = (HealthButton) qsp.a(this, R.id.hw_show_confirm);
        this.n = healthButton;
        healthButton.setEnabled(false);
    }

    private void o() {
        this.q.setLayoutManager(new LinearLayoutManager(this));
    }

    private void g() {
        int[] iArr;
        int[] intArrayExtra;
        try {
            if (this.p.hasExtra("readTypes") && this.p.hasExtra("writeTypes")) {
                int[] intArrayExtra2 = null;
                try {
                    intArrayExtra = this.p.getIntArrayExtra("readTypes");
                    try {
                        intArrayExtra2 = this.p.getIntArrayExtra("writeTypes");
                        this.x = this.p.getIntExtra("uidTypes", 0);
                        HiAppInfo hiAppInfo = (HiAppInfo) this.p.getParcelableExtra(MapKeyNames.APP_INFO);
                        LogUtil.d("HealthKitThirdPartyAuthActivity", "hiAppInfo = ", hiAppInfo);
                        this.f = hiAppInfo;
                        if (hiAppInfo != null) {
                            f28485a = hiAppInfo.getPackageName();
                            d = this.f.getAppId();
                            l();
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        iArr = intArrayExtra2;
                        intArrayExtra2 = intArrayExtra;
                        LogUtil.a("HealthKitThirdPartyAuthActivity", "initData ArrayIndexOutOfBoundsException");
                        intArrayExtra = intArrayExtra2;
                        intArrayExtra2 = iArr;
                    } catch (Exception unused2) {
                        iArr = intArrayExtra2;
                        intArrayExtra2 = intArrayExtra;
                        LogUtil.a("HealthKitThirdPartyAuthActivity", "initData mIntent.getIntArrayExtra Exception");
                        intArrayExtra = intArrayExtra2;
                        intArrayExtra2 = iArr;
                    }
                } catch (ArrayIndexOutOfBoundsException unused3) {
                    iArr = null;
                } catch (Exception unused4) {
                    iArr = null;
                }
                if (intArrayExtra == null && intArrayExtra2 == null) {
                    LogUtil.d("HealthKitThirdPartyAuthActivity", "read write list null");
                    return;
                } else {
                    this.u = "TYPE_ONE";
                    a(intArrayExtra, intArrayExtra2, (HiAppInfo) this.p.getParcelableExtra(MapKeyNames.APP_INFO), false);
                    return;
                }
            }
            if (this.p.hasExtra("app_id")) {
                d();
            } else {
                LogUtil.j("HealthKitThirdPartyAuthActivity", "invalid intent");
            }
        } catch (Exception unused5) {
            finish();
        }
    }

    private void d() throws PackageManager.NameNotFoundException {
        this.u = "TYPE_TWO";
        try {
            d = this.p.getIntExtra("app_id", 0);
        } catch (Exception unused) {
            LogUtil.a("HealthKitThirdPartyAuthActivity", "initData mIntent.getIntExtra Exception");
            d = 0;
        }
        HiAppInfo hiAppInfo = (HiAppInfo) this.p.getParcelableExtra(MapKeyNames.APP_INFO);
        PackageManager packageManager = getPackageManager();
        if (hiAppInfo != null) {
            this.f = hiAppInfo;
            l();
            this.k.setTitleText(this.g);
            f28485a = hiAppInfo.getPackageName();
            if (this.t) {
                this.x = 0;
            } else {
                this.x = packageManager.getApplicationInfo(hiAppInfo.getPackageName(), 0).uid;
                f28485a = this.f.getPackageName();
            }
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "auth_time_" + f28485a);
        this.w = strE;
        if (TextUtils.isEmpty(strE)) {
            this.w = null;
            this.s = null;
        } else {
            this.s = qrk.b(Long.parseLong(this.w));
        }
        a(null, null, hiAppInfo, true);
    }

    private void l() {
        HiAppInfo hiAppInfo = this.f;
        if (hiAppInfo != null) {
            String appName = hiAppInfo.getAppName();
            this.g = appName;
            if (appName == null || !appName.startsWith("QuickApp_")) {
                return;
            }
            this.t = true;
            this.g = this.g.substring(9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        ThirdPartAuthAdapter thirdPartAuthAdapter = new ThirdPartAuthAdapter(this.j, this.u, this.g, this.o);
        this.r = thirdPartAuthAdapter;
        this.q.setAdapter(thirdPartAuthAdapter);
        this.r.notifyDataSetChanged();
        this.r.c(new ThirdPartAuthAdapter.SetSwitchButtonChanged() { // from class: vvi
            @Override // com.huawei.ui.main.stories.me.activity.thirdparty.adapter.ThirdPartAuthAdapter.SetSwitchButtonChanged
            public final void switchButtonChanged(boolean z, List list) {
                this.d.d(z, list);
            }
        });
    }

    public /* synthetic */ void d(boolean z, List list) {
        this.j = list;
        if (z) {
            this.n.setEnabled(true);
        } else {
            this.n.setEnabled(false);
        }
    }

    private void a(int[] iArr, int[] iArr2, HiAppInfo hiAppInfo, boolean z) {
        b(hiAppInfo, z);
        LogUtil.a("HealthKitThirdPartyAuthActivity", "buildPermissionData readList = ", iArr, ", writeList = ", iArr2);
        e(iArr, iArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(b bVar) {
        boolean z;
        ArrayList<HiHealthUserPermission> arrayList = bVar.f28491a;
        if (njy.e(arrayList)) {
            z = true;
        } else {
            Iterator<HiHealthUserPermission> it = arrayList.iterator();
            z = false;
            while (it.hasNext()) {
                if (it.next().getAllowRead() != 1) {
                    z = false;
                    break;
                }
                z = true;
            }
        }
        ArrayList<HiHealthUserPermission> arrayList2 = bVar.f28492b;
        if (z) {
            Iterator<HiHealthUserPermission> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (it2.next().getAllowWrite() != 1) {
                    z = false;
                    break;
                }
                z = true;
            }
        }
        if (this.t && Utils.h() && njy.b(arrayList2)) {
            z = z && bVar.b().getAllowWrite() == 1;
        }
        this.y.a(z);
        this.j.set(0, this.y);
        this.j.add(new vvr(3, false, z));
        this.i.add(Boolean.valueOf(z));
        d(c(arrayList));
        e(c(arrayList2));
        e(bVar, true, z);
        a(bVar);
        e(bVar, false, z);
        k();
    }

    private void e(b bVar, boolean z, boolean z2) {
        if (njy.e(bVar.f28492b)) {
            return;
        }
        if (z) {
            this.j.add(new vvr(2, true, z, z2));
        }
        HiAppInfo hiAppInfo = this.f;
        if ((hiAppInfo == null || !"com.huawei.health.ecg.collection".equals(hiAppInfo.getPackageName())) && "TYPE_TWO".equals(this.u) && !z) {
            this.l.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.m.setVisibility(0);
        this.m.setOnClickListener(new View.OnClickListener() { // from class: vvd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51617a.c(view);
            }
        });
    }

    public /* synthetic */ void c(View view) {
        f();
    }

    private boolean m() {
        Iterator<vvr> it = this.j.iterator();
        while (it.hasNext()) {
            if (it.next().i()) {
                return false;
            }
        }
        return true;
    }

    private void k() {
        Iterator<vvr> it = this.j.iterator();
        while (it.hasNext()) {
            this.o.add(Boolean.valueOf(it.next().i()));
        }
    }

    private void a(b bVar) {
        if (!njy.e(bVar.f28492b) && Utils.h() && this.t) {
            HiHealthUserPermission hiHealthUserPermissionB = bVar.b();
            this.j.add(new vvr(4, true, 2, hiHealthUserPermissionB.getScopeId(), hiHealthUserPermissionB.getAllowWrite() == 1));
            this.i.add(Boolean.valueOf(hiHealthUserPermissionB.getAllowWrite() == 1));
        }
    }

    private void e(ArrayList<HiHealthUserPermission> arrayList) {
        int i = 0;
        while (i < arrayList.size()) {
            HiHealthUserPermission hiHealthUserPermission = arrayList.get(i);
            int scopeId = hiHealthUserPermission.getScopeId();
            boolean z = true;
            this.j.add(new vvr(b(scopeId) ? 4 : 1, i == 0, 1, scopeId, hiHealthUserPermission.getAllowWrite() == 1));
            List<Boolean> list = this.i;
            if (hiHealthUserPermission.getAllowWrite() != 1) {
                z = false;
            }
            list.add(Boolean.valueOf(z));
            i++;
        }
    }

    private void d(ArrayList<HiHealthUserPermission> arrayList) {
        int i = 0;
        while (i < arrayList.size()) {
            HiHealthUserPermission hiHealthUserPermission = arrayList.get(i);
            int scopeId = hiHealthUserPermission.getScopeId();
            boolean z = true;
            this.j.add(new vvr(b(scopeId) ? 4 : 1, i == 0, 0, scopeId, hiHealthUserPermission.getAllowRead() == 1));
            List<Boolean> list = this.i;
            if (hiHealthUserPermission.getAllowRead() != 1) {
                z = false;
            }
            list.add(Boolean.valueOf(z));
            i++;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList<HiHealthUserPermission> f28491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<HiHealthUserPermission> f28492b;
        private HiHealthUserPermission e;

        private b() {
            this.f28491a = new ArrayList<>();
            this.f28492b = new ArrayList<>();
        }

        public HiHealthUserPermission b() {
            return this.e;
        }

        public void c(HiHealthUserPermission hiHealthUserPermission) {
            this.e = hiHealthUserPermission;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("readPermissionType = ");
            Iterator<HiHealthUserPermission> it = this.f28491a.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(", ");
            }
            sb.append("writePermissionType = ");
            Iterator<HiHealthUserPermission> it2 = this.f28492b.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next());
                sb.append(", ");
            }
            return sb.toString();
        }
    }

    HiHealthUserPermission b() {
        HiHealthUserPermission hiHealthUserPermission = new HiHealthUserPermission();
        hiHealthUserPermission.setScopeId(101000);
        hiHealthUserPermission.setAllowWrite(0);
        return hiHealthUserPermission;
    }

    private void b(final HiAppInfo hiAppInfo, boolean z) {
        vvr vvrVar = new vvr(0, this.v, this.s, z, false);
        this.y = vvrVar;
        this.j.add(vvrVar);
        this.l.sendEmptyMessage(0);
        lsy.a(new Runnable() { // from class: vvg
            @Override // java.lang.Runnable
            public final void run() {
                this.f51622a.a(hiAppInfo);
            }
        });
    }

    public /* synthetic */ void a(HiAppInfo hiAppInfo) {
        if (hiAppInfo != null) {
            if (hiAppInfo.getAppName() != null && hiAppInfo.getAppName().startsWith("QuickApp_")) {
                this.v = vwh.d(this, hiAppInfo.getPackageName());
            } else {
                this.v = vwh.a(this, hiAppInfo.getPackageName());
            }
            this.y.d(this.v);
        }
        this.j.set(0, this.y);
        this.l.sendEmptyMessage(0);
    }

    private void e(final int[] iArr, final int[] iArr2) {
        final lev levVarE = lev.e(getApplicationContext());
        HiHealthNativeApi.a(this).queryHealthKitPermission(d, new HiDataOperateListener() { // from class: com.huawei.ui.main.stories.me.activity.thirdparty.HealthKitThirdPartyAuthActivity.5
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                if (!(obj instanceof List)) {
                    LogUtil.j("HealthKitThirdPartyAuthActivity", "getAlreadyHasPermission not list");
                    return;
                }
                List<HiHealthUserPermission> list = (List) obj;
                LogUtil.d("HealthKitThirdPartyAuthActivity", "buildPermissionData permissionList = ", list);
                ArrayList<HiHealthUserPermission> arrayList = new ArrayList<>(10);
                ArrayList<HiHealthUserPermission> arrayList2 = new ArrayList<>(10);
                b bVar = new b();
                bVar.c(HealthKitThirdPartyAuthActivity.this.b());
                for (HiHealthUserPermission hiHealthUserPermission : list) {
                    if (hiHealthUserPermission.getScopeId() == 101000) {
                        bVar.c(hiHealthUserPermission);
                    } else {
                        if (hiHealthUserPermission.getAllowRead() != 0) {
                            arrayList.add(hiHealthUserPermission);
                        }
                        if (hiHealthUserPermission.getAllowWrite() != 0) {
                            arrayList2.add(hiHealthUserPermission);
                        }
                    }
                }
                if (HealthKitThirdPartyAuthActivity.this.x != 0) {
                    int iJ = HealthKitThirdPartyAuthActivity.this.j();
                    levVarE.c(iJ, HealthKitThirdPartyAuthActivity.this.x, HealthKitThirdPartyAuthActivity.f28485a);
                    bVar.f28491a = levVarE.a(arrayList, true, HealthKitThirdPartyAuthActivity.this.x, iJ);
                    bVar.f28492b = levVarE.a(arrayList2, false, HealthKitThirdPartyAuthActivity.this.x, iJ);
                } else {
                    bVar.f28491a = arrayList;
                    bVar.f28492b = arrayList2;
                }
                HealthKitThirdPartyAuthActivity healthKitThirdPartyAuthActivity = HealthKitThirdPartyAuthActivity.this;
                healthKitThirdPartyAuthActivity.e(healthKitThirdPartyAuthActivity.d(bVar, iArr, iArr2));
                HealthKitThirdPartyAuthActivity.this.l.sendEmptyMessage(0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int j() {
        try {
            return Integer.parseInt(HiScopeUtil.b(this, f28485a));
        } catch (NumberFormatException unused) {
            LogUtil.e("HealthKitThirdPartyAuthActivity", "getAlreadyHasPermission NumberFormatException exists");
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b d(b bVar, int[] iArr, int[] iArr2) {
        b bVar2 = new b();
        bVar2.c(bVar.b());
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(10);
        Iterator<HiHealthUserPermission> it = bVar.f28491a.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(it.next().getScopeId()));
        }
        if (iArr != null) {
            for (int i : iArr) {
                if (!arrayList2.contains(Integer.valueOf(i))) {
                    HiHealthUserPermission hiHealthUserPermission = new HiHealthUserPermission();
                    hiHealthUserPermission.setAllowRead(2);
                    hiHealthUserPermission.setScopeId(i);
                    arrayList.add(hiHealthUserPermission);
                }
            }
        }
        arrayList.addAll(bVar.f28491a);
        bVar2.f28491a.addAll(arrayList);
        ArrayList arrayList3 = new ArrayList(10);
        Iterator<HiHealthUserPermission> it2 = bVar.f28492b.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Integer.valueOf(it2.next().getScopeId()));
        }
        ArrayList arrayList4 = new ArrayList(10);
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                if (!arrayList3.contains(Integer.valueOf(i2))) {
                    HiHealthUserPermission hiHealthUserPermission2 = new HiHealthUserPermission();
                    hiHealthUserPermission2.setAllowWrite(2);
                    hiHealthUserPermission2.setScopeId(i2);
                    arrayList4.add(hiHealthUserPermission2);
                }
            }
        }
        arrayList4.addAll(bVar.f28492b);
        bVar2.f28492b.addAll(arrayList4);
        return bVar2;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if ("TYPE_ONE".equals(this.u)) {
            finishAndRemoveTask();
        }
    }

    private ArrayList<HiHealthUserPermission> c(ArrayList<HiHealthUserPermission> arrayList) {
        boolean z = false;
        ArrayList<HiHealthUserPermission> arrayList2 = new ArrayList<>(0);
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (HiHealthUserPermission hiHealthUserPermission : arrayList) {
            int scopeId = hiHealthUserPermission.getScopeId();
            if (HiHealthDataType.o(scopeId)) {
                if (!z) {
                    z = true;
                }
            }
            if (HiHealthDataType.n(scopeId)) {
                if (!z2) {
                    z2 = true;
                }
            }
            if (HiHealthDataType.m(scopeId)) {
                if (!z3) {
                    z3 = true;
                }
            }
            if (HiHealthDataType.k(scopeId)) {
                if (!z4) {
                    z4 = true;
                }
            }
            arrayList2.add(hiHealthUserPermission);
        }
        return arrayList2;
    }

    public static void a(int i, boolean z, int i2) {
        LogUtil.a("HealthKitThirdPartyAuthActivity", "saveReadSelect");
        if (h.contains(Integer.valueOf(i))) {
            Iterator<Integer> it = h.iterator();
            while (it.hasNext()) {
                d(i2, it.next().intValue(), 0, z);
            }
            return;
        }
        if (f28487c.contains(Integer.valueOf(i))) {
            Iterator<Integer> it2 = f28487c.iterator();
            while (it2.hasNext()) {
                d(i2, it2.next().intValue(), 0, z);
            }
        } else if (f28486b.contains(Integer.valueOf(i))) {
            Iterator<Integer> it3 = f28486b.iterator();
            while (it3.hasNext()) {
                d(i2, it3.next().intValue(), 0, z);
            }
        } else {
            if (e.contains(Integer.valueOf(i))) {
                Iterator<Integer> it4 = e.iterator();
                while (it4.hasNext()) {
                    d(i2, it4.next().intValue(), 0, z);
                }
                return;
            }
            d(i2, i, 0, z);
        }
    }

    public static void c(int i, boolean z, int i2) {
        LogUtil.a("HealthKitThirdPartyAuthActivity", "saveWriteSelect");
        d(i2, i, 1, z);
    }

    private static void d(int i, int i2, int i3, boolean z) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        HiHealthNativeApi.a((Context) null).updateHealthKitPermission(i, i2, i3, z, new HiDataOperateListener() { // from class: vvm
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i4, Object obj) {
                HealthKitThirdPartyAuthActivity.b(countDownLatch, i4, obj);
            }
        });
        try {
            countDownLatch.await(200L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            LogUtil.e("HealthKitThirdPartyAuthActivity", "savePermission InterruptedException ", e2.getMessage());
        }
    }

    public static /* synthetic */ void b(CountDownLatch countDownLatch, int i, Object obj) {
        if (i == 0) {
            LogUtil.a("HealthKitThirdPartyAuthActivity", "savePermission success");
        } else {
            LogUtil.a("HealthKitThirdPartyAuthActivity", "savePermission fail");
        }
        countDownLatch.countDown();
    }

    private void f() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.a(getString(R.string.IDS_hw_show_main_permission_delete_data_content, new Object[]{this.g})).c(R.string.IDS_device_privacy_clear, new AnonymousClass2()).a(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: vvl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthKitThirdPartyAuthActivity.a(view);
            }
        });
        builder.c().show();
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.me.activity.thirdparty.HealthKitThirdPartyAuthActivity$2, reason: invalid class name */
    public class AnonymousClass2 implements View.OnClickListener {
        AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HiHealthManager.d(BaseApplication.getContext()).deleteAllKitHealthData(HealthKitThirdPartyAuthActivity.d, new HiDataOperateListener() { // from class: vvk
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public final void onResult(int i, Object obj) {
                    HealthKitThirdPartyAuthActivity.AnonymousClass2.c(i, obj);
                }
            });
            HealthKitThirdPartyAuthActivity.this.i();
        }

        public static /* synthetic */ void c(int i, Object obj) {
            if (!(obj instanceof Boolean)) {
                LogUtil.a("HealthKitThirdPartyAuthActivity", "deleteAllKitHealthData ErrorConstants.ERR_NONE");
            } else if (((Boolean) obj).booleanValue()) {
                LogUtil.a("HealthKitThirdPartyAuthActivity", "deleteAllKitHealthData ErrorConstants.SUCCESS");
            } else {
                LogUtil.a("HealthKitThirdPartyAuthActivity", "deleteAllKitHealthData ErrorConstants.ERR_NONE");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        HiAppInfo hiAppInfoC = kwi.b().c(d);
        if (hiAppInfoC == null || !"com.huawei.health.mc".equals(hiAppInfoC.getPackageName())) {
            return true;
        }
        boolean userPreference = HiHealthNativeApi.a(this).setUserPreference(new HiUserPreference("com.huawei.health.mc", ""));
        LogUtil.a("HealthKitThirdPartyAuthActivity", "deletePeriodConfig result: ", Boolean.valueOf(userPreference));
        return userPreference;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
