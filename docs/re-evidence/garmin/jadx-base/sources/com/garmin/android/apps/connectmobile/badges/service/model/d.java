package com.garmin.android.apps.connectmobile.badges.service.model;

/* JADX INFO: loaded from: classes7.dex */
public enum d {
    EASY(1, 1),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIUM(2, 2),
    /* JADX INFO: Fake field, exist only in values array */
    HARD(3, 4),
    /* JADX INFO: Fake field, exist only in values array */
    ELITE(4, 8),
    /* JADX INFO: Fake field, exist only in values array */
    MASTER(5, 16);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30564b;

    d(int i14, int i15) {
        this.f30563a = i14;
        this.f30564b = i15;
    }

    public static d a(long j8) {
        for (int i14 = 0; i14 < values().length; i14++) {
            d dVar = values()[i14];
            if (j8 == dVar.f30563a) {
                return dVar;
            }
        }
        return EASY;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.f30563a);
    }
}
