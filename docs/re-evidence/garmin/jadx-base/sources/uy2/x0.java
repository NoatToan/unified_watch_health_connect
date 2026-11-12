package uy2;

import java.lang.annotation.Annotation;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Luy2/x0;", "", "AnnotationType", "Lxy2/j;", "Luy2/w0;", "Lkotlin/Function1;", "", "getDescription", "<init>", "(Le23/l;)V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class x0<AnnotationType extends Annotation> implements xy2.j<w0, AnnotationType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<AnnotationType, String> f173467a;

    /* JADX WARN: Multi-variable type inference failed */
    public x0(e23.l<? super AnnotationType, String> lVar) {
        lVar.getClass();
        this.f173467a = lVar;
    }

    public abstract c a(AnnotationType annotationtype);

    @Override // xy2.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final w0 invoke(AnnotationType annotationtype) {
        annotationtype.getClass();
        return new w0(a(annotationtype), this.f173467a.invoke(annotationtype));
    }
}
