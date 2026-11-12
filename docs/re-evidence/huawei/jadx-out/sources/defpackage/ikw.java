package defpackage;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.operation.utils.TodoTaskInterface;
import com.huawei.ui.commonui.R;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes9.dex */
public class ikw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("linkUrl")
    private String f37756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("toDoId")
    private long f37757c;

    @SerializedName("currentValue")
    private String d;
    private String e;

    @SerializedName("targetUnit")
    private String f;

    @SerializedName(WorkoutRecord.Extend.COURSE_TARGET_VALUE)
    private String g;

    @SerializedName("createTime")
    private long h;

    @SerializedName("status")
    private int i;

    @SerializedName("title")
    private String j;
    private TodoTaskInterface k;

    @SerializedName("toDoType")
    private int m;

    @SerializedName("toDoContent")
    private String o;

    public String toString() {
        return "TodoCardRecyModel{title='" + this.j + "', name='" + this.e + "', type=" + this.m + ", time=" + this.h + ", todoTaskObject=" + this.k + ", id=" + this.f37757c + ", status=" + this.i + ", linkUrl='" + this.f37756b + "', todoContent='" + this.o + "', targetValue='" + this.g + "', targetUnit='" + this.f + "', currentValue='" + this.d + "'}";
    }

    public String o() {
        return this.j;
    }

    public void a(String str) {
        this.j = str;
    }

    public String e() {
        return this.e;
    }

    public void e(String str) {
        this.e = str;
    }

    public long g() {
        return this.h;
    }

    public void b(long j) {
        this.h = j;
    }

    public int l() {
        return this.m;
    }

    public void b(int i) {
        this.m = i;
    }

    public TodoTaskInterface n() {
        return this.k;
    }

    public void c(TodoTaskInterface todoTaskInterface) {
        this.k = todoTaskInterface;
    }

    public long b() {
        return this.f37757c;
    }

    public int j() {
        return this.i;
    }

    public void d(int i) {
        this.i = i;
    }

    public String c() {
        return this.f37756b;
    }

    public void c(String str) {
        this.f37756b = str;
    }

    public String k() {
        return this.o;
    }

    public void b(String str) {
        this.o = str;
    }

    public String h() {
        return this.g;
    }

    public String f() {
        return this.f;
    }

    public String a() {
        return this.d;
    }

    public void d(String str) {
        this.d = str;
    }

    public String i() {
        TodoTaskInterface todoTaskInterface = this.k;
        if (todoTaskInterface != null) {
            return todoTaskInterface.getProgress();
        }
        if (!TextUtils.isEmpty(this.g)) {
            int iA = qrs.a(this.g);
            return qre.e(R.plurals.IDS_hw_todo_cal_unit, iA, UnitUtil.e(qrs.a(this.d), 1, 0), UnitUtil.e(iA, 1, 0));
        }
        return "";
    }

    public int d() {
        return this.f37755a;
    }

    public void c(int i) {
        this.f37755a = i;
    }
}
