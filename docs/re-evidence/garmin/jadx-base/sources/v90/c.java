package v90;

import i53.f;
import j53.l;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv90/c;", "", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f176286a;

        static {
            int[] iArr = new int[jb0.b.values().length];
            try {
                iArr[jb0.b.f98104d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jb0.b.f98105e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f176286a = iArr;
        }
    }

    public static f a(jb0.b bVar) {
        int i14 = bVar == null ? -1 : a.f176286a[bVar.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                return l.b();
            }
            j22.b.f96736a.getClass();
            return j22.b.d() ? l.b() : i53.a.a(j22.a.f96722k);
        }
        j22.b bVar2 = j22.b.f96736a;
        j22.a aVar = j22.a.f96716e;
        bVar2.getClass();
        boolean zK = j22.b.k(aVar);
        boolean zD = j22.b.d();
        ArrayList arrayList = new ArrayList();
        if (!zK) {
            arrayList.add(aVar);
        }
        if (!zD) {
            arrayList.add(j22.a.f96722k);
        }
        return i53.a.j(arrayList);
    }
}
