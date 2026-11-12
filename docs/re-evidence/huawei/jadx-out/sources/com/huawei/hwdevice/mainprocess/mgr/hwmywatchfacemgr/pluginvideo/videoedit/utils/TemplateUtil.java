package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.google.gson.Gson;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.videoedit.dfx.DfxGuard;
import com.huawei.watchface.videoedit.param.FileType;
import com.huawei.watchface.videoedit.param.MaterialInfo;
import com.huawei.watchface.videoedit.param.Segments;
import com.huawei.watchface.videoedit.param.TemplateModel;
import com.huawei.watchface.videoedit.param.Tracks;
import com.huawei.watchface.videoedit.presenter.PresenterUtils;
import com.huawei.watchface.videoedit.sysc.Optional;
import com.huawei.watchface.videoedit.utils.ListUtil;
import com.huawei.watchface.videoedit.utils.SafeIntent;
import com.huawei.watchface.videoedit.utils.Utils;
import defpackage.njy;
import health.compact.a.LogUtil;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class TemplateUtil {
    public static final String CUSTOMIZED_NAME = "Customized";
    private static final int DEFAULT_BUFFER_SIZE = 1024;
    private static final int DEFAULT_PHOTO_DURATION = 60000;
    public static final int DEFAULT_VOLUME = 100;
    private static final int ERR_CODE = -1;
    public static final int FLAG_FROM_GALLERY = 1;
    private static final String IMAGE = "image";
    public static final String MATERIAL_SOURCE_FLAG = "material_source_flag";
    public static final String MODEL_TYPE_ESSENTIAL = "essential";
    public static final String MODEL_TYPE_FREE = "free_edit";
    private static final int ORIGIN_VALUE = -1;
    private static final int ROTATE_180 = 180;
    private static final int ROTATE_270 = 270;
    private static final int ROTATE_90 = 90;
    private static final String TAG = "TemplateUtil";
    public static final String TEMPLATE_INFO = "template_info";
    public static final String TEMPLATE_MEDIA_INFO = "media_info_from_gallery";
    public static final String TRACK_TYPE_AUDIO = "audio";
    public static final String TRACK_TYPE_VIDEO = "video";
    private static final String TYPE = "type";
    public static final String VERSION = "version";
    private static final String VIDEO = "video";
    public static final float VOLUME_FACTOR = 200.0f;
    private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();
    private static final ThreadFactory S_THREAD_FACTORY = new ThreadFactory() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils.TemplateUtil.1
        private final AtomicInteger mCount = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "DecodeTask #" + this.mCount.getAndIncrement());
        }
    };

    public static float transformVolume(int i) {
        return i / 200.0f;
    }

    private TemplateUtil() {
    }

    public static List<MaterialInfo> generateMaterialInfoFromGallery(Intent intent, String str) {
        List<Uri> materialUriList = getMaterialUriList(intent, str);
        if (materialUriList == null) {
            LogUtil.d(TAG, "generateMaterialInfoFromGallery filePath is null");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialUriList.size(); i++) {
            Uri uri = materialUriList.get(i);
            if (uri == null) {
                LogUtil.d(TAG, "generateMaterialInfoFromGallery uri is null");
                return new ArrayList();
            }
            String authorityByUri = CommonUtils.getAuthorityByUri(uri);
            if ("video".equals(Utils.getSafeUriParameter(uri, "type"))) {
                if (isVideoFormatSupport(authorityByUri)) {
                    arrayList.add(scanVideoFile(authorityByUri));
                }
            } else if (isPhotoFormatSupport(authorityByUri)) {
                arrayList.add(scanImageFile(authorityByUri));
            }
        }
        return arrayList;
    }

    public static List<Uri> getMaterialUriList(Intent intent, String str) {
        try {
            return new SafeIntent(intent).getParcelableArrayListExtra(str);
        } catch (ArrayIndexOutOfBoundsException unused) {
            LogUtil.d(TAG, "getMaterialUriList ArrayIndexOutOfBoundsException");
            return null;
        }
    }

    public static MaterialInfo scanVideoFile(String str) throws Throwable {
        MediaMetadataRetriever mediaMetadataRetriever;
        MaterialInfo materialInfo = new MaterialInfo();
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    DfxGuard.getPolicy().onExtractVideo();
                    mediaMetadataRetriever.setDataSource(str);
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    int intSafely = Utils.parseIntSafely(strExtractMetadata, 0);
                    int intSafely2 = Utils.parseIntSafely(strExtractMetadata2, 0);
                    String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                    materialInfo.setRotation(Utils.parseIntSafely(mediaMetadataRetriever.extractMetadata(24), 0));
                    materialInfo.setWidth(intSafely);
                    materialInfo.setHeight(intSafely2);
                    materialInfo.setDuration(Utils.parseIntSafely(strExtractMetadata3, 0));
                    materialInfo.setPath(str);
                    materialInfo.setMontagePath(str);
                    materialInfo.setType("video");
                    Utils.release(mediaMetadataRetriever);
                    return materialInfo;
                } catch (RuntimeException e) {
                    e = e;
                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                    LogUtil.d(TAG, "RuntimeException", ExceptionUtils.c(e));
                    Utils.release(mediaMetadataRetriever2);
                    return materialInfo;
                } catch (Exception e2) {
                    e = e2;
                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                    LogUtil.d(TAG, "Exception", ExceptionUtils.c(e));
                    Utils.release(mediaMetadataRetriever2);
                    return materialInfo;
                } catch (Throwable th) {
                    th = th;
                    Utils.release(mediaMetadataRetriever);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                mediaMetadataRetriever = null;
            }
        } catch (RuntimeException e3) {
            e = e3;
        } catch (Exception e4) {
            e = e4;
        }
    }

    public static MaterialInfo scanImageFile(String str) {
        MaterialInfo materialInfo = new MaterialInfo();
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            DfxGuard.getPolicy().onReadDisk();
            BitmapFactory.decodeFile(str, options);
            materialInfo.setWidth(options.outWidth);
            materialInfo.setHeight(options.outHeight);
            int i = 0;
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 0);
            if (attributeInt != -1) {
                if (attributeInt == 3) {
                    i = 180;
                } else if (attributeInt == 6) {
                    i = 90;
                } else if (attributeInt == 8) {
                    i = 270;
                }
                materialInfo.setRotation(i);
                materialInfo.setPath(str);
                materialInfo.setMontagePath(str);
                materialInfo.setType(PresenterUtils.PHOTO);
                materialInfo.setDuration(60000);
                return materialInfo;
            }
        } catch (FileNotFoundException unused) {
            LogUtil.d(TAG, "scanImageFile Could not find file to read exif: ", str);
        } catch (IOException e) {
            LogUtil.d(TAG, "scanImageFile Could not read exif from file: ", str, " IOException is ", ExceptionUtils.c(e));
        } catch (Exception e2) {
            LogUtil.d(TAG, "scanImageFile Exception", ExceptionUtils.c(e2));
        } catch (OutOfMemoryError e3) {
            LogUtil.d(TAG, "scanImageFile OutOfMemoryError ", ExceptionUtils.c(e3));
        } catch (RuntimeException e4) {
            LogUtil.d(TAG, "scanImageFile RuntimeException", ExceptionUtils.c(e4));
        }
        return materialInfo;
    }

    public static boolean isVideoFormatSupport(String str) {
        return new EditUtil().isSupportFormat(str);
    }

    public static boolean isPhotoFormatSupport(String str) {
        Optional<Integer> fileType = FileType.getFileType(str);
        if (!fileType.isPresent()) {
            LogUtil.d(TAG, "fileType is not present");
            return false;
        }
        int iIntValue = fileType.get().intValue();
        if (iIntValue < 34 || iIntValue > 40) {
            return iIntValue >= 300 && iIntValue <= 310;
        }
        return true;
    }

    public static boolean showFormatSupportToast(Context context, List<Uri> list, List<MaterialInfo> list2) {
        if (context == null) {
            LogUtil.d(TAG, "showFormatSupportToast context is null");
            return false;
        }
        if (njy.e(list) || njy.e(list2)) {
            LogUtil.d(TAG, "showFormatSupportToast originUriList or nowFileList is empty");
            return true;
        }
        if (list.size() > list2.size()) {
            LogUtil.d(TAG, "showFormatSupportToast originSize > nowSize");
        }
        return false;
    }

    public static String generateJsonData(List<MaterialInfo> list) {
        Gson gson = new Gson();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(i, new JSONObject(gson.toJson(list.get(i))));
            } catch (JSONException unused) {
                LogUtil.d(TAG, "generateJsonData JSONException");
            }
        }
        return jSONArray.toString();
    }

    public static void deleteFolderFile(String str) {
        File[] fileArrListFiles;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    deleteFolderFile(file2.getCanonicalPath());
                } catch (IOException unused) {
                    LogUtil.d(TAG, "deleteFolderFile file delete error");
                }
            }
        }
        if (!file.isDirectory()) {
            if (file.delete()) {
                return;
            }
            LogUtil.d(TAG, "deleteFolderFile cache file delete error");
        } else {
            File[] fileArrListFiles2 = file.listFiles();
            if (fileArrListFiles2 == null || fileArrListFiles2.length != 0 || file.delete()) {
                return;
            }
            LogUtil.d(TAG, "deleteFolderFile cache file delete error");
        }
    }

    public static void unZipFolder(String str, String str2, String str3) {
        ZipInputStream zipInputStream;
        if (str == null || str2 == null) {
            return;
        }
        try {
            if (str3 == null) {
                zipInputStream = new ZipInputStream(new FileInputStream(str));
            } else {
                zipInputStream = new ZipInputStream(new FileInputStream(str), Charset.forName(str3));
            }
        } catch (FileNotFoundException unused) {
            LogUtil.d(TAG, "unZipFolder Invalid file");
            zipInputStream = null;
        }
        if (zipInputStream == null) {
            LogUtil.d(TAG, "unZipFolder crate inZip failed ,is null");
            return;
        }
        while (true) {
            try {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        String name = nextEntry.getName();
                        if (!name.contains(FeedbackWebConstants.INVALID_FILE_NAME_PRE)) {
                            if (nextEntry.isDirectory()) {
                                makeDirectory(name, str2);
                            } else {
                                outputUnZipFile(name, str2, zipInputStream);
                            }
                        }
                    } else {
                        try {
                            zipInputStream.close();
                            return;
                        } catch (IOException e) {
                            LogUtil.d(TAG, "unZipFolder IOException error", ExceptionUtils.c(e));
                            return;
                        }
                    }
                } catch (IOException e2) {
                    LogUtil.d(TAG, "unZipFolder IOException ", ExceptionUtils.c(e2));
                    try {
                        zipInputStream.close();
                        return;
                    } catch (IOException e3) {
                        LogUtil.d(TAG, "unZipFolder IOException error", ExceptionUtils.c(e3));
                        return;
                    }
                }
            } catch (Throwable th) {
                try {
                    zipInputStream.close();
                } catch (IOException e4) {
                    LogUtil.d(TAG, "unZipFolder IOException error", ExceptionUtils.c(e4));
                }
                throw th;
            }
        }
    }

    public static void unZipFolder(String str, String str2) {
        unZipFolder(str, str2, null);
    }

    private static void makeDirectory(String str, String str2) {
        if (str.isEmpty()) {
            return;
        }
        if (new File(str2 + File.separator + SafeString.substring(str, 0, str.length() - 1)).mkdirs()) {
            return;
        }
        LogUtil.d(TAG, "make director failed");
    }

    private static void outputUnZipFile(String str, String str2, ZipInputStream zipInputStream) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        IOException e;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                File file = new File(str2 + File.separator + str);
                if (!file.exists()) {
                    boolean zMkdirs = file.getParentFile().mkdirs();
                    boolean zCreateNewFile = file.createNewFile();
                    if (!zMkdirs || !zCreateNewFile) {
                        LogUtil.d(TAG, "outputUnZipFile create file failed");
                    }
                }
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = zipInputStream.read(bArr);
                        if (i != -1) {
                            fileOutputStream.write(bArr, 0, i);
                            fileOutputStream.flush();
                        } else {
                            try {
                                fileOutputStream.close();
                                return;
                            } catch (IOException e2) {
                                LogUtil.d(TAG, "outputUnZipFile IOException error is ", ExceptionUtils.c(e2));
                                return;
                            }
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    LogUtil.d(TAG, "outputUnZipFile IOException is ", ExceptionUtils.c(e));
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e4) {
                            LogUtil.d(TAG, "outputUnZipFile IOException error is ", ExceptionUtils.c(e4));
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            LogUtil.d(TAG, "outputUnZipFile IOException error is ", ExceptionUtils.c(e5));
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = fileOutputStream2;
        }
    }

    public static Optional<Tracks> findTrack(TemplateModel templateModel, String str) {
        if (templateModel == null) {
            LogUtil.d(TAG, "findTrack model is null");
            return Optional.empty();
        }
        List<Tracks> tracks = templateModel.getTracks();
        if (Utils.isEmpty(tracks)) {
            LogUtil.d(TAG, "findTrack tracks is empty.");
            return Optional.empty();
        }
        for (Tracks tracks2 : tracks) {
            if (Objects.equals(tracks2.getType(), str)) {
                return Optional.of(tracks2);
            }
        }
        return Optional.empty();
    }

    public static Optional<Tracks> findVideoTrack(TemplateModel templateModel) {
        return findTrack(templateModel, "video");
    }

    public static Optional<Tracks> findAudioTrack(TemplateModel templateModel) {
        return findTrack(templateModel, "audio");
    }

    public static int getTrackDuration(Tracks tracks) {
        List<Segments> segments;
        if (tracks == null || (segments = tracks.getSegments()) == null || segments.size() < 1) {
            return 0;
        }
        Segments segments2 = segments.get(segments.size() - 1);
        return segments2.getSegmentsTargetTimerange().getStart() + segments2.getSegmentsTargetTimerange().getDuration();
    }

    public static void queueModelStack(TemplateModel templateModel) {
        templateModel.getOperationStack().queueStack(templateModel);
    }

    public static String saveProjectJson(String str, String str2, Context context, TemplateModel templateModel) throws Throwable {
        BufferedWriter bufferedWriter;
        if (context == null || templateModel == null) {
            return "";
        }
        String json = new Gson().toJson(templateModel);
        String str3 = context.getFilesDir() + "/" + str;
        String str4 = str3 + "/" + str2 + ".json";
        File file = new File(str3);
        if (!file.exists()) {
            LogUtil.e(TAG, "findTrack create result", Boolean.valueOf(file.mkdir()));
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str4, false), StandardCharsets.UTF_8));
                try {
                    bufferedWriter.write(json);
                    try {
                        bufferedWriter.close();
                        return str4;
                    } catch (IOException unused) {
                        LogUtil.d(TAG, "findTrack file IO error");
                        return str4;
                    }
                } catch (IOException unused2) {
                    bufferedWriter2 = bufferedWriter;
                    LogUtil.d(TAG, "findTrack file IO error");
                    if (bufferedWriter2 != null) {
                        try {
                            bufferedWriter2.close();
                        } catch (IOException unused3) {
                            LogUtil.d(TAG, "findTrack file IO error");
                        }
                    }
                    return str4;
                } catch (Throwable th) {
                    th = th;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException unused4) {
                            LogUtil.d(TAG, "findTrack file IO error");
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
            }
        } catch (IOException unused5) {
        }
    }

    public static int getVideoCountFromMaterialList(List<MaterialInfo> list) {
        if (ListUtil.isEmpty(list)) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            MaterialInfo materialInfo = list.get(i2);
            if (materialInfo != null && "video".startsWith(materialInfo.getType())) {
                i++;
            }
        }
        return i;
    }

    public static long getFileSize(String str) {
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            return file.length();
        }
        return 0L;
    }

    public static String getSettingFormatNumericDateDependLocal(Context context, long j) {
        return DateUtils.formatDateTime(context, j, 131072);
    }

    public static void reCalibrateModelDuration(TemplateModel templateModel) {
        templateModel.setDuration(Math.max(getTrackDuration(findVideoTrack(templateModel).orElse(null)), getTrackDuration(findAudioTrack(templateModel).orElse(null))));
    }
}
