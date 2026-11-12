package com.huami.watch.companion.watchface;

import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.R;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import com.huami.watch.companion.watchface.XiHuWatchFaceManagerFragment;
import com.huami.watch.companion.watchface.adapter.WatchFaceManagerAdapter;
import com.huami.watch.companion.watchface.bean.WatchFaceBean;
import com.huami.watch.companion.watchface.bean.WatchFaceBeanMulti;
import com.huami.watch.companion.watchface.manager.XiHuWatchFaceManager;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.Transporter;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 M2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001MB\u0007¢\u0006\u0004\bK\u0010LJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0010H\u0002J\u0012\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0002J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J&\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010(\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J,\u0010-\u001a\u00020\u00042\u0010\u0010*\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010)2\b\u0010+\u001a\u0004\u0018\u00010&2\u0006\u0010,\u001a\u00020\u0010H\u0016J,\u0010.\u001a\u00020\u00042\u0010\u0010*\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010)2\b\u0010+\u001a\u0004\u0018\u00010&2\u0006\u0010,\u001a\u00020\u0010H\u0016J\b\u0010/\u001a\u00020\u0004H\u0016R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u001d\u0010=\u001a\u0002088B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010CR\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006N"}, d2 = {"Lcom/huami/watch/companion/watchface/XiHuWatchFaceManagerFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/chad/library/adapter/base/BaseQuickAdapter$OnItemChildClickListener;", "Lcom/chad/library/adapter/base/BaseQuickAdapter$OnItemClickListener;", "", "initEvent", "initData", "initView", "", "msg", "tag", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroid/app/DialogFragment;", "dialog", hl.k, "showError", "", WatchFaceDetailActivity.WATCH_FACE_ID, "enable", "l", "watchId", "w", "Lcom/huami/watch/companion/watchface/bean/WatchFaceBean;", "watchFaceBean", "B", "y", DTransferConstants.SEARCH_KEY, "onConnected", "onDisconnected", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onActivityCreated", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "adapter", ViewHierarchyConstants.VIEW_KEY, "position", "onItemChildClick", "onItemClick", "onDestroy", "Lcom/huami/watch/companion/watchface/adapter/WatchFaceManagerAdapter;", "a", "Lcom/huami/watch/companion/watchface/adapter/WatchFaceManagerAdapter;", "watchFaceAdapter", "Lcom/huami/watch/companion/watchface/manager/XiHuWatchFaceManager;", "b", "Lcom/huami/watch/companion/watchface/manager/XiHuWatchFaceManager;", "mXiHuWatchFaceManager", "Lcom/huami/watch/companion/watchface/XiHuWatchFaceViewModel;", "c", "Lkotlin/Lazy;", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/huami/watch/companion/watchface/XiHuWatchFaceViewModel;", "vm", "", GoogleApiAvailabilityLight.a, "Z", "isConnect", "e", "Landroid/app/DialogFragment;", "mLoadDialog", "f", "mDisConnectDialog", "Lio/reactivex/disposables/Disposable;", "g", "Lio/reactivex/disposables/Disposable;", "mSubscription", "<init>", "()V", "Companion", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class XiHuWatchFaceManagerFragment extends Fragment implements BaseQuickAdapter.OnItemChildClickListener, BaseQuickAdapter.OnItemClickListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String h = "XiHuWatchFaceManagerFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private WatchFaceManagerAdapter watchFaceAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private XiHuWatchFaceManager mXiHuWatchFaceManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isConnect;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private DialogFragment mLoadDialog;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private DialogFragment mDisConnectDialog;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Disposable mSubscription;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/watch/companion/watchface/XiHuWatchFaceManagerFragment$Companion;", "", "Lcom/huami/watch/companion/watchface/XiHuWatchFaceManagerFragment;", "newInstance", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final XiHuWatchFaceManagerFragment newInstance() {
            XiHuWatchFaceManagerFragment xiHuWatchFaceManagerFragment = new XiHuWatchFaceManagerFragment();
            xiHuWatchFaceManagerFragment.setArguments(new Bundle());
            return xiHuWatchFaceManagerFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watch/companion/watchface/XiHuWatchFaceViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<XiHuWatchFaceViewModel> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final XiHuWatchFaceViewModel getA() {
            return (XiHuWatchFaceViewModel) new ViewModelProvider(XiHuWatchFaceManagerFragment.this).get(XiHuWatchFaceViewModel.class);
        }
    }

    /* JADX INFO: renamed from: com.huami.watch.companion.watchface.XiHuWatchFaceManagerFragment$initData$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010\f\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¨\u0006\r"}, d2 = {"com/huami/watch/companion/watchface/XiHuWatchFaceManagerFragment$initData$2", "Lcom/huami/watch/companion/watchface/manager/XiHuWatchFaceManager$QueryWatchFaceCallback;", "", "dataEmpty", "showError", "", "Lcom/huami/watch/companion/watchface/bean/WatchFaceBeanMulti;", "watchFaces", "callbackWatchFace", "", "Lcom/huami/watch/companion/watchface/bean/WatchFaceBean;", "startedList", "callbackStartWatchFace", "companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass2 implements XiHuWatchFaceManager.QueryWatchFaceCallback {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(XiHuWatchFaceManagerFragment xiHuWatchFaceManagerFragment) {
            xiHuWatchFaceManagerFragment.y();
        }

        @Override // com.huami.watch.companion.watchface.manager.XiHuWatchFaceManager.QueryWatchFaceCallback
        public void callbackStartWatchFace(@NotNull List<WatchFaceBean> startedList) {
            XiHuWatchFaceManagerFragment.this.p().getStartedWatchFaceMultiList().postValue(startedList);
        }

        @Override // com.huami.watch.companion.watchface.manager.XiHuWatchFaceManager.QueryWatchFaceCallback
        public void callbackWatchFace(@NotNull List<? extends WatchFaceBeanMulti> watchFaces) {
            XiHuWatchFaceManagerFragment.this.p().getWatchFaceBeanMultiList().postValue(watchFaces);
            XiHuWatchFaceManagerFragment xiHuWatchFaceManagerFragment = XiHuWatchFaceManagerFragment.this;
            xiHuWatchFaceManagerFragment.k(xiHuWatchFaceManagerFragment.mLoadDialog);
        }

        @Override // com.huami.watch.companion.watchface.manager.XiHuWatchFaceManager.QueryWatchFaceCallback
        public void dataEmpty() {
            final XiHuWatchFaceManagerFragment xiHuWatchFaceManagerFragment = XiHuWatchFaceManagerFragment.this;
            Rx.mainThread(new Runnable() { // from class: ty8
                @Override // java.lang.Runnable
                public final void run() {
                    XiHuWatchFaceManagerFragment.AnonymousClass2.b(xiHuWatchFaceManagerFragment);
                }
            });
        }

        @Override // com.huami.watch.companion.watchface.manager.XiHuWatchFaceManager.QueryWatchFaceCallback
        public void showError() {
            XiHuWatchFaceManagerFragment.this.showError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(String msg, String tag) {
        k(this.mLoadDialog);
        LoadingDialog.Builder cancelable = LoadingDialog.setMessage(msg).setCancelable(false);
        FragmentActivity activity = getActivity();
        this.mLoadDialog = cancelable.show(activity == null ? null : activity.getFragmentManager(), tag);
    }

    private final void B(WatchFaceBean watchFaceBean) {
        Intent intent = new Intent(getActivity(), (Class<?>) XiHuWatchFaceEditActivity.class);
        intent.putExtra("watchFace", watchFaceBean);
        startActivity(intent);
    }

    private final void initData() {
        p().getWatchFaceBeanMultiList().observe(this, new Observer() { // from class: my8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                XiHuWatchFaceManagerFragment.r(this.a, (List) obj);
            }
        });
        A(getString(R.string.loading), "syncAllWatchFaceLoad");
        XiHuWatchFaceManager xiHuWatchFaceManager = this.mXiHuWatchFaceManager;
        if (xiHuWatchFaceManager == null) {
            xiHuWatchFaceManager = null;
        }
        xiHuWatchFaceManager.syncAllWatchFace();
        XiHuWatchFaceManager xiHuWatchFaceManager2 = this.mXiHuWatchFaceManager;
        if (xiHuWatchFaceManager2 == null) {
            xiHuWatchFaceManager2 = null;
        }
        xiHuWatchFaceManager2.addQueryWatchFaceCallback(new AnonymousClass2());
        XiHuWatchFaceManager xiHuWatchFaceManager3 = this.mXiHuWatchFaceManager;
        (xiHuWatchFaceManager3 != null ? xiHuWatchFaceManager3 : null).addChannelListener(new XiHuWatchFaceManager.ChannelListener() { // from class: com.huami.watch.companion.watchface.XiHuWatchFaceManagerFragment.initData.3
            @Override // com.huami.watch.companion.watchface.manager.XiHuWatchFaceManager.ChannelListener
            public void onChannelListener(boolean available) {
                if (available) {
                    XiHuWatchFaceManagerFragment xiHuWatchFaceManagerFragment = XiHuWatchFaceManagerFragment.this;
                    xiHuWatchFaceManagerFragment.A(xiHuWatchFaceManagerFragment.getString(R.string.loading), "syncAllWatchFaceLoad");
                    XiHuWatchFaceManager xiHuWatchFaceManager4 = XiHuWatchFaceManagerFragment.this.mXiHuWatchFaceManager;
                    if (xiHuWatchFaceManager4 == null) {
                        xiHuWatchFaceManager4 = null;
                    }
                    xiHuWatchFaceManager4.syncAllWatchFace();
                }
            }
        });
    }

    private final void initEvent() {
        this.mSubscription = RxBus.get().toObservable().subscribe(new Consumer() { // from class: py8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                XiHuWatchFaceManagerFragment.s(this.a, obj);
            }
        }, new Consumer() { // from class: qy8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                XiHuWatchFaceManagerFragment.t((Throwable) obj);
            }
        });
    }

    private final void initView() {
        View viewInflate = getLayoutInflater().inflate(R.layout.recycler_empty, (ViewGroup) null);
        Context context = getContext();
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null) {
            XiHuWatchFaceManager xiHuWatchFaceManager = this.mXiHuWatchFaceManager;
            if (xiHuWatchFaceManager == null) {
                xiHuWatchFaceManager = null;
            }
            String string = arguments.getString(xiHuWatchFaceManager.getMDeviceId());
            if (string != null) {
                str = string;
            }
        }
        WatchFaceManagerAdapter watchFaceManagerAdapter = new WatchFaceManagerAdapter(context, null, str);
        watchFaceManagerAdapter.setEmptyView(viewInflate);
        watchFaceManagerAdapter.setOnItemChildClickListener(this);
        watchFaceManagerAdapter.setOnItemClickListener(this);
        Unit unit = Unit.INSTANCE;
        this.watchFaceAdapter = watchFaceManagerAdapter;
        View view = getView();
        RecyclerView recyclerView = (RecyclerView) (view == null ? null : view.findViewById(R.id.watch_face_rv));
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
            WatchFaceManagerAdapter watchFaceManagerAdapter2 = this.watchFaceAdapter;
            recyclerView.setAdapter(watchFaceManagerAdapter2 != null ? watchFaceManagerAdapter2 : null);
        }
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(DialogFragment dialog) {
        if (dialog == null) {
            return;
        }
        dialog.dismissAllowingStateLoss();
    }

    private final void l(final int watchFaceId, final int enable) {
        String string;
        String string2;
        String string3;
        if (enable == 1) {
            string = getString(R.string.xihu_watch_face_starting);
            string2 = getString(R.string.xihu_watch_face_start_failed);
            string3 = getString(R.string.xihu_watch_face_start_message);
        } else {
            string = getString(R.string.xihu_watch_face_removeing);
            string2 = getString(R.string.xihu_watch_face_remove_failed);
            string3 = getString(R.string.xihu_watch_face_remove_message);
        }
        final String str = string;
        final String str2 = string2;
        AlertDialog.Builder positiveBtn = AlertDialog.setTitle(getString(R.string.xihu_delete_app_dialog_title)).setMessage(string3).setNegativeBtn(getString(R.string.dialog_cancel)).setPositiveBtn(getString(R.string.dialog_confirm), new DialogInterface.OnClickListener() { // from class: ly8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                XiHuWatchFaceManagerFragment.m(this.a, str, watchFaceId, enable, str2, dialogInterface, i);
            }
        });
        FragmentActivity activity = getActivity();
        positiveBtn.show(activity == null ? null : activity.getFragmentManager(), "enableAlertDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(final XiHuWatchFaceManagerFragment xiHuWatchFaceManagerFragment, String str, int i, int i2, final String str2, DialogInterface dialogInterface, int i3) {
        xiHuWatchFaceManagerFragment.A(str, "enableLoadDialog");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", i);
            jSONObject.put("enable", i2);
            XiHuWatchFaceManager xiHuWatchFaceManager = xiHuWatchFaceManagerFragment.mXiHuWatchFaceManager;
            if (xiHuWatchFaceManager == null) {
                xiHuWatchFaceManager = null;
            }
            xiHuWatchFaceManager.syncDataToWatch(WatchFaceModule.ACTION_WATCHFACE_STATE, jSONObject.toString(), new Transporter.DataSendResultCallback() { // from class: oy8
                @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
                public final void onResultBack(DataTransportResult dataTransportResult) {
                    XiHuWatchFaceManagerFragment.n(this.a, str2, dataTransportResult);
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final XiHuWatchFaceManagerFragment xiHuWatchFaceManagerFragment, final String str, final DataTransportResult dataTransportResult) {
        Rx.mainThread(new Runnable() { // from class: sy8
            @Override // java.lang.Runnable
            public final void run() {
                XiHuWatchFaceManagerFragment.o(this.a, dataTransportResult, str);
            }
        });
    }

    @JvmStatic
    @NotNull
    public static final XiHuWatchFaceManagerFragment newInstance() {
        return INSTANCE.newInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(XiHuWatchFaceManagerFragment xiHuWatchFaceManagerFragment, DataTransportResult dataTransportResult, String str) {
        xiHuWatchFaceManagerFragment.k(xiHuWatchFaceManagerFragment.mLoadDialog);
        if (dataTransportResult == null || dataTransportResult.getResultCode() != 0) {
            Log.d(h, "watchFace:enable:failed" + dataTransportResult, new Object[0]);
            Toast.makeText(xiHuWatchFaceManagerFragment.getContext(), str, 0).show();
            return;
        }
        xiHuWatchFaceManagerFragment.A(xiHuWatchFaceManagerFragment.getString(R.string.loading), "syncAllWatchFaceLoad");
        XiHuWatchFaceManager xiHuWatchFaceManager = xiHuWatchFaceManagerFragment.mXiHuWatchFaceManager;
        if (xiHuWatchFaceManager == null) {
            xiHuWatchFaceManager = null;
        }
        xiHuWatchFaceManager.syncAllWatchFace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConnected() {
        this.isConnect = true;
        k(this.mDisConnectDialog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDisconnected() {
        this.isConnect = false;
        k(this.mDisConnectDialog);
        AlertDialog.Builder negativeBtn = AlertDialog.setTitle(getString(R.string.xihu_delete_app_dialog_title)).setMessage(getString(R.string.watch_disconnect)).setCancelable(false).setPositiveBtn(getString(R.string.xihu_watch_face_connect_bluetooth)).setNegativeBtn(getString(R.string.xihu_watch_face_exit_manager), new DialogInterface.OnClickListener() { // from class: jy8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                XiHuWatchFaceManagerFragment.u(this.a, dialogInterface, i);
            }
        });
        FragmentActivity activity = getActivity();
        this.mDisConnectDialog = negativeBtn.show(activity == null ? null : activity.getFragmentManager(), "disconnectDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final XiHuWatchFaceViewModel p() {
        return (XiHuWatchFaceViewModel) this.vm.getValue();
    }

    private final void q() {
        XiHuWatchFaceManager xiHuWatchFaceManager = this.mXiHuWatchFaceManager;
        if (xiHuWatchFaceManager == null) {
            xiHuWatchFaceManager = null;
        }
        xiHuWatchFaceManager.addConnectEventListener(new XiHuWatchFaceManager.ConnectEventListener() { // from class: com.huami.watch.companion.watchface.XiHuWatchFaceManagerFragment$initConnectEventListener$1
            @Override // com.huami.watch.companion.watchface.manager.XiHuWatchFaceManager.ConnectEventListener
            public void onConnected() {
                this.a.isConnect = true;
                this.a.onConnected();
            }

            @Override // com.huami.watch.companion.watchface.manager.XiHuWatchFaceManager.ConnectEventListener
            public void onDisconnected() {
                this.a.isConnect = false;
                this.a.onDisconnected();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(XiHuWatchFaceManagerFragment xiHuWatchFaceManagerFragment, List list) {
        WatchFaceManagerAdapter watchFaceManagerAdapter = xiHuWatchFaceManagerFragment.watchFaceAdapter;
        if (watchFaceManagerAdapter == null) {
            watchFaceManagerAdapter = null;
        }
        List<WatchFaceBean> value = xiHuWatchFaceManagerFragment.p().getStartedWatchFaceMultiList().getValue();
        watchFaceManagerAdapter.setEnableMode((value == null ? 0 : value.size()) != 1);
        WatchFaceManagerAdapter watchFaceManagerAdapter2 = xiHuWatchFaceManagerFragment.watchFaceAdapter;
        (watchFaceManagerAdapter2 != null ? watchFaceManagerAdapter2 : null).setNewData(xiHuWatchFaceManagerFragment.p().getWatchFaceBeanMultiList().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(XiHuWatchFaceManagerFragment xiHuWatchFaceManagerFragment, Object obj) {
        if (obj instanceof UpdateWatchFaceListEvent) {
            XiHuWatchFaceManager xiHuWatchFaceManager = xiHuWatchFaceManagerFragment.mXiHuWatchFaceManager;
            if (xiHuWatchFaceManager == null) {
                xiHuWatchFaceManager = null;
            }
            xiHuWatchFaceManager.syncCurrentWatchFace();
            XiHuWatchFaceManager xiHuWatchFaceManager2 = xiHuWatchFaceManagerFragment.mXiHuWatchFaceManager;
            (xiHuWatchFaceManager2 != null ? xiHuWatchFaceManager2 : null).syncAllWatchFace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError() {
        Rx.mainThread(new Runnable() { // from class: ry8
            @Override // java.lang.Runnable
            public final void run() {
                XiHuWatchFaceManagerFragment.z(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(Throwable th) {
        HMLog.warn$default(null, th, a.a, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(XiHuWatchFaceManagerFragment xiHuWatchFaceManagerFragment, DialogInterface dialogInterface, int i) {
        FragmentActivity activity = xiHuWatchFaceManagerFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(XiHuWatchFaceManagerFragment xiHuWatchFaceManagerFragment, WatchFaceBean watchFaceBean, DialogInterface dialogInterface, int i) {
        xiHuWatchFaceManagerFragment.A(xiHuWatchFaceManagerFragment.getString(R.string.loading), "setCurrentWatchFaceDialog");
        xiHuWatchFaceManagerFragment.w(watchFaceBean.getId());
    }

    private final void w(int watchId) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", watchId);
            XiHuWatchFaceManager xiHuWatchFaceManager = this.mXiHuWatchFaceManager;
            if (xiHuWatchFaceManager == null) {
                xiHuWatchFaceManager = null;
            }
            xiHuWatchFaceManager.syncDataToWatch(WatchFaceModule.ACTION_CURRENT, jSONObject.toString(), new Transporter.DataSendResultCallback() { // from class: ny8
                @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
                public final void onResultBack(DataTransportResult dataTransportResult) {
                    XiHuWatchFaceManagerFragment.x(this.a, dataTransportResult);
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(XiHuWatchFaceManagerFragment xiHuWatchFaceManagerFragment, DataTransportResult dataTransportResult) {
        xiHuWatchFaceManagerFragment.k(xiHuWatchFaceManagerFragment.mLoadDialog);
        if (dataTransportResult == null || dataTransportResult.getResultCode() != 0) {
            Toast.makeText(xiHuWatchFaceManagerFragment.getContext(), R.string.xihu_watch_face_set_current_failed, 0).show();
            return;
        }
        RxBus.get().postMainThread(new WatchFaceArrivingEvent("setCurrentWatchFace"));
        xiHuWatchFaceManagerFragment.A(xiHuWatchFaceManagerFragment.getString(R.string.loading), "syncAllWatchFaceLoad");
        XiHuWatchFaceManager xiHuWatchFaceManager = xiHuWatchFaceManagerFragment.mXiHuWatchFaceManager;
        if (xiHuWatchFaceManager == null) {
            xiHuWatchFaceManager = null;
        }
        xiHuWatchFaceManager.syncAllWatchFace();
        Toast.makeText(xiHuWatchFaceManagerFragment.getContext(), R.string.xihu_watch_face_set_current_success, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        k(this.mLoadDialog);
        WatchFaceManagerAdapter watchFaceManagerAdapter = this.watchFaceAdapter;
        if (watchFaceManagerAdapter == null) {
            watchFaceManagerAdapter = null;
        }
        watchFaceManagerAdapter.setNewData(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(XiHuWatchFaceManagerFragment xiHuWatchFaceManagerFragment) {
        WatchFaceManagerAdapter watchFaceManagerAdapter = xiHuWatchFaceManagerFragment.watchFaceAdapter;
        if (watchFaceManagerAdapter == null) {
            watchFaceManagerAdapter = null;
        }
        watchFaceManagerAdapter.setEnableMode(false);
        WatchFaceManagerAdapter watchFaceManagerAdapter2 = xiHuWatchFaceManagerFragment.watchFaceAdapter;
        if (watchFaceManagerAdapter2 == null) {
            watchFaceManagerAdapter2 = null;
        }
        watchFaceManagerAdapter2.setNewData(null);
        xiHuWatchFaceManagerFragment.k(xiHuWatchFaceManagerFragment.mLoadDialog);
        Toast.makeText(xiHuWatchFaceManagerFragment.getContext(), R.string.get_watch_face_list_failed, 0).show();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();
        initEvent();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        XiHuWatchFaceManager xiHuWatchFaceManager = new XiHuWatchFaceManager(context);
        this.mXiHuWatchFaceManager = xiHuWatchFaceManager;
        this.isConnect = xiHuWatchFaceManager.getIsConnect();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_xi_hu_watch_face_manager, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        XiHuWatchFaceManager xiHuWatchFaceManager = this.mXiHuWatchFaceManager;
        if (xiHuWatchFaceManager == null) {
            xiHuWatchFaceManager = null;
        }
        xiHuWatchFaceManager.onClear();
        Disposable disposable = this.mSubscription;
        if (disposable != null) {
            if (disposable != null) {
                disposable.dispose();
            }
            this.mSubscription = null;
        }
        super.onDestroy();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemChildClickListener
    public void onItemChildClick(@Nullable BaseQuickAdapter<?, ?> adapter, @Nullable View view, int position) {
        Integer numValueOf = view == null ? null : Integer.valueOf(view.getId());
        int i = R.id.tv_header_right;
        if (numValueOf != null && numValueOf.intValue() == i) {
            Intent intent = new Intent(getContext(), (Class<?>) XiHuWatchFaceSortActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("datas", (Serializable) p().getStartedWatchFaceMultiList().getValue());
            intent.putExtras(bundle);
            startActivity(intent);
            return;
        }
        int i2 = R.id.tv_remove;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            if (!this.isConnect) {
                Toast.makeText(getContext(), R.string.watch_disconnect, 0).show();
                return;
            }
            WatchFaceBeanMulti watchFaceBeanMulti = (WatchFaceBeanMulti) adapter.getItem(position);
            if ((watchFaceBeanMulti != null ? watchFaceBeanMulti.getT() : null) == null) {
                return;
            }
            WatchFaceBean t = watchFaceBeanMulti.getT();
            int enable = t.getEnable();
            int id = t.getId();
            int enable2 = t.getEnable() ^ 1;
            if (t.isEditable() && enable == 0) {
                B(t);
            } else {
                l(id, enable2);
            }
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
    public void onItemClick(@Nullable BaseQuickAdapter<?, ?> adapter, @Nullable View view, int position) {
        final WatchFaceBean t;
        WatchFaceBeanMulti watchFaceBeanMulti = (WatchFaceBeanMulti) adapter.getItem(position);
        if ((watchFaceBeanMulti == null ? null : watchFaceBeanMulti.getT()) == null || (t = watchFaceBeanMulti.getT()) == null || t.getEnable() == 0) {
            return;
        }
        if (t.isEditable()) {
            B(t);
        } else {
            if (1 == t.getCurrent()) {
                return;
            }
            AlertDialog.Builder positiveBtn = AlertDialog.setTitle(getString(R.string.xihu_delete_app_dialog_title)).setMessage(getString(R.string.xihu_watch_face_set_current_msg)).setNegativeBtn(getString(R.string.dialog_cancel)).setPositiveBtn(getString(R.string.dialog_confirm), new DialogInterface.OnClickListener() { // from class: ky8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    XiHuWatchFaceManagerFragment.v(this.a, t, dialogInterface, i);
                }
            });
            FragmentActivity activity = getActivity();
            positiveBtn.show(activity != null ? activity.getFragmentManager() : null, "setCurrentDialog");
        }
    }
}
