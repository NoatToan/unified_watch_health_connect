package com.huami.watch.companion.watchface.adapter;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.signature.ObjectKey;
import com.chad.library.adapter.base.BaseItemDraggableAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.watch.companion.R;
import com.huami.watch.companion.watchface.bean.WatchFaceBean;
import com.huami.watch.companion.watchface.bean.WatchFaceCloud;
import com.huami.watch.companion.watchface.bean.WatchFaceCloudResult;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.huami.watch.companion.watchface.manager.WatchFaceCloudManager;
import com.huami.watch.util.Rx;
import com.xiaomi.hm.health.imageload.GlideApp;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceSortAdapter extends BaseItemDraggableAdapter<WatchFaceBean, BaseViewHolder> {
    private static final int a = 2;

    public WatchFaceSortAdapter(List<WatchFaceBean> list) {
        super(R.layout.item_watchface_sort, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(WatchFaceBean watchFaceBean, ObservableEmitter observableEmitter) throws Exception {
        WatchFaceCloudResult<List<WatchFaceCloud>> watchFaceList = WatchFaceApi.getWatchFaceList(this.mContext, watchFaceBean.getCloudId() + "", true);
        if (!watchFaceList.isSuccessful() || watchFaceList.getData().size() <= 0) {
            return;
        }
        observableEmitter.onNext(watchFaceList.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(BaseViewHolder baseViewHolder, WatchFaceBean watchFaceBean, List list) throws Exception {
        int i = R.id.iv_watch_face;
        baseViewHolder.getView(i).setVisibility(0);
        WatchFaceCloud watchFaceCloud = (WatchFaceCloud) list.get(0);
        WatchFaceCloud.WatchMeta metas = watchFaceCloud.getMetas();
        if (metas == null || TextUtils.isEmpty(metas.getTransparent_background())) {
            return;
        }
        WatchFaceCloud watchFace = WatchFaceCloudManager.getManager().getWatchFace(watchFaceBean.getCloudId());
        e((ImageView) baseViewHolder.getView(R.id.iv_watch), f(watchFace) ? watchFace.getImage() : watchFaceCloud.getImage());
        e((ImageView) baseViewHolder.getView(i), metas.getTransparent_background());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.xiaomi.hm.health.imageload.GlideRequest] */
    private void e(ImageView imageView, String str) {
        Context context = this.mContext;
        (context instanceof Activity ? GlideApp.with((Activity) context) : GlideApp.with(context)).load(str).signature(new ObjectKey(str)).skipMemoryCache(false).placeholder(R.drawable.watch_face_list_default).optionalCircleCrop().into(imageView);
    }

    private boolean f(WatchFaceCloud watchFaceCloud) {
        if (watchFaceCloud == null || TextUtils.isEmpty(watchFaceCloud.getImage())) {
            return false;
        }
        return new File(watchFaceCloud.getImage()).exists();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(final BaseViewHolder baseViewHolder, final WatchFaceBean watchFaceBean) {
        baseViewHolder.setText(R.id.tv_name, watchFaceBean.getDialName());
        if (TextUtils.isEmpty(watchFaceBean.getImage())) {
            baseViewHolder.setImageResource(R.id.iv_watch, watchFaceBean.getWatcFaceBg());
        } else {
            e((ImageView) baseViewHolder.getView(R.id.iv_watch), watchFaceBean.getImage());
        }
        if (2 == watchFaceBean.getType()) {
            Rx.io(new ObservableOnSubscribe() { // from class: kg8
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                    this.a.c(watchFaceBean, observableEmitter);
                }
            }).safeSubscribe(new Consumer() { // from class: lg8
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.d(baseViewHolder, watchFaceBean, (List) obj);
                }
            });
        } else {
            baseViewHolder.getView(R.id.iv_watch_face).setVisibility(8);
        }
    }
}
