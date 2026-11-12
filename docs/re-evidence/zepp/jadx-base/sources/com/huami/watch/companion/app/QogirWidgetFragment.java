package com.huami.watch.companion.app;

import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.R;
import com.huami.watch.companion.app.QogirWidgetFragment;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.sync.ble.SyncBleUtil;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.xiaomi.hm.health.bt.profile.smartwatch.SmartWatchProfile;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class QogirWidgetFragment extends Fragment {
    private static final String j = "QogirWidgetFragment";
    private static final int k = 2;
    private static final int l = 2000;
    private RecyclerView a;
    private ItemTouchHelper b;
    private b e;
    private String f;
    private List<WatchWidget> c = new ArrayList();
    private List<WatchWidget> d = new ArrayList();
    private boolean g = false;
    private Handler h = new Handler();
    private Runnable i = new Runnable() { // from class: z56
        @Override // java.lang.Runnable
        public final void run() {
            this.a.t();
        }
    };

    public class a extends ItemTouchHelper.Callback {
        public a() {
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        /* JADX INFO: renamed from: isLongPressDragEnabled */
        public boolean getIsEnableDrag() {
            return false;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            if ((viewHolder2 instanceof b.d) || (viewHolder2 instanceof b.a) || (viewHolder instanceof b.d)) {
                return false;
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = viewHolder2.getAdapterPosition();
            Collections.swap(QogirWidgetFragment.this.c, adapterPosition - 1, adapterPosition2 - 1);
            QogirWidgetFragment.this.e.notifyItemMoved(adapterPosition, adapterPosition2);
            QogirWidgetFragment.this.u();
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        }
    }

    public class b extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private static final int b = 0;
        private static final int c = 1;
        private static final int d = 2;
        private static final int e = 3;

        public class a extends c {
            public a(View view) {
                super(view);
            }
        }

        /* JADX INFO: renamed from: com.huami.watch.companion.app.QogirWidgetFragment$b$b, reason: collision with other inner class name */
        public class C0649b extends d {
            public C0649b(View view) {
                super(view);
            }
        }

        public class c extends RecyclerView.ViewHolder {
            public TextView a;
            public ImageView b;
            public Switch c;
            public ImageView d;
            public View e;

            public c(View view) {
                super(view);
                this.e = view;
                this.a = (TextView) view.findViewById(R.id.text);
                this.b = (ImageView) view.findViewById(R.id.icon);
                this.d = (ImageView) view.findViewById(R.id.dot_or_menu);
                this.c = (Switch) view.findViewById(R.id.enable_widget);
            }
        }

        public class d extends RecyclerView.ViewHolder {
            public d(View view) {
                super(view);
            }
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(int i, CompoundButton compoundButton, boolean z) {
            if (z) {
                if (QogirWidgetFragment.this.c.size() >= 2 && !DeviceSource.isSeriesEverest2(QogirWidgetFragment.this.f)) {
                    QogirWidgetFragment.this.v();
                    compoundButton.setChecked(false);
                } else {
                    QogirWidgetFragment.this.c.add(0, (WatchWidget) QogirWidgetFragment.this.d.remove(i));
                    notifyDataSetChanged();
                    QogirWidgetFragment.this.u();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean f(c cVar, View view) {
            QogirWidgetFragment.this.b.startDrag(cVar);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int g(WatchWidget watchWidget, WatchWidget watchWidget2) {
            return watchWidget.index - watchWidget2.index;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(int i, CompoundButton compoundButton, boolean z) {
            if (z) {
                return;
            }
            QogirWidgetFragment.this.d.add((WatchWidget) QogirWidgetFragment.this.c.remove(i));
            if (!QogirWidgetFragment.this.c.isEmpty() || QogirWidgetFragment.this.g) {
                Collections.sort(QogirWidgetFragment.this.d, new Comparator() { // from class: com.huami.watch.companion.app.d
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return QogirWidgetFragment.b.g((WatchWidget) obj, (WatchWidget) obj2);
                    }
                });
            } else {
                QogirWidgetFragment.this.d = WatchWidgetNewManager.get().k(QogirWidgetFragment.this.getActivity(), QogirWidgetFragment.this.f);
            }
            notifyDataSetChanged();
            QogirWidgetFragment.this.u();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getPagerCount() {
            return (QogirWidgetFragment.this.c != null ? QogirWidgetFragment.this.c.size() : 0) + (QogirWidgetFragment.this.d != null ? QogirWidgetFragment.this.d.size() : 0) + 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            int size = QogirWidgetFragment.this.c.size();
            if (i == 0) {
                return 0;
            }
            if (i <= size) {
                return 1;
            }
            return i == size + 1 ? 2 : 3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder instanceof a) {
                final int size = (i - QogirWidgetFragment.this.c.size()) - 2;
                if (size < 0 || size >= QogirWidgetFragment.this.d.size()) {
                    return;
                }
                WatchWidget watchWidget = (WatchWidget) QogirWidgetFragment.this.d.get(size);
                a aVar = (a) viewHolder;
                aVar.b.setImageResource(watchWidget.iconRes);
                aVar.a.setText(watchWidget.title);
                aVar.d.setVisibility(4);
                aVar.c.setChecked(false);
                aVar.c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huami.watch.companion.app.c
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        this.a.e(size, compoundButton, z);
                    }
                });
                return;
            }
            if (viewHolder instanceof c) {
                final int i2 = i - 1;
                WatchWidget watchWidget2 = (WatchWidget) QogirWidgetFragment.this.c.get(i2);
                final c cVar = (c) viewHolder;
                cVar.b.setImageResource(watchWidget2.iconRes);
                cVar.a.setText(watchWidget2.title);
                cVar.d.setVisibility(0);
                cVar.c.setChecked(true);
                cVar.e.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.huami.watch.companion.app.a
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return this.a.f(cVar, view);
                    }
                });
                cVar.c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huami.watch.companion.app.b
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        this.a.h(i2, compoundButton, z);
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(QogirWidgetFragment.this.getActivity());
            if (i == 0) {
                return new d(layoutInflaterFrom.inflate(R.layout.item_qogir_widget_open_title, viewGroup, false));
            }
            if (i == 1) {
                return new c(layoutInflaterFrom.inflate(R.layout.item_qogir_widget_info, viewGroup, false));
            }
            if (i != 2) {
                return i != 3 ? new c(layoutInflaterFrom.inflate(R.layout.item_qogir_widget_open_title, viewGroup, false)) : new a(layoutInflaterFrom.inflate(R.layout.item_qogir_widget_info, viewGroup, false));
            }
            return new C0649b(layoutInflaterFrom.inflate(R.layout.item_qogir_widget_close_title, viewGroup, false));
        }
    }

    private void n() {
        Log.d(j, "Init Ble Widgets...", new Object[0]);
        final LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(getActivity(), getString(R.string.loading));
        loadingDialogShowDialog.show();
        Rx.io(new ObservableOnSubscribe() { // from class: x56
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                QogirWidgetFragment.q(observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: y56
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.r(loadingDialogShowDialog, (List) obj);
            }
        });
    }

    private void o(List<Integer> list) {
        List<WatchWidget> listJ = WatchWidgetNewManager.get().j(getActivity(), this.f);
        Log.d(j, "Cloud Widgets: " + ArraysUtil.toString(listJ), new Object[0]);
        List<WatchWidget> listK = WatchWidgetNewManager.get().k(getActivity(), this.f);
        Log.d(j, "Default Widgets: " + ArraysUtil.toString(listK), new Object[0]);
        int size = listJ.size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                WatchWidget watchWidget = listJ.get(i);
                if (list == null || list.contains(Integer.valueOf(watchWidget.type))) {
                    if (watchWidget.enable) {
                        this.c.add(watchWidget);
                    } else {
                        this.d.add(watchWidget);
                    }
                }
            }
        } else {
            int size2 = listK.size();
            for (int i2 = 0; i2 < size2; i2++) {
                WatchWidget watchWidget2 = listK.get(i2);
                if (list == null || list.contains(Integer.valueOf(watchWidget2.type))) {
                    if (watchWidget2.enable) {
                        this.c.add(watchWidget2);
                    } else {
                        this.d.add(watchWidget2);
                    }
                }
            }
        }
        int size3 = listK.size();
        if (this.c.size() + this.d.size() < size3) {
            for (int i3 = 0; i3 < size3; i3++) {
                WatchWidget watchWidget3 = listK.get(i3);
                if ((list == null || list.contains(Integer.valueOf(watchWidget3.type))) && !this.c.contains(watchWidget3) && !this.d.contains(watchWidget3)) {
                    this.d.add(watchWidget3);
                }
            }
        }
        int size4 = this.c.size();
        if (!DeviceSource.isSeriesEverest2(this.f) && size4 > 2) {
            if (this.g) {
                this.d.addAll(0, this.c.subList(2, size4));
                this.c = this.c.subList(0, 2);
            } else {
                this.c.clear();
                this.d.clear();
                this.d.addAll(listK);
            }
        }
        u();
        b bVar = new b();
        this.e = bVar;
        this.a.setAdapter(bVar);
    }

    private void p(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new a());
        this.b = itemTouchHelper;
        itemTouchHelper.attachToRecyclerView(this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(ObservableEmitter observableEmitter) throws Exception {
        List<SmartWatchProfile.BleWidget> widgets = SyncBleUtil.getWidgets();
        ArrayList arrayList = new ArrayList();
        if (!ArraysUtil.isEmpty(widgets)) {
            Iterator<SmartWatchProfile.BleWidget> it2 = widgets.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(it2.next().type));
            }
        }
        Log.d(j, "Filter Types by BLE: " + ArraysUtil.toString(arrayList), new Object[0]);
        observableEmitter.onNext(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(LoadingDialog loadingDialog, List list) throws Exception {
        loadingDialog.dismiss();
        if (ArraysUtil.isEmpty(list)) {
            return;
        }
        o(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Boolean.valueOf(SyncBleUtil.syncWidgetsToWatch(WatchWidgetNewManager.get().l(CompanionApplication.getContext(), this.f))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        Log.d(j, "Sync Qogir Widgets To Watch!!", new Object[0]);
        if (DeviceSource.isSeriesEverest2(this.f)) {
            Rx.io(new ObservableOnSubscribe() { // from class: w56
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                    this.a.s(observableEmitter);
                }
            }).safeSubscribe();
        } else {
            SyncUtil.syncWidgetSortToWatch(CompanionApplication.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        ArrayList arrayList = new ArrayList();
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            WatchWidget watchWidget = this.c.get(i);
            arrayList.add(new WatchWidget(i, watchWidget.packageName, watchWidget.widgetClass, watchWidget.title, watchWidget.iconRes, true, watchWidget.type));
        }
        int size2 = this.d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            WatchWidget watchWidget2 = this.d.get(i2);
            arrayList.add(new WatchWidget(i2 + size, watchWidget2.packageName, watchWidget2.widgetClass, watchWidget2.title, watchWidget2.iconRes, false, watchWidget2.type));
        }
        WatchWidgetNewManager.get().p(getActivity(), arrayList, this.f);
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        AlertDialog.setMessage(getString(R.string.widget_item_max_number_tips)).setNeutralBtn(getString(R.string.btn_known)).setCancelable(false).show(getActivity(), "qogir_widget");
    }

    private void w() {
        this.h.removeCallbacks(this.i);
        this.h.postDelayed(this.i, 2000L);
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_qogir_widget, viewGroup, false);
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f = arguments.getString("deviceModel");
        }
        this.g = DeviceSource.isModelEverest(this.f);
        p(view);
        if (DeviceSource.isSeriesEverest2(this.f)) {
            n();
        } else {
            o(null);
        }
    }
}
