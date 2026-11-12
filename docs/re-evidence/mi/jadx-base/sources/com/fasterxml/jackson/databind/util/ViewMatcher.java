package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class ViewMatcher implements Serializable {
    protected static final ViewMatcher EMPTY = new ViewMatcher();
    private static final long serialVersionUID = 1;

    public static final class a extends ViewMatcher implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?>[] f7726a;

        public a(Class<?>[] clsArr) {
            this.f7726a = clsArr;
        }

        @Override // com.fasterxml.jackson.databind.util.ViewMatcher
        public boolean isVisibleForView(Class<?> cls) {
            int length = this.f7726a.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls2 = this.f7726a[i];
                if (cls == cls2 || cls2.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class b extends ViewMatcher {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f7727a;

        public b(Class<?> cls) {
            this.f7727a = cls;
        }

        @Override // com.fasterxml.jackson.databind.util.ViewMatcher
        public boolean isVisibleForView(Class<?> cls) {
            Class<?> cls2 = this.f7727a;
            return cls == cls2 || cls2.isAssignableFrom(cls);
        }
    }

    public static ViewMatcher construct(Class<?>[] clsArr) {
        int length;
        if (clsArr != null && (length = clsArr.length) != 0) {
            return length != 1 ? new a(clsArr) : new b(clsArr[0]);
        }
        return EMPTY;
    }

    public boolean isVisibleForView(Class<?> cls) {
        return false;
    }
}
