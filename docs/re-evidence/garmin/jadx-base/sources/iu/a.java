package iu;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liu/a;", "", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f94990a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PriorityBlockingQueue<b> f94991b = new PriorityBlockingQueue<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap<String, b> f94992c = new ConcurrentHashMap<>();

    private a() {
    }

    public static void a(b bVar) {
        b bVarRemove;
        if (bVar == null) {
            return;
        }
        String str = bVar.f94996c;
        PriorityBlockingQueue<b> priorityBlockingQueue = f94991b;
        if (str != null && (bVarRemove = f94992c.remove(str)) != null) {
            priorityBlockingQueue.remove(bVarRemove);
        }
        priorityBlockingQueue.remove(bVar);
    }
}
