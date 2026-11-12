package p62;

import android.widget.NumberPicker;
import com.google.android.material.timepicker.TimeModel;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import r22.r1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements NumberPicker.Formatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f136228b;

    public /* synthetic */ h(Object obj, int i14) {
        this.f136227a = i14;
        this.f136228b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.NumberPicker.Formatter
    public final String format(int i14) {
        switch (this.f136227a) {
            case 0:
                return m52.j.values()[i14].b(((i) this.f136228b).f136225a).concat(StringUtils.SPACE);
            case 1:
                m mVar = (m) this.f136228b;
                int i15 = i14 - 1;
                x52.a.f189039c.getClass();
                for (x52.a aVar : x52.a.values()) {
                    if (aVar.ordinal() == i15) {
                        if (aVar != null) {
                            return mVar.f136215a.getString(aVar.f189044b);
                        }
                        return null;
                    }
                }
                aVar = null;
                if (aVar != null) {
                    return mVar.f136215a.getString(aVar.f189044b);
                }
                return null;
            case 2:
                return ((e0) this.f136228b).u(i14);
            default:
                return ((r1) this.f136228b).f149838l ? String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i14)) : String.valueOf(i14);
        }
    }
}
