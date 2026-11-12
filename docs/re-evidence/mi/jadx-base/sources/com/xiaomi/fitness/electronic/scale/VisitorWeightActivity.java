package com.xiaomi.fitness.electronic.scale;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.electronic.scale.VisitorWeightActivity;
import com.xiaomi.fitness.electronic.scale.adapter.HeightAdapter;
import com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil;
import com.xiaomi.fitness.electronic.scale.widget.ElectronicScaleSingleChoiceDialog;
import defpackage.av1;
import defpackage.av6;
import defpackage.bri;
import defpackage.gui;
import defpackage.vk0;
import defpackage.wc0;
import defpackage.yaa;
import defpackage.zee;
import defpackage.zp5;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import miuix.androidbasewidget.widget.EditText;
import miuix.pickerwidget.widget.DatePicker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 :2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001:B\u0007¢\u0006\u0004\b9\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0007J\u0019\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001c\u0010\u0007J\u000f\u0010\u001d\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010#\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010$\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010 R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00105¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/VisitorWeightActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/VisitorWeightViewModel;", "Lvk0;", "Lyaa;", "", "initView", "()V", "checkMeasure", "", "isAllInfo", "()Z", "Lorg/joda/time/LocalDate;", "", "getZeroMills", "(Lorg/joda/time/LocalDate;)J", "registerReceivers", "unRegisterReceivers", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_DESTROY, "", "TAG", "Ljava/lang/String;", "GENDER_NAME", "HEIGHT_NAME", "NICK_NAME", "REQ_GENDER", "I", "REQ_HEIGHT", "Lcom/xiaomi/fitness/electronic/scale/widget/ElectronicScaleSingleChoiceDialog;", "mGenderDialog", "Lcom/xiaomi/fitness/electronic/scale/widget/ElectronicScaleSingleChoiceDialog;", "Lzp5;", "mBirthdayDialog", "Lzp5;", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "mHeightDialog", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "mDid", "Landroid/content/BroadcastReceiver;", "closeVisitorReceiver", "Landroid/content/BroadcastReceiver;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class VisitorWeightActivity extends Hilt_VisitorWeightActivity<VisitorWeightViewModel, vk0> implements yaa {

    @NotNull
    public static final String CLOSE_ACTIVITY_FLAG = "closeVisitorActivity";

    @Nullable
    private zp5 mBirthdayDialog;

    @Nullable
    private String mDid;

    @Nullable
    private ElectronicScaleSingleChoiceDialog mGenderDialog;

    @Nullable
    private PickerDialog mHeightDialog;

    @NotNull
    private final String TAG = "VisitorWeightActivity";

    @NotNull
    private final String GENDER_NAME = "electronic_gender_dialog";

    @NotNull
    private final String HEIGHT_NAME = "electronic_height_dialog";

    @NotNull
    private final String NICK_NAME = "electronic_name_dialog";
    private final int REQ_GENDER = 10;
    private final int REQ_HEIGHT = 20;

    @NotNull
    private final BroadcastReceiver closeVisitorReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.electronic.scale.VisitorWeightActivity$closeVisitorReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.this$0.finish();
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ vk0 access$getMBinding(VisitorWeightActivity visitorWeightActivity) {
        return (vk0) visitorWeightActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ VisitorWeightViewModel access$getMViewModel(VisitorWeightActivity visitorWeightActivity) {
        return (VisitorWeightViewModel) visitorWeightActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void checkMeasure() {
        if (isAllInfo()) {
            ((vk0) getMBinding()).D.setAlpha(1.0f);
        } else {
            ((vk0) getMBinding()).D.setAlpha(0.6f);
        }
    }

    private final long getZeroMills(LocalDate localDate) {
        return TimeDateUtil.changZeroOfTheDay(localDate) * ((long) 1000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setTitle(getString(zzi.I5));
        }
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        this.mDid = getIntent().getStringExtra("did");
        ((vk0) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: y0r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VisitorWeightActivity.initView$lambda$0(this.f39666a, view);
            }
        });
        ((vk0) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: z0r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VisitorWeightActivity.initView$lambda$1(this.f40765a, view);
            }
        });
        ((vk0) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: a1r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VisitorWeightActivity.initView$lambda$4(this.f536a, view);
            }
        });
        ((vk0) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: b1r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VisitorWeightActivity.initView$lambda$5(this.f3698a, view);
            }
        });
        ((vk0) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: c1r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VisitorWeightActivity.initView$lambda$6(this.f4840a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$0(final VisitorWeightActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View viewInflate = LayoutInflater.from(this$0).inflate(gui.s0, (ViewGroup) null);
        final EditText editText = (EditText) viewInflate.findViewById(bri.d1);
        if (Intrinsics.areEqual(((VisitorWeightViewModel) this$0.getMViewModel()).getNickName(), this$0.getString(zzi.f4))) {
            editText.setText("");
        } else {
            editText.setText(((VisitorWeightViewModel) this$0.getMViewModel()).getNickName());
        }
        editText.setFilters(new InputFilter[]{new zee(10)});
        new CommonDialog.c(this$0.NICK_NAME).setDialogTitle(zzi.d4).setNegativeText(zzi.f41831b).setPositiveText(zzi.c).setCustomView(viewInflate).setCanceledOnTouchOutside(true).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.VisitorWeightActivity$initView$1$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    this$0.checkMeasure();
                } else if (which == -1) {
                    String strValueOf = String.valueOf(editText.getText());
                    VisitorWeightActivity.access$getMViewModel(this$0).setNickName(strValueOf);
                    VisitorWeightActivity.access$getMBinding(this$0).E.setRemindText(strValueOf);
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    this$0.checkMeasure();
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).showIfNeed(this$0.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$1(VisitorWeightActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = 1;
        if (this$0.mGenderDialog == null) {
            ElectronicScaleSingleChoiceDialog electronicScaleSingleChoiceDialogCreate = new ElectronicScaleSingleChoiceDialog.c(this$0.GENDER_NAME).setCustomLayoutId(gui.z0).setDialogTitle(zzi.U4).setCancelable(true).setCanceledOnTouchOutside(true).create();
            this$0.mGenderDialog = electronicScaleSingleChoiceDialogCreate;
            int[] iArr = {zzi.W4, zzi.V4};
            if (electronicScaleSingleChoiceDialogCreate != null) {
                electronicScaleSingleChoiceDialogCreate.H(iArr);
            }
            ElectronicScaleSingleChoiceDialog electronicScaleSingleChoiceDialog = this$0.mGenderDialog;
            if (electronicScaleSingleChoiceDialog != null) {
                electronicScaleSingleChoiceDialog.setRequestCode(this$0.REQ_GENDER);
            }
        }
        ElectronicScaleSingleChoiceDialog electronicScaleSingleChoiceDialog2 = this$0.mGenderDialog;
        if (electronicScaleSingleChoiceDialog2 != null) {
            electronicScaleSingleChoiceDialog2.showIfNeed(this$0.getSupportFragmentManager());
        }
        String sex = ((VisitorWeightViewModel) this$0.getMViewModel()).getSex();
        if (Intrinsics.areEqual(sex, this$0.getString(zzi.V4))) {
            i = 2;
        } else if (!Intrinsics.areEqual(sex, this$0.getString(zzi.W4))) {
            i = 0;
        }
        ElectronicScaleSingleChoiceDialog electronicScaleSingleChoiceDialog3 = this$0.mGenderDialog;
        if (electronicScaleSingleChoiceDialog3 != null) {
            electronicScaleSingleChoiceDialog3.G(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$4(final VisitorWeightActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LocalDate localDate = new LocalDate(((VisitorWeightViewModel) this$0.getMViewModel()).birthStringToMillis());
        zp5 zp5Var = new zp5(this$0, new zp5.d() { // from class: x0r
            @Override // zp5.d
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                VisitorWeightActivity.initView$lambda$4$lambda$2(this.f38557a, datePicker, i, i2, i3);
            }
        }, localDate.getYear(), localDate.getMonthOfYear() - 1, localDate.getDayOfMonth());
        DatePicker datePickerH = zp5Var.H();
        zp5Var.setTitle(zzi.h0);
        long[] birthdayRange = ((VisitorWeightViewModel) this$0.getMViewModel()).getBirthdayRange();
        datePickerH.setMinDate(birthdayRange != null ? birthdayRange[0] : 0L);
        long[] birthdayRange2 = ((VisitorWeightViewModel) this$0.getMViewModel()).getBirthdayRange();
        datePickerH.setMaxDate(birthdayRange2 != null ? birthdayRange2[1] : 0L);
        this$0.mBirthdayDialog = zp5Var;
        zp5Var.K(false);
        zp5 zp5Var2 = this$0.mBirthdayDialog;
        if (zp5Var2 != null) {
            zp5Var2.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$4$lambda$2(VisitorWeightActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        long zeroMills = this$0.getZeroMills(new LocalDate(i, i2 + 1, i3));
        WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
        String dateToString = weightInfoUtil.getDateToString(zeroMills, "yyyy-MM-dd");
        VisitorWeightViewModel visitorWeightViewModel = (VisitorWeightViewModel) this$0.getMViewModel();
        Intrinsics.checkNotNull(dateToString);
        visitorWeightViewModel.setBirthday(dateToString);
        Logger.i(this$0.TAG, "age : " + weightInfoUtil.getAge(weightInfoUtil.parseDate(dateToString)));
        ((vk0) this$0.getMBinding()).A.setRemindText(dateToString);
        this$0.checkMeasure();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$5(final VisitorWeightActivity this$0, View view) {
        PickerDialog.b bVarBuildUpon;
        PickerDialog.b bVarC;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mHeightDialog == null) {
            PickerDialog pickerDialogCreate = new PickerDialog.b(this$0.HEIGHT_NAME).setCustomLayoutId(gui.y0).setPositiveText(zzi.c).setNegativeText(zzi.f41831b).setDialogTitle(zzi.A3).setCancelable(true).setCanceledOnTouchOutside(true).create();
            this$0.mHeightDialog = pickerDialogCreate;
            if (pickerDialogCreate != null && (bVarBuildUpon = pickerDialogCreate.buildUpon()) != null && (bVarC = bVarBuildUpon.c(new HeightAdapter())) != null) {
                bVarC.create();
            }
            PickerDialog pickerDialog = this$0.mHeightDialog;
            if (pickerDialog != null) {
                pickerDialog.setRequestCode(this$0.REQ_HEIGHT);
            }
        }
        int i = Intrinsics.areEqual(((VisitorWeightViewModel) this$0.getMViewModel()).getHeight(), this$0.getString(zzi.f4)) ? 170 : Integer.parseInt(((VisitorWeightViewModel) this$0.getMViewModel()).getHeight());
        PickerDialog pickerDialog2 = this$0.mHeightDialog;
        if (pickerDialog2 != null) {
            pickerDialog2.setValue(i);
        }
        PickerDialog pickerDialog3 = this$0.mHeightDialog;
        if (pickerDialog3 != null) {
            pickerDialog3.setPickerHintText(this$0.getString(zzi.w0));
        }
        PickerDialog pickerDialog4 = this$0.mHeightDialog;
        if (pickerDialog4 != null) {
            pickerDialog4.showIfNeed(this$0.getSupportFragmentManager());
        }
        PickerDialog pickerDialog5 = this$0.mHeightDialog;
        Intrinsics.checkNotNull(pickerDialog5 != null ? pickerDialog5.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.VisitorWeightActivity$initView$4$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                PickerDialog pickerDialog6 = this.this$0.mHeightDialog;
                Integer numValueOf = pickerDialog6 != null ? Integer.valueOf(pickerDialog6.getValue()) : null;
                Intrinsics.checkNotNull(numValueOf);
                int iIntValue = numValueOf.intValue();
                if (which == -1) {
                    VisitorWeightActivity.access$getMViewModel(this.this$0).setHeight(String.valueOf(iIntValue));
                    VisitorWeightActivity.access$getMBinding(this.this$0).B.setRemindText(iIntValue + this.this$0.getString(zzi.w0));
                }
                this.this$0.checkMeasure();
            }
        }) : null, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$6(VisitorWeightActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = this$0.mDid;
        Intrinsics.checkNotNull(str);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(str);
        if (ecoDeviceModel != null && !ecoDeviceModel.isDeviceConnected()) {
            ToastUtil.INSTANCE.showToast(zzi.F4);
            return;
        }
        if (!this$0.isAllInfo()) {
            ToastUtil.showToast(this$0.getString(zzi.I));
            return;
        }
        if (Integer.parseInt(((VisitorWeightViewModel) this$0.getMViewModel()).getHeight()) > 220) {
            ToastUtil.showToast(this$0.getString(zzi.S3));
            return;
        }
        Intent intent = new Intent(this$0, (Class<?>) WeightGuideActivity.class);
        intent.putExtra("electronic_weight_type", WeightActivity.WEIGHT_TYPE_VISITOR);
        intent.putExtra(WeightActivity.KEY_WEIGHT_NICK_NAME, ((VisitorWeightViewModel) this$0.getMViewModel()).getNickName());
        intent.putExtra("electronic_weight_sex", ((VisitorWeightViewModel) this$0.getMViewModel()).getSexInt());
        intent.putExtra(WeightActivity.KEY_WEIGHT_BIRTHDAY, ((VisitorWeightViewModel) this$0.getMViewModel()).getBirthday());
        intent.putExtra("electronic_weight_height", Integer.parseInt(((VisitorWeightViewModel) this$0.getMViewModel()).getHeight()));
        intent.putExtra("did", this$0.mDid);
        Logger.i("VisitorMeasure VisitorWeightActivity nickname: " + ((VisitorWeightViewModel) this$0.getMViewModel()).getNickName() + "  sex: " + ((VisitorWeightViewModel) this$0.getMViewModel()).getSexInt() + " birthday: " + ((VisitorWeightViewModel) this$0.getMViewModel()).getBirthday() + " height: " + Integer.parseInt(((VisitorWeightViewModel) this$0.getMViewModel()).getHeight()), new Object[0]);
        this$0.startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isAllInfo() {
        String string;
        return (Intrinsics.areEqual(((VisitorWeightViewModel) getMViewModel()).getNickName(), getString(zzi.f4)) || (string = StringsKt__StringsKt.trim((CharSequence) ((VisitorWeightViewModel) getMViewModel()).getNickName()).toString()) == null || string.length() == 0 || Intrinsics.areEqual(((VisitorWeightViewModel) getMViewModel()).getSex(), getString(zzi.f4)) || Intrinsics.areEqual(((VisitorWeightViewModel) getMViewModel()).getBirthday(), getString(zzi.f4)) || Intrinsics.areEqual(((VisitorWeightViewModel) getMViewModel()).getHeight(), getString(zzi.f4))) ? false : true;
    }

    private final void registerReceivers() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(CLOSE_ACTIVITY_FLAG);
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.closeVisitorReceiver, intentFilter, 4);
        } else {
            registerReceiver(this.closeVisitorReceiver, intentFilter);
        }
    }

    private final void unRegisterReceivers() {
        unregisterReceiver(this.closeVisitorReceiver);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.w;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.d;
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_VisitorWeightActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        registerReceivers();
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_VisitorWeightActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unRegisterReceivers();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == this.REQ_GENDER) {
            int i = data.getInt("selected_option", 0);
            if (i != 0) {
                ((VisitorWeightViewModel) getMViewModel()).setSex(i);
                ((vk0) getMBinding()).G.setRemindText(((VisitorWeightViewModel) getMViewModel()).getSex());
            }
            checkMeasure();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        checkMeasure();
    }
}
