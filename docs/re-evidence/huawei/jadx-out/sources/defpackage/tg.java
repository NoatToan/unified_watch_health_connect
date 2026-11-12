package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;

/* JADX INFO: loaded from: classes21.dex */
class tg {
    private final CustomTabsIntent.Builder e;

    tg() {
        this(new CustomTabsIntent.Builder());
    }

    tg(CustomTabsIntent.Builder builder) {
        this.e = builder;
    }

    void b(Context context, Uri uri, boolean z) {
        CustomTabsIntent customTabsIntentBuild = this.e.build();
        if (z) {
            customTabsIntentBuild.intent.addFlags(268435456);
        }
        customTabsIntentBuild.launchUrl(context, uri);
    }
}
