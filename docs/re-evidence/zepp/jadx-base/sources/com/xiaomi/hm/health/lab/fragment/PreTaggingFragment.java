package com.xiaomi.hm.health.lab.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.lab.R;
import com.xiaomi.hm.health.lab.init.InitCallBack;
import com.xiaomi.hm.health.lab.init.LabCallbackInit;
import com.xiaomi.hm.health.lab.model.BehaviorTagEnity;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingTools;

/* JADX INFO: loaded from: classes21.dex */
public class PreTaggingFragment extends Fragment implements View.OnClickListener {
    private static final String f = "behavior.tag.entity.key";
    private static final String g = "behavior.auto.sleep.tag.key";
    private BehaviorTagEnity a;
    private final int b = -1;
    private final int c = 0;
    private final int d = 1;
    private OnMarkDeviceChooseListener e;

    public interface OnMarkDeviceChooseListener {
        void onMarkDeviceChoose(View view, HMDeviceType hMDeviceType);
    }

    private void b(int i, View view) {
        j(i, view, HMDeviceType.MILI);
    }

    private void c(int i, View view) {
        j(i, view, HMDeviceType.OTHER);
    }

    private void d(int i, View view) {
        if (this.a.isSupportShoes()) {
            j(i, view, HMDeviceType.SHOES);
        } else {
            IconToast.showError(getContext(), R.string.unsupport_shoes_marking);
        }
    }

    private void e(View view) {
        InitCallBack initCallBack = LabCallbackInit.getInitCallBack();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        boolean zHasBound = initCallBack.hasBound(hMDeviceType);
        InitCallBack initCallBack2 = LabCallbackInit.getInitCallBack();
        HMDeviceType hMDeviceType2 = HMDeviceType.SHOES;
        boolean zHasBound2 = initCallBack2.hasBound(hMDeviceType2);
        InitCallBack initCallBack3 = LabCallbackInit.getInitCallBack();
        HMDeviceType hMDeviceType3 = HMDeviceType.WEIGHT;
        boolean zHasBound3 = initCallBack3.hasBound(hMDeviceType3);
        InitCallBack initCallBack4 = LabCallbackInit.getInitCallBack();
        HMDeviceType hMDeviceType4 = HMDeviceType.WATCH;
        boolean zHasBound4 = initCallBack4.hasBound(hMDeviceType4);
        InitCallBack initCallBack5 = LabCallbackInit.getInitCallBack();
        HMDeviceType hMDeviceType5 = HMDeviceType.OTHER;
        boolean zHasBound5 = initCallBack5.hasBound(hMDeviceType5);
        InitCallBack initCallBack6 = LabCallbackInit.getInitCallBack();
        HMDeviceType hMDeviceType6 = HMDeviceType.EARBUD;
        boolean zHasBound6 = initCallBack6.hasBound(hMDeviceType6);
        InitCallBack initCallBack7 = LabCallbackInit.getInitCallBack();
        HMDeviceType hMDeviceType7 = HMDeviceType.HEADSET;
        boolean zHasBound7 = initCallBack7.hasBound(hMDeviceType7);
        if (!LabCallbackInit.getInitCallBack().isBluetoothEnable()) {
            IconToast.showError(getContext(), getString(R.string.bluetooth_is_off));
            return;
        }
        if (BehaviorTaggingTools.HEADSET_SLEEP.equals(this.a.getBehaviorKey())) {
            if (zHasBound7) {
                j(f(hMDeviceType7, new HMDeviceSource[0]), view, hMDeviceType7);
                return;
            } else {
                i(LabCallbackInit.getInitCallBack().getBoundDeviceName(hMDeviceType7));
                return;
            }
        }
        if (BehaviorTaggingTools.EARBUD_SLEEP.equals(this.a.getBehaviorKey())) {
            if (zHasBound6) {
                j(f(hMDeviceType6, new HMDeviceSource[0]), view, hMDeviceType6);
                return;
            } else {
                i(LabCallbackInit.getInitCallBack().getBoundDeviceName(hMDeviceType6));
                return;
            }
        }
        if (!zHasBound && !zHasBound2 && !zHasBound5) {
            if (zHasBound4) {
                i(LabCallbackInit.getInitCallBack().getBoundDeviceName(hMDeviceType4));
                return;
            } else if (zHasBound3) {
                i(LabCallbackInit.getInitCallBack().getBoundDeviceName(hMDeviceType3));
                return;
            } else {
                IconToast.showError(getContext(), getString(R.string.lab_unbind_device));
                return;
            }
        }
        int iF = LabCallbackInit.getInitCallBack().supportShoeMars() ? f(hMDeviceType2, HMDeviceSource.SHOES_CHILD) : f(hMDeviceType2, HMDeviceSource.SHOES_MARS, HMDeviceSource.SHOES_CHILD);
        int iF2 = f(hMDeviceType, HMDeviceSource.MILI_1S);
        int iF3 = f(hMDeviceType5, new HMDeviceSource[0]);
        if (iF == -1 && !zHasBound && !zHasBound5) {
            i(LabCallbackInit.getInitCallBack().getBoundDeviceName(hMDeviceType2));
            return;
        }
        if (iF2 == -1 && !zHasBound2 && !zHasBound5) {
            i(LabCallbackInit.getInitCallBack().getBoundDeviceName(hMDeviceType));
            return;
        }
        if (iF3 == -1 && !zHasBound && !zHasBound2) {
            i(LabCallbackInit.getInitCallBack().getBoundDeviceName(hMDeviceType5));
            return;
        }
        if (zHasBound && !zHasBound2 && !zHasBound5) {
            b(iF2, view);
            return;
        }
        if (zHasBound2 && !zHasBound && !zHasBound5) {
            d(iF, view);
            return;
        }
        if (zHasBound5 && !zHasBound && !zHasBound2) {
            c(iF3, view);
            return;
        }
        if (iF2 == 0 && iF == 0 && iF3 == 0) {
            IconToast.showError(getContext(), R.string.device_connect_failed);
            return;
        }
        if (this.a.isSupportShoes()) {
            h(view, iF2, iF, iF3);
            return;
        }
        if (zHasBound && !zHasBound5) {
            b(iF2, view);
            return;
        }
        if (zHasBound5 && !zHasBound) {
            c(iF3, view);
        } else if (zHasBound && zHasBound5) {
            h(view, iF2, iF, iF3);
        }
    }

    private int f(HMDeviceType hMDeviceType, HMDeviceSource... hMDeviceSourceArr) {
        HMBaseDevice device = LabCallbackInit.getInitCallBack().getDevice(hMDeviceType);
        if (device != null) {
            HMDeviceSource boundDeviceSource = LabCallbackInit.getInitCallBack().getBoundDeviceSource(hMDeviceType);
            for (HMDeviceSource hMDeviceSource : hMDeviceSourceArr) {
                if (boundDeviceSource == hMDeviceSource) {
                    return -1;
                }
            }
            if (device.isConnected()) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i, View view, int i2, int i3, HMDeviceType hMDeviceType) {
        if (hMDeviceType == HMDeviceType.MILI) {
            b(i, view);
        } else if (hMDeviceType == HMDeviceType.SHOES) {
            d(i2, view);
        } else if (hMDeviceType == HMDeviceType.OTHER) {
            c(i3, view);
        }
    }

    private void h(final View view, final int i, final int i2, final int i3) {
        DeviceChooseFragment deviceChooseFragment = new DeviceChooseFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(DeviceChooseFragment.l, this.a.isSupportShoes());
        deviceChooseFragment.setArguments(bundle);
        deviceChooseFragment.l(new DeviceChooseFragment.OnDeviceTypeChooseListener() { // from class: v26
            @Override // com.xiaomi.hm.health.lab.fragment.DeviceChooseFragment.OnDeviceTypeChooseListener
            public final void onDeviceTypeChoose(HMDeviceType hMDeviceType) {
                this.a.g(i, view, i2, i3, hMDeviceType);
            }
        });
        deviceChooseFragment.setCancelable(true);
        deviceChooseFragment.show(getChildFragmentManager());
    }

    private void i(String str) {
        IconToast.showError(getContext(), getString(R.string.unsupport_device, str));
    }

    private void j(int i, View view, HMDeviceType hMDeviceType) {
        if (i == -1) {
            i(LabCallbackInit.getInitCallBack().getBoundDeviceName(hMDeviceType));
            return;
        }
        if (i != 1) {
            IconToast.showError(getContext(), R.string.device_connect_failed);
            return;
        }
        OnMarkDeviceChooseListener onMarkDeviceChooseListener = this.e;
        if (onMarkDeviceChooseListener != null) {
            onMarkDeviceChooseListener.onMarkDeviceChoose(view, hMDeviceType);
        }
    }

    public static PreTaggingFragment newInstance(BehaviorTagEnity behaviorTagEnity, boolean z) {
        PreTaggingFragment preTaggingFragment = new PreTaggingFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(f, behaviorTagEnity);
        bundle.putBoolean("behavior.auto.sleep.tag.key", z);
        preTaggingFragment.setArguments(bundle);
        return preTaggingFragment;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.btn_start_mark) {
            e(view);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_pre_mark, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.btn_start_mark);
        appCompatImageView.setOnClickListener(this);
        TextView textView = (TextView) view.findViewById(R.id.tx_action_desc);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.a = (BehaviorTagEnity) arguments.getSerializable(f);
            if (arguments.getBoolean("behavior.auto.sleep.tag.key", false) && "sleep".equals(this.a.getBehaviorKey())) {
                e(appCompatImageView);
            }
            if (this.a.isUseDominantHand()) {
                textView.setText(String.format("%s%n%s", textView.getText(), getResources().getString(R.string.tagging_tip_extra)));
            }
            if (BehaviorTaggingTools.NMEA.equals(this.a.getBehaviorKey())) {
                textView.setText(R.string.tagging_nmea_tip);
            }
        }
        super.onViewCreated(view, bundle);
    }

    public void setOnMarkDeviceChooseListener(OnMarkDeviceChooseListener onMarkDeviceChooseListener) {
        this.e = onMarkDeviceChooseListener;
    }
}
