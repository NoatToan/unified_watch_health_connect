package h4;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface s extends t13.g.a {
    public static final a U = a.f81577a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh4/s$a;", "Lt13/g$b;", "Lh4/s;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements t13.g.b<s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f81577a = new a();

        private a() {
        }
    }

    @Override // t13.g.a
    default t13.g.b<?> getKey() {
        return U;
    }

    float z();
}
