package com.xiaomi.smarthome.framework.plugin.rn.nativemodule;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ScrollView;
import androidx.annotation.RequiresApi;
import androidx.core.view.ScrollingView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.accountsdk.request.SimpleRequest;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.sleep.behavior.AudioFileCacheConfig;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.core.entity.Error;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnNetReport;
import com.xiaomi.smarthome.framework.plugin.rn.utils.CommonCallback;
import com.xiaomi.smarthome.framework.plugin.rn.utils.FileUtils;
import com.xiaomi.smarthome.framework.plugin.rn.utils.ImageEditor;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MD5Util;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MRnSchedulers;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.ParcelFileDescriptorUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnCallbackMapUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnReadableMapUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.SecryptUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.StringUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.ZipPluginFileUtils;
import com.xiaomi.smarthome.framework.plugin.rn.utils.ZipUtil;
import com.xiaomi.smarthome.framework.plugin.rn.viewshot.ViewShot;
import com.xiaomi.smarthome.library.bluetooth.OTAErrorCode;
import com.xiaomi.smarthome.library.common.util.IOUtils;
import defpackage.ndj;
import defpackage.p4h;
import defpackage.pfl;
import defpackage.tc0;
import defpackage.va1;
import defpackage.xno;
import defpackage.z07;
import defpackage.zta;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@ndj(name = "MIOTFile")
public class MIOTPersistModuleCore extends MIOTBaseJavaModule implements IMIOTPersist, ReactModuleWithSpec {
    private static final int MI_PAN_UPLOAD_SEGMENT_SIZE = 4194304;
    public static final String NAME = "MIOTFile";
    private static final String PARAM_DIR_PATH = "dirPath";
    private static final String PARAM_RECURISVE = "recursive";
    private static final String TAG = "MIOTFile";
    private Set mAlbumLegalModelSet;
    protected Map<String, DownloadFileTask> mFileDownloadTaskMap;
    protected Set mSaveNotesAppLegalModelSet;

    public static class DownloadFileTask {
        static byte STATUS_DOWNLOAD_CANCEL = 2;
        static byte STATUS_DOWNLOAD_END = 3;
        static byte STATUS_DOWNLOAD_ING = 1;
        volatile byte downloadStatus;

        public DownloadFileTask() {
        }

        public DownloadFileTask(byte b2) {
            this.downloadStatus = b2;
        }
    }

    public static class MIOTFile {
        private static final String ALBUM_KEY_ID = "albumID";
        private static final String ALBUM_KEY_NAME = "name";
        private static final String ALBUM_KEY_SIZE = "size";
        private static final String ALBUM_KEY_THUMB = "thumb";
        private static final int MIME_TYPE_AUDIO = 3;
        private static final int MIME_TYPE_IMAGE = 1;
        private static final int MIME_TYPE_UNKNOWN = 0;
        private static final int MIME_TYPE_VIDEO = 2;
        private static final String PHOTO_KEY_CREATE_DATE = "creationDate";
        private static final String PHOTO_KEY_DURATION = "duration";
        private static final String PHOTO_KEY_HEIGHT = "pixelHeight";
        private static final String PHOTO_KEY_MIME_TYPE = "mediaType";
        private static final String PHOTO_KEY_MODIFY_DATE = "modificationDate";
        private static final String PHOTO_KEY_URL = "url";
        private static final String PHOTO_KEY_UTI = "uti";
        private static final String PHOTO_KEY_WIDTH = "pixelWidth";

        public static WritableMap albumInfoToWriteMap(MediaStoreUtil.AlbumInfo albumInfo) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString(ALBUM_KEY_ID, albumInfo.albumID);
            writableMapCreateMap.putString("name", albumInfo.name);
            writableMapCreateMap.putInt("size", albumInfo.size);
            writableMapCreateMap.putMap(ALBUM_KEY_THUMB, toWriteMap(albumInfo.thumb));
            return writableMapCreateMap;
        }

        public static WritableMap toFileInfoWriteMap(MediaStoreUtil.MediaInfo mediaInfo) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("url", mediaInfo.url);
            writableMapCreateMap.putString("mediaType", mediaInfo.mimeType);
            writableMapCreateMap.putInt("modificationDate", mediaInfo.dateModified);
            writableMapCreateMap.putInt("size", mediaInfo.fileSize);
            writableMapCreateMap.putString("name", mediaInfo.name);
            writableMapCreateMap.putString(MediaStoreUtil.MediaInfo.RELATIVE_PATH, mediaInfo.relativePath);
            writableMapCreateMap.putString(MediaStoreUtil.MediaInfo.DISPLAY_NAME, mediaInfo.displayName);
            return writableMapCreateMap;
        }

        public static WritableMap toWriteMap(MediaStoreUtil.MediaInfo mediaInfo) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("url", mediaInfo.url);
            if (TextUtils.isEmpty(mediaInfo.mimeType)) {
                writableMapCreateMap.putInt("mediaType", 0);
            } else {
                String lowerCase = mediaInfo.mimeType.toLowerCase();
                if (lowerCase.startsWith("image/")) {
                    writableMapCreateMap.putInt("mediaType", 1);
                } else if (lowerCase.startsWith("video/")) {
                    writableMapCreateMap.putInt("mediaType", 2);
                } else if (lowerCase.startsWith("audio/")) {
                    writableMapCreateMap.putInt("mediaType", 3);
                } else {
                    writableMapCreateMap.putInt("mediaType", 0);
                }
            }
            writableMapCreateMap.putInt("pixelWidth", mediaInfo.width);
            writableMapCreateMap.putInt("pixelHeight", mediaInfo.height);
            writableMapCreateMap.putInt("creationDate", mediaInfo.dateTaken);
            writableMapCreateMap.putInt("modificationDate", mediaInfo.dateModified);
            writableMapCreateMap.putInt("duration", mediaInfo.duration);
            writableMapCreateMap.putString(PHOTO_KEY_UTI, mediaInfo.mimeType);
            return writableMapCreateMap;
        }
    }

    public MIOTPersistModuleCore(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mFileDownloadTaskMap = new ConcurrentHashMap();
    }

    private static long calUploadFilesAllTotalSize(ReadableArray readableArray) {
        long jOptDouble;
        long jOptDouble2;
        if (readableArray == null || readableArray.size() == 0) {
            return 1L;
        }
        int size = readableArray.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            ReadableMap map = MIOTUtils.getMap(readableArray, i);
            if (map != null) {
                String string = MIOTUtils.getString(map, "filepath");
                ReadableMap map2 = MIOTUtils.getMap(map, "range");
                long length = new File(string).length();
                if (length < 0) {
                    length = LockFreeTaskQueueCore.HEAD_MASK;
                }
                if (map2 != null) {
                    jOptDouble = (long) RnReadableMapUtil.optDouble(map2, StatConstants.PARAM_START);
                    jOptDouble2 = (long) RnReadableMapUtil.optDouble(map2, "length");
                } else {
                    jOptDouble = 0;
                    jOptDouble2 = length;
                }
                if (jOptDouble > length) {
                    jOptDouble = length;
                }
                if (jOptDouble < 0) {
                    jOptDouble = 0;
                }
                long j2 = length - jOptDouble;
                if (jOptDouble2 > j2 || jOptDouble2 < 1) {
                    jOptDouble2 = j2;
                }
                j += jOptDouble2;
            }
        }
        if (j >= 1) {
            return j;
        }
        RnPluginLog.addPluginLog("miot-rn-plugin", "test.test.test", "upload 上传文件，文件长度太大，已经超出了totalSize的范围");
        return 1L;
    }

    private void captureRef(int i, JSONObject jSONObject, final Callback callback) {
        int i2;
        DisplayMetrics displayMetrics = getReactApplicationContext().getResources().getDisplayMetrics();
        String strOptString = jSONObject.optString("format");
        double dOptDouble = jSONObject.optDouble("quality");
        String strOptString2 = jSONObject.optString("result");
        Boolean boolValueOf = Boolean.valueOf(jSONObject.optBoolean("snapshotContentContainer"));
        String strOptString3 = jSONObject.optString("fileName");
        Integer numValueOf = jSONObject.has("width") ? Integer.valueOf((int) (((double) displayMetrics.density) * jSONObject.optDouble("width"))) : null;
        Integer numValueOf2 = jSONObject.has("height") ? Integer.valueOf((int) (((double) displayMetrics.density) * jSONObject.optDouble("height"))) : null;
        if ("jpg".equals(strOptString)) {
            i2 = 0;
        } else if ("webm".equals(strOptString)) {
            i2 = 2;
        } else {
            i2 = "raw".equals(strOptString) ? -1 : 1;
        }
        final boolean[] zArr = {false};
        try {
            File file = new File(getPathName(strOptString3));
            if (file.exists()) {
                file.delete();
            }
            try {
                ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new ViewShot(i, strOptString, i2, dOptDouble, numValueOf, numValueOf2, file, strOptString2, boolValueOf, getReactApplicationContext(), getCurrentActivity(), new Promise() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.19
                    @Override // com.facebook.react.bridge.Promise
                    public void reject(String str, String str2) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        try {
                            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(str2));
                        } catch (Exception e) {
                            RnPluginLog.e(e.toString());
                        }
                    }

                    @Override // com.facebook.react.bridge.Promise
                    public void resolve(Object obj) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        try {
                            callback.invoke(Boolean.TRUE, obj.toString());
                        } catch (Exception e) {
                            RnPluginLog.e(e.toString());
                        }
                    }

                    @Override // com.facebook.react.bridge.Promise
                    public void reject(String str, Throwable th) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        try {
                            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(th.toString()));
                        } catch (Exception e) {
                            RnPluginLog.e(e.toString());
                        }
                    }

                    @Override // com.facebook.react.bridge.Promise
                    public void reject(String str, String str2, Throwable th) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        try {
                            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(str2));
                        } catch (Exception e) {
                            RnPluginLog.e(e.toString());
                        }
                    }

                    @Override // com.facebook.react.bridge.Promise
                    public void reject(String str) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        try {
                            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(str));
                        } catch (Exception e) {
                            RnPluginLog.e(e.toString());
                        }
                    }

                    @Override // com.facebook.react.bridge.Promise
                    public void reject(Throwable th) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        try {
                            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(th.toString()));
                        } catch (Exception e) {
                            RnPluginLog.e(e.toString());
                        }
                    }

                    @Override // com.facebook.react.bridge.Promise
                    public void reject(String str, WritableMap writableMap) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        try {
                            callback.invoke(Boolean.FALSE, writableMap.toString());
                        } catch (Exception e) {
                            RnPluginLog.e(e.toString());
                        }
                    }

                    @Override // com.facebook.react.bridge.Promise
                    public void reject(Throwable th, WritableMap writableMap) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        try {
                            writableMap.putString("throwable", Log.getStackTraceString(th));
                            callback.invoke(Boolean.FALSE, writableMap.toString());
                        } catch (Exception e) {
                            RnPluginLog.e(e.toString());
                        }
                    }

                    @Override // com.facebook.react.bridge.Promise
                    public void reject(String str, Throwable th, WritableMap writableMap) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        try {
                            writableMap.putString("throwable", Log.getStackTraceString(th));
                            callback.invoke(Boolean.FALSE, writableMap.toString());
                        } catch (Exception e) {
                            RnPluginLog.e(e.toString());
                        }
                    }

                    @Override // com.facebook.react.bridge.Promise
                    public void reject(String str, String str2, Throwable th, WritableMap writableMap) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        try {
                            callback.invoke(Boolean.FALSE, str2);
                        } catch (Exception e) {
                            RnPluginLog.e(e.toString());
                        }
                    }

                    @Override // com.facebook.react.bridge.Promise
                    public void reject(String str, String str2, WritableMap writableMap) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        try {
                            callback.invoke(Boolean.FALSE, str2);
                        } catch (Exception e) {
                            RnPluginLog.e(e.toString());
                        }
                    }
                }));
            } catch (Throwable th) {
                th = th;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                try {
                    callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(th.toString()));
                } catch (Exception e) {
                    RnPluginLog.e(e.toString());
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private Object[] getDownloadFileLengthAndUrl(String str, HashMap<String, Object> map, int i, int i2, boolean z) throws Exception {
        HttpURLConnection httpURLConnectionCreateConnection = getConnectionProvider().createConnection(str, z);
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    httpURLConnectionCreateConnection.setRequestProperty(URLEncoder.encode(entry.getKey()), URLEncoder.encode(value.toString()));
                }
            }
        }
        httpURLConnectionCreateConnection.setConnectTimeout(i);
        httpURLConnectionCreateConnection.setReadTimeout(i2);
        httpURLConnectionCreateConnection.connect();
        int responseCode = httpURLConnectionCreateConnection.getResponseCode();
        long contentLengthFromNetConnect = getContentLengthFromNetConnect(httpURLConnectionCreateConnection);
        if (responseCode != 200 && (responseCode == 301 || responseCode == 302 || responseCode == 307 || responseCode == 308)) {
            str = httpURLConnectionCreateConnection.getHeaderField(SimpleRequest.LOCATION);
            httpURLConnectionCreateConnection.disconnect();
            httpURLConnectionCreateConnection = getConnectionProvider().createConnection(str, z);
            httpURLConnectionCreateConnection.setConnectTimeout(i);
            httpURLConnectionCreateConnection.setReadTimeout(i2);
            httpURLConnectionCreateConnection.connect();
            contentLengthFromNetConnect = getContentLengthFromNetConnect(httpURLConnectionCreateConnection);
        }
        Object[] objArr = {Long.valueOf(contentLengthFromNetConnect), str};
        httpURLConnectionCreateConnection.disconnect();
        return objArr;
    }

    private File getFileFromContentUri(Uri uri, Context context) {
        if (uri == null) {
            return null;
        }
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            cursorQuery.moveToFirst();
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
            cursorQuery.close();
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return new File(string);
        } catch (Exception e) {
            RnPluginLog.e(e.toString());
            return null;
        }
    }

    private File getFileFromUri(Uri uri) {
        if (uri == null || uri.getScheme() == null) {
            return null;
        }
        RnPluginLog.d("upload file uri : " + uri.toString());
        String scheme = uri.getScheme();
        scheme.hashCode();
        if (scheme.equals("file")) {
            if (uri.getPath() == null) {
                return null;
            }
            return new File(uri.getPath());
        }
        if (scheme.equals(MiuiCursorConstants.CONTENT)) {
            return getFileFromContentUri(uri, getContext());
        }
        return null;
    }

    private static String getMimeType(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    private String getUnZipFileAbsPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return getFilesPath().getPath();
        }
        return getFilesPath() + File.separator + str;
    }

    private void initAlbumLegalModelSetIfNeed() {
        if (this.mAlbumLegalModelSet == null) {
            HashSet hashSet = new HashSet();
            this.mAlbumLegalModelSet = hashSet;
            hashSet.add("xiaomi.router.ra70");
            this.mAlbumLegalModelSet.add("xiaomi.router.r3g");
            this.mAlbumLegalModelSet.add("xiaomi.router.r3gv2");
            this.mAlbumLegalModelSet.add("lumi.camera.gwagl01");
            this.mAlbumLegalModelSet.add("lumi.camera.aq1");
            this.mAlbumLegalModelSet.add("xiaomi.controller.v1");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:126:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v29, types: [z07] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public /* synthetic */ void lambda$copyFile$8(String str, String str2, String str3, Callback callback, Integer num) {
        File file;
        boolean zExists;
        z07 z07VarF;
        Uri uriK;
        ?? r8;
        ?? r6;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        ParcelFileDescriptor parcelFileDescriptor;
        BufferedOutputStream bufferedOutputStream2;
        BufferedInputStream bufferedInputStream2;
        ParcelFileDescriptor parcelFileDescriptor2;
        BufferedOutputStream bufferedOutputStream3;
        BufferedInputStream bufferedInputStream3;
        ParcelFileDescriptor parcelFileDescriptor3;
        IOException iOException;
        StringBuilder sb;
        ?? r9;
        Uri uriPathToUri = pathToUri(str);
        ?? r10 = "file %s already exist";
        if (!TextUtils.isEmpty(str2)) {
            ?? H = str2;
            if (MediaStoreUtil.isReadableExternalPath(getContext(), H)) {
                try {
                    z07 z07VarG = z07.g(getContext(), uriPathToUri);
                    String strJ = z07VarG.j();
                    if (!MediaStoreUtil.isReadableExternalPath(getContext(), str)) {
                        strJ = getMimeType(getPathName(str));
                    }
                    String str4 = strJ;
                    String strI = TextUtils.isEmpty(str3) ? z07VarG.i() : str3;
                    H = z07.h(getContext(), Uri.parse(str2));
                    z07VarF = H.e(strI);
                    if (z07VarF != null) {
                        try {
                            if (z07VarF.d()) {
                                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-2, String.format("file %s already exist", str3)));
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r9 = H;
                            Boolean bool = Boolean.FALSE;
                            callback.invoke(bool, RnCallbackMapUtil.getCommonErrorMap(-4, "copy file error,detail:" + th.getMessage()));
                            uriK = null;
                            r6 = bool;
                            r8 = r9;
                        }
                    }
                    z07VarF = H.b(str4, strI);
                    if (z07VarF == null) {
                        callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-5, "copy file error,detail: create file error"));
                        return;
                    } else {
                        uriK = z07VarF.k();
                        r6 = strI;
                        r8 = H;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z07VarF = null;
                    r9 = H;
                }
            } else {
                if (!checkFileNameValidCallBack(str3, callback)) {
                    return;
                }
                file = new File(getPathName(str3));
                zExists = file.exists();
                if (zExists) {
                    callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-2, String.format("file %s already exist", str3)));
                    return;
                }
                try {
                    file.createNewFile();
                    z07VarF = z07.f(file);
                    uriK = z07VarF.k();
                    r6 = zExists;
                    r8 = file;
                } catch (IOException e) {
                    MRnLog.w("MIOTFile", "copy file,create file error:", e);
                    callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-5, "copy file error,detail: create file error"));
                    return;
                }
            }
        } else {
            if (!checkFileNameValidCallBack(str3, callback)) {
                return;
            }
            file = new File(getPathName(str3));
            zExists = file.exists();
            if (zExists) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-2, String.format("file %s already exist", str3)));
                return;
            }
            file.createNewFile();
            z07VarF = z07.f(file);
            uriK = z07VarF.k();
            r6 = zExists;
            r8 = file;
        }
        try {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptorUtil.open(getContext(), uriPathToUri, 268435456);
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpen2 = ParcelFileDescriptorUtil.open(getContext(), uriK, 805306368);
                    BufferedInputStream bufferedInputStream4 = new BufferedInputStream(new FileInputStream(parcelFileDescriptorOpen.getFileDescriptor()));
                    try {
                        BufferedOutputStream bufferedOutputStream4 = new BufferedOutputStream(new FileOutputStream(parcelFileDescriptorOpen2.getFileDescriptor()));
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = bufferedInputStream4.read(bArr);
                                if (i <= 0) {
                                    break;
                                } else {
                                    bufferedOutputStream4.write(bArr, 0, i);
                                }
                            }
                            bufferedOutputStream4.flush();
                            callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, null, "success"));
                            try {
                                parcelFileDescriptorOpen.close();
                            } catch (IOException e2) {
                                MRnLog.w("MIOTFile", "copyFile,close srcFileDescriptor error," + Log.getStackTraceString(e2));
                            }
                            FileUtils.close(bufferedInputStream4);
                            FileUtils.close(bufferedOutputStream4);
                        } catch (FileNotFoundException e3) {
                            e = e3;
                            parcelFileDescriptor3 = parcelFileDescriptorOpen;
                            bufferedOutputStream3 = bufferedOutputStream4;
                            bufferedInputStream3 = bufferedInputStream4;
                            z07VarF.c();
                            MRnLog.w("MIOTFile", "copyFile error:" + Log.getStackTraceString(e));
                            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-3, "file not found,detail:" + e.getMessage()));
                            r6 = bufferedInputStream3;
                            r8 = parcelFileDescriptor3;
                            r10 = bufferedOutputStream3;
                            if (parcelFileDescriptor3 != null) {
                                try {
                                    parcelFileDescriptor3.close();
                                    r6 = bufferedInputStream3;
                                    r8 = parcelFileDescriptor3;
                                    r10 = bufferedOutputStream3;
                                } catch (IOException e4) {
                                    iOException = e4;
                                    sb = new StringBuilder();
                                    r6 = bufferedInputStream3;
                                    r10 = bufferedOutputStream3;
                                    sb.append("copyFile,close srcFileDescriptor error,");
                                    sb.append(Log.getStackTraceString(iOException));
                                    MRnLog.w("MIOTFile", sb.toString());
                                    FileUtils.close(r6);
                                    FileUtils.close(r10);
                                }
                            }
                            FileUtils.close(r6);
                            FileUtils.close(r10);
                        } catch (IOException e5) {
                            e = e5;
                            parcelFileDescriptor2 = parcelFileDescriptorOpen;
                            bufferedOutputStream2 = bufferedOutputStream4;
                            bufferedInputStream2 = bufferedInputStream4;
                            z07VarF.c();
                            MRnLog.w("MIOTFile", "copyFile error:" + Log.getStackTraceString(e));
                            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-4, "copy file error,detail:" + e.getMessage()));
                            r6 = bufferedInputStream2;
                            r8 = parcelFileDescriptor2;
                            r10 = bufferedOutputStream2;
                            if (parcelFileDescriptor2 != null) {
                                try {
                                    parcelFileDescriptor2.close();
                                    r6 = bufferedInputStream2;
                                    r8 = parcelFileDescriptor2;
                                    r10 = bufferedOutputStream2;
                                } catch (IOException e6) {
                                    iOException = e6;
                                    sb = new StringBuilder();
                                    r6 = bufferedInputStream2;
                                    r10 = bufferedOutputStream2;
                                    sb.append("copyFile,close srcFileDescriptor error,");
                                    sb.append(Log.getStackTraceString(iOException));
                                    MRnLog.w("MIOTFile", sb.toString());
                                    FileUtils.close(r6);
                                    FileUtils.close(r10);
                                }
                            }
                            FileUtils.close(r6);
                            FileUtils.close(r10);
                        } catch (Throwable th3) {
                            th = th3;
                            parcelFileDescriptor = parcelFileDescriptorOpen;
                            bufferedOutputStream = bufferedOutputStream4;
                            bufferedInputStream = bufferedInputStream4;
                            z07VarF.c();
                            MRnLog.w("MIOTFile", "copyFile error:" + Log.getStackTraceString(th));
                            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-4, "copy file error,detail:" + th.getMessage()));
                            r6 = bufferedInputStream;
                            r8 = parcelFileDescriptor;
                            r10 = bufferedOutputStream;
                            if (parcelFileDescriptor != null) {
                                try {
                                    parcelFileDescriptor.close();
                                    r6 = bufferedInputStream;
                                    r8 = parcelFileDescriptor;
                                    r10 = bufferedOutputStream;
                                } catch (IOException e7) {
                                    iOException = e7;
                                    sb = new StringBuilder();
                                    r6 = bufferedInputStream;
                                    r10 = bufferedOutputStream;
                                    sb.append("copyFile,close srcFileDescriptor error,");
                                    sb.append(Log.getStackTraceString(iOException));
                                    MRnLog.w("MIOTFile", sb.toString());
                                    FileUtils.close(r6);
                                    FileUtils.close(r10);
                                }
                            }
                            FileUtils.close(r6);
                            FileUtils.close(r10);
                        }
                    } catch (FileNotFoundException e8) {
                        e = e8;
                        bufferedOutputStream3 = null;
                        parcelFileDescriptor3 = parcelFileDescriptorOpen;
                        bufferedInputStream3 = bufferedInputStream4;
                    } catch (IOException e9) {
                        e = e9;
                        bufferedOutputStream2 = null;
                        parcelFileDescriptor2 = parcelFileDescriptorOpen;
                        bufferedInputStream2 = bufferedInputStream4;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedOutputStream = null;
                        parcelFileDescriptor = parcelFileDescriptorOpen;
                        bufferedInputStream = bufferedInputStream4;
                    }
                } catch (FileNotFoundException e10) {
                    e = e10;
                    bufferedOutputStream3 = null;
                    parcelFileDescriptor3 = parcelFileDescriptorOpen;
                    bufferedInputStream3 = null;
                } catch (IOException e11) {
                    e = e11;
                    bufferedOutputStream2 = null;
                    parcelFileDescriptor2 = parcelFileDescriptorOpen;
                    bufferedInputStream2 = null;
                } catch (Throwable th5) {
                    th = th5;
                    bufferedOutputStream = null;
                    parcelFileDescriptor = parcelFileDescriptorOpen;
                    bufferedInputStream = null;
                }
            } catch (Throwable th6) {
                if (r8 != 0) {
                    try {
                        r8.close();
                    } catch (IOException e12) {
                        MRnLog.w("MIOTFile", "copyFile,close srcFileDescriptor error," + Log.getStackTraceString(e12));
                    }
                }
                FileUtils.close(r6);
                FileUtils.close(r10);
                throw th6;
            }
        } catch (FileNotFoundException e13) {
            e = e13;
            bufferedOutputStream3 = null;
            bufferedInputStream3 = null;
            parcelFileDescriptor3 = null;
        } catch (IOException e14) {
            e = e14;
            bufferedOutputStream2 = null;
            bufferedInputStream2 = null;
            parcelFileDescriptor2 = null;
        } catch (Throwable th7) {
            th = th7;
            bufferedOutputStream = null;
            bufferedInputStream = null;
            parcelFileDescriptor = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$downloadFile$5(final String str, final String str2, final Callback callback, Integer num) throws Throwable {
        downloadSupportBreakLoad(str, str2, null, getPathName(str), 60000, 60000, null, null, new Callback() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.2
            @Override // com.facebook.react.bridge.Callback
            public void invoke(Object... objArr) {
                if (!((Boolean) objArr[0]).booleanValue()) {
                    callback.invoke(objArr);
                } else if (objArr[1] == null) {
                    MIOTPersistModuleCore.this.sendFileDownloadProgressEvent(str2, str, ((Long) objArr[2]).longValue(), ((Long) objArr[3]).longValue());
                } else {
                    callback.invoke(objArr);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryFile$9(String[] strArr, int i, int i2, Callback callback, Integer num) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        try {
            Iterator<MediaStoreUtil.MediaInfo> it = MediaStoreUtil.queryFile(getContext(), strArr, i, i2).iterator();
            while (it.hasNext()) {
                writableArrayCreateArray.pushMap(MIOTFile.toFileInfoWriteMap(it.next()));
            }
            callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(writableArrayCreateArray));
        } catch (Exception e) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-2, "internal error:" + Log.getStackTraceString(e)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$readFile$1(Callback callback, String str, Integer num) {
        try {
            callback.invoke(Boolean.TRUE, new String(readByte(getPathName(str))));
        } catch (Throwable th) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("fileName: " + str + "  " + Log.getStackTraceString(th)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$readFileInfo$0(String str, String str2, Callback callback, Integer num) {
        try {
            String pathName = getPathName(str);
            File file = new File(pathName);
            RnPluginLog.d("readFileInfo,fileName:" + str + ",type:" + str2);
            if (!file.exists() || !file.isFile()) {
                RnPluginLog.d("readFileInfo,file not exist or not a file");
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("file not exist or not a file"));
                return;
            }
            if (!TextUtils.equals("micloud_file_create", str2)) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("name", file.getName());
                writableMapCreateMap.putInt(MediaStoreUtil.MediaInfo.SIZE, (int) file.length());
                writableMapCreateMap.putString("mimeType", getMimeType(pathName));
                int iLastModified = (int) (file.lastModified() / 1000);
                writableMapCreateMap.putInt("modifyTime", iLastModified);
                writableMapCreateMap.putInt("createTime", iLastModified);
                String strFileToSHA1 = SecryptUtil.fileToSHA1(pathName);
                if (TextUtils.isEmpty(strFileToSHA1)) {
                    callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("fileToSHA1 fail"));
                    return;
                }
                writableMapCreateMap.putString("sha1", strFileToSHA1);
                RnPluginLog.d("readFileInfo,fileToSHA1:" + strFileToSHA1);
                callback.invoke(Boolean.TRUE, writableMapCreateMap);
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(pathName, "r");
            int length = (int) randomAccessFile.length();
            RnPluginLog.d("readFileInfo,totalLength:" + length);
            if (length < 0) {
                RnPluginLog.d("readFileInfo,file length illegal");
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("file length illegal"));
                return;
            }
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            for (int i = 0; i < length; i += 4194304) {
                int i2 = length - i;
                if (i2 >= 4194304) {
                    i2 = 4194304;
                }
                String strFileSegmentToSHA1 = SecryptUtil.fileSegmentToSHA1(randomAccessFile, i, i2);
                String fileSegmentMD5 = MD5Util.getFileSegmentMD5(randomAccessFile, i, i2);
                RnPluginLog.d("readFileInfo,off:" + i + ",len:" + i2);
                StringBuilder sb = new StringBuilder();
                sb.append("readFileInfo,sha1:");
                sb.append(strFileSegmentToSHA1);
                RnPluginLog.d(sb.toString());
                RnPluginLog.d("readFileInfo,md5:" + fileSegmentMD5);
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putString("sha1", strFileSegmentToSHA1);
                writableMapCreateMap2.putString("md5", fileSegmentMD5);
                writableMapCreateMap2.putInt(MediaStoreUtil.MediaInfo.SIZE, i2);
                writableMapCreateMap2.putInt("offset", i);
                writableNativeArray.pushMap(writableMapCreateMap2);
            }
            callback.invoke(Boolean.TRUE, writableNativeArray);
            randomAccessFile.close();
        } catch (Throwable th) {
            RnPluginLog.d("readFileInfo," + Log.getStackTraceString(th));
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("fileName: " + str + "  " + Log.getStackTraceString(th)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$readFileSegmentToBase64$3(String str, Callback callback, int i, int i2, Integer num) {
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = (TextUtils.isEmpty(str) || !str.contains("test.zip")) ? new RandomAccessFile(getPathName(str), "r") : new RandomAccessFile(new File(getContext().getExternalFilesDir(null), "test.zip"), "r");
            long length = (int) randomAccessFile.length();
            RnPluginLog.d("readFileSegmentToBase64,totalLength:" + length);
            if (length < 0) {
                RnPluginLog.d("readFileSegmentToBase64,file illegal");
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-2, "file illegal"));
                try {
                    randomAccessFile.close();
                    return;
                } catch (IOException unused) {
                    return;
                }
            }
            long j = i;
            if (length <= j) {
                RnPluginLog.d("readFileSegmentToBase64,file off illegal");
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-3, "file off illegal"));
                try {
                    randomAccessFile.close();
                    return;
                } catch (IOException unused2) {
                    return;
                }
            }
            randomAccessFile.seek(j);
            byte[] bArrCopyOf = new byte[i2];
            int i3 = randomAccessFile.read(bArrCopyOf, 0, i2);
            RnPluginLog.d("readFileSegmentToBase64,readLen:" + i3);
            if (i3 < 0) {
                RnPluginLog.d("readFileSegmentToBase64,file read illegal");
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-4, "file read illegal"));
                try {
                    randomAccessFile.close();
                    return;
                } catch (IOException unused3) {
                    return;
                }
            }
            if (i3 < i2) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
            }
            String strEncodeToString = "";
            if (bArrCopyOf != null && bArrCopyOf.length > 0) {
                strEncodeToString = Base64.encodeToString(bArrCopyOf, 2);
                RnPluginLog.d("readFileSegmentToBase64,encodeToString:" + strEncodeToString);
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString(MiuiCursorConstants.CONTENT, strEncodeToString);
            writableMapCreateMap.putDouble("totalLength", length);
            callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(writableMapCreateMap));
        } catch (Throwable th) {
            try {
                RnPluginLog.w("readFileSegmentToBase64,error:" + th.toString());
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-4, "fileName: " + str + "  " + Log.getStackTraceString(th)));
            } finally {
                if (0 != 0) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused4) {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$readFileToBase64$4(Callback callback, String str, Integer num) {
        try {
            callback.invoke(Boolean.TRUE, Base64.encodeToString(readByte(getPathName(str)), 2));
        } catch (Throwable th) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("fileName: " + str + "  " + Log.getStackTraceString(th)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$readFileToHexString$2(Callback callback, String str, Integer num) {
        try {
            callback.invoke(Boolean.TRUE, MIOTUtils.byte2String(readByte(getPathName(str))));
        } catch (Throwable th) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("fileName: " + str + "  " + Log.getStackTraceString(th)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public /* synthetic */ void lambda$screenShotInRect$7(View view, String str, float f, double d, double d2, double d3, double d4, Bitmap.CompressFormat compressFormat, Callback callback) throws Throwable {
        ?? r5 = 0;
        r5 = 0;
        r5 = 0;
        r5 = 0;
        try {
            try {
                try {
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    try {
                        String pathName = getPathName(str);
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(pathName));
                        double d5 = f;
                        int i = (int) ((d5 * d) + 0.5d);
                        int i2 = (int) ((d5 * d2) + 0.5d);
                        int width = (int) ((d5 * d3) + 0.5d);
                        int height = (int) ((d5 * d4) + 0.5d);
                        try {
                            if (i + width > drawingCache.getWidth()) {
                                width = drawingCache.getWidth() - i;
                            }
                            if (i2 + height > drawingCache.getHeight()) {
                                height = drawingCache.getHeight() - i2;
                            }
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawingCache, i, i2, width, height);
                            Bitmap.CompressFormat compressFormat2 = compressFormat;
                            bitmapCreateBitmap.compress(compressFormat2, 90, bufferedOutputStream);
                            view.setDrawingCacheEnabled(false);
                            callback.invoke(Boolean.TRUE, pathName);
                            bufferedOutputStream.close();
                            r5 = compressFormat2;
                        } catch (Exception e) {
                            e = e;
                            r5 = bufferedOutputStream;
                            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(Log.getStackTraceString(e)));
                            if (r5 != 0) {
                                r5.close();
                                r5 = r5;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r5 = bufferedOutputStream;
                            if (r5 != 0) {
                                try {
                                    r5.close();
                                } catch (Exception unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Exception unused2) {
                }
            } catch (Exception e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$ungzipFileToString$6(String str, Callback callback, String str2, Integer num) {
        if (checkFileNameValidCallBack(str, callback)) {
            File file = new File(getPathName(str));
            if (!file.exists()) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-2, file.getAbsolutePath() + " is not exists"));
                return;
            }
            if (!file.isFile()) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-3, file.getAbsolutePath() + " is not a file"));
                return;
            }
            try {
                byte[] bArrUncompress = ZipUtil.uncompress(file);
                if (bArrUncompress == null) {
                    callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-4, "ungzipToString failed:internal error"));
                } else {
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "base-64";
                    }
                    callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(StringUtil.encode(bArrUncompress, str2)));
                }
            } catch (Throwable th) {
                MRnLog.w("MIOTFile", "ungzipToString error:", th);
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-5, Log.getStackTraceString(th)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$uploadFile$10(final String str, String str2, ReadableMap readableMap, ReadableMap readableMap2, WritableArray writableArray, boolean z, final Callback callback, Integer num) {
        HashMap<String, Object> hashMap;
        if (readableMap == null) {
            hashMap = null;
        } else {
            try {
                hashMap = readableMap.toHashMap();
            } catch (Exception e) {
                e = e;
                callback.invoke(Boolean.FALSE, Log.getStackTraceString(e));
            }
        }
        try {
            upload(str, str2, hashMap, readableMap2 != null ? readableMap2.toHashMap() : null, writableArray, z, new Callback() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.17
                @Override // com.facebook.react.bridge.Callback
                public void invoke(Object... objArr) {
                    if (objArr == null || objArr.length <= 2 || objArr[1] != null) {
                        callback.invoke(objArr);
                        return;
                    }
                    try {
                        MIOTPersistModuleCore.this.sendFileUploadProgressEvent(str, objArr[2].toString(), ((Long) objArr[3]).longValue(), ((Long) objArr[4]).longValue());
                    } catch (Exception e2) {
                        RnPluginLog.e(e2.toString());
                    }
                }
            });
        } catch (Exception e2) {
            e = e2;
            callback.invoke(Boolean.FALSE, Log.getStackTraceString(e));
        }
    }

    private void removeDownloadFileTask(String str) {
        Map<String, DownloadFileTask> map;
        if (TextUtils.isEmpty(str) || (map = this.mFileDownloadTaskMap) == null) {
            return;
        }
        map.remove(str);
    }

    private void saveFilePub(final String str, final Callback callback) {
        int i = Build.VERSION.SDK_INT;
        if (i > 29 || (i == 29 && !Environment.isExternalStorageLegacy())) {
            RnPluginLog.d("saveFilePub, sdk >= Q and not legacy");
            p4h.h(0).y(pfl.c()).t(new tc0<Integer>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.4
                @Override // defpackage.tc0
                @RequiresApi(api = 8)
                public void call(Integer num) {
                    try {
                        Context context = MIOTPersistModuleCore.this.getContext();
                        String str2 = str;
                        boolean zInsertFileToMediaStore = FileUtils.insertFileToMediaStore(context, str2, MIOTPersistModuleCore.this.getPathName(str2));
                        RnPluginLog.d("saveFilePub, sdk >= Q and not legacy isSuccess:" + zInsertFileToMediaStore);
                        if (zInsertFileToMediaStore) {
                            callback.invoke(Boolean.TRUE);
                        } else {
                            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-2, "insertFileToMediaStore fail"));
                        }
                    } catch (Throwable th) {
                        callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, th.toString()));
                        RnPluginLog.w("saveFilePub, insertFileToMediaStore error:" + Log.getStackTraceString(th));
                    }
                }
            });
        } else {
            RnPluginLog.d("saveFilePub, sdk < Q or legacy");
            p4h.h(0).y(pfl.c()).t(new tc0<Integer>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.5
                @Override // defpackage.tc0
                @RequiresApi(api = 8)
                public void call(Integer num) {
                    try {
                        String str2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath() + File.separator + str;
                        if (FileUtils.copyFileToFile(MIOTPersistModuleCore.this.getPathName(str), str2)) {
                            callback.invoke(Boolean.TRUE);
                        } else {
                            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-2, "copyFileToFile fail"));
                        }
                        try {
                            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                            intent.setData(Uri.fromFile(new File(str2)));
                            MIOTPersistModuleCore.this.getCurrentActivity().sendBroadcast(intent);
                        } catch (Throwable th) {
                            RnPluginLog.w("saveFilePub, send ACTION_MEDIA_SCANNER_SCAN_FILE broadcast error:" + Log.getStackTraceString(th));
                        }
                    } catch (Exception e) {
                        callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("saveFile error:" + e.getMessage()));
                    }
                }
            });
        }
    }

    private void saveImageToPhotosDidAlbumPub(final String str, String str2, final Callback callback) {
        final String pathName = getPathName(str2);
        final String strGenerateFileNameByTime = FileUtils.generateFileNameByTime(1, IOUtils.getImageFileSuffixName(str2));
        p4h.h(0).y(pfl.c()).t(new tc0<Integer>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.6
            @Override // defpackage.tc0
            @RequiresApi(api = 8)
            public void call(Integer num) throws Throwable {
                WritableMap commonErrorMap;
                try {
                    MediaStoreUtil.insertImage(MIOTPersistModuleCore.this.getContext(), pathName, str, strGenerateFileNameByTime);
                    callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonErrorMap(0, "success"));
                } catch (MediaStoreUtil.AccessMediaError e) {
                    int errorCode = e.getErrorCode();
                    if (errorCode == -6) {
                        commonErrorMap = RnCallbackMapUtil.getCommonErrorMap(-5, "filepath cannot convert to a image");
                    } else if (errorCode != -5) {
                        commonErrorMap = errorCode != -1 ? RnCallbackMapUtil.getCommonErrorMap(-100, "failed to save image") : RnCallbackMapUtil.getCommonErrorMap(-3, "path is illegal or file not exist");
                    } else {
                        commonErrorMap = RnCallbackMapUtil.getCommonErrorMap(-2, "albumName is illegal");
                    }
                    callback.invoke(Boolean.FALSE, commonErrorMap);
                } catch (Exception e2) {
                    callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-100, "saveImageToPhotosDidAlbumPub error:" + e2.getMessage()));
                }
            }
        });
    }

    private void saveVideoToPhotosDidAlbumPub(final String str, String str2, final Callback callback) {
        final String pathName = getPathName(str2);
        final String strGenerateFileNameByTime = FileUtils.generateFileNameByTime(2, null);
        p4h.h(0).y(pfl.c()).t(new tc0<Integer>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.16
            @Override // defpackage.tc0
            @RequiresApi(api = 10)
            public void call(Integer num) throws Throwable {
                WritableMap commonErrorMap;
                try {
                    MediaStoreUtil.insertVideo(MIOTPersistModuleCore.this.getContext(), pathName, str, strGenerateFileNameByTime);
                    callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonErrorMap(0, "success"));
                } catch (MediaStoreUtil.AccessMediaError e) {
                    int errorCode = e.getErrorCode();
                    if (errorCode == -7) {
                        commonErrorMap = RnCallbackMapUtil.getCommonErrorMap(-4, "filepath cannot seek to be video file");
                    } else if (errorCode != -5) {
                        commonErrorMap = errorCode != -1 ? RnCallbackMapUtil.getCommonErrorMap(-100, "failed to save video") : RnCallbackMapUtil.getCommonErrorMap(-3, "path is illegal or file not exist");
                    } else {
                        commonErrorMap = RnCallbackMapUtil.getCommonErrorMap(-2, "albumName is illegal");
                    }
                    callback.invoke(Boolean.FALSE, commonErrorMap);
                } catch (Exception e2) {
                    callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-100, "saveVideoToPhotosDidAlbumPub error:" + e2.getMessage()));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendFileUploadProgressEvent(String str, String str2, long j, long j2) {
        getEventProvider().sendUploadProgressEvent(str, str2, j, j2);
    }

    private boolean taskIsCancelLoadFile(String str) {
        Map<String, DownloadFileTask> map;
        DownloadFileTask downloadFileTask;
        return (TextUtils.isEmpty(str) || (map = this.mFileDownloadTaskMap) == null || (downloadFileTask = map.get(str)) == null || downloadFileTask.downloadStatus != DownloadFileTask.STATUS_DOWNLOAD_CANCEL) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:103:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0198 A[EDGE_INSN: B:117:0x0198->B:62:0x0198 BREAK  A[LOOP:2: B:59:0x0189->B:61:0x018f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0076 A[Catch: all -> 0x008b, TryCatch #6 {all -> 0x008b, blocks: (B:18:0x0068, B:19:0x0070, B:21:0x0076, B:27:0x0096, B:26:0x008e), top: B:105:0x0068 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    /* JADX WARN: Code duplicated, block: B:26:0x008e A[Catch: all -> 0x008b, TryCatch #6 {all -> 0x008b, blocks: (B:18:0x0068, B:19:0x0070, B:21:0x0076, B:27:0x0096, B:26:0x008e), top: B:105:0x0068 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5 A[Catch: all -> 0x0125, TRY_LEAVE, TryCatch #3 {all -> 0x0125, blocks: (B:30:0x009f, B:32:0x00a5), top: B:99:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d8 A[Catch: all -> 0x00f9, TryCatch #5 {all -> 0x00f9, blocks: (B:35:0x00ce, B:37:0x00d8, B:42:0x00ff), top: B:103:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ff A[Catch: all -> 0x00f9, TRY_LEAVE, TryCatch #5 {all -> 0x00f9, blocks: (B:35:0x00ce, B:37:0x00d8, B:42:0x00ff), top: B:103:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:48:0x012e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0161 A[Catch: all -> 0x017f, LOOP:1: B:52:0x015b->B:54:0x0161, LOOP_END, TryCatch #9 {all -> 0x017f, blocks: (B:51:0x014b, B:52:0x015b, B:54:0x0161, B:58:0x0184, B:59:0x0189, B:61:0x018f, B:62:0x0198), top: B:111:0x014b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x018f A[Catch: all -> 0x017f, LOOP:2: B:59:0x0189->B:61:0x018f, LOOP_END, TryCatch #9 {all -> 0x017f, blocks: (B:51:0x014b, B:52:0x015b, B:54:0x0161, B:58:0x0184, B:59:0x0189, B:61:0x018f, B:62:0x0198), top: B:111:0x014b }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0222 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:77:0x0227 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:79:0x022c A[DONT_GENERATE] */
    public static void uploadToFDS(String str, String str2, HashMap<String, Object> map, HashMap<String, Object> map2, ReadableArray readableArray, Callback callback) throws Exception {
        DataOutputStream dataOutputStream;
        BufferedReader bufferedReader;
        HttpURLConnection httpURLConnection;
        long j;
        long j2;
        int i;
        String string;
        ReadableMap map3;
        BufferedInputStream bufferedInputStream;
        WritableMap writableMapCreateMap;
        StringBuilder sb;
        String line;
        Object string2;
        int i2;
        byte[] bArr;
        FileInputStream fileInputStream;
        int i3;
        long length;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setDoInput(true);
                httpURLConnection2.setRequestMethod(str2);
                if (map != null) {
                    try {
                        for (Map.Entry<String, Object> entry : map.entrySet()) {
                            Object value = entry.getValue();
                            if (value != null) {
                                httpURLConnection2.setRequestProperty(entry.getKey(), value.toString());
                            }
                        }
                        RnNetReport.reportUploadFileURL(str);
                        dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                        if (map2 != null) {
                            try {
                                for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                                    entry2.getKey();
                                    if (entry2.getValue() == null) {
                                        string = "";
                                    } else {
                                        string = entry2.getValue().toString();
                                    }
                                    dataOutputStream.writeBytes(string);
                                    dataOutputStream.writeBytes("\r\n");
                                }
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = null;
                                i = 1;
                                httpURLConnection = httpURLConnection2;
                                j = 0;
                                j2 = 0;
                                try {
                                    callback.invoke(Boolean.FALSE, Log.getStackTraceString(th), Integer.valueOf(i), Double.valueOf(j), Double.valueOf(j2));
                                } finally {
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (dataOutputStream != null) {
                                        dataOutputStream.close();
                                    }
                                    if (bufferedInputStream2 != null) {
                                        bufferedInputStream2.close();
                                    }
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                }
                            }
                        }
                        try {
                            map3 = MIOTUtils.getMap(readableArray, 0);
                            if (map3 != null) {
                                string2 = MIOTUtils.getString(map3, "filename");
                                File file = new File(MIOTUtils.getString(map3, "filepath"));
                                i2 = 4096;
                                bArr = new byte[4096];
                                fileInputStream = new FileInputStream(file);
                                i3 = fileInputStream.read(bArr, 0, 4096);
                                length = (int) file.length();
                                httpURLConnection = httpURLConnection2;
                                j2 = i3;
                                while (i3 > 0) {
                                    try {
                                        dataOutputStream.write(bArr, 0, i3);
                                        i3 = fileInputStream.read(bArr, 0, i2);
                                        if (i3 == -1) {
                                            callback.invoke(Boolean.TRUE, null, string2, Long.valueOf(j2), Long.valueOf(length));
                                        } else {
                                            byte[] bArr2 = bArr;
                                            j2 += (long) i3;
                                            callback.invoke(Boolean.TRUE, null, string2, Long.valueOf(j2), Long.valueOf(length));
                                            bArr = bArr2;
                                        }
                                        i2 = 4096;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        j = length;
                                        bufferedReader = null;
                                        i = 1;
                                        callback.invoke(Boolean.FALSE, Log.getStackTraceString(th), Integer.valueOf(i), Double.valueOf(j), Double.valueOf(j2));
                                    }
                                }
                                j = length;
                                i = 2;
                            } else {
                                httpURLConnection = httpURLConnection2;
                                i = 1;
                                j = 0;
                                j2 = 0;
                            }
                            try {
                                dataOutputStream.flush();
                                bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                                try {
                                    bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream));
                                    try {
                                        writableMapCreateMap = Arguments.createMap();
                                        for (Map.Entry<String, List<String>> entry3 : httpURLConnection.getHeaderFields().entrySet()) {
                                            writableMapCreateMap.putString(entry3.getKey(), entry3.getValue().get(0));
                                        }
                                        sb = new StringBuilder();
                                        while (true) {
                                            line = bufferedReader.readLine();
                                            if (line != null) {
                                                break;
                                            }
                                            sb.append(line);
                                            sb.append("\n");
                                        }
                                        String string3 = sb.toString();
                                        int responseCode = httpURLConnection.getResponseCode();
                                        WritableMap writableMapCreateMap2 = Arguments.createMap();
                                        writableMapCreateMap2.putMap("header", writableMapCreateMap);
                                        writableMapCreateMap2.putString("data", string3);
                                        writableMapCreateMap2.putInt("status", responseCode);
                                        callback.invoke(Boolean.TRUE, writableMapCreateMap2, Integer.valueOf(i), Double.valueOf(j), Double.valueOf(j2));
                                        httpURLConnection.disconnect();
                                        dataOutputStream.close();
                                        bufferedInputStream.close();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bufferedInputStream2 = bufferedInputStream;
                                        callback.invoke(Boolean.FALSE, Log.getStackTraceString(th), Integer.valueOf(i), Double.valueOf(j), Double.valueOf(j2));
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    bufferedReader = null;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                i = i;
                                bufferedReader = null;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            httpURLConnection = httpURLConnection2;
                            bufferedReader = null;
                            j = 0;
                            j2 = 0;
                            i = 1;
                            callback.invoke(Boolean.FALSE, Log.getStackTraceString(th), Integer.valueOf(i), Double.valueOf(j), Double.valueOf(j2));
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        dataOutputStream = null;
                        bufferedReader = null;
                        i = 1;
                        httpURLConnection = httpURLConnection2;
                        j = 0;
                        j2 = 0;
                        callback.invoke(Boolean.FALSE, Log.getStackTraceString(th), Integer.valueOf(i), Double.valueOf(j), Double.valueOf(j2));
                    }
                } else {
                    RnNetReport.reportUploadFileURL(str);
                    dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                    if (map2 != null) {
                        while (r13.hasNext()) {
                            entry2.getKey();
                            if (entry2.getValue() == null) {
                                string = "";
                            } else {
                                string = entry2.getValue().toString();
                            }
                            dataOutputStream.writeBytes(string);
                            dataOutputStream.writeBytes("\r\n");
                        }
                    }
                    map3 = MIOTUtils.getMap(readableArray, 0);
                    if (map3 != null) {
                        string2 = MIOTUtils.getString(map3, "filename");
                        File file2 = new File(MIOTUtils.getString(map3, "filepath"));
                        i2 = 4096;
                        bArr = new byte[4096];
                        fileInputStream = new FileInputStream(file2);
                        i3 = fileInputStream.read(bArr, 0, 4096);
                        length = (int) file2.length();
                        httpURLConnection = httpURLConnection2;
                        j2 = i3;
                        while (i3 > 0) {
                            dataOutputStream.write(bArr, 0, i3);
                            i3 = fileInputStream.read(bArr, 0, i2);
                            if (i3 == -1) {
                                callback.invoke(Boolean.TRUE, null, string2, Long.valueOf(j2), Long.valueOf(length));
                            } else {
                                byte[] bArr3 = bArr;
                                j2 += (long) i3;
                                callback.invoke(Boolean.TRUE, null, string2, Long.valueOf(j2), Long.valueOf(length));
                                bArr = bArr3;
                            }
                            i2 = 4096;
                        }
                        j = length;
                        i = 2;
                    } else {
                        httpURLConnection = httpURLConnection2;
                        i = 1;
                        j = 0;
                        j2 = 0;
                    }
                    dataOutputStream.flush();
                    bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                    bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream));
                    writableMapCreateMap = Arguments.createMap();
                    while (r7.hasNext()) {
                        writableMapCreateMap.putString(entry3.getKey(), entry3.getValue().get(0));
                    }
                    sb = new StringBuilder();
                    while (true) {
                        line = bufferedReader.readLine();
                        if (line != null) {
                            break;
                            break;
                        } else {
                            sb.append(line);
                            sb.append("\n");
                        }
                    }
                    String string4 = sb.toString();
                    int responseCode2 = httpURLConnection.getResponseCode();
                    WritableMap writableMapCreateMap3 = Arguments.createMap();
                    writableMapCreateMap3.putMap("header", writableMapCreateMap);
                    writableMapCreateMap3.putString("data", string4);
                    writableMapCreateMap3.putInt("status", responseCode2);
                    callback.invoke(Boolean.TRUE, writableMapCreateMap3, Integer.valueOf(i), Double.valueOf(j), Double.valueOf(j2));
                    httpURLConnection.disconnect();
                    dataOutputStream.close();
                    bufferedInputStream.close();
                }
            } catch (Throwable th8) {
                th = th8;
                httpURLConnection = httpURLConnection2;
                dataOutputStream = null;
                bufferedReader = null;
            }
        } catch (Throwable th9) {
            th = th9;
            dataOutputStream = null;
            bufferedReader = null;
            httpURLConnection = null;
        }
    }

    private void writeByteAsyn(final String str, final byte[] bArr, final boolean z, final Callback callback) {
        p4h.a(new p4h.a<Error>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.15
            @Override // defpackage.tc0
            public void call(xno<? super Error> xnoVar) {
                RandomAccessFile randomAccessFile;
                Throwable th;
                try {
                    FileUtils.makeFileDirectories(str);
                    randomAccessFile = new RandomAccessFile(str, "rw");
                    try {
                        if (z) {
                            randomAccessFile.seek(randomAccessFile.length());
                        } else {
                            randomAccessFile.setLength(0L);
                        }
                        randomAccessFile.write(bArr);
                        xnoVar.onNext(new Error(1, ""));
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            xnoVar.onNext(new Error(-1, Log.getStackTraceString(th)));
                        } finally {
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (IOException unused) {
                                }
                            }
                        }
                    }
                } catch (Throwable th3) {
                    randomAccessFile = null;
                    th = th3;
                }
            }
        }).y(MRnSchedulers.RX1_IO()).l(va1.b()).u(new tc0<Error>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.13
            @Override // defpackage.tc0
            public void call(Error error) {
                if (error.getCode() == 1) {
                    callback.invoke(Boolean.TRUE);
                } else {
                    callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(error.getDetail()));
                }
            }
        }, new tc0<Throwable>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.14
            @Override // defpackage.tc0
            public void call(Throwable th) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(th.toString()));
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public void amapScreenShot(int i, String str, Callback callback) {
        onMethodNotImplamente(" amapScreenShot(int id, final String filename, final com.facebook.react.bridge.Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void appendFile(String str, String str2, Callback callback) {
        if (checkFileNameValidCallBack(str, callback)) {
            try {
                String pathName = getPathName(str);
                if (str2 == null) {
                    str2 = "";
                }
                writeByteAsyn(pathName, str2.getBytes(), true, callback);
            } catch (Exception e) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("appendFile error:" + e.getMessage()));
            }
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void appendFileThroughBase64(String str, String str2, Callback callback) {
        if (checkFileNameValidCallBack(str, callback)) {
            if (str2 == null) {
                str2 = "";
            }
            try {
                writeByteAsyn(getPathName(str), Base64.decode(str2, 2), true, callback);
            } catch (Exception e) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(e.toString()));
            }
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void cancelDownloadFile(String str, Callback callback) {
        if (callback == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("taskId is empty..."));
            return;
        }
        Map<String, DownloadFileTask> map = this.mFileDownloadTaskMap;
        if (map == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("task map is null..."));
            return;
        }
        DownloadFileTask downloadFileTask = map.get(str);
        if (downloadFileTask != null) {
            downloadFileTask.downloadStatus = DownloadFileTask.STATUS_DOWNLOAD_CANCEL;
            callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(Arguments.createMap()));
            return;
        }
        callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("can not find this taskId, taskId is " + str));
    }

    public boolean checkFileNameValidCallBack(String str, Callback callback) {
        if (TextUtils.isEmpty(str)) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("fileName is empty..."));
            return false;
        }
        if (ZipPluginFileUtils.verifyFileAbosolutePath(getFilesPath().toString(), getPathName(str))) {
            return true;
        }
        callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(str + ", this fileName is not valid, cannot contains ..."));
        return false;
    }

    public boolean checkFolderValidCallBack(String str, Callback callback) {
        if (TextUtils.isEmpty(str) || ZipPluginFileUtils.verifyFileAbosolutePath(getFilesPath().toString(), getPathName(str))) {
            return true;
        }
        callback.invoke(Boolean.FALSE, str + ", this folder is not valid, cannot contains ...");
        return false;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public void copyFile(ReadableMap readableMap, final Callback callback) {
        final String strOptString = RnReadableMapUtil.optString(readableMap, "srcPath");
        final String strOptString2 = RnReadableMapUtil.optString(readableMap, "dstPath");
        final String strOptString3 = RnReadableMapUtil.optString(readableMap, "dstDir");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, "invalid srcPath or dstPath"));
        } else if (MediaStoreUtil.isReadableExternalPath(getContext(), strOptString) || checkFileNameValidCallBack(strOptString, callback)) {
            p4h.h(0).y(pfl.c()).b(new tc0() { // from class: vxe
                @Override // defpackage.tc0
                public final void call(Object obj) {
                    this.f37329a.lambda$copyFile$8(strOptString, strOptString3, strOptString2, callback, (Integer) obj);
                }
            }).s();
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public void createMediaWithPoints(ReadableArray readableArray, String str, String str2, ReadableMap readableMap, Callback callback) {
        onMethodNotImplamente(" createMediaWithPoints(ReadableArray pointArray, String type, String fileName, ReadableMap params, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public void cropImage(String str, String str2, ReadableMap readableMap, final Callback callback) {
        File file = new File(getPathName(str));
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        if (file.exists()) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, "targetFile is already exist"));
            return;
        }
        String pathName = getPathName(str2);
        if (!new File(pathName).exists()) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-2, "please specify a sourceFilename"));
            return;
        }
        ImageEditor.CropOption cropOptionConvertRNParams2CropOptions = ImageEditor.convertRNParams2CropOptions(readableMap);
        if (cropOptionConvertRNParams2CropOptions == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-3, "please specify offset and size"));
        } else {
            ImageEditor.cropImage(getReactApplicationContext(), pathName, file, cropOptionConvertRNParams2CropOptions, new CommonCallback<String>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.12
                @Override // com.xiaomi.smarthome.framework.plugin.rn.utils.CommonCallback
                public void onFailed(int i, String str3) {
                    callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(i, str3));
                }

                @Override // com.xiaomi.smarthome.framework.plugin.rn.utils.CommonCallback
                public void onSuccess(String str3) {
                    callback.invoke(Boolean.TRUE, str3);
                }
            });
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void dataLengthOfBase64Data(String str, Callback callback) {
        if (str == null) {
            str = "";
        }
        try {
            callback.invoke(Integer.valueOf(new String(Base64.decode(str, 2)).length()));
        } catch (Throwable th) {
            callback.invoke(0, Boolean.FALSE, Log.getStackTraceString(th));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    @SuppressLint({"NewApi"})
    public final void deleteAssetsFromAlbumByUrls(String str, final ReadableArray readableArray, final Callback callback) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        p4h.h(0).y(pfl.c()).t(new tc0<Integer>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.10
            @Override // defpackage.tc0
            public void call(Integer num) {
                int size = readableArray.size();
                int iDeleteMedia = 0;
                for (int i = 0; i < size; i++) {
                    try {
                        String string = readableArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            try {
                                iDeleteMedia += MediaStoreUtil.deleteMedia(currentActivity, string);
                            } catch (MediaStoreUtil.AccessMediaError e) {
                                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-100, "delete assets failed"));
                                MRnLog.w("MIOTFile", Log.getStackTraceString(e));
                                return;
                            } catch (Exception e2) {
                                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-101, e2.getMessage()));
                                MRnLog.w("MIOTFile", Log.getStackTraceString(e2));
                                return;
                            }
                        }
                    } catch (Exception unused) {
                        callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-3, "urls cannot be parsed to a Array or it is empty"));
                        return;
                    }
                }
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("deleted_count", iDeleteMedia);
                callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, writableMapCreateMap));
            }
        });
    }

    public void deleteFile(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                file.delete();
                return;
            }
            for (File file2 : file.listFiles()) {
                deleteFile(file2);
            }
            file.delete();
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public void deleteFontFile(ReadableMap readableMap, Callback callback) {
        onMethodNotImplamente(" deleteFontFile(ReadableMap param, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void downloadFile(final String str, final String str2, final Callback callback) {
        if (checkFolderValidCallBack(str2, callback)) {
            p4h.h(0).y(MRnSchedulers.RX1_IO()).b(new tc0() { // from class: yxe
                @Override // defpackage.tc0
                public final void call(Object obj) throws Throwable {
                    this.f40663a.lambda$downloadFile$5(str2, str, callback, (Integer) obj);
                }
            }).s();
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public void downloadFileWithParams(String str, String str2, ReadableMap readableMap, Callback callback) {
        onMethodNotImplamente(" downloadFileWithParams(String url, String filename, ReadableMap params, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public void downloadFontFile(ReadableMap readableMap, Callback callback) {
        onMethodNotImplamente(" downloadFontFile(ReadableMap param, Callback callback) haven't been impl");
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0363 A[Catch: Exception -> 0x0366, TRY_ENTER, TRY_LEAVE, TryCatch #20 {Exception -> 0x0366, blocks: (B:132:0x0363, B:104:0x02f0), top: B:173:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:160:0x0374 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x036f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x036a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x035e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0359 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:? A[SYNTHETIC] */
    public void downloadSupportBreakLoad(String str, String str2, HashMap<String, Object> map, String str3, int i, int i2, ReadableMap readableMap, String str4, Callback callback) throws Throwable {
        Response response;
        RandomAccessFile randomAccessFile;
        InputStream inputStream;
        int i3;
        long length;
        RandomAccessFile randomAccessFile2;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            removeDownloadFileTask(str4);
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("url or filePathName is empty"));
            return;
        }
        boolean zOptBoolean = RnReadableMapUtil.optBoolean(readableMap, "allow_private_certificates");
        try {
            Object[] downloadFileLengthAndUrl = getDownloadFileLengthAndUrl(str2, map, i, i2, zOptBoolean);
            if (downloadFileLengthAndUrl.length < 2) {
                removeDownloadFileTask(str4);
                RnPluginLog.e("download file error, file info length is less than 2");
                return;
            }
            if (!TextUtils.isEmpty(str4) && taskIsCancelLoadFile(str4)) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("current task is cancel, task id is " + str4));
                return;
            }
            RnNetReport.reportDownloadFileURL(str2);
            try {
                try {
                    Long l = (Long) downloadFileLengthAndUrl[0];
                    long jLongValue = l.longValue();
                    String string = downloadFileLengthAndUrl[1].toString();
                    File file = new File(getTempFilesPath() + File.separator + MD5Util.MD5_32(str2));
                    randomAccessFile = new RandomAccessFile(file, "rwd");
                    try {
                        long j = 0;
                        if (file.exists()) {
                            try {
                                length = file.length();
                                randomAccessFile.seek(length);
                            } catch (Exception e) {
                                e = e;
                                i3 = 2;
                                response = null;
                                inputStream = null;
                                try {
                                    Object[] objArr = new Object[i3];
                                    objArr[0] = Boolean.FALSE;
                                    objArr[1] = RnCallbackMapUtil.getCommonErrorMap(e.toString());
                                    callback.invoke(objArr);
                                    if (randomAccessFile != null) {
                                        try {
                                            randomAccessFile.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    if (response != null) {
                                        response.close();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    if (randomAccessFile != null) {
                                        try {
                                            randomAccessFile.close();
                                        } catch (IOException unused3) {
                                        }
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused4) {
                                        }
                                    }
                                    if (response != null) {
                                        throw th;
                                    }
                                    try {
                                        response.close();
                                        throw th;
                                    } catch (Exception unused5) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                response = null;
                                inputStream = null;
                                if (randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (response != null) {
                                    throw th;
                                }
                                response.close();
                                throw th;
                            }
                        } else {
                            length = 0;
                        }
                        String str5 = "filename";
                        RandomAccessFile randomAccessFile3 = randomAccessFile;
                        try {
                            if (jLongValue != -1 && jLongValue < length) {
                                removeDownloadFileTask(str4);
                                if (file.exists()) {
                                    file.delete();
                                }
                                RnPluginLog.e("download file, downLoadFileTotalLength is less than downloadedLen..." + jLongValue + "  " + length);
                                WritableMap writableMapCreateMap = Arguments.createMap();
                                writableMapCreateMap.putInt("status", 500);
                                writableMapCreateMap.putString("filename", str);
                                writableMapCreateMap.putString("path", str3);
                                writableMapCreateMap.putMap("header", Arguments.createMap());
                                callback.invoke(Boolean.TRUE, writableMapCreateMap, Double.valueOf(length), Double.valueOf(jLongValue));
                                try {
                                    randomAccessFile3.close();
                                    return;
                                } catch (IOException unused6) {
                                    return;
                                }
                            }
                            try {
                                Response responseExecute = getConnectionProvider().getClient(zOptBoolean).newCall(jLongValue != -1 ? new Request.Builder().url(string).addHeader("Range", "bytes=" + length + "-" + jLongValue).build() : new Request.Builder().url(string).build()).execute();
                                try {
                                    InputStream inputStreamByteStream = responseExecute.body().byteStream();
                                    try {
                                        callback.invoke(Boolean.TRUE, null, Long.valueOf(length), l);
                                        byte[] bArr = new byte[8192];
                                        int eachCallbackTime = getEachCallbackTime(jLongValue);
                                        while (true) {
                                            int i4 = inputStreamByteStream.read(bArr);
                                            inputStream = inputStreamByteStream;
                                            if (i4 == -1) {
                                                break;
                                            }
                                            try {
                                                if (!getRnRuntimeProvider().isInPlugin() || !taskIsLoadingFile(str4)) {
                                                    break;
                                                }
                                                String str6 = str5;
                                                RandomAccessFile randomAccessFile4 = randomAccessFile3;
                                                try {
                                                    randomAccessFile4.write(bArr, 0, i4);
                                                    byte[] bArr2 = bArr;
                                                    randomAccessFile2 = randomAccessFile4;
                                                    length += (long) i4;
                                                    try {
                                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                                        if (jCurrentTimeMillis - j > eachCallbackTime || length == jLongValue) {
                                                            callback.invoke(Boolean.TRUE, null, Long.valueOf(length), l);
                                                            j = jCurrentTimeMillis;
                                                        }
                                                        str5 = str6;
                                                        bArr = bArr2;
                                                        inputStreamByteStream = inputStream;
                                                        randomAccessFile3 = randomAccessFile2;
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        response = responseExecute;
                                                        randomAccessFile = randomAccessFile2;
                                                        i3 = 2;
                                                        Object[] objArr2 = new Object[i3];
                                                        objArr2[0] = Boolean.FALSE;
                                                        objArr2[1] = RnCallbackMapUtil.getCommonErrorMap(e.toString());
                                                        callback.invoke(objArr2);
                                                        if (randomAccessFile != null) {
                                                            randomAccessFile.close();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (response != null) {
                                                            response.close();
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        response = responseExecute;
                                                        randomAccessFile = randomAccessFile2;
                                                        if (randomAccessFile != null) {
                                                            randomAccessFile.close();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (response != null) {
                                                            throw th;
                                                        }
                                                        response.close();
                                                        throw th;
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    randomAccessFile2 = randomAccessFile4;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    randomAccessFile2 = randomAccessFile4;
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                                randomAccessFile2 = randomAccessFile3;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                randomAccessFile2 = randomAccessFile3;
                                            }
                                        }
                                        RandomAccessFile randomAccessFile5 = randomAccessFile3;
                                        String str7 = str5;
                                        if (length >= jLongValue) {
                                            removeDownloadFileTask(str4);
                                            File file2 = new File(str3);
                                            if (file2.exists()) {
                                                file2.delete();
                                            } else {
                                                file2.getParentFile().mkdirs();
                                            }
                                            file.renameTo(file2);
                                            WritableMap writableMapCreateMap2 = Arguments.createMap();
                                            Headers headers = responseExecute.headers();
                                            int size = headers.size();
                                            WritableMap writableMapCreateMap3 = Arguments.createMap();
                                            for (int i5 = 0; i5 < size; i5++) {
                                                writableMapCreateMap3.putString(headers.name(i5), headers.value(i5));
                                            }
                                            writableMapCreateMap2.putInt("status", responseExecute.code());
                                            writableMapCreateMap2.putString(str7, str);
                                            writableMapCreateMap2.putString("path", str3);
                                            writableMapCreateMap2.putMap("header", writableMapCreateMap3);
                                            callback.invoke(Boolean.TRUE, writableMapCreateMap2, Double.valueOf(length), Double.valueOf(jLongValue));
                                        } else if (taskIsCancelLoadFile(str4)) {
                                            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("current task is cancel, task id is " + str4));
                                        }
                                        try {
                                            randomAccessFile5.close();
                                        } catch (IOException unused7) {
                                        }
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused8) {
                                        }
                                        responseExecute.close();
                                    } catch (Exception e5) {
                                        e = e5;
                                        randomAccessFile2 = randomAccessFile3;
                                        inputStream = inputStreamByteStream;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        randomAccessFile2 = randomAccessFile3;
                                        inputStream = inputStreamByteStream;
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    inputStream = null;
                                    i3 = 2;
                                    response = responseExecute;
                                    randomAccessFile = randomAccessFile3;
                                    Object[] objArr3 = new Object[i3];
                                    objArr3[0] = Boolean.FALSE;
                                    objArr3[1] = RnCallbackMapUtil.getCommonErrorMap(e.toString());
                                    callback.invoke(objArr3);
                                    if (randomAccessFile != null) {
                                        randomAccessFile.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (response != null) {
                                        response.close();
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    randomAccessFile2 = randomAccessFile3;
                                    inputStream = null;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                randomAccessFile2 = randomAccessFile3;
                                response = null;
                                inputStream = null;
                            } catch (Throwable th8) {
                                th = th8;
                                randomAccessFile2 = randomAccessFile3;
                                response = null;
                                inputStream = null;
                            }
                        } catch (Exception e8) {
                            e = e8;
                            randomAccessFile = randomAccessFile3;
                            i3 = 2;
                            response = null;
                            inputStream = null;
                            Object[] objArr4 = new Object[i3];
                            objArr4[0] = Boolean.FALSE;
                            objArr4[1] = RnCallbackMapUtil.getCommonErrorMap(e.toString());
                            callback.invoke(objArr4);
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (response != null) {
                                response.close();
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            randomAccessFile = randomAccessFile3;
                            response = null;
                            inputStream = null;
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (response != null) {
                                throw th;
                            }
                            response.close();
                            throw th;
                        }
                    } catch (Exception e9) {
                        e = e9;
                        response = null;
                        inputStream = null;
                    } catch (Throwable th10) {
                        th = th10;
                        response = null;
                        inputStream = null;
                    }
                } catch (Exception unused9) {
                }
            } catch (Exception e10) {
                e = e10;
                response = null;
                randomAccessFile = null;
                inputStream = null;
            } catch (Throwable th11) {
                th = th11;
                response = null;
                randomAccessFile = null;
                inputStream = null;
            }
        } catch (Exception e11) {
            removeDownloadFileTask(str4);
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(Log.getStackTraceString(e11)));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void fetchLocalVideoFilePathFromDidAlbumByUrl(String str, String str2, Callback callback) {
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, str2));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void getAlbums(final Callback callback) {
        initAlbumLegalModelSetIfNeed();
        if (getDevice() != null && !this.mAlbumLegalModelSet.contains(getDevice().model)) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-3, "model not support"));
            return;
        }
        try {
            p4h.h(0).y(pfl.c()).t(new tc0<Integer>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.9
                @Override // defpackage.tc0
                @RequiresApi(api = 8)
                public void call(Integer num) {
                    try {
                        List<MediaStoreUtil.AlbumInfo> albumInfo = MediaStoreUtil.getAlbumInfo(MIOTPersistModuleCore.this.getContext());
                        WritableArray writableArrayCreateArray = Arguments.createArray();
                        if (albumInfo != null && albumInfo.size() > 0) {
                            for (MediaStoreUtil.AlbumInfo albumInfo2 : albumInfo) {
                                if (albumInfo2 != null) {
                                    writableArrayCreateArray.pushMap(MIOTFile.albumInfoToWriteMap(albumInfo2));
                                }
                            }
                        }
                        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, writableArrayCreateArray));
                    } catch (MediaStoreUtil.AccessMediaError e) {
                        e.getErrorCode();
                        callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(OTAErrorCode.DFU_READ_PROTOCOL_VERSION_FAIL, "access to photo library denied"));
                    } catch (Exception e2) {
                        callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("getAlbums error:" + e2.getMessage()));
                    }
                }
            });
        } catch (Exception e) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("getAlbums error:" + e.getMessage()));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void getAllSourceFromPhotosDidAlbum(String str, final Callback callback) {
        final String strProcessDidSpecialCharacter = processDidSpecialCharacter(str);
        if (TextUtils.isEmpty(strProcessDidSpecialCharacter)) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-2, "albumName is illegal"));
            return;
        }
        try {
            p4h.h(0).y(pfl.c()).t(new tc0<Integer>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.7
                @Override // defpackage.tc0
                @RequiresApi(api = 8)
                public void call(Integer num) {
                    try {
                        List<MediaStoreUtil.MediaInfo> listQueryImageByAlbum = MediaStoreUtil.queryImageByAlbum(MIOTPersistModuleCore.this.getContext(), strProcessDidSpecialCharacter);
                        List<MediaStoreUtil.MediaInfo> listQueryVideoByAlbum = MediaStoreUtil.queryVideoByAlbum(MIOTPersistModuleCore.this.getContext(), strProcessDidSpecialCharacter);
                        ArrayList<MediaStoreUtil.MediaInfo> arrayList = new ArrayList();
                        if (listQueryImageByAlbum != null && listQueryImageByAlbum.size() > 0) {
                            arrayList.addAll(listQueryImageByAlbum);
                        }
                        if (listQueryVideoByAlbum != null && listQueryVideoByAlbum.size() > 0) {
                            arrayList.addAll(listQueryVideoByAlbum);
                        }
                        WritableArray writableArrayCreateArray = Arguments.createArray();
                        if (arrayList.size() > 0) {
                            for (MediaStoreUtil.MediaInfo mediaInfo : arrayList) {
                                if (mediaInfo != null) {
                                    writableArrayCreateArray.pushMap(MIOTFile.toWriteMap(mediaInfo));
                                }
                            }
                        }
                        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, writableArrayCreateArray));
                    } catch (MediaStoreUtil.AccessMediaError e) {
                        callback.invoke(Boolean.FALSE, e.getErrorCode() != -5 ? RnCallbackMapUtil.getCommonErrorMap(OTAErrorCode.DFU_READ_PROTOCOL_VERSION_FAIL, "access to photo library denied") : RnCallbackMapUtil.getCommonErrorMap(-2, "albumName is illegal"));
                    } catch (Exception e2) {
                        callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("getAllSourceFromPhotosDidAlbum error:" + e2.getMessage()));
                    }
                }
            });
        } catch (Exception e) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("getAllSourceFromPhotosDidAlbum error:" + e.getMessage()));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void getAssets(final String str, final Callback callback) {
        initAlbumLegalModelSetIfNeed();
        if (getDevice() != null && !this.mAlbumLegalModelSet.contains(getDevice().model)) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-3, "model not support"));
            return;
        }
        if (TextUtils.isEmpty(str)) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-2, "bucketId is illegal"));
            return;
        }
        try {
            p4h.h(0).y(pfl.c()).t(new tc0<Integer>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.8
                @Override // defpackage.tc0
                @RequiresApi(api = 8)
                public void call(Integer num) {
                    try {
                        List<MediaStoreUtil.MediaInfo> imageAndVideoByAlbumId = MediaStoreUtil.getImageAndVideoByAlbumId(MIOTPersistModuleCore.this.getContext(), str);
                        WritableArray writableArrayCreateArray = Arguments.createArray();
                        if (imageAndVideoByAlbumId != null && imageAndVideoByAlbumId.size() > 0) {
                            for (MediaStoreUtil.MediaInfo mediaInfo : imageAndVideoByAlbumId) {
                                if (mediaInfo != null) {
                                    writableArrayCreateArray.pushMap(MIOTFile.toWriteMap(mediaInfo));
                                }
                            }
                        }
                        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, writableArrayCreateArray));
                    } catch (MediaStoreUtil.AccessMediaError e) {
                        callback.invoke(Boolean.FALSE, e.getErrorCode() != -5 ? RnCallbackMapUtil.getCommonErrorMap(OTAErrorCode.DFU_READ_PROTOCOL_VERSION_FAIL, "access to photo library denied") : RnCallbackMapUtil.getCommonErrorMap(-2, "bucketId is illegal"));
                    } catch (Exception e2) {
                        callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("getAssets error:" + e2.getMessage()));
                    }
                }
            });
        } catch (Exception e) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("getAssets error:" + e.getMessage()));
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("storageBasePath", getFilesPath().getAbsolutePath());
        return map;
    }

    public long getContentLengthFromNetConnect(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return -1L;
        }
        return httpURLConnection.getContentLengthLong();
    }

    public int getEachCallbackTime(long j) {
        if (j < 10485760) {
            return 100;
        }
        return j < AudioFileCacheConfig.CACHE_MAX_SIZE ? 300 : 1000;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MIOTFile";
    }

    public String getPathName(String str) {
        if (str == null) {
            return getFilesPath() + File.separator + "defaultname";
        }
        String str2 = File.separator;
        if (str.startsWith(str2)) {
            return getFilesPath() + str;
        }
        return getFilesPath() + str2 + str;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void getRGBAValueFromImageAtPath(String str, ReadableArray readableArray, Callback callback) {
        try {
            if (checkFileNameValidCallBack(str, callback)) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(getPathName(str)));
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new BufferedInputStream(bufferedInputStream));
                WritableArray writableArrayCreateArray = Arguments.createArray();
                if (readableArray == null || readableArray.size() <= 0) {
                    for (int i = 0; i < bitmapDecodeStream.getWidth(); i++) {
                        WritableArray writableArrayCreateArray2 = Arguments.createArray();
                        for (int i2 = 0; i2 < bitmapDecodeStream.getHeight(); i2++) {
                            WritableArray writableArrayCreateArray3 = Arguments.createArray();
                            int pixel = bitmapDecodeStream.getPixel(i, i2);
                            writableArrayCreateArray3.pushInt(Color.red(pixel));
                            writableArrayCreateArray3.pushInt(Color.green(pixel));
                            writableArrayCreateArray3.pushInt(Color.blue(pixel));
                            writableArrayCreateArray3.pushInt(Color.alpha(pixel));
                            writableArrayCreateArray2.pushArray(writableArrayCreateArray3);
                        }
                        writableArrayCreateArray.pushArray(writableArrayCreateArray2);
                    }
                } else {
                    for (int i3 = 0; i3 < readableArray.size(); i3++) {
                        WritableArray writableArrayCreateArray4 = Arguments.createArray();
                        int pixel2 = bitmapDecodeStream.getPixel(MIOTUtils.getInt(readableArray.getMap(i3), "x"), MIOTUtils.getInt(readableArray.getMap(i3), "y"));
                        writableArrayCreateArray4.pushInt(Color.red(pixel2));
                        writableArrayCreateArray4.pushInt(Color.green(pixel2));
                        writableArrayCreateArray4.pushInt(Color.blue(pixel2));
                        writableArrayCreateArray4.pushInt(Color.alpha(pixel2));
                        writableArrayCreateArray.pushArray(writableArrayCreateArray4);
                    }
                }
                callback.invoke(Boolean.TRUE, writableArrayCreateArray);
                bufferedInputStream.close();
                bitmapDecodeStream.recycle();
            }
        } catch (Throwable th) {
            callback.invoke(Boolean.FALSE, Log.getStackTraceString(th));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public void getStorageInfo(Callback callback) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long totalBytes = statFs.getTotalBytes();
        long freeBytes = statFs.getFreeBytes();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("totalSpace", totalBytes);
        writableMapCreateMap.putDouble("freeSpace", freeBytes);
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, writableMapCreateMap));
    }

    public void initSaveNotesAppLegalModelSetIfNeed() {
        if (this.mSaveNotesAppLegalModelSet == null) {
            HashSet hashSet = new HashSet(1);
            this.mSaveNotesAppLegalModelSet = hashSet;
            hashSet.add("jiqid.sxb.v1");
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public void isFileExists(String str, Callback callback) {
        if (checkFileNameValidCallBack(str, callback)) {
            try {
                callback.invoke(Boolean.TRUE, Boolean.valueOf(new File(getPathName(str)).exists()));
            } catch (Exception e) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(Log.getStackTraceString(e)));
            }
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void longScreenShot(int i, final String str, final Callback callback) {
        try {
            if (checkFileNameValidCallBack(str, callback)) {
                String imageFileSuffixName = IOUtils.getImageFileSuffixName(str);
                final Bitmap.CompressFormat imageCompressFormat = IOUtils.getImageCompressFormat(imageFileSuffixName);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("format", imageFileSuffixName);
                jSONObject.put("result", ViewShot.Results.TEMP_FILE);
                jSONObject.put("snapshotContentContainer", true);
                jSONObject.put("fileName", str);
                jSONObject.put("quality", 0.8d);
                final View viewFindViewById = getCurrentActivity().findViewById(i);
                if (viewFindViewById == null) {
                    callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("can not find view Id, id is " + i));
                    return;
                }
                if (!(viewFindViewById instanceof ScrollView) && !(viewFindViewById instanceof ScrollingView)) {
                    viewFindViewById.post(new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.11
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                String pathName = MIOTPersistModuleCore.this.getPathName(str);
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(pathName));
                                Bitmap bitmapScreenShotLong = MIOTPersistModuleCore.this.getRnCommonProvider().screenShotLong(viewFindViewById);
                                if (bitmapScreenShotLong == null) {
                                    callback.invoke(Boolean.FALSE, "get screen bitmap is null");
                                    return;
                                }
                                bitmapScreenShotLong.compress(imageCompressFormat, 90, bufferedOutputStream);
                                callback.invoke(Boolean.TRUE, pathName);
                                bufferedOutputStream.close();
                            } catch (Exception e) {
                                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(Log.getStackTraceString(e)));
                            }
                        }
                    });
                    return;
                }
                captureRef(i, jSONObject, callback);
            }
        } catch (Exception e) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(Log.getStackTraceString(e)));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public void mergeFiles(ReadableArray readableArray, String str, Callback callback) {
        onMethodNotImplamente(" mergeFiles(ReadableArray data, String finalFileName, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void mkdir(ReadableMap readableMap, Callback callback) {
        String strOptString = RnReadableMapUtil.optString(readableMap, PARAM_DIR_PATH);
        boolean zOptBoolean = RnReadableMapUtil.optBoolean(readableMap, PARAM_RECURISVE);
        if (checkFileNameValidCallBack(strOptString, callback)) {
            File file = new File(getPathName(strOptString));
            if (file.exists()) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-2, String.format("file %s already exist:", strOptString)));
                return;
            }
            try {
                if (zOptBoolean) {
                    file.mkdirs();
                } else if (!file.mkdir() && !file.getParentFile().exists()) {
                    callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-3, "parent directory is not exist:" + strOptString));
                    return;
                }
                callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, null, "success"));
            } catch (SecurityException e) {
                MRnLog.w("MIOTFile", "mkdir error:", e);
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-4, "permission denied,cannot access dir:" + strOptString));
            }
        }
    }

    public Uri pathToUri(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!MediaStoreUtil.isReadableExternalPath(getContext(), str)) {
            str = getPathName(str);
        }
        return Uri.parse(str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public void pdfToImage(ReadableMap readableMap, Callback callback) {
        onMethodNotImplamente(" pdfToImage(ReadableMap params, Callback callback) haven't been impl");
    }

    public String processDidSpecialCharacter(String str) {
        if (TextUtils.isEmpty(str) || !str.contains(":")) {
            return str;
        }
        String strReplaceAll = str.replaceAll(":", RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
        MRnLog.d("MIOTFile", "replace did result : " + strReplaceAll);
        return strReplaceAll;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public void queryFile(ReadableMap readableMap, final Callback callback) {
        ReadableArray readableArrayOptArray = RnReadableMapUtil.optArray(readableMap, "mimeTypes");
        final int iOptInt = RnReadableMapUtil.optInt(readableMap, "pageSize");
        final int iOptInt2 = RnReadableMapUtil.optInt(readableMap, "pageNum");
        if (readableArrayOptArray.size() == 0) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, "mimeType is empty"));
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArrayOptArray.size(); i++) {
            arrayList.add(readableArrayOptArray.getString(i));
        }
        final String[] strArrFilterInvalidFileType = MediaStoreUtil.filterInvalidFileType(arrayList);
        p4h.h(0).y(pfl.c()).b(new tc0() { // from class: eye
            @Override // defpackage.tc0
            public final void call(Object obj) {
                this.f17190a.lambda$queryFile$9(strArrFilterInvalidFileType, iOptInt, iOptInt2, callback, (Integer) obj);
            }
        }).s();
    }

    public byte[] readByte(String str) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
            try {
                byte[] bArr = new byte[(int) randomAccessFile2.length()];
                randomAccessFile2.read(bArr);
                try {
                    randomAccessFile2.close();
                } catch (IOException unused) {
                }
                return bArr;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void readFile(final String str, final Callback callback) {
        if (checkFileNameValidCallBack(str, callback)) {
            p4h.h(0).y(MRnSchedulers.RX1_IO()).b(new tc0() { // from class: xxe
                @Override // defpackage.tc0
                public final void call(Object obj) {
                    this.f39559a.lambda$readFile$1(callback, str, (Integer) obj);
                }
            }).s();
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void readFileInfo(final String str, final String str2, final Callback callback) {
        if (checkFileNameValidCallBack(str, callback)) {
            p4h.h(0).y(MRnSchedulers.RX1_IO()).b(new tc0() { // from class: fye
                @Override // defpackage.tc0
                public final void call(Object obj) {
                    this.f18372a.lambda$readFileInfo$0(str, str2, callback, (Integer) obj);
                }
            }).s();
            return;
        }
        RnPluginLog.d("readFileInfo,check failed,fileName:" + str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public void readFileList(Callback callback) {
        try {
            File filesPath = getFilesPath();
            if (!filesPath.exists()) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("path does not exist"));
                return;
            }
            String[] list = filesPath.list();
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            for (String str : list) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("name", str);
                writableNativeArray.pushMap(writableNativeMap);
            }
            callback.invoke(Boolean.TRUE, writableNativeArray);
        } catch (Exception unused) {
            callback.invoke(Boolean.FALSE);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void readFileListFrom(String str, Callback callback) {
        if (checkFolderValidCallBack(str, callback)) {
            try {
                File filesPath = TextUtils.isEmpty(str) ? getFilesPath() : new File(getFilesPath() + File.separator + str);
                if (!filesPath.exists()) {
                    callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("path does not exist"));
                    return;
                }
                String[] list = filesPath.list();
                File[] fileArrListFiles = filesPath.listFiles();
                WritableNativeArray writableNativeArray = new WritableNativeArray();
                int length = list.length;
                for (int i = 0; i < length; i++) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("name", list[i]);
                    writableNativeMap.putString(MediaStoreUtil.MediaInfo.SIZE, fileArrListFiles[i].isFile() ? "" + fileArrListFiles[i].length() : "-1");
                    writableNativeMap.putInt("modifyTime", (int) (fileArrListFiles[i].lastModified() / 1000));
                    writableNativeArray.pushMap(writableNativeMap);
                }
                callback.invoke(Boolean.TRUE, writableNativeArray);
            } catch (Exception e) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(e.toString()));
            }
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void readFileSegmentToBase64(final String str, final int i, final int i2, final Callback callback) {
        RnPluginLog.d("readFileSegmentToBase64,fileName:" + str + ",off:" + i + ",len:" + i2);
        if (checkFileNameValidCallBack(str, callback)) {
            p4h.h(0).y(MRnSchedulers.RX1_IO()).b(new tc0() { // from class: dye
                @Override // defpackage.tc0
                public final void call(Object obj) {
                    this.f16060a.lambda$readFileSegmentToBase64$3(str, callback, i, i2, (Integer) obj);
                }
            }).s();
        } else {
            RnPluginLog.w("readFileSegmentToBase64,checkFileNameValidCallBack fail");
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void readFileToBase64(final String str, final Callback callback) {
        if (checkFileNameValidCallBack(str, callback)) {
            p4h.h(0).y(MRnSchedulers.RX1_IO()).b(new tc0() { // from class: bye
                @Override // defpackage.tc0
                public final void call(Object obj) {
                    this.f4723a.lambda$readFileToBase64$4(callback, str, (Integer) obj);
                }
            }).s();
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void readFileToHexString(final String str, final Callback callback) {
        if (checkFileNameValidCallBack(str, callback)) {
            p4h.h(0).y(MRnSchedulers.RX1_IO()).b(new tc0() { // from class: aye
                @Override // defpackage.tc0
                public final void call(Object obj) {
                    this.f3572a.lambda$readFileToHexString$2(callback, str, (Integer) obj);
                }
            }).s();
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public void readFolderSize(String str, Callback callback) {
        onMethodNotImplamente(" readFolderSize(String relativePath, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public void readFontFileList(ReadableMap readableMap, Callback callback) {
        onMethodNotImplamente(" readFontFileList(ReadableMap param, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public void readPdfMetaData(ReadableMap readableMap, Callback callback) {
        onMethodNotImplamente(" readPdfMetaData(ReadableMap params, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void saveFileToNotesAppOnMIUI(final String str, final Callback callback) {
        RnPluginLog.w("saveFileToNotesAppOnMIUI, fileName:" + str);
        if (checkFileNameValidCallBack(str, callback)) {
            if (!str.endsWith(".txt")) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(str + ",only txt file is supported"));
                return;
            }
            if (!new File(getPathName(str)).exists()) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(str + ",file not exit"));
                return;
            }
            initSaveNotesAppLegalModelSetIfNeed();
            if (getDevice() == null || this.mSaveNotesAppLegalModelSet.contains(getDevice().model)) {
                p4h.h(0).y(pfl.c()).t(new tc0<Integer>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.1
                    @Override // defpackage.tc0
                    public void call(Integer num) {
                        try {
                            MIOTPersistModuleCore mIOTPersistModuleCore = MIOTPersistModuleCore.this;
                            MIOTPersistModuleCore.this.getRnPluginHostApiProvider().saveStringToNotesAppOnMIUI(new String(mIOTPersistModuleCore.readByte(mIOTPersistModuleCore.getPathName(str))), new com.xiaomi.smarthome.device.api.Callback<Void>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.1.1
                                @Override // com.xiaomi.smarthome.device.api.Callback
                                public void onFailure(int i, String str2) {
                                    callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-4, str + "," + str2));
                                }

                                @Override // com.xiaomi.smarthome.device.api.Callback
                                public void onSuccess(Void r3) {
                                    callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(null));
                                }
                            });
                        } catch (Throwable th) {
                            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-3, str + "," + th.toString()));
                            StringBuilder sb = new StringBuilder();
                            sb.append("saveFileToNotesAppOnMIUI, getString error:");
                            sb.append(Log.getStackTraceString(th));
                            RnPluginLog.w(sb.toString());
                        }
                    }
                });
                return;
            }
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-2, str + ",model not support"));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void saveFileToPhotosAlbum(String str, Callback callback) {
        try {
            if (checkFileNameValidCallBack(str, callback)) {
                String mimeType = getMimeType(getPathName(str));
                if (!TextUtils.isEmpty(mimeType) && mimeType.contains("image")) {
                    RnPluginLog.d("saveFileToPhotosAlbum, image");
                    saveImageToPhotosDidAlbumPub(null, str, callback);
                } else if (TextUtils.isEmpty(mimeType) || !mimeType.contains("video")) {
                    RnPluginLog.d("saveFileToPhotosAlbum, other");
                    saveFilePub(str, callback);
                } else {
                    RnPluginLog.d("saveFileToPhotosAlbum, video");
                    saveVideoToPhotosDidAlbumPub(null, str, callback);
                }
            }
        } catch (Exception e) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("saveFileToPhotosAlbum error:" + e.getMessage()));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void saveImageToPhotosAlbum(String str, Callback callback) {
        try {
            saveImageToPhotosDidAlbumPub(null, str, callback);
        } catch (Exception e) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("saveImageToPhotosAlbum error:" + e.getMessage()));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void saveImageToPhotosDidAlbum(String str, String str2, Callback callback) {
        String strProcessDidSpecialCharacter = processDidSpecialCharacter(str);
        if (TextUtils.isEmpty(strProcessDidSpecialCharacter)) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-2, "albumName is illegal"));
            return;
        }
        try {
            saveImageToPhotosDidAlbumPub(strProcessDidSpecialCharacter, str2, callback);
        } catch (Exception e) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("saveImageToPhotosDidAlbum error:" + e.getMessage()));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void saveVideoToPhotosDidAlbum(String str, String str2, Callback callback) {
        String strProcessDidSpecialCharacter = processDidSpecialCharacter(str);
        if (TextUtils.isEmpty(strProcessDidSpecialCharacter)) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-2, "albumName is illegal"));
            return;
        }
        try {
            saveVideoToPhotosDidAlbumPub(strProcessDidSpecialCharacter, str2, callback);
        } catch (Exception e) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("saveVideoToPhotosDidAlbum error:" + e.getMessage()));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void screenShot(String str, Callback callback) {
        if (checkFileNameValidCallBack(str, callback)) {
            try {
                String imageFileSuffixName = IOUtils.getImageFileSuffixName(str);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("format", imageFileSuffixName);
                jSONObject.put("result", ViewShot.Results.TEMP_FILE);
                jSONObject.put("snapshotContentContainer", false);
                jSONObject.put("fileName", str);
                jSONObject.put("quality", 0.8d);
                captureRef(-1, jSONObject, callback);
            } catch (JSONException e) {
                RnPluginLog.e(e.toString());
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(e.toString()));
            }
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void screenShotInRect(final String str, ReadableMap readableMap, final Callback callback) {
        if (checkFileNameValidCallBack(str, callback)) {
            final double d = MIOTUtils.getDouble(readableMap, e.f13808a);
            final double d2 = MIOTUtils.getDouble(readableMap, DeviceTagInterface.CUSTOM_TAG_TYPE);
            final double d3 = MIOTUtils.getDouble(readableMap, Constants.DEVICE_TYPE_WEAR);
            final double d4 = MIOTUtils.getDouble(readableMap, "h");
            final Bitmap.CompressFormat imageCompressFormat = IOUtils.getImageCompressFormat(IOUtils.getImageFileSuffixName(str));
            final View rootView = getScreenInfoProvider().getRootView(getCurrentActivity());
            final float displayDensity = getScreenInfoProvider().getDisplayDensity(getCurrentActivity());
            rootView.post(new Runnable() { // from class: cye
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f14861a.lambda$screenShotInRect$7(rootView, str, displayDensity, d, d2, d3, d4, imageCompressFormat, callback);
                }
            });
        }
    }

    public void sendFileDownloadProgressEvent(String str, String str2, long j, long j2) {
        getEventProvider().sendDownloadProgressEvent(str, str2, j, j2);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void subBase64DataOfBase64Data(String str, int i, int i2, Callback callback) {
        try {
            if (str == null) {
                str = "";
            }
            String str2 = new String(Base64.decode(str, 2));
            if (i < 0 || i >= str2.length() || i2 <= 0 || i + i2 > str2.length()) {
                callback.invoke(Boolean.FALSE, "data length :" + str2.length() + " require start :" + i + " require end:" + (i + i2));
            }
            callback.invoke(Boolean.TRUE, Base64.encodeToString(str2.substring(i, i2 + i).getBytes(), 2));
        } catch (Throwable th) {
            callback.invoke(Boolean.FALSE, Log.getStackTraceString(th));
        }
    }

    public boolean taskIsLoadingFile(String str) {
        Map<String, DownloadFileTask> map;
        DownloadFileTask downloadFileTask;
        return TextUtils.isEmpty(str) || (map = this.mFileDownloadTaskMap) == null || (downloadFileTask = map.get(str)) == null || downloadFileTask.downloadStatus == DownloadFileTask.STATUS_DOWNLOAD_ING;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void ungzFile(final String str, final Callback callback) {
        new Thread(new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.3
            /* JADX WARN: Code duplicated, block: B:62:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:64:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:74:? A[SYNTHETIC] */
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                ByteArrayOutputStream byteArrayOutputStream;
                Exception e;
                GZIPInputStream gZIPInputStream;
                if (MIOTPersistModuleCore.this.checkFileNameValidCallBack(str, callback)) {
                    GZIPInputStream gZIPInputStream2 = null;
                    try {
                        try {
                            gZIPInputStream = new GZIPInputStream(new FileInputStream(MIOTPersistModuleCore.this.getPathName(str)));
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    try {
                                        byte[] bArr = new byte[1024];
                                        while (true) {
                                            int i = gZIPInputStream.read(bArr, 0, 1024);
                                            if (i == -1) {
                                                break;
                                            } else {
                                                byteArrayOutputStream.write(bArr, 0, i);
                                            }
                                        }
                                        callback.invoke(Boolean.TRUE, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                                        try {
                                            gZIPInputStream.close();
                                        } catch (IOException e2) {
                                            RnPluginLog.e(e2.toString());
                                        }
                                        byteArrayOutputStream.close();
                                    } catch (Exception e3) {
                                        e = e3;
                                        callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(e.toString()));
                                        RnPluginLog.e(e.toString());
                                        if (gZIPInputStream != null) {
                                            try {
                                                gZIPInputStream.close();
                                            } catch (IOException e4) {
                                                RnPluginLog.e(e4.toString());
                                            }
                                        }
                                        if (byteArrayOutputStream == null) {
                                        } else {
                                            byteArrayOutputStream.close();
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    gZIPInputStream2 = gZIPInputStream;
                                    if (gZIPInputStream2 != null) {
                                        try {
                                            gZIPInputStream2.close();
                                        } catch (IOException e5) {
                                            RnPluginLog.e(e5.toString());
                                        }
                                    }
                                    if (byteArrayOutputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th;
                                    } catch (IOException e6) {
                                        RnPluginLog.e(e6.toString());
                                        throw th;
                                    }
                                }
                            } catch (Exception e7) {
                                byteArrayOutputStream = null;
                                e = e7;
                            } catch (Throwable th2) {
                                th = th2;
                                byteArrayOutputStream = null;
                                gZIPInputStream2 = gZIPInputStream;
                                if (gZIPInputStream2 != null) {
                                    gZIPInputStream2.close();
                                }
                                if (byteArrayOutputStream == null) {
                                    throw th;
                                }
                                byteArrayOutputStream.close();
                                throw th;
                            }
                        } catch (IOException e8) {
                            RnPluginLog.e(e8.toString());
                        }
                    } catch (Exception e9) {
                        byteArrayOutputStream = null;
                        e = e9;
                        gZIPInputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = null;
                        if (gZIPInputStream2 != null) {
                            gZIPInputStream2.close();
                        }
                        if (byteArrayOutputStream == null) {
                            throw th;
                        }
                        byteArrayOutputStream.close();
                        throw th;
                    }
                }
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public void ungzYunMiFile(String str, Callback callback) {
        onMethodNotImplamente(" ungzYunMiFile(String filename, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void ungzipFileToString(ReadableMap readableMap, final Callback callback) {
        final String strOptString = RnReadableMapUtil.optString(readableMap, "fileName");
        final String strOptString2 = RnReadableMapUtil.optString(readableMap, "charsetName");
        p4h.h(0).y(MRnSchedulers.RX1_IO()).b(new tc0() { // from class: wxe
            @Override // defpackage.tc0
            public final void call(Object obj) {
                this.f38456a.lambda$ungzipFileToString$6(strOptString, callback, strOptString2, (Integer) obj);
            }
        }).s();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void unzipFile(String str, String str2, Callback callback) {
        if (checkFileNameValidCallBack(str, callback) && checkFolderValidCallBack(str2, callback)) {
            try {
                String pathName = getPathName(str);
                if (str.lastIndexOf(46) >= 0) {
                    callback.invoke(Boolean.valueOf(ZipPluginFileUtils.syncUnzip(pathName, getUnZipFileAbsPath(str2))));
                } else {
                    callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("filename mast contain ‘.’ , for example plugin.zip"));
                }
            } catch (Exception e) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(Log.getStackTraceString(e)));
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11181. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public void upload(java.lang.String r40, java.lang.String r41, java.util.HashMap<java.lang.String, java.lang.Object> r42, java.util.HashMap<java.lang.String, java.lang.Object> r43, com.facebook.react.bridge.ReadableArray r44, boolean r45, com.facebook.react.bridge.Callback r46) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.upload(java.lang.String, java.lang.String, java.util.HashMap, java.util.HashMap, com.facebook.react.bridge.ReadableArray, boolean, com.facebook.react.bridge.Callback):void");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void uploadFile(ReadableMap readableMap, final Callback callback) {
        final String string = MIOTUtils.getString(readableMap, "uploadUrl");
        final String string2 = MIOTUtils.getString(readableMap, "method");
        final ReadableMap map = MIOTUtils.getMap(readableMap, "headers");
        final ReadableMap map2 = MIOTUtils.getMap(readableMap, "fields");
        ReadableArray array = MIOTUtils.getArray(readableMap, "files");
        final boolean z = MIOTUtils.getBoolean(readableMap, "allow_private_certificates");
        if (array == null) {
            callback.invoke(Boolean.FALSE, "file path is illegal");
            return;
        }
        final WritableArray writableArrayCreateArray = Arguments.createArray();
        int i = 0;
        while (i < array.size()) {
            ReadableMap map3 = array.getMap(i);
            String string3 = MIOTUtils.getString(map3, "path");
            String string4 = MIOTUtils.getString(map3, "filename");
            if (!checkFolderValidCallBack(string3, callback) || !checkFileNameValidCallBack(string4, callback)) {
                RnPluginLog.w("filepath or filename is invalid");
                return;
            }
            if (string4 != null) {
                File fileFromUri = getFileFromUri(Uri.parse(string4));
                if (fileFromUri != null) {
                    string3 = fileFromUri.getPath();
                    string4 = fileFromUri.getName();
                }
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("filename", string4);
                if (TextUtils.isEmpty(string3)) {
                    string3 = getPathName(string4);
                }
                writableMapCreateMap.putString("filepath", string3);
                ReadableMap map4 = MIOTUtils.getMap(map3, "range");
                if (map4 != null) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putDouble(StatConstants.PARAM_START, RnReadableMapUtil.optDouble(map4, StatConstants.PARAM_START));
                    writableMapCreateMap2.putDouble("length", RnReadableMapUtil.optDouble(map4, "length"));
                    writableMapCreateMap.putMap("range", writableMapCreateMap2);
                }
                ReadableMap map5 = MIOTUtils.getMap(map3, "formdata");
                if (map5 != null) {
                    WritableMap writableMapCreateMap3 = Arguments.createMap();
                    writableMapCreateMap3.putString("name", RnReadableMapUtil.optString(map5, "name"));
                    writableMapCreateMap3.putString("filename", RnReadableMapUtil.optString(map5, "filename"));
                    writableMapCreateMap.putMap("formdata", writableMapCreateMap3);
                }
                writableArrayCreateArray.pushMap(writableMapCreateMap);
            } else {
                array = array;
            }
            i++;
            array = array;
        }
        p4h.h(0).y(MRnSchedulers.RX1_IO()).b(new tc0() { // from class: zxe
            @Override // defpackage.tc0
            public final void call(Object obj) {
                this.f41774a.lambda$uploadFile$10(string, string2, map, map2, writableArrayCreateArray, z, callback, (Integer) obj);
            }
        }).s();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void uploadFileToFDS(ReadableMap readableMap, final Callback callback) {
        final String string = MIOTUtils.getString(readableMap, "uploadUrl");
        final String string2 = MIOTUtils.getString(readableMap, "method");
        final ReadableMap map = MIOTUtils.getMap(readableMap, "headers");
        final ReadableMap map2 = MIOTUtils.getMap(readableMap, "fields");
        ReadableArray array = MIOTUtils.getArray(readableMap, "files");
        if (array == null) {
            callback.invoke(Boolean.FALSE, "file path is illegal");
            return;
        }
        final WritableArray writableArrayCreateArray = Arguments.createArray();
        for (int i = 0; i < array.size(); i++) {
            ReadableMap map3 = array.getMap(i);
            String string3 = MIOTUtils.getString(map3, "path");
            String string4 = MIOTUtils.getString(map3, "filename");
            if (!checkFolderValidCallBack(string3, callback) || !checkFileNameValidCallBack(string4, callback)) {
                RnPluginLog.w("filepath or filename is invalid");
                return;
            }
            if (string4 != null) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("filename", string4);
                if (TextUtils.isEmpty(string3)) {
                    string3 = getPathName(string4);
                }
                writableMapCreateMap.putString("filepath", string3);
                writableArrayCreateArray.pushMap(writableMapCreateMap);
            }
        }
        p4h.h(0).l(pfl.c()).j(new zta<Integer, Boolean>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.18
            @Override // defpackage.zta
            public Boolean call(Integer num) {
                try {
                    String str = string;
                    String str2 = string2;
                    ReadableMap readableMap2 = map;
                    HashMap<String, Object> hashMap = readableMap2 == null ? null : readableMap2.toHashMap();
                    ReadableMap readableMap3 = map2;
                    MIOTPersistModuleCore.uploadToFDS(str, str2, hashMap, readableMap3 != null ? readableMap3.toHashMap() : null, writableArrayCreateArray, new Callback() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore.18.1
                        @Override // com.facebook.react.bridge.Callback
                        public void invoke(Object... objArr) {
                            if (objArr == null || objArr.length != 5 || objArr[1] != null) {
                                callback.invoke(objArr);
                                return;
                            }
                            try {
                                String string5 = objArr[2].toString();
                                long jLongValue = ((Long) objArr[3]).longValue();
                                long jLongValue2 = ((Long) objArr[4]).longValue();
                                AnonymousClass18 anonymousClass18 = AnonymousClass18.this;
                                MIOTPersistModuleCore.this.sendFileUploadProgressEvent(string, string5, jLongValue, jLongValue2);
                            } catch (Exception e) {
                                RnPluginLog.e(e.toString());
                            }
                        }
                    });
                } catch (Exception e) {
                    callback.invoke(Boolean.FALSE, Log.getStackTraceString(e));
                }
                return Boolean.TRUE;
            }
        }).s();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public void uploadFileToMiCloud(ReadableMap readableMap, Callback callback) {
        onMethodNotImplamente(" uploadFileToMiCloud(ReadableMap data, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void writeFile(String str, String str2, Callback callback) {
        if (checkFileNameValidCallBack(str, callback)) {
            try {
                String pathName = getPathName(str);
                if (str2 == null) {
                    str2 = "";
                }
                writeByteAsyn(pathName, str2.getBytes(), false, callback);
            } catch (Exception e) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("writeFile error:" + e.getMessage()));
            }
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void writeFileThroughBase64(String str, String str2, Callback callback) {
        if (checkFileNameValidCallBack(str, callback)) {
            if (str2 == null) {
                str2 = "";
            }
            try {
                writeByteAsyn(getPathName(str), Base64.decode(str2, 2), false, callback);
            } catch (Exception e) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(e.toString()));
            }
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public void writePdfFile(String str, String str2, ReadableMap readableMap, Callback callback) {
        onMethodNotImplamente(" writePdfFile(String fileContent, String fileName, ReadableMap params, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPersist
    @ReactMethod
    public final void deleteFile(String str, Callback callback) {
        if (checkFileNameValidCallBack(str, callback)) {
            try {
                File file = new File(getPathName(str));
                if (file.exists()) {
                    deleteFile(file);
                    callback.invoke(Boolean.TRUE);
                } else {
                    callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("file path does not exist :" + str));
                }
            } catch (Throwable th) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(Log.getStackTraceString(th)));
            }
        }
    }
}
