package me;

import com.nimbusds.jose.HeaderParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B'\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lme/j;", "", "T", "Lme/i;", "value", "", HeaderParameterNames.AUTHENTICATION_TAG, "Lme/k;", "verificationMode", "Lme/h;", "logger", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Lme/k;Lme/h;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j<T> extends i<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f117970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f117972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f117973e;

    public j(T t7, String str, k kVar, h hVar) {
        t7.getClass();
        str.getClass();
        kVar.getClass();
        hVar.getClass();
        this.f117970b = t7;
        this.f117971c = str;
        this.f117972d = kVar;
        this.f117973e = hVar;
    }

    @Override // me.i
    public final T a() {
        return this.f117970b;
    }

    @Override // me.i
    public final i b(e23.l lVar, String str) {
        if (((Boolean) lVar.invoke(this.f117970b)).booleanValue()) {
            return this;
        }
        return new g(this.f117970b, this.f117971c, str, this.f117973e, this.f117972d);
    }
}
