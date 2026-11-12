package com.xiaomi.hm.health.training.ui.fragment;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.lib.view.SystemBarTintSupport;
import com.xiaomi.hm.health.training.R;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingMoreDialogFragment extends BaseDialogFragment implements View.OnClickListener {
    private boolean e;
    private boolean f;
    private OnViewCreateListener g;
    private OnViewClickListener h;

    public interface OnViewClickListener {
        void onViewClick(int i);
    }

    public interface OnViewCreateListener {
        void onViewCreate(TextView textView, TextView textView2);
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public View initView() {
        View viewInflate = View.inflate(getContext(), R.layout.dialog_training_more, null);
        initView(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        OnViewClickListener onViewClickListener = this.h;
        if (onViewClickListener != null) {
            onViewClickListener.onViewClick(id);
        }
        dismiss();
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = R.style.DimPanel;
        if (SystemBarTintSupport.isSupport(getActivity())) {
            i = R.style.DimPanelTint;
        }
        setStyle(0, i);
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
        }
    }

    public void setHasBoundHrDevice(boolean z) {
        this.e = z;
    }

    public void setOnViewClickListener(OnViewClickListener onViewClickListener) {
        this.h = onViewClickListener;
    }

    public void setOnViewCreateListener(OnViewCreateListener onViewCreateListener) {
        this.g = onViewCreateListener;
    }

    public void setShowDownloadButton(boolean z) {
        this.f = z;
    }

    public void initView(View view) {
        TextView textView = (TextView) view.findViewById(R.id.item_setting);
        View viewFindViewById = view.findViewById(R.id.divider_setting);
        TextView textView2 = (TextView) view.findViewById(R.id.item_download_video);
        View viewFindViewById2 = view.findViewById(R.id.divider_download);
        TextView textView3 = (TextView) view.findViewById(R.id.item_exit_training);
        TextView textView4 = (TextView) view.findViewById(R.id.btn_cancel);
        View viewFindViewById3 = view.findViewById(R.id.view_other);
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
        textView4.setOnClickListener(this);
        viewFindViewById3.setOnClickListener(this);
        OnViewCreateListener onViewCreateListener = this.g;
        if (onViewCreateListener != null) {
            onViewCreateListener.onViewCreate(textView2, textView3);
        }
        textView.setVisibility(this.e ? 0 : 8);
        viewFindViewById.setVisibility(this.e ? 0 : 8);
        textView2.setVisibility(this.f ? 0 : 8);
        viewFindViewById2.setVisibility(this.f ? 0 : 8);
    }
}
