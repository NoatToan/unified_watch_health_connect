package com.huami.watch.companion.app;

import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseItemDraggableAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemDragListener;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.R;
import com.huami.watch.companion.app.WidgetFragment;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.event.ConnectedEvent;
import com.huami.watch.companion.event.DisconnectedEvent;
import com.huami.watch.companion.event.WidgetResortEvent;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class WidgetFragment extends Fragment {
    private static final String k = "WidgetFragment";
    private static final int l = 2;
    private static final int m = 2000;
    private WatchWidgetAdapter a;
    private RecyclerView b;
    private View c;
    private View d;
    private List<WatchWidget> e;
    private Disposable f;
    private String g;
    private Handler h = new Handler();
    private Runnable i = new Runnable() { // from class: nu8
        @Override // java.lang.Runnable
        public final void run() {
            WidgetFragment.s();
        }
    };
    private OnItemDragListener j = new d();

    public class a extends ItemDragCallback {
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BaseItemDraggableAdapter baseItemDraggableAdapter, boolean z) {
            super(baseItemDraggableAdapter);
            this.b = z;
        }

        @Override // com.huami.watch.companion.app.ItemDragCallback, com.chad.library.adapter.base.callback.ItemDragAndSwipeCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        /* JADX INFO: renamed from: isLongPressDragEnabled */
        public boolean getIsEnableDrag() {
            return !this.b;
        }
    }

    public class b implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;
        public final /* synthetic */ Switch b;
        public final /* synthetic */ WatchWidget c;

        public b(AlertDialogFragment alertDialogFragment, Switch r3, WatchWidget watchWidget) {
            this.a = alertDialogFragment;
            this.b = r3;
            this.c = watchWidget;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismiss();
            WidgetFragment.this.y(this.b, this.c);
        }
    }

    public class c implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public c(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismiss();
        }
    }

    public class d implements OnItemDragListener {
        public d() {
        }

        @Override // com.chad.library.adapter.base.listener.OnItemDragListener
        public void onItemDragEnd(RecyclerView.ViewHolder viewHolder, int i) {
            viewHolder.itemView.setBackgroundResource(0);
            viewHolder.itemView.setBackgroundColor(-1);
            WidgetFragment.this.i(i);
        }

        @Override // com.chad.library.adapter.base.listener.OnItemDragListener
        public void onItemDragMoving(RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2) {
        }

        @Override // com.chad.library.adapter.base.listener.OnItemDragListener
        public void onItemDragStart(RecyclerView.ViewHolder viewHolder, int i) {
            View view = viewHolder.itemView;
            view.setBackgroundResource(R.drawable.list_drag_bg);
            view.getBackground().setLevel(10000);
            view.setPadding(0, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int i) {
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            this.e.get(i2).setIndex(i2);
        }
        z();
        WatchWidgetNewManager.get().p(getActivity(), this.e, this.g);
        try {
            WatchWidget watchWidget = this.e.get(i);
            if (watchWidget != null) {
                Analytics.event(getActivity(), AnalyticsEvents.EVENT_DRAG_SORT_APP, watchWidget.title);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.b.post(new Runnable() { // from class: mu8
            @Override // java.lang.Runnable
            public final void run() {
                this.a.n();
            }
        });
    }

    private void j(LayoutInflater layoutInflater, View view) {
        final boolean zIsModelQogir = DeviceSource.isModelQogir(this.g);
        WatchWidgetAdapter watchWidgetAdapter = new WatchWidgetAdapter();
        this.a = watchWidgetAdapter;
        watchWidgetAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() { // from class: ju8
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemChildClickListener
            public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view2, int i) {
                this.a.o(zIsModelQogir, baseQuickAdapter, view2, i);
            }
        });
        List<WatchWidget> listJ = WatchWidgetNewManager.get().j(getActivity(), this.g);
        this.e = listJ;
        this.a.setNewData(listJ);
        View viewInflate = layoutInflater.inflate(R.layout.sport_section_divider, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.section_div)).setText(getString(zIsModelQogir ? R.string.widget_drag_qogir_tip : R.string.widget_drag_tip));
        this.a.setHeaderView(viewInflate);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.widget_rv);
        this.b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.b.setAdapter(this.a);
        this.a.bindToRecyclerView(this.b);
        a aVar = new a(this.a, zIsModelQogir);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(aVar);
        aVar.setDragMoveFlags(3);
        itemTouchHelper.attachToRecyclerView(this.b);
        this.a.setIsQogir(zIsModelQogir);
        this.a.enableDragItem(itemTouchHelper);
        this.a.setOnItemDragListener(this.j);
    }

    private void k() {
        Device currentDevice = DeviceManager.getManager(getActivity()).getCurrentDevice();
        if (currentDevice == null) {
            v();
        } else if (currentDevice.isConnected()) {
            t();
        } else {
            u();
        }
    }

    private void l(View view) {
        this.d = view.findViewById(R.id.app_empty);
        this.c = view.findViewById(R.id.bound_layout);
    }

    private void m() {
        this.f = RxBus.get().toObservable().subscribe(new Consumer() { // from class: ku8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.p(obj);
            }
        }, new Consumer() { // from class: lu8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                WidgetFragment.r((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.a.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(boolean z, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (this.b.getScrollState() != 0 || this.b.isComputingLayout()) {
            return;
        }
        Switch r4 = (Switch) baseQuickAdapter.getViewByPosition(baseQuickAdapter.getHeaderLayoutCount() + i, R.id.enable_widget);
        WatchWidget watchWidget = (WatchWidget) baseQuickAdapter.getItem(i);
        if (z && !r4.isChecked() && this.a.getEnabledItemCount() >= 2) {
            w();
            return;
        }
        if (r4 == null || watchWidget == null) {
            return;
        }
        if (!r4.isChecked() || !Box.getWatchWidgetCloseDialogDisplayed()) {
            y(r4, watchWidget);
        } else {
            Box.putWatchWidgetCloseDialogDisplayed(false);
            x(r4, watchWidget);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(Object obj) throws Exception {
        if (getActivity() == null) {
            return;
        }
        if (obj instanceof DisconnectedEvent) {
            if (DeviceManager.getManager(getActivity()).getCurrentDevice() == null) {
                return;
            }
            u();
        } else if (obj instanceof ConnectedEvent) {
            t();
        } else {
            if (!(obj instanceof WidgetResortEvent) || getActivity() == null) {
                return;
            }
            this.e = WatchWidgetNewManager.get().j(getActivity(), this.g);
            this.a.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(Throwable th) throws Exception {
        HMLog.warn(k, th, new Function0() { // from class: ou8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WidgetFragment.q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s() {
        Log.d(k, "Sync Widgets To Watch!!", new Object[0]);
        SyncUtil.syncWidgetSortToWatch(CompanionApplication.getContext());
    }

    private void t() {
        this.c.setVisibility(0);
        this.d.setVisibility(8);
        this.b.setAlpha(1.0f);
        this.a.notifyDataSetChanged();
    }

    private void u() {
        this.c.setVisibility(0);
        this.d.setVisibility(8);
        this.b.setAlpha(0.5f);
        this.a.notifyDataSetChanged();
    }

    private void v() {
        this.c.setVisibility(4);
        this.d.setVisibility(0);
        this.a.notifyDataSetChanged();
    }

    private void w() {
        AlertDialog.setMessage(getString(R.string.widget_item_max_number_tips)).setNeutralBtn(getString(R.string.btn_known)).setCancelable(false).show(getActivity(), "WIDGET_DIALOG");
    }

    private void x(Switch r4, WatchWidget watchWidget) {
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(0);
        alertDialogFragmentNewInstance.setMessage(getString(R.string.widget_close_msg));
        alertDialogFragmentNewInstance.setConfirm(getString(R.string.btn_close), new b(alertDialogFragmentNewInstance, r4, watchWidget));
        alertDialogFragmentNewInstance.setCancel(getString(R.string.btn_cancel), new c(alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.show(getFragmentManager(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(Switch r5, WatchWidget watchWidget) {
        boolean zIsChecked = r5.isChecked();
        if (zIsChecked) {
            Analytics.event(getActivity(), AnalyticsEvents.EVENT_TURN_OFF_WIDGET_SWITCH, watchWidget.title);
        }
        r5.setChecked(!zIsChecked);
        watchWidget.setEnable(!zIsChecked);
        z();
        WatchWidgetNewManager.get().p(getActivity(), this.e, this.g);
        this.a.notifyDataSetChanged();
    }

    private void z() {
        this.h.removeCallbacks(this.i);
        this.h.postDelayed(this.i, 2000L);
    }

    @Override // android.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.g = arguments.getString("deviceModel");
        }
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_widget, viewGroup, false);
        l(viewInflate);
        j(layoutInflater, viewInflate);
        k();
        m();
        return viewInflate;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        Disposable disposable = this.f;
        if (disposable != null) {
            disposable.dispose();
        }
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        Analytics.endPage(k);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        Analytics.startPage(k);
    }
}
