package com.xiaomi.hm.health.ui.goal.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.wheelview.WheelView;
import com.xiaomi.hm.health.ui.goal.manager.SportGoalPickerManager;
import com.xiaomi.hm.health.ui.goal.ui.SetSportGoalFragment;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/ui/goal/ui/SetSportGoalFragment;", "Lcom/huami/android/design/dialog/BaseDialogFragment;", "Landroid/view/View;", "initView", "", "hasPadding", "hasBackground", "Lcom/xiaomi/hm/health/ui/goal/ui/OnDataChanged;", "e", "Lcom/xiaomi/hm/health/ui/goal/ui/OnDataChanged;", "onDataChange", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SetSportGoalFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private OnDataChanged onDataChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/goal/ui/SetSportGoalFragment$Companion;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lcom/xiaomi/hm/health/ui/goal/ui/OnDataChanged;", "onDataChange", "", "show", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void show(@NotNull FragmentManager fragmentManager, @NotNull OnDataChanged onDataChange) {
            SetSportGoalFragment setSportGoalFragment = new SetSportGoalFragment();
            setSportGoalFragment.onDataChange = onDataChange;
            setSportGoalFragment.show(fragmentManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SportGoalPickerManager sportGoalPickerManager, SetSportGoalFragment setSportGoalFragment, View view) {
        sportGoalPickerManager.saveData();
        OnDataChanged onDataChanged = setSportGoalFragment.onDataChange;
        if (onDataChanged != null) {
            onDataChanged.onDataChanged();
        }
        setSportGoalFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SetSportGoalFragment setSportGoalFragment, View view) {
        setSportGoalFragment.dismiss();
    }

    @JvmStatic
    public static final void show(@NotNull FragmentManager fragmentManager, @NotNull OnDataChanged onDataChanged) {
        INSTANCE.show(fragmentManager, onDataChanged);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @NotNull
    public View initView() {
        LayoutInflater layoutInflater = getLayoutInflater();
        View view = getView();
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_set_sport_goal, (ViewGroup) view, false);
        final SportGoalPickerManager sportGoalPickerManager = new SportGoalPickerManager((WheelView) viewInflate.findViewById(R.id.wheel_sport_step));
        sportGoalPickerManager.init();
        ((TextView) viewInflate.findViewById(R.id.btn_save)).setOnClickListener(new View.OnClickListener() { // from class: eq6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SetSportGoalFragment.e(sportGoalPickerManager, this, view2);
            }
        });
        ((TextView) viewInflate.findViewById(R.id.btn_cancel)).setOnClickListener(new View.OnClickListener() { // from class: fq6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SetSportGoalFragment.f(this.a, view2);
            }
        });
        return viewInflate;
    }
}
