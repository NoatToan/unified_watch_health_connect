package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class vhj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("endTime")
    private long f51101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("fastingLiteMode")
    private vhc f51102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("fastingLitePhases")
    private List<a> f51103c;

    @SerializedName("note")
    private String d;

    @SerializedName("startTime")
    private long e;

    public vhj(vhm vhmVar) {
        this.d = "";
        this.f51102b = vhmVar.j();
        this.e = vhmVar.o();
        this.f51101a = vhmVar.h();
        this.d = vhmVar.i();
        if (this.f51103c == null) {
            this.f51103c = new ArrayList();
        }
    }

    public vhc a() {
        return this.f51102b;
    }

    public long c() {
        return this.e;
    }

    public long b() {
        return this.f51101a;
    }

    public void c(String str) {
        this.d = str;
    }

    public List<a> d() {
        return this.f51103c;
    }

    public void f() {
        this.e /= 1000;
        this.f51101a /= 1000;
        if (njy.e(this.f51103c)) {
            return;
        }
        for (a aVar : this.f51103c) {
            if (aVar != null) {
                aVar.c();
            }
        }
    }

    public void e() {
        a aVar;
        long j = this.f51101a;
        if (j <= 0 || j > System.currentTimeMillis()) {
            this.f51101a = System.currentTimeMillis();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f51103c.size() && (aVar = this.f51103c.get(i)) != null && aVar.d < this.f51101a; i++) {
            if (aVar.e > 0 && aVar.e <= this.f51101a) {
                arrayList.add(aVar);
            } else {
                aVar.e = this.f51101a;
                arrayList.add(aVar);
                break;
            }
        }
        this.f51103c = arrayList;
    }

    public void c(List<vhm.e> list) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            return;
        }
        for (vhm.e eVar : list) {
            if (eVar != null) {
                arrayList.add(new a(eVar));
            }
        }
        this.f51103c = arrayList;
    }

    public String toString() {
        return "FastingLiteRecord{mFastingLiteMode=" + this.f51102b + ", mStartTime=" + this.e + ", mEndTime=" + this.f51101a + ", mNote='" + this.d + "', mfastingLitePhases=" + this.f51103c + '}';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: loaded from: classes19.dex */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("recordId")
        private String f51104a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("isEating")
        private boolean f51105c;

        @SerializedName("startTime")
        private long d;

        @SerializedName("endTime")
        private long e;

        private a(vhm.e eVar) {
            this.d = eVar.f();
            this.e = eVar.e();
            this.f51105c = eVar.j();
            this.f51104a = eVar.c() == 0 ? "" : String.valueOf(eVar.c());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            this.d /= 1000;
            this.e /= 1000;
        }

        public String toString() {
            return "FastingLitePhase{mIsEating=" + this.f51105c + ", mStartTime=" + this.d + ", mEndTime=" + this.e + ", mRecordId=" + this.f51104a + '}';
        }
    }
}
