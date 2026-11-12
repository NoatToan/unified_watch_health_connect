package com.xiaomi.fitness.devicesettings.utils;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapExKt;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.b4s;
import defpackage.z07;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b)\u0010*J7\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/utils/ZipUtil;", "", "", "filePath", "", "id", "Lkotlin/Function2;", "", "", "action", "unZip", "(Ljava/lang/String;JLkotlin/jvm/functions/Function2;)V", "Landroid/content/Context;", "context", "Lz07;", "parent", "name", "Ljava/io/InputStream;", "inputStream", "copyInputStream", "(Landroid/content/Context;Lz07;Ljava/lang/String;Ljava/io/InputStream;)V", "mapDir", "Ljava/lang/String;", "getMapDir", "()Ljava/lang/String;", "TAG", "ZIP_SUCCESS", "I", "ZIP_FAILED", "", "ZOOM_ARRAY", "[Ljava/lang/String;", "getZOOM_ARRAY", "()[Ljava/lang/String;", "Landroid/net/Uri;", "targetUri", "Landroid/net/Uri;", "getTargetUri", "()Landroid/net/Uri;", "setTargetUri", "(Landroid/net/Uri;)V", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nZipUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipUtil.kt\ncom/xiaomi/fitness/devicesettings/utils/ZipUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
public final class ZipUtil {

    @NotNull
    public static final String TAG = "OfflineMapManager_fileUtil";
    public static final int ZIP_FAILED = -1;
    public static final int ZIP_SUCCESS = 0;

    @Nullable
    private static Uri targetUri;

    @NotNull
    public static final ZipUtil INSTANCE = new ZipUtil();

    @Nullable
    private static final String mapDir = FileUtils.INSTANCE.getExternalFilesDirPath("offlineMap");

    @NotNull
    private static final String[] ZOOM_ARRAY = {"6", UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP, UserConfig.KEY_MI_BRAIN_SETTING, UserConfig.KEY_LITE_SCENE_ORDER, b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD, b4s.APPLY_CHANNEL_TOKEN2_QUICK_BIND_CARD, "12", "13", "14", "15", "16"};

    private ZipUtil() {
    }

    public final void copyInputStream(@NotNull Context context, @NotNull z07 parent, @NotNull String name, @NotNull InputStream inputStream) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        try {
            z07 z07VarB = parent.b("application/octet-stream", name);
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNull(z07VarB);
            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(z07VarB.k());
            try {
                byte[] bArr = new byte[4194304];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        inputStream.close();
                        Intrinsics.checkNotNull(outputStreamOpenOutputStream);
                        outputStreamOpenOutputStream.flush();
                        outputStreamOpenOutputStream.close();
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(outputStreamOpenOutputStream, null);
                        return;
                    }
                    Intrinsics.checkNotNull(outputStreamOpenOutputStream);
                    outputStreamOpenOutputStream.write(bArr, 0, i);
                    Logger.i(TAG, "copyInputStream IOException:" + e);
                    throw e;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(outputStreamOpenOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            Logger.i(TAG, "copyInputStream IOException:" + e);
            throw e;
        }
    }

    @Nullable
    public final String getMapDir() {
        return mapDir;
    }

    @Nullable
    public final Uri getTargetUri() {
        return targetUri;
    }

    @NotNull
    public final String[] getZOOM_ARRAY() {
        return ZOOM_ARRAY;
    }

    public final void setTargetUri(@Nullable Uri uri) {
        targetUri = uri;
    }

    public final void unZip(@NotNull String filePath, long id, @NotNull Function2<? super Integer, ? super String, Unit> action) {
        Function2<? super Integer, ? super String, Unit> function2;
        long j;
        id = id;
        action = action;
        String str = "getName(...)";
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(action, "action");
        File file = new File(filePath);
        if (!file.exists()) {
            return;
        }
        String string = file.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        boolean z = false;
        if (!StringsKt__StringsJVMKt.endsWith$default(string, ".zip", false, 2, null)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Logger.d(TAG, "开始解压缩！文件:" + file.getAbsolutePath());
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                try {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    String name = zipEntryNextElement.getName();
                    Intrinsics.checkNotNullExpressionValue(name, str);
                    String[] strArr = new String[1];
                    strArr[z ? 1 : 0] = "/";
                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) name, strArr, false, 0, 6, (Object) null);
                    Logger.i(TAG, "subPathArr:" + listSplit$default);
                    String name2 = zipEntryNextElement.getName();
                    Intrinsics.checkNotNullExpressionValue(name2, str);
                    str = str;
                    enumerationEntries = enumerationEntries;
                    if (StringsKt__StringsJVMKt.endsWith$default(name2, OfflineMapExKt.GDP_SUFFIX, z, 2, null) && listSplit$default.size() > 1 && ArraysKt___ArraysKt.contains(ZOOM_ARRAY, listSplit$default.get(listSplit$default.size() - 2))) {
                        String str2 = (String) listSplit$default.get(listSplit$default.size() - 2);
                        String str3 = (String) listSplit$default.get(listSplit$default.size() - 1);
                        Uri uri = targetUri;
                        if (uri != null) {
                            z07 z07VarH = z07.h(ApplicationExtKt.getApplication(), uri);
                            Logger.i(TAG, "Target uri:" + uri + ",root path:" + (z07VarH != null ? z07VarH.i() : null));
                            Intrinsics.checkNotNull(z07VarH);
                            z07[] z07VarArrM = z07VarH.m();
                            Intrinsics.checkNotNullExpressionValue(z07VarArrM, "listFiles(...)");
                            int i = 0;
                            for (int length = z07VarArrM.length; i < length; length = length) {
                                z07 z07Var = z07VarArrM[i];
                                z07[] z07VarArr = z07VarArrM;
                                Logger.i(TAG, " child:" + z07Var.k() + "  name:" + z07Var.i());
                                i++;
                                z07VarArrM = z07VarArr;
                            }
                            z07 z07VarE = z07VarH.e("map");
                            if (z07VarE == null) {
                                z07VarH.a("map");
                                z07VarE = z07VarH.e("map");
                            }
                            Intrinsics.checkNotNull(z07VarE);
                            z07 z07VarE2 = z07VarE.e(str2);
                            if (z07VarE2 == null) {
                                z07VarE.a(str2);
                                z07VarE2 = z07VarE.e(str2);
                            }
                            Logger.i(TAG, "level:" + str2 + " level dir:" + (z07VarE2 != null ? z07VarE2.k() : null));
                            Intrinsics.checkNotNull(z07VarE2);
                            z07 z07VarE3 = z07VarE2.e(str3);
                            InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                            if (z07VarE3 == null) {
                                ZipUtil zipUtil = INSTANCE;
                                Application application = ApplicationExtKt.getApplication();
                                Intrinsics.checkNotNull(inputStream);
                                zipUtil.copyInputStream(application, z07VarE2, str3, inputStream);
                            }
                            z = false;
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    j = id;
                    function2 = action;
                    Logger.e(TAG, "解压缩失败，error:" + e);
                    function2.invoke(-1, j + " 安装失败");
                }
            }
            zipFile.close();
            Logger.i(TAG, "解压缩完成！文件:" + file.getAbsolutePath() + ",耗时：" + (System.currentTimeMillis() - jCurrentTimeMillis));
            StringBuilder sb = new StringBuilder();
            j = id;
            try {
                sb.append(j);
                sb.append(" 安装成功");
                function2 = action;
                try {
                    function2.invoke(0, sb.toString());
                } catch (Exception e2) {
                    e = e2;
                    Logger.e(TAG, "解压缩失败，error:" + e);
                    function2.invoke(-1, j + " 安装失败");
                }
            } catch (Exception e3) {
                e = e3;
                function2 = action;
                Logger.e(TAG, "解压缩失败，error:" + e);
                function2.invoke(-1, j + " 安装失败");
            }
        } catch (Exception e4) {
            e = e4;
            function2 = action;
            j = id;
        }
    }
}
