package t21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class w implements e23.a<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u21.i f161969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s21.m f161970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<Integer, Integer, Unit> f161971c;

    /* JADX WARN: Multi-variable type inference failed */
    public w(u21.i iVar, s21.m mVar, e23.p<? super Integer, ? super Integer, Unit> pVar) {
        this.f161969a = iVar;
        this.f161970b = mVar;
        this.f161971c = pVar;
    }

    @Override // e23.a
    public final Boolean invoke() {
        int iIndexOf = this.f161969a.f168000a.indexOf(this.f161970b);
        this.f161971c.invoke(Integer.valueOf(iIndexOf), Integer.valueOf(iIndexOf - 1));
        return Boolean.TRUE;
    }
}
