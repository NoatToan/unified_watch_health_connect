package ux2;

import og2.k;
import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.garmin.samd.repository.ghs.deviceauthorization.CreateAuthCodeKt", f = "CreateAuthCode.kt", l = {21}, m = "createAuthCode")
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f173072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f173073b;

    public a(d<? super a> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f173072a = obj;
        this.f173073b |= Integer.MIN_VALUE;
        return k.o(null, this);
    }
}
