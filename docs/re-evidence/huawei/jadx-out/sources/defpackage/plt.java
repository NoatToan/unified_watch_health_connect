package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.huawei.agconnect.apms.Agent;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.beans.TitleBean;
import com.huawei.pluginsocialshare.R;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class plt {
    public void c(gxt gxtVar) {
        int iU = gxtVar.u();
        if (iU == 8) {
            i(gxtVar);
        } else if (iU == 10) {
            a(gxtVar);
        } else {
            e(gxtVar);
        }
    }

    private void e(gxt gxtVar) {
        Bitmap bitmapD = d(gxtVar);
        if (bitmapD == null) {
            LogUtil.a("SaveLocalInteractor", "getShareContentBitmap failed");
            Toast.makeText(BaseApplication.getContext(), R.string.IDS_hwh_show_save_failed, 0).show();
        } else {
            pnq.e(BaseApplication.getContext(), pnq.a(bitmapD, 50240), gxtVar.l());
        }
    }

    private void i(gxt gxtVar) {
        if (b(gxtVar.x())) {
            qpx.b(BaseApplication.getContext(), BaseApplication.getContext().getString(R.string.IDS_retack_save_recorder_tip));
        } else {
            qpx.b(BaseApplication.getContext(), BaseApplication.getContext().getString(R.string.IDS_hwh_show_save_failed));
        }
    }

    private boolean b(String str) {
        if (!new File(str).exists() || !PermissionUtil.a()) {
            ReleaseLogUtil.d("R_SaveLocalInteractor", "file not exit or system Not supported");
            return false;
        }
        Uri uriB = b();
        if (uriB == null) {
            ReleaseLogUtil.a("R_SaveLocalInteractor", "Failed to create new MediaStore record.");
            return false;
        }
        try {
            OutputStream outputStreamOpenOutputStream = BaseApplication.getContext().getContentResolver().openOutputStream(uriB);
            try {
                FileInputStream fileInputStream = new FileInputStream(str);
                try {
                    if (outputStreamOpenOutputStream == null) {
                        ReleaseLogUtil.a("R_SaveLocalInteractor", "Failed to get output stream.");
                        BaseApplication.getContext().getContentResolver().delete(uriB, null, null);
                        fileInputStream.close();
                        if (outputStreamOpenOutputStream != null) {
                            outputStreamOpenOutputStream.close();
                        }
                        return false;
                    }
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        outputStreamOpenOutputStream.write(bArr, 0, i);
                    }
                    outputStreamOpenOutputStream.flush();
                    LogUtil.a("SaveLocalInteractor", "Video written successfully.");
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("is_pending", (Integer) 0);
                    BaseApplication.getContext().getContentResolver().update(uriB, contentValues, null, null);
                    fileInputStream.close();
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.close();
                    }
                    return true;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStreamOpenOutputStream != null) {
                    try {
                        outputStreamOpenOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (IOException unused) {
            ReleaseLogUtil.a("R_SaveLocalInteractor", "IOException, Failed to save video.");
            BaseApplication.getContext().getContentResolver().delete(uriB, null, null);
            return false;
        }
    }

    private Uri b() {
        String strE = pnq.e("sporthealth-%d-%s.mp4");
        long jCurrentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", strE);
        contentValues.put("_display_name", strE);
        contentValues.put("mime_type", "video/mp4");
        contentValues.put("datetaken", Long.valueOf(jCurrentTimeMillis));
        long j = jCurrentTimeMillis / 1000;
        contentValues.put("date_added", Long.valueOf(j));
        contentValues.put("date_modified", Long.valueOf(j));
        contentValues.put("date_expires", Long.valueOf((jCurrentTimeMillis + 3600000) / 1000));
        contentValues.put("is_pending", (Integer) 1);
        contentValues.put("relative_path", "DCIM/HuaweiHealth/");
        return BaseApplication.getContext().getContentResolver().insert(MediaStore.Video.Media.getContentUri("external_primary"), contentValues);
    }

    private Bitmap d(gxt gxtVar) {
        Bitmap bitmapA = pnq.a(gxtVar);
        if (bitmapA == null) {
            LogUtil.j("SaveLocalInteractor", "getShareContentBitmap failed");
        }
        return bitmapA;
    }

    private void a(final gxt gxtVar) {
        PermissionUtil.d(BaseApplication.getActivity(), PermissionUtil.PermissionType.MANAGE_EXTERNAL_STORAGE, new CustomPermissionAction(BaseApplication.getActivity()) { // from class: plt.3
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() throws Throwable {
                plt.this.b(gxtVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(gxt gxtVar) throws Throwable {
        String str = CommonUtil.f((Context) null).getAbsolutePath() + File.separator + TitleBean.RIGHT_BTN_TYPE_SHARE;
        File file = new File(str);
        if (!FileUtils.c(file, str)) {
            LogUtil.j("SaveLocalInteractor", "path_crossing saveFile share file is invalid, filePath ", str);
            return;
        }
        try {
            if (!file.exists() && !file.mkdirs()) {
                LogUtil.a("SaveLocalInteractor", "create dirPath fail");
                return;
            }
            File file2 = new File(gxtVar.a());
            String name = file2.getName();
            if (Build.VERSION.SDK_INT < 30) {
                String str2 = str + File.separator + name;
                d(file2, str2);
                if (str2.contains(Agent.OS_NAME)) {
                    d(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_plugin_socialshare_file_save_to), str2.substring(str2.indexOf(Agent.OS_NAME))));
                    return;
                }
                if (str2.contains(TitleBean.RIGHT_BTN_TYPE_SHARE)) {
                    int iIndexOf = str2.indexOf(Environment.DIRECTORY_DOWNLOADS);
                    Locale locale = Locale.ENGLISH;
                    String string = BaseApplication.getContext().getString(R.string.IDS_plugin_socialshare_file_save_to);
                    if (iIndexOf <= 0) {
                        iIndexOf = str2.indexOf(TitleBean.RIGHT_BTN_TYPE_SHARE);
                    }
                    d(String.format(locale, string, str2.substring(iIndexOf)));
                    return;
                }
                LogUtil.a("SaveLocalInteractor", "path is error:", str2);
                return;
            }
            String str3 = Environment.DIRECTORY_DOWNLOADS + File.separator + TitleBean.RIGHT_BTN_TYPE_SHARE;
            a(file2, name, str3);
            d(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_plugin_socialshare_file_save_to), str3 + File.separator + name));
        } catch (SecurityException unused) {
            LogUtil.e("SaveLocalInteractor", "mkdir error");
        }
    }

    private void d(File file, String str) {
        File file2 = new File(str);
        FileUtils.b(file2);
        try {
            FileUtils.e(file, file2);
        } catch (IOException unused) {
            LogUtil.e("SaveLocalInteractor", "IOException");
        }
    }

    private void a(File file, String str, String str2) throws Throwable {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "*/*");
        contentValues.put("title", str);
        contentValues.put("relative_path", str2);
        Uri uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        ContentResolver contentResolver = BaseApplication.getContext().getContentResolver();
        Uri uriInsert = contentResolver.insert(uri, contentValues);
        LogUtil.a("SaveLocalInteractor", "insertUri:", uriInsert);
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                if (outputStreamOpenOutputStream != null) {
                    FileUtils.a(fileInputStream2, outputStreamOpenOutputStream);
                } else {
                    LogUtil.a("SaveLocalInteractor", "fileInputStream is empty");
                }
                a(fileInputStream2, outputStreamOpenOutputStream);
            } catch (IOException unused) {
                fileInputStream = fileInputStream2;
                try {
                    LogUtil.e("SaveLocalInteractor", "IOException");
                    a(fileInputStream, fileInputStream);
                } catch (Throwable th) {
                    th = th;
                    a(fileInputStream, null);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                a(fileInputStream, null);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void a(FileInputStream fileInputStream, OutputStream outputStream) {
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException unused) {
                LogUtil.e("SaveLocalInteractor", "fileInputStream close catch IOException");
            }
        }
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused2) {
                LogUtil.e("SaveLocalInteractor", "outputStream close catch IOException");
            }
        }
    }

    private void d(String str) {
        View viewInflate = LayoutInflater.from(BaseApplication.getContext()).inflate(R.layout.dialog_confirm_save_location, (ViewGroup) null);
        ((HealthTextView) viewInflate.findViewById(R.id.tv_remind)).setText(str);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(BaseApplication.getActivity());
        builder.a(BaseApplication.getContext().getString(R.string.IDS_plugin_socialshare_file_save_to_local)).b(viewInflate, 0, 0).d(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: plw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("SaveLocalInteractor", "onClick positive view");
            }
        });
        builder.d().show();
    }
}
