package zk;

import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzk/c;", "", "<init>", "()V", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f205034a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CopyOnWriteArraySet<f> f205035b = new CopyOnWriteArraySet<>();

    private c() {
    }

    public final d a(List<String> list) {
        list.getClass();
        return new d(this, null, list);
    }
}
