package defpackage;

import androidx.core.view.GravityCompat;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class epn implements Serializable {
    private static final long serialVersionUID = -479718036212547170L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<Object> f33317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<String> f33318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CharSequence f33319c;
    private int d = GravityCompat.START;
    private ArrayList<String> e;
    private boolean g;
    private boolean h;

    public ArrayList<String> b() {
        return this.f33318b;
    }

    public void e(ArrayList<String> arrayList) {
        this.f33318b = arrayList;
    }

    public ArrayList<Object> d() {
        return this.f33317a;
    }

    public ArrayList<String> e() {
        return this.e;
    }

    public void c(ArrayList<Object> arrayList) {
        this.f33317a = arrayList;
    }

    public void a(ArrayList<String> arrayList) {
        this.e = arrayList;
    }

    public CharSequence a() {
        return this.f33319c;
    }

    public void d(CharSequence charSequence) {
        this.f33319c = charSequence;
    }

    public void a(int i) {
        this.d = i;
    }

    public boolean c() {
        return this.g;
    }

    public void b(boolean z) {
        this.g = z;
    }

    public void a(boolean z) {
        this.h = z;
    }

    public String toString() {
        return "DeviceMeasureOperateModel [measureModelImgList=" + this.f33317a + ", measureModelGuidePrompt=" + ((Object) this.f33319c) + ", measureModelGuideGravity=" + this.d + ", measureModelShowButton=" + this.g + ", measureModelShowReselcet=" + this.h + "]";
    }
}
