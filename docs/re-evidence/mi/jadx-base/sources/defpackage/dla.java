package defpackage;

import android.view.View;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.fragment.app.Fragment;
import androidx.transition.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class dla {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fla f15651a = new ela();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fla f15652b = c();

    public static void a(Fragment fragment, Fragment fragment2, boolean z, ArrayMap<String, View> arrayMap, boolean z2) {
        SharedElementCallback enterTransitionCallback = z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = arrayMap == null ? 0 : arrayMap.getSize();
            for (int i = 0; i < size; i++) {
                arrayList2.add(arrayMap.keyAt(i));
                arrayList.add(arrayMap.valueAt(i));
            }
            if (z2) {
                enterTransitionCallback.g(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.f(arrayList2, arrayList, null);
            }
        }
    }

    public static String b(ArrayMap<String, String> arrayMap, String str) {
        int size = arrayMap.getSize();
        for (int i = 0; i < size; i++) {
            if (str.equals(arrayMap.valueAt(i))) {
                return arrayMap.keyAt(i);
            }
        }
        return null;
    }

    public static fla c() {
        try {
            return (fla) a.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void d(ArrayMap<String, String> arrayMap, ArrayMap<String, View> arrayMap2) {
        for (int size = arrayMap.getSize() - 1; size >= 0; size--) {
            if (!arrayMap2.containsKey(arrayMap.valueAt(size))) {
                arrayMap.removeAt(size);
            }
        }
    }

    public static void e(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    public static boolean f() {
        return (f15651a == null && f15652b == null) ? false : true;
    }
}
