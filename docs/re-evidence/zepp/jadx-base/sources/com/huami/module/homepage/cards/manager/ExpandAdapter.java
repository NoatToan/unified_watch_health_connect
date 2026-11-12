package com.huami.module.homepage.cards.manager;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.helper.ExpandHelper;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.ViewExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0018\u0010\u0012\u001a\u00020\f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010H\u0016¨\u0006\u0015"}, d2 = {"Lcom/huami/module/homepage/cards/manager/ExpandAdapter;", "Lcom/huami/module/homepage/cards/manager/MonitorListAdapter;", "Lcom/huami/module/homepage/cards/manager/AdapterItem;", "Lcom/huami/module/homepage/cards/manager/ExpandViewHolder;", "Lcom/huami/mifit/analytics/builder/CountEventBuilder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "getAppendAnalytic", "", "list", "submitList", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class ExpandAdapter extends MonitorListAdapter<AdapterItem, ExpandViewHolder, CountEventBuilder> {
    public ExpandAdapter() {
        super(new a(), 0, 0.0f, 6, null);
        ExpandHelper.INSTANCE.resetExpandCache();
    }

    @Override // androidx.recyclerview.widget.ListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return getCurrentList().size();
    }

    @Override // androidx.recyclerview.widget.ListAdapter
    public void submitList(@Nullable List<? extends AdapterItem> list) {
        reportAll();
        super.submitList(list);
    }

    @Override // com.huami.mifit.analytics.monitor.ExposureAppendAnalytic
    @Nullable
    public CountEventBuilder getAppendAnalytic(int position) {
        try {
            return ExpandAdapterKt.b(getCurrentList().get(position).getCom.unionpay.tsmservice.data.Constant.KEY_CARD_TYPE java.lang.String());
        } catch (IndexOutOfBoundsException e) {
            HomeUtils.recordException(e);
            return null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ExpandViewHolder holder, int position) {
        AdapterItem adapterItem = getCurrentList().get(position);
        holder.bind(adapterItem);
        adapterItem.bindData();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ExpandViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        ConstraintLayout constraintLayout = new ConstraintLayout(parent.getContext());
        constraintLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        ViewExtKt.setShape(constraintLayout, 6.0f, Integer.valueOf(ViewExtKt.loadColor(constraintLayout, R.color.s38)));
        Unit unit = Unit.INSTANCE;
        return new ExpandViewHolder(constraintLayout);
    }
}
