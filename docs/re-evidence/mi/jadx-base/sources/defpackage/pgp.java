package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/* JADX INFO: loaded from: classes3.dex */
public final class pgp extends Toast {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Toast f30383a;

    public pgp(Context context, Toast toast) {
        super(context);
        this.f30383a = toast;
    }

    public static pgp a(Context context, CharSequence charSequence, int i) {
        Toast toastMakeText = Toast.makeText(context, charSequence, i);
        b(toastMakeText.getView(), new h9l(context, toastMakeText));
        return new pgp(context, toastMakeText);
    }

    public static void b(View view, Context context) {
    }

    @Override // android.widget.Toast
    public int getDuration() {
        return this.f30383a.getDuration();
    }

    @Override // android.widget.Toast
    public int getGravity() {
        return this.f30383a.getGravity();
    }

    @Override // android.widget.Toast
    public float getHorizontalMargin() {
        return this.f30383a.getHorizontalMargin();
    }

    @Override // android.widget.Toast
    public float getVerticalMargin() {
        return this.f30383a.getVerticalMargin();
    }

    @Override // android.widget.Toast
    public View getView() {
        return this.f30383a.getView();
    }

    @Override // android.widget.Toast
    public int getXOffset() {
        return this.f30383a.getXOffset();
    }

    @Override // android.widget.Toast
    public int getYOffset() {
        return this.f30383a.getYOffset();
    }

    @Override // android.widget.Toast
    public void setDuration(int i) {
        this.f30383a.setDuration(i);
    }

    @Override // android.widget.Toast
    public void setGravity(int i, int i2, int i3) {
        this.f30383a.setGravity(i, i2, i3);
    }

    @Override // android.widget.Toast
    public void setMargin(float f, float f2) {
        this.f30383a.setMargin(f, f2);
    }

    @Override // android.widget.Toast
    public void setText(int i) {
        this.f30383a.setText(i);
    }

    @Override // android.widget.Toast
    public void setView(View view) {
        this.f30383a.setView(view);
        b(view, new h9l(view.getContext(), this));
    }

    @Override // android.widget.Toast
    public void show() {
        this.f30383a.show();
    }

    @Override // android.widget.Toast
    public void setText(CharSequence charSequence) {
        this.f30383a.setText(charSequence);
    }
}
