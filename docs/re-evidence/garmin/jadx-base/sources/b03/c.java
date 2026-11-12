package b03;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public interface c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb03/c$a;", "", "<init>", "()V", "runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f14179e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f14175a = Thread.currentThread().getId();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f14176b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f14177c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final LinkedHashMap f14178d = new LinkedHashMap();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f14180f = true;

        public abstract void a(boolean z14);

        public final void b() {
            if (this.f14175a == Thread.currentThread().getId()) {
                a(this.f14179e && this.f14180f);
            } else {
                h.z("Transaction objects (`TransactionWithReturn` and `TransactionWithoutReturn`) must be used\nonly within the transaction lambda scope.");
            }
        }
    }

    Object f(gi.b bVar);
}
