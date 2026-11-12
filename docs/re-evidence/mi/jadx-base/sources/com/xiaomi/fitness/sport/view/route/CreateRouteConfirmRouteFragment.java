package com.xiaomi.fitness.sport.view.route;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import coil.transform.RoundedCornersTransformation;
import com.amap.api.maps.utils.SpatialRelationUtil;
import com.mi.health.sport.CreateRouteMap;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.route.detail.model.RouteSceneType;
import com.xiaomi.fitness.sport.view.route.CreateRouteConfirmRouteFragment;
import com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.p9n;
import defpackage.uln;
import defpackage.xri;
import defpackage.zxi;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import miuix.miuixbasewidget.widget.FilterSortView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ;2\u00020\u0001:\u0002;<B\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b9\u0010:J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\fJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00100\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R$\u00103\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V", "handleBackPressed", "()V", "initRouteIconView", "initBehavior", "initButtonState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/xiaomi/fitness/sport/route/detail/model/RouteSceneType;", "sceneType", "Lcom/xiaomi/fitness/sport/route/detail/model/RouteSceneType;", "getSceneType", "()Lcom/xiaomi/fitness/sport/route/detail/model/RouteSceneType;", "Luln;", "mBinding", "Luln;", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "createRouteActivity", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "Lp9n;", "createRouteActivityBinding", "Lp9n;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "createRouteViewModel", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "midContentView", "Landroid/view/View;", "contentLayout", "Landroidx/recyclerview/widget/RecyclerView;", "routeRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment$RouteAdapter;", "routeAdapter", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment$RouteAdapter;", "", "", "", "adapterRecorder", "Ljava/util/Map;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$RouteData;", "routeData", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$RouteData;", "getRouteData", "()Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$RouteData;", "setRouteData", "(Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$RouteData;)V", "<init>", "(Lcom/xiaomi/fitness/sport/route/detail/model/RouteSceneType;)V", "Companion", "RouteAdapter", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCreateRouteConfirmRouteFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRouteConfirmRouteFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,410:1\n1863#2,2:411\n*S KotlinDebug\n*F\n+ 1 CreateRouteConfirmRouteFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment\n*L\n188#1:411,2\n*E\n"})
public final class CreateRouteConfirmRouteFragment extends Fragment {

    @NotNull
    public static final String TAG = "CreateRouteConfirmRouteFragment";
    private Map<Integer, Boolean> adapterRecorder;
    private View contentLayout;
    private CreateRouteActivity createRouteActivity;
    private p9n createRouteActivityBinding;
    private CreateRouteViewModel createRouteViewModel;
    private uln mBinding;
    private View midContentView;
    private RouteAdapter routeAdapter;

    @Nullable
    private CreateRouteViewModel.RouteData routeData;
    private RecyclerView routeRecyclerView;

    @NotNull
    private final RouteSceneType sceneType;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002&'B'\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b$\u0010%J!\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR0\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\b¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment$RouteAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$RouteData;", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment$RouteAdapter$RouteViewHolder;", "Lkotlin/Function1;", "", "callback", "setSelectRouteLengthCallback", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment$RouteAdapter$RouteViewHolder;", "holder", "position", "onBindViewHolder", "(Lcom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment$RouteAdapter$RouteViewHolder;I)V", "Lcom/mi/health/sport/CreateRouteMap;", "mapView", "Lcom/mi/health/sport/CreateRouteMap;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "createRouteViewModel", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "createRouteActivity", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment;", "localFragment", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment;", "routeLengthCallback", "Lkotlin/jvm/functions/Function1;", "getRouteLengthCallback", "()Lkotlin/jvm/functions/Function1;", "setRouteLengthCallback", "<init>", "(Lcom/mi/health/sport/CreateRouteMap;Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;Lcom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment;)V", "RouteViewHolder", "DiffCallback", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class RouteAdapter extends p<CreateRouteViewModel.RouteData, RouteViewHolder> {

        @NotNull
        private final CreateRouteActivity createRouteActivity;

        @NotNull
        private final CreateRouteViewModel createRouteViewModel;

        @NotNull
        private final CreateRouteConfirmRouteFragment localFragment;

        @NotNull
        private final CreateRouteMap mapView;

        @Nullable
        private Function1<? super CreateRouteViewModel.RouteData, Unit> routeLengthCallback;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment$RouteAdapter$DiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$RouteData;", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$RouteData;Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$RouteData;)Z", "areContentsTheSame", "<init>", "()V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        public static final class DiffCallback extends androidx.recyclerview.widget.h.f<CreateRouteViewModel.RouteData> {
            @Override // androidx.recyclerview.widget.h.f
            public boolean areContentsTheSame(@NotNull CreateRouteViewModel.RouteData oldItem, @NotNull CreateRouteViewModel.RouteData newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.areEqual(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.h.f
            public boolean areItemsTheSame(@NotNull CreateRouteViewModel.RouteData oldItem, @NotNull CreateRouteViewModel.RouteData newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.areEqual(oldItem.getIconUrl(), newItem.getIconUrl());
            }
        }

        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b&\u0010'J)\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment$RouteAdapter$RouteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "routeList", "", "angle", "", "drawRoute", "(Ljava/util/List;Ljava/lang/Float;)V", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$RouteData;", "item", "Lkotlin/Function1;", "routeLengthCallback", "bind", "(Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$RouteData;Lkotlin/jvm/functions/Function1;)V", "Lcom/mi/health/sport/CreateRouteMap;", "mapView", "Lcom/mi/health/sport/CreateRouteMap;", "getMapView", "()Lcom/mi/health/sport/CreateRouteMap;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "createRouteViewModel", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "getCreateRouteViewModel", "()Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "createRouteActivity", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "getCreateRouteActivity", "()Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment;", "localFragment", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment;", "getLocalFragment", "()Lcom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;Lcom/mi/health/sport/CreateRouteMap;Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;Lcom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        @SourceDebugExtension({"SMAP\nCreateRouteConfirmRouteFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRouteConfirmRouteFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment$RouteAdapter$RouteViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,410:1\n54#2,3:411\n24#2:414\n59#2,4:415\n63#2,2:430\n489#3,11:419\n*S KotlinDebug\n*F\n+ 1 CreateRouteConfirmRouteFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment$RouteAdapter$RouteViewHolder\n*L\n326#1:411,3\n326#1:414\n326#1:415,4\n326#1:430,2\n329#1:419,11\n*E\n"})
        public static final class RouteViewHolder extends RecyclerView.d0 {

            @NotNull
            private final CreateRouteActivity createRouteActivity;

            @NotNull
            private final CreateRouteViewModel createRouteViewModel;

            @NotNull
            private final CreateRouteConfirmRouteFragment localFragment;

            @NotNull
            private final CreateRouteMap mapView;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RouteViewHolder(@NotNull View itemView, @NotNull CreateRouteMap mapView, @NotNull CreateRouteViewModel createRouteViewModel, @NotNull CreateRouteActivity createRouteActivity, @NotNull CreateRouteConfirmRouteFragment localFragment) {
                super(itemView);
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                Intrinsics.checkNotNullParameter(mapView, "mapView");
                Intrinsics.checkNotNullParameter(createRouteViewModel, "createRouteViewModel");
                Intrinsics.checkNotNullParameter(createRouteActivity, "createRouteActivity");
                Intrinsics.checkNotNullParameter(localFragment, "localFragment");
                this.mapView = mapView;
                this.createRouteViewModel = createRouteViewModel;
                this.createRouteActivity = createRouteActivity;
                this.localFragment = localFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void bind$lambda$3(CreateRouteViewModel.RouteData item, ImageView iconImageView) {
                Intrinsics.checkNotNullParameter(item, "$item");
                Intrinsics.checkNotNullParameter(iconImageView, "$iconImageView");
                Logger.d(CreateRouteConfirmRouteFragment.TAG, "iconImageView rotation distance:" + item.getLength() + ",rotation:" + item.getAngle());
                iconImageView.setRotation(item.getAngle());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void bind$lambda$6(RouteViewHolder this$0, ImageView iconImageView, CreateRouteViewModel.RouteData item, Function1 function1, View view) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(iconImageView, "$iconImageView");
                Intrinsics.checkNotNullParameter(item, "$item");
                int aiRouteSelected = this$0.createRouteViewModel.getAiRouteSelected();
                this$0.createRouteViewModel.setAiRouteSelected(this$0.getBindingAdapterPosition());
                RecyclerView.Adapter<? extends RecyclerView.d0> bindingAdapter = this$0.getBindingAdapter();
                if (bindingAdapter != null) {
                    bindingAdapter.notifyItemChanged(aiRouteSelected);
                }
                iconImageView.setSelected(true);
                this$0.drawRoute(item.getRouteList(), Float.valueOf(SpatialRelationUtil.A_CIRCLE_DEGREE - item.getAngle()));
                this$0.createRouteViewModel.setCurrentBitmap(this$0.createRouteActivity.buildBitmap(item.getRouteList()));
                if (function1 != null) {
                    function1.invoke2(item);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void drawRoute(List<CommonTrackData> routeList, Float angle) {
                List<CommonTrackData> list = routeList;
                if (list == null || list.isEmpty()) {
                    CreateRouteActivity.showHintText$default(this.createRouteActivity, ResourceExtKt.getString(c1j.G), 0, 2, null);
                } else {
                    this.createRouteActivity.drawRoute(routeList, angle);
                }
            }

            public final void bind(@NotNull final CreateRouteViewModel.RouteData item, @Nullable final Function1<? super CreateRouteViewModel.RouteData, Unit> routeLengthCallback) {
                Intrinsics.checkNotNullParameter(item, "item");
                View viewFindViewById = this.itemView.findViewById(xri.g5);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                final ImageView imageView = (ImageView) viewFindViewById;
                if (this.createRouteViewModel.getAiRouteSelected() == getBindingAdapterPosition()) {
                    imageView.setSelected(true);
                    if (routeLengthCallback != null) {
                        routeLengthCallback.invoke2(item);
                    }
                } else {
                    imageView.setSelected(false);
                }
                String iconUrl = item.getIconUrl();
                ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
                ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(iconUrl).target(imageView);
                builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(14)));
                builderTarget.listener(new ImageRequest.Listener() { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteConfirmRouteFragment$RouteAdapter$RouteViewHolder$bind$lambda$2$$inlined$listener$default$1
                    @Override // coil.request.ImageRequest.Listener
                    public void onCancel(@NotNull ImageRequest request) {
                    }

                    @Override // coil.request.ImageRequest.Listener
                    public void onError(@NotNull ImageRequest request, @NotNull ErrorResult result) {
                    }

                    @Override // coil.request.ImageRequest.Listener
                    public void onStart(@NotNull ImageRequest request) {
                    }

                    @Override // coil.request.ImageRequest.Listener
                    public void onSuccess(@NotNull ImageRequest request, @NotNull SuccessResult result) {
                        Map map = this.this$0.getLocalFragment().adapterRecorder;
                        Map map2 = null;
                        if (map == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapterRecorder");
                            map = null;
                        }
                        if (map.containsKey(Integer.valueOf(this.this$0.getBindingAdapterPosition()))) {
                            return;
                        }
                        if (this.this$0.getCreateRouteViewModel().getAiRouteSelected() == this.this$0.getBindingAdapterPosition()) {
                            this.this$0.drawRoute(item.getRouteList(), Float.valueOf(SpatialRelationUtil.A_CIRCLE_DEGREE - item.getAngle()));
                            this.this$0.getCreateRouteViewModel().setCurrentBitmap(this.this$0.getCreateRouteActivity().buildBitmap(item.getRouteList()));
                        }
                        Map map3 = this.this$0.getLocalFragment().adapterRecorder;
                        if (map3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapterRecorder");
                        } else {
                            map2 = map3;
                        }
                        map2.put(Integer.valueOf(this.this$0.getBindingAdapterPosition()), Boolean.TRUE);
                    }
                });
                imageLoader.enqueue(builderTarget.build());
                imageView.post(new Runnable() { // from class: e25
                    @Override // java.lang.Runnable
                    public final void run() {
                        CreateRouteConfirmRouteFragment.RouteAdapter.RouteViewHolder.bind$lambda$3(item, imageView);
                    }
                });
                TextView textView = (TextView) this.itemView.findViewById(xri.h5);
                String quantityString = textView.getContext().getResources().getQuantityString(zxi.common_share_unit_kilometer_desc, (int) item.getLength(), new DecimalFormat("#.##").format(item.getLength()));
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                textView.setText(quantityString);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: f25
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CreateRouteConfirmRouteFragment.RouteAdapter.RouteViewHolder.bind$lambda$6(this.f17324a, imageView, item, routeLengthCallback, view);
                    }
                });
            }

            @NotNull
            public final CreateRouteActivity getCreateRouteActivity() {
                return this.createRouteActivity;
            }

            @NotNull
            public final CreateRouteViewModel getCreateRouteViewModel() {
                return this.createRouteViewModel;
            }

            @NotNull
            public final CreateRouteConfirmRouteFragment getLocalFragment() {
                return this.localFragment;
            }

            @NotNull
            public final CreateRouteMap getMapView() {
                return this.mapView;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RouteAdapter(@NotNull CreateRouteMap mapView, @NotNull CreateRouteViewModel createRouteViewModel, @NotNull CreateRouteActivity createRouteActivity, @NotNull CreateRouteConfirmRouteFragment localFragment) {
            super(new DiffCallback());
            Intrinsics.checkNotNullParameter(mapView, "mapView");
            Intrinsics.checkNotNullParameter(createRouteViewModel, "createRouteViewModel");
            Intrinsics.checkNotNullParameter(createRouteActivity, "createRouteActivity");
            Intrinsics.checkNotNullParameter(localFragment, "localFragment");
            this.mapView = mapView;
            this.createRouteViewModel = createRouteViewModel;
            this.createRouteActivity = createRouteActivity;
            this.localFragment = localFragment;
        }

        @Nullable
        public final Function1<CreateRouteViewModel.RouteData, Unit> getRouteLengthCallback() {
            return this.routeLengthCallback;
        }

        public final void setRouteLengthCallback(@Nullable Function1<? super CreateRouteViewModel.RouteData, Unit> function1) {
            this.routeLengthCallback = function1;
        }

        public final void setSelectRouteLengthCallback(@NotNull Function1<? super CreateRouteViewModel.RouteData, Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.routeLengthCallback = callback;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RouteViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            CreateRouteViewModel.RouteData item = getItem(position);
            Intrinsics.checkNotNull(item);
            holder.bind(item, this.routeLengthCallback);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RouteViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(dvi.V, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new RouteViewHolder(viewInflate, this.mapView, this.createRouteViewModel, this.createRouteActivity, this.localFragment);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreateRouteConfirmRouteFragment() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void handleBackPressed() {
        CreateRouteActivity createRouteActivity = this.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.setBackPressedFragment(this, new Function0() { // from class: a25
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateRouteConfirmRouteFragment.handleBackPressed$lambda$1(this.f542a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleBackPressed$lambda$1(CreateRouteConfirmRouteFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RouteSceneType routeSceneType = this$0.sceneType;
        CreateRouteActivity createRouteActivity = null;
        if (routeSceneType == RouteSceneType.RouteSceneTypeAi) {
            CreateRouteActivity createRouteActivity2 = this$0.createRouteActivity;
            if (createRouteActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            } else {
                createRouteActivity = createRouteActivity2;
            }
            createRouteActivity.replaceBottomSheetFragment(new CreateRouteSelectTargetFragment());
        } else if (routeSceneType == RouteSceneType.RouteSceneTypeStyle) {
            CreateRouteActivity createRouteActivity3 = this$0.createRouteActivity;
            if (createRouteActivity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            } else {
                createRouteActivity = createRouteActivity3;
            }
            createRouteActivity.replaceBottomSheetFragment(new CreateRouteSelectStyleFragment());
        }
        return Unit.INSTANCE;
    }

    private final void initBehavior() {
        CreateRouteActivity createRouteActivity;
        CreateRouteActivity createRouteActivity2 = this.createRouteActivity;
        uln ulnVar = null;
        if (createRouteActivity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        } else {
            createRouteActivity = createRouteActivity2;
        }
        uln ulnVar2 = this.mBinding;
        if (ulnVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ulnVar = ulnVar2;
        }
        View root = ulnVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        CreateRouteActivity.setDefaultBehavior$default(createRouteActivity, root, ExtUtilsKt.getDp(88), true, false, 8, null);
    }

    private final void initButtonState() {
        uln ulnVar = this.mBinding;
        uln ulnVar2 = null;
        if (ulnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ulnVar = null;
        }
        ulnVar.C.setOnClickListener(new View.OnClickListener() { // from class: c25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteConfirmRouteFragment.initButtonState$lambda$5(this.f4851a, view);
            }
        });
        uln ulnVar3 = this.mBinding;
        if (ulnVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ulnVar2 = ulnVar3;
        }
        ulnVar2.B.setOnClickListener(new View.OnClickListener() { // from class: d25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteConfirmRouteFragment.initButtonState$lambda$6(this.f14984a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initButtonState$lambda$5(CreateRouteConfirmRouteFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteActivity createRouteActivity = this$0.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.getOnBackPressedDispatcher().d();
        CreateRouteViewModel createRouteViewModel = this$0.createRouteViewModel;
        if (createRouteViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel = null;
        }
        List<CreateRouteViewModel.RouteData> value = createRouteViewModel.getAiRouteDataFlow().getValue();
        if (value != null) {
            for (CreateRouteViewModel.RouteData routeData : value) {
                CreateRouteViewModel createRouteViewModel2 = this$0.createRouteViewModel;
                if (createRouteViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                    createRouteViewModel2 = null;
                }
                createRouteViewModel2.deleteFiles(routeData.getDownloadPath());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initButtonState$lambda$6(CreateRouteConfirmRouteFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NetUtil netUtil = NetUtil.INSTANCE;
        Context contextRequireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (netUtil.getNetWorkAvailable(contextRequireContext)) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new CreateRouteConfirmRouteFragment$initButtonState$2$1(this$0, null), 3, null);
            return;
        }
        CreateRouteActivity createRouteActivity = this$0.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        String string = this$0.getString(c1j.Z3);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        CreateRouteActivity.showHintText$default(createRouteActivity, string, 0, 2, null);
    }

    private final void initRouteIconView() {
        this.adapterRecorder = new LinkedHashMap();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        RecyclerView recyclerView = this.routeRecyclerView;
        RouteAdapter routeAdapter = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("routeRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        p9n p9nVar = this.createRouteActivityBinding;
        if (p9nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
            p9nVar = null;
        }
        CreateRouteMap mapView = p9nVar.M;
        Intrinsics.checkNotNullExpressionValue(mapView, "mapView");
        CreateRouteViewModel createRouteViewModel = this.createRouteViewModel;
        if (createRouteViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel = null;
        }
        CreateRouteActivity createRouteActivity = this.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        this.routeAdapter = new RouteAdapter(mapView, createRouteViewModel, createRouteActivity, this);
        RecyclerView recyclerView2 = this.routeRecyclerView;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("routeRecyclerView");
            recyclerView2 = null;
        }
        RouteAdapter routeAdapter2 = this.routeAdapter;
        if (routeAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("routeAdapter");
            routeAdapter2 = null;
        }
        recyclerView2.setAdapter(routeAdapter2);
        RouteAdapter routeAdapter3 = this.routeAdapter;
        if (routeAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("routeAdapter");
            routeAdapter3 = null;
        }
        routeAdapter3.setSelectRouteLengthCallback(new Function1() { // from class: b25
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CreateRouteConfirmRouteFragment.initRouteIconView$lambda$2(this.f3705a, (CreateRouteViewModel.RouteData) obj);
            }
        });
        CreateRouteViewModel createRouteViewModel2 = this.createRouteViewModel;
        if (createRouteViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel2 = null;
        }
        List<CreateRouteViewModel.RouteData> value = createRouteViewModel2.getAiRouteDataFlow().getValue();
        if (value != null && value.size() == 0) {
            CreateRouteActivity createRouteActivity2 = this.createRouteActivity;
            if (createRouteActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                createRouteActivity2 = null;
            }
            createRouteActivity2.replaceBottomSheetFragment(new CreateRouteEmptyRouteFragment(this.sceneType));
        }
        CreateRouteViewModel createRouteViewModel3 = this.createRouteViewModel;
        if (createRouteViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel3 = null;
        }
        createRouteViewModel3.setAiRouteSelected(0);
        if (value != null) {
            gridLayoutManager.C(4);
            RouteAdapter routeAdapter4 = this.routeAdapter;
            if (routeAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("routeAdapter");
            } else {
                routeAdapter = routeAdapter4;
            }
            routeAdapter.submitList(value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initRouteIconView$lambda$2(CreateRouteConfirmRouteFragment this$0, CreateRouteViewModel.RouteData routeData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(routeData, "routeData");
        Logger.i(TAG, "current select route length:" + routeData.getLength() + ",startPoint:" + routeData.getStartPoint() + ",routeStyle:" + routeData.getRouteStyle());
        this$0.routeData = routeData;
        return Unit.INSTANCE;
    }

    private final void initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        uln ulnVarA0 = uln.A0(inflater, container, false);
        this.mBinding = ulnVarA0;
        p9n p9nVar = null;
        if (ulnVarA0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ulnVarA0 = null;
        }
        this.midContentView = ulnVarA0.H;
        uln ulnVar = this.mBinding;
        if (ulnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ulnVar = null;
        }
        this.contentLayout = ulnVar.G;
        uln ulnVar2 = this.mBinding;
        if (ulnVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ulnVar2 = null;
        }
        this.routeRecyclerView = ulnVar2.H;
        if (getActivity() instanceof CreateRouteActivity) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.xiaomi.fitness.sport.view.route.CreateRouteActivity");
            CreateRouteActivity createRouteActivity = (CreateRouteActivity) activity;
            this.createRouteActivity = createRouteActivity;
            if (createRouteActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                createRouteActivity = null;
            }
            this.createRouteActivityBinding = createRouteActivity.getCreateRouteActivityBinding();
            CreateRouteActivity createRouteActivity2 = this.createRouteActivity;
            if (createRouteActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                createRouteActivity2 = null;
            }
            this.createRouteViewModel = createRouteActivity2.getCreateRouteViewModel();
            p9n p9nVar2 = this.createRouteActivityBinding;
            if (p9nVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
                p9nVar2 = null;
            }
            p9nVar2.K.setVisibility(8);
            if (this.sceneType == RouteSceneType.RouteSceneTypeStyle) {
                p9n p9nVar3 = this.createRouteActivityBinding;
                if (p9nVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
                    p9nVar3 = null;
                }
                View root = p9nVar3.R.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                ViewExtKt.gone(root);
                p9n p9nVar4 = this.createRouteActivityBinding;
                if (p9nVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
                    p9nVar4 = null;
                }
                LinearLayout titleLayout = p9nVar4.T;
                Intrinsics.checkNotNullExpressionValue(titleLayout, "titleLayout");
                ViewExtKt.visible(titleLayout);
                p9n p9nVar5 = this.createRouteActivityBinding;
                if (p9nVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
                    p9nVar5 = null;
                }
                FilterSortView filterSortView = p9nVar5.G;
                CreateRouteActivity createRouteActivity3 = this.createRouteActivity;
                if (createRouteActivity3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                    createRouteActivity3 = null;
                }
                filterSortView.setFilteredTab(createRouteActivity3.getTabViewMap().get(0));
                CreateRouteActivity createRouteActivity4 = this.createRouteActivity;
                if (createRouteActivity4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                    createRouteActivity4 = null;
                }
                createRouteActivity4.setStyleFragmentIndex(0);
            }
            if (this.sceneType == RouteSceneType.RouteSceneTypeAi) {
                p9n p9nVar6 = this.createRouteActivityBinding;
                if (p9nVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
                    p9nVar6 = null;
                }
                LinearLayout titleLayout2 = p9nVar6.T;
                Intrinsics.checkNotNullExpressionValue(titleLayout2, "titleLayout");
                ViewExtKt.gone(titleLayout2);
                p9n p9nVar7 = this.createRouteActivityBinding;
                if (p9nVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
                } else {
                    p9nVar = p9nVar7;
                }
                View root2 = p9nVar.R.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
                ViewExtKt.visible(root2);
            }
        }
        handleBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$0(CreateRouteConfirmRouteFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.initRouteIconView();
    }

    @Nullable
    public final CreateRouteViewModel.RouteData getRouteData() {
        return this.routeData;
    }

    @NotNull
    public final RouteSceneType getSceneType() {
        return this.sceneType;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        initView(inflater, container, savedInstanceState);
        initButtonState();
        initBehavior();
        CreateRouteActivity createRouteActivity = this.createRouteActivity;
        uln ulnVar = null;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.getBottomSheetContentView().post(new Runnable() { // from class: z15
            @Override // java.lang.Runnable
            public final void run() {
                CreateRouteConfirmRouteFragment.onCreateView$lambda$0(this.f40771a);
            }
        });
        uln ulnVar2 = this.mBinding;
        if (ulnVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ulnVar = ulnVar2;
        }
        View root = ulnVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public final void setRouteData(@Nullable CreateRouteViewModel.RouteData routeData) {
        this.routeData = routeData;
    }

    public /* synthetic */ CreateRouteConfirmRouteFragment(RouteSceneType routeSceneType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? RouteSceneType.RouteSceneTypeAi : routeSceneType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateRouteConfirmRouteFragment(@NotNull RouteSceneType sceneType) {
        super(dvi.b0);
        Intrinsics.checkNotNullParameter(sceneType, "sceneType");
        this.sceneType = sceneType;
    }
}
