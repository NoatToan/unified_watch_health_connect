package a5;

import e23.l;
import h5.e2;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh5/e2;", "T", "it", "", "invoke", "(Lh5/e2;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class i extends w implements l<Object, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0<Object> f1232a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r0<Object> r0Var) {
        super(1);
        this.f1232a = r0Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, h5.e2, h5.j] */
    @Override // e23.l
    public final Boolean invoke(Object obj) {
        boolean z14;
        ?? r14 = (e2) obj;
        if (r14.getNode().getIsAttached()) {
            this.f1232a.f105810a = r14;
            z14 = false;
        } else {
            z14 = true;
        }
        return Boolean.valueOf(z14);
    }
}
