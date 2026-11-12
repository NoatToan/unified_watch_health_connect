package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;

/* JADX INFO: loaded from: classes3.dex */
public final class h9l extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toast f19836a;

    public final class b extends ContextWrapper {
        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "window".equals(str) ? new c((WindowManager) getBaseContext().getSystemService(str)) : super.getSystemService(str);
        }

        public b(Context context) {
            super(context);
        }
    }

    public final class c implements WindowManager {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowManager f19838a;

        @Override // android.view.ViewManager
        public void addView(View view, ViewGroup.LayoutParams layoutParams) {
            try {
                this.f19838a.addView(view, layoutParams);
            } catch (WindowManager.BadTokenException e) {
                e.getMessage();
                h9l.a(h9l.this);
            } catch (Throwable unused) {
            }
        }

        @Override // android.view.WindowManager
        public Display getDefaultDisplay() {
            return this.f19838a.getDefaultDisplay();
        }

        @Override // android.view.ViewManager
        public void removeView(View view) {
            this.f19838a.removeView(view);
        }

        @Override // android.view.WindowManager
        public void removeViewImmediate(View view) {
            this.f19838a.removeViewImmediate(view);
        }

        @Override // android.view.ViewManager
        public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
            this.f19838a.updateViewLayout(view, layoutParams);
        }

        public c(WindowManager windowManager) {
            this.f19838a = windowManager;
        }
    }

    public h9l(Context context, Toast toast) {
        super(context);
        this.f19836a = toast;
    }

    public static /* synthetic */ mx1 a(h9l h9lVar) {
        h9lVar.getClass();
        return null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        return new b(getBaseContext().getApplicationContext());
    }
}
