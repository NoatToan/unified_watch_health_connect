package p72;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp72/j;", "Landroidx/lifecycle/x1$c;", "", "set", "<init>", "(Ljava/lang/String;)V", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136336a;

    public j(String str) {
        str.getClass();
        this.f136336a = str;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (cls.isAssignableFrom(i.class)) {
            return new i(this.f136336a);
        }
        vb.h.s("Unknown ViewModel class");
        return null;
    }
}
