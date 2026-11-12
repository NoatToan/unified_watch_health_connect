package yt;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p3.x3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class w implements e23.l<Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f199400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<List<eu.g>> f199401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<Integer, tt.m, Unit> f199402c;

    /* JADX WARN: Multi-variable type inference failed */
    public w(n nVar, x3<? extends List<eu.g>> x3Var, e23.p<? super Integer, ? super tt.m, Unit> pVar) {
        this.f199400a = nVar;
        this.f199401b = x3Var;
        this.f199402c = pVar;
    }

    @Override // e23.l
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        eu.g gVar = (eu.g) h0.e0(iIntValue, this.f199401b.getF182175a());
        if (gVar != null) {
            this.f199402c.invoke(Integer.valueOf(iIntValue), gVar.f66086c);
        }
        this.f199400a.f199348i.j(Integer.valueOf(iIntValue));
        return Unit.INSTANCE;
    }
}
