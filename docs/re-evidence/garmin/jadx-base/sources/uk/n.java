package uk;

import java.util.UUID;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b2\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0007\u001a\n \u0001*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lpj2/k;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Ljava/util/UUID;", "<anonymous parameter 1>", "characteristic", "", "data", "", "onCharacteristicChanged", "(Lpj2/k;Ljava/util/UUID;Ljava/util/UUID;[B)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
public final class n implements pj2.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sk.d f171722a;

    public n(sk.d dVar) {
        this.f171722a = dVar;
    }

    @Override // pj2.l
    public final void a(pj2.k kVar, UUID uuid, UUID uuid2, byte[] bArr) {
        sk.h hVar = this.f171722a.f159507a;
        hVar.f159540b.post(new sk.j(hVar, uuid2, bArr));
    }
}
