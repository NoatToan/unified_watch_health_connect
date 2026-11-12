package com.huawei.pluginachievement.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.up.model.UserInfomation;
import defpackage.osb;
import defpackage.ouf;
import defpackage.oun;
import defpackage.ouo;
import defpackage.out;
import defpackage.paw;
import defpackage.qqf;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes41.dex */
public class AchieveLotteryShareActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f22077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f22078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22079c;
    private Handler d;
    private HandlerThread e;
    private String f;
    private ImageView g;
    private ImageView h;
    private Bitmap i;
    private HealthTextView j;
    private HealthTextView m;
    private HealthTextView o;

    private void e() {
        LogUtil.a("PLGACHIEVE_AchieveLotteryShareActivity", "getData()");
        c();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22077a = this;
        setContentView(R.layout.achieve_lottery_share);
        HandlerThread handlerThread = new HandlerThread("handlerThread");
        this.e = handlerThread;
        handlerThread.start();
        this.d = new c(this.e.getLooper(), this);
        d();
        e();
    }

    static class c extends Handler {
        WeakReference<AchieveLotteryShareActivity> e;

        c(Looper looper, AchieveLotteryShareActivity achieveLotteryShareActivity) {
            super(looper);
            this.e = new WeakReference<>(achieveLotteryShareActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            AchieveLotteryShareActivity achieveLotteryShareActivity = this.e.get();
            if (achieveLotteryShareActivity == null) {
                LogUtil.a("PLGACHIEVE_AchieveLotteryShareActivity", "refrence of AchieveLotteryShareAcitiviry is null!");
                return;
            }
            int i = message.what;
            if (i == 1) {
                if (message.obj instanceof UserInfomation) {
                    achieveLotteryShareActivity.c((UserInfomation) message.obj);
                    return;
                } else {
                    LogUtil.j("PLGACHIEVE_AchieveLotteryShareActivity", "MSG_GET_USER_INFO_SUCCESS is not UserInfomation!");
                    return;
                }
            }
            if (i == 2) {
                LogUtil.j("PLGACHIEVE_AchieveLotteryShareActivity", "MSG_GET_USER_INFO_FAIL");
                return;
            }
            if (i != 1001) {
                LogUtil.a("PLGACHIEVE_AchieveLotteryShareActivity", "handleMessageWhenReferenceNotNull msg.what == ", Integer.valueOf(message.what));
                return;
            }
            Bitmap bitmapC = ouo.c(achieveLotteryShareActivity.findViewById(R.id.share_rlayout));
            if (bitmapC != null) {
                osb.c(achieveLotteryShareActivity.f22077a, bitmapC, AnalyticsValue.SUCCESSES_SHARE_1100015.value(), null);
            }
        }
    }

    private void d() {
        Intent intent = getIntent();
        if (intent != null) {
            this.f = intent.getStringExtra("imgUrl");
            this.f22078b = intent.getStringExtra("awardName");
        }
        if (this.f == null) {
            this.f = "";
        }
        if (this.f22078b == null) {
            this.f22078b = "";
        }
        LogUtil.d("PLGACHIEVE_AchieveLotteryShareActivity", "init mImgUrl=", this.f, " awardName=", this.f22078b);
        this.m = (HealthTextView) out.d(this, R.id.lottery_nick);
        this.o = (HealthTextView) out.d(this, R.id.lottery_text_prize_name);
        this.g = (ImageView) out.d(this, R.id.lottery_head);
        this.h = (ImageView) out.d(this, R.id.lottery_img_prize);
        ((CustomTitleBar) out.d(this, R.id.lottery_title)).setTitleText(oun.b(this));
        this.f22079c = (HealthTextView) out.d(this, R.id.lottery_text_title);
        this.j = (HealthTextView) out.d(this, R.id.lottery_share_content);
        this.f22079c.setText(String.format(Locale.ROOT, getString(R.string.IDS_plugin_achievement_lottery_share_title_2), oun.b(this)));
        this.j.setText(String.format(Locale.ROOT, getString(R.string.IDS_plugin_achievement_lottery_share_content), oun.b(this)));
        c();
    }

    private void c() {
        this.o.setText(this.f22078b);
        String str = this.f;
        if (str == null || !GeneralUtil.isSafePath(str.trim())) {
            LogUtil.j("PLGACHIEVE_AchieveLotteryShareActivity", "mImgUrl invalid");
        } else {
            qqf.b(this.f, new CustomTarget<Drawable>() { // from class: com.huawei.pluginachievement.ui.AchieveLotteryShareActivity.5
                @Override // com.bumptech.glide.request.target.Target
                public void onLoadCleared(Drawable drawable) {
                }

                @Override // com.bumptech.glide.request.target.Target
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
                    AchieveLotteryShareActivity.this.h.setImageDrawable(drawable);
                    AchieveLotteryShareActivity.this.b();
                }

                @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
                public void onLoadFailed(Drawable drawable) {
                    super.onLoadFailed(drawable);
                    AchieveLotteryShareActivity.this.a();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (!osb.c(this.f22077a)) {
            paw.a(this.f22077a);
        } else {
            final View viewFindViewById = findViewById(R.id.share_rlayout);
            viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.pluginachievement.ui.AchieveLotteryShareActivity.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    AchieveLotteryShareActivity.this.d.sendMessageDelayed(AchieveLotteryShareActivity.this.d.obtainMessage(1001), 500L);
                    viewFindViewById.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
            });
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HandlerThread handlerThread = this.e;
        if (handlerThread != null) {
            handlerThread.getLooper().quit();
        }
        Bitmap bitmap = this.i;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.i.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo(new BaseResponseCallback<UserInfomation>() { // from class: com.huawei.pluginachievement.ui.AchieveLotteryShareActivity.1
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i, UserInfomation userInfomation) {
                if (i != 0) {
                    AchieveLotteryShareActivity.this.d.sendEmptyMessage(2);
                    return;
                }
                if (userInfomation == null) {
                    LogUtil.j("PLGACHIEVE_AchieveLotteryShareActivity", "get userinfo success but obtain null objData");
                    return;
                }
                Message messageObtain = Message.obtain();
                messageObtain.obj = userInfomation;
                messageObtain.what = 1;
                AchieveLotteryShareActivity.this.d.sendMessage(messageObtain);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final UserInfomation userInfomation) {
        if (userInfomation == null) {
            LogUtil.a("PLGACHIEVE_AchieveLotteryShareActivity", "userInfomation is null");
        } else {
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.pluginachievement.ui.AchieveLotteryShareActivity.4
                @Override // java.lang.Runnable
                public void run() {
                    String picPath = userInfomation.getPicPath();
                    AchieveLotteryShareActivity.this.m.setText(userInfomation.getName());
                    if (!TextUtils.isEmpty(picPath)) {
                        AchieveLotteryShareActivity achieveLotteryShareActivity = AchieveLotteryShareActivity.this;
                        achieveLotteryShareActivity.i = ouf.c(achieveLotteryShareActivity, picPath);
                        if (AchieveLotteryShareActivity.this.i != null) {
                            AchieveLotteryShareActivity.this.g.setImageBitmap(AchieveLotteryShareActivity.this.i);
                            return;
                        }
                    }
                    osb.c(userInfomation.getPortraitUrl(), AchieveLotteryShareActivity.this.g);
                }
            });
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
