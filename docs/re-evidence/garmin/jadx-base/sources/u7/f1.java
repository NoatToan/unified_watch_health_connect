package u7;

import android.os.FileObserver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lu7/f1;", "Landroid/os/FileObserver;", "", "path", "<init>", "(Ljava/lang/String;)V", "a", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f1 extends FileObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f169129b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f169130c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f169131d = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<e23.l<String, Unit>> f169132a;

    private f1(String str) {
        super(str, 128);
        this.f169132a = new CopyOnWriteArrayList<>();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i14, String str) {
        Iterator<T> it = this.f169132a.iterator();
        while (it.hasNext()) {
            ((e23.l) it.next()).invoke(str);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu7/f1$a;", "", "<init>", "()V", "LOCK", "Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ f1(String str, p005kotlin.jvm.internal.j jVar) {
        this(str);
    }
}
