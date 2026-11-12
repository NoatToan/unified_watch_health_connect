package ua1;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lua1/j;", "Landroidx/lifecycle/x1$c;", "", "courseId", "", "eventName", "<init>", "(JLjava/lang/String;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f169650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169651b;

    public j(long j8, String str) {
        this.f169650a = j8;
        this.f169651b = str;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (cls.isAssignableFrom(c.class)) {
            return new c(this.f169650a, this.f169651b);
        }
        vb.h.s("Unknown ViewModel class");
        return null;
    }
}
