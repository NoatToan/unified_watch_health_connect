package com.xiaomi.hm.health.ui.sportfitness.fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.huami.lib.view.SystemBarTintSupport;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes22.dex */
public class SportHRTipsFragment extends DialogFragment implements View.OnClickListener {
    private static final String b = "is_blue_monkey";
    private DialogButtonListener a = null;

    public interface DialogButtonListener {
        void onDismiss();

        void onNotTips();
    }

    public static SportHRTipsFragment newInstance(boolean isBlueMonkey) {
        SportHRTipsFragment sportHRTipsFragment = new SportHRTipsFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(b, isBlueMonkey);
        sportHRTipsFragment.setArguments(bundle);
        return sportHRTipsFragment;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.a != null && view.getId() == R.id.know_btn) {
            this.a.onNotTips();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, SystemBarTintSupport.isSupport(getActivity()) ? R.style.DimPanelTint : R.style.DimPanel);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.fragment_sport_hr_tips, container, false);
        viewInflate.findViewById(R.id.know_btn).setOnClickListener(this);
        if (getArguments() != null ? getArguments().getBoolean(b, false) : false) {
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_info_1);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_info_2);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_image);
            textView.setText(R.string.sport_before_bm_prompt_title);
            textView2.setText(getString(R.string.running_before_bm_prompt_content, getString(R.string.smart_t_shirt)));
            textView3.setText((CharSequence) null);
            imageView.setImageResource(R.drawable.img_blue_monkey_tips);
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        DialogButtonListener dialogButtonListener = this.a;
        if (dialogButtonListener != null) {
            dialogButtonListener.onDismiss();
        }
    }

    public void setDialogButtonListener(DialogButtonListener listener) {
        this.a = listener;
    }
}
