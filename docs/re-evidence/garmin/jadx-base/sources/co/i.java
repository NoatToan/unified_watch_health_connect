package co;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lco/i;", "", "Lco/l;", "validateFilterDataUseCase", "<init>", "(Lco/l;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28111a = new int[eo.e.values().length];
    }

    public i(l lVar) {
        lVar.getClass();
    }

    public static jo.a a(eo.e eVar, eo.e eVar2, jo.a aVar, jo.a aVar2) {
        int i14 = eVar == null ? -1 : a.f28111a[eVar.ordinal()];
        if (eVar == eVar2) {
            return aVar;
        }
        if (i14 == -1 || s.g(aVar2, jo.a.c.f99693b) || s.g(aVar2, jo.a.b.f99692b)) {
            return null;
        }
        return aVar2;
    }
}
