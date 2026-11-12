package defpackage;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes21.dex */
public class abz extends aca {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final ys f237c;

    protected abz(DeserializationContext deserializationContext, String str, ys ysVar) {
        super(deserializationContext.getParser(), str);
        this.f237c = ysVar;
    }

    public static abz a(DeserializationContext deserializationContext, ys ysVar, JavaType javaType) {
        abz abzVar = new abz(deserializationContext, String.format("Invalid `null` value encountered for property %s", ahw.c(ysVar, "<UNKNOWN>")), ysVar);
        if (javaType != null) {
            abzVar.setTargetType(javaType);
        }
        return abzVar;
    }
}
