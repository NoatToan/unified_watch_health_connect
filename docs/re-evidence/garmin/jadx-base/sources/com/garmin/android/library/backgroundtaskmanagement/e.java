package com.garmin.android.library.backgroundtaskmanagement;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import o53.p1;
import o53.r;
import o53.s;
import p005kotlin.Metadata;
import p3.q1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/library/backgroundtaskmanagement/e;", "T", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$d;", "priority", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b$d;Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "background-task-management_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class e<T> extends b<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s f50129l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b.d dVar, b.a aVar) {
        super(dVar, aVar);
        dVar.getClass();
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b
    public final void g() {
        super.g();
        if (this.f50129l != null) {
            b.c cVar = this.f50094d.get();
            if (cVar == b.c.SUCCESS) {
                ((s) l()).g0(this.f50097g.get(b.e.SOURCE));
            } else {
                r<T> rVarL = l();
                cVar.getClass();
                ((s) rVarL).O(new BizOperationException(cVar));
            }
        }
    }

    public final r<T> k() {
        this.f50129l = gl.b.b();
        ((p1) l()).J(new q1(this, 14));
        c.d(this, null);
        return l();
    }

    public final r<T> l() {
        s sVar = this.f50129l;
        if (sVar != null) {
            return sVar;
        }
        p005kotlin.jvm.internal.s.m("deferredResult");
        throw null;
    }
}
