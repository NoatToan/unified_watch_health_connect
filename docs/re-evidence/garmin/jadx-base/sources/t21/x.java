package t21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class x implements e23.a<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u21.i f161974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s21.m f161975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<Integer, Integer, Unit> f161976c;

    /* JADX WARN: Multi-variable type inference failed */
    public x(u21.i iVar, s21.m mVar, e23.p<? super Integer, ? super Integer, Unit> pVar) {
        this.f161974a = iVar;
        this.f161975b = mVar;
        this.f161976c = pVar;
    }

    @Override // e23.a
    public final Boolean invoke() {
        int iIndexOf = this.f161974a.f168000a.indexOf(this.f161975b);
        this.f161976c.invoke(Integer.valueOf(iIndexOf), Integer.valueOf(iIndexOf + 1));
        return Boolean.TRUE;
    }
}
