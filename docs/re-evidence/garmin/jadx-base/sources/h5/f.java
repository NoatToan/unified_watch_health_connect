package h5;

import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh5/f;", "Lm4/y;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements m4.y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f81800b = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f81801c;

    private f() {
    }

    @Override // m4.y
    public final void b(boolean z14) {
        f81801c = Boolean.valueOf(z14);
    }

    @Override // m4.y
    /* JADX INFO: renamed from: e */
    public final boolean getF116546b() {
        Boolean bool = f81801c;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw e5.m("canFocus is read before it is written");
    }
}
