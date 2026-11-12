package defpackage;

import android.text.SpannableStringBuilder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class uyg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SpannableStringBuilder f50739c;
    private long i;
    private SpannableStringBuilder j;
    private String l;
    private List<qjp> g = new ArrayList();
    private String h = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50738b = false;
    private long f = 0;
    private long d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f50737a = false;
    private DataInfos e = DataInfos.NoDataPlaceHolder;

    public void c(long j) {
        this.i = j;
    }

    public long b() {
        return this.i;
    }

    public void d(String str) {
        this.l = str;
    }

    public String h() {
        return this.l;
    }

    public void c(DataInfos dataInfos) {
        this.e = dataInfos;
    }

    public DataInfos c() {
        return this.e;
    }

    public void c(long j, long j2) {
        this.f = j;
        this.d = j2;
    }

    public void e(List<qjp> list) {
        this.g.clear();
        this.g.addAll(list);
    }

    public void a(String str) {
        this.h = str;
    }

    public String i() {
        return this.h;
    }

    public boolean o() {
        return this.f50738b;
    }

    public void b(boolean z) {
        this.f50738b = z;
    }

    public List<qjp> g() {
        return this.g;
    }

    public long j() {
        return this.f;
    }

    public long a() {
        return this.d;
    }

    public SpannableStringBuilder d() {
        return this.f50739c;
    }

    public SpannableStringBuilder e() {
        return this.j;
    }

    public void a(SpannableStringBuilder spannableStringBuilder) {
        this.f50739c = spannableStringBuilder;
    }

    public void e(SpannableStringBuilder spannableStringBuilder) {
        this.j = spannableStringBuilder;
    }

    public boolean f() {
        return this.f50737a;
    }

    public void a(boolean z) {
        this.f50737a = z;
    }

    public String toString() {
        return "PressureData{mDataInfos=" + this.e + ", mJumpTime=" + this.i + '}';
    }
}
