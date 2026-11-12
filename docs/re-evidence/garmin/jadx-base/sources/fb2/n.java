package fb2;

import android.view.View;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class n extends b0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f70366b;

    public interface a {
        void a(String str, String str2);

        void b(int i14);

        void c(n nVar);

        String getLabel();

        View getView();
    }

    public n(a aVar, b0.a aVar2) {
        super(aVar2);
        this.f70366b = aVar;
        try {
            aVar.c(this);
        } catch (ClassCastException unused) {
            vb.h.s("Button of GCMComplexOneLineButton type is required");
            throw null;
        }
    }

    @Override // fb2.b0
    public final boolean b() {
        return b0.c(this.f70366b.getView());
    }

    @Override // fb2.b0
    public final boolean d() {
        return b0.e(this.f70366b.getView());
    }

    @Override // fb2.b0
    public final void h(boolean z14) {
        b0.g(this.f70366b.getView(), z14);
    }

    @Override // fb2.b0
    public final void j(boolean z14) {
        b0.i(this.f70366b.getView(), z14);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        i2.l("ProxyViewDecorator", "onClick(): notifyListener");
        f(this.f70366b.getLabel());
    }
}
