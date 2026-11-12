package com.xiaomi.hm.health.bodyfat.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.huami.lib.view.progress.ProgressView;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;

/* JADX INFO: loaded from: classes19.dex */
public class WeightConnectingFragment extends Fragment {
    private RelativeLayout a;
    private TextView b;
    private TextView c;
    private ProgressView d;
    private ImageView e;
    private TextView f;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        getActivity().setResult(0);
        getActivity().finish();
    }

    private void initView(View view) {
        this.a = (RelativeLayout) view.findViewById(R.id.device_bind_rl);
        this.b = (TextView) view.findViewById(R.id.title_tv);
        this.c = (TextView) view.findViewById(R.id.sub_title_tv);
        this.d = (ProgressView) view.findViewById(R.id.loading_view);
        this.e = (ImageView) view.findViewById(R.id.device_img);
        TextView textView = (TextView) view.findViewById(R.id.btn_cancel);
        this.f = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: wr8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.b(view2);
            }
        });
        if (BFCallback.getHMDeviceManager().hasBound(HMDeviceSource.WEIGHT_BFS)) {
            this.e.setImageResource(R.drawable.img_bodyfat_blue);
        } else if (BFCallback.getHMDeviceManager().hasBound(HMDeviceSource.WEIGHT_SCALE2)) {
            this.e.setImageResource(R.drawable.img_weight);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_weight_connecting, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        initView(view);
    }
}
