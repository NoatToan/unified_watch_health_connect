package fv2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import dv0.n;
import gw2.j;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfv2/g;", "Lev2/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g extends ev2.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cx2.h f73754c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        context.getClass();
        this.f73754c = new cx2.h("DatePickerTransform", null, 2, null);
    }

    @Override // zw2.f
    public final void h(dx2.c cVar, Map map, Object obj) {
        Integer[] numArr;
        cVar.getClass();
        map.getClass();
        Integer numP4 = dx2.c.P4(map);
        if (numP4 != null) {
            int iIntValue = numP4.intValue();
            try {
                if (!(obj instanceof Integer[])) {
                    obj = null;
                }
                numArr = (Integer[]) obj;
            } catch (ClassCastException unused) {
                numArr = null;
            }
            if (numArr != null) {
                if (numArr.length <= 2) {
                    this.f73754c.d(null, "postDataValueFromDisplay: Do not have a date format to post");
                    return;
                }
                cVar.c5(this.f207282a, j.DATE_PICKER, iIntValue, new b(numArr[0].intValue(), numArr[1].intValue(), numArr[2].intValue()), new n(2));
            }
        }
    }

    @Override // ev2.e
    public final String l(dx2.c cVar, Map<String, ? extends Object> map) {
        f fVarB4 = cVar.B4(map);
        return fVarB4 != null ? b(fVarB4.f73750a) : "";
    }
}
