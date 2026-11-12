package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import defpackage.cqi;
import defpackage.hbm;
import defpackage.i2j;
import defpackage.jh0;
import defpackage.m80;
import defpackage.mwi;
import defpackage.oe0;
import defpackage.q1a;
import defpackage.smi;
import defpackage.xfp;
import defpackage.z5j;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActivityChooserView extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f1550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f1551b;
    public final View c;
    public final Drawable d;
    public final FrameLayout e;
    public final ImageView f;
    public final FrameLayout g;
    public final ImageView h;
    public final int i;
    public oe0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DataSetObserver f1552k;
    public final ViewTreeObserver.OnGlobalLayoutListener l;
    public ListPopupWindow m;
    public PopupWindow.OnDismissListener n;
    public boolean o;
    public int p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1553r;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f1554a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            xfp xfpVarU = xfp.u(context, attributeSet, f1554a);
            setBackgroundDrawable(xfpVarU.g(0));
            xfpVarU.w();
        }
    }

    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f1550a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f1550a.notifyDataSetInvalidated();
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.b()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().a();
                oe0 oe0Var = ActivityChooserView.this.j;
                if (oe0Var != null) {
                    oe0Var.k(true);
                }
            }
        }
    }

    public class c extends View.AccessibilityDelegate {
        public c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            m80.P0(accessibilityNodeInfo).f0(true);
        }
    }

    public class d extends q1a {
        public d(View view) {
            super(view);
        }

        @Override // defpackage.q1a
        public hbm b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // defpackage.q1a
        public boolean c() {
            ActivityChooserView.this.c();
            return true;
        }

        @Override // defpackage.q1a
        public boolean d() {
            ActivityChooserView.this.a();
            return true;
        }
    }

    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.e();
        }
    }

    public class f extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public jh0 f1559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1560b = 4;
        public boolean c;
        public boolean d;
        public boolean e;

        public f() {
        }

        public int a() {
            return this.f1559a.e();
        }

        public jh0 b() {
            return this.f1559a;
        }

        public ResolveInfo c() {
            return this.f1559a.g();
        }

        public int d() {
            return this.f1559a.h();
        }

        public boolean e() {
            return this.c;
        }

        public int f() {
            int i = this.f1560b;
            this.f1560b = Integer.MAX_VALUE;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int iMax = 0;
            View view = null;
            for (int i2 = 0; i2 < count; i2++) {
                view = getView(i2, view, null);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = Math.max(iMax, view.getMeasuredWidth());
            }
            this.f1560b = i;
            return iMax;
        }

        public void g(jh0 jh0Var) {
            jh0 jh0VarB = ActivityChooserView.this.f1550a.b();
            if (jh0VarB != null && ActivityChooserView.this.isShown()) {
                jh0VarB.unregisterObserver(ActivityChooserView.this.f1552k);
            }
            this.f1559a = jh0Var;
            if (jh0Var != null && ActivityChooserView.this.isShown()) {
                jh0Var.registerObserver(ActivityChooserView.this.f1552k);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int iE = this.f1559a.e();
            if (!this.c && this.f1559a.g() != null) {
                iE--;
            }
            int iMin = Math.min(iE, this.f1560b);
            return this.e ? iMin + 1 : iMin;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.c && this.f1559a.g() != null) {
                i++;
            }
            return this.f1559a.d(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return (this.e && i == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View viewInflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(mwi.f, viewGroup, false);
                viewInflate.setId(1);
                ((TextView) viewInflate.findViewById(cqi.R)).setText(ActivityChooserView.this.getContext().getString(i2j.f20705b));
                return viewInflate;
            }
            if (view == null || view.getId() != cqi.x) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(mwi.f, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(cqi.v);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(cqi.R)).setText(resolveInfo.loadLabel(packageManager));
            if (this.c && i == 0 && this.d) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        public void h(int i) {
            if (this.f1560b != i) {
                this.f1560b = i;
                notifyDataSetChanged();
            }
        }

        public void i(boolean z, boolean z2) {
            if (this.c == z && this.d == z2) {
                return;
            }
            this.c = z;
            this.d = z2;
            notifyDataSetChanged();
        }

        public void j(boolean z) {
            if (this.e != z) {
                this.e = z;
                notifyDataSetChanged();
            }
        }
    }

    public class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public g() {
        }

        public final void a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.n;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.g) {
                if (view != activityChooserView.e) {
                    throw new IllegalArgumentException();
                }
                activityChooserView.o = false;
                activityChooserView.d(activityChooserView.p);
                return;
            }
            activityChooserView.a();
            Intent intentB = ActivityChooserView.this.f1550a.b().b(ActivityChooserView.this.f1550a.b().f(ActivityChooserView.this.f1550a.c()));
            if (intentB != null) {
                intentB.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentB);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            a();
            oe0 oe0Var = ActivityChooserView.this.j;
            if (oe0Var != null) {
                oe0Var.k(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((f) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.d(Integer.MAX_VALUE);
                return;
            }
            ActivityChooserView.this.a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.o) {
                if (i > 0) {
                    activityChooserView.f1550a.b().n(i);
                    return;
                }
                return;
            }
            if (!activityChooserView.f1550a.e()) {
                i++;
            }
            Intent intentB = ActivityChooserView.this.f1550a.b().b(i);
            if (intentB != null) {
                intentB.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentB);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.g) {
                throw new IllegalArgumentException();
            }
            if (activityChooserView.f1550a.getCount() > 0) {
                ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                activityChooserView2.o = true;
                activityChooserView2.d(activityChooserView2.p);
            }
            return true;
        }
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    public boolean a() {
        if (!b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.l);
        return true;
    }

    public boolean b() {
        return getListPopupWindow().isShowing();
    }

    public boolean c() {
        if (b() || !this.q) {
            return false;
        }
        this.o = false;
        d(this.p);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void d(int i) {
        if (this.f1550a.b() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.l);
        ?? r0 = this.g.getVisibility() == 0 ? 1 : 0;
        int iA = this.f1550a.a();
        if (i == Integer.MAX_VALUE || iA <= i + r0) {
            this.f1550a.j(false);
            this.f1550a.h(i);
        } else {
            this.f1550a.j(true);
            this.f1550a.h(i - 1);
        }
        ListPopupWindow listPopupWindow = getListPopupWindow();
        if (listPopupWindow.isShowing()) {
            return;
        }
        if (this.o || r0 == 0) {
            this.f1550a.i(true, r0);
        } else {
            this.f1550a.i(false, false);
        }
        listPopupWindow.C(Math.min(this.f1550a.f(), this.i));
        listPopupWindow.a();
        oe0 oe0Var = this.j;
        if (oe0Var != null) {
            oe0Var.k(true);
        }
        listPopupWindow.m().setContentDescription(getContext().getString(i2j.c));
        listPopupWindow.m().setSelector(new ColorDrawable(0));
    }

    public void e() {
        if (this.f1550a.getCount() > 0) {
            this.e.setEnabled(true);
        } else {
            this.e.setEnabled(false);
        }
        int iA = this.f1550a.a();
        int iD = this.f1550a.d();
        if (iA == 1 || (iA > 1 && iD > 0)) {
            this.g.setVisibility(0);
            ResolveInfo resolveInfoC = this.f1550a.c();
            PackageManager packageManager = getContext().getPackageManager();
            this.h.setImageDrawable(resolveInfoC.loadIcon(packageManager));
            if (this.f1553r != 0) {
                this.g.setContentDescription(getContext().getString(this.f1553r, resolveInfoC.loadLabel(packageManager)));
            }
        } else {
            this.g.setVisibility(8);
        }
        if (this.g.getVisibility() == 0) {
            this.c.setBackgroundDrawable(this.d);
        } else {
            this.c.setBackgroundDrawable(null);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public jh0 getDataModel() {
        return this.f1550a.b();
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.m == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.m = listPopupWindow;
            listPopupWindow.j(this.f1550a);
            this.m.A(this);
            this.m.G(true);
            this.m.setOnItemClickListener(this.f1551b);
            this.m.setOnDismissListener(this.f1551b);
        }
        return this.m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        jh0 jh0VarB = this.f1550a.b();
        if (jh0VarB != null) {
            jh0VarB.registerObserver(this.f1552k);
        }
        this.q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jh0 jh0VarB = this.f1550a.b();
        if (jh0VarB != null) {
            jh0VarB.unregisterObserver(this.f1552k);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.l);
        }
        if (b()) {
            a();
        }
        this.q = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.c.layout(0, 0, i3 - i, i4 - i2);
        if (b()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        View view = this.c;
        if (this.g.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setActivityChooserModel(jh0 jh0Var) {
        this.f1550a.g(jh0Var);
        if (b()) {
            a();
            c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f1553r = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.p = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.n = onDismissListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setProvider(oe0 oe0Var) {
        this.j = oe0Var;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1552k = new a();
        this.l = new b();
        this.p = 4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5j.E, i, 0);
        androidx.core.view.c.p0(this, context, z5j.E, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        this.p = typedArrayObtainStyledAttributes.getInt(z5j.G, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(z5j.F);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(mwi.e, (ViewGroup) this, true);
        g gVar = new g();
        this.f1551b = gVar;
        View viewFindViewById = findViewById(cqi.j);
        this.c = viewFindViewById;
        this.d = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(cqi.f14622r);
        this.g = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        this.h = (ImageView) frameLayout.findViewById(cqi.w);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(cqi.t);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.e = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(cqi.w);
        this.f = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.f1550a = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(smi.d));
    }
}
