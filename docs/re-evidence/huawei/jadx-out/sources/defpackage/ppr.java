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
import com.huawei.pluginsocialshare.view.sharewatermark.MarkTrackSimpleView;
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
public class ppr extends BaseShareTemplate implements StickerImageViewListener {
    private LinearLayout ac;
    private TextView ae;
    private RelativeLayout af;
    private HealthTextView ag;
    private int ah;
    private LinearLayout ai;
    private final List<String> aj;
    private StickerImageView ak;
    private String al;
    private Handler am;
    private ImageView an;
    private MarkTrackSimpleView ao;
    private TextView ap;
    private pna aq;
    private int ar;
    private List<TextView> as;
    private pna av;
    private RelativeLayout aw;

    public ppr(Context context, HealthBubbleLayout healthBubbleLayout) {
        super(context, healthBubbleLayout);
        this.as = new ArrayList();
        this.am = new Handler(Looper.getMainLooper());
        this.aj = new ArrayList();
        this.v = "Share_ShareMarathonTemplate";
    }

    @Override // com.huawei.pluginsocialshare.view.template.BaseShareTemplate, com.huawei.pluginsocialshare.view.BaseSharePreView
    public void initContentView() {
        super.initContentView();
        this.f22711a = View.inflate(this.d, R.layout.share_marathon_template, null);
        this.ai = (LinearLayout) this.f22711a.findViewById(R.id.data_layout);
        this.aw = (RelativeLayout) this.f22711a.findViewById(R.id.trackViewLayout);
        this.ap = (TextView) this.f22711a.findViewById(R.id.title);
        this.ae = (TextView) this.f22711a.findViewById(R.id.date);
        this.ak = (StickerImageView) this.f22711a.findViewById(R.id.sticker);
        this.ao = (MarkTrackSimpleView) this.f22711a.findViewById(R.id.track_share_simple_track);
        this.af = (RelativeLayout) this.f22711a.findViewById(R.id.continuesViewLayout);
        this.ac = (LinearLayout) this.f22711a.findViewById(R.id.continues_layout);
        this.ag = (HealthTextView) this.f22711a.findViewById(R.id.continues_name);
        this.an = (ImageView) this.f22711a.findViewById(R.id.track_share_bitmap_track);
        this.ak.setListener(this);
        this.r.setVisibility(0);
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
        this.av = pmwVar.h();
        this.aq = pmwVar.i();
        d(listD);
        j();
        this.ap.setText(pmwVar.e());
        this.ae.setText(b(pmwVar.b()));
        String strA = pmwVar.a();
        if (!TextUtils.isEmpty(strA)) {
            this.i.setText(strA);
            this.i.setVisibility(0);
        } else {
            this.i.setVisibility(8);
        }
        int size = listD.size();
        this.ah = size;
        LogUtil.a("Share_ShareMarathonTemplate", "refreshData size:", Integer.valueOf(size));
        c(listD);
    }

    private void d(List<pna> list) {
        for (pna pnaVar : list) {
            if (!TextUtils.isEmpty(pnaVar.d())) {
                this.al = pnaVar.d();
                return;
            }
        }
    }

    private void c(List<pna> list) {
        int iD;
        int size = list.size();
        LogUtil.a("Share_ShareMarathonTemplate", "refreshData size:", Integer.valueOf(size));
        if (size == 3) {
            iD = qrs.d(this.d, 56.0f);
        } else {
            iD = qrs.d(this.d, 32.0f);
        }
        this.f = iD;
        this.o = qrs.d(this.d, 8.0f);
        if (size > 3) {
            this.l = 10;
            this.m = 8;
            this.f = qrs.d(this.d, 16.0f);
        } else {
            this.l = 12;
            this.m = 12;
        }
        this.ai.removeAllViews();
        b(list);
        c(list, size);
    }

    private void c(List<pna> list, int i) {
        a(list, this.ai);
    }

    private void b(List<pna> list) {
        this.as.clear();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.ai.addView(c(list.get(i), i));
        }
    }

    private String b(String str) {
        long j;
        ReleaseLogUtil.c("Share_ShareMarathonTemplate", "getSportTime sportTime:", str);
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.d("Share_ShareMarathonTemplate", "getSportTime, NumberFormatException");
            j = 0;
        }
        return j == 0 ? "" : DateFormatUtil.d(j, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMMDD);
    }

    private void j() {
        pna pnaVar = this.aq;
        if (pnaVar != null && njy.b(pnaVar.j())) {
            b(this.aq);
        }
        pna pnaVar2 = this.av;
        if (pnaVar2 == null) {
            return;
        }
        if (!TextUtils.isEmpty(pnaVar2.m()) && this.av.o()) {
            i();
        } else if (this.av.e() != null && this.av.o()) {
            g();
        } else {
            LogUtil.a("Share_ShareMarathonTemplate", "setTrackDataLayout no branch");
            this.aw.setVisibility(8);
        }
    }

    private void i() {
        this.af.setVisibility(8);
        this.an.setVisibility(0);
        this.aw.setVisibility(0);
        this.aw.setBackgroundColor(qre.e(R.color.transparent));
        Bitmap bitmapC = qqf.c(this.av.m());
        if (bitmapC == null) {
            return;
        }
        if (this.ar != 0 && this.h) {
            this.an.setImageDrawable(qqf.c(qqf.d(bitmapC), qre.e(this.ar)));
        } else {
            this.an.setImageDrawable(qqf.d(bitmapC));
        }
    }

    private void g() {
        this.an.setVisibility(8);
        this.af.setVisibility(0);
        this.aw.setVisibility(0);
        this.aw.setBackgroundColor(qre.e(R.color.transparent));
        this.ag.setText(this.av.l());
        if (this.ar != 0 && this.h) {
            d();
        }
        this.ag.setTypeface(this.aa);
        a(this.ag, this.av.l());
        String strC = this.av.c();
        this.ac.removeAllViews();
        d(this.ac, strC, this.ar);
    }

    private void d() {
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

    private void b(pna pnaVar) {
        this.ao.a(qrs.d(this.d, 2.0f));
        if (this.ar != 0) {
            h();
        }
        a(pnaVar);
    }

    private void a(pna pnaVar) {
        if (this.ao.getPoints() == null || pnaVar.j().size() != this.ao.getPoints().size()) {
            LogUtil.a("Share_ShareMarathonTemplate", "refreshPoints points change.");
            List<jpg> listJ = pnaVar.j();
            List<jpg> listF = pnaVar.f();
            List<Integer> listI = pnaVar.i();
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = listI.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (iIntValue >= 1 && iIntValue <= listF.size()) {
                    this.aj.add(iIntValue + " km");
                    arrayList.add(listF.get(iIntValue + (-1)));
                }
            }
            if (!TextUtils.isEmpty(this.al)) {
                this.aj.add(this.al + " km");
                arrayList.add(listJ.get(listJ.size() - 1));
            }
            this.ao.b(listJ, arrayList, this.aj, 0);
        }
    }

    private void h() {
        this.ao.setTrackColor(qre.e(this.ar), b(this.ar), qre.e(R.color.common_color_white));
    }

    private int b(int i) {
        if (i == R.color.common_color_white) {
            return qre.e(R.color.common_color_black);
        }
        if (i == R.color.share_text_black_color) {
            return qre.e(R.color.common_color_white);
        }
        LogUtil.a("Share_ShareMarathonTemplate", "getMarkTextColor noBranch.");
        return qre.e(R.color.common_color_black);
    }

    @Override // com.huawei.pluginsocialshare.view.template.BaseShareTemplate, com.huawei.pluginsocialshare.view.BaseSharePreView
    public void refreshStickerConfig(pnb pnbVar) {
        if (pnbVar == null) {
            return;
        }
        ShareDataInfo shareDataInfoB = pnbVar.b();
        if (shareDataInfoB != null) {
            e(shareDataInfoB);
        }
        this.h = pnbVar.i();
        if (pnbVar.a() > 0) {
            this.ar = pnbVar.a();
            a(pnbVar);
            j();
        }
        super.refreshStickerConfig(pnbVar);
    }

    private void e(ShareDataInfo shareDataInfo) {
        if (shareDataInfo.getValidityType() == -1) {
            this.ak.setVisibility(8);
            return;
        }
        this.ak.setVisibility(0);
        if (shareDataInfo instanceof pmr) {
            pmr pmrVar = (pmr) shareDataInfo;
            if (this.u == pmrVar.c()) {
                return;
            }
            this.u = pmrVar.c();
            this.ak.d();
            this.ak.c(this.d, pmrVar.c());
            b();
            return;
        }
        if (shareDataInfo instanceof gyi) {
            b(this.ak, (gyi) shareDataInfo);
            b();
            return;
        }
        LogUtil.a("Share_ShareMarathonTemplate", "refreshStickerIcon no branch");
    }

    private void a(pnb pnbVar) {
        if (pnbVar.a() == R.color.share_text_white_color) {
            this.ar = R.color.common_color_white;
        }
        if (pnbVar.c() == null && this.h && c()) {
            this.ar = R.color.common_color_white;
        }
        this.ap.setTextColor(qre.e(this.ar));
        this.ae.setTextColor(qre.e(this.ar));
        this.ae.setAlpha(0.6f);
        if (njy.e(this.as)) {
            return;
        }
        Iterator<TextView> it = this.as.iterator();
        while (it.hasNext()) {
            it.next().setTextColor(qre.e(this.ar));
        }
    }

    private View c(pna pnaVar, int i) {
        View viewInflate = View.inflate(this.d, R.layout.share_marathon_template_item, null);
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
        pns.b(textView, this.ad);
        pns.b(textView, this.ab);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (i > 0) {
            layoutParams.setMarginStart(this.f);
        }
        viewInflate.setLayoutParams(layoutParams);
        this.as.add(textView);
        this.as.add(textView2);
        return viewInflate;
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.StickerImageViewListener
    public void onImageObjectSelected(MultiTouchObject multiTouchObject) {
        this.am.removeCallbacksAndMessages(null);
        LogUtil.a("Share_ShareMarathonTemplate", "image object selected");
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.StickerImageViewListener
    public void onImageObjectDropped() {
        LogUtil.a("Share_ShareMarathonTemplate", "image object dropped");
        this.ak.e(this.q, new IBaseResponseCallback() { // from class: ppr.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i != 0) {
                    return;
                }
                ppr.this.ak.b();
                if (ppr.this.y != null) {
                    ppr.this.ak.d(ppr.this.d, ppr.this.y);
                } else {
                    ppr.this.ak.c(ppr.this.d, ppr.this.u);
                }
            }
        });
        b();
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.StickerImageViewListener
    public void onCanvasTouched(ppf ppfVar) {
        LogUtil.a("Share_ShareMarathonTemplate", "canvas touched");
        StickerImageView stickerImageView = this.ak;
        if (stickerImageView == null) {
            return;
        }
        stickerImageView.deselectAll();
    }

    @Override // com.huawei.pluginsocialshare.view.stickerview.StickerImageViewListener
    public void onImageObjectDeleteSelected() {
        if (this.ak == null) {
            return;
        }
        this.w = "";
        this.u = 0;
        this.ak.d();
        this.k.d(0);
    }

    @Override // com.huawei.pluginsocialshare.view.template.BaseShareTemplate, com.huawei.pluginsocialshare.view.BaseSharePreView
    public View getShareContentView() {
        super.getShareContentView();
        e();
        return this.p;
    }

    private void e() {
        StickerImageView stickerImageView = this.ak;
        if (stickerImageView == null) {
            return;
        }
        stickerImageView.deselectAll();
    }

    private void b() {
        Handler handler = this.am;
        if (handler == null || this.ak == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.am.postDelayed(new Runnable() { // from class: ppr.5
            @Override // java.lang.Runnable
            public void run() {
                ppr.this.ak.deselectAll();
            }
        }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    private String d(pna pnaVar) {
        return TextUtils.isEmpty(pnaVar.h()) ? pnaVar.l() : pnaVar.h();
    }
}
