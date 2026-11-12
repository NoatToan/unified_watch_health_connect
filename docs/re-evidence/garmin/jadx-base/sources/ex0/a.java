package ex0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import c22.b;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieAnimationView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import hx0.b0;
import j23.l;
import o72.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lex0/a;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "desiredWidth", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/Double;)V", "", "checked", "", "setIconState", "(Z)V", "a", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C1395a f66914i = new C1395a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l f66915j = new l(0, 20);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l f66916k = new l(40, 53);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l f66917l = new l(0, 60);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l f66918m = new l(60, 72);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f66919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f66920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f66921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LottieAnimationView f66922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LottieAnimationView f66923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b0 f66924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f66925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f66926h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i14, Double d14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f66919a = context;
        this.f66920b = d14;
        LayoutInflater.from(context).inflate(R.layout.option_item, this);
        View viewFindViewById = findViewById(R.id.option_label);
        viewFindViewById.getClass();
        this.f66921c = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.option_icon);
        viewFindViewById2.getClass();
        this.f66922d = (LottieAnimationView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.option_icon_check);
        viewFindViewById3.getClass();
        this.f66923e = (LottieAnimationView) viewFindViewById3;
        this.f66925g = (int) b.c(context, context.getResources().getDimension(R.dimen.gcm_option_icon_height), 1.5f);
        this.f66926h = (int) b.c(context, context.getResources().getDimension(R.dimen.icon_xsmall), 1.5f);
    }

    private final void setIconState(boolean checked) {
        int i14 = (checked ? f66917l : f66918m).f96797b;
        int i15 = (checked ? f66915j : f66916k).f96797b;
        LottieAnimationView lottieAnimationView = this.f66922d;
        lottieAnimationView.cancelAnimation();
        lottieAnimationView.setMinAndMaxFrame(0, i14);
        lottieAnimationView.setFrame(0);
        lottieAnimationView.setFrame(i14);
        LottieAnimationView lottieAnimationView2 = this.f66923e;
        lottieAnimationView2.cancelAnimation();
        lottieAnimationView2.setMinAndMaxFrame(0, i15);
        lottieAnimationView2.setFrame(0);
        lottieAnimationView2.setFrame(i15);
        Context context = this.f66919a;
        t.m(lottieAnimationView2, context, "check", R.color.gcm_lottie_option_item_checkmark);
        t.m(lottieAnimationView2, context, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, R.color.gcm_lottie_option_item_background);
    }

    public final void a(b0 b0Var) {
        float fA = b.a(this.f66919a);
        LottieAnimationView lottieAnimationView = this.f66922d;
        if (fA > 1.5f) {
            ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
            int i14 = this.f66925g;
            layoutParams.width = i14;
            lottieAnimationView.getLayoutParams().height = i14;
            LottieAnimationView lottieAnimationView2 = this.f66923e;
            ViewGroup.LayoutParams layoutParams2 = lottieAnimationView2.getLayoutParams();
            int i15 = this.f66926h;
            layoutParams2.width = i15;
            lottieAnimationView2.getLayoutParams().height = i15;
        }
        this.f66924f = b0Var;
        this.f66921c.setText(b0Var.f86025c);
        lottieAnimationView.setAnimation(b0Var.f86026d);
        setIconState(b0Var.f86024b);
    }

    public final void b(boolean z14) {
        b0 b0Var = this.f66924f;
        if (b0Var != null) {
            b0Var.f86024b = z14;
        }
        l lVar = z14 ? f66917l : f66918m;
        l lVar2 = z14 ? f66915j : f66916k;
        int i14 = lVar.f96796a;
        int i15 = lVar.f96797b;
        LottieAnimationView lottieAnimationView = this.f66922d;
        lottieAnimationView.setMinAndMaxFrame(i14, i15);
        lottieAnimationView.playAnimation();
        int i16 = lVar2.f96796a;
        int i17 = lVar2.f96797b;
        LottieAnimationView lottieAnimationView2 = this.f66923e;
        lottieAnimationView2.setMinAndMaxFrame(i16, i17);
        lottieAnimationView2.playAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Double d14 = this.f66920b;
        if (d14 != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (int) d14.doubleValue();
            } else {
                layoutParams = null;
            }
            setLayoutParams(layoutParams);
        }
        b0 b0Var = this.f66924f;
        if (b0Var != null) {
            setIconState(b0Var.f86024b);
        }
    }

    /* JADX INFO: renamed from: ex0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lex0/a$a;", "", "<init>", "()V", "Lj23/l;", "checkMarkChecked", "Lj23/l;", "checkMarkUnchecked", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1395a {
        public /* synthetic */ C1395a(j jVar) {
            this();
        }

        private C1395a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, null, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        this(context, null, 0, null, 14, null);
        context.getClass();
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i14, Double d14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14, (i15 & 8) != 0 ? null : d14);
    }
}
