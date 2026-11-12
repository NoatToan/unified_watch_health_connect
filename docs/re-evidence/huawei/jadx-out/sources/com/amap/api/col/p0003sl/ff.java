package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes21.dex */
public final class ff extends ContextThemeWrapper {
    private static final String[] d = {"android.widget", "android.webkit", "android.app"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Resources f2522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LayoutInflater f2523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ClassLoader f2524c;
    private a e;
    private LayoutInflater.Factory f;

    public ff(Context context, int i, ClassLoader classLoader) {
        super(context, i);
        this.e = new a();
        this.f = new LayoutInflater.Factory() { // from class: com.amap.api.col.3sl.ff.1
            @Override // android.view.LayoutInflater.Factory
            public final View onCreateView(String str, Context context2, AttributeSet attributeSet) {
                return ff.this.a(str, context2, attributeSet);
            }
        };
        this.f2522a = fg.a();
        this.f2524c = classLoader;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Resources resources = this.f2522a;
        return resources != null ? resources : super.getResources();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f2523b == null) {
                LayoutInflater layoutInflater = (LayoutInflater) super.getSystemService(str);
                if (layoutInflater != null) {
                    this.f2523b = layoutInflater.cloneInContext(this);
                }
                this.f2523b.setFactory(this.f);
                this.f2523b = this.f2523b.cloneInContext(this);
            }
            return this.f2523b;
        }
        return super.getSystemService(str);
    }

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HashSet<String> f2526a = new HashSet<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HashMap<String, Constructor<?>> f2527b = new HashMap<>();

        public a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0063 A[PHI: r4
      0x0063: PHI (r4v1 java.lang.Class<?>) = 
      (r4v0 java.lang.Class<?>)
      (r4v10 java.lang.Class<?>)
      (r4v10 java.lang.Class<?>)
      (r4v10 java.lang.Class<?>)
      (r4v10 java.lang.Class<?>)
     binds: [B:26:0x0062, B:18:0x0050, B:21:0x0055, B:37:0x0063, B:23:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    public final View a(String str, Context context, AttributeSet attributeSet) {
        Class<?> clsLoadClass;
        boolean z;
        if (this.e.f2526a.contains(str)) {
            return null;
        }
        Constructor<?> constructor = this.e.f2527b.get(str);
        if (constructor == null) {
            try {
                if (str.contains("api.navi")) {
                    clsLoadClass = this.f2524c.loadClass(str);
                } else {
                    String[] strArr = d;
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            clsLoadClass = null;
                            break;
                        }
                        String str2 = strArr[i];
                        try {
                            clsLoadClass = this.f2524c.loadClass(str2 + "." + str);
                            break;
                        } catch (Throwable unused) {
                            i++;
                        }
                    }
                }
                if (clsLoadClass == null || clsLoadClass == ViewStub.class) {
                    z = false;
                } else {
                    try {
                        if (clsLoadClass.getClassLoader() != this.f2524c) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable unused3) {
                clsLoadClass = null;
            }
            if (!z) {
                this.e.f2526a.add(str);
                return null;
            }
            try {
                constructor = clsLoadClass.getConstructor(Context.class, AttributeSet.class);
                this.e.f2527b.put(str, constructor);
            } catch (Throwable unused4) {
            }
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (View) constructor.newInstance(context, attributeSet);
        } catch (Throwable unused5) {
            return null;
        }
    }
}
