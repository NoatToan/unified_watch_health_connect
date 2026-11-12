package com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.automatchphoto;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.CursorLoader;
import androidx.loader.content.Loader;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.PhotoModel;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.MimeType;
import defpackage.jhf;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class TrackPhotosDownload implements LoaderManager.LoaderCallbacks<Cursor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f10758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f10759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f10760c;
    private long d;
    private volatile boolean e;
    private String[] f;
    private MotionPath g;
    private List<PhotoModel> h;
    private MotionPathSimplify i;
    private HashMap<Integer, List<PhotoModel>> j;
    private long l;
    private int o;

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public void onLoaderReset(Loader<Cursor> loader) {
    }

    static class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<TrackPhotosDownload> f10761b;
        WeakReference<Cursor> d;

        public c(TrackPhotosDownload trackPhotosDownload, Cursor cursor) {
            this.f10761b = new WeakReference<>(trackPhotosDownload);
            this.d = new WeakReference<>(cursor);
        }

        @Override // java.lang.Runnable
        public void run() {
            TrackPhotosDownload trackPhotosDownload = this.f10761b.get();
            Cursor cursor = this.d.get();
            if (trackPhotosDownload == null) {
                LogUtil.e("TrackPhotosDownload", "MatchPhotoRunnable run() trackPhotosDownload is Null");
                return;
            }
            if (cursor != null && trackPhotosDownload.e) {
                trackPhotosDownload.d(cursor);
                jhf jhfVar = new jhf(trackPhotosDownload.h, trackPhotosDownload.g, trackPhotosDownload.i, trackPhotosDownload.o);
                LogUtil.a("TrackPhotosDownload", "mPhotosList:" + trackPhotosDownload.h.size());
                trackPhotosDownload.j = jhfVar.a();
                trackPhotosDownload.e = false;
            }
            trackPhotosDownload.f10759b = true;
        }
    }

    public boolean a() {
        return this.f10759b;
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        LogUtil.a("TrackPhotosDownload", "onCreateLoader");
        String[] strArr = {String.valueOf(this.l / 1000), String.valueOf(this.d / 1000)};
        return new CursorLoader(this.f10760c, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.f, "((date_added >= ?) AND (date_added <= ?))", strArr, this.f[0] + " ASC");
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        if (cursor != null) {
            LogUtil.a("TrackPhotosDownload", "TrackPhotosDownload#onLoadFinished cursor is closed =", Boolean.valueOf(cursor.isClosed()));
        }
        this.f10758a = new c(this, cursor);
        ThreadPoolManager.c().execute(this.f10758a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Cursor cursor) {
        TrackPhotosDownload trackPhotosDownload = this;
        if (cursor == null) {
            LogUtil.e("TrackPhotosDownload", "fillingLoadResult cursor is null");
            return;
        }
        if (cursor.isClosed()) {
            LogUtil.e("TrackPhotosDownload", "fillingLoadResult cursor isClosed");
            return;
        }
        if (cursor.getCount() <= 0) {
            LogUtil.e("TrackPhotosDownload", "fillingLoadResult cursor Count <= 0");
            return;
        }
        try {
            trackPhotosDownload.h.clear();
            cursor.moveToFirst();
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
            int columnIndex = cursor.getColumnIndex("mime_type");
            int columnIndex2 = cursor.getColumnIndex("width");
            int columnIndex3 = cursor.getColumnIndex("height");
            while (true) {
                String string = cursor.getString(columnIndex);
                int i = cursor.getInt(columnIndex2);
                int i2 = cursor.getInt(columnIndex3);
                String string2 = cursor.getString(columnIndexOrThrow);
                if (string2.toLowerCase(Locale.ENGLISH).contains("camera") && !string2.toLowerCase(Locale.ENGLISH).contains(".dng") && !TextUtils.isEmpty(string) && !trackPhotosDownload.b(string) && i2 <= i * 3 && i <= i2 * 3) {
                    long j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
                    trackPhotosDownload.h.add(new PhotoModel(j, string2, string).setWidth(i).setHeight(i2).setSize(cursor.getLong(cursor.getColumnIndex("_size"))).setTime(((long) cursor.getInt(cursor.getColumnIndex("date_added"))) * 1000));
                }
                if (!cursor.moveToNext()) {
                    return;
                }
                trackPhotosDownload = this;
                columnIndexOrThrow = columnIndexOrThrow;
            }
        } finally {
            cursor.close();
        }
    }

    private boolean b(String str) {
        return str != null && str.equals(MimeType.GIF);
    }

    public HashMap<Integer, List<PhotoModel>> c() {
        return this.j;
    }

    public void b() {
        LogUtil.a("TrackPhotosDownload", "TrackPhotosDownload destroy()");
        if (this.f10758a != null) {
            ThreadPoolManager.c().e(this.f10758a);
        }
    }
}
