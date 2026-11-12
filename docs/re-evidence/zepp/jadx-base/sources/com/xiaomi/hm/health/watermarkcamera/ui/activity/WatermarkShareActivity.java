package com.xiaomi.hm.health.watermarkcamera.ui.activity;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.media.MediaScannerConnection;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.network.hmnetwork.config.HMRunning;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseFragmentActivity;
import com.huami.widget.share.HMShareManager;
import com.huami.widget.share.PreShareListener;
import com.huami.widget.share.ShareContent;
import com.huami.widget.share.SharePanel;
import com.xiaomi.hm.health.watermarkcamera.entity.Watermark;
import com.xiaomi.hm.health.watermarkcamera.event.EventGoBackToSummary;
import com.xiaomi.hm.health.watermarkcamera.event.EventWatermarkThumbUpdate;
import com.xiaomi.hm.health.watermarkcamera.ui.activity.WatermarkShareActivity;
import com.xiaomi.hm.health.watermarkcamera.ui.adapter.WatermarkBarAdapter;
import com.xiaomi.hm.health.watermarkcamera.utils.BitmapUtils;
import com.xiaomi.hm.health.watermarkcamera.utils.MeasurementAdapterFactory;
import com.xiaomi.hm.health.watermarkcamera.utils.ViewUtils;
import com.xiaomi.hm.health.watermarkcamera.utils.WatermarkAnalytics;
import com.xiaomi.hm.health.watermarkcamera.utils.WatermarkFileUtils;
import com.xiaomi.hm.health.watermarkcamera.utils.WatermarkShareDataUtil;
import com.xiaomi.hm.health.watermarkcamera.utils.WatermarkViewManager;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.DataFormatterProxy;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.TrackRecordManagerProxy;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.TrackRecordManagerAdapter;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import de.greenrobot.event.EventBus;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes22.dex */
public class WatermarkShareActivity extends BaseFragmentActivity implements View.OnClickListener, WatermarkBarAdapter.OnBarItemClickListener, WatermarkBarAdapter.OnWatermarkDownloadListener {
    private static final String A = "WatermarkShareActivity";
    private static final String B = "watermark_share_";
    private static final String C = "watermark_clip_";
    private static final String D = "watermark_bundle_photo_path";
    private static final String E = "ARG_TRACK_ID";
    private static final String F = "photo_path";
    private static final int G = 3;
    private static final int H = 36;
    private ImageView a;
    private String b;
    private String c;
    private String d;
    private SharePanel e;
    private RelativeLayout i;
    private RelativeLayout j;
    private RecyclerView k;
    private Button l;
    private FrameLayout m;
    private LinearLayout n;
    private TextView o;
    private TextView p;
    private View q;
    private RelativeLayout r;
    private List<Watermark> u;
    private WatermarkViewManager w;
    private WatermarkBarAdapter x;
    private int f = 0;
    private int g = 0;
    private boolean h = false;
    private long s = -1;
    private int t = -1;
    private List<Watermark> v = new ArrayList();
    private boolean y = false;
    private boolean z = false;

    public class a implements HMShareManager.ShareResultListener {
        public a() {
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onCancel(int i) {
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onClicked(int i) {
            boolean zIsStickerMarkView = WatermarkShareActivity.this.w.isStickerMarkView();
            String str = zIsStickerMarkView ? WatermarkAnalytics.EVENT_SHARE_STICKER : WatermarkAnalytics.EVENT_SHARE_WATERMARK;
            if (zIsStickerMarkView || WatermarkShareActivity.this.f > 2) {
                List list = zIsStickerMarkView ? WatermarkShareActivity.this.v : WatermarkShareActivity.this.u;
                if (list.size() > WatermarkShareActivity.this.f) {
                    String strValueOf = ((Watermark) list.get(WatermarkShareActivity.this.f)).name;
                    if (TextUtils.isEmpty(strValueOf)) {
                        strValueOf = String.valueOf(WatermarkShareActivity.this.f + 1);
                    }
                    Analytics.event(WatermarkShareActivity.this, str, strValueOf);
                }
            } else {
                WatermarkShareActivity watermarkShareActivity = WatermarkShareActivity.this;
                Analytics.event(watermarkShareActivity, str, String.valueOf(watermarkShareActivity.f + 1));
            }
            String str2 = "Save";
            switch (i) {
                case 1:
                    Analytics.event(WatermarkShareActivity.this, WatermarkAnalytics.EVENT_RECORD_SHARE_MARK, "Wechat");
                    str2 = "Wechat";
                    break;
                case 2:
                    Analytics.event(WatermarkShareActivity.this, WatermarkAnalytics.EVENT_RECORD_SHARE_MARK, "Moments");
                    str2 = "Moments";
                    break;
                case 3:
                case 7:
                case 10:
                case 11:
                case 12:
                default:
                    str2 = "";
                    break;
                case 4:
                    Analytics.event(WatermarkShareActivity.this, WatermarkAnalytics.EVENT_RECORD_SHARE_MARK, "Weibo");
                    str2 = "Weibo";
                    break;
                case 5:
                    Analytics.event(WatermarkShareActivity.this, WatermarkAnalytics.EVENT_RECORD_SHARE_MARK, "QQZone");
                    str2 = "QQZone";
                    break;
                case 6:
                    Analytics.event(WatermarkShareActivity.this, WatermarkAnalytics.EVENT_RECORD_SHARE_MARK, "QQ");
                    str2 = "QQ";
                    break;
                case 8:
                    Analytics.event(WatermarkShareActivity.this, WatermarkAnalytics.EVENT_RECORD_SHARE_MARK, "Facebook");
                    str2 = "Facebook";
                    break;
                case 9:
                    Analytics.event(WatermarkShareActivity.this, WatermarkAnalytics.EVENT_RECORD_SHARE_MARK, "Twitter");
                    str2 = "Twitter";
                    break;
                case 13:
                    Analytics.event(WatermarkShareActivity.this, WatermarkAnalytics.EVENT_RECORD_SHARE_MARK, "Save");
                    break;
                case 14:
                    Analytics.event(WatermarkShareActivity.this, WatermarkAnalytics.EVENT_RECORD_SHARE_MARK, "MiFit");
                    str2 = "MiFit";
                    break;
                case 15:
                    Analytics.event(WatermarkShareActivity.this, WatermarkAnalytics.EVENT_RECORD_SHARE_MARK, "MiFit");
                    str2 = "Instagram";
                    break;
            }
            Analytics.event(WatermarkShareActivity.this, WatermarkAnalytics.EVENT_RECORD_SHARE_MARK, "Moments");
            HashMap map = new HashMap();
            map.put("id", WatermarkShareActivity.this.getIntent().getLongExtra(WatermarkShareActivity.E, -1L) + "");
            map.put("fr", str2);
            Analytics.recordEvent(new CountEventBuilder(WatermarkAnalytics.SPORT_DETAIL_SHARE_CAMERA_C).putExtras(map));
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onComplete(int i) {
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onError(int i, int i2, String str) {
        }
    }

    private Watermark A(GetWatermarkAPI.WebWatermark webWatermark) {
        Watermark watermark = new Watermark();
        watermark.name = webWatermark.mMarkTitle;
        watermark.markBlackUrl = webWatermark.mWatermarkBlackPicUrl;
        watermark.markWhiteUrl = webWatermark.mWatermarkWhitePicUrl;
        watermark.markThumbUrl = webWatermark.mWatermarkThumbUrl;
        watermark.markCreateTime = webWatermark.mCreateTime;
        watermark.markAngleType = webWatermark.mAngleType;
        watermark.isSticker = webWatermark.mIsSticker;
        if (z(watermark)) {
            watermark.type = 101;
        } else {
            watermark.type = 100;
        }
        return watermark;
    }

    private void B() {
        if (TextUtils.isEmpty(this.d)) {
            return;
        }
        File file = new File(this.d);
        if (file.exists()) {
            file.delete();
        }
    }

    private Bitmap C() {
        Bitmap bitmapDecodeSampledBitmapFromFile = BitmapUtils.decodeSampledBitmapFromFile(this.b, WatermarkShareDataUtil.getWatermarkShareWidth(), WatermarkShareDataUtil.getWatermarkShareHeight());
        Resources resources = getResources();
        if (bitmapDecodeSampledBitmapFromFile != null) {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(ContextCompat.getColor(this, R.color.transparent)), new BitmapDrawable(resources, bitmapDecodeSampledBitmapFromFile)});
            this.a.setImageDrawable(transitionDrawable);
            transitionDrawable.startTransition(200);
        }
        return bitmapDecodeSampledBitmapFromFile;
    }

    private List<WatermarkBarAdapter.WatermarkBarItem> D(List<Watermark> list) {
        ArrayList arrayList = new ArrayList();
        for (Watermark watermark : list) {
            WatermarkBarAdapter.WatermarkBarItem watermarkBarItem = new WatermarkBarAdapter.WatermarkBarItem(watermark.type, false);
            if (watermark.type == 100) {
                watermarkBarItem.isFromNet = true;
                watermarkBarItem.isNeedReload = true;
                watermarkBarItem.mThumbUrl = watermark.markThumbUrl;
                watermarkBarItem.mBlackUrl = watermark.markBlackUrl;
                watermarkBarItem.mWhiteUrl = watermark.markWhiteUrl;
                watermarkBarItem.mAngleType = watermark.markAngleType;
            } else {
                Locale locale = getResources().getConfiguration().locale;
                String language = locale.getLanguage();
                HMLog.d(A, "language ==" + language, new Object[0]);
                int i = watermark.type;
                if (i == 18) {
                    watermarkBarItem.mThumb = BitmapFactory.decodeResource(getResources(), com.xiaomi.hm.health.watermarkcamera.R.drawable.watermark_1);
                } else if (i == 17) {
                    int i2 = (!WatermarkShareDataUtil.isRunInternal() && language.equalsIgnoreCase("zh")) ? locale.getCountry().equalsIgnoreCase("cn") ? com.xiaomi.hm.health.watermarkcamera.R.drawable.watermark_2 : com.xiaomi.hm.health.watermarkcamera.R.drawable.watermark_2_tw : com.xiaomi.hm.health.watermarkcamera.R.drawable.watermark_2_en;
                    watermarkBarItem.mThumb = BitmapFactory.decodeResource(getResources(), i2);
                } else if (i == 19) {
                    watermarkBarItem.mThumb = BitmapFactory.decodeResource(getResources(), language.equalsIgnoreCase("zh") ? locale.getCountry().equalsIgnoreCase("cn") ? com.xiaomi.hm.health.watermarkcamera.R.drawable.watermark_3 : com.xiaomi.hm.health.watermarkcamera.R.drawable.watermark_3_tw : com.xiaomi.hm.health.watermarkcamera.R.drawable.watermark_3_en);
                } else if (i == 20) {
                    watermarkBarItem.mThumb = BitmapFactory.decodeResource(getResources(), com.xiaomi.hm.health.watermarkcamera.R.drawable.watermark_4);
                } else if (i == 101) {
                    watermarkBarItem.mAngleType = watermark.markAngleType;
                    watermarkBarItem.mThumbUrl = watermark.markThumbUrl;
                    watermarkBarItem.imgCacheStatus = 2;
                    HMLog.d(A, "CacheLoaded TYPE_CUSTOM_LOCAL", new Object[0]);
                }
            }
            arrayList.add(watermarkBarItem);
        }
        return arrayList;
    }

    private boolean E() {
        return this.s >= 0 && this.t >= 0;
    }

    private void F() {
        if (this.m == null) {
            return;
        }
        this.e = new SharePanel();
        Bundle bundle = new Bundle();
        bundle.putBoolean("share_type", true);
        bundle.putInt(SharePanel.ARG_ITEM_HEIGHT, getResources().getDimensionPixelSize(com.xiaomi.hm.health.watermarkcamera.R.dimen.watermark_share_oper_item_height));
        this.e.setArguments(bundle);
        this.e.setShareListener(new PreShareListener() { // from class: gm8
            @Override // com.huami.widget.share.PreShareListener
            public final void onPreShare(int i) {
                this.a.J(i);
            }
        });
        this.e.setOnClickListener(this);
        this.e.setShareResultListener(new a());
        getSupportFragmentManager().beginTransaction().replace(com.xiaomi.hm.health.watermarkcamera.R.id.share_pane_container, this.e).commit();
    }

    private void G() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(0);
        this.k.setLayoutManager(linearLayoutManager);
        setOperateEnable(false);
        Observable.fromCallable(new Callable() { // from class: im8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.K();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: om8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.L((Void) obj);
            }
        }, new Action1() { // from class: nm8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.M((Throwable) obj);
            }
        });
    }

    private boolean H(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() throws Throwable {
        String string = getString(com.xiaomi.hm.health.watermarkcamera.R.string.running_share_to_topic);
        ShareContent shareContent = new ShareContent();
        shareContent.title = getString(com.xiaomi.hm.health.watermarkcamera.R.string.running_share_to_watermark);
        shareContent.url = HMRunning.SHARE_URL;
        shareContent.content = "";
        genNewSharePath();
        shareContent.bitmapUrl = this.b;
        shareContent.topic = string;
        this.e.onSharePrepared(shareContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(int i) {
        runOnUiThread(new Runnable() { // from class: hm8
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.a.I();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void K() throws Exception {
        x();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(Void r1) {
        w();
        setOperateEnable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(Throwable th) {
        th.printStackTrace();
        setOperateEnable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List N(boolean z) throws Exception {
        return z ? u() : t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(boolean z, List list) {
        this.w.reinitGenerators(list, this.y, z);
        this.x.reloadWatermarkBarItemList(D(list), z);
        if (this.w.isStickerCategory() == z) {
            if (!z) {
                v(this.f);
            }
            this.x.rebindWatermarkBarItemList(z);
            this.x.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String P() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q(Throwable th) {
        HMLog.error(A, "", th, new Function0() { // from class: km8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WatermarkShareActivity.P();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R(String str, Uri uri) {
        HMLog.w(A, "Scanned path:" + str + ",uri=" + uri, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(Long l) {
        boolean z;
        if (H(getApplicationContext())) {
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i >= this.u.size()) {
                    z = true;
                    break;
                }
                int i2 = this.u.get(i).type;
                if (i2 == 100 || i2 == 101) {
                    z = false;
                    break;
                }
                i++;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= this.v.size()) {
                    z2 = z;
                    break;
                }
                int i4 = this.v.get(i3).type;
                if (i4 == 100 || i4 == 101) {
                    break;
                } else {
                    i3++;
                }
            }
            if (z2) {
                GetWatermarkAPI.getWebWatermark(true);
                GetWatermarkAPI.getWebStickerWatermark(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String T() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void U(Throwable th) {
        HMLog.error(A, "", th, new Function0() { // from class: lm8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WatermarkShareActivity.T();
            }
        });
    }

    private void V(Bundle bundle) {
        this.s = WatermarkShareDataUtil.getCurrTrackId();
        this.t = WatermarkShareDataUtil.getDeviceSource();
        Intent intent = getIntent();
        if (intent != null) {
            this.c = intent.getStringExtra(F);
        }
        if (bundle != null) {
            HMLog.i(A, "WatermarkShareActivity savedInstanceState", new Object[0]);
            this.c = bundle.getString(D);
        }
        this.b = this.c;
    }

    private void W(final boolean z) {
        Observable.fromCallable(new Callable() { // from class: jm8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.N(z);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: dm8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.O(z, (List) obj);
            }
        }, new Action1() { // from class: fm8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                WatermarkShareActivity.Q((Throwable) obj);
            }
        });
    }

    private void X() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
        layoutParams.height = WatermarkShareDataUtil.getWatermarkShareHeight();
        this.i.setLayoutParams(layoutParams);
    }

    private void Y(List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        MediaScannerConnection.scanFile(getApplicationContext(), (String[]) list.toArray(new String[list.size()]), null, new MediaScannerConnection.OnScanCompletedListener() { // from class: cm8
            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public final void onScanCompleted(String str, Uri uri) {
                WatermarkShareActivity.R(str, uri);
            }
        });
    }

    private void Z() {
        findViewById(com.xiaomi.hm.health.watermarkcamera.R.id.common_title_left_button).setOnClickListener(this);
        findViewById(com.xiaomi.hm.health.watermarkcamera.R.id.reverse_color).setOnClickListener(this);
        this.l.setOnClickListener(this);
        this.o.setOnClickListener(this);
        this.p.setOnClickListener(this);
    }

    private void a0(boolean z) {
        this.h = z;
        this.w.setTabToSticker(z);
        this.f = 0;
        this.x.setWatermarkBarItemList(D(z ? this.v : this.u), z);
        if (this.w.isStickerMarkView() == this.h) {
            this.x.setItemHighLight(this.g);
        } else {
            this.x.setItemHighLight(-1);
        }
        this.x.notifyDataSetChanged();
        int color = ContextCompat.getColor(this, com.xiaomi.hm.health.watermarkcamera.R.color.white100);
        int color2 = ContextCompat.getColor(this, com.xiaomi.hm.health.watermarkcamera.R.color.white40);
        this.p.setTextColor(z ? color : color2);
        TextView textView = this.o;
        if (z) {
            color = color2;
        }
        textView.setTextColor(color);
    }

    private void b0() {
        Observable.timer(1L, TimeUnit.SECONDS, AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: mm8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.S((Long) obj);
            }
        }, new Action1() { // from class: em8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                WatermarkShareActivity.U((Throwable) obj);
            }
        });
    }

    private void findViews() {
        this.l = (Button) findViewById(com.xiaomi.hm.health.watermarkcamera.R.id.goto_summary_btn);
        this.m = (FrameLayout) findViewById(com.xiaomi.hm.health.watermarkcamera.R.id.share_pane_container);
        this.n = (LinearLayout) findViewById(com.xiaomi.hm.health.watermarkcamera.R.id.watermark_category_layout);
        this.o = (TextView) findViewById(com.xiaomi.hm.health.watermarkcamera.R.id.tab_sport);
        this.p = (TextView) findViewById(com.xiaomi.hm.health.watermarkcamera.R.id.tab_sticker);
        this.i = (RelativeLayout) findViewById(com.xiaomi.hm.health.watermarkcamera.R.id.rl_share_area_mark);
        this.j = (RelativeLayout) findViewById(com.xiaomi.hm.health.watermarkcamera.R.id.mark_layout);
        this.a = (ImageView) findViewById(com.xiaomi.hm.health.watermarkcamera.R.id.iv_photo);
        this.k = (RecyclerView) findViewById(com.xiaomi.hm.health.watermarkcamera.R.id.choose_watermark_listview);
        this.q = findViewById(com.xiaomi.hm.health.watermarkcamera.R.id.category_choose_divider);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(com.xiaomi.hm.health.watermarkcamera.R.id.title_layout);
        this.r = relativeLayout;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.height = (int) (ViewUtils.dp2px(this, 36.0f) + ViewUtils.getStatusBarHeight(this));
        this.r.setLayoutParams(layoutParams);
    }

    public static boolean start(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) WatermarkShareActivity.class);
        intent.putExtra(F, str);
        context.startActivity(intent);
        return true;
    }

    private List<Watermark> t() {
        ArrayList arrayList = new ArrayList();
        List<GetWatermarkAPI.WebWatermark> webWatermarkList = GetWatermarkAPI.getWebWatermarkList();
        if (webWatermarkList != null) {
            Iterator<GetWatermarkAPI.WebWatermark> it2 = webWatermarkList.iterator();
            while (it2.hasNext()) {
                Watermark watermarkA = A(it2.next());
                this.u.add(watermarkA);
                arrayList.add(watermarkA);
            }
        }
        for (int i = 0; i < this.u.size(); i++) {
            this.u.get(i).position = i;
        }
        HMLog.d(A, "addNetWatermarkDatas netsize = " + arrayList.size(), new Object[0]);
        return arrayList;
    }

    private List<Watermark> u() {
        ArrayList arrayList = new ArrayList();
        List<GetWatermarkAPI.WebWatermark> webStickerWatermarkList = GetWatermarkAPI.getWebStickerWatermarkList();
        if (webStickerWatermarkList != null) {
            Iterator<GetWatermarkAPI.WebWatermark> it2 = webStickerWatermarkList.iterator();
            while (it2.hasNext()) {
                Watermark watermarkA = A(it2.next());
                this.v.add(watermarkA);
                arrayList.add(watermarkA);
            }
            this.v = arrayList;
        }
        for (int i = 0; i < this.v.size(); i++) {
            this.v.get(i).position = i;
        }
        HMLog.d(A, "addStickerWatermarkDatas netsize = " + arrayList.size(), new Object[0]);
        return arrayList;
    }

    private void v(int i) {
        View watermarkView = this.w.getWatermarkView(i);
        if (watermarkView != null) {
            this.j.removeAllViews();
            this.j.addView(watermarkView);
        }
    }

    private void w() {
        boolean zIsFromTrainingSummary = WatermarkShareDataUtil.isFromTrainingSummary();
        WatermarkBarAdapter watermarkBarAdapter = new WatermarkBarAdapter(this);
        this.x = watermarkBarAdapter;
        watermarkBarAdapter.setOnBarItemClickListener(this);
        this.x.setOnWatermarkDownloadListener(this);
        this.x.setBgBitmap(C());
        this.k.setAdapter(this.x);
        this.n.setVisibility(!this.v.isEmpty() ? 0 : 8);
        if (zIsFromTrainingSummary) {
            this.n.setVisibility(8);
            this.q.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.k.getLayoutParams();
            layoutParams.addRule(15);
            this.k.setLayoutParams(layoutParams);
        } else {
            this.q.setVisibility(0);
        }
        WatermarkViewManager watermarkViewManager = new WatermarkViewManager(getApplicationContext(), this.u, this.v, this.y, this);
        this.w = watermarkViewManager;
        this.h = zIsFromTrainingSummary;
        watermarkViewManager.setTabToSticker(zIsFromTrainingSummary);
        v(this.f);
        a0(zIsFromTrainingSummary);
        if (WatermarkShareDataUtil.isFromSportSummary() || WatermarkShareDataUtil.isFromTrainingSummary()) {
            this.l.setVisibility(0);
        } else {
            this.m.setVisibility(0);
        }
        Y(WatermarkFileUtils.deleteWatermarkFile(this, B));
    }

    private void x() {
        this.u = new ArrayList();
        if (E()) {
            MeasurementAdapterFactory.ILengthMeasurementAdapter iLengthMeasurementAdapterCreateLengthMeasurementAdapter = MeasurementAdapterFactory.createLengthMeasurementAdapter(WatermarkShareDataUtil.isMetric());
            TrackRecordManagerAdapter.SimpleTrackRecord trackRecordById = TrackRecordManagerProxy.getInstance().getTrackRecordById(this.s, this.t);
            String contoururi = trackRecordById.getContoururi();
            if (TextUtils.isEmpty(contoururi)) {
                HMLog.i(A, "bindWatermarkData no mapline track", new Object[0]);
                contoururi = "";
            }
            String rawKilometerToFormatKilometer = DataFormatterProxy.getInstance().parseRawKilometerToFormatKilometer((float) iLengthMeasurementAdapterCreateLengthMeasurementAdapter.getLength(((double) trackRecordById.getDistance().intValue()) / 1000.0d).mMeasure);
            String strValueOf = String.valueOf(trackRecordById.getCosttime());
            long jLongValue = trackRecordById.getTrackid().longValue() * 1000;
            Watermark watermark = new Watermark();
            watermark.type = 17;
            watermark.mapLine = contoururi;
            watermark.kilometer = rawKilometerToFormatKilometer;
            watermark.time = strValueOf;
            Watermark watermark2 = new Watermark();
            watermark2.type = 19;
            watermark2.mapLine = contoururi;
            watermark2.kilometer = rawKilometerToFormatKilometer;
            Watermark watermark3 = new Watermark();
            watermark3.type = 20;
            watermark3.mapLine = contoururi;
            Date date = new Date(jLongValue);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/M/d HH:mm:ss", Locale.ENGLISH);
            simpleDateFormat.format(date);
            watermark3.time = simpleDateFormat.format(date);
            watermark3.kilometer = rawKilometerToFormatKilometer;
            this.u.add(watermark);
            this.u.add(watermark2);
            this.u.add(watermark3);
            t();
        }
        u();
    }

    private boolean y(String str) {
        try {
            File file = Glide.with((FragmentActivity) this).downloadOnly().load(str).apply(new RequestOptions().onlyRetrieveFromCache(true)).submit().get();
            if (file != null && file.exists()) {
                return true;
            }
            HMLog.d(A, "checkInCache no cache", new Object[0]);
            return false;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        } catch (ExecutionException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private boolean z(Watermark watermark) {
        return y(watermark.markThumbUrl) && y(watermark.markBlackUrl) && y(watermark.markWhiteUrl);
    }

    public void genNewSharePath() throws Throwable {
        this.i.setDrawingCacheEnabled(true);
        String absolutePath = WatermarkFileUtils.getShareImagePath(this).getAbsolutePath();
        boolean zSaveBitmapToFileWithOptimizeCompress = BitmapUtils.saveBitmapToFileWithOptimizeCompress(absolutePath, this.i.getDrawingCache());
        this.i.destroyDrawingCache();
        this.i.setDrawingCacheEnabled(false);
        HMLog.d(A, "genNewSharePath savebitmap ==" + zSaveBitmapToFileWithOptimizeCompress, new Object[0]);
        HMLog.d(A, "mPhotoPath before ==" + this.b, new Object[0]);
        File file = new File(this.b);
        if (file.exists() && file.getName().startsWith(B)) {
            file.delete();
        } else if (file.getName().startsWith(C)) {
            this.d = file.getPath();
        }
        this.b = absolutePath;
        HMLog.d(A, "mPhotoPath end ==" + this.b, new Object[0]);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
        B();
    }

    public void onBlackWhiteReverseColorClick(View view) {
        this.y = !this.y;
        setOperateEnable(false);
        this.w.setCurrentMarkViewReverseColor(this.y);
        Analytics.event(this, WatermarkAnalytics.EVENT_WATERMARK_SHARE_ANTI, this.y ? "Black" : "White");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        int id = view.getId();
        if (id == com.xiaomi.hm.health.watermarkcamera.R.id.common_title_left_button) {
            B();
            finish();
            return;
        }
        if (id == com.xiaomi.hm.health.watermarkcamera.R.id.reverse_color) {
            onBlackWhiteReverseColorClick(view);
            return;
        }
        if (id == com.xiaomi.hm.health.watermarkcamera.R.id.goto_summary_btn) {
            genNewSharePath();
            EventBus.getDefault().post(new EventGoBackToSummary(this.b));
            finish();
        } else if (id == com.xiaomi.hm.health.watermarkcamera.R.id.tab_sport) {
            if (this.h) {
                a0(false);
            }
        } else {
            if (id != com.xiaomi.hm.health.watermarkcamera.R.id.tab_sticker || this.h) {
                return;
            }
            a0(true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.xiaomi.hm.health.watermarkcamera.R.layout.activity_running_watermark_share);
        V(bundle);
        findViews();
        Z();
        F();
        X();
        G();
        EventBus.getDefault().register(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        File file = new File(this.b);
        if (file.exists() && file.getName().startsWith(B) && (!WatermarkShareDataUtil.isFromSportSummary() || !WatermarkShareDataUtil.isFromTrainingSummary())) {
            file.delete();
        }
        WatermarkViewManager watermarkViewManager = this.w;
        if (watermarkViewManager != null) {
            watermarkViewManager.clearWatermarkViews(true);
        }
        WatermarkBarAdapter watermarkBarAdapter = this.x;
        if (watermarkBarAdapter != null) {
            watermarkBarAdapter.recycleBitmaps();
        }
        EventBus.getDefault().unregister(this);
    }

    @Override // com.xiaomi.hm.health.watermarkcamera.ui.adapter.WatermarkBarAdapter.OnWatermarkDownloadListener
    public void onDownloadComplete(int i) {
        if (this.x.isSelected(i)) {
            this.w.setGeneratorBlackOrWhite(i, this.y);
            this.f = i;
            this.g = i;
            v(i);
        }
        setOperateEnable(true);
    }

    @Override // com.xiaomi.hm.health.watermarkcamera.ui.adapter.WatermarkBarAdapter.OnWatermarkDownloadListener
    public void onDownloadFailed(int i) {
        HMLog.d(A, "onDownloadFailed download index:" + i, new Object[0]);
        setOperateEnable(true);
    }

    @Override // com.xiaomi.hm.health.watermarkcamera.ui.adapter.WatermarkBarAdapter.OnWatermarkDownloadListener
    public void onDownloadStart(int i) {
        HMLog.d(A, "onDownloadStart download index:" + i, new Object[0]);
        setOperateEnable(false);
    }

    public void onEventMainThread(EventWatermarkThumbUpdate eventWatermarkThumbUpdate) {
        HMLog.d(A, "onEventMainThread ThumbUpdate", new Object[0]);
        int i = eventWatermarkThumbUpdate.updatePosition;
        if (this.x.isNeedReloadThumb(i)) {
            this.x.getCurrentItem(i).isNeedReload = false;
            this.x.notifyItemChanged(i);
        }
    }

    @Override // com.xiaomi.hm.health.watermarkcamera.ui.adapter.WatermarkBarAdapter.OnBarItemClickListener
    public void onItemClick(View view, int i) {
        HMLog.d(A, "onItemClick:" + i, new Object[0]);
        this.f = i;
        this.g = i;
        setOperateEnable(false);
        this.w.dealWatermarkBlackWhiteReverseColor(this.f, this.y);
        v(this.f);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.z = true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.z) {
            this.z = false;
            b0();
        }
        Analytics.event(this, WatermarkAnalytics.SHARE_WATERMARK_VIEW_NUM);
    }

    @Override // com.huami.view.basetitle.BaseFragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString(D, this.c);
    }

    public void setOperateEnable(boolean z) {
        if (WatermarkShareDataUtil.isFromSportSummary() || WatermarkShareDataUtil.isFromTrainingSummary()) {
            this.l.setClickable(z);
        } else {
            this.m.setEnabled(z);
        }
        findViewById(com.xiaomi.hm.health.watermarkcamera.R.id.reverse_color).setClickable(z);
        this.o.setClickable(z);
        this.p.setClickable(z);
    }

    public static boolean start(Context context, String str, long j) {
        Intent intent = new Intent(context, (Class<?>) WatermarkShareActivity.class);
        intent.putExtra(F, str);
        intent.putExtra(E, j);
        context.startActivity(intent);
        return true;
    }

    public void onEventMainThread(GetWatermarkAPI.EventWatermarkDataUpdate eventWatermarkDataUpdate) {
        HMLog.d(A, "onEventMainThread WatermarkDataUpdate succ=" + eventWatermarkDataUpdate.isDataSucc, new Object[0]);
        if (eventWatermarkDataUpdate.isDataSucc) {
            W(eventWatermarkDataUpdate.isDataSticker);
        }
    }
}
