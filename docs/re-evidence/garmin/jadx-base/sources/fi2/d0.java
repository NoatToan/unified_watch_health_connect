package fi2;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfi2/d0;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d0 extends ei2.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi2.d f71786c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context) {
        super(context);
        context.getClass();
        this.f71786c = new hi2.d("SwitchViewTransform", hi2.e.SWITCH.f83902a);
    }

    @Override // ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        boolean zK4 = bVar.K4(map);
        boolean zBooleanValue = bVar.J4(map).booleanValue();
        if (zK4) {
            this.f71786c.getClass();
            return String.valueOf(zBooleanValue);
        }
        if (!zBooleanValue) {
            return BooleanUtils.FALSE;
        }
        n(bVar, map, Boolean.FALSE);
        return BooleanUtils.FALSE;
    }

    @Override // ei2.h
    public final void n(ii2.b bVar, Map<String, ? extends Object> map, Object obj) {
        String strD;
        String strD2;
        bVar.getClass();
        map.getClass();
        mh2.i iVar = mh2.i.ON_VALUE;
        if (map.containsKey(iVar.f118617a)) {
            strD = String.valueOf(map.get(iVar.f118617a));
        } else {
            mh2.i iVar2 = mh2.i.ON_VALUE_ID;
            strD = map.containsKey(iVar2.f118617a) ? d(bVar, String.valueOf(map.get(iVar2.f118617a))) : BooleanUtils.TRUE;
        }
        mh2.i iVar3 = mh2.i.OFF_VALUE;
        if (map.containsKey(iVar3.f118617a)) {
            strD2 = String.valueOf(map.get(iVar3.f118617a));
        } else {
            mh2.i iVar4 = mh2.i.OFF_VALUE_ID;
            strD2 = map.containsKey(iVar4.f118617a) ? d(bVar, String.valueOf(map.get(iVar4.f118617a))) : BooleanUtils.FALSE;
        }
        Unit unit = null;
        Boolean bool = (Boolean) (!(obj instanceof Boolean) ? null : obj);
        if (bool != null) {
            if (!bool.booleanValue()) {
                strD = strD2;
            }
            bVar.L4(strD, String.valueOf(map.get(mh2.i.VALUE_ID.f118617a)));
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            String strValueOf = String.valueOf(map.get(mh2.i.VALUE_ID.f118617a));
            if (obj == null) {
                obj = BooleanUtils.FALSE;
            }
            bVar.L4(obj, strValueOf);
        }
    }

    @Override // ei2.h
    public final void q(View view2, ii2.b bVar, Map<String, ? extends Object> map) {
        view2.getClass();
        bVar.getClass();
        if (!(view2 instanceof SwitchCompat)) {
            view2 = null;
        }
        SwitchCompat switchCompat = (SwitchCompat) view2;
        if (switchCompat != null) {
            switchCompat.setChecked(bVar.J4(map).booleanValue());
        } else {
            Logger logger = hi2.d.f83889c;
            this.f71786c.getClass();
        }
    }
}
