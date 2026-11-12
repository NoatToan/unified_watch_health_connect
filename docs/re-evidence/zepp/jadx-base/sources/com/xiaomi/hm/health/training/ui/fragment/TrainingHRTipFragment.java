package com.xiaomi.hm.health.training.ui.fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.lib.view.SystemBarTintSupport;
import com.xiaomi.hm.health.training.R;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingHRTipFragment extends DialogFragment implements View.OnClickListener {
    private DialogButtonListener a = null;

    public interface DialogButtonListener {
        void onDismiss();

        void onNotTips();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.a != null && view.getId() == R.id.know_btn) {
            this.a.onNotTips();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = R.style.DimPanel;
        if (SystemBarTintSupport.isSupport(getActivity())) {
            i = R.style.DimPanelTint;
        }
        setStyle(0, i);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_train_hr_tips, viewGroup, false);
        viewInflate.findViewById(R.id.know_btn).setOnClickListener(this);
        if (RainbowUtils.isDarkMode(requireContext())) {
            ((ImageView) viewInflate.findViewById(R.id.tr_img_center)).setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.img_heartrate_unband_train_black));
        } else {
            ((ImageView) viewInflate.findViewById(R.id.tr_img_center)).setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.img_heartrate_uphand_train));
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogButtonListener dialogButtonListener = this.a;
        if (dialogButtonListener != null) {
            dialogButtonListener.onDismiss();
        }
    }

    public void setDialogButtonListener(DialogButtonListener dialogButtonListener) {
        this.a = dialogButtonListener;
    }
}
