package uy2;

import java.lang.annotation.Annotation;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Luy2/y0;", "", "AnnotationType", "Luy2/x0;", "Lkotlin/Function1;", "Lk23/d;", "", "getExceptionClass", "", "getDescription", "<init>", "(Le23/l;Le23/l;)V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y0<AnnotationType extends Annotation> extends x0<AnnotationType> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<AnnotationType, k23.d<? extends Throwable>> f173468b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y0(e23.l<? super AnnotationType, ? extends k23.d<? extends Throwable>> lVar, e23.l<? super AnnotationType, String> lVar2) {
        super(lVar2);
        lVar.getClass();
        lVar2.getClass();
        this.f173468b = lVar;
    }

    @Override // uy2.x0
    public final c a(AnnotationType annotationtype) {
        annotationtype.getClass();
        return new c.b(new ug2.h(13, this, annotationtype));
    }
}
