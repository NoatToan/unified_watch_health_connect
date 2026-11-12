package com.google.i18n.phonenumbers;

import java.util.Arrays;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public final class PhoneNumberMatch {
    private final Phonenumber.PhoneNumber number;
    private final String rawString;
    private final int start;

    public PhoneNumberMatch(int i14, String str, Phonenumber.PhoneNumber phoneNumber) {
        if (i14 < 0) {
            h.s("Start index must be >= 0.");
            throw null;
        }
        if (str == null || phoneNumber == null) {
            throw null;
        }
        this.start = i14;
        this.rawString = str;
        this.number = phoneNumber;
    }

    public int end() {
        return this.rawString.length() + this.start;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneNumberMatch)) {
            return false;
        }
        PhoneNumberMatch phoneNumberMatch = (PhoneNumberMatch) obj;
        return this.rawString.equals(phoneNumberMatch.rawString) && this.start == phoneNumberMatch.start && this.number.equals(phoneNumberMatch.number);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.start), this.rawString, this.number});
    }

    public Phonenumber.PhoneNumber number() {
        return this.number;
    }

    public String rawString() {
        return this.rawString;
    }

    public int start() {
        return this.start;
    }

    public String toString() {
        return "PhoneNumberMatch [" + start() + "," + end() + ") " + this.rawString;
    }
}
