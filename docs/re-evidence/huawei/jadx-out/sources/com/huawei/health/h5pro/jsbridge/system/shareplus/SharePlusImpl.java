package com.huawei.health.h5pro.jsbridge.system.shareplus;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.core.app.ShareCompat;
import androidx.core.content.ContextCompat;
import com.huawei.health.h5pro.core.R;
import com.huawei.health.h5pro.core.a;
import com.huawei.health.h5pro.dfx.bi.Analyzer;
import com.huawei.health.h5pro.jsbridge.system.share.AndroidShare;
import com.huawei.health.h5pro.jsbridge.system.share.Share;
import com.huawei.health.h5pro.jsbridge.system.share.ShareEntry;
import com.huawei.health.h5pro.jsbridge.system.share.ShareImageObj;
import com.huawei.health.h5pro.jsbridge.system.storage.AndroidStorage;
import com.huawei.health.h5pro.jsbridge.system.storage.StorageUtil;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.health.h5pro.view.FloatingBarAdapter;
import com.huawei.health.h5pro.view.FloatingBarItem;
import com.huawei.operation.utils.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SharePlusImpl implements SharePlus {
    private static long e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private H5ProInstance f6893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Analyzer f6894c;
    private Context d;

    /* JADX INFO: loaded from: classes28.dex */
    public enum ShareTypeEnum {
        SHARE_TYPE_WECHAT_CHAT(1, R.string.IDS_plugin_socialshare_wechat_chat, "com.tencent.mm", "com.tencent.mm.ui.tools.ShareImgUI"),
        SHARE_TYPE_WECHAT_TIME_LINE_UI(2, -1, "com.tencent.mm", "com.tencent.mm.ui.tools.ShareToTimeLineUI"),
        SHARE_TYPE_QQ(-1, R.string.IDS_plugin_socialshare_qq, "com.tencent.mobileqq", ""),
        SHARE_TYPE_EMAIL(-1, -1, "com.android.email", ""),
        SHARE_TYPE_SAVE_LOCAL(4, -1, "", ""),
        SHARE_TYPE_MORE(5, -1, "", "");

        private final String className;
        private final String packageName;
        private final int shareType;
        private final int showNameResourceId;

        ShareTypeEnum(int i, int i2, String str, String str2) {
            this.shareType = i;
            this.showNameResourceId = i2;
            this.packageName = str;
            this.className = str2;
        }

        public boolean isShow(ActivityInfo activityInfo) {
            return activityInfo != null && !TextUtils.isEmpty(this.packageName) && TextUtils.equals(this.packageName, activityInfo.packageName) && (TextUtils.isEmpty(this.className) || TextUtils.equals(this.className, activityInfo.name));
        }
    }

    public SharePlusImpl(Context context, H5ProInstance h5ProInstance) {
        this.d = context;
        this.f6893b = h5ProInstance;
    }

    private String a(Uri uri) {
        Cursor cursorQuery = this.d.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(0);
                    cursorQuery.close();
                    return string;
                }
            } catch (Throwable th) {
                try {
                    cursorQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (cursorQuery == null) {
            return "";
        }
        cursorQuery.close();
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File file, String str, String str2) {
        String str3 = Environment.DIRECTORY_DOCUMENTS + File.separator + "Health";
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str2);
        contentValues.put("mime_type", str);
        contentValues.put("relative_path", str3);
        contentValues.put("title", str2);
        contentValues.put("date_added", Long.valueOf(System.currentTimeMillis() / 1000));
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        ContentResolver contentResolver = this.d.getContentResolver();
        Uri uriInsert = contentResolver.insert(MediaStore.Files.getContentUri("external"), contentValues);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uriInsert, "w");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = fileInputStream.read(bArr);
                                if (i <= 0) {
                                    break;
                                } else {
                                    fileOutputStream.write(bArr, 0, i);
                                }
                                fileOutputStream.close();
                                throw th;
                            }
                            fileOutputStream.flush();
                            contentValues.clear();
                            contentValues.put("is_pending", (Integer) 0);
                            contentResolver.update(uriInsert, contentValues, null, null);
                            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                            if (outputStreamOpenOutputStream == null) {
                                try {
                                    throw new IOException("Failed to get output stream.");
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
                            }
                            outputStreamOpenOutputStream.close();
                            Toast.makeText(this.d, this.d.getString(R.string.IDS_hwh_show_save_success) + " " + str3 + File.separator + a(uriInsert), 0).show();
                            fileInputStream.close();
                            fileOutputStream.close();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return;
                        } catch (Throwable th3) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                        fileOutputStream.close();
                    } catch (Throwable th5) {
                        th.addSuppressed(th5);
                    }
                } catch (Throwable th6) {
                    fileOutputStream.close();
                    throw th6;
                }
                throw th6;
            } catch (Throwable th7) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                }
                throw th7;
            }
        } catch (IOException unused) {
            contentResolver.delete(uriInsert, null, null);
            LogUtil.e("H5PRO_SharePlusImpl", "save meet IOException");
            Toast.makeText(this.d, R.string.IDS_hwh_show_save_failed, 0).show();
        }
    }

    private FloatingBarItem b(final Intent intent, final String str, final SharePlusParam sharePlusParam) {
        return new FloatingBarItem(this.d.getString(R.string.IDS_hwh_show_save_local), ContextCompat.getDrawable(this.d, R.mipmap.share_save_local_nor), new View.OnClickListener() { // from class: com.huawei.health.h5pro.jsbridge.system.shareplus.SharePlusImpl.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.i("H5PRO_SharePlusImpl", "share: save");
                Serializable serializableExtra = intent.getSerializableExtra("KEY_SHARE_FILE");
                if (!(serializableExtra instanceof File)) {
                    LogUtil.w("H5PRO_SharePlusImpl", "share: failed to save the file");
                } else {
                    SharePlusImpl.this.a((File) serializableExtra, intent.getType(), str);
                    SharePlusImpl.this.d(ShareTypeEnum.SHARE_TYPE_SAVE_LOCAL, sharePlusParam);
                }
            }
        });
    }

    private File b(SharePlusParam sharePlusParam) {
        String fileName = sharePlusParam.getFileName();
        if (!GeneralUtil.isSafePath(fileName)) {
            LogUtil.w("H5PRO_SharePlusImpl", "cacheTextFile: invalid file name");
            return null;
        }
        String str = StorageUtil.getAppFilePath(this.d, this.f6893b) + fileName;
        try {
            new AndroidStorage(this.d).base64ToFile(str, sharePlusParam.getBase64());
        } catch (IOException unused) {
            LogUtil.e("H5PRO_SharePlusImpl", "cacheTextFile fail");
        }
        return new File(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Intent intent) {
        if (c("", intent)) {
            List<ResolveInfo> listQueryIntentActivities = this.d.getPackageManager().queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null) {
                Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                while (it.hasNext()) {
                    this.d.grantUriPermission(it.next().activityInfo.packageName, intent.getData(), 1);
                }
            }
            Intent intentCreateChooser = Intent.createChooser(intent, "");
            intentCreateChooser.addFlags(268435457);
            this.d.startActivity(intentCreateChooser);
        }
    }

    private File c(SharePlusParam sharePlusParam) {
        String fileName = sharePlusParam.getFileName();
        if (!GeneralUtil.isSafePath(fileName)) {
            LogUtil.w("H5PRO_SharePlusImpl", "cacheTextFile: invalid file name");
            return null;
        }
        String str = StorageUtil.getAppFilePath(this.d, this.f6893b) + fileName;
        try {
            new AndroidStorage(this.d).writeText(str, sharePlusParam.getText(), false);
        } catch (IOException unused) {
            LogUtil.e("H5PRO_SharePlusImpl", "cacheTextFile fail");
        }
        return new File(str);
    }

    private List<FloatingBarItem> c(final Intent intent, final SharePlusParam sharePlusParam) {
        SharePlusImpl sharePlusImpl = this;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = sharePlusImpl.d.getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = sharePlusImpl.d.getPackageManager().queryIntentActivities(intent, 65536);
        if (listQueryIntentActivities != null) {
            ShareTypeEnum[] shareTypeEnumArrValues = ShareTypeEnum.values();
            int length = shareTypeEnumArrValues.length;
            int i = 0;
            while (i < length) {
                final ShareTypeEnum shareTypeEnum = shareTypeEnumArrValues[i];
                for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                    if (shareTypeEnum.isShow(resolveInfo.activityInfo)) {
                        String string = shareTypeEnum.showNameResourceId == -1 ? "" : sharePlusImpl.d.getResources().getString(shareTypeEnum.showNameResourceId);
                        if (TextUtils.isEmpty(string)) {
                            string = resolveInfo.loadLabel(packageManager).toString();
                        }
                        final String str = string;
                        final ActivityInfo activityInfo = resolveInfo.activityInfo;
                        arrayList.add(new FloatingBarItem(str, resolveInfo.loadIcon(packageManager), new View.OnClickListener() { // from class: com.huawei.health.h5pro.jsbridge.system.shareplus.SharePlusImpl.4
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                LogUtil.i("H5PRO_SharePlusImpl", "share: " + str);
                                SharePlusImpl.this.e(activityInfo, intent, sharePlusParam, shareTypeEnum);
                            }
                        }));
                        break;
                    }
                }
                i++;
                sharePlusImpl = this;
                packageManager = packageManager;
            }
        }
        return arrayList;
    }

    private boolean c(String str, Intent intent) {
        String strValueOf;
        if (TextUtils.equals(ShareTypeEnum.SHARE_TYPE_WECHAT_CHAT.packageName, str) || TextUtils.isEmpty(str)) {
            if (System.currentTimeMillis() - e < 2000) {
                LogUtil.i("H5PRO_SharePlusImpl", "wechatChat: Too frequent clicks");
                return false;
            }
            e = System.currentTimeMillis();
            Serializable serializableExtra = intent.getSerializableExtra("KEY_SHARE_FILE");
            if (!(serializableExtra instanceof File)) {
                LogUtil.w("H5PRO_SharePlusImpl", "wechatChat: shareFileSerializable is null");
                return false;
            }
            File file = (File) serializableExtra;
            String name = file.getName();
            if (TextUtils.isEmpty(name) || !name.contains(".")) {
                strValueOf = String.valueOf(System.currentTimeMillis());
            } else {
                strValueOf = System.currentTimeMillis() + "." + name.split("\\.")[1];
            }
            File file2 = new File(file.getParentFile(), strValueOf);
            if (!file.renameTo(file2) || !file2.exists()) {
                LogUtil.w("H5PRO_SharePlusImpl", "wechatChat: Failed to rename the file");
                return false;
            }
            intent.putExtra("KEY_SHARE_FILE", file2);
            Uri uriFromFile = StorageUtil.getUriFromFile(this.d, file2);
            intent.setDataAndType(uriFromFile, intent.getType());
            intent.putExtra("android.intent.extra.STREAM", uriFromFile);
        }
        return true;
    }

    private Intent d(File file, String str) {
        Uri uriFromFile = StorageUtil.getUriFromFile(this.d, file);
        return ShareCompat.IntentBuilder.from((Activity) this.d).setType(str).setStream(uriFromFile).getIntent().setDataAndType(uriFromFile, str).putExtra("KEY_SHARE_FILE", file);
    }

    private FloatingBarItem d(final Intent intent, final SharePlusParam sharePlusParam) {
        return new FloatingBarItem(this.d.getString(R.string.IDS_user_profile_more), ContextCompat.getDrawable(this.d, R.mipmap.ic_more_normal), new View.OnClickListener() { // from class: com.huawei.health.h5pro.jsbridge.system.shareplus.SharePlusImpl.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.i("H5PRO_SharePlusImpl", "share: system");
                SharePlusImpl.this.b(intent);
                SharePlusImpl.this.d(ShareTypeEnum.SHARE_TYPE_MORE, sharePlusParam);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ShareTypeEnum shareTypeEnum, SharePlusParam sharePlusParam) {
        if (shareTypeEnum.shareType == -1) {
            LogUtil.w("H5PRO_SharePlusImpl", "Platform '" + shareTypeEnum.packageName + "' does not need dotting");
            return;
        }
        Map<String, Object> shareBiMap = sharePlusParam.getShareBiMap();
        if (shareBiMap == null) {
            shareBiMap = new LinkedHashMap<>();
        }
        shareBiMap.put("type", Integer.valueOf(shareTypeEnum.shareType));
        shareBiMap.put(Constants.BI_MODULE_ID, sharePlusParam.getModuleId());
        String json = GsonUtil.toJson(shareBiMap);
        LogUtil.d("H5PRO_SharePlusImpl", a.a("putShareFileBiEvent: ", json));
        if (this.f6894c == null) {
            Analyzer analyzer = new Analyzer();
            this.f6894c = analyzer;
            H5ProInstance h5ProInstance = this.f6893b;
            if (h5ProInstance != null) {
                analyzer.setAppInfo(h5ProInstance.getAppInfo());
            }
        }
        this.f6894c.putBiEvent("11000334", json);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(ActivityInfo activityInfo, Intent intent, SharePlusParam sharePlusParam, ShareTypeEnum shareTypeEnum) {
        if (c(activityInfo.packageName, intent)) {
            Intent intent2 = new Intent(intent);
            intent2.setPackage(activityInfo.packageName);
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.addFlags(268435457);
            this.d.grantUriPermission(activityInfo.packageName, intent2.getData(), 1);
            try {
                this.d.startActivity(intent2);
            } catch (ActivityNotFoundException e2) {
                LogUtil.e("H5PRO_SharePlusImpl", "shareToTarget: exception -> " + e2.getMessage());
            }
            d(shareTypeEnum, sharePlusParam);
        }
    }

    private void e(File file, SharePlusParam sharePlusParam) {
        ShareImageObj shareImageObj = new ShareImageObj();
        shareImageObj.setModuleId(sharePlusParam.getModuleId());
        shareImageObj.setShareBiMap(sharePlusParam.getShareBiMap());
        shareImageObj.setIsReport(sharePlusParam.isReport());
        shareImageObj.setExtra(sharePlusParam.getExtra());
        try {
            shareImageObj.setFilePath(file.getCanonicalPath());
            Share shareImpl = ShareEntry.getShareImpl();
            if (shareImpl == null) {
                shareImpl = new AndroidShare(this.d);
            }
            shareImpl.shareImage(shareImageObj, new Share.ShareCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.shareplus.SharePlusImpl.2
                @Override // com.huawei.health.h5pro.jsbridge.system.share.Share.ShareCallback
                public void onFailure(int i, String str) {
                    LogUtil.w("H5PRO_SharePlusImpl", "shareImageCompact(onFailure): " + i + " - " + str);
                }

                @Override // com.huawei.health.h5pro.jsbridge.system.share.Share.ShareCallback
                public void onSuccess() {
                    LogUtil.i("H5PRO_SharePlusImpl", "shareImageCompact: success");
                }
            });
        } catch (IOException unused) {
            LogUtil.e("H5PRO_SharePlusImpl", "share compact fail: file invalid");
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.shareplus.SharePlus
    public void destroy() {
        this.d = null;
        this.f6893b = null;
        this.f6894c = null;
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.shareplus.SharePlus
    public void shareFile(SharePlusParam sharePlusParam) {
        File file;
        if ("text".equalsIgnoreCase(sharePlusParam.getType())) {
            file = c(sharePlusParam);
        } else if ("base64".equalsIgnoreCase(sharePlusParam.getType())) {
            file = b(sharePlusParam);
        } else {
            String filePath = sharePlusParam.getFilePath();
            if (!GeneralUtil.isSafePath(filePath)) {
                LogUtil.w("H5PRO_SharePlusImpl", "shareFile: invalid file path");
                return;
            }
            file = new File(filePath);
        }
        if (file == null || !file.exists()) {
            LogUtil.w("H5PRO_SharePlusImpl", "shareFile: the file does not exist");
            return;
        }
        String mimeType = sharePlusParam.getMimeType();
        if (TextUtils.isEmpty(mimeType) || !mimeType.startsWith("image")) {
            b(file, sharePlusParam);
        } else {
            e(file, sharePlusParam);
        }
    }

    private void b(File file, SharePlusParam sharePlusParam) {
        Intent intentD = d(file, sharePlusParam.getMimeType());
        LinkedList linkedList = new LinkedList();
        List<FloatingBarItem> listC = c(intentD, sharePlusParam);
        if (!listC.isEmpty()) {
            linkedList.addAll(listC);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            linkedList.add(b(intentD, file.getName(), sharePlusParam));
        }
        linkedList.add(d(intentD, sharePlusParam));
        this.f6893b.getAppLoadListener().onFloatingBarRequested(new FloatingBarAdapter(linkedList));
    }
}
