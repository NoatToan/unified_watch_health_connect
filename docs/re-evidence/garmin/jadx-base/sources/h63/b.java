package h63;

import kotlinx.serialization.SerializationException;
import m63.q1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh63/b;", "Li63/c;", "Lb63/d;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements i63.c<b63.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f82284a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f82285b = k63.k.a("kotlinx.datetime.DatePeriod/ISO", k63.d.i.f103232a);

    private b() {
    }

    @Override // i63.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b63.d deserialize(l63.e eVar) {
        eVar.getClass();
        b63.f.Companion companion = b63.f.INSTANCE;
        String strS = eVar.s();
        companion.getClass();
        b63.f fVarA = b63.f.Companion.a(strS);
        if (fVarA instanceof b63.d) {
            return (b63.d) fVarA;
        }
        throw new SerializationException(fVarA + " is not a date-based period");
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF94809a() {
        return f82285b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        b63.d dVar = (b63.d) obj;
        dVar.getClass();
        fVar.p(dVar.toString());
    }
}
