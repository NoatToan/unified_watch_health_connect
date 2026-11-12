package gv2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import dv0.n;
import gw2.j;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lgv2/e;", "Lev2/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class e extends ev2.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cx2.h f79462c;

    static {
        new a(null);
        f79462c = new cx2.h("FloatPickerTransform", null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        context.getClass();
    }

    @Override // zw2.f
    public final void h(dx2.c cVar, Map map, Object obj) {
        cVar.getClass();
        map.getClass();
        Integer numP4 = dx2.c.P4(map);
        cx2.h hVar = f79462c;
        if (numP4 == null) {
            map.toString();
            hVar.getClass();
            return;
        }
        hVar.getClass();
        cVar.c5(this.f207282a, j.FLOAT_PICKER, numP4.intValue(), Float.valueOf(Float.parseFloat(String.valueOf(obj))), new n(2));
    }

    @Override // ev2.e
    public final String l(dx2.c cVar, Map<String, ? extends Object> map) {
        f79462c.getClass();
        d dVarG4 = cVar.G4(map);
        tv2.c cVar2 = dVarG4 != null ? dVarG4.f79455b : null;
        if (cVar2 == null) {
            return "";
        }
        cVar2.toString();
        String strB = b(cVar2);
        return strB.length() > 0 ? strB : "";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgv2/e$a;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
