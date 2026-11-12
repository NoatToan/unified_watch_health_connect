package kd0;

import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DeviceDelegateImpl", f = "DeviceDelegateImpl.kt", l = {344, 347}, m = "onDevicesReconciled", v = 2)
public final class m1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f104218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f104219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f104220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f104221d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(l1 l1Var, t13.d<? super m1> dVar) {
        super(dVar);
        this.f104220c = l1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104219b = obj;
        this.f104221d |= Integer.MIN_VALUE;
        return this.f104220c.O(this);
    }
}
