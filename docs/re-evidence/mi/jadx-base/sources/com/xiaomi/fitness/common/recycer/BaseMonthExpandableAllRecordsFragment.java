package com.xiaomi.fitness.common.recycer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment;
import com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import com.xiaomi.fitness.common.recycer.expandable.HeaderItem;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.util.AllRecordsPageUtilKt;
import defpackage.aub;
import defpackage.c0j;
import defpackage.iji;
import defpackage.jui;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b&\u0018\u0000 <*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007:\u0001<B\u0007¢\u0006\u0004\b;\u0010\u000bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0016\u001a\u00020\t2\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00140\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0003H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b#\u0010\"J)\u0010(\u001a\u00020\t2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\b\u0010\u0018\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u0010/R\"\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\"\u00106\u001a\u0002038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b6\u00105\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/common/recycer/BaseMonthExpandableAllRecordsFragment;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "VM", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "W", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "D", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Laub;", "", "initRecyclerView", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "", "", "it", "onDataMapResult", "(Ljava/util/Map;)V", "data", "onAdapterItemClick", "(Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;)V", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseMonthExpandableAdapter;", "getMonthExpandableAdapter", "()Lcom/xiaomi/fitness/common/recycer/expandable/BaseMonthExpandableAdapter;", "getLastRecordTimeSecond", "()J", "endTimeSecond", "requestGroupData", "(J)V", Constants.KEY_REQUEST_DATA, "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView;", "moreRecyclerView", "Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView;", "Landroid/widget/TextView;", "tvNoData", "Landroid/widget/TextView;", "descriptionTv", "adapter", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseMonthExpandableAdapter;", "", "needClearOnResult", "Z", "delayRequest", "getDelayRequest", "()Z", "setDelayRequest", "(Z)V", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class BaseMonthExpandableAllRecordsFragment<VM extends BasicDataViewModel, W extends ExpandableBaseDataItem, D extends DailyRecordItem> extends BaseBindingFragment<VM, aub> {
    public static final int DETAIL_FRAGMENT_REQ_CODE = 100;
    public static final int RESULT_CODE_REFRESH = 2;

    @NotNull
    public static final String TAG = "MonthExpandableAllRecords";
    private BaseMonthExpandableAdapter<W, D> adapter;
    private boolean delayRequest;
    private TextView descriptionTv;
    private MoreRecyclerView moreRecyclerView;
    private boolean needClearOnResult;
    private TextView tvNoData;

    public BaseMonthExpandableAllRecordsFragment() {
        super(jui.r3);
    }

    private final void initRecyclerView() {
        MoreRecyclerView moreRecyclerView = getMBinding().C;
        this.moreRecyclerView = moreRecyclerView;
        MoreRecyclerView moreRecyclerView2 = null;
        if (moreRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moreRecyclerView");
            moreRecyclerView = null;
        }
        moreRecyclerView.setEnableMore(false);
        BaseMonthExpandableAdapter<W, D> monthExpandableAdapter = getMonthExpandableAdapter();
        this.adapter = monthExpandableAdapter;
        if (monthExpandableAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            monthExpandableAdapter = null;
        }
        BaseMonthExpandableAdapter<W, D> baseMonthExpandableAdapter = this.adapter;
        if (baseMonthExpandableAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            baseMonthExpandableAdapter = null;
        }
        monthExpandableAdapter.setData(baseMonthExpandableAdapter.getAdapterDataList(), false);
        BaseMonthExpandableAdapter<W, D> baseMonthExpandableAdapter2 = this.adapter;
        if (baseMonthExpandableAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            baseMonthExpandableAdapter2 = null;
        }
        baseMonthExpandableAdapter2.setCheckAttachBottomCallback(new Function0() { // from class: n92
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseMonthExpandableAllRecordsFragment.initRecyclerView$lambda$2(this.f27675a);
            }
        });
        BaseMonthExpandableAdapter<W, D> baseMonthExpandableAdapter3 = this.adapter;
        if (baseMonthExpandableAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            baseMonthExpandableAdapter3 = null;
        }
        baseMonthExpandableAdapter3.setListener(new BaseExpandableAdapter.OnItemClickListener(this) { // from class: com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment.initRecyclerView.2
            final /* synthetic */ BaseMonthExpandableAllRecordsFragment<VM, W, D> this$0;

            {
                this.this$0 = this;
            }

            @Override // com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter.OnItemClickListener
            public void onClickData(ExpandableBaseDataItem data) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.this$0.onAdapterItemClick(data);
            }

            @Override // com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter.OnItemClickListener
            public void onClickHeader(int position, HeaderItem headerItem) {
                Intrinsics.checkNotNullParameter(headerItem, "headerItem");
                BaseMonthExpandableAdapter baseMonthExpandableAdapter4 = null;
                if (headerItem.getExpandStatus()) {
                    BaseMonthExpandableAdapter baseMonthExpandableAdapter5 = ((BaseMonthExpandableAllRecordsFragment) this.this$0).adapter;
                    if (baseMonthExpandableAdapter5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    } else {
                        baseMonthExpandableAdapter4 = baseMonthExpandableAdapter5;
                    }
                    baseMonthExpandableAdapter4.dealFoldAction(headerItem);
                    return;
                }
                BaseMonthExpandableAdapter baseMonthExpandableAdapter6 = ((BaseMonthExpandableAllRecordsFragment) this.this$0).adapter;
                if (baseMonthExpandableAdapter6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    baseMonthExpandableAdapter4 = baseMonthExpandableAdapter6;
                }
                baseMonthExpandableAdapter4.dealExpandAction(headerItem, position);
            }
        });
        MoreRecyclerView moreRecyclerView3 = this.moreRecyclerView;
        if (moreRecyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moreRecyclerView");
            moreRecyclerView3 = null;
        }
        BaseMonthExpandableAdapter<W, D> baseMonthExpandableAdapter4 = this.adapter;
        if (baseMonthExpandableAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            baseMonthExpandableAdapter4 = null;
        }
        moreRecyclerView3.setAdapter(baseMonthExpandableAdapter4);
        MoreRecyclerView moreRecyclerView4 = this.moreRecyclerView;
        if (moreRecyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moreRecyclerView");
        } else {
            moreRecyclerView2 = moreRecyclerView4;
        }
        moreRecyclerView2.setLoadListener(new MoreRecyclerView.LoadListener(this) { // from class: com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment.initRecyclerView.3
            final /* synthetic */ BaseMonthExpandableAllRecordsFragment<VM, W, D> this$0;

            {
                this.this$0 = this;
            }

            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
                BaseMonthExpandableAllRecordsFragment<VM, W, D> baseMonthExpandableAllRecordsFragment = this.this$0;
                baseMonthExpandableAllRecordsFragment.requestGroupData(baseMonthExpandableAllRecordsFragment.getLastRecordTimeSecond());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initRecyclerView$lambda$2(final BaseMonthExpandableAllRecordsFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean zHasMore = ((BasicDataViewModel) this$0.getMViewModel()).hasMore();
        MoreRecyclerView recycler = this$0.getMBinding().C;
        Intrinsics.checkNotNullExpressionValue(recycler, "recycler");
        AllRecordsPageUtilKt.checkIfAttachBottomAndLoadMoreIfNeed(zHasMore, recycler, new Function0() { // from class: o92
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseMonthExpandableAllRecordsFragment.initRecyclerView$lambda$2$lambda$1(this.f28878a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initRecyclerView$lambda$2$lambda$1(BaseMonthExpandableAllRecordsFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "attachBottomAndLoadMore");
        this$0.requestGroupData(this$0.getLastRecordTimeSecond());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(BaseMonthExpandableAllRecordsFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Long, kotlin.collections.List<D of com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment.onViewCreated$lambda$0>>");
        this$0.onDataMapResult(map);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void requestData$default(BaseMonthExpandableAllRecordsFragment baseMonthExpandableAllRecordsFragment, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestData");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        baseMonthExpandableAllRecordsFragment.requestData(j);
    }

    public static /* synthetic */ void requestGroupData$default(BaseMonthExpandableAllRecordsFragment baseMonthExpandableAllRecordsFragment, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestGroupData");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        baseMonthExpandableAllRecordsFragment.requestGroupData(j);
    }

    public boolean getDelayRequest() {
        return this.delayRequest;
    }

    public final long getLastRecordTimeSecond() {
        BaseMonthExpandableAdapter<W, D> baseMonthExpandableAdapter = this.adapter;
        BaseMonthExpandableAdapter<W, D> baseMonthExpandableAdapter2 = null;
        if (baseMonthExpandableAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            baseMonthExpandableAdapter = null;
        }
        if (baseMonthExpandableAdapter.getOriginDataMap().isEmpty()) {
            return 0L;
        }
        BaseMonthExpandableAdapter<W, D> baseMonthExpandableAdapter3 = this.adapter;
        if (baseMonthExpandableAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            baseMonthExpandableAdapter3 = null;
        }
        long jLongValue = ((Number) CollectionsKt___CollectionsKt.m1334minOrThrow((Iterable) baseMonthExpandableAdapter3.getOriginDataMap().keySet())).longValue();
        BaseMonthExpandableAdapter<W, D> baseMonthExpandableAdapter4 = this.adapter;
        if (baseMonthExpandableAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            baseMonthExpandableAdapter2 = baseMonthExpandableAdapter4;
        }
        List<D> list = baseMonthExpandableAdapter2.getOriginDataMap().get(Long.valueOf(jLongValue));
        Intrinsics.checkNotNull(list);
        return ((DailyRecordItem) CollectionsKt___CollectionsKt.last((List) list)).getTimestamp();
    }

    @NotNull
    public abstract BaseMonthExpandableAdapter<W, D> getMonthExpandableAdapter();

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == 2) {
            requestGroupData$default(this, 0L, 1, null);
        }
    }

    public abstract void onAdapterItemClick(@NotNull ExpandableBaseDataItem data);

    public void onDataMapResult(@NotNull Map<Long, ? extends List<? extends D>> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "onDataMapResult size " + it.size() + ";needClear " + this.needClearOnResult);
        BaseMonthExpandableAdapter<W, D> baseMonthExpandableAdapter = null;
        if (this.needClearOnResult) {
            BaseMonthExpandableAdapter<W, D> baseMonthExpandableAdapter2 = this.adapter;
            if (baseMonthExpandableAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                baseMonthExpandableAdapter2 = null;
            }
            baseMonthExpandableAdapter2.clearData();
        }
        MoreRecyclerView moreRecyclerView = this.moreRecyclerView;
        if (moreRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moreRecyclerView");
            moreRecyclerView = null;
        }
        boolean z = false;
        moreRecyclerView.setStatus(getMViewModel().hasMore() ? Status.MORE : Status.DONE, false);
        BaseMonthExpandableAdapter<W, D> baseMonthExpandableAdapter3 = this.adapter;
        if (baseMonthExpandableAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            baseMonthExpandableAdapter3 = null;
        }
        if (baseMonthExpandableAdapter3.getOriginDataMap().isEmpty() && it.isEmpty()) {
            z = true;
        }
        MoreRecyclerView moreRecyclerView2 = this.moreRecyclerView;
        if (moreRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moreRecyclerView");
            moreRecyclerView2 = null;
        }
        ViewExtKt.setVisible(moreRecyclerView2, !z);
        TextView textView = this.tvNoData;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvNoData");
            textView = null;
        }
        ViewExtKt.setVisible(textView, z);
        BaseMonthExpandableAdapter<W, D> baseMonthExpandableAdapter4 = this.adapter;
        if (baseMonthExpandableAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            baseMonthExpandableAdapter4 = null;
        }
        baseMonthExpandableAdapter4.bindOriginDataMap(it);
        BaseMonthExpandableAdapter<W, D> baseMonthExpandableAdapter5 = this.adapter;
        if (baseMonthExpandableAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            baseMonthExpandableAdapter = baseMonthExpandableAdapter5;
        }
        baseMonthExpandableAdapter.refresh();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.tvNoData = getMBinding().E;
        this.descriptionTv = getMBinding().A;
        setTitle(c0j.h5);
        setTitleBackground(iji.T2);
        initRecyclerView();
        getMViewModel().getMonthGroupRequestMap().observe(getViewLifecycleOwner(), new BaseMonthExpandableAllRecordsFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: m92
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseMonthExpandableAllRecordsFragment.onViewCreated$lambda$0(this.f25896a, (Map) obj);
            }
        }));
        if (getDelayRequest()) {
            return;
        }
        requestGroupData$default(this, 0L, 1, null);
    }

    public void requestData(long endTimeSecond) {
        BasicDataViewModel.requestMonthGroupData$default(getMViewModel(), endTimeSecond, 0, 2, null);
    }

    public void requestGroupData(long endTimeSecond) {
        this.needClearOnResult = endTimeSecond == 0;
        requestData(endTimeSecond);
    }

    public void setDelayRequest(boolean z) {
        this.delayRequest = z;
    }
}
