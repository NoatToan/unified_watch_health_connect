package com.xiaomi.hm.health.lab.fragment;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import com.xiaomi.hm.health.lab.R;
import com.xiaomi.hm.health.lab.utils.LabKeeper;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public class BehaviorGuidePopupFragment extends DialogFragment {
    private void b(Dialog dialog) {
        dialog.findViewById(R.id.tv_got_it).setOnClickListener(new View.OnClickListener() { // from class: ct
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        LabKeeper.saveGuideRollOut(true);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Context context = getContext();
        Objects.requireNonNull(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.fragment_behavior_guide);
        dialog.setCanceledOnTouchOutside(true);
        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        b(dialog);
        return dialog;
    }
}
