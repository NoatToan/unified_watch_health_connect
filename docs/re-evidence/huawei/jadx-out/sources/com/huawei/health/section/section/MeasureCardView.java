package com.huawei.health.section.section;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.gvl;
import defpackage.gvm;
import defpackage.gvv;
import defpackage.gvx;
import health.compact.a.util.LogUtil;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes8.dex */
public class MeasureCardView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue<a> f8736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MeasureCardItemHolder f8737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewStub f8738c;
    private boolean d;
    private View e;
    private MeasureCardItemHolder f;
    private View g;
    private HealthSubHeader h;
    private ViewStub i;
    private View j;
    private ViewStub k;
    private MeasureCardItemHolder l;

    public MeasureCardView(Context context) {
        super(context);
        this.d = false;
        this.f8736a = new LinkedList();
        a(context);
    }

    public MeasureCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
        this.f8736a = new LinkedList();
        a(context);
    }

    public MeasureCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = false;
        this.f8736a = new LinkedList();
        a(context);
    }

    private void a(Context context) {
        final View viewInflate = LayoutInflater.from(context).inflate(R.layout.measure_card_view_layout, (ViewGroup) this, false);
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.sub_header);
        this.h = healthSubHeader;
        healthSubHeader.setSubHeaderBackgroundColor(0);
        this.i = (ViewStub) viewInflate.findViewById(R.id.normal_card);
        this.f8738c = (ViewStub) viewInflate.findViewById(R.id.arrhythmia_card);
        this.k = (ViewStub) viewInflate.findViewById(R.id.vascular_card);
        viewInflate.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.section.section.MeasureCardView.5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (viewInflate.getWidth() <= 0 || viewInflate.getHeight() <= 0) {
                    return;
                }
                MeasureCardView.this.d = true;
                while (!MeasureCardView.this.f8736a.isEmpty()) {
                    final a aVar = (a) MeasureCardView.this.f8736a.poll();
                    if (aVar == null) {
                        return;
                    } else {
                        HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.section.section.MeasureCardView.5.2
                            @Override // java.lang.Runnable
                            public void run() {
                                MeasureCardView.this.e(aVar.e, aVar.f8742a);
                            }
                        });
                    }
                }
                viewInflate.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        addView(viewInflate);
    }

    public void d() {
        this.h.setVisibility(8);
    }

    public void b() {
        this.h.setVisibility(0);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c(final gvl gvlVar) {
        if (!Looper.myLooper().isCurrentThread()) {
            HandlerExecutor.c(new Runnable() { // from class: gvt
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c(gvlVar);
                }
            });
        } else {
            e(gvlVar, false);
        }
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(final gvl gvlVar) {
        if (!Looper.myLooper().isCurrentThread()) {
            HandlerExecutor.c(new Runnable() { // from class: gvq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36100a.a(gvlVar);
                }
            });
        } else {
            e(gvlVar, true);
        }
    }

    private View a(View view, ViewStub viewStub) {
        boolean z = viewStub != null && (viewStub.getParent() instanceof ViewGroup);
        if (view == null && z) {
            view = viewStub.inflate();
        }
        if (view == null && !z) {
            LogUtil.d("MeasureCardView", "inflateCard has an exception, inflate through LayoutInflater now!");
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.measure_card_view_wrapper_with_header);
            if (linearLayout == null) {
                return view;
            }
            view = LayoutInflater.from(getContext()).inflate(R.layout.measure_card_item_layout, (ViewGroup) linearLayout, false);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = getContext().getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
                view.setLayoutParams(marginLayoutParams);
            }
            linearLayout.addView(view);
        }
        if (view == null) {
            LogUtil.c("MeasureCardView", "card inflated failed!");
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(gvl gvlVar, boolean z) {
        MeasureCardItemHolder measureCardItemHolder;
        if (gvlVar == null) {
            LogUtil.d("MeasureCardView", "refreshCard failed cause cardBean is null!");
            return;
        }
        if (!this.d) {
            this.f8736a.add(new a(gvlVar, z));
            return;
        }
        MeasureCardItemHolder.MeasureType measureTypeD = gvlVar.d();
        int i = AnonymousClass4.f8739c[measureTypeD.ordinal()];
        if (i == 1) {
            View viewA = a(this.g, this.i);
            this.g = viewA;
            if (this.f == null && viewA != null) {
                this.f = new gvv(viewA);
            }
            measureCardItemHolder = this.f;
        } else if (i == 2) {
            View viewA2 = a(this.e, this.f8738c);
            this.e = viewA2;
            if (this.f8737b == null && viewA2 != null) {
                this.f8737b = new gvm(viewA2);
            }
            measureCardItemHolder = this.f8737b;
        } else {
            if (i != 3) {
                LogUtil.c("MeasureCardView", "refreshCard failed cause type = ", measureTypeD, " is unknown");
                return;
            }
            View viewA3 = a(this.j, this.k);
            this.j = viewA3;
            if (this.l == null && viewA3 != null) {
                this.l = new gvx(viewA3);
            }
            measureCardItemHolder = this.l;
        }
        if (measureCardItemHolder == null) {
            LogUtil.c("MeasureCardView", "cardHolder is null!");
            return;
        }
        if (!gvlVar.f()) {
            measureCardItemHolder.hide();
        } else {
            measureCardItemHolder.show();
        }
        if (z) {
            measureCardItemHolder.bindChart(gvlVar);
        } else {
            measureCardItemHolder.bindAll(gvlVar);
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.section.section.MeasureCardView$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f8739c;

        static {
            int[] iArr = new int[MeasureCardItemHolder.MeasureType.values().length];
            f8739c = iArr;
            try {
                iArr[MeasureCardItemHolder.MeasureType.ITEM_TYPE_ECG_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8739c[MeasureCardItemHolder.MeasureType.ITEM_TYPE_ECG_ARRHYTHMIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8739c[MeasureCardItemHolder.MeasureType.ITEM_TYPE_ECG_VASCULAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f8742a;
        private final gvl e;

        public a(gvl gvlVar, boolean z) {
            this.e = gvlVar;
            this.f8742a = z;
        }
    }
}
