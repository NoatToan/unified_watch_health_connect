package defpackage;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
@Entity(indices = {@Index(name = "idx_record", unique = true, value = {"device_id", DeviceContractKt.COLUMN_DEVICE_TYPE, "data_type", "timestamp"})})
public abstract class y6k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("device_id")
    @ColumnInfo(name = "device_id")
    private String f39863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(DeviceContractKt.COLUMN_DEVICE_TYPE)
    @ColumnInfo(name = DeviceContractKt.COLUMN_DEVICE_TYPE)
    private String f39864b;
    public String c;

    @SerializedName("device_model")
    @ColumnInfo(name = "device_model")
    private String d;

    @SerializedName("data_type")
    @ColumnInfo(name = "data_type")
    private String e;

    @SerializedName("timestamp")
    @ColumnInfo(name = "timestamp")
    private long f;

    @SerializedName("deleted")
    @ColumnInfo(name = "deleted")
    private boolean g;

    @SerializedName("update_time")
    @ColumnInfo(name = "update_time")
    private long h;

    public y6k() {
    }

    public String e() {
        return this.e;
    }

    public String f() {
        return this.f39863a;
    }

    public String g() {
        return this.d;
    }

    public String h() {
        return this.c;
    }

    public String i() {
        return this.f39864b;
    }

    public long j() {
        return this.f;
    }

    public long k() {
        return this.h;
    }

    public boolean l() {
        return this.g;
    }

    public void q(String str) {
        this.e = str;
    }

    public void r(boolean z) {
        this.g = z;
    }

    public void t(String str) {
        this.f39863a = str;
    }

    public String toString() {
        return "RecordEntity{deviceId='" + this.f39863a + "', deviceNickname='" + this.c + "', deviceType='" + this.f39864b + "', deviceModel='" + this.d + "', dataType='" + this.e + "', timestamp=" + this.f + ", deleted=" + this.g + ", updateTime=" + this.h + AbstractJsonLexerKt.END_OBJ;
    }

    public void u(String str) {
        this.d = str;
    }

    public void v(String str) {
        this.c = str;
    }

    public void w(String str) {
        this.f39864b = str;
    }

    public void x(long j) {
        this.f = j;
    }

    public void z(long j) {
        this.h = j;
    }

    public y6k(y6k y6kVar) {
        u(y6kVar.g());
        q(y6kVar.e());
        t(y6kVar.f());
        v(y6kVar.h());
        w(y6kVar.i());
        x(y6kVar.j());
        r(y6kVar.l());
        z(y6kVar.k());
    }
}
