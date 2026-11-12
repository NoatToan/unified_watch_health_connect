package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes15.dex */
public final class pyw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<WeakReference<LayoutInflater>> f45999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicInteger f46000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f46001c = false;
    private static final String e = "LayoutInflaterUtils";

    static {
        f46001c = Build.VERSION.SDK_INT >= 29;
        f45999a = new ThreadLocal<>();
        f46000b = new AtomicInteger();
    }

    public static LayoutInflater e(Context context) {
        LayoutInflater layoutInflater;
        ThreadLocal<WeakReference<LayoutInflater>> threadLocal = f45999a;
        WeakReference<LayoutInflater> weakReference = threadLocal.get();
        if (weakReference != null) {
            layoutInflater = weakReference.get();
            if (pyt.f45989b.isShowLog()) {
                pyt.f45989b.debug(e, "getLayoutInflater(), get cachedInflater:" + layoutInflater + ";threadId:" + Thread.currentThread().getId() + ";time:" + System.currentTimeMillis());
            }
        } else {
            layoutInflater = null;
        }
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterCloneInContext = LayoutInflater.from(context).cloneInContext(context);
        threadLocal.set(new WeakReference<>(layoutInflaterCloneInContext));
        if (pyt.f45989b.isShowLog()) {
            int iIncrementAndGet = f46000b.incrementAndGet();
            pyt.f45989b.debug(e, "getLayoutInflater(), set cachedInflater:" + layoutInflaterCloneInContext + ";threadId:" + Thread.currentThread().getId() + ";time:" + System.currentTimeMillis() + ";create count:" + iIncrementAndGet);
        }
        return layoutInflaterCloneInContext;
    }

    public static View c(LayoutInflater layoutInflater, Context context, String str, String str2, AttributeSet attributeSet) throws ClassNotFoundException {
        View viewCreateView;
        if (pyt.f45989b.isShowLog()) {
            pyt.f45989b.debug(e, "createView(), start, inflater:" + layoutInflater + ";viewContext:" + context + ";name:" + str + ";prefix:" + str2 + ";attrs:" + attributeSet + ";threadId:" + Thread.currentThread().getId() + ";time:" + System.currentTimeMillis());
        }
        if (f46001c) {
            viewCreateView = layoutInflater.createView(context, str, str2, attributeSet);
        } else {
            viewCreateView = layoutInflater.createView(str, str2, attributeSet);
        }
        if (pyt.f45989b.isShowLog()) {
            pyt.f45989b.debug(e, "createView(), end, inflater:" + layoutInflater + ";viewContext:" + context + ";name:" + str + ";prefix:" + str2 + ";attrs:" + attributeSet + ";threadId:" + Thread.currentThread().getId() + ";time:" + System.currentTimeMillis() + ";view:" + viewCreateView);
        }
        return viewCreateView;
    }
}
