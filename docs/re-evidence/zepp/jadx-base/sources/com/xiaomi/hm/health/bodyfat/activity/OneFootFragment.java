package com.xiaomi.hm.health.bodyfat.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.BFKeeper;
import com.xiaomi.hm.health.bodyfat.utils.OneFootUtils;
import com.xiaomi.hm.health.bodyfat.utils.WeightConstant;
import com.xiaomi.hm.health.bodyfat.view.WeightingDynamicWeightView;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.text.ParseException;

/* JADX INFO: loaded from: classes19.dex */
public class OneFootFragment extends Fragment {
    private WeightingDynamicWeightView a;
    private float b;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        c(false);
        if (!isAdded() || getActivity() == null) {
            return;
        }
        BFKeeper.setChooseUserShowing(false);
        getActivity().finish();
    }

    private void c(boolean z) {
        if (getActivity() == null) {
            return;
        }
        ((WeightConnectActivity) getActivity()).B = z;
    }

    private void initView(View view) throws ParseException {
        WeightingDynamicWeightView weightingDynamicWeightView = (WeightingDynamicWeightView) view.findViewById(R.id.weight_dynamic_view);
        this.a = weightingDynamicWeightView;
        weightingDynamicWeightView.setWeightTips("");
        this.a.setWeightNumber(IdManager.DEFAULT_VERSION_NAME);
        this.a.setWeightUnit(getString(R.string.unit_sec));
        this.a.setBmiNumber("");
        this.a.setBmiText("");
        this.a.setBmiStandard("");
        this.a.setMaxWeightNumber(999.9f);
    }

    public void jumpToOneFootDetail() {
        WeightInfoManager manager = WeightInfoManager.getManager();
        UserInfos guest = UserInfoManager.getManager().getGuest();
        WeightInfos weightInfos = new WeightInfos();
        weightInfos.setDevice_id(BFCallback.getHMDeviceManager().getBoundDeviceId(HMDeviceType.WEIGHT));
        weightInfos.setSync(0);
        weightInfos.setTimestamp(Long.valueOf(System.currentTimeMillis()));
        weightInfos.setWeight(Float.valueOf(0.123f));
        weightInfos.setType(3);
        weightInfos.setSource(Integer.valueOf(BFCallback.getHMDeviceManager().getBoundWeightDeviceSourceValue()));
        weightInfos.setHeight(guest.getHeight());
        weightInfos.setOfmt(Float.valueOf(this.b));
        manager.setGuestOneFootInfo(weightInfos);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.startActivity(new Intent(activity, (Class<?>) GuestOneFootDetailActivity.class));
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_one_foot, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) throws ParseException {
        super.onViewCreated(view, bundle);
        initView(view);
        ((Vibrator) getActivity().getSystemService("vibrator")).vibrate(200L);
    }

    public void showChoseUserFrag() {
        c(true);
        WeightAdvData weightAdvData = new WeightAdvData();
        weightAdvData.setTimestamp(System.currentTimeMillis());
        weightAdvData.setType(3);
        weightAdvData.setValueKg(0.123f);
        weightAdvData.setValue(this.b);
        weightAdvData.setStable(true);
        weightAdvData.setFinish(true);
        Bundle bundle = new Bundle();
        bundle.putString(WeightAdvData.WEIGHTADVDATA_KEY, weightAdvData.toJsonString());
        bundle.putBoolean(BFConstant.FROM_BABY_WEIGHT, false);
        bundle.putBoolean(WeightConstant.KEY_DATA_ONE_FEET_TEST, true);
        WeightChooseUserFragment weightChooseUserFragment = new WeightChooseUserFragment();
        weightChooseUserFragment.setArguments(bundle);
        BFKeeper.setChooseUserShowing(true);
        weightChooseUserFragment.setOnDismissListener(new WeightChooseUserFragment.OnDialogDismissListener() { // from class: fk5
            @Override // com.xiaomi.hm.health.bodyfat.activity.WeightChooseUserFragment.OnDialogDismissListener
            public final void onDismiss() {
                this.a.b();
            }
        });
        if (isAdded()) {
            FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
            fragmentTransactionBeginTransaction.replace(R.id.family_container, weightChooseUserFragment);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
    }

    public void updateView(float f) {
        WeightingDynamicWeightView weightingDynamicWeightView = this.a;
        if (weightingDynamicWeightView == null) {
            return;
        }
        this.b = f;
        weightingDynamicWeightView.setWeightNumber(OneFootUtils.getOneFootValueStringForDisplay(f));
    }
}
