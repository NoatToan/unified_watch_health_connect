package cn.hutool.core.text.escape;

import cn.hutool.core.text.StrBuilder;
import cn.hutool.core.text.replacer.StrReplacer;
import defpackage.yt3;

/* JADX INFO: loaded from: classes.dex */
public class NumericEntityUnescaper extends StrReplacer {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.text.replacer.StrReplacer
    public int replace(CharSequence charSequence, int i, StrBuilder strBuilder) {
        int i2;
        int length = charSequence.length();
        if (charSequence.charAt(i) == '&' && i < length - 2 && charSequence.charAt(i + 1) == '#') {
            int i3 = i + 2;
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt == 'x' || cCharAt == 'X') {
                i3 = i + 3;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (i3 == length) {
                return 0;
            }
            int i4 = i3;
            while (i4 < length && yt3.g(charSequence.charAt(i4))) {
                i4++;
            }
            if (i4 != length && charSequence.charAt(i4) == ';') {
                try {
                    strBuilder.append((char) (i2 != 0 ? Integer.parseInt(charSequence.subSequence(i3, i4).toString(), 16) : Integer.parseInt(charSequence.subSequence(i3, i4).toString(), 10)));
                    return ((i4 + 2) - i3) + i2 + 1;
                } catch (NumberFormatException unused) {
                }
            }
        }
        return 0;
    }
}
