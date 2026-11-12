package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f5q extends e5q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r4q f17442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BeanProperty f17443b;

    public f5q(r4q r4qVar, BeanProperty beanProperty) {
        this.f17442a = r4qVar;
        this.f17443b = beanProperty;
    }

    @Override // defpackage.e5q
    public String b() {
        return null;
    }

    @Override // defpackage.e5q
    public WritableTypeId g(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
        i(writableTypeId);
        return jsonGenerator.U0(writableTypeId);
    }

    @Override // defpackage.e5q
    public WritableTypeId h(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
        return jsonGenerator.V0(writableTypeId);
    }

    public void i(WritableTypeId writableTypeId) {
        if (writableTypeId.c == null) {
            Object obj = writableTypeId.f7625a;
            Class<?> cls = writableTypeId.f7626b;
            writableTypeId.c = cls == null ? k(obj) : l(obj, cls);
        }
    }

    public void j(Object obj) {
    }

    public String k(Object obj) {
        String strA = this.f17442a.a(obj);
        if (strA == null) {
            j(obj);
        }
        return strA;
    }

    public String l(Object obj, Class<?> cls) {
        String strE = this.f17442a.e(obj, cls);
        if (strE == null) {
            j(obj);
        }
        return strE;
    }
}
