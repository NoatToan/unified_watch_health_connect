package com.huami.moving.ui.offcut;

import android.content.ComponentCallbacks;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.moving.R;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.moving.ui.offcut.SportEndPageActivity;
import com.huami.moving.ui.sport.detail.tool.ShareFileUtils;
import com.huami.moving.ui.utils.BitmapUtils;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.moving.ui.view.card.EndCardOverView;
import com.huami.moving.utils.Utils;
import com.huami.network.hmnetwork.config.HMRunning;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.share.HMShareManager;
import com.huami.widget.share.PreShareListener;
import com.huami.widget.share.ShareCardFragment;
import com.huami.widget.share.ShareContent;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.File;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 @2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b>\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014J\u001e\u0010\u0015\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007J\b\u0010\u0016\u001a\u00020\u0002H\u0014J\u0016\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0018\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u001d\u00106\u001a\u0002018B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001d\u0010;\u001a\u0002078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010)¨\u0006A"}, d2 = {"Lcom/huami/moving/ui/offcut/SportEndPageActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initView", "r", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "Landroid/graphics/Bitmap;", "v", "bitmap", "", "roundPx", "o", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "newWidth", "newHeight", "getNewBitmap", "onStop", "shareType", "sportType", "Lcom/huami/mifit/analytics/builder/CountEventBuilder;", "setEventFrTPValues", "", "x", "J", "trackId", "y", LogUtil.I, "deviceSource", "z", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "trackrecord", "", "B", "Z", TdmillHmFragment.ARG_IS_METRIC, "C", "isUseAmap", "Lcom/huami/widget/share/ShareCardFragment;", LogUtil.D, "Lcom/huami/widget/share/ShareCardFragment;", "shareCard", "Lcom/huami/moving/ui/offcut/SportEndPageBusiness;", "E", "Lkotlin/Lazy;", b.r, "()Lcom/huami/moving/ui/offcut/SportEndPageBusiness;", "sportEndPageBusiness", "Lcom/huami/moving/ui/offcut/SportPromotionPosition;", "F", DTransferConstants.SEARCH_KEY, "()Lcom/huami/moving/ui/offcut/SportPromotionPosition;", "sportPromotionPosition", "G", "shareItemClick", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportEndPageActivity extends BaseTitleActivity {

    @NotNull
    public static final String ARGS_MAP_GAODE = "isGaodeMap";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private Trackrecord trackrecord;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean isMetric;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean isUseAmap;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private ShareCardFragment shareCard;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportEndPageBusiness;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportPromotionPosition;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private boolean shareItemClick;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private long trackId = -1;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private int deviceSource = -1;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private int sportType = 1;

    /* JADX WARN: Multi-variable type inference failed */
    public SportEndPageActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.sportEndPageBusiness = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SportEndPageBusiness>() { // from class: com.huami.moving.ui.offcut.SportEndPageActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.moving.ui.offcut.SportEndPageBusiness, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SportEndPageBusiness getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(SportEndPageBusiness.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.sportPromotionPosition = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SportPromotionPosition>() { // from class: com.huami.moving.ui.offcut.SportEndPageActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.moving.ui.offcut.SportPromotionPosition, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SportPromotionPosition getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(SportPromotionPosition.class), objArr2, objArr3);
            }
        });
    }

    private final void initView() {
        String string;
        int sportTimesByType = p().getSportTimesByType(this.sportType);
        EndCardOverView endCardOverView = (EndCardOverView) findViewById(R.id.sport_end_page_end_card_over_view);
        if (endCardOverView != null) {
            Trackrecord trackrecord = this.trackrecord;
            Objects.requireNonNull(trackrecord);
            endCardOverView.setData(trackrecord, this.isMetric, this.isUseAmap);
        }
        int i = this.sportType;
        if (i == 1) {
            string = getString(R.string.running_sports_type_running);
        } else if (i == 6) {
            string = getString(R.string.running_sports_type_walking);
        } else if (i != 8) {
            string = i != 9 ? "" : getString(R.string.sports_type_bike_ride);
        } else {
            string = getString(R.string.running_sports_type_indoor_running);
        }
        SpannableString spannableString = new SpannableString(getResources().getQuantityString(R.plurals.sport_end_page_sport_times, sportTimesByType, Integer.valueOf(sportTimesByType), string));
        spannableString.setSpan(new AbsoluteSizeSpan(40, true), 5, sportTimesByType != 0 ? ((int) c.log(sportTimesByType, 10.0f)) + 5 + 1 : 6, 17);
        TypefaceTextView typefaceTextView = (TypefaceTextView) findViewById(R.id.sport_end_page_sport_times_tv);
        if (typefaceTextView != null) {
            typefaceTextView.setText(spannableString);
        }
        ((ImageView) findViewById(R.id.sport_end_page_close_img)).setOnClickListener(new View.OnClickListener() { // from class: v97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportEndPageActivity.u(this.a, view);
            }
        });
        r();
        q().showSportEndPromotionCourse(getSupportFragmentManager(), (FrameLayout) findViewById(R.id.sport_end_page_course), (LinearLayout) findViewById(R.id.sport_end_page_course_title_layout), this, this.sportType);
        q().showSportEndPromotionActivities(this, (LinearLayout) findViewById(R.id.sport_end_page_activities_title_layout), (RecyclerView) findViewById(R.id.sport_end_page_activities), this.sportType);
        q().showSportEndPromotionTextChainView(this, (NestedScrollView) findViewById(R.id.sport_end_page_scroll_view), (FrameLayout) findViewById(R.id.sport_end_page_text_chain_layout), this.sportType);
    }

    private final Bitmap o(Bitmap bitmap, float roundPx) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawRoundRect(rectF, roundPx, roundPx, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    private final SportEndPageBusiness p() {
        return (SportEndPageBusiness) this.sportEndPageBusiness.getValue();
    }

    private final SportPromotionPosition q() {
        return (SportPromotionPosition) this.sportPromotionPosition.getValue();
    }

    private final void r() {
        ShareCardFragment shareCardFragment = new ShareCardFragment();
        this.shareCard = shareCardFragment;
        Objects.requireNonNull(shareCardFragment);
        shareCardFragment.setShareListener(new PreShareListener() { // from class: w97
            @Override // com.huami.widget.share.PreShareListener
            public final void onPreShare(int i) {
                SportEndPageActivity.s(this.a, i);
            }
        });
        ShareCardFragment shareCardFragment2 = this.shareCard;
        Objects.requireNonNull(shareCardFragment2);
        shareCardFragment2.setShareResultListener(new HMShareManager.ShareResultListener() { // from class: com.huami.moving.ui.offcut.SportEndPageActivity$initShareCardFragment$2
            @Override // com.huami.widget.share.HMShareManager.ShareResultListener
            public void onCancel(int shareType) {
            }

            @Override // com.huami.widget.share.HMShareManager.ShareResultListener
            public void onClicked(int shareType) {
                this.a.shareItemClick = true;
                SportEndPageActivity sportEndPageActivity = this.a;
                Analytics.recordEvent(sportEndPageActivity.setEventFrTPValues(shareType, sportEndPageActivity.sportType));
            }

            @Override // com.huami.widget.share.HMShareManager.ShareResultListener
            public void onComplete(int shareType) {
            }

            @Override // com.huami.widget.share.HMShareManager.ShareResultListener
            public void onError(int shareType, int errorCode, @NotNull String errorMsg) {
            }
        });
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i = R.id.sport_end_page_share_card;
        ShareCardFragment shareCardFragment3 = this.shareCard;
        Objects.requireNonNull(shareCardFragment3);
        fragmentTransactionBeginTransaction.replace(i, shareCardFragment3).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(final SportEndPageActivity sportEndPageActivity, int i) {
        sportEndPageActivity.runOnUiThread(new Runnable() { // from class: x97
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                SportEndPageActivity.t(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(SportEndPageActivity sportEndPageActivity) throws Throwable {
        ShareContent shareContent = new ShareContent();
        String string = sportEndPageActivity.getString(R.string.running_share_to_topic, new Object[]{Utils.appName()});
        shareContent.title = sportEndPageActivity.getString(R.string.running_share_as_sport_summary);
        shareContent.url = HMRunning.SHARE_URL;
        shareContent.content = "";
        File shareCacheFile = ShareFileUtils.INSTANCE.getShareCacheFile(sportEndPageActivity.getBaseContext(), String.valueOf(System.currentTimeMillis()));
        int i = R.id.sport_end_page_end_card_over_view;
        BitmapUtils.saveBitmapToFile(shareCacheFile.getAbsolutePath(), sportEndPageActivity.v((EndCardOverView) sportEndPageActivity.findViewById(i), ((EndCardOverView) sportEndPageActivity.findViewById(i)).getWidth(), ((EndCardOverView) sportEndPageActivity.findViewById(i)).getHeight()), 90);
        shareContent.bitmapUrl = shareCacheFile.getAbsolutePath();
        shareContent.topic = string;
        ShareCardFragment shareCardFragment = sportEndPageActivity.shareCard;
        Objects.requireNonNull(shareCardFragment);
        shareCardFragment.onSharePrepared(shareContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(SportEndPageActivity sportEndPageActivity, View view) {
        sportEndPageActivity.finish();
    }

    private final Bitmap v(View view, int width, int height) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        view.draw(canvas);
        Bitmap bitmapO = o(bitmapCreateBitmap, getResources().getDimensionPixelSize(R.dimen.sport_end_page_card_radius));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.sport_end_page_share_left);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.sport_end_page_share_top);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.sport_end_page_share_bg);
        Object systemService = getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        return BitmapUtils.joinBitmap(getNewBitmap(bitmapDecodeResource, i, i), bitmapO, dimensionPixelSize, dimensionPixelSize2);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final Bitmap getNewBitmap(@NotNull Bitmap bitmap, int newWidth, int newHeight) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(newWidth / width, newHeight / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_end_page);
        setStyle(BaseTitleActivity.STYLE.NONE);
        this.trackId = getIntent().getLongExtra("trackId", -1L);
        this.deviceSource = getIntent().getIntExtra("deviceSource", DataTypeSource.RunSource.RUN_SOURCE_PHONE.getValue());
        this.sportType = getIntent().getIntExtra("sportType", 1);
        this.isUseAmap = getIntent().getBooleanExtra("isGaodeMap", true);
        this.trackrecord = TrackRecordManager.getInstance().getTrackRecordById(this.trackId, this.deviceSource);
        this.isMetric = RunnerData.getRunner().isMetric();
        EndCardOverView endCardOverView = (EndCardOverView) findViewById(R.id.sport_end_page_end_card_over_view);
        if (endCardOverView != null) {
            Trackrecord trackrecord = this.trackrecord;
            Objects.requireNonNull(trackrecord);
            endCardOverView.setData(trackrecord, this.isMetric, this.isUseAmap);
        }
        initView();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (TextUtils.isEmpty(p().getTopActivtyName()) || Intrinsics.areEqual(getLocalClassName(), p().getTopActivtyName())) {
            return;
        }
        if (this.shareItemClick) {
            this.shareItemClick = false;
        } else {
            finish();
        }
    }

    @NotNull
    public final CountEventBuilder setEventFrTPValues(int shareType, int sportType) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(SportAnalytics.EVENT_SHARE_C);
        if (sportType == 1) {
            countEventBuilder.addExtra("fr", "finish_run_outer");
        } else if (sportType == 6) {
            countEventBuilder.addExtra("fr", "finish_walk");
        } else if (sportType == 8) {
            countEventBuilder.addExtra("fr", "finish_run_inner");
        } else if (sportType == 9) {
            countEventBuilder.addExtra("fr", "finish_ride");
        }
        if (shareType == 1) {
            countEventBuilder.addExtra("tp", "wechat");
        } else if (shareType == 2) {
            countEventBuilder.addExtra("tp", "circle");
        } else if (shareType == 4) {
            countEventBuilder.addExtra("tp", SportAnalytics.ParamValue.ShareC.MICROBLOG);
        } else if (shareType == 5) {
            countEventBuilder.addExtra("tp", SportAnalytics.ParamValue.ShareC.QQZONE);
        } else if (shareType == 6) {
            countEventBuilder.addExtra("tp", "qq");
        }
        return countEventBuilder;
    }
}
