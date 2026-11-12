package com.huawei.ui.homehealth.quickentrycard;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.h5pro.H5proUtil;
import defpackage.ezg;
import defpackage.lua;
import defpackage.suw;
import defpackage.suy;
import defpackage.swj;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class QuickEntryFlowManager {
    private static QuickEntryFlowManager d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f25742c;
    private QuickEntryDisplayCallback j;
    private List<ezg> e = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final suy f25740a = suy.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QuickEntryDataSourceManager f25741b = QuickEntryDataSourceManager.b();
    private final swj g = swj.d();

    /* JADX INFO: loaded from: classes43.dex */
    public static class EmptyStateQueryManager {

        public interface OnEmptyStateCallback {
            void onResult(List<String> list);
        }
    }

    public interface QuickEntryDisplayCallback {
        void onDisplayEntries(List<ezg> list);
    }

    private QuickEntryFlowManager() {
    }

    public static QuickEntryFlowManager d() {
        QuickEntryFlowManager quickEntryFlowManager;
        synchronized (QuickEntryFlowManager.class) {
            if (d == null) {
                d = new QuickEntryFlowManager();
            }
            quickEntryFlowManager = d;
        }
        return quickEntryFlowManager;
    }

    public void a(QuickEntryDisplayCallback quickEntryDisplayCallback) {
        this.j = quickEntryDisplayCallback;
    }

    public void e() {
        LogUtil.a("QuickEntryFlowManager", "startFlow begin");
        this.f25741b.c();
        this.f25742c = LoginInit.getInstance(BaseApplication.getContext()).getHuidOrDefault();
        c(this.f25740a.e());
    }

    public void b() {
        LogUtil.a("QuickEntryFlowManager", "cancelFlow");
        this.f25742c = "";
        this.f25741b.e();
    }

    private String f() {
        return this.f25742c;
    }

    public void c(Context context) {
        H5proUtil.jumpFromDeeplink(context, "com.huawei.health.h5.dashboard?h5pro=true&isImmerse&showStatusBar&statusBarTextBlack&urlType=4&pName=com.huawei.health&path=quick_entry_edit");
    }

    private void c(List<String> list) {
        List<ezg> listA = a(list);
        if (!listA.isEmpty()) {
            if (suy.b().d()) {
                this.e = listA;
                e(listA);
                return;
            } else {
                h();
                return;
            }
        }
        LogUtil.a("QuickEntryFlowManager", "handleCacheHit entries is empty, fallback to cache miss");
        j();
    }

    private void j() {
        if (!lua.e()) {
            LogUtil.a("QuickEntryFlowManager", "handleCacheMiss isPullAllStatus is false");
        } else {
            final String strF = f();
            QuickEntryDictionaryManager.a().a(new QuickEntryDictionaryManager.OnDictionaryCallback() { // from class: swf
                @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDictionaryManager.OnDictionaryCallback
                public final void onDictionaryResult(List list) {
                    this.d.d(strF, list);
                }
            });
        }
    }

    public /* synthetic */ void d(String str, List list) {
        if (!str.equals(f())) {
            LogUtil.a("QuickEntryFlowManager", "handleCacheMiss cancelled or flow changed, skip");
            return;
        }
        if (list != null && !list.isEmpty()) {
            LogUtil.a("QuickEntryFlowManager", "handleCacheMiss dictionary not empty, size: " + list.size());
            b(list);
            return;
        }
        LogUtil.a("QuickEntryFlowManager", "handleCacheMiss dictionary is empty");
        h();
    }

    private void h() {
        LogUtil.a("QuickEntryFlowManager", "handleEmptyDictionary never preset, do preset");
        a();
    }

    private void a() {
        LogUtil.a("QuickEntryFlowManager", "doPresetEntries start");
        final String strF = f();
        this.f25741b.d(new QuickEntryDataSourceManager.OnConditionQueryCallback() { // from class: swe
            @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.OnConditionQueryCallback
            public final void onComplete(List list) {
                this.e.b(strF, list);
            }
        });
    }

    public /* synthetic */ void b(String str, List list) {
        if (!str.equals(f())) {
            LogUtil.a("QuickEntryFlowManager", "doPresetEntries cancelled or flow changed, skip");
            return;
        }
        LogUtil.a("QuickEntryFlowManager", "doPresetEntries query complete, result size: " + list.size());
        List<String> listE = this.g.e(list);
        this.f25740a.d(true);
        QuickEntryDictionaryManager.DictionaryQueryManager.b().d(listE, null);
        b(listE);
    }

    public void b(List<String> list) {
        if (list == null) {
            LogUtil.a("QuickEntryFlowManager", "refreshCacheAndDisplay entryIds is empty");
            return;
        }
        this.f25740a.a(list);
        List<ezg> listA = a(list);
        this.e = listA;
        e(listA);
    }

    private List<ezg> a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (String str : list) {
                ezg ezgVarD = suw.d(str);
                if (ezgVarD != null) {
                    arrayList.add(ezgVarD);
                } else {
                    LogUtil.j("QuickEntryFlowManager", "buildEntriesFromIds entry not found: " + str);
                }
            }
        }
        return arrayList;
    }

    private void e(List<ezg> list) {
        QuickEntryDisplayCallback quickEntryDisplayCallback = this.j;
        if (quickEntryDisplayCallback != null) {
            quickEntryDisplayCallback.onDisplayEntries(list);
        }
    }

    public List<ezg> c() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.e);
        }
        return arrayList;
    }
}
