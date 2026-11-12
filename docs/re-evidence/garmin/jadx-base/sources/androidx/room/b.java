package androidx.room;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10722a;

    public b(String str) {
        this.f10722a = str;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Throwable th3 = (Throwable) obj;
        th3.getClass();
        throw new IllegalStateException(am.j.o(this.f10722a, "'. Was a proper path / name used in Room's database builder?", new StringBuilder("Unable to open database '")), th3);
    }
}
