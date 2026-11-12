package i3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap<String, NumberFormat> f88470a = new WeakHashMap<>();

    public static String a(int i14, int i15, Locale locale) {
        int i16 = (i15 & 1) != 0 ? 1 : 2;
        if ((i15 & 8) != 0) {
            locale = null;
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String str = i16 + ".40.false." + locale.toLanguageTag();
        WeakHashMap<String, NumberFormat> weakHashMap = f88470a;
        NumberFormat integerInstance = weakHashMap.get(str);
        if (integerInstance == null) {
            integerInstance = NumberFormat.getIntegerInstance(locale);
            integerInstance.setGroupingUsed(false);
            integerInstance.setMinimumIntegerDigits(i16);
            integerInstance.setMaximumIntegerDigits(40);
            weakHashMap.put(str, integerInstance);
        }
        return integerInstance.format(Integer.valueOf(i14));
    }
}
