package f;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lf/f;", "Lf/c;", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends c<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f67603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f67604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g.a<Object, Object> f67605c;

    public f(e eVar, String str, g.a<Object, Object> aVar) {
        this.f67603a = eVar;
        this.f67604b = str;
        this.f67605c = aVar;
    }

    @Override // f.c
    public final void a(Object obj, z6.b bVar) throws Exception {
        e eVar = this.f67603a;
        LinkedHashMap linkedHashMap = eVar.f67593b;
        ArrayList arrayList = eVar.f67595d;
        String str = this.f67604b;
        Object obj2 = linkedHashMap.get(str);
        g.a<Object, Object> aVar = this.f67605c;
        if (obj2 == null) {
            l2.l(aVar, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().", "Attempting to launch an unregistered ActivityResultLauncher with contract ");
            return;
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            eVar.b(iIntValue, aVar, obj, bVar);
        } catch (Exception e4) {
            arrayList.remove(str);
            throw e4;
        }
    }
}
