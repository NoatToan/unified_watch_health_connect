package com.huami.watch.companion.watchface.manager;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.huami.watch.companion.R;
import com.huami.watch.companion.watchface.bean.WatchFaceBean;

/* JADX INFO: loaded from: classes16.dex */
public class DashBoardWatchFaceController extends BaseWatchFaceController {
    public DashBoardWatchFaceController(Context context) {
        this(context, null);
    }

    @Override // com.huami.watch.companion.watchface.manager.BaseWatchFaceController
    public String getFileRootName() {
        return this.baseFileName + "_dashboard";
    }

    @Override // com.huami.watch.companion.watchface.manager.BaseWatchFaceController
    public int getWatchFaceEditBgId(int i) {
        return R.drawable.watch_face_edit_dash_board_bg;
    }

    @Override // com.huami.watch.companion.watchface.manager.BaseWatchFaceController
    public int getWatchFaceLayoutId() {
        return R.layout.layout_xihu_watch_face_dash_board;
    }

    @Override // com.huami.watch.companion.watchface.manager.BaseWatchFaceController
    public void initView(View view) {
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_left_top);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_right_top);
        TextView textView = (TextView) view.findViewById(R.id.tv_center_top);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.iv_center_bottom);
        ImageView imageView4 = (ImageView) view.findViewById(R.id.iv_center_left);
        ImageView imageView5 = (ImageView) view.findViewById(R.id.iv_center_right);
        this.mViewMaps.put(1, imageView);
        this.mViewMaps.put(2, imageView2);
        this.mViewMaps.put(3, textView);
        this.mViewMaps.put(4, imageView4);
        this.mViewMaps.put(5, imageView3);
        this.mViewMaps.put(6, imageView5);
    }

    @Override // com.huami.watch.companion.watchface.manager.BaseWatchFaceController
    public void loadWidgetData() {
        super.loadWidgetData();
        this.mTextMaps.put(5, "研发部九点开会");
        this.mTextMaps.put(6, "研发部九点开会");
        this.mTextMaps.put(7, "研发部九点开会");
        this.mTextMaps.put(8, "研发部九点开会");
    }

    public DashBoardWatchFaceController(Context context, WatchFaceBean watchFaceBean) {
        super(context, watchFaceBean);
    }
}
