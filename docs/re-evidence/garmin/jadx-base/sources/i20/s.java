package i20;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import f20.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li20/s;", "Landroidx/lifecycle/x1$c;", "Lf20/e0;", "phonePrefixProvider", "", "initialNumber", "Ll20/d;", "labelType", "<init>", "(Lf20/e0;Ljava/lang/String;Ll20/d;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f87198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l20.d f87200c;

    public /* synthetic */ s(e0 e0Var, String str, l20.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : e0Var, (i14 & 2) != 0 ? null : str, dVar);
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (!cls.isAssignableFrom(r.class)) {
            vb.h.s("Unknown ViewModel class");
            return null;
        }
        String str = this.f87199b;
        if (str == null) {
            str = "";
        }
        return new r(this.f87198a, str, this.f87200c);
    }

    public s(e0 e0Var, String str, l20.d dVar) {
        dVar.getClass();
        this.f87198a = e0Var;
        this.f87199b = str;
        this.f87200c = dVar;
    }
}
