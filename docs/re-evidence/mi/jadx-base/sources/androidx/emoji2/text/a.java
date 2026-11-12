package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import defpackage.e0a;
import defpackage.g6i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: androidx.emoji2.text.a$a, reason: collision with other inner class name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class C0031a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f2285a;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public C0031a(b bVar) {
            this.f2285a = bVar == null ? e() : bVar;
        }

        public static b e() {
            return Build.VERSION.SDK_INT >= 28 ? new d() : new c();
        }

        public final androidx.emoji2.text.c.AbstractC0033c a(Context context, e0a e0aVar) {
            if (e0aVar == null) {
                return null;
            }
            return new e(context, e0aVar);
        }

        public final List<List<byte[]>> b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public androidx.emoji2.text.c.AbstractC0033c c(Context context) {
            return a(context, h(context));
        }

        public final e0a d(ProviderInfo providerInfo, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new e0a(str, str2, "emojicompat-emoji-font", b(this.f2285a.b(packageManager, str2)));
        }

        public final boolean f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        public final ProviderInfo g(PackageManager packageManager) {
            Iterator<ResolveInfo> it = this.f2285a.c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfoA = this.f2285a.a(it.next());
                if (f(providerInfoA)) {
                    return providerInfoA;
                }
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @VisibleForTesting
        public e0a h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            g6i.h(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo providerInfoG = g(packageManager);
            if (providerInfoG == null) {
                return null;
            }
            try {
                return d(providerInfoG, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                return null;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class b {
        public ProviderInfo a(ResolveInfo resolveInfo) {
            throw null;
        }

        public Signature[] b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i) {
            throw null;
        }
    }

    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class c extends b {
        @Override // androidx.emoji2.text.a.b
        public ProviderInfo a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.a.b
        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class d extends c {
        @Override // androidx.emoji2.text.a.b
        public Signature[] b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static e a(Context context) {
        return (e) new C0031a(null).c(context);
    }
}
