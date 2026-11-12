package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class z4g extends zz3 {
    public final String c;
    public final String d;

    public z4g(JavaType javaType, TypeFactory typeFactory) {
        super(javaType, typeFactory);
        String name = javaType.getRawClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            this.c = "";
            this.d = ".";
        } else {
            this.d = name.substring(0, iLastIndexOf + 1);
            this.c = name.substring(0, iLastIndexOf);
        }
    }

    @Override // defpackage.zz3, defpackage.r4q
    public String a(Object obj) {
        String name = obj.getClass().getName();
        return name.startsWith(this.d) ? name.substring(this.d.length() - 1) : name;
    }

    @Override // defpackage.zz3
    public JavaType h(String str, pp5 pp5Var) throws IOException {
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder(str.length() + this.c.length());
            if (this.c.length() == 0) {
                sb.append(str.substring(1));
            } else {
                sb.append(this.c);
                sb.append(str);
            }
            str = sb.toString();
        }
        return super.h(str, pp5Var);
    }
}
