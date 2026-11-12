package com.huami.assistant.ui.fragment;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
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
import com.huami.assistant.arch.UpdatesViewModel;
import com.huami.assistant.delegate.AssistantToolUtilsDelegate;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.ui.activity.EditAlarmActivity;
import com.huami.assistant.ui.activity.EditScheduleActivity;
import com.huami.assistant.ui.activity.ScheduleSettingHostActivity;
import com.huami.assistant.ui.adapter.UpdatesAdapter;
import com.huami.assistant.ui.helper.LoadingDialogHelper;
import com.huami.assistant.ui.widget.DateInfoView;
import com.huami.assistant.ui.widget.UpdatesFooterDecoration;
import com.huami.assistant.util.AssistantAnalyticsEvents;
import com.huami.assistant.util.PinUtil;
import com.huami.assistant.util.UpdateParser;
import com.huami.assistant.util.UpdateUtil;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.ui.view.ToastWithIcon;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.DensityUtil;
import com.huami.watch.util.Log;
import com.oubowu.stickyitemdecoration.StickyHeadContainer;
import com.oubowu.stickyitemdecoration.StickyItemDecoration;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class UpdatesFragment extends Fragment implements BaseQuickAdapter.OnItemChildClickListener, View.OnClickListener {
    public static final String MAIN_MODULE_TOOL_KEY_NAME = "ASSISTANT";
    private static final String j = "UpdatesFragment";
    private RecyclerView a;
    private DateInfoView b;
    private StickyHeadContainer c;
    private View d;
    private UpdatesAdapter e;
    private DialogFragment f;
    private LoadingDialogHelper g;
    private UpdatesViewModel h;
    private boolean i = true;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(Update update, Activity activity, int i) {
        if (i == 0) {
            this.h.deletePin(update);
        } else {
            I(activity, update);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(Update update, int i) {
        this.h.addPin(update, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(Activity activity, Update update, DialogInterface dialogInterface, int i) {
        I(activity, update);
    }

    private void D() {
        this.h.updates.observe(this, new Observer() { // from class: f48
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.v((List) obj);
            }
        });
        this.h.deleteUpdateResult.observe(this, new Observer() { // from class: e48
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.w((Result) obj);
            }
        });
        this.h.addPinResult.observe(this, new Observer() { // from class: d48
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.x((Result) obj);
            }
        });
        this.h.deletePinResult.observe(this, new Observer() { // from class: c48
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.y((Result) obj);
            }
        });
    }

    private DialogFragment E(Activity activity, Update update) {
        if (PinUtil.isUpdateHasPin(update)) {
            return H(activity, update);
        }
        Analytics.event(getContext(), AssistantAnalyticsEvents.getFixEventIdById(update.type));
        return !ArraysUtil.isEmpty(UpdatesManager.getManager().getPinData()) ? J(activity, update) : I(activity, update);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void u(@NonNull List<Object> updates) {
        if (this.i) {
            int todayLatestItem = UpdateUtil.getTodayLatestItem(updates);
            ((LinearLayoutManager) this.a.getLayoutManager()).scrollToPositionWithOffset(todayLatestItem, this.e.getItemViewType(todayLatestItem) != 10001 ? (int) DensityUtil.dpToPx(getActivity(), 48.0f) : 0);
            this.i = false;
        }
    }

    private DialogFragment G(@NonNull Activity activity, final Update update) {
        return AlertDialog.setMessage(getString(R.string.delete_update_confirm)).setNegativeBtn(getString(R.string.cancel)).setPositiveBtn(getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: z38
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.z(update, dialogInterface, i);
            }
        }).show(activity, "delete update confirm");
    }

    private DialogFragment H(@NonNull final Activity activity, final Update update) {
        return new PinOperateFragment().show(activity, new PinOperateFragment.PinResetClickListener() { // from class: g48
            @Override // com.huami.assistant.ui.fragment.PinOperateFragment.PinResetClickListener
            public final void onClick(int i) {
                this.a.A(update, activity, i);
            }
        });
    }

    private DialogFragment I(Activity activity, final Update update) {
        return new PinTimePickerFragment().show(activity, new PinTimePickerFragment.TimeSelectListener() { // from class: h48
            @Override // com.huami.assistant.ui.fragment.PinTimePickerFragment.TimeSelectListener
            public final void onSelect(int i) {
                this.a.B(update, i);
            }
        });
    }

    private DialogFragment J(@NonNull final Activity activity, final Update update) {
        return AlertDialog.setMessage(getString(R.string.change_pin_item_msg)).setNegativeBtn(getString(R.string.cancel)).setPositiveBtn(getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: w38
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.C(activity, update, dialogInterface, i);
            }
        }).show(activity, "reset pin dialog");
    }

    private void initView(View view) {
        q(view);
        this.a = (RecyclerView) view.findViewById(R.id.rv_update);
        this.b = (DateInfoView) view.findViewById(R.id.tv_top_date);
        this.c = (StickyHeadContainer) view.findViewById(R.id.stick_head_container);
        this.d = view.findViewById(R.id.layout_dynamic_empty);
        view.findViewById(R.id.iv_add).setOnClickListener(this);
        view.findViewById(R.id.iv_more).setOnClickListener(this);
    }

    private boolean m() {
        boolean zIsDeviceConnected = AssistantModule.isDeviceConnected(getActivity());
        if (!zIsDeviceConnected) {
            ToastWithIcon.showShort(getActivity(), getString(R.string.connect_watch_toast), R.drawable.toast_icon_attention);
        }
        return zIsDeviceConnected;
    }

    private void n(@NonNull Update update) {
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

    private void o() {
        this.a.setNestedScrollingEnabled(false);
        this.a.setHasFixedSize(true);
        this.a.setFocusableInTouchMode(false);
        UpdatesAdapter updatesAdapter = new UpdatesAdapter();
        this.e = updatesAdapter;
        updatesAdapter.setMode(Attributes.Mode.Single);
        this.e.setOnItemChildClickListener(this);
        this.a.setAdapter(this.e);
        this.a.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.a.addItemDecoration(new UpdatesFooterDecoration());
    }

    private void p() {
        this.c.setDataCallback(new StickyHeadContainer.DataCallback() { // from class: x38
            @Override // com.oubowu.stickyitemdecoration.StickyHeadContainer.DataCallback
            public final void onDataChange(int i) {
                this.a.r(i);
            }
        });
        this.a.addItemDecoration(new StickyItemDecoration(this.c, 10001));
    }

    private void q(View view) {
        final ActionbarLayout actionbarLayout = (ActionbarLayout) view.findViewById(R.id.actionbar);
        actionbarLayout.setTitleText(getString(R.string.assistant));
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: a48
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.s(view2);
            }
        });
        actionbarLayout.setRightImage(R.drawable.appbar_icon_func);
        actionbarLayout.setRightImageVisible(false);
        actionbarLayout.setRightImageClickListener(new View.OnClickListener() { // from class: b48
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.t(actionbarLayout, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(int i) {
        Object item = this.e.getItem(i - this.e.getHeaderLayoutCount());
        if (item instanceof Long) {
            this.b.setTime(((Long) item).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(View view) {
        getActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(ActionbarLayout actionbarLayout, View view) {
        AssistantToolUtilsDelegate.getInstance().getToolUtil().addToMyTools("ASSISTANT");
        Toast.makeText(getContext(), R.string.tool_add_success, 0).show();
        actionbarLayout.setRightImageVisible(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(final List list) {
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
        this.a.post(new Runnable() { // from class: y38
            @Override // java.lang.Runnable
            public final void run() {
                this.a.u(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Result result) {
        this.g.showOrError(result, getString(R.string.update_deleting), getString(R.string.delete_success), getString(R.string.delete_failed));
        if (result == null || !result.isSuccess()) {
            return;
        }
        this.h.loadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(Result result) {
        this.g.showOrError(result, getString(R.string.pin_fix_loading), getString(R.string.pin_fix_success), getString(R.string.pin_fix_failed));
        if (result == null || !result.isSuccess()) {
            return;
        }
        this.h.loadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(Result result) {
        this.g.showOrError(result, getString(R.string.loading_cancel_pin), getString(R.string.pin_fix_success), getString(R.string.pin_fix_failed));
        if (result == null || !result.isSuccess()) {
            return;
        }
        this.e.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(Update update, DialogInterface dialogInterface, int i) {
        this.h.deleteUpdate(update);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        if (!m() || getActivity() == null) {
            return;
        }
        LoadingDialog.dismiss(this.f);
        if (v.getId() == R.id.iv_add) {
            this.f = new AddUpdateFragment().show(getActivity());
        } else if (v.getId() == R.id.iv_more) {
            if (AssistantModule.isBleDevice()) {
                ScheduleSettingHostActivity.start(getActivity());
            } else {
                this.f = new UpdateSettingFragment().show(getActivity());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_updates, container, false);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemChildClickListener
    public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
        if (!m() || getActivity() == null) {
            return;
        }
        Object item = adapter.getItem(position);
        if (item instanceof Update) {
            Update update = (Update) item;
            LoadingDialog.dismiss(this.f);
            this.e.closeAllItems();
            int id = view.getId();
            if (id == R.id.iv_fixed) {
                this.f = E(getActivity(), update);
                return;
            }
            if (id == R.id.tv_delete) {
                this.f = G(getActivity(), update);
                return;
            }
            if (id == R.id.tv_edit) {
                int i = update.type;
                if (i == 2) {
                    EditScheduleActivity.to(getActivity(), update);
                } else if (i == 1) {
                    n(update);
                }
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
        this.h = (UpdatesViewModel) ViewModelProviders.of(this).get(UpdatesViewModel.class);
        this.g = new LoadingDialogHelper(getActivity());
        initView(view);
        o();
        p();
        D();
        UpdateFragmentStartDelegate.INSTANCE.onStart(getActivity());
    }
}
