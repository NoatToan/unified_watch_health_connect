package rc;

import android.os.Bundle;
import com.garmin.android.gncs.NotificationConstants;
import java.lang.Enum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.q0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.w;
import p13.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrc/b;", "", "D", "Llc/g;", "", "Ljava/lang/Class;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b<D extends Enum<?>> extends lc.g<List<? extends D>> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q0.c<D> f151798s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Class<D> cls) {
        super(true);
        cls.getClass();
        this.f151798s = new q0.c<>(cls);
    }

    @Override // lc.q0
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    @Override // lc.q0
    public final String b() {
        return "List<" + this.f151798s.f111855t.getName() + "}>";
    }

    @Override // lc.q0
    public final Object c(Object obj, String str) {
        List list = (List) obj;
        q0.c<D> cVar = this.f151798s;
        return list != null ? h0.C0(list, w.c(cVar.d(str))) : w.c(cVar.d(str));
    }

    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final Object h(String str) {
        str.getClass();
        return w.c(this.f151798s.d(str));
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        bundle.putSerializable(str, list != null ? new ArrayList(list) : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return s.g(this.f151798s, ((b) obj).f151798s);
    }

    @Override // lc.q0
    public final boolean g(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return s.g(list != null ? new ArrayList(list) : null, list2 != null ? new ArrayList(list2) : null);
    }

    @Override // lc.g
    public final Object h() {
        return j0.f134944a;
    }

    public final int hashCode() {
        return this.f151798s.f111859s.hashCode();
    }

    @Override // lc.g
    public final List i(Object obj) {
        List list = (List) obj;
        if (list == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).toString());
        }
        return arrayList;
    }
}
