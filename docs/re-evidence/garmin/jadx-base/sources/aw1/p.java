package aw1;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel", f = "FBTPlanWizardViewModel.kt", l = {2795, 2797, 2807}, m = "createEvent", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f13531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fg0.k f13532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f13534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13535e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(h hVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f13534d = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f13533c = obj;
        this.f13535e |= Integer.MIN_VALUE;
        int i14 = h.S1;
        return this.f13534d.m5(null, null, this);
    }
}
