package fb2;

import android.view.View;
import android.widget.CompoundButton;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;

/* JADX INFO: loaded from: classes8.dex */
public class b extends b0 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GCMComplexOneLineButton f70333b;

    public b(View view2, b0.a aVar) {
        super(aVar);
        if (view2 == null) {
            vb.h.s("Button not found");
            throw null;
        }
        try {
            GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) view2;
            this.f70333b = gCMComplexOneLineButton;
            gCMComplexOneLineButton.setOnCheckedChangeListener(this);
            gCMComplexOneLineButton.e();
            gCMComplexOneLineButton.h();
        } catch (ClassCastException unused) {
            vb.h.s("Button of GCMComplexOneLineButton type is required");
            throw null;
        }
    }

    @Override // fb2.b0
    public final boolean b() {
        return b0.c(this.f70333b);
    }

    @Override // fb2.b0
    public final boolean d() {
        return b0.e(this.f70333b);
    }

    @Override // fb2.b0
    public final void h(boolean z14) {
        b0.g(this.f70333b, z14);
    }

    @Override // fb2.b0
    public final void j(boolean z14) {
        b0.i(this.f70333b, z14);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
        i2.l("BinaryToggleViewDecorator", "onCheckedChanged(): notifyListener with isChecked=" + z14);
        f(Boolean.valueOf(z14));
    }
}
