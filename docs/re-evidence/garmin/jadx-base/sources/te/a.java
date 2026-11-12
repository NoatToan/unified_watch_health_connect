package te;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lte/a;", "", "<init>", "()V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f163908a = new a();

    private a() {
    }

    public static final boolean a(String str, e23.a<Boolean> aVar) {
        try {
            return aVar.invoke().booleanValue();
        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
            return false;
        }
    }
}
