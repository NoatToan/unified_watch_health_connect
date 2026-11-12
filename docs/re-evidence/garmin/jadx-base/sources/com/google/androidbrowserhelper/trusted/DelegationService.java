package com.google.androidbrowserhelper.trusted;

import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.browser.trusted.b;
import androidx.browser.trusted.e;
import androidx.browser.trusted.f;
import androidx.browser.trusted.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class DelegationService extends j {
    private final List<ExtraCommandHandler> mExtraCommandHandlers = new ArrayList();
    private SharedPreferencesTokenStore mTokenStore;

    public DelegationService() {
        registerExtraCommandHandler(new NotificationDelegationExtraCommandHandler());
    }

    @Override // androidx.browser.trusted.j
    @SuppressLint({"WrongThread"})
    public e getTokenStore() {
        if (this.mTokenStore == null) {
            this.mTokenStore = new SharedPreferencesTokenStore(this);
            PackageManager packageManager = getPackageManager();
            if (ChromeOsSupport.isRunningOnArc(packageManager)) {
                this.mTokenStore.store(b.a(packageManager, ChromeOsSupport.ARC_PAYMENT_APP));
            }
        }
        return this.mTokenStore;
    }

    @Override // androidx.browser.trusted.j
    public Bundle onExtraCommand(String str, Bundle bundle, f fVar) {
        Iterator<ExtraCommandHandler> it = this.mExtraCommandHandlers.iterator();
        while (it.hasNext()) {
            Bundle bundleHandleExtraCommand = it.next().handleExtraCommand(this, str, bundle, fVar);
            if (bundleHandleExtraCommand.getBoolean("success")) {
                return bundleHandleExtraCommand;
            }
        }
        return Bundle.EMPTY;
    }

    public void registerExtraCommandHandler(ExtraCommandHandler extraCommandHandler) {
        this.mExtraCommandHandlers.add(extraCommandHandler);
    }
}
