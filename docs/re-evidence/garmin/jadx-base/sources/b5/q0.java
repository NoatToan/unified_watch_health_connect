package b5;

import kotlin.t1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lb5/q0;", "Lb5/h;", "Lb5/w;", "icon", "", "overrideDescendants", "Lh5/r;", "touchBoundsExpansion", "<init>", "(Lb5/w;ZLh5/r;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q0 extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15876e;

    public /* synthetic */ q0(w wVar, boolean z14, h5.r rVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(wVar, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? null : rVar);
    }

    @Override // b5.h
    public final void V1(w wVar) {
        x xVar = (x) h5.i.a(this, t1.f91504v);
        if (xVar != null) {
            xVar.c(wVar);
        }
    }

    @Override // h5.e2
    public final Object X() {
        return this.f15876e;
    }

    @Override // b5.h
    public final boolean X1(int i14) {
        m0.a aVar = m0.f15849b;
        aVar.getClass();
        if (i14 == m0.f15852e) {
            return true;
        }
        aVar.getClass();
        return i14 == m0.f15853f;
    }

    public q0(w wVar, boolean z14, h5.r rVar) {
        super(wVar, z14, rVar);
        this.f15876e = "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }
}
