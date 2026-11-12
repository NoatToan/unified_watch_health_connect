package bi2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.Window;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.androiddynamicsettings.app.onclickviews.BaseNumberInputDialog$showDialog$1", f = "BaseNumberInputDialog.kt", l = {111, 122}, m = "invokeSuspend")
public final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public KeyEvent.Callback f18127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StyledTextView f18128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f18130d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f18130d = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f18130d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ab  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        StyledTextView styledTextView;
        AlertDialog alertDialog;
        Window window;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18129c;
        f fVar = this.f18130d;
        if (i14 == 0) {
            o13.r.b(obj);
            fVar.getF18286p().getClass();
            fVar.f18146k.setVisibility(fVar.getF18257r() ? 0 : 8);
            fVar.j();
            fVar.k();
            styledTextView = fVar.f18145j;
            styledTextView.setVisibility(fVar.getF18290t() ? 0 : 8);
            this.f18127a = styledTextView;
            this.f18128b = styledTextView;
            this.f18129c = 1;
            obj = fVar.e(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            styledTextView = this.f18128b;
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            alertDialog = (AlertDialog) this.f18127a;
            o13.r.b(obj);
        }
        window = alertDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
        alertDialog.setOnShowListener(new d(alertDialog, fVar, 0));
        kh2.g.a aVar2 = kh2.g.f104792a;
        Context context = fVar.f18136a;
        aVar2.getClass();
        kh2.g.a.c(alertDialog, context);
        return Unit.INSTANCE;
        styledTextView.setText((CharSequence) obj);
        Context context2 = fVar.f18136a;
        Context context3 = fVar.f18136a;
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context2, R.style.DSLBaseDialogStyle).setPositiveButton(context3.getString(R.string.lbl_done), (DialogInterface.OnClickListener) null).setNegativeButton(context3.getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).setView(fVar.f18141f).create();
        alertDialogCreate.getClass();
        this.f18127a = alertDialogCreate;
        this.f18128b = null;
        this.f18129c = 2;
        if (f.i(fVar, alertDialogCreate, this) != aVar) {
            alertDialog = alertDialogCreate;
            window = alertDialog.getWindow();
            if (window != null) {
                window.setSoftInputMode(4);
            }
            alertDialog.setOnShowListener(new d(alertDialog, fVar, 0));
            kh2.g.a aVar3 = kh2.g.f104792a;
            Context context4 = fVar.f18136a;
            aVar3.getClass();
            kh2.g.a.c(alertDialog, context4);
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
