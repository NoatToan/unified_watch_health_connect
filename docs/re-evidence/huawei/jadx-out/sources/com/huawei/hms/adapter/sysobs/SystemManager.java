package com.huawei.hms.adapter.sysobs;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SystemManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SystemManager f12723a = new SystemManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f12724b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SystemNotifier f12725c = new a();

    private SystemManager() {
    }

    public static SystemManager getInstance() {
        return f12723a;
    }

    public static SystemNotifier getSystemNotifier() {
        return f12725c;
    }

    public void notifyNoticeResult(int i) {
        f12725c.notifyNoticeObservers(i);
    }

    public void notifyResolutionResult(Intent intent, String str) {
        f12725c.notifyObservers(intent, str);
    }

    public void notifyUpdateResult(int i) {
        f12725c.notifyObservers(i);
    }

    class a implements SystemNotifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<SystemObserver> f12726a = new ArrayList();

        a() {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyNoticeObservers(int i) {
            synchronized (SystemManager.f12724b) {
                Iterator<SystemObserver> it = this.f12726a.iterator();
                while (it.hasNext()) {
                    if (it.next().onNoticeResult(i)) {
                        it.remove();
                    }
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(Intent intent, String str) {
            synchronized (SystemManager.f12724b) {
                Iterator<SystemObserver> it = this.f12726a.iterator();
                while (it.hasNext()) {
                    if (it.next().onSolutionResult(intent, str)) {
                        it.remove();
                    }
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void registerObserver(SystemObserver systemObserver) {
            if (systemObserver == null || this.f12726a.contains(systemObserver)) {
                return;
            }
            synchronized (SystemManager.f12724b) {
                this.f12726a.add(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void unRegisterObserver(SystemObserver systemObserver) {
            synchronized (SystemManager.f12724b) {
                this.f12726a.remove(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(int i) {
            synchronized (SystemManager.f12724b) {
                Iterator<SystemObserver> it = this.f12726a.iterator();
                while (it.hasNext()) {
                    if (it.next().onUpdateResult(i)) {
                        it.remove();
                    }
                }
            }
        }
    }
}
