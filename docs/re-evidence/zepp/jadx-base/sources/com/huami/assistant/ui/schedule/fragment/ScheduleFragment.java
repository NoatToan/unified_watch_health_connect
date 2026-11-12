package com.huami.assistant.ui.schedule.fragment;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.daimajia.swipe.util.Attributes;
import com.huami.assistant.AssistantModule;
import com.huami.assistant.R;
import com.huami.assistant.alarm.Alarm;
import com.huami.assistant.arch.ScheduleViewModel;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.ui.activity.EditAlarmActivity;
import com.huami.assistant.ui.activity.ScheduleSettingHostActivity;
import com.huami.assistant.ui.fragment.UpdateFragmentStartDelegate;
import com.huami.assistant.ui.helper.LoadingDialogHelper;
import com.huami.assistant.ui.schedule.activity.ScheduleDetailActivity;
import com.huami.assistant.ui.schedule.activity.ScheduleEditActivity;
import com.huami.assistant.ui.schedule.adapter.ScheduleAdapter;
import com.huami.assistant.ui.schedule.view.ScheduleListDateInfoView;
import com.huami.assistant.ui.schedule.view.ScheduleListFooterDecoration;
import com.huami.assistant.util.UpdateParser;
import com.huami.assistant.util.UpdateUtil;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.ui.view.ToastWithIcon;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.DensityUtil;
import com.huami.watch.util.Log;
import com.oubowu.stickyitemdecoration.StickyHeadContainer;
import com.oubowu.stickyitemdecoration.StickyItemDecoration;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ScheduleFragment extends Fragment implements BaseQuickAdapter.OnItemChildClickListener, BaseQuickAdapter.OnItemClickListener, View.OnClickListener {
    public static final String MAIN_MODULE_TOOL_KEY_NAME = "ASSISTANT";
    private static final String j = "ScheduleFragment";
    private RecyclerView a;
    private ScheduleListDateInfoView b;
    private StickyHeadContainer c;
    private View d;
    private ScheduleAdapter e;
    private DialogFragment f;
    private LoadingDialogHelper g;
    private ScheduleViewModel h;
    private boolean i = true;

    private boolean h() {
        boolean zIsDeviceConnected = AssistantModule.isDeviceConnected(getActivity());
        if (!zIsDeviceConnected) {
            ToastWithIcon.showShort(getActivity(), getString(R.string.connect_watch_toast), R.drawable.toast_icon_attention);
        }
        return zIsDeviceConnected;
    }

    private void i(@NonNull Update update) {
        try {
            Alarm alarm = UpdateParser.toAlarm(update.data);
            Intent intent = new Intent(getActivity(), (Class<?>) EditAlarmActivity.class);
            intent.putExtra("UpdateId", update.getId());
            intent.putExtra("alarm", alarm);
            startActivity(intent);
        } catch (Exception e) {
            Log.e(j, e.getMessage(), e, new Object[0]);
        }
    }

    private void initView(View view) {
        l(view);
        this.a = (RecyclerView) view.findViewById(R.id.rv_update);
        this.b = (ScheduleListDateInfoView) view.findViewById(R.id.tv_update_date);
        this.c = (StickyHeadContainer) view.findViewById(R.id.stick_head_container);
        this.d = view.findViewById(R.id.layout_dynamic_empty);
        view.findViewById(R.id.iv_add).setOnClickListener(this);
    }

    private void j() {
        this.a.setNestedScrollingEnabled(false);
        this.a.setHasFixedSize(true);
        this.a.setFocusableInTouchMode(false);
        ScheduleAdapter scheduleAdapter = new ScheduleAdapter();
        this.e = scheduleAdapter;
        scheduleAdapter.setMode(Attributes.Mode.Single);
        this.e.setOnItemClickListener(this);
        this.e.setOnItemChildClickListener(this);
        this.a.setAdapter(this.e);
        this.a.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.a.addItemDecoration(new ScheduleListFooterDecoration());
    }

    private void k() {
        this.c.setDataCallback(new StickyHeadContainer.DataCallback() { // from class: pi6
            @Override // com.oubowu.stickyitemdecoration.StickyHeadContainer.DataCallback
            public final void onDataChange(int i) {
                this.a.m(i);
            }
        });
        this.a.addItemDecoration(new StickyItemDecoration(this.c, 10001));
    }

    private void l(View view) {
        ActionbarLayout actionbarLayout = (ActionbarLayout) view.findViewById(R.id.actionbar);
        actionbarLayout.setTitleText(getString(R.string.schedule));
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: li6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.n(view2);
            }
        });
        actionbarLayout.setRightText(getString(R.string.smart_setting));
        actionbarLayout.setRightTextClickListener(new View.OnClickListener() { // from class: mi6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.o(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(int i) {
        Object item = this.e.getItem(i - this.e.getHeaderLayoutCount());
        if (item instanceof Long) {
            this.b.setTime(((Long) item).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(View view) {
        requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(View view) {
        if (AssistantModule.isBleDevice()) {
            ScheduleSettingHostActivity.start(requireContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(final List list) {
        if (ArraysUtil.isEmpty(list)) {
            this.d.setVisibility(0);
            this.a.setVisibility(8);
            this.b.setTime(System.currentTimeMillis());
            this.i = true;
            return;
        }
        this.d.setVisibility(8);
        this.a.setVisibility(0);
        this.e.setNewData(list);
        this.e.expandAll();
        this.a.post(new Runnable() { // from class: qi6
            @Override // java.lang.Runnable
            public final void run() {
                this.a.p(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(Result result) {
        this.g.showOrError(result, getString(R.string.update_deleting), getString(R.string.delete_success), getString(R.string.delete_failed));
        if (result == null || !result.isSuccess()) {
            return;
        }
        this.h.loadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(Update update, DialogInterface dialogInterface, int i) {
        this.h.deleteUpdate(update);
    }

    private void t() {
        this.h.updates.observe(getViewLifecycleOwner(), new Observer() { // from class: oi6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.q((List) obj);
            }
        });
        this.h.deleteUpdateResult.observe(getViewLifecycleOwner(), new Observer() { // from class: ni6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.r((Result) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void p(@NonNull List<Object> updates) {
        if (this.i) {
            int scheduleTodayItemPosition = UpdateUtil.getScheduleTodayItemPosition(updates);
            ((LinearLayoutManager) this.a.getLayoutManager()).scrollToPositionWithOffset(scheduleTodayItemPosition, this.e.getItemViewType(scheduleTodayItemPosition) != 10001 ? (int) DensityUtil.dpToPx(getActivity(), 66.0f) : 0);
            this.i = false;
        }
    }

    private DialogFragment v(@NonNull Activity activity, final Update update) {
        return AlertDialog.setMessage(getString(R.string.delete_update_confirm)).setNegativeBtn(getString(R.string.cancel)).setPositiveBtn(getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: ki6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.s(update, dialogInterface, i);
            }
        }).show(activity, "delete update confirm");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        if (h() && getActivity() != null && v.getId() == R.id.iv_add) {
            ScheduleEditActivity.to(getActivity());
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_schedule, container, false);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemChildClickListener
    public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
        if (!h() || getActivity() == null) {
            return;
        }
        Object item = adapter.getItem(position);
        if (item instanceof Update) {
            Update update = (Update) item;
            LoadingDialog.dismiss(this.f);
            this.e.closeAllItems();
            int id = view.getId();
            if (id == R.id.tv_delete) {
                this.f = v(getActivity(), update);
                return;
            }
            if (id == R.id.tv_edit) {
                int i = update.type;
                if (i == 2) {
                    ScheduleEditActivity.to(getActivity(), update, update.startTime);
                } else if (i == 1) {
                    i(update);
                }
            }
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
        Object item = adapter.getItem(position);
        if (item instanceof Update) {
            Update update = (Update) item;
            if (update.type == 2) {
                UpdateParser.toEvent(update.data);
                ScheduleDetailActivity.to(requireActivity(), update);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        UpdateFragmentStartDelegate.INSTANCE.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.h = (ScheduleViewModel) ViewModelProviders.of(this).get(ScheduleViewModel.class);
        this.g = new LoadingDialogHelper(getActivity());
        initView(view);
        j();
        t();
        UpdateFragmentStartDelegate.INSTANCE.onStart(getActivity());
    }
}
