package org.apache.commons.text;

/* JADX INFO: loaded from: classes3.dex */
public enum CharacterPredicates implements CharacterPredicate {
    LETTERS { // from class: org.apache.commons.text.CharacterPredicates.1
        @Override // org.apache.commons.text.CharacterPredicate
        public boolean test(int i14) {
            return Character.isLetter(i14);
        }
    },
    DIGITS { // from class: org.apache.commons.text.CharacterPredicates.2
        @Override // org.apache.commons.text.CharacterPredicate
        public boolean test(int i14) {
            return Character.isDigit(i14);
        }
    },
    ARABIC_NUMERALS { // from class: org.apache.commons.text.CharacterPredicates.3
        @Override // org.apache.commons.text.CharacterPredicate
        public boolean test(int i14) {
            return i14 >= 48 && i14 <= 57;
        }
    },
    ASCII_LOWERCASE_LETTERS { // from class: org.apache.commons.text.CharacterPredicates.4
        @Override // org.apache.commons.text.CharacterPredicate
        public boolean test(int i14) {
            return i14 >= 97 && i14 <= 122;
        }
    },
    ASCII_UPPERCASE_LETTERS { // from class: org.apache.commons.text.CharacterPredicates.5
        @Override // org.apache.commons.text.CharacterPredicate
        public boolean test(int i14) {
            return i14 >= 65 && i14 <= 90;
        }
    },
    ASCII_LETTERS { // from class: org.apache.commons.text.CharacterPredicates.6
        @Override // org.apache.commons.text.CharacterPredicate
        public boolean test(int i14) {
            return CharacterPredicates.ASCII_LOWERCASE_LETTERS.test(i14) || CharacterPredicates.ASCII_UPPERCASE_LETTERS.test(i14);
        }
    },
    ASCII_ALPHA_NUMERALS { // from class: org.apache.commons.text.CharacterPredicates.7
        @Override // org.apache.commons.text.CharacterPredicate
        public boolean test(int i14) {
            return CharacterPredicates.ASCII_LOWERCASE_LETTERS.test(i14) || CharacterPredicates.ASCII_UPPERCASE_LETTERS.test(i14) || CharacterPredicates.ARABIC_NUMERALS.test(i14);
        }
    }
}
