package defpackage;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ia8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextInputLayout f20937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f20938b;
    public CheckableImageButton c;
    public final int d;

    public ia8(TextInputLayout textInputLayout, int i) {
        this.f20937a = textInputLayout;
        this.f20938b = textInputLayout.getContext();
        this.c = textInputLayout.getEndIconView();
        this.d = i;
    }

    public abstract void a();

    public boolean b(int i) {
        return true;
    }

    public void c(boolean z) {
    }

    public boolean d() {
        return false;
    }
}
