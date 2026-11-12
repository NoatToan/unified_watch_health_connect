package androidx.window.layout.adapter.sidecar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import ch.qos.logback.core.CoreConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import oe.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import re.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eB\u001b\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000f"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat;", "Landroidx/window/layout/adapter/sidecar/a;", "Landroidx/window/sidecar/SidecarInterface;", "sidecar", "Lre/e;", "sidecarAdapter", "<init>", "(Landroidx/window/sidecar/SidecarInterface;Lre/e;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;)V", "c", "TranslatingCallback", "b", "a", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SidecarCompat implements androidx.window.layout.adapter.sidecar.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f11400f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SidecarInterface f11401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f11402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f11403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f11404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f11405e;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "<init>", "(Landroidx/window/layout/adapter/sidecar/SidecarCompat;)V", "onDeviceStateChanged", "", "newDeviceState", "Landroidx/window/sidecar/SidecarDeviceState;", "onWindowLayoutChanged", "windowToken", "Landroid/os/IBinder;", "newLayout", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
            SidecarInterface sidecarInterface;
            newDeviceState.getClass();
            Collection<Activity> collectionValues = SidecarCompat.this.f11403c.values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : collectionValues) {
                SidecarCompat.f11400f.getClass();
                IBinder iBinderA = a.a(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (iBinderA != null && (sidecarInterface = sidecarCompat.f11401a) != null) {
                    windowLayoutInfo = sidecarInterface.getWindowLayoutInfo(iBinderA);
                }
                b bVar = sidecarCompat.f11405e;
                if (bVar != null) {
                    bVar.a(activity, sidecarCompat.f11402b.d(windowLayoutInfo, newDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
            SidecarDeviceState sidecarDeviceState;
            windowToken.getClass();
            newLayout.getClass();
            Activity activity = (Activity) SidecarCompat.this.f11403c.get(windowToken);
            if (activity == null) {
                return;
            }
            SidecarCompat sidecarCompat = SidecarCompat.this;
            e eVar = sidecarCompat.f11402b;
            SidecarInterface sidecarInterface = sidecarCompat.f11401a;
            if (sidecarInterface == null || (sidecarDeviceState = sidecarInterface.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            l lVarD = eVar.d(newLayout, sidecarDeviceState);
            b bVar = SidecarCompat.this.f11405e;
            if (bVar != null) {
                bVar.a(activity, lVarD);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$b;", "Landroidx/window/layout/adapter/sidecar/a$a;", "callbackInterface", "<init>", "(Landroidx/window/layout/adapter/sidecar/a$a;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements androidx.window.layout.adapter.sidecar.a.InterfaceC0161a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.window.layout.adapter.sidecar.a.InterfaceC0161a f11407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ReentrantLock f11408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WeakHashMap<Activity, l> f11409c;

        public b(androidx.window.layout.adapter.sidecar.a.InterfaceC0161a interfaceC0161a) {
            interfaceC0161a.getClass();
            this.f11407a = interfaceC0161a;
            this.f11408b = new ReentrantLock();
            this.f11409c = new WeakHashMap<>();
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0161a
        public final void a(Activity activity, l lVar) {
            WeakHashMap<Activity, l> weakHashMap = this.f11409c;
            activity.getClass();
            ReentrantLock reentrantLock = this.f11408b;
            reentrantLock.lock();
            try {
                if (lVar.equals(weakHashMap.get(activity))) {
                    reentrantLock.unlock();
                    return;
                }
                weakHashMap.put(activity, lVar);
                reentrantLock.unlock();
                this.f11407a.a(activity, lVar);
            } catch (Throwable th3) {
                reentrantLock.unlock();
                throw th3;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$c;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/window/layout/adapter/sidecar/SidecarCompat;", "sidecarCompat", "Landroid/app/Activity;", "activity", "<init>", "(Landroidx/window/layout/adapter/sidecar/SidecarCompat;Landroid/app/Activity;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SidecarCompat f11410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<Activity> f11411b;

        public c(SidecarCompat sidecarCompat, Activity activity) {
            sidecarCompat.getClass();
            activity.getClass();
            this.f11410a = sidecarCompat;
            this.f11411b = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view2) {
            view2.getClass();
            view2.removeOnAttachStateChangeListener(this);
            Activity activity = this.f11411b.get();
            SidecarCompat.f11400f.getClass();
            IBinder iBinderA = a.a(activity);
            if (activity == null || iBinderA == null) {
                return;
            }
            this.f11410a.e(iBinderA, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view2) {
            view2.getClass();
        }
    }

    public SidecarCompat(SidecarInterface sidecarInterface, e eVar) {
        eVar.getClass();
        this.f11401a = sidecarInterface;
        this.f11402b = eVar;
        this.f11403c = new LinkedHashMap();
        this.f11404d = new LinkedHashMap();
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public final void a(androidx.window.layout.adapter.sidecar.b.C0162b c0162b) {
        this.f11405e = new b(c0162b);
        SidecarInterface sidecarInterface = this.f11401a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f11402b, new TranslatingCallback()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.window.layout.adapter.sidecar.a
    public final void b(Activity activity) {
        SidecarInterface sidecarInterface;
        f11400f.getClass();
        IBinder iBinderA = a.a(activity);
        if (iBinderA == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f11401a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderA);
        }
        LinkedHashMap linkedHashMap = this.f11404d;
        k7.b<Configuration> bVar = (k7.b) linkedHashMap.get(activity);
        if (bVar != null) {
            if (activity instanceof a7.e) {
                ((a7.e) activity).removeOnConfigurationChangedListener(bVar);
            }
            linkedHashMap.remove(activity);
        }
        b bVar2 = this.f11405e;
        if (bVar2 != null) {
            ReentrantLock reentrantLock = bVar2.f11408b;
            reentrantLock.lock();
            try {
                bVar2.f11409c.put(activity, null);
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
            } catch (Throwable th3) {
                reentrantLock.unlock();
                throw th3;
            }
        }
        LinkedHashMap linkedHashMap2 = this.f11403c;
        boolean z14 = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinderA);
        if (!z14 || (sidecarInterface = this.f11401a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public final void c(Activity activity) {
        f11400f.getClass();
        IBinder iBinderA = a.a(activity);
        if (iBinderA != null) {
            e(iBinderA, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
        }
    }

    public final l d(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        f11400f.getClass();
        IBinder iBinderA = a.a(activity);
        if (iBinderA == null) {
            return new l(j0.f134944a);
        }
        SidecarInterface sidecarInterface = this.f11401a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinderA) : null;
        SidecarInterface sidecarInterface2 = this.f11401a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f11402b.d(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f11403c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f11401a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f11401a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        b bVar = this.f11405e;
        if (bVar != null) {
            bVar.a(activity, d(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f11404d;
        if (linkedHashMap2.get(activity) == null && (activity instanceof a7.e)) {
            m0.c cVar = new m0.c(3, this, activity);
            linkedHashMap2.put(activity, cVar);
            ((a7.e) activity).addOnConfigurationChangedListener(cVar);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public final boolean f() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f11401a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!s.g(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f11401a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f11401a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f11401a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!s.g(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f11401a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!s.g(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f11401a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!s.g(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                objInvoke.getClass();
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            rect.getClass();
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                objInvoke2.getClass();
                if (arrayList.equals((List) objInvoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static IBinder a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public static SidecarInterface b(Context context) {
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public static me.l c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                me.l.f117978f.getClass();
                return me.l.a.a(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(a.b(context), new e(null, 1, null));
        context.getClass();
        f11400f.getClass();
    }
}
