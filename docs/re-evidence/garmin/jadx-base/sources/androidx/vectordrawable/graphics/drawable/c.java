package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import b7.g;
import b7.j;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class c extends e implements Animatable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f11188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f11189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f11190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<androidx.vectordrawable.graphics.drawable.b> f11191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f11192f;

    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
            c.this.scheduleSelf(runnable, j8);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    private c(Context context, b bVar, Resources resources) {
        this.f11190d = null;
        this.f11191e = null;
        a aVar = new a();
        this.f11192f = aVar;
        this.f11189c = context;
        if (bVar != null) {
            this.f11188b = bVar;
        } else {
            this.f11188b = new b(context, bVar, aVar, resources);
        }
    }

    public static c a(int i14, Context context) {
        c cVar = new c(context);
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = g.f16255a;
        Drawable drawable = resources.getDrawable(i14, theme);
        cVar.f11200a = drawable;
        drawable.setCallback(cVar.f11192f);
        new C0158c(cVar.f11200a.getConstantState());
        return cVar;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f11188b;
        bVar.f11194a.draw(canvas);
        if (bVar.f11195b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.getAlpha() : this.f11188b.f11194a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f11188b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.getColorFilter() : this.f11188b.f11194a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f11200a != null) {
            return new C0158c(this.f11200a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f11188b.f11194a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f11188b.f11194a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.getOpacity() : this.f11188b.f11194a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        b bVar;
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            bVar = this.f11188b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayF = j.f(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f11185e);
                    int resourceId = typedArrayF.getResourceId(0, 0);
                    if (resourceId != 0) {
                        f fVarA = f.a(resourceId, theme, resources);
                        fVarA.f11206f = false;
                        fVarA.setCallback(this.f11192f);
                        f fVar = bVar.f11194a;
                        if (fVar != null) {
                            fVar.setCallback(null);
                        }
                        bVar.f11194a = fVarA;
                    }
                    typedArrayF.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f11186f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f11189c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            h.z("Context can't be null when inflating animators");
                            return;
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(bVar.f11194a.f11202b.f11252b.f11250o.get(string));
                        if (bVar.f11196c == null) {
                            bVar.f11196c = new ArrayList<>();
                            bVar.f11197d = new p1.a<>();
                        }
                        bVar.f11196c.add(animatorLoadAnimator);
                        bVar.f11197d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (bVar.f11195b == null) {
            bVar.f11195b = new AnimatorSet();
        }
        bVar.f11195b.playTogether(bVar.f11196c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.isAutoMirrored() : this.f11188b.f11194a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f11200a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f11188b.f11195b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.isStateful() : this.f11188b.f11194a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f11188b.f11194a.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i14) {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.setLevel(i14) : this.f11188b.f11194a.setLevel(i14);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.setState(iArr) : this.f11188b.f11194a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i14) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.setAlpha(i14);
        } else {
            this.f11188b.f11194a.setAlpha(i14);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z14) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.setAutoMirrored(z14);
        } else {
            this.f11188b.f11194a.setAutoMirrored(z14);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f11188b.f11194a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i14) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.setTint(i14);
        } else {
            this.f11188b.f11194a.setTint(i14);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f11188b.f11194a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f11188b.f11194a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z14, boolean z15) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            return drawable.setVisible(z14, z15);
        }
        this.f11188b.f11194a.setVisible(z14, z15);
        return super.setVisible(z14, z15);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f11188b;
        if (bVar.f11195b.isStarted()) {
            return;
        }
        bVar.f11195b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f11188b.f11195b.end();
        }
    }

    public static class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f11194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AnimatorSet f11195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<Animator> f11196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p1.a<Animator, String> f11197d;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                f fVar = bVar.f11194a;
                if (fVar != null) {
                    Drawable.ConstantState constantState = fVar.getConstantState();
                    if (resources != null) {
                        this.f11194a = (f) constantState.newDrawable(resources);
                    } else {
                        this.f11194a = (f) constantState.newDrawable();
                    }
                    f fVar2 = this.f11194a;
                    fVar2.mutate();
                    this.f11194a = fVar2;
                    fVar2.setCallback(callback);
                    this.f11194a.setBounds(bVar.f11194a.getBounds());
                    this.f11194a.f11206f = false;
                }
                ArrayList<Animator> arrayList = bVar.f11196c;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f11196c = new ArrayList<>(size);
                    this.f11197d = new p1.a<>(size);
                    for (int i14 = 0; i14 < size; i14++) {
                        Animator animator = bVar.f11196c.get(i14);
                        Animator animatorClone = animator.clone();
                        String str = bVar.f11197d.get(animator);
                        animatorClone.setTarget(this.f11194a.f11202b.f11252b.f11250o.get(str));
                        this.f11196c.add(animatorClone);
                        this.f11197d.put(animatorClone, str);
                    }
                    if (this.f11195b == null) {
                        this.f11195b = new AnimatorSet();
                    }
                    this.f11195b.playTogether(this.f11196c);
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    public static class C0158c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f11198a;

        public C0158c(Drawable.ConstantState constantState) {
            this.f11198a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f11198a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f11198a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f11198a.newDrawable();
            cVar.f11200a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f11192f);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f11198a.newDrawable(resources);
            cVar.f11200a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f11192f);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f11198a.newDrawable(resources, theme);
            cVar.f11200a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f11192f);
            return cVar;
        }
    }

    private c(Context context) {
        this(context, null, null);
    }

    public c() {
        this(null, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
