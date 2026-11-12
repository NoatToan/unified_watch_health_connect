package rk0;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lrk0/t0;", "Lrk0/b;", "Lkk0/b;", "gearRepository", "", "gearId", "", "Ly22/w;", "initialPhotos", "<init>", "(Lkk0/b;Ljava/lang/String;Ljava/util/List;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t0 extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kk0.b f153264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f153265j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(kk0.b bVar, String str, List<y22.w> list) {
        super(list);
        bVar.getClass();
        str.getClass();
        list.getClass();
        this.f153264i = bVar;
        this.f153265j = str;
    }

    @Override // rk0.b
    public final Object x4(String str, zp0.f fVar, b.a aVar) {
        return this.f153264i.I(this.f153265j, fVar, str, aVar);
    }

    @Override // rk0.b
    public final Object y4(String str, b.C2897b c2897b) {
        return this.f153264i.i(this.f153265j, str, c2897b);
    }

    @Override // rk0.b
    public final Object z4(ArrayList arrayList, b.c cVar) {
        return this.f153264i.t(this.f153265j, arrayList, cVar);
    }
}
