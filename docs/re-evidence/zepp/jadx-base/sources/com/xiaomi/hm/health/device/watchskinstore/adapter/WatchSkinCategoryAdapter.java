package com.xiaomi.hm.health.device.watchskinstore.adapter;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.wallet.ui.decoration.SpacingDecoration;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchSkinBean;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchSkinCategory;
import com.xiaomi.hm.health.device.watchskinstore.ui.NestRecyclerView;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0014R\u0019\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u0010\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/adapter/WatchSkinCategoryAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchSkinCategory;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "Lcom/xiaomi/hm/health/device/watchskinstore/ui/NestRecyclerView;", "recyclerView", "item", "", "a", "helper", "convert", "Landroid/content/Context;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "adapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "getAdapter", "()Lcom/chad/library/adapter/base/BaseQuickAdapter;", "setAdapter", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "Lcom/huami/wallet/ui/decoration/SpacingDecoration;", "b", "Lcom/huami/wallet/ui/decoration/SpacingDecoration;", "spacingDecoration", "", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchSkinBean;", "c", "Ljava/util/List;", "childData", "", "layoutResId", "hSpacing", "<init>", "(Landroid/content/Context;II)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchSkinCategoryAdapter extends BaseQuickAdapter<WatchSkinCategory, BaseViewHolder> {
    public static final int DEFAULT_ITEM = 10;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;
    public BaseQuickAdapter<?, ?> adapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SpacingDecoration spacingDecoration;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private List<WatchSkinBean> childData;

    public WatchSkinCategoryAdapter(@NotNull Context context, int i, int i2) {
        super(i);
        this.context = context;
        this.spacingDecoration = new SpacingDecoration(i2, 0, true);
    }

    private final void a(NestRecyclerView recyclerView, WatchSkinCategory item) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(this.spacingDecoration);
        }
        List<WatchSkinBean> data = item.getData();
        List<WatchSkinBean> listSubList = null;
        List<WatchSkinBean> mutableList = data == null ? null : CollectionsKt___CollectionsKt.toMutableList((Collection) data);
        this.childData = mutableList;
        int size = mutableList == null ? 0 : mutableList.size();
        List<WatchSkinBean> list = this.childData;
        if (list != null) {
            listSubList = list.subList(0, size < 10 ? size : 10);
        }
        recyclerView.setIntercept((listSubList == null ? 0 : listSubList.size()) > 3);
        if (size > 10) {
            WatchSkinBean watchSkinBean = new WatchSkinBean(2);
            watchSkinBean.setName(item.getCategory());
            watchSkinBean.setId(item.getCategoryId());
            if (listSubList != null) {
                listSubList.add(watchSkinBean);
            }
        }
        setAdapter(new WatchSkinSectionMultiAdapter(this.context, R.layout.watch_skin_linear_item, listSubList));
        recyclerView.setAdapter(getAdapter());
        getAdapter().setOnItemClickListener(getOnItemClickListener());
    }

    @NotNull
    public final BaseQuickAdapter<?, ?> getAdapter() {
        BaseQuickAdapter<?, ?> baseQuickAdapter = this.adapter;
        Objects.requireNonNull(baseQuickAdapter);
        return baseQuickAdapter;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final void setAdapter(@NotNull BaseQuickAdapter<?, ?> baseQuickAdapter) {
        this.adapter = baseQuickAdapter;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder helper, @NotNull WatchSkinCategory item) {
        helper.setText(R.id.skin_tv_head, item.getCategory());
        helper.setVisible(R.id.skin_tv_head_more, false);
        a((NestRecyclerView) helper.getView(R.id.rv_item), item);
    }
}
