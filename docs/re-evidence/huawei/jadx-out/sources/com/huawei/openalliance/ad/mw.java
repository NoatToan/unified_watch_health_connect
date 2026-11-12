package com.huawei.openalliance.ad;

import com.iab.omid.library.huawei.adsession.media.InteractionType;

/* JADX INFO: loaded from: classes12.dex */
public enum mw {
    CLICK("click"),
    INVITATION_ACCEPTED("invitationAccept");

    private static boolean d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f19649c;

    @Override // java.lang.Enum
    public String toString() {
        return this.f19649c;
    }

    public static boolean a() {
        return d;
    }

    public static InteractionType a(mw mwVar) {
        if (!d) {
            return null;
        }
        int i = AnonymousClass1.f19650a[mwVar.ordinal()];
        if (i == 1) {
            return InteractionType.CLICK;
        }
        if (i != 2) {
            return null;
        }
        return InteractionType.INVITATION_ACCEPTED;
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.mw$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19650a;

        static {
            int[] iArr = new int[mw.values().length];
            f19650a = iArr;
            try {
                iArr[mw.CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19650a[mw.INVITATION_ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    mw(String str) {
        this.f19649c = str;
    }

    static {
        d = false;
        d = mi.a("com.iab.omid.library.huawei.adsession.media.InteractionType");
    }
}
