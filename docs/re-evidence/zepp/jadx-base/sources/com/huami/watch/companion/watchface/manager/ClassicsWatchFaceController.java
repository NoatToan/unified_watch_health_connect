package com.huami.watch.companion.watchface.manager;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.huami.watch.companion.R;
import com.huami.watch.companion.watchface.bean.WatchFaceBean;

/* JADX INFO: loaded from: classes16.dex */
public class ClassicsWatchFaceController extends BaseWatchFaceController {
    public ClassicsWatchFaceController(Context context) {
        this(context, null);
    }

    @Override // com.huami.watch.companion.watchface.manager.BaseWatchFaceController
    public String getFileRootName() {
        return this.baseFileName + "_classics";
    }

    @Override // com.huami.watch.companion.watchface.manager.BaseWatchFaceController
    public int getWatchFaceEditBgId(int i) {
        return R.drawable.watch_face_edit_normal_bg;
    }

    @Override // com.huami.watch.companion.watchface.manager.BaseWatchFaceController
    public int getWatchFaceLayoutId() {
        return R.layout.layout_xihu_watch_face_normal;
    }

    @Override // com.huami.watch.companion.watchface.manager.BaseWatchFaceController
    public void initView(View view) {
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_left_top);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_right_top);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.iv_left_bottom);
        ImageView imageView4 = (ImageView) view.findViewById(R.id.iv_right_bottom);
        ImageView imageView5 = (ImageView) view.findViewById(R.id.iv_center_top);
        ImageView imageView6 = (ImageView) view.findViewById(R.id.iv_center_bottom);
        ImageView imageView7 = (ImageView) view.findViewById(R.id.iv_center_left);
        ImageView imageView8 = (ImageView) view.findViewById(R.id.iv_center_right);
        this.mViewMaps.put(1, imageView);
        this.mViewMaps.put(2, imageView3);
        this.mViewMaps.put(3, imageView2);
        this.mViewMaps.put(4, imageView4);
        this.mViewMaps.put(5, imageView7);
        this.mViewMaps.put(6, imageView8);
        this.mViewMaps.put(7, imageView5);
        this.mViewMaps.put(8, imageView6);
    }

    public ClassicsWatchFaceController(Context context, WatchFaceBean watchFaceBean) {
        super(context, watchFaceBean);
    }
}
