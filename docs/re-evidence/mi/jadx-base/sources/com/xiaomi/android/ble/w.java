package com.xiaomi.android.ble;

import defpackage.b89;
import defpackage.dpo;
import defpackage.fhd;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes7.dex */
public class w extends x {
    public final Queue<v> m;

    public w() {
        super(v.a.SET);
        this.m = new LinkedList();
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public w d(dpo dpoVar) {
        super.d(dpoVar);
        return this;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public w f(b89 b89Var) {
        super.f(b89Var);
        return this;
    }

    public v v() {
        try {
            return this.m.remove();
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean w() {
        return !this.m.isEmpty();
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public w g(fhd fhdVar) {
        super.g(fhdVar);
        return this;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public w s(d dVar) {
        super.s(dVar);
        return this;
    }
}
