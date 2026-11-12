package r;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.customtabs.ICustomTabsCallback;

/* JADX INFO: loaded from: classes.dex */
public class c extends ICustomTabsCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f148639a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r.b f148640b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f148641a;

        public a(Bundle bundle) {
            this.f148641a = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f148640b.onUnminimized(this.f148641a);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f148643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f148644b;

        public b(int i14, Bundle bundle) {
            this.f148643a = i14;
            this.f148644b = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f148640b.onNavigationEvent(this.f148643a, this.f148644b);
        }
    }

    /* JADX INFO: renamed from: r.c$c, reason: collision with other inner class name */
    public class RunnableC2801c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f148646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f148647b;

        public RunnableC2801c(String str, Bundle bundle) {
            this.f148646a = str;
            this.f148647b = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f148640b.extraCallback(this.f148646a, this.f148647b);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f148649a;

        public d(Bundle bundle) {
            this.f148649a = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f148640b.onMessageChannelReady(this.f148649a);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f148651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f148652b;

        public e(String str, Bundle bundle) {
            this.f148651a = str;
            this.f148652b = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f148640b.onPostMessage(this.f148651a, this.f148652b);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f148654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Uri f148655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f148656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Bundle f148657d;

        public f(int i14, Uri uri, boolean z14, Bundle bundle) {
            this.f148654a = i14;
            this.f148655b = uri;
            this.f148656c = z14;
            this.f148657d = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f148640b.onRelationshipValidationResult(this.f148654a, this.f148655b, this.f148656c, this.f148657d);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f148659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f148660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bundle f148661c;

        public g(int i14, int i15, Bundle bundle) {
            this.f148659a = i14;
            this.f148660b = i15;
            this.f148661c = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f148640b.onActivityResized(this.f148659a, this.f148660b, this.f148661c);
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f148663a;

        public h(Bundle bundle) {
            this.f148663a = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f148640b.onWarmupCompleted(this.f148663a);
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f148665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f148666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f148667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f148668d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f148669e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Bundle f148670f;

        public i(int i14, int i15, int i16, int i17, int i18, Bundle bundle) {
            this.f148665a = i14;
            this.f148666b = i15;
            this.f148667c = i16;
            this.f148668d = i17;
            this.f148669e = i18;
            this.f148670f = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f148640b.onActivityLayout(this.f148665a, this.f148666b, this.f148667c, this.f148668d, this.f148669e, this.f148670f);
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f148672a;

        public j(Bundle bundle) {
            this.f148672a = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f148640b.onMinimized(this.f148672a);
        }
    }

    public c(r.d dVar, r.b bVar) {
        this.f148640b = bVar;
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void extraCallback(String str, Bundle bundle) {
        if (this.f148640b == null) {
            return;
        }
        this.f148639a.post(new RunnableC2801c(str, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        r.b bVar = this.f148640b;
        if (bVar == null) {
            return null;
        }
        return bVar.extraCallbackWithResult(str, bundle);
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onActivityLayout(int i14, int i15, int i16, int i17, int i18, Bundle bundle) {
        if (this.f148640b == null) {
            return;
        }
        this.f148639a.post(new i(i14, i15, i16, i17, i18, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onActivityResized(int i14, int i15, Bundle bundle) {
        if (this.f148640b == null) {
            return;
        }
        this.f148639a.post(new g(i14, i15, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onMessageChannelReady(Bundle bundle) {
        if (this.f148640b == null) {
            return;
        }
        this.f148639a.post(new d(bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onMinimized(Bundle bundle) {
        if (this.f148640b == null) {
            return;
        }
        this.f148639a.post(new j(bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onNavigationEvent(int i14, Bundle bundle) {
        if (this.f148640b == null) {
            return;
        }
        this.f148639a.post(new b(i14, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onPostMessage(String str, Bundle bundle) {
        if (this.f148640b == null) {
            return;
        }
        this.f148639a.post(new e(str, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onRelationshipValidationResult(int i14, Uri uri, boolean z14, Bundle bundle) {
        if (this.f148640b == null) {
            return;
        }
        this.f148639a.post(new f(i14, uri, z14, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onUnminimized(Bundle bundle) {
        if (this.f148640b == null) {
            return;
        }
        this.f148639a.post(new a(bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onWarmupCompleted(Bundle bundle) {
        if (this.f148640b == null) {
            return;
        }
        this.f148639a.post(new h(bundle));
    }
}
