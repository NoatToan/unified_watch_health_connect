package cn.hutool.core.text.replacer;

import cn.hutool.core.text.StrBuilder;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class StrReplacer implements Serializable {
    private static final long serialVersionUID = 1;

    public abstract int replace(CharSequence charSequence, int i, StrBuilder strBuilder);

    public CharSequence replace(CharSequence charSequence) {
        int length = charSequence.length();
        StrBuilder strBuilderCreate = StrBuilder.create(length);
        int i = 0;
        while (i < length) {
            int iReplace = replace(charSequence, i, strBuilderCreate);
            if (iReplace == 0) {
                strBuilderCreate.append(charSequence.charAt(i));
                i++;
            }
            i += iReplace;
        }
        return strBuilderCreate;
    }
}
