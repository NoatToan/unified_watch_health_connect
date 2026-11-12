package w43;

/* JADX INFO: loaded from: classes3.dex */
public interface f {

    public static final class a {
        public static String a(f fVar, j33.e eVar) {
            if (fVar.a(eVar)) {
                return null;
            }
            return fVar.getDescription();
        }
    }

    boolean a(j33.e eVar);

    String b(j33.e eVar);

    String getDescription();
}
