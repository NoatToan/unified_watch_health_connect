package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;
import java.security.InvalidParameterException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class LookupTranslator extends CharSequenceTranslator {
    private final int longest;
    private final Map<String, String> lookupMap;
    private final BitSet prefixSet;
    private final int shortest;

    public LookupTranslator(Map<CharSequence, CharSequence> map) {
        if (map == null) {
            throw new InvalidParameterException("lookupMap cannot be null");
        }
        this.lookupMap = new HashMap();
        this.prefixSet = new BitSet();
        int i14 = Integer.MAX_VALUE;
        int i15 = 0;
        for (Map.Entry<CharSequence, CharSequence> entry : map.entrySet()) {
            this.lookupMap.put(entry.getKey().toString(), entry.getValue().toString());
            this.prefixSet.set(entry.getKey().charAt(0));
            int length = entry.getKey().length();
            i14 = length < i14 ? length : i14;
            if (length > i15) {
                i15 = length;
            }
        }
        this.shortest = i14;
        this.longest = i15;
    }

    @Override // org.apache.commons.text.translate.CharSequenceTranslator
    public int translate(CharSequence charSequence, int i14, Writer writer) throws IOException {
        if (!this.prefixSet.get(charSequence.charAt(i14))) {
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
