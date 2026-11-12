package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.common.C;
import androidx.media3.common.Effect;
import androidx.media3.common.MediaItem;
import androidx.media3.common.VideoSize;
import androidx.media3.effect.BitmapOverlay;
import androidx.media3.effect.OverlayEffect;
import androidx.media3.effect.OverlaySettings;
import androidx.media3.effect.Presentation;
import androidx.media3.transformer.Composition;
import androidx.media3.transformer.DefaultEncoderFactory;
import androidx.media3.transformer.EditedMediaItem;
import androidx.media3.transformer.EditedMediaItemSequence;
import androidx.media3.transformer.Effects;
import androidx.media3.transformer.ExportException;
import androidx.media3.transformer.ExportResult;
import androidx.media3.transformer.ProgressHolder;
import androidx.media3.transformer.Transformer;
import androidx.media3.transformer.VideoEncoderSettings;
import com.google.android.gms.common.util.GmsVersion;
import com.google.android.material.tabs.TabLayout;
import com.google.common.collect.ImmutableList;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.activity.MultiplePreviewActivity;
import com.huawei.pluginsocialshare.view.EditShareMultipleFragment;
import com.huawei.pluginsocialshare.view.ShareItemFragment;
import com.huawei.pluginsocialshare.view.template.BaseShareTemplate;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.ui.commonui.tablayout.HealthTabLayout;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class pju {
    private Transformer ac;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45523c;
    private HealthBubbleLayout d;
    private CustomProgressDialog f;
    private EditedMediaItem h;
    private CustomProgressDialog.Builder i;
    private Context j;
    private int m;
    private boolean n;
    private FragmentManager o;
    private Runnable p;
    private int q;
    private View r;
    private String s;
    private gxt t;
    private int u;
    private HealthTabLayout v;
    private RelativeLayout w;
    private gxy x;
    private Uri z;
    private List<Fragment> k = new ArrayList();
    private List<gxy> y = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f45521a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f45522b = false;
    private boolean e = false;
    private final Handler l = new Handler(Looper.getMainLooper());
    private int g = -1;

    public pju(Context context, FragmentManager fragmentManager, Boolean bool) {
        this.j = context;
        this.o = fragmentManager;
        this.n = bool.booleanValue();
        e(context);
    }

    private void e(Context context) {
        View viewInflate = View.inflate(context, R.layout.activity_share_multiple, null);
        this.r = viewInflate;
        this.v = (HealthTabLayout) viewInflate.findViewById(R.id.share_tab_switch_layout);
        this.w = (RelativeLayout) this.r.findViewById(R.id.shareViewLayout);
        this.d = (HealthBubbleLayout) this.r.findViewById(R.id.bg_bubble_custom_guide);
        if (this.w != null && qrs.af(BaseApplication.getContext()) && !pns.o()) {
            this.w.post(new Runnable() { // from class: pka
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b();
                }
            });
        } else {
            g();
        }
        if (CommonUtil.ab(BaseApplication.getContext())) {
            return;
        }
        qpx.e(BaseApplication.getContext(), R.string.IDS_connect_error);
    }

    /* synthetic */ void b() {
        int i = BaseApplication.getContext().getResources().getConfiguration().orientation;
        LogUtil.j("Share_ShareMultipleView", "previewLayout viewHeight=", Integer.valueOf(this.w.getHeight()), " orientation=", Integer.valueOf(i));
        EditShareMultipleFragment.f22583c.put(Integer.valueOf(i), Integer.valueOf(this.w.getHeight()));
        g();
    }

    private void d(int i) {
        if (i != this.g) {
            this.d.setVisibility(8);
            return;
        }
        if (this.u == 1) {
            m();
        }
        if (pns.a().booleanValue()) {
            this.d.setVisibility(0);
            HandlerExecutor.c(new Runnable() { // from class: pjx
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a();
                }
            }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            this.d.setOnClickListener(new View.OnClickListener() { // from class: pjv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f45528c.a(view);
                }
            });
            pns.b(false);
        }
    }

    /* synthetic */ void a() {
        this.d.setVisibility(8);
    }

    /* synthetic */ void a(View view) {
        this.d.setVisibility(8);
    }

    private void m() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams.topMargin = 0;
        this.d.setLayoutParams(layoutParams);
    }

    private void g() {
        n();
        k();
    }

    private void n() {
        gxt gxtVarE = pjm.e();
        this.t = gxtVarE;
        if (gxtVarE == null) {
            return;
        }
        ArrayList<gxy> arrayListE = gxtVarE.e();
        this.y = arrayListE;
        this.u = arrayListE.size();
        if (njy.e(this.y)) {
            LogUtil.j("Share_ShareMultipleView", "ShareMultipleView, shareEditContents is empty");
            return;
        }
        this.k = b(this.y);
        p();
        a(this.q, this.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        d(i);
        a(i);
        pns.b(this.o, this.k, R.id.fragmentContainer, i, i2);
    }

    private void k() {
        if (njy.e(this.y)) {
            return;
        }
        if (this.u == 1) {
            this.v.setVisibility(8);
        }
        if (this.u > 3) {
            this.v.setTabMode(0);
        }
        if (BaseActivity.isMiui()) {
            this.v.setLayerType(1, null);
        }
        int i = 0;
        while (i < this.u) {
            TabLayout.Tab tabNewTab = this.v.newTab();
            tabNewTab.setCustomView(R.layout.tab_custom_layout);
            View customView = tabNewTab.getCustomView();
            if (customView != null) {
                TextView textView = (TextView) customView.findViewById(R.id.tab_text);
                String strF = this.y.get(i).f();
                textView.setText(strF);
                tabNewTab.setContentDescription(strF);
                if (i == this.q) {
                    tabNewTab.select();
                    customView.setBackgroundResource(R.drawable.tab_background_selected);
                    textView.setTextColor(qre.e(R.color.share_tab_background_selected_text_color));
                }
                this.v.addTab(tabNewTab, i, i == this.q);
            }
            i++;
        }
        t();
    }

    private void t() {
        this.v.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: pju.4
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(TabLayout.Tab tab) {
                View customView = tab.getCustomView();
                if (customView != null) {
                    TextView textView = (TextView) customView.findViewById(R.id.tab_text);
                    textView.setTextColor(qre.e(R.color.share_tab_background_selected_text_color));
                    customView.setBackgroundResource(R.drawable.tab_background_selected);
                    pju pjuVar = pju.this;
                    pjuVar.m = pjuVar.q;
                    pju pjuVar2 = pju.this;
                    pjuVar2.q = pjuVar2.v.getSelectedTabPosition();
                    lrd.b(customView, TextUtils.isEmpty(textView.getText()) ? "" : textView.getText().toString());
                    pju pjuVar3 = pju.this;
                    pjuVar3.a(pjuVar3.q, pju.this.m);
                }
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(TabLayout.Tab tab) {
                View customView = tab.getCustomView();
                if (customView != null) {
                    TextView textView = (TextView) customView.findViewById(R.id.tab_text);
                    textView.setTextColor(qre.e(R.color.share_tab_background_unselected_text_color));
                    customView.setBackgroundResource(R.drawable.tab_background_unselected);
                    lrd.a(customView, (CharSequence) (TextUtils.isEmpty(textView.getText()) ? "" : textView.getText().toString()), false);
                }
            }
        });
    }

    private void p() {
        boolean zBooleanValue = pns.b().booleanValue();
        this.f45521a = zBooleanValue;
        if (zBooleanValue) {
            for (int i = 0; i < this.u; i++) {
                if (this.y.get(i).m()) {
                    this.q = i;
                    break;
                }
            }
            pns.c(false);
        } else {
            this.q = 0;
        }
        this.f45523c = pns.d("shareLastTab" + this.y.get(0).h());
        LogUtil.a("Share_ShareMultipleView", "selectShareTab currentTraceIndex = " + this.f45523c);
        if (this.f45523c > 0) {
            y();
        }
    }

    public void d(int i, Intent intent) {
        EditShareMultipleFragment editShareMultipleFragmentE = e();
        if (editShareMultipleFragmentE != null) {
            editShareMultipleFragmentE.c(i, intent);
        }
    }

    public View d() {
        return this.r;
    }

    private List<Fragment> b(List<gxy> list) {
        if (njy.e(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(a(list.get(i), i));
            if (list.get(i).m()) {
                this.x = this.y.get(i);
            }
        }
        return arrayList;
    }

    private Fragment a(gxy gxyVar, int i) {
        if (gxyVar.m()) {
            this.g = i;
            return EditShareMultipleFragment.c(Boolean.valueOf(this.n), this.d);
        }
        return ShareItemFragment.c(i);
    }

    public boolean c() {
        if (this.x == null) {
            ReleaseLogUtil.e("Share_ShareMultipleView", "reviewLayout getShareContentView is null ");
            return false;
        }
        BaseShareTemplate.VideoInfoManager videoInfoManagerF = f();
        if (videoInfoManagerF != null) {
            boolean z = videoInfoManagerF.c() || !this.e;
            this.f45522b = z;
            if (z) {
                c(videoInfoManagerF);
                c(this.j, videoInfoManagerF);
            }
            String strE = pns.e("tmpShareVideo.mp4");
            this.s = strE;
            this.x.c(strE);
        } else {
            this.f45522b = false;
            this.x.c((String) null);
            Bitmap bitmapC = qqf.c(i());
            if (bitmapC == null) {
                ReleaseLogUtil.e("Share_ShareMultipleView", "reviewLayout getShareContentView share pic is null ");
                return false;
            }
            this.x.a(bitmapC);
        }
        return true;
    }

    private View i() {
        if (njy.e(this.k)) {
            ReleaseLogUtil.e("Share_ShareMultipleView", "getShareContentView mFragments is null ");
            return null;
        }
        EditShareMultipleFragment editShareMultipleFragmentE = e();
        if (editShareMultipleFragmentE == null) {
            ReleaseLogUtil.e("Share_ShareMultipleView", "getShareContentView editShareMotionFragment is null ");
            return null;
        }
        return editShareMultipleFragmentE.c();
    }

    private BaseShareTemplate.VideoInfoManager f() {
        EditShareMultipleFragment editShareMultipleFragmentE;
        if (njy.e(this.k) || (editShareMultipleFragmentE = e()) == null) {
            return null;
        }
        return editShareMultipleFragmentE.b();
    }

    public void c(BaseShareTemplate.VideoInfoManager videoInfoManager) {
        Uri uriA = videoInfoManager.a();
        if (uriA == null) {
            ReleaseLogUtil.d("Share_ShareMultipleView", "setEditedMediaItem videoUri is null");
            return;
        }
        MediaItem mediaItemBuild = new MediaItem.Builder().setUri(uriA).setClippingConfiguration(new MediaItem.ClippingConfiguration.Builder().setStartPositionMs(0L).setEndPositionMs(30000L).build()).build();
        this.h = new EditedMediaItem.Builder(mediaItemBuild).setEffects(new Effects(ImmutableList.of(), ImmutableList.copyOf((Collection) c(videoInfoManager, videoInfoManager.b())))).build();
        this.z = uriA;
    }

    public void c(Context context, BaseShareTemplate.VideoInfoManager videoInfoManager) {
        Uri uriA = videoInfoManager.a();
        if (uriA == null) {
            ReleaseLogUtil.d("Share_ShareMultipleView", "setTransformer videoUri is null");
            return;
        }
        this.ac = new Transformer.Builder(context).setEncoderFactory(new DefaultEncoderFactory.Builder(context).setRequestedVideoEncoderSettings(new VideoEncoderSettings.Builder().setBitrate(a(context, uriA)).build()).setEnableFallback(true).build()).build();
    }

    private List<Effect> c(BaseShareTemplate.VideoInfoManager videoInfoManager, Bitmap bitmap) {
        VideoSize videoSizeE = videoInfoManager.e();
        if (videoSizeE == null || bitmap == null) {
            ReleaseLogUtil.d("Share_ShareMultipleView", "getVideoEffects invalid: ", videoSizeE, Boolean.valueOf(bitmap == null));
            return new ArrayList();
        }
        ReleaseLogUtil.d("Share_ShareMultipleView", "getVideoEffects VideoInfoManager:", videoInfoManager);
        if (videoSizeE.height == 0 || videoSizeE.width == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        float width = bitmap.getWidth() / bitmap.getHeight();
        float f = videoSizeE.width;
        float f2 = f / width;
        if (videoInfoManager.h()) {
            arrayList.add(Presentation.createForWidthAndHeight((int) f, (int) f2, 0));
        } else {
            arrayList.add(Presentation.createForWidthAndHeight((int) f, (int) f2, 1));
        }
        arrayList.add(new OverlayEffect(ImmutableList.of(BitmapOverlay.createStaticBitmapOverlay(bitmap, new OverlaySettings.Builder().setScale(f / bitmap.getWidth(), f2 / bitmap.getHeight()).setOverlayFrameAnchor(0.0f, 0.0f).setBackgroundFrameAnchor(0.0f, 0.0f).build()))));
        return arrayList;
    }

    public int a(Context context, Uri uri) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        int i = GmsVersion.VERSION_SAGA;
        try {
            mediaMetadataRetriever.setDataSource(context, uri);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(20);
            ReleaseLogUtil.d("Share_ShareMultipleView", "getOriginalBitrate：", strExtractMetadata);
            if (strExtractMetadata != null) {
                i = Integer.parseInt(strExtractMetadata);
            }
            try {
                return i;
            } catch (IOException unused) {
                return i;
            }
        } catch (RuntimeException e) {
            ReleaseLogUtil.a("Share_ShareMultipleView", "getOriginalBitrate exception" + e);
            return GmsVersion.VERSION_SAGA;
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused2) {
                ReleaseLogUtil.d("Share_ShareMultipleView", "getOriginalBitrate release IOException");
            }
        }
    }

    private void a(int i) {
        if (njy.e(this.k, i)) {
            return;
        }
        Fragment fragment = this.k.get(i);
        if (fragment instanceof EditShareMultipleFragment) {
            ((EditShareMultipleFragment) fragment).a();
        }
    }

    public EditShareMultipleFragment e() {
        if (njy.e(this.k)) {
            return null;
        }
        for (int i = 0; i < this.k.size(); i++) {
            Fragment fragment = this.k.get(i);
            if (fragment instanceof EditShareMultipleFragment) {
                return (EditShareMultipleFragment) fragment;
            }
        }
        return null;
    }

    private void q() {
        CustomProgressDialog customProgressDialog = this.f;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            LogUtil.e("Share_ShareMultipleView", "showSynthesisProgressDialog startDownloadProgress progress exist");
            return;
        }
        LogUtil.a("Share_ShareMultipleView", "showSynthesisProgressDialog entry");
        this.i = new CustomProgressDialog.Builder(this.j);
        this.i.b(new View.OnClickListener() { // from class: pju.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (pju.this.ac != null) {
                    pju.this.ac.cancel();
                    pju.this.e = false;
                }
            }
        });
        this.f = this.i.c();
        this.i.d(qre.f(R.string.IDS_share_custom_video_export_cancel));
        this.i.e(qre.f(R.string.IDS_share_custom_video_export_desc));
        this.f.setCancelable(true);
        this.f.setCanceledOnTouchOutside(false);
        this.f.setWindowGravityParams(17);
        this.f.show();
    }

    private void s() {
        Transformer transformer = this.ac;
        if (transformer == null || this.h == null || this.s == null) {
            ReleaseLogUtil.e("Share_ShareMultipleView", "startTransformer invalid : ", transformer, this.h, this.s);
            return;
        }
        transformer.cancel();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.ac.addListener(new Transformer.Listener() { // from class: pju.5
            @Override // androidx.media3.transformer.Transformer.Listener
            public void onCompleted(Composition composition, ExportResult exportResult) {
                ReleaseLogUtil.d("Share_ShareMultipleView", "transformer cost=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                pju.this.l.removeCallbacksAndMessages(null);
                pju.this.e = true;
                if (pju.this.f.isShowing()) {
                    pju.this.f.dismiss();
                }
                pju.this.j();
            }

            @Override // androidx.media3.transformer.Transformer.Listener
            public void onError(Composition composition, ExportResult exportResult, ExportException exportException) {
                ReleaseLogUtil.a("Share_ShareMultipleView", "startTransformer onError: ", exportException.getMessage(), ",errCode:", Integer.valueOf(exportException.errorCode));
                if (exportException.errorCode == 5001 && pju.this.o() && composition.hdrMode != 2) {
                    ReleaseLogUtil.d("Share_ShareMultipleView", "retry convertHDRToSDR");
                    pju.this.ac.start(pju.c(pju.this.h), pju.this.s);
                    return;
                }
                BaseShareTemplate.e.c().a();
                if (pju.this.f.isShowing()) {
                    pju.this.f.dismiss();
                }
                pju.this.l.removeCallbacksAndMessages(null);
                pju.this.e = false;
                Toast.makeText(BaseApplication.getContext(), R.string.IDS_share_custom_video_unsupport, 0).show();
                pju.this.a(exportException);
            }
        });
        this.ac.start(this.h, this.s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ExportException exportException) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(9);
        String strF = CommonUtil.f();
        String strMaskValue = SharedPreferenceUtil.getInstance(BaseApplication.getContext()).maskValue(LoginInit.getInstance(this.j).getAccountInfo(1011));
        linkedHashMap.put("cpu_platform", strF);
        linkedHashMap.put("export_exception", exportException.getMessage());
        linkedHashMap.put("huid_mask", strMaskValue);
        linkedHashMap.put("sdk_ver", Build.VERSION.RELEASE);
        linkedHashMap.put("sdk_int", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("dev_manufacturer", Build.MANUFACTURER);
        linkedHashMap.put("dev_model", Build.MODEL);
        linkedHashMap.put("dev_brand", Build.BRAND);
        linkedHashMap.put("dev_display", Build.DISPLAY);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_VIDEO_TRANSFORM_ERROR_2129052.value(), linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 30 || this.j == null || this.z == null) {
            return false;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(this.j, this.z);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                ReleaseLogUtil.d("Share_ShareMultipleView", "isHDR colorTransfer:", strExtractMetadata, ", colorStandard:", strExtractMetadata2);
                int iE = CommonUtil.e(strExtractMetadata, 0);
                int iE2 = CommonUtil.e(strExtractMetadata2, 0);
                if ((iE == 7 || iE == 6) && iE2 == 6) {
                    z = true;
                }
                try {
                    return z;
                } catch (IOException unused) {
                    return z;
                }
            } finally {
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused2) {
                    ReleaseLogUtil.a("Share_ShareMultipleView", "isHDR IOException");
                }
            }
        } catch (IllegalArgumentException | SecurityException e) {
            ReleaseLogUtil.a("Share_ShareMultipleView", "isHDR Exception:", ExceptionUtils.c(e));
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused3) {
                ReleaseLogUtil.a("Share_ShareMultipleView", "isHDR IOException");
            }
            return false;
        }
    }

    public static Composition c(EditedMediaItem editedMediaItem) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(editedMediaItem);
        return new Composition.Builder(new EditedMediaItemSequence(arrayList), new EditedMediaItemSequence[0]).setHdrMode(2).build();
    }

    private void r() {
        CustomProgressDialog.Builder builder = this.i;
        if (builder == null || this.ac == null) {
            ReleaseLogUtil.e("Share_ShareMultipleView", "mCustomProgressDialogBuilder invalid：", builder, this.ac);
            return;
        }
        final ProgressHolder progressHolder = new ProgressHolder();
        Runnable runnable = new Runnable() { // from class: pju.3
            @Override // java.lang.Runnable
            public void run() {
                int progress = pju.this.ac.getProgress(progressHolder);
                if (progress != 0 && progress != 3) {
                    int i = progressHolder.progress;
                    pju.this.i.b(i);
                    pju.this.i.d(i);
                }
                if (progress != 0) {
                    pju.this.l.postDelayed(this, 500L);
                }
            }
        };
        this.p = runnable;
        this.l.post(runnable);
    }

    public void h() {
        if (this.f45522b) {
            s();
            q();
            r();
            return;
        }
        j();
    }

    public void j() {
        try {
            l();
            Intent intent = new Intent(this.j, (Class<?>) MultiplePreviewActivity.class);
            intent.putExtra("trackShareIndexKey", this.f45523c);
            intent.putExtra("tabPositionKey", this.q);
            this.j.startActivity(intent);
            fca.b(this.j);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("Share_ShareMultipleView", "startActivity catch e:", e.getMessage());
        }
    }

    private void l() {
        if (this.u < 3) {
            this.f45523c = this.q + 1;
        } else {
            this.f45523c = this.q;
        }
    }

    private void y() {
        if (this.u < 3) {
            this.q = this.f45523c - 1;
        } else {
            this.q = this.f45523c;
        }
        if (njy.e(this.k, this.q)) {
            this.q = 0;
        }
    }
}
