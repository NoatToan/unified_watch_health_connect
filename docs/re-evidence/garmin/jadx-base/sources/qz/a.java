package qz;

import com.github.mikephil.charting.renderer.DataRenderer;

/* JADX INFO: loaded from: classes7.dex */
public interface a<T, S extends DataRenderer> {
    static /* synthetic */ void b(a aVar, Object obj, String str, int i14) {
        if ((i14 & 2) != 0) {
            str = null;
        }
        aVar.a(obj, str);
    }

    void a(Object obj, String str);
}
