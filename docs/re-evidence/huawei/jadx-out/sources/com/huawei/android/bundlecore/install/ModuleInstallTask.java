package com.huawei.android.bundlecore.install;

import defpackage.baj;
import defpackage.bba;
import defpackage.bbr;
import defpackage.bbu;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class ModuleInstallTask implements Runnable {
    private static final String TAG = "Bundle_InstallTask";
    private final bba mInstaller;
    private final boolean mIsStartInstall;
    private final Collection<baj> mUpdateModules;

    public void onInstallCompleted(List<bba.c> list) {
    }

    public void onInstallFailed(List<bbr> list) {
    }

    public void onPreInstall() {
    }

    public ModuleInstallTask(bba bbaVar, boolean z, Collection<baj> collection) {
        this.mInstaller = bbaVar;
        this.mIsStartInstall = z;
        this.mUpdateModules = collection;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0070  */
    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    /* JADX WARN: Code duplicated, block: B:20:0x0095  */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        onPreInstall();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.mUpdateModules.size());
        ArrayList arrayList3 = new ArrayList();
        boolean z = true;
        for (baj bajVar : this.mUpdateModules) {
            bbu bbuVar = new bbu(bajVar.f(), bajVar.h(), bajVar.n());
            try {
                bba.c cVarD = this.mInstaller.d(this.mIsStartInstall, bajVar);
                arrayList2.add(bbuVar);
                arrayList.add(cVarD);
            } catch (bba.a e) {
                arrayList3.add(new bbr(bbuVar, e.b(), e.getCause()));
                if (this.mIsStartInstall) {
                    z = false;
                    if (this.mIsStartInstall) {
                        str = "Start";
                    } else {
                        str = "Deferred";
                    }
                    str2 = str;
                    if (z) {
                        onInstallCompleted(arrayList);
                        LogUtil.b(TAG, str2, " install ", arrayList2.toString(), " success, cost time:", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "ms");
                    } else {
                        onInstallFailed(arrayList3);
                        LogUtil.e(TAG, str2, " install ", arrayList2.toString(), " failed, ", arrayList3.toString(), ", cost time:", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "ms");
                    }
                }
                z = false;
            }
        }
        if (this.mIsStartInstall) {
            str = "Start";
        } else {
            str = "Deferred";
        }
        str2 = str;
        if (z) {
            onInstallCompleted(arrayList);
            LogUtil.b(TAG, str2, " install ", arrayList2.toString(), " success, cost time:", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "ms");
        } else {
            onInstallFailed(arrayList3);
            LogUtil.e(TAG, str2, " install ", arrayList2.toString(), " failed, ", arrayList3.toString(), ", cost time:", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "ms");
        }
    }
}
