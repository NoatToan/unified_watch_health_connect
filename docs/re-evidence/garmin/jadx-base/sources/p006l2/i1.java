package p006l2;

import android.view.KeyEvent;
import e23.l;
import p005kotlin.Metadata;
import z2.h2;
import z4.b;
import z4.c;
import z4.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class i1 implements l<b, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b2 f108569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f108570b;

    public i1(b2 b2Var, h2 h2Var) {
        this.f108569a = b2Var;
        this.f108570b = h2Var;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    @Override // e23.l
    public final Boolean invoke(b bVar) {
        boolean z14;
        KeyEvent keyEvent = bVar.f202306a;
        if (this.f108569a.a() == m1.Selection && keyEvent.getKeyCode() == 4) {
            int iB = d.b(keyEvent);
            c.f202307b.getClass();
            if (iB == c.f202308c) {
                this.f108570b.m(null);
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }
}
