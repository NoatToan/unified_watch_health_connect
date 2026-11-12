package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f6166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f6168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t6.i f6169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f6170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f6171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View[] f6172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<Integer, String> f6173h;

    public b(Context context) {
        super(context);
        this.f6166a = new int[32];
        this.f6172g = null;
        this.f6173h = new HashMap<>();
        this.f6168c = context;
        i(null);
    }

    public final void a(String str) {
        String strTrim;
        int iH;
        if (str.length() == 0 || this.f6168c == null || (iH = h((strTrim = str.trim()))) == 0) {
            return;
        }
        this.f6173h.put(Integer.valueOf(iH), strTrim);
        b(iH);
    }

    public final void b(int i14) {
        if (i14 == getId()) {
            return;
        }
        int i15 = this.f6167b + 1;
        int[] iArr = this.f6166a;
        if (i15 > iArr.length) {
            this.f6166a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f6166a;
        int i16 = this.f6167b;
        iArr2[i16] = i14;
        this.f6167b = i16 + 1;
    }

    public final void c(String str) {
        if (str.length() == 0 || this.f6168c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = constraintLayout.getChildAt(i14);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).Y) && childAt.getId() != -1) {
                b(childAt.getId());
            }
        }
    }

    public final void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    public final void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i14 = 0; i14 < this.f6167b; i14++) {
            View viewById = constraintLayout.getViewById(this.f6166a[i14]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void f(ConstraintLayout constraintLayout) {
    }

    public final int g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f6168c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = constraintLayout.getChildAt(i14);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f6166a, this.f6167b);
    }

    public final int h(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iG = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                iG = ((Integer) designInformation).intValue();
            }
        }
        if (iG == 0 && constraintLayout != null) {
            iG = g(constraintLayout, str);
        }
        if (iG == 0) {
            try {
                iG = h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iG != 0) {
            return iG;
        }
        Context context = this.f6168c;
        return context.getResources().getIdentifier(str, TtmlNode.ATTR_ID, context.getPackageName());
    }

    public void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f6310b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i14 = 0; i14 < indexCount; i14++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i14);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f6170e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f6171f = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void j(d.a aVar, t6.i iVar, e.a aVar2, SparseArray sparseArray) {
        d.b bVar = aVar.f6203e;
        int[] iArr = bVar.f6239j0;
        int i14 = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar.f6241k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] strArrSplit = bVar.f6241k0.split(",");
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i15 = 0;
                    for (String str2 : strArrSplit) {
                        int iH = h(str2.trim());
                        if (iH != 0) {
                            iArrCopyOf[i15] = iH;
                            i15++;
                        }
                    }
                    if (i15 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                    }
                    bVar.f6239j0 = iArrCopyOf;
                } else {
                    bVar.f6239j0 = null;
                }
            }
        }
        iVar.Y();
        if (bVar.f6239j0 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = bVar.f6239j0;
            if (i14 >= iArr2.length) {
                return;
            }
            t6.e eVar = (t6.e) sparseArray.get(iArr2[i14]);
            if (eVar != null) {
                iVar.W(eVar);
            }
            i14++;
        }
    }

    public void k(t6.e eVar, boolean z14) {
    }

    public void l() {
    }

    public final void m() {
        if (this.f6169d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f6129q0 = this.f6169d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f6170e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f6171f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i14, int i15) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f6170e = str;
        if (str == null) {
            return;
        }
        int i14 = 0;
        this.f6167b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i14);
            if (iIndexOf == -1) {
                a(str.substring(i14));
                return;
            } else {
                a(str.substring(i14, iIndexOf));
                i14 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f6171f = str;
        if (str == null) {
            return;
        }
        int i14 = 0;
        this.f6167b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i14);
            if (iIndexOf == -1) {
                c(str.substring(i14));
                return;
            } else {
                c(str.substring(i14, iIndexOf));
                i14 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f6170e = null;
        this.f6167b = 0;
        for (int i14 : iArr) {
            b(i14);
        }
    }

    @Override // android.view.View
    public final void setTag(int i14, Object obj) {
        super.setTag(i14, obj);
        if (obj == null && this.f6170e == null) {
            b(i14);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6166a = new int[32];
        this.f6172g = null;
        this.f6173h = new HashMap<>();
        this.f6168c = context;
        i(attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f6166a = new int[32];
        this.f6172g = null;
        this.f6173h = new HashMap<>();
        this.f6168c = context;
        i(attributeSet);
    }
}
