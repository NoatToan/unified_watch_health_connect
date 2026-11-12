package com.huami.watch.companion.watchface.adapter;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.signature.ObjectKey;
import com.huami.lib.view.quickadapter.BaseQuickAdapter;
import com.huami.lib.view.quickadapter.BaseViewHolder;
import com.huami.watch.companion.R;
import com.huami.watch.companion.watchface.bean.Metas;
import com.huami.watch.companion.watchface.bean.WatchSkinBean;
import com.xiaomi.hm.health.imageload.GlideApp;
import com.xiaomi.hm.health.imageload.GlideRequests;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lcom/huami/watch/companion/watchface/adapter/WatchFaceDiyAdapter;", "Lcom/huami/lib/view/quickadapter/BaseQuickAdapter;", "Lcom/huami/watch/companion/watchface/bean/WatchSkinBean;", "Lcom/huami/lib/view/quickadapter/BaseViewHolder;", "Landroid/widget/ImageView;", "iv", "", "imageUrl", "", "l", "helper", "item", "convert", "<init>", "()V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class WatchFaceDiyAdapter extends BaseQuickAdapter<WatchSkinBean, BaseViewHolder> {
    public WatchFaceDiyAdapter() {
        super(R.layout.list_item_watch_face_diy);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.xiaomi.hm.health.imageload.GlideRequest] */
    private final void l(ImageView iv, String imageUrl) {
        GlideRequests glideRequestsWith;
        Context context = this.mContext;
        if (context instanceof Activity) {
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            glideRequestsWith = GlideApp.with((Activity) context);
        } else {
            glideRequestsWith = GlideApp.with(context);
        }
        glideRequestsWith.load(imageUrl).signature(new ObjectKey(imageUrl)).skipMemoryCache(false).placeholder(R.drawable.watch_face_list_default).optionalCircleCrop().into(iv);
    }

    @Override // com.huami.lib.view.quickadapter.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder helper, @NotNull WatchSkinBean item) {
        String transparentBg;
        ImageView imageView = (ImageView) helper.getView(R.id.iv_skin);
        String image = item.getImage();
        String str = "";
        if (image == null) {
            image = "";
        }
        l(imageView, image);
        ImageView imageView2 = (ImageView) helper.getView(R.id.iv_skin_transparent);
        Metas metas = item.getMetas();
        if (metas != null && (transparentBg = metas.getTransparentBg()) != null) {
            str = transparentBg;
        }
        l(imageView2, str);
    }
}
