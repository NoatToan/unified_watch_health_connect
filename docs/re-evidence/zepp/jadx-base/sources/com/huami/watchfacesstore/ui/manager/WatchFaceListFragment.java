package com.huami.watchfacesstore.ui.manager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.core.LiveDataExtensionKt;
import com.huami.arch.core.StateBuilder;
import com.huami.arch.core.Success;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.analytic.WFAnalyticHelper;
import com.huami.watchfacesstore.analytic.WFStateEvent;
import com.huami.watchfacesstore.bean.WatchData;
import com.huami.watchfacesstore.databinding.WfHomeItemCommonBinding;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ui.LiveDataChannel;
import com.huami.watchfacesstore.ui.adapter.WatchFaceAdapter;
import com.huami.watchfacesstore.ui.manager.WatchFaceListFragment;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import com.huami.watchfacesstore.ui.store.list.CategoryListActivity;
import com.huami.watchfacesstore.ui.store.list.LocalWatchListActivity;
import com.huami.watchfacesstore.view.recycleview.BaseRVAdapter;
import com.huami.watchfacesstore.view.recycleview.ViewHolder;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0016\u0010\r\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00103\u001a\u0002008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b1\u00102¨\u00067"}, d2 = {"Lcom/huami/watchfacesstore/ui/manager/WatchFaceListFragment;", "Landroidx/fragment/app/Fragment;", "", "g", "", SOAP.XMLNS, "", GoogleApiAvailabilityLight.b, "l", DTransferConstants.SEARCH_KEY, "", "Lcom/huami/watchfacesstore/bean/WatchData;", "lists", hl.k, "list", "h", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/watchfacesstore/databinding/WfHomeItemCommonBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "f", "()Lcom/huami/watchfacesstore/databinding/WfHomeItemCommonBinding;", "binding", "Lcom/huami/watchfacesstore/ui/manager/WatchManagerViewModel;", "b", "Lkotlin/Lazy;", "i", "()Lcom/huami/watchfacesstore/ui/manager/WatchManagerViewModel;", "managerViewModel", "c", "Ljava/util/List;", "showLists", "", GoogleApiAvailabilityLight.a, LogUtil.I, "type", "e", "Z", "isHistoryShow", "Lcom/huami/watchfacesstore/ui/adapter/WatchFaceAdapter;", z.j, "()Lcom/huami/watchfacesstore/ui/adapter/WatchFaceAdapter;", "watchFaceAdapter", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WatchFaceListFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final int LIST_COLLECT = 0;
    public static final int LIST_HISTORY = 2;
    public static final int LIST_LOCAl = 1;
    public static final /* synthetic */ KProperty<Object>[] g;

    @NotNull
    private static final String h = "WatchFaceListFragment";
    private static final int i = 4;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = FragmentViewBindingKt.viewBinding(new WatchFaceListFragment$special$$inlined$viewBinding$1(new InflateViewBinder(WfHomeItemCommonBinding.class)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy managerViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private List<WatchData> showLists;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int type;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isHistoryShow;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy watchFaceAdapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/huami/watchfacesstore/ui/manager/WatchFaceListFragment$Companion;", "", "", "type", "Lcom/huami/watchfacesstore/ui/manager/WatchFaceListFragment;", "newInstance", "LIST_COLLECT", LogUtil.I, "LIST_HISTORY", "LIST_LOCAl", "MAX_DISPLAY_NUM", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WatchFaceListFragment newInstance(int type) {
            WatchFaceListFragment watchFaceListFragment = new WatchFaceListFragment();
            watchFaceListFragment.type = type;
            return watchFaceListFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<StateBuilder<List<? extends WatchData>>, Unit> {

        /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.manager.WatchFaceListFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0689a extends Lambda implements Function1<Success<? extends List<? extends WatchData>>, Unit> {
            public final /* synthetic */ WatchFaceListFragment a;

            /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.manager.WatchFaceListFragment$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0690a extends Lambda implements Function0<String> {
                public final /* synthetic */ Success<List<WatchData>> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0690a(Success<? extends List<WatchData>> success) {
                    super(0);
                    this.a = success;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "collectLiveData  " + this.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0689a(WatchFaceListFragment watchFaceListFragment) {
                super(1);
                this.a = watchFaceListFragment;
            }

            public final void a(@NotNull Success<? extends List<WatchData>> success) {
                HMLog.info(WatchFaceListFragment.h, new C0690a(success));
                List<WatchData> value = success.getValue();
                if (value == null) {
                    return;
                }
                this.a.k(value);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends List<? extends WatchData>> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<List<WatchData>> stateBuilder) {
            stateBuilder.onSuccess(new C0689a(WatchFaceListFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<List<? extends WatchData>> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "collectLiveData observe " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<StateBuilder<List<? extends WatchData>>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Success<? extends List<? extends WatchData>>, Unit> {
            public final /* synthetic */ WatchFaceListFragment a;

            /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.manager.WatchFaceListFragment$c$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0691a extends Lambda implements Function0<String> {
                public final /* synthetic */ Success<List<WatchData>> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0691a(Success<? extends List<WatchData>> success) {
                    super(0);
                    this.a = success;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "historyLiveData  " + this.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WatchFaceListFragment watchFaceListFragment) {
                super(1);
                this.a = watchFaceListFragment;
            }

            public final void a(@NotNull Success<? extends List<WatchData>> success) {
                HMLog.info(WatchFaceListFragment.h, new C0691a(success));
                List<WatchData> value = success.getValue();
                if (value == null) {
                    return;
                }
                this.a.k(value);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends List<? extends WatchData>> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        public c() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<List<WatchData>> stateBuilder) {
            stateBuilder.onSuccess(new a(WatchFaceListFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<List<? extends WatchData>> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Void a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Void r1) {
            super(0);
            this.a = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "localWatchLiveData observe " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Void a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Void r1) {
            super(0);
            this.a = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "operateWatchLiveData observe " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<StateBuilder<List<? extends WatchData>>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Success<? extends List<? extends WatchData>>, Unit> {
            public final /* synthetic */ WatchFaceListFragment a;

            /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.manager.WatchFaceListFragment$f$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0692a extends Lambda implements Function0<String> {
                public final /* synthetic */ Success<List<WatchData>> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0692a(Success<? extends List<WatchData>> success) {
                    super(0);
                    this.a = success;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "localLiveData  " + this.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WatchFaceListFragment watchFaceListFragment) {
                super(1);
                this.a = watchFaceListFragment;
            }

            public final void a(@NotNull Success<? extends List<WatchData>> success) {
                HMLog.info(WatchFaceListFragment.h, new C0692a(success));
                List<WatchData> value = success.getValue();
                if (value == null) {
                    return;
                }
                this.a.k(value);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends List<? extends WatchData>> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        public f() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<List<WatchData>> stateBuilder) {
            stateBuilder.onSuccess(new a(WatchFaceListFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<List<? extends WatchData>> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ Void a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Void r1) {
            super(0);
            this.a = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "localWatchLiveData observe " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/WatchFaceAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<WatchFaceAdapter> {
        public h() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(WatchFaceListFragment watchFaceListFragment, ViewHolder viewHolder, int i, int i2) {
            List list = watchFaceListFragment.showLists;
            if (list == null) {
                return;
            }
            WatchFaceDetailActivity.INSTANCE.actionStart(watchFaceListFragment.requireContext(), watchFaceListFragment.type != 1 ? 0 : 1, ((WatchData) list.get(i2)).getId(), ((WatchData) list.get(i2)).getColor(), watchFaceListFragment.g());
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WatchFaceAdapter getA() {
            WatchFaceAdapter watchFaceAdapter = new WatchFaceAdapter(WatchFaceListFragment.this.requireContext(), R.layout.wf_item_new_watchface, DeviceConfigManager.DeviceSize.SIZE_TWO, WatchFaceListFragment.this.s());
            final WatchFaceListFragment watchFaceListFragment = WatchFaceListFragment.this;
            watchFaceAdapter.setOnItemClickListener(new BaseRVAdapter.OnItemClickListener() { // from class: com.huami.watchfacesstore.ui.manager.a
                @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter.OnItemClickListener
                public final void onItemClick(ViewHolder viewHolder, int i, int i2) {
                    WatchFaceListFragment.h.c(watchFaceListFragment, viewHolder, i, i2);
                }
            });
            return watchFaceAdapter;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WatchFaceListFragment.class), "binding", "getBinding()Lcom/huami/watchfacesstore/databinding/WfHomeItemCommonBinding;"));
        g = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WatchFaceListFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.watchfacesstore.ui.manager.WatchFaceListFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.managerViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WatchManagerViewModel>() { // from class: com.huami.watchfacesstore.ui.manager.WatchFaceListFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.watchfacesstore.ui.manager.WatchManagerViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WatchManagerViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(WatchManagerViewModel.class), function0, objArr);
            }
        });
        this.watchFaceAdapter = LazyKt__LazyJVMKt.lazy(new h());
    }

    private final WfHomeItemCommonBinding f() {
        return (WfHomeItemCommonBinding) this.binding.getValue(this, g[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g() {
        int i2 = this.type;
        if (i2 == 0) {
            return WatchFaceDetailActivity.FROM_FAVORITES;
        }
        if (i2 != 1) {
            return i2 != 2 ? "" : "purchase";
        }
        return "local";
    }

    private final List<WatchData> h(List<WatchData> list) {
        return list.size() > 4 ? list.subList(0, 4) : list;
    }

    private final WatchManagerViewModel i() {
        return (WatchManagerViewModel) this.managerViewModel.getValue();
    }

    private final WatchFaceAdapter j() {
        return (WatchFaceAdapter) this.watchFaceAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(List<WatchData> lists) {
        if (lists.isEmpty()) {
            ExtensionsKt.hideSelf(this);
        } else {
            ExtensionsKt.showSelf(this);
        }
        if (this.type == 2 && !this.isHistoryShow) {
            WFAnalyticHelper.analyticCount$default(WFAnalyticHelper.INSTANCE, WFStateEvent.WF_PURCHASE_V, null, null, null, 14, null);
            this.isHistoryShow = true;
        }
        f().title.tvHomeMore.setVisibility((lists.size() > 4 || this.type != 0) ? 0 : 8);
        List<WatchData> listH = h(lists);
        this.showLists = listH;
        if (listH == null) {
            return;
        }
        j().replaceAll(listH);
    }

    private final void l() {
        f().title.tvHomeItemTitle.setText(R.string.wf_manager_item_collect_title);
        LiveDataExtensionKt.observeState$default(i().getCollectLiveData(), getViewLifecycleOwner(), null, new a(), 2, null);
        LiveDataChannel.INSTANCE.getCollectLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: uf8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WatchFaceListFragment.m(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(WatchFaceListFragment watchFaceListFragment, Boolean bool) {
        HMLog.info("LiveDataChannel", new b(bool));
        watchFaceListFragment.i().getAllData();
    }

    private final void n() {
        f().title.tvHomeItemTitle.setText(R.string.wf_buy_record);
        LiveDataExtensionKt.observeState$default(i().getHistoryLiveData(), getViewLifecycleOwner(), null, new c(), 2, null);
        LiveDataChannel liveDataChannel = LiveDataChannel.INSTANCE;
        liveDataChannel.getLocalWatchLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: xf8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WatchFaceListFragment.o(this.a, (Void) obj);
            }
        });
        i().collectPurchase();
        liveDataChannel.getOperateWatchLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: wf8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WatchFaceListFragment.p(this.a, (Void) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(WatchFaceListFragment watchFaceListFragment, Void r2) {
        HMLog.info(h, new d(r2));
        watchFaceListFragment.i().getAllData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(WatchFaceListFragment watchFaceListFragment, Void r2) {
        HMLog.info(h, new e(r2));
        watchFaceListFragment.i().getAllData();
    }

    private final void q() {
        f().title.tvHomeItemTitle.setText(R.string.wf_download_record);
        LiveDataExtensionKt.observeState$default(i().getLocalLiveData(), getViewLifecycleOwner(), null, new f(), 2, null);
        LiveDataChannel.INSTANCE.getLocalWatchLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: vf8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WatchFaceListFragment.r(this.a, (Void) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(WatchFaceListFragment watchFaceListFragment, Void r2) {
        HMLog.info(h, new g(r2));
        watchFaceListFragment.i().getAllData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean s() {
        return this.type == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(WatchFaceListFragment watchFaceListFragment, View view) {
        int i2 = watchFaceListFragment.type;
        if (i2 == 0) {
            WFAnalyticHelper.analyticCount$default(WFAnalyticHelper.INSTANCE, "WF_More_Click", null, q.mapOf(TuplesKt.to("Type", WFStateEvent.WF_COLLECT)), null, 10, null);
            CategoryListActivity.Companion.actionStart$default(CategoryListActivity.INSTANCE, watchFaceListFragment.requireActivity(), 4, 0, 4, null);
        } else if (i2 == 1) {
            WFAnalyticHelper.analyticCount$default(WFAnalyticHelper.INSTANCE, "WF_More_Click", null, q.mapOf(TuplesKt.to("Type", "Download")), null, 10, null);
            LocalWatchListActivity.Companion.actionStart$default(LocalWatchListActivity.INSTANCE, watchFaceListFragment.requireActivity(), 6, null, 4, null);
        } else {
            if (i2 != 2) {
                return;
            }
            WFAnalyticHelper.analyticCount$default(WFAnalyticHelper.INSTANCE, WFStateEvent.WF_PURCHASE_MORE_C, null, null, null, 14, null);
            LocalWatchListActivity.Companion.actionStart$default(LocalWatchListActivity.INSTANCE, watchFaceListFragment.requireActivity(), 10, null, 4, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return f().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView = f().homeItemRecyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
        recyclerView.setAdapter(j());
        f().title.tvHomeMore.setOnClickListener(new View.OnClickListener() { // from class: tf8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WatchFaceListFragment.t(this.a, view2);
            }
        });
        int i2 = this.type;
        if (i2 == 0) {
            l();
        } else if (i2 == 1) {
            q();
        } else {
            if (i2 != 2) {
                return;
            }
            n();
        }
    }
}
