package com.xiaomi.hm.health.lab.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.lab.R;
import com.xiaomi.hm.health.lab.init.InitCallBack;
import com.xiaomi.hm.health.lab.init.LabCallbackInit;

/* JADX INFO: loaded from: classes21.dex */
public class DeviceChooseFragment extends BaseDialogFragment {
    public static final String l = "IS_SUPPORT_SHOES";
    private ImageView e;
    private ImageView f;
    private ImageView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private OnDeviceTypeChooseListener k;

    public interface OnDeviceTypeChooseListener {
        void onDeviceTypeChoose(HMDeviceType hMDeviceType);
    }

    private void g(Context context, final HMDeviceType hMDeviceType) {
        if (hMDeviceType == HMDeviceType.MILI) {
            this.h.setTextColor(ContextCompat.getColor(context, R.color.lab_device_selected));
            TextView textView = this.i;
            int i = R.color.lab_title_gray;
            textView.setTextColor(ContextCompat.getColor(context, i));
            this.j.setTextColor(ContextCompat.getColor(context, i));
            this.e.setVisibility(0);
            this.f.setVisibility(4);
            this.g.setVisibility(4);
        } else if (hMDeviceType == HMDeviceType.SHOES) {
            TextView textView2 = this.h;
            int i2 = R.color.lab_title_gray;
            textView2.setTextColor(ContextCompat.getColor(context, i2));
            this.i.setTextColor(ContextCompat.getColor(context, R.color.lab_device_selected));
            this.j.setTextColor(ContextCompat.getColor(context, i2));
            this.e.setVisibility(4);
            this.f.setVisibility(0);
            this.g.setVisibility(4);
        } else if (hMDeviceType == HMDeviceType.OTHER) {
            TextView textView3 = this.h;
            int i3 = R.color.lab_title_gray;
            textView3.setTextColor(ContextCompat.getColor(context, i3));
            this.i.setTextColor(ContextCompat.getColor(context, i3));
            this.j.setTextColor(ContextCompat.getColor(context, R.color.lab_device_selected));
            this.e.setVisibility(4);
            this.f.setVisibility(4);
            this.g.setVisibility(0);
        }
        if (this.k != null) {
            this.h.postDelayed(new Runnable() { // from class: f71
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.h(hMDeviceType);
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(HMDeviceType hMDeviceType) {
        dismiss();
        this.k.onDeviceTypeChoose(hMDeviceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        g(view.getContext(), HMDeviceType.MILI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        g(view.getContext(), HMDeviceType.SHOES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        g(view.getContext(), HMDeviceType.OTHER);
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public View initView() {
        return View.inflate(getContext(), R.layout.fragment_device_choose, null);
    }

    public void l(OnDeviceTypeChooseListener onDeviceTypeChooseListener) {
        this.k = onDeviceTypeChooseListener;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.e = (ImageView) view.findViewById(R.id.imv_device_type_mili);
        this.f = (ImageView) view.findViewById(R.id.imv_device_type_shoes);
        this.g = (ImageView) view.findViewById(R.id.imv_device_type_other);
        this.h = (TextView) view.findViewById(R.id.tx_device_type_mili);
        this.i = (TextView) view.findViewById(R.id.tx_device_type_shoes);
        this.j = (TextView) view.findViewById(R.id.tx_device_type_other);
        TextView textView = this.h;
        InitCallBack initCallBack = LabCallbackInit.getInitCallBack();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        textView.setText(initCallBack.getBoundDeviceName(hMDeviceType));
        TextView textView2 = this.i;
        InitCallBack initCallBack2 = LabCallbackInit.getInitCallBack();
        HMDeviceType hMDeviceType2 = HMDeviceType.SHOES;
        textView2.setText(initCallBack2.getBoundDeviceName(hMDeviceType2));
        TextView textView3 = this.j;
        InitCallBack initCallBack3 = LabCallbackInit.getInitCallBack();
        HMDeviceType hMDeviceType3 = HMDeviceType.OTHER;
        textView3.setText(initCallBack3.getBoundDeviceName(hMDeviceType3));
        View viewFindViewById = view.findViewById(R.id.ll_mili);
        View viewFindViewById2 = view.findViewById(R.id.ll_shoes);
        View viewFindViewById3 = view.findViewById(R.id.ll_blue_monkey);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: c71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.i(view2);
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: e71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.j(view2);
            }
        });
        viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: d71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.k(view2);
            }
        });
        Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean(l, true) : true;
        boolean zHasBound = LabCallbackInit.getInitCallBack().hasBound(hMDeviceType);
        boolean zHasBound2 = LabCallbackInit.getInitCallBack().hasBound(hMDeviceType2);
        boolean zHasBound3 = LabCallbackInit.getInitCallBack().hasBound(hMDeviceType3);
        viewFindViewById.setVisibility(zHasBound ? 0 : 8);
        viewFindViewById2.setVisibility((zHasBound2 && z) ? 0 : 8);
        viewFindViewById3.setVisibility(zHasBound3 ? 0 : 8);
    }
}
