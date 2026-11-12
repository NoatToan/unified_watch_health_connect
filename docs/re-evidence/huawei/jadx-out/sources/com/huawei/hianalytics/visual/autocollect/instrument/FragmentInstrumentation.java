package com.huawei.hianalytics.visual.autocollect.instrument;

import android.os.Bundle;
import android.view.View;
import com.huawei.hianalytics.visual.t;
import com.huawei.hianalytics.visual.y;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes33.dex */
public class FragmentInstrumentation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f11622a = new CopyOnWriteArraySet();

    public static void addHAFragmentCallbacks(y yVar) {
        f11622a.add(yVar);
    }

    public static void onHiddenChangedByFragment(Object obj, boolean z) {
        if (t.e(obj)) {
            Iterator it = f11622a.iterator();
            while (it.hasNext()) {
                ((y) it.next()).a(obj, z);
            }
        }
    }

    public static void onPauseByFragment(Object obj) {
        if (t.e(obj)) {
            Iterator it = f11622a.iterator();
            while (it.hasNext()) {
                ((y) it.next()).b(obj);
            }
        }
    }

    public static void onResumeByFragment(Object obj) {
        if (t.e(obj)) {
            Iterator it = f11622a.iterator();
            while (it.hasNext()) {
                ((y) it.next()).a(obj);
            }
        }
    }

    public static void onViewCreatedByFragment(Object obj, View view, Bundle bundle) {
        if (t.e(obj)) {
            Iterator it = f11622a.iterator();
            while (it.hasNext()) {
                ((y) it.next()).a(view, obj);
            }
        }
    }

    public static void removeHAFragmentCallbacks(y yVar) {
        f11622a.remove(yVar);
    }

    public static void setUserVisibleHintByFragment(Object obj, boolean z) {
        if (t.e(obj)) {
            Iterator it = f11622a.iterator();
            while (it.hasNext()) {
                ((y) it.next()).b(obj, z);
            }
        }
    }
}
