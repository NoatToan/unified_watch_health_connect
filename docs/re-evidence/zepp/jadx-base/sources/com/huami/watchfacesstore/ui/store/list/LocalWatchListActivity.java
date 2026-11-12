package com.huami.watchfacesstore.ui.store.list;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.p008lifecycle.Observer;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.core.Fail;
import com.huami.arch.core.LiveDataExtensionKt;
import com.huami.arch.core.Loading;
import com.huami.arch.core.State;
import com.huami.arch.core.StateBuilder;
import com.huami.arch.core.Success;
import com.huami.tools.analytics.DbUtils;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.bean.WatchData;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.device.WatchFaceState;
import com.huami.watchfacesstore.device.WatchFaceStatus;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.ui.LiveDataChannel;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import com.huami.watchfacesstore.ui.store.list.LocalWatchListActivity;
import com.huami.watchfacesstore.view.CommonTitleBar;
import com.huami.watchfacesstore.view.TipDialog;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR+\u0010\"\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$¨\u0006)"}, d2 = {"Lcom/huami/watchfacesstore/ui/store/list/LocalWatchListActivity;", "Lcom/huami/watchfacesstore/ui/store/list/AbstractListActivity;", "", "initTitle", "l", "initView", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "dataList", "setUiData", "", "position", "onListItemClick", "onLoadMore", GoogleApiAvailabilityLight.b, "Ljava/util/List;", "selectLists", "Lcom/huami/watchfacesstore/view/TipDialog;", "o", "Lkotlin/Lazy;", "m", "()Lcom/huami/watchfacesstore/view/TipDialog;", "mDialog", "", "<set-?>", com.google.android.exoplayer2.text.ttml.b.r, "Lkotlin/properties/ReadWriteProperty;", "r", "()Z", "t", "(Z)V", "isLocalDeleteMode", DTransferConstants.SEARCH_KEY, SOAP.XMLNS, "isAllChoose", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "deviceConfigManager", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class LocalWatchListActivity extends AbstractListActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] s;

    @NotNull
    private static final String t = "page_title";

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private List<WatchData> selectLists = new ArrayList();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDialog = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty isLocalDeleteMode;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty isAllChoose;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final DeviceConfigManager deviceConfigManager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007R\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/watchfacesstore/ui/store/list/LocalWatchListActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "pageMode", "", "title", "", "actionStart", ViewHierarchyConstants.PAGE_TITLE, "Ljava/lang/String;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void actionStart$default(Companion companion, Context context, int i, String str, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                str = "";
            }
            companion.actionStart(context, i, str);
        }

        @JvmStatic
        @JvmOverloads
        public final void actionStart(@NotNull Context context, int i) {
            actionStart$default(this, context, i, null, 4, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void actionStart(@NotNull Context context, int pageMode, @NotNull String title) {
            Intent intent = new Intent(context, (Class<?>) LocalWatchListActivity.class);
            intent.putExtra(AbstractListActivity.PAGE_MODE, pageMode);
            intent.putExtra(LocalWatchListActivity.t, title);
            intent.putExtra("checkNetwork", pageMode != 6);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            LocalWatchListActivity localWatchListActivity = LocalWatchListActivity.this;
            localWatchListActivity.t(!localWatchListActivity.r());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "Lcom/huami/watchfacesstore/device/WatchFaceState;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<StateBuilder<WatchFaceState>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Loading;", "Lcom/huami/watchfacesstore/device/WatchFaceState;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Loading<? extends WatchFaceState>, Unit> {
            public final /* synthetic */ LocalWatchListActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LocalWatchListActivity localWatchListActivity) {
                super(1);
                this.a = localWatchListActivity;
            }

            public final void a(@NotNull Loading<WatchFaceState> loading) {
                this.a.showLoadingDialog();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Loading<? extends WatchFaceState> loading) {
                a(loading);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.list.LocalWatchListActivity$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "Lcom/huami/watchfacesstore/device/WatchFaceState;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0706b extends Lambda implements Function1<Success<? extends WatchFaceState>, Unit> {
            public final /* synthetic */ LocalWatchListActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0706b(LocalWatchListActivity localWatchListActivity) {
                super(1);
                this.a = localWatchListActivity;
            }

            public final void a(@NotNull Success<WatchFaceState> success) {
                WatchFaceState value = success.getValue();
                if (value == null) {
                    return;
                }
                LocalWatchListActivity localWatchListActivity = this.a;
                if (value.getStatus() != WatchFaceStatus.DELETE_SUCCESS) {
                    IconToast.showError(KoinExtKt.getAppContext(), value.getStatus().getMsgId());
                    return;
                }
                IconToast.showSuccess(KoinExtKt.getAppContext(), R.string.wf_delete_success);
                if (localWatchListActivity.getPageMode() == 6) {
                    localWatchListActivity.t(false);
                    localWatchListActivity.loadData();
                } else {
                    LiveDataChannel.INSTANCE.getOperateWatchLiveData().postValue(null);
                    ExtensionsKt.finishDelay(localWatchListActivity, 500L);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends WatchFaceState> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "Lcom/huami/watchfacesstore/device/WatchFaceState;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<Fail<? extends WatchFaceState>, Unit> {
            public static final c a = new c();

            public c() {
                super(1);
            }

            public final void a(@NotNull Fail<WatchFaceState> fail) {
                IconToast.showError(KoinExtKt.getAppContext(), R.string.wf_delete_fail);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends WatchFaceState> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/huami/watchfacesstore/device/WatchFaceState;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function1<State<? extends WatchFaceState>, Unit> {
            public final /* synthetic */ LocalWatchListActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(LocalWatchListActivity localWatchListActivity) {
                super(1);
                this.a = localWatchListActivity;
            }

            public final void a(@NotNull State<WatchFaceState> state) {
                this.a.hideLoadingDialog();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(State<? extends WatchFaceState> state) {
                a(state);
                return Unit.INSTANCE;
            }
        }

        public b() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<WatchFaceState> stateBuilder) {
            stateBuilder.onLoading(new a(LocalWatchListActivity.this));
            stateBuilder.onSuccess(new C0706b(LocalWatchListActivity.this));
            stateBuilder.onFail(c.a);
            stateBuilder.onCompleted(new d(LocalWatchListActivity.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<WatchFaceState> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/view/TipDialog;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<TipDialog> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<View, Unit> {
            public final /* synthetic */ TipDialog a;
            public final /* synthetic */ LocalWatchListActivity b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TipDialog tipDialog, LocalWatchListActivity localWatchListActivity) {
                super(1);
                this.a = tipDialog;
                this.b = localWatchListActivity;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull View view) {
                this.a.dismiss();
                this.b.getListViewModel().deleteWatchFace(this.b.getPageMode(), this.b.selectLists);
            }
        }

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TipDialog getA() {
            TipDialog singleButton = new TipDialog().setMsg(LocalWatchListActivity.this.getPageMode() == 7 ? R.string.wf_device_delete_tip : R.string.wf_local_delete_tip).setSingleButton(false);
            singleButton.onConfirm(new a(singleButton, LocalWatchListActivity.this));
            return singleButton;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[1] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(LocalWatchListActivity.class), "isLocalDeleteMode", "isLocalDeleteMode()Z"));
        kPropertyArr[2] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(LocalWatchListActivity.class), "isAllChoose", "isAllChoose()Z"));
        s = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    public LocalWatchListActivity() {
        Delegates delegates = Delegates.INSTANCE;
        final Boolean bool = Boolean.FALSE;
        this.isLocalDeleteMode = new ObservableProperty<Boolean>(bool) { // from class: com.huami.watchfacesstore.ui.store.list.LocalWatchListActivity$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Boolean oldValue, Boolean newValue) {
                boolean zBooleanValue = newValue.booleanValue();
                oldValue.booleanValue();
                if (!zBooleanValue) {
                    ExtensionsKt.gone(this.getMBinding().llDelete);
                    this.getMBinding().commonTitleBar.setRightText(R.string.wf_manager_item_delete);
                    this.getListAdapter().setNormalStatus(this.getDataLists());
                } else {
                    ExtensionsKt.visible(this.getMBinding().llDelete);
                    this.getMBinding().commonTitleBar.setRightText(R.string.wf_select_cancel);
                    this.s(false);
                    this.getListAdapter().setUnselectedStatus(this.getDataLists());
                }
            }
        };
        this.isAllChoose = new ObservableProperty<Boolean>(bool) { // from class: com.huami.watchfacesstore.ui.store.list.LocalWatchListActivity$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Boolean oldValue, Boolean newValue) {
                boolean zBooleanValue = newValue.booleanValue();
                oldValue.booleanValue();
                if (zBooleanValue) {
                    this.getMBinding().tvAllChoose.setText(R.string.wf_all_choose_cancel);
                } else {
                    this.getMBinding().tvAllChoose.setText(R.string.wf_all_choose);
                }
            }
        };
        this.deviceConfigManager = KoinExtKt.getDeviceConfigManager();
    }

    @JvmStatic
    @JvmOverloads
    public static final void actionStart(@NotNull Context context, int i) {
        INSTANCE.actionStart(context, i);
    }

    @JvmStatic
    @JvmOverloads
    public static final void actionStart(@NotNull Context context, int i, @NotNull String str) {
        INSTANCE.actionStart(context, i, str);
    }

    private final void initTitle() {
        if (getPageMode() != 6 && getPageMode() != 10) {
            String stringExtra = getIntent().getStringExtra(t);
            if (stringExtra != null) {
                getMBinding().commonTitleBar.setTitleText(stringExtra);
            }
            ExtensionsKt.visible(getMBinding().llDelete);
            return;
        }
        ExtensionsKt.visible(getMBinding().llLocalWatchTip);
        getMBinding().tvTip.setText(getPageMode() == 6 ? R.string.wf_local_watch_face_tip : R.string.wf_buy_record_tip);
        CommonTitleBar commonTitleBar = getMBinding().commonTitleBar;
        commonTitleBar.setTitleText(getPageMode() == 6 ? R.string.wf_download_record : R.string.wf_buy_record);
        commonTitleBar.setRightText(R.string.wf_manager_item_delete);
        commonTitleBar.setOnRightClick(new a());
    }

    private final void l() {
        Object next;
        if (getPageMode() == 7 && this.deviceConfigManager.isZeepOs()) {
            int i = 0;
            if (this.selectLists.size() != getDataLists().size() - 1) {
                for (Object obj : getDataLists()) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    if (((WatchData) obj).getStatus() == 0) {
                        getListAdapter().setItemStatus(i, 1);
                    }
                    i = i2;
                }
                return;
            }
            Iterator<T> it2 = getDataLists().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!(((WatchData) next).getStatus() == 1));
            WatchData watchData = (WatchData) next;
            if (watchData == null) {
                return;
            }
            getListAdapter().setItemStatus(getDataLists().indexOf(watchData), 0);
        }
    }

    private final TipDialog m() {
        return (TipDialog) this.mDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(LocalWatchListActivity localWatchListActivity, View view) {
        localWatchListActivity.s(!localWatchListActivity.q());
        if (localWatchListActivity.q()) {
            localWatchListActivity.getListAdapter().setSelectedStatus(localWatchListActivity.getDataLists());
        } else {
            localWatchListActivity.getListAdapter().setUnselectedStatus(localWatchListActivity.getDataLists());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(LocalWatchListActivity localWatchListActivity, View view) {
        List<WatchData> dataLists = localWatchListActivity.getDataLists();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = dataLists.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((WatchData) next).getStatus() == 2) {
                arrayList.add(next);
            }
        }
        localWatchListActivity.selectLists = arrayList;
        if (!arrayList.isEmpty()) {
            localWatchListActivity.m().show(localWatchListActivity.getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(LocalWatchListActivity localWatchListActivity, Void r1) {
        localWatchListActivity.loadData();
    }

    private final boolean q() {
        return ((Boolean) this.isAllChoose.getValue(this, s[2])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r() {
        return ((Boolean) this.isLocalDeleteMode.getValue(this, s[1])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(boolean z) {
        this.isAllChoose.setValue(this, s[2], Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(boolean z) {
        this.isLocalDeleteMode.setValue(this, s[1], Boolean.valueOf(z));
    }

    @Override // com.huami.watchfacesstore.ui.store.list.AbstractListActivity, com.huami.watchfacesstore.ui.base.BaseActivity
    public void initView() {
        super.initView();
        getMBinding().rlList.setLoadEnabled(getPageMode() == 10);
        initTitle();
        TextView textView = getMBinding().tvAllChoose;
        ExtensionsKt.setShape(textView, ExtensionsKt.getDp(6), Integer.valueOf(R.color.wf_color_all_choose));
        textView.setOnClickListener(new View.OnClickListener() { // from class: vq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalWatchListActivity.n(this.a, view);
            }
        });
        TextView textView2 = getMBinding().tvDelete;
        ExtensionsKt.setShape(textView2, ExtensionsKt.getDp(6), Integer.valueOf(R.color.wf_color_delete));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: wq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalWatchListActivity.o(this.a, view);
            }
        });
        LiveDataExtensionKt.observeState$default(getListViewModel().getDeleteLiveData(), this, null, new b(), 2, null);
        if (getPageMode() == 6) {
            LiveDataChannel.INSTANCE.getLocalWatchLiveData().observe(this, new Observer() { // from class: xq4
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    LocalWatchListActivity.p(this.a, (Void) obj);
                }
            });
        } else if (getPageMode() == 7 && this.deviceConfigManager.isZeepOs()) {
            ExtensionsKt.gone(getMBinding().tvAllChoose);
        }
    }

    @Override // com.huami.watchfacesstore.ui.store.list.AbstractListActivity
    public void onListItemClick(int position) {
        if (position < 0) {
            return;
        }
        WatchData watchData = getDataLists().get(position);
        if (!r() && getPageMode() != 7) {
            WatchFaceDetailActivity.Companion.actionStart$default(WatchFaceDetailActivity.INSTANCE, this, getPageMode() == 6 ? 1 : 0, watchData.getId(), null, "local", 8, null);
            return;
        }
        int status = watchData.getStatus();
        if (status == 0) {
            CustomToast.showShort(KoinExtKt.getAppContext(), R.string.wf_del_limit_tip);
            return;
        }
        watchData.setStatus(status == 1 ? 2 : 1);
        getListAdapter().notifyItemChanged(position);
        List<WatchData> dataLists = getDataLists();
        ArrayList arrayList = new ArrayList();
        for (Object obj : dataLists) {
            if (((WatchData) obj).getStatus() == 2) {
                arrayList.add(obj);
            }
        }
        this.selectLists = arrayList;
        s(arrayList.size() == getDataLists().size());
        l();
    }

    @Override // com.huami.watchfacesstore.view.recycleview.LoadMoreRecyclerView.LoadingListener
    public void onLoadMore() {
        if (getPageMode() == 10) {
            getListViewModel().getDataLists(getPageMode(), getId());
        } else {
            getMBinding().rlList.setNoMore(true);
        }
    }

    @Override // com.huami.watchfacesstore.ui.store.list.AbstractListActivity
    public void setUiData(@NotNull List<WatchData> dataList) {
        if (getPageMode() != 10) {
            getDataLists().clear();
            getDataLists().addAll(dataList);
            getListAdapter().replaceAll(dataList);
        } else {
            if (dataList.isEmpty()) {
                getMBinding().rlList.setNoMore(true);
                return;
            }
            if (r()) {
                Iterator<T> it2 = dataList.iterator();
                while (it2.hasNext()) {
                    ((WatchData) it2.next()).setStatus(1);
                }
            }
            getDataLists().addAll(dataList);
            getListAdapter().addAll(dataList);
            getMBinding().rlList.loadMoreComplete();
        }
    }
}
