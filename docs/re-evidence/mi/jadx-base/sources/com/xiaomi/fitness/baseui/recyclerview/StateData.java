package com.xiaomi.fitness.baseui.recyclerview;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class StateData<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f11668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Status f11669b;
    public int c;

    public enum Status {
        IDLE,
        LOADING,
        SUCCESS,
        EMPTY,
        ERROR,
        NO_NET
    }

    public StateData() {
        p(Status.IDLE, null);
    }

    public StateData<T> a() {
        return p(Status.EMPTY, null);
    }

    public StateData<T> b(T t) {
        return p(Status.EMPTY, t);
    }

    public StateData<T> c() {
        return d(-11);
    }

    public StateData<T> d(int i) {
        return q(Status.ERROR, null, i);
    }

    public StateData<T> e(T t) {
        return q(Status.ERROR, t, -11);
    }

    public StateData<T> f(Throwable th) {
        return n();
    }

    public boolean g() {
        return this.f11669b == Status.EMPTY;
    }

    public boolean h() {
        return this.f11669b == Status.ERROR;
    }

    public boolean i() {
        return this.f11669b == Status.LOADING;
    }

    public boolean j() {
        return this.f11669b == Status.NO_NET;
    }

    public boolean k() {
        return this.f11669b == Status.SUCCESS;
    }

    public StateData<T> l() {
        return q(Status.LOADING, null, -11);
    }

    public StateData<T> m(T t) {
        return q(Status.LOADING, t, -11);
    }

    public StateData<T> n() {
        return p(Status.NO_NET, null);
    }

    public StateData<T> o(T t) {
        return p(Status.NO_NET, t);
    }

    public final StateData<T> p(Status status, T t) {
        return q(status, t, -11);
    }

    public final StateData<T> q(Status status, T t, int i) {
        this.f11668a = t;
        this.f11669b = status;
        this.c = i;
        return this;
    }

    public StateData<T> r(T t) {
        return p(Status.SUCCESS, t);
    }

    public String toString() {
        return "StateData{status=" + this.f11669b + AbstractJsonLexerKt.END_OBJ;
    }
}
