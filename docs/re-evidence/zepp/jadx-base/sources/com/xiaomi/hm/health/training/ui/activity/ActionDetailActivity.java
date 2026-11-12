package com.xiaomi.hm.health.training.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.ui.activity.trainplay.TrainingPlayActivity;
import com.xiaomi.hm.health.training.ui.helper.GlobalTitleStyleKt;
import com.xiaomi.hm.health.training.ui.widget.HtmlRichText;
import com.xiaomi.hm.health.training.utils.WebBrowserUtils;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import com.xiaomi.hm.health.traininglib.util.MediaFileUtils;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class ActionDetailActivity extends BaseTitleActivity implements View.OnClickListener {
    private static final String G = "ActionDetailActivity";
    public static final String TRAINING_ACTION_CONTENT = "TRAINING_DETAIL_CONTENTS";
    public static final String TRAINING_ACTION_CONTENT_POSITION = "POSITION";
    private TextView A;
    private ImageView B;
    private ArrayList<ActionContent> C;
    private ActionContent D;
    private int E;
    private SimpleExoPlayer F;
    private PlayerView x;
    private HtmlRichText y;
    private ImageView z;

    public class a implements HtmlRichText.OnRichTextImageClickListener {
        public a() {
        }

        @Override // com.xiaomi.hm.health.training.ui.widget.HtmlRichText.OnRichTextImageClickListener
        public void urlClicked(String str, String str2) {
            WebBrowserUtils.jump2WebBrowser(ActionDetailActivity.this, str, str2);
        }
    }

    private void initView() {
        this.x = (PlayerView) findViewById(R.id.sfv_video);
        this.y = (HtmlRichText) findViewById(R.id.wbv_content);
        this.z = (ImageView) findViewById(R.id.imv_pre);
        this.A = (TextView) findViewById(R.id.tx_page_index);
        this.B = (ImageView) findViewById(R.id.imv_next);
        this.z.setOnClickListener(this);
        this.B.setOnClickListener(this);
        this.x.getSubtitleView().setApplyEmbeddedStyles(false);
        this.x.findViewById(R.id.exo_shutter).setBackgroundColor(ContextCompat.getColor(this, R.color.pale_grey));
        ImageView imageView = (ImageView) this.x.findViewById(R.id.exo_artwork);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.icon_default_item_head);
        l();
    }

    private void l() {
        SimpleExoPlayer simpleExoPlayerBuild = new SimpleExoPlayer.Builder(this).build();
        this.F = simpleExoPlayerBuild;
        this.x.setPlayer(simpleExoPlayerBuild);
        this.F.setPlayWhenReady(true);
    }

    private synchronized void m() {
        Log.d(G, "start playVideo");
        DefaultDataSourceFactory defaultDataSourceFactory = new DefaultDataSourceFactory(this, Util.getUserAgent(this, "com.xiaomi.hm.health"), DefaultBandwidthMeter.getSingletonInstance(this));
        ActionVideo actionVideo = this.D.actionVideo;
        File medialFromCacheByUri = MediaFileUtils.getMedialFromCacheByUri(actionVideo.url, actionVideo.size.longValue());
        ProgressiveMediaSource progressiveMediaSourceCreateMediaSource = new ProgressiveMediaSource.Factory(defaultDataSourceFactory).createMediaSource(new MediaItem.Builder().setUri(medialFromCacheByUri != null ? Uri.fromFile(medialFromCacheByUri) : Uri.parse(this.D.actionVideo.url)).build());
        SimpleExoPlayer simpleExoPlayer = this.F;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setRepeatMode(1);
            this.F.setMediaSource(progressiveMediaSourceCreateMediaSource);
            this.F.prepare();
        }
        Log.d(G, "end playVideo");
    }

    private void n() {
        SimpleExoPlayer simpleExoPlayer = this.F;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.release();
            this.F = null;
        }
    }

    private void o() {
        this.z.setEnabled(this.E > 0);
        this.B.setEnabled(this.E < this.C.size() - 1);
        ActionContent actionContent = this.C.get(this.E);
        this.D = actionContent;
        ArrayList arrayList = (ArrayList) actionContent.videos;
        if (arrayList != null && arrayList.size() > 0) {
            this.D.actionVideo = (ActionVideo) arrayList.get(0);
            if (arrayList.size() == 2 && this.D.actionVideo.gender.intValue() != TrainerInfo.get().gender) {
                this.D.actionVideo = (ActionVideo) arrayList.get(1);
            }
        }
        getTitleTextView().setText(this.D.actionVideo.name);
        this.A.setText(getString(R.string.index_of_page, new Object[]{Integer.valueOf(this.E + 1), Integer.valueOf(this.C.size())}));
        p(this.D);
        m();
    }

    private void p(ActionContent actionContent) {
        this.y.setRichText(actionContent.actionVideo.interpretationDocument);
        this.y.setOnRichTextImageClickListener(new a());
    }

    public static void startActionDetailActivity(Context context, ArrayList<ActionContent> arrayList, int i) {
        Intent intent = new Intent(context, (Class<?>) ActionDetailActivity.class);
        intent.putExtra(TRAINING_ACTION_CONTENT, arrayList);
        intent.putExtra(TRAINING_ACTION_CONTENT_POSITION, i);
        context.startActivity(intent);
    }

    public static void startActionDetailActivityForResult(TrainingPlayActivity trainingPlayActivity, ArrayList<ActionContent> arrayList, int i) {
        Intent intent = new Intent(trainingPlayActivity, (Class<?>) ActionDetailActivity.class);
        intent.putExtra(TRAINING_ACTION_CONTENT, arrayList);
        intent.putExtra(TRAINING_ACTION_CONTENT_POSITION, i);
        trainingPlayActivity.startActivityForResult(intent, 3);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.imv_pre) {
            int i = this.E;
            if (i > 0) {
                this.E = i - 1;
                o();
                return;
            }
            return;
        }
        if (id != R.id.imv_next || this.E >= this.C.size() - 1) {
            return;
        }
        this.E++;
        o();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_action_detail);
        GlobalTitleStyleKt.setUnifyTitleStyle(this, "", "");
        initView();
        Intent intent = getIntent();
        this.C = (ArrayList) intent.getSerializableExtra(TRAINING_ACTION_CONTENT);
        this.E = intent.getIntExtra(TRAINING_ACTION_CONTENT_POSITION, 0);
        l();
        o();
        TrainingAnalytics.event(this, TrainingAnalytics.EventId.MOVEMENT_DETAIL_VIEW_NUM);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        n();
        setIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (Util.SDK_INT <= 23) {
            n();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.F == null) {
            l();
            o();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (Util.SDK_INT > 23) {
            n();
        }
    }
}
