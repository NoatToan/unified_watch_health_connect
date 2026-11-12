package com.huami.watchfacesstore.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleCoroutineScope;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nps.p003const.NpsConst;
import com.huami.nps.view.NpsFragment;
import com.huami.privacy.moneyformat.MoneyFormatterFactory;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.analytic.WFAnalyticHelper;
import com.huami.watchfacesstore.analytic.WFStateEvent;
import com.huami.watchfacesstore.bean.BannerBean;
import com.huami.watchfacesstore.bean.Category;
import com.huami.watchfacesstore.bean.HomeListBean;
import com.huami.watchfacesstore.bean.Metas;
import com.huami.watchfacesstore.bean.NewWatchFace;
import com.huami.watchfacesstore.bean.Publisher;
import com.huami.watchfacesstore.bean.Subject;
import com.huami.watchfacesstore.bean.Topic;
import com.huami.watchfacesstore.bean.WatchData;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.navigation.WFNavigation;
import com.huami.watchfacesstore.repo.WatchFaceStatusRepo;
import com.huami.watchfacesstore.ui.HomePageItemType;
import com.huami.watchfacesstore.ui.adapter.HomeAdapter;
import com.huami.watchfacesstore.ui.repeatview.RepeatRecyclerView;
import com.huami.watchfacesstore.ui.repeatview.RepeatViewCacheExtension;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import com.huami.watchfacesstore.ui.store.list.CategoryListActivity;
import com.huami.watchfacesstore.ui.store.list.RankListActivity;
import com.huami.watchfacesstore.view.banner.Banner;
import com.huami.watchfacesstore.view.recycleview.BaseRVAdapter;
import com.huami.watchfacesstore.view.recycleview.ViewHolder;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=B\u0019\u0012\u0006\u00109\u001a\u000208\u0012\b\b\u0002\u0010:\u001a\u00020\u0005¢\u0006\u0004\b;\u0010<J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\"\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0005H\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010 \u001a\u00020\u001b8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001d\u0010*\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010)R\u001d\u0010.\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b,\u0010-R#\u00103\u001a\b\u0012\u0004\u0012\u00020/0\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u001d\u001a\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006>"}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/HomeAdapter;", "Lcom/huami/watchfacesstore/view/recycleview/BaseRVAdapter;", "Lcom/huami/watchfacesstore/bean/HomeListBean;", "Lcom/huami/watchfacesstore/bean/WatchData;", "watchData", "", "purchasedId", "index", "", "r", "id", "F", "", "", "list", "B", "Lcom/huami/watchfacesstore/view/recycleview/ViewHolder;", "holder", "onViewAttachedToWindow", "position", "item", "convert", "getLayoutResId", "Lcom/huami/watchfacesstore/repo/WatchFaceStatusRepo;", GoogleApiAvailabilityLight.b, "Lcom/huami/watchfacesstore/repo/WatchFaceStatusRepo;", "watchFaceStatusRepo", "Lcom/huami/watchfacesstore/ui/repeatview/RepeatViewCacheExtension;", "o", "Lkotlin/Lazy;", "getViewCache", "()Lcom/huami/watchfacesstore/ui/repeatview/RepeatViewCacheExtension;", "viewCache", "Lcom/huami/nps/view/NpsFragment;", com.google.android.exoplayer2.text.ttml.b.r, "C", "()Lcom/huami/nps/view/NpsFragment;", "npsFragment", "Lcom/huami/watchfacesstore/ui/adapter/WatchFaceAdapter;", DTransferConstants.SEARCH_KEY, "E", "()Lcom/huami/watchfacesstore/ui/adapter/WatchFaceAdapter;", "watchFaceAdapter", "Lcom/huami/watchfacesstore/ui/adapter/RankingAdapter;", LogUtil.D, "()Lcom/huami/watchfacesstore/ui/adapter/RankingAdapter;", "rankingAdapter", "Lcom/huami/watchfacesstore/bean/BannerBean;", SOAP.XMLNS, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lcom/huami/watchfacesstore/view/recycleview/BaseRVAdapter;", "bannerAdapter", "Lcom/huami/watchfacesstore/navigation/WFNavigation;", "t", "Lcom/huami/watchfacesstore/navigation/WFNavigation;", "mNavigation", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "layoutRes", "<init>", "(Landroid/content/Context;I)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class HomeAdapter extends BaseRVAdapter<HomeListBean> {
    public static final long AUTO_TIME = 3000;
    public static final int IMAGE_RADIUS = 6;

    @NotNull
    public static final String RANK_TYPE = "week";

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final WatchFaceStatusRepo watchFaceStatusRepo;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewCache;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final Lazy npsFragment;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final Lazy watchFaceAdapter;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final Lazy rankingAdapter;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final Lazy bannerAdapter;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final WFNavigation mNavigation;

    /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.adapter.HomeAdapter$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.adapter.HomeAdapter$1", f = "HomeAdapter.kt", i = {}, l = {432}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.adapter.HomeAdapter$1$WhenMappings */
        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HomePageItemType.values().length];
                iArr[HomePageItemType.NEW_WATCH.ordinal()] = 1;
                iArr[HomePageItemType.CATEGORY.ordinal()] = 2;
                iArr[HomePageItemType.TODAY_RECOMMEND.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HomeAdapter.this.new AnonymousClass1(continuation);
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
                Flow<Integer> flowObserverPurchased = HomeAdapter.this.watchFaceStatusRepo.observerPurchased();
                final HomeAdapter homeAdapter = HomeAdapter.this;
                FlowCollector<Integer> flowCollector = new FlowCollector<Integer>() { // from class: com.huami.watchfacesstore.ui.adapter.HomeAdapter$1$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(Integer num, @NotNull Continuation<? super Unit> continuation) {
                        int iIntValue = num.intValue();
                        int i2 = 0;
                        for (Object obj2 : homeAdapter.getListData()) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            HomeListBean homeListBean = (HomeListBean) obj2;
                            int iIntValue2 = Boxing.boxInt(i2).intValue();
                            int i4 = HomeAdapter.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[homeListBean.getType().ordinal()];
                            if (i4 == 1) {
                                Iterator<T> it2 = ((NewWatchFace) homeListBean.getData()).getData().iterator();
                                while (it2.hasNext()) {
                                    homeAdapter.r((WatchData) it2.next(), iIntValue, iIntValue2);
                                }
                            } else if (i4 == 2) {
                                Iterator<T> it3 = ((Category) homeListBean.getData()).getData().iterator();
                                while (it3.hasNext()) {
                                    homeAdapter.r((WatchData) it3.next(), iIntValue, iIntValue2);
                                }
                            } else if (i4 == 3) {
                                Iterator<T> it4 = ((Topic) homeListBean.getData()).getData().iterator();
                                while (it4.hasNext()) {
                                    homeAdapter.r((WatchData) it4.next(), iIntValue, iIntValue2);
                                }
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HomePageItemType.values().length];
            iArr[HomePageItemType.NEW_WATCH.ordinal()] = 1;
            iArr[HomePageItemType.BANNER.ordinal()] = 2;
            iArr[HomePageItemType.RANKING.ordinal()] = 3;
            iArr[HomePageItemType.SUBJECT.ordinal()] = 4;
            iArr[HomePageItemType.CATEGORY.ordinal()] = 5;
            iArr[HomePageItemType.TODAY_RECOMMEND.ordinal()] = 6;
            iArr[HomePageItemType.COOL_SPECIAL.ordinal()] = 7;
            iArr[HomePageItemType.NPS.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Topic b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Topic topic) {
            super(0);
            this.b = topic;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HomeAdapter.this.F(this.b.getId());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Topic b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Topic topic) {
            super(0);
            this.b = topic;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HomeAdapter.this.F(this.b.getId());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ HomeListBean a;
        public final /* synthetic */ RecyclerView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HomeListBean homeListBean, RecyclerView recyclerView) {
            super(0);
            this.a = homeListBean;
            this.b = recyclerView;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            HomeListBean homeListBean = this.a;
            HomePageItemType type = homeListBean == null ? null : homeListBean.getType();
            RecyclerView recyclerView = this.b;
            RecyclerView.Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            StringBuilder sb = new StringBuilder();
            sb.append(type);
            sb.append(adapter);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nps/view/NpsFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<NpsFragment> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NpsFragment getA() {
            return NpsFragment.INSTANCE.newInstance(NpsConst.ParamValue.DIAL_TYPE_VALUE, KoinExtKt.getUserInfo().getUserId());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "add npsFragment ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/RankingAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<RankingAdapter> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RankingAdapter getA() {
            return new RankingAdapter(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/repeatview/RepeatViewCacheExtension;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<RepeatViewCacheExtension> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RepeatViewCacheExtension getA() {
            return new RepeatViewCacheExtension(R.layout.wf_home_item_cool_special);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/WatchFaceAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<WatchFaceAdapter> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WatchFaceAdapter getA() {
            return new WatchFaceAdapter(this.a, R.layout.wf_item_watchface_common, DeviceConfigManager.DeviceSize.SIZE_ONE, false, 8, null);
        }
    }

    public /* synthetic */ HomeAdapter(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? -1 : i);
    }

    private final BaseRVAdapter<BannerBean> A() {
        return (BaseRVAdapter) this.bannerAdapter.getValue();
    }

    private final List<String> B(List<String> list) {
        try {
            return CollectionsKt___CollectionsKt.plus((Collection) list.subList(3, list.size()), (Iterable) list.subList(0, 3));
        } catch (Exception unused) {
            return list;
        }
    }

    private final NpsFragment C() {
        return (NpsFragment) this.npsFragment.getValue();
    }

    private final RankingAdapter D() {
        return (RankingAdapter) this.rankingAdapter.getValue();
    }

    private final WatchFaceAdapter E() {
        return (WatchFaceAdapter) this.watchFaceAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(int id) {
        WFAnalyticHelper.analyticCount$default(WFAnalyticHelper.INSTANCE, WFStateEvent.WF_REC_SERIES_C, null, null, null, 14, null);
        CategoryListActivity.INSTANCE.actionStart(getContext(), 9, id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(WatchData watchData, int purchasedId, int index) {
        if (watchData.getId() == purchasedId) {
            watchData.setPurchased(Boolean.TRUE);
            notifyItemChanged(index);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(Subject subject, HomeAdapter homeAdapter, View view) {
        WFAnalyticHelper.analyticCount$default(WFAnalyticHelper.INSTANCE, WFStateEvent.WF_STORE_TOPIC_CLICK_NUM, null, q.mapOf(TuplesKt.to(WFStateEvent.WF_TOPIC_ID, subject.getTitle())), null, 10, null);
        homeAdapter.mNavigation.doJumpAction(homeAdapter.getContext(), Integer.valueOf(subject.getMode()), subject.getTarget(), null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(Category category, HomeAdapter homeAdapter, ViewHolder viewHolder, int i, int i2) {
        WatchFaceDetailActivity.Companion.actionStart$default(WatchFaceDetailActivity.INSTANCE, homeAdapter.getContext(), 0, category.getData().get(i2).getId(), null, "category", 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(Category category, HomeAdapter homeAdapter, View view) {
        WFAnalyticHelper.analyticCount$default(WFAnalyticHelper.INSTANCE, "WF_More_Click", null, q.mapOf(TuplesKt.to("Type", category.getCategory())), null, 10, null);
        CategoryListActivity.INSTANCE.actionStart(homeAdapter.getContext(), 5, category.getCategory_id());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(WatchData watchData, HomeAdapter homeAdapter, View view) {
        WFAnalyticHelper.INSTANCE.reportWatchFaceViewAnalytic(WFStateEvent.WF_REC_SINGLE_C, watchData.getId(), watchData.isFree());
        WatchFaceDetailActivity.Companion.actionStart$default(WatchFaceDetailActivity.INSTANCE, homeAdapter.getContext(), 0, watchData.getId(), null, WatchFaceDetailActivity.FROM_REC_SINGLE, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(HomeAdapter homeAdapter, Topic topic, View view) {
        homeAdapter.F(topic.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(NewWatchFace newWatchFace, HomeAdapter homeAdapter, ViewHolder viewHolder, int i, int i2) {
        WFAnalyticHelper.analyticCount$default(WFAnalyticHelper.INSTANCE, WFStateEvent.WF_STORE_NEW_CLICK_NUM, null, null, null, 14, null);
        WatchFaceDetailActivity.Companion.actionStart$default(WatchFaceDetailActivity.INSTANCE, homeAdapter.getContext(), 0, newWatchFace.getData().get(i2).getId(), null, "new", 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(HomeAdapter homeAdapter, View view) {
        WFAnalyticHelper.analyticCount$default(WFAnalyticHelper.INSTANCE, "WF_More_Click", null, q.mapOf(TuplesKt.to("Type", "new")), null, 10, null);
        CategoryListActivity.Companion.actionStart$default(CategoryListActivity.INSTANCE, homeAdapter.getContext(), 3, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(TextView textView, View view) {
        RankListActivity.INSTANCE.actionStart(textView.getContext(), "week");
    }

    @NotNull
    public final RepeatViewCacheExtension getViewCache() {
        return (RepeatViewCacheExtension) this.viewCache.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeAdapter(@NotNull final Context context, int i) {
        LifecycleCoroutineScope lifecycleScope;
        super(context, i);
        this.watchFaceStatusRepo = KoinExtKt.getWatchFaceStatusRepo();
        this.viewCache = LazyKt__LazyJVMKt.lazy(g.a);
        this.npsFragment = LazyKt__LazyJVMKt.lazy(d.a);
        LifecycleOwner lifecycleOwner = context instanceof LifecycleOwner ? (LifecycleOwner) context : null;
        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            lifecycleScope.launchWhenCreated(new AnonymousClass1(null));
        }
        this.watchFaceAdapter = LazyKt__LazyJVMKt.lazy(new h(context));
        this.rankingAdapter = LazyKt__LazyJVMKt.lazy(new f(context));
        this.bannerAdapter = LazyKt__LazyJVMKt.lazy(new Function0<HomeAdapter$bannerAdapter$2.AnonymousClass1>() { // from class: com.huami.watchfacesstore.ui.adapter.HomeAdapter$bannerAdapter$2

            /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.adapter.HomeAdapter$bannerAdapter$2$1, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\n"}, d2 = {"com/huami/watchfacesstore/ui/adapter/HomeAdapter$bannerAdapter$2$1", "Lcom/huami/watchfacesstore/view/recycleview/BaseRVAdapter;", "Lcom/huami/watchfacesstore/bean/BannerBean;", "Lcom/huami/watchfacesstore/view/recycleview/ViewHolder;", "holder", "", "position", "item", "", "convert", "lib_release"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass1 extends BaseRVAdapter<BannerBean> {
                public final /* synthetic */ HomeAdapter n;
                public final /* synthetic */ Context o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(HomeAdapter homeAdapter, Context context, int i) {
                    super(context, i);
                    this.n = homeAdapter;
                    this.o = context;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void k(BannerBean bannerBean, HomeAdapter homeAdapter, Context context, View view) {
                    WFAnalyticHelper.analyticCount$default(WFAnalyticHelper.INSTANCE, WFStateEvent.WF_STORE_BANNER_CLICK_NUM, null, q.mapOf(TuplesKt.to(WFStateEvent.WF_Banner_ID, bannerBean.getTitle())), null, 10, null);
                    homeAdapter.mNavigation.doJumpAction(context, Integer.valueOf(bannerBean.getMode()), bannerBean.getTarget(), null, null);
                }

                @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter
                public void convert(@NotNull ViewHolder holder, int position, @Nullable final BannerBean item) {
                    ImageView imageView = (ImageView) holder.getView(R.id.iv_home_banner);
                    if (item == null) {
                        return;
                    }
                    final HomeAdapter homeAdapter = this.n;
                    final Context context = this.o;
                    ExtensionsKt.loadWithRadius(imageView, item.getImage(), 6);
                    imageView.setOnClickListener(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001c: INVOKE 
                          (r4v2 'imageView' android.widget.ImageView)
                          (wrap android.view.View$OnClickListener:0x0019: CONSTRUCTOR 
                          (r6v0 'item' com.huami.watchfacesstore.bean.BannerBean A[DONT_INLINE])
                          (r5v2 'homeAdapter' com.huami.watchfacesstore.ui.adapter.HomeAdapter A[DONT_INLINE])
                          (r0v0 'context' android.content.Context A[DONT_INLINE])
                         A[MD:(com.huami.watchfacesstore.bean.BannerBean, com.huami.watchfacesstore.ui.adapter.HomeAdapter, android.content.Context):void (m), WRAPPED] (LINE:5) call: b84.<init>(com.huami.watchfacesstore.bean.BannerBean, com.huami.watchfacesstore.ui.adapter.HomeAdapter, android.content.Context):void type: CONSTRUCTOR)
                         VIRTUAL call: android.widget.ImageView.setOnClickListener(android.view.View$OnClickListener):void A[MD:(android.view.View$OnClickListener):void (c)] (LINE:5) in method: com.huami.watchfacesstore.ui.adapter.HomeAdapter$bannerAdapter$2.1.convert(com.huami.watchfacesstore.view.recycleview.ViewHolder, int, com.huami.watchfacesstore.bean.BannerBean):void, file: classes17.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: b84, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 19 more
                        */
                    /*
                        this = this;
                        int r5 = com.huami.watchfacesstore.R.id.iv_home_banner
                        android.view.View r4 = r4.getView(r5)
                        android.widget.ImageView r4 = (android.widget.ImageView) r4
                        if (r6 != 0) goto Lb
                        goto L1f
                    Lb:
                        com.huami.watchfacesstore.ui.adapter.HomeAdapter r5 = r3.n
                        android.content.Context r0 = r3.o
                        java.lang.String r1 = r6.getImage()
                        r2 = 6
                        com.huami.watchfacesstore.ext.ExtensionsKt.loadWithRadius(r4, r1, r2)
                        b84 r1 = new b84
                        r1.<init>(r6, r5, r0)
                        r4.setOnClickListener(r1)
                    L1f:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huami.watchfacesstore.ui.adapter.HomeAdapter$bannerAdapter$2.AnonymousClass1.convert(com.huami.watchfacesstore.view.recycleview.ViewHolder, int, com.huami.watchfacesstore.bean.BannerBean):void");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AnonymousClass1 getA() {
                return new AnonymousClass1(this, context, R.layout.wf_home_item_inner_banner);
            }
        });
        this.mNavigation = KoinExtKt.getWFNavigation();
    }

    @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter
    public void convert(@NotNull ViewHolder holder, int position, @Nullable HomeListBean item) {
        final TextView textView = (TextView) holder.getView(R.id.tv_home_more);
        TextView textView2 = (TextView) holder.getView(R.id.tv_home_item_title);
        RecyclerView recyclerView = (RecyclerView) holder.getView(R.id.home_item_recyclerView);
        HMLog.info("c", new c(item, recyclerView));
        Unit unit = null;
        HomePageItemType type = item == null ? null : item.getType();
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                textView2.setText(R.string.wf_home_item_new_title);
                final NewWatchFace newWatchFace = (NewWatchFace) item.getData();
                if (newWatchFace.getTotalCount() <= 10) {
                    ExtensionsKt.gone(textView);
                } else {
                    ExtensionsKt.visible(textView);
                }
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
                recyclerView.setAdapter(E());
                Unit unit2 = Unit.INSTANCE;
                if (E().getListData().isEmpty()) {
                    E().replaceAll(newWatchFace.getData());
                }
                E().setOnItemClickListener(new BaseRVAdapter.OnItemClickListener() { // from class: a84
                    @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter.OnItemClickListener
                    public final void onItemClick(ViewHolder viewHolder, int i, int i2) {
                        HomeAdapter.x(newWatchFace, this, viewHolder, i, i2);
                    }
                });
                textView.setOnClickListener(new View.OnClickListener() { // from class: x74
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HomeAdapter.y(this.a, view);
                    }
                });
                break;
            case 2:
                Banner banner = (Banner) holder.getView(R.id.home_banner);
                banner.setPageMargin(ExtensionsKt.getDp(5), ExtensionsKt.getDp(10)).setAutoTurningTime(3000L);
                Unit unit3 = Unit.INSTANCE;
                List<BannerBean> list = (List) item.getData();
                banner.setAdapter(A());
                if (A().getListData().isEmpty()) {
                    A().replaceAll(list);
                }
                break;
            case 3:
                textView2.setText(R.string.wf_home_item_rank_title);
                ExtensionsKt.visible(textView);
                textView.setOnClickListener(new View.OnClickListener() { // from class: t74
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HomeAdapter.z(textView, view);
                    }
                });
                Unit unit4 = Unit.INSTANCE;
                ViewPager2 viewPager2 = (ViewPager2) holder.getView(R.id.view_pager);
                viewPager2.setOffscreenPageLimit(1);
                View childAt = viewPager2.getChildAt(0);
                Objects.requireNonNull(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                RecyclerView recyclerView2 = (RecyclerView) childAt;
                int dp = ExtensionsKt.getDp(15);
                recyclerView2.setPadding(dp, 0, dp, 0);
                recyclerView2.setClipToPadding(false);
                viewPager2.setAdapter(D());
                CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
                compositePageTransformer.addTransformer(new MarginPageTransformer(ExtensionsKt.getDp(10)));
                viewPager2.setPageTransformer(compositePageTransformer);
                List list2 = (List) item.getData();
                if (D().getListData().isEmpty()) {
                    D().replaceAll(list2);
                }
                break;
            case 4:
                final Subject subject = (Subject) item.getData();
                ImageView imageView = (ImageView) holder.getView(R.id.iv_home_subject);
                ExtensionsKt.loadWithRadius(imageView, subject.getImage(), 6);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: v74
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HomeAdapter.s(subject, this, view);
                    }
                });
                break;
            case 5:
                final Category category = (Category) item.getData();
                textView2.setText(category.getCategory());
                if (category.getCategoryNum() == 1) {
                    ExtensionsKt.gone(textView2);
                }
                if (category.getCategoryNum() == 1 || category.getTotalPage() == 1) {
                    ExtensionsKt.gone(textView);
                } else {
                    ExtensionsKt.visible(textView);
                }
                WatchFaceAdapter watchFaceAdapter = new WatchFaceAdapter(getContext(), R.layout.wf_item_new_watchface, DeviceConfigManager.DeviceSize.SIZE_TWO, false, 8, null);
                recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
                recyclerView.setAdapter(watchFaceAdapter);
                Unit unit5 = Unit.INSTANCE;
                watchFaceAdapter.setOnItemClickListener(new BaseRVAdapter.OnItemClickListener() { // from class: z74
                    @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter.OnItemClickListener
                    public final void onItemClick(ViewHolder viewHolder, int i, int i2) {
                        HomeAdapter.t(category, this, viewHolder, i, i2);
                    }
                });
                watchFaceAdapter.replaceAll(category.getData());
                textView.setOnClickListener(new View.OnClickListener() { // from class: u74
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HomeAdapter.u(category, this, view);
                    }
                });
                break;
            case 6:
                TextView textView3 = (TextView) holder.getView(R.id.titleTv);
                ImageView imageView2 = (ImageView) holder.getView(R.id.bgIv);
                TextView textView4 = (TextView) holder.getView(R.id.recommendTitleTv);
                ImageView imageView3 = (ImageView) holder.getView(R.id.watchIv);
                TextView textView5 = (TextView) holder.getView(R.id.watchNameTv);
                TextView textView6 = (TextView) holder.getView(R.id.watchAuthorTv);
                TextView textView7 = (TextView) holder.getView(R.id.feeBtn);
                Topic topic = (Topic) item.getData();
                final WatchData watchData = topic.getData().get(0);
                holder.getConvertView().setOnClickListener(new View.OnClickListener() { // from class: w74
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HomeAdapter.v(watchData, this, view);
                    }
                });
                textView3.setText(topic.getName());
                ExtensionsKt.loadUrl(imageView2, topic.getImage());
                textView4.setText(topic.getTitle());
                Metas metas = watchData.getMetas();
                String gif = metas == null ? null : metas.getGif();
                if (gif == null) {
                    gif = watchData.getImage();
                }
                ExtensionsKt.loadUrl(imageView3, gif);
                textView5.setText(watchData.getName());
                Publisher publisher = watchData.getPublisher();
                if (publisher != null) {
                    textView6.setText(getContext().getString(R.string.wf_watch_author, publisher.getName()));
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    textView6.setText("");
                    Unit unit6 = Unit.INSTANCE;
                }
                Boolean boolIsFree = watchData.isFree();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.areEqual(boolIsFree, bool)) {
                    textView7.setText(getContext().getString(R.string.wf_free));
                    textView7.setTextColor(ContextCompat.getColor(getContext(), R.color.wf_color_btn_free));
                    textView7.setBackgroundResource(R.drawable.wf_buy_btn_free_bg);
                    break;
                } else if (Intrinsics.areEqual(watchData.isPurchased(), bool)) {
                    textView7.setText(getContext().getString(R.string.wf_purchased));
                    textView7.setTextColor(ContextCompat.getColor(getContext(), R.color.wf_color_btn_free));
                    textView7.setBackgroundResource(R.drawable.wf_buy_btn_free_bg);
                    break;
                } else {
                    String currencyCode = watchData.getCurrencyCode();
                    if (currencyCode != null) {
                        ExtensionsKt.visible(textView7);
                        textView7.setText(MoneyFormatterFactory.INSTANCE.getFormatter(currencyCode).getMoney(watchData.getPrice()));
                        textView7.setBackgroundResource(R.drawable.wf_buy_btn_bg);
                        textView7.setTextColor(ContextCompat.getColor(getContext(), R.color.wf_color_btn_pay));
                        Unit unit7 = Unit.INSTANCE;
                        break;
                    }
                }
                break;
            case 7:
                getViewCache().cacheViewHolder(R.layout.wf_home_item_cool_special, position, holder);
                TextView textView8 = (TextView) holder.getView(R.id.moduleTv);
                TextView textView9 = (TextView) holder.getView(R.id.nameTv);
                RepeatRecyclerView repeatRecyclerView = (RepeatRecyclerView) holder.getView(R.id.specialRecyclerView);
                RepeatRecyclerView repeatRecyclerView2 = (RepeatRecyclerView) holder.getView(R.id.specialRecyclerView2);
                final Topic topic2 = (Topic) item.getData();
                textView8.setText(topic2.getName());
                textView9.setText(topic2.getTitle());
                List<WatchData> data = topic2.getData();
                ArrayList<WatchData> arrayList = new ArrayList();
                for (Object obj : data) {
                    WatchData watchData2 = (WatchData) obj;
                    Metas metas2 = watchData2.getMetas();
                    String gif2 = metas2 == null ? null : metas2.getGif();
                    if (gif2 == null) {
                        gif2 = watchData2.getImage();
                    }
                    if (gif2 != null) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                for (WatchData watchData3 : arrayList) {
                    Metas metas3 = watchData3.getMetas();
                    String gif3 = metas3 == null ? null : metas3.getGif();
                    if (gif3 == null) {
                        gif3 = watchData3.getImage();
                    }
                    arrayList2.add(gif3);
                }
                repeatRecyclerView.setRepeatAdapter(arrayList2, true);
                repeatRecyclerView2.setRepeatAdapter(B(arrayList2), false);
                repeatRecyclerView.setOnClickListener(new a(topic2));
                repeatRecyclerView2.setOnClickListener(new b(topic2));
                holder.getView(R.id.moduleLayout).setOnClickListener(new View.OnClickListener() { // from class: y74
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HomeAdapter.w(this.a, topic2, view);
                    }
                });
                break;
        }
    }

    @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter, com.huami.watchfacesstore.view.recycleview.b
    public int getLayoutResId(@Nullable HomeListBean item, int position) {
        HomePageItemType type = item == null ? null : item.getType();
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 2) {
            return R.layout.wf_home_item_banner;
        }
        if (i == 3) {
            return R.layout.wf_home_item_ranking;
        }
        if (i == 4) {
            return R.layout.wf_home_item_subject;
        }
        if (i == 6) {
            return R.layout.wf_home_item_today_recommend;
        }
        if (i != 7) {
            return i != 8 ? R.layout.wf_home_item_common : R.layout.wf_home_nps;
        }
        return R.layout.wf_home_item_cool_special;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull ViewHolder holder) {
        int i = R.id.nps;
        if (holder.getView(i) == null || C().isAdded()) {
            return;
        }
        Context context = getContext();
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity == null) {
            return;
        }
        HMLog.info("HomeAdapter", e.a);
        ExtensionsKt.addFragmentByTag$default(fragmentActivity, C(), i, null, 4, null);
    }
}
