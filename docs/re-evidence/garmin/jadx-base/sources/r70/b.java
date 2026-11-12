package r70;

import java.util.Comparator;
import org.joda.time.ReadableInstant;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lr70/b;", "Ljava/util/Comparator;", "Lr70/a;", "Lkotlin/Comparator;", "Lo70/f;", "sectionType", "<init>", "(Lo70/f;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements Comparator<r70.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o70.f f151040a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f151041a;

        static {
            int[] iArr = new int[o70.b.values().length];
            try {
                iArr[o70.b.WORKOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o70.b.EVENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f151041a = iArr;
        }
    }

    public b(o70.f fVar) {
        fVar.getClass();
        this.f151040a = fVar;
    }

    @Override // java.util.Comparator
    public final int compare(r70.a aVar, r70.a aVar2) {
        r70.a aVar3 = aVar;
        r70.a aVar4 = aVar2;
        aVar3.getClass();
        aVar4.getClass();
        if (aVar3.d() != aVar4.d()) {
            return p005kotlin.jvm.internal.s.h(aVar3.d(), aVar4.d());
        }
        int i14 = a.f151041a[aVar3.getF112158c().ordinal()];
        if (i14 != 1) {
            if (i14 != 2 && this.f151040a == o70.f.ACTIVITIES_AND_WORKOUTS) {
                return aVar4.getF112159d().compareTo((ReadableInstant) aVar3.getF112159d());
            }
            return aVar3.getF112159d().compareTo((ReadableInstant) aVar4.getF112159d());
        }
        String f112160e = aVar3.getF112160e();
        String f112160e2 = aVar4.getF112160e();
        Integer numValueOf = (f112160e == null || f112160e2 == null) ? null : Integer.valueOf(f112160e.compareTo(f112160e2));
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
