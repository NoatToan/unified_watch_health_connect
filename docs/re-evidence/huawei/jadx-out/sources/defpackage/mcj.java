package defpackage;

import android.graphics.Rect;
import com.huawei.hwcommonmodel.application.BaseApplication;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mcj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f41416b = BaseApplication.getContext().getFilesDir() + "/watchfacePhoto/background/";
    private int d;
    private boolean e;
    private List<String> f;
    private int j;
    private ArrayList<Rect> h = new ArrayList<>(16);
    private ArrayList<String> g = new ArrayList<>(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41417a = f41416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Rect f41418c = new Rect();

    public List<String> j() {
        return this.f;
    }

    public void c(List<String> list) {
        this.f = list;
    }

    public ArrayList<String> c() {
        return this.g;
    }

    public String d() {
        return this.f41417a;
    }

    public void c(String str) {
        this.f41417a = str;
    }

    public Rect a() {
        return this.f41418c;
    }

    public void c(Rect rect) {
        this.f41418c = rect;
    }

    public int e() {
        return this.j;
    }

    public int b() {
        return this.d;
    }

    public boolean f() {
        return this.e;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public void c(int i, int i2) {
        this.j = i;
        this.d = i2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("clipRect: clipRect.left='").append(this.f41418c.left);
        stringBuffer.append(", clipRect.top=").append(this.f41418c.top);
        stringBuffer.append(", clipRect.right =").append(this.f41418c.right);
        stringBuffer.append(", clipRect.bottom=").append(this.f41418c.bottom);
        stringBuffer.append(", outputWidth=").append(this.j);
        stringBuffer.append(", outputHeight=").append(this.d);
        return stringBuffer.toString();
    }
}
