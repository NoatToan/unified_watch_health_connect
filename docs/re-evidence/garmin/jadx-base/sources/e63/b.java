package e63;

/* JADX INFO: loaded from: classes3.dex */
public interface b<Object, Field> extends g63.a<Object, Field> {
    Field a(Object object);

    default Field b(Object object) {
        Field fieldA = a(object);
        if (fieldA != null) {
            return fieldA;
        }
        wr.g.x("Field ", getF63275b(), " is not set");
        return null;
    }
}
