package com.huami.assistant.ui.fragment;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.assistant.R;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;

/* JADX INFO: loaded from: classes5.dex */
public class PinOperateFragment extends Fragment {
    private DialogFragment a;
    private PinResetClickListener b;

    public interface PinResetClickListener {
        void onClick(int item);
    }

    private void c(View view) {
        view.findViewById(R.id.cancel_pin).setOnClickListener(new View.OnClickListener() { // from class: f06
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.d(view2);
            }
        });
        view.findViewById(R.id.change_pin_time).setOnClickListener(new View.OnClickListener() { // from class: g06
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.e(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        LoadingDialog.dismiss(this.a);
        PinResetClickListener pinResetClickListener = this.b;
        if (pinResetClickListener != null) {
            pinResetClickListener.onClick(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        LoadingDialog.dismiss(this.a);
        PinResetClickListener pinResetClickListener = this.b;
        if (pinResetClickListener != null) {
            pinResetClickListener.onClick(1);
        }
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.fragment_pin_operate, container, false);
        c(viewInflate);
        return viewInflate;
    }

    public DialogFragment show(@NonNull Activity activity, PinResetClickListener listener) {
        LoadingDialog.dismiss(this.a);
        this.b = listener;
        DialogFragment dialogFragmentShow = AlertDialog.setTitle("").setContent(this).setNeutralBtn(activity.getString(R.string.cancel)).show(activity, "Pin reset dialog");
        this.a = dialogFragmentShow;
        return dialogFragmentShow;
    }
}
