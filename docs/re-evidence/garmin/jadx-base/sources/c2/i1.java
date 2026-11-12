package c2;

import android.os.Build;
import android.view.View;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc2/i1;", "Landroidx/core/view/l1$b;", "Ljava/lang/Runnable;", "Landroidx/core/view/z;", "Landroid/view/View$OnAttachStateChangeListener;", "Lc2/m3;", "composeInsets", "<init>", "(Lc2/m3;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i1 extends androidx.core.view.l1.b implements Runnable, androidx.core.view.z, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3 f22684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.core.view.m1 f22687d;

    public i1(m3 m3Var) {
        super(!m3Var.f22774t ? 1 : 0);
        this.f22684a = m3Var;
    }

    @Override // androidx.core.view.z
    public final androidx.core.view.m1 onApplyWindowInsets(View view2, androidx.core.view.m1 m1Var) {
        this.f22687d = m1Var;
        m3 m3Var = this.f22684a;
        h3 h3Var = m3Var.f22772r;
        androidx.core.view.m1.r rVar = m1Var.f6508a;
        h3Var.f(q3.e(rVar.i(8)));
        if (this.f22685b) {
            if (Build.VERSION.SDK_INT == 30) {
                view2.post(this);
            }
        } else if (!this.f22686c) {
            m3Var.f22773s.f(q3.e(rVar.i(8)));
            m3.b(m3Var, m1Var);
        }
        return m3Var.f22774t ? androidx.core.view.m1.f6507b : m1Var;
    }

    @Override // androidx.core.view.l1.b
    public final void onEnd(androidx.core.view.l1 l1Var) {
        this.f22685b = false;
        this.f22686c = false;
        androidx.core.view.m1 m1Var = this.f22687d;
        if (l1Var.f6472a.b() > 0 && m1Var != null) {
            androidx.core.view.m1.r rVar = m1Var.f6508a;
            m3 m3Var = this.f22684a;
            m3Var.f22773s.f(q3.e(rVar.i(8)));
            m3Var.f22772r.f(q3.e(rVar.i(8)));
            m3.b(m3Var, m1Var);
        }
        this.f22687d = null;
        super.onEnd(l1Var);
    }

    @Override // androidx.core.view.l1.b
    public final void onPrepare(androidx.core.view.l1 l1Var) {
        this.f22685b = true;
        this.f22686c = true;
        super.onPrepare(l1Var);
    }

    @Override // androidx.core.view.l1.b
    public final androidx.core.view.m1 onProgress(androidx.core.view.m1 m1Var, List<androidx.core.view.l1> list) {
        m3 m3Var = this.f22684a;
        m3.b(m3Var, m1Var);
        return m3Var.f22774t ? androidx.core.view.m1.f6507b : m1Var;
    }

    @Override // androidx.core.view.l1.b
    public final androidx.core.view.l1.a onStart(androidx.core.view.l1 l1Var, androidx.core.view.l1.a aVar) {
        this.f22685b = false;
        return super.onStart(l1Var, aVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view2) {
        view2.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view2) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f22685b) {
            this.f22685b = false;
            this.f22686c = false;
            androidx.core.view.m1 m1Var = this.f22687d;
            if (m1Var != null) {
                m3 m3Var = this.f22684a;
                m3Var.f22773s.f(q3.e(m1Var.f6508a.i(8)));
                m3.b(m3Var, m1Var);
                this.f22687d = null;
            }
        }
    }
}
