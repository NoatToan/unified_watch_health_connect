package com.xiaomi.hm.health.bodyfat.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class WeightConnectedFragment extends Fragment {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (getActivity() != null) {
            ((WeightConnectActivity) getActivity()).exitOneFootMeasure();
        }
    }

    private void initView(View view) {
        view.findViewById(R.id.btn_cancel_one_foot_measure).setOnClickListener(new View.OnClickListener() { // from class: vr8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.b(view2);
            }
        });
        if (BFCallback.getHMDeviceManager().hasBoundBfs()) {
            ImageView imageView = (ImageView) view.findViewById(R.id.device_img);
            FragmentActivity activity = getActivity();
            Objects.requireNonNull(activity);
            imageView.setImageDrawable(activity.getResources().getDrawable(R.drawable.img_bodyfat_one_foot));
            return;
        }
        ImageView imageView2 = (ImageView) view.findViewById(R.id.device_img);
        FragmentActivity activity2 = getActivity();
        Objects.requireNonNull(activity2);
        imageView2.setImageDrawable(activity2.getResources().getDrawable(R.drawable.img_bodyfat_one_foot_for_scale));
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_weight_connected, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        initView(view);
    }
}
