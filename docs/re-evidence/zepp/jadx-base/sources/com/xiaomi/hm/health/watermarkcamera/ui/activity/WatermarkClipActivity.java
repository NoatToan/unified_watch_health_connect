package com.xiaomi.hm.health.watermarkcamera.ui.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.huami.view.basetitle.BaseFragmentActivity;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.watermarkcamera.R;
import com.xiaomi.hm.health.watermarkcamera.ui.fragment.WatermarkClipImageFragment;
import com.xiaomi.hm.health.watermarkcamera.utils.BitmapUtils;
import com.xiaomi.hm.health.watermarkcamera.utils.WatermarkFileUtils;

/* JADX INFO: loaded from: classes22.dex */
public class WatermarkClipActivity extends BaseFragmentActivity implements View.OnClickListener {
    public static final String EXTRA_SELECT_IMG = "selectImg";
    public static final int REQ_CROP_CODE = 102;
    private static final String b = "watermark_clip_";
    private static Bitmap c;
    private WatermarkClipImageFragment a = null;

    private String c(Bitmap bitmap) throws Throwable {
        String path = WatermarkFileUtils.getCachePath(this, b + System.currentTimeMillis() + ".jpg").getPath();
        boolean zSaveBitmapToFileWithOptimizeCompress = BitmapUtils.saveBitmapToFileWithOptimizeCompress(path, bitmap);
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (!zSaveBitmapToFileWithOptimizeCompress) {
            CustomToast.makeText(this, R.string.running_share_img_failed_to_create, 0);
        }
        return path;
    }

    public static void startByResult(WatermarkActivity watermarkActivity, String str, int i, int i2) {
        watermarkActivity.startActivityForResult(new Intent(watermarkActivity, (Class<?>) WatermarkClipActivity.class).putExtra(WatermarkClipImageFragment.EXTRA_PATH_NAME, str).putExtra(WatermarkClipImageFragment.SHARE_AREA_WIDTH, i).putExtra(WatermarkClipImageFragment.SHARE_AREA_HEIGHT, i2), 102);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.clip_cancel) {
            Intent intent = new Intent();
            intent.putExtra(EXTRA_SELECT_IMG, true);
            setResult(0, intent);
            finish();
            return;
        }
        if (id == R.id.clip_confirm) {
            Bitmap cropImage = this.a.getCropImage();
            c = cropImage;
            WatermarkShareActivity.start(this, c(cropImage));
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getWindow().addFlags(1024);
        super.onCreate(bundle);
        setContentView(R.layout.activity_watermark_clip);
        findViewById(R.id.clip_cancel).setOnClickListener(this);
        findViewById(R.id.clip_confirm).setOnClickListener(this);
        int i = R.id.fragment_container;
        if (findViewById(i) == null || bundle != null) {
            return;
        }
        WatermarkClipImageFragment watermarkClipImageFragment = new WatermarkClipImageFragment();
        this.a = watermarkClipImageFragment;
        watermarkClipImageFragment.setArguments(getIntent().getExtras());
        getFragmentManager().beginTransaction().add(i, this.a).commit();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c = null;
    }
}
