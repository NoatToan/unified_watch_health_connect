package com.huawei.health.marketing.views.dialog;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SinglePopUp;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import defpackage.qrs;
import defpackage.qso;
import health.compact.a.Services;
import java.io.IOException;

/* JADX INFO: loaded from: classes29.dex */
public class InnerMarketingFragment extends BaseFragment implements TextureView.SurfaceTextureListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8449a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8450b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaPlayer f8451c;
    private Context d;
    private ImageView e;
    private int f;
    private int g;
    private OnPageClickListener h;
    private View i;
    private ResourceBriefInfo j;
    private Surface k;
    private TextureView n;
    private SinglePopUp o;

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void a(int i, int i2, ResourceBriefInfo resourceBriefInfo, SinglePopUp singlePopUp) {
        this.g = i;
        this.f = i2;
        this.j = resourceBriefInfo;
        this.o = singlePopUp;
        if (i <= 0 || resourceBriefInfo == null || singlePopUp == null) {
            LogUtil.a("UIDV_TmpFragment", " Invalid parameter:", " mPositionId,mResourceBriefInfo,mSinglePopUp");
        }
    }

    public void e(OnPageClickListener onPageClickListener) {
        this.h = onPageClickListener;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.d = context;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return d();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment
    public void initViewTahiti() {
        super.initViewTahiti();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        qso.d().e(this, this.i);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (getUserVisibleHint()) {
            MediaPlayer mediaPlayer = this.f8451c;
            if (mediaPlayer == null) {
                a();
                return;
            }
            try {
                if (!mediaPlayer.isPlaying() && this.f8449a) {
                    ImageView imageView = this.e;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    this.f8451c.start();
                }
                if (this.f8449a) {
                    return;
                }
                this.f8451c.prepareAsync();
                return;
            } catch (IllegalStateException e) {
                LogUtil.a("UIDV_TmpFragment", " stop:", String.valueOf(e.getMessage()));
                return;
            }
        }
        b();
    }

    private View d() {
        if (this.j.getContentType() == 45) {
            this.f8450b = true;
            return b(this.o, this.f);
        }
        this.f8450b = false;
        return c(this.o);
    }

    private View c(final SinglePopUp singlePopUp) {
        View viewInflate = LayoutInflater.from(this.d).inflate(R.layout.introduction_dialog_full_img, (ViewGroup) null);
        this.i = viewInflate;
        this.e = (ImageView) viewInflate.findViewById(R.id.introduction_dialog_full_image);
        this.n = (TextureView) this.i.findViewById(R.id.introduction_dialog_full_video);
        if (TextUtils.equals(singlePopUp.getMediaType(), "image")) {
            this.n.setVisibility(8);
            this.e.setVisibility(0);
            Glide.with(this.d).load(singlePopUp.getPageMedia()).placeholder(R.drawable.hiad_loading_image).into(this.e);
        } else if (TextUtils.equals(singlePopUp.getMediaType(), "video")) {
            this.n.setVisibility(0);
            this.n.setOpaque(false);
            this.n.setSurfaceTextureListener(this);
            this.e.setVisibility(0);
            this.e.setBackgroundResource(R.drawable.hiad_loading_image);
        } else {
            LogUtil.j("UIDV_TmpFragment", "wrong mediaType.");
            return this.i;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        HealthButton healthButton = (HealthButton) this.i.findViewById(R.id.introduction_dialog_full_button);
        healthButton.setText(singlePopUp.getButtonName());
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: gba
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(singlePopUp, jCurrentTimeMillis, view);
            }
        });
        return this.i;
    }

    public /* synthetic */ void d(SinglePopUp singlePopUp, long j, View view) {
        if (qrs.e(view)) {
            LogUtil.j("UIDV_TmpFragment", "click too fast");
            return;
        }
        String linkValue = singlePopUp.getLinkValue();
        MarketingBiUtils.c(this.g, this.j, j);
        ((MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class)).router(linkValue);
    }

    private View b(SinglePopUp singlePopUp, final int i) {
        View viewInflate = LayoutInflater.from(this.d).inflate(R.layout.introduction_dialog_half_img, (ViewGroup) null);
        this.i = viewInflate;
        this.e = (ImageView) viewInflate.findViewById(R.id.introduction_dialog_half_image);
        this.n = (TextureView) this.i.findViewById(R.id.introduction_dialog_half_video);
        HealthButton healthButton = (HealthButton) this.i.findViewById(R.id.introduction_dialog_half_button);
        if (TextUtils.equals(singlePopUp.getMediaType(), "image")) {
            this.n.setVisibility(8);
            this.e.setVisibility(0);
            Glide.with(this.d).load(singlePopUp.getPageMedia()).placeholder(R.drawable.hiad_loading_image).into(this.e);
        } else if (TextUtils.equals(singlePopUp.getMediaType(), "video")) {
            this.n.setVisibility(0);
            this.n.setOpaque(false);
            this.e.setVisibility(0);
            this.e.setBackgroundResource(R.drawable.hiad_loading_image);
            this.n.setSurfaceTextureListener(this);
        } else {
            LogUtil.j("UIDV_TmpFragment", "wrong mediaType.");
            return this.i;
        }
        TextView textView = (TextView) this.i.findViewById(R.id.introduction_dialog_half_text);
        if (!TextUtils.isEmpty(singlePopUp.getIntroduction())) {
            textView.setText(singlePopUp.getIntroduction());
        }
        healthButton.setText(singlePopUp.getButtonName());
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: gbe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34854b.d(i, view);
            }
        });
        return this.i;
    }

    public /* synthetic */ void d(int i, View view) {
        this.h.onPageClick(i);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.k = new Surface(surfaceTexture);
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        b();
        return false;
    }

    private void b() {
        MediaPlayer mediaPlayer = this.f8451c;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
                this.f8451c.release();
                this.f8451c = null;
            } catch (IllegalStateException e) {
                LogUtil.a("UIDV_TmpFragment", " stop:", String.valueOf(e.getMessage()));
            }
        }
    }

    private void a() {
        SinglePopUp singlePopUp;
        if (this.k == null || (singlePopUp = this.o) == null || singlePopUp.getPageMedia() == null) {
            return;
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f8451c = mediaPlayer;
        mediaPlayer.setAudioStreamType(3);
        this.f8451c.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.huawei.health.marketing.views.dialog.InnerMarketingFragment.3
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer2) {
                InnerMarketingFragment.this.f8449a = true;
                if (InnerMarketingFragment.this.e != null) {
                    InnerMarketingFragment.this.e.setVisibility(8);
                }
                InnerMarketingFragment.this.f8451c.start();
            }
        });
        this.f8451c.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.huawei.health.marketing.views.dialog.InnerMarketingFragment.1
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                LogUtil.a("UIDV_TmpFragment", "what:", Integer.valueOf(i), "extra:", Integer.valueOf(i2));
                return false;
            }
        });
        this.f8451c.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.huawei.health.marketing.views.dialog.InnerMarketingFragment.4
            @Override // android.media.MediaPlayer.OnInfoListener
            public boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                LogUtil.a("UIDV_TmpFragment", "what:", Integer.valueOf(i), "extra:", Integer.valueOf(i2));
                return false;
            }
        });
        this.f8451c.setOnVideoSizeChangedListener(this);
        this.f8451c.setSurface(this.k);
        try {
            this.f8451c.setDataSource(this.o.getPageMedia());
            this.f8451c.setLooping(true);
            this.f8451c.prepareAsync();
        } catch (IOException e) {
            LogUtil.a("UIDV_TmpFragment", " play:", String.valueOf(e.getMessage()));
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        int measuredHeight = this.f8450b ? this.n.getMeasuredHeight() : getResources().getDimensionPixelOffset(R.dimen.health_common_500dp);
        int measuredWidth = this.n.getMeasuredWidth();
        if (measuredHeight <= 0 || measuredWidth <= 0 || i <= 0 || i2 <= 0) {
            return;
        }
        int i3 = measuredWidth * 100;
        int i4 = (i * 100) / i2;
        if (i3 / measuredHeight != i4) {
            ViewGroup.LayoutParams layoutParams = this.n.getLayoutParams();
            if (i >= i2) {
                layoutParams.width = measuredWidth;
                layoutParams.height = i3 / i4;
            } else {
                layoutParams.width = (i4 * measuredHeight) / 100;
                layoutParams.height = measuredHeight;
            }
            this.n.setLayoutParams(layoutParams);
        }
    }
}
