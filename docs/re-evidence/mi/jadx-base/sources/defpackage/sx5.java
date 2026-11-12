package defpackage;

import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.DebugKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class sx5 {

    public static class a implements Comparator<Map.Entry<Integer, h00>> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<Integer, h00> entry, Map.Entry<Integer, h00> entry2) {
            Integer key = entry.getKey();
            key.intValue();
            return key.compareTo(entry2.getKey());
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34072a;

        static {
            int[] iArr = new int[ConfigValueType.values().length];
            f34072a = iArr;
            try {
                iArr[ConfigValueType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34072a[ConfigValueType.NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34072a[ConfigValueType.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34072a[ConfigValueType.LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34072a[ConfigValueType.OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34072a[ConfigValueType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static h00 a(h00 h00Var, ConfigValueType configValueType) {
        ConfigValueType configValueTypeValueType = h00Var.valueType();
        ConfigValueType configValueType2 = ConfigValueType.STRING;
        if (configValueTypeValueType == configValueType2) {
            String str = (String) h00Var.x();
            int i = b.f34072a[configValueType.ordinal()];
            if (i == 1) {
                try {
                    try {
                        return new ec4(h00Var.g(), Long.parseLong(str), str);
                    } catch (NumberFormatException unused) {
                        return new sb4(h00Var.g(), Double.parseDouble(str), str);
                    }
                } catch (NumberFormatException unused2) {
                }
            } else if (i != 2) {
                if (i == 3) {
                    if (str.equals("true") || str.equals("yes") || str.equals(DebugKt.DEBUG_PROPERTY_VALUE_ON)) {
                        return new ob4(h00Var.g(), true);
                    }
                    if (str.equals("false") || str.equals("no") || str.equals(DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
                        return new ob4(h00Var.g(), false);
                    }
                }
            } else if (str.equals(AbstractJsonLexerKt.NULL)) {
                return new gc4(h00Var.g());
            }
        } else if (configValueType == configValueType2) {
            int i2 = b.f34072a[h00Var.valueType().ordinal()];
            if (i2 == 1 || i2 == 3) {
                return new qc4(h00Var.g(), h00Var.c0());
            }
        } else if (configValueType == ConfigValueType.LIST && h00Var.valueType() == ConfigValueType.OBJECT) {
            g00 g00Var = (g00) h00Var;
            HashMap map = new HashMap();
            for (String str2 : g00Var.keySet()) {
                try {
                    int i3 = Integer.parseInt(str2, 10);
                    if (i3 >= 0) {
                        map.put(Integer.valueOf(i3), g00Var.get(str2));
                    }
                } catch (NumberFormatException unused3) {
                }
            }
            if (!map.isEmpty()) {
                ArrayList arrayList = new ArrayList(map.entrySet());
                Collections.sort(arrayList, new a());
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Map.Entry) it.next()).getValue());
                }
                return new mcm(h00Var.g(), arrayList2);
            }
        }
        return h00Var;
    }
}
