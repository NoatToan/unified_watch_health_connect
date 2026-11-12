package l23;

import e23.l;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
public class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k23.d f109165a;

    public d(k23.d dVar) {
        this.f109165a = dVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(s.g((k23.d) obj, this.f109165a));
    }
}
