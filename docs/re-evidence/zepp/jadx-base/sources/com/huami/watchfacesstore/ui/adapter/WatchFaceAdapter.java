package com.huami.watchfacesstore.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.LifecycleCoroutineScope;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.privacy.moneyformat.MoneyFormatterFactory;
import com.huami.tools.analytics.DbUtils;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.bean.Metas;
import com.huami.watchfacesstore.bean.WatchData;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.repo.LocalCacheManager;
import com.huami.watchfacesstore.repo.WatchFaceStatusRepo;
import com.huami.watchfacesstore.usecase.CheckUpdateUseCase;
import com.huami.watchfacesstore.view.recycleview.BaseRVAdapter;
import com.huami.watchfacesstore.view.recycleview.ViewHolder;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\b\b\u0002\u00107\u001a\u000200¢\u0006\u0004\b8\u00109J\u001e\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0014\u0010\u000f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rJ\u0014\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rJ\u0014\u0010\u0011\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rJ\u0016\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006H\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'0&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u0010/\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010.R\u001d\u00104\u001a\u0002008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u00103¨\u0006:"}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/WatchFaceAdapter;", "Lcom/huami/watchfacesstore/view/recycleview/BaseRVAdapter;", "Lcom/huami/watchfacesstore/bean/WatchData;", "item", "Lkotlin/Pair;", "", "", hl.k, "Lcom/huami/watchfacesstore/view/recycleview/ViewHolder;", "holder", "position", "", "convert", "", "lists", "setUnselectedStatus", "setNormalStatus", "setSelectedStatus", "status", "setItemStatus", "Landroid/view/View;", "itemView", "layoutRes", "onViewHolderInit", "Lcom/huami/watchfacesstore/device/DeviceConfigManager$DeviceSize;", GoogleApiAvailabilityLight.b, "Lcom/huami/watchfacesstore/device/DeviceConfigManager$DeviceSize;", "deviceSize", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "o", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "deviceConfigManager", "Lcom/huami/watchfacesstore/repo/WatchFaceStatusRepo;", com.google.android.exoplayer2.text.ttml.b.r, "Lkotlin/Lazy;", "l", "()Lcom/huami/watchfacesstore/repo/WatchFaceStatusRepo;", "watchFaceStatusRepo", "", "", DTransferConstants.SEARCH_KEY, "Ljava/util/Map;", "idMaps", "Lcom/huami/watchfacesstore/usecase/CheckUpdateUseCase;", "r", z.j, "()Lcom/huami/watchfacesstore/usecase/CheckUpdateUseCase;", "checkUpdateUseCase", "", SOAP.XMLNS, "m", "()Z", "isSupportPay", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "needRegisterPurchase", "<init>", "(Landroid/content/Context;ILcom/huami/watchfacesstore/device/DeviceConfigManager$DeviceSize;Z)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WatchFaceAdapter extends BaseRVAdapter<WatchData> {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final DeviceConfigManager.DeviceSize deviceSize;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final DeviceConfigManager deviceConfigManager;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final Lazy watchFaceStatusRepo;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private Map<Integer, String> idMaps;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final Lazy checkUpdateUseCase;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final Lazy isSupportPay;

    /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.adapter.WatchFaceAdapter$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.adapter.WatchFaceAdapter$1", f = "WatchFaceAdapter.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchFaceAdapter.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<List<Integer>> flowObserverUpdate = WatchFaceAdapter.this.l().observerUpdate();
                final WatchFaceAdapter watchFaceAdapter = WatchFaceAdapter.this;
                FlowCollector<List<? extends Integer>> flowCollector = new FlowCollector<List<? extends Integer>>() { // from class: com.huami.watchfacesstore.ui.adapter.WatchFaceAdapter$1$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(List<? extends Integer> list, @NotNull Continuation<? super Unit> continuation) {
                        List<? extends Integer> list2 = list;
                        watchFaceAdapter.idMaps = LocalCacheManager.INSTANCE.getLocalVersions();
                        int i2 = 0;
                        for (Object obj2 : watchFaceAdapter.getListData()) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            WatchData watchData = (WatchData) obj2;
                            int iIntValue = Boxing.boxInt(i2).intValue();
                            if (list2.contains(Boxing.boxInt(watchData.getId())) && watchFaceAdapter.j().invoke(watchData.getVersion(), (String) watchFaceAdapter.idMaps.get(Boxing.boxInt(watchData.getId())))) {
                                watchFaceAdapter.notifyItemChanged(iIntValue);
                            }
                            i2 = i3;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.a = 1;
                if (flowObserverUpdate.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.adapter.WatchFaceAdapter$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.adapter.WatchFaceAdapter$2", f = "WatchFaceAdapter.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchFaceAdapter.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Integer> flowObserverPurchased = WatchFaceAdapter.this.l().observerPurchased();
                final WatchFaceAdapter watchFaceAdapter = WatchFaceAdapter.this;
                FlowCollector<Integer> flowCollector = new FlowCollector<Integer>() { // from class: com.huami.watchfacesstore.ui.adapter.WatchFaceAdapter$2$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(Integer num, @NotNull Continuation<? super Unit> continuation) {
                        int iIntValue = num.intValue();
                        int i2 = 0;
                        for (Object obj2 : watchFaceAdapter.getListData()) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            WatchData watchData = (WatchData) obj2;
                            int iIntValue2 = Boxing.boxInt(i2).intValue();
                            if (watchData.getId() == iIntValue) {
                                watchData.setPurchased(Boxing.boxBoolean(true));
                                watchFaceAdapter.notifyItemChanged(iIntValue2);
                            }
                            i2 = i3;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.a = 1;
                if (flowObserverPurchased.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean getA() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return KoinExtKt.getSettingRepo().isSupportPay();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/repo/WatchFaceStatusRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<WatchFaceStatusRepo> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WatchFaceStatusRepo getA() {
            return KoinExtKt.getWatchFaceStatusRepo();
        }
    }

    public /* synthetic */ WatchFaceAdapter(Context context, int i, DeviceConfigManager.DeviceSize deviceSize, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, deviceSize, (i2 & 8) != 0 ? false : z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CheckUpdateUseCase j() {
        return (CheckUpdateUseCase) this.checkUpdateUseCase.getValue();
    }

    private final Pair<CharSequence, Integer> k(WatchData item) {
        String money;
        if (!m()) {
            return null;
        }
        Boolean boolIsFree = item.isFree();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(boolIsFree, bool)) {
            money = getContext().getString(R.string.wf_free);
        } else if (Intrinsics.areEqual(item.isPurchased(), bool)) {
            money = getContext().getString(R.string.wf_purchased);
        } else {
            String currencyCode = item.getCurrencyCode();
            money = !(currencyCode == null || currencyCode.length() == 0) ? MoneyFormatterFactory.INSTANCE.getFormatter(item.getCurrencyCode()).getMoney(item.getPrice()) : null;
        }
        int i = (Intrinsics.areEqual(item.isPurchased(), bool) || Intrinsics.areEqual(item.isFree(), bool)) ? R.color.wf_text_light_white : R.color.wf_color_price;
        if (money == null) {
            return null;
        }
        return TuplesKt.to(money, Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WatchFaceStatusRepo l() {
        return (WatchFaceStatusRepo) this.watchFaceStatusRepo.getValue();
    }

    private final boolean m() {
        return ((Boolean) this.isSupportPay.getValue()).booleanValue();
    }

    @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter, com.huami.watchfacesstore.view.recycleview.ViewHolder.a
    public void onViewHolderInit(@NotNull View itemView, int layoutRes) {
        ImageView imageView = (ImageView) itemView.findViewById(R.id.thumbnail_img);
        ImageView imageView2 = (ImageView) itemView.findViewById(R.id.thumbnail_img_shadow);
        ImageView imageView3 = (ImageView) itemView.findViewById(R.id.transparent_img);
        this.deviceConfigManager.setShadowImageParamsByDevice(imageView2, this.deviceSize);
        imageView2.setImageResource(this.deviceConfigManager.getCurrentDeviceConfig().getPlaceHolderImage());
        this.deviceConfigManager.setImageInCardParamsByDevice(imageView, this.deviceSize);
        if (imageView3 != null) {
            this.deviceConfigManager.setImageInCardParamsByDevice(imageView3, this.deviceSize);
        }
        View viewFindViewById = itemView.findViewById(R.id.selected_bg);
        if (viewFindViewById == null) {
            return;
        }
        this.deviceConfigManager.setImageInCardParamsByDevice(viewFindViewById, this.deviceSize);
        ExtensionsKt.setShape$default(viewFindViewById, ExtensionsKt.getDp(this.deviceConfigManager.getDialRadius()), null, 2, null);
    }

    public final void setItemStatus(int position, int status) {
        getItem(position).setStatus(status);
        notifyItemChanged(position);
    }

    public final void setNormalStatus(@NotNull List<WatchData> lists) {
        Iterator<T> it2 = lists.iterator();
        while (it2.hasNext()) {
            ((WatchData) it2.next()).setStatus(0);
        }
        notifyItemRangeChanged(0, lists.size());
    }

    public final void setSelectedStatus(@NotNull List<WatchData> lists) {
        Iterator<T> it2 = lists.iterator();
        while (it2.hasNext()) {
            ((WatchData) it2.next()).setStatus(2);
        }
        notifyItemRangeChanged(0, lists.size());
    }

    public final void setUnselectedStatus(@NotNull List<WatchData> lists) {
        Iterator<T> it2 = lists.iterator();
        while (it2.hasNext()) {
            ((WatchData) it2.next()).setStatus(1);
        }
        notifyItemRangeChanged(0, lists.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WatchFaceAdapter(@NotNull Context context, int i, @NotNull DeviceConfigManager.DeviceSize deviceSize, boolean z) {
        super(context, i);
        this.deviceSize = deviceSize;
        this.deviceConfigManager = KoinExtKt.getDeviceConfigManager();
        this.watchFaceStatusRepo = LazyKt__LazyJVMKt.lazy(b.a);
        this.idMaps = LocalCacheManager.INSTANCE.getLocalVersions();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.checkUpdateUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<CheckUpdateUseCase>() { // from class: com.huami.watchfacesstore.ui.adapter.WatchFaceAdapter$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [com.huami.watchfacesstore.usecase.CheckUpdateUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final CheckUpdateUseCase getA() {
                Koin koin = GlobalContext.INSTANCE.get();
                return koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(CheckUpdateUseCase.class), qualifier, objArr);
            }
        });
        this.isSupportPay = LazyKt__LazyJVMKt.lazy(a.a);
        if (m()) {
            LifecycleOwner lifecycleOwner = context instanceof LifecycleOwner ? (LifecycleOwner) context : null;
            LifecycleCoroutineScope lifecycleScope = lifecycleOwner == null ? null : LifecycleOwnerKt.getLifecycleScope(lifecycleOwner);
            if (lifecycleScope != null) {
                lifecycleScope.launchWhenCreated(new AnonymousClass1(null));
            }
            if (!z || lifecycleScope == null) {
                return;
            }
            lifecycleScope.launchWhenCreated(new AnonymousClass2(null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d0  */
    @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter
    public void convert(@NotNull ViewHolder holder, int position, @Nullable WatchData item) {
        Unit unit;
        Unit unit2;
        String transparentBackground;
        Unit unit3;
        if (item == null) {
            return;
        }
        TextView textView = (TextView) holder.getView(R.id.tv_new_name);
        RatingBar ratingBar = (RatingBar) holder.getView(R.id.rating_bar);
        ImageView imageView = (ImageView) holder.getView(R.id.thumbnail_img);
        ImageView imageView2 = (ImageView) holder.getView(R.id.selected_img);
        View view = holder.getView(R.id.selected_bg);
        TextView textView2 = (TextView) holder.getView(R.id.price);
        ImageView imageView3 = (ImageView) holder.getView(R.id.transparent_img);
        Unit unit4 = null;
        if (imageView3 != null) {
            Metas metas = item.getMetas();
            if (metas == null || (transparentBackground = metas.getTransparentBackground()) == null) {
                unit3 = null;
            } else {
                ExtensionsKt.visible(imageView3);
                ExtensionsKt.loadUrlAndHintColor(imageView3, transparentBackground, item.getColor());
                unit3 = Unit.INSTANCE;
            }
            if (unit3 == null) {
                ExtensionsKt.gone(imageView3);
            }
        }
        if (imageView != null) {
            Metas metas2 = item.getMetas();
            String gif = metas2 == null ? null : metas2.getGif();
            if (gif == null) {
                gif = item.getImage();
            }
            ExtensionsKt.loadWithRadius(imageView, gif, this.deviceConfigManager.getCurrentDeviceConfig().getDialRadiusInCard());
        }
        String name = item.getName();
        if (name == null) {
            unit = null;
        } else {
            if (textView != null) {
                textView.setText(name);
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null && textView != null) {
            ExtensionsKt.gone(textView);
        }
        ((TextView) holder.getView(R.id.tv_update)).setVisibility((m() && j().invoke(item.getVersion(), this.idMaps.get(Integer.valueOf(item.getId())))) ? 0 : 8);
        Pair<CharSequence, Integer> pairK = k(item);
        if (pairK == null) {
            unit2 = null;
        } else {
            CharSequence charSequenceComponent1 = pairK.component1();
            int iIntValue = pairK.component2().intValue();
            if (ratingBar != null) {
                ExtensionsKt.gone(ratingBar);
            }
            if (textView2 != null) {
                textView2.setText(charSequenceComponent1);
            }
            if (textView2 == null) {
                unit2 = null;
            } else {
                textView2.setTextColor(ContextCompat.getColor(getContext(), iIntValue));
                unit2 = Unit.INSTANCE;
            }
        }
        if (unit2 == null) {
            if (textView2 != null) {
                ExtensionsKt.gone(textView2);
            }
            Float rank = item.getRank();
            if (rank != null) {
                float fFloatValue = rank.floatValue();
                if (ratingBar != null) {
                    ratingBar.setRating(fFloatValue);
                }
                unit4 = Unit.INSTANCE;
            }
            if (unit4 == null && ratingBar != null) {
                ExtensionsKt.gone(ratingBar);
            }
        }
        int status = item.getStatus();
        if (status == 1) {
            if (view != null) {
                ExtensionsKt.gone(view);
            }
            if (imageView2 != null) {
                ExtensionsKt.visible(imageView2);
            }
            if (imageView2 == null) {
                return;
            }
            imageView2.setImageResource(R.drawable.wf_select_circle);
            return;
        }
        if (status != 2) {
            if (view != null) {
                ExtensionsKt.gone(view);
            }
            if (imageView2 == null) {
                return;
            }
            ExtensionsKt.gone(imageView2);
            return;
        }
        if (view != null) {
            ExtensionsKt.visible(view);
        }
        if (imageView2 != null) {
            ExtensionsKt.visible(imageView2);
        }
        if (imageView2 == null) {
            return;
        }
        imageView2.setImageResource(R.drawable.wf_ic_face_selected);
    }
}
