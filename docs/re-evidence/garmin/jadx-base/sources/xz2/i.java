package xz2;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.CheckedTextView;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public class i extends CheckedTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f192898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f192899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f192900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f192901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f192902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public StateListDrawable f192903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public yz2.e f192904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f192905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f192906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f192907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f192908k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f192909l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f192910m;

    public i(Context context, b bVar) {
        super(context);
        this.f192899b = -7829368;
        this.f192901d = null;
        this.f192904g = yz2.e.f200490a;
        this.f192905h = true;
        this.f192906i = true;
        this.f192907j = false;
        this.f192908k = 4;
        this.f192909l = new Rect();
        this.f192910m = new Rect();
        this.f192900c = getResources().getInteger(R.integer.config_shortAnimTime);
        this.f192899b = this.f192899b;
        c();
        setGravity(17);
        setTextAlignment(4);
        this.f192898a = bVar;
        setText(b());
    }

    public static ShapeDrawable a(int i14) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i14);
        return shapeDrawable;
    }

    public final String b() {
        return ((yz2.c) this.f192904g).f200488b.format(this.f192898a.g());
    }

    public final void c() {
        Drawable drawable = this.f192902e;
        if (drawable != null) {
            setBackgroundDrawable(drawable);
            return;
        }
        int i14 = this.f192899b;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.setExitFadeDuration(this.f192900c);
        stateListDrawable.addState(new int[]{R.attr.state_checked}, a(i14));
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, new RippleDrawable(ColorStateList.valueOf(i14), null, a(-1)));
        stateListDrawable.addState(new int[0], a(0));
        this.f192903f = stateListDrawable;
        setBackgroundDrawable(stateListDrawable);
    }

    public final void d() {
        boolean z14 = this.f192906i && this.f192905h && !this.f192907j;
        super.setEnabled(this.f192905h && !this.f192907j);
        int i14 = this.f192908k;
        yz2.d dVar = MaterialCalendarView.B;
        boolean z15 = (i14 & 1) != 0;
        boolean z16 = (i14 & 2) != 0 || z15;
        boolean z17 = (i14 & 4) != 0;
        boolean z18 = this.f192906i;
        if (!z18 && z15) {
            z14 = true;
        }
        boolean z19 = this.f192905h;
        if (!z19 && z16) {
            z14 |= z18;
        }
        if (this.f192907j && z17) {
            z14 |= z18 && z19;
        }
        if (!z18 && z14) {
            setTextColor(getTextColors().getColorForState(new int[]{-16842910}, -7829368));
        }
        setVisibility(z14 ? 0 : 4);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.f192901d;
        if (drawable != null) {
            drawable.setBounds(this.f192909l);
            this.f192901d.setState(getDrawableState());
            this.f192901d.draw(canvas);
        }
        this.f192903f.setBounds(this.f192910m);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        super.onLayout(z14, i14, i15, i16, i17);
        int i18 = i16 - i14;
        int i19 = i17 - i15;
        int iMin = Math.min(i19, i18);
        int iAbs = Math.abs(i19 - i18) / 2;
        Rect rect = this.f192910m;
        Rect rect2 = this.f192909l;
        if (i18 >= i19) {
            int i24 = iMin + iAbs;
            rect2.set(iAbs, 0, i24, i19);
            rect.set(iAbs, 0, i24, i19);
        } else {
            int i25 = iMin + iAbs;
            rect2.set(0, iAbs, i18, i25);
            rect.set(0, iAbs, i18, i25);
        }
        c();
    }
}
