package com.reactnativecommunity.cameraroll;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.cm8;
import defpackage.ndj;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
@ndj(name = CameraRollModule.NAME)
public class CameraRollModule extends ReactContextBaseJavaModule {
    private static final String ASSET_TYPE_ALL = "All";
    private static final String ASSET_TYPE_PHOTOS = "Photos";
    private static final String ASSET_TYPE_VIDEOS = "Videos";
    private static final String ERROR_UNABLE_TO_DELETE = "E_UNABLE_TO_DELETE";
    private static final String ERROR_UNABLE_TO_FILTER = "E_UNABLE_TO_FILTER";
    private static final String ERROR_UNABLE_TO_LOAD = "E_UNABLE_TO_LOAD";
    private static final String ERROR_UNABLE_TO_LOAD_PERMISSION = "E_UNABLE_TO_LOAD_PERMISSION";
    private static final String ERROR_UNABLE_TO_SAVE = "E_UNABLE_TO_SAVE";
    private static final String INCLUDE_FILENAME = "filename";
    private static final String INCLUDE_FILE_SIZE = "fileSize";
    private static final String INCLUDE_IMAGE_SIZE = "imageSize";
    private static final String INCLUDE_LOCATION = "location";
    private static final String INCLUDE_PLAYABLE_DURATION = "playableDuration";
    public static final String NAME = "RNCCameraRoll";
    private static final String[] PROJECTION = {"_id", "mime_type", "bucket_display_name", "datetaken", "date_added", "date_modified", "width", "height", "_size", "_data"};
    private static final String SELECTION_BUCKET = "bucket_display_name = ?";
    private static final String SELECTION_DATE_TAKEN = "datetaken < ?";

    public static class a extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f10494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ReadableArray f10495b;
        public final Promise c;

        public a(ReactContext reactContext, ReadableArray readableArray, Promise promise) {
            super(reactContext);
            this.f10494a = reactContext;
            this.f10495b = readableArray;
            this.c = promise;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            ContentResolver contentResolver = this.f10494a.getContentResolver();
            String[] strArr = {"_id"};
            String str = "?";
            for (int i = 1; i < this.f10495b.size(); i++) {
                str = str + ", ?";
            }
            String str2 = "_data IN (" + str + ")";
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            String[] strArr2 = new String[this.f10495b.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < this.f10495b.size(); i3++) {
                strArr2[i3] = Uri.parse(this.f10495b.getString(i3)).getPath();
            }
            Cursor cursorQuery = contentResolver.query(uri, strArr, str2, strArr2, null);
            while (cursorQuery.moveToNext()) {
                if (contentResolver.delete(ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"))), null, null) == 1) {
                    i2++;
                }
            }
            cursorQuery.close();
            if (i2 == this.f10495b.size()) {
                this.c.resolve(Boolean.TRUE);
                return;
            }
            this.c.reject(CameraRollModule.ERROR_UNABLE_TO_DELETE, "Could not delete all media, only deleted " + i2 + " photos.");
        }
    }

    public static class b extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f10496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10497b;
        public final String c;
        public final String d;
        public final ReadableArray e;
        public final Promise f;
        public final String g;
        public final long h;
        public final long i;
        public final Set<String> j;

        public static Set<String> a(ReadableArray readableArray) {
            HashSet hashSet = new HashSet();
            if (readableArray == null) {
                return hashSet;
            }
            for (int i = 0; i < readableArray.size(); i++) {
                String string = readableArray.getString(i);
                if (string != null) {
                    hashSet.add(string);
                }
            }
            return hashSet;
        }

        public b(ReactContext reactContext, int i, String str, String str2, ReadableArray readableArray, String str3, long j, long j2, ReadableArray readableArray2, Promise promise) {
            super(reactContext);
            this.f10496a = reactContext;
            this.f10497b = i;
            this.c = str;
            this.d = str2;
            this.e = readableArray;
            this.f = promise;
            this.g = str3;
            this.h = j;
            this.i = j2;
            this.j = a(readableArray2);
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            StringBuilder sb = new StringBuilder("1");
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.d)) {
                sb.append(" AND bucket_display_name = ?");
                arrayList.add(this.d);
            }
            if (this.g.equals(CameraRollModule.ASSET_TYPE_PHOTOS)) {
                sb.append(" AND media_type = 1");
            } else if (this.g.equals(CameraRollModule.ASSET_TYPE_VIDEOS)) {
                sb.append(" AND media_type = 3");
            } else {
                if (!this.g.equals(CameraRollModule.ASSET_TYPE_ALL)) {
                    this.f.reject(CameraRollModule.ERROR_UNABLE_TO_FILTER, "Invalid filter option: '" + this.g + "'. Expected one of '" + CameraRollModule.ASSET_TYPE_PHOTOS + "', '" + CameraRollModule.ASSET_TYPE_VIDEOS + "' or '" + CameraRollModule.ASSET_TYPE_ALL + "'.");
                    return;
                }
                sb.append(" AND media_type IN (3,1)");
            }
            ReadableArray readableArray = this.e;
            if (readableArray != null && readableArray.size() > 0) {
                sb.append(" AND mime_type IN (");
                for (int i = 0; i < this.e.size(); i++) {
                    sb.append("?,");
                    arrayList.add(this.e.getString(i));
                }
                sb.replace(sb.length() - 1, sb.length(), ")");
            }
            if (this.h > 0) {
                sb.append(" AND datetaken > ?");
                arrayList.add(this.h + "");
            }
            if (this.i > 0) {
                sb.append(" AND datetaken <= ?");
                arrayList.add(this.i + "");
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            ContentResolver contentResolver = this.f10496a.getContentResolver();
            try {
                String str = "limit=" + (this.f10497b + 1);
                if (!TextUtils.isEmpty(this.c)) {
                    str = "limit=" + this.c + "," + (this.f10497b + 1);
                }
                Cursor cursorQuery = contentResolver.query(MediaStore.Files.getContentUri("external").buildUpon().encodedQuery(str).build(), CameraRollModule.PROJECTION, sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), "date_added DESC, date_modified DESC");
                try {
                    if (cursorQuery == null) {
                        this.f.reject(CameraRollModule.ERROR_UNABLE_TO_LOAD, "Could not get media");
                        return;
                    }
                    try {
                        CameraRollModule.putEdges(contentResolver, cursorQuery, writableNativeMap, this.f10497b, this.j);
                        CameraRollModule.putPageInfo(cursorQuery, writableNativeMap, this.f10497b, TextUtils.isEmpty(this.c) ? 0 : Integer.parseInt(this.c));
                        cursorQuery.close();
                        this.f.resolve(writableNativeMap);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    cursorQuery.close();
                    this.f.resolve(writableNativeMap);
                    throw th;
                }
            } catch (SecurityException e2) {
                this.f.reject(CameraRollModule.ERROR_UNABLE_TO_LOAD_PERMISSION, "Could not get media: need READ_EXTERNAL_STORAGE permission", e2);
            }
        }
    }

    public static class c extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f10498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f10499b;
        public final Promise c;
        public final ReadableMap d;

        public class a implements MediaScannerConnection.OnScanCompletedListener {
            public a() {
            }

            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str, Uri uri) {
                if (uri != null) {
                    c.this.c.resolve(uri.toString());
                } else {
                    c.this.c.reject(CameraRollModule.ERROR_UNABLE_TO_SAVE, "Could not add image to gallery");
                }
            }
        }

        public c(ReactContext reactContext, Uri uri, ReadableMap readableMap, Promise promise) {
            super(reactContext);
            this.f10498a = reactContext;
            this.f10499b = uri;
            this.c = promise;
            this.d = readableMap;
        }

        /* JADX WARN: Code duplicated, block: B:111:? A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:74:0x0160  */
        /* JADX WARN: Code duplicated, block: B:81:0x0171  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) throws Throwable {
            Throwable th;
            FileChannel channel;
            Throwable th2;
            File externalStoragePublicDirectory;
            String str = "";
            File file = new File(this.f10499b.getPath());
            FileChannel fileChannel = null;
            try {
                try {
                    boolean z = !"".equals(this.d.getString("album"));
                    if (z) {
                        externalStoragePublicDirectory = "video".equals(this.d.getString("type")) ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                    } else {
                        externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                    }
                    if (z) {
                        File file2 = new File(externalStoragePublicDirectory, this.d.getString("album"));
                        if (!file2.exists() && !file2.mkdirs()) {
                            this.c.reject(CameraRollModule.ERROR_UNABLE_TO_LOAD, "Album Directory not created. Did you request WRITE_EXTERNAL_STORAGE?");
                            return;
                        }
                        externalStoragePublicDirectory = file2;
                    }
                    if (!externalStoragePublicDirectory.isDirectory()) {
                        this.c.reject(CameraRollModule.ERROR_UNABLE_TO_LOAD, "External media storage directory not available");
                        return;
                    }
                    File file3 = new File(externalStoragePublicDirectory, file.getName());
                    String name = file.getName();
                    int i = 0;
                    if (name.indexOf(46) >= 0) {
                        String strSubstring = name.substring(0, name.lastIndexOf(46));
                        String strSubstring2 = name.substring(name.lastIndexOf(46));
                        name = strSubstring;
                        str = strSubstring2;
                    }
                    while (!file3.createNewFile()) {
                        file3 = new File(externalStoragePublicDirectory, name + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + i + str);
                        i++;
                    }
                    FileChannel channel2 = new FileInputStream(file).getChannel();
                    try {
                        channel = new FileOutputStream(file3).getChannel();
                        try {
                            channel.transferFrom(channel2, 0L, channel2.size());
                            channel2.close();
                            channel.close();
                            MediaScannerConnection.scanFile(this.f10498a, new String[]{file3.getAbsolutePath()}, null, new a());
                            if (channel2.isOpen()) {
                                try {
                                    channel2.close();
                                } catch (IOException e) {
                                    cm8.j("ReactNative", "Could not close input channel", e);
                                }
                            }
                            if (channel.isOpen()) {
                                channel.close();
                            }
                        } catch (IOException e2) {
                            e = e2;
                            fileChannel = channel2;
                            try {
                                this.c.reject(e);
                                if (fileChannel != null && fileChannel.isOpen()) {
                                    try {
                                        fileChannel.close();
                                    } catch (IOException e3) {
                                        cm8.j("ReactNative", "Could not close input channel", e3);
                                    }
                                }
                                if (channel == null || !channel.isOpen()) {
                                } else {
                                    channel.close();
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                th = th2;
                                if (fileChannel != null && fileChannel.isOpen()) {
                                    try {
                                        fileChannel.close();
                                    } catch (IOException e4) {
                                        cm8.j("ReactNative", "Could not close input channel", e4);
                                    }
                                }
                                if (channel != null || !channel.isOpen()) {
                                    throw th;
                                }
                                try {
                                    channel.close();
                                    throw th;
                                } catch (IOException e5) {
                                    cm8.j("ReactNative", "Could not close output channel", e5);
                                    throw th;
                                }
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            fileChannel = channel2;
                            th = th2;
                            if (fileChannel != null) {
                                fileChannel.close();
                            }
                            if (channel != null) {
                                throw th;
                            }
                            throw th;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        channel = null;
                    } catch (Throwable th5) {
                        th2 = th5;
                        channel = null;
                    }
                } catch (IOException e7) {
                    cm8.j("ReactNative", "Could not close output channel", e7);
                }
            } catch (IOException e8) {
                e = e8;
                channel = null;
            } catch (Throwable th6) {
                th = th6;
                channel = null;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                if (channel != null) {
                    throw th;
                }
                throw th;
            }
        }
    }

    public CameraRollModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private static void putBasicNodeInfo(Cursor cursor, WritableMap writableMap, int i, int i2, int i3, int i4, int i5) {
        writableMap.putString("type", cursor.getString(i));
        writableMap.putString("group_name", cursor.getString(i2));
        long j = cursor.getLong(i3);
        if (j == 0) {
            j = cursor.getLong(i4) * 1000;
        }
        writableMap.putDouble("timestamp", j / 1000.0d);
        writableMap.putDouble("modified", cursor.getLong(i5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putEdges(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i, Set<String> set) throws IOException {
        WritableArray writableArray;
        int i2;
        int i3;
        WritableArray writableNativeArray = new WritableNativeArray();
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex("mime_type");
        int columnIndex2 = cursor.getColumnIndex("bucket_display_name");
        int columnIndex3 = cursor.getColumnIndex("datetaken");
        int columnIndex4 = cursor.getColumnIndex("date_added");
        int columnIndex5 = cursor.getColumnIndex("date_modified");
        int columnIndex6 = cursor.getColumnIndex("width");
        int columnIndex7 = cursor.getColumnIndex("height");
        int columnIndex8 = cursor.getColumnIndex("_size");
        int columnIndex9 = cursor.getColumnIndex("_data");
        boolean zContains = set.contains("location");
        boolean zContains2 = set.contains(INCLUDE_FILENAME);
        boolean zContains3 = set.contains(INCLUDE_FILE_SIZE);
        boolean zContains4 = set.contains(INCLUDE_IMAGE_SIZE);
        boolean zContains5 = set.contains(INCLUDE_PLAYABLE_DURATION);
        int i4 = 0;
        while (i4 < i && !cursor.isAfterLast()) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            WritableArray writableArray2 = writableNativeArray;
            int i5 = i4;
            boolean z = zContains;
            int i6 = columnIndex9;
            if (putImageInfo(contentResolver, cursor, writableNativeMap2, columnIndex6, columnIndex7, columnIndex8, columnIndex9, columnIndex, zContains2, zContains3, zContains4, zContains5)) {
                putBasicNodeInfo(cursor, writableNativeMap2, columnIndex, columnIndex2, columnIndex3, columnIndex4, columnIndex5);
                i2 = i6;
                putLocationInfo(cursor, writableNativeMap2, i2, z);
                writableNativeMap.putMap("node", writableNativeMap2);
                writableArray = writableArray2;
                writableArray.pushMap(writableNativeMap);
                i3 = i5;
            } else {
                writableArray = writableArray2;
                i2 = i6;
                i3 = i5 - 1;
            }
            cursor.moveToNext();
            i4 = i3 + 1;
            columnIndex9 = i2;
            zContains = z;
            writableNativeArray = writableArray;
        }
        writableMap.putArray("edges", writableNativeArray);
    }

    private static boolean putImageInfo(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4) throws IOException {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Uri uri = Uri.parse("file://" + cursor.getString(i4));
        writableNativeMap.putString(SportRecordBundleKey.BUNDLE_PARAM_URI, uri.toString());
        String string = cursor.getString(i5);
        boolean z5 = string != null && string.startsWith("video");
        boolean zPutImageSize = putImageSize(contentResolver, cursor, writableNativeMap, i, i2, uri, z5, z3);
        boolean zPutPlayableDuration = putPlayableDuration(contentResolver, writableNativeMap, uri, z5, z4);
        if (z) {
            writableNativeMap.putString(INCLUDE_FILENAME, new File(cursor.getString(i4)).getName());
        } else {
            writableNativeMap.putNull(INCLUDE_FILENAME);
        }
        if (z2) {
            writableNativeMap.putDouble(INCLUDE_FILE_SIZE, cursor.getLong(i3));
        } else {
            writableNativeMap.putNull(INCLUDE_FILE_SIZE);
        }
        writableMap.putMap("image", writableNativeMap);
        return zPutImageSize && zPutPlayableDuration;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    private static boolean putImageSize(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i, int i2, Uri uri, boolean z, boolean z2) {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        boolean z5;
        int attributeInt;
        writableMap.putNull("width");
        writableMap.putNull("height");
        if (!z2) {
            return true;
        }
        int i5 = cursor.getInt(i);
        int i6 = cursor.getInt(i2);
        AssetFileDescriptor assetFileDescriptor = null;
        if (i5 <= 0 || i6 <= 0) {
            try {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                try {
                    if (z) {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        try {
                            mediaMetadataRetriever.setDataSource(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                        } catch (RuntimeException unused) {
                        }
                        try {
                            i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                            i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                            z4 = true;
                        } catch (NumberFormatException e) {
                            cm8.j("ReactNative", "Number format exception occurred while trying to fetch video metadata for " + uri.toString(), e);
                            z4 = false;
                        }
                        mediaMetadataRetriever.release();
                    } else {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFileDescriptor(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor(), null, options);
                        i5 = options.outWidth;
                        i6 = options.outHeight;
                        z4 = true;
                    }
                    i3 = i6;
                    i4 = i5;
                    z3 = z4;
                } catch (IOException e2) {
                    e = e2;
                    assetFileDescriptor = assetFileDescriptorOpenAssetFileDescriptor;
                    cm8.j("ReactNative", "Could not open asset file " + uri.toString(), e);
                    assetFileDescriptorOpenAssetFileDescriptor = assetFileDescriptor;
                    i3 = i6;
                    i4 = i5;
                    z3 = false;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = null;
            i3 = i6;
            i4 = i5;
            z3 = true;
        }
        if (z3 && !z) {
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                try {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    attributeInt = new ExifInterface(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor()).getAttributeInt("Orientation", 1);
                    if (attributeInt != 6 || attributeInt == 8) {
                        int i7 = i3;
                        i3 = i4;
                        i4 = i7;
                    }
                } catch (FileNotFoundException e4) {
                    cm8.j("ReactNative", "Could not open asset file " + uri.toString(), e4);
                    z5 = false;
                } catch (IOException e5) {
                    cm8.j("ReactNative", "Could not get exif data for file " + uri.toString(), e5);
                }
            } else {
                attributeInt = new ExifInterface(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor()).getAttributeInt("Orientation", 1);
                if (attributeInt != 6) {
                    int i8 = i3;
                    i3 = i4;
                    i4 = i8;
                } else {
                    int i9 = i3;
                    i3 = i4;
                    i4 = i9;
                }
            }
        }
        z5 = z3;
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            try {
                assetFileDescriptorOpenAssetFileDescriptor.close();
            } catch (IOException unused2) {
            }
        }
        writableMap.putInt("width", i4);
        writableMap.putInt("height", i3);
        return z5;
    }

    private static void putLocationInfo(Cursor cursor, WritableMap writableMap, int i, boolean z) {
        writableMap.putNull("location");
        if (z) {
            try {
                ExifInterface exifInterface = new ExifInterface(cursor.getString(i));
                float[] fArr = new float[2];
                if (exifInterface.getLatLong(fArr)) {
                    double d = fArr[1];
                    double d2 = fArr[0];
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putDouble("longitude", d);
                    writableNativeMap.putDouble("latitude", d2);
                    writableMap.putMap("location", writableNativeMap);
                }
            } catch (IOException e) {
                cm8.j("ReactNative", "Could not read the metadata", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putPageInfo(Cursor cursor, WritableMap writableMap, int i, int i2) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("has_next_page", i < cursor.getCount());
        if (i < cursor.getCount()) {
            writableNativeMap.putString("end_cursor", Integer.toString(i2 + i));
        }
        writableMap.putMap("page_info", writableNativeMap);
    }

    private static boolean putPlayableDuration(ContentResolver contentResolver, WritableMap writableMap, Uri uri, boolean z, boolean z2) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        writableMap.putNull(INCLUDE_PLAYABLE_DURATION);
        boolean z3 = true;
        if (z2 && z) {
            boolean z4 = false;
            Integer numValueOf = null;
            try {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            } catch (FileNotFoundException e) {
                cm8.j("ReactNative", "Could not open asset file " + uri.toString(), e);
                z3 = false;
                assetFileDescriptorOpenAssetFileDescriptor = null;
            }
            if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                } catch (RuntimeException unused) {
                }
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt(mediaMetadataRetriever.extractMetadata(9)) / 1000);
                    z4 = z3;
                } catch (NumberFormatException e2) {
                    cm8.j("ReactNative", "Number format exception occurred while trying to fetch video metadata for " + uri.toString(), e2);
                }
                mediaMetadataRetriever.release();
                z3 = z4;
            }
            if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                try {
                    assetFileDescriptorOpenAssetFileDescriptor.close();
                } catch (IOException unused2) {
                }
            }
            if (numValueOf != null) {
                writableMap.putInt(INCLUDE_PLAYABLE_DURATION, numValueOf.intValue());
            }
        }
        return z3;
    }

    @ReactMethod
    public void deletePhotos(ReadableArray readableArray, Promise promise) {
        if (readableArray.size() == 0) {
            promise.reject(ERROR_UNABLE_TO_DELETE, "Need at least one URI to delete");
        } else {
            new a(getReactApplicationContext(), readableArray, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    @ReactMethod
    public void getAlbums(ReadableMap readableMap, Promise promise) {
        String string = readableMap.hasKey("assetType") ? readableMap.getString("assetType") : ASSET_TYPE_ALL;
        StringBuilder sb = new StringBuilder("1");
        ArrayList arrayList = new ArrayList();
        if (string.equals(ASSET_TYPE_PHOTOS)) {
            sb.append(" AND media_type = 1");
        } else if (string.equals(ASSET_TYPE_VIDEOS)) {
            sb.append(" AND media_type = 3");
        } else {
            if (!string.equals(ASSET_TYPE_ALL)) {
                promise.reject(ERROR_UNABLE_TO_FILTER, "Invalid filter option: '" + string + "'. Expected one of '" + ASSET_TYPE_PHOTOS + "', '" + ASSET_TYPE_VIDEOS + "' or '" + ASSET_TYPE_ALL + "'.");
                return;
            }
            sb.append(" AND media_type IN (3,1)");
        }
        try {
            Cursor cursorQuery = getReactApplicationContext().getContentResolver().query(MediaStore.Files.getContentUri("external"), new String[]{"bucket_display_name"}, sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), null);
            if (cursorQuery == null) {
                promise.reject(ERROR_UNABLE_TO_LOAD, "Could not get media");
                return;
            }
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            try {
                if (cursorQuery.moveToFirst()) {
                    HashMap map = new HashMap();
                    do {
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("bucket_display_name"));
                        if (string2 != null) {
                            Integer num = (Integer) map.get(string2);
                            if (num == null) {
                                map.put(string2, 1);
                            } else {
                                map.put(string2, Integer.valueOf(num.intValue() + 1));
                            }
                        }
                    } while (cursorQuery.moveToNext());
                    for (Map.Entry entry : map.entrySet()) {
                        WritableNativeMap writableNativeMap = new WritableNativeMap();
                        writableNativeMap.putString("title", (String) entry.getKey());
                        writableNativeMap.putInt("count", ((Integer) entry.getValue()).intValue());
                        writableNativeArray.pushMap(writableNativeMap);
                    }
                }
            } finally {
                cursorQuery.close();
                promise.resolve(writableNativeArray);
            }
        } catch (Exception e) {
            promise.reject(ERROR_UNABLE_TO_LOAD, "Could not get media", e);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getPhotos(ReadableMap readableMap, Promise promise) {
        int i = readableMap.getInt(MedicalIdSPContract.PREF_FIRST);
        String string = readableMap.hasKey("after") ? readableMap.getString("after") : null;
        String string2 = readableMap.hasKey(CardInfo.KEY_CARD_GROUP_NAME) ? readableMap.getString(CardInfo.KEY_CARD_GROUP_NAME) : null;
        String string3 = readableMap.hasKey("assetType") ? readableMap.getString("assetType") : ASSET_TYPE_PHOTOS;
        long j = readableMap.hasKey("fromTime") ? (long) readableMap.getDouble("fromTime") : 0L;
        long j2 = readableMap.hasKey("toTime") ? (long) readableMap.getDouble("toTime") : 0L;
        new b(getReactApplicationContext(), i, string, string2, readableMap.hasKey("mimeTypes") ? readableMap.getArray("mimeTypes") : null, string3, j, j2, readableMap.hasKey("include") ? readableMap.getArray("include") : null, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void saveToCameraRoll(String str, ReadableMap readableMap, Promise promise) {
        new c(getReactApplicationContext(), Uri.parse(str), readableMap, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
