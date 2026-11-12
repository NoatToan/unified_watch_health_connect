package m63;

import java.lang.Enum;
import java.util.Arrays;
import kotlinx.serialization.SerializationException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tB'\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lm63/b0;", "", "T", "Li63/c;", "", "serialName", "", "values", "<init>", "(Ljava/lang/String;[Ljava/lang/Enum;)V", "Lk63/e;", "descriptor", "(Ljava/lang/String;[Ljava/lang/Enum;Lk63/e;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0<T extends Enum<T>> implements i63.c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T[] f116918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k63.e f116919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f116920c;

    public b0(String str, T[] tArr) {
        str.getClass();
        tArr.getClass();
        this.f116918a = tArr;
        this.f116920c = o13.m.b(new l30.i0(20, this, str));
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        int iZ = eVar.z(getF158591b());
        T[] tArr = this.f116918a;
        if (iZ >= 0 && iZ < tArr.length) {
            return tArr[iZ];
        }
        throw new SerializationException(iZ + " is not among valid " + getF158591b().getF103257a() + " enum values, values size is " + tArr.length);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return (k63.e) this.f116920c.getValue();
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        Enum r14 = (Enum) obj;
        r14.getClass();
        T[] tArr = this.f116918a;
        int iM = p13.u.M(tArr, r14);
        if (iM != -1) {
            fVar.m(getF158591b(), iM);
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(r14);
        String f116983a = getF158591b().getF103257a();
        String string = Arrays.toString(tArr);
        string.getClass();
        sb3.append(" is not a valid enum ");
        sb3.append(f116983a);
        sb3.append(", must be one of ");
        sb3.append(string);
        throw new SerializationException(sb3.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getF158591b().getF103257a() + '>';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(String str, T[] tArr, k63.e eVar) {
        this(str, tArr);
        str.getClass();
        tArr.getClass();
        eVar.getClass();
        this.f116919b = eVar;
    }
}
