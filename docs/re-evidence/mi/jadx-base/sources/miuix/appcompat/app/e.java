package miuix.appcompat.app;

import android.graphics.Rect;
import defpackage.qrc;
import defpackage.rrc;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qrc f26329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rrc f26330b;

    public int a(d.e eVar, d.b bVar) {
        rrc rrcVar = this.f26330b;
        if (rrcVar == null) {
            return -1;
        }
        return rrcVar.a(eVar, bVar);
    }

    public int b(d.b bVar, int i) {
        rrc rrcVar = this.f26330b;
        return rrcVar == null ? bVar.f : rrcVar.c(bVar, i);
    }

    public boolean c(d.a aVar) {
        qrc qrcVar = this.f26329a;
        if (qrcVar == null) {
            return false;
        }
        return qrcVar.a(aVar);
    }

    public boolean d(d.c cVar) {
        rrc rrcVar = this.f26330b;
        if (rrcVar == null) {
            return false;
        }
        return rrcVar.b(cVar);
    }

    public e e(qrc qrcVar) {
        this.f26329a = qrcVar;
        return this;
    }

    public e f(rrc rrcVar) {
        this.f26330b = rrcVar;
        return this;
    }

    public boolean g(int i) {
        rrc rrcVar = this.f26330b;
        if (rrcVar == null) {
            return true;
        }
        return rrcVar.d(i);
    }

    public int h(d.C1022d c1022d, d.b bVar, Rect rect) {
        rrc rrcVar = this.f26330b;
        if (rrcVar == null) {
            return -1;
        }
        return rrcVar.e(c1022d, bVar, rect);
    }
}
