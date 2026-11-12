package x7;

import e23.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly7/g;", "prefs", "", "<anonymous>", "(Ly7/g;)Z"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
public final class i extends v13.i implements p<y7.g, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f189375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set<String> f189376b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Set<String> set, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f189376b = set;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f189376b, dVar);
        iVar.f189375a = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(y7.g gVar, t13.d<? super Boolean> dVar) {
        return ((i) create(gVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        Set<y7.g.a<?>> setKeySet = ((y7.g) this.f189375a).a().keySet();
        ArrayList arrayList = new ArrayList(y.r(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((y7.g.a) it.next()).f194635a);
        }
        LinkedHashSet linkedHashSet = j.f189377a;
        boolean z14 = true;
        Set<String> set = this.f189376b;
        if (set != linkedHashSet) {
            Set<String> set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z14 = false;
            } else {
                Iterator<T> it3 = set2.iterator();
                while (it3.hasNext()) {
                    if (!arrayList.contains((String) it3.next())) {
                    }
                }
                z14 = false;
            }
        }
        return Boolean.valueOf(z14);
    }
}
