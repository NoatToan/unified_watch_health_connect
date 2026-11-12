package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class LookupTranslator extends CharSequenceTranslator {
    private final int longest;
    private final HashMap<String, String> lookupMap = new HashMap<>();
    private final HashSet<Character> prefixSet = new HashSet<>();
    private final int shortest;

    public LookupTranslator(CharSequence[]... charSequenceArr) {
        int i14 = Integer.MAX_VALUE;
        int i15 = 0;
        if (charSequenceArr != null) {
            int i16 = 0;
            for (CharSequence[] charSequenceArr2 : charSequenceArr) {
                this.lookupMap.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
                this.prefixSet.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
                int length = charSequenceArr2[0].length();
                i14 = length < i14 ? length : i14;
                if (length > i16) {
                    i16 = length;
                }
            }
            i15 = i16;
        }
        this.shortest = i14;
        this.longest = i15;
    }

    @Override // org.apache.commons.lang3.text.translate.CharSequenceTranslator
    public int translate(CharSequence charSequence, int i14, Writer writer) throws IOException {
        if (!this.prefixSet.contains(Character.valueOf(charSequence.charAt(i14)))) {
            return 0;
        }
        int length = this.longest;
        if (i14 + length > charSequence.length()) {
            length = charSequence.length() - i14;
        }
        while (length >= this.shortest) {
            String str = this.lookupMap.get(charSequence.subSequence(i14, i14 + length).toString());
            if (str != null) {
                writer.write(str);
                return length;
            }
            length--;
        }
        return 0;
    }
}
