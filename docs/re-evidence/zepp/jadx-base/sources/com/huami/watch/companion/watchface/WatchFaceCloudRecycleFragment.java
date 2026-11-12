package com.huami.watch.companion.watchface;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
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
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.config.DeviceFeature;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.companion.ui.fragment.AvatarSettingFragment;
import com.huami.watch.companion.watchface.WatchFaceCloudRecycleFragment;
import com.huami.watch.companion.watchface.adapter.WatchFaceCloudMultiAdapter;
import com.huami.watch.companion.watchface.bean.WatchFaceCloud;
import com.huami.watch.companion.watchface.bean.WatchFaceCloudMulti;
import com.huami.watch.companion.watchface.bean.WatchFaceCloudResult;
import com.huami.watch.companion.watchface.utils.WatchFaceHelper;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;
import com.huami.widget.baseadapter.BaseSectionMultiItemQuickAdapter;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceCloudRecycleFragment extends Fragment implements View.OnClickListener, WatchFaceHelper.OnReceivedWatchFaceIdsListener, WatchFaceHelper.OnDeleteWatchFaceListener {
    private static final String m = "WatchFaceRecycleFragment2";
    private static final long n = 10000;
    private static final int o = 110;
    private static final int p = 111;
    private RecyclerView a;
    private WatchFaceCloudMultiAdapter b;
    private View c;
    private String d;
    private Disposable e;
    private Disposable f;
    private TextView g;
    private TextView h;
    private DialogFragment i;
    private Device j;
    private StringBuilder k;
    public Transporter mTransporter;
    public Transporter.DataListener mDataListener = new a();
    private final Handler l = new Handler(new b());

    public class a implements Transporter.DataListener {
        public a() {
        }

        @Override // com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
            if (WatchFaceCloudRecycleFragment.this.j == null || !WatchFaceCloudRecycleFragment.this.j.isActive()) {
                Log.w(WatchFaceCloudRecycleFragment.m, "Device is Inactivated, Ignore!!", new Object[0]);
                return;
            }
            String action = transportDataItem.getAction();
            Log.d(WatchFaceCloudRecycleFragment.m, "transAction" + action, new Object[0]);
            if (CompanionModule.ACTION_QUERY_ALL_IDS_RESPONSE.equals(action)) {
                DataBundle data = transportDataItem.getData();
                StringBuilder sb = new StringBuilder();
                sb.append("transAction");
                sb.append(data);
                Log.d(WatchFaceCloudRecycleFragment.m, sb.toString() == null ? null : data.getString("data"), new Object[0]);
                WatchFaceCloudRecycleFragment.this.getAllWatchFace(data != null ? data.getString("data") : null);
            }
        }
    }

    public class b implements Handler.Callback {
        public b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 110) {
                Log.d(WatchFaceCloudRecycleFragment.m, "删除表盘返回超时...", new Object[0]);
                Toast.makeText(WatchFaceCloudRecycleFragment.this.getActivity(), "删除表盘超时，正在重新同步...", 0).show();
                WatchFaceCloudRecycleFragment.this.Q();
            } else if (i == 111) {
                Log.d(WatchFaceCloudRecycleFragment.m, "删除表盘成功...", new Object[0]);
                WatchFaceCloudRecycleFragment.this.l.removeMessages(110);
                RxBus.get().postMainThread(new WatchFaceArrivingEvent("reply"));
                WatchFaceCloudRecycleFragment.this.Q();
                Toast.makeText(WatchFaceCloudRecycleFragment.this.getActivity(), R.string.delete_success, 0).show();
            }
            return false;
        }
    }

    public class c implements Observer<WatchFaceCloudResult<List<WatchFaceCloudMulti<WatchFaceCloud>>>> {
        public c() {
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(WatchFaceCloudResult<List<WatchFaceCloudMulti<WatchFaceCloud>>> watchFaceCloudResult) {
            if (!watchFaceCloudResult.isSuccessful()) {
                WatchFaceCloudRecycleFragment.this.showError();
                return;
            }
            WatchFaceCloudRecycleFragment.this.v();
            List<WatchFaceCloudMulti<WatchFaceCloud>> data = watchFaceCloudResult.getData();
            if (data == null || data.size() <= 0) {
                WatchFaceCloudRecycleFragment.this.N();
            } else {
                WatchFaceCloudRecycleFragment.this.b.setNewData(data);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            WatchFaceCloudRecycleFragment.this.showError();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            WatchFaceCloudRecycleFragment.this.f = disposable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WatchFaceCloudResult A(WatchFaceCloudResult watchFaceCloudResult) throws Exception {
        return new WatchFaceCloudResult(watchFaceCloudResult.isSuccessful(), watchFaceCloudResult.isSuccessful() ? J((List) watchFaceCloudResult.getData()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B(String str, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(WatchFaceHelper.getLocalWatchFaceByIds(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String C(String str, List list) throws Exception {
        v();
        this.b.setNewData(list);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WatchFaceCloudResult D(String str) throws Exception {
        return WatchFaceHelper.getCloudWatchFaceIds(getContext(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(Object obj) throws Exception {
        if (obj instanceof WatchFaceArrivingEvent) {
            String cmd = ((WatchFaceArrivingEvent) obj).getCmd();
            if (WatchFaceArrivingEvent.CMD_SET.equalsIgnoreCase(cmd)) {
                if (getActivity() != null) {
                    this.b.notifySelectWF(true);
                }
            } else if ("reply".equalsIgnoreCase(cmd)) {
                v();
                refreshData();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String F() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G(Throwable th) throws Exception {
        HMLog.warn(m, th, new Function0() { // from class: ve8
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return WatchFaceCloudRecycleFragment.F();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H(DataTransportResult dataTransportResult) {
        Log.d(m, "send Action query_all_ids result: " + dataTransportResult, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(Map map, DialogInterface dialogInterface, int i) {
        u(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<WatchFaceCloudMulti<WatchFaceCloud>> J(List<WatchFaceCloud> list) {
        Log.d(m, "loadAllWatchFace: " + list, new Object[0]);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WatchFaceCloudMulti(true, BaseSectionMultiItemQuickAdapter.HEAD_LEFT, getString(R.string.watch_face_already_watch_face), true));
        if (list == null || list.size() <= 0) {
            arrayList.add(new WatchFaceCloudMulti(3, WatchFaceHelper.getDefaultWatchFace(getContext(), this.d)));
        } else {
            Iterator<WatchFaceCloud> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new WatchFaceCloudMulti(3, it2.next()));
            }
        }
        return arrayList;
    }

    private void K() {
        WatchFaceCloudMultiAdapter watchFaceCloudMultiAdapter;
        if (this.c == null || (watchFaceCloudMultiAdapter = this.b) == null || watchFaceCloudMultiAdapter.getFooterLayoutCount() <= 0) {
            return;
        }
        this.b.removeFooterView(this.c);
    }

    private void L() {
        if (this.b.ismEditMode()) {
            K();
            this.g.setText(R.string.cancel);
            this.h.setVisibility(0);
        } else {
            this.g.setText(R.string.edit);
            this.h.setVisibility(8);
            t();
        }
    }

    private void M(final Map<Integer, WatchFaceCloudMulti<WatchFaceCloud>> map) {
        AlertDialog.setTitle(getString(R.string.watch_face_confirm_delete)).setMessage(getString(R.string.watch_face_out_of_size_tips)).setNegativeBtn(getString(R.string.btn_cancel)).setPositiveBtn(getString(R.string.btn_enter), new DialogInterface.OnClickListener() { // from class: te8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.I(map, dialogInterface, i);
            }
        }).show(getActivity().getFragmentManager(), "confirm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        v();
        this.b.setNewData(null);
    }

    private void O(String str) {
        this.i = LoadingDialog.setMessage(str).setCancelable(false).show(getActivity(), "loadDialog");
    }

    private void P() {
        AlertDialog.setContent(new AvatarSettingFragment()).setNeutralBtn(getString(R.string.btn_cancel)).show(getActivity().getFragmentManager(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        if (!TextUtils.isEmpty(this.k)) {
            StringBuilder sb = this.k;
            sb.delete(0, sb.length());
        }
        this.b.setEditModel(false, false);
        L();
        v();
    }

    private void refreshData() {
        O(getString(R.string.loading));
        if (DeviceManager.getManager(getContext()).isCurrentDeviceBLE()) {
            WatchFaceHelper.getRomWatchFaceIds(this);
        } else {
            this.mTransporter.send(CompanionModule.ACTION_QUERY_ALL_IDS, new Transporter.DataSendResultCallback() { // from class: we8
                @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
                public final void onResultBack(DataTransportResult dataTransportResult) {
                    WatchFaceCloudRecycleFragment.H(dataTransportResult);
                }
            });
        }
    }

    private void t() {
        if (this.b == null || this.c == null || !DeviceFeature.isSupportWatchFaceCustomBg(getContext()) || this.b.getFooterLayoutCount() > 0) {
            return;
        }
        this.b.addFooterView(this.c);
    }

    private void u(final Map<Integer, WatchFaceCloudMulti<WatchFaceCloud>> map) {
        this.l.sendEmptyMessageDelayed(110, 10000L);
        this.k = new StringBuilder();
        Rx.io(new Runnable() { // from class: ue8
            @Override // java.lang.Runnable
            public final void run() {
                this.a.y(map);
            }
        }).safeSubscribe(new Action() { // from class: ye8
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.a.z();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        DialogFragment dialogFragment = this.i;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
    }

    private void w() {
        this.g.setOnClickListener(this);
        this.h.setOnClickListener(this);
    }

    private void x() {
        this.a.setHasFixedSize(true);
        this.a.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.b = new WatchFaceCloudMultiAdapter(getActivity(), null, this.d);
        View viewInflate = getActivity().getLayoutInflater().inflate(R.layout.item_watchface_header_top_bottom, (ViewGroup) this.a, false);
        this.c = viewInflate;
        viewInflate.findViewById(R.id.iv_add).setOnClickListener(this);
        L();
        this.a.setAdapter(this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void y(Map map) {
        for (WatchFaceCloudMulti watchFaceCloudMulti : map.values()) {
            if (watchFaceCloudMulti != null && watchFaceCloudMulti.getT() != 0) {
                this.k.append(((WatchFaceCloud) watchFaceCloudMulti.getT()).getWatchFaceId());
                this.k.append(AESEncryptionHelper.SEPARATOR);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() throws Exception {
        Log.d(m, "删除的是---->" + ((Object) this.k), new Object[0]);
        O(getString(R.string.delete_loading));
        WatchFaceHelper.deleteWatchFaceToRom(getContext(), this.k.toString(), this);
    }

    @Override // com.huami.watch.companion.watchface.utils.WatchFaceHelper.OnDeleteWatchFaceListener
    public void deleteWatchFaceSuccess(String str) {
        if (TextUtils.isEmpty(this.k)) {
            return;
        }
        List listAsList = Arrays.asList(this.k.toString().split("\\|"));
        if (listAsList.size() == 0) {
            return;
        }
        Log.d(m, "Delete WatchFace response:" + str, new Object[0]);
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("\\|");
            if (strArrSplit.length == 0) {
                return;
            }
            for (String str2 : strArrSplit) {
                listAsList.remove(str2);
            }
        }
        Log.d(m, "delete watch face ing:" + listAsList, new Object[0]);
        this.l.sendEmptyMessage(111);
    }

    public void getAllWatchFace(final String str) {
        if (TextUtils.isEmpty(str)) {
            N();
        } else {
            Rx.io(new ObservableOnSubscribe() { // from class: xe8
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                    WatchFaceCloudRecycleFragment.B(str, observableEmitter);
                }
            }).observable().subscribeOn(Schedulers.io()).map(new Function() { // from class: df8
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.a.J((List) obj);
                }
            }).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: ef8
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.a.C(str, (List) obj);
                }
            }).observeOn(Schedulers.io()).map(new Function() { // from class: cf8
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.a.D((String) obj);
                }
            }).map(new Function() { // from class: bf8
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.a.A((WatchFaceCloudResult) obj);
                }
            }).observeOn(AndroidSchedulers.mainThread()).subscribe(new c());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_add) {
            P();
            return;
        }
        if (id == R.id.tv_left) {
            WatchFaceCloudMultiAdapter watchFaceCloudMultiAdapter = this.b;
            watchFaceCloudMultiAdapter.setEditModel(!watchFaceCloudMultiAdapter.ismEditMode(), true);
            L();
        } else if (id == R.id.tv_delete) {
            Map<Integer, WatchFaceCloudMulti<WatchFaceCloud>> map = this.b.getmCheckedMap();
            if (map == null || map.size() == 0) {
                Toast.makeText(getContext(), "请先选中需要删除的表盘", 0).show();
            } else if (this.b.isOutOfSize()) {
                M(map);
            } else {
                u(map);
            }
        }
    }

    public void onConnected() {
        t();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_watchface_recycle, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Disposable disposable = this.e;
        if (disposable != null) {
            disposable.dispose();
            this.e = null;
        }
        Disposable disposable2 = this.f;
        if (disposable2 != null) {
            disposable2.dispose();
            this.f = null;
        }
        super.onDestroy();
    }

    public void onDisconnected() {
        K();
    }

    public void onUnbound() {
        K();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.d = getArguments() != null ? getArguments().getString("deviceId") : null;
        Device deviceFindByDeviceId = DeviceManager.getManager(getContext()).findByDeviceId(this.d);
        this.j = deviceFindByDeviceId;
        if (deviceFindByDeviceId == null) {
            return;
        }
        this.a = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.g = (TextView) view.findViewById(R.id.tv_left);
        this.h = (TextView) view.findViewById(R.id.tv_delete);
        Transporter transporter = Transporter.get(getContext(), "com.huami.watch.companion");
        this.mTransporter = transporter;
        transporter.addDataListener(this.mDataListener);
        x();
        w();
        refreshData();
        this.e = RxBus.get().toObservable().subscribe(new Consumer() { // from class: ze8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.E(obj);
            }
        }, new Consumer() { // from class: af8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                WatchFaceCloudRecycleFragment.G((Throwable) obj);
            }
        });
    }

    @Override // com.huami.watch.companion.watchface.utils.WatchFaceHelper.OnReceivedWatchFaceIdsListener
    public void receivedWatchFaceIds(String str) {
        getAllWatchFace(str);
    }

    public void showError() {
        v();
        Toast.makeText(getContext(), R.string.load_failed, 0).show();
    }
}
