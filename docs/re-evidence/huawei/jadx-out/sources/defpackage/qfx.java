package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;

/* JADX INFO: loaded from: classes15.dex */
public class qfx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("executableFlag")
    private boolean f46140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("metadata")
    private String f46141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(SocialConstants.PARAM_APP_DESC)
    private String f46142c;

    @SerializedName("globalTaskFlag")
    private boolean d;

    @SerializedName("category")
    private int e;

    @SerializedName("reference")
    private String f;

    @SerializedName(TypedValues.CycleType.S_WAVE_PERIOD)
    private String g;

    @SerializedName("name")
    private String h;

    @SerializedName("parentTaskId")
    private String i;

    @SerializedName("taskId")
    private String j;

    @SerializedName("templateId")
    private String l;

    @SerializedName("timeZone")
    private String m;

    @SerializedName("type")
    private int o;

    public String h() {
        return this.j;
    }

    public void f(String str) {
        this.j = str;
    }

    public String i() {
        return this.l;
    }

    public void g(String str) {
        this.l = str;
    }

    public int l() {
        return this.o;
    }

    public void d(int i) {
        this.o = i;
    }

    public int e() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    public String c() {
        return this.h;
    }

    public void d(String str) {
        this.h = str;
    }

    public String b() {
        return this.f46142c;
    }

    public void c(String str) {
        this.f46142c = str;
    }

    public String g() {
        return this.m;
    }

    public void i(String str) {
        this.m = str;
    }

    public String a() {
        return this.f46141b;
    }

    public void a(String str) {
        this.f46141b = str;
    }

    public boolean k() {
        return this.f46140a;
    }

    public void c(boolean z) {
        this.f46140a = z;
    }

    public boolean m() {
        return this.d;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public String d() {
        return this.i;
    }

    public void e(String str) {
        this.i = str;
    }

    public String j() {
        return this.g;
    }

    public void b(String str) {
        this.g = str;
    }

    public String f() {
        return this.f;
    }

    public void j(String str) {
        this.f = str;
    }

    public String toString() {
        return "BaseTaskInfo{taskId='" + this.j + ", templateId='" + this.l + ", type=" + this.o + ", category=" + this.e + ", name='" + this.h + ", desc='" + this.f46142c + ", timeZone='" + this.m + ", metadata='" + this.f46141b + ", executableFlag=" + this.f46140a + ", globalTaskFlag=" + this.d + ", parentTaskId='" + this.i + ", period='" + this.g + ", reference='" + this.f + '}';
    }
}
