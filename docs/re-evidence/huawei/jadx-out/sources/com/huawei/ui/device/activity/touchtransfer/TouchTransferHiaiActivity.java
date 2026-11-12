package com.huawei.ui.device.activity.touchtransfer;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.device.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes43.dex */
public class TouchTransferHiaiActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f24775b;
    private AnimationDrawable d;
    private ImageView e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f24774a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SmartClipManager.SmartLoadPluginCallback f24776c = new SmartClipManager.SmartLoadPluginCallback() { // from class: com.huawei.ui.device.activity.touchtransfer.TouchTransferHiaiActivity.1
        @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager.SmartLoadPluginCallback
        public void onLoadPluginResult(int i) {
            LogUtil.a("TouchTransferHiaiActivity", "loadPluginCallback:", Integer.valueOf(i));
            if (TouchTransferHiaiActivity.this.d != null) {
                TouchTransferHiaiActivity.this.d.stop();
                TouchTransferHiaiActivity.this.d = null;
            }
            if (TouchTransferHiaiActivity.this.e != null) {
                TouchTransferHiaiActivity.this.e = null;
            }
            if (TouchTransferHiaiActivity.this.f24774a != null) {
                Message messageObtainMessage = TouchTransferHiaiActivity.this.f24774a.obtainMessage();
                messageObtainMessage.what = 1000;
                TouchTransferHiaiActivity.this.f24774a.sendMessageDelayed(messageObtainMessage, 500L);
            }
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager.SmartLoadPluginCallback
        public void onLoadPluginProgress(int i) {
            LogUtil.a("TouchTransferHiaiActivity", "loadPluginProgress:", Integer.valueOf(i));
        }
    };

    static class e extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<TouchTransferHiaiActivity> f24778b;

        e(TouchTransferHiaiActivity touchTransferHiaiActivity, Looper looper) {
            super(looper);
            this.f24778b = new WeakReference<>(touchTransferHiaiActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            TouchTransferHiaiActivity touchTransferHiaiActivity = this.f24778b.get();
            if (touchTransferHiaiActivity == null) {
                return;
            }
            if (message.what == 1000) {
                touchTransferHiaiActivity.finish();
            } else {
                LogUtil.j("TouchTransferHiaiActivity", "Handler default");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_touch_transfer_selector);
        this.f24775b = this;
        a();
        LogUtil.a("TouchTransferHiaiActivity", "startLoadSmartPlugin");
        this.f24774a = new e(this, BaseApplication.getContext().getMainLooper());
        SmartClipManager.e(BaseApplication.getContext()).e(this.f24776c);
    }

    private void a() {
        this.e = (ImageView) findViewById(R.id.touch_album_image);
        WindowManager windowManager = (WindowManager) this.f24775b.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (windowManager != null) {
            int width = windowManager.getDefaultDisplay().getWidth();
            ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = width;
            this.e.setLayoutParams(layoutParams);
            this.e.setImageResource(R.drawable.touch_transfer_guide_animation);
            if (this.e.getDrawable() instanceof AnimationDrawable) {
                this.d = (AnimationDrawable) this.e.getDrawable();
            }
            this.d.start();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AnimationDrawable animationDrawable = this.d;
        if (animationDrawable != null) {
            animationDrawable.stop();
            this.d = null;
        }
        if (this.e != null) {
            this.e = null;
        }
        e eVar = this.f24774a;
        if (eVar != null) {
            eVar.removeCallbacksAndMessages(null);
            this.f24774a = null;
        }
        LogUtil.a("TouchTransferHiaiActivity", "onDestroy()");
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
