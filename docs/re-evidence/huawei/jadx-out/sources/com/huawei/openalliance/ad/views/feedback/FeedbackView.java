package com.huawei.openalliance.ad.views.feedback;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.FeedbackInfo;
import com.huawei.openalliance.ad.utils.ah;
import com.huawei.openalliance.ad.utils.bd;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.dw;
import com.huawei.openalliance.ad.views.i;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class FeedbackView extends i implements g, h {
    private LinearLayout k;
    private LinearLayout l;
    private FlowLayoutView m;
    private FlowLayoutView n;
    private ViewStub o;
    private com.huawei.openalliance.ad.views.feedback.b p;
    private boolean q;
    private boolean r;
    private d s;
    private a t;
    private c u;

    @Override // com.huawei.openalliance.ad.views.i
    public void setScreenLockCallBack(i.a aVar) {
        this.t.a(aVar);
    }

    @Override // com.huawei.openalliance.ad.views.i
    public void setFeedbackListener(com.huawei.openalliance.ad.views.feedback.b bVar) {
        this.p = bVar;
    }

    @Override // com.huawei.openalliance.ad.views.i
    public void setAdContent(ContentRecord contentRecord) {
        d dVar = this.s;
        if (dVar != null) {
            dVar.a(getContext().getApplicationContext(), contentRecord, this);
        }
    }

    @Override // com.huawei.openalliance.ad.views.i
    public void e() {
        d dVar = this.s;
        if (dVar == null) {
            hw.b("FeedbackView", "feedback presenter is null");
            return;
        }
        boolean zF = dVar.f();
        if (hw.a()) {
            hw.a("FeedbackView", "click to complain: %s", Boolean.valueOf(zF));
        }
    }

    @Override // com.huawei.openalliance.ad.views.i
    public void c() {
        try {
            this.r = cc.a(getContext()).d();
            hw.b("FeedbackView", "adapterView mFeedbackViewPaddingLeft = %s, mFeedbackViewPaddingRight= %s", Integer.valueOf(this.g), Integer.valueOf(this.h));
            if (d()) {
                this.f21242b.setPadding(this.g, 0, this.h, 0);
                d dVar = this.s;
                if (dVar != null) {
                    List<FeedbackInfo> listA = dVar.a();
                    List<FeedbackInfo> listB = this.s.b();
                    FeedbackInfo feedbackInfoC = this.s.c();
                    if (ah.a(listA)) {
                        dw.a((View) this.k, true);
                        a(this.m, listA, 2);
                    } else {
                        dw.a((View) this.k, false);
                    }
                    if (ah.a(listB)) {
                        dw.a((View) this.l, true);
                        a(this.n, listB, 1);
                    } else {
                        dw.a((View) this.l, false);
                    }
                    a(feedbackInfoC);
                }
                this.f21242b.requestLayout();
                this.f21242b.getViewTreeObserver().addOnGlobalLayoutListener(this.j);
            }
        } catch (Throwable th) {
            hw.c("FeedbackView", "adapterView error, %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.views.i
    public void b(Context context) {
        boolean zD = cc.a(context).d();
        this.r = zD;
        hw.a("FeedbackView", "isChinaRom = %s", Boolean.valueOf(zD));
        ViewStub viewStub = this.o;
        if (viewStub == null) {
            return;
        }
        viewStub.setLayoutResource(R.layout.hiad_feedback_viewstub);
        this.o.inflate();
        ImageView imageView = (ImageView) this.f21241a.findViewById(R.id.right_arrow);
        ImageView imageView2 = (ImageView) this.f21241a.findViewById(R.id.dsa_right_arrow);
        setArrowBitMap(imageView);
        setArrowBitMap(imageView2);
    }

    @Override // com.huawei.openalliance.ad.views.feedback.h
    public void b() {
        Context context = getContext();
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    @Override // com.huawei.openalliance.ad.views.i
    public void a(Context context) {
        try {
            this.f21241a = LayoutInflater.from(context).inflate(R.layout.hiad_feedback_view, this);
            this.k = (LinearLayout) this.f21241a.findViewById(R.id.feedback_positive_ll);
            this.l = (LinearLayout) this.f21241a.findViewById(R.id.feedback_negative_ll);
            this.f21242b = this.f21241a.findViewById(R.id.feedback_view_root);
            this.f21243c = this.f21241a.findViewById(R.id.feedback_scrollview);
            this.m = (FlowLayoutView) this.f21241a.findViewById(R.id.feedback_positive_flv);
            this.n = (FlowLayoutView) this.f21241a.findViewById(R.id.feedback_negative_flv);
            this.o = (ViewStub) this.f21241a.findViewById(R.id.feedback_viewstub);
            this.s = new d(this);
            this.t = new a(getContext());
            this.u = new c(getContext());
            this.t.a(this.s);
            this.u.a(this.s);
        } catch (Throwable th) {
            hw.c("FeedbackView", "initView error, %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.views.feedback.h
    public void a() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.feedback.FeedbackView.2
            @Override // java.lang.Runnable
            public void run() {
                if (FeedbackView.this.p != null) {
                    FeedbackView.this.p.a(3, FeedbackView.this.s.c());
                }
            }
        });
    }

    private void setArrowBitMap(ImageView imageView) {
        if (imageView != null) {
            Drawable drawable = getResources().getDrawable(R.drawable.hiad_feedback_right_arrow);
            if (dk.c()) {
                imageView.setImageBitmap(bd.b(drawable));
            }
        }
    }

    private boolean f() {
        d dVar = this.s;
        return (dVar == null || !dVar.d() || dg.b(this.s.e())) ? false : true;
    }

    private void a(FlowLayoutView flowLayoutView, List<FeedbackInfo> list, final int i) {
        flowLayoutView.removeAllViews();
        if (bm.a(list)) {
            hw.b("FeedbackView", "feedbackInfoList is null");
            return;
        }
        hw.b("FeedbackView", "initFlowLayout, feedType: %s, feedbackList.size: %s", Integer.valueOf(i), Integer.valueOf(list.size()));
        for (final FeedbackInfo feedbackInfo : list) {
            if (feedbackInfo != null && !TextUtils.isEmpty(feedbackInfo.getLabel())) {
                String label = feedbackInfo.getLabel();
                View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.hiad_unlike_label_item, (ViewGroup) flowLayoutView, false);
                if (viewInflate instanceof TextView) {
                    TextView textView = (TextView) viewInflate;
                    textView.setText(label);
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.feedback.FeedbackView.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            try {
                                if (FeedbackView.this.q) {
                                    FeedbackView.this.q = false;
                                    view.setSelected(!view.isSelected());
                                    view.postDelayed(new Runnable() { // from class: com.huawei.openalliance.ad.views.feedback.FeedbackView.1.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            FeedbackView.this.q = true;
                                            FeedbackView.this.a(i, feedbackInfo);
                                        }
                                    }, 200L);
                                }
                            } catch (Throwable th) {
                                hw.c("FeedbackView", "onClick error, %s", th.getClass().getSimpleName());
                            }
                        }
                    });
                    flowLayoutView.addView(textView);
                }
            }
        }
        flowLayoutView.setDefaultDisplayMode(dk.c() ? -1 : 1);
    }

    private void a(FeedbackInfo feedbackInfo) {
        View viewFindViewById = this.f21241a.findViewById(R.id.complain_extra_area);
        View viewFindViewById2 = this.f21241a.findViewById(R.id.dsa_extra_area);
        if (this.r) {
            if (viewFindViewById != null) {
                if (feedbackInfo == null || !feedbackInfo.b()) {
                    viewFindViewById.setVisibility(8);
                } else {
                    viewFindViewById.setVisibility(0);
                    ((TextView) this.f21241a.findViewById(R.id.complain_tv)).setText(feedbackInfo.getLabel());
                    viewFindViewById.setOnClickListener(this.t);
                }
            }
            if (viewFindViewById2 == null) {
                return;
            }
            if (!f()) {
                viewFindViewById2.setVisibility(8);
                return;
            }
        } else {
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
            if (viewFindViewById2 == null) {
                return;
            }
        }
        viewFindViewById2.setVisibility(0);
        viewFindViewById2.setOnClickListener(this.u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, FeedbackInfo feedbackInfo) {
        com.huawei.openalliance.ad.views.feedback.b bVar = this.p;
        if (bVar != null) {
            bVar.a(i, feedbackInfo);
        }
    }

    protected static class a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private i.a f21195c;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f21196a == null) {
                hw.b("FeedbackView", "feedback presenter is null.");
                return;
            }
            if (dk.b(this.f21197b)) {
                this.f21195c.l();
                return;
            }
            boolean zF = this.f21196a.f();
            if (hw.a()) {
                hw.a("FeedbackView", "click to complain: %s", Boolean.valueOf(zF));
            }
        }

        public void a(i.a aVar) {
            this.f21195c = aVar;
        }

        protected a(Context context) {
            super(context);
        }
    }

    public FeedbackView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.q = true;
        this.r = true;
    }

    static abstract class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected d f21196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final Context f21197b;

        public void a(d dVar) {
            this.f21196a = dVar;
        }

        protected b(Context context) {
            this.f21197b = context;
        }
    }

    protected static class c extends b {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f21196a == null) {
                return;
            }
            boolean zA = this.f21196a.a(this.f21197b);
            hw.a("FeedbackView", "click to why this ad:%s", Boolean.valueOf(zA));
            if (zA && (this.f21197b instanceof Activity)) {
                ((Activity) this.f21197b).finish();
            }
        }

        protected c(Context context) {
            super(context);
        }
    }

    public FeedbackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = true;
        this.r = true;
    }

    public FeedbackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = true;
        this.r = true;
    }

    public FeedbackView(Context context) {
        super(context);
        this.q = true;
        this.r = true;
    }
}
