package defpackage;

import com.xiaomi.account.openauth.AuthorizeActivityBase;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;

/* JADX INFO: loaded from: classes4.dex */
public class yaf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39985b;
    public int c;
    public cpq d;
    public int e;
    public int f;
    public String g;
    public String h;
    public String i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f39986k;
    public boolean l;
    public int m;
    public int n;
    public String p;
    public int q;
    public String o = "-1";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f39987r = -1;
    public String s = "";
    public String t = "";
    public String u = "16777494";
    public int v = 0;
    public String w = "";

    public String a() {
        return this.p;
    }

    public String b() {
        return this.i;
    }

    public int c() {
        return this.q;
    }

    public int d() {
        return this.e;
    }

    public String e() {
        return this.o;
    }

    public boolean f(String str) {
        this.f39984a = 6089;
        this.f39985b = 1280;
        this.c = HMSedentaryConfig.INGORE_START_INDEX;
        this.d = null;
        this.e = 0;
        this.f = -1;
        this.g = null;
        this.i = null;
        this.j = null;
        this.f39986k = null;
        this.l = true;
        this.m = 6088;
        this.n = 6089;
        this.o = "-1";
        if (str == null || str.length() == 0) {
            voe.c("MdnsExtraData", "no extra data");
            return true;
        }
        int i = 0;
        while (true) {
            int iCharAt = str.charAt(i) + i + 1;
            if (iCharAt > str.length()) {
                voe.d("MdnsExtraData", "invalid extra data");
                return false;
            }
            try {
                String strSubstring = str.substring(i + 1, iCharAt);
                String[] strArrSplit = strSubstring.split("=");
                if (strArrSplit == null || strArrSplit.length != 2) {
                    voe.d("MdnsExtraData", "invalid segment");
                } else if ("photoport".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.f39984a = Integer.valueOf(strArrSplit[1]).intValue();
                    } catch (NumberFormatException e) {
                        voe.b("MdnsExtraData", strSubstring + " format is not correct." + e.toString());
                        return false;
                    }
                } else if ("scrnw".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.f39985b = Integer.valueOf(strArrSplit[1]).intValue();
                    } catch (NumberFormatException e2) {
                        voe.b("MdnsExtraData", strSubstring + " format is not correct." + e2.toString());
                        return false;
                    }
                } else if ("scrnh".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.c = Integer.valueOf(strArrSplit[1]).intValue();
                    } catch (NumberFormatException e3) {
                        voe.b("MdnsExtraData", strSubstring + " format is not correct." + e3.toString());
                        return false;
                    }
                } else if ("protver".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        if (this.d == null) {
                            this.d = new cpq();
                        }
                        this.d.d(Integer.valueOf(strArrSplit[1]).intValue());
                        this.u = strArrSplit[1];
                    } catch (NumberFormatException e4) {
                        voe.b("MdnsExtraData", strSubstring + " format is not correct." + e4.toString());
                        return false;
                    }
                } else if ("prottext".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        cpq cpqVar = this.d;
                        if (cpqVar == null) {
                            voe.d("MdnsExtraData", "invalid order");
                            return false;
                        }
                        cpqVar.c(strArrSplit[1]);
                    } catch (NumberFormatException e5) {
                        voe.b("MdnsExtraData", strSubstring + " format is not correct." + e5.toString());
                        return false;
                    }
                } else if ("platform_id".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.e = Integer.valueOf(strArrSplit[1]).intValue();
                    } catch (NumberFormatException e6) {
                        voe.b("MdnsExtraData", strSubstring + " format is not correct." + e6.toString());
                        return false;
                    }
                } else if ("server_address".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.g = strArrSplit[1];
                    } catch (NumberFormatException e7) {
                        voe.b("MdnsExtraData", strSubstring + " format is not correct." + e7.toString());
                        return false;
                    }
                } else if ("music_version".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.h = strArrSplit[1];
                    } catch (Exception unused) {
                        return false;
                    }
                } else if ("mac".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.i = strArrSplit[1];
                    } catch (Exception unused2) {
                        return false;
                    }
                } else if ("sensor".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.j = strArrSplit[1];
                    } catch (Exception unused3) {
                        return false;
                    }
                } else if ("rpid".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.f = Integer.valueOf(strArrSplit[1]).intValue();
                    } catch (Exception unused4) {
                        return false;
                    }
                } else if ("usingmac".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.f39986k = strArrSplit[1];
                    } catch (Exception unused5) {
                        return false;
                    }
                } else if ("isScrOn".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.l = 1 == Integer.valueOf(strArrSplit[1]).intValue();
                    } catch (Exception unused6) {
                        return false;
                    }
                } else if ("serverport".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.m = Integer.valueOf(strArrSplit[1]).intValue();
                    } catch (Exception unused7) {
                        return false;
                    }
                } else if ("photoport".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.n = Integer.valueOf(strArrSplit[1]).intValue();
                    } catch (Exception unused8) {
                        return false;
                    }
                } else if ("rid".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.o = strArrSplit[1];
                    } catch (Exception unused9) {
                        return false;
                    }
                } else if ("apmac".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.p = strArrSplit[1];
                    } catch (Exception unused10) {
                        return false;
                    }
                } else if (AuthorizeActivityBase.KEY_OPERATOR.equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.q = Integer.parseInt(strArrSplit[1]);
                    } catch (Exception unused11) {
                        return false;
                    }
                } else if ("wol".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.f39987r = Integer.parseInt(strArrSplit[1]);
                    } catch (Exception unused12) {
                        return false;
                    }
                } else if ("miversion".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.s = strArrSplit[1];
                    } catch (Exception unused13) {
                        return false;
                    }
                } else if ("amac".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.t = strArrSplit[1];
                    } catch (Exception unused14) {
                        return false;
                    }
                } else if ("CP".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.w = strArrSplit[1];
                    } catch (Exception unused15) {
                        return false;
                    }
                } else if ("VC".equalsIgnoreCase(strArrSplit[0])) {
                    try {
                        this.v = Integer.parseInt(strArrSplit[1]);
                    } catch (Exception unused16) {
                        return false;
                    }
                } else {
                    voe.d("MdnsExtraData", "not known field:" + strSubstring);
                }
                if (iCharAt >= str.length()) {
                    return true;
                }
                i = iCharAt;
            } catch (IndexOutOfBoundsException e8) {
                e8.printStackTrace();
                return false;
            }
        }
    }
}
