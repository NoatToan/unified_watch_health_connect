package defpackage;

import io.reactivex.BackpressureStrategy;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class l5l<R> implements la3<R, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f24695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hfl f24696b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public l5l(Type type, hfl hflVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f24695a = type;
        this.f24696b = hflVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
    }

    @Override // defpackage.la3
    public Type a() {
        return this.f24695a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    @Override // defpackage.la3
    public Object b(ka3<R> ka3Var) {
        o4h k43Var;
        hfl hflVar;
        o4h ma3Var = this.c ? new ma3(ka3Var) : new na3(ka3Var);
        if (!this.d) {
            if (this.e) {
                k43Var = new k43(ma3Var);
            }
            hflVar = this.f24696b;
            if (hflVar != null) {
                ma3Var = ma3Var.S(hflVar);
            }
            if (this.f) {
                return ma3Var.d0(BackpressureStrategy.LATEST);
            }
            if (this.g) {
                return ma3Var.L();
            }
            if (this.h) {
                return ma3Var.K();
            }
            return this.i ? ma3Var.x() : t5l.m(ma3Var);
        }
        k43Var = new zsk(ma3Var);
        ma3Var = k43Var;
        hflVar = this.f24696b;
        if (hflVar != null) {
            ma3Var = ma3Var.S(hflVar);
        }
        if (this.f) {
            return ma3Var.d0(BackpressureStrategy.LATEST);
        }
        if (this.g) {
            return ma3Var.L();
        }
        if (this.h) {
            return ma3Var.K();
        }
        if (this.i) {
        }
    }
}
