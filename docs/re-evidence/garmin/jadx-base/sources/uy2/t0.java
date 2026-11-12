package uy2;

import java.lang.annotation.Annotation;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B;\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Luy2/t0;", "", "AnnotationType", "Luy2/x0;", "Lkotlin/Function1;", "Lk23/d;", "Lxy2/o;", "getReturnProviderClass", "", "getDescription", "<init>", "(Le23/l;Le23/l;)V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t0<AnnotationType extends Annotation> extends x0<AnnotationType> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<AnnotationType, k23.d<? extends xy2.o<?>>> f173462b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t0(e23.l<? super AnnotationType, ? extends k23.d<? extends xy2.o<?>>> lVar, e23.l<? super AnnotationType, String> lVar2) {
        super(lVar2);
        lVar.getClass();
        lVar2.getClass();
        this.f173462b = lVar;
    }

    @Override // uy2.x0
    public final c a(AnnotationType annotationtype) {
        annotationtype.getClass();
        return new c.a((e23.a<? extends Object>) new ug2.h(10, this, annotationtype));
    }
}
