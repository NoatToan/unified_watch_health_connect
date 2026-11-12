package bi2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements View.OnKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f18100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Dialog f18102d;

    public /* synthetic */ a(Object obj, EditText editText, Dialog dialog, int i14) {
        this.f18099a = i14;
        this.f18101c = obj;
        this.f18100b = editText;
        this.f18102d = dialog;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view2, int i14, KeyEvent keyEvent) {
        switch (this.f18099a) {
            case 0:
                f fVar = (f) this.f18101c;
                EditText editText = this.f18100b;
                editText.getClass();
                Dialog dialog = this.f18102d;
                dialog.getClass();
                if (i14 != 66 || !fVar.m(editText.getText())) {
                    return false;
                }
                fVar.f18137b.n(fVar.f18138c, fVar.f18139d, fVar.f18144i.getText());
                dialog.dismiss();
                return true;
            default:
                iv2.g gVar = (iv2.g) this.f18101c;
                AlertDialog alertDialog = (AlertDialog) this.f18102d;
                if (i14 != 66 || !gVar.a(this.f18100b.getText())) {
                    return false;
                }
                iv2.e eVar = gVar.f95234b;
                dx2.c cVar = gVar.f95235c;
                Map<String, Object> map = gVar.f95236d;
                EditText editText2 = gVar.f95239g;
                if (editText2 == null) {
                    p005kotlin.jvm.internal.s.m("inputField");
                    throw null;
                }
                eVar.h(cVar, map, editText2.getText());
                alertDialog.dismiss();
                return true;
        }
    }
}
