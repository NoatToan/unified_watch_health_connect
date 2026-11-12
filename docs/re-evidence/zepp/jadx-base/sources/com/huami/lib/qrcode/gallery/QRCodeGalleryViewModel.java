package com.huami.lib.qrcode.gallery;

import android.app.Application;
import android.content.ContentUris;
import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.lib.qrcode.gallery.bean.MediaStoreImage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class QRCodeGalleryViewModel extends AndroidViewModel {
    private final MutableLiveData<List<MediaStoreImage>> a;

    @Nullable
    private final ContentObserver b;

    public class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            QRCodeGalleryViewModel.this.loadImages();
        }
    }

    public QRCodeGalleryViewModel(@NonNull Application application) {
        super(application);
        this.a = new MutableLiveData<>();
        a aVar = new a(new Handler(Looper.myLooper()));
        this.b = aVar;
        getApplication().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, aVar);
    }

    private long a() {
        Date date;
        try {
            date = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).parse("2008.9.23");
        } catch (ParseException e) {
            e.printStackTrace();
            date = null;
        }
        return date != null ? TimeUnit.MICROSECONDS.toSeconds(date.getTime()) : TimeUnit.MICROSECONDS.toSeconds(0L);
    }

    private List<MediaStoreImage> b() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = getApplication().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_display_name", "date_added"}, "date_added >= ?", new String[]{String.valueOf(a())}, "date_added DESC");
        int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("date_added");
        int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("_display_name");
        while (cursorQuery.moveToNext()) {
            long j = cursorQuery.getLong(columnIndexOrThrow);
            arrayList.add(new MediaStoreImage(j, cursorQuery.getString(columnIndexOrThrow3), new Date(TimeUnit.SECONDS.toMillis(cursorQuery.getLong(columnIndexOrThrow2))), ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j)));
        }
        cursorQuery.close();
        return arrayList;
    }

    public LiveData<List<MediaStoreImage>> getImages() {
        return this.a;
    }

    public void loadImages() {
        this.a.postValue(b());
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        if (this.b != null) {
            getApplication().getContentResolver().unregisterContentObserver(this.b);
        }
    }
}
