package fe2;

import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0019\b\u0004\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lfe2/u1;", "", "", "Lfe2/t1;", "errors", "<init>", "(Ljava/util/List;)V", "a", "b", "Lfe2/u1$a;", "Lfe2/u1$b;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<t1> f70952a;

    private u1(List<t1> list) {
        this.f70952a = list;
    }

    public /* synthetic */ u1(List list, p005kotlin.jvm.internal.j jVar) {
        this(list);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfe2/u1$b;", "Lfe2/u1;", "", "Lfe2/t1;", "errors", "<init>", "(Ljava/util/List;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends u1 {
        public /* synthetic */ b(List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : list);
        }

        public b(List<t1> list) {
            super(list, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfe2/u1$a;", "Lfe2/u1;", "Lorg/joda/time/DateTime;", "startTime", "endTime", "", "Lfe2/v1;", "sessions", "Lfe2/t1;", "errors", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends u1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DateTime f70953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DateTime f70954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<v1> f70955d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DateTime dateTime, DateTime dateTime2, List<v1> list, List<t1> list2) {
            super(list2, null);
            list.getClass();
            this.f70953b = dateTime;
            this.f70954c = dateTime2;
            this.f70955d = list;
        }

        public /* synthetic */ a(DateTime dateTime, DateTime dateTime2, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(dateTime, dateTime2, list, (i14 & 8) != 0 ? null : list2);
        }
    }
}
