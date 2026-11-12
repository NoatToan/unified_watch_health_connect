package com.xiaomi.fitness.training_plan.habit_plan;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.mine.export.IWebSync;
import com.xiaomi.fitness.training_plan.adapter.HabitMedalAdapter;
import com.xiaomi.fitness.training_plan.habit_plan.HabitCreateEntranceDialog;
import com.xiaomi.fitness.training_plan.util.CalendarUtils;
import com.xiaomi.fitness.training_plan.util.TrainingSportUtils;
import com.xiaomi.fitness.training_plan.widget.HabitLaunchSportDialog;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import defpackage.csi;
import defpackage.cyi;
import defpackage.ioi;
import defpackage.jvi;
import defpackage.k1j;
import defpackage.u2j;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u000eH\u0016J\u000e\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitCreateEntranceDialog;", "Landroidx/fragment/app/DialogFragment;", "hasHabitHistory", "", "fromRnPlan", "<init>", "(ZZ)V", "getHasHabitHistory", "()Z", "getFromRnPlan", "titleTV", "Landroid/widget/TextView;", "descTV", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "checkAndHintCloudSync", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "acceptedAction", "Lkotlin/Function0;", LifecycleConstantKt.ON_START, "show", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitCreateEntranceDialog extends DialogFragment {

    @NotNull
    private static final String TAG = "HabitCreateEntranceDialog";

    @Nullable
    private TextView descTV;
    private final boolean fromRnPlan;
    private final boolean hasHabitHistory;

    @Nullable
    private TextView titleTV;

    public HabitCreateEntranceDialog(boolean z, boolean z2) {
        this.hasHabitHistory = z;
        this.fromRnPlan = z2;
    }

    private final void checkAndHintCloudSync(FragmentActivity activity, boolean fromRnPlan, final Function0<Unit> acceptedAction) {
        if (!fromRnPlan) {
            acceptedAction.invoke();
        } else if (RegionPreference.INSTANCE.getSyncWeb()) {
            acceptedAction.invoke();
        } else {
            TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).showCloudSyncDialog(activity, new IWebSync() { // from class: com.xiaomi.fitness.training_plan.habit_plan.HabitCreateEntranceDialog.checkAndHintCloudSync.1
                @Override // com.xiaomi.fitness.mine.export.IWebSync
                public void onPrivacyNotAgree() {
                    IWebSync.DefaultImpls.onPrivacyNotAgree(this);
                }

                @Override // com.xiaomi.fitness.mine.export.IWebSync
                public void onWebSyncAccepted() {
                    acceptedAction.invoke();
                }

                @Override // com.xiaomi.fitness.mine.export.IWebSync
                public void onWebSyncDenied() {
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$11$lambda$10(final HabitCreateEntranceDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        final HabitDayPlan habitDayPlan = new HabitDayPlan(TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).getInitHabitPlanId(), false, 1.0f, System.currentTimeMillis() / ((long) 1000), CalendarUtils.INSTANCE.calcDayOfWeek(new Date()), 2, null, true, 66, null);
        HabitLaunchSportDialog.INSTANCE.defaultBuilder("today_train_to_sport").create().setOutdoorRunClickListener(new Function0() { // from class: jeb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HabitCreateEntranceDialog.onCreateView$lambda$11$lambda$10$lambda$8$lambda$3(this.f22698a, fragmentActivityRequireActivity, habitDayPlan);
            }
        }).setWalkClickListener(new Function0() { // from class: keb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HabitCreateEntranceDialog.onCreateView$lambda$11$lambda$10$lambda$8$lambda$5(this.f23771a, fragmentActivityRequireActivity, habitDayPlan);
            }
        }).setIndoorRunClickListener(new Function0() { // from class: leb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HabitCreateEntranceDialog.onCreateView$lambda$11$lambda$10$lambda$8$lambda$7(this.f24967a, fragmentActivityRequireActivity, habitDayPlan);
            }
        }).showIfNeed(fragmentActivityRequireActivity.getSupportFragmentManager());
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateView$lambda$11$lambda$10$lambda$8$lambda$3(HabitCreateEntranceDialog this$0, final FragmentActivity fragmentActivity, final HabitDayPlan plan) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        Intrinsics.checkNotNullParameter(plan, "$plan");
        this$0.checkAndHintCloudSync(fragmentActivity, this$0.fromRnPlan, new Function0() { // from class: ieb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HabitCreateEntranceDialog.onCreateView$lambda$11$lambda$10$lambda$8$lambda$3$lambda$2(fragmentActivity, plan);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateView$lambda$11$lambda$10$lambda$8$lambda$3$lambda$2(FragmentActivity fragmentActivity, HabitDayPlan plan) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        Intrinsics.checkNotNullParameter(plan, "$plan");
        TrainingSportUtils.INSTANCE.startHabitTrainingSport(fragmentActivity, 1, plan);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateView$lambda$11$lambda$10$lambda$8$lambda$5(HabitCreateEntranceDialog this$0, final FragmentActivity fragmentActivity, final HabitDayPlan plan) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        Intrinsics.checkNotNullParameter(plan, "$plan");
        this$0.checkAndHintCloudSync(fragmentActivity, this$0.fromRnPlan, new Function0() { // from class: meb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HabitCreateEntranceDialog.onCreateView$lambda$11$lambda$10$lambda$8$lambda$5$lambda$4(fragmentActivity, plan);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateView$lambda$11$lambda$10$lambda$8$lambda$5$lambda$4(FragmentActivity fragmentActivity, HabitDayPlan plan) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        Intrinsics.checkNotNullParameter(plan, "$plan");
        TrainingSportUtils.INSTANCE.startHabitTrainingSport(fragmentActivity, 2, plan);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateView$lambda$11$lambda$10$lambda$8$lambda$7(HabitCreateEntranceDialog this$0, final FragmentActivity fragmentActivity, final HabitDayPlan plan) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        Intrinsics.checkNotNullParameter(plan, "$plan");
        this$0.checkAndHintCloudSync(fragmentActivity, this$0.fromRnPlan, new Function0() { // from class: neb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HabitCreateEntranceDialog.onCreateView$lambda$11$lambda$10$lambda$8$lambda$7$lambda$6(fragmentActivity, plan);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateView$lambda$11$lambda$10$lambda$8$lambda$7$lambda$6(FragmentActivity fragmentActivity, HabitDayPlan plan) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        Intrinsics.checkNotNullParameter(plan, "$plan");
        TrainingSportUtils.INSTANCE.startHabitTrainingSport(fragmentActivity, 3, plan);
        return Unit.INSTANCE;
    }

    public final boolean getFromRnPlan() {
        return this.fromRnPlan;
    }

    public final boolean getHasHabitHistory() {
        return this.hasHabitHistory;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, u2j.f35312a);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(jvi.B, container, false);
        this.titleTV = (TextView) viewInflate.findViewById(csi.I3);
        this.descTV = (TextView) viewInflate.findViewById(csi.X);
        TextView textView = this.titleTV;
        if (textView != null) {
            textView.setText(getString(k1j.c1));
        }
        TextView textView2 = this.descTV;
        if (textView2 != null) {
            textView2.setText(getString(this.hasHabitHistory ? k1j.q1 : k1j.z0));
        }
        ArrayList arrayList = new ArrayList();
        String string = getString(k1j.N0);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        arrayList.add(new HabitMedalData(false, false, string, ioi.B));
        arrayList.add(new HabitMedalData(false, false, ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.s, 10, 10), ioi.D));
        arrayList.add(new HabitMedalData(false, false, ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.s, 30, 30), ioi.F));
        String string2 = getString(k1j.O0);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        arrayList.add(new HabitMedalData(false, false, string2, ioi.H));
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(csi.p0);
        if (recyclerView != null) {
            recyclerView.setAdapter(new HabitMedalAdapter(arrayList));
        }
        TextView textView3 = (TextView) viewInflate.findViewById(csi.K);
        if (textView3 != null) {
            textView3.setOnClickListener(new View.OnClickListener() { // from class: oeb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HabitCreateEntranceDialog.onCreateView$lambda$11$lambda$10(this.f29066a, view);
                }
            });
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        UIUtils uIUtils = UIUtils.INSTANCE;
        if (!uIUtils.isTablet()) {
            window.setLayout(-1, -2);
            window.setGravity(80);
        } else {
            Context context = window.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            window.setLayout((int) (((double) uIUtils.getScreenWidth(context)) * 0.85d), -2);
        }
    }

    public final void show(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        if (fragmentManager.L0()) {
            return;
        }
        try {
            fragmentManager.o().v(this).l();
            super.show(fragmentManager, getTag());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
