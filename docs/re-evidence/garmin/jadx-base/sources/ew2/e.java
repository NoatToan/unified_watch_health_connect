package ew2;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import cx2.h;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lew2/e;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f66901a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f66902b = new h("UserDialogsHelper", null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static AlertDialog f66903c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lew2/e$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "Landroid/app/Dialog;", "dialog", "Landroid/app/Dialog;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Dialog a(a aVar, Context context, String str, String str2, p pVar, p pVar2, int i14) {
            if ((i14 & 2) != 0) {
                str = null;
            }
            if ((i14 & 16) != 0) {
                pVar2 = null;
            }
            int i15 = (i14 & 512) != 0 ? R.style.RTSBaseDialogStyleWithDefaultButton : R.style.Theme_Gcm_Dialog;
            aVar.getClass();
            context.getClass();
            com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
            com.garmin.realtimesettings.app.initialization.b.a();
            AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, i15));
            if (str != null) {
                builder.setTitle(str);
            }
            if (str2 != null) {
                builder.setMessage(str2);
            }
            builder.setPositiveButton((CharSequence) pVar.f128594a, new br2.b((e23.p) pVar.f128595b, 8));
            if (pVar2 != null) {
                builder.setNegativeButton((CharSequence) pVar2.f128594a, new br2.b((e23.p) pVar2.f128595b, 9));
            }
            AlertDialog alertDialogCreate = builder.create();
            alertDialogCreate.setCanceledOnTouchOutside(false);
            alertDialogCreate.setCancelable(false);
            return alertDialogCreate;
        }

        public static void b(Dialog dialog, Context context) {
            context.getClass();
            h hVar = e.f66902b;
            hVar.getClass();
            if (context instanceof com.garmin.realtimesettings.app.presentationlayer.a) {
                ((com.garmin.realtimesettings.app.presentationlayer.a) context).f52610d.a((Activity) context, dialog);
            } else {
                hVar.d(null, "Cannot display dialog with an unsupported context. This will cause a window leak if the dialog is not cleaned up before its host is destroyed.");
            }
        }

        public static void c(Context context) {
            com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
            int i14 = com.garmin.realtimesettings.app.initialization.b.c().f192454b.f192458a;
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            if (i14 > 0) {
                builder.setView(i14);
            } else {
                builder.setView(R.layout.rts_loading_view);
            }
            a aVar = e.f66901a;
            AlertDialog alertDialogCreate = builder.create();
            e.f66903c = alertDialogCreate;
            if (alertDialogCreate != null) {
                Window window = alertDialogCreate.getWindow();
                if (window != null) {
                    window.setBackgroundDrawableResource(android.R.color.transparent);
                }
                alertDialogCreate.setCancelable(false);
                alertDialogCreate.setCanceledOnTouchOutside(false);
                e.f66901a.getClass();
                b(alertDialogCreate, context);
            }
        }

        public static void d(a aVar, m mVar, String str) {
            aVar.getClass();
            LayoutInflater layoutInflater = mVar.getLayoutInflater();
            layoutInflater.getClass();
            View viewInflate = layoutInflater.inflate(R.layout.rts_toast_with_snackbar_theme, (ViewGroup) mVar.findViewById(R.id.custom_toast_layout_id));
            ((StyledTextView) viewInflate.findViewById(R.id.toast_text)).setText(str);
            Toast toast = new Toast(mVar);
            toast.setDuration(0);
            toast.setView(viewInflate);
            toast.show();
        }

        private a() {
        }
    }
}
