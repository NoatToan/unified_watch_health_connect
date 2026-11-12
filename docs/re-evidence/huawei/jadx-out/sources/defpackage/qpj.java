package defpackage;

import android.graphics.drawable.Drawable;
import com.huawei.uikit.hwsubtab.widget.HwSubTabWidget;

/* JADX INFO: loaded from: classes16.dex */
public class qpj extends xfz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f46602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f46603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f46604c;

    public qpj(HwSubTabWidget hwSubTabWidget, CharSequence charSequence) {
        super(hwSubTabWidget, charSequence);
    }

    public Drawable b() {
        return this.f46604c;
    }

    public qpj a(Drawable drawable) {
        this.f46604c = drawable;
        return this;
    }

    public Drawable e() {
        return this.f46602a;
    }

    public qpj d(Drawable drawable) {
        this.f46602a = drawable;
        return this;
    }

    public Drawable a() {
        return this.f46603b;
    }

    public void c(Drawable drawable) {
        this.f46603b = drawable;
    }
}
