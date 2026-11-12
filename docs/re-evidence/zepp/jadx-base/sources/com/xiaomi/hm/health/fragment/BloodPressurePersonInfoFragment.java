package com.xiaomi.hm.health.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.huami.account.HMLoginManager;
import com.huami.lib.rainbow.ListTile;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bodyfat.activity.WeightDetailActivity;
import com.xiaomi.hm.health.bodyfat.fragment.IOnWeightSelectListener;
import com.xiaomi.hm.health.bodyfat.fragment.SelectWeightFragment;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.model.WeatherSetting;
import com.xiaomi.hm.health.eventbus.EventPersonInfoUpdate;
import com.xiaomi.hm.health.fragment.BloodPressurePersonInfoFragment;
import com.xiaomi.hm.health.model.account.HMBirthday;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.privacy.usecase.DisplayDefaultFieldUseCase;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.webapi.HMAccountWebExtAPI;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes21.dex */
public class BloodPressurePersonInfoFragment extends Fragment {
    public static final int REQ_SET_GOAL_CODE = 20;
    private static final String e = "PersonInfoActivity";
    private ListView a;
    public HMPersonInfo b = HMPersonInfo.getInstance();
    private final ArrayList<Integer> c = new ArrayList<>(Arrays.asList(Integer.valueOf(R.string.person_info_key_gender), Integer.valueOf(R.string.person_info_key_birth), Integer.valueOf(R.string.person_info_key_height), Integer.valueOf(R.string.person_info_key_weight)));
    private final b d = new b();

    public class a implements IOnWeightSelectListener {
        public a() {
        }

        @Override // com.xiaomi.hm.health.bodyfat.fragment.IOnWeightSelectListener
        public void onWeightSelect(float weight) {
            HMPersonInfo.getInstance().getUserInfo().setWeight(weight);
            HMPersonInfo.getInstance().saveInfo(2);
            BloodPressurePersonInfoFragment.this.s("weight");
            BloodPressurePersonInfoFragment.this.w();
        }

        @Override // com.xiaomi.hm.health.bodyfat.fragment.IOnWeightSelectListener
        public void onWeightSelectCancel() {
        }
    }

    public class b extends BaseAdapter {
        private b() {
        }

        private void a(int position, ListTile item) {
            String string;
            if (position >= BloodPressurePersonInfoFragment.this.c.size()) {
                return;
            }
            item.setTitle(((Integer) BloodPressurePersonInfoFragment.this.c.get(position)).intValue());
            String string2 = "";
            item.setTips("");
            if (((Integer) BloodPressurePersonInfoFragment.this.c.get(position)).intValue() == R.string.person_info_key_gender) {
                String string3 = BloodPressurePersonInfoFragment.this.b.getUserInfo().getGender() == 1 ? BloodPressurePersonInfoFragment.this.getString(R.string.person_info_set_gender_male) : BloodPressurePersonInfoFragment.this.getString(R.string.person_info_set_gender_female);
                item.setTips(string3);
                item.setTrailing(R.drawable.ic_arrow_forward_20_2x);
                item.setEnabled(true);
                item.setDividerPadding(2);
                DisplayDefaultFieldUseCase.execute(item, string3, "gender");
                return;
            }
            if (((Integer) BloodPressurePersonInfoFragment.this.c.get(position)).intValue() == R.string.person_info_key_birth) {
                HMBirthday hMBirthdayFromStr = HMBirthday.fromStr(BloodPressurePersonInfoFragment.this.b.getUserInfo().getBirthday());
                if (hMBirthdayFromStr != null && hMBirthdayFromStr.isValid()) {
                    string2 = hMBirthdayFromStr.toString();
                }
                item.setTips(string2);
                item.setEnabled(HMLoginManager.isAdultSupportMainlandMinorRegulations());
                item.setTrailing(R.drawable.ic_arrow_forward_20_2x);
                item.setDividerPadding(2);
                DisplayDefaultFieldUseCase.execute(item, string2, "birthday");
                return;
            }
            if (((Integer) BloodPressurePersonInfoFragment.this.c.get(position)).intValue() != R.string.person_info_key_height) {
                if (((Integer) BloodPressurePersonInfoFragment.this.c.get(position)).intValue() == R.string.person_info_key_weight) {
                    String str = HMWeightUtils.getWeightValueStringForDisplay(BloodPressurePersonInfoFragment.this.b.getUserInfo().getWeight(), BloodPressurePersonInfoFragment.this.b.getMiliConfig().getWeightUnit()) + HMWeightUtils.toUnitStr(BloodPressurePersonInfoFragment.this.requireContext().getApplicationContext(), BloodPressurePersonInfoFragment.this.b.getMiliConfig().getWeightUnit());
                    item.setTips(str);
                    item.setEnabled(true);
                    item.setTrailing(R.drawable.ic_arrow_forward_20_2x);
                    DisplayDefaultFieldUseCase.execute(item, str, "weight");
                    return;
                }
                return;
            }
            if (BloodPressurePersonInfoFragment.this.b.getMiliConfig().getUnit() == 0) {
                string = BloodPressurePersonInfoFragment.this.getString(R.string.person_info_key_height_unit_metric, BloodPressurePersonInfoFragment.this.b.getUserInfo().getHeight() + "");
            } else {
                int iCm2inch = Utils.cm2inch(BloodPressurePersonInfoFragment.this.b.getUserInfo().getHeight());
                int i = iCm2inch / 12;
                int i2 = iCm2inch % 12;
                string = BloodPressurePersonInfoFragment.this.getResources().getQuantityString(R.plurals.numberFoot, i, Integer.valueOf(i)) + BloodPressurePersonInfoFragment.this.getResources().getQuantityString(R.plurals.numberInch, i2, Integer.valueOf(i2));
            }
            item.setTips(string);
            item.setEnabled(true);
            item.setTrailing(R.drawable.ic_arrow_forward_20_2x);
            item.setDividerPadding(2);
            DisplayDefaultFieldUseCase.execute(item, string, "height");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return BloodPressurePersonInfoFragment.this.c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int position) {
            return BloodPressurePersonInfoFragment.this.c.get(position);
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = new ListTile(BloodPressurePersonInfoFragment.this.requireActivity());
            }
            a(position, (ListTile) convertView);
            return convertView;
        }
    }

    public static class c extends HMCallback {
        private c() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            HMLog.d(BloodPressurePersonInfoFragment.e, "setUserInfoToDevice:" + result, new Object[0]);
        }
    }

    private void initView() {
        k();
    }

    private void j(View view) {
        this.a = (ListView) view.findViewById(R.id.person_info_list);
    }

    private void k() {
        this.a.setAdapter((ListAdapter) this.d);
        this.a.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: v10
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                this.a.p(adapterView, view, i, j);
            }
        });
    }

    private boolean l(String fieldKey) {
        List<String> defaultFields = this.b.getUserInfo().getDefaultFields();
        if (defaultFields != null) {
            return defaultFields.contains(fieldKey);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        s("gender");
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        s("birthday");
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        s("height");
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(AdapterView adapterView, View view, int i, long j) {
        if (this.c.get(i).intValue() == R.string.person_info_key_gender) {
            PersonInfoSettingBaseFragment.showSelf(requireActivity(), new PersonInfoSettingGenderFragment(), new PersonInfoSettingBaseFragment.OnDataChangeListener() { // from class: x10
                @Override // com.xiaomi.hm.health.fragment.PersonInfoSettingBaseFragment.OnDataChangeListener
                public final void onChange() {
                    this.a.m();
                }
            });
            Analytics.event(requireActivity(), "Profile_Out", "Gender");
            return;
        }
        if (this.c.get(i).intValue() == R.string.person_info_key_birth) {
            if (HMLoginManager.isAdultSupportMainlandMinorRegulations()) {
                PersonInfoSettingBaseFragment.showSelf(requireActivity(), PersonInfoSettingBirthdayForRegisterFragment.newInstance(false), new PersonInfoSettingBaseFragment.OnDataChangeListener() { // from class: y10
                    @Override // com.xiaomi.hm.health.fragment.PersonInfoSettingBaseFragment.OnDataChangeListener
                    public final void onChange() {
                        this.a.n();
                    }
                });
                Analytics.event(requireActivity(), "Profile_Out", "Born");
                return;
            }
            return;
        }
        if (this.c.get(i).intValue() == R.string.person_info_key_height) {
            PersonInfoSettingBaseFragment.showSelf(requireActivity(), new PersonInfoSettingHeightFragment(), new PersonInfoSettingBaseFragment.OnDataChangeListener() { // from class: w10
                @Override // com.xiaomi.hm.health.fragment.PersonInfoSettingBaseFragment.OnDataChangeListener
                public final void onChange() {
                    this.a.o();
                }
            });
            Analytics.event(requireActivity(), "Profile_Out", "Height");
        } else if (this.c.get(i).intValue() == R.string.person_info_key_weight) {
            if (l("weight")) {
                new SelectWeightFragment(getActivity(), -1.0f, new a()).showWeightSelectDialog();
                return;
            }
            Intent intent = new Intent(requireActivity(), (Class<?>) WeightDetailActivity.class);
            intent.putExtra("UID", HMLoginManager.getValidUid());
            startActivityForResult(intent, 20);
            Analytics.event(requireActivity(), "Profile_Out", "Weight");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(Boolean bool) {
        HMLog.d(e, "result: " + bool, new Object[0]);
        if (bool.booleanValue()) {
            this.d.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(String fieldKey) {
        List<String> defaultFields = this.b.getUserInfo().getDefaultFields();
        if (defaultFields != null) {
            ArrayList arrayList = new ArrayList(defaultFields);
            arrayList.remove(fieldKey);
            this.b.getUserInfo().setDefaultFields(arrayList);
        }
    }

    private void t() {
        this.b.getUserInfo().setLocation(WeatherSetting.fromJsonString(this.b.getMiliConfig().getWeatherSetting()).getDisplayCity());
        HMAccountWebExtAPI.updateProfile();
    }

    private void u() {
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        HMMiLiDevice hMMiLiDevice = (HMMiLiDevice) hMDeviceManager.getDevice(hMDeviceType);
        if (hMMiLiDevice == null || !hMMiLiDevice.isConnected()) {
            return;
        }
        UserInfoExt userInfoExt = HMDeviceUtils.toUserInfoExt(this.b.getUserInfo());
        long authKeyUserId = HMDeviceManager.getInstance().getAuthKeyUserId(hMDeviceType);
        if (authKeyUserId != -1) {
            userInfoExt.setUid((int) authKeyUserId);
        }
        hMMiLiDevice.setUserInfo(userInfoExt, new c());
    }

    private void v() {
        this.d.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        v();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blood_pressure_person_info, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        w();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        t();
        HMPersonInfo hMPersonInfo = this.b;
        if (hMPersonInfo != null && hMPersonInfo.getUserInfo() != null && this.b.getUserInfo().getSynced() != 0) {
            EventBus.getDefault().post(new EventPersonInfoUpdate());
        }
        u();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        HMAccountWebExtAPI.updateUserBirthday(false).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: z10
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.q((Boolean) obj);
            }
        }, new Action1() { // from class: a20
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                BloodPressurePersonInfoFragment.r((Throwable) obj);
            }
        });
        j(view);
        initView();
        Analytics.event(requireActivity(), "Profile_ViewNum");
    }
}
