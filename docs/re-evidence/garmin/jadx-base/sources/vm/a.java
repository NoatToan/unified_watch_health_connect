package vm;

import am.v1;
import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.BarDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lvm/a;", "Lqz/c;", "Lwm/a;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements qz.c<wm.a, BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f178723a;

    static {
        new C3339a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f178723a = context;
    }

    @Override // qz.c
    public final List<BarDataSet> a(wm.a aVar) {
        wm.a aVar2 = aVar;
        return aVar2 != null ? aVar2.A(this.f178723a) : j0.f134944a;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(wm.a aVar) {
        ArrayList arrayList;
        wm.a aVar2 = aVar;
        if (aVar2 == null || (arrayList = aVar2.X0) == null) {
            return null;
        }
        return Integer.valueOf(arrayList.size());
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(wm.a aVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(wm.a aVar) {
        return -0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(wm.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(wm.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float i(wm.a aVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(wm.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(wm.a aVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final List o(wm.a aVar) {
        ArrayList arrayList;
        wm.a aVar2 = aVar;
        if (aVar2 == null || (arrayList = aVar2.X0) == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String strD = v1.d(aVar2.Y, (String) it.next());
            if (strD == null) {
                strD = this.f178723a.getString(R.string.no_value);
                strD.getClass();
            }
            arrayList2.add(strD);
        }
        return arrayList2;
    }

    @Override // qz.c
    public final Integer p(wm.a aVar) {
        wm.a aVar2 = aVar;
        if (aVar2 != null) {
            return Integer.valueOf(aVar2.C().size() + 1);
        }
        return null;
    }

    @Override // qz.c
    public final float q(wm.a aVar) {
        ArrayList arrayList;
        wm.a aVar2 = aVar;
        if (aVar2 == null || (arrayList = aVar2.X0) == null) {
            return 0.0f;
        }
        return arrayList.size() - 0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(wm.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(wm.a aVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List u(wm.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(wm.a aVar) {
        return null;
    }

    @Override // qz.c
    public final float w(wm.a aVar) {
        wm.a aVar2 = aVar;
        if (aVar2 != null) {
            return aVar2.C().size();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: vm.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvm/a$a;", "", "<init>", "()V", "", "X_AXIS_OFFSET", "F", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3339a {
        public /* synthetic */ C3339a(j jVar) {
            this();
        }

        private C3339a() {
        }
    }
}
