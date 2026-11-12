package fb2;

import android.app.Activity;
import android.view.View;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import ew1.h1;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class u<T> extends b0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f70375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T[] f70376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<T, CharSequence> f70377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence[] f70378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Activity f70379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GCMComplexTwoLineButton f70380g;

    public u(View view2, Activity activity, b0.a aVar) {
        super(aVar);
        this.f70378e = new CharSequence[0];
        if (activity == null) {
            vb.h.s("Activity is required");
            throw null;
        }
        this.f70379f = activity;
        if (view2 == null) {
            vb.h.s("Button not found");
            throw null;
        }
        try {
            GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) view2;
            this.f70380g = gCMComplexTwoLineButton;
            gCMComplexTwoLineButton.setOnClickListener(this);
        } catch (ClassCastException unused) {
            vb.h.s("Button of GCMComplexTwoLineButton type is required");
            throw null;
        }
    }

    @Override // fb2.b0
    public final boolean b() {
        return b0.c(this.f70380g);
    }

    @Override // fb2.b0
    public final boolean d() {
        return b0.e(this.f70380g);
    }

    @Override // fb2.b0
    public final void h(boolean z14) {
        b0.g(this.f70380g, z14);
    }

    @Override // fb2.b0
    public final void j(boolean z14) {
        b0.i(this.f70380g, z14);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14;
        T t7 = this.f70375b;
        if (t7 != null) {
            i14 = 0;
            while (true) {
                T[] tArr = this.f70376c;
                if (i14 >= tArr.length) {
                    break;
                } else if (!t7.equals(tArr[i14])) {
                    i14++;
                }
            }
            i14 = -1;
        } else {
            i14 = -1;
        }
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(this.f70379f);
        aVar.setTitle(this.f70380g.getButtonTopLabel());
        aVar.setSingleChoiceItems(this.f70378e, i14, new h1(this, 3));
        aVar.create().show();
    }
}
