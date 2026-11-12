package com.xiaomi.passport.ui.page;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import androidx.core.content.FileProvider;
import com.xiaomi.account.passportsdk.account_sso.R;
import com.xiaomi.accountsdk.account.XMPassport;
import com.xiaomi.accountsdk.account.data.Constants;
import com.xiaomi.accountsdk.account.exception.InvalidParameterException;
import com.xiaomi.accountsdk.account.utils.BitmapUtils;
import com.xiaomi.accountsdk.request.AccessDeniedException;
import com.xiaomi.accountsdk.request.AuthenticationFailureException;
import com.xiaomi.accountsdk.request.CipherException;
import com.xiaomi.accountsdk.request.InvalidResponseException;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.passport.accountmanager.XiaomiAccountManager;
import com.xiaomi.passport.data.XMPassportInfo;
import com.xiaomi.passport.ui.internal.util.BitmapFactory;
import com.xiaomi.passport.ui.settings.utils.PermissionRequestHistory;
import com.xiaomi.passport.ui.settings.utils.PermissionUtils;
import com.xiaomi.passport.ui.utils.AccountToast;
import com.xiaomi.passport.ui.utils.OsHelper;
import com.xiaomi.passport.ui.view.PassportDialog;
import com.xiaomi.passport.utils.XiaomiPassportExecutor;
import defpackage.ni4;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class UserAvatarUpdateFragment extends com.xiaomi.passport.ui.settings.BaseFragment {
    private static final String AVATAR_FILE_NAME = "xiaomi_user_avatar_file";
    private static final int CAMERA_REQUEST_CODE = 100;
    private static final String FILE_PROVIDER_AUTHORITY_SUFFIX = ".passport.fileprovider";
    private static final int PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE = 200;
    private static final int PERMISSION_SETTINGS_REQUEST_CODE = 2000;
    private static final int REQUEST_CROP_PHOTO = 1004;
    private static final int REQUEST_PICK_PHOTO_FROM_GALLERY = 1003;
    private static final int REQUEST_TAKE_PHOTO = 1002;
    private static final String TAG = "UserAvatarUpdateFragment";
    private Account mAccount;
    private File mAvatarCachedFile;
    private Uri mFileProviderUri;
    private UploadUserAvatarTask mUploadAvatarTask;

    public class UploadAvatarTaskResult {
        public Bitmap bitmap;
        int errorMsgResId;

        public UploadAvatarTaskResult(int i, Bitmap bitmap) {
            this.errorMsgResId = i;
            this.bitmap = bitmap;
        }
    }

    public class UploadUserAvatarTask extends AsyncTask<Void, Void, UploadAvatarTaskResult> {
        private final Bitmap mBitmap;
        private Context mContext;
        private PassportDialog mLoginLoadingDialog;

        public UploadUserAvatarTask(Context context, Bitmap bitmap) {
            this.mBitmap = bitmap;
            this.mContext = context.getApplicationContext();
            PassportDialog passportDialog = new PassportDialog(UserAvatarUpdateFragment.this.getActivity());
            this.mLoginLoadingDialog = passportDialog;
            passportDialog.setLoadingProgressVisible(true);
            this.mLoginLoadingDialog.setMessage(UserAvatarUpdateFragment.this.getString(R.string.passport_user_avatar_uploading));
            this.mLoginLoadingDialog.setCancelable(false);
            this.mLoginLoadingDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.xiaomi.passport.ui.page.UserAvatarUpdateFragment.UploadUserAvatarTask.1
                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    UploadUserAvatarTask.this.cancel(true);
                }
            });
            this.mLoginLoadingDialog.show();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v2, types: [java.io.FileInputStream] */
        /* JADX WARN: Type inference failed for: r11v3 */
        /* JADX WARN: Type inference failed for: r11v7, types: [java.io.FileInputStream, java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v14, types: [java.io.FileInputStream] */
        /* JADX WARN: Type inference failed for: r2v15, types: [java.io.FileInputStream] */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v21 */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v27 */
        /* JADX WARN: Type inference failed for: r2v28 */
        /* JADX WARN: Type inference failed for: r2v29 */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.io.FileInputStream] */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v31 */
        /* JADX WARN: Type inference failed for: r2v32 */
        /* JADX WARN: Type inference failed for: r2v33 */
        /* JADX WARN: Type inference failed for: r2v34 */
        /* JADX WARN: Type inference failed for: r2v35 */
        /* JADX WARN: Type inference failed for: r2v36 */
        /* JADX WARN: Type inference failed for: r2v37 */
        /* JADX WARN: Type inference failed for: r2v38 */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.io.FileInputStream] */
        /* JADX WARN: Type inference failed for: r2v6, types: [java.io.FileInputStream] */
        /* JADX WARN: Type inference failed for: r2v7, types: [java.io.FileInputStream] */
        /* JADX WARN: Type inference failed for: r6v2, types: [com.xiaomi.passport.accountmanager.XiaomiAccountManager] */
        @Override // android.os.AsyncTask
        public UploadAvatarTaskResult doInBackground(Void... voidArr) throws Throwable {
            Bitmap bitmapDecodeFile;
            ?? fileInputStream;
            AuthenticationFailureException e;
            Account xiaomiAccount = XiaomiAccountManager.get(this.mContext).getXiaomiAccount();
            ?? r2 = 0;
            if (xiaomiAccount == null) {
                AccountLogger.log(UserAvatarUpdateFragment.TAG, "no xiaomi account");
                return null;
            }
            File fileProviderFile = UserAvatarUpdateFragment.this.getFileProviderFile();
            Bitmap bitmap = this.mBitmap;
            if (bitmap != null) {
                try {
                    BitmapFactory.saveToFile(bitmap, fileProviderFile.getAbsolutePath());
                    bitmapDecodeFile = this.mBitmap;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    bitmapDecodeFile = null;
                }
            } else {
                bitmapDecodeFile = android.graphics.BitmapFactory.decodeFile(fileProviderFile.getPath());
            }
            if (bitmapDecodeFile == null) {
                UserAvatarUpdateFragment.this.deleteFile(fileProviderFile);
                return null;
            }
            ?? r6 = XiaomiAccountManager.get(this.mContext);
            XMPassportInfo xMPassportInfoBuild = XMPassportInfo.build(UserAvatarUpdateFragment.this.getActivity(), "passportapi");
            int i = 0;
            int i2 = -1;
            Bitmap bitmapCreatePhoto = null;
            while (i < 2) {
                try {
                    try {
                        r6.setUserData(xiaomiAccount, Constants.ACCOUNT_AVATAR_URL, XMPassport.uploadXiaomiUserIcon(xMPassportInfoBuild, bitmapDecodeFile));
                        bitmapCreatePhoto = BitmapFactory.createPhoto(UserAvatarUpdateFragment.this.getActivity(), bitmapDecodeFile, UserAvatarUpdateFragment.this.getActivity().getResources().getDimensionPixelSize(R.dimen.passport_head_icon_size));
                        fileInputStream = new FileInputStream(fileProviderFile);
                        try {
                            r2 = "xiaomi_user_avatar_" + xiaomiAccount.name;
                            BitmapUtils.saveAsFile(UserAvatarUpdateFragment.this.getActivity(), fileInputStream, r2);
                            r6.setUserData(xiaomiAccount, Constants.ACCOUNT_AVATAR_FILE_NAME, r2);
                            try {
                                fileInputStream.close();
                                r2 = r2;
                            } catch (IOException e3) {
                                e = e3;
                                AccountLogger.log(UserAvatarUpdateFragment.TAG, "fileInputStream", e);
                                r2 = r2;
                            }
                        } catch (InvalidParameterException e4) {
                            e = e4;
                            r2 = fileInputStream;
                            AccountLogger.log(UserAvatarUpdateFragment.TAG, "uploadInfoToServer error", e);
                            i2 = R.string.passport_account_invalid_user_avatar;
                            r2 = r2;
                            if (r2 != 0) {
                                try {
                                    r2.close();
                                    r2 = r2;
                                } catch (IOException e5) {
                                    e = e5;
                                    AccountLogger.log(UserAvatarUpdateFragment.TAG, "fileInputStream", e);
                                    r2 = r2;
                                }
                            }
                        } catch (AccessDeniedException e6) {
                            e = e6;
                            r2 = fileInputStream;
                            AccountLogger.log(UserAvatarUpdateFragment.TAG, "uploadInfoToServer error", e);
                            i2 = R.string.passport_access_denied;
                            r2 = r2;
                            if (r2 != 0) {
                                try {
                                    r2.close();
                                    r2 = r2;
                                } catch (IOException e7) {
                                    e = e7;
                                    AccountLogger.log(UserAvatarUpdateFragment.TAG, "fileInputStream", e);
                                    r2 = r2;
                                }
                            }
                        } catch (AuthenticationFailureException e8) {
                            e = e8;
                            try {
                                AccountLogger.log(UserAvatarUpdateFragment.TAG, "uploadInfoToServer error", e);
                                xMPassportInfoBuild.refreshAuthToken(UserAvatarUpdateFragment.this.getActivity());
                                i2 = R.string.passport_bad_authentication;
                                if (fileInputStream != 0) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e9) {
                                        AccountLogger.log(UserAvatarUpdateFragment.TAG, "fileInputStream", e9);
                                    }
                                }
                                UserAvatarUpdateFragment.this.deleteFile(fileProviderFile);
                                bitmapDecodeFile.recycle();
                                i++;
                                r2 = fileInputStream;
                            } catch (Throwable th) {
                                th = th;
                                r2 = fileInputStream;
                                if (r2 != 0) {
                                    try {
                                        r2.close();
                                    } catch (IOException e10) {
                                        AccountLogger.log(UserAvatarUpdateFragment.TAG, "fileInputStream", e10);
                                    }
                                }
                                UserAvatarUpdateFragment.this.deleteFile(fileProviderFile);
                                bitmapDecodeFile.recycle();
                                throw th;
                            }
                        } catch (CipherException e11) {
                            e = e11;
                            r2 = fileInputStream;
                            AccountLogger.log(UserAvatarUpdateFragment.TAG, "uploadInfoToServer error", e);
                            i2 = R.string.passport_error_server;
                            r2 = r2;
                            if (r2 != 0) {
                                try {
                                    r2.close();
                                    r2 = r2;
                                } catch (IOException e12) {
                                    e = e12;
                                    AccountLogger.log(UserAvatarUpdateFragment.TAG, "fileInputStream", e);
                                    r2 = r2;
                                }
                            }
                        } catch (InvalidResponseException e13) {
                            e = e13;
                            r2 = fileInputStream;
                            AccountLogger.log(UserAvatarUpdateFragment.TAG, "uploadInfoToServer error", e);
                            i2 = R.string.passport_error_server;
                            r2 = r2;
                            if (r2 != 0) {
                                try {
                                    r2.close();
                                    r2 = r2;
                                } catch (IOException e14) {
                                    e = e14;
                                    AccountLogger.log(UserAvatarUpdateFragment.TAG, "fileInputStream", e);
                                    r2 = r2;
                                }
                            }
                        } catch (IOException e15) {
                            e = e15;
                            r2 = fileInputStream;
                            AccountLogger.log(UserAvatarUpdateFragment.TAG, "uploadInfoToServer error", e);
                            i2 = R.string.passport_error_network;
                            r2 = r2;
                            if (r2 != 0) {
                                try {
                                    r2.close();
                                    r2 = r2;
                                } catch (IOException e16) {
                                    e = e16;
                                    AccountLogger.log(UserAvatarUpdateFragment.TAG, "fileInputStream", e);
                                    r2 = r2;
                                }
                            }
                        }
                    } catch (InvalidParameterException e17) {
                        e = e17;
                    } catch (AccessDeniedException e18) {
                        e = e18;
                    } catch (AuthenticationFailureException e19) {
                        fileInputStream = r2;
                        e = e19;
                    } catch (CipherException e20) {
                        e = e20;
                    } catch (InvalidResponseException e21) {
                        e = e21;
                    } catch (IOException e22) {
                        e = e22;
                    }
                    UserAvatarUpdateFragment.this.deleteFile(fileProviderFile);
                    bitmapDecodeFile.recycle();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return UserAvatarUpdateFragment.this.new UploadAvatarTaskResult(i2, bitmapCreatePhoto);
        }

        @Override // android.os.AsyncTask
        public void onCancelled(UploadAvatarTaskResult uploadAvatarTaskResult) {
            Bitmap bitmap;
            if (uploadAvatarTaskResult != null && (bitmap = uploadAvatarTaskResult.bitmap) != null) {
                bitmap.recycle();
            }
            super.onCancelled(uploadAvatarTaskResult);
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(UploadAvatarTaskResult uploadAvatarTaskResult) {
            super.onPostExecute(uploadAvatarTaskResult);
            UserAvatarUpdateFragment.this.finishActivity();
            this.mLoginLoadingDialog.dismiss();
            if (uploadAvatarTaskResult != null && uploadAvatarTaskResult.bitmap == null) {
                int i = uploadAvatarTaskResult.errorMsgResId;
                if (i == -1) {
                    i = R.string.passport_error_unknown;
                }
                AccountToast.showToastMessage(this.mContext, i);
            }
        }
    }

    private static void addCropExtras(Intent intent, int i) {
        intent.putExtra("crop", "true");
        intent.putExtra("scale", true);
        intent.putExtra("scaleUpIfNeeded", true);
        if (OsHelper.isEmui() || OsHelper.isVivo()) {
            intent.putExtra("aspectX", 9998);
            intent.putExtra("aspectY", 9999);
        } else {
            intent.putExtra("aspectX", 1);
            intent.putExtra("aspectY", 1);
        }
        if (OsHelper.isEmui() || OsHelper.isOppo() || OsHelper.isVivo()) {
            intent.putExtra("outputX", 200);
            intent.putExtra("outputY", 200);
        } else {
            intent.putExtra("outputX", i);
            intent.putExtra("outputY", i);
        }
        intent.putExtra("return-data", true);
    }

    private boolean canShowPermissionPrompt(int[] iArr) {
        for (int i : iArr) {
            try {
                getString(i);
            } catch (Resources.NotFoundException unused) {
                return false;
            }
        }
        return true;
    }

    private void checkAgreementAndStartPickPhoto() {
        if (ni4.a(getActivity(), getPermission()) == 0) {
            startPickPhotoFromGallery();
            return;
        }
        PassportDialog passportDialog = new PassportDialog(getActivity());
        passportDialog.setTitle(getString(R.string.passport_request_permission_title)).setMessage(getString(R.string.passport_request_gallery_permission_message)).setPositiveButton(getString(R.string.passport_request_agree), new View.OnClickListener() { // from class: com.xiaomi.passport.ui.page.UserAvatarUpdateFragment.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UserAvatarUpdateFragment userAvatarUpdateFragment = UserAvatarUpdateFragment.this;
                userAvatarUpdateFragment.requestPermissions(new String[]{userAvatarUpdateFragment.getPermission()}, 200);
            }
        }).setNegativeButton(getString(R.string.passport_request_cancel), new View.OnClickListener() { // from class: com.xiaomi.passport.ui.page.UserAvatarUpdateFragment.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UserAvatarUpdateFragment.this.finishActivity();
            }
        });
        passportDialog.setCancelable(false);
        passportDialog.show();
    }

    private void checkCameraPermissionAndTakePhoto() {
        final Activity activity = getActivity();
        if (ni4.a(activity, "android.permission.CAMERA") == 0) {
            startTakePhoto();
            return;
        }
        int[] iArr = {R.string.passport_request_camera_permission_message, R.string.passport_i_know, R.string.passport_open_settings};
        if (!canShowPermissionPrompt(iArr)) {
            startRequestCameraPermission();
            return;
        }
        PassportDialog passportDialog = new PassportDialog(getContext());
        passportDialog.setPositiveButton(getString(iArr[1]), null).setNegativeButton(getString(android.R.string.cancel), null).setMessage(getString(iArr[0]));
        if (PermissionRequestHistory.isPermissionPermanentlyDenied(activity, "android.permission.CAMERA")) {
            passportDialog.setNegativeButton(getString(iArr[2]), new View.OnClickListener() { // from class: com.xiaomi.passport.ui.page.UserAvatarUpdateFragment.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    PermissionUtils.openPermissionSetting(activity, 2000);
                }
            });
        }
        passportDialog.setCancelable(false);
        passportDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.xiaomi.passport.ui.page.UserAvatarUpdateFragment.3
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                UserAvatarUpdateFragment.this.startRequestCameraPermission();
            }
        });
        passportDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteFile(File file) {
        if (file != null && file.exists() && file.isFile()) {
            file.delete();
        }
    }

    private void doCropPhoto(Uri uri) {
        if (uri == null) {
            AccountLogger.log(TAG, "inputUri is null");
            return;
        }
        try {
            Intent intent = new Intent("com.android.camera.action.CROP");
            Uri fileProviderUri = getFileProviderUri();
            intent.setDataAndType(uri, "image/*");
            intent.putExtra("output", fileProviderUri);
            intent.addFlags(1);
            intent.putExtra("return-data", true);
            Activity activity = getActivity();
            Iterator<ResolveInfo> it = activity.getPackageManager().queryIntentActivities(intent, 0).iterator();
            while (it.hasNext()) {
                String str = it.next().activityInfo.packageName;
                activity.grantUriPermission(str, uri, 1);
                activity.grantUriPermission(str, fileProviderUri, 3);
            }
            intent.putExtra("tips", getString(R.string.passport_account_crop_user_avatar));
            addCropExtras(intent, getPhotoPickSize());
            startActivityForResult(intent, 1004);
        } catch (Exception e) {
            AccountLogger.log(TAG, "Cannot crop image", e);
            AccountToast.showToastMessage(getActivity(), R.string.passport_photo_picker_not_found, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishActivity() {
        getActivity().overridePendingTransition(0, 0);
        getActivity().finish();
    }

    private String getCurrentPackageAuthority() {
        return getActivity().getPackageName() + FILE_PROVIDER_AUTHORITY_SUFFIX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File getFileProviderFile() {
        if (this.mAvatarCachedFile == null) {
            this.mAvatarCachedFile = new File(getActivity().getCacheDir(), AVATAR_FILE_NAME);
        }
        return this.mAvatarCachedFile;
    }

    private Uri getFileProviderUri() {
        if (this.mFileProviderUri == null) {
            this.mFileProviderUri = FileProvider.getUriForFile(getActivity(), getCurrentPackageAuthority(), getFileProviderFile());
        }
        return this.mFileProviderUri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPermission() {
        return (Build.VERSION.SDK_INT < 33 || getActivity().getApplicationInfo().targetSdkVersion < 33) ? "android.permission.READ_EXTERNAL_STORAGE" : "android.permission.READ_MEDIA_IMAGES";
    }

    private int getPhotoPickSize() {
        return getResources().getDimensionPixelSize(R.dimen.passport_upload_user_avatar_size);
    }

    private void startPickPhotoFromGallery() {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        startActivityForResult(intent, 1003);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startRequestCameraPermission() {
        getActivity();
        requestPermissions(new String[]{"android.permission.CAMERA"}, 100);
    }

    private void startTakePhoto() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", getFileProviderUri());
        intent.addFlags(2);
        startActivityForResult(intent, 1002);
    }

    private void startUploadAvatar(Bitmap bitmap) {
        UploadUserAvatarTask uploadUserAvatarTask = this.mUploadAvatarTask;
        if (uploadUserAvatarTask != null) {
            uploadUserAvatarTask.cancel(true);
            this.mUploadAvatarTask = null;
        }
        UploadUserAvatarTask uploadUserAvatarTask2 = new UploadUserAvatarTask(getActivity(), bitmap);
        this.mUploadAvatarTask = uploadUserAvatarTask2;
        uploadUserAvatarTask2.executeOnExecutor(XiaomiPassportExecutor.getSingleton(), new Void[0]);
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (XiaomiAccountManager.get(getActivity()).getXiaomiAccount() == null) {
            AccountLogger.log(TAG, "no xiaomi account");
            finishActivity();
        }
        View viewFindViewById = getActivity().findViewById(android.R.id.content);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.passport.ui.page.UserAvatarUpdateFragment.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    UserAvatarUpdateFragment.this.finishActivity();
                }
            });
        }
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 1002:
            case 1003:
                if (i2 == -1) {
                    Uri data = intent != null ? intent.getData() : null;
                    if (data == null) {
                        data = getFileProviderUri();
                    }
                    doCropPhoto(data);
                    return;
                }
                break;
            case 1004:
                if (intent != null && intent.getData() != null) {
                    try {
                        startUploadAvatar(MediaStore.Images.Media.getBitmap(getContext().getContentResolver(), intent.getData()));
                        return;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else if (i2 == -1) {
                    startUploadAvatar(null);
                    return;
                }
                break;
            default:
                return;
        }
        finishActivity();
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity().getPackageManager().hasSystemFeature("android.hardware.camera")) {
            AccountLogger.log(TAG, "has camera");
        } else {
            AccountLogger.log(TAG, "no camera");
        }
        this.mAccount = (Account) getArguments().getParcelable(UserAvatarUpdateActivity.EXTRA_UPDATE_ACCOUNT);
        String string = getArguments().getString(UserAvatarUpdateActivity.EXTRA_UPDATE_AVATAR_TYPE);
        if (UserAvatarUpdateActivity.CAMERA.equals(string)) {
            checkCameraPermissionAndTakePhoto();
        } else if (UserAvatarUpdateActivity.GALLERY.equals(string)) {
            checkAgreementAndStartPickPhoto();
        } else {
            finishActivity();
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        UploadUserAvatarTask uploadUserAvatarTask = this.mUploadAvatarTask;
        if (uploadUserAvatarTask != null) {
            uploadUserAvatarTask.cancel(true);
            this.mUploadAvatarTask = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 100) {
            PermissionRequestHistory.setPermissionRequested(getActivity(), "android.permission.CAMERA");
            if (iArr.length <= 0 || iArr[0] != 0) {
                finishActivity();
                return;
            } else {
                startTakePhoto();
                return;
            }
        }
        if (i == 200) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                finishActivity();
            } else {
                startPickPhotoFromGallery();
            }
        }
    }
}
