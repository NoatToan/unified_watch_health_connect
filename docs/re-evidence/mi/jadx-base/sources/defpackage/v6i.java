package defpackage;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import androidx.preference.CheckBoxPreference;
import androidx.preference.DialogPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import androidx.preference.TwoStatePreference;
import androidx.recyclerview.widget.RecyclerView;
import com.miui.support.drawable.CardStateDrawable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.FolmeBlink;
import miuix.animation.internal.BlinkStateObserver;
import miuix.flexible.template.IHyperCellTemplate;
import miuix.flexible.view.HyperCellLayout;
import miuix.preference.DropDownPreference;
import miuix.preference.MultiChoicePreference;
import miuix.preference.MultiChoicePreferenceCategory;
import miuix.preference.RadioButtonPreference;
import miuix.preference.RadioButtonPreferenceCategory;
import miuix.preference.RadioSetPreferenceCategory;
import miuix.preference.SingleChoicePreference;
import miuix.preference.SingleChoicePreferenceCategory;
import miuix.preference.flexible.AbstractBaseTemplate;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"RestrictedApi"})
public class v6i extends androidx.preference.a implements BlinkStateObserver, zk8 {
    public static final int[] L;
    public static final int[] M;
    public static final int[] N;
    public static final int[] O;
    public static final int[] P;
    public static final int[] Q;
    public static final int[] R;
    public Rect A;
    public int B;
    public int C;
    public boolean D;
    public final List<Preference> E;
    public Paint F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public h[] g;
    public final RecyclerView.i h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f36543k;
    public int l;
    public int m;
    public RecyclerView n;
    public RecyclerView.l o;
    public FolmeBlink p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f36544r;
    public View s;
    public boolean t;
    public View.OnTouchListener u;
    public RecyclerView.r v;
    public View.OnTouchListener w;
    public boolean x;
    public boolean y;
    public Preference z;

    public class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            super.onChanged();
            v6i v6iVar = v6i.this;
            v6iVar.g = new h[v6iVar.getCount()];
        }
    }

    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            view.setPressed(true);
            return false;
        }
    }

    public class c extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Preference f36547a;

        public c(Preference preference) {
            this.f36547a = preference;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.g0(this.f36547a.isEnabled());
            m80Var.i0(Switch.class.getName());
            m80Var.h0(((CheckBoxPreference) this.f36547a).isChecked());
            m80Var.m0(this.f36547a.toString());
        }
    }

    public class d extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Preference f36549a;

        public d(Preference preference) {
            this.f36549a = preference;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.g0(this.f36549a.isEnabled());
            m80Var.i0(Switch.class.getName());
            m80Var.h0(((SwitchPreference) this.f36549a).isChecked());
            m80Var.m0(this.f36549a.toString());
        }
    }

    public class e implements View.OnTouchListener {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v6i.this.Z();
            }
        }

        public e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if ((action != 0 && action != 2 && action != 3) || v6i.this.s == null || v6i.this.t) {
                return false;
            }
            v6i.this.t = true;
            view.post(new a());
            return true;
        }
    }

    public class f implements RecyclerView.r {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v6i.this.Z();
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v6i.this.Z();
            }
        }

        public f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if ((action != 0 && action != 2 && action != 3) || v6i.this.s == null || v6i.this.t) {
                return false;
            }
            v6i.this.t = true;
            recyclerView.post(new a());
            return true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if ((action != 0 && action != 2 && action != 3) || v6i.this.s == null || v6i.this.t) {
                return;
            }
            v6i.this.t = true;
            recyclerView.post(new b());
        }
    }

    public class g extends RecyclerView.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36556a;

        public g(int i) {
            this.f36556a = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                v6i.this.f36544r = this.f36556a;
                if (v6i.this.n != null) {
                    v6i v6iVar = v6i.this;
                    v6iVar.o = v6iVar.n.getItemAnimator();
                    v6i.this.n.setItemAnimator(null);
                }
                v6i v6iVar2 = v6i.this;
                v6iVar2.notifyItemChanged(v6iVar2.f36544r);
                recyclerView.removeOnScrollListener(this);
            }
        }
    }

    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f36558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f36559b;

        public h() {
        }
    }

    static {
        int[] iArr = {R.attr.state_single, R.attr.state_first, R.attr.state_middle, R.attr.state_last, eii.B, eii.A};
        L = iArr;
        Arrays.sort(iArr);
        M = new int[]{R.attr.state_single};
        N = new int[]{R.attr.state_first};
        O = new int[]{R.attr.state_middle};
        P = new int[]{R.attr.state_last};
        Q = new int[]{eii.B};
        R = new int[]{eii.A};
    }

    public v6i(PreferenceGroup preferenceGroup, boolean z, int i) {
        super(preferenceGroup);
        this.h = new a();
        this.j = 0;
        this.q = 0;
        this.f36544r = -1;
        this.s = null;
        this.t = false;
        this.u = null;
        this.v = null;
        this.w = new b();
        this.y = false;
        this.A = new Rect();
        this.B = 0;
        this.C = 0;
        this.E = new ArrayList();
        H(preferenceGroup, z, i);
    }

    public void A(g7i g7iVar, int i, int i2, Preference preference) {
        View view = g7iVar.itemView;
        if (i != this.f36544r) {
            if (Boolean.TRUE.equals(view.getTag(dti.l))) {
                a0(view);
            }
        } else if (this.t) {
            this.t = false;
        } else {
            if (Boolean.TRUE.equals(view.getTag(dti.l))) {
                return;
            }
            Y(view, i2, preference);
        }
    }

    public void B() {
        if (this.E.isEmpty()) {
            return;
        }
        this.E.clear();
    }

    public final List<Preference> C(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < preferenceGroup.n(); i++) {
            Preference preferenceM = preferenceGroup.m(i);
            if (preferenceM.isVisible()) {
                arrayList.add(preferenceM);
            }
        }
        return arrayList;
    }

    public List<Preference> D() {
        return this.E;
    }

    public int E(int i) {
        return this.g[i].f36559b;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public final int F(Preference preference, int i) {
        int[] iArr;
        PreferenceGroup parent;
        int[] iArr2;
        int i2;
        boolean z;
        int[] iArr3;
        int[] iArr4;
        if (i >= 0) {
            h[] hVarArr = this.g;
            if (i < hVarArr.length) {
                if (hVarArr[i] == null) {
                    hVarArr[i] = new h();
                }
                iArr = this.g[i].f36558a;
            } else {
                iArr = null;
            }
        } else {
            iArr = null;
        }
        if (iArr == null && (parent = preference.getParent()) != null) {
            List<Preference> listC = C(parent);
            if (listC.isEmpty()) {
                return -1;
            }
            boolean zIsEmpty = true;
            if (!(preference instanceof PreferenceGroup) && ((parent instanceof PreferenceScreen) || (((parent instanceof RadioButtonPreferenceCategory) || (parent instanceof SingleChoicePreferenceCategory) || (parent instanceof MultiChoicePreferenceCategory)) && !M(preference)))) {
                int[] iArr5 = M;
                h hVar = this.g[i];
                hVar.f36558a = iArr5;
                hVar.f36559b = 1;
                return 1;
            }
            if (listC.size() == 1) {
                iArr2 = M;
                i2 = 1;
            } else if (preference.compareTo(listC.get(0)) == 0) {
                iArr2 = N;
                i2 = 2;
            } else if (preference.compareTo(listC.get(listC.size() - 1)) == 0) {
                iArr2 = P;
                i2 = 4;
            } else {
                iArr2 = O;
                i2 = 3;
            }
            if (preference instanceof PreferenceCategory) {
                PreferenceCategory preferenceCategory = (PreferenceCategory) preference;
                if (preferenceCategory instanceof miuix.preference.PreferenceCategory) {
                    miuix.preference.PreferenceCategory preferenceCategory2 = (miuix.preference.PreferenceCategory) preferenceCategory;
                    z = !preferenceCategory2.z();
                    if (preferenceCategory2.y()) {
                        zIsEmpty = false;
                    }
                } else {
                    zIsEmpty = TextUtils.isEmpty(preferenceCategory.getTitle());
                    z = false;
                }
                if (z || zIsEmpty) {
                    if (z) {
                        int[] iArr6 = R;
                        iArr3 = new int[iArr6.length];
                        System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
                    } else {
                        iArr3 = new int[0];
                    }
                    if (zIsEmpty) {
                        int[] iArr7 = Q;
                        iArr4 = new int[iArr7.length];
                        System.arraycopy(iArr7, 0, iArr4, 0, iArr7.length);
                    } else {
                        iArr4 = new int[0];
                    }
                    int[] iArr8 = new int[iArr3.length + iArr4.length + iArr2.length];
                    System.arraycopy(iArr3, 0, iArr8, 0, iArr3.length);
                    System.arraycopy(iArr4, 0, iArr8, iArr3.length, iArr4.length);
                    System.arraycopy(iArr2, 0, iArr8, iArr3.length + iArr4.length, iArr2.length);
                    iArr2 = iArr8;
                }
            }
            h hVar2 = this.g[i];
            hVar2.f36558a = iArr2;
            hVar2.f36559b = i2;
        }
        return this.g[i].f36559b;
    }

    public final void G(Preference preference, g7i g7iVar) {
        if (preference instanceof PreferenceCategory) {
            TextView textView = (TextView) g7iVar.a(R.id.title);
            if (textView == null || TextUtils.isEmpty(preference.getTitle())) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                textView.setAccessibilityHeading(true);
                return;
            }
            textView.setContentDescription(((Object) preference.getTitle()) + "," + preference.getContext().getString(c2j.f4864a));
            return;
        }
        if (preference instanceof CheckBoxPreference) {
            View viewA = g7iVar.a(R.id.checkbox);
            if (viewA != null) {
                viewA.setImportantForAccessibility(2);
            }
            if (K(preference)) {
                return;
            }
            androidx.core.view.c.r0(g7iVar.itemView, new c(preference));
            return;
        }
        if (preference instanceof SwitchPreference) {
            View viewA2 = g7iVar.a(R.id.switch_widget);
            if (viewA2 != null) {
                viewA2.setImportantForAccessibility(2);
            }
            if (K(preference)) {
                return;
            }
            androidx.core.view.c.r0(g7iVar.itemView, new d(preference));
        }
    }

    public final void H(PreferenceGroup preferenceGroup, boolean z, int i) {
        this.D = z;
        this.x = -1 == i;
        this.g = new h[getCount()];
        I(preferenceGroup.getContext());
    }

    public void I(Context context) {
        this.i = hm1.g(context, eii.w);
        this.f36543k = hm1.e(context, eii.f16684a);
        this.l = hm1.e(context, eii.f16685b);
        this.m = context.getResources().getDimensionPixelSize(imi.f);
        this.B = hm1.g(context, eii.f16686k);
        this.C = hm1.g(context, eii.j);
    }

    public final boolean J(Preference preference) {
        return (preference.getIntent() == null && preference.getFragment() == null && (preference.getOnPreferenceClickListener() == null || (preference instanceof TwoStatePreference)) && !(preference instanceof DialogPreference)) ? false : true;
    }

    public final boolean K(Preference preference) {
        return (preference instanceof RadioButtonPreference) || (preference instanceof SingleChoicePreference) || (preference instanceof MultiChoicePreference);
    }

    public boolean L() {
        return this.f36544r != -1;
    }

    public final boolean M(Preference preference) {
        if (!this.D) {
            return false;
        }
        PreferenceGroup parent = preference.getParent();
        if ((parent instanceof RadioButtonPreferenceCategory) && (preference instanceof RadioButtonPreference)) {
            return ((RadioButtonPreferenceCategory) parent).F();
        }
        if ((parent instanceof SingleChoicePreferenceCategory) && (preference instanceof SingleChoicePreference)) {
            return ((SingleChoicePreferenceCategory) parent).I();
        }
        if ((parent instanceof MultiChoicePreferenceCategory) && (preference instanceof MultiChoicePreference)) {
            return ((MultiChoicePreferenceCategory) parent).D();
        }
        return true;
    }

    public final boolean N(int i, Preference preference) {
        return (i != -1 && this.D && !(preference instanceof PreferenceScreen) && O(preference)) || (preference instanceof RadioButtonPreference) || (preference != null && (preference.getParent() instanceof RadioSetPreferenceCategory));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean O(Preference preference) {
        return preference instanceof z6i ? ((z6i) preference).d() : this.D;
    }

    public final /* synthetic */ void P(g7i g7iVar, int i) {
        Drawable foreground = g7iVar.itemView.getForeground();
        ((CardStateDrawable) foreground.mutate()).f(this.K, i);
        g7iVar.itemView.setForeground(foreground);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(g7i g7iVar) {
        super.onViewDetachedFromWindow(g7iVar);
        a0(g7iVar.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(g7i g7iVar) {
        super.onViewRecycled(g7iVar);
        a0(g7iVar.itemView);
    }

    public void S(RecyclerView recyclerView, String str) {
        int iE;
        if (L() || recyclerView == null || TextUtils.isEmpty(str) || (iE = e(str)) < 0) {
            return;
        }
        if (this.u == null) {
            this.u = new e();
        }
        if (this.v == null) {
            this.v = new f();
        }
        recyclerView.setOnTouchListener(this.u);
        recyclerView.addOnItemTouchListener(this.v);
        View childAt = recyclerView.getLayoutManager().getChildAt(iE);
        if (childAt != null) {
            Rect rect = new Rect();
            childAt.getGlobalVisibleRect(rect);
            if (rect.height() >= childAt.getHeight()) {
                this.f36544r = iE;
                RecyclerView recyclerView2 = this.n;
                if (recyclerView2 != null) {
                    this.o = recyclerView2.getItemAnimator();
                    this.n.setItemAnimator(null);
                }
                notifyItemChanged(this.f36544r);
                return;
            }
        }
        recyclerView.smoothScrollToPosition(iE);
        recyclerView.addOnScrollListener(new g(iE));
    }

    public void T(Paint paint, int i, int i2, int i3, int i4, int i5) {
        this.F = paint;
        this.G = i;
        this.H = i2;
        this.I = i3;
        this.J = i4;
        this.K = i5;
    }

    public final void U(int i, Preference preference) {
        float f2;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (Build.VERSION.SDK_INT > 31) {
            this.p.setBlinkRadius(0.0f);
            return;
        }
        if (!N(i, preference)) {
            this.p.setBlinkRadius(0.0f);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                f4 = this.K;
                f2 = 0.0f;
                f3 = 0.0f;
                f5 = f4;
            } else if (i == 4) {
                f2 = this.K;
                f3 = f2;
                f4 = 0.0f;
            }
            this.p.setBlinkRadius(f5, f4, f2, f3);
        }
        f5 = this.K;
        f4 = f5;
        f2 = f4;
        f3 = f2;
        this.p.setBlinkRadius(f5, f4, f2, f3);
    }

    public void V(boolean z) {
        this.y = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean W(View view, CardStateDrawable cardStateDrawable, Preference preference) {
        View childAt;
        if (!(view instanceof ViewGroup) || (childAt = ((ViewGroup) view).getChildAt(0)) == null || !childAt.getClass().getSimpleName().contains("CardView")) {
            return false;
        }
        int paddingLeft = view.getPaddingLeft();
        int paddingTop = view.getPaddingTop();
        int paddingRight = view.getPaddingRight();
        int paddingBottom = view.getPaddingBottom();
        if (childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            paddingLeft += marginLayoutParams.leftMargin;
            paddingTop += marginLayoutParams.topMargin;
            paddingRight += marginLayoutParams.rightMargin;
            paddingBottom += marginLayoutParams.bottomMargin;
        }
        if ((preference instanceof z6i) && ((z6i) preference).d()) {
            cardStateDrawable.e(0);
        } else {
            cardStateDrawable.e(this.m);
        }
        cardStateDrawable.c(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return true;
    }

    public void X(Preference preference) {
        this.z = preference;
        notifyDataSetChanged();
    }

    public final void Y(View view, int i, Preference preference) {
        view.setTag(dti.l, Boolean.TRUE);
        if (this.p == null) {
            FolmeBlink folmeBlink = (FolmeBlink) Folme.useAt(view).blink();
            this.p = folmeBlink;
            folmeBlink.setTintMode(3);
            U(i, preference);
            this.p.attach(this);
            this.p.startBlink(3, new AnimConfig[0]);
            this.s = view;
        }
        RecyclerView recyclerView = this.n;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(this.o);
        }
    }

    public void Z() {
        View view = this.s;
        if (view != null) {
            a0(view);
            FolmeBlink folmeBlink = this.p;
            if (folmeBlink != null) {
                folmeBlink.detach(this);
            }
            this.p = null;
            this.t = false;
        }
    }

    @Override // androidx.preference.a, androidx.preference.Preference.b
    public void a(Preference preference) {
        PreferenceGroup parent;
        super.a(preference);
        if ((preference instanceof PreferenceGroup) || (preference.getParent() instanceof PreferenceScreen) || (parent = preference.getParent()) == null || this.E.contains(parent)) {
            return;
        }
        this.E.add(parent);
    }

    public void a0(View view) {
        if (L() && view != null && Boolean.TRUE.equals(view.getTag(dti.l))) {
            Folme.useAt(view).blink().stopBlink();
            view.setTag(dti.l, Boolean.FALSE);
            if (this.s == view) {
                this.s = null;
            }
            this.f36544r = -1;
            RecyclerView recyclerView = this.n;
            if (recyclerView != null) {
                recyclerView.removeOnItemTouchListener(this.v);
                this.n.setOnTouchListener(null);
                this.v = null;
                this.u = null;
            }
        }
    }

    @Override // androidx.preference.a, androidx.preference.Preference.b
    public void c(Preference preference) {
        Preference preferenceA;
        super.c(preference);
        String dependency = preference.getDependency();
        if (TextUtils.isEmpty(dependency) || (preferenceA = preference.getPreferenceManager().a(dependency)) == null) {
            return;
        }
        if (!(preference instanceof PreferenceCategory)) {
            preference.setVisible(preference.isEnabled());
        } else if (preferenceA instanceof TwoStatePreference) {
            preference.setVisible(((TwoStatePreference) preferenceA).isChecked());
        } else {
            preference.setVisible(preferenceA.isEnabled());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.preference.a, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: n */
    public void onBindViewHolder(final g7i g7iVar, int i) {
        Drawable background;
        int i2;
        Drawable background2;
        View view = g7iVar.itemView;
        boolean z = view instanceof HyperCellLayout;
        if (z) {
            IHyperCellTemplate template = ((HyperCellLayout) view).getTemplate();
            if (template instanceof AbstractBaseTemplate) {
                ((AbstractBaseTemplate) template).storeVisibilityBeforeUpdate(g7iVar);
            }
        }
        super.onBindViewHolder(g7iVar, i);
        y94.b(g7iVar.itemView, false);
        Preference preferenceL = l(i);
        if (!(preferenceL instanceof l6i) || ((l6i) preferenceL).b()) {
            G(preferenceL, g7iVar);
        }
        boolean z2 = !(preferenceL instanceof DropDownPreference);
        if (z2) {
            g7iVar.itemView.setOnTouchListener(null);
        }
        if (this.y) {
            g7iVar.itemView.setActivated(preferenceL == this.z);
        } else {
            g7iVar.itemView.setActivated(false);
        }
        h hVar = this.g[i];
        int i3 = hVar != null ? hVar.f36559b : -1;
        final int iF = F(preferenceL, i);
        if (!this.x && N(iF, preferenceL) && Build.VERSION.SDK_INT > 31) {
            zvq.d(g7iVar, iF, this.K, i3 != iF, this.n.getItemAnimator() != null ? this.n.getItemAnimator().l() : 0L);
        }
        if (preferenceL == 0) {
            return;
        }
        int i4 = this.q;
        if (!this.D) {
            Drawable background3 = g7iVar.itemView.getBackground();
            if (((preferenceL instanceof PreferenceGroup) || (preferenceL.getParent() instanceof RadioSetPreferenceCategory) || (preferenceL.getParent() instanceof RadioButtonPreferenceCategory) || (preferenceL instanceof RadioButtonPreference)) && !(preferenceL instanceof PreferenceScreen)) {
                if (preferenceL instanceof PreferenceCategory) {
                    if (background3 != null) {
                        if (background3 instanceof LayerDrawable) {
                            ((LayerDrawable) background3).setLayerInset(0, i4, 0, i4, 0);
                            vzo vzoVar = new vzo(background3);
                            g7iVar.itemView.setBackground(vzoVar);
                            int[] iArr = this.g[i].f36558a;
                            if (iArr != null) {
                                vzoVar.d(iArr);
                            }
                        }
                        background3.getPadding(this.A);
                        View view2 = g7iVar.itemView;
                        Rect rect = this.A;
                        view2.setPadding(rect.left + i4, rect.top, rect.right + i4, rect.bottom);
                    }
                } else if (background3 != null) {
                    background3.getPadding(this.A);
                    View view3 = g7iVar.itemView;
                    Rect rect2 = this.A;
                    view3.setPadding(rect2.left, rect2.top, rect2.right, rect2.bottom);
                }
            } else if (background3 != null) {
                background3.getPadding(this.A);
                boolean zB = eyq.b(this.n);
                int i5 = zB ? this.C : this.B;
                int i6 = zB ? this.B : this.C;
                View view4 = g7iVar.itemView;
                Rect rect3 = this.A;
                view4.setPadding(rect3.left + i5 + i4, rect3.top, rect3.right + i6 + i4, rect3.bottom);
            }
        } else if (preferenceL instanceof PreferenceScreen) {
            Drawable background4 = g7iVar.itemView.getBackground();
            if (background4 != null) {
                background4.getPadding(this.A);
                boolean zB2 = eyq.b(this.n);
                int i7 = zB2 ? this.C : this.B;
                int i8 = zB2 ? this.B : this.C;
                View view5 = g7iVar.itemView;
                Rect rect4 = this.A;
                view5.setPadding(rect4.left + i7 + i4, rect4.top, rect4.right + i8 + i4, rect4.bottom);
            }
        } else if (preferenceL instanceof PreferenceCategory) {
            Drawable background5 = g7iVar.itemView.getBackground();
            if (background5 != null) {
                background5.getPadding(this.A);
                View view6 = g7iVar.itemView;
                Rect rect5 = this.A;
                view6.setPadding(rect5.left + i4, rect5.top, rect5.right + i4, rect5.bottom);
            }
        } else if ((preferenceL instanceof z6i) && !((z6i) preferenceL).d() && (background = g7iVar.itemView.getBackground()) != null) {
            background.getPadding(this.A);
            boolean zB3 = eyq.b(this.n);
            int i9 = zB3 ? this.C : this.B;
            int i10 = zB3 ? this.B : this.C;
            View view7 = g7iVar.itemView;
            Rect rect6 = this.A;
            view7.setPadding(rect6.left + i9 + i4, rect6.top, rect6.right + i10 + i4, rect6.bottom);
        }
        if ((preferenceL.getParent() instanceof RadioSetPreferenceCategory) && !(preferenceL instanceof RadioButtonPreference) && (background2 = g7iVar.itemView.getBackground()) != null) {
            background2.getPadding(this.A);
            if (eyq.b(this.n)) {
                this.A.right += this.i;
            } else {
                this.A.left += this.i;
            }
            View view8 = g7iVar.itemView;
            Rect rect7 = this.A;
            view8.setPadding(rect7.left, rect7.top, rect7.right, rect7.bottom);
        }
        View viewFindViewById = g7iVar.itemView.findViewById(dti.c);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(J(preferenceL) ? 0 : 8);
        }
        if (r(preferenceL)) {
            int i11 = Build.VERSION.SDK_INT;
            if (g7iVar.itemView.findViewById(dti.f15919k) != null) {
                Drawable foreground = g7iVar.itemView.getForeground();
                if (foreground == null) {
                    Drawable drawableH = hm1.h(preferenceL.getContext(), eii.h);
                    if (drawableH instanceof LayerDrawable) {
                        int i12 = this.D ? 0 : i4;
                        ((LayerDrawable) drawableH).setLayerInset(0, i12, 0, i12, 0);
                    }
                    g7iVar.itemView.setForeground(drawableH);
                    if (z2) {
                        g7iVar.itemView.setOnTouchListener(this.w);
                    }
                } else if (foreground instanceof LayerDrawable) {
                    LayerDrawable layerDrawable = (LayerDrawable) foreground;
                    int i13 = this.D ? 0 : i4;
                    layerDrawable.setLayerInset(0, i13, 0, i13, 0);
                    layerDrawable.invalidateSelf();
                }
            } else if (g7iVar.itemView.getForeground() == null) {
                Drawable drawableH2 = hm1.h(preferenceL.getContext(), eii.u);
                if (drawableH2 instanceof CardStateDrawable) {
                    if (!N(iF, preferenceL) || i11 > 31) {
                        i2 = 0;
                        ((CardStateDrawable) drawableH2).e(0);
                    } else {
                        drawableH2 = drawableH2.mutate();
                        ((CardStateDrawable) drawableH2).f(this.K, iF);
                        i2 = 0;
                    }
                    CardStateDrawable cardStateDrawable = (CardStateDrawable) drawableH2;
                    cardStateDrawable.c(i2, i2, i2, i2);
                    W(g7iVar.itemView, cardStateDrawable, preferenceL);
                }
                g7iVar.itemView.setForeground(drawableH2);
                if (z2) {
                    g7iVar.itemView.setOnTouchListener(this.w);
                }
            } else {
                Drawable foreground2 = g7iVar.itemView.getForeground();
                if (foreground2 instanceof CardStateDrawable) {
                    CardStateDrawable cardStateDrawable2 = (CardStateDrawable) foreground2;
                    cardStateDrawable2.c(0, 0, 0, 0);
                    if (W(g7iVar.itemView, cardStateDrawable2, preferenceL)) {
                        g7iVar.itemView.setForeground(foreground2);
                    }
                }
                if (i11 <= 31) {
                    Drawable foreground3 = g7iVar.itemView.getForeground();
                    if ((foreground3 instanceof CardStateDrawable) && N(iF, preferenceL)) {
                        if (i3 != iF) {
                            g7iVar.itemView.postDelayed(new Runnable() { // from class: u6i
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f35466a.P(g7iVar, iF);
                                }
                            }, this.n.getItemAnimator() != null ? this.n.getItemAnimator().l() : 100L);
                        } else {
                            ((CardStateDrawable) foreground3.mutate()).f(this.K, iF);
                            g7iVar.itemView.setForeground(foreground3);
                            if (z2) {
                                g7iVar.itemView.setOnTouchListener(this.w);
                            }
                        }
                    }
                }
            }
        }
        A(g7iVar, i, iF, preferenceL);
        if (preferenceL instanceof q6i) {
            ((q6i) preferenceL).c(g7iVar, i4);
        }
        if (z) {
            IHyperCellTemplate template2 = ((HyperCellLayout) g7iVar.itemView).getTemplate();
            if (template2 instanceof AbstractBaseTemplate) {
                ((AbstractBaseTemplate) template2).refreshLayoutIfVisibleChanged(g7iVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        registerAdapterDataObserver(this.h);
        this.n = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        unregisterAdapterDataObserver(this.h);
        this.n = null;
    }

    @Override // defpackage.zk8
    public void onExtraPaddingChanged(int i) {
        this.q = i;
        notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r(Preference preference) {
        if (preference instanceof PreferenceCategory) {
            return false;
        }
        if (preference instanceof qz9) {
            return ((qz9) preference).a();
        }
        return true;
    }

    @Override // defpackage.zk8
    public boolean setExtraHorizontalPadding(int i) {
        if (this.q == i) {
            return false;
        }
        this.q = i;
        return true;
    }

    @Override // miuix.animation.internal.BlinkStateObserver
    public void updateBlinkState(boolean z) {
        RecyclerView recyclerView;
        if (!z || (recyclerView = this.n) == null) {
            return;
        }
        recyclerView.removeOnItemTouchListener(this.v);
        this.n.setOnTouchListener(null);
        this.v = null;
        this.u = null;
        FolmeBlink folmeBlink = this.p;
        if (folmeBlink != null) {
            folmeBlink.detach(this);
        }
    }
}
