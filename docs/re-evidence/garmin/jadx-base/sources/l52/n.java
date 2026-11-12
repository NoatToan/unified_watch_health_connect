package l52;

import android.os.Parcelable;
import java.util.UUID;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class n {
    /* JADX WARN: Multi-variable type inference failed */
    public static final f a(e.b bVar) {
        if (!(bVar instanceof f.a) && !(bVar instanceof f.b)) {
            lc.u0.r();
            return null;
        }
        return (f) bVar;
    }

    public static final f.a b(Parcelable parcelable) {
        parcelable.getClass();
        f.c cVar = new f.c();
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        return new f.a(parcelable, cVar, uuidRandomUUID);
    }

    public static final f.b c(Parcelable parcelable) {
        parcelable.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        return new f.b(parcelable, uuidRandomUUID);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final m d(e23.l lVar) {
        m mVar = new m();
        mVar.f110306a.j((e23.l<? super j<T>, Unit>) lVar);
        return mVar;
    }
}
