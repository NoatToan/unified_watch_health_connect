package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: androidx.emoji2.text.a$a, reason: collision with other inner class name */
    public static class C0098a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f7026a;

        public C0098a(b bVar) {
            this.f7026a = bVar == null ? new d() : bVar;
        }
    }

    public static class b {
        public ProviderInfo a(ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public List c(PackageManager packageManager, Intent intent) {
            return Collections.EMPTY_LIST;
        }
    }

    public static class c extends b {
        @Override // androidx.emoji2.text.a.b
        public final ProviderInfo a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.a.b
        public final List c(PackageManager packageManager, Intent intent) {
            return packageManager.queryIntentContentProviders(intent, 0);
        }
    }

    public static class d extends c {
        @Override // androidx.emoji2.text.a.b
        public final Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    private a() {
    }

    public static g a(Context context) {
        ProviderInfo providerInfoA;
        i7.e eVar;
        ApplicationInfo applicationInfo;
        C0098a c0098a = new C0098a(null);
        PackageManager packageManager = context.getPackageManager();
        k7.h.e(packageManager, "Package manager required to locate emoji font provider");
        Intent intent = new Intent("androidx.content.action.LOAD_EMOJI_FONT");
        b bVar = c0098a.f7026a;
        Iterator it = bVar.c(packageManager, intent).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfoA = null;
                break;
            }
            providerInfoA = bVar.a((ResolveInfo) it.next());
            if (providerInfoA != null && (applicationInfo = providerInfoA.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfoA == null) {
            eVar = null;
        } else {
            try {
                String str = providerInfoA.authority;
                String str2 = providerInfoA.packageName;
                Signature[] signatureArrB = bVar.b(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrB) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new i7.e(str, str2, "emojicompat-emoji-font", (List<List<byte[]>>) Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException unused) {
                eVar = null;
            }
        }
        if (eVar == null) {
            return null;
        }
        return new g(context, eVar);
    }
}
