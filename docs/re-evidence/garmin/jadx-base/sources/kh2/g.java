package kh2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.Window;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkh2/g;", "", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f104792a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hi2.d f104793b = new hi2.d("UserDialogsHelper", null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static AlertDialog f104794c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkh2/g$a;", "", "<init>", "()V", "Landroid/app/Dialog;", "dialog", "Landroid/app/Dialog;", "Lhi2/d;", "logger", "Lhi2/d;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: kh2.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class C2005a extends w implements p<DialogInterface, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l<Boolean, Unit> f104795a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2005a(l<? super Boolean, Unit> lVar) {
                super(2);
                this.f104795a = lVar;
            }

            @Override // e23.p
            public final Unit invoke(DialogInterface dialogInterface, Integer num) {
                num.intValue();
                dialogInterface.getClass();
                this.f104795a.invoke(Boolean.FALSE);
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class b extends w implements p<DialogInterface, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l<Boolean, Unit> f104796a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(l<? super Boolean, Unit> lVar) {
                super(2);
                this.f104796a = lVar;
            }

            @Override // e23.p
            public final Unit invoke(DialogInterface dialogInterface, Integer num) {
                num.intValue();
                dialogInterface.getClass();
                this.f104796a.invoke(Boolean.TRUE);
                return Unit.INSTANCE;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Dialog a(a aVar, Context context, String str, String str2, o13.p pVar, o13.p pVar2, int i14) {
            if ((i14 & 2) != 0) {
                str = null;
            }
            if ((i14 & 16) != 0) {
                pVar2 = null;
            }
            aVar.getClass();
            context.getClass();
            zh2.e.f204807a.getClass();
            zh2.e.a();
            AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, R.style.DSLBaseDialogStyleWithDefaultButton));
            if (str != null) {
                builder.setTitle(str);
            }
            if (str2 != null) {
                builder.setMessage(str2);
            }
            builder.setPositiveButton((CharSequence) pVar.f128594a, new br2.b((p) pVar.f128595b, 10));
            if (pVar2 != null) {
                builder.setNegativeButton((CharSequence) pVar2.f128594a, new br2.b((p) pVar2.f128595b, 11));
            }
            AlertDialog alertDialogCreate = builder.create();
            alertDialogCreate.setCanceledOnTouchOutside(false);
            return alertDialogCreate;
        }

        public static void b() {
            AlertDialog alertDialog = g.f104794c;
            if (alertDialog != null) {
                alertDialog.cancel();
            }
        }

        public static void c(Dialog dialog, Context context) {
            context.getClass();
            if (context instanceof com.garmin.androiddynamicsettings.app.presentationlayer.b) {
                ((com.garmin.androiddynamicsettings.app.presentationlayer.b) context).f50693e.a(dialog);
            } else {
                g.f104793b.getClass();
                dialog.show();
            }
        }

        public static void e(Context context) {
            context.getClass();
            zh2.e.f204807a.getClass();
            int i14 = zh2.e.f204812f.f204814a;
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            if (i14 > 0) {
                builder.setView(i14);
            } else {
                builder.setView(R.layout.dsl_loading_view);
            }
            a aVar = g.f104792a;
            AlertDialog alertDialogCreate = builder.create();
            g.f104794c = alertDialogCreate;
            if (alertDialogCreate != null) {
                Window window = alertDialogCreate.getWindow();
                if (window != null) {
                    window.setBackgroundDrawableResource(android.R.color.transparent);
                }
                alertDialogCreate.setCancelable(false);
                alertDialogCreate.setCanceledOnTouchOutside(false);
                g.f104792a.getClass();
                c(alertDialogCreate, context);
            }
        }

        public final void d(Context context, l<? super Boolean, Unit> lVar) {
            zh2.e.f204807a.getClass();
            if (!zh2.e.f204812f.f204820g) {
                lVar.invoke(Boolean.TRUE);
                return;
            }
            String string = context.getString(R.string.leave_without_saving);
            String strD = p6.b.d(context, R.string.have_not_saved_changes, string);
            String string2 = context.getString(R.string.stay);
            string2.getClass();
            o13.p pVar = new o13.p(string2, new C2005a(lVar));
            String string3 = context.getString(R.string.lbl_leave);
            string3.getClass();
            c(a(this, context, string, strD, pVar, new o13.p(string3, new b(lVar)), 480), context);
        }

        private a() {
        }
    }
}
