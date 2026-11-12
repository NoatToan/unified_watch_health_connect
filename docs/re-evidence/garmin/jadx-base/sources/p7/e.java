package p7;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import k7.h;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    public static class a {
        private a() {
        }

        public static void a(TextView textView, int i14, float f14) {
            textView.setLineHeight(i14, f14);
        }
    }

    public static class b implements ActionMode.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f136295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f136296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Class<?> f136297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Method f136298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f136299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f136300f = false;

        public b(ActionMode.Callback callback, TextView textView) {
            this.f136295a = callback;
            this.f136296b = textView;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f136295a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f136295a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f136295a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            String str;
            TextView textView = this.f136296b;
            Context context = textView.getContext();
            PackageManager packageManager = context.getPackageManager();
            boolean z14 = this.f136300f;
            Class cls = Integer.TYPE;
            if (!z14) {
                this.f136300f = true;
                try {
                    Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f136297c = cls2;
                    this.f136298d = cls2.getDeclaredMethod("removeItemAt", cls);
                    this.f136299e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f136297c = null;
                    this.f136298d = null;
                    this.f136299e = false;
                }
            }
            try {
                Method declaredMethod = (this.f136299e && this.f136297c.isInstance(menu)) ? this.f136298d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (context instanceof Activity) {
                    for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                        if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            }
                        }
                        arrayList.add(resolveInfo);
                    }
                }
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i14);
                    MenuItem menuItemAdd = menu.add(0, 0, i14 + 100, resolveInfo2.loadLabel(packageManager));
                    Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                    ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                    menuItemAdd.setIntent(intentPutExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
            return this.f136295a.onPrepareActionMode(actionMode, menu);
        }
    }

    private e() {
    }

    public static void a(TextView textView, int i14) {
        h.d(i14);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i14 != fontMetricsInt) {
            textView.setLineSpacing(i14 - fontMetricsInt, 1.0f);
        }
    }

    public static void b(AppCompatTextView appCompatTextView, j7.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Spannable spannable = bVar.f97446a;
            appCompatTextView.setText(spannable instanceof PrecomputedText ? (PrecomputedText) spannable : null);
        } else if (new j7.b.a(appCompatTextView.getTextMetricsParams()).a(bVar.f97447b)) {
            appCompatTextView.setText(bVar);
        } else {
            vb.h.s("Given text can not be applied to TextView.");
        }
    }

    public static ActionMode.Callback c(ActionMode.Callback callback) {
        return callback instanceof b ? ((b) callback).f136295a : callback;
    }
}
