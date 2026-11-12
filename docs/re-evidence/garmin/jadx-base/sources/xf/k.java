package xf;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes7.dex */
public interface k<T extends View> extends h {
    static a d(int i14, int i15, int i16) {
        if (i14 == -2) {
            return a.b.f190608a;
        }
        int i17 = i14 - i16;
        if (i17 > 0) {
            b.a(i17);
            return a.C3547a.a(i17);
        }
        int i18 = i15 - i16;
        if (i18 <= 0) {
            return null;
        }
        b.a(i18);
        return a.C3547a.a(i18);
    }

    @Override // xf.h
    default Object a(t13.d<? super g> dVar) throws Throwable {
        g size = getSize();
        if (size != null) {
            return size;
        }
        o53.k kVar = new o53.k(u13.f.b(dVar), 1);
        kVar.q();
        ViewTreeObserver viewTreeObserver = getView().getViewTreeObserver();
        j jVar = new j(this, viewTreeObserver, kVar);
        viewTreeObserver.addOnPreDrawListener(jVar);
        kVar.r(new i(this, viewTreeObserver, jVar));
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    default void b(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    default boolean c() {
        return true;
    }

    default g getSize() {
        int paddingRight;
        int paddingBottom;
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        int i14 = layoutParams != null ? layoutParams.width : -1;
        int width = getView().getWidth();
        if (c()) {
            paddingRight = getView().getPaddingRight() + getView().getPaddingLeft();
        } else {
            paddingRight = 0;
        }
        a aVarD = d(i14, width, paddingRight);
        if (aVarD == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = getView().getLayoutParams();
        int i15 = layoutParams2 != null ? layoutParams2.height : -1;
        int height = getView().getHeight();
        if (c()) {
            paddingBottom = getView().getPaddingBottom() + getView().getPaddingTop();
        } else {
            paddingBottom = 0;
        }
        a aVarD2 = d(i15, height, paddingBottom);
        if (aVarD2 == null) {
            return null;
        }
        return new g(aVarD, aVarD2);
    }

    T getView();
}
