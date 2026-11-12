package me;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lme/e;", "Lme/d$b;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f117958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f117959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f117960c;

    public e(Method method, Object obj, Object obj2) {
        this.f117958a = method;
        this.f117959b = obj;
        this.f117960c = obj2;
    }

    @Override // me.d.b
    public final void dispose() throws IllegalAccessException, InvocationTargetException {
        this.f117958a.invoke(this.f117959b, this.f117960c);
    }
}
