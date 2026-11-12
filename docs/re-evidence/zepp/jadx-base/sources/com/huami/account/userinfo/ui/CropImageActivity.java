package com.huami.account.userinfo.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.FragmentActivity;
import com.huami.account.UserInfoLegalCallBack;
import com.huami.account.UserInfoLegalCheckManager;
import com.huami.account.userinfo.R;
import com.huami.account.userinfo.ui.baseui.ClipImageLayout;
import com.huami.account.userinfo.utils.Utils;
import com.huami.devicerecorder.UriGetter;
import com.huami.lib.view.dim.DimPanelBottomBar;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class CropImageActivity extends BaseTitleActivity implements View.OnClickListener {
    public static final String CROPPED_FILE_PATH = "CROPPED_FILE_PATH";
    private static final int F = 600;
    public static final String KEY_DATA = "data";
    public static final String REQ_FROM = "req_from";
    public static final int REQ_SELECT_IMAGE = 18;
    public static final int REQ_TAKE_PHOTO = 19;
    public static final String REQ_TYPE = "req_type";
    public static final String REQ_WITH_LEGAL_CHECK = "withLegalCheck";
    public static final int RESULT_OPEN_SELECT = 20;
    private View A;
    private View B;
    public String C;
    private SelectImageFragment.From D = SelectImageFragment.From.FROM_AVATAR;
    private ClipImageLayout x;
    private Bitmap y;
    private DimPanelBottomBar z;
    private static final String E = CropImageActivity.class.getSimpleName();
    public static String FILE_PROVIDER_AUTH = "com.huami.watch.companion.fileprovider";

    public class a extends HMLoadTarget<Bitmap> {
        public a() {
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFailed(Exception exc) {
            HMLog.d(CropImageActivity.E, "Exception = " + exc.getMessage(), new Object[0]);
            Utils.INSTANCE.toast(CropImageActivity.this, R.string.user_info_get_image_file_fail, 1);
            CropImageActivity.this.setResult(0);
            CropImageActivity.this.finish();
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Bitmap bitmap) {
            CropImageActivity.this.x.setimage(bitmap);
        }
    }

    public class b extends HMLoadTarget<Bitmap> {
        public b() {
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFailed(Exception exc) {
            HMLog.d(CropImageActivity.E, "Exception = " + exc.getMessage(), new Object[0]);
            Utils.INSTANCE.toast(CropImageActivity.this, R.string.user_info_get_image_file_fail, 1);
            CropImageActivity.this.setResult(0);
            CropImageActivity.this.finish();
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Bitmap bitmap) {
            CropImageActivity.this.x.setimage(bitmap);
        }
    }

    public class c implements UserInfoLegalCallBack {
        public c() {
        }

        @Override // com.huami.account.UserInfoLegalCallBack
        public void onAudit() {
            CropImageActivity.this.r();
            CropImageActivity.this.finish();
        }

        @Override // com.huami.account.UserInfoLegalCallBack
        public void onError() {
            CropImageActivity.this.finish();
        }

        @Override // com.huami.account.UserInfoLegalCallBack
        public void onFailed() {
            CropImageActivity.this.setResult(20);
            CropImageActivity.this.finish();
        }

        @Override // com.huami.account.UserInfoLegalCallBack
        public void onSuccess() throws Throwable {
            CropImageActivity cropImageActivity = CropImageActivity.this;
            cropImageActivity.q(cropImageActivity.y);
            CropImageActivity.this.finish();
        }
    }

    private void initTitle() {
        BaseTitleActivity.STYLE style = BaseTitleActivity.STYLE.BACK_AND_TITLE;
        setStyle(style, getResources().getColor(R.color.pale_grey), true);
        if (!GlobalConfig.get().isBuildMidong()) {
            getTitleTextView().setText(R.string.user_info_move_and_capture);
            getTitleTextView().setTextColor(getResources().getColor(R.color.black70));
            return;
        }
        setStyle(style, getResources().getColor(R.color.s38), getString(R.string.user_info_move_and_capture), true);
        TextView titleTextView = getTitleTextView();
        int i = R.color.s1;
        titleTextView.setTextColor(ContextCompat.getColor(this, i));
        getTitleTextView().setTextSize(16.0f);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.ic_arrow_back_20_2x);
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(ContextCompat.getColor(this, i));
        }
        DrawableCompat.setTint(DrawableCompat.wrap(drawable), ContextCompat.getColor(this, i));
        getLeft().setImageDrawable(drawable);
        this.z.setStyle("dark");
        this.z.updateUI();
    }

    private void initView() {
        this.x.setUseBackgroundColor(false);
        this.A.setOnClickListener(this);
        this.B.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.graphics.Bitmap] */
    public void q(Bitmap bitmap) throws Throwable {
        String str = getFilesDir().getAbsolutePath() + File.separator + "bracelet_icon_" + System.currentTimeMillis() + ".jpg";
        ?? r1 = 0;
        FileOutputStream fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream3 = new FileOutputStream(str);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream3);
                        fileOutputStream3.close();
                        fileOutputStream3.close();
                    } catch (FileNotFoundException e) {
                        e = e;
                        fileOutputStream = fileOutputStream3;
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        Intent intent = new Intent();
                        r1 = "CROPPED_FILE_PATH";
                        intent.putExtra("CROPPED_FILE_PATH", str);
                        setResult(-1, intent);
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream2 = fileOutputStream3;
                        e.printStackTrace();
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        Intent intent2 = new Intent();
                        r1 = "CROPPED_FILE_PATH";
                        intent2.putExtra("CROPPED_FILE_PATH", str);
                        setResult(-1, intent2);
                    } catch (Throwable th) {
                        th = th;
                        r1 = fileOutputStream3;
                        if (r1 != 0) {
                            try {
                                r1.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (FileNotFoundException e4) {
                e = e4;
            } catch (IOException e5) {
                e = e5;
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        }
        Intent intent3 = new Intent();
        r1 = "CROPPED_FILE_PATH";
        intent3.putExtra("CROPPED_FILE_PATH", str);
        setResult(-1, intent3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        setResult(-1, new Intent());
    }

    private void s() {
        this.x = (ClipImageLayout) findViewById(R.id.CropImageView);
        this.A = findViewById(R.id.right_button);
        this.B = findViewById(R.id.left_button);
        this.z = (DimPanelBottomBar) findViewById(R.id.bottom_bar);
    }

    public static void startPageCropImageActivity(Activity activity, int i, SelectImageFragment.From from) {
        startPageCropImageActivity(activity, i, from, false);
    }

    private void t() {
        Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra("req_type", 0);
            if (intExtra == 18) {
                Intent intent2 = new Intent();
                intent2.setType(UriGetter.ShareContentType.IMAGE);
                intent2.setAction("android.intent.action.GET_CONTENT");
                startActivityForResult(intent2, 18);
                return;
            }
            if (intExtra != 19) {
                return;
            }
            Intent intent3 = new Intent("android.media.action.IMAGE_CAPTURE");
            if (!TextUtils.isEmpty(this.C)) {
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    Uri uriU = u();
                    intent.setDataAndType(uriU, "application/vnd.android.package-archive");
                    intent3.putExtra("output", uriU);
                } else {
                    intent3.putExtra("output", Uri.fromFile(new File(this.C)));
                }
            }
            startActivityForResult(intent3, 19);
        }
    }

    private Uri u() {
        return FileProvider.getUriForFile(this, getString(R.string.share_provider_file_authorities), new File(this.C));
    }

    private void updateUI() {
        HMLog.d(E, "path = " + this.C, new Object[0]);
        HMImageLoader.with((FragmentActivity) this).load(Uri.fromFile(new File(this.C))).asBitmap().override(600).into(new a());
    }

    private void v() {
        StringBuilder sb = new StringBuilder();
        sb.append(Utils.INSTANCE.getStoragePath(this));
        String str = File.separator;
        sb.append(str);
        sb.append("TEMP_PHOTO");
        sb.append(str);
        String string = sb.toString();
        File file = new File(string);
        x(file);
        if (file.mkdirs()) {
            this.C = string + System.currentTimeMillis() + ".jpg";
        }
    }

    private boolean w() {
        Intent intent = getIntent();
        return intent != null && intent.getBooleanExtra("withLegalCheck", false);
    }

    private boolean x(File file) {
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return file.delete();
        }
        for (File file2 : fileArrListFiles) {
            x(file2);
        }
        return file.delete();
    }

    private void y(String str) {
        HMLog.d(E, "path = " + str, new Object[0]);
        HMImageLoader.with((FragmentActivity) this).load(str).asBitmap().override(600).into(new b());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        Bundle extras;
        Bitmap bitmap;
        super.onActivityResult(i, i2, intent);
        if (i == 18) {
            if (intent == null || TextUtils.isEmpty(intent.getDataString())) {
                finish();
                return;
            } else {
                y(intent.getDataString());
                return;
            }
        }
        if (i == 19) {
            if (!TextUtils.isEmpty(this.C) && new File(this.C).exists()) {
                updateUI();
                return;
            }
            if (intent != null && intent.getExtras() != null && (extras = intent.getExtras()) != null && (bitmap = (Bitmap) extras.get("data")) != null) {
                q(bitmap);
            }
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        int id = view.getId();
        if (id == R.id.left_button) {
            setResult(0);
            finish();
            return;
        }
        if (id == R.id.right_button) {
            Bitmap bitmapClip = this.x.clip();
            this.y = bitmapClip;
            if (bitmapClip == null) {
                Utils.INSTANCE.toast(this, R.string.user_info_get_image_file_fail, 1);
                setResult(0);
                finish();
            } else if (w()) {
                UserInfoLegalCheckManager.checkAvatarLegal(this, this.y, new c());
            } else {
                q(this.y);
                finish();
            }
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.user_info_activity_crop_image);
        this.D = (SelectImageFragment.From) getIntent().getSerializableExtra("req_from");
        v();
        try {
            t();
        } catch (Exception unused) {
        }
        s();
        initTitle();
        initView();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Bitmap bitmap = this.y;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    public static void startPageCropImageActivity(Activity activity, int i, SelectImageFragment.From from, boolean z) {
        if (activity == null) {
            return;
        }
        if (i == 19) {
            Analytics.event(activity, "UploadPictureType", "TakingPictures");
        } else if (i == 18) {
            Analytics.event(activity, "UploadPictureType", "PhotoAlbum");
        }
        Intent intent = new Intent(activity, (Class<?>) CropImageActivity.class);
        intent.putExtra("req_type", i);
        intent.putExtra("req_from", from);
        intent.putExtra("withLegalCheck", z);
        activity.startActivityForResult(intent, 18);
    }
}
