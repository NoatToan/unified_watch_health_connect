package androidx.browser.trusted;

import android.app.Notification;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.customtabs.trusted.ITrustedWebActivityService;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ITrustedWebActivityService f5335a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Parcelable[] f5336a;

        public a(Parcelable[] parcelableArr) {
            this.f5336a = parcelableArr;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5338b;

        public b(String str, int i14) {
            this.f5337a = str;
            this.f5338b = i14;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5339a;

        public c(String str) {
            this.f5339a = str;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Notification f5342c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f5343d;

        public d(String str, int i14, Notification notification, String str2) {
            this.f5340a = str;
            this.f5341b = i14;
            this.f5342c = notification;
            this.f5343d = str2;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f5344a;

        public e(boolean z14) {
            this.f5344a = z14;
        }
    }

    public k(ITrustedWebActivityService iTrustedWebActivityService, ComponentName componentName) {
        this.f5335a = iTrustedWebActivityService;
    }

    public static void a(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return;
        }
        vb.h.s("Bundle must contain ".concat(str));
    }
}
