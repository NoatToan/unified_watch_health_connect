package defpackage;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.google.gson.annotations.SerializedName;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;

/* JADX INFO: loaded from: classes9.dex */
public class iut {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("nickName")
    private String f38048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(CommonConstant.KEY_GENDER)
    private byte f38049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(CmcdConfiguration.KEY_SESSION_ID)
    private String f38050c;

    @SerializedName("birthday")
    private String d;

    @SerializedName("height")
    private int e;

    @SerializedName("weight")
    private float g;

    @SerializedName(JsbMapKeyNames.H5_USER_ID)
    private String i;

    public iut(String str, String str2, String str3, byte b2) {
        this.i = str;
        this.f38048a = str2;
        this.d = str3;
        this.f38049b = b2;
    }

    public String h() {
        return this.i;
    }

    public String d() {
        return this.f38048a;
    }

    public String a() {
        return this.d;
    }

    public byte b() {
        return this.f38049b;
    }

    public int e() {
        return this.e;
    }

    public void c(int i) {
        this.e = i;
    }

    public float j() {
        return this.g;
    }

    public void c(float f) {
        this.g = f;
    }

    public String c() {
        return this.f38050c;
    }

    public void a(String str) {
        this.f38050c = str;
    }

    public String toString() {
        return HiJsonUtil.d(this);
    }
}
