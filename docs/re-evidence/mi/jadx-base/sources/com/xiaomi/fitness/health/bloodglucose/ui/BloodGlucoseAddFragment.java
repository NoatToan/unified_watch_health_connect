package com.xiaomi.fitness.health.bloodglucose.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.DateTimePickerDialog;
import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import com.xiaomi.fitness.baseui.dialog.PickerStringDialog;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.dialog.FloatNumberPickerDialog;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.bloodglucose.holder.BloodGlucoseAdapter;
import defpackage.a3a;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.k5g;
import defpackage.qxi;
import defpackage.wc0;
import defpackage.yaa;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 [2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001[B\u0007¢\u0006\u0004\bZ\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0006J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0006J/\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010'J!\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0004¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010,\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010\u0006J'\u00101\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u00100\u001a\u00020 H\u0016¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u00020\u00042\b\u00103\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\"\u00109\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010\nR\"\u0010>\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\u000eR\"\u0010C\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010\u0012R\"\u0010H\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010PR\u001c\u0010S\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010?R\u0016\u0010V\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010IR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006\\"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/ui/BloodGlucoseAddFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Lyaa;", "Landroid/view/View$OnClickListener;", "", "initActionBar", "()V", "", "recordTimeMills", "updateRecordTime", "(J)V", "", "newBloodGlucose", "updateBloodGlucoseText", "(F)V", "", "newMealTime", "updateMealTimeText", "(Ljava/lang/String;)V", "onRecordTimeClick", "onRecordMealTimeClick", "Landroid/content/Context;", "context", "timestamp", "", "getBloodGlucoseTypesByTimestamp", "(Landroid/content/Context;J)Ljava/util/List;", "onBloodGlucoseClick", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "exitEdit", "finishEdit", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "v", "onClick", "(Landroid/view/View;)V", "La3a;", "mBinding", "La3a;", "mRecordTimeMills", "J", "getMRecordTimeMills", "()J", "setMRecordTimeMills", "mSelectedBloodGlucose", "F", "getMSelectedBloodGlucose", "()F", "setMSelectedBloodGlucose", "mSelectedMealTime", "Ljava/lang/String;", "getMSelectedMealTime", "()Ljava/lang/String;", "setMSelectedMealTime", "mSelectedMealTimeAdd", "I", "getMSelectedMealTimeAdd", "()I", "setMSelectedMealTimeAdd", "(I)V", "Landroid/widget/TextView;", "mTvRecordTime", "Landroid/widget/TextView;", "mTvBloodGlucose", "mTvMealTime", "mealTimeResArray", "Ljava/util/List;", "initBloodSugarValue", "initBloodSugarMealIndex", "Lk5g$a;", "mMiuiEditModeActionBarListener", "Lk5g$a;", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class BloodGlucoseAddFragment extends BaseFragment implements yaa, View.OnClickListener {
    public static final int REQ_BLOOD_GLUCOSE = 2;
    public static final int REQ_MEAL_TIME = 3;
    public static final int REQ_MEAL_TIME_ADD = 4;
    public static final int REQ_RECORD_TIME = 1;
    private int initBloodSugarMealIndex;
    private float initBloodSugarValue;

    @Nullable
    private a3a mBinding;

    @NotNull
    private final k5g.a mMiuiEditModeActionBarListener;
    private long mRecordTimeMills;
    private float mSelectedBloodGlucose;

    @NotNull
    private String mSelectedMealTime;
    private int mSelectedMealTimeAdd;

    @Nullable
    private TextView mTvBloodGlucose;

    @Nullable
    private TextView mTvMealTime;

    @Nullable
    private TextView mTvRecordTime;

    @NotNull
    private List<String> mealTimeResArray;

    public BloodGlucoseAddFragment() {
        super(0, 1, null);
        this.mRecordTimeMills = -1L;
        this.mSelectedMealTime = "";
        this.mSelectedMealTimeAdd = -1;
        this.mealTimeResArray = CollectionsKt__CollectionsKt.emptyList();
        this.initBloodSugarValue = 5.0f;
        this.mMiuiEditModeActionBarListener = new k5g.a() { // from class: com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseAddFragment$mMiuiEditModeActionBarListener$1
            @Override // k5g.a
            public void onCancelClicked(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                this.this$0.exitEdit();
            }

            @Override // k5g.a
            public void onSaveClicked(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                this.this$0.finishEdit();
            }
        };
    }

    private final List<String> getBloodGlucoseTypesByTimestamp(Context context, long timestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);
        int i = calendar.get(11);
        if (i >= 0 && i < 5) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{context.getString(c0j.l0), context.getString(c0j.i0), context.getString(c0j.V0)});
        }
        if (5 <= i && i < 10) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{context.getString(c0j.Q0), context.getString(c0j.l0), context.getString(c0j.V0)});
        }
        if (10 <= i && i < 12) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{context.getString(c0j.Q0), context.getString(c0j.U0), context.getString(c0j.S0), context.getString(c0j.V0)});
        }
        if (12 <= i && i < 16) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{context.getString(c0j.U0), context.getString(c0j.S0), context.getString(c0j.T0), context.getString(c0j.V0)});
        }
        if (16 > i || i >= 18) {
            return (18 > i || i >= 24) ? CollectionsKt__CollectionsKt.emptyList() : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{context.getString(c0j.T0), context.getString(c0j.R0), context.getString(c0j.f0), context.getString(c0j.V0)});
        }
        return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{context.getString(c0j.S0), context.getString(c0j.T0), context.getString(c0j.R0), context.getString(c0j.V0)});
    }

    private final void initActionBar() {
        wc0 actionBar = getActionBar();
        Context context = getContext();
        if (context == null || actionBar == null) {
            return;
        }
        k5g.d(context, actionBar, c0j.d5, this.mMiuiEditModeActionBarListener);
    }

    private final void onBloodGlucoseClick() {
        FloatNumberPickerDialog floatNumberPickerDialogCreate = new FloatNumberPickerDialog.b("blood_glucose").setCustomLayoutId(jui.e7).setCustomTitleId(jui.p).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).create();
        floatNumberPickerDialogCreate.setRequestCode(2);
        floatNumberPickerDialogCreate.T(false);
        int i = c0j.p1;
        int i2 = c0j.b0;
        floatNumberPickerDialogCreate.R(9);
        floatNumberPickerDialogCreate.S(0);
        floatNumberPickerDialogCreate.setTitle(i2);
        floatNumberPickerDialogCreate.U(25.0f);
        floatNumberPickerDialogCreate.V(2.0f);
        floatNumberPickerDialogCreate.X(this.initBloodSugarValue);
        floatNumberPickerDialogCreate.W(i);
        floatNumberPickerDialogCreate.showIfNeed(getChildFragmentManager());
    }

    private final void onRecordMealTimeClick() {
        PickerStringDialog.b bVarC;
        PickerStringDialog pickerStringDialogCreate = new PickerStringDialog.b("meal_time").setCustomLayoutId(jui.m7).setPositiveText(c0j.e).setNegativeText(c0j.c).setCancelable(false).setDialogTitle(c0j.pp).create();
        BloodGlucoseAdapter bloodGlucoseAdapter = new BloodGlucoseAdapter();
        bloodGlucoseAdapter.setListValue(this.mealTimeResArray);
        PickerStringDialog.b bVarA = pickerStringDialogCreate.buildUpon();
        if (bVarA != null && (bVarC = bVarA.c(bloodGlucoseAdapter)) != null) {
            bVarC.create();
        }
        pickerStringDialogCreate.F(this.mealTimeResArray.get(this.initBloodSugarMealIndex));
        pickerStringDialogCreate.E(this.initBloodSugarMealIndex);
        pickerStringDialogCreate.setRequestCode(3);
        pickerStringDialogCreate.showIfNeed(getChildFragmentManager());
    }

    private final void onRecordTimeClick() {
        DateTimePickerDialog dateTimePickerDialogCreate = new DateTimePickerDialog.a("time_picker").setCustomLayoutId(jui.Y6).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(c0j.pp).create();
        dateTimePickerDialogCreate.setRequestCode(1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.add(1, -10);
        dateTimePickerDialogCreate.B(calendar.getTimeInMillis());
        dateTimePickerDialogCreate.A(jCurrentTimeMillis);
        dateTimePickerDialogCreate.y(this.mRecordTimeMills);
        dateTimePickerDialogCreate.showIfNeed(getChildFragmentManager());
    }

    private final void updateBloodGlucoseText(float newBloodGlucose) {
        String quantityString;
        if (newBloodGlucose == 0.0f) {
            return;
        }
        this.mSelectedBloodGlucose = newBloodGlucose;
        Context context = getContext();
        if (context != null) {
            int i = qxi.e;
            int i2 = (int) this.mSelectedBloodGlucose;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.getDefault(), "%1$.1f", Arrays.copyOf(new Object[]{Float.valueOf(newBloodGlucose)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            quantityString = ResourceExtKt.getQuantityString(context, i, i2, str);
        } else {
            quantityString = null;
        }
        TextView textView = this.mTvBloodGlucose;
        Intrinsics.checkNotNull(textView);
        textView.setText(quantityString);
    }

    private final void updateMealTimeText(String newMealTime) {
        if (Intrinsics.areEqual(newMealTime, "")) {
            return;
        }
        this.mSelectedMealTime = newMealTime;
        TextView textView = this.mTvMealTime;
        Intrinsics.checkNotNull(textView);
        textView.setText(this.mSelectedMealTime);
    }

    private final void updateRecordTime(long recordTimeMills) {
        if (recordTimeMills == 0) {
            return;
        }
        this.mRecordTimeMills = recordTimeMills;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        List<String> bloodGlucoseTypesByTimestamp = getBloodGlucoseTypesByTimestamp(contextRequireContext, this.mRecordTimeMills);
        if (!Intrinsics.areEqual(bloodGlucoseTypesByTimestamp, this.mealTimeResArray)) {
            this.mealTimeResArray = bloodGlucoseTypesByTimestamp;
            this.initBloodSugarMealIndex = 0;
        }
        updateMealTimeText(this.mealTimeResArray.get(this.initBloodSugarMealIndex));
        String date = TimeUtils.formatDate(getString(c0j.p), Long.valueOf(recordTimeMills));
        TextView textView = this.mTvRecordTime;
        Intrinsics.checkNotNull(textView);
        textView.setText(date);
    }

    public final void exitEdit() {
        requireActivity().lambda$onCreate$0();
    }

    public void finishEdit() {
        exitEdit();
    }

    public final long getMRecordTimeMills() {
        return this.mRecordTimeMills;
    }

    public final float getMSelectedBloodGlucose() {
        return this.mSelectedBloodGlucose;
    }

    @NotNull
    public final String getMSelectedMealTime() {
        return this.mSelectedMealTime;
    }

    public final int getMSelectedMealTimeAdd() {
        return this.mSelectedMealTimeAdd;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        if (v == null) {
            return;
        }
        int id = v.getId();
        if (id == eri.ke) {
            onBloodGlucoseClick();
        } else if (id == eri.pe) {
            onRecordTimeClick();
        } else if (id == eri.oe) {
            onRecordMealTimeClick();
        }
    }

    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (resultCode == -1) {
            if (requestCode == 1) {
                updateRecordTime(data.getLong("key_select_mills", System.currentTimeMillis()));
                return;
            }
            if (requestCode == 2) {
                float f = data.getFloat("key_value", 0.0f);
                if (f == 0.0f) {
                    return;
                }
                this.initBloodSugarValue = f;
                updateBloodGlucoseText(f);
                return;
            }
            if (requestCode != 3) {
                if (requestCode != 4) {
                    return;
                }
                this.mSelectedMealTimeAdd = 1;
                finishEdit();
                return;
            }
            int i = data.getInt(PickerDialog.KEY_SELECTED_VALUE, -1);
            if (i < 0 || i >= this.mealTimeResArray.size()) {
                return;
            }
            this.initBloodSugarMealIndex = i;
            updateMealTimeText(this.mealTimeResArray.get(i));
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @Nullable
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        a3a a3aVarA0 = a3a.A0(inflater, container, false);
        this.mBinding = a3aVarA0;
        if (a3aVarA0 != null) {
            return a3aVarA0.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putLong("1", this.mRecordTimeMills);
        outState.putFloat("2", this.mSelectedBloodGlucose);
        outState.putInt("3", this.initBloodSugarMealIndex);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initActionBar();
        setTitle(c0j.o5);
        a3a a3aVar = this.mBinding;
        Intrinsics.checkNotNull(a3aVar);
        RelativeLayout rlRecordTime = a3aVar.F;
        Intrinsics.checkNotNullExpressionValue(rlRecordTime, "rlRecordTime");
        a3a a3aVar2 = this.mBinding;
        Intrinsics.checkNotNull(a3aVar2);
        RelativeLayout rlBloodGlucose = a3aVar2.D;
        Intrinsics.checkNotNullExpressionValue(rlBloodGlucose, "rlBloodGlucose");
        a3a a3aVar3 = this.mBinding;
        Intrinsics.checkNotNull(a3aVar3);
        RelativeLayout rlMealTime = a3aVar3.E;
        Intrinsics.checkNotNullExpressionValue(rlMealTime, "rlMealTime");
        rlRecordTime.setOnClickListener(this);
        rlBloodGlucose.setOnClickListener(this);
        rlMealTime.setOnClickListener(this);
        this.mRecordTimeMills = savedInstanceState != null ? savedInstanceState.getLong("1", System.currentTimeMillis()) : System.currentTimeMillis();
        a3a a3aVar4 = this.mBinding;
        Intrinsics.checkNotNull(a3aVar4);
        this.mTvRecordTime = a3aVar4.M;
        a3a a3aVar5 = this.mBinding;
        Intrinsics.checkNotNull(a3aVar5);
        this.mTvBloodGlucose = a3aVar5.I;
        a3a a3aVar6 = this.mBinding;
        Intrinsics.checkNotNull(a3aVar6);
        this.mTvMealTime = a3aVar6.K;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.mealTimeResArray = getBloodGlucoseTypesByTimestamp(contextRequireContext, this.mRecordTimeMills);
        updateRecordTime(this.mRecordTimeMills);
        this.initBloodSugarValue = savedInstanceState != null ? savedInstanceState.getFloat("2", this.initBloodSugarValue) : this.initBloodSugarValue;
        this.initBloodSugarMealIndex = savedInstanceState != null ? savedInstanceState.getInt("3", this.initBloodSugarMealIndex) : this.initBloodSugarMealIndex;
        updateBloodGlucoseText(this.initBloodSugarValue);
        updateMealTimeText(this.mealTimeResArray.get(this.initBloodSugarMealIndex));
    }

    public final void setMRecordTimeMills(long j) {
        this.mRecordTimeMills = j;
    }

    public final void setMSelectedBloodGlucose(float f) {
        this.mSelectedBloodGlucose = f;
    }

    public final void setMSelectedMealTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mSelectedMealTime = str;
    }

    public final void setMSelectedMealTimeAdd(int i) {
        this.mSelectedMealTimeAdd = i;
    }
}
