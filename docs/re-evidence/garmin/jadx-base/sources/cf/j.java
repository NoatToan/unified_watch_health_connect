package cf;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface j {
    List<String> a();

    default i b(m mVar) {
        return c(mVar.f26930b, mVar.f26929a);
    }

    i c(int i14, String str);

    void d(i iVar);

    void e(String str);
}
