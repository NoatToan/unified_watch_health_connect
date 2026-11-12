package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.media;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.MediaBean;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes38.dex */
public class MediaQueryHelper {
    private static final int SIZE_DEN = 1024;
    private static final String TAG = "MediaQueryHelper";
    private final Context mContext;
    private GetMediaInfoListener mGetMediaInfoListener;
    private List<Runnable> mainThreadTasks;
    private List<Runnable> workThreadTasks;

    public interface GetMediaInfoListener {
        void onResult(List<MediaBean> list);
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface VideoType {
        public static final String TYPE_ALL = "video/*";
        public static final String TYPE_MP4 = "video/mp4";
    }

    public MediaQueryHelper(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void getAllVideoInfo(final String str, GetMediaInfoListener getMediaInfoListener) {
        this.mGetMediaInfoListener = getMediaInfoListener;
        addBackgroundTask(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.media.MediaQueryHelper$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1435xf5438096(str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getAllVideoInfo$1$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-pluginvideo-media-MediaQueryHelper, reason: not valid java name */
    /* synthetic */ void m1435xf5438096(String str) {
        final ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = this.mContext.getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "_display_name", "date_modified"}, "mime_type=?", new String[]{str}, "date_modified desc");
        if (cursorQuery == null) {
            LogUtil.j(TAG, "getAllVideoInfo -- mCursor is null");
            GetMediaInfoListener getMediaInfoListener = this.mGetMediaInfoListener;
            if (getMediaInfoListener != null) {
                getMediaInfoListener.onResult(null);
                return;
            }
            return;
        }
        while (cursorQuery.moveToNext()) {
            int i = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
            int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("duration"));
            long length = cursorQuery.getLong(cursorQuery.getColumnIndex("_size")) / 1024;
            if (length < 0 && !TextUtils.isEmpty(string)) {
                length = new File(string).length() / 1024;
            }
            if (length > 0 && i2 > 0) {
                String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                MediaBean mediaBean = new MediaBean();
                mediaBean.setVideoId(i);
                mediaBean.setPath(string);
                mediaBean.setDuration(i2);
                mediaBean.setSize(length);
                mediaBean.setDisplayName(string2);
                arrayList.add(mediaBean);
            }
        }
        cursorQuery.close();
        addTaskDelayInMainThread(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.media.MediaQueryHelper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1434xc3bbb95(arrayList);
            }
        }, 0);
    }

    /* JADX INFO: renamed from: lambda$getAllVideoInfo$0$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-pluginvideo-media-MediaQueryHelper, reason: not valid java name */
    /* synthetic */ void m1434xc3bbb95(List list) {
        GetMediaInfoListener getMediaInfoListener = this.mGetMediaInfoListener;
        if (getMediaInfoListener != null) {
            getMediaInfoListener.onResult(list);
        }
    }

    private void addBackgroundTask(Runnable runnable) {
        if (this.workThreadTasks == null) {
            this.workThreadTasks = new ArrayList();
        }
        this.workThreadTasks.add(runnable);
        BackgroundTaskUtils.submit(runnable);
    }

    private void clearBackgroundTasks() {
        List<Runnable> list = this.workThreadTasks;
        if (list != null) {
            Iterator<Runnable> it = list.iterator();
            while (it.hasNext()) {
                BackgroundTaskUtils.removeThreadPoolTask(it.next());
            }
            this.workThreadTasks.clear();
        }
    }

    protected void addTaskDelayInMainThread(Runnable runnable, int i) {
        if (this.mainThreadTasks == null) {
            this.mainThreadTasks = new ArrayList();
        }
        this.mainThreadTasks.add(runnable);
        if (i == 0) {
            BackgroundTaskUtils.postInMainThread(runnable);
        } else {
            BackgroundTaskUtils.postDelayedInMainThread(runnable, i);
        }
    }

    private void clearMainThreadTasks() {
        List<Runnable> list = this.mainThreadTasks;
        if (list != null) {
            Iterator<Runnable> it = list.iterator();
            while (it.hasNext()) {
                BackgroundTaskUtils.removeTaskFromMainWorker(it.next());
            }
            this.mainThreadTasks.clear();
        }
    }

    public void onDestroy() {
        clearMainThreadTasks();
        clearBackgroundTasks();
        this.mGetMediaInfoListener = null;
    }
}
