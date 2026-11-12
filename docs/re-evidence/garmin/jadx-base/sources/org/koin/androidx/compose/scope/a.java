package org.koin.androidx.compose.scope;

import e23.p;
import org.koin.androidx.compose.KoinAndroidContextKt;
import p3.m;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f133523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f133524c;

    public /* synthetic */ a(p pVar, int i14, int i15) {
        this.f133522a = i15;
        this.f133523b = pVar;
        this.f133524c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f133522a;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                return KoinAndroidScopeKt.KoinFragmentScope$lambda$1(this.f133523b, this.f133524c, mVar, iIntValue);
            case 1:
                return KoinAndroidScopeKt.KoinActivityScope$lambda$0(this.f133523b, this.f133524c, mVar, iIntValue);
            default:
                return KoinAndroidContextKt.KoinAndroidContext$lambda$1(this.f133523b, this.f133524c, mVar, iIntValue);
        }
    }
}
