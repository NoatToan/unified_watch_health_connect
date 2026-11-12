package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes16.dex */
public class qpp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f46615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46616c;
    private boolean d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;

    public qpp(Context context, AttributeSet attributeSet) {
        this.f46615b = false;
        this.d = false;
        this.g = false;
        this.f = true;
        this.j = true;
        this.h = false;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.HealthTableWidget, 0, 0);
        try {
            this.f46614a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthTableWidget_cellMargin, 0);
            this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthTableWidget_cellHorizontalMargin, this.f46614a);
            this.f46616c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthTableWidget_cellVerticalMargin, this.f46614a);
            this.f46615b = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthTableWidget_columnHeaderFixed, false);
            this.d = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthTableWidget_rowHeaderFixed, false);
            this.g = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthTableWidget_statisticFixed, false);
            this.j = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthTableWidget_isShowLeftRightGrid, false);
            this.f = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthTableWidget_isShowTopBottomGrid, false);
            this.h = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthTableWidget_isShowShadow, false);
            this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthTableWidget_shadowThick, 20);
            this.p = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HealthTableWidget_shadowTop, R.drawable.common_table_shadow_top);
            this.l = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HealthTableWidget_shadowBottom, R.drawable.common_table_shadow_bottom);
            this.n = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HealthTableWidget_shadowLeft, R.drawable.common_table_shadow_left);
            this.k = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HealthTableWidget_shadowRight, R.drawable.common_table_shadow_right);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int d() {
        return this.o;
    }

    public qpp a(int i) {
        this.o = i;
        return this;
    }

    public int e() {
        return this.i;
    }

    public qpp d(int i) {
        this.i = i;
        return this;
    }

    public boolean i() {
        return this.f46615b;
    }

    public boolean n() {
        return this.d;
    }

    public boolean l() {
        return this.g;
    }

    public int b() {
        return this.f46616c;
    }

    public int c() {
        return this.e;
    }

    public boolean m() {
        return this.f;
    }

    public boolean o() {
        return this.j;
    }

    public boolean k() {
        return this.h;
    }

    public int j() {
        return this.m;
    }

    public int g() {
        return this.p;
    }

    public int a() {
        return this.l;
    }

    public int f() {
        return this.n;
    }

    public int h() {
        return this.k;
    }
}
