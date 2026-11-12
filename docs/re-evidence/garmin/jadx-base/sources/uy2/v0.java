package uy2;

import java.lang.annotation.Annotation;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Luy2/v0;", "", "AnnotationType", "T", "Luy2/x0;", "Lkotlin/Function1;", "getValue", "", "getDescription", "<init>", "(Le23/l;Le23/l;)V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v0<AnnotationType extends Annotation, T> extends x0<AnnotationType> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<AnnotationType, T> f173464b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v0(e23.l<? super AnnotationType, ? extends T> lVar, e23.l<? super AnnotationType, String> lVar2) {
        super(lVar2);
        lVar.getClass();
        lVar2.getClass();
        this.f173464b = lVar;
    }

    @Override // uy2.x0
    public final c a(AnnotationType annotationtype) {
        annotationtype.getClass();
        return new c.a((e23.a<? extends Object>) new ug2.h(12, this, annotationtype));
    }
}
