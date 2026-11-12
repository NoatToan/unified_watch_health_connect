package bi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lbi2/m;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lei2/h;", "transform", "Lii2/b;", "settingsViewModel", "", "", "viewAttrs", "<init>", "(Landroid/content/Context;Lei2/h;Lii2/b;Ljava/util/Map;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ei2.h f18209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ii2.b f18210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, ? extends Object> f18211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hi2.d f18212e;

    public m(Context context, ei2.h hVar, ii2.b bVar, Map<String, ? extends Object> map) {
        context.getClass();
        hVar.getClass();
        bVar.getClass();
        map.getClass();
        this.f18208a = context;
        this.f18209b = hVar;
        this.f18210c = bVar;
        this.f18211d = map;
        this.f18212e = new hi2.d("CriticalSwimSpeedPicker", hi2.e.CSS.f83902a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object a(m mVar, v13.c cVar) {
        h hVar;
        String str;
        Map<String, ? extends Object> map = mVar.f18211d;
        ii2.b bVar = mVar.f18210c;
        ei2.h hVar2 = mVar.f18209b;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f18165d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f18165d = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(mVar, cVar);
            }
        } else {
            hVar = new h(mVar, cVar);
        }
        Object obj = hVar.f18163b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f18165d;
        if (i15 == 0) {
            o13.r.b(obj);
            String strK = hVar2.k(bVar, map);
            hVar.f18162a = strK;
            hVar.f18165d = 1;
            HashMap mapI = hVar2.i(bVar, map, 4);
            if (mapI == aVar) {
                return aVar;
            }
            str = strK;
            obj = mapI;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = hVar.f18162a;
            o13.r.b(obj);
        }
        HashMap map2 = (HashMap) obj;
        if (map2 != null) {
            mh2.i iVar = mh2.i.DS_POPUP_TITLE_VALUE;
            if (map2.containsKey(iVar.f118617a)) {
                Object obj2 = map2.get(iVar.f118617a);
                String str2 = obj2 instanceof String ? (String) obj2 : null;
                if (str2 != null) {
                    return str2;
                }
            }
        }
        return str;
    }
}
