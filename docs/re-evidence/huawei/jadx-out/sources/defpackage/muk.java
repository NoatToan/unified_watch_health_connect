package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteConstraintException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class muk extends EngineLogicBaseManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<Integer> f42436b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SendCallback f42437a;
    private final Map<String, muh> e;

    private muk() {
        super(BaseApplication.getContext());
        this.e = new ConcurrentHashMap();
        this.f42437a = new SendCallback() { // from class: muk.1
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                LogUtil.a("ScreenshotSynergyManager", "send msg code: ", Integer.valueOf(i), " in ScreenshotSynergyManager");
            }
        };
        f42436b.add(1);
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        LogUtil.a("ScreenshotSynergyManager", "onReceiveDeviceCommand errorCode: ", Integer.valueOf(i));
        if (deviceInfo == null || xiuVar == null) {
            LogUtil.e("ScreenshotSynergyManager", "deviceInfo or message is null in onReceiveDeviceCommand.");
            return;
        }
        if (TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
            LogUtil.e("ScreenshotSynergyManager", "deviceIdentify is null in onReceiveDeviceCommand.");
        } else if (xiuVar.c() == 2) {
            b(deviceInfo, xiuVar.e());
        } else {
            a(deviceInfo, xiuVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005a  */
    private void a(DeviceInfo deviceInfo, xiu xiuVar) {
        int i;
        byte[] bArrB = xiuVar.b();
        if (bArrB == null) {
            LogUtil.e("ScreenshotSynergyManager", "data is null in handleReceiveData.");
            return;
        }
        String str = new String(bArrB, StandardCharsets.UTF_8);
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("ScreenshotSynergyManager", "msgStr is null in handleReceiveData.");
            return;
        }
        muh muhVarC = c(str);
        if (muhVarC == null) {
            LogUtil.e("ScreenshotSynergyManager", "tmpImageProcessParameters is null");
        } else {
            LogUtil.a("ScreenshotSynergyManager", muhVarC.toString());
            i = f42436b.contains(Integer.valueOf(muhVarC.b())) ? 1 : 2;
            if (i == 1) {
                this.e.put(deviceInfo.getDeviceIdentify(), muhVarC);
            }
            d(new xiu.c().a(e(i).getBytes(StandardCharsets.UTF_8)).c(), this.f42437a);
        }
        if (i == 1) {
            this.e.put(deviceInfo.getDeviceIdentify(), muhVarC);
        }
        d(new xiu.c().a(e(i).getBytes(StandardCharsets.UTF_8)).c(), this.f42437a);
    }

    private muh c(String str) {
        try {
            return (muh) new Gson().fromJson(CommonUtil.ac(str), muh.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.e("ScreenshotSynergyManager", "ParseImageProcessParameters has an JsonSyntaxException");
            return null;
        }
    }

    private boolean b(String str) {
        if (CommonUtil.bu()) {
            return false;
        }
        return SharedPreferenceManager.b(Integer.toString(1000), str, false);
    }

    private String e(int i) {
        if (b("screenshot_negotiation_fail_switch")) {
            LogUtil.a("ScreenshotSynergyManager", "stub negotiation fail.");
            i = 2;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("operateType", 3);
            jSONObject.put("statusCode", i);
        } catch (JSONException unused) {
            LogUtil.e("ScreenshotSynergyManager", "createResponseForParameterNegotiation has an JSONException");
        }
        return jSONObject.toString();
    }

    private void b(final DeviceInfo deviceInfo, final File file) {
        LogUtil.a("ScreenshotSynergyManager", "file name: ", file != null ? file.getName() : null);
        if (file == null || !file.exists()) {
            ReleaseLogUtil.a("ScreenshotSynergyManager", "file is not exists in saveScreenshotToAlbum.");
            return;
        }
        if (!file.canRead()) {
            ReleaseLogUtil.a("ScreenshotSynergyManager", "file can't read in saveScreenshotToAlbum.");
            d(file.getName(), false);
        } else if (!file.getName().contains("Screenshot")) {
            ReleaseLogUtil.a("ScreenshotSynergyManager", "file is not Screenshot");
            d(file.getName(), false);
        } else if (!CommonUtil.e(file)) {
            ReleaseLogUtil.a("ScreenshotSynergyManager", "filePath is invalid in saveScreenshotToAlbum.");
            d(file.getName(), false);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: mul
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f42441a.e(deviceInfo, file);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void e(DeviceInfo deviceInfo, final File file) throws Throwable {
        muh muhVar = this.e.get(deviceInfo.getDeviceIdentify());
        if (muhVar == null) {
            LogUtil.e("ScreenshotSynergyManager", "imageProcessParameters is null in processPhotoAndSaveToAlbum.");
            d(file.getName(), false);
            return;
        }
        Bitmap bitmapE = e(muhVar, file);
        if (bitmapE == null) {
            LogUtil.e("ScreenshotSynergyManager", "bitmap is null in processPhotoAndSaveToAlbum.");
            d(file.getName(), false);
        } else if (muhVar.a() == 1) {
            e(deviceInfo, muhVar, bitmapE, new IBaseResponseCallback() { // from class: mun
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) throws Throwable {
                    this.e.e(file, i, obj);
                }
            });
        } else {
            e(file, bitmapE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void e(File file, int i, Object obj) throws Throwable {
        if (i == -1) {
            d(file.getName(), false);
            LogUtil.e("ScreenshotSynergyManager", "errorCode is ERROR in handleCropPictureResult.");
        } else {
            if (!(obj instanceof Bitmap)) {
                d(file.getName(), false);
                LogUtil.e("ScreenshotSynergyManager", "objData is not Bitmap in handleCropPictureResult.");
                return;
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap == null) {
                LogUtil.e("ScreenshotSynergyManager", "newBitmap is null in handleCropPictureResult.");
                d(file.getName(), false);
            } else {
                e(file, bitmap);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r7v0, types: [muk] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v7, types: [boolean] */
    private void e(File file, Bitmap bitmap) throws Throwable {
        boolean zC;
        ?? r2 = 0;
        try {
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    zC = e(file.getName(), bitmap);
                } else {
                    zC = c(file.getName(), bitmap);
                }
                try {
                    LogUtil.a("ScreenshotSynergyManager", "delete file:", file.getName(), ", res:", Boolean.valueOf(file.delete()), " in processPhotoAndSaveToAlbum.");
                    bitmap = zC;
                } catch (IOException unused) {
                    LogUtil.e("ScreenshotSynergyManager", "decodeFile has an exception in processPhotoAndSaveToAlbum.");
                    bitmap = zC;
                }
            } catch (Throwable th) {
                r2 = bitmap;
                th = th;
                d(file.getName(), r2);
                throw th;
            }
        } catch (IOException unused2) {
            zC = false;
        } catch (Throwable th2) {
            th = th2;
            d(file.getName(), r2);
            throw th;
        }
        file = file.getName();
        d(file, bitmap);
    }

    private void e(DeviceInfo deviceInfo, final muh muhVar, final Bitmap bitmap, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("ScreenshotSynergyManager", "enter cropPicture");
        b(new IBaseResponseCallback() { // from class: mum
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) throws Throwable {
                muk.a(muhVar, bitmap, iBaseResponseCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void a(muh muhVar, Bitmap bitmap, IBaseResponseCallback iBaseResponseCallback, int i, Object obj) throws Throwable {
        if (obj instanceof String) {
            mug.b().a(muhVar, bitmap, "1".equals((String) obj), iBaseResponseCallback);
        } else {
            iBaseResponseCallback.a(-1, null);
        }
    }

    private Bitmap e(muh muhVar, File file) {
        LogUtil.a("ScreenshotSynergyManager", "enter parsePicture");
        try {
            if (muhVar.b() == 1) {
                String canonicalPath = file.getCanonicalPath();
                LogUtil.a("ScreenshotSynergyManager", "parsePicture imagePath is ", canonicalPath);
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(canonicalPath);
                if (bitmapDecodeFile == null) {
                    LogUtil.e("ScreenshotSynergyManager", "parsePicture decodeFile bitmap is null");
                }
                return bitmapDecodeFile;
            }
            LogUtil.e("ScreenshotSynergyManager", "compressionAlgorithm is not supported");
            return null;
        } catch (IOException unused) {
            LogUtil.e("ScreenshotSynergyManager", "has an IOException in parsePicture");
            return null;
        } catch (IllegalArgumentException unused2) {
            LogUtil.e("ScreenshotSynergyManager", "has an IllegalArgumentException in parsePicture");
            return null;
        } catch (Exception e) {
            LogUtil.e("ScreenshotSynergyManager", "has Exception in parsePicture ", ExceptionUtils.c(e));
            return null;
        }
    }

    private void d(String str, boolean z) {
        int i = 2;
        int i2 = z ? 1 : 2;
        if (b("screenshot_save_photo_fail_switch")) {
            LogUtil.a("ScreenshotSynergyManager", "stub save photo fail.");
        } else {
            i = i2;
        }
        xiu xiuVarC = new xiu.c().a(b(str, i).getBytes(StandardCharsets.UTF_8)).c();
        if (b("screenshot_command_lost_switch")) {
            LogUtil.a("ScreenshotSynergyManager", "stub command lost.");
        } else {
            d(xiuVarC, this.f42437a);
        }
    }

    private String b(String str, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("operateType", 2);
            jSONObject.put(ContentResource.FILE_NAME, str);
            jSONObject.put("statusCode", i);
        } catch (JSONException unused) {
            LogUtil.e("ScreenshotSynergyManager", "createResponseForSaveResult has an JSONException");
        }
        return jSONObject.toString();
    }

    private boolean c(String str, Bitmap bitmap) throws IOException {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Screenshots");
        if (!file.exists() && !file.mkdirs()) {
            LogUtil.e("ScreenshotSynergyManager", "create savePhotoDir failed in saveImageInLegacy.");
            return false;
        }
        File file2 = new File(file, str);
        if (!CommonUtil.e(file2)) {
            LogUtil.e("ScreenshotSynergyManager", "filePath is invalid in saveImageInLegacy.");
            return false;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                if (!bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream)) {
                    LogUtil.e("ScreenshotSynergyManager", "save failed in saveImageInLegacy.");
                    fileOutputStream.close();
                    return false;
                }
                fileOutputStream.close();
                BaseApplication.getContext().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file2)));
                LogUtil.a("ScreenshotSynergyManager", "save picture success, fileName: ", str, " in saveImageInLegacy.");
                return true;
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            LogUtil.e("ScreenshotSynergyManager", "save image has an exception in saveImageInLegacy.");
            return false;
        }
        LogUtil.e("ScreenshotSynergyManager", "save image has an exception in saveImageInLegacy.");
        return false;
    }

    private boolean e(String str, Bitmap bitmap) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + File.separator + "Screenshots");
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "image/png");
        contentValues.put("is_pending", (Integer) 1);
        ContentResolver contentResolver = BaseApplication.getContext().getContentResolver();
        try {
            Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert == null) {
                LogUtil.e("ScreenshotSynergyManager", "imageUri is null in saveImageInQ.");
                contentValues.clear();
                contentValues.put("is_pending", (Integer) 0);
                return false;
            }
            try {
                try {
                    OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                    try {
                        if (!bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream)) {
                            LogUtil.e("ScreenshotSynergyManager", "save failed in saveImageInQ.");
                            contentValues.clear();
                            contentValues.put("is_pending", (Integer) 0);
                            if (outputStreamOpenOutputStream != null) {
                                outputStreamOpenOutputStream.close();
                            }
                            contentValues.clear();
                            contentValues.put("is_pending", (Integer) 0);
                            return false;
                        }
                        if (outputStreamOpenOutputStream != null) {
                            outputStreamOpenOutputStream.close();
                        }
                        contentValues.clear();
                        contentValues.put("is_pending", (Integer) 0);
                        try {
                            LogUtil.a("ScreenshotSynergyManager", "resolver.update number is ", Integer.valueOf(contentResolver.update(uriInsert, contentValues, null, null)));
                            LogUtil.a("ScreenshotSynergyManager", "save picture success, fileName: ", str, " in saveImageInQ.");
                            return true;
                        } catch (Exception e) {
                            ReleaseLogUtil.a("ScreenshotSynergyManager", "resolver.update exception in saveImageInQ ", ExceptionUtils.c(e));
                            return false;
                        }
                    } catch (Throwable th) {
                        if (outputStreamOpenOutputStream != null) {
                            try {
                                outputStreamOpenOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused) {
                    LogUtil.e("ScreenshotSynergyManager", "save image has an exception in saveImageInQ.");
                    if (Build.VERSION.SDK_INT >= 30) {
                        contentResolver.delete(uriInsert, null);
                    }
                }
            } catch (Throwable th3) {
                contentValues.clear();
                contentValues.put("is_pending", (Integer) 0);
                throw th3;
            }
        } catch (SQLiteConstraintException | IllegalArgumentException | SecurityException unused2) {
            LogUtil.e("ScreenshotSynergyManager", "resolver.insert exception  in saveImageInQ.");
            return false;
        }
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.SCREENSHOT_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "com.huawei.watch.screenshot";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return OfflineMapWearEngineManager.WEAR_FINGERPRINT;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        if (connectState == null || deviceInfo == null) {
            LogUtil.e("ScreenshotSynergyManager", "connectState or deviceInfo is null in onDeviceConnectionChange.");
            return;
        }
        if (TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
            LogUtil.e("ScreenshotSynergyManager", "deviceIdentify is null in onDeviceConnectionChange.");
        } else if (connectState == ConnectState.DISCONNECTED) {
            this.e.remove(deviceInfo.getDeviceIdentify());
            LogUtil.e("ScreenshotSynergyManager", "remove imageProcessParameters success.");
        }
    }

    public void d(xiu xiuVar, SendCallback sendCallback) {
        sendComand(xiuVar, sendCallback);
    }

    public static muk a() {
        return c.d;
    }

    static class c {
        private static final muk d = new muk();
    }

    private void b(final IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("900500040");
        qhq.b("9005", arrayList, new HiDataReadResultListener() { // from class: muk.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("ScreenshotSynergyManager", "getSwitchStatus errorCode: ", Integer.valueOf(i), ", data: ", obj);
                if (i != 0) {
                    iBaseResponseCallback.a(0, "0");
                    return;
                }
                if (!njy.b(obj, HiSampleConfig.class)) {
                    iBaseResponseCallback.a(0, "0");
                    LogUtil.j("ScreenshotSynergyManager", "getSwitchStatus isListTypeMatch false");
                    return;
                }
                List list = (List) obj;
                if (njy.e(list)) {
                    iBaseResponseCallback.a(0, "0");
                    LogUtil.j("ScreenshotSynergyManager", "getSwitchStatus list isEmpty");
                    return;
                }
                HiSampleConfig hiSampleConfig = (HiSampleConfig) list.get(0);
                if (hiSampleConfig == null) {
                    iBaseResponseCallback.a(0, "0");
                    LogUtil.j("ScreenshotSynergyManager", "getSwitchStatus hiSampleConfig is null");
                } else {
                    String configData = hiSampleConfig.getConfigData();
                    LogUtil.a("ScreenshotSynergyManager", "getSwitchStatus configData is ", configData);
                    iBaseResponseCallback.a(0, ffv.a(configData, "watchScreenshotWithBodySwitch"));
                }
            }
        });
    }
}
