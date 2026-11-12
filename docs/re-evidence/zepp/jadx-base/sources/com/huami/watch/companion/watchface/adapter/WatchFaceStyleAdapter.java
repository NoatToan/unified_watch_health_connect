package com.huami.watch.companion.watchface.adapter;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.watch.companion.R;
import com.huami.watch.companion.watchface.bean.WatchFaceStyle;
import com.xiaomi.hm.health.imageload.GlideApp;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceStyleAdapter extends BaseQuickAdapter<WatchFaceStyle, BaseViewHolder> {
    public WatchFaceStyleAdapter(@Nullable List<WatchFaceStyle> list) {
        super(R.layout.item_watchface_style, list);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.xiaomi.hm.health.imageload.GlideRequest] */
    private void a(ImageView imageView, int i) {
        Context context = this.mContext;
        (context instanceof Activity ? GlideApp.with((Activity) context) : GlideApp.with(context)).load(Integer.valueOf(i)).skipMemoryCache(false).placeholder(R.drawable.xihu_watch_face_list_default).optionalCircleCrop().into(imageView);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, WatchFaceStyle watchFaceStyle) {
        int i = R.id.iv_style;
        baseViewHolder.setImageResource(i, watchFaceStyle.getIconRes());
        a((ImageView) baseViewHolder.getView(i), watchFaceStyle.getIconRes());
    }
}
