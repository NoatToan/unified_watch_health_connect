package bu1;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.media3.common.e0;
import androidx.media3.common.f0;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import rt1.m;
import sa.r;
import wa.e;
import wa.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbu1/a;", "Landroid/view/View$OnClickListener;", "Landroid/content/DialogInterface$OnClickListener;", "Lwa/e;", "selector", "Lwa/g$b;", "adaptiveTrackSelectionFactory", "<init>", "(Lwa/e;Lwa/g$b;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements View.OnClickListener, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f21223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g.b f21224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f21226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f0 f21228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CheckedTextView f21229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CheckedTextView f21230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21231i;

    public a(e eVar, g.b bVar) {
        eVar.getClass();
        this.f21223a = eVar;
        this.f21224b = bVar;
    }

    public final void a() {
        CheckedTextView checkedTextView = this.f21229g;
        boolean z14 = false;
        if (checkedTextView != null) {
            checkedTextView.setChecked(this.f21227e && !this.f21231i);
        }
        CheckedTextView checkedTextView2 = this.f21230h;
        if (checkedTextView2 != null) {
            if (!this.f21227e && this.f21231i && this.f21228f == null) {
                z14 = true;
            }
            checkedTextView2.setChecked(z14);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        dialogInterface.getClass();
        e eVar = this.f21223a;
        e.C3405e c3405eA = eVar.a();
        c3405eA.getClass();
        e.C3405e.a aVar = new e.C3405e.a();
        aVar.n(this.f21225c, this.f21227e);
        f0 f0Var = this.f21228f;
        HashMap<e0, f0> map = aVar.A;
        if (f0Var != null) {
            map.put(f0Var.f8223a, f0Var);
        } else {
            map.clear();
        }
        eVar.g(aVar.a());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        view2.getClass();
        if (view2 == this.f21229g) {
            this.f21227e = true;
            this.f21228f = null;
            this.f21231i = false;
        } else if (view2 == this.f21230h) {
            this.f21227e = false;
            this.f21228f = null;
            this.f21231i = true;
        }
        a();
        ((m) KoinJavaComponent.get$default(m.class, null, null, 6, null)).v(this.f21231i);
    }
}
