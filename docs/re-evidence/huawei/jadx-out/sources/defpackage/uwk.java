package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.FileProvider;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.WebViewUtils;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.main.R;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class uwk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static File f50656c;
    private static Uri e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomPermissionAction f50657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomPermissionAction f50658b;
    private final Activity d;
    private File g;
    private boolean h = false;

    public uwk(Activity activity, CustomPermissionAction customPermissionAction, CustomPermissionAction customPermissionAction2) {
        this.d = activity;
        this.f50657a = customPermissionAction;
        this.f50658b = customPermissionAction2;
    }

    public static void d(Activity activity) {
        if (activity == null) {
            LogUtil.j("SelectPhotoInteractor", "activity is null");
            return;
        }
        LogUtil.a("SelectPhotoInteractor", "goCamera");
        try {
            f50656c = WebViewUtils.createImageFile();
        } catch (IOException e2) {
            LogUtil.e("SelectPhotoInteractor", e2.getMessage());
        }
        if (f50656c == null) {
            LogUtil.j("SelectPhotoInteractor", "outputImage == null");
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.addFlags(3);
        Uri uriForFile = FileProvider.getUriForFile(activity, lrp.f40730c, f50656c);
        e = uriForFile;
        intent.putExtra("output", uriForFile);
        PackageManager packageManager = activity.getPackageManager();
        if (packageManager != null) {
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 1048576);
            if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.activityInfo == null) {
                LogUtil.j("SelectPhotoInteractor", "resolveInfo or resolveInfo.activityInfo is null");
            } else {
                intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
                activity.startActivityForResult(intent, 11);
            }
        }
    }

    public static void a(Activity activity) {
        String str;
        if (activity == null) {
            LogUtil.j("SelectPhotoInteractor", "activity is null");
            return;
        }
        String str2 = null;
        Intent intent = new Intent("android.intent.action.PICK", (Uri) null);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Constants.IMAGE_TYPE);
        PackageManager packageManager = activity.getPackageManager();
        if (packageManager != null) {
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 1048576);
            ActivityInfo activityInfo = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo : null;
            if (activityInfo != null) {
                str2 = activityInfo.packageName;
                str = activityInfo.name;
            } else {
                str = null;
            }
            if (str2 != null && str != null) {
                intent.setComponent(new ComponentName(str2, str));
            }
        }
        activity.startActivityForResult(intent, 13);
    }

    public void d(int i, Intent intent) {
        if (i != -1) {
            LogUtil.j("SelectPhotoInteractor", "unkonw resultCode");
            return;
        }
        if (this.d == null) {
            LogUtil.j("SelectPhotoInteractor", "mActivity is null");
            return;
        }
        LogUtil.a("SelectPhotoInteractor", "version >= 6.0");
        Uri data = (intent == null || intent.getData() == null || i != -1) ? e : intent.getData();
        if (data != null) {
            b(data);
        }
    }

    private void b(Intent intent) {
        PackageManager packageManager = this.d.getPackageManager();
        if (packageManager == null) {
            return;
        }
        String str = null;
        String str2 = null;
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 1048576)) {
            if (resolveInfo == null) {
                LogUtil.j("SelectPhotoInteractor", "info is null");
            } else {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null) {
                    str = activityInfo.packageName;
                    str2 = activityInfo.name;
                }
                if (str != null && str2 != null) {
                    intent.setComponent(new ComponentName(str, str2));
                }
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    LogUtil.j("SelectPhotoInteractor", "resolveInfo or resolveInfo.activityInfo is null");
                } else {
                    try {
                        if (intent.resolveActivity(packageManager) == null) {
                            LogUtil.j("SelectPhotoInteractor", "startActivitySecurity : cannot start the activity");
                        } else {
                            this.d.startActivityForResult(intent, 14);
                            return;
                        }
                    } catch (SecurityException unused) {
                        LogUtil.e("SelectPhotoInteractor", "cropPic startActivityForResult happens error");
                    }
                }
            }
        }
    }

    public void b(Uri uri) {
        LogUtil.a("SelectPhotoInteractor", "cropPic2, uri = ", uri);
        try {
            this.g = WebViewUtils.createImageFile();
        } catch (IOException e2) {
            LogUtil.e("SelectPhotoInteractor", e2.getMessage());
        }
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.addFlags(3);
        intent.setDataAndType(uri, Constants.IMAGE_TYPE);
        intent.putExtra("crop", true);
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", 300);
        intent.putExtra("outputY", 300);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.PNG.toString());
        intent.putExtra("return-data", false);
        LogUtil.a("SelectPhotoInteractor", "cropPic, intent = ", intent);
        File file = this.g;
        if (file != null) {
            intent.putExtra("output", Uri.fromFile(file));
        }
        if (this.d != null) {
            LogUtil.a("SelectPhotoInteractor", "cropPic startActivitySecurity");
            b(intent);
        } else {
            LogUtil.j("SelectPhotoInteractor", "mActivity is null");
        }
    }

    public void e(Uri uri) {
        LogUtil.a("SelectPhotoInteractor", "cropPic2,uri =", uri);
        try {
            this.g = WebViewUtils.createImageFile();
        } catch (IOException e2) {
            LogUtil.e("SelectPhotoInteractor", e2.getMessage());
        }
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.addFlags(3);
        intent.setDataAndType(uri, Constants.IMAGE_TYPE);
        intent.putExtra("crop", true);
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", 300);
        intent.putExtra("outputY", 300);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.PNG.toString());
        intent.putExtra("return-data", false);
        LogUtil.a("SelectPhotoInteractor", "cropPic, intent = ", intent);
        File file = this.g;
        if (file != null) {
            intent.putExtra("output", Uri.fromFile(file));
        }
        if (this.d != null) {
            LogUtil.a("SelectPhotoInteractor", "cropPicImage startActivitySecurity");
            b(intent);
        } else {
            LogUtil.j("SelectPhotoInteractor", "mActivity is null");
        }
    }

    public void e(final Activity activity) {
        if (activity == null) {
            LogUtil.j("SelectPhotoInteractor", "activity is null");
            return;
        }
        View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.dialog_select_user_photo, (ViewGroup) null);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(activity);
        builder.c(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: uwk.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder.a(activity.getString(R.string.IDS_hwh_home_healthshop_select_upload_way)).d(viewInflate);
        final CustomViewDialog customViewDialogD = builder.d();
        viewInflate.findViewById(R.id.line_take_photo).setOnClickListener(new View.OnClickListener() { // from class: uwk.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                uwk.this.e(activity, false);
                customViewDialogD.dismiss();
            }
        });
        viewInflate.findViewById(R.id.line_gallery).setOnClickListener(new View.OnClickListener() { // from class: uwk.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                uwk.this.e(activity, true);
                customViewDialogD.dismiss();
            }
        });
        customViewDialogD.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Activity activity, boolean z) {
        this.h = z;
        LogUtil.a("SelectPhotoInteractor", "checkHavePermission");
        c(activity);
    }

    public void c(Activity activity) {
        if (!this.h) {
            PermissionUtil.d(activity, PermissionUtil.PermissionType.CAMERA, this.f50658b);
        } else if (activity == null) {
            LogUtil.e("SelectPhotoInteractor", "takePhoto: activity is null");
        } else {
            qrs.c(activity, 2);
        }
    }

    public File e() {
        return this.g;
    }
}
