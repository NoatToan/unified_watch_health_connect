package com.huami.assistant.ui.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.baidu.ocr.sdk.OCR;
import com.baidu.ocr.sdk.OnResultListener;
import com.baidu.ocr.sdk.exception.OCRError;
import com.baidu.ocr.sdk.model.AccessToken;
import com.huami.assistant.R;
import com.huami.assistant.ocr.camera.CameraActivity;
import com.huami.devicerecorder.UriGetter;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.ui.BaseActivity;
import com.huami.watch.util.AndroidPermissions;
import com.huami.watch.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class OcrTipActivity extends BaseActivity {
    public static final int ACTION_OCR = 0;
    public static final int ACTION_OCR_TRAIN = 1;
    public static final String ARGS_ACTION = "action";
    private static final String f = "Assistant-OCR-TipActivity";
    private static final int g = 1;
    private static final int h = 2;
    private static final int i = 3;
    private long b;
    private String c;
    private b d;
    private int e;

    public class a implements OnResultListener<AccessToken> {
        public final /* synthetic */ boolean a;

        public a(final boolean val$isPick) {
            this.a = val$isPick;
        }

        @Override // com.baidu.ocr.sdk.OnResultListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(AccessToken accessToken) {
            OcrTipActivity.this.b = accessToken.getExpiresTime();
            if (this.a) {
                OcrTipActivity.this.k();
            } else {
                OcrTipActivity.this.j(null);
            }
        }

        @Override // com.baidu.ocr.sdk.OnResultListener
        public void onError(OCRError error) {
            Log.e(OcrTipActivity.f, error.getMessage(), error.getCause(), new Object[0]);
            Toast.makeText(OcrTipActivity.this, R.string.ocr_init_token_fail, 0).show();
        }
    }

    public enum b {
        OCR(R.string.ocr, R.drawable.bg_ocr_tip, R.string.ocr_tip_smart),
        OCR_TRAIN(R.string.ocr_train, R.drawable.bg_ocr_train_tip, R.string.ocr_tip_train);

        public int msgRes;
        public int picRes;
        public int titleRes;

        b(@StringRes int titleRes, int picRes, int msgRes) {
            this.titleRes = titleRes;
            this.picRes = picRes;
            this.msgRes = msgRes;
        }
    }

    private void g(boolean isPick) {
        OCR.getInstance(this).initAccessToken(new a(isPick), "aip.license", getApplicationContext());
    }

    private void h() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.action_bar);
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: ni5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.i(view);
            }
        });
        actionbarLayout.setTitleText(getString(this.d.titleRes));
        ((ImageView) findViewById(R.id.img)).setImageResource(this.d.picRes);
        ((TextView) findViewById(R.id.tips)).setText(this.d.msgRes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        onBackPressed();
    }

    private void init() {
        this.c = new File(getFilesDir(), "pic.jpg").getAbsolutePath();
        int intExtra = getIntent().getIntExtra("action", 0);
        this.e = intExtra;
        this.d = intExtra == 0 ? b.OCR : b.OCR_TRAIN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Uri uri) {
        Intent intent = new Intent(this, (Class<?>) CameraActivity.class);
        intent.putExtra(CameraActivity.KEY_OUTPUT_FILE_PATH, this.c);
        intent.putExtra(CameraActivity.KEY_CONTENT_TYPE, CameraActivity.CONTENT_TYPE_GENERAL);
        if (uri != null) {
            intent.putExtra(CameraActivity.KEY_SELECT_IMG_PATH, uri);
        }
        startActivityForResult(intent, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (!AndroidPermissions.checkGranted(this, "android.permission.READ_EXTERNAL_STORAGE")) {
            AndroidPermissions.request(this, "android.permission.READ_EXTERNAL_STORAGE");
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType(UriGetter.ShareContentType.IMAGE);
        startActivityForResult(intent, 3);
    }

    private void l() {
        Intent intent = new Intent(this, (Class<?>) OcrActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("path", this.c);
        intent.putExtras(bundle);
        startActivityForResult(intent, 2);
    }

    private void m() {
        Intent intent = new Intent(this, (Class<?>) OcrTrainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("path", this.c);
        intent.putExtras(bundle);
        startActivityForResult(intent, 2);
    }

    public void capture(View view) {
        if (this.b - System.currentTimeMillis() >= 300000) {
            j(null);
        } else {
            g(false);
        }
    }

    public void gallery(View view) {
        if (this.b - System.currentTimeMillis() >= 300000) {
            k();
        } else {
            g(true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == -1) {
            if (this.e == 0) {
                l();
            } else {
                m();
            }
        }
        if (requestCode == 3 && resultCode == -1) {
            j(data.getData());
        }
        if (requestCode == 2 && resultCode == -1) {
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocr_tip);
        init();
        h();
    }
}
