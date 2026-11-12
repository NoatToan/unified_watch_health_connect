package com.xiaomi.fitness.heartrate.ui;

import android.content.DialogInterface;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.heartrate.ui.DetectFinishedViewHolder;
import com.xiaomi.fitness.heartrate.ui.choice.ChoiceItem;
import com.xiaomi.fitness.heartrate.ui.choice.SingleChoiceTitleSubtitleDialog;
import defpackage.av6;
import defpackage.d0j;
import defpackage.lui;
import defpackage.o2j;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/DetectFinishedViewHolder;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "mView", "Landroid/view/View;", "mViewModel", "Lcom/xiaomi/fitness/heartrate/ui/HeartRateDetectViewModel;", "<init>", "(Landroid/view/View;Lcom/xiaomi/fitness/heartrate/ui/HeartRateDetectViewModel;)V", "mItemList", "", "Lcom/xiaomi/fitness/heartrate/ui/choice/ChoiceItem;", "mActivity", "Lcom/xiaomi/fitness/heartrate/ui/CameraDetectActivity;", "onCreate", "", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "shouldShow", "isShow", "", "showSelectStatusDialog", "setSelectPosition", "selectPos", "", "Companion", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DetectFinishedViewHolder implements DefaultLifecycleObserver {

    @NotNull
    private static final String STATUS_CHOICE_DIALOG_NAME = "status_choice_dialog_name";

    @Nullable
    private CameraDetectActivity mActivity;

    @Nullable
    private List<ChoiceItem> mItemList;

    @NotNull
    private final View mView;

    @NotNull
    private final HeartRateDetectViewModel mViewModel;

    public DetectFinishedViewHolder(@NotNull View mView, @NotNull HeartRateDetectViewModel mViewModel) {
        Intrinsics.checkNotNullParameter(mView, "mView");
        Intrinsics.checkNotNullParameter(mViewModel, "mViewModel");
        this.mView = mView;
        this.mViewModel = mViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shouldShow$lambda$0(DetectFinishedViewHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showSelectStatusDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v29, types: [T, com.xiaomi.fitness.baseui.dialog.CommonDialog] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, com.xiaomi.fitness.heartrate.ui.choice.SingleChoiceTitleSubtitleDialog] */
    private final void showSelectStatusDialog() {
        if (this.mActivity == null) {
            return;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        CameraDetectActivity cameraDetectActivity = this.mActivity;
        Intrinsics.checkNotNull(cameraDetectActivity);
        ?? r1 = (SingleChoiceTitleSubtitleDialog) cameraDetectActivity.getSupportFragmentManager().l0(STATUS_CHOICE_DIALOG_NAME);
        objectRef.element = r1;
        if (r1 == 0) {
            objectRef.element = new SingleChoiceTitleSubtitleDialog.Builder(STATUS_CHOICE_DIALOG_NAME).setDialogTheme(o2j.c).setCustomLayoutId(lui.i).setDialogTitle(d0j.d).setPositiveText(d0j.T).setCanceledOnTouchOutside(false).setCanceledOnBackPressed(false).setCancelable(false).create();
        }
        if (this.mItemList == null) {
            LinkedList linkedList = new LinkedList();
            this.mItemList = linkedList;
            Intrinsics.checkNotNull(linkedList);
            linkedList.add(new ChoiceItem(d0j.o, d0j.p, 1, true));
            List<ChoiceItem> list = this.mItemList;
            Intrinsics.checkNotNull(list);
            list.add(new ChoiceItem(d0j.q, d0j.f14932r, 0));
            List<ChoiceItem> list2 = this.mItemList;
            Intrinsics.checkNotNull(list2);
            list2.add(new ChoiceItem(d0j.m, d0j.n, 2));
        }
        T t = objectRef.element;
        Intrinsics.checkNotNull(t);
        ((SingleChoiceTitleSubtitleDialog) t).addDialogCallback(new av6() { // from class: com.xiaomi.fitness.heartrate.ui.DetectFinishedViewHolder.showSelectStatusDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                CameraDetectActivity cameraDetectActivity2 = DetectFinishedViewHolder.this.mActivity;
                StringBuilder sb = new StringBuilder();
                sb.append("onDialogClick: ");
                sb.append(cameraDetectActivity2);
                if (DetectFinishedViewHolder.this.mActivity != null) {
                    CameraDetectActivity cameraDetectActivity3 = DetectFinishedViewHolder.this.mActivity;
                    Intrinsics.checkNotNull(cameraDetectActivity3);
                    cameraDetectActivity3.openDetectReportFragment(objectRef.element.getSelectPosition());
                }
            }
        });
        SingleChoiceTitleSubtitleDialog singleChoiceTitleSubtitleDialog = (SingleChoiceTitleSubtitleDialog) objectRef.element;
        List<ChoiceItem> list3 = this.mItemList;
        Intrinsics.checkNotNull(list3);
        singleChoiceTitleSubtitleDialog.setItemList(list3);
        SingleChoiceTitleSubtitleDialog singleChoiceTitleSubtitleDialog2 = (SingleChoiceTitleSubtitleDialog) objectRef.element;
        CameraDetectActivity cameraDetectActivity2 = this.mActivity;
        Intrinsics.checkNotNull(cameraDetectActivity2);
        singleChoiceTitleSubtitleDialog2.showIfNeed(cameraDetectActivity2.getSupportFragmentManager());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        if (owner instanceof CameraDetectActivity) {
            this.mActivity = (CameraDetectActivity) owner;
        }
    }

    public final void setSelectPosition(int selectPos) {
        List<ChoiceItem> list = this.mItemList;
        if (list == null || list.isEmpty()) {
            return;
        }
        List<ChoiceItem> list2 = this.mItemList;
        Intrinsics.checkNotNull(list2);
        this.mViewModel.setType(list2.get(selectPos).getMType());
    }

    public final void shouldShow(boolean isShow) {
        this.mView.setVisibility(isShow ? 0 : 8);
        ExecutorHelper.postInMain(new Runnable() { // from class: tz5
            @Override // java.lang.Runnable
            public final void run() {
                DetectFinishedViewHolder.shouldShow$lambda$0(this.f35202a);
            }
        }, 500L);
    }
}
