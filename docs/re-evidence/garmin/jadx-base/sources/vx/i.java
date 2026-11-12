package vx;

import f12.l;
import gg1.m;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvx/i;", "", "<init>", "()V", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f180642a = new i();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f180643a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.SUNDAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.MONDAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.TUESDAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.WEDNESDAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m.THURSDAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m.FRIDAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[m.SATURDAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f180643a = iArr;
        }
    }

    private i() {
    }

    public static int a() {
        int i14;
        l.f68084a.getClass();
        switch (a.f180643a[l.a.a().e1().ordinal()]) {
            case 2:
                i14 = m.MONDAY.f77271c;
                break;
            case 3:
                i14 = m.TUESDAY.f77271c;
                break;
            case 4:
                i14 = m.WEDNESDAY.f77271c;
                break;
            case 5:
                i14 = m.THURSDAY.f77271c;
                break;
            case 6:
                i14 = m.FRIDAY.f77271c;
                break;
            case 7:
                i14 = m.SATURDAY.f77271c;
                break;
            default:
                return 0;
        }
        return 7 - i14;
    }
}
