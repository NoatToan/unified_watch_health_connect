package com.huawei.health.device.ui.measure.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.datepicker.HealthDatePickerDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import defpackage.dmp;
import defpackage.dnb;
import defpackage.dnj;
import defpackage.dor;
import defpackage.drw;
import defpackage.dsq;
import defpackage.dst;
import defpackage.dva;
import defpackage.dxm;
import defpackage.efx;
import defpackage.elh;
import defpackage.qpx;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class GuestUserInfoGuideFragment extends BaseFragment implements View.OnClickListener {
    private static final int ADULT_AGE_HEIGHT_LIMIT = 80;
    private static final int ADULT_AGE_LOWER_LIMIT = 18;
    private static final int AGE_DIVISION = 10000;
    private static final String ARGUMENTS_KEY = "HealthData";
    private static final int BIRTHDAY_DIFF = 1;
    private static final int BIRTHDAY_TYPE = 3;
    private static final int DEFAULT_AGE = 23;
    private static final int DEFAULT_DAY = 1;
    private static final int DEFAULT_HEIGHT = 110;
    private static final int DEFAULT_HIUSER_FEMALE_HEIGHT = 170;
    private static final int DEFAULT_HIUSER_HEIGHT = 170;
    private static final int DEFAULT_MONTH = 0;
    private static final int DEFAULT_ONE = 1;
    private static final int DEFAULT_WEIGHT = 70;
    private static final int DEFAULT_YEAR = 1992;
    private static final int DEFAULT_ZERO = 0;
    private static final int GENDER_TYPE = 2;
    private static final String GUEST_MEASURE = "guest_measure";
    private static final String GUEST_USER = "guest_user";
    private static final int HEIGHT_FOR_INDEX_END = 251;
    private static final int HEIGHT_FOR_INDEX_START = 10;
    private static final int HEIGHT_FT_ARRAY_LENGTH = 8;
    private static final int HEIGHT_FT_INS_CONVERY_END = 7;
    private static final int HEIGHT_FT_INS_CONVERY_START = 5;
    private static final int HEIGHT_INS_ARRAY_LENGTH = 12;
    private static final int HEIGHT_OFFSET = 50;
    private static final int HEIGHT_RIDE = 100;
    private static final int HEIGHT_TYPE = 0;
    private static final double LAST_BODY_FAT = 0.5d;
    private static final int MALE = 1;
    private static final int MAX_AGE = 150;
    private static final String TAG = "GuestUserInfoGuideFragment";
    private static final int VALUE_TYPE_BIRTHDAY = 3;
    private static final int VALUE_TYPE_GENDER = 2;
    private static final int WATER_RATE_LIMIT = 100;
    private static final String WEIGHT_BEAN = "weightBean";
    private LinearLayout mBirthdayHorizontalLayout;
    private LinearLayout mBirthdayLayout;
    private HealthTextView mBirthdayTipText;
    private LinearLayout mBirthdayVerticalLayout;
    private int mDay;
    private ContentValues mDeviceInfo;
    private int mFoot;
    private int mGender;
    private String mGenderFemale;
    private HealthRadioButton mGenderFemaleImgView;
    private LinearLayout mGenderLayout;
    private String mGenderMale;
    private HealthRadioButton mGenderMaleImgView;
    private HealthButton mGuestMeasureCompleteText;
    private LinearLayout mHeightLayout;
    private HiUserInfo mHiUserInfo;
    private int mInch;
    private boolean mIsBirthdaySelected;
    private boolean mIsGenderSelected;
    private boolean mIsHeightSelected;
    private HealthDevice.HealthDeviceKind mKind;
    private int mMonth;
    private String mProductId;
    private elh mProductInfo;
    private RelativeLayout mSettingsGenderFemale;
    private RelativeLayout mSettingsGenderMale;
    private String mUniqueId;
    private dnj mUser;
    private HealthTextView mUserBirthDayText;
    private ImageView mUserBirthdayImage;
    private ImageView mUserGenderImage;
    private HealthTextView mUserGenderText;
    private ImageView mUserHeightImage;
    private HealthTextView mUserHeightText;
    private int mYear;
    private Dialog mDialogGender = null;
    private boolean mIsDeviceMeasure = false;
    private List<Dialog> mDialogContainers = new ArrayList();

    private void showCustomTitleBar() {
        super.setTitle(getActivity().getResources().getString(R.string.IDS_hw_device_weight_guest_measurement));
    }

    private void initView() {
        initImageViews();
        HealthButton healthButton = (HealthButton) this.child.findViewById(R.id.guest_info_fragment_device_complete_btn);
        this.mGuestMeasureCompleteText = healthButton;
        healthButton.setOnClickListener(this);
        boolean z = getArguments().getBoolean("deviceMgrMeasure", false);
        this.mIsDeviceMeasure = z;
        if (z) {
            this.mGuestMeasureCompleteText.setText(R.string.IDS_device_measureactivity_guide_start_measure);
        } else {
            this.mGuestMeasureCompleteText.setText(R.string.IDS_contact_confirm_ios_btn);
        }
        setLanguageImage();
        this.mGenderMale = getResources().getString(R.string.IDS_sns_boy);
        this.mGenderFemale = getResources().getString(R.string.IDS_sns_girl);
    }

    private void initData() {
        MeasurableDevice measurableDeviceC;
        this.mProductId = getArguments().getString("productId");
        ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
        this.mDeviceInfo = contentValues;
        if (contentValues == null) {
            LogUtil.j(TAG, "initData mDeviceInfo is empty");
        } else {
            this.mProductId = contentValues.getAsString("productId");
            this.mUniqueId = this.mDeviceInfo.getAsString("uniqueId");
        }
        if (TextUtils.isEmpty(this.mProductId)) {
            LogUtil.j(TAG, "initData mProductId is empty");
            this.mProductId = getArguments().getString("productId");
        }
        if (!TextUtils.isEmpty(this.mProductId) && TextUtils.isEmpty(this.mUniqueId) && (measurableDeviceC = dmp.d().c(this.mProductId, false)) != null) {
            this.mUniqueId = measurableDeviceC.getUniqueId();
        }
        if (TextUtils.isEmpty(this.mProductId) || TextUtils.isEmpty(this.mUniqueId)) {
            LogUtil.j(TAG, "initData mProductId or mUniqueId is empty");
        }
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        this.mProductInfo = elhVarD;
        if (elhVarD == null) {
            LogUtil.j(TAG, "initData mProductInfo is null");
        } else {
            this.mKind = elhVarD.m();
        }
        this.mHiUserInfo.setHeight(170);
        this.mHiUserInfo.setWeight(70.0f);
        this.mHiUserInfo.setAge(23);
        this.mHiUserInfo.setGender(1);
        showCustomTitleBar();
    }

    private void setLanguageImage() {
        if (LanguageUtil.ba(getActivity())) {
            this.mUserGenderImage.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.mUserHeightImage.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.mUserBirthdayImage.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            this.mUserGenderImage.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.mUserHeightImage.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.mUserBirthdayImage.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
        }
    }

    private void initImageViews() {
        this.mUserGenderImage = (ImageView) this.child.findViewById(R.id.user_info_fragment_set_gender_image);
        this.mUserHeightImage = (ImageView) this.child.findViewById(R.id.user_info_fragment_set_height_image);
        if (qrs.ac()) {
            this.mUserBirthdayImage = (ImageView) this.child.findViewById(R.id.user_info_fragment_set_birthday_image_vertical);
        } else {
            this.mUserBirthdayImage = (ImageView) this.child.findViewById(R.id.user_info_fragment_set_birthday_image);
        }
    }

    private void initLayout() {
        this.mGenderLayout = (LinearLayout) this.child.findViewById(R.id.hw_show_userinfo_gender_layout);
        this.mHeightLayout = (LinearLayout) this.child.findViewById(R.id.hw_show_userinfo_height_layout);
        this.mBirthdayLayout = (LinearLayout) this.child.findViewById(R.id.hw_show_userinfo_birthday_layout);
        this.mGenderLayout.setOnClickListener(this);
        this.mHeightLayout.setOnClickListener(this);
        this.mBirthdayLayout.setOnClickListener(this);
        this.mBirthdayVerticalLayout = (LinearLayout) this.child.findViewById(R.id.hw_show_birthday_vertical_layout);
        this.mBirthdayHorizontalLayout = (LinearLayout) this.child.findViewById(R.id.hw_show_birthday_horizontal_layout);
        if (qrs.ac()) {
            this.mBirthdayVerticalLayout.setVisibility(0);
            this.mBirthdayHorizontalLayout.setVisibility(8);
        } else {
            this.mBirthdayVerticalLayout.setVisibility(8);
            this.mBirthdayHorizontalLayout.setVisibility(0);
        }
    }

    private void initInfoText() {
        this.mUserGenderText = (HealthTextView) this.child.findViewById(R.id.hw_show_userinfo_gender);
        this.mUserHeightText = (HealthTextView) this.child.findViewById(R.id.hw_show_userinfo_height);
        this.mBirthdayTipText = (HealthTextView) this.child.findViewById(R.id.hw_show_userinfo_birthday_tip);
        if (qrs.ac()) {
            this.mUserBirthDayText = (HealthTextView) this.child.findViewById(R.id.hw_show_userinfo_birthday_vertical);
        } else {
            this.mUserBirthDayText = (HealthTextView) this.child.findViewById(R.id.hw_show_userinfo_birthday);
        }
    }

    private void showHeightInchEmuiDialog() {
        View viewInflate = getLayoutInflater().inflate(R.layout.health_healthdata_inch_height_dialog_v9, (ViewGroup) null);
        HealthNumberPicker healthNumberPicker = (HealthNumberPicker) viewInflate.findViewById(R.id.height_ft_number_picker_v9);
        String[] strArr = new String[8];
        int i = 0;
        while (i < 8) {
            StringBuilder sb = new StringBuilder();
            int i2 = i + 1;
            sb.append(UnitUtil.e(i2, 1, 0));
            sb.append(getString(R.string.IDS_ft));
            strArr[i] = sb.toString();
            i = i2;
        }
        healthNumberPicker.setDisplayedValues(strArr);
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setMaxValue(7);
        HealthNumberPicker healthNumberPicker2 = (HealthNumberPicker) viewInflate.findViewById(R.id.height_inch_number_picker_v9);
        String[] strArr2 = new String[12];
        for (int i3 = 0; i3 < 12; i3++) {
            strArr2[i3] = UnitUtil.e(i3, 1, 0) + " " + getString(R.string.IDS_ins);
        }
        healthNumberPicker2.setDisplayedValues(strArr2);
        healthNumberPicker2.setMinValue(0);
        healthNumberPicker2.setMaxValue(11);
        int[] iArr = {5, 7};
        HiUserInfo hiUserInfo = this.mHiUserInfo;
        if (hiUserInfo != null && hiUserInfo.getHeight() > 50) {
            int[] iArrG = UnitUtil.g(((double) this.mHiUserInfo.getHeight()) / 100.0d);
            if (iArrG[0] > 0 && iArrG[1] >= 0) {
                iArr = iArrG;
            }
        }
        healthNumberPicker.setValue(iArr[0] - 1);
        healthNumberPicker2.setValue(iArr[1]);
        heightInchEmuiDialogBuilder(viewInflate, healthNumberPicker, healthNumberPicker2);
    }

    private void heightInchEmuiDialogBuilder(View view, final HealthNumberPicker healthNumberPicker, final HealthNumberPicker healthNumberPicker2) {
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.mainActivity);
        builder.a(getString(R.string.IDS_sns_height_title)).d(view).d(R.string.IDS_contact_confirm_ios_btn, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.GuestUserInfoGuideFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f$0.m829xf2298b01(healthNumberPicker, healthNumberPicker2, view2);
            }
        }).c(R.string.IDS_settings_button_cancal_ios_btn, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.GuestUserInfoGuideFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LogUtil.a(GuestUserInfoGuideFragment.TAG, "heightInchEmuiDialogBuilder click NegativeButton");
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        customViewDialogD.show();
        this.mDialogContainers.add(customViewDialogD);
    }

    /* JADX INFO: renamed from: lambda$heightInchEmuiDialogBuilder$0$com-huawei-health-device-ui-measure-fragment-GuestUserInfoGuideFragment, reason: not valid java name */
    /* synthetic */ void m829xf2298b01(HealthNumberPicker healthNumberPicker, HealthNumberPicker healthNumberPicker2, View view) {
        this.mFoot = healthNumberPicker.getValue() + 1;
        this.mInch = healthNumberPicker2.getValue();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getResources().getString(R.string.IDS_ft_string, UnitUtil.e(this.mFoot, 1, 0)));
        stringBuffer.append(" ");
        stringBuffer.append(getResources().getString(R.string.IDS_ins_string, UnitUtil.e(this.mInch, 1, 0)));
        this.mUserHeightText.setText(stringBuffer.toString());
        double dC = UnitUtil.c(this.mFoot, 1);
        double dC2 = UnitUtil.c(this.mInch, 0);
        this.mIsHeightSelected = true;
        saveHeightValue((int) Math.rint((dC * 100.0d) + dC2));
        refreshButtonStatus();
    }

    private void showHeightValueDialog(final int i) {
        View viewInflate = getLayoutInflater().inflate(R.layout.health_healthdata_userinfo_dialog_set_v9, (ViewGroup) null);
        final HealthNumberPicker healthNumberPicker = (HealthNumberPicker) viewInflate.findViewById(R.id.userinfo_number_picker_v9);
        ArrayList<String> arrayListCreateHeightArrays = createHeightArrays();
        healthNumberPicker.setDisplayedValues((String[]) arrayListCreateHeightArrays.toArray(new String[arrayListCreateHeightArrays.size()]));
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setMaxValue(arrayListCreateHeightArrays.size() - 1);
        HiUserInfo hiUserInfo = this.mHiUserInfo;
        if (hiUserInfo != null && hiUserInfo.getHeight() >= 50) {
            LogUtil.d(TAG, "mHiUserInfo.getHeight()=", Integer.valueOf(this.mHiUserInfo.getHeight()));
            healthNumberPicker.setValue(this.mHiUserInfo.getHeight() - 10);
        } else {
            healthNumberPicker.setValue(DEFAULT_HEIGHT);
        }
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.mainActivity);
        builder.a(getString(R.string.IDS_sns_height_title)).d(viewInflate).d(R.string.IDS_contact_confirm_ios_btn, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.GuestUserInfoGuideFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m831x5fe69232(healthNumberPicker, i, view);
            }
        }).c(R.string.IDS_settings_button_cancal_ios_btn, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.GuestUserInfoGuideFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a(GuestUserInfoGuideFragment.TAG, "showHeightValueDialog click NegativeButton");
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        customViewDialogD.show();
        this.mDialogContainers.add(customViewDialogD);
    }

    /* JADX INFO: renamed from: lambda$showHeightValueDialog$2$com-huawei-health-device-ui-measure-fragment-GuestUserInfoGuideFragment, reason: not valid java name */
    /* synthetic */ void m831x5fe69232(HealthNumberPicker healthNumberPicker, int i, View view) {
        LogUtil.a(TAG, "get hselect=", Integer.valueOf(healthNumberPicker.getValue()));
        this.mUserHeightText.setText(getString(R.string.IDS_hw_show_set_height_value_with_unit_cm, UnitUtil.e(healthNumberPicker.getValue() + 10, 1, 0)));
        this.mIsHeightSelected = true;
        saveValue(healthNumberPicker.getValue() + 10, i);
        refreshButtonStatus();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater == null) {
            LogUtil.j(TAG, "onCreateView inflater is null");
            return null;
        }
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        this.child = layoutInflater.inflate(R.layout.hygride_product_guest_measure_layout, viewGroup, false);
        this.mHiUserInfo = new HiUserInfo();
        this.mUser = new dnj();
        initView();
        initData();
        initLayout();
        initInfoText();
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
        }
        return viewGroup2;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.mIsHeightSelected = false;
        this.mIsBirthdaySelected = false;
        this.mIsGenderSelected = false;
        this.mUserGenderText.setText("");
        this.mUserBirthDayText.setText("");
        this.mUserHeightText.setText("");
        this.mBirthdayTipText.setVisibility(8);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        for (Dialog dialog : this.mDialogContainers) {
            if (dialog.isShowing()) {
                dialog.dismiss();
            }
        }
    }

    private void setUserData() {
        this.mUser.d(UUID.randomUUID().toString());
        this.mUser.e(getString(R.string.IDS_hw_device_weight_guest_measurement));
        this.mUser.c(this.mHiUserInfo.getHeight());
        this.mUser.e((byte) this.mHiUserInfo.getGender());
        this.mUser.d(this.mHiUserInfo.getBirthday());
        this.mUser.e(this.mHiUserInfo.getAge());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.mGuestMeasureCompleteText) {
            if (qrs.r()) {
                LogUtil.j(TAG, "clickRequestDeviceShareItem click too fast.");
                return;
            }
            if (this.mIsGenderSelected && this.mIsBirthdaySelected && this.mIsHeightSelected) {
                setUserData();
                if (this.mIsDeviceMeasure) {
                    startBleMeasure();
                    return;
                } else {
                    gotoWeightDetailActivity(getActivity(), this.mUser);
                    return;
                }
            }
            qpx.e(getActivity(), R.string.IDS_device_guest_measure_tip);
            return;
        }
        if (view == this.mGenderLayout) {
            showGenderPickerDialog();
            return;
        }
        if (view == this.mHeightLayout) {
            if (UnitUtil.f()) {
                LogUtil.a(TAG, "enter showInchDialog");
                showHeightInchEmuiDialog();
                return;
            } else {
                LogUtil.a(TAG, "enter showValueSetDialog()");
                showHeightValueDialog(0);
                return;
            }
        }
        if (view == this.mBirthdayLayout) {
            showDateDialog();
        } else {
            LogUtil.j(TAG, "Click invalid.");
        }
    }

    private void saveHeightValue(int i) {
        this.mHiUserInfo.setHeight(i);
    }

    private void saveValue(int i, int i2) {
        if (i2 == 0) {
            this.mHiUserInfo.setHeight(i);
        } else if (i2 == 2) {
            setUserGender(i);
        } else if (i2 == 3) {
            this.mHiUserInfo.setBirthday(i);
        } else {
            LogUtil.j(TAG, "saveValue invalid.");
        }
        this.mHiUserInfo.setCreateTime(System.currentTimeMillis());
        this.mHiUserInfo.setModifiedIntent(536870912);
    }

    private void setUserGender(int i) {
        LogUtil.d(TAG, "gender==", Integer.valueOf(i));
        HiUserInfo hiUserInfo = this.mHiUserInfo;
        if (hiUserInfo != null) {
            hiUserInfo.setGender(i);
        }
    }

    private ArrayList<String> createHeightArrays() {
        ArrayList<String> arrayList = new ArrayList<>(10);
        for (int i = 10; i < HEIGHT_FOR_INDEX_END; i++) {
            arrayList.add(getResources().getString(R.string.IDS_hw_show_set_height_value_with_unit_cm, UnitUtil.e(i, 1, 0)));
        }
        return arrayList;
    }

    private void startBleMeasure() {
        if (!(dmp.d().b(this.mUniqueId, true) instanceof efx)) {
            showSelectBindDeviceDialog();
        } else {
            gotoMeasureFragment();
        }
    }

    private void showSelectBindDeviceDialog() {
        Activity activity = BaseApplication.getActivity();
        if (activity instanceof DeviceMainActivity) {
            ((DeviceMainActivity) activity).b(this.mProductId);
        }
    }

    private void gotoMeasureFragment() {
        HealthDevice.HealthDeviceKind healthDeviceKind = this.mKind;
        if (healthDeviceKind == null) {
            LogUtil.j(TAG, "gotoMeasureFragment mKind is null");
            return;
        }
        BaseFragment baseFragmentA = dst.a(healthDeviceKind.name());
        if (baseFragmentA != null) {
            Bundle bundle = new Bundle();
            bundle.putString("view", "measure");
            bundle.putString("kind", this.mKind.name());
            bundle.putString("productId", this.mProductId);
            bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
            bundle.putString("goback", "hygride");
            bundle.putBoolean("status", false);
            bundle.putBoolean("deviceMgrMeasure", false);
            bundle.putInt("type", -1);
            bundle.putBoolean(GUEST_MEASURE, true);
            bundle.putSerializable(GUEST_USER, this.mUser);
            baseFragmentA.setArguments(bundle);
            switchFragment(baseFragmentA);
        }
    }

    private void gotoWeightDetailActivity(Context context, dnj dnjVar) {
        if (context == null) {
            LogUtil.j(TAG, "gotoWeightDetailActivity context is null");
            return;
        }
        HealthDevice healthDeviceA = drw.e().a(this.mUniqueId);
        Serializable serializable = getArguments().getSerializable(ARGUMENTS_KEY);
        if (serializable == null) {
            LogUtil.a(TAG, "gotoWeightDetailActivity serializable is null");
            return;
        }
        if (!(serializable instanceof HealthData)) {
            LogUtil.a(TAG, "saveWeightData Failed device null");
            return;
        }
        dsq.a(true);
        dnb dnbVarD = dsq.d(healthDeviceA, (HealthData) serializable, this.mUser, 10006);
        if (dnbVarD == null) {
            LogUtil.j(TAG, "weightBean is null");
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.ui.main.stories.health.activity.healthdata.WeightDetailActivity");
        constructIntentForWeight(dnbVarD, dnjVar, intent);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e(TAG, "gotoWeightDetailActivity startActivity ActivityNotFoundException occur.");
        }
        popupFragment(HagridDeviceManagerFragment.class);
    }

    private void constructIntentForWeight(dnb dnbVar, dnj dnjVar, Intent intent) {
        dnbVar.d(dxm.h.get(this.mProductId).intValue());
        dnbVar.c(this.mUniqueId);
        intent.putExtra(WEIGHT_BEAN, dnbVar);
        intent.putExtra(GUEST_MEASURE, true);
        intent.putExtra("weight", dnbVar.av());
        intent.putExtra("bodyFat", dnbVar.b());
        intent.putExtra("weightTime", dnbVar.ax());
        intent.putExtra("deleteTime", dnbVar.ax());
        if (dnbVar.aq() > 0.0d && dnbVar.aq() <= 100.0d) {
            intent.putExtra("water", dnbVar.aq());
        } else {
            intent.putExtra("water", dnbVar.ak());
        }
        intent.putExtra("deleteEndTime", dnbVar.aw());
        intent.putExtra("BITag", 1);
        intent.putExtra("resistance", dnbVar.ag());
        if (dnbVar.r() > 0) {
            intent.putExtra("userHeight", dnbVar.r());
        } else {
            intent.putExtra("userHeight", dnjVar.e());
        }
        intent.putExtra("isShowBodyFat", dnbVar.b() >= 0.5d);
        intent.putExtra("isShowInput", false);
        intent.putExtra("dataType", dnbVar.o());
    }

    private void showDateDialog() {
        if (this.mYear <= 0) {
            this.mYear = DEFAULT_YEAR;
            this.mMonth = 0;
            this.mDay = 1;
        }
        HealthDatePickerDialog healthDatePickerDialog = new HealthDatePickerDialog(getActivity(), new HealthDatePickerDialog.DateSelectedListener() { // from class: com.huawei.health.device.ui.measure.fragment.GuestUserInfoGuideFragment$$ExternalSyntheticLambda0
            @Override // com.huawei.ui.commonui.datepicker.HealthDatePickerDialog.DateSelectedListener
            public final void onDateSelected(int i, int i2, int i3) {
                this.f$0.m830xc568ba4c(i, i2, i3);
            }
        }, new GregorianCalendar(this.mYear, this.mMonth, this.mDay));
        int i = Calendar.getInstance().get(1);
        healthDatePickerDialog.e(i - 150, i);
        healthDatePickerDialog.b(true);
        healthDatePickerDialog.show();
    }

    /* JADX INFO: renamed from: lambda$showDateDialog$4$com-huawei-health-device-ui-measure-fragment-GuestUserInfoGuideFragment, reason: not valid java name */
    /* synthetic */ void m830xc568ba4c(int i, int i2, int i3) {
        if (isBirthdayValid(i, i2, i3)) {
            this.mIsBirthdaySelected = true;
            refreshBirthday(i, i2, i3);
        }
    }

    private boolean isBirthdayValid(int i, int i2, int i3) {
        if (isMoreTodayCalendar(i, i2, i3)) {
            qpx.b(this.mainActivity.getApplicationContext(), getString(R.string.IDS_hw_show_no_choose_birthday_after_now));
            return false;
        }
        int i4 = (dxm.q(this.mProductId) || dxm.u(this.mProductId) || dxm.v(this.mProductId) || !Utils.o()) ? 80 : 65;
        int i5 = (!dor.b(this.mUniqueId) || Utils.o()) ? 18 : 6;
        int age = getAge(i, i2, i3);
        if (age < i5 || age > i4) {
            this.mBirthdayTipText.setText(String.format(Locale.ENGLISH, getString(R.string.IDS_device_age_tips, Integer.valueOf(i5), Integer.valueOf(i4)), new Object[0]));
            this.mBirthdayTipText.setVisibility(0);
            return true;
        }
        this.mBirthdayTipText.setVisibility(8);
        return true;
    }

    private void refreshBirthday(int i, int i2, int i3) {
        this.mYear = i;
        this.mMonth = i2;
        this.mDay = i3;
        saveValue(parseIntData(this.mYear + String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.mMonth + 1)) + String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.mDay))), 3);
        this.mHiUserInfo.setAge(getAge(i, i2, i3));
        updateBirthdayTextView();
        refreshButtonStatus();
    }

    private int getAge(int i, int i2, int i3) {
        if (isMoreTodayCalendar(i, i2, i3)) {
            return 0;
        }
        Calendar calendar = Calendar.getInstance();
        int i4 = calendar.get(1);
        int i5 = i4 - i;
        int i6 = calendar.get(2) - i2;
        return (i6 < 0 || (i6 == 0 && calendar.get(5) - i3 < 0)) ? i5 - 1 : i5;
    }

    private void updateBirthdayTextView() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.mYear, this.mMonth, this.mDay);
        this.mUserBirthDayText.setText(UnitUtil.a(calendar.getTime(), 20));
        refreshButtonStatus();
    }

    private boolean isMoreTodayCalendar(int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        int i4 = calendar.get(1);
        int i5 = calendar.get(2);
        int i6 = calendar.get(5);
        if (i > i4) {
            return true;
        }
        if (i != i4 || i2 <= i5) {
            return i == i4 && i2 == i5 && i3 > i6;
        }
        return true;
    }

    private boolean isOverLimit(int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        int i4 = calendar.get(1);
        int i5 = calendar.get(2);
        int i6 = calendar.get(5);
        if (i < i4) {
            return true;
        }
        if (i != i4 || i2 >= i5) {
            return i == i4 && i2 == i5 && i3 < i6;
        }
        return true;
    }

    private void showGenderPickerDialog() {
        LogUtil.a(TAG, "showGenderPickerDialog()");
        View viewInflate = getActivity().getSystemService("layout_inflater") instanceof LayoutInflater ? ((LayoutInflater) getActivity().getSystemService("layout_inflater")).inflate(R.layout.hw_show_guest_settings_gender_view, (ViewGroup) null) : null;
        if (viewInflate != null) {
            CustomViewDialog.Builder builder = new CustomViewDialog.Builder(getActivity());
            builder.a(getString(R.string.IDS_hw_show_set_gender)).d(viewInflate).c(getString(R.string.IDS_settings_button_cancal_ios_btn), new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.GuestUserInfoGuideFragment$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.a(GuestUserInfoGuideFragment.TAG, "showGenderPickerDialog click negative button.");
                }
            });
            this.mDialogGender = builder.d();
            if (!initializeGenderDialogLayout(viewInflate)) {
                this.mDialogGender = null;
                LogUtil.j(TAG, "initializeGenderDialogLayout is fail");
            } else {
                this.mDialogGender.show();
            }
        }
    }

    public void dealGenderClicked(int i) {
        refreshGenderImageView(i);
        Dialog dialog = this.mDialogGender;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.mIsGenderSelected = true;
        saveValue(i, 2);
        this.mGender = i;
        refreshGenderText(i);
    }

    private boolean initializeGenderDialogLayout(View view) {
        LogUtil.a(TAG, "initializeGenderDialogLayout()");
        if (view == null) {
            LogUtil.j(TAG, "initializeGenderDialogLayout contentView is null");
            return false;
        }
        this.mGenderMaleImgView = (HealthRadioButton) view.findViewById(R.id.settings_gender_imgview1);
        this.mGenderFemaleImgView = (HealthRadioButton) view.findViewById(R.id.settings_gender_imgview2);
        this.mSettingsGenderMale = (RelativeLayout) view.findViewById(R.id.settings_gender_view_layout1);
        this.mSettingsGenderFemale = (RelativeLayout) view.findViewById(R.id.settings_gender_view_layout2);
        this.mSettingsGenderMale.setOnClickListener(new dva(this, 1));
        this.mSettingsGenderFemale.setOnClickListener(new dva(this, 0));
        refreshGenderImageView(1);
        refreshGenderImageViewLayout();
        return true;
    }

    private void refreshButtonStatus() {
        String strTrim = this.mUserGenderText.getText().toString().trim();
        String strTrim2 = this.mUserBirthDayText.getText().toString().trim();
        String strTrim3 = this.mUserHeightText.getText().toString().trim();
        if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2) && !TextUtils.isEmpty(strTrim3)) {
            this.mGuestMeasureCompleteText.setEnabled(true);
        } else {
            this.mGuestMeasureCompleteText.setEnabled(false);
        }
    }

    private void refreshGenderImageView(int i) {
        if (i == 0) {
            this.mGenderMaleImgView.setChecked(false);
            this.mGenderFemaleImgView.setChecked(true);
        } else if (i == 1) {
            this.mGenderMaleImgView.setChecked(true);
            this.mGenderFemaleImgView.setChecked(false);
        } else if (i == 2) {
            this.mGenderMaleImgView.setChecked(false);
            this.mGenderFemaleImgView.setChecked(false);
        } else {
            this.mGenderMaleImgView.setChecked(true);
            this.mGenderFemaleImgView.setChecked(false);
        }
    }

    private void refreshGenderText(int i) {
        if (i == 0) {
            this.mUserGenderText.setText(this.mGenderFemale);
            if (!this.mIsHeightSelected) {
                this.mHiUserInfo.setHeight(170);
            }
        } else if (i == 1) {
            this.mUserGenderText.setText(this.mGenderMale);
            if (!this.mIsHeightSelected) {
                this.mHiUserInfo.setHeight(170);
            }
        } else {
            this.mUserGenderText.setText(this.mGenderMale);
        }
        refreshButtonStatus();
    }

    private void refreshGenderImageViewLayout() {
        refreshGenderImageView(this.mGender);
    }

    private int parseIntData(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        popupFragment(HagridDeviceManagerFragment.class);
        return false;
    }
}
