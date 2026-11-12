package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.media3.common.C;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.view.sharewatermark.TrackSimpleView;
import com.huawei.pluginsocialshare.view.stickerview.MultiTouchObject;
import com.huawei.pluginsocialshare.view.stickerview.StickerImageView;
import com.huawei.pluginsocialshare.view.stickerview.StickerImageViewListener;
import com.huawei.pluginsocialshare.view.template.BaseShareTemplate;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class ppk extends BaseShareTemplate implements StickerImageViewListener {
    private RelativeLayout ac;
    private HealthTextView ae;
    private LinearLayout af;
    private LinearLayout ag;
    private RelativeLayout ah;
    private LinearLayout ai;
    private int aj;
    private TextView ak;
    private LinearLayout al;
    private int am;
    private ImageView an;
    private Handler ao;
    private TextView ap;
    private StickerImageView aq;
    private LinearLayout ar;
    private List<TextView> as;
    private TrackSimpleView at;
    private pna au;
    private pna aw;
    private RelativeLayout ax;

    public ppk(Context context, HealthBubbleLayout healthBubbleLayout) {
        super(context, healthBubbleLayout);
        this.as = new ArrayList();
        this.ao = new Handler(Looper.getMainLooper());
    }

    @Override // com.huawei.pluginsocialshare.view.template.BaseShareTemplate, com.huawei.pluginsocialshare.view.BaseSharePreView
    public void initContentView() {
        super.initContentView();
        this.f22711a = View.inflate(this.d, R.layout.share_center_font_template, null);
        this.al = (LinearLayout) this.f22711a.findViewById(R.id.share_center_font_layout);
        this.ac = (RelativeLayout) this.f22711a.findViewById(R.id.bottomViewLayout);
        this.ax = (RelativeLayout) this.f22711a.findViewById(R.id.trackSimpleViewLayout);
        this.ar = (LinearLayout) this.f22711a.findViewById(R.id.title_layout);
        this.ap = (TextView) this.f22711a.findViewById(R.id.title);
        this.ak = (TextView) this.f22711a.findViewById(R.id.date);
        this.aq = (StickerImageView) this.f22711a.findViewById(R.id.sticker);
        this.af = (LinearLayout) this.f22711a.findViewById(R.id.data_content);
        this.ai = (LinearLayout) this.f22711a.findViewById(R.id.data_content_layout);
        this.at = (TrackSimpleView) this.f22711a.findViewById(R.id.track_share_simple_track);
        this.an = (ImageView) this.f22711a.findViewById(R.id.track_share_bitmap_track);
        this.ah = (RelativeLayout) this.f22711a.findViewById(R.id.continuesViewLayout);
        this.ag = (LinearLayout) this.f22711a.findViewById(R.id.continues_layout);
        this.ae = (HealthTextView) this.f22711a.findViewById(R.id.continues_name);
        this.aq.setListener(this);
        this.r.setVisibility(0);
        this.r.setBackgroundColor(qre.e(R.color.common_black_40alpha));
        this.g.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.af.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.ac.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.ah.getLayoutParams();
        if (pns.k()) {
            layoutParams.addRule(13);
            layoutParams2.removeRule(12);
            layoutParams2.setMargins(0, qrs.d(this.d, 24.0f), 0, 0);
        } else {
            layoutParams.setMargins(0, qrs.d(this.d, 104.0f), 0, 0);
            layoutParams2.addRule(12);
            layoutParams2.setMargins(0, 0, 0, qrs.d(this.d, 24.0f));
            layoutParams3.addRule(21);
            layoutParams3.addRule(12);
        }
        this.af.setLayoutParams(layoutParams);
        this.ac.setLayoutParams(layoutParams2);
        this.ah.setLayoutParams(layoutParams3);
        this.ap.setTypeface(pns.h());
        this.j = false;
    }

    @Override // com.huawei.pluginsocialshare.view.template.BaseShareTemplate, com.huawei.pluginsocialshare.view.BaseSharePreView
    public void refreshData(pmw pmwVar) {
        if (pmwVar == null) {
            return;
        }
        List<pna> listD = pmwVar.d();
        if (njy.e(listD)) {
            return;
        }
        this.au = pmwVar.h();
        this.aw = pmwVar.i();
        h();
        this.ap.setText(pmwVar.e());
        this.ak.setText(d(pmwVar.b()));
        String strA = pmwVar.a();
        if (!TextUtils.isEmpty(strA)) {
            this.i.setText(strA);
            this.i.setVisibility(0);
        } else {
            this.i.setVisibility(8);
        }
        int size = listD.size();
        this.am = size;
        LogUtil.a("Share_ShareCenterFontTemplate", "refreshData size:", Integer.valueOf(size));
        this.al.removeAllViews();
        this.as.clear();
        for (int i = 0; i < listD.size(); i++) {
            pna pnaVar = listD.get(i);
            LinearLayout linearLayout = this.al;
            boolean z = true;
            if (i != listD.size() - 1) {
                z = false;
            }
            linearLayout.addView(c(pnaVar, z));
        }
        d();
        i();
    }

    private void d() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.al.getLayoutParams();
        if (pns.k() || this.am <= 3) {
            layoutParams.topMargin = qrs.d(this.d, 36.0f);
        } else {
            layoutParams.topMargin = qrs.d(this.d, 24.0f);
        }
        this.al.setLayoutParams(layoutParams);
    }

    private void i() {
        this.ar.measure(0, 0);
        int measuredWidth = this.ar.getMeasuredWidth();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.ap.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.ak.getLayoutParams();
        LogUtil.a("Share_ShareCenterFontTemplate", "setTitleAdapter w:", Integer.valueOf(measuredWidth));
        if (measuredWidth > qrs.d(this.d, 200.0f)) {
            this.ar.setOrientation(1);
            layoutParams.gravity = 17;
            this.ap.setLayoutParams(layoutParams);
            layoutParams2.gravity = 17;
            layoutParams2.setMargins(0, qrs.d(this.d, 4.0f), 0, 0);
        } else {
            this.ar.setOrientation(0);
            layoutParams2.setMargins(qrs.d(this.d, 4.0f), 0, 0, 0);
        }
        this.ak.setLayoutParams(layoutParams2);
    }

    private String d(String str) {
        long j;
        ReleaseLogUtil.c("Share_ShareCenterFontTemplate", "getSportTime sportTime:", str);
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.d("Share_ShareCenterFontTemplate", "getSportTime, NumberFormatException");
            j = 0;
        }
        return j == 0 ? "" : DateFormatUtil.d(j, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMMDD);
    }

    private void h() {
        if (this.aw != null) {
            if (pns.k()) {
                j();
                this.ax.setVisibility(0);
            } else {
                this.ax.setVisibility(8);
            }
        }
        pna pnaVar = this.au;
        if (pnaVar == null) {
            return;
        }
        if (pnaVar.e() != null && this.au.o()) {
            f();
        } else {
            LogUtil.a("Share_ShareCenterFontTemplate", "setTrackDataLayout no branch");
            this.ac.setVisibility(8);
        }
    }

    private void f() {
        this.an.setVisibility(8);
        this.ah.setVisibility(0);
        this.ac.setVisibility(0);
        this.ac.setBackgroundColor(qre.e(R.color.transparent));
        this.ae.setText(this.au.l());
        this.ae.setTypeface(this.aa);
        a(this.ae, this.au.l());
        String strC = this.au.c();
        this.ag.removeAllViews();
        d(this.ag, strC, 0);
    }

    private void j() {
        this.at.a(qrs.d(this.d, 4.0f));
        if (this.aw.j() == null) {
            return;
        }
        c(this.at, qre.e(R.color.series_siding_template_button));
        this.at.c(qre.e(R.color.share_circle_color));
        c(this.at, this.aw.j());
    }

    @Override // com.huawei.pluginsocialshare.view.template.BaseShareTemplate, com.huawei.pluginsocialshare.view.BaseSharePreView
    public void refreshStickerConfig(pnb pnbVar) {
        if (pnbVar == null) {
            return;
        }
        ShareDataInfo shareDataInfoB = pnbVar.b();
        if (shareDataInfoB != null) {
            d(shareDataInfoB);
        }
        if (pnbVar.e() >= 0 && pnbVar.h() == 0) {
            b(pnbVar.e());
        }
        super.refreshStickerConfig(pnbVar);
    }

    private void b(int i) {
        if (this.aj == i) {
            return;
        }
        this.aj = i;
        if (pns.k()) {
            a(i);
        } else {
            d(i);
        }
    }

    private void d(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.af.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.ac.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.ah.getLayoutParams();
        if (i == 0) {
            layoutParams.removeRule(13);
            layoutParams.removeRule(12);
            layoutParams.setMargins(0, qrs.d(this.d, 104.0f), 0, 0);
            layoutParams2.addRule(12);
            layoutParams2.setMargins(0, 0, 0, qrs.d(this.d, 24.0f));
            layoutParams3.addRule(21);
            layoutParams3.addRule(12);
        } else if (i == 1) {
            layoutParams.removeRule(12);
            layoutParams.addRule(13);
            layoutParams.setMargins(0, 0, 0, 0);
            layoutParams2.removeRule(12);
            layoutParams2.setMargins(0, qrs.d(this.d, 24.0f), 0, 0);
            layoutParams3.removeRule(12);
            layoutParams3.addRule(21);
        } else {
            layoutParams.removeRule(13);
            layoutParams.addRule(12);
            layoutParams.setMargins(0, 0, 0, qrs.d(this.d, 88.0f));
            layoutParams2.removeRule(12);
            layoutParams2.setMargins(0, qrs.d(this.d, 24.0f), 0, 0);
            layoutParams3.removeRule(12);
            layoutParams3.addRule(21);
        }
        this.af.setLayoutParams(layoutParams);
        this.ah.setLayoutParams(layoutParams3);
    }

    private void a(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.af.getLayoutParams();
        layoutParams.addRule(13);
        layoutParams.setMargins(0, 0, 0, 0);
        this.af.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.ai.getLayoutParams();
        int iIndexOfChild = this.ai.indexOfChild(this.al);
        int iIndexOfChild2 = this.ai.indexOfChild(this.ax);
        if (i == 0) {
            this.ai.removeView(this.al);
            this.ai.addView(this.al, iIndexOfChild2);
        } else {
            this.ai.removeView(this.ax);
            this.ai.addView(this.ax, iIndexOfChild);
        }
        this.ai.setLayoutParams(layoutParams2);
    }

    private void d(ShareDataInfo shareDataInfo) {
        if (shareDataInfo.getValidityType() == -1) {
            this.aq.setVisibility(8);
            return;
        }
        this.aq.setVisibility(0);
        if (shareDataInfo instanceof pmr) {
            pmr pmrVar = (pmr) shareDataInfo;
            if (this.u == pmrVar.c()) {
                return;
            }
            this.u = pmrVar.c();
            this.aq.d();
            this.aq.c(this.d, pmrVar.c());
            b();
            return;
        }
        if (shareDataInfo instanceof gyi) {
            b(this.aq, (gyi) shareDataInfo);
            b();
            return;
        }
        LogUtil.a("Share_ShareCenterFontTemplate", "refreshStickerIcon no branch");
    }

    private View c(pna pnaVar, boolean z) {
        int i;
        View viewInflate = View.inflate(this.d, R.layout.share_center_font_item, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.data);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.unit);
        textView.setContentDescription(pnaVar.c() + pnaVar.l());
        this.as.add(textView);
        this.as.add(textView2);
        int i2 = this.am;
        if (i2 == 1) {
            i = 38;
        } else {
            i = (i2 == 3 || i2 == 2) ? 28 : 24;
        }
        pns.b(textView, pns.i());
        pns.b(textView2, pns.h());
        textView.setTextSize(1, i);
        textView2.setTextSize(1, 12);
        textView.setText(d(pnaVar, i, 12, true));
        textView2.setText(c(pnaVar));
        e(viewInflate, z);
        return viewInflate;
    }

    private String c(pna pnaVar) {
        return TextUtils.isEmpty(pnaVar.h()) ? pnaVar.l() : pnaVar.h();
    }

    private void e(View view, boolean z) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (z) {
            layoutParams.bottomMargin = 0;
        } else {
            layoutParams.bottomMargin = qrs.d(this.d, 16.0f);
        }
        view.setLayoutParams(layoutParams);
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.StickerImageViewListener
    public void onImageObjectSelected(MultiTouchObject multiTouchObject) {
        this.ao.removeCallbacksAndMessages(null);
        LogUtil.a("Share_ShareCenterFontTemplate", "image object selected");
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.StickerImageViewListener
    public void onImageObjectDropped() {
        LogUtil.a("Share_ShareCenterFontTemplate", "image object dropped");
        this.aq.e(this.q, new IBaseResponseCallback() { // from class: ppk.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i != 0) {
                    return;
                }
                ppk.this.aq.b();
                if (ppk.this.y != null) {
                    ppk.this.aq.d(ppk.this.d, ppk.this.y);
                } else {
                    ppk.this.aq.c(ppk.this.d, ppk.this.u);
                }
            }
        });
        b();
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.StickerImageViewListener
    public void onCanvasTouched(ppf ppfVar) {
        LogUtil.a("Share_ShareCenterFontTemplate", "canvas touched");
        StickerImageView stickerImageView = this.aq;
        if (stickerImageView == null) {
            return;
        }
        stickerImageView.deselectAll();
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.StickerImageViewListener
    public void onImageObjectDeleteSelected() {
        if (this.aq == null) {
            return;
        }
        this.w = "";
        this.u = 0;
        this.aq.d();
        this.k.d(0);
    }

    @Override // com.huawei.pluginsocialshare.view.template.BaseShareTemplate, com.huawei.pluginsocialshare.view.BaseSharePreView
    public View getShareContentView() {
        super.getShareContentView();
        e();
        return this.p;
    }

    private void e() {
        StickerImageView stickerImageView = this.aq;
        if (stickerImageView == null) {
            return;
        }
        stickerImageView.deselectAll();
    }

    private void b() {
        Handler handler = this.ao;
        if (handler == null || this.aq == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.ao.postDelayed(new Runnable() { // from class: ppk.3
            @Override // java.lang.Runnable
            public void run() {
                ppk.this.aq.deselectAll();
            }
        }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }
}
