package com.huami.watch.companion.watchface.manager;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.R;
import com.huami.watch.companion.watchface.WatchFaceModule;
import com.huami.watch.companion.watchface.bean.WatchFaceBean;
import com.huami.watch.companion.watchface.bean.WatchFaceBeanMulti;
import com.huami.watch.companion.watchface.bean.WatchFaceCloud;
import com.huami.watch.companion.watchface.bean.WatchFaceCloudResult;
import com.huami.watch.companion.watchface.manager.XiHuWatchFaceManager;
import com.huami.watch.companion.watchface.utils.WatchFaceHelper;
import com.huami.watch.companion.watchface.utils.WatchFaceUtils;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.huami.widget.baseadapter.BaseSectionMultiItemQuickAdapter;
import com.loc.z;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 A2\u00020\u0001:\u0004BACDB\u000f\u0012\u0006\u0010)\u001a\u00020&¢\u0006\u0004\b?\u0010@J \u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J \u0010\t\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J&\u0010\r\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0014J\u001e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0007J\u0006\u0010\u001c\u001a\u00020\u0007J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020\u0007H\u0016J\b\u0010$\u001a\u00020\u0007H\u0016J\b\u0010%\u001a\u00020\u0007H\u0016R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0003078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006E"}, d2 = {"Lcom/huami/watch/companion/watchface/manager/XiHuWatchFaceManager;", "Lcom/huami/watch/companion/watchface/manager/BasicDeviceController;", "Ljava/util/ArrayList;", "Lcom/huami/watch/companion/watchface/bean/WatchFaceBean;", "watchFaceBeanArrayList", "", "ids", "", "v", "t", "", "Lcom/huami/watch/companion/watchface/bean/WatchFaceCloud;", "imageList", "x", "Lcom/huami/watch/companion/watchface/manager/XiHuWatchFaceManager$QueryWatchFaceCallback;", "callback", "addQueryWatchFaceCallback", "Lcom/huami/watch/companion/watchface/manager/XiHuWatchFaceManager$ChannelListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addChannelListener", "Lcom/huami/watch/companion/watchface/manager/XiHuWatchFaceManager$ConnectEventListener;", "addConnectEventListener", "action", "jsonStr", "Lcom/huami/watch/transport/Transporter$DataSendResultCallback;", "result", "syncDataToWatch", "syncCurrentWatchFace", "syncAllWatchFace", "Lcom/huami/watch/transport/TransportDataItem;", "transportDataItem", "dataReceived", "", "available", "channelListener", "onConnected", "onDisconnected", "onClear", "Landroid/content/Context;", "i", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, z.j, "Lcom/huami/watch/companion/watchface/manager/XiHuWatchFaceManager$QueryWatchFaceCallback;", "mQueryWatchFaceCallback", hl.k, "Lcom/huami/watch/companion/watchface/manager/XiHuWatchFaceManager$ChannelListener;", "mChannelListener", "l", "Lcom/huami/watch/companion/watchface/manager/XiHuWatchFaceManager$ConnectEventListener;", "mConnectEventListener", "Lio/reactivex/disposables/CompositeDisposable;", "m", "Lio/reactivex/disposables/CompositeDisposable;", "mDisposables", "", GoogleApiAvailabilityLight.b, "Ljava/util/List;", "mStartedList", "Lio/reactivex/disposables/Disposable;", "o", "Lio/reactivex/disposables/Disposable;", "mConnectSubscription", "<init>", "(Landroid/content/Context;)V", "Companion", "ChannelListener", "ConnectEventListener", "QueryWatchFaceCallback", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class XiHuWatchFaceManager extends BasicDeviceController {

    @NotNull
    private static final String p = "XiHuWatchFaceManager";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private QueryWatchFaceCallback mQueryWatchFaceCallback;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private ChannelListener mChannelListener;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private ConnectEventListener mConnectEventListener;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private final CompositeDisposable mDisposables;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private List<WatchFaceBean> mStartedList;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private Disposable mConnectSubscription;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/watch/companion/watchface/manager/XiHuWatchFaceManager$ChannelListener;", "", "", "available", "", "onChannelListener", "companion_release"}, k = 1, mv = {1, 5, 1})
    public interface ChannelListener {
        void onChannelListener(boolean available);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/huami/watch/companion/watchface/manager/XiHuWatchFaceManager$ConnectEventListener;", "", "", "onConnected", "onDisconnected", "companion_release"}, k = 1, mv = {1, 5, 1})
    public interface ConnectEventListener {
        void onConnected();

        void onDisconnected();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\f\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¨\u0006\r"}, d2 = {"Lcom/huami/watch/companion/watchface/manager/XiHuWatchFaceManager$QueryWatchFaceCallback;", "", "", "dataEmpty", "showError", "", "Lcom/huami/watch/companion/watchface/bean/WatchFaceBeanMulti;", "watchFaces", "callbackWatchFace", "", "Lcom/huami/watch/companion/watchface/bean/WatchFaceBean;", "startedList", "callbackStartWatchFace", "companion_release"}, k = 1, mv = {1, 5, 1})
    public interface QueryWatchFaceCallback {
        void callbackStartWatchFace(@NotNull List<WatchFaceBean> startedList);

        void callbackWatchFace(@NotNull List<? extends WatchFaceBeanMulti> watchFaces);

        void dataEmpty();

        void showError();
    }

    public XiHuWatchFaceManager(@NotNull Context context) {
        super(context);
        this.context = context;
        this.mStartedList = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(DataTransportResult dataTransportResult) {
        Log.d(p, "send Action query_all_watchface result: " + dataTransportResult, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(XiHuWatchFaceManager xiHuWatchFaceManager) {
        QueryWatchFaceCallback queryWatchFaceCallback = xiHuWatchFaceManager.mQueryWatchFaceCallback;
        if (queryWatchFaceCallback == null) {
            return;
        }
        queryWatchFaceCallback.dataEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(XiHuWatchFaceManager xiHuWatchFaceManager, ArrayList arrayList, StringBuilder sb) {
        xiHuWatchFaceManager.v(arrayList, sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(final ArrayList<WatchFaceBean> watchFaceBeanArrayList, final String ids) {
        Rx.io(new ObservableOnSubscribe() { // from class: ey8
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                XiHuWatchFaceManager.u(this.a, ids, observableEmitter);
            }
        }).safeSubscribe(new Observer<List<? extends WatchFaceCloud>>() { // from class: com.huami.watch.companion.watchface.manager.XiHuWatchFaceManager$getCloudImage$2
            @Override // io.reactivex.Observer
            public void onComplete() {
            }

            @Override // io.reactivex.Observer
            public void onError(@NotNull Throwable e) {
                Log.e("XiHuWatchFaceManager", "获取云端表盘资源:error!!!", new Object[0]);
                XiHuWatchFaceManager.QueryWatchFaceCallback queryWatchFaceCallback = this.a.mQueryWatchFaceCallback;
                if (queryWatchFaceCallback == null) {
                    return;
                }
                queryWatchFaceCallback.showError();
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(@NotNull Disposable d) {
                CompositeDisposable compositeDisposable = this.a.mDisposables;
                if (compositeDisposable == null) {
                    return;
                }
                compositeDisposable.add(d);
            }

            @Override // io.reactivex.Observer
            public void onNext(@NotNull List<? extends WatchFaceCloud> allData) {
                this.a.x(watchFaceBeanArrayList, allData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(XiHuWatchFaceManager xiHuWatchFaceManager, String str, ObservableEmitter observableEmitter) {
        WatchFaceCloudResult<List<WatchFaceCloud>> cloudWatchFaceIds = WatchFaceHelper.getCloudWatchFaceIds(xiHuWatchFaceManager.context, str);
        if (cloudWatchFaceIds == null || !cloudWatchFaceIds.isSuccessful()) {
            observableEmitter.onError(new Throwable());
            return;
        }
        List<WatchFaceCloud> data = cloudWatchFaceIds.getData();
        if (data == null || data.size() <= 0) {
            Log.d(p, "云端没有对应的表盘资源", new Object[0]);
        } else {
            observableEmitter.onNext(data);
        }
    }

    private final void v(final ArrayList<WatchFaceBean> watchFaceBeanArrayList, final String ids) {
        if (watchFaceBeanArrayList == null || watchFaceBeanArrayList.size() == 0) {
            return;
        }
        CompositeDisposable compositeDisposable = this.mDisposables;
        if (compositeDisposable != null) {
            compositeDisposable.clear();
        }
        Rx.io(new ObservableOnSubscribe() { // from class: fy8
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                XiHuWatchFaceManager.w(ids, observableEmitter);
            }
        }).safeSubscribe(new Observer<List<? extends WatchFaceCloud>>() { // from class: com.huami.watch.companion.watchface.manager.XiHuWatchFaceManager$getWatchFaceImage$2
            @Override // io.reactivex.Observer
            public void onComplete() {
            }

            @Override // io.reactivex.Observer
            public void onError(@NotNull Throwable e) {
                Log.e("XiHuWatchFaceManager", "获取本地表盘资源:error!!!", new Object[0]);
                XiHuWatchFaceManager.QueryWatchFaceCallback queryWatchFaceCallback = this.a.mQueryWatchFaceCallback;
                if (queryWatchFaceCallback == null) {
                    return;
                }
                queryWatchFaceCallback.showError();
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(@NotNull Disposable d) {
                CompositeDisposable compositeDisposable2 = this.a.mDisposables;
                if (compositeDisposable2 == null) {
                    return;
                }
                compositeDisposable2.add(d);
            }

            @Override // io.reactivex.Observer
            public void onNext(@NotNull List<? extends WatchFaceCloud> allData) {
                this.a.x(watchFaceBeanArrayList, allData);
                this.a.t(watchFaceBeanArrayList, ids);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(String str, ObservableEmitter observableEmitter) {
        observableEmitter.onNext(WatchFaceHelper.getLocalWatchFaceByIds(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(final List<? extends WatchFaceBean> watchFaceBeanArrayList, final List<? extends WatchFaceCloud> imageList) {
        this.mStartedList.clear();
        Rx.io(new ObservableOnSubscribe() { // from class: gy8
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                XiHuWatchFaceManager.y(imageList, watchFaceBeanArrayList, this, observableEmitter);
            }
        }).safeSubscribe(new Observer<List<? extends WatchFaceBeanMulti>>() { // from class: com.huami.watch.companion.watchface.manager.XiHuWatchFaceManager$parseData$2
            @Override // io.reactivex.Observer
            public void onComplete() {
            }

            @Override // io.reactivex.Observer
            public void onError(@NotNull Throwable e) {
                Log.e("XiHuWatchFaceManager", "parseData:error:", new Object[0]);
                XiHuWatchFaceManager.QueryWatchFaceCallback queryWatchFaceCallback = this.a.mQueryWatchFaceCallback;
                if (queryWatchFaceCallback == null) {
                    return;
                }
                queryWatchFaceCallback.showError();
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(@NotNull Disposable d) {
                CompositeDisposable compositeDisposable = this.a.mDisposables;
                if (compositeDisposable == null) {
                    return;
                }
                compositeDisposable.add(d);
            }

            @Override // io.reactivex.Observer
            public void onNext(@NotNull List<? extends WatchFaceBeanMulti> watchFaceBeanMultis) {
                XiHuWatchFaceManager.QueryWatchFaceCallback queryWatchFaceCallback = this.a.mQueryWatchFaceCallback;
                if (queryWatchFaceCallback != null) {
                    queryWatchFaceCallback.callbackWatchFace(watchFaceBeanMultis);
                }
                XiHuWatchFaceManager.QueryWatchFaceCallback queryWatchFaceCallback2 = this.a.mQueryWatchFaceCallback;
                if (queryWatchFaceCallback2 == null) {
                    return;
                }
                queryWatchFaceCallback2.callbackStartWatchFace(this.a.mStartedList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(List list, List list2, XiHuWatchFaceManager xiHuWatchFaceManager, ObservableEmitter observableEmitter) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashMap map = new HashMap();
        if (list != null && list.size() > 0) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                WatchFaceCloud watchFaceCloud = (WatchFaceCloud) it2.next();
                map.put(Integer.valueOf(watchFaceCloud.getWatchFaceId()), watchFaceCloud.getImage());
            }
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            WatchFaceBean watchFaceBean = (WatchFaceBean) it3.next();
            if (map.containsKey(Integer.valueOf(watchFaceBean.getCloudId()))) {
                watchFaceBean.setImage((String) map.get(Integer.valueOf(watchFaceBean.getCloudId())));
            } else {
                watchFaceBean.setWatcFaceBg(WatchFaceUtils.getWatchFaceBg(watchFaceBean));
            }
            if (1 == watchFaceBean.getEnable()) {
                arrayList.add(new WatchFaceBeanMulti(3, watchFaceBean));
                xiHuWatchFaceManager.mStartedList.add(watchFaceBean);
            } else if (watchFaceBean.getEnable() == 0) {
                arrayList2.add(new WatchFaceBeanMulti(3, watchFaceBean));
            }
        }
        if (arrayList.size() > 0) {
            arrayList3.add(new WatchFaceBeanMulti(true, BaseSectionMultiItemQuickAdapter.HEAD_LEFT, xiHuWatchFaceManager.context.getString(R.string.xihu_watch_face_started), true));
            arrayList3.addAll(arrayList);
        }
        if (arrayList2.size() > 0) {
            arrayList3.add(new WatchFaceBeanMulti(true, BaseSectionMultiItemQuickAdapter.HEAD_LEFT, xiHuWatchFaceManager.context.getString(R.string.xihu_watch_face_not_started), false));
            arrayList3.addAll(arrayList2);
        }
        observableEmitter.onNext(arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(DataTransportResult dataTransportResult) {
        Log.d(p, "send Action query_all_watchface result: " + dataTransportResult, new Object[0]);
    }

    public final void addChannelListener(@NotNull ChannelListener listener) {
        this.mChannelListener = listener;
    }

    public final void addConnectEventListener(@NotNull ConnectEventListener listener) {
        this.mConnectEventListener = listener;
    }

    public final void addQueryWatchFaceCallback(@NotNull QueryWatchFaceCallback callback) {
        this.mQueryWatchFaceCallback = callback;
    }

    @Override // com.huami.watch.companion.watchface.manager.BasicDeviceController
    public void channelListener(boolean available) {
        ChannelListener channelListener = this.mChannelListener;
        if (channelListener == null) {
            return;
        }
        channelListener.onChannelListener(available);
    }

    @Override // com.huami.watch.companion.watchface.manager.BasicDeviceController
    public void dataReceived(@NotNull TransportDataItem transportDataItem) {
        QueryWatchFaceCallback queryWatchFaceCallback;
        DataBundle data = transportDataItem.getData();
        if (data != null && Intrinsics.areEqual(transportDataItem.getAction(), WatchFaceModule.ACTION_QUERY_ALL_WATCHFACE_RESPONSE)) {
            String string = data.getString("data");
            int i = 0;
            Log.d(p, "QueryAll : onReceiveData :" + string, new Object[0]);
            if (TextUtils.isEmpty(string) && (queryWatchFaceCallback = this.mQueryWatchFaceCallback) != null) {
                queryWatchFaceCallback.dataEmpty();
            }
            final ArrayList arrayList = (ArrayList) new GsonBuilder().excludeFieldsWithModifiers(128, 8, 16).create().fromJson(string, new TypeToken<ArrayList<WatchFaceBean>>() { // from class: com.huami.watch.companion.watchface.manager.XiHuWatchFaceManager$dataReceived$1$watchFaceBeanArrayList$1
            }.getType());
            if (arrayList.size() == 0) {
                Rx.mainThread(new Runnable() { // from class: hy8
                    @Override // java.lang.Runnable
                    public final void run() {
                        XiHuWatchFaceManager.r(this.a);
                    }
                });
            }
            final StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            if (size > 0) {
                while (true) {
                    int i2 = i + 1;
                    sb.append(((WatchFaceBean) arrayList.get(i)).getCloudId());
                    if (i != size - 1) {
                        sb.append(",");
                    }
                    if (i2 >= size) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
            Rx.mainThread(new Runnable() { // from class: iy8
                @Override // java.lang.Runnable
                public final void run() {
                    XiHuWatchFaceManager.s(this.a, arrayList, sb);
                }
            });
        }
    }

    @Override // com.huami.watch.companion.watchface.manager.BasicDeviceController
    public void onClear() {
        super.onClear();
        Disposable disposable = this.mConnectSubscription;
        if (disposable == null) {
            return;
        }
        disposable.dispose();
    }

    @Override // com.huami.watch.companion.watchface.manager.BasicDeviceController
    public void onConnected() {
        super.onConnected();
        ConnectEventListener connectEventListener = this.mConnectEventListener;
        if (connectEventListener == null) {
            return;
        }
        connectEventListener.onConnected();
    }

    @Override // com.huami.watch.companion.watchface.manager.BasicDeviceController
    public void onDisconnected() {
        super.onDisconnected();
        ConnectEventListener connectEventListener = this.mConnectEventListener;
        if (connectEventListener == null) {
            return;
        }
        connectEventListener.onDisconnected();
    }

    public final void syncAllWatchFace() {
        if (getIsConnect()) {
            getMTransporter().send(WatchFaceModule.ACTION_QUERY_ALL_WATCHFACE, new Transporter.DataSendResultCallback() { // from class: dy8
                @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
                public final void onResultBack(DataTransportResult dataTransportResult) {
                    XiHuWatchFaceManager.z(dataTransportResult);
                }
            });
        }
    }

    public final void syncCurrentWatchFace() {
        if (getIsConnect()) {
            getMTransporter().send(WatchFaceModule.ACTION_QUERY_CURRENT_WATCHFACE, new Transporter.DataSendResultCallback() { // from class: cy8
                @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
                public final void onResultBack(DataTransportResult dataTransportResult) {
                    XiHuWatchFaceManager.A(dataTransportResult);
                }
            });
        }
    }

    public final void syncDataToWatch(@NotNull String action, @NotNull String jsonStr, @NotNull Transporter.DataSendResultCallback result) {
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("data", jsonStr);
        getMTransporter().send(action, dataBundle, result);
    }
}
