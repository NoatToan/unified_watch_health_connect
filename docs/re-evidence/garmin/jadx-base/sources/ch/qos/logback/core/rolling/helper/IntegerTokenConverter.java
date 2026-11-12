package ch.qos.logback.core.rolling.helper;

import c22.t;
import ch.qos.logback.core.pattern.DynamicConverter;
import ch.qos.logback.core.pattern.FormatInfo;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class IntegerTokenConverter extends DynamicConverter<Object> implements MonoTypedConverter {
    public static final String CONVERTER_KEY = "i";

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(Object obj) {
        if (obj == null) {
            h.s("Null argument forbidden");
            return null;
        }
        if (obj instanceof Integer) {
            return convert(((Integer) obj).intValue());
        }
        StringBuilder sb3 = new StringBuilder("Cannot convert ");
        sb3.append(obj);
        t.j(sb3, " of type", obj.getClass().getName());
        return null;
    }

    @Override // ch.qos.logback.core.rolling.helper.MonoTypedConverter
    public boolean isApplicable(Object obj) {
        return obj instanceof Integer;
    }

    public String convert(int i14) {
        String string = Integer.toString(i14);
        FormatInfo formattingInfo = getFormattingInfo();
        if (formattingInfo == null) {
            return string;
        }
        int min = formattingInfo.getMin();
        StringBuilder sb3 = new StringBuilder();
        for (int length = string.length(); length < min; length++) {
            sb3.append('0');
        }
        sb3.append(string);
        return sb3.toString();
    }
}
