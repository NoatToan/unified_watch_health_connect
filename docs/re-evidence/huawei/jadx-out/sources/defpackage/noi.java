package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes3.dex */
public class noi extends AlertDialog {
    @Override // android.app.AlertDialog
    public void setView(View view) {
        super.setView(view);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        a(true);
        try {
            super.onBackPressed();
        } catch (Exception unused) {
            nox.a("CustomAlertDialog", "catch Exception", true);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean onSearchRequested() {
        a(true);
        return super.onSearchRequested();
    }

    public void a(final boolean z) {
        try {
            AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: noi.2
                @Override // java.security.PrivilegedAction
                public Object run() {
                    try {
                        nox.b("CustomAlertDialog", "Brand:" + Build.MANUFACTURER + "Type:" + Build.MODEL, true);
                        Class<?> superclass = noi.this.getClass();
                        int i = 0;
                        while (!superclass.getName().equals("android.app.Dialog") && i < 10) {
                            superclass = superclass.getSuperclass();
                            i++;
                            nox.b("CustomAlertDialog", "Super Class:" + superclass.getName() + " Index:" + i, true);
                        }
                        Field declaredField = superclass.getDeclaredField("mShowing");
                        declaredField.setAccessible(true);
                        declaredField.set(noi.this, Boolean.valueOf(z));
                        if (!z) {
                            return null;
                        }
                        noi.this.dismiss();
                        return null;
                    } catch (RuntimeException e) {
                        nox.a("CustomAlertDialog", "RuntimeException: " + e.getClass().getSimpleName(), true);
                        return null;
                    } catch (Exception e2) {
                        nox.a("CustomAlertDialog", "Exception: " + e2.getClass().getSimpleName(), true);
                        return null;
                    }
                }
            });
        } catch (Exception e) {
            nox.a("CustomAlertDialog", "Exception: " + e.getClass().getSimpleName(), true);
        }
    }

    public static class d extends AlertDialog.Builder {
        public d(Context context, int i) {
            super(context, i);
        }
    }
}
