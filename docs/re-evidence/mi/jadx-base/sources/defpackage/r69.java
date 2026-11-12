package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r69 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LayoutInflater.Factory2 f32233a;

    public void a(LayoutInflater.Factory2 factory2) {
        this.f32233a = factory2;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        LayoutInflater.Factory2 factory2 = this.f32233a;
        if (factory2 != null) {
            return factory2.onCreateView(view, str, context, attributeSet);
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        LayoutInflater.Factory2 factory2 = this.f32233a;
        if (factory2 != null) {
            return factory2.onCreateView(str, context, attributeSet);
        }
        return null;
    }
}
