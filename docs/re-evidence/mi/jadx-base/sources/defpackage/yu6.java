package defpackage;

import android.view.View;
import miuix.appcompat.app.c;

/* JADX INFO: loaded from: classes3.dex */
public class yu6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public prc f40562a;

    public interface a {
        void end();
    }

    public void a() {
        prc prcVar = this.f40562a;
        if (prcVar != null) {
            prcVar.b();
        }
    }

    public void b(View view, boolean z, View view2, a aVar) {
        if (this.f40562a == null) {
            if (z) {
                this.f40562a = new shh();
            } else {
                this.f40562a = new mth();
            }
        }
        this.f40562a.a(view, view2, aVar);
        this.f40562a = null;
    }

    public void c(View view, View view2, boolean z, boolean z2, c.d dVar) {
        if (this.f40562a == null) {
            if (z) {
                this.f40562a = new shh();
            } else {
                this.f40562a = new mth();
            }
        }
        this.f40562a.c(view, view2, z2, dVar);
    }
}
