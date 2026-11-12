package i62;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li62/f;", "Landroidx/lifecycle/x1$c;", "", "locale", "category", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91847c;

    public f(String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f91845a = str;
        this.f91846b = str2;
        this.f91847c = str3;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (!cls.isAssignableFrom(e.class)) {
            vb.h.s("Unknown ViewModel class");
            return null;
        }
        return new e(this.f91845a, this.f91846b, this.f91847c);
    }
}
