package com.xiaomi.fitness.sport.sporttab.viewholder;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.fitness.banner.export.BannerExtKt;
import com.fitness.banner.export.BannerRequestParamV2;
import com.fitness.banner.export.IBanner;
import com.fitness.banner.export.v2.BannerItemV2;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.sport.sporttab.SportTabV4ViewModel;
import com.xiaomi.fitness.sport.sporttab.recycler.BannerGroupItemDecoration;
import com.xiaomi.fitness.sport.sporttab.recycler.OperationalBannerAdapter;
import com.xiaomi.fitness.sport.sporttab.viewholder.BannerListViewHolder;
import com.xiaomi.fitness.sport.utils.ExtensionsKt;
import com.xiaomi.fitness.sport.utils.ItemDecorationExtKt;
import defpackage.xri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u0001:\u0001,B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b*\u0010+J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0004J\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0004J\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0004R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0005\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/viewholder/BannerListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "requestOperationalBanners", "()V", "", "", "requestIdList", "Lcom/fitness/banner/export/v2/BannerItemV2;", "bannerItemList", "getFilteredBannerItemList", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "bindData", "clearObserver", "refreshHolder", "Landroid/view/View;", "itemView", "Landroid/view/View;", "getItemView", "()Landroid/view/View;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "getFragmentActivity", "()Landroidx/fragment/app/FragmentActivity;", "Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "mViewModel", "Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "getMViewModel", "()Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "Landroidx/lifecycle/Observer;", "bannerObserver", "Landroidx/lifecycle/Observer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "bannerRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/sport/sporttab/recycler/OperationalBannerAdapter;", "operationalBannerAdapter", "Lcom/xiaomi/fitness/sport/sporttab/recycler/OperationalBannerAdapter;", "<init>", "(Landroid/view/View;Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;)V", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBannerListViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerListViewHolder.kt\ncom/xiaomi/fitness/sport/sporttab/viewholder/BannerListViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1863#2:105\n1864#2:107\n1#3:106\n*S KotlinDebug\n*F\n+ 1 BannerListViewHolder.kt\ncom/xiaomi/fitness/sport/sporttab/viewholder/BannerListViewHolder\n*L\n98#1:105\n98#1:107\n*E\n"})
public final class BannerListViewHolder extends RecyclerView.d0 {

    @NotNull
    public static final String TAG = "BannerItemViewHolder";

    @Nullable
    private Observer<List<BannerItemV2>> bannerObserver;

    @NotNull
    private final RecyclerView bannerRecycler;

    @NotNull
    private final ConstraintLayout container;

    @NotNull
    private final FragmentActivity fragmentActivity;

    @NotNull
    private final View itemView;

    @NotNull
    private final SportTabV4ViewModel mViewModel;

    @NotNull
    private final OperationalBannerAdapter operationalBannerAdapter;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.sporttab.viewholder.BannerListViewHolder$requestOperationalBanners$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.sporttab.viewholder.BannerListViewHolder$requestOperationalBanners$1", f = "BannerListViewHolder.kt", i = {0}, l = {82}, m = "invokeSuspend", n = {"requestIdList"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BannerListViewHolder.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(7), Boxing.boxInt(8), Boxing.boxInt(9)});
                IBanner instance = BannerExtKt.getINSTANCE(IBanner.INSTANCE);
                String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                BannerRequestParamV2 bannerRequestParamV2 = new BannerRequestParamV2(listListOf, lowerCase, null, null, 8, null);
                this.L$0 = listListOf;
                this.label = 1;
                Object bannerListV2 = instance.getBannerListV2(bannerRequestParamV2, this);
                if (bannerListV2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = listListOf;
                obj = bannerListV2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            BannerListViewHolder.this.getMViewModel().getBannerItemListLiveData().postValue(BannerListViewHolder.this.getFilteredBannerItemList(list, (List) obj));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerListViewHolder(@NotNull View itemView, @NotNull FragmentActivity fragmentActivity, @NotNull SportTabV4ViewModel mViewModel) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(mViewModel, "mViewModel");
        this.itemView = itemView;
        this.fragmentActivity = fragmentActivity;
        this.mViewModel = mViewModel;
        View viewFindViewById = itemView.findViewById(xri.o0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.container = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(xri.x);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.bannerRecycler = (RecyclerView) viewFindViewById2;
        this.operationalBannerAdapter = new OperationalBannerAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$1(BannerListViewHolder this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(list, "list");
        if (!(!list.isEmpty())) {
            ViewExtKt.setVisible(this$0.container, false);
            ViewExtKt.setVisible(this$0.bannerRecycler, false);
            return;
        }
        ViewExtKt.setVisible(this$0.container, true);
        ViewExtKt.setVisible(this$0.bannerRecycler, true);
        this$0.bannerRecycler.setAdapter(this$0.operationalBannerAdapter);
        ItemDecorationExtKt.clearAllItemDecorations(this$0.bannerRecycler);
        this$0.bannerRecycler.addItemDecoration(new BannerGroupItemDecoration((int) ExtensionsKt.getDp(12)));
        this$0.operationalBannerAdapter.refreshData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<BannerItemV2> getFilteredBannerItemList(List<Integer> requestIdList, List<BannerItemV2> bannerItemList) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = requestIdList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            Iterator<T> it2 = bannerItemList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((BannerItemV2) next).getResourceId() != iIntValue);
            BannerItemV2 bannerItemV2 = (BannerItemV2) next;
            if (bannerItemV2 != null) {
                arrayList.add(bannerItemV2);
            }
        }
        return arrayList;
    }

    private final void requestOperationalBanners() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.fragmentActivity), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    public final void bindData() {
        Observer<List<BannerItemV2>> observer = this.bannerObserver;
        if (observer != null) {
            this.mViewModel.getBannerItemListLiveData().removeObserver(observer);
        }
        Observer<List<BannerItemV2>> observer2 = new Observer() { // from class: j02
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                BannerListViewHolder.bindData$lambda$1(this.f22273a, (List) obj);
            }
        };
        this.bannerObserver = observer2;
        this.mViewModel.getBannerItemListLiveData().observe(this.fragmentActivity, observer2);
        requestOperationalBanners();
    }

    public final void clearObserver() {
        Observer<List<BannerItemV2>> observer = this.bannerObserver;
        if (observer != null) {
            this.mViewModel.getBannerItemListLiveData().removeObserver(observer);
            this.bannerObserver = null;
        }
        this.bannerRecycler.setAdapter(null);
    }

    @NotNull
    public final FragmentActivity getFragmentActivity() {
        return this.fragmentActivity;
    }

    @NotNull
    public final View getItemView() {
        return this.itemView;
    }

    @NotNull
    public final SportTabV4ViewModel getMViewModel() {
        return this.mViewModel;
    }

    public final void refreshHolder() {
        requestOperationalBanners();
    }
}
