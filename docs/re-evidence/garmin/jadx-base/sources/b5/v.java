package b5;

import kotlin.t1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb5/v;", "Lb5/h;", "Lb5/w;", "icon", "", "overrideDescendants", "<init>", "(Lb5/w;Z)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15904e;

    public v(w wVar, boolean z14) {
        super(wVar, z14, null, 4, null);
        this.f15904e = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // b5.h
    public final void V1(w wVar) {
        x xVar = (x) h5.i.a(this, t1.f91504v);
        if (xVar != null) {
            xVar.a(wVar);
        }
    }

    @Override // h5.e2
    public final Object X() {
        return this.f15904e;
    }

    @Override // b5.h
    public final boolean X1(int i14) {
        m0.a aVar = m0.f15849b;
        aVar.getClass();
        if (i14 == m0.f15852e) {
            return false;
        }
        aVar.getClass();
        return i14 != m0.f15853f;
    }

    public /* synthetic */ v(w wVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(wVar, (i14 & 2) != 0 ? false : z14);
    }
}
