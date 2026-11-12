package com.huawei.android.bundlecore.install.remote;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.huawei.android.bundlecore.install.protocol.ISplitInstallService;
import com.huawei.android.bundlecore.install.protocol.ISplitInstallServiceCallback;
import com.huawei.haf.handler.HandlerCenter;
import defpackage.bbc;
import defpackage.bbe;
import defpackage.bbh;
import defpackage.bbj;
import defpackage.bbk;
import defpackage.bbl;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class ModuleInstallService extends Service {
    private static final HandlerCenter d = HandlerCenter.d("bundle_");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ISplitInstallService.Stub f5094c;

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        stopSelf(i2);
        return 2;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (this.f5094c == null) {
            this.f5094c = new e();
        }
        return this.f5094c;
    }

    static void a(String str, Runnable runnable) {
        d.d(runnable, str);
    }

    static class e extends ISplitInstallService.Stub {
        private e() {
        }

        @Override // com.huawei.android.bundlecore.install.protocol.ISplitInstallService
        public void startInstall(String str, List<Bundle> list, Bundle bundle, ISplitInstallServiceCallback iSplitInstallServiceCallback) {
            ModuleInstallService.a(str, new bbl(iSplitInstallServiceCallback, list));
        }

        @Override // com.huawei.android.bundlecore.install.protocol.ISplitInstallService
        public void cancelInstall(String str, int i, Bundle bundle, ISplitInstallServiceCallback iSplitInstallServiceCallback) {
            ModuleInstallService.a(str, new bbe(iSplitInstallServiceCallback, i));
        }

        @Override // com.huawei.android.bundlecore.install.protocol.ISplitInstallService
        public void getSessionState(String str, int i, ISplitInstallServiceCallback iSplitInstallServiceCallback) {
            ModuleInstallService.a(str, new bbh(iSplitInstallServiceCallback, i));
        }

        @Override // com.huawei.android.bundlecore.install.protocol.ISplitInstallService
        public void getSessionStates(String str, ISplitInstallServiceCallback iSplitInstallServiceCallback) {
            ModuleInstallService.a(str, new bbk(iSplitInstallServiceCallback));
        }

        @Override // com.huawei.android.bundlecore.install.protocol.ISplitInstallService
        public void deferredInstall(String str, List<Bundle> list, Bundle bundle, ISplitInstallServiceCallback iSplitInstallServiceCallback) {
            ModuleInstallService.a(str, new bbc(iSplitInstallServiceCallback, list));
        }

        @Override // com.huawei.android.bundlecore.install.protocol.ISplitInstallService
        public void deferredUninstall(String str, List<Bundle> list, Bundle bundle, ISplitInstallServiceCallback iSplitInstallServiceCallback) {
            ModuleInstallService.a(str, new bbj(iSplitInstallServiceCallback, list));
        }
    }
}
