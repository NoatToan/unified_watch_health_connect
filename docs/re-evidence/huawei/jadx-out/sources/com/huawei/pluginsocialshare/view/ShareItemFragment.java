package com.huawei.pluginsocialshare.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.ui.PlayerView;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.activity.MultiplePreviewActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gxt;
import defpackage.gxy;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.njy;
import defpackage.pjm;
import defpackage.pnq;
import defpackage.pns;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes42.dex */
public class ShareItemFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageButton f22617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f22619c;
    private Context d;
    private HealthTextView e;
    private PlayerView f;
    private boolean g;
    private int h;
    private ExoPlayer i;
    private LinearLayout j;
    private gxy l;
    private SharedPreferences n;
    private gxt o;

    public static ShareItemFragment c(int i) {
        ShareItemFragment shareItemFragment = new ShareItemFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("position", i);
        shareItemFragment.setArguments(bundle);
        return shareItemFragment;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.h = arguments.getInt("position", -1);
        }
        gxt gxtVarE = pjm.e();
        this.o = gxtVarE;
        ArrayList<gxy> arrayListE = gxtVarE == null ? null : gxtVarE.e();
        if (njy.c(arrayListE, this.h)) {
            this.l = arrayListE.get(this.h);
        }
        this.d = getContext();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.share_viewpager_item, viewGroup, false);
        a(viewInflate);
        return viewInflate;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.g) {
            ExoPlayer exoPlayer = this.i;
            if (exoPlayer != null) {
                exoPlayer.pause();
                this.i.seekTo(0L);
            }
            d(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ExoPlayer exoPlayer = this.i;
        if (exoPlayer != null) {
            exoPlayer.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Intent intent = new Intent(this.d, (Class<?>) MultiplePreviewActivity.class);
        intent.putExtra("tabPositionKey", this.h);
        this.d.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        PlayerView playerView;
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            linearLayout.setVisibility(z ? 8 : 0);
        }
        ImageView imageView = this.f22619c;
        if (imageView == null || (playerView = this.f) == null) {
            return;
        }
        if (z) {
            playerView.setVisibility(0);
            this.f22619c.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            this.f22619c.postDelayed(new Runnable() { // from class: ppd
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.a();
                }
            }, 100L);
        }
    }

    public /* synthetic */ void a() {
        this.f.setVisibility(8);
    }

    private void b(View view) {
        this.j = (LinearLayout) view.findViewById(R.id.map_play_guide_layout);
        d(false);
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(this.d);
        defaultTrackSelector.setParameters(defaultTrackSelector.buildUponParameters().setForceHighestSupportedBitrate(true));
        this.i = new ExoPlayer.Builder(this.d).setTrackSelector(defaultTrackSelector).setLoadControl(new DefaultLoadControl.Builder().setBufferDurationsMs(2000, 5000, 1000, 2000).build()).setRenderersFactory(new DefaultRenderersFactory(this.d).setEnableDecoderFallback(true)).build();
        this.i.setMediaSource(new DefaultMediaSourceFactory(new DefaultDataSource.Factory(this.d)).createMediaSource(MediaItem.fromUri(pns.d(this.l))));
        this.i.addListener(new Player.Listener() { // from class: com.huawei.pluginsocialshare.view.ShareItemFragment.3
            @Override // androidx.media3.common.Player.Listener
            public void onPlaybackStateChanged(int i) {
                if (i == 4) {
                    ShareItemFragment.this.e();
                }
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlayerError(PlaybackException playbackException) {
                ReleaseLogUtil.b("Share_ShareItemFragment", "onPlayerErr: " + playbackException, "errCodeName: " + playbackException.getErrorCodeName());
                LogUtil.e("Share_ShareItemFragment", "onPlayerError() exoPlayer cause:", playbackException.getCause());
            }
        });
        this.i.prepare();
        PlayerView playerView = (PlayerView) view.findViewById(R.id.player_view);
        this.f = playerView;
        playerView.setResizeMode(3);
        this.f.setPlayer(this.i);
        this.f.setUseController(false);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.retrack_start_retrack);
        this.f22617a = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginsocialshare.view.ShareItemFragment.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ShareItemFragment.this.d(true);
                ShareItemFragment.this.i.seekTo(0L);
                ShareItemFragment.this.i.play();
            }
        });
    }

    private void a(View view) {
        boolean zB = pns.b(this.l);
        this.g = zB;
        if (zB) {
            b(view);
        }
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.share_content);
        if (LanguageUtil.ba(this.d) && this.o.u() != 13) {
            relativeLayout.setRotationY(180.0f);
        }
        this.f22619c = (ImageView) view.findViewById(R.id.img_card_item);
        lrd.c(relativeLayout, 1);
        ImageView imageView = (ImageView) view.findViewById(R.id.img_webpage_background);
        gxy gxyVar = this.l;
        if (gxyVar != null) {
            Bitmap bitmapA = a(gxyVar);
            if (this.l.l() && bitmapA != null) {
                imageView.setImageBitmap(bitmapA);
            } else {
                this.f22619c.setImageBitmap(bitmapA);
            }
            if (this.l.m()) {
                b(view, this.l);
                c(view);
            }
        }
        if (this.o.k()) {
            return;
        }
        HealthCardView healthCardView = (HealthCardView) view.findViewById(R.id.share_item_card_view);
        if (healthCardView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) healthCardView.getLayoutParams();
            layoutParams.setMarginStart(qrs.d(this.d, 8.0f));
            layoutParams.setMarginEnd(qrs.d(this.d, 8.0f));
            healthCardView.setLayoutParams(layoutParams);
        }
    }

    private Bitmap a(gxy gxyVar) {
        Bitmap bitmapD = gxyVar.d();
        if (bitmapD == null) {
            LogUtil.a("Share_ShareItemFragment", "getPreviewBitmap:read from path");
            String strC = gxyVar.c();
            if (TextUtils.isEmpty(strC)) {
                LogUtil.j("Share_ShareItemFragment", "getPreviewBitmap:bitmap and image path are both null!");
                return bitmapD;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            BitmapFactory.decodeFile(strC, options);
            if (options.outHeight > 8192) {
                options.inSampleSize = 2;
            }
            options.inJustDecodeBounds = false;
            bitmapD = qqf.c(strC, options);
        }
        return pnq.a(bitmapD, 6000);
    }

    private void b(View view, final gxy gxyVar) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.content_edit_button);
        ImageView imageView = (ImageView) view.findViewById(R.id.track_share_new_arrow);
        if (LanguageUtil.ba(this.d)) {
            imageView.setImageResource(R.drawable.common_ui_arrow_left);
        }
        linearLayout.setVisibility(0);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginsocialshare.view.ShareItemFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ShareItemFragment.this.d();
                pjm.d().c(ShareItemFragment.this.d, gxyVar, ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo());
                HashMap map = new HashMap(1);
                map.put("click", 1);
                lmf.d().c(ShareItemFragment.this.d, AnalyticsValue.MOTION_TRACK_1040031.value(), map, 0);
            }
        });
    }

    private void c(View view) {
        this.e = (HealthTextView) view.findViewById(R.id.guide_user_edit_content);
        if (!pnq.h()) {
            LogUtil.j("Share_ShareItemFragment", "initGuideUserEditShareView The account language is not supported.");
            return;
        }
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginsocialshare.view.ShareItemFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ShareItemFragment.this.d();
            }
        });
        SharedPreferences sharedPreferences = this.d.getSharedPreferences(Integer.toString(20002), 0);
        this.n = sharedPreferences;
        if (sharedPreferences == null) {
            return;
        }
        boolean z = sharedPreferences.getBoolean("is_first_time_guide_user_edit_share", true);
        this.f22618b = z;
        if (z) {
            this.e.setVisibility(0);
        } else {
            this.e.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (!pnq.h()) {
            LogUtil.j("Share_ShareItemFragment", "hideGuideUserEditShare The account language is not supported.");
            return;
        }
        this.e.setVisibility(8);
        if (this.n == null) {
            LogUtil.j("Share_ShareItemFragment", "hideGuideUserEditShare Hide bubble sharedPreferences is null.");
            this.n = this.d.getSharedPreferences(Integer.toString(20002), 0);
        }
        SharedPreferences.Editor editorEdit = this.n.edit();
        if (editorEdit == null) {
            return;
        }
        editorEdit.putBoolean("is_first_time_guide_user_edit_share", false);
        editorEdit.commit();
    }
}
