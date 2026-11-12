package defpackage;

import com.huawei.multisimsdk.multidevicemanager.common.AuthParam;

/* JADX INFO: loaded from: classes15.dex */
public class pwp extends AuthParam {
    private int d;
    private int g = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f45913b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f45914c = "";
    private String h = "";
    private String j = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45912a = "";
    private String e = "";

    public pwp(int i) {
        this.d = 3;
        this.d = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AuthParam
    public int getAuthType() {
        return ((Integer) lst.d(Integer.valueOf(this.d))).intValue();
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AuthParam
    public void setSlotId(int i) {
        this.g = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AuthParam
    public int getSlotId() {
        return ((Integer) lst.d(Integer.valueOf(this.g))).intValue();
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AuthParam
    public void setImsi(String str) {
        this.f45913b = (String) lst.d(str);
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AuthParam
    public String getImsi() {
        return (String) lst.d(this.f45913b);
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AuthParam
    public String getCiphertext() {
        return this.f45912a;
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AuthParam
    public void setCiphertext(String str) {
        this.f45912a = str;
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AuthParam
    public String getCiphertextSign() {
        return this.e;
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AuthParam
    public void setCiphertextSign(String str) {
        this.e = str;
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AuthParam
    public String getPhoneNumber() {
        return (String) lst.d(this.j);
    }
}
