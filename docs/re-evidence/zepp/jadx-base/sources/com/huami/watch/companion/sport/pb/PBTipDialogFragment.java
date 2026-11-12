package com.huami.watch.companion.sport.pb;

import android.app.DialogFragment;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes16.dex */
public class PBTipDialogFragment extends DialogFragment {
    private View rootView;

    private void initView(View view) {
        view.findViewById(R.id.tv_known).setOnClickListener(new View.OnClickListener() { // from class: po5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.lambda$initView$0(view2);
            }
        });
        view.findViewById(R.id.iv_close).setOnClickListener(new View.OnClickListener() { // from class: qo5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.lambda$initView$1(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        dismiss();
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        getDialog().requestWindowFeature(1);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_pb_tip_dialog, viewGroup, true);
        this.rootView = viewInflate;
        initView(viewInflate);
        getDialog().getWindow().setSoftInputMode(34);
        setCancelable(false);
        return this.rootView;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onStart() {
        super.onStart();
        try {
            getDialog().getWindow().setLayout(-2, -2);
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
            WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
            attributes.gravity = 17;
            getDialog().getWindow().setAttributes(attributes);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
