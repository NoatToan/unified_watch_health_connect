package org.koin.compose;

import e23.l;
import e23.p;
import org.koin.compose.scope.KoinScopeKt;
import p3.m;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f133526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f133527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f133528d;

    public /* synthetic */ a(l lVar, p pVar, int i14, int i15) {
        this.f133525a = i15;
        this.f133526b = lVar;
        this.f133527c = pVar;
        this.f133528d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f133525a;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                return KoinApplicationKt.KoinApplication$lambda$6(this.f133526b, this.f133527c, this.f133528d, mVar, iIntValue);
            default:
                return KoinScopeKt.KoinScope$lambda$0(this.f133526b, this.f133527c, this.f133528d, mVar, iIntValue);
        }
    }
}
