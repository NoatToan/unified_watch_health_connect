package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import defpackage.flb;
import defpackage.i98;
import defpackage.kfe;
import defpackage.ko9;
import defpackage.koa;
import defpackage.rok;
import defpackage.sok;
import defpackage.ulq;
import defpackage.vi1;
import defpackage.x07;

/* JADX INFO: loaded from: classes4.dex */
public class b implements Handler.Callback {
    public static final InterfaceC0141b f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile rok f7001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0141b f7002b;
    public final ArrayMap<View, Fragment> c = new ArrayMap<>();
    public final koa d;
    public final com.bumptech.glide.manager.a e;

    public class a implements InterfaceC0141b {
        @Override // com.bumptech.glide.manager.b.InterfaceC0141b
        public rok a(com.bumptech.glide.a aVar, kfe kfeVar, sok sokVar, Context context) {
            return new rok(aVar, kfeVar, sokVar, context);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.manager.b$b, reason: collision with other inner class name */
    public interface InterfaceC0141b {
        rok a(com.bumptech.glide.a aVar, kfe kfeVar, sok sokVar, Context context);
    }

    public b(InterfaceC0141b interfaceC0141b) {
        interfaceC0141b = interfaceC0141b == null ? f : interfaceC0141b;
        this.f7002b = interfaceC0141b;
        this.e = new com.bumptech.glide.manager.a(interfaceC0141b);
        this.d = b();
    }

    @TargetApi(17)
    public static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    public static koa b() {
        return (flb.f && flb.e) ? new ko9() : new x07();
    }

    public static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean g(Context context) {
        Activity activityC = c(context);
        return activityC == null || !activityC.isFinishing();
    }

    public rok d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (ulq.s() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return e((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return d(contextWrapper.getBaseContext());
                }
            }
        }
        return f(context);
    }

    public rok e(FragmentActivity fragmentActivity) {
        if (ulq.r()) {
            return d(fragmentActivity.getApplicationContext());
        }
        a(fragmentActivity);
        this.d.a(fragmentActivity);
        boolean zG = g(fragmentActivity);
        return this.e.b(fragmentActivity, com.bumptech.glide.a.d(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), zG);
    }

    public final rok f(Context context) {
        if (this.f7001a == null) {
            synchronized (this) {
                try {
                    if (this.f7001a == null) {
                        this.f7001a = this.f7002b.a(com.bumptech.glide.a.d(context.getApplicationContext()), new vi1(), new i98(), context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f7001a;
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }
}
