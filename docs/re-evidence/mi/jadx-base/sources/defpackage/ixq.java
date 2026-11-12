package defpackage;

import android.view.View;
import android.view.ViewStub;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes.dex */
public class ixq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewStub f22206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewDataBinding f22207b;
    public View c;
    public ViewStub.OnInflateListener d;
    public ViewDataBinding e;
    public ViewStub.OnInflateListener f;

    public class a implements ViewStub.OnInflateListener {
        public a() {
        }

        @Override // android.view.ViewStub.OnInflateListener
        public void onInflate(ViewStub viewStub, View view) {
            ixq.this.c = view;
            ixq ixqVar = ixq.this;
            ixqVar.f22207b = sk5.a(ixqVar.e.f2138k, view, viewStub.getLayoutResource());
            ixq.this.f22206a = null;
            if (ixq.this.d != null) {
                ixq.this.d.onInflate(viewStub, view);
                ixq.this.d = null;
            }
            ixq.this.e.H();
            ixq.this.e.w();
        }
    }

    public ixq(ViewStub viewStub) {
        a aVar = new a();
        this.f = aVar;
        this.f22206a = viewStub;
        viewStub.setOnInflateListener(aVar);
    }

    public ViewDataBinding g() {
        return this.f22207b;
    }

    public ViewStub h() {
        return this.f22206a;
    }

    public boolean i() {
        return this.c != null;
    }

    public void j(ViewDataBinding viewDataBinding) {
        this.e = viewDataBinding;
    }

    public void setOnInflateListener(ViewStub.OnInflateListener onInflateListener) {
        if (this.f22206a != null) {
            this.d = onInflateListener;
        }
    }
}
