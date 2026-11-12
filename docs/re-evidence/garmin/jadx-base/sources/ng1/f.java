package ng1;

import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes10.dex */
public class f implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f125928a;

    public f(j jVar) {
        this.f125928a = jVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
        Boolean boolValueOf = Boolean.valueOf(z14);
        j jVar = this.f125928a;
        jVar.ja(1, boolValueOf);
        rd2.h hVarD = rd2.h.d();
        long j8 = jVar.f125976b;
        hVarD.getClass();
        rd2.h.g(j8, 1, z14);
    }
}
