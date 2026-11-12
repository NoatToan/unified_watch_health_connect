package zy0;

import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes9.dex */
public interface b {
    static /* synthetic */ Object b(b bVar, e23.l lVar, TypeToken typeToken, boolean z14, String str, Long l14, v13.c cVar, int i14) {
        if ((i14 & 4) != 0) {
            z14 = true;
        }
        boolean z15 = z14;
        if ((i14 & 16) != 0) {
            l14 = null;
        }
        return bVar.c(lVar, typeToken, z15, str, l14, cVar);
    }

    Object a(e23.l lVar, TypeToken typeToken, String str, v13.c cVar);

    Object c(e23.l lVar, TypeToken typeToken, boolean z14, String str, Long l14, v13.c cVar);
}
