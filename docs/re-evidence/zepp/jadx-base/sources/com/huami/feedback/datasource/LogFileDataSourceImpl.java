package com.huami.feedback.datasource;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.multidex.MultiDexExtractor;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.feedback.api.UploadFileSetting;
import com.huami.feedback.entity.UserForm;
import com.huami.feedback.log.utils.DateUtilKt;
import com.huami.feedback.log.utils.LogFileUtilsKt;
import com.huami.feedback.sync.api.device.DevicesDataSource;
import com.huami.feedback.sync.api.device.FeedbackDevice;
import com.huami.feedback.util.ConstantsKt;
import com.huami.feedback.util.ErrorConstKt;
import com.huami.feedback.util.FeedbackException;
import com.huami.feedback.util.Utils;
import com.huami.feedback.util.UtilsKt;
import com.huami.feedback.zepp.ui.FeedbackActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.FileUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001>B\u001f\u0012\u0006\u0010.\u001a\u00020,\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00105\u001a\u000203¢\u0006\u0004\b<\u0010=J\u0018\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0002J\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u001a\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0006H\u0002J\u0012\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J$\u0010'\u001a\u00020$2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$H\u0002J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010)\u001a\u00020\u0006H\u0016J\b\u0010*\u001a\u00020\u0006H\u0016J\b\u0010+\u001a\u00020\u0006H\u0016R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00104R\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00106R\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00106R\u0018\u0010:\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00109R\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00106¨\u0006?"}, d2 = {"Lcom/huami/feedback/datasource/LogFileDataSourceImpl;", "Lcom/huami/feedback/datasource/LogFileDataSource;", "Lorg/koin/core/component/KoinComponent;", "", "Ljava/io/File;", "files", "", "f", "Lcom/huami/feedback/entity/UserForm;", FeedbackActivity.KEY_USER_FORM, "zipFile", com.google.android.exoplayer2.text.ttml.b.r, "h", "i", "o", "Lcom/huami/feedback/sync/api/device/FeedbackDevice;", "feedbackDevice", "logDirFile", z.j, "m", "l", "g", hl.k, "", "fileName", "deviceSourceName", "", GoogleApiAvailabilityLight.b, "e", "Landroid/net/Uri;", "uri", "Landroid/graphics/Bitmap;", GoogleApiAvailabilityLight.a, "c", "Landroid/graphics/BitmapFactory$Options;", "options", "", "reqWidth", "reqHeight", "a", "getLogZipFile", "deleteAppLogFile", "deleteDeviceLogFile", "deleteOtherSettingsFile", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/feedback/sync/api/device/DevicesDataSource;", "b", "Lcom/huami/feedback/sync/api/device/DevicesDataSource;", "devicesDataSource", "Lcom/huami/feedback/api/UploadFileSetting;", "Lcom/huami/feedback/api/UploadFileSetting;", "uploadFileSetting", "Ljava/util/List;", "appLogFiles", "deviceLogFiles", "Ljava/io/File;", "wearCompanionLog", "settingFiles", "<init>", "(Landroid/content/Context;Lcom/huami/feedback/sync/api/device/DevicesDataSource;Lcom/huami/feedback/api/UploadFileSetting;)V", "Companion", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class LogFileDataSourceImpl implements LogFileDataSource, KoinComponent {
    private static final int h = 1048576;
    private static final int i = 720;
    private static final int j = 1280;
    private static final int k = 512000;
    private static final int l = 10;
    private static final int m = 100;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DevicesDataSource devicesDataSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final UploadFileSetting uploadFileSetting;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private List<? extends File> appLogFiles;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private List<? extends File> deviceLogFiles;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private File wearCompanionLog;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private List<? extends File> settingFiles;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ File a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(0);
            this.a = file;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("parse app log file name failed.Name:", this.a.getName());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fileName:" + this.a + ",deviceName:" + ((Object) this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ BigDecimal a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BigDecimal bigDecimal, long j) {
            super(0);
            this.a = bigDecimal;
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "压缩包大小：" + this.a + " M, " + this.b + " B";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("zip file error:", this.a);
        }
    }

    public LogFileDataSourceImpl(@NotNull Context context, @NotNull DevicesDataSource devicesDataSource, @NotNull UploadFileSetting uploadFileSetting) {
        this.context = context;
        this.devicesDataSource = devicesDataSource;
        this.uploadFileSetting = uploadFileSetting;
    }

    private final int a(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        int i4 = 1;
        if (i2 > reqWidth || i3 > reqHeight) {
            int i5 = i2 / 2;
            int i6 = i3 / 2;
            while (true) {
                if (i5 / i4 <= reqWidth && i6 / i4 <= reqHeight) {
                    break;
                }
                i4 *= 2;
            }
        }
        return i4;
    }

    public static /* synthetic */ int b(LogFileDataSourceImpl logFileDataSourceImpl, BitmapFactory.Options options, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 720;
        }
        if ((i4 & 4) != 0) {
            i3 = 1280;
        }
        return logFileDataSourceImpl.a(options, i2, i3);
    }

    private final File c(Uri uri) throws IOException {
        Bitmap bitmapD = d(uri);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i2 = 100; i2 >= 0; i2 -= 10) {
            if (bitmapD != null) {
                bitmapD.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
            }
            if (byteArrayOutputStream.size() <= k) {
                break;
            }
            byteArrayOutputStream.reset();
        }
        String str = ((Object) FileUtils.getLogRootDir(this.context)) + ((Object) File.separator) + System.currentTimeMillis() + ".jpg";
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        byteArrayOutputStream.writeTo(fileOutputStream);
        byteArrayOutputStream.close();
        fileOutputStream.close();
        if (bitmapD != null) {
            bitmapD.recycle();
        }
        return new File(str);
    }

    private final Bitmap d(Uri uri) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        InputStream inputStreamOpenInputStream = this.context.getContentResolver().openInputStream(uri);
        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream.close();
        }
        options.inSampleSize = b(this, options, 0, 0, 6, null);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(this.context.getContentResolver().openInputStream(uri), null, options);
    }

    private final void e() {
        Unit unit;
        try {
            Result.Companion companion = Result.Companion;
            File file = new File(FileUtils.getLogRootDir(this.context));
            if (file.exists()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    unit = null;
                } else {
                    for (File file2 : fileArrListFiles) {
                        if (m.endsWith(file2.getName(), ".jpg", true)) {
                            file2.delete();
                        }
                    }
                    unit = Unit.INSTANCE;
                }
                Result.m3845constructorimpl(unit);
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    private final void f(List<? extends File> files) {
        if (files == null) {
            return;
        }
        for (File file : files) {
            if (file.exists()) {
                file.delete();
            }
        }
    }

    private final List<File> g(File logDirFile) throws IOException {
        ArrayList<File> arrayList;
        HMLog.flush();
        Pattern patternCompile = Pattern.compile(ConstantsKt.APP_LOG_FILE_NAME_PATTEN);
        File[] fileArrListFiles = logDirFile.listFiles();
        if (fileArrListFiles == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (patternCompile.matcher(file.getName()).matches()) {
                    arrayList.add(file);
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        this.appLogFiles = arrayList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (File file2 : arrayList) {
            String dateFromSeconds = UtilsKt.getDateFromSeconds(file2.getName());
            if (dateFromSeconds == null) {
                HMLog.warn$default("feedback", null, new a(file2), 2, null);
            } else {
                File file3 = new File(FileUtils.getLogRootDir(this.context), dateFromSeconds);
                FileUtils.copyFile(file2, file3);
                file2 = file3;
            }
            arrayList2.add(file2);
        }
        return arrayList2;
    }

    private final List<File> h(UserForm userForm) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (userForm.getIssueItem().getAdditionalInfo().getDefaultSelectAppLog()) {
            List<File> listG = g(new File(FileUtils.getLogRootDir(this.context)));
            if (listG != null) {
                arrayList.addAll(listG);
            }
            File fileL = l();
            if (fileL != null) {
                arrayList.add(fileL);
            }
        }
        return arrayList;
    }

    private final List<File> i(UserForm userForm) {
        Object next;
        ArrayList arrayList = new ArrayList();
        if (userForm.getIssueItem().getAdditionalInfo().getDefaultSelectDeviceLog()) {
            File file = new File(FileUtils.getLogRootDir(this.context));
            Iterator<T> it2 = this.devicesDataSource.getActiveDevices().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!(((FeedbackDevice) next).getDeviceType() == userForm.getDeviceType()));
            List<File> listJ = j((FeedbackDevice) next, file);
            if (listJ != null) {
                arrayList.addAll(listJ);
            }
        }
        return arrayList;
    }

    private final List<File> j(FeedbackDevice feedbackDevice, File logDirFile) {
        File[] fileArrListFiles = logDirFile.listFiles();
        ArrayList arrayList = null;
        if (fileArrListFiles != null) {
            ArrayList arrayList2 = new ArrayList();
            for (File file : fileArrListFiles) {
                if (n(file.getName(), feedbackDevice == null ? null : feedbackDevice.getDeviceSourceName())) {
                    arrayList2.add(file);
                }
            }
            arrayList = arrayList2;
        }
        this.deviceLogFiles = arrayList;
        return arrayList;
    }

    private final List<File> k(File logDirFile) {
        ArrayList arrayList = new ArrayList();
        for (String strStringPlus : this.uploadFileSetting.getUploadSettings()) {
            if (StringsKt___StringsKt.first(strStringPlus) != File.separatorChar) {
                strStringPlus = Intrinsics.stringPlus(File.separator, strStringPlus);
            }
            File file = new File(Intrinsics.stringPlus(logDirFile.getAbsolutePath(), strStringPlus));
            if (file.exists()) {
                arrayList.add(file);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private final File l() {
        File wearCompanionLog = Utils.getWearCompanionLog(this.context);
        if (wearCompanionLog.exists()) {
            return wearCompanionLog;
        }
        return null;
    }

    private final List<File> m(UserForm userForm) {
        List<Uri> images = userForm.getImages();
        if (images == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(images, 10));
        Iterator<T> it2 = images.iterator();
        while (it2.hasNext()) {
            arrayList.add(c((Uri) it2.next()));
        }
        return arrayList;
    }

    private final boolean n(String fileName, String deviceSourceName) {
        HMLog.info("feedback", new b(fileName, deviceSourceName));
        if (deviceSourceName == null ? true : Intrinsics.areEqual(deviceSourceName, ConstantsKt.UNKNOWN_DEVICE)) {
            deviceSourceName = com.huami.feedback.log.utils.ConstantsKt.LOG_FILE_SUFFIX;
        }
        return StringsKt__StringsKt.contains$default((CharSequence) fileName, (CharSequence) deviceSourceName, false, 2, (Object) null);
    }

    private final void o(File zipFile) {
        long length = zipFile.length();
        HMLog.info("feedback", new c(new BigDecimal(length).divide(new BigDecimal(1048576), RoundingMode.HALF_EVEN).setScale(2), length));
    }

    private final void p(UserForm userForm, File zipFile) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(h(userForm));
            arrayList.addAll(i(userForm));
            List<File> listM = m(userForm);
            if (listM != null) {
                arrayList.addAll(listM);
            }
            List<File> listK = k(new File(FileUtils.getLogRootDir(this.context)));
            if (listK != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listK) {
                    if (!arrayList.contains((File) obj)) {
                        arrayList2.add(obj);
                    }
                }
                this.settingFiles = arrayList2;
                arrayList.addAll(arrayList2);
            }
            Object[] array = arrayList.toArray(new File[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Utils.zipFiles(zipFile, (File[]) array);
            o(zipFile);
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.warn$default("feedback", null, new d(thM3848exceptionOrNullimpl), 2, null);
                FeedbackException.INSTANCE.throwException(ErrorConstKt.ZIP_FILE_FAILED, Intrinsics.stringPlus("日志文件压缩失败：", thM3848exceptionOrNullimpl));
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // com.huami.feedback.datasource.LogFileDataSource
    public void deleteAppLogFile() {
        List listFilterNotNull;
        ArrayList arrayList;
        File[] fileArrFindFileByPatten = LogFileUtilsKt.findFileByPatten(FileUtils.getLogRootDir(this.context), ConstantsKt.APP_LOG_RENAME_TEMP_FILE_PATTEN);
        f((fileArrFindFileByPatten == null || (listFilterNotNull = ArraysKt___ArraysKt.filterNotNull(fileArrFindFileByPatten)) == null) ? null : CollectionsKt___CollectionsKt.toList(listFilterNotNull));
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        List<? extends File> list = this.appLogFiles;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (Long.parseLong(e.getNameWithoutExtension((File) obj)) < timeInMillis) {
                    arrayList.add(obj);
                }
            }
        }
        f(arrayList);
        this.appLogFiles = null;
        File file = this.wearCompanionLog;
        if (file != null && file.exists()) {
            file.delete();
        }
        e();
    }

    @Override // com.huami.feedback.datasource.LogFileDataSource
    public void deleteDeviceLogFile() {
        f(this.deviceLogFiles);
    }

    @Override // com.huami.feedback.datasource.LogFileDataSource
    public void deleteOtherSettingsFile() {
        List<? extends File> list = this.settingFiles;
        if (list == null) {
            return;
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.feedback.datasource.LogFileDataSource
    @NotNull
    public File getLogZipFile(@NotNull UserForm userForm) {
        File file = new File(((Object) this.context.getFilesDir().getAbsolutePath()) + ((Object) File.separator) + "log_" + DateUtilKt.getFormatTimeDisplay() + MultiDexExtractor.EXTRACTED_SUFFIX);
        p(userForm, file);
        return file;
    }
}
