package y40;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ly40/q;", "Landroidx/fragment/app/i;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends androidx.fragment.app.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f194465b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x40.g f194466a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y40/q$b", "Landroid/text/TextWatcher;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Button f194467a;

        public b(Button button) {
            this.f194467a = button;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            CharSequence charSequenceI0 = editable != null ? w.i0(editable) : null;
            this.f194467a.setEnabled(!(charSequenceI0 == null || charSequenceI0.length() == 0));
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }
    }

    @Override // androidx.fragment.app.i
    @SuppressLint({"InflateParams", "ClickableViewAccessibility"})
    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("EXTRA_COURSE_NAME", "") : null;
        String str = string != null ? string : "";
        Bundle arguments2 = getArguments();
        boolean z14 = arguments2 != null ? arguments2.getBoolean("EXTRA_IS_COURSE_PUBLIC", false) : false;
        Bundle arguments3 = getArguments();
        boolean z15 = arguments3 != null ? arguments3.getBoolean("EXTRA_CAN_COURSE_BE_PUBLIC", true) : true;
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.save_custom_course_dialog, (ViewGroup) null);
        EditText editText = (EditText) viewInflate.findViewById(R.id.course_name_et);
        RadioButton radioButton = (RadioButton) viewInflate.findViewById(R.id.btn_private);
        RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(R.id.btn_public);
        Button button = (Button) viewInflate.findViewById(R.id.btn_save);
        editText.addTextChangedListener(new b(button));
        editText.setText(str);
        radioButton2.setVisibility(z15 ? 0 : 8);
        if (z14 && z15) {
            radioButton2.setChecked(true);
        } else {
            radioButton.setChecked(true);
        }
        if (s3.b()) {
            radioButton2.setOnClickListener(new wv2.h(11, this, radioButton));
        }
        button.setOnClickListener(new ty0.a(this, 10, editText, radioButton2));
        Dialog dialog = new Dialog(requireContext(), R.style.GCMInfoDialogStyle);
        dialog.setContentView(viewInflate);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return dialog;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Ly40/q$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_COURSE_NAME_KEY", "EXTRA_IS_COURSE_PUBLIC_KEY", "EXTRA_CAN_COURSE_BE_PUBLIC", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
