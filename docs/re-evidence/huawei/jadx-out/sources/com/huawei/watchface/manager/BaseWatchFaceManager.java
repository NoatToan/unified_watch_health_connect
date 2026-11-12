package com.huawei.watchface.manager;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import com.huawei.watchface.R;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.api.HwWatchFaceManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.f5;
import com.huawei.watchface.i0;
import com.huawei.watchface.j0;
import com.huawei.watchface.mvp.model.datatype.TransferFileReqType;
import com.huawei.watchface.mvp.model.datatype.WatchFaceInfo;
import com.huawei.watchface.mvp.model.datatype.WatchFaceSupportInfo;
import com.huawei.watchface.mvp.model.filedownload.FilePuller;
import com.huawei.watchface.mvp.model.filedownload.PullListenerInterface;
import com.huawei.watchface.mvp.model.filedownload.PullResult;
import com.huawei.watchface.mvp.model.filedownload.PullTask;
import com.huawei.watchface.mvp.model.latona.LatonaWatchFaceProvider;
import com.huawei.watchface.mvp.model.latona.LatonaWatchFaceThemeAlbumInfo;
import com.huawei.watchface.mvp.model.latona.provider.ElementsProvider;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import com.huawei.watchface.q;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.FileHelper;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.callback.IAppTransferFileResultAIDLCallback;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import com.huawei.watchface.utils.callback.IPackageNamePathCallback;
import com.huawei.watchface.utils.callback.IPhotoFileCallback;
import com.huawei.watchface.utils.callback.OperateWatchFaceCallback;
import com.huawei.watchface.z2;
import java.io.File;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseWatchFaceManager implements IPackageNamePathCallback {
    protected static final int ABILITY_UNSUPPORTED = 0;
    public static final String BG_SUFFIX = "_bg";
    protected static final int EMPTY_BACKGROUND_COUNT = 0;
    protected static final int EMPTY_PROGRESS_PERCENT = 0;
    public static final String FG_SUFFIX = "_fg";
    protected static final int FILE_TRANSFER_ONE_BACKGROUND = 1;
    public static final String ORIGINBG_SUFFIX = "_originbg";
    public static final String ORIGINFG_SUFFIX = "_originfg";
    public static final String PNG_SUFFIX = ".png";
    protected static final String SYMBOL_SPLIT_POINT = ".";
    protected static final String WATCHFACE_RES_PATH = "res";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30306c;
    public String d;
    public z2 f;
    public i0 g;
    public i0.a h;
    public HandlerThread i;
    public Handler j;
    public Handler k;
    public Handler m;
    public String mBackgroundDir;
    public Context mContext;
    public HwWatchFaceBtManager mHwWatchFaceBtManager;
    public String mHwtOperateDir;
    public boolean mIsSyncWatchFace;
    public OperateWatchFaceCallback mOperateWatchFaceCallback;
    public String mPackageName;
    public String mWatchFaceName;
    public LatonaWatchFaceProvider mWatchFaceProvider;
    public j0 n;
    public String o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f30304a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30305b = false;
    public int mTransferTotalCount = 0;
    public int mTransferCompleteCount = 0;
    public int mCurrentTransferPercent = 0;
    public int e = 1;
    public long l = 0;
    public IAppTransferFileResultAIDLCallback mIAppTransferFileResultAIDLCallback = new a();

    public class a implements IAppTransferFileResultAIDLCallback {
        public a() {
        }

        @Override // com.huawei.watchface.utils.callback.IAppTransferFileResultAIDLCallback
        public void onFileRespond(int i, String str) {
            HwLog.i("BaseWatchFaceManager", "IPhotoFileCallback onSuccess():" + i);
            if (BaseWatchFaceManager.this.devicesCallbackFileInfoCheckFail(str)) {
                HwLog.i("BaseWatchFaceManager", "mIAppTransferFileResultAIDLCallback onFileRespond() check fail =" + str);
            } else {
                BaseWatchFaceManager baseWatchFaceManager = BaseWatchFaceManager.this;
                baseWatchFaceManager.mTransferCompleteCount++;
                baseWatchFaceManager.mCurrentTransferPercent = 0;
                baseWatchFaceManager.p();
            }
        }

        @Override // com.huawei.watchface.utils.callback.IAppTransferFileResultAIDLCallback
        public void onFileTransferState(int i, String str) {
            HwLog.i("BaseWatchFaceManager", "mIAppTransferFileResultAIDLCallback onFileTransferState() percentage =" + i);
            if (BaseWatchFaceManager.this.devicesCallbackFileInfoCheckFail(str)) {
                HwLog.i("BaseWatchFaceManager", "mIAppTransferFileResultAIDLCallback onFileTransferState() check fail =" + str);
            } else {
                BaseWatchFaceManager baseWatchFaceManager = BaseWatchFaceManager.this;
                if (i < baseWatchFaceManager.mCurrentTransferPercent) {
                    HwLog.i("BaseWatchFaceManager", "mIAppTransferFileResultAIDLCallback onFileTransferState() percentage backing");
                } else {
                    baseWatchFaceManager.mCurrentTransferPercent = i;
                    baseWatchFaceManager.p();
                }
            }
        }

        @Override // com.huawei.watchface.utils.callback.IAppTransferFileResultAIDLCallback
        public void onUpgradeFailed(int i, String str) {
            HwLog.e("BaseWatchFaceManager", "mIAppTransferFileResultAIDLCallback onUpgradeFailed(): " + i);
            if (BaseWatchFaceManager.this.devicesCallbackFileInfoCheckFail(str)) {
                HwLog.i("BaseWatchFaceManager", "mIAppTransferFileResultAIDLCallback onUpgradeFailed() check fail =" + str);
            } else {
                if (i == 141001 || i == 141000 || i == 30004 || i == 140006) {
                    BaseWatchFaceManager.this.onSaveFailed();
                    return;
                }
                if (BaseWatchFaceManager.this.a(i)) {
                    BaseWatchFaceManager.this.b(i);
                    return;
                }
                BaseWatchFaceManager baseWatchFaceManager = BaseWatchFaceManager.this;
                baseWatchFaceManager.mTransferCompleteCount++;
                baseWatchFaceManager.mCurrentTransferPercent = 0;
                HwLog.i("BaseWatchFaceManager", "mIAppTransferFileResultAIDLCallback onFailure() Call show");
                BaseWatchFaceManager.this.p();
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f30308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LatonaWatchFaceThemeAlbumInfo f30309b;

        public b(Context context, LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo) {
            this.f30308a = context;
            this.f30309b = latonaWatchFaceThemeAlbumInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseWatchFaceManager.this.a(this.f30308a, this.f30309b);
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LatonaWatchFaceThemeAlbumInfo f30311a;

        public c(LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo) {
            this.f30311a = latonaWatchFaceThemeAlbumInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HwLog.i("BaseWatchFaceManager", "showSaveDialog, SaveWatchFace.");
            z2 z2Var = BaseWatchFaceManager.this.f;
            if (z2Var != null && z2Var.isShowing()) {
                BaseWatchFaceManager.this.f.dismiss();
                BaseWatchFaceManager.this.f = null;
            }
            BaseWatchFaceManager.this.o();
            BaseWatchFaceManager.this.updateNativeFiles(this.f30311a);
            BaseWatchFaceManager.this.setTransferTotalCount(this.f30311a);
            BaseWatchFaceManager.this.sendWatchFaceInfoToDevice(this.f30311a);
            BaseWatchFaceManager.this.a(2, this.f30311a);
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LatonaWatchFaceThemeAlbumInfo f30313a;

        public d(LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo) {
            this.f30313a = latonaWatchFaceThemeAlbumInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HwLog.i("BaseWatchFaceManager", "showSaveDialog, CancelSaveWatchFace.");
            z2 z2Var = BaseWatchFaceManager.this.f;
            if (z2Var != null && z2Var.isShowing()) {
                BaseWatchFaceManager.this.f.dismiss();
                BaseWatchFaceManager.this.f = null;
            }
            BaseWatchFaceManager.this.a(1, this.f30313a);
        }
    }

    public class e implements IPhotoFileCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f30316b;

        public e(int i, int i2) {
            this.f30315a = i;
            this.f30316b = i2;
        }

        @Override // com.huawei.watchface.utils.callback.IPhotoFileCallback
        public void onFailure(int i, String str) {
            HwLog.i("BaseWatchFaceManager", "getFileByBt() TransferImagesFromDeviceFailed errorCode:" + i);
            BaseWatchFaceManager baseWatchFaceManager = BaseWatchFaceManager.this;
            if (baseWatchFaceManager.f30304a) {
                HwLog.e("BaseWatchFaceManager", "getFileByBt onFailure isDestroy");
            } else {
                baseWatchFaceManager.a(this.f30315a, this.f30316b);
                BaseWatchFaceManager.this.c(i);
            }
        }

        @Override // com.huawei.watchface.utils.callback.IPhotoFileCallback
        public void onProgress(int i, String str) {
            HwLog.i("BaseWatchFaceManager", "getFileByBt() onFileTransferState percentage =" + i);
            BaseWatchFaceManager baseWatchFaceManager = BaseWatchFaceManager.this;
            if (baseWatchFaceManager.f30304a) {
                HwLog.d("BaseWatchFaceManager", "getFileByBt onProgress isDestroy");
                return;
            }
            int i2 = baseWatchFaceManager.mCurrentTransferPercent;
            if (i <= i2 || i - i2 >= 10) {
                return;
            }
            baseWatchFaceManager.mCurrentTransferPercent = i;
            baseWatchFaceManager.l();
        }

        @Override // com.huawei.watchface.utils.callback.IPhotoFileCallback
        public void onSuccess(int i, String str, String str2) {
            HwLog.i("BaseWatchFaceManager", "getFileByBt() transfer successful :" + i);
            BaseWatchFaceManager baseWatchFaceManager = BaseWatchFaceManager.this;
            if (baseWatchFaceManager.f30304a) {
                HwLog.e("BaseWatchFaceManager", "getFileByBt onSuccess isDestroy");
            } else {
                baseWatchFaceManager.saveFileFromDevice(str, this.f30315a);
                BaseWatchFaceManager.this.a(this.f30315a, this.f30316b);
            }
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HwLog.i("BaseWatchFaceManager", "dismissLoadingDialog() run.");
            OperateWatchFaceCallback operateWatchFaceCallback = BaseWatchFaceManager.this.mOperateWatchFaceCallback;
            if (operateWatchFaceCallback == null) {
                HwLog.i("BaseWatchFaceManager", "dismissLoadingDialog mOperateWatchFaceCallback is null.");
            } else {
                operateWatchFaceCallback.hideLoadingDialog();
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f30319a;

        public g(Context context) {
            this.f30319a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseWatchFaceManager baseWatchFaceManager = BaseWatchFaceManager.this;
            int i = (baseWatchFaceManager.mTransferCompleteCount / baseWatchFaceManager.e) + 1;
            int i2 = baseWatchFaceManager.mTransferTotalCount;
            if (i > i2) {
                i = i2;
            }
            String stringById = DensityUtil.getStringById(R.string.photo_album_dialog_saving_count, Integer.valueOf(i), Integer.valueOf(BaseWatchFaceManager.this.mTransferTotalCount));
            int iG = BaseWatchFaceManager.this.g();
            String strA = CommonUtils.a(iG, 2, 0);
            HwLog.i("BaseWatchFaceManager", "showProgressDialog() Desc :" + stringById + ", progress :" + iG + ", percentText :" + strA);
            BaseWatchFaceManager.this.a(stringById, iG, strA, this.f30319a);
        }
    }

    public class h extends Handler {
        public h(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message != null) {
                super.handleMessage(message);
                BaseWatchFaceManager.this.a(message);
            }
        }
    }

    public class i extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30322a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Looper looper, String str) {
            super(looper);
            this.f30322a = str;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            if (message.what == 101 && BaseWatchFaceManager.this.mOperateWatchFaceCallback != null) {
                HwLog.i("BaseWatchFaceManager", "notifyH5Ready() transmitWatchFaceInfo.");
                BaseWatchFaceManager.this.transmitWatchFaceInfo(this.f30322a);
            }
            BaseWatchFaceManager.this.m = null;
        }
    }

    public class j extends Handler {
        public j(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message != null) {
                super.handleMessage(message);
                if (message.what != 1001) {
                    HwLog.w("BaseWatchFaceManager", "TransferTimeOutHandler default");
                    return;
                }
                HwLog.i("BaseWatchFaceManager", "TransferTimeOutHandler() DEVICE_NOT_RESPONSE_TIMEOUT_MESSAGE");
                BaseWatchFaceManager.this.n();
                HwDeviceConfigManager hwDeviceConfigManager = HwDeviceConfigManager.getInstance(BaseWatchFaceManager.this.mContext);
                BaseWatchFaceManager baseWatchFaceManager = BaseWatchFaceManager.this;
                hwDeviceConfigManager.registerPhotoAndVideoCallback(baseWatchFaceManager.mIAppTransferFileResultAIDLCallback, baseWatchFaceManager.getFileType(), TransferFileReqType.DEVICE_UNREGISTRATION);
                BaseWatchFaceManager.this.transmitWatchFaceInstallResult(1);
                BaseWatchFaceManager.this.d();
                BaseWatchFaceManager baseWatchFaceManager2 = BaseWatchFaceManager.this;
                baseWatchFaceManager2.mTransferCompleteCount = baseWatchFaceManager2.mTransferTotalCount;
                baseWatchFaceManager2.mCurrentTransferPercent = 0;
                baseWatchFaceManager2.e();
            }
        }
    }

    public BaseWatchFaceManager(Context context, String str, boolean z) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mHwWatchFaceBtManager = HwWatchFaceBtManager.getInstance(applicationContext);
        this.mWatchFaceProvider = LatonaWatchFaceProvider.getInstance(this.mContext);
        this.f30306c = this.mContext.getFilesDir() + str;
        this.d = this.f30306c + "hwt/";
        if (z) {
            this.mBackgroundDir = this.f30306c;
        } else {
            this.mBackgroundDir = this.f30306c + "background/";
        }
        this.mHwtOperateDir = this.f30306c + "parsing/";
    }

    public final boolean a(int i2) {
        return i2 == 140004 || i2 == 140009;
    }

    public void b() {
        HwLog.d("BaseWatchFaceManager", "destroyTransferProgressDialog");
        this.g = null;
    }

    public void c(String str) {
        HwLog.i("BaseWatchFaceManager", "syncWatchFaceInfo msg is:" + str);
        this.f30305b = true;
        a();
        clearInvalidData();
        i();
        h();
        WatchFacePhotoAlbumManager.getInstance(Environment.getApplicationContext()).l(str);
    }

    public abstract void clearInvalidData();

    public void d() {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            return;
        }
        Context customWebViewContext = operateWatchFaceCallback.getCustomWebViewContext();
        if (customWebViewContext == null) {
            HwLog.i("BaseWatchFaceManager", "dismissLoadingDialog() context is null.");
        } else if (customWebViewContext instanceof Activity) {
            ((Activity) customWebViewContext).runOnUiThread(new f());
        }
    }

    public abstract boolean devicesCallbackFileInfoCheckFail(String str);

    public final void e() {
        HwLog.i("BaseWatchFaceManager", "Enter dismissProgressDialog");
        if (this.k == null) {
            this.k = new h(Looper.getMainLooper());
        }
        this.k.sendEmptyMessageDelayed(100, 500L);
    }

    public final String f() {
        if (HwWatchFaceBtManager.getInstance(this.mContext).getConnectWatchDeviceInfo() == null) {
            return "";
        }
        String deviceName = HwWatchFaceApi.getInstance(this.mContext).getDeviceName();
        String softVersion = HwWatchFaceApi.getInstance(this.mContext).getSoftVersion();
        if (TextUtils.isEmpty(deviceName) || TextUtils.isEmpty(softVersion)) {
            HwLog.w("BaseWatchFaceManager", "getDeviceNameVersion() deviceName or deviceVersion is null");
            return "";
        }
        if (deviceName.length() > 3) {
            deviceName = SafeString.substring(deviceName, deviceName.length() - 3);
        }
        if (softVersion.contains(".")) {
            softVersion = SafeString.substring(softVersion, softVersion.lastIndexOf(".") + 1);
        }
        HwLog.i("BaseWatchFaceManager", "getDeviceNameVersion() deviceName: " + deviceName + ", deviceVersion: " + softVersion);
        return deviceName + softVersion;
    }

    public final int g() {
        int i2 = this.mTransferTotalCount;
        if (i2 <= 0) {
            return 0;
        }
        double d2 = 100.0d / ((double) (i2 * this.e));
        int iCeil = (int) Math.ceil((((double) this.mTransferCompleteCount) * d2) + ((((double) this.mCurrentTransferPercent) * d2) / 100.0d));
        if (iCeil > 100) {
            return 100;
        }
        if (iCeil < 0) {
            return 0;
        }
        HwLog.i("BaseWatchFaceManager", "Right progress value");
        return iCeil;
    }

    public abstract void getDeviceInfoByBt();

    public void getFileByBt(int i2, int i3, int i4, String str) {
        HwLog.i("BaseWatchFaceManager", "getFileByBt() TransferImagesFromDevice index: " + i2 + ", size: " + i3 + ", fileType: " + i4 + ", fileName: " + str);
        if (i3 < i2) {
            HwLog.w("BaseWatchFaceManager", "getFileByBt() mNoContainsPhotos is error");
        } else {
            if (TextUtils.isEmpty(str)) {
                HwLog.w("BaseWatchFaceManager", "getFileByBt() fileName is empty");
                return;
            }
            this.mIsSyncWatchFace = true;
            this.f30304a = false;
            HwDeviceConfigManager.getInstance(this.mContext).a(str, i4, false, new e(i2, i3));
        }
    }

    public abstract List<Integer> getFileType();

    public abstract void getNextFileByBt(int i2);

    public void getWatchFaceInfo(String str, String str2, String str3, String str4) {
        HwLog.i("BaseWatchFaceManager", "getWatchFaceInfo" + str + str2);
        this.f30305b = false;
        a();
        clearInvalidData();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            HwLog.w("BaseWatchFaceManager", "getWatchFaceInfo() hiTopId or version is empty");
            return;
        }
        HwLog.i("BaseWatchFaceManager", "getWatchFaceInfo() hiTopId: " + str);
        this.mWatchFaceName = f() + str + str2;
        i();
        h();
        File file = new File(this.d + this.mWatchFaceName + WatchFaceConstant.HWT_SUFFIX);
        if (!file.exists() || file.isDirectory()) {
            a(str, str2, str3, str4);
        } else {
            HwLog.i("BaseWatchFaceManager", "getWatchFaceInfo() hwt cache exist");
            c();
        }
    }

    public final void h() {
        File file = new File(this.d);
        if (!file.isDirectory()) {
            HwLog.i("BaseWatchFaceManager", "initWatchFacePath() watchFaceRootFile.mkdirs() :" + file.mkdirs());
        }
        File file2 = new File(this.mBackgroundDir);
        if (!file2.isDirectory()) {
            HwLog.i("BaseWatchFaceManager", "initWatchFacePath() backgroundFile.mkdirs() :" + file2.mkdirs());
        }
        if (file2.exists() && file2.isDirectory()) {
            this.mWatchFaceProvider.setLatonaBackgroundSavedPath(this.mBackgroundDir);
        }
        File file3 = new File(this.mHwtOperateDir);
        if (!file3.isDirectory()) {
            HwLog.i("BaseWatchFaceManager", "initWatchFacePath() operateFile.mkdirs() :" + file3.mkdirs());
        }
        this.mPackageName = null;
    }

    public final void i() {
        WatchFaceSupportInfo watchFaceSupportInfo = this.mHwWatchFaceBtManager.getWatchFaceSupportInfo();
        if (watchFaceSupportInfo == null || watchFaceSupportInfo.getWatchFaceHeight() <= 0) {
            this.mHwWatchFaceBtManager.getDeviceInfoForUi(new IBaseResponseCallback() { // from class: com.huawei.watchface.manager.BaseWatchFaceManager$$ExternalSyntheticLambda4
                @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
                public final void onResponse(int i2, Object obj) {
                    this.f$0.a(i2, obj);
                }
            });
            return;
        }
        HwLog.i("BaseWatchFaceManager", "initWatchFaceSize() setWatchFaceSize :" + watchFaceSupportInfo.getWatchFaceHeight());
        this.mWatchFaceProvider.setWatchFaceSize(watchFaceSupportInfo.getWatchFaceWidth(), watchFaceSupportInfo.getWatchFaceHeight());
    }

    public final /* synthetic */ void j() {
        int iG = g();
        HwLog.i("BaseWatchFaceManager", "notifyWatchFaceLoadingProgress() progress: " + iG);
        String str = DensityUtil.getStringById(R.string.eu3_tm_dl_loading_new) + CommonUtils.a(iG, 2, 0);
        HwLog.i("BaseWatchFaceManager", "notifyWatchFaceLoadingProgress() message: " + str);
        transmitWatchFaceLoadingProgress(str);
    }

    public final /* synthetic */ void k() {
        HwLog.i("BaseWatchFaceManager", "showLoadingDialog() run.");
        this.mOperateWatchFaceCallback.showLoadingDialog(DensityUtil.getStringById(R.string.saving));
    }

    public final void l() {
        HwLog.i("BaseWatchFaceManager", "notifyWatchFaceLoadingProgress() enter.");
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            return;
        }
        Context customWebViewContext = operateWatchFaceCallback.getCustomWebViewContext();
        if (customWebViewContext == null) {
            HwLog.w("BaseWatchFaceManager", "notifyWatchFaceLoadingProgress() context is null.");
        } else if (customWebViewContext instanceof Activity) {
            ((Activity) customWebViewContext).runOnUiThread(new Runnable() { // from class: com.huawei.watchface.manager.BaseWatchFaceManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.j();
                }
            });
        }
    }

    public final void m() {
        Handler handler = this.j;
        if (handler == null || !handler.hasMessages(1001)) {
            return;
        }
        this.j.removeMessages(1001);
        HwLog.i("BaseWatchFaceManager", "removeResponseTimeoutHandler remove response timeout");
    }

    public final void n() {
        this.mIsSyncWatchFace = false;
        m();
    }

    public void notifyH5Ready(String str) {
        if (this.m == null) {
            this.m = new i(Looper.getMainLooper(), str);
        }
        this.m.sendEmptyMessageDelayed(101, 500L);
    }

    @Override // com.huawei.watchface.utils.callback.IPackageNamePathCallback
    public void notifyPathChanged() {
        this.mPackageName += "/watchface";
        HwLog.i("BaseWatchFaceManager", "notifyPathChanged() mPackageName: " + this.mPackageName);
    }

    public abstract void notifyWatchFaceReady(boolean z);

    public void o() {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            return;
        }
        Context customWebViewContext = operateWatchFaceCallback.getCustomWebViewContext();
        if (customWebViewContext == null) {
            HwLog.i("BaseWatchFaceManager", "showLoadingDialog() context is null.");
        } else if (customWebViewContext instanceof Activity) {
            ((Activity) customWebViewContext).runOnUiThread(new Runnable() { // from class: com.huawei.watchface.manager.BaseWatchFaceManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.k();
                }
            });
        }
    }

    public void onDestroy() {
        HwLog.i("BaseWatchFaceManager", "onDestroy() enter.");
        Handler handler = this.j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.j = null;
        }
        Handler handler2 = this.k;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.k = null;
        }
        if (this.g != null) {
            this.g = null;
        }
        if (this.mOperateWatchFaceCallback != null) {
            this.mOperateWatchFaceCallback = null;
        }
    }

    public void onSaveFailed() {
        HwLog.i("BaseWatchFaceManager", "enter onSaveFailed");
        n();
        HwDeviceConfigManager.getInstance(this.mContext).registerPhotoAndVideoCallback(this.mIAppTransferFileResultAIDLCallback, getFileType(), TransferFileReqType.DEVICE_UNREGISTRATION);
        d();
        e();
        String stringById = DensityUtil.getStringById(R.string.photo_album_dialog_loading_install_failed);
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            return;
        }
        operateWatchFaceCallback.showToast(stringById);
        transmitWatchFaceInstallResult(-1);
    }

    public void onSaveSuccess(Object obj) {
        n();
        HwDeviceConfigManager.getInstance(this.mContext).registerPhotoAndVideoCallback(this.mIAppTransferFileResultAIDLCallback, getFileType(), TransferFileReqType.DEVICE_UNREGISTRATION);
        transmitWatchFaceInstallResult(1);
        d();
        this.mTransferCompleteCount = this.mTransferTotalCount * this.e;
        this.mCurrentTransferPercent = 0;
        HwLog.i("BaseWatchFaceManager", "onSaveSuccess() showProgressDialog");
        p();
        e();
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            int iIntValue = num.intValue();
            HwLog.i("BaseWatchFaceManager", "onSaveSuccess() failCount :" + iIntValue);
            if (iIntValue > 0) {
                this.mOperateWatchFaceCallback.showToast(DensityUtil.getQuantityStringById(R.plurals.photo_album_dialog_loading_failed_count, iIntValue, num));
            }
        }
    }

    public void onSaveToTransferBackgrounds(Object obj, int i2) {
        if (obj instanceof Integer) {
            if (i2 > 0) {
                this.mTransferTotalCount = ((Integer) obj).intValue() / i2;
            } else {
                this.mTransferTotalCount = ((Integer) obj).intValue();
            }
        }
        this.e = i2;
        this.mTransferCompleteCount = 0;
        d();
        HwLog.i("BaseWatchFaceManager", "onSaveToTransferBackgrounds() showProgressDialog");
        p();
    }

    public final void p() {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null || this.mTransferTotalCount == 0) {
            HwLog.w("BaseWatchFaceManager", "showProgressDialog() error");
            return;
        }
        Context customWebViewContext = operateWatchFaceCallback.getCustomWebViewContext();
        if (customWebViewContext == null) {
            HwLog.w("BaseWatchFaceManager", "showProgressDialog() context is null.");
        } else if (customWebViewContext instanceof Activity) {
            ((Activity) customWebViewContext).runOnUiThread(new g(customWebViewContext));
        }
    }

    public abstract void parseCustomWatchFaceConfig(ElementsProvider elementsProvider);

    public void preTransferFinish() {
    }

    public void refreshData() {
        this.mIsSyncWatchFace = false;
        getDeviceInfoByBt();
    }

    public void resetSyncWatchFace() {
        this.mIsSyncWatchFace = false;
    }

    public abstract void saveFileFromDevice(String str, int i2);

    public void saveWatchFaceInfo(String str) {
        if (Math.abs(System.currentTimeMillis() - this.l) < 1000) {
            HwLog.i("BaseWatchFaceManager", "saveWatchFaceInfo disabled Click");
            return;
        }
        this.l = System.currentTimeMillis();
        HwLog.iBetaLog("BaseWatchFaceManager", "saveWatchFaceInfo() watchFaceThemeInfo: " + str);
        try {
            f5.c(String.valueOf(System.currentTimeMillis()));
            LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo = (LatonaWatchFaceThemeAlbumInfo) new Gson().fromJson(str, LatonaWatchFaceThemeAlbumInfo.class);
            if (latonaWatchFaceThemeAlbumInfo == null) {
                HwLog.w("BaseWatchFaceManager", "saveWatchFaceInfo() watchFaceInfo is null.");
                return;
            }
            if (latonaWatchFaceThemeAlbumInfo.isClickBackToSave()) {
                HwLog.i("BaseWatchFaceManager", "saveWatchFaceInfo() isClickBackToSave.");
                a(latonaWatchFaceThemeAlbumInfo);
                return;
            }
            HwLog.i("BaseWatchFaceManager", "saveWatchFaceInfo() isClickSaveButton.");
            o();
            updateNativeFiles(latonaWatchFaceThemeAlbumInfo);
            setTransferTotalCount(latonaWatchFaceThemeAlbumInfo);
            sendWatchFaceInfoToDevice(latonaWatchFaceThemeAlbumInfo);
        } catch (JsonSyntaxException unused) {
            HwLog.e("BaseWatchFaceManager", "saveWatchFaceInfo() JsonSyntaxException occured.");
        }
    }

    public abstract void sendWatchFaceInfoToDevice(LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo);

    public abstract void setTransferTotalCount(LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo);

    public void setWatchFaceCallback(OperateWatchFaceCallback operateWatchFaceCallback) {
        this.mOperateWatchFaceCallback = operateWatchFaceCallback;
    }

    public abstract void transmitWatchFaceInfo(String str);

    public abstract void transmitWatchFaceInstallResult(int i2);

    public abstract void transmitWatchFaceLoadingProgress(String str);

    public abstract void updateNativeFiles(LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo);

    public void a(boolean z, boolean z2) {
        this.mIsSyncWatchFace = z;
        this.f30304a = z2;
    }

    private String b(boolean z) {
        if (z) {
            return WatchFaceProvider.getInstance(this.mContext).transmitWatchFaceInfo();
        }
        return this.mWatchFaceProvider.transmitLatonaWatchFaceInfo();
    }

    public final void a(ElementsProvider elementsProvider, boolean z) {
        HwLog.i("BaseWatchFaceManager", "parseWatchFaceConfig() enter.");
        this.mWatchFaceProvider.parseLatonaWatchFaceInfo(elementsProvider, z);
        parseCustomWatchFaceConfig(elementsProvider);
    }

    public void b(int i2) {
        String stringById;
        HwLog.i("BaseWatchFaceManager", "enter onSaveFailed errorCode:" + i2);
        n();
        HwDeviceConfigManager.getInstance(this.mContext).registerPhotoAndVideoCallback(this.mIAppTransferFileResultAIDLCallback, getFileType(), TransferFileReqType.DEVICE_UNREGISTRATION);
        d();
        e();
        if (i2 == 140004) {
            stringById = DensityUtil.getStringById(R.string.number_of_dials_has_reached_maximum_notice);
        } else if (i2 != 140009) {
            stringById = DensityUtil.getStringById(R.string.photo_album_dialog_loading_install_failed);
        } else {
            stringById = DensityUtil.getStringById(R.string.IDS_watchface_device_insufficient_space_new);
        }
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            return;
        }
        if (i2 == 140009 && (operateWatchFaceCallback.getCustomWebViewContext() instanceof Activity)) {
            b(stringById);
        } else {
            this.mOperateWatchFaceCallback.showToast(stringById);
        }
        transmitWatchFaceInstallResult(-1);
    }

    public final /* synthetic */ void a(int i2, Object obj) {
        HwLog.i("BaseWatchFaceManager", "initWatchFaceSize() getDeviceInfoForUi :" + i2);
        if (i2 == 101) {
            WatchFaceSupportInfo watchFaceSupportInfo = this.mHwWatchFaceBtManager.getWatchFaceSupportInfo();
            if (watchFaceSupportInfo != null) {
                this.mWatchFaceProvider.setWatchFaceSize(watchFaceSupportInfo.getWatchFaceWidth(), watchFaceSupportInfo.getWatchFaceHeight());
                return;
            }
            return;
        }
        this.mWatchFaceProvider.setWatchFaceSize(454, 454);
    }

    public final void c() throws Throwable {
        HwLog.i("BaseWatchFaceManager", "didDownloadHwtResource() enter.");
        String str = this.d + this.mWatchFaceName + WatchFaceConstant.HWT_SUFFIX;
        String str2 = this.mHwtOperateDir + this.mWatchFaceName;
        String str3 = str2 + ".zip";
        if (!new File(str3).exists()) {
            HwLog.i("BaseWatchFaceManager", "didDownloadHwtResource() watchFaceName.zip does not exists, copy file");
            FileHelper.copyFileToParsingDir(str, str3);
        }
        File file = new File(str2);
        if (!file.exists() || !file.isDirectory() || ArrayUtils.isEmpty(file.listFiles())) {
            int iC = FileHelper.c(str3, str2);
            HwLog.i("BaseWatchFaceManager", "didDownloadHwtResource() unzipHwtResult amount =" + iC);
            if (iC <= 0) {
                HwLog.w("BaseWatchFaceManager", "didDownloadHwtResource() unzipHwtFile failed");
                return;
            }
        }
        File file2 = new File(str2);
        File[] fileArrListFiles = file2.listFiles();
        if (file2.isDirectory() && fileArrListFiles != null) {
            for (File file3 : fileArrListFiles) {
                HwLog.d("BaseWatchFaceManager", "didDownloadHwtResource() WatchFaceDir Contains :" + file3.getName());
                if (file3.getName().endsWith(".watchface")) {
                    this.mPackageName = file3.getName();
                    HwLog.i("BaseWatchFaceManager", "didDownloadHwtResource() PackageName :" + this.mPackageName);
                    break;
                }
            }
        }
        if (!TextUtils.isEmpty(this.mPackageName)) {
            a(this.mIsSyncWatchFace);
        }
        HwLog.i("BaseWatchFaceManager", "didDownloadHwtResource() mIsSyncWatchFace:" + this.mIsSyncWatchFace);
        if (this.mIsSyncWatchFace) {
            return;
        }
        if (this.h == null) {
            HwLog.d("BaseWatchFaceManager", "mTransferProgressDialogBuilder == null");
            this.mTransferCompleteCount = 0;
            this.mCurrentTransferPercent = 0;
        }
        getDeviceInfoByBt();
    }

    public void a(LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            return;
        }
        Context customWebViewContext = operateWatchFaceCallback.getCustomWebViewContext();
        if (customWebViewContext == null) {
            HwLog.w("BaseWatchFaceManager", "showSaveDialog() context is null.");
        } else if (customWebViewContext instanceof Activity) {
            ((Activity) customWebViewContext).runOnUiThread(new b(customWebViewContext, latonaWatchFaceThemeAlbumInfo));
        }
    }

    public final void a(Context context, LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo) {
        z2 z2VarA = new z2.a(context).a(DensityUtil.getStringById(R.string.photo_album_dialog_should_save_change)).a(DensityUtil.getStringById(R.string.dialog_cancel_comment_discard), new d(latonaWatchFaceThemeAlbumInfo)).b(DensityUtil.getStringById(R.string.photo_album_dialog_save_change), new c(latonaWatchFaceThemeAlbumInfo)).a();
        this.f = z2VarA;
        if (!z2VarA.isShowing()) {
            HwLog.i("BaseWatchFaceManager", "mNoTitleCustomAlertDialog is Showing");
            this.f.setCancelable(false);
            this.f.show();
        }
        HwLog.i("BaseWatchFaceManager", "mNoTitleCustomAlertDialog has showed");
    }

    public final void b(final String str) {
        final Activity activity = (Activity) this.mOperateWatchFaceCallback.getCustomWebViewContext();
        if (activity == null) {
            HwLog.i("BaseWatchFaceManager", "onSaveFailed() mCustomTextAlertDialog is null.");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.watchface.manager.BaseWatchFaceManager$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(activity, str);
                }
            });
        }
    }

    public final void b(int i2, int i3) {
        if (this.j == null) {
            HandlerThread handlerThread = new HandlerThread("BaseWatchFaceManager");
            this.i = handlerThread;
            handlerThread.start();
            this.j = new j(this.i.getLooper());
        }
        this.j.sendEmptyMessageDelayed(i2, i3);
    }

    public final void c(int i2) {
        if (i2 == 141001 || i2 == 141000 || i2 == 30004 || i2 == 30003 || i2 == 140006) {
            this.mIsSyncWatchFace = false;
        }
        if (this.mTransferCompleteCount >= this.mTransferTotalCount) {
            this.mIsSyncWatchFace = false;
        }
    }

    public final void a(int i2, LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo) {
        if (latonaWatchFaceThemeAlbumInfo == null) {
            HwLog.w("BaseWatchFaceManager", "clickBackToSaveWatchFace, watchFaceInfo is null.");
        } else if (latonaWatchFaceThemeAlbumInfo.isClickBackToSave()) {
            HwLog.i("BaseWatchFaceManager", "clickBackToSaveWatchFace, isClickBackToSave.");
            HwWatchFaceManager.getInstance(this.mContext).saveSuccess();
            this.mOperateWatchFaceCallback.resetWatchFaceAlbumInfoStatus(i2);
        }
    }

    public final void a() {
        HwWatchFaceApi hwWatchFaceApi = HwWatchFaceApi.getInstance(this.mContext);
        if (hwWatchFaceApi.getDeviceConnectState() == 1) {
            String deviceIdentify = hwWatchFaceApi.getDeviceIdentify();
            if (TextUtils.isEmpty(this.o)) {
                this.o = deviceIdentify;
            } else {
                if (TextUtils.equals(this.o, deviceIdentify)) {
                    return;
                }
                this.o = deviceIdentify;
                this.mIsSyncWatchFace = false;
            }
        }
    }

    public final void a(final String str, final String str2, String str3, String str4) {
        HwLog.i("BaseWatchFaceManager", "downloadHwtResource() enter.");
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append("_");
        stringBuffer.append(str2);
        String string = stringBuffer.toString();
        WatchFaceInfo watchFaceInfo = new WatchFaceInfo();
        watchFaceInfo.configFileType(String.valueOf(0));
        watchFaceInfo.configDigest(str4);
        a(string, str3, this.d + this.mWatchFaceName + WatchFaceConstant.HWT_SUFFIX, watchFaceInfo, new IBaseResponseCallback() { // from class: com.huawei.watchface.manager.BaseWatchFaceManager$$ExternalSyntheticLambda3
            @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
            public final void onResponse(int i2, Object obj) throws Throwable {
                this.f$0.a(str, str2, i2, obj);
            }
        });
    }

    public final /* synthetic */ void a(String str, String str2, int i2, Object obj) throws Throwable {
        if (i2 == 1) {
            HwLog.i("BaseWatchFaceManager", "downloadHwtResource() success");
            c();
            FilePuller.getInstance(this.mContext).downloadSuccessRemoveTask(str, str2);
        } else if (i2 == -15 || i2 == -3 || i2 == -14 || i2 == -106) {
            FilePuller.getInstance(this.mContext).cancelTask(str, str2);
        }
    }

    public final void a(boolean z) {
        a(new q(this.mHwtOperateDir + this.mWatchFaceName, this.mPackageName, this.mHwtOperateDir, this).a(false), z);
        StringBuilder sb = new StringBuilder("parseLocalConfig() parseLocalConfig :");
        sb.append(b(false));
        HwLog.iBetaLog("BaseWatchFaceManager", sb.toString());
    }

    public final void a(int i2, int i3) {
        int i4 = i2 + 1;
        if (i4 < i3) {
            HwLog.i("BaseWatchFaceManager", "getFileByBt() ContinueTransferImage");
            this.mTransferCompleteCount++;
            this.mCurrentTransferPercent = 0;
            getNextFileByBt(i4);
            l();
            return;
        }
        HwLog.i("BaseWatchFaceManager", "getFileByBt() TransferImagesFromDeviceComplete");
        this.mTransferCompleteCount = i3;
        this.mCurrentTransferPercent = 0;
        preTransferFinish();
        l();
        notifyWatchFaceReady(true);
    }

    public final void a(String str, String str2, String str3, WatchFaceInfo watchFaceInfo, final IBaseResponseCallback iBaseResponseCallback) {
        a(str, str2, str3, watchFaceInfo, new PullListenerInterface() { // from class: com.huawei.watchface.manager.BaseWatchFaceManager$$ExternalSyntheticLambda2
            @Override // com.huawei.watchface.mvp.model.filedownload.PullListenerInterface
            public final void onPullingChange(PullTask pullTask, PullResult pullResult) {
                iBaseResponseCallback.onResponse(pullResult.fetchStatus(), pullResult);
            }
        });
    }

    public final void a(String str, String str2, String str3, WatchFaceInfo watchFaceInfo, PullListenerInterface pullListenerInterface) {
        PullTask pullTask = new PullTask();
        pullTask.configDestPath(str3);
        pullTask.configHttpUrl(str2);
        pullTask.configFileUrlJson(null);
        pullTask.configListener(pullListenerInterface);
        pullTask.configOption(CommonUtils.k(watchFaceInfo.fetchFileType()));
        pullTask.configTotalSize(watchFaceInfo.fetchFileSize());
        pullTask.configParam(a((String) null));
        pullTask.configUUID(str);
        pullTask.configFiledID(null);
        pullTask.configDigest(watchFaceInfo.fetchDigest());
        FilePuller.getInstance(this.mContext).addTask(pullTask);
    }

    public final String a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(RecommendConstants.FILE_ID, str);
            jSONObject.put(RecommendConstants.VER, "0");
        } catch (JSONException unused) {
            HwLog.e("BaseWatchFaceManager", "getDownloadParam error JSONException");
        }
        return jSONObject.toString();
    }

    public final /* synthetic */ void a(Activity activity, String str) {
        j0 j0VarA = new j0.a(activity).b("").a(str).b(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: com.huawei.watchface.manager.BaseWatchFaceManager$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.a(view);
            }
        }).a();
        this.n = j0VarA;
        if (!j0VarA.isShowing()) {
            HwLog.i("BaseWatchFaceManager", "onSaveFailed() mCustomTextAlertDialog is Showing.");
            this.n.setCancelable(false);
            this.n.show();
        }
        HwLog.i("BaseWatchFaceManager", "onSaveFailed() mCustomTextAlertDialog has showed.");
    }

    public final /* synthetic */ void a(View view) {
        j0 j0Var = this.n;
        if (j0Var != null) {
            j0Var.dismiss();
            this.n = null;
        }
    }

    public final void a(String str, int i2, String str2, Context context) {
        i0 i0Var = this.g;
        if (i0Var != null && i0Var.isShowing() && this.h != null) {
            HwLog.i("BaseWatchFaceManager", "showProgress() ProgressDialogExist, update immediately");
            this.h.a(str);
            this.h.a(i2);
            this.h.b(str2);
            if (i2 >= 100) {
                m();
                b(1001, 5000);
                return;
            }
            return;
        }
        HwLog.i("BaseWatchFaceManager", "showProgress() ProgressDialogDoesNotExist, create new");
        if (context != null && !((Activity) context).isDestroyed()) {
            this.g = new i0(context);
            i0.a aVar = new i0.a(context);
            this.h = aVar;
            aVar.a(str);
            i0 i0VarA = this.h.a();
            this.g = i0VarA;
            i0VarA.setCancelable(false);
            this.g.setCanceledOnTouchOutside(false);
            this.h.a(i2);
            this.h.b(str2);
            if (this.g.isShowing()) {
                return;
            }
            HwLog.i("BaseWatchFaceManager", "showProgress() ShowProgressDialog");
            this.g.show();
            return;
        }
        HwLog.i("BaseWatchFaceManager", "showProgress() context is null.");
    }

    public final void a(Message message) {
        i0 i0Var;
        StringBuilder sb = new StringBuilder("HandleDismissProgressDialog :");
        sb.append(this.g != null);
        HwLog.i("BaseWatchFaceManager", sb.toString());
        if (this.g != null) {
            HwLog.i("BaseWatchFaceManager", "ProgressIsShowing :" + this.g.isShowing());
        }
        if (message.what == 100 && (i0Var = this.g) != null && i0Var.isShowing()) {
            HwLog.i("BaseWatchFaceManager", "DismissProgressDialog");
            m();
            this.g.dismiss();
            this.g = null;
            this.h = null;
            this.mTransferCompleteCount = 0;
            this.mTransferTotalCount = 0;
            this.mCurrentTransferPercent = 0;
        }
        this.k = null;
    }
}
