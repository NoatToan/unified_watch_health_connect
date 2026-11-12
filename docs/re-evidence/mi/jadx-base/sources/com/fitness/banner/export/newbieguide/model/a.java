package com.fitness.banner.export.newbieguide.model;

import android.graphics.RectF;
import android.view.animation.Animation;
import defpackage.mhk;
import defpackage.z8h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<HighLight> f7748a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7749b = true;
    public int c;
    public int d;
    public int[] e;
    public Animation f;
    public Animation g;

    public static a k() {
        return new a();
    }

    public a a(RectF rectF, HighLight.Shape shape, int i, mhk mhkVar) {
        c cVar = new c(rectF, shape, i);
        if (mhkVar != null) {
            mhkVar.f26189a = cVar;
            cVar.e(new b.a().b(mhkVar).a());
        }
        this.f7748a.add(cVar);
        return this;
    }

    public int b() {
        return this.c;
    }

    public int[] c() {
        return this.e;
    }

    public Animation d() {
        return this.f;
    }

    public Animation e() {
        return this.g;
    }

    public List<HighLight> f() {
        return this.f7748a;
    }

    public int g() {
        return this.d;
    }

    public z8h h() {
        return null;
    }

    public List<mhk> i() {
        mhk mhkVar;
        ArrayList arrayList = new ArrayList();
        Iterator<HighLight> it = this.f7748a.iterator();
        while (it.hasNext()) {
            b bVarI = it.next().i();
            if (bVarI != null && (mhkVar = bVarI.f7751b) != null) {
                arrayList.add(mhkVar);
            }
        }
        return arrayList;
    }

    public boolean j() {
        return this.f7749b;
    }

    public a l(boolean z) {
        this.f7749b = z;
        return this;
    }
}
