package com.xiaomi.hm.health.bt.profile.nfc;

/* JADX INFO: loaded from: classes18.dex */
public class HMNFCTradeInfo {
    private String a;
    private String b;
    private int c;
    private int d;
    private int e;
    private String f;
    private String g;

    public String getAid() {
        return this.a;
    }

    public int getBalance() {
        return this.e;
    }

    public String getClientId() {
        return this.b;
    }

    public int getConsumption() {
        return this.d;
    }

    public String getDate() {
        return this.f;
    }

    public String getHci() {
        return this.g;
    }

    public int getType() {
        return this.c;
    }

    public void setAid(String aid) {
        this.a = aid;
    }

    public void setBalance(int balance) {
        this.e = balance;
    }

    public void setClientId(String clientId) {
        this.b = clientId;
    }

    public void setConsumption(int consumption) {
        this.d = consumption;
    }

    public void setDate(String date) {
        this.f = date;
    }

    public void setHci(String hci) {
        this.g = hci;
    }

    public void setType(int type) {
        this.c = type;
    }

    public String toString() {
        return "{aid='" + this.a + "', clientId='" + this.b + "', type=" + this.c + ", consumption=" + this.d + ", balance=" + this.e + ", date='" + this.f + "', hci='" + this.g + "'}";
    }
}
