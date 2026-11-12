package com.huawei.health.hwhealthtrackalgo;

import defpackage.fku;
import defpackage.fkw;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fkw f7136a;

    public abstract int a(fku fkuVar);

    private fkw a() {
        return this.f7136a;
    }

    public a(fkw fkwVar) {
        if (fkwVar == null) {
            throw new RuntimeException("algoMgr invalid params in constructor");
        }
        this.f7136a = fkwVar;
    }
}
