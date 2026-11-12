package kotlin.time;

import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcp;
import defpackage.zfm;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0000H¦\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u0011H¦\u0002J\b\u0010\u0012\u001a\u00020\u000eH&¨\u0006\u0013"}, d2 = {"Lkotlin/time/ComparableTimeMark;", "Lkotlin/time/TimeMark;", "", "plus", "duration", "Lkotlin/time/Duration;", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "minus", "minus-LRDsOJo", "other", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "compareTo", "", "equals", "", "", WatchFaceConstant.HASHCODE, "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ComparableTimeMark extends TimeMark, Comparable<ComparableTimeMark> {
    int compareTo(ComparableTimeMark other);

    boolean equals(Object other);

    int hashCode();

    @Override // kotlin.time.TimeMark
    /* JADX INFO: renamed from: minus-LRDsOJo */
    ComparableTimeMark mo1953minusLRDsOJo(long duration);

    /* JADX INFO: renamed from: minus-UwyO8pc */
    long mo1954minusUwyO8pc(ComparableTimeMark other);

    @Override // kotlin.time.TimeMark
    /* JADX INFO: renamed from: plus-LRDsOJo */
    ComparableTimeMark mo1955plusLRDsOJo(long duration);

    /* JADX INFO: loaded from: classes46.dex */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e {
        public static boolean a(ComparableTimeMark comparableTimeMark) {
            return TimeMark.b.c(comparableTimeMark);
        }

        public static boolean e(ComparableTimeMark comparableTimeMark) {
            return TimeMark.b.e(comparableTimeMark);
        }

        public static ComparableTimeMark c(ComparableTimeMark comparableTimeMark, long j) {
            return comparableTimeMark.mo1955plusLRDsOJo(zfm.s(j));
        }

        public static int d(ComparableTimeMark comparableTimeMark, ComparableTimeMark comparableTimeMark2) {
            zcp.c(comparableTimeMark2, "");
            return zfm.c(comparableTimeMark.mo1954minusUwyO8pc(comparableTimeMark2), zfm.d.c());
        }
    }
}
