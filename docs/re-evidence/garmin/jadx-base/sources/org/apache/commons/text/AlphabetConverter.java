package org.apache.commons.text;

import am.j;
import androidx.room.a0;
import i3.e5;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.ArrayUtils;
import sn.a;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class AlphabetConverter {
    private static final String ARROW = " -> ";
    private final int encodedLetterLength;
    private final Map<String, String> encodedToOriginal;
    private final Map<Integer, String> originalToEncoded;

    private AlphabetConverter(Map<Integer, String> map, Map<String, String> map2, int i14) {
        this.originalToEncoded = map;
        this.encodedToOriginal = map2;
        this.encodedLetterLength = i14;
    }

    private void addSingleEncoding(int i14, String str, Collection<Integer> collection, Iterator<Integer> it, Map<Integer, String> map) {
        Collection<Integer> collection2;
        Iterator<Integer> it3;
        Map<Integer, String> map2;
        if (i14 > 0) {
            for (Integer num : collection) {
                int iIntValue = num.intValue();
                if (!it.hasNext()) {
                    break;
                }
                if (i14 == this.encodedLetterLength && map.containsKey(num)) {
                    collection2 = collection;
                    it3 = it;
                    map2 = map;
                } else {
                    StringBuilder sbK = e5.k(str);
                    sbK.append(codePointToString(iIntValue));
                    collection2 = collection;
                    it3 = it;
                    map2 = map;
                    addSingleEncoding(i14 - 1, sbK.toString(), collection2, it3, map2);
                }
                collection = collection2;
                it = it3;
                map = map2;
            }
            return;
        }
        Integer next = it.next();
        while (true) {
            Integer num2 = next;
            if (!map.containsKey(num2)) {
                String strCodePointToString = codePointToString(num2.intValue());
                this.originalToEncoded.put(num2, str);
                this.encodedToOriginal.put(str, strCodePointToString);
                return;
            } else {
                String strCodePointToString2 = codePointToString(num2.intValue());
                this.originalToEncoded.put(num2, strCodePointToString2);
                this.encodedToOriginal.put(strCodePointToString2, strCodePointToString2);
                if (!it.hasNext()) {
                    return;
                } else {
                    next = it.next();
                }
            }
        }
    }

    private static String codePointToString(int i14) {
        return Character.charCount(i14) == 1 ? String.valueOf((char) i14) : new String(Character.toChars(i14));
    }

    private static Integer[] convertCharsToIntegers(Character[] chArr) {
        if (ArrayUtils.isEmpty(chArr)) {
            return ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        }
        Integer[] numArr = new Integer[chArr.length];
        for (int i14 = 0; i14 < chArr.length; i14++) {
            numArr[i14] = Integer.valueOf(chArr[i14].charValue());
        }
        return numArr;
    }

    public static AlphabetConverter createConverter(Integer[] numArr, Integer[] numArr2, Integer[] numArr3) {
        Integer num;
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet(Arrays.asList(numArr));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(Arrays.asList(numArr2));
        LinkedHashSet<Integer> linkedHashSet3 = new LinkedHashSet(Arrays.asList(numArr3));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        HashMap map = new HashMap();
        for (Integer num2 : linkedHashSet3) {
            int iIntValue = num2.intValue();
            if (!linkedHashSet.contains(num2)) {
                h.s(j.o(codePointToString(iIntValue), "'", new StringBuilder("Can not use 'do not encode' list because original alphabet does not contain '")));
                return null;
            }
            if (!linkedHashSet2.contains(num2)) {
                h.s(j.o(codePointToString(iIntValue), "'", new StringBuilder("Can not use 'do not encode' list because encoding alphabet does not contain '")));
                return null;
            }
            map.put(num2, codePointToString(iIntValue));
        }
        if (linkedHashSet2.size() < linkedHashSet.size()) {
            if (linkedHashSet2.size() - linkedHashSet3.size() < 2) {
                a.z(linkedHashSet2.size() - linkedHashSet3.size(), "Must have at least two encoding characters (excluding those in the 'do not encode' list), but has ");
                return null;
            }
            int size = (linkedHashSet.size() - linkedHashSet3.size()) / (linkedHashSet2.size() - linkedHashSet3.size());
            int i14 = 1;
            while (size / linkedHashSet2.size() >= 1) {
                size /= linkedHashSet2.size();
                i14++;
            }
            int i15 = i14 + 1;
            AlphabetConverter alphabetConverter = new AlphabetConverter(linkedHashMap, linkedHashMap2, i15);
            alphabetConverter.addSingleEncoding(i15, "", linkedHashSet2, linkedHashSet.iterator(), map);
            return alphabetConverter;
        }
        Iterator it = linkedHashSet2.iterator();
        for (Integer num3 : linkedHashSet) {
            String strCodePointToString = codePointToString(num3.intValue());
            if (map.containsKey(num3)) {
                linkedHashMap.put(num3, strCodePointToString);
                linkedHashMap2.put(strCodePointToString, strCodePointToString);
            } else {
                Object next = it.next();
                while (true) {
                    num = (Integer) next;
                    if (!linkedHashSet3.contains(num)) {
                        break;
                    }
                    next = it.next();
                }
                String strCodePointToString2 = codePointToString(num.intValue());
                linkedHashMap.put(num3, strCodePointToString2);
                linkedHashMap2.put(strCodePointToString2, strCodePointToString);
            }
        }
        return new AlphabetConverter(linkedHashMap, linkedHashMap2, 1);
    }

    public static AlphabetConverter createConverterFromChars(Character[] chArr, Character[] chArr2, Character[] chArr3) {
        return createConverter(convertCharsToIntegers(chArr), convertCharsToIntegers(chArr2), convertCharsToIntegers(chArr3));
    }

    public static AlphabetConverter createConverterFromMap(Map<Integer, String> map) {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = 1;
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            linkedHashMap.put(entry.getValue(), codePointToString(((Integer) entry.getKey()).intValue()));
            if (((String) entry.getValue()).length() > length) {
                length = ((String) entry.getValue()).length();
            }
        }
        return new AlphabetConverter(mapUnmodifiableMap, linkedHashMap, length);
    }

    public String decode(String str) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        int i14 = 0;
        while (i14 < str.length()) {
            int iCodePointAt = str.codePointAt(i14);
            String strCodePointToString = codePointToString(iCodePointAt);
            if (strCodePointToString.equals(this.originalToEncoded.get(Integer.valueOf(iCodePointAt)))) {
                sb3.append(strCodePointToString);
                i14++;
            } else {
                if (this.encodedLetterLength + i14 > str.length()) {
                    throw new UnsupportedEncodingException("Unexpected end of string while decoding ".concat(str));
                }
                String strSubstring = str.substring(i14, this.encodedLetterLength + i14);
                String str2 = this.encodedToOriginal.get(strSubstring);
                if (str2 == null) {
                    throw new UnsupportedEncodingException(a0.j("Unexpected string without decoding (", strSubstring, ") in ", str));
                }
                sb3.append(str2);
                i14 += this.encodedLetterLength;
            }
        }
        return sb3.toString();
    }

    public String encode(String str) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        int iCharCount = 0;
        while (iCharCount < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            String str2 = this.originalToEncoded.get(Integer.valueOf(iCodePointAt));
            if (str2 == null) {
                throw new UnsupportedEncodingException(e0.h(new StringBuilder("Couldn't find encoding for '"), codePointToString(iCodePointAt), "' in ", str));
            }
            sb3.append(str2);
            iCharCount += Character.charCount(iCodePointAt);
        }
        return sb3.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AlphabetConverter)) {
            return false;
        }
        AlphabetConverter alphabetConverter = (AlphabetConverter) obj;
        return this.originalToEncoded.equals(alphabetConverter.originalToEncoded) && this.encodedToOriginal.equals(alphabetConverter.encodedToOriginal) && this.encodedLetterLength == alphabetConverter.encodedLetterLength;
    }

    public int getEncodedCharLength() {
        return this.encodedLetterLength;
    }

    public Map<Integer, String> getOriginalToEncoded() {
        return Collections.unmodifiableMap(this.originalToEncoded);
    }

    public int hashCode() {
        return Objects.hash(this.originalToEncoded, this.encodedToOriginal, Integer.valueOf(this.encodedLetterLength));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry<Integer, String> entry : this.originalToEncoded.entrySet()) {
            sb3.append(codePointToString(entry.getKey().intValue()));
            sb3.append(ARROW);
            sb3.append(entry.getValue());
            sb3.append(System.lineSeparator());
        }
        return sb3.toString();
    }
}
