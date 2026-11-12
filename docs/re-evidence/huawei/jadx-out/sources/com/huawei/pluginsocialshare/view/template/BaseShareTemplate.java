package com.huawei.pluginsocialshare.view.template;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.VideoSize;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.ui.PlayerView;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.shareconfig.bean.PageViewModel;
import com.huawei.pluginsocialshare.view.BaseSharePreView;
import com.huawei.pluginsocialshare.view.EditShareMultipleFragment;
import com.huawei.pluginsocialshare.view.ShareCustomFragment;
import com.huawei.pluginsocialshare.view.sharewatermark.TrackSimpleView;
import com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView;
import com.huawei.pluginsocialshare.view.stickerview.GridBackgroundView;
import com.huawei.pluginsocialshare.view.stickerview.StickerImageView;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gxy;
import defpackage.gye;
import defpackage.jpg;
import defpackage.njy;
import defpackage.pjm;
import defpackage.pmm;
import defpackage.pmn;
import defpackage.pmr;
import defpackage.pmt;
import defpackage.pmw;
import defpackage.pmx;
import defpackage.pna;
import defpackage.pnb;
import defpackage.pnd;
import defpackage.pnq;
import defpackage.pns;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class BaseShareTemplate extends BaseSharePreView {
    private static int ac = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected View f22711a;
    protected Typeface aa;
    protected Typeface ab;
    protected Typeface ad;
    private ShareDataInfo af;
    private ImageView ag;
    private GridBackgroundView ah;
    private FrameLayout ai;
    private ImageView aj;
    private HealthTextView ak;
    private View al;
    private PlayerView an;
    private GestureBorderImageView ap;
    private HealthTextView ar;
    private RelativeLayout as;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f22712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected FragmentActivity f22713c;
    public Context d;
    protected HealthBubbleLayout e;
    protected int f;
    protected ImageView g;
    protected boolean h;
    protected HealthTextView i;
    protected boolean j;
    protected PageViewModel k;
    protected int l;
    protected int m;
    protected View n;
    protected int o;
    protected FrameLayout p;
    protected float q;
    protected View r;
    protected int s;
    protected TextView t;
    public int u;
    protected String w;
    protected int x;
    public Drawable y;
    protected Typeface z;
    private int am = -1;
    private Handler ae = new Handler(Looper.getMainLooper());
    protected String v = "Share_BaseShareTemplate";

    @Override // com.huawei.pluginsocialshare.view.BaseSharePreView
    public void refreshData(pmw pmwVar) {
    }

    public BaseShareTemplate(Context context, HealthBubbleLayout healthBubbleLayout) {
        this.d = context;
        this.e = healthBubbleLayout;
        c(context);
        initContentView();
        c(this.f22711a);
        d();
    }

    private void c(Context context) {
        View viewInflate = View.inflate(context, R.layout.base_share_template_layout, null);
        this.n = viewInflate;
        this.as = (RelativeLayout) viewInflate.findViewById(R.id.preview_item_card_view_layout);
        this.ag = (ImageView) this.n.findViewById(R.id.border_bg_grid);
        this.ah = (GridBackgroundView) this.n.findViewById(R.id.gridBackgroundView);
        this.p = (FrameLayout) this.n.findViewById(R.id.share_layout);
        this.ap = (GestureBorderImageView) this.n.findViewById(R.id.preview_bg_img);
        this.an = (PlayerView) this.n.findViewById(R.id.preview_player_view);
        this.g = (ImageView) this.n.findViewById(R.id.mark_bg_img);
        this.ar = (HealthTextView) this.n.findViewById(R.id.edit_share_detail_title_username);
        this.aj = (ImageView) this.n.findViewById(R.id.track_share_short_image);
        this.i = (HealthTextView) this.n.findViewById(R.id.edit_share_detail_title_device_name);
        this.ak = (HealthTextView) this.n.findViewById(R.id.logo_name);
        this.al = this.n.findViewById(R.id.preview_logo_layout);
        this.ai = (FrameLayout) this.n.findViewById(R.id.preview_content_layout);
        this.r = this.n.findViewById(R.id.shadowLayout);
        this.t = (TextView) this.n.findViewById(R.id.show_tips);
        int iD = pns.d(BaseApplication.getContext());
        int iD2 = qrs.d(this.d, 8.0f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.as.getLayoutParams();
        layoutParams.height = (int) EditShareMultipleFragment.d;
        int i = (int) ((EditShareMultipleFragment.d * 9.0f) / 16.0f);
        layoutParams.width = Math.min(i, iD);
        this.s = layoutParams.width - qrs.d(BaseApplication.getContext(), 56.0f);
        LogUtil.a("Share_BaseShareTemplate", "initView width =", Integer.valueOf(layoutParams.width), " params.height=", Integer.valueOf(layoutParams.height), " mScreenWidth:", Integer.valueOf(this.s), " margin:", Integer.valueOf(iD2), " windowWidth=", Integer.valueOf(iD), " scaleWidth=", Integer.valueOf(i));
        layoutParams.setMargins(0, 0, 0, iD2);
        this.as.setLayoutParams(layoutParams);
        this.as.setScaleX(EditShareMultipleFragment.f22582b);
        this.as.setPivotX((layoutParams.width * 1.0f) / 2.0f);
        this.aa = pns.f();
        this.ab = pns.j();
        this.z = pns.h();
        this.ad = pns.g();
        this.an.setResizeMode(1);
        this.an.setUseController(false);
    }

    private void d() {
        gxy gxyVarC = pjm.c();
        if (gxyVarC == null) {
            return;
        }
        int iH = gxyVarC.h();
        this.x = iH;
        d(pmn.d(iH), true);
    }

    @Override // com.huawei.pluginsocialshare.view.BaseSharePreView
    public void initContentView() {
        FrameLayout frameLayout = this.ai;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    public void c(View view) {
        FrameLayout frameLayout = this.ai;
        if (frameLayout == null || this.f22711a == null) {
            return;
        }
        frameLayout.addView(view);
    }

    @Override // com.huawei.pluginsocialshare.view.BaseSharePreView
    public View getView() {
        return this.n;
    }

    @Override // com.huawei.pluginsocialshare.view.BaseSharePreView
    public FragmentActivity getActivity() {
        return this.f22713c;
    }

    @Override // com.huawei.pluginsocialshare.view.BaseSharePreView
    public void setActivity(FragmentActivity fragmentActivity) {
        this.f22713c = fragmentActivity;
    }

    @Override // com.huawei.pluginsocialshare.view.BaseSharePreView
    public View getShareContentView() {
        this.t.setVisibility(8);
        this.ah.setVisibility(8);
        ReleaseLogUtil.d("Share_BaseShareTemplate", "getShareContentView mShareView is null?", Boolean.valueOf(this.p == null));
        return this.p;
    }

    @Override // com.huawei.pluginsocialshare.view.BaseSharePreView
    public VideoInfoManager getVideoInfoManager() {
        VideoInfoManager videoInfoManagerD = e.c().d();
        if (videoInfoManagerD != null) {
            View shareContentView = getShareContentView();
            shareContentView.setBackgroundColor(0);
            Bitmap bitmapC = qqf.c(shareContentView);
            shareContentView.setBackgroundColor(qre.e(R.color.colorBackgroundDark));
            videoInfoManagerD.d(bitmapC);
        }
        return videoInfoManagerD;
    }

    @Override // com.huawei.pluginsocialshare.view.BaseSharePreView
    public void refreshViewHeight(pnd pndVar) {
        LogUtil.a("Share_BaseShareTemplate", "template_refreshViewHeight");
        if (this.as == null || pndVar == null) {
            return;
        }
        float fD = pndVar.d();
        this.q = fD;
        LogUtil.a("Share_BaseShareTemplate", "template_refreshViewHeight mScale=", Float.valueOf(fD));
        this.as.setScaleX(pndVar.d());
    }

    @Override // com.huawei.pluginsocialshare.view.BaseSharePreView
    public void refreshBackground(ShareDataInfo shareDataInfo) {
        d(shareDataInfo, false);
    }

    private void d(ShareDataInfo shareDataInfo, boolean z) {
        if (shareDataInfo == null) {
            return;
        }
        ShareDataInfo shareDataInfo2 = this.af;
        if (shareDataInfo2 == null || shareDataInfo2.getId() != shareDataInfo.getId()) {
            this.af = shareDataInfo;
            this.ap.d(this.e, this.ag, this.ah);
        }
        if (shareDataInfo instanceof pmt) {
            Uri uriE = ((pmt) shareDataInfo).e();
            if (this.am == ac) {
                e.c().h();
                e.c().b(this.d, uriE);
                this.an.setPlayer(e.c().b());
                e.c().a();
            }
            this.ap.setVisibility(8);
            this.an.setVisibility(0);
            return;
        }
        this.ap.setVisibility(0);
        this.an.setVisibility(8);
        e.c().h();
        this.an.setPlayer(null);
        if (shareDataInfo instanceof pmr) {
            qqf.d(((pmr) shareDataInfo).c(), this.ap);
            LogUtil.a("Share_BaseShareTemplate", "share_sport LocalShareDataInfo setImageResource");
        } else if (shareDataInfo instanceof pmm) {
            c(this.ap, (pmm) shareDataInfo, z);
            LogUtil.a("Share_BaseShareTemplate", "share_sport cameraShareDataInfo setImageBitmap");
        } else if (shareDataInfo instanceof gye) {
            c(this.ap, (gye) shareDataInfo, z);
        }
    }

    public void a() {
        e.c().h();
        PlayerView playerView = this.an;
        if (playerView != null) {
            playerView.setPlayer(null);
        }
        GestureBorderImageView gestureBorderImageView = this.ap;
        if (gestureBorderImageView != null) {
            gestureBorderImageView.setVisibility(0);
        }
        PlayerView playerView2 = this.an;
        if (playerView2 != null) {
            playerView2.setVisibility(8);
        }
    }

    public boolean c() {
        VideoInfoManager videoInfoManager = getVideoInfoManager();
        if (videoInfoManager == null) {
            return false;
        }
        return videoInfoManager.h();
    }

    protected void c(ImageView imageView, ShareDataInfo shareDataInfo, boolean z) {
        Drawable drawableD;
        LogUtil.a("Share_BaseShareTemplate", "share_sport loadItemImageViewByPath enter");
        if (shareDataInfo == null || TextUtils.isEmpty(shareDataInfo.getPath())) {
            LogUtil.a("Share_BaseShareTemplate", "loadItemImageViewByPath params null");
            return;
        }
        File file = new File(CommonUtil.c(shareDataInfo.getPath()));
        if (file.exists()) {
            LogUtil.a("Share_BaseShareTemplate", "loadItemByPath file size:", Long.valueOf(file.length()), " cloudSize:", Integer.valueOf(shareDataInfo.getImageSize()));
            if (file.length() < shareDataInfo.getImageSize()) {
                return;
            }
            RequestOptions requestOptionsCenterCrop = new RequestOptions().centerCrop();
            if (z && (drawableD = qqf.d(qqf.c(shareDataInfo.getPath()))) != null) {
                requestOptionsCenterCrop = new RequestOptions().placeholder(drawableD).centerCrop();
            }
            qqf.c(file, requestOptionsCenterCrop, imageView);
            LogUtil.a("Share_BaseShareTemplate", "share_sport loadImage exit");
        }
    }

    protected void b(StickerImageView stickerImageView, ShareDataInfo shareDataInfo) {
        if (shareDataInfo == null || TextUtils.isEmpty(shareDataInfo.getPath())) {
            LogUtil.a("Share_BaseShareTemplate", "setImageViewByPath params null");
            return;
        }
        String path = shareDataInfo.getPath();
        if (TextUtils.isEmpty(path) || !new File(CommonUtil.c(path)).exists() || path.equals(this.w)) {
            return;
        }
        this.w = path;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.d.getResources(), BitmapFactory.decodeFile(path, options));
        this.y = bitmapDrawable;
        stickerImageView.d();
        stickerImageView.d(this.d, bitmapDrawable);
    }

    @Override // com.huawei.pluginsocialshare.view.BaseSharePreView
    public void refreshStickerConfig(pnb pnbVar) {
        if (pnbVar == null) {
            return;
        }
        b(pnbVar);
        int iA = pnbVar.a();
        if (iA == 0 || !this.h) {
            return;
        }
        if (iA == R.color.share_text_white_color) {
            iA = R.color.common_color_white;
        }
        LogUtil.a("Share_BaseShareTemplate", "refreshStickerConfig setNameTextColor");
        c(iA);
        if (pnbVar.c() == null && this.h && c()) {
            this.ar.setTextColor(qre.e(R.color.common_color_white));
            this.ak.setTextColor(qre.e(R.color.common_color_white));
            this.i.setTextColor(qre.e(R.color.common_color_white));
        }
    }

    private void b(pnb pnbVar) {
        pmx pmxVarC = pnbVar.c();
        if (pmxVarC == null) {
            return;
        }
        if (pmxVarC.c() == 0 || !pmxVarC.b()) {
            this.g.setImageDrawable(null);
            return;
        }
        if (pnbVar.d() == 0) {
            this.g.setImageResource(pmxVarC.c());
            return;
        }
        Drawable drawableC = qre.c(pmxVarC.c());
        int iD = pnbVar.d();
        if (!pnbVar.f()) {
            if (iD == R.color.share_text_white_color) {
                iD = qre.e(R.color.common_color_white);
            } else {
                iD = qre.e(pnbVar.d());
            }
        }
        if (drawableC != null) {
            this.g.setImageDrawable(qqf.c(drawableC, iD));
        }
    }

    private void c(int i) {
        this.ar.setTextColor(qre.e(i));
        this.i.setTextColor(qre.e(i));
        this.ak.setTextColor(qre.e(i));
        this.ah.d(qre.e(i));
    }

    @Override // com.huawei.pluginsocialshare.view.BaseSharePreView
    public void setUserInfo(Bitmap bitmap, String str) {
        setLogoInfo(true);
        if (this.ar == null || this.aj == null || this.i == null) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        this.ar.setVisibility(!zIsEmpty ? 0 : 8);
        this.aj.setVisibility(pnq.j() ? 0 : 8);
        if (bitmap != null) {
            this.aj.setImageBitmap(bitmap);
        } else {
            this.aj.setImageBitmap(qqf.e(R.mipmap.ic_personal_head, this.d));
        }
        if (!zIsEmpty) {
            this.ar.setText(str);
        }
        this.ar.setTextColor(qre.e(R.color.common_white_90alpha));
        this.i.setTextColor(qre.e(R.color.common_white_90alpha));
        if (pnq.d()) {
            pnq.e(this.ar);
        }
    }

    @Override // com.huawei.pluginsocialshare.view.BaseSharePreView
    public void setLogoInfo(boolean z) {
        View view = this.al;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.huawei.pluginsocialshare.view.BaseSharePreView
    public void showTipInfo(int i) {
        LogUtil.a("Share_BaseShareTemplate", "showTipInfo index:", Integer.valueOf(i));
        this.t.setVisibility(0);
        this.t.setText(qre.a(R.string.IDS_hwh_preview_tips, UnitUtil.e(i + 1, 1, 0)));
        this.ae.removeCallbacksAndMessages(null);
        this.ae.postDelayed(new Runnable() { // from class: com.huawei.pluginsocialshare.view.template.BaseShareTemplate.5
            @Override // java.lang.Runnable
            public void run() {
                BaseShareTemplate.this.t.setVisibility(8);
            }
        }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    private void b(RelativeLayout relativeLayout, int i) {
        if (this.h) {
            this.f22712b = i;
            e(relativeLayout, i);
            return;
        }
        int i2 = this.f22712b;
        if (i2 != 0) {
            e(relativeLayout, i2);
        } else {
            LogUtil.a("Share_BaseShareTemplate", "setContinuesLayoutBg noBranch.");
        }
    }

    private void e(RelativeLayout relativeLayout, int i) {
        if (i == R.color.common_color_white) {
            relativeLayout.setBackgroundResource(R.mipmap.con_bg_light);
        } else {
            relativeLayout.setBackgroundResource(R.mipmap.con_bg_dark);
        }
    }

    protected void a(TextView textView, String str) {
        if (TextUtils.isEmpty(str) || LanguageUtil.o(BaseApplication.getContext()) || LanguageUtil.q(BaseApplication.getContext()) || str.length() <= 10) {
            return;
        }
        textView.setTextSize(1, 8.0f);
    }

    protected void d(LinearLayout linearLayout, String str, int i) {
        int iA = qrs.a(str);
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < length; i2++) {
            int iPow = iA / ((int) Math.pow(10.0d, (length - 1) - i2));
            if (length == 1) {
                arrayList.add(e(length, 0, i));
            }
            arrayList.add(e(length, iPow % 10, i));
        }
        if (LanguageUtil.c(this.d)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                linearLayout.addView((View) arrayList.get(size));
            }
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linearLayout.addView((View) it.next());
        }
    }

    protected View e(int i, int i2, int i3) {
        LogUtil.a("Share_BaseShareTemplate", "getContinueItemView data:", Integer.valueOf(i2));
        View viewInflate = View.inflate(this.d, R.layout.share_data_continue_item, null);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.continue_item_layout);
        TextView textView = (TextView) viewInflate.findViewById(R.id.data);
        textView.setText(UnitUtil.e(i2, 1, 0));
        if (i3 != 0) {
            b(relativeLayout, i3);
        }
        if (i > 2) {
            textView.setTextSize(1, 30.0f);
            relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(qrs.d(this.d, 26.0f), qrs.d(this.d, 40.0f)));
        } else {
            relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(qrs.d(this.d, 36.0f), -2));
        }
        textView.setTypeface(this.z);
        return viewInflate;
    }

    public CharSequence d(pna pnaVar, int i, int i2, boolean z) {
        if (!"OAL_TIME".equals(pnaVar.a())) {
            return pnaVar.c();
        }
        return pns.d(CommonUtil.m(this.d, pnaVar.c()), i, i2, z);
    }

    @Override // com.huawei.pluginsocialshare.view.BaseSharePreView
    public void setPageViewModel(PageViewModel pageViewModel) {
        this.k = pageViewModel;
    }

    protected void c(TrackSimpleView trackSimpleView, List<jpg> list) {
        if (trackSimpleView.getPoints() == null || list.size() != trackSimpleView.getPoints().size()) {
            LogUtil.a("Share_BaseShareTemplate", "refreshPoints points change.");
            trackSimpleView.e(list, 0);
        }
    }

    protected void c(TrackSimpleView trackSimpleView, int i) {
        if (i != trackSimpleView.getPaintColor()) {
            LogUtil.a("Share_BaseShareTemplate", "refreshTrackColor color change.");
            trackSimpleView.e(i);
        }
    }

    protected void a(List<pna> list, LinearLayout linearLayout) {
        if (linearLayout == null || linearLayout.getChildCount() <= 1) {
            return;
        }
        c(linearLayout);
        c(list, linearLayout);
        e(linearLayout);
        if (linearLayout.getMeasuredWidth() > this.s) {
            a(linearLayout);
        }
    }

    private void a(LinearLayout linearLayout) {
        int i = this.s;
        int childCount = linearLayout.getChildCount();
        int i2 = this.f;
        int i3 = 0;
        int measuredWidth = 0;
        for (int i4 = 0; i4 < linearLayout.getChildCount(); i4++) {
            View childAt = linearLayout.getChildAt(i4);
            TextView textView = (TextView) childAt.findViewById(R.id.data);
            if (textView.getMeasuredWidth() < ((TextView) childAt.findViewById(R.id.unit)).getMeasuredWidth()) {
                i3++;
            }
            measuredWidth += textView.getMeasuredWidth();
        }
        if (i3 == 0) {
            i3 = 1;
        }
        int i5 = (i - ((childCount - 1) * i2)) - measuredWidth;
        LogUtil.a("Share_BaseShareTemplate", "adjustWidth setDataLayoutWeight needRemainCount:", Integer.valueOf(i3), " remainWidth:", Integer.valueOf(i5));
        for (int i6 = 0; i6 < linearLayout.getChildCount(); i6++) {
            View childAt2 = linearLayout.getChildAt(i6);
            TextView textView2 = (TextView) childAt2.findViewById(R.id.data);
            TextView textView3 = (TextView) childAt2.findViewById(R.id.unit);
            if (textView2.getMeasuredWidth() >= textView3.getMeasuredWidth()) {
                textView3.setWidth(textView2.getMeasuredWidth());
            } else {
                textView3.setWidth(textView2.getMeasuredWidth() + ((int) ((i5 * 1.0f) / i3)));
            }
        }
    }

    private void c(List<pna> list, LinearLayout linearLayout) {
        int iB = b(linearLayout);
        ReleaseLogUtil.d(this.v, "adjustWidth adjustData w:", Integer.valueOf(iB), " sw:", Integer.valueOf(this.s));
        int iB2 = iB;
        int i = 0;
        int i2 = 0;
        do {
            int i3 = this.s;
            if (iB2 < i3 || i >= 10) {
                return;
            }
            i++;
            ReleaseLogUtil.d(this.v, "adjustWidth adjustData layoutWidth:", Integer.valueOf(iB2), " mScreenWidth:", Integer.valueOf(i3), " attempts:", Integer.valueOf(i));
            if (i2 == this.l) {
                return;
            }
            for (int i4 = 0; i4 < linearLayout.getChildCount(); i4++) {
                TextView textView = (TextView) linearLayout.getChildAt(i4).findViewById(R.id.data);
                if (textView.getTextSize() > qrs.d(this.d, this.l)) {
                    b(list, textView, i4);
                } else {
                    i2 = this.l;
                    break;
                }
            }
            iB2 = b(linearLayout);
        } while (iB != iB2);
    }

    private int b(LinearLayout linearLayout) {
        int measuredWidth = 0;
        int i = 0;
        for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
            if (i2 != 0) {
                i = this.f;
            }
            measuredWidth += linearLayout.getChildAt(i2).findViewById(R.id.data).getMeasuredWidth() + i;
        }
        return measuredWidth;
    }

    private void c(LinearLayout linearLayout) {
        linearLayout.measure(0, 0);
        int measuredWidth = linearLayout.getMeasuredWidth();
        ReleaseLogUtil.d(this.v, "adjustWidth adjustSpace w:", Integer.valueOf(measuredWidth), " sw:", Integer.valueOf(this.s));
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.s;
            if (measuredWidth <= i3 || i >= 10) {
                return;
            }
            i++;
            ReleaseLogUtil.d(this.v, "adjustWidth adjustSpace layoutWidth:", Integer.valueOf(measuredWidth), " mScreenWidth:", Integer.valueOf(i3), " attempts:", Integer.valueOf(i));
            if (i2 == this.o) {
                return;
            }
            int childCount = (measuredWidth - this.s) / (linearLayout.getChildCount() - 1);
            if (childCount == 0) {
                childCount = 1;
            }
            i2 = this.f - childCount;
            int i4 = this.o;
            if (i2 < i4) {
                i2 = i4;
            }
            this.f = i2;
            for (int i5 = 1; i5 < linearLayout.getChildCount(); i5++) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getChildAt(i5).getLayoutParams();
                layoutParams.setMarginStart(this.f);
                linearLayout.getChildAt(i5).setLayoutParams(layoutParams);
            }
            linearLayout.measure(0, 0);
            measuredWidth = linearLayout.getMeasuredWidth();
        }
    }

    private void e(LinearLayout linearLayout) {
        linearLayout.measure(0, 0);
        int measuredWidth = linearLayout.getMeasuredWidth();
        ReleaseLogUtil.d(this.v, "adjustWidth adjustUnit w:", Integer.valueOf(measuredWidth), " sw:", Integer.valueOf(this.s));
        int i = 0;
        int i2 = 0;
        int measuredWidth2 = measuredWidth;
        do {
            int i3 = this.s;
            if (measuredWidth2 < i3 || i >= 10) {
                return;
            }
            i++;
            ReleaseLogUtil.d(this.v, "adjustWidth adjustUnit layoutWidth:", Integer.valueOf(measuredWidth2), " mScreenWidth:", Integer.valueOf(i3), " attempts:", Integer.valueOf(i));
            if (i2 == this.m) {
                return;
            }
            for (int i4 = 0; i4 < linearLayout.getChildCount(); i4++) {
                TextView textView = (TextView) linearLayout.getChildAt(i4).findViewById(R.id.unit);
                if (textView.getTextSize() > qrs.d(this.d, this.m)) {
                    textView.setTextSize(qrs.e(this.d, textView.getTextSize()) - 1);
                } else {
                    i2 = this.m;
                    break;
                }
            }
            linearLayout.measure(0, 0);
            measuredWidth2 = linearLayout.getMeasuredWidth();
        } while (measuredWidth != measuredWidth2);
    }

    private void b(List<pna> list, TextView textView, int i) {
        textView.setTextSize(qrs.e(this.d, textView.getTextSize()) - 1);
        int i2 = i + 1;
        if (njy.e(list, i2)) {
            return;
        }
        pna pnaVar = list.get(i2);
        if ("OAL_TIME".equals(pnaVar.a())) {
            textView.setText(d(pnaVar, qrs.e(this.d, textView.getTextSize()) - 1, 12, false));
        }
    }

    @Override // com.huawei.pluginsocialshare.view.BaseSharePreView
    public void setPageId(int i) {
        this.am = i;
    }

    @Override // com.huawei.pluginsocialshare.view.BaseSharePreView
    public void hidePage(int i) {
        this.an.setPlayer(null);
    }

    @Override // com.huawei.pluginsocialshare.view.BaseSharePreView
    public void playerStart(int i) {
        ac = i;
        this.an.setPlayer(e.c().b());
        e.c().a();
    }

    @Override // com.huawei.pluginsocialshare.view.BaseSharePreView
    public void playerPause() {
        e.c().e();
    }

    @Override // com.huawei.pluginsocialshare.view.BaseSharePreView
    public void playerRelease() {
        e.c().h();
    }

    public static class VideoInfoManager implements Player.Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f22715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f22716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<ExoPlayer> f22717c;
        private VideoSize d;
        private Bitmap e;

        public VideoInfoManager(ExoPlayer exoPlayer, Uri uri) {
            this.f22717c = new WeakReference<>(exoPlayer);
            this.f22716b = uri;
        }

        @Override // androidx.media3.common.Player.Listener
        public void onVideoSizeChanged(VideoSize videoSize) {
            this.f22715a = this.f22715a || !e(this.d, videoSize);
            if (videoSize.width == 0 || videoSize.height == 0) {
                return;
            }
            this.d = videoSize;
        }

        public boolean h() {
            VideoSize videoSize = this.d;
            if (videoSize == null || this.e == null) {
                ReleaseLogUtil.d("Share_BaseShareTemplate", "isVideoBlackFillBackground invalid: ", videoSize, Boolean.valueOf(this.e == null));
                return false;
            }
            ReleaseLogUtil.d("Share_BaseShareTemplate", "isVideoBlackBackground VideoInfoManager:", this);
            return (this.d.height == 0 || this.d.width == 0 || this.e.getHeight() == 0 || ((float) this.d.width) / ((float) this.d.height) <= ((float) this.e.getWidth()) / ((float) this.e.getHeight())) ? false : true;
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i) {
            ExoPlayer exoPlayer = this.f22717c.get();
            if (exoPlayer == null) {
                ReleaseLogUtil.a("Share_BaseShareTemplate", "onPlaybackStateChangedmVideoPlayer is null");
            } else if (i == 4) {
                exoPlayer.seekTo(0L);
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerError(PlaybackException playbackException) {
            ReleaseLogUtil.a("Share_BaseShareTemplate", "onPlayerErr: " + playbackException, "errCodeName: " + playbackException.getErrorCodeName());
            LogUtil.e("Share_BaseShareTemplate", "onPlayerError() exoPlayer cause:", playbackException.getCause());
            if (this.f22716b == null) {
                return;
            }
            for (BaseSharePreView baseSharePreView : ShareCustomFragment.b()) {
                if (baseSharePreView instanceof BaseShareTemplate) {
                    ((BaseShareTemplate) baseSharePreView).a();
                }
            }
            HandlerExecutor.b(new Runnable() { // from class: ppn
                @Override // java.lang.Runnable
                public final void run() {
                    Toast.makeText(BaseApplication.getContext(), qre.f(R.string.IDS_share_custom_video_format_limit_new), 0).show();
                }
            });
        }

        public Uri a() {
            return this.f22716b;
        }

        public VideoSize e() {
            return this.d;
        }

        public Bitmap b() {
            return this.e;
        }

        public void d(Bitmap bitmap) {
            this.f22715a = this.f22715a || !a(this.e, bitmap);
            this.e = bitmap;
        }

        public boolean c() {
            boolean z = this.f22715a;
            this.f22715a = false;
            return z;
        }

        private boolean e(VideoSize videoSize, VideoSize videoSize2) {
            if (videoSize == videoSize2) {
                return true;
            }
            return videoSize != null && videoSize2 != null && videoSize.width == videoSize2.width && videoSize.height == videoSize2.height;
        }

        private boolean a(Bitmap bitmap, Bitmap bitmap2) {
            if (bitmap == bitmap2) {
                return true;
            }
            if (bitmap == null || bitmap2 == null || bitmap.getWidth() != bitmap2.getWidth() || bitmap.getHeight() != bitmap2.getHeight()) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean zSameAs = bitmap.sameAs(bitmap2);
            LogUtil.a("Share_BaseShareTemplate", "bitmapEquals isSame=", Boolean.valueOf(zSameAs), ",cost:", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            return zSameAs;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer("VideoInfoManager{,w=");
            stringBuffer.append(this.d.width);
            stringBuffer.append(",h=").append(this.d.height);
            stringBuffer.append("}");
            return stringBuffer.toString();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private VideoInfoManager f22718a;
        private ExoPlayer d;

        private e() {
        }

        static class d {
            private static final e d = new e();
        }

        public static e c() {
            return d.d;
        }

        public void b(Context context, Uri uri) {
            if (this.d != null) {
                return;
            }
            DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(context);
            defaultTrackSelector.setParameters(defaultTrackSelector.buildUponParameters().setForceHighestSupportedBitrate(true));
            this.d = new ExoPlayer.Builder(context).setTrackSelector(defaultTrackSelector).setLoadControl(new DefaultLoadControl.Builder().setBufferDurationsMs(2000, 5000, 1000, 2000).build()).setRenderersFactory(new DefaultRenderersFactory(context).setEnableDecoderFallback(true)).build();
            this.d.setMediaSource(new DefaultMediaSourceFactory(new DefaultDataSource.Factory(context)).createMediaSource(new MediaItem.Builder().setUri(uri).setClippingConfiguration(new MediaItem.ClippingConfiguration.Builder().setStartPositionMs(0L).setEndPositionMs(30000L).build()).build()));
            VideoInfoManager videoInfoManager = new VideoInfoManager(this.d, uri);
            this.f22718a = videoInfoManager;
            this.d.addListener(videoInfoManager);
            this.d.prepare();
        }

        public void a() {
            ExoPlayer exoPlayer = this.d;
            if (exoPlayer == null) {
                return;
            }
            if (exoPlayer.getPlaybackState() == 1) {
                this.d.prepare();
            }
            this.d.seekTo(0L);
            this.d.play();
        }

        public void e() {
            ExoPlayer exoPlayer = this.d;
            if (exoPlayer != null) {
                exoPlayer.pause();
            }
        }

        public void h() {
            ExoPlayer exoPlayer = this.d;
            if (exoPlayer != null) {
                exoPlayer.stop();
                VideoInfoManager videoInfoManager = this.f22718a;
                if (videoInfoManager != null) {
                    this.d.removeListener(videoInfoManager);
                    this.f22718a = null;
                }
                this.d.release();
                this.d = null;
            }
        }

        public ExoPlayer b() {
            return this.d;
        }

        public VideoInfoManager d() {
            return this.f22718a;
        }
    }
}
