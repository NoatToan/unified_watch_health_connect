package com.facebook.react.modules.camera;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
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
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.cm8;
import defpackage.ndj;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = CameraRollManager.NAME)
public class CameraRollManager extends ReactContextBaseJavaModule {
    private static final String ASSET_TYPE_ALL = "All";
    private static final String ASSET_TYPE_PHOTOS = "Photos";
    private static final String ASSET_TYPE_VIDEOS = "Videos";
    private static final String ERROR_UNABLE_TO_FILTER = "E_UNABLE_TO_FILTER";
    private static final String ERROR_UNABLE_TO_LOAD = "E_UNABLE_TO_LOAD";
    private static final String ERROR_UNABLE_TO_LOAD_PERMISSION = "E_UNABLE_TO_LOAD_PERMISSION";
    private static final String ERROR_UNABLE_TO_SAVE = "E_UNABLE_TO_SAVE";
    public static final String NAME = "CameraRollManager";
    private static final String[] PROJECTION = {"_id", "mime_type", "bucket_display_name", "datetaken", "width", "height", "longitude", "latitude", "_data"};
    private static final String SELECTION_BUCKET = "bucket_display_name = ?";
    private static final String SELECTION_DATE_TAKEN = "datetaken < ?";

    public static class b extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f7363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7364b;
        public final String c;
        public final String d;
        public final ReadableArray e;
        public final Promise f;
        public final String g;

        public b(ReactContext reactContext, int i, String str, String str2, ReadableArray readableArray, String str3, Promise promise) {
            super(reactContext);
            this.f7363a = reactContext;
            this.f7364b = i;
            this.c = str;
            this.d = str2;
            this.e = readableArray;
            this.f = promise;
            this.g = str3;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            StringBuilder sb = new StringBuilder("1");
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.c)) {
                sb.append(" AND datetaken < ?");
                arrayList.add(this.c);
            }
            if (!TextUtils.isEmpty(this.d)) {
                sb.append(" AND bucket_display_name = ?");
                arrayList.add(this.d);
            }
            String str = this.g;
            str.hashCode();
            switch (str) {
                case "Photos":
                    sb.append(" AND media_type = 1");
                    break;
                case "Videos":
                    sb.append(" AND media_type = 3");
                    break;
                case "All":
                    sb.append(" AND media_type IN (3,1)");
                    break;
                default:
                    this.f.reject(CameraRollManager.ERROR_UNABLE_TO_FILTER, "Invalid filter option: '" + this.g + "'. Expected one of '" + CameraRollManager.ASSET_TYPE_PHOTOS + "', '" + CameraRollManager.ASSET_TYPE_VIDEOS + "' or '" + CameraRollManager.ASSET_TYPE_ALL + "'.");
                    return;
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
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            ContentResolver contentResolver = this.f7363a.getContentResolver();
            try {
                Cursor cursorQuery = contentResolver.query(MediaStore.Files.getContentUri("external"), CameraRollManager.PROJECTION, sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), "datetaken DESC, date_modified DESC LIMIT " + (this.f7364b + 1));
                if (cursorQuery == null) {
                    this.f.reject(CameraRollManager.ERROR_UNABLE_TO_LOAD, "Could not get media");
                    return;
                }
                try {
                    CameraRollManager.putEdges(contentResolver, cursorQuery, writableNativeMap, this.f7364b);
                    CameraRollManager.putPageInfo(cursorQuery, writableNativeMap, this.f7364b);
                } finally {
                    cursorQuery.close();
                    this.f.resolve(writableNativeMap);
                }
            } catch (SecurityException e) {
                this.f.reject(CameraRollManager.ERROR_UNABLE_TO_LOAD_PERMISSION, "Could not get media: need READ_EXTERNAL_STORAGE permission", e);
            }
        }
    }

    public static class c extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f7365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f7366b;
        public final Promise c;

        public class a implements MediaScannerConnection.OnScanCompletedListener {
            public a() {
            }

            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str, Uri uri) {
                if (uri != null) {
                    c.this.c.resolve(uri.toString());
                } else {
                    c.this.c.reject(CameraRollManager.ERROR_UNABLE_TO_SAVE, "Could not add image to gallery");
                }
            }
        }

        public c(ReactContext reactContext, Uri uri, Promise promise) {
            super(reactContext);
            this.f7365a = reactContext;
            this.f7366b = uri;
            this.c = promise;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) throws Throwable {
            FileChannel fileChannel;
            String strSubstring;
            File file = new File(this.f7366b.getPath());
            ReadableByteChannel readableByteChannel = null;
            try {
                try {
                    String scheme = this.f7366b.getScheme();
                    ReadableByteChannel readableByteChannelNewChannel = (scheme.equals("http") || scheme.equals(Constants.URI_SCHEME)) ? Channels.newChannel(new URL(this.f7366b.toString()).openStream()) : new FileInputStream(file).getChannel();
                    try {
                        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                        externalStoragePublicDirectory.mkdirs();
                        if (!externalStoragePublicDirectory.isDirectory()) {
                            this.c.reject(CameraRollManager.ERROR_UNABLE_TO_LOAD, "External media storage directory not available");
                            if (readableByteChannelNewChannel == null || !readableByteChannelNewChannel.isOpen()) {
                                return;
                            }
                            try {
                                readableByteChannelNewChannel.close();
                                return;
                            } catch (IOException e) {
                                cm8.j("ReactNative", "Could not close input channel", e);
                                return;
                            }
                        }
                        File file2 = new File(externalStoragePublicDirectory, file.getName());
                        String name = file.getName();
                        if (name.indexOf(46) >= 0) {
                            String strSubstring2 = name.substring(0, name.lastIndexOf(46));
                            strSubstring = name.substring(name.lastIndexOf(46));
                            name = strSubstring2;
                        } else {
                            strSubstring = "";
                        }
                        int i = 0;
                        while (!file2.createNewFile()) {
                            file2 = new File(externalStoragePublicDirectory, name + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + i + strSubstring);
                            i++;
                        }
                        FileChannel channel = new FileOutputStream(file2).getChannel();
                        try {
                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(EventRecurrence.TH);
                            while (readableByteChannelNewChannel.read(byteBufferAllocate) > 0) {
                                byteBufferAllocate.flip();
                                channel.write(byteBufferAllocate);
                                byteBufferAllocate.compact();
                            }
                            byteBufferAllocate.flip();
                            while (byteBufferAllocate.hasRemaining()) {
                                channel.write(byteBufferAllocate);
                            }
                            readableByteChannelNewChannel.close();
                            channel.close();
                            MediaScannerConnection.scanFile(this.f7365a, new String[]{file2.getAbsolutePath()}, null, new a());
                            if (readableByteChannelNewChannel.isOpen()) {
                                try {
                                    readableByteChannelNewChannel.close();
                                } catch (IOException e2) {
                                    cm8.j("ReactNative", "Could not close input channel", e2);
                                }
                            }
                            if (channel.isOpen()) {
                                channel.close();
                            }
                        } catch (IOException e3) {
                            fileChannel = channel;
                            e = e3;
                            readableByteChannel = readableByteChannelNewChannel;
                            try {
                                this.c.reject(e);
                                if (readableByteChannel != null && readableByteChannel.isOpen()) {
                                    try {
                                        readableByteChannel.close();
                                    } catch (IOException e4) {
                                        cm8.j("ReactNative", "Could not close input channel", e4);
                                    }
                                }
                                if (fileChannel == null || !fileChannel.isOpen()) {
                                } else {
                                    fileChannel.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (readableByteChannel != null && readableByteChannel.isOpen()) {
                                    try {
                                        readableByteChannel.close();
                                    } catch (IOException e5) {
                                        cm8.j("ReactNative", "Could not close input channel", e5);
                                    }
                                }
                                if (fileChannel == null || !fileChannel.isOpen()) {
                                    throw th;
                                }
                                try {
                                    fileChannel.close();
                                    throw th;
                                } catch (IOException e6) {
                                    cm8.j("ReactNative", "Could not close output channel", e6);
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            fileChannel = channel;
                            th = th2;
                            readableByteChannel = readableByteChannelNewChannel;
                            if (readableByteChannel != null) {
                                readableByteChannel.close();
                            }
                            if (fileChannel == null) {
                                throw th;
                            }
                            throw th;
                        }
                    } catch (IOException e7) {
                        e = e7;
                        fileChannel = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileChannel = null;
                    }
                } catch (IOException e8) {
                    cm8.j("ReactNative", "Could not close output channel", e8);
                }
            } catch (IOException e9) {
                e = e9;
                fileChannel = null;
            } catch (Throwable th4) {
                th = th4;
                fileChannel = null;
            }
        }
    }

    public CameraRollManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private static void putBasicNodeInfo(Cursor cursor, WritableMap writableMap, int i, int i2, int i3) {
        writableMap.putString("type", cursor.getString(i));
        writableMap.putString("group_name", cursor.getString(i2));
        writableMap.putDouble("timestamp", cursor.getLong(i3) / 1000.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putEdges(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i) {
        WritableArray writableArray;
        int i2;
        WritableArray writableNativeArray = new WritableNativeArray();
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex("_id");
        int columnIndex2 = cursor.getColumnIndex("mime_type");
        int columnIndex3 = cursor.getColumnIndex("bucket_display_name");
        int columnIndex4 = cursor.getColumnIndex("datetaken");
        int columnIndex5 = cursor.getColumnIndex("width");
        int columnIndex6 = cursor.getColumnIndex("height");
        int columnIndex7 = cursor.getColumnIndex("longitude");
        int columnIndex8 = cursor.getColumnIndex("latitude");
        int columnIndex9 = cursor.getColumnIndex("_data");
        int i3 = 0;
        while (i3 < i && !cursor.isAfterLast()) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            WritableArray writableArray2 = writableNativeArray;
            int i4 = columnIndex;
            int i5 = columnIndex5;
            int i6 = i3;
            int i7 = columnIndex;
            int i8 = columnIndex8;
            int i9 = columnIndex5;
            int i10 = columnIndex7;
            if (putImageInfo(contentResolver, cursor, writableNativeMap2, i4, i5, columnIndex6, columnIndex9, columnIndex2)) {
                putBasicNodeInfo(cursor, writableNativeMap2, columnIndex2, columnIndex3, columnIndex4);
                putLocationInfo(cursor, writableNativeMap2, i10, i8);
                writableNativeMap.putMap("node", writableNativeMap2);
                writableArray = writableArray2;
                writableArray.pushMap(writableNativeMap);
                i2 = i6;
            } else {
                writableArray = writableArray2;
                i2 = i6 - 1;
            }
            cursor.moveToNext();
            i3 = i2 + 1;
            writableNativeArray = writableArray;
            columnIndex8 = i8;
            columnIndex7 = i10;
            columnIndex = i7;
            columnIndex5 = i9;
        }
        writableMap.putArray("edges", writableNativeArray);
    }

    private static boolean putImageInfo(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i, int i2, int i3, int i4, int i5) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Uri uri = Uri.parse("file://" + cursor.getString(i4));
        writableNativeMap.putString(SportRecordBundleKey.BUNDLE_PARAM_URI, uri.toString());
        float f = (float) cursor.getInt(i2);
        float f2 = (float) cursor.getInt(i3);
        String string = cursor.getString(i5);
        if (string != null && string.startsWith("video")) {
            try {
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                if (f <= 0.0f || f2 <= 0.0f) {
                    try {
                        try {
                            f = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                            f2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                        } catch (NumberFormatException e) {
                            cm8.j("ReactNative", "Number format exception occurred while trying to fetch video metadata for " + uri.toString(), e);
                            mediaMetadataRetriever.release();
                            assetFileDescriptorOpenAssetFileDescriptor.close();
                            return false;
                        }
                    } catch (Throwable th) {
                        mediaMetadataRetriever.release();
                        assetFileDescriptorOpenAssetFileDescriptor.close();
                        throw th;
                    }
                }
                writableNativeMap.putInt("playableDuration", Integer.parseInt(mediaMetadataRetriever.extractMetadata(9)) / 1000);
                mediaMetadataRetriever.release();
                assetFileDescriptorOpenAssetFileDescriptor.close();
            } catch (Exception e2) {
                cm8.j("ReactNative", "Could not get video metadata for " + uri.toString(), e2);
                return false;
            }
        }
        if (f <= 0.0f || f2 <= 0.0f) {
            try {
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, "r");
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(assetFileDescriptorOpenAssetFileDescriptor2.getFileDescriptor(), null, options);
                f = options.outWidth;
                f2 = options.outHeight;
                assetFileDescriptorOpenAssetFileDescriptor2.close();
            } catch (IOException e3) {
                cm8.j("ReactNative", "Could not get width/height for " + uri.toString(), e3);
                return false;
            }
        }
        writableNativeMap.putDouble("width", f);
        writableNativeMap.putDouble("height", f2);
        writableMap.putMap("image", writableNativeMap);
        return true;
    }

    private static void putLocationInfo(Cursor cursor, WritableMap writableMap, int i, int i2) {
        double d = cursor.getDouble(i);
        double d2 = cursor.getDouble(i2);
        if (d > 0.0d || d2 > 0.0d) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("longitude", d);
            writableNativeMap.putDouble("latitude", d2);
            writableMap.putMap("location", writableNativeMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putPageInfo(Cursor cursor, WritableMap writableMap, int i) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("has_next_page", i < cursor.getCount());
        if (i < cursor.getCount()) {
            cursor.moveToPosition(i - 1);
            writableNativeMap.putString("end_cursor", cursor.getString(cursor.getColumnIndex("datetaken")));
        }
        writableMap.putMap("page_info", writableNativeMap);
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
        ReadableArray array = readableMap.hasKey("mimeTypes") ? readableMap.getArray("mimeTypes") : null;
        if (readableMap.hasKey("groupTypes")) {
            throw new JSApplicationIllegalArgumentException("groupTypes is not supported on Android");
        }
        new b(getReactApplicationContext(), i, string, string2, array, string3, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void saveToCameraRoll(String str, String str2, Promise promise) {
        new c(getReactApplicationContext(), Uri.parse(str), promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
