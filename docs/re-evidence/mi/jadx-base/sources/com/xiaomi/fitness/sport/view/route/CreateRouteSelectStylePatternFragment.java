package com.xiaomi.fitness.sport.view.route;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.mi.health.sport.CreateRouteMap;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.sport.route.detail.model.StyleDetail;
import com.xiaomi.fitness.sport.view.route.CreateRouteSelectStylePatternFragment;
import com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel;
import defpackage.dvi;
import defpackage.gmn;
import defpackage.p9n;
import defpackage.xri;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 )2\u00020\u0001:\u0002)*B\u0007¢\u0006\u0004\b(\u0010\fJ+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\fJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteSelectStylePatternFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V", "handleBackPressed", "()V", "initRouteIconView", "initBehavior", "initButtonState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lgmn;", "mBinding", "Lgmn;", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "createRouteActivity", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "Lp9n;", "createRouteActivityBinding", "Lp9n;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "createRouteViewModel", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "midContentView", "Landroid/view/View;", "contentLayout", "Landroidx/recyclerview/widget/RecyclerView;", "routeRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteSelectStylePatternFragment$RouteAdapter;", "routeAdapter", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteSelectStylePatternFragment$RouteAdapter;", "<init>", "Companion", "RouteAdapter", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CreateRouteSelectStylePatternFragment extends Fragment {

    @NotNull
    public static final String TAG = "CreateRouteSelectStylePatternFragment";
    private View contentLayout;
    private CreateRouteActivity createRouteActivity;
    private p9n createRouteActivityBinding;
    private CreateRouteViewModel createRouteViewModel;
    private gmn mBinding;
    private View midContentView;
    private RouteAdapter routeAdapter;
    private RecyclerView routeRecyclerView;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0017\u0018B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteSelectStylePatternFragment$RouteAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fitness/sport/route/detail/model/StyleDetail;", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteSelectStylePatternFragment$RouteAdapter$RouteViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/sport/view/route/CreateRouteSelectStylePatternFragment$RouteAdapter$RouteViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lcom/xiaomi/fitness/sport/view/route/CreateRouteSelectStylePatternFragment$RouteAdapter$RouteViewHolder;I)V", "Lcom/mi/health/sport/CreateRouteMap;", "mapView", "Lcom/mi/health/sport/CreateRouteMap;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "createRouteViewModel", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "<init>", "(Lcom/mi/health/sport/CreateRouteMap;Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;)V", "RouteViewHolder", "DiffCallback", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class RouteAdapter extends p<StyleDetail, RouteViewHolder> {

        @NotNull
        private final CreateRouteViewModel createRouteViewModel;

        @NotNull
        private final CreateRouteMap mapView;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteSelectStylePatternFragment$RouteAdapter$DiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lcom/xiaomi/fitness/sport/route/detail/model/StyleDetail;", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/xiaomi/fitness/sport/route/detail/model/StyleDetail;Lcom/xiaomi/fitness/sport/route/detail/model/StyleDetail;)Z", "areContentsTheSame", "<init>", "()V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        public static final class DiffCallback extends androidx.recyclerview.widget.h.f<StyleDetail> {
            @Override // androidx.recyclerview.widget.h.f
            public boolean areContentsTheSame(@NotNull StyleDetail oldItem, @NotNull StyleDetail newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.areEqual(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.h.f
            public boolean areItemsTheSame(@NotNull StyleDetail oldItem, @NotNull StyleDetail newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b%\u0010&J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteSelectStylePatternFragment$RouteAdapter$RouteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/sport/route/detail/model/StyleDetail;", "createRouteCustomStyle", "", "bind", "(Lcom/xiaomi/fitness/sport/route/detail/model/StyleDetail;)V", "Lcom/mi/health/sport/CreateRouteMap;", "mapView", "Lcom/mi/health/sport/CreateRouteMap;", "getMapView", "()Lcom/mi/health/sport/CreateRouteMap;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "createRouteViewModel", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "getCreateRouteViewModel", "()Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "Landroid/widget/ImageView;", "iconImageView", "Landroid/widget/ImageView;", "", "url", "Ljava/lang/String;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$ModuleStatus$Pattern;", "selectedStyle", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$ModuleStatus$Pattern;", "getSelectedStyle", "()Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$ModuleStatus$Pattern;", "", "currPosId", "I", "getCurrPosId", "()I", "setCurrPosId", "(I)V", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;Lcom/mi/health/sport/CreateRouteMap;Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        @SourceDebugExtension({"SMAP\nCreateRouteSelectStylePatternFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRouteSelectStylePatternFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteSelectStylePatternFragment$RouteAdapter$RouteViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,232:1\n54#2,3:233\n24#2:236\n59#2,6:237\n360#3,7:243\n*S KotlinDebug\n*F\n+ 1 CreateRouteSelectStylePatternFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteSelectStylePatternFragment$RouteAdapter$RouteViewHolder\n*L\n196#1:233,3\n196#1:236\n196#1:237,6\n204#1:243,7\n*E\n"})
        public static final class RouteViewHolder extends RecyclerView.d0 {

            @NotNull
            private final CreateRouteViewModel createRouteViewModel;
            private int currPosId;

            @NotNull
            private final ImageView iconImageView;

            @NotNull
            private final CreateRouteMap mapView;

            @NotNull
            private final CreateRouteViewModel.ModuleStatus.Pattern selectedStyle;

            @NotNull
            private String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RouteViewHolder(@NotNull View itemView, @NotNull CreateRouteMap mapView, @NotNull CreateRouteViewModel createRouteViewModel) {
                super(itemView);
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                Intrinsics.checkNotNullParameter(mapView, "mapView");
                Intrinsics.checkNotNullParameter(createRouteViewModel, "createRouteViewModel");
                this.mapView = mapView;
                this.createRouteViewModel = createRouteViewModel;
                View viewFindViewById = itemView.findViewById(xri.g5);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                this.iconImageView = (ImageView) viewFindViewById;
                this.url = "";
                CreateRouteViewModel.ModuleStatus moduleSelected = createRouteViewModel.getModuleSelected();
                Intrinsics.checkNotNull(moduleSelected, "null cannot be cast to non-null type com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel.ModuleStatus.Pattern");
                this.selectedStyle = (CreateRouteViewModel.ModuleStatus.Pattern) moduleSelected;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void bind$lambda$2(RouteViewHolder this$0, View view) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int patternId = this$0.selectedStyle.getPatternId();
                this$0.selectedStyle.setPatternId(this$0.currPosId);
                Iterator<StyleDetail> it = this$0.createRouteViewModel.getPatternList().iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (it.next().getId() == patternId) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    RecyclerView.Adapter<? extends RecyclerView.d0> bindingAdapter = this$0.getBindingAdapter();
                    if (bindingAdapter != null) {
                        bindingAdapter.notifyItemChanged(i);
                    }
                } else {
                    RecyclerView.Adapter<? extends RecyclerView.d0> bindingAdapter2 = this$0.getBindingAdapter();
                    if (bindingAdapter2 != null) {
                        bindingAdapter2.notifyDataSetChanged();
                    }
                }
                this$0.iconImageView.setSelected(true);
            }

            public final void bind(@NotNull StyleDetail createRouteCustomStyle) {
                Intrinsics.checkNotNullParameter(createRouteCustomStyle, "createRouteCustomStyle");
                this.currPosId = createRouteCustomStyle.getId();
                if (this.selectedStyle.getPatternId() == this.currPosId) {
                    this.iconImageView.setSelected(true);
                } else {
                    this.iconImageView.setSelected(false);
                }
                if (!Intrinsics.areEqual(this.url, createRouteCustomStyle.getIcon())) {
                    String strValueOf = String.valueOf(createRouteCustomStyle.getIcon());
                    this.url = strValueOf;
                    ImageView imageView = this.iconImageView;
                    ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
                    ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(strValueOf).target(imageView);
                    builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(14)));
                    imageLoader.enqueue(builderTarget.build());
                }
                this.iconImageView.setOnClickListener(new View.OnClickListener() { // from class: x35
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CreateRouteSelectStylePatternFragment.RouteAdapter.RouteViewHolder.bind$lambda$2(this.f38634a, view);
                    }
                });
            }

            @NotNull
            public final CreateRouteViewModel getCreateRouteViewModel() {
                return this.createRouteViewModel;
            }

            public final int getCurrPosId() {
                return this.currPosId;
            }

            @NotNull
            public final CreateRouteMap getMapView() {
                return this.mapView;
            }

            @NotNull
            public final CreateRouteViewModel.ModuleStatus.Pattern getSelectedStyle() {
                return this.selectedStyle;
            }

            public final void setCurrPosId(int i) {
                this.currPosId = i;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RouteAdapter(@NotNull CreateRouteMap mapView, @NotNull CreateRouteViewModel createRouteViewModel) {
            super(new DiffCallback());
            Intrinsics.checkNotNullParameter(mapView, "mapView");
            Intrinsics.checkNotNullParameter(createRouteViewModel, "createRouteViewModel");
            this.mapView = mapView;
            this.createRouteViewModel = createRouteViewModel;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RouteViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            StyleDetail item = getItem(position);
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            holder.bind(item);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RouteViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(dvi.X, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new RouteViewHolder(viewInflate, this.mapView, this.createRouteViewModel);
        }
    }

    public CreateRouteSelectStylePatternFragment() {
        super(dvi.h0);
    }

    private final void handleBackPressed() {
        CreateRouteActivity createRouteActivity = this.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.setBackPressedFragment(this, new Function0() { // from class: u35
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateRouteSelectStylePatternFragment.handleBackPressed$lambda$0(this.f35330a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleBackPressed$lambda$0(CreateRouteSelectStylePatternFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteActivity createRouteActivity = this$0.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.replaceBottomSheetFragment(new CreateRouteSelectStyleFragment());
        return Unit.INSTANCE;
    }

    private final void initBehavior() {
        CreateRouteActivity createRouteActivity;
        CreateRouteActivity createRouteActivity2 = this.createRouteActivity;
        gmn gmnVar = null;
        if (createRouteActivity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        } else {
            createRouteActivity = createRouteActivity2;
        }
        gmn gmnVar2 = this.mBinding;
        if (gmnVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            gmnVar = gmnVar2;
        }
        View root = gmnVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        CreateRouteActivity.setDefaultBehavior$default(createRouteActivity, root, ExtUtilsKt.getDp(90), true, false, 8, null);
    }

    private final void initButtonState() {
        gmn gmnVar = this.mBinding;
        gmn gmnVar2 = null;
        if (gmnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            gmnVar = null;
        }
        gmnVar.C.setOnClickListener(new View.OnClickListener() { // from class: v35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteSelectStylePatternFragment.initButtonState$lambda$1(this.f36429a, view);
            }
        });
        gmn gmnVar3 = this.mBinding;
        if (gmnVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            gmnVar2 = gmnVar3;
        }
        gmnVar2.B.setOnClickListener(new View.OnClickListener() { // from class: w35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteSelectStylePatternFragment.initButtonState$lambda$2(this.f37507a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initButtonState$lambda$1(CreateRouteSelectStylePatternFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteActivity createRouteActivity = this$0.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.replaceBottomSheetFragment(new CreateRouteSelectStyleFragment());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initButtonState$lambda$2(CreateRouteSelectStylePatternFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new CreateRouteSelectStylePatternFragment$initButtonState$2$1(this$0, null), 3, null);
    }

    private final void initRouteIconView() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        RecyclerView recyclerView = this.routeRecyclerView;
        CreateRouteViewModel createRouteViewModel = null;
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
        CreateRouteViewModel createRouteViewModel2 = this.createRouteViewModel;
        if (createRouteViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel2 = null;
        }
        this.routeAdapter = new RouteAdapter(mapView, createRouteViewModel2);
        RecyclerView recyclerView2 = this.routeRecyclerView;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("routeRecyclerView");
            recyclerView2 = null;
        }
        RouteAdapter routeAdapter = this.routeAdapter;
        if (routeAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("routeAdapter");
            routeAdapter = null;
        }
        recyclerView2.setAdapter(routeAdapter);
        CreateRouteViewModel createRouteViewModel3 = this.createRouteViewModel;
        if (createRouteViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel3 = null;
        }
        CreateRouteViewModel.ModuleStatus moduleSelected = createRouteViewModel3.getModuleSelected();
        Intrinsics.checkNotNull(moduleSelected, "null cannot be cast to non-null type com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel.ModuleStatus.Pattern");
        CreateRouteViewModel.ModuleStatus.Pattern pattern = (CreateRouteViewModel.ModuleStatus.Pattern) moduleSelected;
        CreateRouteViewModel createRouteViewModel4 = this.createRouteViewModel;
        if (createRouteViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel4 = null;
        }
        pattern.setPatternId(createRouteViewModel4.getPatternList().get(0).getId());
        CreateRouteViewModel createRouteViewModel5 = this.createRouteViewModel;
        if (createRouteViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel5 = null;
        }
        gridLayoutManager.C(RangesKt___RangesKt.coerceAtMost(createRouteViewModel5.getPatternList().size(), 4));
        RouteAdapter routeAdapter2 = this.routeAdapter;
        if (routeAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("routeAdapter");
            routeAdapter2 = null;
        }
        CreateRouteViewModel createRouteViewModel6 = this.createRouteViewModel;
        if (createRouteViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
        } else {
            createRouteViewModel = createRouteViewModel6;
        }
        routeAdapter2.submitList(createRouteViewModel.getPatternList());
    }

    private final void initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        gmn gmnVarA0 = gmn.A0(inflater, container, false);
        this.mBinding = gmnVarA0;
        p9n p9nVar = null;
        if (gmnVarA0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            gmnVarA0 = null;
        }
        this.midContentView = gmnVarA0.I;
        gmn gmnVar = this.mBinding;
        if (gmnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            gmnVar = null;
        }
        this.contentLayout = gmnVar.H;
        gmn gmnVar2 = this.mBinding;
        if (gmnVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            gmnVar2 = null;
        }
        this.routeRecyclerView = gmnVar2.I;
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
            } else {
                p9nVar = p9nVar2;
            }
            p9nVar.K.setVisibility(8);
        }
        initRouteIconView();
        handleBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        initView(inflater, container, savedInstanceState);
        initButtonState();
        initBehavior();
        gmn gmnVar = this.mBinding;
        if (gmnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            gmnVar = null;
        }
        View root = gmnVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
