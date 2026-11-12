package com.huami.moving.ui.sport.detail.share;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.moving.R;
import com.huami.moving.ui.sport.detail.share.VideoPageShareActivity;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.moving.ui.utils.ViewUtils;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseFragmentActivity;
import com.huami.widget.share.HMShareManager;
import com.huami.widget.share.PreShareListener;
import com.huami.widget.share.ShareContent;
import com.huami.widget.share.SharePanel;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002)\u0015B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010!¨\u0006*"}, d2 = {"Lcom/huami/moving/ui/sport/detail/share/VideoPageShareActivity;", "Lcom/huami/view/basetitle/BaseFragmentActivity;", "Lcom/huami/widget/share/PreShareListener;", "Landroid/view/View$OnClickListener;", "", "e", "initView", "f", "g", "", "shareType", "Lcom/huami/widget/share/ShareContent;", GoogleApiAvailabilityLight.a, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onPreShare", "Landroid/view/View;", "v", "onClick", "Lcom/huami/widget/share/SharePanel;", "a", "Lcom/huami/widget/share/SharePanel;", "mSharePanel", "b", "Landroid/view/View;", "mShareContainer", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "mShareIv", "mBackBtn", "", "Ljava/lang/String;", "mUrl", "mTitle", "mShareUrl", "h", "mTopic", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class VideoPageShareActivity extends BaseFragmentActivity implements PreShareListener, View.OnClickListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final float i = 7.0f;

    @NotNull
    private static final String j = "url";

    @NotNull
    private static final String k = "arg_type_title";

    @NotNull
    private static final String l = "arg_type_share_url";

    @NotNull
    private static final String m = "arg_type_topic";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private SharePanel mSharePanel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private View mShareContainer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private ImageView mShareIv;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private ImageView mBackBtn;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private String mUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private String mTitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private String mShareUrl;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private String mTopic;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007R\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/huami/moving/ui/sport/detail/share/VideoPageShareActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "url", "title", "shareUrl", "topic", "", WebConstant.QueryParam.LAUNCH, "ARG_TYPE_SHARE_URL", "Ljava/lang/String;", "ARG_TYPE_TITLE", "ARG_TYPE_TOPIC", "ARG_TYPE_URL", "", "CORNER_IMG", "F", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void launch(@NotNull Context context, @NotNull String url, @NotNull String title, @NotNull String shareUrl, @NotNull String topic) {
            Intent intent = new Intent(context, (Class<?>) VideoPageShareActivity.class);
            intent.putExtra("url", url);
            intent.putExtra(VideoPageShareActivity.k, title);
            intent.putExtra(VideoPageShareActivity.l, shareUrl);
            intent.putExtra(VideoPageShareActivity.m, topic);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"com/huami/moving/ui/sport/detail/share/VideoPageShareActivity$a", "Lcom/huami/widget/share/HMShareManager$ShareResultListener;", "", "shareType", "", "onComplete", "errorCode", "", "errorMsg", "onError", "onCancel", "onClicked", "<init>", "(Lcom/huami/moving/ui/sport/detail/share/VideoPageShareActivity;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public final class a implements HMShareManager.ShareResultListener {
        public a() {
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onCancel(int shareType) {
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onClicked(int shareType) {
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onComplete(int shareType) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (shareType == 1) {
                linkedHashMap.put("tp", "wechat");
            } else if (shareType == 2) {
                linkedHashMap.put("tp", SportAnalytics.ParamValue.TrackVideo.FRIEND_CIRCLE);
            } else if (shareType == 4) {
                linkedHashMap.put("tp", "weibo");
            } else if (shareType == 5) {
                linkedHashMap.put("tp", SportAnalytics.ParamValue.TrackVideo.QQ_ZONE);
            } else if (shareType == 6) {
                linkedHashMap.put("tp", "qq");
            }
            linkedHashMap.put("pos", SportAnalytics.ParamValue.TrackVideo.SHARE_VIDEO);
            Analytics.recordEvent(new CountEventBuilder(SportAnalytics.SHARE_ROUTE_VIDEO_TO_THIRD_PLATFORM_C).putExtras(linkedHashMap).setAnonymous(false));
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onError(int shareType, int errorCode, @NotNull String errorMsg) {
        }
    }

    private final ShareContent d(int shareType) {
        ShareContent shareContent = new ShareContent();
        shareContent.title = this.mTitle;
        shareContent.url = this.mShareUrl;
        shareContent.content = "";
        if (shareType == 13) {
            shareContent.bitmapUrl = this.mUrl;
        } else {
            shareContent.bitmapUrl = "";
        }
        shareContent.topic = this.mTopic;
        HMLog.i("VideoPageShareActivity", "Share bitmapUrl = " + shareContent.bitmapUrl + " shareType：" + shareType + "   h5ShareType::card", new Object[0]);
        return shareContent;
    }

    private final void e() {
        this.mUrl = getIntent().getStringExtra("url");
        this.mTitle = getIntent().getStringExtra(k);
        this.mShareUrl = getIntent().getStringExtra(l);
        this.mTopic = getIntent().getStringExtra(m);
    }

    private final void f() {
        if (this.mUrl == null) {
            return;
        }
        RequestBuilder<Bitmap> requestBuilderApply = Glide.with((FragmentActivity) this).asBitmap().load(this.mUrl).apply(RequestOptions.bitmapTransform(new RoundedCorners((int) ViewUtils.dp2px(this, 7.0f))).diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(true));
        ImageView imageView = this.mShareIv;
        Objects.requireNonNull(imageView);
        requestBuilderApply.into(imageView);
    }

    private final void g() {
        int i2 = R.id.share_pane_container;
        if (findViewById(i2) == null) {
            return;
        }
        SharePanel sharePanel = new SharePanel();
        this.mSharePanel = sharePanel;
        Objects.requireNonNull(sharePanel);
        sharePanel.setShareResultListener(new a());
        Bundle bundle = new Bundle();
        bundle.putBoolean("share_type", false);
        bundle.putInt(SharePanel.ARG_BG_COLOR, ContextCompat.getColor(this, R.color.color_2b2b2b));
        SharePanel sharePanel2 = this.mSharePanel;
        Objects.requireNonNull(sharePanel2);
        sharePanel2.setArguments(bundle);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        SharePanel sharePanel3 = this.mSharePanel;
        Objects.requireNonNull(sharePanel3);
        fragmentTransactionBeginTransaction.add(i2, sharePanel3);
        SharePanel sharePanel4 = this.mSharePanel;
        Objects.requireNonNull(sharePanel4);
        sharePanel4.setShareListener(this);
        fragmentTransactionBeginTransaction.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(VideoPageShareActivity videoPageShareActivity, int i2) {
        View view = videoPageShareActivity.mShareContainer;
        Objects.requireNonNull(view);
        view.setVisibility(8);
        ImageView imageView = videoPageShareActivity.mBackBtn;
        Objects.requireNonNull(imageView);
        imageView.setVisibility(8);
        SharePanel sharePanel = videoPageShareActivity.mSharePanel;
        Objects.requireNonNull(sharePanel);
        sharePanel.onSharePrepared(videoPageShareActivity.d(i2));
        View view2 = videoPageShareActivity.mShareContainer;
        Objects.requireNonNull(view2);
        view2.setVisibility(0);
        ImageView imageView2 = videoPageShareActivity.mBackBtn;
        Objects.requireNonNull(imageView2);
        imageView2.setVisibility(0);
    }

    private final void initView() {
        this.mShareContainer = findViewById(R.id.share_pane_container);
        this.mShareIv = (ImageView) findViewById(R.id.iv_share);
        ImageView imageView = (ImageView) findViewById(R.id.iv_close);
        this.mBackBtn = imageView;
        Objects.requireNonNull(imageView);
        imageView.setOnClickListener(this);
        f();
    }

    @JvmStatic
    public static final void launch(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        INSTANCE.launch(context, str, str2, str3, str4);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        Integer numValueOf = v == null ? null : Integer.valueOf(v.getId());
        int i2 = R.id.iv_close;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            onBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_page_share);
        e();
        initView();
        g();
    }

    @Override // com.huami.widget.share.PreShareListener
    public void onPreShare(final int shareType) {
        runOnUiThread(new Runnable() { // from class: pa8
            @Override // java.lang.Runnable
            public final void run() {
                VideoPageShareActivity.h(this.a, shareType);
            }
        });
    }
}
