package com.xiaomi.fitness.training_plan.widget;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.dialog.a;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import com.xiaomi.fitness.training_plan.widget.AbilityDaySettingsDialog;
import defpackage.chi;
import defpackage.csi;
import defpackage.cyi;
import defpackage.jvi;
import defpackage.k1j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\f*\u0001\u0016\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004,-./B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J,\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0$2\u0006\u0010\u0012\u001a\u00020\u000eJ\u0012\u0010%\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010\u001fH\u0002J\u0016\u0010'\u001a\b\u0018\u00010\u0006R\u00020\u00002\u0006\u0010(\u001a\u00020\u000eH\u0002J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u000eH\u0014J\u0012\u0010+\u001a\u0004\u0018\u00010\u00142\u0006\u0010(\u001a\u00020\u000eH\u0002R\u0014\u0010\u0005\u001a\b\u0018\u00010\u0006R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0018\u00010\u0006R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0018\u00010\u0006R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0018\u00010\u0006R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0018\u00010\u0006R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0018\u00010\u0006R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0017¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/AbilityDaySettingsDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "<init>", "()V", "mondayHolder", "Lcom/xiaomi/fitness/training_plan/widget/AbilityDaySettingsDialog$DayHolder;", "tuesdayHolder", "wednesdayHolder", "thursdayHolder", "fridayHolder", "saturdayHolder", "sundayHolder", "maxSelectedNum", "", "minSelectedNum", "selectedDays", "Ljava/util/ArrayList;", "titleRes", "tipString", "", "onDayCheckedChangedLister", "com/xiaomi/fitness/training_plan/widget/AbilityDaySettingsDialog$onDayCheckedChangedLister$1", "Lcom/xiaomi/fitness/training_plan/widget/AbilityDaySettingsDialog$onDayCheckedChangedLister$1;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "initCustomView", "", "rootView", "Landroid/view/View;", "initSettings", VibrateModeSetFragment.MAX, "min", "initSelected", "", "initDayHolders", "view", "getDayHolderByDayOfWeek", "dayOfWeek", "onDialogDismiss", "resultCode", "getDayOfWeekName", "Builder", "DayHolder", "OnDayCheckedChangedLister", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAbilityDaySettingsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityDaySettingsDialog.kt\ncom/xiaomi/fitness/training_plan/widget/AbilityDaySettingsDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,192:1\n1#2:193\n1863#3,2:194\n1863#3,2:196\n*S KotlinDebug\n*F\n+ 1 AbilityDaySettingsDialog.kt\ncom/xiaomi/fitness/training_plan/widget/AbilityDaySettingsDialog\n*L\n94#1:194,2\n100#1:196,2\n*E\n"})
public final class AbilityDaySettingsDialog extends CommonDialog<DialogParams> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KEY_SELECTED_DAY_OF_WEEK = "selected_day_of_week";

    @NotNull
    private static final String TAG = "AbilityDaySettingsDialog";

    @Nullable
    private DayHolder fridayHolder;

    @Nullable
    private DayHolder mondayHolder;

    @Nullable
    private DayHolder saturdayHolder;

    @Nullable
    private DayHolder sundayHolder;

    @Nullable
    private DayHolder thursdayHolder;

    @Nullable
    private DayHolder tuesdayHolder;

    @Nullable
    private DayHolder wednesdayHolder;
    private int maxSelectedNum = -1;
    private int minSelectedNum = -1;

    @NotNull
    private ArrayList<Integer> selectedDays = new ArrayList<>();
    private int titleRes = -1;

    @NotNull
    private String tipString = "";

    @NotNull
    private final AbilityDaySettingsDialog$onDayCheckedChangedLister$1 onDayCheckedChangedLister = new OnDayCheckedChangedLister() { // from class: com.xiaomi.fitness.training_plan.widget.AbilityDaySettingsDialog$onDayCheckedChangedLister$1
        @Override // com.xiaomi.fitness.training_plan.widget.AbilityDaySettingsDialog.OnDayCheckedChangedLister
        public void onCheckedChanged(int dayOfWeek, boolean checked) {
            if (!checked) {
                if (this.this$0.selectedDays.size() - 1 >= this.this$0.minSelectedNum) {
                    this.this$0.selectedDays.remove(Integer.valueOf(dayOfWeek));
                    return;
                }
                ToastUtil.showToast(this.this$0.tipString);
                AbilityDaySettingsDialog.DayHolder dayHolderByDayOfWeek = this.this$0.getDayHolderByDayOfWeek(dayOfWeek);
                if (dayHolderByDayOfWeek != null) {
                    dayHolderByDayOfWeek.updateChecked(true);
                    return;
                }
                return;
            }
            if (this.this$0.selectedDays.contains(Integer.valueOf(dayOfWeek))) {
                return;
            }
            if (this.this$0.selectedDays.size() + 1 <= this.this$0.maxSelectedNum) {
                this.this$0.selectedDays.add(Integer.valueOf(dayOfWeek));
                return;
            }
            ToastUtil.showToast(this.this$0.tipString);
            AbilityDaySettingsDialog.DayHolder dayHolderByDayOfWeek2 = this.this$0.getDayHolderByDayOfWeek(dayOfWeek);
            if (dayHolderByDayOfWeek2 != null) {
                dayHolderByDayOfWeek2.updateChecked(false);
            }
        }
    };

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0004\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/AbilityDaySettingsDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/a;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "Lcom/xiaomi/fitness/training_plan/widget/AbilityDaySettingsDialog;", "getThis", "()Lcom/xiaomi/fitness/training_plan/widget/AbilityDaySettingsDialog$Builder;", "internalCreate", "()Lcom/xiaomi/fitness/training_plan/widget/AbilityDaySettingsDialog;", "", "name", "<init>", "(Ljava/lang/String;)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends a<Builder, DialogParams, AbilityDaySettingsDialog> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull String name) {
            super(new DialogParams(name));
            Intrinsics.checkNotNullParameter(name, "name");
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public Builder getThis() {
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public AbilityDaySettingsDialog internalCreate() {
            return new AbilityDaySettingsDialog();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/AbilityDaySettingsDialog$Companion;", "", "<init>", "()V", "TAG", "", "KEY_SELECTED_DAY_OF_WEEK", "defaultBuilder", "Lcom/xiaomi/fitness/training_plan/widget/AbilityDaySettingsDialog$Builder;", "name", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder defaultBuilder(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            Builder negativeText = new Builder(name).setCustomLayoutId(jvi.D).setCancelable(true).setCanceledOnTouchOutside(true).setNegativeText(k1j.f);
            Intrinsics.checkNotNullExpressionValue(negativeText, "setNegativeText(...)");
            return negativeText;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/AbilityDaySettingsDialog$DayHolder;", "", "view", "Landroid/view/View;", "<init>", "(Lcom/xiaomi/fitness/training_plan/widget/AbilityDaySettingsDialog;Landroid/view/View;)V", "dayTv", "Landroid/widget/TextView;", "dayCb", "Landroid/widget/CheckBox;", "dayOfWeek", "", "updateChecked", "", "checked", "", "updateDayOfWeekName", "setOnCheckedChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/training_plan/widget/AbilityDaySettingsDialog$OnDayCheckedChangedLister;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class DayHolder {

        @Nullable
        private final CheckBox dayCb;
        private int dayOfWeek;

        @Nullable
        private final TextView dayTv;

        public DayHolder(View view) {
            this.dayTv = view != null ? (TextView) view.findViewById(csi.F0) : null;
            this.dayCb = view != null ? (CheckBox) view.findViewById(csi.E0) : null;
            this.dayOfWeek = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setOnCheckedChangeListener$lambda$0(OnDayCheckedChangedLister onDayCheckedChangedLister, DayHolder this$0, CompoundButton compoundButton, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (onDayCheckedChangedLister != null) {
                onDayCheckedChangedLister.onCheckedChanged(this$0.dayOfWeek, z);
            }
        }

        public final void setOnCheckedChangeListener(@Nullable final OnDayCheckedChangedLister listener) {
            CheckBox checkBox = this.dayCb;
            if (checkBox != null) {
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: fh
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        AbilityDaySettingsDialog.DayHolder.setOnCheckedChangeListener$lambda$0(listener, this, compoundButton, z);
                    }
                });
            }
        }

        public final void updateChecked(boolean checked) {
            CheckBox checkBox = this.dayCb;
            if (checkBox != null) {
                checkBox.setChecked(checked);
            }
        }

        public final void updateDayOfWeekName(int dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            TextView textView = this.dayTv;
            if (textView != null) {
                textView.setText(AbilityDaySettingsDialog.this.getDayOfWeekName(dayOfWeek));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/AbilityDaySettingsDialog$OnDayCheckedChangedLister;", "", "onCheckedChanged", "", "dayOfWeek", "", "checked", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnDayCheckedChangedLister {
        void onCheckedChanged(int dayOfWeek, boolean checked);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DayHolder getDayHolderByDayOfWeek(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1:
                return this.mondayHolder;
            case 2:
                return this.tuesdayHolder;
            case 3:
                return this.wednesdayHolder;
            case 4:
                return this.thursdayHolder;
            case 5:
                return this.fridayHolder;
            case 6:
                return this.saturdayHolder;
            case 7:
                return this.sundayHolder;
            default:
                Logger.e(TAG, "day of week out of range [1,7]");
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getDayOfWeekName(int dayOfWeek) {
        String[] stringArray = ResourceExtKt.getStringArray(ApplicationExtKt.getApplication(), chi.c);
        if (1 <= dayOfWeek && dayOfWeek < 8) {
            return stringArray[dayOfWeek - 1];
        }
        Logger.i(TAG, "can not get getDayOfWeekName with error range " + dayOfWeek);
        return null;
    }

    private final void initDayHolders(View view) {
        this.mondayHolder = view != null ? new DayHolder(view.findViewById(csi.I1)) : null;
        this.tuesdayHolder = new DayHolder(view != null ? view.findViewById(csi.M4) : null);
        this.wednesdayHolder = new DayHolder(view != null ? view.findViewById(csi.h5) : null);
        this.thursdayHolder = new DayHolder(view != null ? view.findViewById(csi.B3) : null);
        this.fridayHolder = new DayHolder(view != null ? view.findViewById(csi.h0) : null);
        this.saturdayHolder = new DayHolder(view != null ? view.findViewById(csi.M2) : null);
        this.sundayHolder = new DayHolder(view != null ? view.findViewById(csi.v3) : null);
        Iterator<Integer> it = new IntRange(1, 7).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            DayHolder dayHolderByDayOfWeek = getDayHolderByDayOfWeek(iNextInt);
            if (dayHolderByDayOfWeek != null) {
                dayHolderByDayOfWeek.updateDayOfWeekName(iNextInt);
                dayHolderByDayOfWeek.setOnCheckedChangeListener(this.onDayCheckedChangedLister);
            }
        }
        Iterator<T> it2 = this.selectedDays.iterator();
        while (it2.hasNext()) {
            DayHolder dayHolderByDayOfWeek2 = getDayHolderByDayOfWeek(((Number) it2.next()).intValue());
            if (dayHolderByDayOfWeek2 != null) {
                dayHolderByDayOfWeek2.updateChecked(true);
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@Nullable View rootView) {
        TextView textView;
        TextView textView2;
        super.initCustomView(rootView);
        this.tipString = ApplicationExtKt.getApplication().getResources().getQuantityString(cyi.f, this.maxSelectedNum, Integer.valueOf(this.minSelectedNum), Integer.valueOf(this.maxSelectedNum));
        if (rootView != null && (textView2 = (TextView) rootView.findViewById(csi.I3)) != null) {
            textView2.setText(getString(this.titleRes));
        }
        if (rootView != null && (textView = (TextView) rootView.findViewById(csi.p3)) != null) {
            textView.setText(this.tipString);
        }
        initDayHolders(rootView);
    }

    public final void initSettings(int max, int min, @NotNull List<Integer> initSelected, int titleRes) {
        Intrinsics.checkNotNullParameter(initSelected, "initSelected");
        this.maxSelectedNum = max;
        this.minSelectedNum = min;
        this.titleRes = titleRes;
        this.selectedDays.clear();
        this.selectedDays.addAll(initSelected);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "onCreateDialog(...)");
        return dialogOnCreateDialog;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onDialogDismiss(int resultCode) {
        super.onDialogDismiss(resultCode);
        if (resultCode == -1) {
            CollectionsKt__MutableCollectionsJVMKt.sort(this.selectedDays);
            Bundle bundle = new Bundle();
            bundle.putString(KEY_SELECTED_DAY_OF_WEEK, CollectionsKt___CollectionsKt.joinToString$default(this.selectedDays, ",", null, null, 0, null, null, 62, null));
            setResultData(-1, bundle);
        }
    }
}
