package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.basefitnessadvice.model.intplan.RecordData;

/* JADX INFO: loaded from: classes29.dex */
public class ghl implements RecordData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f35122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f35123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("actualCalorie")
    private float f35124c;
    private String d;

    @SerializedName("actualDistance")
    private int e;
    private int f;
    private long g;
    private int h;
    private String i;
    private String j;

    @Override // com.huawei.basefitnessadvice.model.intplan.RecordData
    public String getWorkoutId() {
        return this.j;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.RecordData
    public String getRecordId() {
        return this.i;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.RecordData
    public int getSportType() {
        return this.h;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.RecordData
    public long getStartTime() {
        return this.g;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.RecordData
    public long getEndTime() {
        return this.f35122a;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.RecordData
    public long getDuration() {
        return this.f35123b;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.RecordData
    public int getActualDistance() {
        return this.e;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.RecordData
    public float getActualCalorie() {
        return this.f35124c;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.RecordData
    public int getIsInPlan() {
        return this.f;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.RecordData
    public String getExtraInfo() {
        return this.d;
    }

    public void b(String str) {
        this.j = str;
    }

    public void d(String str) {
        this.i = str;
    }

    public void e(int i) {
        this.h = i;
    }

    public void c(long j) {
        this.g = j;
    }

    public void d(long j) {
        this.f35122a = j;
    }

    public void b(long j) {
        this.f35123b = j;
    }

    public void a(int i) {
        this.e = i;
    }

    public void d(float f) {
        this.f35124c = f;
    }

    public void c(int i) {
        this.f = i;
    }

    public void c(String str) {
        this.d = str;
    }

    public ghl d(pdr pdrVar) {
        if (pdrVar != null) {
            b(pdrVar.l());
            d(pdrVar.j());
            e(pdrVar.g());
            c(pdrVar.f());
            d(pdrVar.b());
            b(pdrVar.a());
            a(pdrVar.d());
            d(pdrVar.e());
            c(pdrVar.i());
            c(pdrVar.h());
        }
        return this;
    }
}
