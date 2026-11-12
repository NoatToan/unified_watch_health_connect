package fe2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0019\b\u0004\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lfe2/d2;", "", "", "Lfe2/c2;", "errors", "<init>", "(Ljava/util/List;)V", "b", "a", "Lfe2/d2$a;", "Lfe2/d2$b;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c2> f70702a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfe2/d2$a;", "Lfe2/d2;", "", "Lfe2/c2;", "errors", "<init>", "(Ljava/util/List;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends d2 {
        public a(List<? extends c2> list) {
            super(list, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d2(List<? extends c2> list) {
        this.f70702a = list;
    }

    public /* synthetic */ d2(List list, p005kotlin.jvm.internal.j jVar) {
        this(list);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfe2/d2$b;", "Lfe2/d2;", "", "Lfe2/c2;", "errors", "<init>", "(Ljava/util/List;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends d2 {
        public /* synthetic */ b(List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : list);
        }

        public b(List<? extends c2> list) {
            super(list, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
