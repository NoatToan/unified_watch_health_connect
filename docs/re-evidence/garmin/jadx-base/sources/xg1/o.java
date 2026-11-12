package xg1;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lxg1/o;", "Landroidx/fragment/app/i;", "<init>", "()V", "a", "b", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends androidx.fragment.app.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f190914b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f190915a;

    public interface b {
        void a(String str);
    }

    @Override // androidx.fragment.app.i
    @SuppressLint({"InflateParams"})
    public final Dialog onCreateDialog(Bundle bundle) {
        LayoutInflater layoutInflater;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("EXTRA_TITLE") : null;
        if (string == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("EXTRA_INPUT_TEXT") : null;
        if (string2 == null) {
            string2 = "";
        }
        Bundle arguments3 = getArguments();
        String string3 = arguments3 != null ? arguments3.getString("EXTRA_HINT_TEXT") : null;
        String str = string3 != null ? string3 : "";
        Bundle arguments4 = getArguments();
        int i14 = arguments4 != null ? arguments4.getInt("EXTRA_MAX_INPUT_LENGTH", -1) : -1;
        androidx.fragment.app.m activity = getActivity();
        View viewInflate = (activity == null || (layoutInflater = activity.getLayoutInflater()) == null) ? null : layoutInflater.inflate(R.layout.gcm_dialog_text_editor, (ViewGroup) null);
        EditText editText = viewInflate != null ? (EditText) viewInflate.findViewById(R.id.dialog_edit_text) : null;
        if (editText != null) {
            editText.setText(string2);
            editText.setHint(str);
            if (i14 != -1) {
                editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i14)});
            }
            editText.requestFocus();
        }
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(requireContext()).setTitle(string).setCancelable(true).setView(viewInflate).setPositiveButton(R.string.lbl_done, new wq.c(5, this, editText)).create();
        eVarCreate.getClass();
        Window window = eVarCreate.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
        return eVarCreate;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lxg1/o$a;", "", "<init>", "()V", "", "EXTRA_TITLE", "Ljava/lang/String;", "EXTRA_INPUT_TEXT", "EXTRA_HINT_TEXT", "EXTRA_MAX_INPUT_LENGTH", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static o a(String str, String str2, String str3) {
            Bundle bundleD = tn.k.d("EXTRA_TITLE", str, "EXTRA_INPUT_TEXT", str2);
            bundleD.putString("EXTRA_HINT_TEXT", str3);
            bundleD.putInt("EXTRA_MAX_INPUT_LENGTH", -1);
            o oVar = new o();
            oVar.setArguments(bundleD);
            return oVar;
        }

        private a() {
        }
    }
}
