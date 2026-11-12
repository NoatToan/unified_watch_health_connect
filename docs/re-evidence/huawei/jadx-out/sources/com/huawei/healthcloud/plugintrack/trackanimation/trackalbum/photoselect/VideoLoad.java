package com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect;

import android.content.Context;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.loader.content.AsyncTaskLoader;
import androidx.loader.content.Loader;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.VideoModel;
import health.compact.a.CommonUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class VideoLoad extends AsyncTaskLoader<List<VideoModel>> {
    private static final String[] e = {"_id", "_data", "_size"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Loader<List<VideoModel>>.ForceLoadContentObserver f10765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<VideoModel> f10767c;

    public VideoLoad(Context context) {
        super(context);
        this.f10767c = null;
        this.f10766b = false;
        this.f10765a = new Loader.ForceLoadContentObserver();
    }

    @Override // androidx.loader.content.Loader
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void deliverResult(List<VideoModel> list) {
        if (isReset() || !isStarted()) {
            return;
        }
        super.deliverResult(list);
    }

    @Override // androidx.loader.content.Loader
    public void onStartLoading() {
        List<VideoModel> list = this.f10767c;
        if (list != null) {
            deliverResult(list);
        }
        if (takeContentChanged() || this.f10767c == null) {
            forceLoad();
        }
        d();
    }

    @Override // androidx.loader.content.Loader
    public void onStopLoading() {
        cancelLoad();
    }

    @Override // androidx.loader.content.Loader
    public void onReset() {
        super.onReset();
        onStopLoading();
        this.f10767c = null;
        c();
    }

    @Override // androidx.loader.content.Loader
    public void onAbandon() {
        super.onAbandon();
        c();
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<VideoModel> loadInBackground() {
        return b();
    }

    private List<VideoModel> b() {
        List<VideoModel> listE = e();
        this.f10767c = listE;
        return listE;
    }

    private List<VideoModel> e() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            cursorQuery = getContext().getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, e, null, null, "_id DESC");
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                cursorQuery.moveToFirst();
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
                int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("_data");
                do {
                    String string = cursorQuery.getString(columnIndexOrThrow);
                    String string2 = cursorQuery.getString(columnIndexOrThrow2);
                    if (!TextUtils.isEmpty(string) && new File(string).exists()) {
                        int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("_id");
                        int columnIndex = cursorQuery.getColumnIndex("_size");
                        long j = cursorQuery.getLong(columnIndexOrThrow3);
                        long j2 = cursorQuery.getLong(columnIndex);
                        arrayList.add(new VideoModel(j, string).setThumbnailPath(string2).setSize(j2).setDuration(d(string)));
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    return arrayList;
                }
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    private int d(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        return CommonUtils.j(mediaMetadataRetriever.extractMetadata(9));
    }

    private void d() {
        if (this.f10766b) {
            return;
        }
        getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, false, this.f10765a);
        this.f10766b = true;
    }

    private void c() {
        if (this.f10766b) {
            this.f10766b = false;
            getContext().getContentResolver().unregisterContentObserver(this.f10765a);
        }
    }
}
