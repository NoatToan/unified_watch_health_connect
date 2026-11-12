package com.huawei.agconnect.apms;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseIntArray;
import com.huawei.agconnect.apms.collect.model.event.interaction.ActivityRenderEvent;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class ghi extends u0 implements Application.ActivityLifecycleCallbacks {
    public static abc bcd = new abc();
    public static bcd cde = new bcd();

    public final class abc implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            vwx vwxVarAbc = vwx.abc();
            vwxVarAbc.getClass();
            vwxVarAbc.abc.execute(new tuv(vwxVarAbc));
        }
    }

    public final class bcd implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            vwx vwxVarAbc = vwx.abc();
            vwxVarAbc.getClass();
            vwxVarAbc.abc.execute(new uvw(vwxVarAbc));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        pqr pqrVarAbc = pqr.abc();
        pqrVarAbc.getClass();
        pqrVarAbc.fgh = System.currentTimeMillis();
        pqrVarAbc.abc = !vwx.abc().cde.get();
        x xVarAbc = x.abc();
        xVarAbc.getClass();
        xVarAbc.jkl = System.currentTimeMillis();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        pqr pqrVarAbc = pqr.abc();
        pqrVarAbc.getClass();
        pqrVarAbc.ghi = System.currentTimeMillis();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        pqr.abc().abc(weakReference);
        x.abc().bcd(weakReference);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        pqr pqrVarAbc = pqr.abc();
        pqrVarAbc.getClass();
        pqrVarAbc.efg = System.currentTimeMillis();
        x xVarAbc = x.abc();
        xVarAbc.getClass();
        xVarAbc.ijk = System.currentTimeMillis();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
        x xVarAbc = x.abc();
        xVarAbc.getClass();
        xVarAbc.fgh = System.currentTimeMillis();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        pqr.abc().bcd(weakReference);
        x.abc().abc(weakReference);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        WeakReference weakReference = new WeakReference(activity);
        x xVarAbc = x.abc();
        if (xVarAbc.abc == null) {
            x.lmn.warn("can not get frame metrics with null frame metrics aggregator.");
        } else if (!Agent.isDisabled() && weakReference.get() != null) {
            Activity activity2 = (Activity) weakReference.get();
            if (activity2.getWindow() != null && (activity2.getWindow().getAttributes().flags & 16777216) != 0) {
                xVarAbc.bcd.put(activity2, Long.valueOf(System.currentTimeMillis()));
                xVarAbc.abc.abc.abc(activity2);
            }
        }
        this.abc.submit(bcd);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        SparseIntArray[] sparseIntArrayArrBcd;
        int i;
        int i2;
        int i3;
        WeakReference weakReference = new WeakReference(activity);
        x xVarAbc = x.abc();
        if (xVarAbc.abc == null) {
            x.lmn.warn("can not get frame metrics, because the android support library is not included.");
        } else if (weakReference.get() != null) {
            Activity activity2 = (Activity) weakReference.get();
            String simpleName = activity2.getClass().getSimpleName().length() != 0 ? activity2.getClass().getSimpleName() : "";
            if (activity2.getWindow() != null && (activity2.getWindow().getAttributes().flags & 16777216) != 0 && xVarAbc.bcd.containsKey(activity2)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Long l = xVarAbc.bcd.get(activity2);
                if (l != null) {
                    xVarAbc.bcd.remove(activity2);
                    try {
                        sparseIntArrayArrBcd = xVarAbc.abc.abc.bcd(activity2);
                    } catch (Exception unused) {
                        x.lmn.warn(String.format(Locale.ENGLISH, "view not hardware accelerated, can not remove %s from frameMetricsAggregator.", simpleName));
                        sparseIntArrayArrBcd = null;
                    }
                    if (!Agent.isDisabled()) {
                        int i4 = 0;
                        if (sparseIntArrayArrBcd == null || sparseIntArrayArrBcd.length == 0) {
                            i = 0;
                            i2 = 0;
                        } else {
                            SparseIntArray sparseIntArray = sparseIntArrayArrBcd[0];
                            int i5 = 0;
                            if (sparseIntArray != null) {
                                int i6 = 0;
                                i3 = 0;
                                while (i4 < sparseIntArray.size()) {
                                    int iKeyAt = sparseIntArray.keyAt(i4);
                                    int iValueAt = sparseIntArray.valueAt(i4);
                                    i3 += iValueAt;
                                    if (iKeyAt > 700) {
                                        i5 += iValueAt;
                                    }
                                    if (iKeyAt > 16) {
                                        i6 += iValueAt;
                                    }
                                    i4++;
                                }
                                i4 = i6;
                            } else {
                                i3 = 0;
                            }
                            int i7 = xVarAbc.cde;
                            i = i4 - xVarAbc.def;
                            i2 = i5 - xVarAbc.efg;
                            xVarAbc.cde = i3;
                            xVarAbc.def = i4;
                            xVarAbc.efg = i5;
                            i4 = i3 - i7;
                        }
                        if (i4 == 0) {
                            x.lmn.warn(String.format(Locale.ENGLISH, "frame aggregator currentTotalFrames is 0， %s does not refresh any frames.", simpleName));
                        } else {
                            pon.cde.add(new ActivityRenderEvent(l.longValue(), simpleName, jCurrentTimeMillis - l.longValue(), i, i2, i4));
                        }
                    }
                }
            }
        }
        this.abc.submit(cde);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
