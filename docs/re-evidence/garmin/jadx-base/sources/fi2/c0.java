package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lfi2/c0;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "b", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c0 extends ei2.h {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfi2/c0$a;", "", "", Action.KEY_ATTRIBUTE, "", "stringResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        GESTURE("GESTURE", R.string.lbl_on),
        /* JADX INFO: Fake field, exist only in values array */
        PRESS_START("ACTION", R.string.lbl_on),
        /* JADX INFO: Fake field, exist only in values array */
        OFF("OFF", R.string.lbl_off);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f71781b;

        a(String str, int i14) {
            this.f71780a = str;
            this.f71781b = i14;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfi2/c0$b;", "", "", Action.KEY_ATTRIBUTE, "", "stringResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum b {
        /* JADX INFO: Fake field, exist only in values array */
        SHOW_ALL("SHOW_ALL", R.string.device_settings_show_all),
        /* JADX INFO: Fake field, exist only in values array */
        CALLS_AND_TEXTS("SHOW_CALLS_AND_TEXTS", R.string.device_settings_show_calls_and_texts),
        /* JADX INFO: Fake field, exist only in values array */
        SHOW_CALLS_ONLY("SHOW_CALLS_ONLY", R.string.device_settings_show_calls_only),
        OFF("OFF", R.string.lbl_off);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f71785b;

        b(String str, int i14) {
            this.f71784a = str;
            this.f71785b = i14;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Context context) {
        super(context);
        context.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, fi2.c0$b] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5, types: [fi2.c0$b] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        List<Map<String, Object>> listC4 = bVar.C4(map);
        r0 r0Var = new r0();
        r0Var.f105810a = b.OFF;
        r0 r0Var2 = new r0();
        if (listC4 != null) {
            Iterator<T> it = listC4.iterator();
            while (it.hasNext()) {
                Map map2 = (Map) it.next();
                Object obj = map2.get(mh2.i.VALUE_ID.f118617a);
                T t7 = 0;
                T t14 = 0;
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str = (String) obj;
                if (str == null) {
                    str = "";
                }
                Object obj2 = map2.get(mh2.i.ID.f118617a);
                int i14 = 0;
                if (p005kotlin.jvm.internal.s.g(obj2, mh2.m.PRIVACY.f118678a)) {
                    String strD = d(bVar, str);
                    a[] aVarArrValues = a.values();
                    int length = aVarArrValues.length;
                    while (i14 < length) {
                        a aVar = aVarArrValues[i14];
                        if (p005kotlin.jvm.internal.s.g(aVar.f71780a, strD)) {
                            t7 = aVar;
                            break;
                        }
                        i14++;
                    }
                    r0Var2.f105810a = t7;
                } else if (p005kotlin.jvm.internal.s.g(obj2, mh2.m.STATUS.f118678a)) {
                    String strD2 = d(bVar, str);
                    b[] bVarArrValues = b.values();
                    int length2 = bVarArrValues.length;
                    while (i14 < length2) {
                        b bVar2 = bVarArrValues[i14];
                        if (p005kotlin.jvm.internal.s.g(bVar2.f71784a, strD2)) {
                            t14 = bVar2;
                            break;
                        }
                        i14++;
                    }
                    if (t14 == 0) {
                        t14 = b.OFF;
                    }
                    r0Var.f105810a = t14;
                }
            }
        }
        T t15 = r0Var2.f105810a;
        Context context = this.f64388a;
        if (t15 == 0 || r0Var.f105810a == b.OFF) {
            String string = context.getString(((b) r0Var.f105810a).f71785b);
            string.getClass();
            return string;
        }
        x0 x0Var = x0.f105818a;
        String string2 = context.getString(R.string.generic_values_separated_by_comma);
        string2.getClass();
        String string3 = context.getString(((b) r0Var.f105810a).f71785b);
        T t16 = r0Var2.f105810a;
        t16.getClass();
        return String.format(string2, Arrays.copyOf(new Object[]{string3, context.getString(((a) t16).f71781b)}, 2));
    }
}
