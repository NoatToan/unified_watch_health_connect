package com.huawei.ui.main.stories.guidepage.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.utils.Utils;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.guidepage.data.GuideResource;
import com.huawei.ui.main.stories.guidepage.views.PlayVideo;
import defpackage.lsx;
import defpackage.njy;
import defpackage.pee;
import defpackage.qji;
import defpackage.qqf;
import defpackage.qqr;
import defpackage.tre;
import defpackage.unh;
import defpackage.uni;
import defpackage.unl;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class GuidePageActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthDotsPageIndicator f27359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthViewPager f27360c;
    private Context d;
    private uni j;
    private List<View> k = new ArrayList(6);
    private List<GuideResource> e = new ArrayList(6);
    private int f = -1;
    private int h = 0;
    private boolean g = true;
    private Map<Integer, PlayVideo> i = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<Integer, Bitmap> f27358a = new HashMap();

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        cancelAdaptRingRegion();
        getWindow().setFlags(1024, 1024);
        BaseActivity.setNavigationBarVisibility(this, 8);
        getWindow().addFlags(67108864);
        getWindow().addFlags(134217728);
        setContentView(R.layout.activity_guide_page);
        this.d = this;
        a();
        e();
    }

    private void a() {
        this.f27360c = (HealthViewPager) findViewById(R.id.guide_view_pager);
    }

    private void e() {
        LogUtil.a("GuidePageActivity", "enter GuidePageActivity initData");
        if (getIntent() == null) {
            finish();
            return;
        }
        List<GuideResource> listE = unh.e();
        this.e = listE;
        if (njy.e(listE)) {
            LogUtil.a("GuidePageActivity", "initData mGuideResources is Empty");
            finish();
            return;
        }
        for (int i = 0; i < this.e.size(); i++) {
            this.k.add(b(i));
        }
        this.j = new uni(this.k);
        HealthViewPager healthViewPager = (HealthViewPager) findViewById(R.id.guide_view_pager);
        this.f27360c = healthViewPager;
        healthViewPager.setDynamicSpringAnimaitionEnabled(false);
        this.f27360c.setAdapter(this.j);
        this.f27360c.addOnPageChangeListener(new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.ui.main.stories.guidepage.activity.GuidePageActivity.5
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i2, float f, int i3) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i2) {
                GuidePageActivity.this.h = i2;
                GuidePageActivity.this.c(i2);
            }
        });
        this.f27359b = (HealthDotsPageIndicator) findViewById(R.id.guide_dots);
        if (this.e.size() == 1) {
            this.f27359b.setVisibility(8);
        }
        this.f27359b.setViewPager(this.f27360c);
        c(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        LogUtil.a("GuidePageActivity", "setSelect:", Integer.valueOf(i));
        if (this.i.containsKey(Integer.valueOf(this.f)) && this.i.get(Integer.valueOf(this.f)) != null) {
            LogUtil.a("GuidePageActivity", "mHistoryPositon:", Integer.valueOf(this.f));
            this.i.get(Integer.valueOf(this.f)).pause();
            if (this.f27358a.containsKey(Integer.valueOf(this.f)) && this.f27358a.get(Integer.valueOf(this.f)) != null) {
                this.i.get(Integer.valueOf(this.f)).setBackground(new BitmapDrawable((Resources) null, this.f27358a.get(Integer.valueOf(this.f))));
            }
        }
        if (this.i.containsKey(Integer.valueOf(i)) && this.i.get(Integer.valueOf(i)) != null) {
            b(this.e.get(i).getResourceUrl(), this.i.get(Integer.valueOf(i)), i);
        }
        this.f = i;
    }

    private void b(String str, final PlayVideo playVideo, int i) {
        LogUtil.a("GuidePageActivity", "enter playVideo");
        String strC = unh.c(str);
        playVideo.setAudioFocusRequest(2);
        playVideo.setVideoPath(strC);
        playVideo.start();
        playVideo.requestFocus();
        playVideo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.huawei.ui.main.stories.guidepage.activity.GuidePageActivity.4
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                LogUtil.a("GuidePageActivity", "onCompletion");
                mediaPlayer.start();
                mediaPlayer.setLooping(true);
            }
        });
        playVideo.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.huawei.ui.main.stories.guidepage.activity.GuidePageActivity.2
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.huawei.ui.main.stories.guidepage.activity.GuidePageActivity.2.2
                    @Override // android.media.MediaPlayer.OnInfoListener
                    public boolean onInfo(MediaPlayer mediaPlayer2, int i2, int i3) {
                        LogUtil.a("GuidePageActivity", "setOnPreparedListener:", "what:", Integer.valueOf(i2));
                        if (i2 != 3) {
                            return true;
                        }
                        playVideo.setBackgroundColor(0);
                        return true;
                    }
                });
            }
        });
        playVideo.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.huawei.ui.main.stories.guidepage.activity.GuidePageActivity.1
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
                LogUtil.e("GuidePageActivity", "what:", Integer.valueOf(i2), " extra:", Integer.valueOf(i3));
                return true;
            }
        });
    }

    private void e(PlayVideo playVideo, String str, int i) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(0L, 2);
            this.f27358a.put(Integer.valueOf(i), frameAtTime);
            playVideo.setBackground(new BitmapDrawable((Resources) null, frameAtTime));
        } catch (IllegalArgumentException unused) {
            LogUtil.e("GuidePageActivity", "setBackground IllegalArgumentException");
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException e) {
                LogUtil.e("GuidePageActivity", "setBackground release exception:", ExceptionUtils.c(e));
            }
        }
    }

    private View b(int i) {
        View viewInflate = View.inflate(this.d, R.layout.fragment_guide_page, null);
        LogUtil.a("GuidePageActivity", "enter buildViewLayout");
        GuideResource guideResource = this.e.get(i);
        if (guideResource == null) {
            LogUtil.j("GuidePageActivity", "guideResource = null");
            return viewInflate;
        }
        int resourceType = guideResource.getResourceType();
        LogUtil.a("GuidePageActivity", "type:", Integer.valueOf(resourceType));
        if (resourceType == 1) {
            PlayVideo playVideo = (PlayVideo) viewInflate.findViewById(R.id.guide_page_video);
            playVideo.setVisibility(0);
            this.i.put(Integer.valueOf(i), playVideo);
            e(playVideo, unh.c(guideResource.getResourceUrl()), i);
        } else if (resourceType == 0 || resourceType == 2) {
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.guide_page_image);
            imageView.setVisibility(0);
            a(unh.c(guideResource.getResourceUrl()), imageView);
        } else {
            LogUtil.j("GuidePageActivity", "type not match");
        }
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.guide_page_skip);
        if (guideResource.getSkip() == 0) {
            healthTextView.setVisibility(8);
        } else {
            healthTextView.setVisibility(0);
            healthTextView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.guidepage.activity.GuidePageActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    GuidePageActivity.this.finish();
                }
            });
        }
        d(viewInflate, guideResource);
        return viewInflate;
    }

    private void d(View view, GuideResource guideResource) {
        if (guideResource.getDisplay() == 1) {
            HealthButton healthButton = (HealthButton) view.findViewById(R.id.guide_page_experience);
            healthButton.setVisibility(0);
            healthButton.setText(guideResource.getButtonName());
            String targetUrl = guideResource.getTargetUrl();
            boolean zIsNotSupportBrowseUrl = TextUtils.isEmpty(targetUrl) ? false : Utils.isNotSupportBrowseUrl(targetUrl);
            BaseActivity baseActivityD = tre.d();
            if (baseActivityD != null) {
                healthButton.setOnClickListener(qji.b(a(targetUrl), baseActivityD, zIsNotSupportBrowseUrl, ""));
            } else {
                healthButton.setOnClickListener(a(targetUrl));
            }
        }
    }

    private View.OnClickListener a(final String str) {
        return new View.OnClickListener() { // from class: com.huawei.ui.main.stories.guidepage.activity.GuidePageActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GuidePageActivity.this.e(str);
            }
        };
    }

    private void a(String str, ImageView imageView) {
        LogUtil.a("GuidePageActivity", "loadImage");
        File file = new File(str);
        if (file.exists()) {
            RequestOptions requestOptionsPlaceholder = new RequestOptions().skipMemoryCache(true).transform(new qqr(imageView.getContext().getApplicationContext(), 0)).placeholder(R.drawable.blank_0911);
            qqf.b(requestOptionsPlaceholder, R.drawable.blank_0911);
            qqf.c(file, requestOptionsPlaceholder, imageView);
            return;
        }
        LogUtil.j("GuidePageActivity", "loadImage fail file not exist");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("GuidePageActivity", "startDetailActivity url is empty");
            finish();
            return;
        }
        if (str.startsWith("huaweischeme")) {
            LogUtil.a("GuidePageActivity", "startDetailActivity HUAWEI_SCHEME");
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            intent.setPackage(this.d.getPackageName());
            lsx.c(intent, this.d);
        } else {
            LogUtil.a("GuidePageActivity", "startDetailActivity url");
            Intent intent2 = new Intent(this.d, (Class<?>) WebViewActivity.class);
            intent2.setFlags(268435456);
            intent2.putExtra("url", str);
            this.d.startActivity(intent2);
        }
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.g && this.i.containsKey(Integer.valueOf(this.h)) && this.i.get(Integer.valueOf(this.h)) != null) {
            b(this.e.get(this.h).getResourceUrl(), this.i.get(Integer.valueOf(this.h)), this.h);
        }
        this.g = false;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (!this.i.containsKey(Integer.valueOf(this.h)) || this.i.get(Integer.valueOf(this.h)) == null) {
            return;
        }
        this.i.get(Integer.valueOf(this.h)).pause();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b();
        c();
    }

    private void b() {
        for (Map.Entry<Integer, PlayVideo> entry : this.i.entrySet()) {
            if (entry instanceof Map.Entry) {
                Map.Entry<Integer, PlayVideo> entry2 = entry;
                if (entry2.getValue() instanceof PlayVideo) {
                    PlayVideo value = entry2.getValue();
                    if (value == null) {
                        LogUtil.j("GuidePageActivity", "playVideo = null");
                        return;
                    } else {
                        value.stopPlayback();
                        value.destroyDrawingCache();
                    }
                } else {
                    continue;
                }
            }
        }
    }

    private void c() {
        unh.b("", "");
        unl.b("");
        try {
            LogUtil.a("GuidePageActivity", "isClearSuccess:", Boolean.valueOf(pee.b(BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + "guidevideo")));
        } catch (IOException unused) {
            LogUtil.e("GuidePageActivity", "clear IOException");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("GuidePageActivity", "onBackPressed");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
