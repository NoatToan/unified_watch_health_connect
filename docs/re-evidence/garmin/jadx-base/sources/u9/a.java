package u9;

import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.x1;
import e23.l;
import java.util.Arrays;
import k23.d;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import vb.h;
import w9.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\"\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu9/a;", "Landroidx/lifecycle/x1$c;", "", "Lu9/c;", "initializers", "<init>", "([Lu9/c;)V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<?>[] f169507a;

    public a(c<?>... cVarArr) {
        cVarArr.getClass();
        this.f169507a = cVarArr;
    }

    @Override // androidx.lifecycle.x1.c
    public final <VM extends u1> VM create(Class<VM> cls, CreationExtras creationExtras) {
        VM vm3;
        c cVar;
        l<CreationExtras, T> lVar;
        g gVar = g.f183576a;
        d dVarB = s0.f105811a.b(cls);
        c<?>[] cVarArr = this.f169507a;
        c[] cVarArr2 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length);
        gVar.getClass();
        int length = cVarArr2.length;
        int i14 = 0;
        while (true) {
            vm3 = null;
            if (i14 >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArr2[i14];
            if (s.g(cVar.f169509a, dVarB)) {
                break;
            }
            i14++;
        }
        if (cVar != null && (lVar = cVar.f169510b) != 0) {
            vm3 = (VM) lVar.invoke(creationExtras);
        }
        if (vm3 != null) {
            return vm3;
        }
        h.y(dVarB.getF16141b(), "No initializer set for given class ");
        return null;
    }
}
