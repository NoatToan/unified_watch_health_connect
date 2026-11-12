package jc2;

import java.io.File;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Ljc2/g;", "", "", "lastModified", "Ljava/io/File;", "file", "Ljc2/d;", "sortPriority", "<init>", "(JLjava/io/File;Ljc2/d;)V", "(Ljava/io/File;Ljc2/d;)V", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g implements Comparable<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f98182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f98183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f98184c;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98185a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.LAST_MODIFIED_NEWEST_TO_OLDEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.LAST_MODIFIED_OLDEST_TO_NEWEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f98185a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(File file, d dVar) {
        this(file.lastModified(), file, dVar);
        file.getClass();
        dVar.getClass();
    }

    @Override // java.lang.Comparable
    public final int compareTo(g gVar) {
        g gVar2 = gVar;
        gVar2.getClass();
        long j8 = gVar2.f98182a;
        long j14 = this.f98182a;
        if (j14 == j8) {
            return 0;
        }
        int i14 = a.f98185a[this.f98184c.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                u0.r();
                return 0;
            }
            if (j14 > j8) {
                return -1;
            }
        } else if (j14 < j8) {
            return -1;
        }
        return 1;
    }

    private g(long j8, File file, d dVar) {
        this.f98182a = j8;
        this.f98183b = file;
        this.f98184c = dVar;
    }
}
