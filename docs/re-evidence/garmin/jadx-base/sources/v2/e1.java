package v2;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.a4;
import kotlin.b3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lv2/e1;", "Li5/b3;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Lo4/a1;", "", "localToScreen", "Lv2/u0;", "inputMethodManager", "<init>", "(Landroid/view/View;Le23/l;Lv2/u0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e1 implements b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f174960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f174961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e23.l<? super List<? extends x5.k>, Unit> f174962c = new uu.o(9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.l<? super x5.p, Unit> f174963d = new uu.o(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p006l2.b2 f174964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z2.h2 f174965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a4 f174966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x5.l0 f174967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x5.q f174968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f174969j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f174970k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Rect f174971l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a1 f174972m;

    public e1(View view2, e23.l<? super o4.a1, Unit> lVar, u0 u0Var) {
        this.f174960a = view2;
        this.f174961b = u0Var;
        s5.w0.f157315b.getClass();
        this.f174967h = new x5.l0("", s5.w0.f157316c, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null);
        x5.q.f188930h.getClass();
        this.f174968i = x5.q.f188931i;
        this.f174969j = new ArrayList();
        this.f174970k = o13.m.a(o13.n.NONE, new ty1.f1(this, 23));
        this.f174972m = new a1(lVar, u0Var);
    }

    @Override // kotlin.b3
    public final InputConnection a(EditorInfo editorInfo) {
        x5.l0 l0Var = this.f174967h;
        i0.a(editorInfo, l0Var.f188878a.f157138b, l0Var.f188879b, this.f174968i, null);
        c1.a aVar = c1.f174908a;
        if (androidx.emoji2.text.d.e()) {
            androidx.emoji2.text.d.a().j(editorInfo);
        }
        i1 i1Var = new i1(this.f174967h, new d1(this), this.f174968i.f188934c, this.f174964e, this.f174965f, this.f174966g);
        this.f174969j.add(new WeakReference(i1Var));
        return i1Var;
    }
}
