package com.huami.watch.companion.watchface;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.config.DeviceFeature;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import com.huami.watch.companion.ui.fragment.AvatarSettingFragment;
import com.huami.watch.companion.watchface.WatchFaceRecycleFragment;
import com.huami.watch.companion.watchface.bean.WatchFaceMulti;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;
import com.huami.widget.baseadapter.BaseSectionMultiItemQuickAdapter;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceRecycleFragment extends Fragment implements View.OnClickListener {
    private final String a = "WatchFaceRecycleFragment";
    private RecyclerView b;
    private WatchFaceMultiAdapter c;
    private View d;
    private String e;
    private Disposable f;
    private Disposable g;
    private TextView h;
    private TextView i;
    private Device j;

    public class a implements Observer<List<WatchFaceMulti>> {
        public a() {
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(List<WatchFaceMulti> list) {
            WatchFaceRecycleFragment.this.c.notifySelectWF(false);
            WatchFaceRecycleFragment.this.c.setNewData(list);
            WatchFaceRecycleFragment.this.c.setComplete(true);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            WatchFaceRecycleFragment.this.g = disposable;
        }
    }

    private void A() {
        AlertDialog.setContent(new AvatarSettingFragment()).setNeutralBtn(getString(R.string.btn_cancel)).show(getActivity().getFragmentManager(), "");
    }

    private void j() {
        if (!DeviceFeature.isSupportWatchFaceCustomBg(getContext()) || this.c.getFooterLayoutCount() > 0) {
            return;
        }
        this.c.addFooterView(this.d);
    }

    private void k() {
        this.b.getItemAnimator().setAddDuration(0L);
        this.b.getItemAnimator().setChangeDuration(0L);
        this.b.getItemAnimator().setMoveDuration(0L);
        this.b.getItemAnimator().setRemoveDuration(0L);
        ((SimpleItemAnimator) this.b.getItemAnimator()).setSupportsChangeAnimations(false);
    }

    private void l(final Map<Long, WatchFaceMulti> map) {
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder();
        Rx.io(new Runnable() { // from class: ig8
            @Override // java.lang.Runnable
            public final void run() {
                WatchFaceRecycleFragment.p(map, sb, sb2);
            }
        }).safeSubscribe(new Action() { // from class: fg8
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.a.q(sb, sb2);
            }
        });
    }

    private List<WatchFaceMulti> m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WatchFaceMulti(true, BaseSectionMultiItemQuickAdapter.HEAD_LEFT, getString(R.string.watch_face_already_watch_face), true));
        List<WatchFace> listW = w();
        int size = 0;
        if (listW.size() > 0) {
            size = 0 + listW.size();
            Iterator<WatchFace> it2 = listW.iterator();
            while (it2.hasNext()) {
                arrayList.add(new WatchFaceMulti(3, it2.next()));
            }
        }
        this.c.setRealCount(size);
        return arrayList;
    }

    private void n() {
        this.h.setOnClickListener(this);
        this.i.setOnClickListener(this);
    }

    private void o() {
        k();
        this.b.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.c = new WatchFaceMultiAdapter(getActivity(), null, this.e);
        View viewInflate = getActivity().getLayoutInflater().inflate(R.layout.item_watchface_header_top_bottom, (ViewGroup) this.b, false);
        this.d = viewInflate;
        viewInflate.findViewById(R.id.iv_add).setOnClickListener(this);
        y();
        this.b.setAdapter(this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(Map map, StringBuilder sb, StringBuilder sb2) {
        for (WatchFaceMulti watchFaceMulti : map.values()) {
            if (watchFaceMulti != null && watchFaceMulti.getT() != null) {
                WatchFace t = watchFaceMulti.getT();
                sb.append(t.packageName);
                sb.append(",");
                sb2.append(t.serviceName);
                sb2.append(AESEncryptionHelper.SEPARATOR);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(StringBuilder sb, StringBuilder sb2) throws Exception {
        Log.d("WatchFaceRecycleFragment", "删除的是---->" + ((Object) sb) + "---->" + ((Object) sb2), new Object[0]);
        this.c.setEditModel(false);
        y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(Object obj) throws Exception {
        if (obj instanceof WatchFaceArrivingEvent) {
            String cmd = ((WatchFaceArrivingEvent) obj).getCmd();
            if (WatchFaceArrivingEvent.CMD_SET.equalsIgnoreCase(cmd)) {
                if (getActivity() != null) {
                    this.c.notifySelectWF(true);
                }
            } else if ("reply".equalsIgnoreCase(cmd)) {
                refreshData();
            }
        }
    }

    private void refreshData() {
        this.c.setComplete(false);
        Rx.io(new ObservableOnSubscribe() { // from class: eg8
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.u(observableEmitter);
            }
        }).safeSubscribe(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String s() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(Throwable th) throws Exception {
        HMLog.warn("WatchFaceRecycleFragment", th, new Function0() { // from class: jg8
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return WatchFaceRecycleFragment.s();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(Map map, DialogInterface dialogInterface, int i) {
        l(map);
    }

    @NonNull
    private List<WatchFace> w() {
        WatchFaceManager manager = WatchFaceManager.getManager();
        List<WatchFace> all = manager.getAll(this.e);
        return all.isEmpty() ? manager.getDefault(getActivity(), this.e) : all;
    }

    private void x() {
        WatchFaceMultiAdapter watchFaceMultiAdapter;
        if (this.d == null || (watchFaceMultiAdapter = this.c) == null || watchFaceMultiAdapter.getFooterLayoutCount() <= 0) {
            return;
        }
        this.c.removeFooterView(this.d);
    }

    private void y() {
        if (this.c.ismEditMode()) {
            x();
            this.h.setText(R.string.cancel);
            this.i.setVisibility(0);
        } else {
            this.h.setText(R.string.edit);
            this.i.setVisibility(8);
            j();
        }
    }

    private void z(final Map<Long, WatchFaceMulti> map) {
        AlertDialog.setTitle(getString(R.string.watch_face_confirm_delete)).setMessage(getString(R.string.watch_face_out_of_size_tips)).setNegativeBtn(getString(R.string.btn_cancel)).setPositiveBtn(getString(R.string.btn_enter), new DialogInterface.OnClickListener() { // from class: dg8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.v(map, dialogInterface, i);
            }
        }).show(getActivity().getFragmentManager(), "confirm");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_add) {
            A();
            return;
        }
        if (id == R.id.tv_left) {
            if (this.c.isComplete()) {
                WatchFaceMultiAdapter watchFaceMultiAdapter = this.c;
                watchFaceMultiAdapter.setEditModel(!watchFaceMultiAdapter.ismEditMode());
                y();
                return;
            }
            return;
        }
        if (id == R.id.tv_delete) {
            Map<Long, WatchFaceMulti> map = this.c.getmCheckedMap();
            if (map == null || map.size() == 0) {
                Toast.makeText(getContext(), "请先选中需要删除的表盘", 0).show();
            } else if (this.c.isOutOfSize()) {
                z(map);
            } else {
                l(map);
            }
        }
    }

    public void onConnected() {
        if (this.d == null || this.c == null) {
            return;
        }
        j();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_watchface_recycle, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Disposable disposable = this.f;
        if (disposable != null) {
            disposable.dispose();
            this.f = null;
        }
        Disposable disposable2 = this.g;
        if (disposable2 != null) {
            disposable2.dispose();
            this.g = null;
        }
        super.onDestroy();
    }

    public void onDisconnected() {
        x();
    }

    public void onUnbound() {
        x();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.e = getArguments() != null ? getArguments().getString("deviceId") : null;
        Device deviceFindByDeviceId = DeviceManager.getManager(getContext()).findByDeviceId(this.e);
        this.j = deviceFindByDeviceId;
        if (deviceFindByDeviceId == null) {
            return;
        }
        this.b = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.h = (TextView) view.findViewById(R.id.tv_left);
        this.i = (TextView) view.findViewById(R.id.tv_delete);
        o();
        n();
        refreshData();
        this.f = RxBus.get().toObservable().subscribe(new Consumer() { // from class: hg8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.r(obj);
            }
        }, new Consumer() { // from class: gg8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.t((Throwable) obj);
            }
        });
    }
}
