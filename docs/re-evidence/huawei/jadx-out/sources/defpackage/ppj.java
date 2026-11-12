package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
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
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.view.sharewatermark.TrackSimpleView;
import com.huawei.pluginsocialshare.view.stickerview.MultiTouchObject;
import com.huawei.pluginsocialshare.view.stickerview.StickerImageView;
import com.huawei.pluginsocialshare.view.stickerview.StickerImageViewListener;
import com.huawei.pluginsocialshare.view.template.BaseShareTemplate;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class ppj extends BaseShareTemplate implements StickerImageViewListener {
    private LinearLayout ac;
    private RelativeLayout ae;
    private RelativeLayout af;
    private HealthTextView ag;
    private ImageView ah;
    private int ai;
    private TextView aj;
    private LinearLayout ak;
    private RelativeLayout al;
    private StickerImageView am;
    private TextView an;
    private TextView ao;
    private Handler ap;
    private TrackSimpleView aq;
    private int ar;
    private List<TextView> as;
    private pna at;
    private RelativeLayout au;

    public ppj(Context context, HealthBubbleLayout healthBubbleLayout) {
        super(context, healthBubbleLayout);
        this.as = new ArrayList();
        this.ap = new Handler(Looper.getMainLooper());
        this.v = "Share_ShareCommonTemplate";
    }

    @Override // com.huawei.pluginsocialshare.view.template.BaseShareTemplate, com.huawei.pluginsocialshare.view.BaseSharePreView
    public void initContentView() {
        super.initContentView();
        this.f22711a = View.inflate(this.d, R.layout.share_common_template, null);
        lrd.c(this.f22711a, 2);
        this.ae = (RelativeLayout) this.f22711a.findViewById(R.id.share_data_template_t1);
        this.al = (RelativeLayout) this.f22711a.findViewById(R.id.share_data_layout1);
        this.ak = (LinearLayout) this.f22711a.findViewById(R.id.share_data_template_layout);
        this.au = (RelativeLayout) this.f22711a.findViewById(R.id.trackViewLayout);
        this.an = (TextView) this.f22711a.findViewById(R.id.data1);
        this.aj = (TextView) this.f22711a.findViewById(R.id.unit1);
        this.ao = (TextView) this.f22711a.findViewById(R.id.title);
        this.aq = (TrackSimpleView) this.f22711a.findViewById(R.id.track_share_simple_track);
        this.ah = (ImageView) this.f22711a.findViewById(R.id.track_share_bitmap_track);
        StickerImageView stickerImageView = (StickerImageView) this.f22711a.findViewById(R.id.sticker);
        this.am = stickerImageView;
        stickerImageView.setListener(this);
        this.af = (RelativeLayout) this.f22711a.findViewById(R.id.continuesViewLayout);
        this.ac = (LinearLayout) this.f22711a.findViewById(R.id.continues_layout);
        this.ag = (HealthTextView) this.f22711a.findViewById(R.id.continues_name);
        pns.b(this.an, this.z);
        pns.b(this.aj, this.z);
        this.ao.setTypeface(this.z);
        this.j = true;
    }

    @Override // com.huawei.pluginsocialshare.view.template.BaseShareTemplate, com.huawei.pluginsocialshare.view.BaseSharePreView
    public void refreshStickerConfig(pnb pnbVar) {
        if (pnbVar == null) {
            return;
        }
        ShareDataInfo shareDataInfoB = pnbVar.b();
        if (shareDataInfoB != null) {
            b(shareDataInfoB);
        }
        this.h = pnbVar.i();
        if (this.h && pnbVar.a() > 0) {
            this.ar = pnbVar.a();
            c(pnbVar);
            j();
        }
        super.refreshStickerConfig(pnbVar);
    }

    private void b(ShareDataInfo shareDataInfo) {
        if (shareDataInfo.getValidityType() == -1) {
            this.am.setVisibility(8);
            return;
        }
        this.am.setVisibility(0);
        if (shareDataInfo instanceof pmr) {
            pmr pmrVar = (pmr) shareDataInfo;
            if (this.u == pmrVar.c()) {
                return;
            }
            this.u = pmrVar.c();
            this.am.d();
            this.am.c(this.d, pmrVar.c());
            d();
            return;
        }
        if (shareDataInfo instanceof gyi) {
            b(this.am, (gyi) shareDataInfo);
            d();
            return;
        }
        LogUtil.a("Share_ShareCommonTemplate", "refreshStickerIcon no branch");
    }

    private void c(pnb pnbVar) {
        int iA = pnbVar.a();
        this.ar = iA;
        if (pnbVar.c() == null && this.h && c()) {
            this.ar = R.color.common_color_white;
        }
        if (iA == R.color.share_text_white_color) {
            this.ar = R.color.common_color_white;
        }
        this.an.setTextColor(qre.e(this.ar));
        this.aj.setTextColor(qre.e(this.ar));
        this.ao.setTextColor(qre.e(this.ar));
        if (njy.e(this.as)) {
            return;
        }
        Iterator<TextView> it = this.as.iterator();
        while (it.hasNext()) {
            it.next().setTextColor(qre.e(this.ar));
        }
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
        this.at = pmwVar.h();
        j();
        this.ao.setText(String.format("%s %s", pmwVar.e(), pmwVar.c()));
        String strA = pmwVar.a();
        if (!TextUtils.isEmpty(strA)) {
            this.i.setText(strA);
            this.i.setVisibility(0);
        } else {
            this.i.setVisibility(8);
        }
        e(listD);
    }

    private void j() {
        pna pnaVar = this.at;
        if (pnaVar == null) {
            return;
        }
        if (njy.b(pnaVar.j()) && this.at.o()) {
            g();
            return;
        }
        if (!TextUtils.isEmpty(this.at.m()) && this.at.o()) {
            i();
        } else if (this.at.e() != null && this.at.o()) {
            f();
        } else {
            health.compact.a.util.LogUtil.c("Share_ShareCommonTemplate", "setTrackDataLayout no branch");
            this.au.setVisibility(8);
        }
    }

    private void f() {
        this.aq.setVisibility(8);
        this.ah.setVisibility(8);
        this.af.setVisibility(0);
        this.au.setVisibility(0);
        this.au.setBackgroundColor(qre.e(R.color.transparent));
        this.ag.setText(this.at.l());
        if (this.ar != 0 && this.h) {
            b();
        }
        this.ag.setTypeface(this.aa);
        a(this.ag, this.at.l());
        String strC = this.at.c();
        this.ac.removeAllViews();
        d(this.ac, strC, this.ar);
    }

    private void b() {
        Drawable drawableC = qre.c(R.drawable.share_continue_rect_bg);
        if (drawableC == null) {
            return;
        }
        if (this.ar == R.color.common_color_white) {
            this.ag.setBackground(drawableC);
        } else {
            this.ag.setBackground(qqf.c(drawableC, qre.e(R.color.common_black_30alpha)));
        }
    }

    private void i() {
        this.aq.setVisibility(8);
        this.af.setVisibility(8);
        this.ah.setVisibility(0);
        this.au.setVisibility(0);
        this.au.setBackgroundColor(qre.e(R.color.transparent));
        Bitmap bitmapC = qqf.c(this.at.m());
        if (bitmapC == null) {
            return;
        }
        if (this.ar != 0) {
            this.ah.setImageDrawable(qqf.c(qqf.d(bitmapC), qre.e(this.ar)));
        } else {
            this.ah.setImageDrawable(qqf.d(bitmapC));
        }
    }

    private void g() {
        this.aq.setVisibility(0);
        this.ah.setVisibility(8);
        this.af.setVisibility(8);
        this.aq.a(qrs.d(this.d, 4.0f));
        if (this.ar != 0) {
            h();
        } else {
            this.au.setBackgroundResource(R.mipmap.share_track_bg);
        }
        c(this.aq, this.at.j());
        this.au.setVisibility(0);
    }

    private void h() {
        if (this.h) {
            c(this.aq, qre.e(this.ar));
            Drawable drawableC = qre.c(R.mipmap.share_track_bg);
            if (drawableC != null) {
                this.au.setBackground(qqf.c(drawableC, qre.e(this.ar)));
            }
        }
    }

    private void e(List<pna> list) {
        int size = list.size();
        LogUtil.a("Share_ShareCommonTemplate", "refreshData size:", Integer.valueOf(size));
        a(this.an, this.au, size);
        this.o = qrs.d(this.d, 8.0f);
        this.l = 12;
        this.m = 8;
        this.ak.removeAllViews();
        c(list);
        c(list, size);
    }

    private void c(List<pna> list, int i) {
        c(list, this.al);
        if (i != 1) {
            a(list, this.ak);
        }
    }

    private void c(List<pna> list) {
        this.as.clear();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            pna pnaVar = list.get(i);
            if (i == 0) {
                this.an.setText(d(pnaVar, 40, 12, false));
                this.aj.setText(pnaVar.l());
                this.an.setContentDescription(pnaVar.c() + pnaVar.l());
            } else {
                this.ak.addView(a(pnaVar, i));
            }
        }
    }

    private void c(List<pna> list, RelativeLayout relativeLayout) {
        if (relativeLayout == null || njy.e(list)) {
            return;
        }
        pna pnaVar = list.get(0);
        this.ai = 12;
        relativeLayout.measure(0, 0);
        int measuredWidth = relativeLayout.getMeasuredWidth();
        int iD = (this.s - (this.au.getVisibility() == 0 ? qrs.d(this.d, 115.0f) : 0)) - qrs.d(this.d, 16.0f);
        LogUtil.a("Share_ShareCommonTemplate", "adjustFirstRowLayoutWidth layoutWidth:" + measuredWidth + " contentWidth:" + iD);
        int i = 0;
        int measuredWidth2 = measuredWidth;
        while (measuredWidth2 > iD && i != this.ai) {
            if (this.an.getTextSize() > qrs.d(this.d, this.ai)) {
                this.an.setTextSize(qrs.e(this.d, this.an.getTextSize()) - 1);
                if ("OAL_TIME".equals(pnaVar.a())) {
                    this.an.setText(d(pnaVar, qrs.e(this.d, this.an.getTextSize()) - 1, 12, false));
                }
            } else {
                i = this.ai;
            }
            relativeLayout.measure(0, 0);
            measuredWidth2 = relativeLayout.getMeasuredWidth();
            LogUtil.a("Share_ShareCommonTemplate", "adjustFirstRowLayoutWidth layoutWidth:", Integer.valueOf(measuredWidth2), " testSize:", Integer.valueOf(qrs.e(this.d, this.an.getTextSize())), " newSize=", Integer.valueOf(i));
            if (measuredWidth <= measuredWidth2) {
                LogUtil.a("Share_ShareCommonTemplate", "adjustFirstRowLayoutWidth The height not change,Exit.");
                return;
            }
        }
    }

    private String d(pna pnaVar) {
        return TextUtils.isEmpty(pnaVar.h()) ? pnaVar.l() : pnaVar.h();
    }

    private View a(pna pnaVar, int i) {
        View viewInflate = View.inflate(this.d, R.layout.share_data_template_item, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.data);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.unit);
        textView.setText(d(pnaVar, 20, 12, false));
        textView2.setText(d(pnaVar));
        textView.setContentDescription(pnaVar.l() + pnaVar.c());
        int i2 = this.ar;
        if (i2 != 0) {
            textView.setTextColor(qre.e(i2));
            textView2.setTextColor(qre.e(this.ar));
        }
        pns.b(textView, this.ab);
        pns.b(textView2, this.ab);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (i > 1) {
            layoutParams.setMarginStart(this.f);
        }
        viewInflate.setLayoutParams(layoutParams);
        this.as.add(textView);
        this.as.add(textView2);
        return viewInflate;
    }

    private void a(TextView textView, RelativeLayout relativeLayout, int i) {
        int iD;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        textView.setTextSize(i == 1 ? 56.0f : 40.0f);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.al.getLayoutParams();
        if (i == 1) {
            layoutParams2.setMargins(0, 0, 0, qrs.d(this.d, 12.0f));
        } else {
            layoutParams2.setMargins(0, 0, 0, 0);
        }
        this.al.setLayoutParams(layoutParams2);
        if (i == 3) {
            iD = qrs.d(this.d, 56.0f);
        } else {
            iD = qrs.d(this.d, 32.0f);
        }
        this.f = iD;
        layoutParams.addRule(8, i == 2 ? this.ak.getId() : this.ae.getId());
        relativeLayout.setLayoutParams(layoutParams);
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.StickerImageViewListener
    public void onImageObjectSelected(MultiTouchObject multiTouchObject) {
        this.ap.removeCallbacksAndMessages(null);
        LogUtil.a("Share_ShareCommonTemplate", "image object selected");
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.StickerImageViewListener
    public void onImageObjectDropped() {
        LogUtil.a("Share_ShareCommonTemplate", "image object dropped");
        this.am.e(this.q, new IBaseResponseCallback() { // from class: ppj.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i != 0) {
                    return;
                }
                ppj.this.am.b();
                if (ppj.this.y != null) {
                    ppj.this.am.d(ppj.this.d, ppj.this.y);
                } else {
                    ppj.this.am.c(ppj.this.d, ppj.this.u);
                }
            }
        });
        d();
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.StickerImageViewListener
    public void onCanvasTouched(ppf ppfVar) {
        LogUtil.a("Share_ShareCommonTemplate", "canvas touched");
        StickerImageView stickerImageView = this.am;
        if (stickerImageView == null) {
            return;
        }
        stickerImageView.deselectAll();
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.StickerImageViewListener
    public void onImageObjectDeleteSelected() {
        if (this.am == null) {
            return;
        }
        this.w = "";
        this.u = 0;
        this.am.d();
        this.k.d(0);
    }

    @Override // com.huawei.pluginsocialshare.view.template.BaseShareTemplate, com.huawei.pluginsocialshare.view.BaseSharePreView
    public View getShareContentView() {
        super.getShareContentView();
        e();
        return this.p;
    }

    private void e() {
        StickerImageView stickerImageView = this.am;
        if (stickerImageView == null) {
            return;
        }
        stickerImageView.deselectAll();
    }

    private void d() {
        Handler handler = this.ap;
        if (handler == null || this.am == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.ap.postDelayed(new Runnable() { // from class: ppj.3
            @Override // java.lang.Runnable
            public void run() {
                ppj.this.am.deselectAll();
            }
        }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }
}
