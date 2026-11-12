package com.xiaomi.hm.health.device.watchskinstore.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchSkinBean;
import com.xiaomi.hm.health.imageload.DisplayConfig;
import com.xiaomi.hm.health.imageload.GlideRoundTransform;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001)B)\b\u0016\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020\u0011\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#¢\u0006\u0004\b%\u0010&B1\b\u0016\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010'\u001a\u00020\u0011\u0012\u0006\u0010\"\u001a\u00020\u0011\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#¢\u0006\u0004\b%\u0010(J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u001a\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0014J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011H\u0014J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0011H\u0014J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0014R\u0016\u0010\u001e\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010 ¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/adapter/WatchSkinSectionMultiAdapter;", "Lcom/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchSkinBean;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "holder", "item", "", "b", "a", "helper", "e", "Landroidx/appcompat/widget/AppCompatImageView;", "iv", "", "url", GoogleApiAvailabilityLight.a, "c", "", "position", "getDefItemViewType", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateDefViewHolder", "type", "", "isFixedViewType", "onBindViewHolder", "convert", LogUtil.I, "mSectionHeadResId", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "layoutResId", "", "data", "<init>", "(Landroid/content/Context;ILjava/util/List;)V", "sectionHeadResId", "(Landroid/content/Context;IILjava/util/List;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchSkinSectionMultiAdapter extends BaseMultiItemQuickAdapter<WatchSkinBean, BaseViewHolder> {
    public static final int SECTION_HEADER_VIEW = 1092;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int mSectionHeadResId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Context context;

    public WatchSkinSectionMultiAdapter(@NotNull Context context, int i, @Nullable List<WatchSkinBean> list) {
        super(list);
        addItemType(0, i);
        addItemType(2, R.layout.watch_skin_more);
        addItemType(3, R.layout.watch_skin_empty);
        this.context = context;
    }

    private final void a(BaseViewHolder holder, WatchSkinBean item) {
        holder.setText(R.id.skin_tv_head, item.getHeader());
        int i = R.id.skin_tv_head_more;
        holder.setVisible(i, item.getIsMore());
        holder.addOnClickListener(i);
    }

    private final void b(BaseViewHolder holder, WatchSkinBean item) {
        holder.setText(R.id.empty_tv, item.getName());
    }

    private final void c(AppCompatImageView iv, String url) {
        RequestBuilder<Drawable> requestBuilderLoad = Glide.with(this.context).load(url);
        RequestOptions requestOptionsSkipMemoryCache = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE).skipMemoryCache(true);
        int i = R.drawable.icon_default_cinco_dial_list;
        requestBuilderLoad.apply(requestOptionsSkipMemoryCache.placeholder(i).error(i).optionalFitCenter().transform(new GlideRoundTransform(5.0f))).into(iv);
    }

    private final void d(AppCompatImageView iv, String url) {
        DisplayConfig.ConfigBuilder configBuilderDiskCacheStrategy = HMImageLoader.with(this.context).load(url).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL);
        int i = R.drawable.icon_default_cinco_dial_list;
        configBuilderDiskCacheStrategy.placeholder(i).error(i).transform(new GlideRoundTransform(5.0f)).into(iv);
    }

    private final void e(BaseViewHolder helper, WatchSkinBean item) {
        if (this.context == null) {
            return;
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) helper.getView(R.id.skin_iv);
        boolean isLocal = item.getIsLocal();
        if (isLocal) {
            c(appCompatImageView, item.getImage());
        } else if (!isLocal) {
            d(appCompatImageView, item.getImage());
        }
        helper.setText(R.id.skin_tv_name, item.getName());
        int i = R.id.skin_tv_price;
        helper.setVisible(i, false);
        TextView textView = (TextView) helper.getView(i);
        textView.setVisibility(8);
        textView.setText(item.getIsFree() ? this.context.getString(R.string.watch_skin_free) : this.context.getString(R.string.watch_skin_price, String.valueOf(item.getPrice())));
    }

    @Override // com.chad.library.adapter.base.BaseMultiItemQuickAdapter, com.chad.library.adapter.base.BaseQuickAdapter
    public int getDefItemViewType(int position) {
        WatchSkinBean watchSkinBean = (WatchSkinBean) this.mData.get(position);
        if (watchSkinBean == null) {
            return super.getDefItemViewType(position);
        }
        if (watchSkinBean.getIsHeader()) {
            return 1092;
        }
        return watchSkinBean.getItemType();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public boolean isFixedViewType(int type) {
        return super.isFixedViewType(type) || type == 1092 || type == 3;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.chad.library.adapter.base.BaseViewHolder] */
    @Override // com.chad.library.adapter.base.BaseMultiItemQuickAdapter, com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public BaseViewHolder onCreateDefViewHolder(@NotNull ViewGroup parent, int viewType) {
        return viewType == 1092 ? createBaseViewHolder(getItemView(this.mSectionHeadResId, parent)) : super.onCreateDefViewHolder(parent, viewType);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder helper, @NotNull WatchSkinBean item) {
        if (helper.getItemViewType() != 0) {
            return;
        }
        e(helper, item);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull BaseViewHolder holder, int position) {
        int itemViewType = holder.getItemViewType();
        if (itemViewType == 3) {
            setFullSpan(holder);
            b(holder, (WatchSkinBean) getItem(position - getHeaderLayoutCount()));
        } else if (itemViewType != 1092) {
            super.onBindViewHolder(holder, position);
        } else {
            setFullSpan(holder);
            a(holder, (WatchSkinBean) getItem(position - getHeaderLayoutCount()));
        }
    }

    public WatchSkinSectionMultiAdapter(@NotNull Context context, int i, int i2, @Nullable List<WatchSkinBean> list) {
        this(context, i2, list);
        this.mSectionHeadResId = i;
    }
}
