package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class f04 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f04 f17248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?> f17249b;
    public ArrayList<ResolvedRecursiveType> c;

    public f04(Class<?> cls) {
        this(null, cls);
    }

    public void a(ResolvedRecursiveType resolvedRecursiveType) {
        if (this.c == null) {
            this.c = new ArrayList<>();
        }
        this.c.add(resolvedRecursiveType);
    }

    public f04 b(Class<?> cls) {
        return new f04(this, cls);
    }

    public f04 c(Class<?> cls) {
        if (this.f17249b == cls) {
            return this;
        }
        for (f04 f04Var = this.f17248a; f04Var != null; f04Var = f04Var.f17248a) {
            if (f04Var.f17249b == cls) {
                return f04Var;
            }
        }
        return null;
    }

    public void d(JavaType javaType) {
        ArrayList<ResolvedRecursiveType> arrayList = this.c;
        if (arrayList != null) {
            Iterator<ResolvedRecursiveType> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setReference(javaType);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ClassStack (self-refs: ");
        ArrayList<ResolvedRecursiveType> arrayList = this.c;
        sb.append(arrayList == null ? "0" : String.valueOf(arrayList.size()));
        sb.append(')');
        for (f04 f04Var = this; f04Var != null; f04Var = f04Var.f17248a) {
            sb.append(' ');
            sb.append(f04Var.f17249b.getName());
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public f04(f04 f04Var, Class<?> cls) {
        this.f17248a = f04Var;
        this.f17249b = cls;
    }
}
