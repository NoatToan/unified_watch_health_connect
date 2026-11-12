package n7;

import android.graphics.drawable.ColorDrawable;

/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ColorDrawable f123954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f123955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f123956j;

    public a(int i14, int i15) {
        this(i14);
        this.f123955i = true;
        ColorDrawable colorDrawable = this.f123954h;
        if (this.f123956j != i15) {
            this.f123956j = i15;
            colorDrawable.setColor(i15);
            b.a aVar = this.f123958b;
            aVar.f123968e = colorDrawable;
            b.a.InterfaceC2332a interfaceC2332a = aVar.f123972i;
            if (interfaceC2332a != null) {
                ((d) interfaceC2332a).f123980b.setBackground(colorDrawable);
            }
        }
    }

    @Override // n7.b
    public final void a(int i14) {
        if (this.f123955i || this.f123956j == i14) {
            return;
        }
        this.f123956j = i14;
        ColorDrawable colorDrawable = this.f123954h;
        colorDrawable.setColor(i14);
        b.a aVar = this.f123958b;
        aVar.f123968e = colorDrawable;
        b.a.InterfaceC2332a interfaceC2332a = aVar.f123972i;
        if (interfaceC2332a != null) {
            ((d) interfaceC2332a).f123980b.setBackground(colorDrawable);
        }
    }

    public a(int i14) {
        super(i14);
        this.f123954h = new ColorDrawable();
        this.f123956j = 0;
    }
}
