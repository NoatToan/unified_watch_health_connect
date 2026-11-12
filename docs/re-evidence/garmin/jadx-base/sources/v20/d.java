package v20;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.e;
import androidx.fragment.app.i;
import java.util.ArrayList;
import pk1.t;

/* JADX INFO: loaded from: classes8.dex */
public class d extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f175290b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.firebase.remoteconfig.internal.b f175291a;

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        int i14;
        String[] strArr;
        String string;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("EXTRA_TITLE");
            i14 = arguments.getInt("EXTRA_SELECTED_INDEX");
            ArrayList<String> stringArrayList = arguments.getStringArrayList("EXTRA_CHOICE_LIST");
            strArr = stringArrayList != null ? (String[]) stringArrayList.toArray(new String[stringArrayList.size()]) : null;
        } else {
            i14 = 0;
            strArr = null;
            string = null;
        }
        e.a aVar = new e.a(requireActivity());
        aVar.setTitle(string).setSingleChoiceItems(strArr, i14, new t(this, strArr));
        if (!TextUtils.isEmpty(null)) {
            aVar.setNegativeButton((CharSequence) null, (DialogInterface.OnClickListener) null);
        }
        return aVar.create();
    }
}
