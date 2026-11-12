package com.unicom.online.account.kernel;

/* JADX INFO: loaded from: classes20.dex */
public final class w extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31213b;

    public w(q qVar, Exception exc) {
        super(qVar.A);
        this.f31212a = Integer.parseInt(qVar.z);
        this.f31213b = qVar.A + " case by : " + exc.getMessage();
    }

    public w(q qVar) {
        super(qVar.A);
        this.f31212a = Integer.parseInt(qVar.z);
        this.f31213b = qVar.A;
    }
}
