package com.sina.weibo.sdk.share;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.huami.chart.template.ColorTemplate;
import com.sina.weibo.sdk.api.WeiboMultiMessage;

/* JADX INFO: loaded from: classes18.dex */
public class ShareTransActivity extends BaseActivity {
    private Intent t;
    private FrameLayout u;
    private d v;
    private String w;
    private Handler x = new Handler(Looper.getMainLooper()) { // from class: com.sina.weibo.sdk.share.ShareTransActivity.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                Object obj = message.obj;
                if (obj instanceof Intent) {
                    ShareTransActivity.this.b((Intent) obj);
                    return;
                }
            }
            ShareTransActivity.this.m();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        FrameLayout frameLayout = this.u;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
        }
        Handler handler = this.x;
        if (handler != null) {
            handler.removeMessages(0);
            this.x = null;
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putInt("_weibo_resp_errcode", 2);
        bundle.putString("_weibo_resp_errstr", str);
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        FrameLayout frameLayout = this.u;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        Handler handler = this.x;
        if (handler != null) {
            handler.removeMessages(0);
            this.x = null;
        }
        try {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putInt("_weibo_resp_errcode", 1);
            intent.putExtras(bundle);
            setResult(-1, intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        com.sina.weibo.sdk.b.c.a("WBShareTag", "onActivityResult. Means share result coming!");
        Handler handler = this.x;
        if (handler != null) {
            if (i2 != -1) {
                handler.sendEmptyMessageDelayed(0, 100L);
                return;
            }
            Message messageObtain = Message.obtain(handler, 1);
            messageObtain.obj = intent;
            this.x.sendMessageDelayed(messageObtain, 100L);
        }
    }

    @Override // com.sina.weibo.sdk.share.BaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.sina.weibo.sdk.b.c.a("WBShareTag", "start share activity.");
        Intent intent = getIntent();
        this.t = intent;
        if (intent == null) {
            finish();
            return;
        }
        if (intent.getIntExtra("start_flag", -1) != 1001) {
            finish();
            return;
        }
        this.u = new FrameLayout(this);
        int intExtra = getIntent().getIntExtra("progress_id", -1);
        View viewInflate = intExtra != -1 ? ((LayoutInflater) getSystemService("layout_inflater")).inflate(intExtra, (ViewGroup) null) : new ProgressBar(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.u.addView(viewInflate, layoutParams);
        this.u.setBackgroundColor(ColorTemplate.INTERACTIVE_LINE_DEFAULT_COLOR);
        setContentView(this.u);
        com.sina.weibo.sdk.b.c.a("WBShareTag", "prepare wb resource.");
        Bundle extras = this.t.getExtras();
        if (extras == null) {
            finish();
            return;
        }
        WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
        weiboMultiMessage.readFromBundle(extras);
        if (weiboMultiMessage.multiImageObject == null && weiboMultiMessage.videoSourceObject == null) {
            a(weiboMultiMessage);
            return;
        }
        d dVar = this.v;
        if (dVar != null) {
            dVar.cancel(true);
        }
        d dVar2 = new d(this, new b() { // from class: com.sina.weibo.sdk.share.ShareTransActivity.2
            @Override // com.sina.weibo.sdk.share.b
            public final void a(c cVar) {
                ShareTransActivity.this.u.setVisibility(4);
                if (cVar == null) {
                    ShareTransActivity.this.d("Trans result is null.");
                    return;
                }
                if (cVar.z) {
                    ShareTransActivity.this.a(cVar.A);
                } else if (TextUtils.isEmpty(cVar.errorMessage)) {
                    ShareTransActivity.this.d("Trans resource fail.");
                } else {
                    ShareTransActivity.this.d(cVar.errorMessage);
                }
            }
        });
        this.v = dVar2;
        dVar2.execute(weiboMultiMessage);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        com.sina.weibo.sdk.b.c.a("WBShareTag", "start share activity again. Means share result coming!");
        int intExtra = intent.getIntExtra("start_flag", -1);
        if (intExtra == 1001) {
            return;
        }
        if (intExtra == 1002) {
            b(intent);
        } else {
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Intent intent) {
        FrameLayout frameLayout = this.u;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
        }
        Handler handler = this.x;
        if (handler != null) {
            handler.removeMessages(0);
            this.x = null;
        }
        if (!a(intent)) {
            m();
        } else {
            setResult(-1, intent);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WeiboMultiMessage weiboMultiMessage) {
        com.sina.weibo.sdk.b.c.a("WBShareTag", "start wb composer");
        try {
            this.t.putExtra("start_flag", 1002);
            String strG = com.sina.weibo.sdk.b.d.g(String.valueOf((Math.random() * 10000.0d) + System.currentTimeMillis()));
            this.w = strG;
            this.t.putExtra("share_back_flag", strG);
            this.t.putExtra("share_flag_for_new_version", 1);
            Bundle extras = this.t.getExtras();
            Intent intent = new Intent("com.sina.weibo.sdk.action.ACTION_WEIBO_ACTIVITY");
            com.sina.weibo.sdk.b.a.C0744a c0744aC = com.sina.weibo.sdk.b.a.c(this);
            if (c0744aC != null) {
                intent.setPackage(c0744aC.packageName);
            }
            intent.putExtras(weiboMultiMessage.writeToBundle(extras));
            intent.putExtra("_weibo_sdkVersion", "0041005000");
            intent.putExtra("_weibo_appPackage", getPackageName());
            intent.putExtra("_weibo_appKey", com.sina.weibo.sdk.a.b().getAppKey());
            intent.putExtra("_weibo_flag", 538116905);
            intent.putExtra("_weibo_sign", com.sina.weibo.sdk.b.d.g(com.sina.weibo.sdk.b.e.b(this, getPackageName())));
            String stringExtra = this.t.getStringExtra("start_web_activity");
            if (!TextUtils.isEmpty(stringExtra) && "com.sina.weibo.sdk.web.WebActivity".equals(stringExtra)) {
                intent.setClassName(this, stringExtra);
                startActivityForResult(intent, 10001);
            } else {
                if (com.sina.weibo.sdk.a.a(this)) {
                    if (c0744aC != null) {
                        intent.setPackage(c0744aC.packageName);
                    }
                    startActivityForResult(intent, 10001);
                    return;
                }
                d("Start weibo client's composer fail. And Weibo client is not installed.");
            }
        } catch (Throwable th) {
            com.sina.weibo.sdk.b.c.b("WBShareTag", "start wb composer fail," + th.getMessage());
            d("Start weibo client's composer fail. " + th.getMessage());
        }
    }

    private boolean a(Intent intent) {
        if (TextUtils.isEmpty(this.w) || intent == null || !intent.getExtras().containsKey("share_back_flag")) {
            return false;
        }
        return TextUtils.equals(this.w, intent.getStringExtra("share_back_flag"));
    }
}
