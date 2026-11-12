package com.xiaomi.fitness.trail;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.trail.ChooseSportTypeFragment;
import com.xiaomi.fitness.trail.adapter.ChooseTypeAdapter;
import com.xiaomi.fitness.trail.data.ExerciseRecord;
import com.xiaomi.fitness.trail.viewmodel.ChooseSportTypeViewModel;
import com.xiaomi.fitness.trail.widget.TimeUnitPickerDialog;
import com.xiaomi.fitness.util.AddTrailHelper;
import com.xiaomi.fitness.util.AddTrailHelperKt;
import defpackage.av6;
import defpackage.byi;
import defpackage.dih;
import defpackage.dki;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.w4a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/trail/ChooseSportTypeFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/trail/viewmodel/ChooseSportTypeViewModel;", "Lw4a;", "Lcom/xiaomi/fitness/util/AddTrailHelper$SportTypeInfo;", "sportTypeInfo", "", "initDialog", "(Lcom/xiaomi/fitness/util/AddTrailHelper$SportTypeInfo;)V", "", "name", "Lcom/xiaomi/fitness/trail/data/ExerciseRecord;", "exerciseRecord", "showDialog", "(Ljava/lang/String;Lcom/xiaomi/fitness/trail/data/ExerciseRecord;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "sportList", "Ljava/util/List;", "Lcom/xiaomi/fitness/trail/adapter/ChooseTypeAdapter;", "adapter", "Lcom/xiaomi/fitness/trail/adapter/ChooseTypeAdapter;", "", "getLayoutId", "()I", "layoutId", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ChooseSportTypeFragment extends BaseBindingFragment<ChooseSportTypeViewModel, w4a> {

    @Nullable
    private ChooseTypeAdapter adapter;

    @NotNull
    private List<AddTrailHelper.SportTypeInfo> sportList = new ArrayList();

    /* JADX INFO: renamed from: com.xiaomi.fitness.trail.ChooseSportTypeFragment$showDialog$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/trail/ChooseSportTypeFragment$showDialog$2", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass2 extends av6 {
        final /* synthetic */ ExerciseRecord $exerciseRecord;
        final /* synthetic */ TimeUnitPickerDialog $simpleDialog;

        public AnonymousClass2(ExerciseRecord exerciseRecord, TimeUnitPickerDialog timeUnitPickerDialog) {
            this.$exerciseRecord = exerciseRecord;
            this.$simpleDialog = timeUnitPickerDialog;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(ExerciseRecord it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AddTrailHelper.INSTANCE.syncSportRecord(it);
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            super.onDialogClick(dialogName, dialog, which);
            if (which == -2) {
                if (dialog != null) {
                    dialog.dismiss();
                }
            } else {
                if (which != -1) {
                    return;
                }
                this.$exerciseRecord.setDuration(this.$simpleDialog.getValue());
                AddTrailHelper addTrailHelper = AddTrailHelper.INSTANCE;
                addTrailHelper.getExactlyExerciseData(addTrailHelper.getDefaultRecord(this.$exerciseRecord.getSportType(), (int) this.$exerciseRecord.getDuration()), new Function1() { // from class: qv3
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return ChooseSportTypeFragment.AnonymousClass2.onDialogClick$lambda$0((ExerciseRecord) obj);
                    }
                });
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }
    }

    private final void initDialog(AddTrailHelper.SportTypeInfo sportTypeInfo) {
        showDialog(sportTypeInfo.getName(), AddTrailHelper.INSTANCE.getDefaultRecord(sportTypeInfo.getTypeInt(), 30));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(ChooseSportTypeFragment this$0, AddTrailHelper.SportTypeInfo it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.initDialog(it);
        return Unit.INSTANCE;
    }

    private final void showDialog(final String name, final ExerciseRecord exerciseRecord) {
        try {
            final List list = CollectionsKt___CollectionsKt.toList(new IntRange(1, AddTrailHelper.INSTANCE.getMinuteBySeconds(exerciseRecord.getStartTime())));
            final TimeUnitPickerDialog timeUnitPickerDialogCreate = new TimeUnitPickerDialog.Builder("add record dialog").setDialogTitle(new DialogParams.DialogDescriptionString(name)).setCustomLayoutId(ivi.v1).setPositiveText(j1j.c).setNegativeText(j1j.f22329b).setAdapter(new TimeUnitPickerDialog.Adapter() { // from class: com.xiaomi.fitness.trail.ChooseSportTypeFragment$showDialog$simpleDialog$1
                @Override // com.xiaomi.fitness.trail.widget.TimeUnitPickerDialog.Adapter
                public int getCount() {
                    return list.size();
                }

                @Override // com.xiaomi.fitness.trail.widget.TimeUnitPickerDialog.Adapter
                public int getValue(int index) {
                    return list.get(index).intValue();
                }
            }).create();
            timeUnitPickerDialogCreate.setValue(30);
            timeUnitPickerDialogCreate.setPickerHintTextPluralsRes(byi.t);
            timeUnitPickerDialogCreate.setGoDetailListener(new Function0() { // from class: pv3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChooseSportTypeFragment.showDialog$lambda$1(timeUnitPickerDialogCreate, exerciseRecord, name, this);
                }
            });
            timeUnitPickerDialogCreate.addDialogCallback(new AnonymousClass2(exerciseRecord, timeUnitPickerDialogCreate)).showIfNeed(getParentFragmentManager());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDialog$lambda$1(TimeUnitPickerDialog timeUnitPickerDialog, ExerciseRecord exerciseRecord, String name, ChooseSportTypeFragment this$0) {
        Intrinsics.checkNotNullParameter(exerciseRecord, "$exerciseRecord");
        Intrinsics.checkNotNullParameter(name, "$name");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        timeUnitPickerDialog.dismiss();
        exerciseRecord.setDuration(timeUnitPickerDialog.getValue());
        Bundle bundle = new Bundle();
        bundle.putString(AddTrailHelperKt.TRAIL_ADD_MORE_TYPE, name);
        bundle.putParcelable(AddTrailHelperKt.TRAIL_ADD_MORE_RECORD, AddTrailHelper.INSTANCE.getDefaultRecord(exerciseRecord.getSportType(), (int) exerciseRecord.getDuration()));
        FragmentParams fragmentParamsB = new FragmentParams.b().e(AddSportTypeFragment.class).a(true).c(bundle).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().f(this$0.requireContext(), fragmentParamsB, true);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return ivi.n;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitleBackground(dki.S0);
        setTitle(j1j.j2);
        List<AddTrailHelper.SportTypeInfo> listInitSportList = AddTrailHelper.INSTANCE.initSportList();
        this.sportList = listInitSportList;
        ChooseTypeAdapter chooseTypeAdapter = new ChooseTypeAdapter(listInitSportList);
        this.adapter = chooseTypeAdapter;
        chooseTypeAdapter.setOnGODetailListener(new Function1() { // from class: ov3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ChooseSportTypeFragment.onViewCreated$lambda$0(this.f29715a, (AddTrailHelper.SportTypeInfo) obj);
            }
        });
        getMBinding().A.setLayoutManager(new LinearLayoutManager(getMActivity()));
        getMBinding().A.setAdapter(this.adapter);
    }
}
