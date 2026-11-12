package b5;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lb5/q;", "", "", "Lb5/a0;", "changes", "Lb5/k;", "internalPointerEvent", "<init>", "(Ljava/util/List;Lb5/k;)V", "(Ljava/util/List;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a0> f15870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f15871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15875f;

    /* JADX WARN: Code duplicated, block: B:57:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f3  */
    public q(List<a0> list, k kVar) {
        MotionEvent motionEventA;
        this.f15870a = list;
        this.f15871b = kVar;
        int i14 = Build.VERSION.SDK_INT;
        int i15 = 0;
        this.f15872c = (i14 < 29 || (motionEventA = a()) == null) ? 0 : motionEventA.getClassification();
        MotionEvent motionEventA2 = a();
        this.f15873d = motionEventA2 != null ? motionEventA2.getButtonState() : 0;
        MotionEvent motionEventA3 = a();
        this.f15874e = motionEventA3 != null ? motionEventA3.getMetaState() : 0;
        MotionEvent motionEventA4 = a();
        if (motionEventA4 != null) {
            boolean z14 = i14 >= 29 && motionEventA4.getClassification() == 3;
            boolean z15 = i14 >= 29 && motionEventA4.getClassification() == 5;
            int actionMasked = motionEventA4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                if (z14 && h4.i.f81565g) {
                                    t.f15887b.getClass();
                                    i15 = t.f15897l;
                                } else if (z15 && h4.i.f81565g) {
                                    t.f15887b.getClass();
                                    i15 = t.f15895j;
                                } else {
                                    t.f15887b.getClass();
                                    i15 = t.f15888c;
                                }
                                break;
                            case 6:
                                if (z14 && h4.i.f81565g) {
                                    t.f15887b.getClass();
                                    i15 = t.f15899n;
                                } else if (z15 && h4.i.f81565g) {
                                    t.f15887b.getClass();
                                    i15 = t.f15895j;
                                } else {
                                    t.f15887b.getClass();
                                    i15 = t.f15889d;
                                }
                                break;
                            case 7:
                                if (!z14 && h4.i.f81565g) {
                                    t.f15887b.getClass();
                                    i15 = t.f15898m;
                                } else if (!z15 && h4.i.f81565g) {
                                    t.f15887b.getClass();
                                    i15 = t.f15895j;
                                } else {
                                    t.f15887b.getClass();
                                    i15 = t.f15890e;
                                }
                                break;
                            case 8:
                                t.f15887b.getClass();
                                i15 = t.f15893h;
                                break;
                            case 9:
                                t.f15887b.getClass();
                                i15 = t.f15891f;
                                break;
                            case 10:
                                t.f15887b.getClass();
                                i15 = t.f15892g;
                                break;
                            default:
                                t.f15887b.getClass();
                                break;
                        }
                    } else if (!z14) {
                        if (!z15) {
                            t.f15887b.getClass();
                            i15 = t.f15890e;
                        } else {
                            t.f15887b.getClass();
                            i15 = t.f15890e;
                        }
                    } else if (!z15) {
                        t.f15887b.getClass();
                        i15 = t.f15890e;
                    } else {
                        t.f15887b.getClass();
                        i15 = t.f15890e;
                    }
                } else if (z14 && h4.i.f81565g) {
                    t.f15887b.getClass();
                    i15 = t.f15899n;
                } else if (z15 && h4.i.f81565g) {
                    t.f15887b.getClass();
                    i15 = t.f15896k;
                } else {
                    t.f15887b.getClass();
                    i15 = t.f15889d;
                }
            } else if (z14 && h4.i.f81565g) {
                t.f15887b.getClass();
                i15 = t.f15897l;
            } else if (z15 && h4.i.f81565g) {
                t.f15887b.getClass();
                i15 = t.f15894i;
            } else {
                t.f15887b.getClass();
                i15 = t.f15888c;
            }
        } else {
            int size = list.size();
            while (i15 < size) {
                a0 a0Var = list.get(i15);
                if (r.d(a0Var)) {
                    t.f15887b.getClass();
                    i15 = t.f15889d;
                } else if (r.b(a0Var)) {
                    t.f15887b.getClass();
                    i15 = t.f15888c;
                } else {
                    i15++;
                }
            }
            t.f15887b.getClass();
            i15 = t.f15890e;
        }
        this.f15875f = i15;
    }

    public final MotionEvent a() {
        k kVar = this.f15871b;
        if (kVar != null) {
            return kVar.f15833b.f15771b;
        }
        return null;
    }

    public q(List<a0> list) {
        this(list, null);
    }
}
