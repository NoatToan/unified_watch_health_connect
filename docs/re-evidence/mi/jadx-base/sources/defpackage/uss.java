package defpackage;

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

/* JADX INFO: loaded from: classes4.dex */
public final class uss extends ContextThemeWrapper {
    public static final String[] f = {"android.widget", "android.webkit", "android.app"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Resources f36099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f36100b;
    public ClassLoader c;
    public b d;
    public LayoutInflater.Factory e;

    public class a implements LayoutInflater.Factory {
        public a() {
        }

        @Override // android.view.LayoutInflater.Factory
        public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return uss.this.b(str, context, attributeSet);
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HashSet<String> f36102a = new HashSet<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HashMap<String, Constructor<?>> f36103b = new HashMap<>();

        public b() {
        }
    }

    public uss(Context context, int i, ClassLoader classLoader) {
        super(context, i);
        this.d = new b();
        this.e = new a();
        this.f36099a = xss.b();
        this.c = classLoader;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[PHI: r4
      0x0062: PHI (r4v1 java.lang.Class<?>) = 
      (r4v0 java.lang.Class<?>)
      (r4v10 java.lang.Class<?>)
      (r4v10 java.lang.Class<?>)
      (r4v10 java.lang.Class<?>)
      (r4v10 java.lang.Class<?>)
     binds: [B:27:0x0064, B:18:0x0050, B:21:0x0055, B:37:0x0062, B:23:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    public final View b(String str, Context context, AttributeSet attributeSet) {
        Class<?> clsLoadClass;
        boolean z;
        if (this.d.f36102a.contains(str)) {
            return null;
        }
        Constructor<?> constructor = this.d.f36103b.get(str);
        if (constructor == null) {
            try {
                if (!str.contains("api.navi")) {
                    String[] strArr = f;
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            clsLoadClass = null;
                            break;
                        }
                        String str2 = strArr[i];
                        try {
                            clsLoadClass = this.c.loadClass(str2 + "." + str);
                            break;
                        } catch (Throwable unused) {
                            i++;
                        }
                    }
                } else {
                    clsLoadClass = this.c.loadClass(str);
                }
                if (clsLoadClass == null || clsLoadClass == ViewStub.class) {
                    z = false;
                } else {
                    try {
                        if (clsLoadClass.getClassLoader() != this.c) {
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
                this.d.f36102a.add(str);
                return null;
            }
            try {
                constructor = clsLoadClass.getConstructor(Context.class, AttributeSet.class);
                this.d.f36103b.put(str, constructor);
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

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Resources resources = this.f36099a;
        return resources != null ? resources : super.getResources();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        if (this.f36100b == null) {
            LayoutInflater layoutInflater = (LayoutInflater) super.getSystemService(str);
            if (layoutInflater != null) {
                this.f36100b = layoutInflater.cloneInContext(this);
            }
            this.f36100b.setFactory(this.e);
            this.f36100b = this.f36100b.cloneInContext(this);
        }
        return this.f36100b;
    }
}
