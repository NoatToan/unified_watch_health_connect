package com.xiaomi.fitness.watch.face.edit.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import defpackage.gh8;
import defpackage.kq2;
import defpackage.uw8;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\u0005J\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\t\u001a\u00020\u0005H\u0007J,\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0017\u001a\u00020\fH\u0002J&\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"J\u001a\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020 J\u000e\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005J&\u0010,\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010-\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005J\u0016\u0010.\u001a\u00020/2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\fJ\u0010\u00101\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0005J\u001a\u00102\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 032\u0006\u0010\u0015\u001a\u00020\u0005J.\u00104\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\fJ\u000e\u00105\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/utils/DialFileUtils;", "", "<init>", "()V", "STUB_PATH_PREVIEW", "", "STUB_PATH_RESOURCES", "TAG", "getDialResourceFilePath", "filePath", "getDialPreviewFileList", "", "Ljava/io/File;", "getNameToIdMap", "", "checkUnzipFiles", "did", FaceInfoBase.FACE_ID, "fileHash", "ignoreBin", "", "path", "foundManifest", "baseFile", "getOriginImageFile", "context", "Landroid/content/Context;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "getImageRotation", "", "inputStream", "Ljava/io/InputStream;", "rotateBitmap", "Landroid/graphics/Bitmap;", "originalBitmap", "rotationDegrees", "getFitInSampleSize", "options", "Landroid/graphics/BitmapFactory$Options;", "getImageFolderPath", "originPath", "getOriginVideoFile", "getVideoFolderPath", "getMediaDuration", "", "file", "getVideoThumb", "getMediaSize", "Lkotlin/Pair;", "getVideoThumbnailFile", "isSupportVideo", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDialFileUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialFileUtils.kt\ncom/xiaomi/fitness/watch/face/edit/utils/DialFileUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n1#2:451\n*E\n"})
public final class DialFileUtils {

    @NotNull
    public static final DialFileUtils INSTANCE = new DialFileUtils();

    @NotNull
    private static final String STUB_PATH_PREVIEW = "preview";

    @NotNull
    private static final String STUB_PATH_RESOURCES = "resources";

    @NotNull
    private static final String TAG = "DialFileUtils";

    private DialFileUtils() {
    }

    public static /* synthetic */ File checkUnzipFiles$default(DialFileUtils dialFileUtils, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return dialFileUtils.checkUnzipFiles(str, str2, str3, z);
    }

    private final File foundManifest(File baseFile) {
        File[] fileArrListFiles = baseFile.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                Intrinsics.checkNotNull(file);
                File fileFoundManifest = foundManifest(file);
                if (fileFoundManifest != null) {
                    return fileFoundManifest;
                }
            } else if (Intrinsics.areEqual(file.getName(), "manifest.xml")) {
                return file;
            }
        }
        return null;
    }

    @Nullable
    public final File checkUnzipFiles(@NotNull String did, @NotNull String faceId, @Nullable String fileHash, boolean ignoreBin) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        String strC = uw8.c();
        String str = File.separator;
        return checkUnzipFiles(strC + str + did + str + faceId + str + fileHash, ignoreBin);
    }

    @NotNull
    public final List<File> getDialPreviewFileList(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        ArrayList arrayList = new ArrayList();
        String str = filePath + File.separator + "preview";
        arrayList.add(new File(str, "market-preview.png"));
        arrayList.add(new File(str, "aod-preview.png"));
        return arrayList;
    }

    @NotNull
    public final String getDialResourceFilePath(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return filePath + File.separator + STUB_PATH_RESOURCES;
    }

    public final int getFitInSampleSize(@NotNull BitmapFactory.Options options) {
        Intrinsics.checkNotNullParameter(options, "options");
        int i = options.outWidth;
        int i2 = options.outHeight;
        int i3 = HMSedentaryConfig.INGORE_START_INDEX;
        int i4 = Constants.FHD_WIDTH;
        if (i > i2) {
            i4 = 720;
            i3 = 1080;
        }
        int iRoundToInt = (i > i3 || i2 > i4) ? MathKt__MathJVMKt.roundToInt(RangesKt___RangesKt.coerceAtMost(i / i3, i2 / i4)) : 1;
        Logger.d(TAG, "getFitInSampleSize: " + i + " " + i2 + " " + iRoundToInt);
        return iRoundToInt;
    }

    @NotNull
    public final String getImageFolderPath(@NotNull String originPath) {
        Intrinsics.checkNotNullParameter(originPath, "originPath");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) originPath, new String[]{"origin.jpg"}, false, 0, 6, (Object) null);
        return listSplit$default.isEmpty() ^ true ? (String) listSplit$default.get(0) : "";
    }

    public final int getImageRotation(@Nullable InputStream inputStream) {
        if (inputStream == null) {
            return 0;
        }
        try {
            int iH = new gh8(inputStream).h("Orientation", 0);
            if (iH == 3) {
                return 180;
            }
            if (iH != 6) {
                return iH != 8 ? 0 : 270;
            }
            return 90;
        } catch (Exception e) {
            Logger.e(TAG, "getImageRotation error " + e.getMessage());
            return 0;
        }
    }

    public final long getMediaDuration(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(context, uri);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            mediaMetadataRetriever.release();
            Intrinsics.checkNotNull(strExtractMetadata);
            return Long.parseLong(strExtractMetadata);
        } catch (Exception e) {
            e.printStackTrace();
            Logger.e(TAG, "getMediaDuration failed uri");
            return 0L;
        }
    }

    @NotNull
    public final Pair<Integer, Integer> getMediaSize(@NotNull String path) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(path, "path");
        int i3 = 0;
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(path);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
            i2 = strExtractMetadata != null ? Integer.parseInt(strExtractMetadata) : 0;
            try {
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                i3 = strExtractMetadata2 != null ? Integer.parseInt(strExtractMetadata2) : 0;
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                Logger.i(TAG, "width " + i2 + " height " + i3 + " rotation " + strExtractMetadata3);
                if (Intrinsics.areEqual("90", strExtractMetadata3) || Intrinsics.areEqual("270", strExtractMetadata3)) {
                    int i4 = i2;
                    i2 = i3;
                    i3 = i4;
                }
            } catch (Exception unused) {
                i = i3;
                i3 = i2;
                Logger.e(TAG, "getMediaSize fail " + path);
                i2 = i3;
                i3 = i;
            }
        } catch (Exception unused2) {
            i = 0;
        }
        return TuplesKt.to(Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.io.InputStreamReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.InputStreamReader] */
    @NotNull
    public final Map<String, String> getNameToIdMap(@NotNull String filePath) throws Throwable {
        ?? r0;
        BufferedReader bufferedReader;
        FileInputStream fileInputStream;
        BufferedReader bufferedReader2;
        Exception e;
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        ?? file = new File(filePath, "uidmap.map");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!file.exists()) {
            Logger.e(TAG, "getNameIdMap file not exists");
            return linkedHashMap;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream((File) file);
                try {
                    file = new InputStreamReader(fileInputStream);
                    try {
                        bufferedReader2 = new BufferedReader(file);
                        while (true) {
                            try {
                                String line = bufferedReader2.readLine();
                                if (line == null) {
                                    break;
                                }
                                Intrinsics.checkNotNull(line);
                                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) line, new String[]{":"}, false, 0, 6, (Object) null);
                                if (listSplit$default.size() >= 2) {
                                    String str = (String) listSplit$default.get(0);
                                    String strReplace$default = StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(1), " ", "", false, 4, (Object) null);
                                    if (!StringsKt__StringsKt.isBlank(str) && !StringsKt__StringsKt.isBlank(strReplace$default)) {
                                        linkedHashMap.put(str, String.valueOf(Integer.parseInt(strReplace$default, CharsKt__CharJVMKt.checkRadix(16))));
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                                Logger.e(TAG, "getNameIdMap exception " + e);
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (file != 0) {
                                    file.close();
                                }
                                if (bufferedReader2 != null) {
                                }
                                Logger.i(TAG, "getNameIdMap result " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        fileInputStream.close();
                        file.close();
                    } catch (Exception e3) {
                        bufferedReader2 = null;
                        e = e3;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = null;
                        fileInputStream2 = fileInputStream;
                        r0 = file;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (r0 != 0) {
                            r0.close();
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    bufferedReader2 = null;
                    e = e;
                    file = bufferedReader2;
                    Logger.e(TAG, "getNameIdMap exception " + e);
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (file != 0) {
                        file.close();
                    }
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    Logger.i(TAG, "getNameIdMap result " + linkedHashMap);
                    return linkedHashMap;
                } catch (Throwable th2) {
                    th = th2;
                    file = 0;
                    bufferedReader = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e5) {
            e = e5;
            fileInputStream = null;
            bufferedReader2 = null;
        } catch (Throwable th4) {
            th = th4;
            r0 = 0;
            bufferedReader = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (r0 != 0) {
                r0.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
        bufferedReader2.close();
        Logger.i(TAG, "getNameIdMap result " + linkedHashMap);
        return linkedHashMap;
    }

    @NotNull
    public final String getOriginImageFile(@NotNull Context context, @NotNull WearableDeviceModel deviceModel, @NotNull String faceId, @NotNull Uri uri) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String strC = uw8.c();
        String str = File.separator;
        String str2 = strC + str + deviceModel.getDid() + str + faceId + str + "photo";
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        String str3 = str2 + str + System.currentTimeMillis() + str + "origin.png";
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            int imageRotation = getImageRotation(inputStreamOpenInputStream);
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            InputStream inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(uri);
            BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
            if (inputStreamOpenInputStream2 != null) {
                inputStreamOpenInputStream2.close();
            }
            options.inMutable = true;
            options.inJustDecodeBounds = false;
            options.inSampleSize = INSTANCE.getFitInSampleSize(options);
            InputStream inputStreamOpenInputStream3 = context.getContentResolver().openInputStream(uri);
            kq2.c(rotateBitmap(BitmapFactory.decodeStream(inputStreamOpenInputStream3, null, options), imageRotation), str3);
            if (inputStreamOpenInputStream3 != null) {
                inputStreamOpenInputStream3.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str3;
    }

    @NotNull
    public final String getOriginVideoFile(@NotNull Context context, @NotNull WearableDeviceModel deviceModel, @NotNull String faceId, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String strC = uw8.c();
        String str = File.separator;
        String str2 = strC + str + deviceModel.getDid() + str + faceId + str + "video" + str + System.currentTimeMillis();
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str2, "origin" + System.currentTimeMillis() + ".mp4");
        try {
            if (!file2.exists()) {
                file2.createNewFile();
            }
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                ByteStreamsKt.copyTo$default(inputStreamOpenInputStream, new FileOutputStream(file2), 0, 2, null);
            }
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String path = file2.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return path;
    }

    @NotNull
    public final String getVideoFolderPath(@NotNull String originPath) {
        Intrinsics.checkNotNullParameter(originPath, "originPath");
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) originPath, separator, 0, false, 6, (Object) null);
        if (iLastIndexOf$default <= -1) {
            return "";
        }
        String strSubstring = originPath.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Nullable
    public final String getVideoThumb(@NotNull String path) throws Throwable {
        Intrinsics.checkNotNullParameter(path, "path");
        String str = null;
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(path);
            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(0L);
            String videoFolderPath = getVideoFolderPath(path);
            File file = new File(videoFolderPath);
            if (!file.exists()) {
                file.mkdirs();
            }
            str = videoFolderPath + File.separator + "thumb" + System.currentTimeMillis() + ".png";
            kq2.c(frameAtTime, str);
            mediaMetadataRetriever.release();
            return str;
        } catch (Exception e) {
            Logger.e(TAG, e.getMessage());
            return str;
        }
    }

    @NotNull
    public final String getVideoThumbnailFile(@NotNull Context context, @NotNull WearableDeviceModel deviceModel, @NotNull String faceId, @NotNull Uri uri, @NotNull File file) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(file, "file");
        String strC = uw8.c();
        String str = File.separator;
        String str2 = strC + str + deviceModel.getDid() + str + faceId + str + "video" + str + System.currentTimeMillis();
        File file2 = new File(str2);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        String str3 = str2 + str + "origin.png";
        try {
            kq2.c(ThumbnailUtils.createVideoThumbnail(file.getPath(), 1), str3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str3;
    }

    public final boolean isSupportVideo(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        MediaExtractor mediaExtractor = new MediaExtractor();
        boolean z = false;
        try {
            try {
                mediaExtractor.setDataSource(path, null);
                int trackCount = mediaExtractor.getTrackCount();
                HashSet hashSet = new HashSet();
                for (int i = 0; i < trackCount; i++) {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                    Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
                    String string = trackFormat.getString("mime");
                    Intrinsics.checkNotNull(string);
                    if (StringsKt__StringsJVMKt.startsWith$default(string, "video/", false, 2, null)) {
                        hashSet.add(string);
                    }
                }
                Logger.i(TAG, "video mimetype " + hashSet);
                if (hashSet.size() == 1 && (hashSet.contains("video/avc") || hashSet.contains("video/hevc"))) {
                    z = true;
                }
                return z;
            } catch (Exception e) {
                Logger.e(TAG, "isSupportVideo error " + e.getMessage());
                return false;
            }
        } finally {
            mediaExtractor.release();
        }
    }

    @Nullable
    public final Bitmap rotateBitmap(@Nullable Bitmap originalBitmap, int rotationDegrees) {
        if (originalBitmap == null || rotationDegrees == 0) {
            return originalBitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(rotationDegrees);
        return Bitmap.createBitmap(originalBitmap, 0, 0, originalBitmap.getWidth(), originalBitmap.getHeight(), matrix, true);
    }

    public static /* synthetic */ File checkUnzipFiles$default(DialFileUtils dialFileUtils, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return dialFileUtils.checkUnzipFiles(str, z);
    }

    @Nullable
    public final File checkUnzipFiles(@NotNull String path, boolean ignoreBin) {
        File parentFile;
        File[] fileArrListFiles;
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path);
        if (file.exists() && file.isDirectory()) {
            File fileFoundManifest = foundManifest(file);
            if (fileFoundManifest == null) {
                return null;
            }
            Logger.i(TAG, "checkUnzipFiles manifestXml: " + fileFoundManifest);
            File parentFile2 = fileFoundManifest.getParentFile();
            if (parentFile2 == null || (parentFile = parentFile2.getParentFile()) == null || (fileArrListFiles = parentFile.listFiles()) == null) {
                return null;
            }
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (File file2 : fileArrListFiles) {
                if (Intrinsics.areEqual(file2.getName(), "preview")) {
                    z = true;
                }
                if (Intrinsics.areEqual(file2.getName(), STUB_PATH_RESOURCES)) {
                    z2 = true;
                }
                if (Intrinsics.areEqual(file2.getName(), "uidmap.map")) {
                    z3 = true;
                }
                String name = file2.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (StringsKt__StringsJVMKt.endsWith$default(name, ".bin", false, 2, null)) {
                    ignoreBin = true;
                }
            }
            Logger.i(TAG, "check unzip file hasPreview: " + z + " hasResource: " + z2 + " hasMap: " + z3 + " hasBin: " + ignoreBin);
            if (z && z2 && z3 && ignoreBin) {
                return parentFile;
            }
            Logger.i(TAG, "lack of something");
            return null;
        }
        Logger.i(TAG, file + " not exist!!");
        return null;
    }

    public final long getMediaDuration(@Nullable File file) {
        if (file != null && file.exists()) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(file.getPath());
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                mediaMetadataRetriever.release();
                Intrinsics.checkNotNull(strExtractMetadata);
                return Long.parseLong(strExtractMetadata);
            } catch (Exception e) {
                e.printStackTrace();
                Logger.e(TAG, "getMediaDuration failed uri");
            }
        }
        return 0L;
    }
}
