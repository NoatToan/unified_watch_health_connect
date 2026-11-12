package jj;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class p implements Handler.Callback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f98924f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile com.bumptech.glide.k f98925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f98926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1.a<View, Fragment> f98927c = new p1.a<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f98928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f98929e;

    public class a implements b {
    }

    public interface b {
    }

    public p(b bVar) {
        bVar = bVar == null ? f98924f : bVar;
        this.f98926b = bVar;
        this.f98929e = new n(bVar);
        this.f98928d = (dj.t.f59867f && dj.t.f59866e) ? new i() : new f();
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void b(List list, Map map) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                b(fragment.getChildFragmentManager().f7372c.f(), map);
            }
        }
    }

    public final com.bumptech.glide.k c(Context context) {
        if (context == null) {
            vb.h.s("You cannot start a load on a null Context");
            return null;
        }
        char[] cArr = qj.m.f144982a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof androidx.fragment.app.m) {
                return e((androidx.fragment.app.m) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return c(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f98925a == null) {
            synchronized (this) {
                try {
                    if (this.f98925a == null) {
                        com.bumptech.glide.b bVarB = com.bumptech.glide.b.b(context.getApplicationContext());
                        b bVar = this.f98926b;
                        jj.a aVar = new jj.a();
                        g gVar = new g();
                        Context applicationContext = context.getApplicationContext();
                        ((a) bVar).getClass();
                        this.f98925a = new com.bumptech.glide.k(bVarB, aVar, gVar, applicationContext);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return this.f98925a;
    }

    public final com.bumptech.glide.k d(Fragment fragment) {
        qj.l.c(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        char[] cArr = qj.m.f144982a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f98928d.a(fragment.getActivity());
        }
        v childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f98929e.a(context, com.bumptech.glide.b.b(context.getApplicationContext()), fragment.getF158016a(), childFragmentManager, fragment.isVisible());
    }

    public final com.bumptech.glide.k e(androidx.fragment.app.m mVar) {
        char[] cArr = qj.m.f144982a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c(mVar.getApplicationContext());
        }
        if (mVar.isDestroyed()) {
            vb.h.s("You cannot start a load for a destroyed activity");
            return null;
        }
        this.f98928d.a(mVar);
        Activity activityA = a(mVar);
        return this.f98929e.a(mVar, com.bumptech.glide.b.b(mVar.getApplicationContext()), mVar.getF158016a(), mVar.getSupportFragmentManager(), activityA == null || !activityA.isFinishing());
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
