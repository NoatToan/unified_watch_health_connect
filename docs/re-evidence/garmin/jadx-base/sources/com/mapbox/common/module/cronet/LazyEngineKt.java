package com.mapbox.common.module.cronet;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.net.CronetProviderInstaller;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import o13.q;
import org.chromium.net.CronetProvider;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"CRONET_PLAY_SERVICES_INSTALLER_CLASS", "", "canInstallFromGooglePlay", "Ljava/util/concurrent/atomic/AtomicBoolean;", "disabledProviders", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getDisabledProviders$annotations", "()V", "getDisabledProviders", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "isPlayServicesCronetProviderInstallerAvailable", "", "findCronetProvider", "Lorg/chromium/net/CronetProvider;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class LazyEngineKt {
    private static final String CRONET_PLAY_SERVICES_INSTALLER_CLASS = "com.google.android.gms.net.CronetProviderInstaller";
    private static final AtomicBoolean canInstallFromGooglePlay;
    private static final CopyOnWriteArraySet<String> disabledProviders;
    private static final boolean isPlayServicesCronetProviderInstallerAvailable;

    static {
        Object bVar;
        CopyOnWriteArraySet<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        copyOnWriteArraySet.add(CronetProvider.PROVIDER_NAME_FALLBACK);
        disabledProviders = copyOnWriteArraySet;
        try {
            int i14 = q.f128596b;
            bVar = CronetProviderInstaller.class;
            String str = CronetProviderInstaller.PROVIDER_NAME;
        } catch (Throwable th3) {
            int i15 = q.f128596b;
            bVar = new q.b(th3);
        }
        boolean z14 = !(bVar instanceof q.b);
        isPlayServicesCronetProviderInstallerAvailable = z14;
        canInstallFromGooglePlay = new AtomicBoolean(z14);
    }

    public static final CronetProvider findCronetProvider(Context context) {
        Object next;
        context.getClass();
        List<CronetProvider> allProviders = CronetProvider.getAllProviders(context);
        allProviders.getClass();
        Iterator<T> it = allProviders.iterator();
        while (it.hasNext()) {
            next = it.next();
            CronetProvider cronetProvider = (CronetProvider) next;
            try {
                if (cronetProvider.isEnabled() && !disabledProviders.contains(cronetProvider.getName())) {
                    return (CronetProvider) next;
                }
            } catch (Exception unused) {
            }
        }
        next = null;
        return (CronetProvider) next;
    }

    public static final CopyOnWriteArraySet<String> getDisabledProviders() {
        return disabledProviders;
    }

    public static /* synthetic */ void getDisabledProviders$annotations() {
    }
}
