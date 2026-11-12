package com.xiaomi.fitness.sport_eco.view.interval;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.widget.a;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_eco.baseui.SportNumberPicker;
import com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingDurationFragment;
import com.xiaomi.fitness.sport_eco.view.interval.dialog.PickerDialog;
import com.xiaomi.fitness.sport_eco_manager_export.data.IntervalSportTarget;
import defpackage.av6;
import defpackage.ayi;
import defpackage.e1j;
import defpackage.ez5;
import defpackage.fvi;
import defpackage.xpd;
import defpackage.y8a;
import defpackage.zri;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001;B\t\b\u0007¢\u0006\u0004\b:\u0010 J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u000f2\b\b\u0001\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u00020\u000f2\b\b\u0001\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u000f*\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\"\u0010 J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b%\u0010&R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010*R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u00109\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00105¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingDurationFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingDurationVM;", "Ly8a;", "", "duration", "", "getDurationStr", "(I)Ljava/lang/String;", "getDurationSec", "(Ljava/lang/String;)I", "title", "Landroid/view/View;", "view", "Lkotlin/Function0;", "", "confirm", "showGroupDialog", "(ILandroid/view/View;Lkotlin/jvm/functions/Function0;)V", "showRestDialog", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "success", "showDurationPickerDialog", "(Landroidx/fragment/app/FragmentManager;Lkotlin/jvm/functions/Function0;)V", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(Ly8a;)V", LifecycleConstantKt.ON_RESUME, "()V", LifecycleConstantKt.ON_PAUSE, "onVisible", "", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/IntervalSportTarget;", "getDurationData", "()Ljava/util/List;", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/sport_eco/view/interval/dialog/PickerDialog;", "mDurationPickerDialog", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/baseui/widget/a;", "mlGroupAlertDialog", "mlRestAlertDialog", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/view/View$OnClickListener;", "Lcom/xiaomi/fitness/sport_eco/baseui/SportNumberPicker;", "durationGroupPicker$delegate", "Lkotlin/Lazy;", "getDurationGroupPicker", "()Lcom/xiaomi/fitness/sport_eco/baseui/SportNumberPicker;", "durationGroupPicker", "restDurationPicker$delegate", "getRestDurationPicker", "restDurationPicker", "<init>", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class IntervalTrainingDurationFragment extends Hilt_IntervalTrainingDurationFragment<IntervalTrainingDurationVM, y8a> {

    @NotNull
    public static final String TAG = "IntervalTrainingDurationFragment";

    /* JADX INFO: renamed from: durationGroupPicker$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy durationGroupPicker;

    @Nullable
    private WeakReference<PickerDialog> mDurationPickerDialog;

    @Nullable
    private WeakReference<a> mlGroupAlertDialog;

    @Nullable
    private WeakReference<a> mlRestAlertDialog;

    @NotNull
    private final View.OnClickListener onClickListener;

    /* JADX INFO: renamed from: restDurationPicker$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy restDurationPicker;

    public IntervalTrainingDurationFragment() {
        super(fvi.U);
        this.onClickListener = new View.OnClickListener() { // from class: cgd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntervalTrainingDurationFragment.onClickListener$lambda$4(this.f5309a, view);
            }
        };
        this.durationGroupPicker = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dgd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntervalTrainingDurationFragment.durationGroupPicker_delegate$lambda$6(this.f15509a);
            }
        });
        this.restDurationPicker = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: egd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntervalTrainingDurationFragment.restDurationPicker_delegate$lambda$8(this.f16622a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ IntervalTrainingDurationVM access$getMViewModel(IntervalTrainingDurationFragment intervalTrainingDurationFragment) {
        return (IntervalTrainingDurationVM) intervalTrainingDurationFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final SportNumberPicker durationGroupPicker_delegate$lambda$6(IntervalTrainingDurationFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportNumberPicker sportNumberPicker = new SportNumberPicker(this$0.getContext());
        sportNumberPicker.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        sportNumberPicker.I(ez5.a(40), ez5.a(20), 0);
        sportNumberPicker.setDistanceOffset(150);
        sportNumberPicker.setMinValue(0);
        sportNumberPicker.setMaxValue(((IntervalTrainingDurationVM) this$0.getMViewModel()).getDurationOfEachGroup().length - 1);
        sportNumberPicker.setValue(4);
        sportNumberPicker.setDisplayedValues(((IntervalTrainingDurationVM) this$0.getMViewModel()).getDurationOfEachGroup());
        return sportNumberPicker;
    }

    private final SportNumberPicker getDurationGroupPicker() {
        return (SportNumberPicker) this.durationGroupPicker.getValue();
    }

    private final int getDurationSec(String duration) {
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) duration, new String[]{":"}, false, 0, 6, (Object) null);
        return (Integer.parseInt((String) listSplit$default.get(1)) * 60) + Integer.parseInt((String) listSplit$default.get(2));
    }

    private final String getDurationStr(int duration) {
        int i = duration / 60;
        int i2 = duration % 60;
        return (i > 0 ? getResources().getQuantityString(ayi.g, i, Integer.valueOf(i)) : "") + (i2 > 0 ? getResources().getQuantityString(ayi.i, i2, Integer.valueOf(i2)) : "");
    }

    private final SportNumberPicker getRestDurationPicker() {
        return (SportNumberPicker) this.restDurationPicker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClickListener$lambda$4(final IntervalTrainingDurationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int id = view.getId();
        int i = 0;
        if (id == zri.l3) {
            int length = ((IntervalTrainingDurationVM) this$0.getMViewModel()).getDurationOfEachGroup().length;
            while (i < length) {
                if (((IntervalTrainingDurationVM) this$0.getMViewModel()).getIntervalDurationData().getDefaultGroupDuration() == this$0.getDurationSec(((IntervalTrainingDurationVM) this$0.getMViewModel()).getDurationOfEachGroup()[i])) {
                    this$0.getDurationGroupPicker().setValue(i);
                    break;
                }
                i++;
            }
            this$0.showGroupDialog(e1j.j3, this$0.getDurationGroupPicker(), new Function0() { // from class: fgd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IntervalTrainingDurationFragment.onClickListener$lambda$4$lambda$1(this.f17760a);
                }
            });
            return;
        }
        if (id != zri.o3) {
            if (id == zri.n3) {
                this$0.showDurationPickerDialog(this$0.getFragmentManager(), new Function0() { // from class: hgd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IntervalTrainingDurationFragment.onClickListener$lambda$4$lambda$3(this.f20043a);
                    }
                });
                return;
            }
            return;
        }
        int length2 = ((IntervalTrainingDurationVM) this$0.getMViewModel()).getRestDuration().length;
        while (i < length2) {
            if (((IntervalTrainingDurationVM) this$0.getMViewModel()).getIntervalDurationData().getDefaultRestDuration() == this$0.getDurationSec(((IntervalTrainingDurationVM) this$0.getMViewModel()).getRestDuration()[i])) {
                this$0.getRestDurationPicker().setValue(i);
                break;
            }
            i++;
        }
        this$0.showRestDialog(e1j.K3, this$0.getRestDurationPicker(), new Function0() { // from class: ggd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntervalTrainingDurationFragment.onClickListener$lambda$4$lambda$2(this.f18952a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onClickListener$lambda$4$lambda$1(IntervalTrainingDurationFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) ((IntervalTrainingDurationVM) this$0.getMViewModel()).getDurationOfEachGroup()[this$0.getDurationGroupPicker().getValue()], new String[]{":"}, false, 0, 6, (Object) null);
        String quantityString = Integer.parseInt((String) listSplit$default.get(1)) > 0 ? this$0.getResources().getQuantityString(ayi.g, Integer.parseInt((String) listSplit$default.get(1)), Integer.valueOf(Integer.parseInt((String) listSplit$default.get(1)))) : "";
        String quantityString2 = Integer.parseInt((String) listSplit$default.get(2)) > 0 ? this$0.getResources().getQuantityString(ayi.i, Integer.parseInt((String) listSplit$default.get(2)), Integer.valueOf(Integer.parseInt((String) listSplit$default.get(2)))) : "";
        ((IntervalTrainingDurationVM) this$0.getMViewModel()).getIntervalDurationData().setDefaultGroupDuration((Integer.parseInt((String) listSplit$default.get(1)) * 60) + Integer.parseInt((String) listSplit$default.get(2)));
        ((y8a) this$0.getMBinding()).A.setRemindText(quantityString + quantityString2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onClickListener$lambda$4$lambda$2(IntervalTrainingDurationFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) ((IntervalTrainingDurationVM) this$0.getMViewModel()).getRestDuration()[this$0.getRestDurationPicker().getValue()], new String[]{":"}, false, 0, 6, (Object) null);
        String quantityString = Integer.parseInt((String) listSplit$default.get(1)) > 0 ? this$0.getResources().getQuantityString(ayi.g, Integer.parseInt((String) listSplit$default.get(1)), Integer.valueOf(Integer.parseInt((String) listSplit$default.get(1)))) : "";
        String quantityString2 = Integer.parseInt((String) listSplit$default.get(2)) > 0 ? this$0.getResources().getQuantityString(ayi.i, Integer.parseInt((String) listSplit$default.get(2)), Integer.valueOf(Integer.parseInt((String) listSplit$default.get(2)))) : "";
        ((IntervalTrainingDurationVM) this$0.getMViewModel()).getIntervalDurationData().setDefaultRestDuration((Integer.parseInt((String) listSplit$default.get(1)) * 60) + Integer.parseInt((String) listSplit$default.get(2)));
        ((y8a) this$0.getMBinding()).C.setRemindText(quantityString + quantityString2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onClickListener$lambda$4$lambda$3(IntervalTrainingDurationFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((y8a) this$0.getMBinding()).B.setRemindText(this$0.getResources().getQuantityString(ayi.f3581b, ((IntervalTrainingDurationVM) this$0.getMViewModel()).getIntervalDurationData().getDefaultGroup(), Integer.valueOf(((IntervalTrainingDurationVM) this$0.getMViewModel()).getIntervalDurationData().getDefaultGroup())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final SportNumberPicker restDurationPicker_delegate$lambda$8(IntervalTrainingDurationFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportNumberPicker sportNumberPicker = new SportNumberPicker(this$0.getContext());
        sportNumberPicker.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        sportNumberPicker.I(ez5.a(40), ez5.a(20), 0);
        sportNumberPicker.setDistanceOffset(150);
        sportNumberPicker.setMinValue(0);
        sportNumberPicker.setMaxValue(((IntervalTrainingDurationVM) this$0.getMViewModel()).getRestDuration().length - 1);
        sportNumberPicker.setValue(55);
        sportNumberPicker.setDisplayedValues(((IntervalTrainingDurationVM) this$0.getMViewModel()).getRestDuration());
        return sportNumberPicker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showDurationPickerDialog(FragmentManager fragmentManager, final Function0<Unit> success) {
        PickerDialog pickerDialog;
        PickerDialog pickerDialog2;
        PickerDialog pickerDialog3;
        PickerDialog pickerDialog4;
        PickerDialog.b bVarBuildUpon;
        PickerDialog.b bVarC;
        WeakReference<PickerDialog> weakReference = this.mDurationPickerDialog;
        CommonDialog commonDialogAddDialogCallback = null;
        if ((weakReference != null ? weakReference.get() : null) == null) {
            WeakReference<PickerDialog> weakReference2 = new WeakReference<>(new PickerDialog.b("DURATION_PICKER_NAME").setCustomLayoutId(fvi.e0).setPositiveText(e1j.S).setNegativeText(e1j.Q).setDialogTitle(e1j.B3).setCancelable(true).setCanceledOnTouchOutside(true).create());
            this.mDurationPickerDialog = weakReference2;
            PickerDialog pickerDialog5 = weakReference2.get();
            if (pickerDialog5 != null && (bVarBuildUpon = pickerDialog5.buildUpon()) != null && (bVarC = bVarBuildUpon.c(new NumPickerAdapter().init(((IntervalTrainingDurationVM) getMViewModel()).getNumberOfTrainingGroups()))) != null) {
                bVarC.create();
            }
            WeakReference<PickerDialog> weakReference3 = this.mDurationPickerDialog;
            if (weakReference3 != null && (pickerDialog4 = weakReference3.get()) != null) {
                pickerDialog4.setPickerHintText(getResources().getQuantityString(ayi.f3581b, ((IntervalTrainingDurationVM) getMViewModel()).getIntervalDurationData().getDefaultGroup(), ""));
            }
            WeakReference<PickerDialog> weakReference4 = this.mDurationPickerDialog;
            if (weakReference4 != null && (pickerDialog3 = weakReference4.get()) != null) {
                commonDialogAddDialogCallback = pickerDialog3.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingDurationFragment.showDurationPickerDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        PickerDialog pickerDialog6;
                        Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                        Intrinsics.checkNotNullParameter(dialog, "dialog");
                        super.onDialogClick(dialogName, dialog, which);
                        if (which == -1) {
                            WeakReference weakReference5 = IntervalTrainingDurationFragment.this.mDurationPickerDialog;
                            Integer numValueOf = (weakReference5 == null || (pickerDialog6 = (PickerDialog) weakReference5.get()) == null) ? null : Integer.valueOf(pickerDialog6.getValue());
                            Intrinsics.checkNotNull(numValueOf);
                            IntervalTrainingDurationFragment.access$getMViewModel(IntervalTrainingDurationFragment.this).getIntervalDurationData().setDefaultGroup(numValueOf.intValue());
                            success.invoke();
                        }
                    }

                    @Override // defpackage.av6
                    public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                        Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                        super.onDialogMultiClick(dialogName, which, isChecked);
                    }
                });
            }
            Intrinsics.checkNotNull(commonDialogAddDialogCallback, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        }
        WeakReference<PickerDialog> weakReference5 = this.mDurationPickerDialog;
        if (weakReference5 != null && (pickerDialog2 = weakReference5.get()) != null) {
            pickerDialog2.setValue(((IntervalTrainingDurationVM) getMViewModel()).getIntervalDurationData().getDefaultGroup());
        }
        WeakReference<PickerDialog> weakReference6 = this.mDurationPickerDialog;
        if (weakReference6 == null || (pickerDialog = weakReference6.get()) == null) {
            return;
        }
        pickerDialog.showIfNeed(fragmentManager);
    }

    private final void showGroupDialog(int title, final View view, final Function0<Unit> confirm) {
        a aVar;
        WeakReference<a> weakReference = this.mlGroupAlertDialog;
        if ((weakReference != null ? weakReference.get() : null) == null) {
            this.mlGroupAlertDialog = new WeakReference<>(new a.C0384a(requireContext()).h(title).i(view).g(e1j.S, new DialogInterface.OnClickListener() { // from class: igd
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IntervalTrainingDurationFragment.showGroupDialog$lambda$9(confirm, dialogInterface, i);
                }
            }).e(e1j.Q, null).b(new a.b() { // from class: com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingDurationFragment.showGroupDialog.2
                @Override // com.xiaomi.fitness.baseui.widget.a.b
                public void afterDismissCallBack() {
                    ViewParent parent = view.getParent();
                    Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeAllViews();
                    this.mlGroupAlertDialog = null;
                }

                @Override // com.xiaomi.fitness.baseui.widget.a.b
                public void beforeDismissCallBack() {
                }
            }).a());
        }
        WeakReference<a> weakReference2 = this.mlGroupAlertDialog;
        if (weakReference2 == null || (aVar = weakReference2.get()) == null) {
            return;
        }
        aVar.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showGroupDialog$lambda$9(Function0 confirm, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(confirm, "$confirm");
        confirm.invoke();
    }

    private final void showRestDialog(int title, final View view, final Function0<Unit> confirm) {
        a aVar;
        WeakReference<a> weakReference = this.mlRestAlertDialog;
        if ((weakReference != null ? weakReference.get() : null) == null) {
            this.mlRestAlertDialog = new WeakReference<>(new a.C0384a(requireContext()).h(title).i(view).g(e1j.S, new DialogInterface.OnClickListener() { // from class: bgd
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IntervalTrainingDurationFragment.showRestDialog$lambda$10(confirm, dialogInterface, i);
                }
            }).e(e1j.Q, null).b(new a.b() { // from class: com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingDurationFragment.showRestDialog.2
                @Override // com.xiaomi.fitness.baseui.widget.a.b
                public void afterDismissCallBack() {
                    ViewParent parent = view.getParent();
                    Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeAllViews();
                    this.mlRestAlertDialog = null;
                }

                @Override // com.xiaomi.fitness.baseui.widget.a.b
                public void beforeDismissCallBack() {
                }
            }).a());
        }
        WeakReference<a> weakReference2 = this.mlRestAlertDialog;
        if (weakReference2 == null || (aVar = weakReference2.get()) == null) {
            return;
        }
        aVar.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRestDialog$lambda$10(Function0 confirm, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(confirm, "$confirm");
        confirm.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull y8a y8aVar) {
        Intrinsics.checkNotNullParameter(y8aVar, "<this>");
        y8a y8aVar2 = (y8a) getMBinding();
        y8aVar2.setOnClick(this.onClickListener);
        y8aVar2.A.setTitle(getResources().getString(e1j.j3));
        y8aVar2.A.setRemindText(getDurationStr(((IntervalTrainingDurationVM) getMViewModel()).getIntervalDurationData().getDefaultGroupDuration()));
        y8aVar2.C.setRemindText(getDurationStr(((IntervalTrainingDurationVM) getMViewModel()).getIntervalDurationData().getDefaultRestDuration()));
        y8aVar2.B.setRemindText(getResources().getQuantityString(ayi.f3581b, ((IntervalTrainingDurationVM) getMViewModel()).getIntervalDurationData().getDefaultGroup(), Integer.valueOf(((IntervalTrainingDurationVM) getMViewModel()).getIntervalDurationData().getDefaultGroup())));
        y8aVar2.A.updateTitleMaxLines(2);
        y8aVar2.C.updateTitleMaxLines(2);
        y8aVar2.B.updateTitleMaxLines(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final List<IntervalSportTarget> getDurationData() {
        return ((IntervalTrainingDurationVM) getMViewModel()).getDurationData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Logger.i(TAG, "onPause()");
        IntervalTrainingPreference.INSTANCE.setKEY_INTERVAL_DURATION_VALUE(xpd.a(((IntervalTrainingDurationVM) getMViewModel()).getIntervalDurationData()));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Logger.i(TAG, "onResume()");
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        Logger.i(TAG, "onVisible()");
    }
}
