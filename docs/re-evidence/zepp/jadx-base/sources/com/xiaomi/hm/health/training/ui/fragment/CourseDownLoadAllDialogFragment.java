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
public class CourseDownLoadAllDialogFragment extends BaseDialogFragment implements View.OnClickListener {
    private String e;
    private OnViewClickListener f;

    public interface OnViewClickListener {
        void onViewClick(int i);
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public View initView() {
        View viewInflate = View.inflate(getContext(), R.layout.dialog_course_download, null);
        initView(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        OnViewClickListener onViewClickListener = this.f;
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

    public void setOnViewClickListener(OnViewClickListener onViewClickListener) {
        this.f = onViewClickListener;
    }

    public void setSuggestTitle(String str) {
        this.e = str;
    }

    public void initView(View view) {
        ((TextView) view.findViewById(R.id.tx_suggest_download)).setText(this.e);
        view.findViewById(R.id.item_download_all).setOnClickListener(this);
        view.findViewById(R.id.item_download_current).setOnClickListener(this);
        view.findViewById(R.id.btn_cancel).setOnClickListener(this);
        view.findViewById(R.id.view_other).setOnClickListener(this);
    }
}
