package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes16.dex */
public class qpr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f46622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f46623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f46624c;
    private View e;

    public View a(ViewGroup viewGroup, int i) {
        if (this.e == null) {
            View view = new View(viewGroup.getContext());
            this.e = view;
            view.setBackgroundResource(i);
            viewGroup.addView(this.e, 0);
        }
        return this.e;
    }

    public View e() {
        return this.e;
    }

    public void a(ViewGroup viewGroup) {
        View view = this.e;
        if (view != null) {
            viewGroup.removeView(view);
            this.e = null;
        }
    }

    public View e(ViewGroup viewGroup, int i) {
        if (this.f46624c == null) {
            View view = new View(viewGroup.getContext());
            this.f46624c = view;
            view.setBackgroundResource(i);
            viewGroup.addView(this.f46624c, 0);
        }
        return this.f46624c;
    }

    public View a() {
        return this.f46624c;
    }

    public void d(ViewGroup viewGroup) {
        View view = this.f46624c;
        if (view != null) {
            viewGroup.removeView(view);
            this.f46624c = null;
        }
    }

    public View d(ViewGroup viewGroup, int i) {
        if (this.f46623b == null) {
            View view = new View(viewGroup.getContext());
            this.f46623b = view;
            view.setBackgroundResource(i);
            viewGroup.addView(this.f46623b, 0);
        }
        return this.f46623b;
    }

    public View b() {
        return this.f46623b;
    }

    public void e(ViewGroup viewGroup) {
        View view = this.f46623b;
        if (view != null) {
            viewGroup.removeView(view);
            this.f46623b = null;
        }
    }

    public View c(ViewGroup viewGroup, int i) {
        if (this.f46622a == null) {
            View view = new View(viewGroup.getContext());
            this.f46622a = view;
            view.setBackgroundResource(i);
            viewGroup.addView(this.f46622a, 0);
        }
        return this.f46622a;
    }

    public View c() {
        return this.f46622a;
    }

    public void c(ViewGroup viewGroup) {
        View view = this.f46622a;
        if (view != null) {
            viewGroup.removeView(view);
            this.f46622a = null;
        }
    }
}
