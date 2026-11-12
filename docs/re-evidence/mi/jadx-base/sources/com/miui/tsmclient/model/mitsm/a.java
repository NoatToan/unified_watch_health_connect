package com.miui.tsmclient.model.mitsm;

/* JADX INFO: loaded from: classes6.dex */
public enum a {
    ISSUE("issue"),
    RECHARGE("recharge"),
    TRANSFER_OUT("transferOut"),
    TRANSFER_IN("transferIn"),
    ISSUE_WITH_RECHARGE("issueWithRecharge"),
    RETURN("return"),
    OTHERS("others"),
    DELETE("delete");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10375a;

    /* JADX INFO: renamed from: com.miui.tsmclient.model.mitsm.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0330a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10376a;

        static {
            int[] iArr = new int[k.a.values().length];
            f10376a = iArr;
            try {
                iArr[k.a.INSTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10376a[k.a.OUT_INSTALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10376a[k.a.RECHARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10376a[k.a.OUT_RECHARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10376a[k.a.TRANSFER_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10376a[k.a.TRANSFER_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10376a[k.a.INTERNAL_RETURN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10376a[k.a.OUT_RETURN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    a(String str) {
        this.f10375a = str;
    }

    public String b() {
        return this.f10375a;
    }

    public static a a(k.a aVar) {
        switch (C0330a.f10376a[aVar.ordinal()]) {
            case 1:
            case 2:
                return ISSUE;
            case 3:
            case 4:
                return RECHARGE;
            case 5:
                return TRANSFER_OUT;
            case 6:
                return TRANSFER_IN;
            case 7:
            case 8:
                return RETURN;
            default:
                return OTHERS;
        }
    }
}
