package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.openalliance.ad.constant.TagConstants;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.operation.OperationKey;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class lka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f40360a = File.separator + "hiSequence";

    public static boolean d(String str) {
        return !TextUtils.isEmpty(str) && str.getBytes(StandardCharsets.UTF_8).length > 921600;
    }

    public static boolean d(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            ReleaseLogUtil.e("HiH_HiSequenceFileUtil", "the input or fileName is empty, not need to save. name:", str2);
            return false;
        }
        ReleaseLogUtil.c("HiH_HiSequenceFileUtil", "saveBigSequence detail in file:", str2, " size:", Integer.valueOf(str.getBytes(StandardCharsets.UTF_8).length));
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(TagConstants.SCENE_TYPE, "detailOverSizeLimit");
        linkedHashMap.put("detailLength", String.valueOf(str.length()));
        linkedHashMap.put(ContentResource.FILE_NAME, str2);
        ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_SEQUENCE_DETAIL_OVER_LIMIT_2129012.value(), linkedHashMap, false);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                File file = new File(BaseApplication.b().getFilesDir() + f40360a, str2);
                File parentFile = file.getParentFile();
                if (parentFile == null) {
                    ReleaseLogUtil.e("HiH_HiSequenceFileUtil", "the parentFile is null");
                    return false;
                }
                FileUtils.c(parentFile);
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(str.getBytes(StandardCharsets.ISO_8859_1));
                    FileUtils.a(fileOutputStream);
                    return true;
                } catch (IOException e) {
                    e = e;
                    fileOutputStream2 = fileOutputStream;
                    ReleaseLogUtil.e("HiH_HiSequenceFileUtil", "save detail file.appear exception:", ExceptionUtils.c(e));
                    if (fileOutputStream2 != null) {
                        FileUtils.a(fileOutputStream2);
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                        FileUtils.a(fileOutputStream);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public static String b(long j, int i, int i2) {
        return "detail_" + j + "_" + i + "_" + i2;
    }

    public static String e(long j, int i, int i2) {
        return "metadata_" + j + "_" + i + "_" + i2;
    }

    public static String c(String str) {
        return a(str);
    }

    public static boolean b(String str, String str2) {
        e(str2);
        return d(str, str2);
    }

    public static String a(String str) {
        File file = new File(BaseApplication.b().getFilesDir() + f40360a, str);
        if (!file.exists()) {
            ReleaseLogUtil.e("HiH_HiSequenceFileUtil", "the sequenceDetail file is not exists:", str);
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put(TagConstants.SCENE_TYPE, "readDetail_FileNotExit");
            linkedHashMap.put(ContentResource.FILE_NAME, str);
            ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_SEQUENCE_DETAIL_OVER_LIMIT_2129012.value(), linkedHashMap, false);
            return "";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i != -1) {
                        byteArrayOutputStream.write(bArr, 0, i);
                    } else {
                        String str2 = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.ISO_8859_1);
                        ReleaseLogUtil.c("HiH_HiSequenceFileUtil", "read sequence detail from file,name:", str, " size:", Integer.valueOf(str2.length()));
                        fileInputStream.close();
                        return str2;
                    }
                    ReleaseLogUtil.e("HiH_HiSequenceFileUtil", "readSequenceDetail. name", str, " appear exception:", ExceptionUtils.c(e));
                    LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>();
                    linkedHashMap2.put(TagConstants.SCENE_TYPE, "readDetail_appearIOException");
                    linkedHashMap2.put(ContentResource.FILE_NAME, str);
                    ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_SEQUENCE_DETAIL_OVER_LIMIT_2129012.value(), linkedHashMap2, false);
                    return "";
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            ReleaseLogUtil.e("HiH_HiSequenceFileUtil", "readSequenceDetail. name", str, " appear exception:", ExceptionUtils.c(e));
            LinkedHashMap<String, String> linkedHashMap3 = new LinkedHashMap<>();
            linkedHashMap3.put(TagConstants.SCENE_TYPE, "readDetail_appearIOException");
            linkedHashMap3.put(ContentResource.FILE_NAME, str);
            ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_SEQUENCE_DETAIL_OVER_LIMIT_2129012.value(), linkedHashMap3, false);
            return "";
        }
    }

    public static boolean b(String str) {
        boolean zJ = FileUtils.j(new File(BaseApplication.b().getFilesDir() + f40360a, str));
        if (!zJ) {
            ReleaseLogUtil.b("HiH_HiSequenceFileUtil", "deleteSequenceDetail result is false,name:", str);
        }
        return zJ;
    }

    public static boolean e(String str) {
        return b(str);
    }
}
