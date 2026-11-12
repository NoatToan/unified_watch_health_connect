package yg0;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.i;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import cw.l;

/* JADX INFO: loaded from: classes8.dex */
public class b extends i implements View.OnClickListener {
    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        l.b().getClass();
        l.a();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        Bundle bundle = new Bundle();
        int id3 = view2.getId();
        if (id3 == R.id.feedback_dialog_rate_app_btn) {
            bundle.putString("ActionType", "Rated");
            ht.a.f85464a.getClass();
            ht.a.a(bundle, "FeedbackLoop");
            zg0.a aVar = new zg0.a();
            m mVarRequireActivity = requireActivity();
            mVarRequireActivity.getClass();
            androidx.lifecycle.m.a(null, new zg0.b(aVar, mVarRequireActivity, null), 3).f(getViewLifecycleOwner(), new h10.d(3));
            l.b().getClass();
            l.c();
        } else if (id3 == R.id.feedback_dialog_remind_later_link) {
            l.b().getClass();
            l.a();
        } else if (id3 == R.id.feedback_dialog_no_thanks_link) {
            bundle.putString("DismissType", "DoNotAskMeAgain");
            ht.a.f85464a.getClass();
            ht.a.a(bundle, "FeedbackLoop");
            l.b().getClass();
            l.c();
        }
        dismiss();
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.DialogSlideAnim);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.gcm3_feedback_dialog_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || dialog.getWindow() == null) {
            return;
        }
        dialog.getWindow().setLayout(-1, -2);
        dialog.getWindow().setGravity(80);
        dialog.setCancelable(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        AppCompatButton appCompatButton = (AppCompatButton) view2.findViewById(R.id.feedback_dialog_rate_app_btn);
        TextView textView = (TextView) view2.findViewById(R.id.feedback_dialog_remind_later_link);
        TextView textView2 = (TextView) view2.findViewById(R.id.feedback_dialog_no_thanks_link);
        appCompatButton.setOnClickListener(this);
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
    }
}
