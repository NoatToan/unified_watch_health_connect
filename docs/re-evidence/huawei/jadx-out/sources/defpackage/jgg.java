package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes10.dex */
public class jgg {
    private String d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f38572b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38573c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f38571a = null;

    public String a() {
        return this.f38573c;
    }

    public Uri b() {
        return this.f38571a;
    }

    public void a(boolean z) {
        this.f38573c = null;
        this.f38571a = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.d = this.f38572b.a(Long.valueOf(jCurrentTimeMillis), z);
        if (PermissionUtil.e()) {
            c(jCurrentTimeMillis);
            return;
        }
        this.f38573c = d() + this.d;
    }

    private void c(long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", this.d);
        contentValues.put("_display_name", this.d);
        contentValues.put("mime_type", "video/mp4");
        long j2 = j / 1000;
        contentValues.put("date_added", Long.valueOf(j2));
        contentValues.put("date_modified", Long.valueOf(j2));
        contentValues.put("date_expires", Long.valueOf((j + 3600000) / 1000));
        contentValues.put("is_pending", (Integer) 1);
        contentValues.put("relative_path", "DCIM/HuaweiHealth/");
        try {
            this.f38571a = BaseApplication.getContext().getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
        } catch (IllegalArgumentException | IllegalStateException e) {
            ReleaseLogUtil.b("Track_FileManager", "initVideoName: ", LogAnonymous.b(e));
        }
    }

    public void c() {
        if (this.f38571a == null) {
            ReleaseLogUtil.d("Track_FileManager", "onVideoSaveSuccess: uri is null");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.putNull("date_expires");
        contentValues.put("is_pending", (Integer) 0);
        try {
            BaseApplication.getContext().getContentResolver().update(this.f38571a, contentValues, null, null);
            this.f38573c = d(this.f38571a);
        } catch (IllegalArgumentException | IllegalStateException | SecurityException e) {
            ReleaseLogUtil.b("Track_FileManager", "onVideoSaveSuccess: resolver update error ", LogAnonymous.b(e));
        }
    }

    public void e() {
        if (!TextUtils.isEmpty(this.f38573c)) {
            File file = new File(this.f38573c);
            try {
                try {
                    if (file.exists()) {
                        if (file.delete()) {
                            LogUtil.j("Track_FileManager", "file delete success!");
                        } else {
                            LogUtil.j("Track_FileManager", "file delete fail!");
                        }
                    }
                } catch (SecurityException e) {
                    LogUtil.j("Track_FileManager", e.getMessage());
                }
                this.f38573c = null;
            } catch (Throwable th) {
                this.f38573c = null;
                throw th;
            }
        }
        try {
            if (this.f38571a == null) {
                LogUtil.j("Track_FileManager", "deleteFile: uri is null");
                return;
            }
            try {
                BaseApplication.getContext().getContentResolver().delete(this.f38571a, null, null);
            } catch (IllegalArgumentException e2) {
                ReleaseLogUtil.b("Track_FileManager", "deleteFile: error ", LogAnonymous.b(e2));
            }
        } finally {
            this.f38571a = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v2 */
    public String d(Uri uri) throws Throwable {
        IllegalArgumentException e;
        Cursor cursorQuery;
        String[] strArr = {"_data"};
        ?? r10 = 0;
        try {
            try {
                cursorQuery = BaseApplication.getContext().getContentResolver().query(uri, strArr, null, null, null);
                try {
                    if (cursorQuery == null) {
                        ReleaseLogUtil.d("Track_FileManager", "getFilePathFromContentUri: cursor is null");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndex(strArr[0])) : null;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return string;
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    ReleaseLogUtil.b("Track_FileManager", "getFilePathFromContentUri: ", LogAnonymous.b(e));
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                r10 = uri;
                th = th;
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
    }

    private int e(String str) {
        if (str == null) {
            return 3;
        }
        File file = new File(str);
        try {
            if (file.exists()) {
                return 2;
            }
            return file.mkdirs() ? 1 : 3;
        } catch (SecurityException e) {
            LogUtil.j("Track_FileManager", e.getMessage());
            return 3;
        }
    }

    public String d() {
        try {
            String str = d(BaseApplication.getContext()).getCanonicalPath() + File.separator + "DCIM/HuaweiHealth/";
            if (e(str) != 3) {
                return str;
            }
            LogUtil.j("Track_FileManager", "folder create fail");
            return null;
        } catch (IOException e) {
            LogUtil.e("Track_FileManager", LogAnonymous.b(e));
            return null;
        }
    }

    private File d(Context context) {
        if (context == null) {
            context = BaseApplication.getContext();
        }
        File externalStorageDirectory = null;
        if ("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) {
            if (PermissionUtil.e()) {
                ReleaseLogUtil.c("Track_FileManager", "PermissionUtil.isAndroidR()");
                externalStorageDirectory = context.getExternalFilesDir(null);
            } else {
                ReleaseLogUtil.c("Track_FileManager", "Version is Under R");
                externalStorageDirectory = Environment.getExternalStorageDirectory();
            }
        }
        if (externalStorageDirectory != null) {
            return externalStorageDirectory;
        }
        ReleaseLogUtil.d("Track_FileManager", "getExternalFilesDirectory:innerContext.getFilesDir");
        return context.getFilesDir();
    }

    static class b {
        private b() {
        }

        public String a(Long l, boolean z) {
            return e(l, z) + ".mp4";
        }

        public String e(Long l, boolean z) {
            String str = "Health" + new SimpleDateFormat(HwDrmConstant.TIME_FORMAT).format(l);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(z ? "short" : "complete");
            return sb.toString();
        }
    }
}
