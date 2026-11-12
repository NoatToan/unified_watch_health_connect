package com.huami.assistant.ui.v2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p010navigation.fragment.FragmentKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.assistant.R;
import com.huami.assistant.ui.v2.MainFragment;
import com.huami.assistant.ui.v2.repo.SettingRepo;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.loc.z;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0011"}, d2 = {"Lcom/huami/assistant/ui/v2/MainFragment;", "Landroidx/fragment/app/Fragment;", "", "h", z.j, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class MainFragment extends Fragment {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(MainFragment mainFragment, View view) {
        FragmentActivity activity = mainFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(MainFragment mainFragment, View view, int i) {
        FragmentKt.findNavController(mainFragment).navigate(R.id.action_to_setting);
    }

    private final void h() {
        View view = getView();
        ((AppCompatTextView) (view == null ? null : view.findViewById(R.id.btnAssistantAppend))).setOnClickListener(new View.OnClickListener() { // from class: xu4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MainFragment.i(this.a, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(MainFragment mainFragment, View view) {
        FragmentKt.findNavController(mainFragment).navigate(R.id.action_to_add);
    }

    private final void j() {
        SettingRepo settingRepo = SettingRepo.INSTANCE;
        if (!settingRepo.loadSyncCalendarDialogShow() || settingRepo.loadSyncCalendar()) {
            return;
        }
        new AlertDialogFragment.Builder(requireActivity()).setTitle(R.string.open_system_schedule_title).setMessage(R.string.open_system_schedule_summary).setNegativeButton(R.string.open_system_schedule_button_not, new DialogInterface.OnClickListener() { // from class: vu4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MainFragment.k(dialogInterface, i);
            }
        }).setPositiveButton(R.string.open_system_schedule_button_yes, new DialogInterface.OnClickListener() { // from class: uu4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MainFragment.l(this.a, dialogInterface, i);
            }
        }).show(getChildFragmentManager(), "open system schedule");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(DialogInterface dialogInterface, int i) {
        SettingRepo.INSTANCE.updateSyncCalendarDialogShow(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(MainFragment mainFragment, DialogInterface dialogInterface, int i) {
        FragmentKt.findNavController(mainFragment).navigate(R.id.action_to_setting);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        String string = arguments == null ? null : arguments.getString(ScheduleActivity.KEY_SCHEDULE_TITLE);
        if (string == null) {
            string = getString(R.string.schedule);
        }
        View view2 = getView();
        ((RainbowTitleBar) (view2 == null ? null : view2.findViewById(R.id.action_bar))).setTitle(string);
        View view3 = getView();
        ((RainbowTitleBar) (view3 == null ? null : view3.findViewById(R.id.action_bar))).setNavigationOnClickListener(new View.OnClickListener() { // from class: wu4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                MainFragment.f(this.a, view4);
            }
        });
        View view4 = getView();
        ((RainbowTitleBar) (view4 == null ? null : view4.findViewById(R.id.action_bar))).setMenuText(R.string.smart_setting);
        View view5 = getView();
        ((RainbowTitleBar) (view5 != null ? view5.findViewById(R.id.action_bar) : null)).setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: yu4
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view6, int i) {
                MainFragment.g(this.a, view6, i);
            }
        });
        h();
        getChildFragmentManager().beginTransaction().replace(R.id.content, new ScheduleListFragment()).commit();
        j();
    }
}
