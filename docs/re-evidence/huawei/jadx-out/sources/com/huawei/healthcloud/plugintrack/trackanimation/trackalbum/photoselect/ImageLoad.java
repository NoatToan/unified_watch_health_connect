package com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.loader.content.AsyncTaskLoader;
import androidx.loader.content.Loader;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.PhotoModel;
import com.huawei.openalliance.ad.constant.MimeType;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class ImageLoad extends AsyncTaskLoader<List<PhotoModel>> {
    private static final String[] d = {"_id", "_data", "mime_type", "width", "height", "_size"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Loader<List<PhotoModel>>.ForceLoadContentObserver f10763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<PhotoModel> f10764b;
    private boolean e;

    public ImageLoad(Context context) {
        super(context);
        this.f10764b = null;
        this.e = false;
        this.f10763a = new Loader.ForceLoadContentObserver();
    }

    @Override // androidx.loader.content.Loader
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void deliverResult(List<PhotoModel> list) {
        if (isReset() || !isStarted()) {
            return;
        }
        super.deliverResult(list);
    }

    @Override // androidx.loader.content.Loader
    public void onStartLoading() {
        List<PhotoModel> list = this.f10764b;
        if (list != null) {
            deliverResult(list);
        }
        if (takeContentChanged() || this.f10764b == null) {
            forceLoad();
        }
        a();
    }

    @Override // androidx.loader.content.Loader
    public void onStopLoading() {
        cancelLoad();
    }

    @Override // androidx.loader.content.Loader
    public void onReset() {
        super.onReset();
        onStopLoading();
        this.f10764b = null;
        b();
    }

    @Override // androidx.loader.content.Loader
    public void onAbandon() {
        super.onAbandon();
        b();
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public List<PhotoModel> loadInBackground() {
        return e();
    }

    private List<PhotoModel> e() {
        List<PhotoModel> listD = d();
        this.f10764b = listD;
        return listD;
    }

    private boolean d(String str) {
        if (str != null) {
            return MimeType.GIF.equals(str) || "image/GIF".equals(str);
        }
        return false;
    }

    private List<PhotoModel> d() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            cursorQuery = getContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, d, null, null, "_id DESC");
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                cursorQuery.moveToFirst();
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
                int columnIndex = cursorQuery.getColumnIndex("mime_type");
                int columnIndex2 = cursorQuery.getColumnIndex("width");
                int columnIndex3 = cursorQuery.getColumnIndex("height");
                do {
                    String string = cursorQuery.getString(columnIndexOrThrow);
                    String string2 = cursorQuery.getString(columnIndex);
                    int i = cursorQuery.getInt(columnIndex2);
                    int i2 = cursorQuery.getInt(columnIndex3);
                    if (!TextUtils.isEmpty(string) && new File(string).exists() && !TextUtils.isEmpty(string2) && i2 <= i * 3 && i <= i2 * 3 && !d(string2) && !string.toLowerCase(Locale.ENGLISH).contains(".dng")) {
                        int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("_size");
                        long j = cursorQuery.getLong(columnIndexOrThrow2);
                        arrayList.add(new PhotoModel(j, string, string2).setWidth(i).setHeight(i2).setSize(cursorQuery.getLong(columnIndex4)).setTime(0L));
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

    private void a() {
        if (this.e) {
            return;
        }
        getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, false, this.f10763a);
        this.e = true;
    }

    private void b() {
        if (this.e) {
            this.e = false;
            getContext().getContentResolver().unregisterContentObserver(this.f10763a);
        }
    }
}
