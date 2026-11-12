package com.xmlywind.windad;

/* JADX INFO: loaded from: classes22.dex */
public enum WindAgeRestrictedUserStatus {
    WindAgeRestrictedStatusUnknown(0),
    WindAgeRestrictedStatusYES(1),
    WindAgeRestrictedStatusNO(2);

    private int a;

    WindAgeRestrictedUserStatus(int i) {
        this.a = i;
    }

    public int getValue() {
        return this.a;
    }
}
