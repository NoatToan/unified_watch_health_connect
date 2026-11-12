package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ufp extends ContextWrapper {
    public static final Object c = new Object();
    public static ArrayList<WeakReference<ufp>> d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f35722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f35723b;

    public ufp(Context context) {
        super(context);
        if (!goq.d()) {
            this.f35722a = new wfp(this, context.getResources());
            this.f35723b = null;
            return;
        }
        goq goqVar = new goq(this, context.getResources());
        this.f35722a = goqVar;
        Resources.Theme themeNewTheme = goqVar.newTheme();
        this.f35723b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    public static boolean a(Context context) {
        if ((context instanceof ufp) || (context.getResources() instanceof wfp) || (context.getResources() instanceof goq)) {
            return false;
        }
        return goq.d();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (c) {
            try {
                ArrayList<WeakReference<ufp>> arrayList = d;
                if (arrayList == null) {
                    d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<ufp> weakReference = d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            d.remove(size);
                        }
                    }
                    for (int size2 = d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<ufp> weakReference2 = d.get(size2);
                        ufp ufpVar = weakReference2 != null ? weakReference2.get() : null;
                        if (ufpVar != null && ufpVar.getBaseContext() == context) {
                            return ufpVar;
                        }
                    }
                }
                ufp ufpVar2 = new ufp(context);
                d.add(new WeakReference<>(ufpVar2));
                return ufpVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f35722a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f35722a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f35723b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f35723b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
