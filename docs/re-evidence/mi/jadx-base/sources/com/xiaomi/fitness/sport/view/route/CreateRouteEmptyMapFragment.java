package com.xiaomi.fitness.sport.view.route;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import coil.size.Scale;
import com.amap.api.maps.AMap;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.Projection;
import com.amap.api.maps.model.LatLng;
import com.google.gson.Gson;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.route.detail.model.AddressInfo;
import com.xiaomi.fitness.sport.route.detail.model.EmptyMapData;
import com.xiaomi.fitness.sport.utils.ExtensionsKt;
import com.xiaomi.fitness.sport.view.route.CreateRouteEmptyMapFragment;
import com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel;
import defpackage.bxa;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.p9n;
import defpackage.xr5;
import defpackage.xri;
import defpackage.yln;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import miuix.miuixbasewidget.widget.FilterSortView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001JB\u0007¢\u0006\u0004\bI\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\nR\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00104\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010A\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00105\u001a\u0004\bB\u00107\"\u0004\bC\u00109R\u001a\u0010E\u001a\u00020D8\u0006X\u0086D¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteEmptyMapFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "", "initView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V", "handleBackPressed", "()V", "initBehavior", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/xiaomi/fitness/sport/route/detail/model/EmptyMapData;", "data", "convertGps", "(Lcom/xiaomi/fitness/sport/route/detail/model/EmptyMapData;)V", LifecycleConstantKt.ON_RESUME, "Lyln;", "mBinding", "Lyln;", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "createRouteActivity", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "Lp9n;", "createRouteActivityBinding", "Lp9n;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "createRouteViewModel", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "Ljava/lang/reflect/Type;", "typeToken", "Ljava/lang/reflect/Type;", "getTypeToken", "()Ljava/lang/reflect/Type;", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "Lcom/amap/api/maps/Projection;", "projection", "Lcom/amap/api/maps/Projection;", "getProjection", "()Lcom/amap/api/maps/Projection;", "setProjection", "(Lcom/amap/api/maps/Projection;)V", "", "routeIndex", "I", "getRouteIndex", "()I", "setRouteIndex", "(I)V", "", "smallWindow", "Z", "getSmallWindow", "()Z", "setSmallWindow", "(Z)V", "rawWidth", "getRawWidth", "setRawWidth", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "<init>", "ItemAdapter", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CreateRouteEmptyMapFragment extends Fragment {

    @NotNull
    private final String TAG;
    private CreateRouteActivity createRouteActivity;
    private p9n createRouteActivityBinding;
    private CreateRouteViewModel createRouteViewModel;

    @NotNull
    private final Gson gson;
    private yln mBinding;

    @Nullable
    private Projection projection;
    private int rawWidth;
    private int routeIndex;
    private boolean smallWindow;

    @NotNull
    private final Type typeToken;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\"B3\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u0007H\u0016J\u001c\u0010\u001f\u001a\u00020\n2\n\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\u0007H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteEmptyMapFragment$ItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteEmptyMapFragment$ItemAdapter$ItemHolder;", "data", "", "Lcom/xiaomi/fitness/sport/route/detail/model/EmptyMapData;", "selectIndex", "", "onClick", "Lkotlin/Function1;", "", "<init>", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "setOnClick", "(Lkotlin/jvm/functions/Function1;)V", "selectPosition", "getSelectPosition", "()I", "setSelectPosition", "(I)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "ItemHolder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCreateRouteEmptyMapFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRouteEmptyMapFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteEmptyMapFragment$ItemAdapter\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,346:1\n54#2,3:347\n24#2:350\n57#2,6:351\n63#2,2:358\n57#3:357\n*S KotlinDebug\n*F\n+ 1 CreateRouteEmptyMapFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteEmptyMapFragment$ItemAdapter\n*L\n321#1:347,3\n321#1:350\n321#1:351,6\n321#1:358,2\n321#1:357\n*E\n"})
    public static final class ItemAdapter extends RecyclerView.Adapter<ItemHolder> {

        @NotNull
        private List<EmptyMapData> data;

        @NotNull
        private Function1<? super Integer, Unit> onClick;
        private int selectPosition;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteEmptyMapFragment$ItemAdapter$ItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/sport/view/route/CreateRouteEmptyMapFragment$ItemAdapter;Landroid/view/View;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        public final class ItemHolder extends RecyclerView.d0 {

            @NotNull
            private final ImageView icon;
            final /* synthetic */ ItemAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ItemHolder(@NotNull ItemAdapter itemAdapter, View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "view");
                this.this$0 = itemAdapter;
                View viewFindViewById = view.findViewById(xri.g5);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                this.icon = (ImageView) viewFindViewById;
            }

            @NotNull
            public final ImageView getIcon() {
                return this.icon;
            }
        }

        public /* synthetic */ ItemAdapter(List list, int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i2 & 2) != 0 ? 0 : i, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onBindViewHolder$lambda$0(ItemAdapter this$0, int i, ItemHolder holder, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(holder, "$holder");
            this$0.notifyItemChanged(this$0.selectPosition);
            this$0.selectPosition = i;
            holder.getIcon().setSelected(true);
            this$0.onClick.invoke2(Integer.valueOf(i));
        }

        @NotNull
        public final List<EmptyMapData> getData() {
            return this.data;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            return this.data.size();
        }

        @NotNull
        public final Function1<Integer, Unit> getOnClick() {
            return this.onClick;
        }

        public final int getSelectPosition() {
            return this.selectPosition;
        }

        public final void setData(@NotNull List<EmptyMapData> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.data = list;
        }

        public final void setOnClick(@NotNull Function1<? super Integer, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            this.onClick = function1;
        }

        public final void setSelectPosition(int i) {
            this.selectPosition = i;
        }

        public ItemAdapter(@NotNull List<EmptyMapData> data, int i, @NotNull Function1<? super Integer, Unit> onClick) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.data = data;
            this.onClick = onClick;
            this.selectPosition = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull final ItemHolder holder, final int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            EmptyMapData emptyMapData = this.data.get(position);
            ImageView icon = holder.getIcon();
            Coil.imageLoader(icon.getContext()).enqueue(new ImageRequest.Builder(icon.getContext()).data(emptyMapData.getIcon()).target(icon).build());
            if (position == this.selectPosition) {
                holder.getIcon().setSelected(true);
            } else {
                holder.getIcon().setSelected(false);
            }
            holder.getIcon().setOnClickListener(new View.OnClickListener() { // from class: b35
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CreateRouteEmptyMapFragment.ItemAdapter.onBindViewHolder$lambda$0(this.f3739a, position, holder, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public ItemHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(dvi.W, parent, false);
            float screenWidth = DisplayUtil.getScreenWidth() - ExtensionsKt.getDp(26);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            float f = screenWidth / 4;
            layoutParams.width = (int) (f - ExtensionsKt.getDp(8));
            layoutParams.height = (int) (f - ExtensionsKt.getDp(8));
            viewInflate.setLayoutParams(layoutParams);
            Intrinsics.checkNotNull(viewInflate);
            return new ItemHolder(this, viewInflate);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteEmptyMapFragment$convertGps$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteEmptyMapFragment$convertGps$1", f = "CreateRouteEmptyMapFragment.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EmptyMapData $data;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteEmptyMapFragment$convertGps$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteEmptyMapFragment$convertGps$1$1", f = "CreateRouteEmptyMapFragment.kt", i = {0}, l = {216}, m = "invokeSuspend", n = {"trackData"}, s = {"L$0"})
        @SourceDebugExtension({"SMAP\nCreateRouteEmptyMapFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRouteEmptyMapFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteEmptyMapFragment$convertGps$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,346:1\n13402#2:347\n13467#2,3:348\n13403#2:351\n*S KotlinDebug\n*F\n+ 1 CreateRouteEmptyMapFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteEmptyMapFragment$convertGps$1$1\n*L\n185#1:347\n186#1:348,3\n185#1:351\n*E\n"})
        public static final class C07561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ EmptyMapData $data;
            final /* synthetic */ Ref.FloatRef $dis;
            final /* synthetic */ Ref.ObjectRef<CommonTrackData> $preTrack;
            final /* synthetic */ int $x;
            final /* synthetic */ int $y;
            Object L$0;
            int label;
            final /* synthetic */ CreateRouteEmptyMapFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07561(CreateRouteEmptyMapFragment createRouteEmptyMapFragment, EmptyMapData emptyMapData, Ref.FloatRef floatRef, int i, int i2, Ref.ObjectRef<CommonTrackData> objectRef, Continuation<? super C07561> continuation) {
                super(2, continuation);
                this.this$0 = createRouteEmptyMapFragment;
                this.$data = emptyMapData;
                this.$dis = floatRef;
                this.$y = i;
                this.$x = i2;
                this.$preTrack = objectRef;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$2(CreateRouteEmptyMapFragment createRouteEmptyMapFragment, EmptyMapData emptyMapData, String str, float f, Bitmap bitmap, List list, AddressInfo addressInfo) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(createRouteEmptyMapFragment), Dispatchers.getIO(), null, new CreateRouteEmptyMapFragment$convertGps$1$1$2$1(createRouteEmptyMapFragment, emptyMapData, str, addressInfo, f, bitmap, list, null), 2, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07561(this.this$0, this.$data, this.$dis, this.$y, this.$x, this.$preTrack, continuation);
            }

            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v7 */
            /* JADX WARN: Type inference failed for: r1v8, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r3v12, types: [T, com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData, java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                C07561 c07561;
                Object objWithContext;
                List list;
                ?? r1;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                int i2 = 0;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Object objFromJson = this.this$0.getGson().fromJson(this.$data.getPixelData(), this.this$0.getTypeToken());
                    Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                    Integer[][][] numArr = (Integer[][][]) objFromJson;
                    ArrayList arrayList = new ArrayList();
                    int i3 = this.$y;
                    CreateRouteEmptyMapFragment createRouteEmptyMapFragment = this.this$0;
                    int i4 = this.$x;
                    Ref.ObjectRef<CommonTrackData> objectRef = this.$preTrack;
                    Ref.FloatRef floatRef = this.$dis;
                    int length = numArr.length;
                    int i5 = 0;
                    while (i5 < length) {
                        Integer[][] numArr2 = numArr[i5];
                        int length2 = numArr2.length;
                        int i6 = i2;
                        int i7 = i6;
                        while (i7 < length2) {
                            Integer[] numArr3 = numArr2[i7];
                            int i8 = i6 + 1;
                            int iIntValue = numArr3[i2].intValue();
                            int iIntValue2 = numArr3[1].intValue();
                            if (createRouteEmptyMapFragment.getSmallWindow()) {
                                iIntValue /= 2;
                            }
                            Integer[][][] numArr4 = numArr;
                            Integer numBoxInt = Boxing.boxInt(i3 + iIntValue);
                            if (createRouteEmptyMapFragment.getSmallWindow()) {
                                iIntValue2 /= 2;
                            }
                            int i9 = i3;
                            Pair pair = new Pair(numBoxInt, Boxing.boxInt(i4 + iIntValue2));
                            Point point = new Point(((Number) pair.getSecond()).intValue(), ((Number) pair.getFirst()).intValue());
                            Projection projection = createRouteEmptyMapFragment.getProjection();
                            LatLng latLngFromScreenLocation = projection != null ? projection.fromScreenLocation(point) : null;
                            Intrinsics.checkNotNull(latLngFromScreenLocation);
                            CreateRouteEmptyMapFragment createRouteEmptyMapFragment2 = createRouteEmptyMapFragment;
                            double[] dArrB = bxa.b(latLngFromScreenLocation.latitude, latLngFromScreenLocation.longitude);
                            ?? commonTrackData = new CommonTrackData(dArrB[0], dArrB[1], 0.0d, null, false, 12, null);
                            if (objectRef.element != null) {
                                CommonTrackData commonTrackData2 = objectRef.element;
                                Intrinsics.checkNotNull(commonTrackData2);
                                double latitude = commonTrackData2.getLatitude();
                                CommonTrackData commonTrackData3 = objectRef.element;
                                Intrinsics.checkNotNull(commonTrackData3);
                                r1 = 1;
                                floatRef.element += AMapUtils.calculateLineDistance(new LatLng(dArrB[0], dArrB[1]), new LatLng(latitude, commonTrackData3.getLongitude()));
                            } else {
                                r1 = 1;
                            }
                            objectRef.element = commonTrackData;
                            if (i6 == numArr2.length - r1) {
                                commonTrackData.setFlagSegment(r1);
                            }
                            arrayList.add(commonTrackData);
                            i7++;
                            i2 = 0;
                            createRouteEmptyMapFragment = createRouteEmptyMapFragment2;
                            i6 = i8;
                            i3 = i9;
                            numArr = numArr4;
                            i4 = i4;
                            length = length;
                            coroutine_suspended = coroutine_suspended;
                            i5 = i5;
                        }
                        i5++;
                        i2 = 0;
                    }
                    Object obj2 = coroutine_suspended;
                    ((CommonTrackData) CollectionsKt___CollectionsKt.last((List) arrayList)).setFlagSegment(false);
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    c07561 = this;
                    CreateRouteEmptyMapFragment$convertGps$1$1$bitmap$1 createRouteEmptyMapFragment$convertGps$1$1$bitmap$1 = new CreateRouteEmptyMapFragment$convertGps$1$1$bitmap$1(c07561.this$0, arrayList, null);
                    c07561.L$0 = arrayList;
                    c07561.label = 1;
                    objWithContext = BuildersKt.withContext(main, createRouteEmptyMapFragment$convertGps$1$1$bitmap$1, c07561);
                    if (objWithContext == obj2) {
                        return obj2;
                    }
                    list = arrayList;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    c07561 = this;
                    objWithContext = obj;
                }
                final Bitmap bitmap = (Bitmap) objWithContext;
                final String strConvertTrackToFile$default = ParserHelper.convertTrackToFile$default(ParserHelper.INSTANCE, ParserHelper.GPX, c07561.$data.getName(), list, null, 8, null);
                final float fE = xr5.e(2, c07561.$dis.element);
                double[] dArrC = bxa.c(((CommonTrackData) CollectionsKt___CollectionsKt.first(list)).getLatitude(), ((CommonTrackData) CollectionsKt___CollectionsKt.first(list)).getLongitude());
                GeoUtils geoUtils = GeoUtils.INSTANCE;
                FragmentActivity fragmentActivityRequireActivity = c07561.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                double d = dArrC[0];
                double d2 = dArrC[1];
                final CreateRouteEmptyMapFragment createRouteEmptyMapFragment3 = c07561.this$0;
                final EmptyMapData emptyMapData = c07561.$data;
                final List list2 = list;
                geoUtils.getAddressByAmap(fragmentActivityRequireActivity, d, d2, new Function1() { // from class: com.xiaomi.fitness.sport.view.route.e
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj3) {
                        return CreateRouteEmptyMapFragment.AnonymousClass1.C07561.invokeSuspend$lambda$2(createRouteEmptyMapFragment3, emptyMapData, strConvertTrackToFile$default, fE, bitmap, list2, (AddressInfo) obj3);
                    }
                });
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(EmptyMapData emptyMapData, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$data = emptyMapData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteEmptyMapFragment.this.new AnonymousClass1(this.$data, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int[] iArr = new int[2];
                p9n p9nVar = CreateRouteEmptyMapFragment.this.createRouteActivityBinding;
                CreateRouteActivity createRouteActivity = null;
                if (p9nVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
                    p9nVar = null;
                }
                p9nVar.O.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                p9n p9nVar2 = CreateRouteEmptyMapFragment.this.createRouteActivityBinding;
                if (p9nVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
                    p9nVar2 = null;
                }
                p9nVar2.M.getLocationOnScreen(iArr2);
                FitnessLogUtils.i(CreateRouteEmptyMapFragment.this.getTAG(), "view position image x:" + iArr[0] + ",y:" + iArr[1] + ",map x:" + iArr2[0] + ",y:" + iArr2[1] + "}");
                int iAbs = iArr[0] + Math.abs(iArr2[0]);
                int i2 = iArr[1] - iArr2[1];
                Ref.FloatRef floatRef = new Ref.FloatRef();
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                CreateRouteActivity createRouteActivity2 = CreateRouteEmptyMapFragment.this.createRouteActivity;
                if (createRouteActivity2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                } else {
                    createRouteActivity = createRouteActivity2;
                }
                createRouteActivity.showLoading(c1j.F0, false);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C07561 c07561 = new C07561(CreateRouteEmptyMapFragment.this, this.$data, floatRef, i2, iAbs, objectRef, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c07561, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteEmptyMapFragment$initView$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteEmptyMapFragment$initView$1", f = "CreateRouteEmptyMapFragment.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteEmptyMapFragment$initView$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteEmptyMapFragment$initView$1$1", f = "CreateRouteEmptyMapFragment.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CreateRouteEmptyMapFragment this$0;

            /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteEmptyMapFragment$initView$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001d\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007H\n"}, d2 = {"<anonymous>", "", "it", "", "Lcom/xiaomi/fitness/sport/route/detail/model/EmptyMapData;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteEmptyMapFragment$initView$1$1$1", f = "CreateRouteEmptyMapFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nCreateRouteEmptyMapFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRouteEmptyMapFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteEmptyMapFragment$initView$1$1$1\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,346:1\n54#2,3:347\n24#2:350\n59#2,4:351\n63#2,2:366\n54#2,3:368\n24#2:371\n59#2,4:372\n63#2,2:387\n489#3,11:355\n489#3,11:376\n*S KotlinDebug\n*F\n+ 1 CreateRouteEmptyMapFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteEmptyMapFragment$initView$1$1$1\n*L\n129#1:347,3\n129#1:350\n129#1:351,4\n129#1:366,2\n118#1:368,3\n118#1:371\n118#1:372,4\n118#1:387,2\n131#1:355,11\n120#1:376,11\n*E\n"})
            public static final class C07581 extends SuspendLambda implements Function2<List<? extends EmptyMapData>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CreateRouteEmptyMapFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07581(CreateRouteEmptyMapFragment createRouteEmptyMapFragment, Continuation<? super C07581> continuation) {
                    super(2, continuation);
                    this.this$0 = createRouteEmptyMapFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invokeSuspend$lambda$2(final CreateRouteEmptyMapFragment createRouteEmptyMapFragment, List list, int i) {
                    createRouteEmptyMapFragment.setRouteIndex(i);
                    String icon = ((EmptyMapData) list.get(createRouteEmptyMapFragment.getRouteIndex())).getIcon();
                    p9n p9nVar = createRouteEmptyMapFragment.createRouteActivityBinding;
                    if (p9nVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
                        p9nVar = null;
                    }
                    ImageView routeImage = p9nVar.O;
                    Intrinsics.checkNotNullExpressionValue(routeImage, "routeImage");
                    ImageLoader imageLoader = Coil.imageLoader(routeImage.getContext());
                    ImageRequest.Builder builderTarget = new ImageRequest.Builder(routeImage.getContext()).data(icon).target(routeImage);
                    builderTarget.scale(Scale.FIT);
                    builderTarget.listener(new ImageRequest.Listener() { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteEmptyMapFragment$initView$1$1$1$invokeSuspend$lambda$2$lambda$1$$inlined$listener$default$1
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
                            CreateRouteActivity createRouteActivity = createRouteEmptyMapFragment.createRouteActivity;
                            if (createRouteActivity == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                                createRouteActivity = null;
                            }
                            createRouteActivity.resizeRouteImage(createRouteEmptyMapFragment.getSmallWindow());
                        }
                    });
                    imageLoader.enqueue(builderTarget.build());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void invokeSuspend$lambda$5(CreateRouteEmptyMapFragment createRouteEmptyMapFragment, List list, View view) {
                    NetUtil netUtil = NetUtil.INSTANCE;
                    Context contextRequireContext = createRouteEmptyMapFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    if (netUtil.getNetWorkAvailable(contextRequireContext)) {
                        createRouteEmptyMapFragment.convertGps((EmptyMapData) list.get(createRouteEmptyMapFragment.getRouteIndex()));
                    } else {
                        ToastUtil.showLongToast(c1j.Z3);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C07581 c07581 = new C07581(this.this$0, continuation);
                    c07581.L$0 = obj;
                    return c07581;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends EmptyMapData> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<EmptyMapData>) list, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    final List list = (List) this.L$0;
                    if (list == null) {
                        return Unit.INSTANCE;
                    }
                    yln ylnVar = this.this$0.mBinding;
                    yln ylnVar2 = null;
                    if (ylnVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ylnVar = null;
                    }
                    RecyclerView recyclerView = ylnVar.C;
                    int routeIndex = this.this$0.getRouteIndex();
                    final CreateRouteEmptyMapFragment createRouteEmptyMapFragment = this.this$0;
                    recyclerView.setAdapter(new ItemAdapter(list, routeIndex, new Function1() { // from class: com.xiaomi.fitness.sport.view.route.g
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj2) {
                            return CreateRouteEmptyMapFragment.C30391.C07571.C07581.invokeSuspend$lambda$2(createRouteEmptyMapFragment, list, ((Integer) obj2).intValue());
                        }
                    }));
                    if (!list.isEmpty()) {
                        String icon = ((EmptyMapData) list.get(this.this$0.getRouteIndex())).getIcon();
                        p9n p9nVar = this.this$0.createRouteActivityBinding;
                        if (p9nVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
                            p9nVar = null;
                        }
                        ImageView routeImage = p9nVar.O;
                        Intrinsics.checkNotNullExpressionValue(routeImage, "routeImage");
                        final CreateRouteEmptyMapFragment createRouteEmptyMapFragment2 = this.this$0;
                        ImageLoader imageLoader = Coil.imageLoader(routeImage.getContext());
                        ImageRequest.Builder builderTarget = new ImageRequest.Builder(routeImage.getContext()).data(icon).target(routeImage);
                        builderTarget.scale(Scale.FIT);
                        builderTarget.listener(new ImageRequest.Listener() { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteEmptyMapFragment$initView$1$1$1$invokeSuspend$lambda$4$$inlined$listener$default$1
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
                                CreateRouteActivity createRouteActivity = createRouteEmptyMapFragment2.createRouteActivity;
                                CreateRouteActivity createRouteActivity2 = null;
                                if (createRouteActivity == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                                    createRouteActivity = null;
                                }
                                createRouteActivity.showEmptyMapGuide();
                                CreateRouteActivity createRouteActivity3 = createRouteEmptyMapFragment2.createRouteActivity;
                                if (createRouteActivity3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                                } else {
                                    createRouteActivity2 = createRouteActivity3;
                                }
                                createRouteActivity2.resizeRouteImage(createRouteEmptyMapFragment2.getSmallWindow());
                            }
                        });
                        imageLoader.enqueue(builderTarget.build());
                        p9n p9nVar2 = this.this$0.createRouteActivityBinding;
                        if (p9nVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
                            p9nVar2 = null;
                        }
                        ImageView routeImage2 = p9nVar2.O;
                        Intrinsics.checkNotNullExpressionValue(routeImage2, "routeImage");
                        ViewExtKt.setVisible(routeImage2, true);
                    }
                    yln ylnVar3 = this.this$0.mBinding;
                    if (ylnVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        ylnVar2 = ylnVar3;
                    }
                    TextView textView = ylnVar2.B;
                    final CreateRouteEmptyMapFragment createRouteEmptyMapFragment3 = this.this$0;
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.fitness.sport.view.route.h
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            CreateRouteEmptyMapFragment.C30391.C07571.C07581.invokeSuspend$lambda$5(createRouteEmptyMapFragment3, list, view);
                        }
                    });
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<EmptyMapData> list, Continuation<? super Unit> continuation) {
                    return ((C07581) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07571(CreateRouteEmptyMapFragment createRouteEmptyMapFragment, Continuation<? super C07571> continuation) {
                super(2, continuation);
                this.this$0 = createRouteEmptyMapFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07571(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CreateRouteEmptyMapFragment createRouteEmptyMapFragment = this.this$0;
                    UIUtils uIUtils = UIUtils.INSTANCE;
                    FragmentActivity fragmentActivityRequireActivity = createRouteEmptyMapFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    createRouteEmptyMapFragment.setSmallWindow(uIUtils.getScreenHeight(fragmentActivityRequireActivity) < 2000);
                    CreateRouteViewModel createRouteViewModel = this.this$0.createRouteViewModel;
                    if (createRouteViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                        createRouteViewModel = null;
                    }
                    MutableStateFlow<List<EmptyMapData>> emptyMapList = createRouteViewModel.getEmptyMapList();
                    C07581 c07581 = new C07581(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(emptyMapList, c07581, this) == coroutine_suspended) {
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

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C30391(Continuation<? super C30391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteEmptyMapFragment.this.new C30391(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreateRouteEmptyMapFragment createRouteEmptyMapFragment = CreateRouteEmptyMapFragment.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                C07571 c07571 = new C07571(createRouteEmptyMapFragment, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(createRouteEmptyMapFragment, state, c07571, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public CreateRouteEmptyMapFragment() {
        super(dvi.d0);
        this.typeToken = new TypeToken<Integer[][][]>() { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteEmptyMapFragment$typeToken$1
        }.getType();
        this.gson = new Gson();
        this.TAG = "CreateRouteEmptyMapFragment";
    }

    private final void handleBackPressed() {
        CreateRouteActivity createRouteActivity = this.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.setBackPressedFragment(this, new Function0() { // from class: a35
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateRouteEmptyMapFragment.handleBackPressed$lambda$0(this.f567a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleBackPressed$lambda$0(CreateRouteEmptyMapFragment this$0) {
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
        yln ylnVar = null;
        if (createRouteActivity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        } else {
            createRouteActivity = createRouteActivity2;
        }
        yln ylnVar2 = this.mBinding;
        if (ylnVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ylnVar = ylnVar2;
        }
        View root = ylnVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        CreateRouteActivity.setDefaultBehavior$default(createRouteActivity, root, 0, false, false, 10, null);
    }

    private final void initView(LayoutInflater inflater, ViewGroup container) {
        this.mBinding = yln.A0(inflater, container, false);
        CreateRouteActivity createRouteActivity = null;
        if (getActivity() instanceof CreateRouteActivity) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.xiaomi.fitness.sport.view.route.CreateRouteActivity");
            CreateRouteActivity createRouteActivity2 = (CreateRouteActivity) activity;
            this.createRouteActivity = createRouteActivity2;
            if (createRouteActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                createRouteActivity2 = null;
            }
            this.createRouteActivityBinding = createRouteActivity2.getCreateRouteActivityBinding();
            CreateRouteActivity createRouteActivity3 = this.createRouteActivity;
            if (createRouteActivity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                createRouteActivity3 = null;
            }
            this.createRouteViewModel = createRouteActivity3.getCreateRouteViewModel();
            p9n p9nVar = this.createRouteActivityBinding;
            if (p9nVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
                p9nVar = null;
            }
            p9nVar.K.setVisibility(8);
            p9n p9nVar2 = this.createRouteActivityBinding;
            if (p9nVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
                p9nVar2 = null;
            }
            LinearLayout titleLayout = p9nVar2.T;
            Intrinsics.checkNotNullExpressionValue(titleLayout, "titleLayout");
            ViewExtKt.visible(titleLayout);
            p9n p9nVar3 = this.createRouteActivityBinding;
            if (p9nVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
                p9nVar3 = null;
            }
            View root = p9nVar3.R.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ViewExtKt.gone(root);
        }
        p9n p9nVar4 = this.createRouteActivityBinding;
        if (p9nVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
            p9nVar4 = null;
        }
        FilterSortView filterSortView = p9nVar4.G;
        CreateRouteActivity createRouteActivity4 = this.createRouteActivity;
        if (createRouteActivity4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity4 = null;
        }
        filterSortView.setFilteredTab(createRouteActivity4.getTabViewMap().get(1));
        CreateRouteActivity createRouteActivity5 = this.createRouteActivity;
        if (createRouteActivity5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity5 = null;
        }
        createRouteActivity5.setStyleFragmentIndex(1);
        p9n p9nVar5 = this.createRouteActivityBinding;
        if (p9nVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
            p9nVar5 = null;
        }
        this.projection = p9nVar5.M.getMMapView().getMap().getProjection();
        p9n p9nVar6 = this.createRouteActivityBinding;
        if (p9nVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
            p9nVar6 = null;
        }
        AMap map = p9nVar6.M.getMMapView().getMap();
        p9n p9nVar7 = this.createRouteActivityBinding;
        if (p9nVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
            p9nVar7 = null;
        }
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(p9nVar7.M.getCurLocationdata(), 17.0f));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C30391(null), 3, null);
        handleBackPressed();
        CreateRouteActivity createRouteActivity6 = this.createRouteActivity;
        if (createRouteActivity6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
        } else {
            createRouteActivity = createRouteActivity6;
        }
        createRouteActivity.clearMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$1(CreateRouteEmptyMapFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p9n p9nVar = this$0.createRouteActivityBinding;
        if (p9nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
            p9nVar = null;
        }
        p9nVar.M.getMMapView().getMap().moveCamera(CameraUpdateFactory.changeBearing(0.0f));
    }

    public final void convertGps(@NotNull EmptyMapData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(data, null), 3, null);
    }

    @NotNull
    public final Gson getGson() {
        return this.gson;
    }

    @Nullable
    public final Projection getProjection() {
        return this.projection;
    }

    public final int getRawWidth() {
        return this.rawWidth;
    }

    public final int getRouteIndex() {
        return this.routeIndex;
    }

    public final boolean getSmallWindow() {
        return this.smallWindow;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @NotNull
    public final Type getTypeToken() {
        return this.typeToken;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        initView(inflater, container);
        initBehavior();
        yln ylnVar = this.mBinding;
        if (ylnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ylnVar = null;
        }
        View root = ylnVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        p9n p9nVar = this.createRouteActivityBinding;
        if (p9nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
            p9nVar = null;
        }
        p9nVar.M.getMMapView().post(new Runnable() { // from class: z25
            @Override // java.lang.Runnable
            public final void run() {
                CreateRouteEmptyMapFragment.onResume$lambda$1(this.f40801a);
            }
        });
    }

    public final void setProjection(@Nullable Projection projection) {
        this.projection = projection;
    }

    public final void setRawWidth(int i) {
        this.rawWidth = i;
    }

    public final void setRouteIndex(int i) {
        this.routeIndex = i;
    }

    public final void setSmallWindow(boolean z) {
        this.smallWindow = z;
    }
}
