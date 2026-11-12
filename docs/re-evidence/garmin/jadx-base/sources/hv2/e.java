package hv2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import cx2.h;
import dv0.n;
import gw2.j;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lhv2/e;", "Lev2/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends ev2.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f85908c;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        context.getClass();
        this.f85908c = new h("HeightPickerTransform", null, 2, null);
    }

    @Override // zw2.f
    public final void h(dx2.c cVar, Map map, Object obj) {
        d dVarH4;
        String str;
        cVar.getClass();
        map.getClass();
        Integer numP4 = dx2.c.P4(map);
        if (numP4 != null) {
            int iIntValue = numP4.intValue();
            Integer[] numArr = null;
            try {
                if (!(obj instanceof Integer[])) {
                    obj = null;
                }
                numArr = (Integer[]) obj;
            } catch (ClassCastException unused) {
            }
            if (numArr == null || (dVarH4 = cVar.H4(map)) == null || (str = dVarH4.f85907c) == null) {
                return;
            }
            boolean zEquals = str.equals("METRIC");
            Context context = this.f207282a;
            if (zEquals) {
                cVar.c5(context, j.HEIGHT_PICKER, iIntValue, new g(numArr[0].intValue(), str), new n(2));
            } else if (str.equals("STATUTE")) {
                cx2.b.a aVar = cx2.b.f56665a;
                int iIntValue2 = numArr[0].intValue();
                aVar.getClass();
                cVar.c5(context, j.HEIGHT_PICKER, iIntValue, new g(numArr[1].intValue() + (iIntValue2 * 12), str), new n(2));
            }
        }
    }

    @Override // ev2.e
    public final String l(dx2.c cVar, Map<String, ? extends Object> map) {
        d dVarH4 = cVar.H4(map);
        return dVarH4 != null ? b(dVarH4.f85905a) : "";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lhv2/e$a;", "", "<init>", "()V", "", "MINIMUM_HEIGHT_FEET", "I", "MAXIMUM_HEIGHT_FEET", "MINIMUM_HEIGHT_INCHES", "MAXIMUM_HEIGHT_INCHES", "MAXIMUM_HEIGHT_INCHES_FOR_MAXIMUM_FEET", "MINIMUM_HEIGHT_METRIC", "MAXIMUM_HEIGHT_METRIC", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
