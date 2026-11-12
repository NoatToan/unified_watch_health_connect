package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f6579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f6580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f6581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f6583e;

    public v(View view2) {
        this.f6581c = view2;
    }

    public final boolean a(float f14, float f15, boolean z14) {
        ViewParent viewParentE;
        if (this.f6582d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedFling(this.f6581c, f14, f15, z14);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentE);
            }
        }
        return false;
    }

    public final boolean b(float f14, float f15) {
        ViewParent viewParentE;
        if (this.f6582d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedPreFling(this.f6581c, f14, f15);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentE);
            }
        }
        return false;
    }

    public final boolean c(int i14, int i15, int[] iArr, int[] iArr2, int i16) {
        ViewParent viewParentE;
        int i17;
        int i18;
        if (!this.f6582d || (viewParentE = e(i16)) == null) {
            return false;
        }
        if (i14 == 0 && i15 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view2 = this.f6581c;
        if (iArr2 != null) {
            view2.getLocationInWindow(iArr2);
            i17 = iArr2[0];
            i18 = iArr2[1];
        } else {
            i17 = 0;
            i18 = 0;
        }
        if (iArr == null) {
            if (this.f6583e == null) {
                this.f6583e = new int[2];
            }
            iArr = this.f6583e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        boolean z14 = viewParentE instanceof w;
        View view3 = this.f6581c;
        if (z14) {
            ((w) viewParentE).onNestedPreScroll(view3, i14, i15, iArr3, i16);
        } else if (i16 == 0) {
            try {
                viewParentE.onNestedPreScroll(view3, i14, i15, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentE);
            }
        }
        if (iArr2 != null) {
            view2.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i17;
            iArr2[1] = iArr2[1] - i18;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i14, int i15, int i16, int i17, int[] iArr, int i18, int[] iArr2) {
        ViewParent viewParentE;
        int i19;
        int i24;
        int[] iArr3;
        if (this.f6582d && (viewParentE = e(i18)) != null) {
            if (i14 != 0 || i15 != 0 || i16 != 0 || i17 != 0) {
                View view2 = this.f6581c;
                if (iArr != null) {
                    view2.getLocationInWindow(iArr);
                    i19 = iArr[0];
                    i24 = iArr[1];
                } else {
                    i19 = 0;
                    i24 = 0;
                }
                if (iArr2 == null) {
                    if (this.f6583e == null) {
                        this.f6583e = new int[2];
                    }
                    int[] iArr4 = this.f6583e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                boolean z14 = viewParentE instanceof x;
                View view3 = this.f6581c;
                if (z14) {
                    ((x) viewParentE).onNestedScroll(view3, i14, i15, i16, i17, i18, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i16;
                    iArr3[1] = iArr3[1] + i17;
                    if (viewParentE instanceof w) {
                        ((w) viewParentE).onNestedScroll(view3, i14, i15, i16, i17, i18);
                    } else if (i18 == 0) {
                        try {
                            viewParentE.onNestedScroll(view3, i14, i15, i16, i17);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(viewParentE);
                        }
                    }
                }
                if (iArr != null) {
                    view2.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i19;
                    iArr[1] = iArr[1] - i24;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i14) {
        if (i14 == 0) {
            return this.f6579a;
        }
        if (i14 != 1) {
            return null;
        }
        return this.f6580b;
    }

    public final boolean f(int i14) {
        return e(i14) != null;
    }

    public final void g(boolean z14) {
        if (this.f6582d) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            this.f6581c.stopNestedScroll();
        }
        this.f6582d = z14;
    }

    public final boolean h(int i14, int i15) {
        boolean zOnStartNestedScroll;
        if (!f(i15)) {
            if (this.f6582d) {
                View view2 = this.f6581c;
                View view3 = view2;
                for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z14 = parent instanceof w;
                    if (z14) {
                        zOnStartNestedScroll = ((w) parent).onStartNestedScroll(view3, view2, i14, i15);
                    } else if (i15 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view3, view2, i14);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(parent);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i15 == 0) {
                            this.f6579a = parent;
                        } else if (i15 == 1) {
                            this.f6580b = parent;
                        }
                        if (z14) {
                            ((w) parent).onNestedScrollAccepted(view3, view2, i14, i15);
                        } else if (i15 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view3, view2, i14);
                            } catch (AbstractMethodError unused2) {
                                Objects.toString(parent);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view3 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void i(int i14) {
        ViewParent viewParentE = e(i14);
        if (viewParentE != null) {
            boolean z14 = viewParentE instanceof w;
            View view2 = this.f6581c;
            if (z14) {
                ((w) viewParentE).onStopNestedScroll(view2, i14);
            } else if (i14 == 0) {
                try {
                    viewParentE.onStopNestedScroll(view2);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentE);
                }
            }
            if (i14 == 0) {
                this.f6579a = null;
            } else {
                if (i14 != 1) {
                    return;
                }
                this.f6580b = null;
            }
        }
    }
}
