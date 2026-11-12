package miuix.flexible.template;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.f5f;
import defpackage.hvq;
import defpackage.i5j;
import defpackage.s6g;
import defpackage.uuq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import miuix.flexible.template.level.FontLevelSupplier;
import miuix.flexible.template.level.LevelSupplier;
import miuix.flexible.view.HyperCellLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractMarkTemplate implements IHyperCellTemplate, f5f.a {
    protected static final int NOT_SET = Integer.MAX_VALUE;
    protected Context mContext;
    protected float mDensity;
    protected int mLevel;
    private HyperCellLayout.a mLevelCallback;
    private LevelSupplier mLevelSupplier;
    private uuq mViewList;
    private int mGravity = 0;
    private boolean mFinishInflate = false;
    private int mColumnSpacing = 0;
    private int mRowSpacing = 0;

    public static void addAuxiliaryView(ViewGroup viewGroup, Context context, int i) {
        addAuxiliaryView(viewGroup, context, i, 0, 0);
    }

    public static HyperCellLayout.LayoutParams generateAuxiliaryLayoutParams(int i) {
        return generateAuxiliaryLayoutParams(i, 0, 0);
    }

    public static HyperCellLayout.LayoutParams generateLayoutParams(int i, float f, float f2, int i2, int i3) {
        return generateLayoutParams(i, f, f2, i2, i3, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int lambda$measureViewList$0(hvq hvqVar, hvq hvqVar2) {
        return getViewNodePriority(hvqVar2) - getViewNodePriority(hvqVar);
    }

    private void layoutViewList(uuq uuqVar, boolean z, int i, int i2, int i3) {
        int iE;
        int iA;
        int i4;
        int i5;
        int iE2 = i2 + uuqVar.e();
        int iA2 = i3 + uuqVar.a();
        ArrayList<hvq> arrayList = new ArrayList(uuqVar.k());
        int i6 = 1;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            hvq hvqVar = (hvq) arrayList.get(size);
            View viewC = hvqVar.c();
            if (viewC != null) {
                int iE3 = getChildViewLayoutParamsSafe(viewC).e();
                if ((uuqVar.l() == 1 && (iE3 & 7) == 5) || (uuqVar.l() == 0 && (iE3 & 112) == 80)) {
                    arrayList.remove(size);
                    arrayList.add(hvqVar);
                }
            }
        }
        int iE4 = i2;
        int iA3 = i3;
        int iE5 = iE2;
        int iA4 = iA2;
        for (hvq hvqVar2 : arrayList) {
            if (hvqVar2 instanceof uuq) {
                uuq uuqVar2 = (uuq) hvqVar2;
                HyperCellLayout.LayoutParams childViewLayoutParamsSafe = getChildViewLayoutParamsSafe(uuqVar2.k().get(0).c());
                if (uuqVar.l() == i6 && (childViewLayoutParamsSafe.e() & 112) == 16) {
                    iA = ((uuqVar.a() - uuqVar2.a()) / 2) + iA3;
                    iE = iE4;
                } else {
                    iE = (uuqVar.l() == 0 && (childViewLayoutParamsSafe.e() & 7) == i6) ? ((uuqVar.e() - uuqVar2.e()) / 2) + iE4 : iE4;
                    iA = iA3;
                }
                layoutViewList(uuqVar2, z, i, iE, iA);
                if (uuqVar.l() == i6) {
                    iE4 += uuqVar2.e() + this.mColumnSpacing;
                } else {
                    iA3 += uuqVar2.a() + this.mRowSpacing;
                }
            } else if (hvqVar2.c() != null && hvqVar2.c().getVisibility() != 8) {
                View viewC2 = hvqVar2.c();
                HyperCellLayout.LayoutParams childViewLayoutParamsSafe2 = getChildViewLayoutParamsSafe(viewC2);
                int marginStart = childViewLayoutParamsSafe2.getMarginStart() + iE4;
                int measuredHeight = ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe2).topMargin + iA3;
                if (uuqVar.l() == i6) {
                    if ((childViewLayoutParamsSafe2.e() & 7) == 5) {
                        marginStart = (iE5 - viewC2.getMeasuredWidth()) - childViewLayoutParamsSafe2.getMarginEnd();
                        iE5 -= hvqVar2.e() + this.mColumnSpacing;
                    } else {
                        iE4 += hvqVar2.e() + this.mColumnSpacing;
                    }
                    if ((childViewLayoutParamsSafe2.e() & 112) == 80) {
                        measuredHeight = ((uuqVar.a() + iA3) - viewC2.getMeasuredHeight()) - ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe2).bottomMargin;
                    } else if ((childViewLayoutParamsSafe2.e() & 112) == 16) {
                        measuredHeight = ((uuqVar.a() - hvqVar2.a()) / 2) + iA3 + ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe2).topMargin;
                    }
                } else {
                    if ((childViewLayoutParamsSafe2.e() & 112) == 80) {
                        measuredHeight = (iA4 - viewC2.getMeasuredHeight()) - ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe2).bottomMargin;
                        iA4 -= hvqVar2.a() + this.mRowSpacing;
                    } else {
                        iA3 += hvqVar2.a() + this.mRowSpacing;
                    }
                    if ((childViewLayoutParamsSafe2.e() & 7) == 5) {
                        marginStart = ((uuqVar.e() + iE4) - viewC2.getMeasuredWidth()) - childViewLayoutParamsSafe2.getMarginEnd();
                    } else {
                        i6 = 1;
                        if ((childViewLayoutParamsSafe2.e() & 7) == 1) {
                            marginStart = ((uuqVar.e() - hvqVar2.e()) / 2) + iE4 + childViewLayoutParamsSafe2.getMarginStart();
                        }
                        i4 = iE5;
                        i5 = iA4;
                    }
                    int i7 = iE4;
                    int i8 = iA3;
                    layoutChildView(viewC2, z, i, marginStart, measuredHeight, marginStart + viewC2.getMeasuredWidth(), measuredHeight + viewC2.getMeasuredHeight());
                    iE4 = i7;
                    iA3 = i8;
                    iE5 = i4;
                    iA4 = i5;
                }
                i4 = iE5;
                i5 = iA4;
                i6 = 1;
                int i9 = iE4;
                int i10 = iA3;
                layoutChildView(viewC2, z, i, marginStart, measuredHeight, marginStart + viewC2.getMeasuredWidth(), measuredHeight + viewC2.getMeasuredHeight());
                iE4 = i9;
                iA3 = i10;
                iE5 = i4;
                iA4 = i5;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    private void measureChildView(hvq hvqVar, int i, int i2, int i3, int i4) {
        int marginStart;
        int marginEnd;
        int i5;
        int i6;
        int i7;
        int measuredWidth;
        int measuredHeight;
        View viewC = hvqVar.c();
        HyperCellLayout.LayoutParams childViewLayoutParamsSafe = getChildViewLayoutParamsSafe(viewC);
        if (childViewLayoutParamsSafe != null) {
            int i8 = ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).width;
            if (i8 != -1) {
                if (i8 == -2) {
                    i3 = (i3 == 1073741824 || i3 == Integer.MIN_VALUE) ? Integer.MIN_VALUE : 0;
                    marginStart = i - childViewLayoutParamsSafe.getMarginStart();
                    marginEnd = childViewLayoutParamsSafe.getMarginEnd();
                } else {
                    i3 = 1073741824;
                }
                i5 = ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).height;
                if (i5 == -1) {
                    if (i5 == -2) {
                        if (i4 != 1073741824 || i4 == Integer.MIN_VALUE) {
                            i4 = Integer.MIN_VALUE;
                        } else {
                            i4 = 0;
                        }
                        i6 = i2 - ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).topMargin;
                        i7 = ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).bottomMargin;
                    } else {
                        i4 = 1073741824;
                    }
                    viewC.measure(View.MeasureSpec.makeMeasureSpec(i8, i3), View.MeasureSpec.makeMeasureSpec(i5, i4));
                    measuredWidth = viewC.getMeasuredWidth() + childViewLayoutParamsSafe.getMarginStart() + childViewLayoutParamsSafe.getMarginEnd();
                    measuredHeight = viewC.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).topMargin + ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).bottomMargin;
                    if (childViewLayoutParamsSafe.l()) {
                        if ((childViewLayoutParamsSafe.a() & 1) > 0) {
                            measuredWidth = (int) (measuredWidth * childViewLayoutParamsSafe.b());
                        }
                        if ((childViewLayoutParamsSafe.a() & 2) > 0) {
                            measuredHeight = (int) (measuredHeight * childViewLayoutParamsSafe.b());
                        }
                    }
                    hvqVar.j(measuredWidth);
                    hvqVar.f(measuredHeight);
                }
                i6 = i2 - ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).topMargin;
                i7 = ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).bottomMargin;
                i5 = i6 - i7;
                viewC.measure(View.MeasureSpec.makeMeasureSpec(i8, i3), View.MeasureSpec.makeMeasureSpec(i5, i4));
                measuredWidth = viewC.getMeasuredWidth() + childViewLayoutParamsSafe.getMarginStart() + childViewLayoutParamsSafe.getMarginEnd();
                measuredHeight = viewC.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).topMargin + ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).bottomMargin;
                if (childViewLayoutParamsSafe.l()) {
                    if ((childViewLayoutParamsSafe.a() & 1) > 0) {
                        measuredWidth = (int) (measuredWidth * childViewLayoutParamsSafe.b());
                    }
                    if ((childViewLayoutParamsSafe.a() & 2) > 0) {
                        measuredHeight = (int) (measuredHeight * childViewLayoutParamsSafe.b());
                    }
                }
                hvqVar.j(measuredWidth);
                hvqVar.f(measuredHeight);
            }
            marginStart = i - childViewLayoutParamsSafe.getMarginStart();
            marginEnd = childViewLayoutParamsSafe.getMarginEnd();
            i8 = marginStart - marginEnd;
            i5 = ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).height;
            if (i5 == -1) {
                if (i5 == -2) {
                    if (i4 != 1073741824) {
                        i4 = Integer.MIN_VALUE;
                    } else {
                        i4 = Integer.MIN_VALUE;
                    }
                    i6 = i2 - ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).topMargin;
                    i7 = ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).bottomMargin;
                } else {
                    i4 = 1073741824;
                }
                viewC.measure(View.MeasureSpec.makeMeasureSpec(i8, i3), View.MeasureSpec.makeMeasureSpec(i5, i4));
                measuredWidth = viewC.getMeasuredWidth() + childViewLayoutParamsSafe.getMarginStart() + childViewLayoutParamsSafe.getMarginEnd();
                measuredHeight = viewC.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).topMargin + ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).bottomMargin;
                if (childViewLayoutParamsSafe.l()) {
                    if ((childViewLayoutParamsSafe.a() & 1) > 0) {
                        measuredWidth = (int) (measuredWidth * childViewLayoutParamsSafe.b());
                    }
                    if ((childViewLayoutParamsSafe.a() & 2) > 0) {
                        measuredHeight = (int) (measuredHeight * childViewLayoutParamsSafe.b());
                    }
                }
                hvqVar.j(measuredWidth);
                hvqVar.f(measuredHeight);
            }
            i6 = i2 - ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).topMargin;
            i7 = ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).bottomMargin;
            i5 = i6 - i7;
            viewC.measure(View.MeasureSpec.makeMeasureSpec(i8, i3), View.MeasureSpec.makeMeasureSpec(i5, i4));
            measuredWidth = viewC.getMeasuredWidth() + childViewLayoutParamsSafe.getMarginStart() + childViewLayoutParamsSafe.getMarginEnd();
            measuredHeight = viewC.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).topMargin + ((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).bottomMargin;
            if (childViewLayoutParamsSafe.l()) {
                if ((childViewLayoutParamsSafe.a() & 1) > 0) {
                    measuredWidth = (int) (measuredWidth * childViewLayoutParamsSafe.b());
                }
                if ((childViewLayoutParamsSafe.a() & 2) > 0) {
                    measuredHeight = (int) (measuredHeight * childViewLayoutParamsSafe.b());
                }
            }
            hvqVar.j(measuredWidth);
            hvqVar.f(measuredHeight);
        }
    }

    private void measureViewList(uuq uuqVar, uuq uuqVar2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int iMax;
        int iA;
        ArrayList<hvq> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(uuqVar2.k());
        Collections.sort(arrayList2, new Comparator() { // from class: g10
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return this.f18448a.lambda$measureViewList$0((hvq) obj, (hvq) obj2);
            }
        });
        Iterator it = arrayList2.iterator();
        float fD = 0.0f;
        int iE = 0;
        int iA2 = 0;
        while (true) {
            i5 = 8;
            if (!it.hasNext()) {
                break;
            }
            hvq hvqVar = (hvq) it.next();
            if (hvqVar.d() > 0.0f) {
                fD += hvqVar.d();
                arrayList.add(hvqVar);
            } else {
                int i8 = uuqVar2.l() == 1 ? i - iE : i;
                int i9 = uuqVar2.l() == 1 ? i2 : i2 - iA2;
                if (hvqVar instanceof uuq) {
                    uuq uuqVar3 = (uuq) hvqVar;
                    measureViewList(uuqVar2, uuqVar3, i8, i9, i3, i4);
                    if (uuqVar2.l() == 1) {
                        iE += uuqVar3.e() + this.mColumnSpacing;
                        iA = Math.max(iA2, uuqVar3.a());
                    } else {
                        iE = Math.max(iE, uuqVar3.e());
                        iA = uuqVar3.a() + this.mRowSpacing + iA2;
                    }
                } else if (hvqVar.c() != null && hvqVar.c().getVisibility() != 8) {
                    measureChildView(hvqVar, i8, i9, i3, i4);
                    if (uuqVar2.l() == 1) {
                        iE += hvqVar.e() + this.mColumnSpacing;
                        iA = Math.max(iA2, hvqVar.a());
                    } else {
                        int iMax2 = Math.max(iE, hvqVar.e());
                        iA2 += hvqVar.a() + this.mRowSpacing;
                        iE = iMax2;
                    }
                }
                iA2 = iA;
            }
        }
        if (!arrayList.isEmpty()) {
            int size = (i - iE) - ((arrayList.size() - 1) * this.mColumnSpacing);
            int size2 = (i2 - iA2) - ((arrayList.size() - 1) * this.mRowSpacing);
            for (hvq hvqVar2 : arrayList) {
                int iD = uuqVar2.l() == 1 ? (int) ((size * hvqVar2.d()) / fD) : i;
                int iD2 = uuqVar2.l() == 1 ? i2 : (int) ((size2 * hvqVar2.d()) / fD);
                if (hvqVar2 instanceof uuq) {
                    uuq uuqVar4 = (uuq) hvqVar2;
                    i6 = size2;
                    i7 = i5;
                    measureViewList(uuqVar2, uuqVar4, iD, iD2, i3, i4);
                    if (uuqVar2.l() == 1) {
                        iE += uuqVar4.e() + this.mColumnSpacing;
                        iMax = Math.max(iA2, uuqVar4.a());
                    } else {
                        iE = Math.max(iE, uuqVar4.e());
                        iMax = uuqVar4.a() + this.mRowSpacing + iA2;
                    }
                } else {
                    i6 = size2;
                    i7 = i5;
                    if (hvqVar2.c() != null && hvqVar2.c().getVisibility() != i7) {
                        measureChildView(hvqVar2, iD, iD2, i3, i4);
                        if (uuqVar2.l() == 1) {
                            iE += hvqVar2.e() + this.mColumnSpacing;
                            iMax = Math.max(iA2, hvqVar2.a());
                        } else {
                            int iMax3 = Math.max(iE, hvqVar2.e());
                            iA2 += hvqVar2.a() + this.mRowSpacing;
                            iE = iMax3;
                        }
                    }
                    i5 = i7;
                    size2 = i6;
                }
                iA2 = iMax;
                i5 = i7;
                size2 = i6;
            }
        }
        int i10 = i5;
        boolean z = uuqVar2.d() > 0.0f;
        if (uuqVar2.l() == 1) {
            iE -= this.mColumnSpacing;
        } else {
            iA2 -= this.mRowSpacing;
        }
        if (z && i3 == 1073741824 && (uuqVar == null || uuqVar.l() == 1)) {
            iE = i;
        }
        uuqVar2.j(iE);
        if (z && i4 == 1073741824 && (uuqVar == null || uuqVar.l() == 0)) {
            iA2 = i2;
        }
        uuqVar2.f(iA2);
        for (hvq hvqVar3 : uuqVar2.k()) {
            if (hvqVar3 instanceof uuq) {
                uuq uuqVar5 = (uuq) hvqVar3;
                if (uuqVar2.l() != 1 || uuqVar5.a() >= uuqVar2.a()) {
                    if (uuqVar2.l() != 0 && uuqVar5.e() < uuqVar2.e() && hasMatchParentChild(uuqVar5, 1)) {
                        measureViewList(uuqVar2, uuqVar5, uuqVar2.e(), uuqVar5.a(), 1073741824, 1073741824);
                    }
                } else if (hasMatchParentChild(uuqVar5, 0)) {
                    measureViewList(uuqVar2, uuqVar5, uuqVar5.e(), uuqVar2.a(), 1073741824, 1073741824);
                } else if (uuqVar2.l() != 0) {
                }
            } else if (hvqVar3.c() != null && hvqVar3.c().getVisibility() != i10) {
                HyperCellLayout.LayoutParams childViewLayoutParamsSafe = getChildViewLayoutParamsSafe(hvqVar3.c());
                if (((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).height == -1 && uuqVar2.l() == 1 && hvqVar3.a() < uuqVar2.a()) {
                    measureChildView(hvqVar3, hvqVar3.e(), uuqVar2.a(), 1073741824, 1073741824);
                } else if (((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).width == -1 && uuqVar2.l() == 0 && hvqVar3.e() < uuqVar2.e()) {
                    measureChildView(hvqVar3, uuqVar2.e(), hvqVar3.a(), 1073741824, 1073741824);
                }
            }
        }
    }

    @Override // miuix.flexible.template.IHyperCellTemplate
    public void applyLevel() {
    }

    public void buildViewTree(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        View[] viewArr = new View[childCount];
        for (int i = 0; i < childCount; i++) {
            viewArr[i] = viewGroup.getChildAt(i);
        }
        this.mViewList = f5f.b(viewArr, this);
    }

    @Override // miuix.flexible.template.IHyperCellTemplate
    public LevelSupplier createLevelSupplier() {
        return new FontLevelSupplier(this.mContext);
    }

    public int dp2px(float f) {
        return s6g.c(this.mDensity, f);
    }

    public View findViewByAreaId(ViewGroup viewGroup, int i) {
        if (viewGroup instanceof HyperCellLayout) {
            return ((HyperCellLayout) viewGroup).b(i);
        }
        return null;
    }

    public HyperCellLayout.LayoutParams getChildViewLayoutParamsSafe(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof HyperCellLayout.LayoutParams) {
            return (HyperCellLayout.LayoutParams) layoutParams;
        }
        throw new IllegalArgumentException("LayoutParams " + layoutParams + " of child view " + view + " is not instance of HyperCellLayout.LayoutParams! Context is " + view.getContext());
    }

    public int getColumnSpacing() {
        return this.mColumnSpacing;
    }

    public int getGravity() {
        return this.mGravity;
    }

    @Override // f5f.a
    public float getGroupWeight(View view) {
        HyperCellLayout.LayoutParams childViewLayoutParamsSafe = getChildViewLayoutParamsSafe(view);
        return (childViewLayoutParamsSafe.d() & 1024) != 0 ? childViewLayoutParamsSafe.g() : getLayoutParams(view).g();
    }

    public abstract HyperCellLayout.LayoutParams getLayoutParams(View view);

    @Override // miuix.flexible.template.IHyperCellTemplate
    public final int getLevel() {
        int level = this.mLevelSupplier.getLevel();
        this.mLevel = level;
        return level;
    }

    @Override // f5f.a
    public int getMark(View view) {
        return getLayoutParams(view).h();
    }

    @Override // f5f.a
    public int getOrder(View view) {
        return getLayoutParams(view).i();
    }

    public int getRowSpacing() {
        return this.mRowSpacing;
    }

    public int getViewNodePriority(hvq hvqVar) {
        if (hvqVar.c() != null) {
            return getChildViewLayoutParamsSafe(hvqVar.c()).j();
        }
        if (hvqVar instanceof uuq) {
            return getViewNodePriority(((uuq) hvqVar).k().get(0));
        }
        return 0;
    }

    @Override // f5f.a
    public float getWeight(View view) {
        HyperCellLayout.LayoutParams childViewLayoutParamsSafe = getChildViewLayoutParamsSafe(view);
        return (childViewLayoutParamsSafe.d() & 512) != 0 ? childViewLayoutParamsSafe.k() : getLayoutParams(view).k();
    }

    public boolean hasMatchParentChild(uuq uuqVar, int i) {
        for (hvq hvqVar : uuqVar.k()) {
            if (hvqVar instanceof uuq) {
                if (hasMatchParentChild((uuq) hvqVar, i)) {
                    return true;
                }
            } else if (hvqVar.c() != null) {
                HyperCellLayout.LayoutParams childViewLayoutParamsSafe = getChildViewLayoutParamsSafe(hvqVar.c());
                if (i == 1) {
                    if (((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).width == -1) {
                        return true;
                    }
                } else if (((ViewGroup.MarginLayoutParams) childViewLayoutParamsSafe).height == -1) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    @Override // miuix.flexible.template.IHyperCellTemplate
    public void init(ViewGroup viewGroup, Context context, AttributeSet attributeSet) {
        this.mContext = context;
        this.mDensity = context.getResources().getDisplayMetrics().density;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i5j.G);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == i5j.H) {
                    this.mGravity = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == i5j.I) {
                    this.mColumnSpacing = (int) (typedArrayObtainStyledAttributes.getDimension(index, 0.0f) + 0.5f);
                } else if (index == i5j.J) {
                    this.mRowSpacing = (int) (typedArrayObtainStyledAttributes.getDimension(index, 0.0f) + 0.5f);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLevelSupplier = createLevelSupplier();
    }

    public void layoutChildView(View view, boolean z, int i, int i2, int i3, int i4, int i5) {
        int i6 = z ? i - i4 : i2;
        if (z) {
            i4 = i - i2;
        }
        view.layout(i6, i3, i4, i5);
    }

    public void onAddAuxiliaryViews(ViewGroup viewGroup) {
    }

    @Override // miuix.flexible.template.IHyperCellTemplate
    public void onAttachedToWindow(ViewGroup viewGroup) {
    }

    @Override // miuix.flexible.template.IHyperCellTemplate
    public void onConfigurationChanged(ViewGroup viewGroup, Configuration configuration) {
        float f = this.mContext.getResources().getDisplayMetrics().density;
        int i = this.mLevel;
        getLevel();
        if (this.mFinishInflate) {
            if (Math.abs(f - this.mDensity) > 0.001f || i != this.mLevel) {
                onPreBuildViewTree(viewGroup);
                buildViewTree(viewGroup);
                viewGroup.requestLayout();
                if (i != this.mLevel) {
                    applyLevel();
                }
            }
        }
    }

    @Override // miuix.flexible.template.IHyperCellTemplate
    public void onDetachedFromWindow(ViewGroup viewGroup) {
    }

    @Override // miuix.flexible.template.IHyperCellTemplate
    public void onFinishInflate(ViewGroup viewGroup) {
        onAddAuxiliaryViews(viewGroup);
        onPreBuildViewTree(viewGroup);
        buildViewTree(viewGroup);
        this.mFinishInflate = true;
        applyLevel();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x006c  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    @Override // miuix.flexible.template.IHyperCellTemplate
    public void onLayout(ViewGroup viewGroup, boolean z, int i, int i2, int i3, int i4) {
        int iA;
        if (this.mViewList != null) {
            boolean z2 = viewGroup.getLayoutDirection() == 1;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            int paddingStart = viewGroup.getPaddingStart();
            int paddingTop = viewGroup.getPaddingTop();
            int i7 = this.mGravity;
            int i8 = i7 & 112;
            int i9 = i7 & 7;
            if (i8 != 16) {
                if (i8 == 80) {
                    iA = (i6 - this.mViewList.a()) - viewGroup.getPaddingBottom();
                }
                if (i9 == 1) {
                    paddingStart = viewGroup.getPaddingStart() + ((((i5 - viewGroup.getPaddingStart()) - viewGroup.getPaddingEnd()) - this.mViewList.e()) / 2);
                } else if (i9 == 5) {
                    paddingStart = (i5 - this.mViewList.e()) - viewGroup.getPaddingEnd();
                }
                layoutViewList(this.mViewList, z2, i5, paddingStart, iA);
            }
            paddingTop = viewGroup.getPaddingTop() + ((((i6 - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom()) - this.mViewList.a()) / 2);
            iA = paddingTop;
            if (i9 == 1) {
                paddingStart = viewGroup.getPaddingStart() + ((((i5 - viewGroup.getPaddingStart()) - viewGroup.getPaddingEnd()) - this.mViewList.e()) / 2);
            } else if (i9 == 5) {
                paddingStart = (i5 - this.mViewList.e()) - viewGroup.getPaddingEnd();
            }
            layoutViewList(this.mViewList, z2, i5, paddingStart, iA);
        }
    }

    @Override // miuix.flexible.template.IHyperCellTemplate
    public int[] onMeasure(ViewGroup viewGroup, int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        uuq uuqVar = this.mViewList;
        if (uuqVar == null) {
            return new int[]{viewGroup.getMinimumWidth(), viewGroup.getMinimumHeight()};
        }
        measureViewList(null, uuqVar, (size - viewGroup.getPaddingStart()) - viewGroup.getPaddingEnd(), (size2 - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom(), mode, mode2);
        if (mode != 1073741824) {
            size = viewGroup.getPaddingEnd() + this.mViewList.e() + viewGroup.getPaddingStart();
        }
        if (mode2 != 1073741824) {
            size2 = this.mViewList.a() + viewGroup.getPaddingTop() + viewGroup.getPaddingBottom();
        }
        return new int[]{Math.max(size, viewGroup.getMinimumWidth()), Math.max(size2, viewGroup.getMinimumHeight())};
    }

    public void onPreBuildViewTree(ViewGroup viewGroup) {
    }

    @Override // miuix.flexible.template.IHyperCellTemplate
    public void onViewAdded(ViewGroup viewGroup, View view) {
        if (this.mFinishInflate) {
            onPreBuildViewTree(viewGroup);
            buildViewTree(viewGroup);
        }
    }

    @Override // miuix.flexible.template.IHyperCellTemplate
    public void onViewRemoved(ViewGroup viewGroup, View view) {
        if (this.mFinishInflate) {
            onPreBuildViewTree(viewGroup);
            buildViewTree(viewGroup);
        }
    }

    public void setColumnSpacing(int i) {
        this.mColumnSpacing = i;
    }

    public void setGravity(HyperCellLayout.LayoutParams layoutParams, HyperCellLayout.LayoutParams layoutParams2) {
        if ((layoutParams.d() & 1) != 0 || layoutParams2.e() == Integer.MAX_VALUE) {
            return;
        }
        layoutParams.n(layoutParams2.e());
    }

    @Override // miuix.flexible.template.IHyperCellTemplate
    public void setLevelCallback(HyperCellLayout.a aVar) {
        applyLevel();
    }

    public void setMargin(HyperCellLayout.LayoutParams layoutParams, HyperCellLayout.LayoutParams layoutParams2) {
        int i;
        int i2;
        if ((layoutParams.d() & 2) == 0 && layoutParams2.getMarginStart() != Integer.MAX_VALUE) {
            layoutParams.setMarginStart(dp2px(layoutParams2.getMarginStart()));
        }
        if ((layoutParams.d() & 4) == 0 && layoutParams2.getMarginEnd() != Integer.MAX_VALUE) {
            layoutParams.setMarginEnd(dp2px(layoutParams2.getMarginEnd()));
        }
        if ((layoutParams.d() & 8) == 0 && (i2 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin) != Integer.MAX_VALUE) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dp2px(i2);
        }
        if ((layoutParams.d() & 16) != 0 || (i = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) == Integer.MAX_VALUE) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dp2px(i);
    }

    public void setPriority(HyperCellLayout.LayoutParams layoutParams, HyperCellLayout.LayoutParams layoutParams2) {
        if ((layoutParams.d() & 128) == 0 && layoutParams2.j() != Integer.MAX_VALUE) {
            layoutParams.t(layoutParams2.j());
        }
        if ((layoutParams.d() & 256) != 0 || layoutParams2.f() == Integer.MAX_VALUE) {
            return;
        }
        layoutParams.o(layoutParams2.f());
    }

    public void setRowSpacing(int i) {
        this.mRowSpacing = i;
    }

    public void setWidthHeight(HyperCellLayout.LayoutParams layoutParams, HyperCellLayout.LayoutParams layoutParams2) {
        int i;
        int i2;
        if ((layoutParams.d() & 32) == 0 && (i2 = ((ViewGroup.MarginLayoutParams) layoutParams2).width) != Integer.MAX_VALUE) {
            ((ViewGroup.MarginLayoutParams) layoutParams).width = i2;
        }
        if ((layoutParams.d() & 64) != 0 || (i = ((ViewGroup.MarginLayoutParams) layoutParams2).height) == Integer.MAX_VALUE) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).height = i;
    }

    public static void addAuxiliaryView(ViewGroup viewGroup, Context context, int i, int i2, int i3) {
        View view = new View(context);
        view.setWillNotDraw(true);
        HyperCellLayout.LayoutParams layoutParamsGenerateAuxiliaryLayoutParams = generateAuxiliaryLayoutParams(i, i2, i3);
        layoutParamsGenerateAuxiliaryLayoutParams.m(i);
        viewGroup.addView(view, layoutParamsGenerateAuxiliaryLayoutParams);
    }

    public static HyperCellLayout.LayoutParams generateAuxiliaryLayoutParams(int i, int i2, int i3) {
        HyperCellLayout.LayoutParams layoutParams = new HyperCellLayout.LayoutParams(i2, i3);
        layoutParams.m(i);
        return layoutParams;
    }

    public static HyperCellLayout.LayoutParams generateLayoutParams(int i, float f, float f2, int i2, int i3, int i4, int i5, int i6, int i7) {
        HyperCellLayout.LayoutParams layoutParams = new HyperCellLayout.LayoutParams(0, 0);
        layoutParams.r(i);
        layoutParams.u(f);
        layoutParams.p(f2);
        layoutParams.n(i2);
        layoutParams.s(i3);
        layoutParams.setMarginStart(i4);
        layoutParams.setMarginEnd(i6);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i5;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i7;
        return layoutParams;
    }

    public void setGravity(int i) {
        this.mGravity = i;
    }
}
