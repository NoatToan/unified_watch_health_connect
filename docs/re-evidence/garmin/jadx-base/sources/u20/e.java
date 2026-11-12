package u20;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.core.view.j;
import androidx.fragment.app.i;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public class e extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DialogInterface.OnClickListener f167882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public af2.b f167883b;

    public static e u6(int i14, int i15) {
        e eVar = new e();
        Bundle bundle = new Bundle();
        bundle.putInt("title_res", i14);
        bundle.putInt("string_res", i15);
        eVar.setArguments(bundle);
        return eVar;
    }

    public static e v6(String str, String str2) {
        e eVar = new e();
        Bundle bundle = new Bundle();
        bundle.putString("title_string", str);
        bundle.putString("message_string", str2);
        eVar.setArguments(bundle);
        return eVar;
    }

    public final void g(v vVar) {
        androidx.fragment.app.a aVarB = j.b(vVar, vVar);
        aVarB.j(0, this, "ErrorDialogFragment", 1);
        aVarB.s(true, true);
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        int i14;
        String string;
        String string2;
        Bundle arguments = getArguments();
        String string3 = null;
        int i15 = -1;
        if (arguments != null) {
            string = arguments.getString("title_string", null);
            string2 = arguments.getString("message_string", null);
            i14 = arguments.getInt("string_res");
            i15 = arguments.getInt("title_res", -1);
        } else {
            i14 = R.string.no_value;
            string = null;
            string2 = null;
        }
        if (string != null) {
            string3 = string;
        } else if (i15 > 0) {
            string3 = getString(i15);
        }
        if (string2 == null) {
            string2 = getString(i14);
        }
        return new androidx.appcompat.app.e.a(getActivity()).setMessage(string2).setTitle(string3).setPositiveButton(android.R.string.ok, this.f167882a).create();
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        af2.b bVar = this.f167883b;
        if (bVar != null) {
            bVar.onDismiss(dialogInterface);
        }
    }
}
