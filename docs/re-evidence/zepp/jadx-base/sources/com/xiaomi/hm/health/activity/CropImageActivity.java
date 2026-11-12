package com.xiaomi.hm.health.activity;

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
import com.huami.devicerecorder.UriGetter;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.lib.view.dim.DimPanelBottomBar;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.util.StorageUtil;
import com.xiaomi.hm.health.baseui.clip.ClipImageLayout;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.fragment.SelectImageFragment;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes19.dex */
public class CropImageActivity extends BaseTitleActivity implements View.OnClickListener {
    public static final String CROPPED_FILE_PATH = "CROPPED_FILE_PATH";
    private static final String F = CropImageActivity.class.getSimpleName();
    private static final int G = 600;
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
    private final Lazy<DeviceUtilsApi> D = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private SelectImageFragment.From E = SelectImageFragment.From.FROM_AVATAR;
    private ClipImageLayout x;
    private Bitmap y;
    private DimPanelBottomBar z;

    public class a extends HMLoadTarget<Bitmap> {
        public a() {
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFailed(Exception exc) {
            HMLog.d(CropImageActivity.F, "Exception = " + exc.getMessage(), new Object[0]);
            ((DeviceUtilsApi) CropImageActivity.this.D.getValue()).toast(CropImageActivity.this, R.string.get_image_file_fail, 1);
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
            HMLog.d(CropImageActivity.F, "Exception = " + exc.getMessage(), new Object[0]);
            ((DeviceUtilsApi) CropImageActivity.this.D.getValue()).toast(CropImageActivity.this, R.string.get_image_file_fail, 1);
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
            CropImageActivity.this.s();
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
            cropImageActivity.r(cropImageActivity.y);
            CropImageActivity.this.finish();
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SelectImageFragment.From.values().length];
            a = iArr;
            try {
                iArr[SelectImageFragment.From.FROM_AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[SelectImageFragment.From.FROM_DIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void initTitle() {
        BaseTitleActivity.STYLE style = BaseTitleActivity.STYLE.BACK_AND_TITLE;
        setStyle(style, getResources().getColor(R.color.pale_grey), true);
        if (!GlobalConfig.get().isBuildMidong()) {
            getTitleTextView().setText(R.string.move_and_capture);
            getTitleTextView().setTextColor(getResources().getColor(R.color.black70));
            return;
        }
        setStyle(style, getResources().getColor(R.color.s38), getString(R.string.move_and_capture), true);
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
    public void r(Bitmap bitmap) throws Throwable {
        String string;
        int i = d.a[this.E.ordinal()];
        FileOutputStream fileOutputStream = null;
        if (i == 1) {
            string = getFilesDir().getAbsolutePath() + File.separator + "bracelet_icon_" + System.currentTimeMillis() + ".jpg";
        } else if (i != 2) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(FileUtils.getAppFileDir(DeviceXFunctionsKt.getContext()));
            String str = File.separator;
            sb.append(str);
            sb.append("dial_bg");
            sb.append(str);
            sb.append(System.currentTimeMillis());
            sb.append(".jpg");
            string = sb.toString();
            File file = new File(string);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
        }
        try {
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(string);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                        fileOutputStream2.close();
                        fileOutputStream2.close();
                    } catch (FileNotFoundException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        Intent intent = new Intent();
                        intent.putExtra("CROPPED_FILE_PATH", string);
                        setResult(-1, intent);
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        Intent intent2 = new Intent();
                        intent2.putExtra("CROPPED_FILE_PATH", string);
                        setResult(-1, intent2);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e5) {
            e = e5;
        } catch (IOException e6) {
            e = e6;
        }
        Intent intent3 = new Intent();
        intent3.putExtra("CROPPED_FILE_PATH", string);
        setResult(-1, intent3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        setResult(-1, new Intent());
    }

    public static void startPageCropImageActivity(Activity activity, int i, SelectImageFragment.From from) {
        startPageCropImageActivity(activity, i, from, false);
    }

    private void t() {
        this.x = (ClipImageLayout) findViewById(R.id.CropImageView);
        this.A = findViewById(R.id.right_button);
        this.B = findViewById(R.id.left_button);
        this.z = (DimPanelBottomBar) findViewById(R.id.bottom_bar);
    }

    private void u() {
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
                    Uri uriV = v();
                    intent.setDataAndType(uriV, "application/vnd.android.package-archive");
                    intent3.putExtra("output", uriV);
                } else {
                    intent3.putExtra("output", Uri.fromFile(new File(this.C)));
                }
            }
            startActivityForResult(intent3, 19);
        }
    }

    private void updateUI() {
        HMLog.d(F, "path = " + this.C, new Object[0]);
        HMImageLoader.with((FragmentActivity) this).load(Uri.fromFile(new File(this.C))).asBitmap().override(600).into(new a());
    }

    private Uri v() {
        return DeviceXFunctionsKt.getFlavorService().findFlavor().getId() != 2 ? FileProvider.getUriForFile(this, StorageUtil.FILE_PROVIDER_AUTH, new File(this.C)) : FileProvider.getUriForFile(this, "com.xiaomi.hm.health.selfupdate.fileprovider", new File(this.C));
    }

    private void w() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.D.getValue().getStoragePath());
        String str = File.separator;
        sb.append(str);
        sb.append("TEMP_PHOTO");
        sb.append(str);
        String string = sb.toString();
        File file = new File(string);
        y(file);
        if (file.mkdirs()) {
            this.C = string + System.currentTimeMillis() + ".jpg";
        }
    }

    private boolean x() {
        Intent intent = getIntent();
        return intent != null && intent.getBooleanExtra("withLegalCheck", false);
    }

    private boolean y(File file) {
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
            y(file2);
        }
        return file.delete();
    }

    private void z(String str) {
        HMLog.d(F, "path = " + str, new Object[0]);
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
                z(intent.getDataString());
                return;
            }
        }
        if (i == 19) {
            if (!TextUtils.isEmpty(this.C) && new File(this.C).exists()) {
                updateUI();
                return;
            }
            if (intent != null && intent.getExtras() != null && (extras = intent.getExtras()) != null && (bitmap = (Bitmap) extras.get("data")) != null) {
                r(bitmap);
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
                this.D.getValue().toast(this, R.string.get_image_file_fail, 1);
                setResult(0);
                finish();
            } else if (x()) {
                UserInfoLegalCheckManager.checkAvatarLegal(this, this.y, new c());
            } else {
                r(this.y);
                finish();
            }
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.crop_image_activity);
        this.E = (SelectImageFragment.From) getIntent().getSerializableExtra("req_from");
        w();
        try {
            u();
        } catch (Exception unused) {
        }
        t();
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
