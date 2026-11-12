package com.xiaomi.hm.health.ui.sportfitness;

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
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseFragmentActivity;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.share.HMShareManager;
import com.huami.widget.share.PreShareListener;
import com.huami.widget.share.ShareContent;
import com.huami.widget.share.SharePanel;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.running.calori.CaloriActivity;
import com.xiaomi.hm.health.ui.sportfitness.ExerciseHisShareActivity;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.watermarkcamera.utils.ViewUtils;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002&\u0015B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010!¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/ui/sportfitness/ExerciseHisShareActivity;", "Lcom/huami/view/basetitle/BaseFragmentActivity;", "Lcom/huami/widget/share/PreShareListener;", "Landroid/view/View$OnClickListener;", "", "e", "initView", "f", "g", "Lcom/huami/widget/share/ShareContent;", GoogleApiAvailabilityLight.a, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "shareType", "onPreShare", "Landroid/view/View;", "v", "onClick", "Lcom/huami/widget/share/SharePanel;", "a", "Lcom/huami/widget/share/SharePanel;", "mSharePanel", "b", "Landroid/view/View;", "mShareContainer", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "mShareIv", "mBackBtn", "", "Ljava/lang/String;", "mUrl", "mType", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ExerciseHisShareActivity extends BaseFragmentActivity implements PreShareListener, View.OnClickListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final float g = 7.0f;

    @NotNull
    private static final String h = "url";

    @NotNull
    private static final String i = "type";

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
    private String mType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"com/xiaomi/hm/health/ui/sportfitness/ExerciseHisShareActivity$a", "Lcom/huami/widget/share/HMShareManager$ShareResultListener;", "", "shareType", "", "onComplete", "errorCode", "", "errorMsg", "onError", "onCancel", "onClicked", "<init>", "(Lcom/xiaomi/hm/health/ui/sportfitness/ExerciseHisShareActivity;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
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
                linkedHashMap.put("tp", "Wechat");
            } else if (shareType == 2) {
                linkedHashMap.put("tp", "Moments");
            } else if (shareType == 4) {
                linkedHashMap.put("tp", "Weibo");
            } else if (shareType == 5) {
                linkedHashMap.put("tp", "QQZone");
            } else if (shareType == 6) {
                linkedHashMap.put("tp", "QQ");
            } else if (shareType == 8) {
                linkedHashMap.put("tp", "Facebook");
            } else if (shareType == 9) {
                linkedHashMap.put("tp", "Twitter");
            } else if (shareType == 13) {
                linkedHashMap.put("tp", "Save");
            } else if (shareType == 15) {
                linkedHashMap.put("tp", "instagram");
            }
            String str = ExerciseHisShareActivity.this.mType;
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("pos", str);
            Analytics.recordEvent(new CountEventBuilder(StatEvent.SHARE_EXERCISE_TO_THIRD_PLATFORM_C).putExtras(linkedHashMap).setAnonymous(Utils.isOverseaUser()));
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onError(int shareType, int errorCode, @NotNull String errorMsg) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ ShareContent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ShareContent shareContent) {
            super(0);
            this.a = shareContent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "bitmapUrl = " + this.a.bitmapUrl;
        }
    }

    private final ShareContent d() {
        ShareContent shareContent = new ShareContent();
        shareContent.content = getString(R.string.share_content);
        shareContent.title = getString(R.string.app_name);
        shareContent.topic = getString(R.string.share_topic);
        shareContent.bitmapUrl = this.mUrl;
        HMLog.debug(SportAnalytics.Params.VALUE_SHARE, new b(shareContent));
        return shareContent;
    }

    private final void e() {
        this.mUrl = getIntent().getStringExtra("url");
        this.mType = getIntent().getStringExtra("type");
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
        if (findViewById(R.id.share_pane_container) == null) {
            return;
        }
        SharePanel sharePanel = new SharePanel();
        this.mSharePanel = sharePanel;
        Objects.requireNonNull(sharePanel);
        sharePanel.setShareResultListener(new a());
        Bundle bundle = new Bundle();
        bundle.putBoolean("share_type", true);
        bundle.putInt(SharePanel.ARG_BG_COLOR, ContextCompat.getColor(this, R.color.color_2b2b2b));
        SharePanel sharePanel2 = this.mSharePanel;
        Objects.requireNonNull(sharePanel2);
        sharePanel2.setArguments(bundle);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        SharePanel sharePanel3 = this.mSharePanel;
        Objects.requireNonNull(sharePanel3);
        fragmentTransactionBeginTransaction.add(R.id.share_pane_container, sharePanel3);
        SharePanel sharePanel4 = this.mSharePanel;
        Objects.requireNonNull(sharePanel4);
        sharePanel4.setShareListener(this);
        fragmentTransactionBeginTransaction.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ExerciseHisShareActivity exerciseHisShareActivity) {
        View view = exerciseHisShareActivity.mShareContainer;
        Objects.requireNonNull(view);
        view.setVisibility(8);
        ImageView imageView = exerciseHisShareActivity.mBackBtn;
        Objects.requireNonNull(imageView);
        imageView.setVisibility(8);
        SharePanel sharePanel = exerciseHisShareActivity.mSharePanel;
        Objects.requireNonNull(sharePanel);
        sharePanel.onSharePrepared(exerciseHisShareActivity.d());
        View view2 = exerciseHisShareActivity.mShareContainer;
        Objects.requireNonNull(view2);
        view2.setVisibility(0);
        ImageView imageView2 = exerciseHisShareActivity.mBackBtn;
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
    public static final void launch(@NotNull Context context, @NotNull String str) {
        INSTANCE.launch(context, str);
    }

    @JvmStatic
    public static final void launch(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        INSTANCE.launch(context, str, str2);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        Integer numValueOf = v == null ? null : Integer.valueOf(v.getId());
        if (numValueOf != null && numValueOf.intValue() == R.id.iv_close) {
            onBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exerciser_his_share);
        e();
        initView();
        g();
    }

    @Override // com.huami.widget.share.PreShareListener
    public void onPreShare(int shareType) {
        runOnUiThread(new Runnable() { // from class: rt1
            @Override // java.lang.Runnable
            public final void run() {
                ExerciseHisShareActivity.h(this.a);
            }
        });
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/ui/sportfitness/ExerciseHisShareActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "url", "", WebConstant.QueryParam.LAUNCH, CaloriActivity.ARG_FILTER_TYPE, "ARG_TYPE_URL", "Ljava/lang/String;", "", "CORNER_IMG", "F", "FILTER_TYPE", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void launch(@NotNull Context context, @NotNull String url) {
            Intent intent = new Intent(context, (Class<?>) ExerciseHisShareActivity.class);
            intent.putExtra("url", url);
            context.startActivity(intent);
        }

        @JvmStatic
        public final void launch(@NotNull Context context, @NotNull String url, @NotNull String filterType) {
            Intent intent = new Intent(context, (Class<?>) ExerciseHisShareActivity.class);
            intent.putExtra("url", url);
            intent.putExtra("type", filterType);
            context.startActivity(intent);
        }
    }
}
