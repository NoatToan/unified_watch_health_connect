package defpackage;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import com.huawei.ui.commonui.flowlayout.HealthFlowLayout;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qlf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HealthFlowLayout f46427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f46428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qlg f46429c;
    private float d;
    private qle e;
    private float f;
    private float g;
    private View h;
    private boolean j;
    private final int k;
    private qle i = new qle();
    private final c o = new c();

    public boolean a() {
        return this.j;
    }

    public qle c() {
        return this.i;
    }

    public qlf(HealthFlowLayout healthFlowLayout) {
        this.f46427a = healthFlowLayout;
        this.k = ViewConfiguration.get(healthFlowLayout.getContext()).getScaledTouchSlop();
    }

    public boolean b(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f = motionEvent.getY();
            this.g = motionEvent.getX();
            return d(motionEvent);
        }
        if (action == 1) {
            this.j = false;
            boolean zB = b();
            this.f = -1.0f;
            return zB;
        }
        if (action == 2) {
            if (!this.j) {
                return false;
            }
            this.f = motionEvent.getY();
            this.g = motionEvent.getX();
            return e(motionEvent);
        }
        if (action != 3) {
            return false;
        }
        this.j = false;
        boolean zE = e();
        this.f = -1.0f;
        return zE;
    }

    private boolean d(MotionEvent motionEvent) {
        this.d = motionEvent.getRawX();
        this.f46428b = motionEvent.getRawY();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:8:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x0037  */
    private boolean e(MotionEvent motionEvent) {
        boolean z;
        float rawX = motionEvent.getRawX() - this.d;
        float rawY = motionEvent.getRawY() - this.f46428b;
        qle qleVarA = a((int) motionEvent.getX(), (int) motionEvent.getY());
        qlg qlgVar = this.f46429c;
        if (qlgVar == null) {
            int i = this.k;
            if ((rawY * rawY) + (rawX * rawX) > i * i) {
                if (qleVarA != null) {
                    a(qleVarA.i());
                    z = true;
                } else {
                    z = false;
                }
            } else if (qlgVar != null) {
                qlgVar.d(motionEvent);
                if (qleVarA != null && qleVarA.j() == 0 && (qleVarA != this.i || !qleVarA.g().contains(this.e.g()))) {
                    c(qleVarA);
                }
                this.f46427a.invalidate();
                z = true;
            } else {
                z = false;
            }
        } else if (qlgVar != null) {
            qlgVar.d(motionEvent);
            if (qleVarA != null) {
                c(qleVarA);
            }
            this.f46427a.invalidate();
            z = true;
        } else {
            z = false;
        }
        if (qleVarA != null) {
            this.i = qleVarA;
        }
        return z;
    }

    private void c(qle qleVar) {
        this.o.e(qleVar);
    }

    public void a(int i) {
        this.j = true;
        View childAt = this.f46427a.getChildAt(i);
        this.h = childAt;
        if (childAt != null) {
            this.f46429c = new qlg(this.h, this.f, this.g);
            this.h.setVisibility(4);
            Object tag = this.h.getTag();
            if (tag instanceof qle) {
                this.e = (qle) tag;
            }
        }
    }

    private boolean b() {
        View view = this.h;
        if (view == null) {
            return false;
        }
        view.setVisibility(0);
        this.f46429c = null;
        this.h = null;
        return true;
    }

    private boolean e() {
        return b();
    }

    public void e(Canvas canvas) {
        qlg qlgVar = this.f46429c;
        if (qlgVar != null) {
            qlgVar.draw(canvas);
        }
    }

    private qle a(int i, int i2) {
        ArrayList<qle> arrayList;
        qle qleVarD;
        qle qleVar = null;
        if (this.h != null && !this.e.g().contains(i, i2)) {
            int i3 = 0;
            int size = 0;
            while (true) {
                if (i3 >= this.f46427a.getRowSparseArray().size()) {
                    i3 = 0;
                    arrayList = null;
                    break;
                }
                if (i2 >= this.f46427a.getRowSparseArray().get(i3).get(0).g().top && i2 <= this.f46427a.getRowSparseArray().get(i3).get(0).g().bottom) {
                    arrayList = this.f46427a.getRowSparseArray().get(i3);
                    break;
                }
                size += this.f46427a.getRowSparseArray().get(i3).size();
                i3++;
            }
            int iIndexOf = this.f46427a.getTagInfos().indexOf(this.e);
            if (arrayList != null) {
                boolean z = i > arrayList.get(arrayList.size() - 1).g().right;
                if (!LanguageUtil.ba(this.f46427a.getContext()) ? z : i < arrayList.get(arrayList.size() - 1).g().left) {
                    qleVarD = d(arrayList, i3, size);
                } else {
                    qleVarD = c(arrayList, i, i2, size);
                }
                qleVar = qleVarD;
            }
            b(qleVar, iIndexOf);
        }
        return qleVar;
    }

    private qle d(List<qle> list, int i, int i2) {
        if (i == this.f46427a.getRowSparseArray().size() - 1) {
            qle qleVar = list.get(list.size() - 1);
            qleVar.d((list.size() + i2) - 1);
            return qleVar;
        }
        qle qleVar2 = this.f46427a.getRowSparseArray().get(i + 1).get(0);
        qleVar2.d(i2 + this.f46427a.getRowSparseArray().get(i).size());
        return qleVar2;
    }

    private qle c(List<qle> list, int i, int i2, int i3) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            qle qleVar = list.get(i4);
            if (qleVar.g().contains(i, i2)) {
                boolean z = i <= (qleVar.g().left + qleVar.g().right) / 2;
                if (!LanguageUtil.ba(this.f46427a.getContext()) ? z : i > (qleVar.g().left + qleVar.g().right) / 2) {
                    qleVar.d(i3 + i4);
                    return qleVar;
                }
                qleVar.d(i4 + i3 + 1);
                return qleVar;
            }
        }
        return null;
    }

    class c {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(qle qleVar) {
            qlf.this.f46427a.getViewTreeObserver().addOnPreDrawListener(new e(qleVar));
        }

        class e implements ViewTreeObserver.OnPreDrawListener {
            private qle e;

            public e(qle qleVar) {
                this.e = qleVar;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                qlf.this.f46427a.getViewTreeObserver().removeOnPreDrawListener(this);
                qlf.this.f46427a.c(this.e);
                return true;
            }
        }
    }

    private void b(qle qleVar, int i) {
        if (qleVar == null || qleVar.j() != 0 || qleVar.i() == i) {
            return;
        }
        if (qleVar.i() == this.f46427a.getTagInfos().size() - 1) {
            this.f46427a.getTagInfos().remove(this.e);
            this.f46427a.getTagInfos().add(this.e);
        } else if (qleVar.i() < i) {
            this.f46427a.getTagInfos().add(qleVar.i(), this.e);
            this.f46427a.getTagInfos().remove(i + 1);
        } else {
            this.f46427a.getTagInfos().add(qleVar.i(), this.e);
            this.f46427a.getTagInfos().remove(i);
        }
    }
}
