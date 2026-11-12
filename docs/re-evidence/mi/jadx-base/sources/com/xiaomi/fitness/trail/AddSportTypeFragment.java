package com.xiaomi.fitness.trail;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.trail.AddSportTypeFragment;
import com.xiaomi.fitness.trail.adapter.AddTrailAdapter;
import com.xiaomi.fitness.trail.data.ExerciseRecord;
import com.xiaomi.fitness.trail.model.AddSportTypeModel;
import com.xiaomi.fitness.trail.viewmodel.AddSportRecordViewModel;
import com.xiaomi.fitness.trail.widget.ExerciseRVDialog;
import com.xiaomi.fitness.trail.widget.MonthPanelDialog;
import com.xiaomi.fitness.trail.widget.TrailTimePickerDialog;
import com.xiaomi.fitness.util.AddTrailHelper;
import com.xiaomi.fitness.util.AddTrailHelperKt;
import defpackage.av6;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.j7m;
import defpackage.p2a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010'R\u0014\u0010*\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/trail/AddSportTypeFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/trail/viewmodel/AddSportRecordViewModel;", "Lp2a;", "", "setLayoutManager", "()V", "Lcom/xiaomi/fitness/trail/model/AddSportTypeModel$DetailItem;", "detailItem", "showDetailDialog", "(Lcom/xiaomi/fitness/trail/model/AddSportTypeModel$DetailItem;)V", "fixStartTime", "Lcom/xiaomi/fitness/trail/data/ExerciseRecord;", "exerciseRecord", "showChooseDateDialog", "(Lcom/xiaomi/fitness/trail/data/ExerciseRecord;)V", "", "which", "convertWhichToLocalType", "(I)I", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "onBackPressed", "()Z", "", "detailList", "Ljava/util/List;", "Lcom/xiaomi/fitness/trail/adapter/AddTrailAdapter;", "mAdapter", "Lcom/xiaomi/fitness/trail/adapter/AddTrailAdapter;", "Lcom/xiaomi/fitness/trail/data/ExerciseRecord;", "getLayoutId", "()I", "layoutId", "<init>", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AddSportTypeFragment extends BaseBindingFragment<AddSportRecordViewModel, p2a> {

    @Nullable
    private List<AddSportTypeModel.DetailItem> detailList = new ArrayList();
    private ExerciseRecord exerciseRecord;
    private AddTrailAdapter mAdapter;

    /* JADX INFO: renamed from: com.xiaomi.fitness.trail.AddSportTypeFragment$showDetailDialog$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/trail/AddSportTypeFragment$showDetailDialog$2", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass2 extends av6 {
        final /* synthetic */ CommonDialog<?> $detailDialog;
        final /* synthetic */ AddSportTypeModel.DetailItem $detailItem;

        public AnonymousClass2(AddSportTypeModel.DetailItem detailItem, CommonDialog<?> commonDialog) {
            this.$detailItem = detailItem;
            this.$detailDialog = commonDialog;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(AddSportTypeFragment this$0, ExerciseRecord it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            this$0.detailList = AddTrailHelper.INSTANCE.constructExerciseEditItem(it);
            AddTrailAdapter addTrailAdapter = this$0.mAdapter;
            AddTrailAdapter addTrailAdapter2 = null;
            if (addTrailAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                addTrailAdapter = null;
            }
            List<AddSportTypeModel.DetailItem> list = this$0.detailList;
            Intrinsics.checkNotNull(list);
            addTrailAdapter.setSportList(list);
            AddTrailAdapter addTrailAdapter3 = this$0.mAdapter;
            if (addTrailAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            } else {
                addTrailAdapter2 = addTrailAdapter3;
            }
            addTrailAdapter2.notifyDataSetChanged();
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            super.onDialogClick(dialogName, dialog, which);
            AddTrailHelper addTrailHelper = AddTrailHelper.INSTANCE;
            ExerciseRecord exerciseRecord = AddSportTypeFragment.this.exerciseRecord;
            ExerciseRecord exerciseRecord2 = null;
            if (exerciseRecord == null) {
                Intrinsics.throwUninitializedPropertyAccessException("exerciseRecord");
                exerciseRecord = null;
            }
            if (addTrailHelper.isSwimType(exerciseRecord.getSportType()) && this.$detailItem.getItemType() == 6) {
                ExerciseRecord exerciseRecord3 = AddSportTypeFragment.this.exerciseRecord;
                if (exerciseRecord3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("exerciseRecord");
                    exerciseRecord3 = null;
                }
                exerciseRecord3.setMainPosture(AddSportTypeFragment.this.convertWhichToLocalType(which));
                j7m j7mVarA = j7m.a();
                ExerciseRecord exerciseRecord4 = AddSportTypeFragment.this.exerciseRecord;
                if (exerciseRecord4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("exerciseRecord");
                    exerciseRecord4 = null;
                }
                j7mVarA.f("key_trail_main_posture", exerciseRecord4.getMainPosture());
            } else if (this.$detailItem.getItemType() == 7) {
                addTrailHelper.IntensityChangeByUser();
            } else if (which != -2) {
                if (which == -1) {
                    int itemType = this.$detailItem.getItemType();
                    if (itemType == 1) {
                        CommonDialog<?> commonDialog = this.$detailDialog;
                        Intrinsics.checkNotNull(commonDialog, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.PickerDialog");
                        double value = ((PickerDialog) commonDialog).getValue();
                        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                        double d = value * ((double) 60);
                        ExerciseRecord exerciseRecord5 = AddSportTypeFragment.this.exerciseRecord;
                        if (exerciseRecord5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("exerciseRecord");
                            exerciseRecord5 = null;
                        }
                        if (d > jCurrentTimeMillis - exerciseRecord5.getStartTime()) {
                            ExerciseRecord exerciseRecord6 = AddSportTypeFragment.this.exerciseRecord;
                            if (exerciseRecord6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("exerciseRecord");
                                exerciseRecord6 = null;
                            }
                            exerciseRecord6.setStartTime((long) (jCurrentTimeMillis - d));
                        }
                        ExerciseRecord exerciseRecord7 = AddSportTypeFragment.this.exerciseRecord;
                        if (exerciseRecord7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("exerciseRecord");
                            exerciseRecord7 = null;
                        }
                        exerciseRecord7.setDuration(((PickerDialog) this.$detailDialog).getValue());
                    } else if (itemType == 2) {
                        CommonDialog<?> commonDialog2 = this.$detailDialog;
                        Intrinsics.checkNotNull(commonDialog2, "null cannot be cast to non-null type com.xiaomi.fitness.trail.widget.TrailTimePickerDialog");
                        TrailTimePickerDialog trailTimePickerDialog = (TrailTimePickerDialog) commonDialog2;
                        int minuteBySeconds = addTrailHelper.getMinuteBySeconds(System.currentTimeMillis() / ((long) 1000));
                        long minuteBySeconds2 = addTrailHelper.getMinuteBySeconds(trailTimePickerDialog.getTimeSeconds());
                        ExerciseRecord exerciseRecord8 = AddSportTypeFragment.this.exerciseRecord;
                        if (exerciseRecord8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("exerciseRecord");
                            exerciseRecord8 = null;
                        }
                        if (minuteBySeconds2 + ((long) exerciseRecord8.getDuration()) > minuteBySeconds) {
                            Context context = AddSportTypeFragment.this.getContext();
                            if (context != null) {
                                ToastExtKt.toastShort(context, j1j.f0);
                            }
                        } else {
                            ExerciseRecord exerciseRecord9 = AddSportTypeFragment.this.exerciseRecord;
                            if (exerciseRecord9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("exerciseRecord");
                                exerciseRecord9 = null;
                            }
                            exerciseRecord9.setStartTime(trailTimePickerDialog.getTimeSeconds());
                        }
                    } else if (itemType == 3) {
                        addTrailHelper.DistanceChangeByUser();
                        ExerciseRecord exerciseRecord10 = AddSportTypeFragment.this.exerciseRecord;
                        if (exerciseRecord10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("exerciseRecord");
                            exerciseRecord10 = null;
                        }
                        CommonDialog<?> commonDialog3 = this.$detailDialog;
                        Intrinsics.checkNotNull(commonDialog3, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.PickerDialog");
                        exerciseRecord10.setDistance(((PickerDialog) commonDialog3).getValue());
                    } else if (itemType == 4) {
                        addTrailHelper.ConsumeChangeByUser();
                        ExerciseRecord exerciseRecord11 = AddSportTypeFragment.this.exerciseRecord;
                        if (exerciseRecord11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("exerciseRecord");
                            exerciseRecord11 = null;
                        }
                        CommonDialog<?> commonDialog4 = this.$detailDialog;
                        Intrinsics.checkNotNull(commonDialog4, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.PickerDialog");
                        exerciseRecord11.setCalories(((PickerDialog) commonDialog4).getValue());
                    } else if (itemType == 5) {
                        addTrailHelper.StepChangeByUser();
                        ExerciseRecord exerciseRecord12 = AddSportTypeFragment.this.exerciseRecord;
                        if (exerciseRecord12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("exerciseRecord");
                            exerciseRecord12 = null;
                        }
                        CommonDialog<?> commonDialog5 = this.$detailDialog;
                        Intrinsics.checkNotNull(commonDialog5, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.PickerDialog");
                        exerciseRecord12.setStep(((PickerDialog) commonDialog5).getValue());
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            } else if (dialog != null) {
                dialog.dismiss();
            }
            ExerciseRecord exerciseRecord13 = AddSportTypeFragment.this.exerciseRecord;
            if (exerciseRecord13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("exerciseRecord");
            } else {
                exerciseRecord2 = exerciseRecord13;
            }
            final AddSportTypeFragment addSportTypeFragment = AddSportTypeFragment.this;
            addTrailHelper.getExactlyExerciseData(exerciseRecord2, new Function1() { // from class: iu0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AddSportTypeFragment.AnonymousClass2.onDialogClick$lambda$0(addSportTypeFragment, (ExerciseRecord) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int convertWhichToLocalType(int which) {
        if (which == 0) {
            return 1;
        }
        if (which == 1) {
            return 4;
        }
        if (which == 2) {
            return 2;
        }
        if (which != 3) {
            return which != 4 ? 8 : 3;
        }
        return 0;
    }

    private final void fixStartTime() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(AddSportTypeFragment this$0, ExerciseRecord it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.exerciseRecord = it;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(AddSportTypeFragment this$0, AddSportTypeModel.DetailItem it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.showDetailDialog(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(AddSportTypeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ExerciseRecord exerciseRecord = this$0.exerciseRecord;
        if (exerciseRecord == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exerciseRecord");
            exerciseRecord = null;
        }
        this$0.showChooseDateDialog(exerciseRecord);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(AddSportTypeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AddTrailHelper addTrailHelper = AddTrailHelper.INSTANCE;
        ExerciseRecord exerciseRecord = this$0.exerciseRecord;
        if (exerciseRecord == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exerciseRecord");
            exerciseRecord = null;
        }
        addTrailHelper.syncSportRecord(exerciseRecord);
        addTrailHelper.reset();
        this$0.finish();
    }

    private final void setLayoutManager() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), UIUtils.INSTANCE.getScreenState() == 0 ? 3 : 2, 1, false);
        gridLayoutManager.setOrientation(1);
        getMBinding().B.setLayoutManager(gridLayoutManager);
    }

    private final void showChooseDateDialog(ExerciseRecord exerciseRecord) {
        MonthPanelDialog monthPanelDialogCreate = new MonthPanelDialog.b("month_picker_dialog").setCustomLayoutId(ivi.b1).setPositiveText(j1j.c).setNegativeText(j1j.f22329b).setCanceledOnTouchOutside(true).setCancelable(true).create();
        monthPanelDialogCreate.setRequestCode(3);
        monthPanelDialogCreate.E(TimeUtils.setTimeZeroOClock$default(TimeUtils.INSTANCE, exerciseRecord.getStartTime() * ((long) 1000), null, 2, null));
        monthPanelDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showDetailDialog(AddSportTypeModel.DetailItem detailItem) {
        hideLoading();
        AddSportRecordViewModel addSportRecordViewModel = (AddSportRecordViewModel) getMViewModel();
        ExerciseRecord exerciseRecord = this.exerciseRecord;
        if (exerciseRecord == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exerciseRecord");
            exerciseRecord = null;
        }
        CommonDialog<?> commonDialogCreateDetailDialog = addSportRecordViewModel.createDetailDialog(detailItem, exerciseRecord);
        if (commonDialogCreateDetailDialog instanceof ExerciseRVDialog) {
            ((ExerciseRVDialog) commonDialogCreateDetailDialog).setOnSelectListener(new ExerciseRVDialog.b() { // from class: du0
                @Override // com.xiaomi.fitness.trail.widget.ExerciseRVDialog.b
                public final void a(int i) {
                    AddSportTypeFragment.showDetailDialog$lambda$4(this.f15929a, i);
                }
            });
        }
        if (commonDialogCreateDetailDialog != null) {
            commonDialogCreateDetailDialog.addDialogCallback(new AnonymousClass2(detailItem, commonDialogCreateDetailDialog));
        }
        if (commonDialogCreateDetailDialog != null) {
            commonDialogCreateDetailDialog.showIfNeed(getParentFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDetailDialog$lambda$4(AddSportTypeFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ExerciseRecord exerciseRecord = this$0.exerciseRecord;
        if (exerciseRecord == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exerciseRecord");
            exerciseRecord = null;
        }
        exerciseRecord.setIntensity(i);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return ivi.m;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        AddTrailHelper.INSTANCE.reset();
        return super.onBackPressed();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        setLayoutManager();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        Bundle arguments;
        ExerciseRecord exerciseRecord;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString(AddTrailHelperKt.TRAIL_ADD_MORE_TYPE)) == null || (arguments = getArguments()) == null || (exerciseRecord = (ExerciseRecord) arguments.getParcelable(AddTrailHelperKt.TRAIL_ADD_MORE_RECORD)) == null) {
            return;
        }
        AddTrailHelper addTrailHelper = AddTrailHelper.INSTANCE;
        addTrailHelper.getExactlyExerciseData(exerciseRecord, new Function1() { // from class: eu0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddSportTypeFragment.onViewCreated$lambda$0(this.f17065a, (ExerciseRecord) obj);
            }
        });
        setTitle(getString(j1j.e0, string));
        ExerciseRecord exerciseRecord2 = this.exerciseRecord;
        AddTrailAdapter addTrailAdapter = null;
        if (exerciseRecord2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exerciseRecord");
            exerciseRecord2 = null;
        }
        List<AddSportTypeModel.DetailItem> listConstructExerciseEditItem = addTrailHelper.constructExerciseEditItem(exerciseRecord2);
        this.detailList = listConstructExerciseEditItem;
        Intrinsics.checkNotNull(listConstructExerciseEditItem);
        this.mAdapter = new AddTrailAdapter(listConstructExerciseEditItem);
        setLayoutManager();
        RecyclerView recyclerView = getMBinding().B;
        AddTrailAdapter addTrailAdapter2 = this.mAdapter;
        if (addTrailAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            addTrailAdapter2 = null;
        }
        recyclerView.setAdapter(addTrailAdapter2);
        AddTrailAdapter addTrailAdapter3 = this.mAdapter;
        if (addTrailAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            addTrailAdapter = addTrailAdapter3;
        }
        addTrailAdapter.setOnSetDetailListener(new Function1() { // from class: fu0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddSportTypeFragment.onViewCreated$lambda$1(this.f18240a, (AddSportTypeModel.DetailItem) obj);
            }
        });
        getMBinding().C.setOnClickListener(new View.OnClickListener() { // from class: gu0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AddSportTypeFragment.onViewCreated$lambda$2(this.f19327a, view2);
            }
        });
        IActionBar.DefaultImpls.setEndView$default(this, 0, hoi.J, null, new View.OnClickListener() { // from class: hu0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AddSportTypeFragment.onViewCreated$lambda$3(this.f20446a, view2);
            }
        }, 5, null);
    }
}
