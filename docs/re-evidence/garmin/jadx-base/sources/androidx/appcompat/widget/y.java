package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5278a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f5279b = -1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f5280c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f5281d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f5282e = new int[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5283f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f5284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f5285h;

    public static class a extends c {
    }

    public static class b extends a {
    }

    public static class c {
    }

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public y(TextView textView) {
        this.f5284g = textView;
        this.f5285h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            new b();
        } else {
            new a();
        }
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i14 : iArr) {
                if (i14 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i14)) < 0) {
                    arrayList.add(Integer.valueOf(i14));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i15 = 0; i15 < size; i15++) {
                    iArr2[i15] = ((Integer) arrayList.get(i15)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final boolean b() {
        return !(this.f5284g instanceof AppCompatEditText);
    }
}
