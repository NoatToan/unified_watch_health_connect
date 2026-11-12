package ut0;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lut0/a;", "Lf82/c;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements f82.c {
    static {
        new C3224a(null);
    }

    @Override // f82.c
    public final ArrayList a(ArrayList arrayList, ArrayList arrayList2, int i14) {
        ArrayList arrayList3 = new ArrayList(arrayList2);
        if (i14 == 0) {
            if (!arrayList2.contains(Integer.valueOf(i14))) {
                arrayList3.clear();
                arrayList3.add(0);
                return arrayList3;
            }
        } else {
            if (!arrayList2.contains(Integer.valueOf(i14))) {
                arrayList3.remove((Object) 0);
                arrayList3.add(Integer.valueOf(i14));
                return arrayList3;
            }
            arrayList3.remove(Integer.valueOf(i14));
            if (arrayList3.isEmpty()) {
                arrayList3.add(0);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: ut0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lut0/a$a;", "", "<init>", "()V", "", "ALL_CHALLENGES_CHIP_INDEX", "I", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3224a {
        public /* synthetic */ C3224a(j jVar) {
            this();
        }

        private C3224a() {
        }
    }
}
