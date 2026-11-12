package org.apache.commons.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.Validate;

/* JADX INFO: loaded from: classes3.dex */
public final class RandomStringGenerator {
    private final List<Character> characterList;
    private final Set<CharacterPredicate> inclusivePredicates;
    private final int maximumCodePoint;
    private final int minimumCodePoint;
    private final TextRandomProvider random;

    private RandomStringGenerator(int i14, int i15, Set<CharacterPredicate> set, TextRandomProvider textRandomProvider, List<Character> list) {
        this.minimumCodePoint = i14;
        this.maximumCodePoint = i15;
        this.inclusivePredicates = set;
        this.random = textRandomProvider;
        this.characterList = list;
    }

    private int generateRandomNumber(List<Character> list) {
        int size = list.size();
        TextRandomProvider textRandomProvider = this.random;
        return textRandomProvider != null ? String.valueOf(list.get(textRandomProvider.nextInt(size))).codePointAt(0) : String.valueOf(list.get(ThreadLocalRandom.current().nextInt(0, size))).codePointAt(0);
    }

    public String generate(int i14) {
        if (i14 == 0) {
            return "";
        }
        long j8 = i14;
        Validate.isTrue(i14 > 0, "Length %d is smaller than zero.", j8);
        StringBuilder sb3 = new StringBuilder(i14);
        do {
            List<Character> list = this.characterList;
            int iGenerateRandomNumber = (list == null || list.isEmpty()) ? generateRandomNumber(this.minimumCodePoint, this.maximumCodePoint) : generateRandomNumber(this.characterList);
            int type = Character.getType(iGenerateRandomNumber);
            if (type != 0 && type != 18 && type != 19) {
                Set<CharacterPredicate> set = this.inclusivePredicates;
                if (set == null) {
                    sb3.appendCodePoint(iGenerateRandomNumber);
                    j8--;
                    break;
                }
                Iterator<CharacterPredicate> it = set.iterator();
                while (it.hasNext()) {
                    if (it.next().test(iGenerateRandomNumber)) {
                        sb3.appendCodePoint(iGenerateRandomNumber);
                        j8--;
                        break;
                    }
                }
            }
        } while (j8 != 0);
        return sb3.toString();
    }

    private int generateRandomNumber(int i14, int i15) {
        TextRandomProvider textRandomProvider = this.random;
        if (textRandomProvider != null) {
            return textRandomProvider.nextInt((i15 - i14) + 1) + i14;
        }
        return ThreadLocalRandom.current().nextInt(i14, i15 + 1);
    }

    public static class Builder implements org.apache.commons.text.Builder<RandomStringGenerator> {
        public static final int DEFAULT_LENGTH = 0;
        public static final int DEFAULT_MAXIMUM_CODE_POINT = 1114111;
        public static final int DEFAULT_MINIMUM_CODE_POINT = 0;
        private List<Character> characterList;
        private Set<CharacterPredicate> inclusivePredicates;
        private TextRandomProvider random;
        private int minimumCodePoint = 0;
        private int maximumCodePoint = DEFAULT_MAXIMUM_CODE_POINT;

        @Override // org.apache.commons.text.Builder
        public RandomStringGenerator build() {
            return new RandomStringGenerator(this.minimumCodePoint, this.maximumCodePoint, this.inclusivePredicates, this.random, this.characterList);
        }

        public Builder filteredBy(CharacterPredicate... characterPredicateArr) {
            if (ArrayUtils.isEmpty(characterPredicateArr)) {
                this.inclusivePredicates = null;
                return this;
            }
            Set<CharacterPredicate> set = this.inclusivePredicates;
            if (set == null) {
                this.inclusivePredicates = new HashSet();
            } else {
                set.clear();
            }
            Collections.addAll(this.inclusivePredicates, characterPredicateArr);
            return this;
        }

        public Builder selectFrom(char... cArr) {
            this.characterList = new ArrayList();
            for (char c14 : cArr) {
                this.characterList.add(Character.valueOf(c14));
            }
            return this;
        }

        public Builder usingRandom(TextRandomProvider textRandomProvider) {
            this.random = textRandomProvider;
            return this;
        }

        public Builder withinRange(char[]... cArr) {
            this.characterList = new ArrayList();
            for (char[] cArr2 : cArr) {
                Validate.isTrue(cArr2.length == 2, "Each pair must contain minimum and maximum code point", new Object[0]);
                char c14 = cArr2[0];
                char c15 = cArr2[1];
                Validate.isTrue(c14 <= c15, "Minimum code point %d is larger than maximum code point %d", Integer.valueOf(c14), Integer.valueOf(c15));
                for (int i14 = c14; i14 <= c15; i14++) {
                    this.characterList.add(Character.valueOf((char) i14));
                }
            }
            return this;
        }

        public Builder withinRange(int i14, int i15) {
            Validate.isTrue(i14 <= i15, "Minimum code point %d is larger than maximum code point %d", Integer.valueOf(i14), Integer.valueOf(i15));
            Validate.isTrue(i14 >= 0, "Minimum code point %d is negative", i14);
            Validate.isTrue(i15 <= 1114111, "Value %d is larger than Character.MAX_CODE_POINT.", i15);
            this.minimumCodePoint = i14;
            this.maximumCodePoint = i15;
            return this;
        }
    }

    public String generate(int i14, int i15) {
        Validate.isTrue(i14 >= 0, "Minimum length %d is smaller than zero.", i14);
        Validate.isTrue(i14 <= i15, "Maximum length %d is smaller than minimum length %d.", Integer.valueOf(i15), Integer.valueOf(i14));
        return generate(generateRandomNumber(i14, i15));
    }
}
