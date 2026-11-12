package miuix.preference;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.al8;
import defpackage.e3n;
import defpackage.eii;
import defpackage.eyq;
import defpackage.fh4;
import defpackage.fm3;
import defpackage.g5j;
import defpackage.gwi;
import defpackage.hm1;
import defpackage.imi;
import defpackage.osc;
import defpackage.p56;
import defpackage.p62;
import defpackage.pwk;
import defpackage.rkr;
import defpackage.tc8;
import defpackage.v6i;
import defpackage.vsi;
import defpackage.wc0;
import defpackage.xcd;
import defpackage.z6i;
import defpackage.zk8;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import miuix.appcompat.app.AppCompatActivity;
import miuix.appcompat.internal.app.widget.ActionBarImpl;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.flexible.template.TemplateFactory;
import miuix.preference.PreferenceFragment;
import miuix.preference.flexible.DropdownPreferenceTemplate;
import miuix.preference.flexible.MiuixPreferenceTemplate;
import miuix.preference.flexible.RadioButtonPreferenceTemplate;
import miuix.preference.flexible.TextPreferenceTemplate;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PreferenceFragment extends PreferenceFragmentCompat implements osc {
    public static final int CARD_STYLE = 1;
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    public static final int DISABLE_ALL_CARD_STYLE = -1;
    public static final int FORCE_CARD_STYLE = 2;
    public static final int TRADITIONAL_STYLE = 0;
    public static final int VERTICAL_PADDING_NOT_CUSTOMIZED = -1;
    private int mCardStyle;
    private boolean mConfigChangeUpdateViewEnable;
    protected Rect mContentInset;
    private int mDeviceType;
    private al8 mExtraPaddingPolicy;
    private c mFrameDecoration;
    private v6i mGroupAdapter;
    private boolean mIsEnableCardStyle;
    private View mListContainer;
    private int mListViewPaddingBottom;
    private boolean mUserExtraPaddingPolicy;
    private boolean mIsOverlayMode = false;
    private boolean mAdapterInvalid = true;
    private boolean mItemSelectable = false;
    private int mCurSelectedItem = -1;
    private boolean mExtraPaddingEnable = true;
    private boolean mExtraPaddingInitEnable = false;
    private List<zk8> mExtraPaddingObserver = null;
    private int mExtraHorizontalPadding = 0;

    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        public static /* synthetic */ void b(RecyclerView recyclerView) {
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.k();
            }
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Context context = PreferenceFragment.this.getContext();
            if (context != null) {
                int i9 = i8 - i6;
                int i10 = i3 - i;
                int i11 = i4 - i2;
                if (i10 == i7 - i5 && i11 == i9) {
                    return;
                }
                if (PreferenceFragment.this.mFrameDecoration != null) {
                    PreferenceFragment.this.mFrameDecoration.w(i11);
                }
                if (PreferenceFragment.this.mExtraPaddingPolicy != null) {
                    PreferenceFragment preferenceFragment = PreferenceFragment.this;
                    if (preferenceFragment.updateExtraPaddingHorizontal(context, preferenceFragment.mExtraPaddingPolicy, i10, i11)) {
                        int extraHorizontalPadding = PreferenceFragment.this.getExtraHorizontalPadding();
                        if (PreferenceFragment.this.mExtraPaddingObserver != null) {
                            for (int i12 = 0; i12 < PreferenceFragment.this.mExtraPaddingObserver.size(); i12++) {
                                ((zk8) PreferenceFragment.this.mExtraPaddingObserver.get(i12)).onExtraPaddingChanged(extraHorizontalPadding);
                            }
                        }
                        PreferenceFragment.this.onExtraPaddingChanged(extraHorizontalPadding);
                        final RecyclerView listView = PreferenceFragment.this.getListView();
                        if (listView != null) {
                            if (PreferenceFragment.this.mGroupAdapter != null) {
                                PreferenceFragment.this.mGroupAdapter.onExtraPaddingChanged(extraHorizontalPadding);
                            }
                            listView.post(new Runnable() { // from class: s6i
                                @Override // java.lang.Runnable
                                public final void run() {
                                    PreferenceFragment.a.b(listView);
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f26834a;

        public b(String str) {
            this.f26834a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PreferenceFragment.this.mGroupAdapter != null) {
                PreferenceFragment.this.mGroupAdapter.S(PreferenceFragment.this.getListView(), this.f26834a);
            }
        }
    }

    public class c extends p62 {
        public Paint f;
        public int g;
        public boolean h;
        public int i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f26836k;
        public int l;
        public int m;
        public d n;
        public final ArrayList<d> o;
        public int p;
        public Drawable q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f26837r;
        public int s;
        public boolean t;

        public /* synthetic */ c(PreferenceFragment preferenceFragment, Context context, a aVar) {
            this(context);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0073  */
        /* JADX WARN: Code duplicated, block: B:43:0x0110  */
        @Override // defpackage.p62
        public void c(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar, RecyclerView.Adapter<?> adapter) {
            int i;
            int width;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            d dVar;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            if (PreferenceFragment.this.mAdapterInvalid || PreferenceFragment.this.isDisableAllCardStyle()) {
                return;
            }
            this.o.clear();
            int childCount = recyclerView.getChildCount();
            boolean zB = eyq.b(recyclerView);
            this.h = zB;
            if (zB) {
                i = this.e + PreferenceFragment.this.mExtraHorizontalPadding;
                width = recyclerView.getWidth() - this.d;
                i2 = PreferenceFragment.this.mExtraHorizontalPadding;
            } else {
                i = this.d + PreferenceFragment.this.mExtraHorizontalPadding;
                width = recyclerView.getWidth() - this.e;
                i2 = PreferenceFragment.this.mExtraHorizontalPadding;
            }
            int i13 = i;
            int i14 = width - i2;
            int i15 = 0;
            int i16 = 0;
            while (i16 < childCount) {
                View childAt = recyclerView.getChildAt(i16);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                Preference preferenceL = PreferenceFragment.this.mGroupAdapter.l(childAdapterPosition);
                if (preferenceL == null) {
                    i8 = i15;
                    i9 = i16;
                    i10 = i14;
                    i11 = i13;
                    i12 = childCount;
                    i14 = i10;
                    i3 = i11;
                    i4 = i12;
                    i15 = i8;
                    i7 = i9;
                } else {
                    int iE = PreferenceFragment.this.mGroupAdapter.E(childAdapterPosition);
                    a aVar = null;
                    if (i15 >= this.o.size()) {
                        d dVar2 = new d(PreferenceFragment.this, aVar);
                        this.n = dVar2;
                        this.o.add(dVar2);
                    } else if (this.n == null) {
                        this.n = this.o.get(i15);
                    }
                    boolean z = preferenceL instanceof RadioButtonPreference;
                    if (z || (preferenceL.getParent() instanceof RadioSetPreferenceCategory)) {
                        int i17 = i15;
                        int i18 = childCount;
                        i3 = i13;
                        i4 = i18;
                        RadioSetPreferenceCategory radioSetPreferenceCategory = preferenceL.getParent() instanceof RadioSetPreferenceCategory ? (RadioSetPreferenceCategory) preferenceL.getParent() : null;
                        if (iE == 1 || iE == 2) {
                            d dVar3 = this.n;
                            dVar3.e |= 1;
                            dVar3.d = true;
                            dVar3.f = true;
                            if (preferenceL.getParent() != null) {
                                i5 = i16;
                                k(recyclerView, preferenceL, childAt, childAdapterPosition, i5);
                            } else {
                                i5 = i16;
                            }
                        } else {
                            i5 = i16;
                        }
                        if (iE == 4 || iE == 3) {
                            this.n.f = true;
                            d dVar4 = this.n;
                            dVar4.e |= 2;
                            if (dVar4.f26838a.bottom < childAt.getY() + childAt.getHeight()) {
                                this.n.f26838a.bottom = childAt.getY() + childAt.getHeight();
                            }
                        }
                        if (radioSetPreferenceCategory == null || radioSetPreferenceCategory.z() != preferenceL || (dVar = this.n) == null) {
                            i6 = i5;
                        } else {
                            i6 = i5;
                            dVar.f26839b = i6;
                        }
                        if (this.n != null) {
                            if (preferenceL.getParent() instanceof RadioSetPreferenceCategory) {
                                this.n.g = false;
                                RadioSetPreferenceCategory radioSetPreferenceCategory2 = (RadioSetPreferenceCategory) preferenceL.getParent();
                                int iN = radioSetPreferenceCategory2.n();
                                for (int i19 = 0; i19 < iN; i19++) {
                                    Preference preferenceM = radioSetPreferenceCategory2.m(i19);
                                    if ((preferenceM instanceof RadioButtonPreference) && ((RadioButtonPreference) preferenceM).isChecked()) {
                                        this.n.g = true;
                                        break;
                                    }
                                }
                            } else if (z) {
                                this.n.g = ((RadioButtonPreference) preferenceL).isChecked();
                            }
                        }
                        if (iE == 1 || iE == 4) {
                            i7 = i6;
                            i(recyclerView, preferenceL, childAt, i6, i4);
                            this.n.c = m(recyclerView, i7, i4);
                            this.n.e |= 4;
                            this.n = null;
                            i15 = i17 + 1;
                        } else {
                            i7 = i6;
                            i15 = i17;
                        }
                    } else {
                        if (t(preferenceL)) {
                            i8 = i15;
                            i9 = i16;
                            i10 = i14;
                            i11 = i13;
                            i12 = childCount;
                            if (j(preferenceL, iE, i16, recyclerView, childCount, childAdapterPosition, childAt)) {
                                i15 = i8 + 1;
                                i14 = i10;
                                i3 = i11;
                                i4 = i12;
                            }
                            i7 = i9;
                        } else {
                            i8 = i15;
                            i9 = i16;
                            i10 = i14;
                            i11 = i13;
                            i12 = childCount;
                        }
                        i14 = i10;
                        i3 = i11;
                        i4 = i12;
                        i15 = i8;
                        i7 = i9;
                    }
                }
                i16 = i7 + 1;
                i14 = i14;
                int i20 = i3;
                childCount = i4;
                i13 = i20;
            }
            int i21 = i14;
            int i22 = i13;
            int i23 = 0;
            while (i23 < this.o.size()) {
                d dVar5 = this.o.get(i23);
                RectF rectF = dVar5.f26838a;
                float f = rectF.top;
                float f2 = rectF.bottom;
                RectF rectF2 = new RectF();
                int i24 = i21;
                rectF2.set(i22, f, i24, f2);
                if (f2 - f > 0.0f) {
                    int i25 = dVar5.e;
                    boolean z2 = (i25 & 1) != 0;
                    boolean z3 = (i25 & 4) != 0;
                    float f3 = z2 ? this.c : 0.0f;
                    float f4 = z3 ? this.c : 0.0f;
                    this.f30051b.reset();
                    this.f30051b.addRoundRect(rectF2, new float[]{f3, f3, f3, f3, f4, f4, f4, f4}, Path.Direction.CW);
                    if (!dVar5.f || PreferenceFragment.this.mIsEnableCardStyle) {
                        Drawable drawable = this.q;
                        if (drawable != null) {
                            if (drawable instanceof ColorDrawable) {
                                this.f30050a.setColor(((ColorDrawable) drawable).getColor());
                                canvas.drawPath(this.f30051b, this.f30050a);
                            } else {
                                d(canvas, rectF2, this.f30051b, drawable);
                            }
                        }
                    } else {
                        this.f30050a.setColor(dVar5.g ? this.f26837r : this.s);
                        canvas.drawPath(this.f30051b, this.f30050a);
                    }
                }
                i23++;
                i21 = i24;
            }
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return;
            }
            if (itemAnimator.p()) {
                this.t = true;
                return;
            }
            if (this.t) {
                PreferenceFragment.this.mGroupAdapter.B();
            }
            this.t = false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            int childAdapterPosition;
            Preference preferenceL;
            if (PreferenceFragment.this.mAdapterInvalid || PreferenceFragment.this.isDisableAllCardStyle() || (preferenceL = PreferenceFragment.this.mGroupAdapter.l((childAdapterPosition = recyclerView.getChildAdapterPosition(view)))) == null) {
                return;
            }
            if ((preferenceL.getParent() instanceof RadioSetPreferenceCategory) || ((!(preferenceL instanceof PreferenceGroup) && (preferenceL.getParent() instanceof RadioButtonPreferenceCategory)) || (preferenceL instanceof RadioButtonPreference))) {
                u(rect, preferenceL, childAdapterPosition, recyclerView);
                return;
            }
            if (t(preferenceL)) {
                u(rect, preferenceL, childAdapterPosition, recyclerView);
            }
            if (recyclerView.getAdapter() == null || recyclerView.getAdapter().getCount() != childAdapterPosition + 1) {
                return;
            }
            rect.bottom = 0;
        }

        public final void i(RecyclerView recyclerView, Preference preference, View view, int i, int i2) {
            if (preference.getParent() == null || view == null) {
                return;
            }
            float fP = p(recyclerView, view, i, i2, true);
            if (!PreferenceFragment.this.mGroupAdapter.D().contains(preference.getParent())) {
                this.n.f26838a.bottom = view.getY() + view.getHeight();
            } else if (fP == -1.0f || q(recyclerView, i, i2) == null) {
                this.n.f26838a.bottom = view.getY() + view.getHeight();
            } else {
                this.n.f26838a.bottom = fP - this.m;
            }
        }

        public final boolean j(Preference preference, int i, int i2, RecyclerView recyclerView, int i3, int i4, View view) {
            int i5 = preference.getParent() instanceof PreferenceScreen ? 1 : i;
            if (i5 != 1 && (i5 != 2 || n(recyclerView, i2, i3))) {
                if (i5 == 2) {
                    this.n.e |= 1;
                    k(recyclerView, preference, view, i4, i2);
                }
                if (i5 == 4 || i5 == 3) {
                    d dVar = this.n;
                    dVar.e |= 2;
                    if (dVar.f26838a.bottom < view.getY() + view.getHeight()) {
                        this.n.f26838a.bottom = view.getY() + view.getHeight();
                    }
                }
                d dVar2 = this.n;
                if (dVar2 == null || i5 != 4) {
                    return false;
                }
                dVar2.e |= 4;
                i(recyclerView, preference, view, i2, i3);
                RectF rectF = this.n.f26838a;
                if (rectF.bottom <= rectF.top) {
                    rectF.top = view.getY();
                }
                this.n = null;
                return true;
            }
            this.n.e |= 1;
            k(recyclerView, preference, view, i4, i2);
            if (i5 == 1) {
                this.n.e |= 4;
            }
            i(recyclerView, preference, view, i2, i3);
            this.n = null;
            return true;
        }

        public final void k(RecyclerView recyclerView, Preference preference, View view, int i, int i2) {
            if (preference.getParent() == null) {
                this.n.f26838a.top = view.getY();
                return;
            }
            if (PreferenceFragment.this.mGroupAdapter.D().contains(preference.getParent())) {
                boolean zO = o(i);
                float fP = p(recyclerView, view, i2, 0, false);
                if (r(recyclerView, i2) == null) {
                    this.n.f26838a.top = view.getY();
                } else if (zO) {
                    if (fP == -1.0f) {
                        this.n.f26838a.top = view.getY();
                    } else {
                        this.n.f26838a.top = fP + this.m;
                    }
                } else if (fP == -1.0f) {
                    this.n.f26838a.top = view.getY();
                } else {
                    this.n.f26838a.top = fP;
                }
            } else {
                this.n.f26838a.top = view.getY();
            }
            if (this.n.f26838a.bottom < view.getY() + view.getHeight()) {
                this.n.f26838a.bottom = view.getY() + view.getHeight();
            }
        }

        public final void l(Rect rect, int i, Preference preference) {
            int iE = PreferenceFragment.this.mGroupAdapter.E(i);
            if (preference.getParent() instanceof PreferenceScreen) {
                iE = 1;
            }
            if (iE == 1 || iE == 4) {
                rect.bottom += this.m;
            }
        }

        public final boolean m(RecyclerView recyclerView, int i, int i2) {
            int i3 = i + 1;
            if (i3 < i2) {
                return !(PreferenceFragment.this.mGroupAdapter.l(recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i3))) instanceof RadioSetPreferenceCategory);
            }
            return false;
        }

        public final boolean n(RecyclerView recyclerView, int i, int i2) {
            return !(q(recyclerView, i, i2) instanceof PreferenceGroup);
        }

        public final boolean o(int i) {
            int i2 = i - 1;
            if (i2 >= 0) {
                return !((PreferenceFragment.this.mGroupAdapter != null ? PreferenceFragment.this.mGroupAdapter.l(i2) : null) instanceof PreferenceGroup);
            }
            return false;
        }

        public final int p(RecyclerView recyclerView, View view, int i, int i2, boolean z) {
            View childAt;
            if (z) {
                if (view == null || view.getTop() >= this.p) {
                    return -1;
                }
                do {
                    i++;
                    if (i < i2) {
                        childAt = recyclerView.getChildAt(i);
                    }
                } while (childAt == null);
                return (int) childAt.getY();
            }
            for (int i3 = i - 1; i3 >= i2; i3--) {
                View childAt2 = recyclerView.getChildAt(i3);
                if (childAt2 != null) {
                    return ((int) childAt2.getY()) + childAt2.getHeight();
                }
            }
            return -1;
        }

        public final Preference q(RecyclerView recyclerView, int i, int i2) {
            int i3 = i + 1;
            if (i3 >= i2) {
                return null;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i3));
            if (PreferenceFragment.this.mGroupAdapter != null) {
                return PreferenceFragment.this.mGroupAdapter.l(childAdapterPosition);
            }
            return null;
        }

        public final Preference r(RecyclerView recyclerView, int i) {
            int i2 = i - 1;
            if (i2 < 0) {
                return null;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i2));
            if (PreferenceFragment.this.mGroupAdapter != null) {
                return PreferenceFragment.this.mGroupAdapter.l(childAdapterPosition);
            }
            return null;
        }

        public void s(Context context) {
            this.i = context.getResources().getDimensionPixelSize(imi.c);
            this.j = context.getResources().getDimensionPixelSize(imi.f21300b);
            this.f26836k = hm1.g(context, eii.f16687r);
            this.l = hm1.g(context, eii.s);
            this.c = context.getResources().getDimensionPixelSize(imi.i);
            this.d = hm1.g(context, eii.f16686k);
            this.e = hm1.g(context, eii.j);
            this.f26837r = hm1.e(context, eii.f16684a);
            this.s = hm1.e(context, eii.f16685b);
            this.m = context.getResources().getDimensionPixelSize(imi.f21299a);
            if (PreferenceFragment.this.mIsEnableCardStyle) {
                Drawable drawableH = hm1.h(context, eii.i);
                this.q = drawableH;
                if (drawableH instanceof ColorDrawable) {
                    this.f30050a.setColor(((ColorDrawable) drawableH).getColor());
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean t(Preference preference) {
            if (!PreferenceFragment.this.mIsEnableCardStyle || (preference instanceof PreferenceGroup)) {
                return false;
            }
            if (preference instanceof z6i) {
                return ((z6i) preference).d();
            }
            return true;
        }

        public final void u(Rect rect, Preference preference, int i, RecyclerView recyclerView) {
            boolean zB = eyq.b(recyclerView);
            int i2 = zB ? this.e : this.d;
            int i3 = zB ? this.d : this.e;
            rect.left = i2 + PreferenceFragment.this.mExtraHorizontalPadding;
            rect.right = i3 + PreferenceFragment.this.mExtraHorizontalPadding;
            l(rect, i, preference);
        }

        public void v() {
            if (!(PreferenceFragment.this.getActivity() instanceof AppCompatActivity) || ((AppCompatActivity) PreferenceFragment.this.getActivity()).isInFloatingWindowMode()) {
                this.f30050a.setColor(hm1.e(PreferenceFragment.this.getContext(), eii.t));
            } else {
                this.f30050a.setColor(hm1.e(PreferenceFragment.this.getContext(), eii.v));
            }
        }

        public void w(int i) {
            this.p = i;
        }

        public c(Context context) {
            this.h = false;
            this.o = new ArrayList<>();
            this.f30050a.setAntiAlias(true);
            v();
            s(context);
            Paint paint = new Paint();
            this.f = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            int iE = hm1.e(context, eii.f16685b);
            this.g = iE;
            this.f.setColor(iE);
            this.f.setAntiAlias(true);
        }
    }

    static {
        TemplateFactory.registerTemplate("dropdownPreference", DropdownPreferenceTemplate.class);
        TemplateFactory.registerTemplate("textPreference", TextPreferenceTemplate.class);
        TemplateFactory.registerTemplate("radioButtonPreference", RadioButtonPreferenceTemplate.class);
        TemplateFactory.registerTemplate("preference", MiuixPreferenceTemplate.class);
    }

    private void initExtraPaddingPolicy() {
        al8 al8VarB = al8.a.b(this.mDeviceType, fh4.d, fh4.e);
        this.mExtraPaddingPolicy = al8VarB;
        if (al8VarB != null) {
            al8VarB.j(this.mExtraPaddingEnable);
            float f = getResources().getDisplayMetrics().density;
            if (this.mExtraPaddingPolicy.h()) {
                this.mExtraHorizontalPadding = (int) ((this.mExtraPaddingPolicy.f() * f) + 0.5f);
            } else {
                this.mExtraHorizontalPadding = 0;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDisableAllCardStyle() {
        return -1 == this.mCardStyle;
    }

    private boolean isTabletOrFold() {
        int i = this.mDeviceType;
        return i == 2 || i == 3 || i == 5;
    }

    private void setActionBarOverLayoutBg() {
        FragmentActivity activity;
        Drawable drawableH;
        if (!this.mIsEnableCardStyle || (activity = getActivity()) == null) {
            return;
        }
        Window window = activity.getWindow();
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) activity.findViewById(vsi.j);
        Drawable drawableH2 = hm1.h(getContext(), eii.l);
        if (!isInFloatingWindowMode() && (drawableH = hm1.h(getContext(), eii.m)) != null) {
            drawableH2 = drawableH;
        }
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setBackground(drawableH2);
        } else {
            View viewFindViewById = window.getDecorView().findViewById(R.id.content);
            if (viewFindViewById == null || viewFindViewById.getParent() == null || !(viewFindViewById.getParent() instanceof View)) {
                window.setBackgroundDrawable(drawableH2);
            } else {
                ((View) viewFindViewById.getParent()).setBackground(drawableH2);
            }
        }
        if (tc8.o(getContext())) {
            return;
        }
        int i = window.getAttributes().flags;
        boolean z = (Integer.MIN_VALUE & i) != 0;
        boolean z2 = (i & 134217728) != 0;
        if (z && !z2 && (drawableH2 instanceof ColorDrawable)) {
            window.setNavigationBarColor(((ColorDrawable) drawableH2).getColor());
        }
    }

    private void updateActionBarOverlay() {
        osc oscVar;
        Fragment parentFragment = getParentFragment();
        while (true) {
            if (parentFragment == null) {
                oscVar = null;
                break;
            }
            if (parentFragment instanceof osc) {
                oscVar = (osc) parentFragment;
                if (oscVar.hasActionBar()) {
                    break;
                }
            }
            parentFragment = parentFragment.getParentFragment();
        }
        Context themedContext = oscVar != null ? oscVar.getThemedContext() : getActivity();
        if (themedContext != null) {
            this.mIsOverlayMode = hm1.d(themedContext, eii.G, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean updateExtraPaddingHorizontal(Context context, al8 al8Var, int i, int i2) {
        Resources resources = context.getResources();
        rkr rkrVarJ = tc8.j(context, resources.getConfiguration());
        if (i == 0) {
            i = rkrVarJ.c.x;
        }
        int i3 = i;
        if (i2 == 0) {
            i2 = rkrVarJ.c.y;
        }
        float f = resources.getDisplayMetrics().density;
        Point point = rkrVarJ.d;
        al8Var.i(point.x, point.y, i3, i2, f, isInFloatingWindowMode());
        return setExtraHorizontalPadding(al8Var.h() ? (int) ((al8Var.f() * f) + 0.5f) : 0);
    }

    @Override // defpackage.osc
    public boolean acceptExtraPaddingFromParent() {
        return false;
    }

    public void addExtraPaddingObserver(zk8 zk8Var) {
        if (this.mExtraPaddingObserver == null) {
            this.mExtraPaddingObserver = new CopyOnWriteArrayList();
        }
        if (this.mExtraPaddingObserver.contains(zk8Var)) {
            return;
        }
        this.mExtraPaddingObserver.add(zk8Var);
        zk8Var.setExtraHorizontalPadding(this.mExtraHorizontalPadding);
    }

    @Override // defpackage.lqc
    public void bindViewWithContentInset(View view) {
        LifecycleOwner parentFragment = getParentFragment();
        if (parentFragment instanceof osc) {
            ((osc) parentFragment).bindViewWithContentInset(view);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof AppCompatActivity) {
            ((AppCompatActivity) activity).bindViewWithContentInset(view);
        }
    }

    @Override // defpackage.osc
    public void checkThemeLegality() {
    }

    public void dismissImmersionMenu(boolean z) {
    }

    @Override // defpackage.osc
    public wc0 getActionBar() {
        LifecycleOwner parentFragment = getParentFragment();
        FragmentActivity activity = getActivity();
        if (parentFragment == null && (activity instanceof AppCompatActivity)) {
            return ((AppCompatActivity) activity).getAppCompatActionBar();
        }
        if (parentFragment instanceof osc) {
            return ((osc) parentFragment).getActionBar();
        }
        return null;
    }

    @Override // defpackage.lqc
    public Rect getContentInset() {
        if (this.mIsOverlayMode && this.mContentInset == null) {
            LifecycleOwner parentFragment = getParentFragment();
            if (parentFragment == null && (getActivity() instanceof AppCompatActivity)) {
                this.mContentInset = ((AppCompatActivity) getActivity()).getContentInset();
            } else if (parentFragment instanceof osc) {
                this.mContentInset = ((osc) parentFragment).getContentInset();
            }
        }
        return this.mContentInset;
    }

    public int getExtraHorizontalPadding() {
        return this.mExtraHorizontalPadding;
    }

    public al8 getExtraPaddingPolicy() {
        return this.mExtraPaddingPolicy;
    }

    public int getListViewPaddingBottom() {
        return -1;
    }

    public int getListViewPaddingTop() {
        return -1;
    }

    public List<Preference> getPreferenceAmimationList() {
        v6i v6iVar = this.mGroupAdapter;
        if (v6iVar != null) {
            return v6iVar.D();
        }
        return null;
    }

    @Override // defpackage.osc
    public Context getThemedContext() {
        return getContext();
    }

    @Override // defpackage.osc
    public boolean hasActionBar() {
        return false;
    }

    public void hideEndOverflowMenu() {
    }

    public void hideOverflowMenu() {
    }

    public boolean isActionBarOverlay() {
        return this.mIsOverlayMode;
    }

    public boolean isConfigChangeUpdateViewEnable() {
        return true;
    }

    @Override // defpackage.bl8
    public boolean isExtraHorizontalPaddingEnable() {
        return this.mExtraPaddingEnable;
    }

    public boolean isHighlightRequested() {
        v6i v6iVar = this.mGroupAdapter;
        if (v6iVar != null) {
            return v6iVar.L();
        }
        return false;
    }

    @Override // defpackage.osc
    public boolean isInEditActionMode() {
        return false;
    }

    public boolean isInFloatingWindowMode() {
        FragmentActivity activity = getActivity();
        if (activity instanceof AppCompatActivity) {
            return ((AppCompatActivity) activity).isInFloatingWindowMode();
        }
        return false;
    }

    public boolean isInMiuiSettingMultiWindowMode() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return xcd.b(activity.getIntent());
        }
        return false;
    }

    @Override // defpackage.osc
    public boolean isIsInSearchActionMode() {
        return false;
    }

    public boolean isRegisterResponsive() {
        return false;
    }

    @Override // defpackage.osc
    public void onActionModeFinished(ActionMode actionMode) {
    }

    @Override // defpackage.osc
    public void onActionModeStarted(ActionMode actionMode) {
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        PreferenceScreen preferenceScreen;
        c cVar;
        super.onConfigurationChanged(configuration);
        if (getActivity() == null) {
            return;
        }
        Context context = getContext();
        if (context != null) {
            setActionBarOverLayoutBg();
            int iA = p56.a(context);
            if (this.mDeviceType != iA) {
                this.mDeviceType = iA;
                if (!this.mUserExtraPaddingPolicy) {
                    this.mExtraPaddingPolicy = al8.a.b(iA, fh4.d, fh4.e);
                }
                al8 al8Var = this.mExtraPaddingPolicy;
                if (al8Var != null) {
                    al8Var.j(this.mExtraPaddingEnable);
                    if (this.mExtraPaddingInitEnable ? updateExtraPaddingHorizontal(context, this.mExtraPaddingPolicy, -1, -1) : setExtraHorizontalPadding(this.mExtraPaddingPolicy.h() ? (int) (this.mExtraPaddingPolicy.f() * getResources().getDisplayMetrics().density) : 0)) {
                        int extraHorizontalPadding = getExtraHorizontalPadding();
                        v6i v6iVar = this.mGroupAdapter;
                        if (v6iVar != null) {
                            v6iVar.setExtraHorizontalPadding(extraHorizontalPadding);
                        }
                        if (this.mExtraPaddingObserver != null) {
                            for (int i = 0; i < this.mExtraPaddingObserver.size(); i++) {
                                this.mExtraPaddingObserver.get(i).onExtraPaddingChanged(extraHorizontalPadding);
                            }
                        }
                        onExtraPaddingChanged(extraHorizontalPadding);
                    }
                }
            }
        }
        if (!isTabletOrFold() || !this.mConfigChangeUpdateViewEnable || (preferenceScreen = getPreferenceScreen()) == null || (cVar = this.mFrameDecoration) == null) {
            return;
        }
        cVar.s(preferenceScreen.getContext());
        this.mFrameDecoration.v();
        v6i v6iVar2 = this.mGroupAdapter;
        if (v6iVar2 != null) {
            v6iVar2.I(preferenceScreen.getContext());
            v6i v6iVar3 = this.mGroupAdapter;
            c cVar2 = this.mFrameDecoration;
            v6iVar3.T(cVar2.f30050a, cVar2.i, this.mFrameDecoration.j, this.mFrameDecoration.f26836k, this.mFrameDecoration.l, this.mFrameDecoration.c);
        }
    }

    @Override // defpackage.lqc
    public void onContentInsetChanged(Rect rect) {
        View view = getView();
        RecyclerView listView = getListView();
        if (view == null || listView == null) {
            return;
        }
        wc0 actionBar = getActionBar();
        if (actionBar != null) {
            ActionBarImpl actionBarImpl = (ActionBarImpl) actionBar;
            if (actionBarImpl.getContentView() != null) {
                Rect rect2 = new Rect();
                Rect rect3 = new Rect();
                actionBarImpl.getContentView().getGlobalVisibleRect(rect2);
                view.getGlobalVisibleRect(rect3);
                listView.setPadding(listView.getPaddingLeft(), listView.getPaddingTop(), listView.getPaddingRight(), Math.max(0, rect.bottom - Math.max(0, rect2.bottom - rect3.bottom)) + this.mListViewPaddingBottom);
                return;
            }
        }
        listView.setPadding(listView.getPaddingLeft(), listView.getPaddingTop(), listView.getPaddingRight(), rect.bottom + this.mListViewPaddingBottom);
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mConfigChangeUpdateViewEnable = isConfigChangeUpdateViewEnable();
        Context themedContext = getThemedContext();
        if (themedContext != null) {
            TypedArray typedArrayObtainStyledAttributes = themedContext.obtainStyledAttributes(g5j.m3);
            setExtraHorizontalPaddingEnable(typedArrayObtainStyledAttributes.getBoolean(g5j.w3, this.mExtraPaddingEnable));
            setExtraHorizontalPaddingInitEnable(typedArrayObtainStyledAttributes.getBoolean(g5j.x3, this.mExtraPaddingInitEnable));
            typedArrayObtainStyledAttributes.recycle();
            boolean z = true;
            int iJ = hm1.j(themedContext, eii.n, 1);
            this.mCardStyle = iJ;
            if (iJ != 2 && (pwk.a() <= 1 || this.mCardStyle != 1)) {
                z = false;
            }
            this.mIsEnableCardStyle = z;
        }
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public final RecyclerView.Adapter onCreateAdapter(PreferenceScreen preferenceScreen) {
        v6i v6iVar = new v6i(preferenceScreen, this.mIsEnableCardStyle, this.mCardStyle);
        this.mGroupAdapter = v6iVar;
        v6iVar.V(this.mItemSelectable);
        this.mGroupAdapter.setExtraHorizontalPadding(this.mExtraHorizontalPadding);
        this.mAdapterInvalid = this.mGroupAdapter.getCount() < 1;
        c cVar = this.mFrameDecoration;
        if (cVar != null) {
            this.mGroupAdapter.T(cVar.f30050a, cVar.i, this.mFrameDecoration.j, this.mFrameDecoration.f26836k, this.mFrameDecoration.l, this.mFrameDecoration.c);
        }
        return this.mGroupAdapter;
    }

    @Override // defpackage.osc
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override // defpackage.osc
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return false;
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView = (RecyclerView) layoutInflater.inflate(gwi.g, viewGroup, false);
        if (recyclerView instanceof miuix.recyclerview.widget.RecyclerView) {
            ((miuix.recyclerview.widget.RecyclerView) recyclerView).setSpringEnabled(false);
        }
        recyclerView.setLayoutManager(onCreateLayoutManager());
        Context context = recyclerView.getContext();
        int listViewPaddingTop = getListViewPaddingTop();
        int listViewPaddingBottom = getListViewPaddingBottom();
        if (listViewPaddingTop == -1) {
            listViewPaddingTop = recyclerView.getPaddingTop();
        }
        if (listViewPaddingBottom == -1) {
            listViewPaddingBottom = recyclerView.getPaddingBottom();
        }
        this.mListViewPaddingBottom = listViewPaddingBottom;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), listViewPaddingTop, recyclerView.getPaddingRight(), this.mListViewPaddingBottom);
        e3n.e(recyclerView, true);
        c cVar = new c(this, context, null);
        this.mFrameDecoration = cVar;
        recyclerView.addItemDecoration(cVar);
        recyclerView.setItemAnimator(new fm3());
        this.mListContainer = viewGroup;
        viewGroup.addOnLayoutChangeListener(new a());
        if (viewGroup instanceof SpringBackLayout) {
            ((SpringBackLayout) viewGroup).setTarget(recyclerView);
        }
        return recyclerView;
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context themedContext;
        updateActionBarOverlay();
        setActionBarOverLayoutBg();
        this.mDeviceType = p56.a(getActivity());
        if (!this.mUserExtraPaddingPolicy) {
            initExtraPaddingPolicy();
        }
        if (this.mExtraPaddingInitEnable && this.mExtraPaddingPolicy != null && (themedContext = getThemedContext()) != null) {
            updateExtraPaddingHorizontal(themedContext, this.mExtraPaddingPolicy, viewGroup != null ? viewGroup.getMeasuredWidth() : 0, viewGroup != null ? viewGroup.getMeasuredHeight() : 0);
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        List<zk8> list = this.mExtraPaddingObserver;
        if (list != null) {
            list.clear();
        }
        unregisterCoordinateScrollView(this.mListContainer);
    }

    @Override // defpackage.lqc
    public void onDispatchNestedScrollOffset(int[] iArr) {
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.preference.b.a
    public void onDisplayPreferenceDialog(Preference preference) {
        DialogFragment dialogFragmentE;
        boolean zA = getCallbackFragment() instanceof PreferenceFragmentCompat.e ? ((PreferenceFragmentCompat.e) getCallbackFragment()).a(this, preference) : false;
        if (!zA && (getActivity() instanceof PreferenceFragmentCompat.e)) {
            zA = ((PreferenceFragmentCompat.e) getActivity()).a(this, preference);
        }
        if (!zA && getFragmentManager().l0(DIALOG_FRAGMENT_TAG) == null) {
            if (preference instanceof EditTextPreference) {
                dialogFragmentE = EditTextPreferenceDialogFragmentCompat.H(preference.getKey());
            } else if (preference instanceof ListPreference) {
                dialogFragmentE = ListPreferenceDialogFragmentCompat.E(preference.getKey());
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                dialogFragmentE = MultiSelectListPreferenceDialogFragmentCompat.E(preference.getKey());
            }
            dialogFragmentE.setTargetFragment(this, 0);
            dialogFragmentE.show(getFragmentManager(), DIALOG_FRAGMENT_TAG);
        }
    }

    @Override // defpackage.zk8
    public void onExtraPaddingChanged(int i) {
    }

    @Override // defpackage.osc
    public View onInflateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    @Override // defpackage.osc
    public void onOptionsMenuViewAdded(Menu menu, Menu menu2) {
    }

    @Override // defpackage.osc
    public void onPanelClosed(int i, Menu menu) {
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.preference.b.c
    public boolean onPreferenceTreeClick(Preference preference) {
        v6i v6iVar;
        if (this.mItemSelectable && (v6iVar = this.mGroupAdapter) != null) {
            v6iVar.X(preference);
        }
        return super.onPreferenceTreeClick(preference);
    }

    @Override // defpackage.osc
    public void onPreparePanel(int i, View view, Menu menu) {
    }

    public void onProcessBindViewWithContentInset(Rect rect) {
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        stopHighlight();
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.mIsOverlayMode) {
            registerCoordinateScrollView(this.mListContainer);
            getListView().setClipToPadding(false);
            Rect contentInset = getContentInset();
            if (contentInset == null || contentInset.isEmpty()) {
                return;
            }
            onContentInsetChanged(contentInset);
        }
    }

    @Override // defpackage.osc
    public void onViewInflated(View view, Bundle bundle) {
    }

    public void registerCoordinateScrollView(View view) {
        wc0 actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.registerCoordinateScrollView(view);
        }
    }

    public void removeExtraPaddingObserver(zk8 zk8Var) {
        List<zk8> list = this.mExtraPaddingObserver;
        if (list != null) {
            list.remove(zk8Var);
        }
    }

    @Override // defpackage.lqc
    public boolean requestDispatchContentInset() {
        LifecycleOwner parentFragment = getParentFragment();
        if (parentFragment instanceof osc) {
            return ((osc) parentFragment).requestDispatchContentInset();
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof AppCompatActivity) {
            return ((AppCompatActivity) activity).requestDispatchContentInset();
        }
        return false;
    }

    public void requestHighlight(String str) {
        getListView().post(new b(str));
    }

    public void setCorrectNestedScrollMotionEventEnabled(boolean z) {
    }

    @Override // defpackage.zk8
    public boolean setExtraHorizontalPadding(int i) {
        if (this.mExtraHorizontalPadding == i) {
            return false;
        }
        this.mExtraHorizontalPadding = i;
        return true;
    }

    public void setExtraHorizontalPaddingEnable(boolean z) {
        this.mExtraPaddingEnable = z;
        al8 al8Var = this.mExtraPaddingPolicy;
        if (al8Var != null) {
            al8Var.j(z);
        }
    }

    public void setExtraHorizontalPaddingInitEnable(boolean z) {
        this.mExtraPaddingInitEnable = z;
    }

    public void setExtraPaddingPolicy(al8 al8Var) {
        if (al8Var != null) {
            this.mExtraPaddingPolicy = al8Var;
            this.mUserExtraPaddingPolicy = true;
        } else if (this.mUserExtraPaddingPolicy && this.mExtraPaddingPolicy != null) {
            this.mUserExtraPaddingPolicy = false;
            initExtraPaddingPolicy();
        }
        View view = this.mListContainer;
        if (view != null) {
            view.requestLayout();
        }
    }

    public void setImmersionMenuEnabled(boolean z) {
    }

    public void setItemSelectable(boolean z) {
        this.mItemSelectable = z;
        v6i v6iVar = this.mGroupAdapter;
        if (v6iVar != null) {
            v6iVar.V(z);
        }
    }

    public void setNestedScrollingParentEnabled(boolean z) {
    }

    public void setThemeRes(int i) {
    }

    public void showEndOverflowMenu() {
    }

    public void showImmersionMenu() {
    }

    public void showOverflowMenu() {
    }

    public ActionMode startActionMode(ActionMode.Callback callback) {
        return null;
    }

    public void stopHighlight() {
        v6i v6iVar = this.mGroupAdapter;
        if (v6iVar != null) {
            v6iVar.Z();
        }
    }

    public void unregisterCoordinateScrollView(View view) {
        wc0 actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.unregisterCoordinateScrollView(view);
        }
    }

    public void showImmersionMenu(View view, ViewGroup viewGroup) {
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RectF f26838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26839b;
        public boolean c;
        public boolean d;
        public int e;
        public boolean f;
        public boolean g;

        public d() {
            this.f26838a = new RectF();
            this.f26839b = -1;
            this.c = false;
            this.d = false;
            this.e = 0;
            this.f = false;
            this.g = false;
        }

        public /* synthetic */ d(PreferenceFragment preferenceFragment, a aVar) {
            this();
        }
    }
}
