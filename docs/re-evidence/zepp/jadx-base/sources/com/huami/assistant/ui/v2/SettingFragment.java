package com.huami.assistant.ui.v2;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.account.HMLoginManager;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.assistant.AssistantModule;
import com.huami.assistant.R;
import com.huami.assistant.ui.v2.SettingFragment;
import com.huami.assistant.ui.v2.repo.SettingRepo;
import com.huami.assistant.ui.v2.viewmodel.SettingViewModel;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.rainbow.widget.SwitchCompat;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.util.AndroidPermissions;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.xiaomi.hm.health.baseutil.NetUtil;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\f\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/assistant/ui/v2/SettingFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/huami/assistant/ui/v2/viewmodel/SettingViewModel;", "settingViewModel", "", "v", "m", "", "", hl.k, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "l", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "a", "Lcom/huami/assistant/ui/v2/viewmodel/SettingViewModel;", "viewModel", "<init>", "()V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class SettingFragment extends Fragment {

    @NotNull
    private static final String b = "SettingFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private SettingViewModel viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "request read_calendar permission result:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "request read_calendar error";
        }
    }

    private final String k(int i) {
        if (i != -540) {
            return i != 900 ? getString(R.string.no_remind) : getString(R.string.chinese_cal_remind_before);
        }
        return getString(R.string.chinese_cal_remind_today);
    }

    private final String l(Context context) {
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private final void m() {
        final int iLoadChineseCalRemindTime = SettingRepo.INSTANCE.loadChineseCalRemindTime();
        final List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{-1, -540, 900});
        AlertDialogFragment.Builder cancelable = new AlertDialogFragment.Builder(requireActivity()).setTitle(getString(R.string.set_chinese_cal_remind_time)).setCancelable(false);
        AlertDialogFragment.ChoiceItems choiceItems = new AlertDialogFragment.ChoiceItems();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it2 = listListOf.iterator();
        while (it2.hasNext()) {
            arrayList.add(k(((Number) it2.next()).intValue()));
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        cancelable.setSingleChoiceItems(choiceItems.setItems((String[]) array).setItemChoice(listListOf.indexOf(Integer.valueOf(iLoadChineseCalRemindTime))), new DialogInterface.OnClickListener() { // from class: zq6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SettingFragment.n(listListOf, iLoadChineseCalRemindTime, this, dialogInterface, i);
            }
        }).setCancelable(true).show(getChildFragmentManager(), "select remind time dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(List list, int i, SettingFragment settingFragment, DialogInterface dialogInterface, int i2) {
        int iIntValue = ((Number) list.get(i2)).intValue();
        if (i != iIntValue) {
            SettingViewModel settingViewModel = settingFragment.viewModel;
            if (settingViewModel != null) {
                settingViewModel.updateChineseCalRemindTime(iIntValue);
            }
            View view = settingFragment.getView();
            ((ListTile) (view == null ? null : view.findViewById(R.id.chinese_schedule_time))).setTips(settingFragment.k(iIntValue));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(SettingFragment settingFragment, View view) {
        FragmentKt.findNavController(settingFragment).navigateUp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(SettingFragment settingFragment, CompoundButton compoundButton, boolean z) {
        SettingViewModel settingViewModel;
        if (compoundButton.isPressed() && (settingViewModel = settingFragment.viewModel) != null) {
            settingViewModel.updateDetectNotificationSwitch(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(final SettingFragment settingFragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            if (z) {
                new RxPermissions(settingFragment.requireActivity()).request("android.permission.READ_CALENDAR").subscribe(new Consumer() { // from class: hr6
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        SettingFragment.r(this.a, (Boolean) obj);
                    }
                }, new Consumer() { // from class: ir6
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        SettingFragment.s((Throwable) obj);
                    }
                });
                return;
            }
            SettingViewModel settingViewModel = settingFragment.viewModel;
            if (settingViewModel == null) {
                return;
            }
            settingViewModel.updateSyncSystemCalendarSwitch(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(SettingFragment settingFragment, Boolean bool) {
        HMLog.info(b, new a(bool));
        SettingViewModel settingViewModel = settingFragment.viewModel;
        if (settingViewModel == null) {
            return;
        }
        settingViewModel.updateSyncSystemCalendarSwitch(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(Throwable th) {
        HMLog.error(b, "", th, b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(SettingFragment settingFragment, CompoundButton compoundButton, boolean z) {
        SettingViewModel settingViewModel;
        if (compoundButton.isPressed() && z && !NetUtil.isNetworkConnected(settingFragment.requireContext())) {
            compoundButton.setChecked(false);
            Toast.makeText(settingFragment.requireContext(), R.string.schedule_check_network, 0).show();
            return;
        }
        View view = settingFragment.getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.chinese_schedule_time))).setEnabled(z);
        if (!compoundButton.isPressed() || (settingViewModel = settingFragment.viewModel) == null) {
            return;
        }
        settingViewModel.updateSyncChineseCal(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(SettingFragment settingFragment, View view) {
        settingFragment.m();
    }

    private final void v(SettingViewModel settingViewModel) {
        settingViewModel.getAutoDetectNotificationSwitch().observe(getViewLifecycleOwner(), new Observer() { // from class: fr6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SettingFragment.x(this.a, (Boolean) obj);
            }
        });
        settingViewModel.getSyncSystemCalendarSwitch().observe(getViewLifecycleOwner(), new Observer() { // from class: gr6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SettingFragment.w(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(SettingFragment settingFragment, Boolean bool) {
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        View view = settingFragment.getView();
        ((SwitchCompat) (view == null ? null : view.findViewById(R.id.sw_sync_calendar))).setChecked(bool.booleanValue() && AndroidPermissions.checkGranted(settingFragment.requireContext(), "android.permission.READ_CALENDAR"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(SettingFragment settingFragment, Boolean bool) {
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        View view = settingFragment.getView();
        ((SwitchCompat) (view == null ? null : view.findViewById(R.id.sw_notification))).setChecked(bool.booleanValue());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_setting, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View view2 = getView();
        ((RainbowTitleBar) (view2 == null ? null : view2.findViewById(R.id.action_bar))).setTitle(R.string.smart_setting);
        View view3 = getView();
        ((RainbowTitleBar) (view3 == null ? null : view3.findViewById(R.id.action_bar))).setNavigationIcon(R.drawable.ic_arrow_back_20_2x);
        View view4 = getView();
        ((RainbowTitleBar) (view4 == null ? null : view4.findViewById(R.id.action_bar))).setNavigationOnClickListener(new View.OnClickListener() { // from class: ar6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                SettingFragment.o(this.a, view5);
            }
        });
        View view5 = getView();
        ((TextView) (view5 == null ? null : view5.findViewById(R.id.sync_calendar_summary))).setText(getString(R.string.schedule_read_system_summary_new, l(requireContext())));
        FragmentActivity activity = getActivity();
        if (activity != null) {
            try {
                this.viewModel = (SettingViewModel) new ViewModelProvider(activity, new ViewModelProvider.AndroidViewModelFactory(activity.getApplication())).get(SettingViewModel.class);
            } catch (Exception e) {
                Log.e(b, "error", e);
            }
        }
        SettingViewModel settingViewModel = this.viewModel;
        if (settingViewModel != null) {
            v(settingViewModel);
        }
        View view6 = getView();
        ((SwitchCompat) (view6 == null ? null : view6.findViewById(R.id.sw_notification))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cr6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SettingFragment.p(this.a, compoundButton, z);
            }
        });
        View view7 = getView();
        ((SwitchCompat) (view7 == null ? null : view7.findViewById(R.id.sw_sync_calendar))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: er6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SettingFragment.q(this.a, compoundButton, z);
            }
        });
        View view8 = getView();
        LinearLayout linearLayout = (LinearLayout) (view8 == null ? null : view8.findViewById(R.id.item_sync_chinese_calendar));
        SettingRepo settingRepo = SettingRepo.INSTANCE;
        linearLayout.setVisibility((settingRepo.loadScheduleVersion().getSupportPerpetualCalendarWorkday() && !AssistantModule.isOverSeaSchedule() && HMLoginManager.isInChina()) ? 0 : 8);
        View view9 = getView();
        ((ListTile) (view9 == null ? null : view9.findViewById(R.id.sync_chinese_calendar_switch))).setSubtitle(getString(R.string.show_chinese_cal_summary));
        View view10 = getView();
        ((ListTile) (view10 == null ? null : view10.findViewById(R.id.sync_chinese_calendar_switch))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: dr6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SettingFragment.t(this.a, compoundButton, z);
            }
        });
        View view11 = getView();
        ((ListTile) (view11 == null ? null : view11.findViewById(R.id.sync_chinese_calendar_switch))).setChecked(settingRepo.loadSyncChineseCal());
        View view12 = getView();
        ListTile listTile = (ListTile) (view12 == null ? null : view12.findViewById(R.id.chinese_schedule_time));
        View view13 = getView();
        listTile.setEnabled(((ListTile) (view13 == null ? null : view13.findViewById(R.id.sync_chinese_calendar_switch))).isChecked());
        int iLoadChineseCalRemindTime = settingRepo.loadChineseCalRemindTime();
        View view14 = getView();
        ((ListTile) (view14 == null ? null : view14.findViewById(R.id.chinese_schedule_time))).setTips(k(iLoadChineseCalRemindTime));
        View view15 = getView();
        ((ListTile) (view15 != null ? view15.findViewById(R.id.chinese_schedule_time) : null)).setOnClickListener(new View.OnClickListener() { // from class: br6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view16) {
                SettingFragment.u(this.a, view16);
            }
        });
    }
}
