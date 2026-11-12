package jn2;

import java.util.HashMap;
import java.util.List;
import jk0.w;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljn2/c;", "", "Ljn2/d;", "delegate", "<init>", "(Ljn2/d;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f99616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f99617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<Long, List<ql2.a>> f99618c;

    public c(d dVar) {
        dVar.getClass();
        this.f99616a = dVar;
        this.f99617b = o13.m.b(new w(6));
        this.f99618c = new HashMap<>(1);
    }

    public final Logger a() {
        return (Logger) this.f99617b.getValue();
    }
}
