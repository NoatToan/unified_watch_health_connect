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
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class ppl extends BaseShareTemplate implements StickerImageViewListener {
    private LinearLayout ac;
    private HealthTextView ae;
    private TextView af;
    private LinearLayout ag;
    private int ah;
    private RelativeLayout ai;
    private int aj;
    private ImageView ak;
    private LinearLayout al;
    private StickerImageView am;
    private Handler an;
    private TrackSimpleView ao;
    private LinearLayout ap;
    private int aq;
    private TextView ar;
    private List<TextView> as;
    private RelativeLayout au;
    private pna ax;

    public ppl(Context context, HealthBubbleLayout healthBubbleLayout) {
        super(context, healthBubbleLayout);
        this.as = new ArrayList();
        this.an = new Handler(Looper.getMainLooper());
    }

    @Override // com.huawei.pluginsocialshare.view.template.BaseShareTemplate, com.huawei.pluginsocialshare.view.BaseSharePreView
    public void initContentView() {
        super.initContentView();
        this.f22711a = View.inflate(this.d, R.layout.share_large_font_template, null);
        this.al = (LinearLayout) this.f22711a.findViewById(R.id.share_large_font_layout);
        this.au = (RelativeLayout) this.f22711a.findViewById(R.id.trackViewLayout);
        this.ap = (LinearLayout) this.f22711a.findViewById(R.id.title_layout);
        this.ar = (TextView) this.f22711a.findViewById(R.id.title);
        this.af = (TextView) this.f22711a.findViewById(R.id.date);
        this.am = (StickerImageView) this.f22711a.findViewById(R.id.sticker);
        this.ag = (LinearLayout) this.f22711a.findViewById(R.id.data_content);
        this.ao = (TrackSimpleView) this.f22711a.findViewById(R.id.track_share_simple_track);
        this.ak = (ImageView) this.f22711a.findViewById(R.id.track_share_bitmap_track);
        this.ai = (RelativeLayout) this.f22711a.findViewById(R.id.continuesViewLayout);
        this.ac = (LinearLayout) this.f22711a.findViewById(R.id.continues_layout);
        this.ae = (HealthTextView) this.f22711a.findViewById(R.id.continues_name);
        this.am.setListener(this);
        this.ar.setTypeface(pns.j());
        this.af.setTypeface(pns.j());
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
        this.ax = pmwVar.h();
        g();
        this.ar.setText(pmwVar.e());
        this.af.setText(c(pmwVar.b()));
        String strA = pmwVar.a();
        if (!TextUtils.isEmpty(strA)) {
            this.i.setText(strA);
            this.i.setVisibility(0);
        } else {
            this.i.setVisibility(8);
        }
        int size = listD.size();
        this.ah = size;
        LogUtil.a("Share_ShareLargeFontTemplate", "refreshData size:", Integer.valueOf(size));
        this.al.removeAllViews();
        this.as.clear();
        for (int i = 0; i < listD.size(); i++) {
            this.al.addView(e(listD.get(i), i));
        }
        a(this.al, listD);
    }

    private void a(LinearLayout linearLayout, List<pna> list) {
        int i;
        int i2;
        if (linearLayout == null || njy.e(list)) {
            return;
        }
        linearLayout.measure(0, 0);
        int measuredWidth = linearLayout.getMeasuredWidth();
        LogUtil.a("Share_ShareLargeFontTemplate", "setDataSizeAdapter w:" + measuredWidth + " sw:" + this.s);
        if (measuredWidth < this.s) {
            return;
        }
        for (int i3 = 0; i3 < linearLayout.getChildCount(); i3++) {
            View childAt = linearLayout.getChildAt(i3);
            TextView textView = (TextView) childAt.findViewById(R.id.data);
            TextView textView2 = (TextView) childAt.findViewById(R.id.unit);
            if (this.ah <= 3) {
                i = 64;
                i2 = 30;
            } else {
                i = 56;
                i2 = 28;
            }
            textView.setTextSize(1, i);
            textView2.setTextSize(1, i2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = b(i3);
            layoutParams.bottomMargin = d(i3);
            childAt.setLayoutParams(layoutParams);
        }
    }

    private String c(String str) {
        long j;
        ReleaseLogUtil.c("Share_ShareLargeFontTemplate", "getSportTime sportTime:", str);
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.d("Share_ShareLargeFontTemplate", "getSportTime, NumberFormatException");
            j = 0;
        }
        return j == 0 ? "" : DateFormatUtil.d(j, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMMDD);
    }

    private void g() {
        pna pnaVar = this.ax;
        if (pnaVar == null) {
            return;
        }
        if (njy.b(pnaVar.j()) && this.ax.o()) {
            f();
            return;
        }
        if (!TextUtils.isEmpty(this.ax.m()) && this.ax.o()) {
            j();
        } else if (this.ax.e() != null && this.ax.o()) {
            h();
        } else {
            LogUtil.a("Share_ShareLargeFontTemplate", "setTrackDataLayout no branch");
            this.au.setVisibility(8);
        }
    }

    private void h() {
        this.ao.setVisibility(8);
        this.ak.setVisibility(8);
        this.ai.setVisibility(0);
        this.au.setVisibility(0);
        this.au.setBackgroundColor(qre.e(R.color.transparent));
        this.ae.setText(this.ax.l());
        if (this.aq != 0 && this.h) {
            b();
        }
        this.ae.setTypeface(this.aa);
        a(this.ae, this.ax.l());
        String strC = this.ax.c();
        this.ac.removeAllViews();
        d(this.ac, strC, this.aq);
    }

    private void b() {
        Drawable drawableC = qre.c(R.drawable.share_continue_rect_bg);
        if (drawableC == null) {
            return;
        }
        if (this.aq == R.color.common_color_white) {
            this.ae.setBackground(drawableC);
        } else {
            this.ae.setBackground(qqf.c(drawableC, qre.e(R.color.common_black_30alpha)));
        }
    }

    private void j() {
        this.ao.setVisibility(8);
        this.ai.setVisibility(8);
        this.ak.setVisibility(0);
        this.au.setVisibility(0);
        this.au.setBackgroundColor(qre.e(R.color.transparent));
        Bitmap bitmapC = qqf.c(this.ax.m());
        if (bitmapC == null) {
            return;
        }
        if (this.aq != 0 && this.h) {
            this.ak.setImageDrawable(qqf.c(qqf.d(bitmapC), qre.e(this.aq)));
        } else {
            this.ak.setImageDrawable(qqf.d(bitmapC));
        }
    }

    private void f() {
        this.ao.setVisibility(0);
        this.ak.setVisibility(8);
        this.ai.setVisibility(8);
        this.ao.a(qrs.d(this.d, 4.0f));
        if (this.aq != 0) {
            i();
        } else {
            this.au.setBackgroundResource(R.mipmap.share_track_bg);
        }
        c(this.ao, this.ax.j());
        this.au.setVisibility(0);
    }

    private void i() {
        if (this.h) {
            c(this.ao, qre.e(this.aq));
            Drawable drawableC = qre.c(R.mipmap.share_track_bg);
            if (drawableC != null) {
                this.au.setBackground(qqf.c(drawableC, qre.e(this.aq)));
            }
        }
    }

    @Override // com.huawei.pluginsocialshare.view.template.BaseShareTemplate, com.huawei.pluginsocialshare.view.BaseSharePreView
    public void refreshStickerConfig(pnb pnbVar) {
        if (pnbVar == null) {
            return;
        }
        ShareDataInfo shareDataInfoB = pnbVar.b();
        if (shareDataInfoB != null) {
            c(shareDataInfoB);
        }
        if (pnbVar.e() >= 0 && pnbVar.h() == 2) {
            e(pnbVar.e());
        }
        this.h = pnbVar.i();
        if (pnbVar.a() > 0) {
            this.aq = pnbVar.a();
            b(pnbVar);
            g();
        }
        super.refreshStickerConfig(pnbVar);
    }

    private void e(int i) {
        if (this.aj == i) {
            return;
        }
        this.aj = i;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.ag.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.au.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.ai.getLayoutParams();
        int iIndexOfChild = this.ag.indexOfChild(this.al);
        int iIndexOfChild2 = this.ag.indexOfChild(this.ap);
        if (i == 0) {
            layoutParams.removeRule(12);
            layoutParams.setMargins(0, qrs.d(this.d, 72.0f), 0, 0);
            layoutParams2.addRule(12);
            layoutParams2.setMargins(0, 0, 0, qrs.d(this.d, 24.0f));
            this.ag.removeView(this.al);
            this.ag.addView(this.al, iIndexOfChild2);
            layoutParams3.addRule(21);
            layoutParams3.addRule(12);
        } else {
            layoutParams.addRule(12);
            layoutParams.setMargins(0, 0, 0, 0);
            layoutParams2.removeRule(12);
            layoutParams2.setMargins(0, qrs.d(this.d, 24.0f), 0, 0);
            this.ag.removeView(this.ap);
            this.ag.addView(this.ap, iIndexOfChild);
            layoutParams3.removeRule(12);
            layoutParams3.addRule(21);
        }
        this.ag.setLayoutParams(layoutParams);
        this.au.setLayoutParams(layoutParams2);
        this.ai.setLayoutParams(layoutParams3);
    }

    private void c(ShareDataInfo shareDataInfo) {
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
        LogUtil.a("Share_ShareLargeFontTemplate", "refreshStickerIcon no branch");
    }

    private void b(pnb pnbVar) {
        if (pnbVar.a() == R.color.share_text_white_color) {
            this.aq = R.color.common_color_white;
        }
        if (pnbVar.c() == null && this.h && c()) {
            this.aq = R.color.common_color_white;
        }
        if (this.h) {
            this.ar.setTextColor(qre.e(this.aq));
            this.af.setTextColor(qre.e(this.aq));
        }
        if (njy.e(this.as)) {
            return;
        }
        Iterator<TextView> it = this.as.iterator();
        while (it.hasNext()) {
            it.next().setTextColor(qre.e(this.aq));
        }
    }

    private View e(pna pnaVar, int i) {
        int i2;
        int i3;
        View viewInflate = View.inflate(this.d, R.layout.share_large_font_item, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.data);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.unit);
        textView.setContentDescription(pnaVar.c() + pnaVar.l());
        this.as.add(textView);
        this.as.add(textView2);
        int i4 = this.aq;
        if (i4 != 0) {
            textView.setTextColor(qre.e(i4));
            textView2.setTextColor(qre.e(this.aq));
        }
        if (this.ah <= 3) {
            i2 = 76;
            i3 = 30;
        } else {
            i2 = 64;
            i3 = 28;
        }
        pns.b(textView, pns.g());
        pns.b(textView2, pns.h());
        textView.setTextSize(1, i2);
        textView2.setTextSize(1, i3);
        textView.setText(d(pnaVar, i2, i3, true));
        textView2.setText(pnaVar.l());
        d(viewInflate, i);
        return viewInflate;
    }

    private void d(View view, int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = a(i);
        layoutParams.bottomMargin = c(i);
        view.setLayoutParams(layoutParams);
    }

    private int a(int i) {
        Context context;
        float f;
        int iD;
        Context context2;
        float f2;
        if (i != 0) {
            if (this.ah <= 3) {
                context2 = this.d;
                f2 = 56.0f;
            } else {
                context2 = this.d;
                f2 = 48.0f;
            }
            iD = qrs.d(context2, f2);
        } else {
            if (this.ah <= 3) {
                context = this.d;
                f = 32.0f;
            } else {
                context = this.d;
                f = 28.0f;
            }
            iD = qrs.d(context, f);
        }
        return -iD;
    }

    private int c(int i) {
        int iD;
        int i2 = this.ah;
        if (i != i2 - 1) {
            return 0;
        }
        if (i2 <= 3) {
            iD = qrs.d(this.d, 16.0f);
        } else {
            iD = qrs.d(this.d, 12.0f);
        }
        return -iD;
    }

    private int b(int i) {
        Context context;
        float f;
        int iD;
        Context context2;
        float f2;
        if (i != 0) {
            if (this.ah <= 3) {
                context2 = this.d;
                f2 = 56.0f;
            } else {
                context2 = this.d;
                f2 = 48.0f;
            }
            iD = qrs.d(context2, f2);
        } else {
            if (this.ah <= 3) {
                context = this.d;
                f = 32.0f;
            } else {
                context = this.d;
                f = 28.0f;
            }
            iD = qrs.d(context, f);
        }
        return -iD;
    }

    private int d(int i) {
        int iD;
        int i2 = this.ah;
        if (i != i2 - 1) {
            return 0;
        }
        if (i2 <= 3) {
            iD = qrs.d(this.d, 16.0f);
        } else {
            iD = qrs.d(this.d, 12.0f);
        }
        return -iD;
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.StickerImageViewListener
    public void onImageObjectSelected(MultiTouchObject multiTouchObject) {
        this.an.removeCallbacksAndMessages(null);
        LogUtil.a("Share_ShareLargeFontTemplate", "image object selected");
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.StickerImageViewListener
    public void onImageObjectDropped() {
        LogUtil.a("Share_ShareLargeFontTemplate", "image object dropped");
        this.am.e(this.q, new IBaseResponseCallback() { // from class: ppl.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i != 0) {
                    return;
                }
                ppl.this.am.b();
                if (ppl.this.y != null) {
                    ppl.this.am.d(ppl.this.d, ppl.this.y);
                } else {
                    ppl.this.am.c(ppl.this.d, ppl.this.u);
                }
            }
        });
        d();
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.StickerImageViewListener
    public void onCanvasTouched(ppf ppfVar) {
        LogUtil.a("Share_ShareLargeFontTemplate", "canvas touched");
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
        Handler handler = this.an;
        if (handler == null || this.am == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.an.postDelayed(new Runnable() { // from class: ppl.2
            @Override // java.lang.Runnable
            public void run() {
                ppl.this.am.deselectAll();
            }
        }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }
}
