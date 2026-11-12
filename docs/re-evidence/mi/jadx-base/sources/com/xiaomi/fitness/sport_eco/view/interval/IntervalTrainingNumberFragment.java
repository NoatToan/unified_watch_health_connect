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
import com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingNumberFragment;
import com.xiaomi.fitness.sport_eco.view.interval.dialog.PickerDialog;
import com.xiaomi.fitness.sport_eco_manager_export.data.IntervalSportTarget;
import defpackage.a9a;
import defpackage.av6;
import defpackage.ayi;
import defpackage.e1j;
import defpackage.ez5;
import defpackage.fvi;
import defpackage.xpd;
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
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 82\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00018B\t\b\u0007¢\u0006\u0004\b7\u0010 J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u000f2\b\b\u0001\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J!\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u000f*\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\"\u0010 J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b%\u0010&R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010*R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingNumberFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingNumberVM;", "La9a;", "", "duration", "", "getDurationStr", "(I)Ljava/lang/String;", "getDurationSec", "(Ljava/lang/String;)I", "title", "Landroid/view/View;", "view", "Lkotlin/Function0;", "", "confirm", "showDialog", "(ILandroid/view/View;Lkotlin/jvm/functions/Function0;)V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "success", "showDurationPickerDialog", "(Landroidx/fragment/app/FragmentManager;Lkotlin/jvm/functions/Function0;)V", "showNumberPickerDialog", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(La9a;)V", LifecycleConstantKt.ON_RESUME, "()V", LifecycleConstantKt.ON_PAUSE, "onVisible", "", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/IntervalSportTarget;", "getNumberData", "()Ljava/util/List;", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/sport_eco/view/interval/dialog/PickerDialog;", "mDurationPickerDialog", "Ljava/lang/ref/WeakReference;", "mNumberPickerDialog", "Lcom/xiaomi/fitness/baseui/widget/a;", "mlAlertDialog", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/view/View$OnClickListener;", "Lcom/xiaomi/fitness/sport_eco/baseui/SportNumberPicker;", "restDurationPicker$delegate", "Lkotlin/Lazy;", "getRestDurationPicker", "()Lcom/xiaomi/fitness/sport_eco/baseui/SportNumberPicker;", "restDurationPicker", "<init>", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class IntervalTrainingNumberFragment extends Hilt_IntervalTrainingNumberFragment<IntervalTrainingNumberVM, a9a> {

    @NotNull
    public static final String TAG = "IntervalTrainingNumberFragment";

    @Nullable
    private WeakReference<PickerDialog> mDurationPickerDialog;

    @Nullable
    private WeakReference<PickerDialog> mNumberPickerDialog;

    @Nullable
    private WeakReference<a> mlAlertDialog;

    @NotNull
    private final View.OnClickListener onClickListener;

    /* JADX INFO: renamed from: restDurationPicker$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy restDurationPicker;

    public IntervalTrainingNumberFragment() {
        super(fvi.V);
        this.onClickListener = new View.OnClickListener() { // from class: ogd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntervalTrainingNumberFragment.onClickListener$lambda$4(this.f29139a, view);
            }
        };
        this.restDurationPicker = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pgd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntervalTrainingNumberFragment.restDurationPicker_delegate$lambda$6(this.f30372a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ IntervalTrainingNumberVM access$getMViewModel(IntervalTrainingNumberFragment intervalTrainingNumberFragment) {
        return (IntervalTrainingNumberVM) intervalTrainingNumberFragment.getMViewModel();
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
    public static final void onClickListener$lambda$4(final IntervalTrainingNumberFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int id = view.getId();
        if (id == zri.l3) {
            this$0.showNumberPickerDialog(this$0.getFragmentManager(), new Function0() { // from class: qgd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IntervalTrainingNumberFragment.onClickListener$lambda$4$lambda$1(this.f31500a);
                }
            });
            return;
        }
        if (id != zri.o3) {
            if (id == zri.n3) {
                this$0.showDurationPickerDialog(this$0.getFragmentManager(), new Function0() { // from class: sgd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IntervalTrainingNumberFragment.onClickListener$lambda$4$lambda$3(this.f33611a);
                    }
                });
                return;
            }
            return;
        }
        int length = ((IntervalTrainingNumberVM) this$0.getMViewModel()).getRestDuration().length;
        for (int i = 0; i < length; i++) {
            if (((IntervalTrainingNumberVM) this$0.getMViewModel()).getIntervalNumberData().getDefaultRestDuration() == this$0.getDurationSec(((IntervalTrainingNumberVM) this$0.getMViewModel()).getRestDuration()[i])) {
                this$0.getRestDurationPicker().setValue(i);
                break;
            }
        }
        this$0.showDialog(e1j.K3, this$0.getRestDurationPicker(), new Function0() { // from class: rgd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntervalTrainingNumberFragment.onClickListener$lambda$4$lambda$2(this.f32520a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onClickListener$lambda$4$lambda$1(IntervalTrainingNumberFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "tv_duration_of_each_group defaultNumber = " + ((IntervalTrainingNumberVM) this$0.getMViewModel()).getIntervalNumberData().getDefaultNumber());
        ((a9a) this$0.getMBinding()).A.setRemindText(this$0.getResources().getQuantityString(ayi.m, ((IntervalTrainingNumberVM) this$0.getMViewModel()).getIntervalNumberData().getDefaultNumber(), Integer.valueOf(((IntervalTrainingNumberVM) this$0.getMViewModel()).getIntervalNumberData().getDefaultNumber())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onClickListener$lambda$4$lambda$2(IntervalTrainingNumberFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) ((IntervalTrainingNumberVM) this$0.getMViewModel()).getRestDuration()[this$0.getRestDurationPicker().getValue()], new String[]{":"}, false, 0, 6, (Object) null);
        String quantityString = Integer.parseInt((String) listSplit$default.get(1)) > 0 ? this$0.getResources().getQuantityString(ayi.g, Integer.parseInt((String) listSplit$default.get(1)), Integer.valueOf(Integer.parseInt((String) listSplit$default.get(1)))) : "";
        String quantityString2 = Integer.parseInt((String) listSplit$default.get(2)) > 0 ? this$0.getResources().getQuantityString(ayi.i, Integer.parseInt((String) listSplit$default.get(2)), Integer.valueOf(Integer.parseInt((String) listSplit$default.get(2)))) : "";
        ((IntervalTrainingNumberVM) this$0.getMViewModel()).getIntervalNumberData().setDefaultRestDuration((Integer.parseInt((String) listSplit$default.get(1)) * 60) + Integer.parseInt((String) listSplit$default.get(2)));
        ((a9a) this$0.getMBinding()).C.setRemindText(quantityString + quantityString2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onClickListener$lambda$4$lambda$3(IntervalTrainingNumberFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "tv_number_of_training_groups defaultGroup = " + ((IntervalTrainingNumberVM) this$0.getMViewModel()).getIntervalNumberData().getDefaultGroup());
        ((a9a) this$0.getMBinding()).B.setRemindText(this$0.getResources().getQuantityString(ayi.f3581b, ((IntervalTrainingNumberVM) this$0.getMViewModel()).getIntervalNumberData().getDefaultGroup(), Integer.valueOf(((IntervalTrainingNumberVM) this$0.getMViewModel()).getIntervalNumberData().getDefaultGroup())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final SportNumberPicker restDurationPicker_delegate$lambda$6(IntervalTrainingNumberFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportNumberPicker sportNumberPicker = new SportNumberPicker(this$0.getContext());
        sportNumberPicker.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        sportNumberPicker.I(ez5.a(40), ez5.a(20), 0);
        sportNumberPicker.setDistanceOffset(150);
        sportNumberPicker.setMinValue(0);
        sportNumberPicker.setMaxValue(((IntervalTrainingNumberVM) this$0.getMViewModel()).getRestDuration().length - 1);
        sportNumberPicker.setValue(55);
        sportNumberPicker.setDisplayedValues(((IntervalTrainingNumberVM) this$0.getMViewModel()).getRestDuration());
        return sportNumberPicker;
    }

    private final void showDialog(int title, final View view, final Function0<Unit> confirm) {
        a aVar;
        WeakReference<a> weakReference = this.mlAlertDialog;
        if ((weakReference != null ? weakReference.get() : null) == null) {
            this.mlAlertDialog = new WeakReference<>(new a.C0384a(requireContext()).h(title).i(view).g(e1j.S, new DialogInterface.OnClickListener() { // from class: ngd
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IntervalTrainingNumberFragment.showDialog$lambda$7(confirm, dialogInterface, i);
                }
            }).e(e1j.Q, null).b(new a.b() { // from class: com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingNumberFragment.showDialog.2
                @Override // com.xiaomi.fitness.baseui.widget.a.b
                public void afterDismissCallBack() {
                    ViewParent parent = view.getParent();
                    Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeAllViews();
                    this.mlAlertDialog = null;
                }

                @Override // com.xiaomi.fitness.baseui.widget.a.b
                public void beforeDismissCallBack() {
                }
            }).a());
        }
        WeakReference<a> weakReference2 = this.mlAlertDialog;
        if (weakReference2 == null || (aVar = weakReference2.get()) == null) {
            return;
        }
        aVar.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$7(Function0 confirm, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(confirm, "$confirm");
        confirm.invoke();
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
            if (pickerDialog5 != null && (bVarBuildUpon = pickerDialog5.buildUpon()) != null && (bVarC = bVarBuildUpon.c(new NumPickerAdapter().init(((IntervalTrainingNumberVM) getMViewModel()).getNumberOfTrainingGroups()))) != null) {
                bVarC.create();
            }
            WeakReference<PickerDialog> weakReference3 = this.mDurationPickerDialog;
            if (weakReference3 != null && (pickerDialog4 = weakReference3.get()) != null) {
                pickerDialog4.setPickerHintText(getResources().getQuantityString(ayi.f3581b, ((IntervalTrainingNumberVM) getMViewModel()).getIntervalNumberData().getDefaultGroup(), ""));
            }
            WeakReference<PickerDialog> weakReference4 = this.mDurationPickerDialog;
            if (weakReference4 != null && (pickerDialog3 = weakReference4.get()) != null) {
                commonDialogAddDialogCallback = pickerDialog3.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingNumberFragment.showDurationPickerDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        PickerDialog pickerDialog6;
                        Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                        Intrinsics.checkNotNullParameter(dialog, "dialog");
                        super.onDialogClick(dialogName, dialog, which);
                        if (which == -1) {
                            WeakReference weakReference5 = IntervalTrainingNumberFragment.this.mDurationPickerDialog;
                            Integer numValueOf = (weakReference5 == null || (pickerDialog6 = (PickerDialog) weakReference5.get()) == null) ? null : Integer.valueOf(pickerDialog6.getValue());
                            Intrinsics.checkNotNull(numValueOf);
                            IntervalTrainingNumberFragment.access$getMViewModel(IntervalTrainingNumberFragment.this).getIntervalNumberData().setDefaultGroup(numValueOf.intValue());
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
            pickerDialog2.setValue(((IntervalTrainingNumberVM) getMViewModel()).getIntervalNumberData().getDefaultGroup());
        }
        WeakReference<PickerDialog> weakReference6 = this.mDurationPickerDialog;
        if (weakReference6 == null || (pickerDialog = weakReference6.get()) == null) {
            return;
        }
        pickerDialog.showIfNeed(fragmentManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showNumberPickerDialog(FragmentManager fragmentManager, final Function0<Unit> success) {
        PickerDialog pickerDialog;
        PickerDialog pickerDialog2;
        PickerDialog pickerDialog3;
        PickerDialog pickerDialog4;
        PickerDialog.b bVarBuildUpon;
        PickerDialog.b bVarC;
        WeakReference<PickerDialog> weakReference = this.mNumberPickerDialog;
        CommonDialog commonDialogAddDialogCallback = null;
        if ((weakReference != null ? weakReference.get() : null) == null) {
            WeakReference<PickerDialog> weakReference2 = new WeakReference<>(new PickerDialog.b("NUMBER_PICKER_NAME").setCustomLayoutId(fvi.e0).setPositiveText(e1j.S).setNegativeText(e1j.Q).setDialogTitle(e1j.A3).setCancelable(true).setCanceledOnTouchOutside(true).create());
            this.mNumberPickerDialog = weakReference2;
            PickerDialog pickerDialog5 = weakReference2.get();
            if (pickerDialog5 != null && (bVarBuildUpon = pickerDialog5.buildUpon()) != null && (bVarC = bVarBuildUpon.c(new NumPickerAdapter().init(((IntervalTrainingNumberVM) getMViewModel()).getNumberOfEachGroup()))) != null) {
                bVarC.create();
            }
            WeakReference<PickerDialog> weakReference3 = this.mNumberPickerDialog;
            if (weakReference3 != null && (pickerDialog4 = weakReference3.get()) != null) {
                pickerDialog4.setPickerHintText(getResources().getQuantityString(ayi.m, ((IntervalTrainingNumberVM) getMViewModel()).getIntervalNumberData().getDefaultNumber(), ""));
            }
            WeakReference<PickerDialog> weakReference4 = this.mNumberPickerDialog;
            if (weakReference4 != null && (pickerDialog3 = weakReference4.get()) != null) {
                commonDialogAddDialogCallback = pickerDialog3.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingNumberFragment.showNumberPickerDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        PickerDialog pickerDialog6;
                        Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                        Intrinsics.checkNotNullParameter(dialog, "dialog");
                        super.onDialogClick(dialogName, dialog, which);
                        if (which == -1) {
                            WeakReference weakReference5 = IntervalTrainingNumberFragment.this.mNumberPickerDialog;
                            Integer numValueOf = (weakReference5 == null || (pickerDialog6 = (PickerDialog) weakReference5.get()) == null) ? null : Integer.valueOf(pickerDialog6.getValue());
                            Intrinsics.checkNotNull(numValueOf);
                            IntervalTrainingNumberFragment.access$getMViewModel(IntervalTrainingNumberFragment.this).getIntervalNumberData().setDefaultNumber(numValueOf.intValue());
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
        WeakReference<PickerDialog> weakReference5 = this.mNumberPickerDialog;
        if (weakReference5 != null && (pickerDialog2 = weakReference5.get()) != null) {
            pickerDialog2.setValue(((IntervalTrainingNumberVM) getMViewModel()).getIntervalNumberData().getDefaultNumber());
        }
        WeakReference<PickerDialog> weakReference6 = this.mNumberPickerDialog;
        if (weakReference6 == null || (pickerDialog = weakReference6.get()) == null) {
            return;
        }
        pickerDialog.showIfNeed(fragmentManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull a9a a9aVar) {
        Intrinsics.checkNotNullParameter(a9aVar, "<this>");
        a9a a9aVar2 = (a9a) getMBinding();
        a9aVar2.setOnClick(this.onClickListener);
        a9aVar2.A.setTitle(getResources().getString(e1j.A3));
        a9aVar2.A.setRemindText(getResources().getQuantityString(ayi.m, ((IntervalTrainingNumberVM) getMViewModel()).getIntervalNumberData().getDefaultNumber(), Integer.valueOf(((IntervalTrainingNumberVM) getMViewModel()).getIntervalNumberData().getDefaultNumber())));
        a9aVar2.C.setRemindText(getDurationStr(((IntervalTrainingNumberVM) getMViewModel()).getIntervalNumberData().getDefaultRestDuration()));
        a9aVar2.B.setRemindText(getResources().getQuantityString(ayi.f3581b, ((IntervalTrainingNumberVM) getMViewModel()).getIntervalNumberData().getDefaultGroup(), Integer.valueOf(((IntervalTrainingNumberVM) getMViewModel()).getIntervalNumberData().getDefaultGroup())));
        a9aVar2.A.updateTitleMaxLines(2);
        a9aVar2.C.updateTitleMaxLines(2);
        a9aVar2.B.updateTitleMaxLines(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final List<IntervalSportTarget> getNumberData() {
        return ((IntervalTrainingNumberVM) getMViewModel()).getNumberData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Logger.i(TAG, "onPause()");
        IntervalTrainingPreference.INSTANCE.setKEY_INTERVAL_NUMBER_VALUE(xpd.a(((IntervalTrainingNumberVM) getMViewModel()).getIntervalNumberData()));
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
