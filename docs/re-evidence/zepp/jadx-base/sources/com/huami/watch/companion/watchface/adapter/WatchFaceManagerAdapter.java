package com.huami.watch.companion.watchface.adapter;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.signature.ObjectKey;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.watch.companion.R;
import com.huami.watch.companion.watchface.bean.WatchFaceBean;
import com.huami.watch.companion.watchface.bean.WatchFaceBeanMulti;
import com.huami.watch.companion.watchface.bean.WatchFaceCloud;
import com.huami.watch.companion.watchface.bean.WatchFaceCloudResult;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.huami.watch.companion.watchface.manager.WatchFaceCloudManager;
import com.huami.watch.util.Rx;
import com.huami.widget.baseadapter.BaseSectionMultiItemQuickAdapter;
import com.xiaomi.hm.health.imageload.GlideApp;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceManagerAdapter extends BaseSectionMultiItemQuickAdapter<WatchFaceBeanMulti, BaseViewHolder> {
    private static final int f = 2;
    private boolean d;
    private Context e;

    public WatchFaceManagerAdapter(Context context, List<WatchFaceBeanMulti> list, String str) {
        super(list);
        this.d = true;
        addHeaderItemType(BaseSectionMultiItemQuickAdapter.HEAD_LEFT, R.layout.list_item_watchface_manager_header);
        addItemType(3, R.layout.list_item_watchface_manager);
        this.e = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(WatchFaceBean watchFaceBean, ObservableEmitter observableEmitter) throws Exception {
        WatchFaceCloudResult<List<WatchFaceCloud>> watchFaceList = WatchFaceApi.getWatchFaceList(this.e, watchFaceBean.getCloudId() + "", true);
        if (!watchFaceList.isSuccessful() || watchFaceList.getData().size() <= 0) {
            return;
        }
        observableEmitter.onNext(watchFaceList.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(BaseViewHolder baseViewHolder, WatchFaceBean watchFaceBean, List list) throws Exception {
        int i = R.id.iv_watch_face;
        baseViewHolder.getView(i).setVisibility(0);
        WatchFaceCloud watchFaceCloud = (WatchFaceCloud) list.get(0);
        WatchFaceCloud.WatchMeta metas = watchFaceCloud.getMetas();
        if (metas == null || TextUtils.isEmpty(metas.getTransparent_background())) {
            return;
        }
        WatchFaceCloud watchFace = WatchFaceCloudManager.getManager().getWatchFace(watchFaceBean.getCloudId());
        f((ImageView) baseViewHolder.getView(R.id.iv_watch), g(watchFace) ? watchFace.getImage() : watchFaceCloud.getImage());
        f((ImageView) baseViewHolder.getView(i), metas.getTransparent_background());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.xiaomi.hm.health.imageload.GlideRequest] */
    private void f(ImageView imageView, String str) {
        Context context = this.e;
        (context instanceof Activity ? GlideApp.with((Activity) context) : GlideApp.with(context)).load(str).signature(new ObjectKey(str)).skipMemoryCache(false).placeholder(R.drawable.watch_face_list_default).optionalCircleCrop().into(imageView);
    }

    private boolean g(WatchFaceCloud watchFaceCloud) {
        if (watchFaceCloud == null || TextUtils.isEmpty(watchFaceCloud.getImage())) {
            return false;
        }
        return new File(watchFaceCloud.getImage()).exists();
    }

    public boolean isEnableMode() {
        return this.d;
    }

    public void setEnableMode(boolean z) {
        this.d = z;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(final BaseViewHolder baseViewHolder, WatchFaceBeanMulti watchFaceBeanMulti) {
        final WatchFaceBean t = watchFaceBeanMulti.getT();
        if (t == null) {
            return;
        }
        TextView textView = (TextView) baseViewHolder.getView(R.id.tv_name);
        if (TextUtils.isEmpty(t.getImage())) {
            baseViewHolder.setImageResource(R.id.iv_watch, t.getWatcFaceBg());
        } else {
            f((ImageView) baseViewHolder.getView(R.id.iv_watch), t.getImage());
        }
        boolean z = t.getCurrent() == 1;
        textView.setText(t.getDialName());
        textView.setSelected(z);
        if (t.getEnable() == 1) {
            int i = R.id.tv_remove;
            baseViewHolder.setText(i, this.e.getString(R.string.xihu_watch_face_remove));
            baseViewHolder.getView(i).setEnabled(isEnableMode());
        } else {
            baseViewHolder.setText(R.id.tv_remove, this.e.getString(R.string.xihu_watch_face_start));
        }
        baseViewHolder.addOnClickListener(R.id.tv_remove);
        if (2 == t.getType()) {
            Rx.io(new ObservableOnSubscribe() { // from class: yf8
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                    this.a.d(t, observableEmitter);
                }
            }).safeSubscribe(new Consumer() { // from class: zf8
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.e(baseViewHolder, t, (List) obj);
                }
            });
        } else {
            baseViewHolder.getView(R.id.iv_watch_face).setVisibility(8);
        }
    }

    @Override // com.huami.widget.baseadapter.BaseSectionMultiItemQuickAdapter
    public void convertHead(BaseViewHolder baseViewHolder, WatchFaceBeanMulti watchFaceBeanMulti) {
        baseViewHolder.setText(R.id.tv_header_left, watchFaceBeanMulti.getHeader());
        int i = R.id.tv_header_right;
        baseViewHolder.setVisible(i, watchFaceBeanMulti.isRight());
        baseViewHolder.addOnClickListener(i);
    }
}
