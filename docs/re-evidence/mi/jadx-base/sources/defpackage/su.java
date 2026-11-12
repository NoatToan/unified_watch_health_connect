package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¨\u0006\u0003"}, d2 = {"Ljava/util/Locale;", "", PluginDeviceInfo.FMODEL, "hmutil_release"}, k = 2, mv = {1, 5, 1})
public final class su {
    public static final boolean a(@Nullable Locale locale) {
        if (locale == null) {
            return false;
        }
        ug ugVarA = vg.f36859a.a();
        return ugVarA.a(locale, xj.EN) || ugVarA.a(locale, xj.NL) || ugVarA.a(locale, xj.FR) || ugVarA.a(locale, xj.DE) || ugVarA.a(locale, xj.IT) || ugVarA.a(locale, xj.PT) || ugVarA.a(locale, xj.ES);
    }
}
