package com.huami.watch.companion.watchface.manager;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.huami.watch.companion.R;
import com.huami.watch.companion.watchface.bean.WatchFaceBean;
import com.huami.watch.companion.watchface.bean.WatchFaceChildBean;
import com.huami.watch.companion.watchface.bean.WatchFaceOptionBean;
import com.huami.watch.companion.watchface.bean.WatchFaceWidget;
import com.huami.watch.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseWatchFaceController {
    public static final String TAG = "BaseWatchFaceController";
    private ImageView a;
    public String baseFileName;
    public Context mContext;
    public Map<String, Bitmap> mImageMaps;
    public Map<Integer, String> mTextMaps;
    public Map<Integer, View> mViewMaps;
    public WatchFaceBean mWatchFaceBean;
    public View mWatchFaceView;

    public BaseWatchFaceController(Context context) {
        this(context, null);
    }

    private String a(String str, int i, int i2) {
        return str + "_" + i + "_" + i2;
    }

    public static Bitmap getImageFromAssetsFile(Context context, String str) {
        AssetManager assets = context.getResources().getAssets();
        Bitmap bitmapDecodeStream = null;
        try {
            try {
                InputStream inputStreamOpen = assets.open(str);
                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                inputStreamOpen.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return bitmapDecodeStream;
        } finally {
            assets.close();
        }
    }

    public String getFilePath(String str) {
        return getFileRootName() + File.pathSeparator + str;
    }

    public abstract String getFileRootName();

    public abstract int getWatchFaceEditBgId(int i);

    public abstract int getWatchFaceLayoutId();

    public View getWatchFaceView() {
        return this.mWatchFaceView;
    }

    public String getWidgetTypeStr(int i) {
        if (i == 1) {
            return "arc";
        }
        if (i == 2) {
            return "strip";
        }
        if (i == 3) {
            return "circle";
        }
        if (i != 4) {
            return i != 5 ? "" : "rect";
        }
        return "circle_rect";
    }

    public WatchFaceBean getmWatchFaceBean() {
        return this.mWatchFaceBean;
    }

    public abstract void initView(View view);

    public void loadWidgetData() {
        List<WatchFaceWidget> widget = this.mWatchFaceBean.getWidget();
        if (this.mWatchFaceBean == null || widget == null || widget.size() == 0) {
            return;
        }
        for (WatchFaceWidget watchFaceWidget : widget) {
            String widgetTypeStr = getWidgetTypeStr(watchFaceWidget.getWidgetType());
            List<WatchFaceOptionBean> optionalData = watchFaceWidget.getOptionalData();
            if (optionalData == null || optionalData.size() == 0) {
                return;
            }
            for (WatchFaceOptionBean watchFaceOptionBean : optionalData) {
                int groupId = watchFaceOptionBean.getGroupId();
                List<WatchFaceChildBean> childs = watchFaceOptionBean.getChilds();
                if (childs == null || childs.size() == 0) {
                    return;
                }
                for (WatchFaceChildBean watchFaceChildBean : childs) {
                    String strA = a(widgetTypeStr, groupId, watchFaceChildBean.getChildId());
                    String filePath = getFilePath(strA);
                    Log.e(TAG, watchFaceChildBean.getTitle() + "filePath: " + filePath, new Object[0]);
                    Bitmap imageFromAssetsFile = getImageFromAssetsFile(this.mContext, filePath);
                    if (imageFromAssetsFile != null) {
                        this.mImageMaps.put(strA, imageFromAssetsFile);
                    }
                }
            }
        }
    }

    public void setData(int i, int i2, WatchFaceChildBean watchFaceChildBean) {
        View view;
        Map<Integer, View> map = this.mViewMaps;
        if (map == null || map.size() == 0 || watchFaceChildBean == null || (view = this.mViewMaps.get(Integer.valueOf(i2))) == null) {
            return;
        }
        int childId = watchFaceChildBean.getChildId();
        String strA = a(getWidgetTypeStr(i), i2, childId);
        if (view instanceof ImageView) {
            if (this.mImageMaps.containsKey(strA)) {
                ((ImageView) view).setImageBitmap(this.mImageMaps.get(strA));
            }
        } else if ((view instanceof TextView) && this.mTextMaps.containsKey(Integer.valueOf(childId))) {
            ((TextView) view).setText(this.mTextMaps.get(Integer.valueOf(childId)));
        }
    }

    public void setWatchFaceBg() {
        ImageView imageView = this.a;
        if (imageView != null) {
            WatchFaceBean watchFaceBean = this.mWatchFaceBean;
            imageView.setImageResource(watchFaceBean == null ? R.drawable.xihu_watch_face_list_default : getWatchFaceEditBgId(watchFaceBean.getId()));
        }
    }

    public void setmWatchFaceBean(WatchFaceBean watchFaceBean) {
        this.mWatchFaceBean = watchFaceBean;
        setWatchFaceBg();
    }

    public BaseWatchFaceController(Context context, WatchFaceBean watchFaceBean) {
        this.baseFileName = "watchface";
        this.mContext = context;
        this.mWatchFaceBean = watchFaceBean;
        this.mViewMaps = new HashMap();
        this.mImageMaps = new HashMap();
        this.mTextMaps = new HashMap();
        View viewInflate = LayoutInflater.from(this.mContext).inflate(getWatchFaceLayoutId(), (ViewGroup) null);
        this.mWatchFaceView = viewInflate;
        initView(viewInflate);
        this.a = (ImageView) this.mWatchFaceView.findViewById(R.id.iv_watch_face);
        setWatchFaceBg();
    }

    public void setWatchFaceBg(int i) {
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }
}
