package com.huawei.health.health.utils.functionsetcard;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class FunctionSetBean implements Comparable<FunctionSetBean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CharSequence f7075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7076c;
    private View d;
    private CharSequence e;
    private String f;
    private FunctionSetType g;
    private boolean h;
    private CharSequence i;
    private String j;
    private CharSequence k;
    private int l;
    private Drawable m;
    private Drawable n;
    private CharSequence o;
    private CharSequence p;
    private int q;
    private String r;
    private CharSequence s;
    private String t;
    private ViewType y;

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f7077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CharSequence f7078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private View f7079c;
        private CharSequence d;
        private int e;
        private FunctionSetType f;
        private String g;
        private CharSequence h;
        private CharSequence i;
        private boolean j;
        private int k;
        private Drawable l;
        private CharSequence m;
        private Drawable n;
        private CharSequence o;
        private ViewType q;
        private String r;
        private CharSequence s;
        private String t;

        public c(String str) {
            this.r = str;
        }

        public c b(Context context) {
            this.f7077a = context;
            return this;
        }

        public c c(CharSequence charSequence) {
            this.m = charSequence;
            return this;
        }

        public c d(String str) {
            this.m = str;
            return this;
        }

        public c g(CharSequence charSequence) {
            this.o = charSequence;
            return this;
        }

        public c e(CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }

        public c a(CharSequence charSequence) {
            this.f7078b = charSequence;
            return this;
        }

        public c j(CharSequence charSequence) {
            this.s = charSequence;
            return this;
        }

        public c c(String str) {
            this.g = str;
            return this;
        }

        public c e(FunctionSetType functionSetType) {
            this.f = functionSetType;
            return this;
        }

        public c a(boolean z) {
            this.j = z;
            return this;
        }

        public c b(Drawable drawable) {
            this.n = drawable;
            return this;
        }

        public c d(CharSequence charSequence) {
            this.i = charSequence;
            return this;
        }

        public FunctionSetBean a() {
            return new FunctionSetBean(this);
        }

        public c c(ViewType viewType) {
            this.q = viewType;
            return this;
        }

        public c d(List<HiHealthData> list) {
            if (njy.e(list)) {
                return this;
            }
            Iterator<HiHealthData> it = list.iterator();
            int iHash = 1;
            while (it.hasNext()) {
                iHash = Objects.hash(Integer.valueOf(it.next().hashCode()), Integer.valueOf(iHash));
            }
            this.e = iHash;
            return this;
        }

        public c b(CharSequence charSequence) {
            this.h = charSequence;
            return this;
        }

        public c e(Drawable drawable) {
            this.l = drawable;
            return this;
        }
    }

    public enum ViewType {
        EMPTY_VIEW(0),
        DATA_VIEW(1),
        CARD_MANAGER_VIEW(2);

        private int defaultIndex;

        ViewType(int i) {
            this.defaultIndex = i;
        }
    }

    public FunctionSetBean(c cVar) {
        if (cVar != null) {
            this.r = cVar.r;
            this.k = cVar.m;
            this.p = cVar.o;
            this.f7075b = cVar.f7078b;
            this.e = cVar.d;
            this.s = cVar.s;
            this.f = cVar.g;
            this.l = cVar.k;
            this.g = cVar.f;
            this.y = cVar.q;
            this.f7074a = cVar.f7077a;
            this.d = cVar.f7079c;
            this.h = cVar.j;
            this.i = cVar.i;
            this.f7076c = cVar.e;
            this.o = cVar.h;
            this.t = cVar.t;
            this.m = cVar.l;
            this.n = cVar.n;
            return;
        }
        LogUtil.j("FunctionSetBean", "builder is null");
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof FunctionSetBean)) {
            return ((FunctionSetBean) obj).m().equals(m());
        }
        return false;
    }

    public int hashCode() {
        return k();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(FunctionSetBean functionSetBean) {
        return this.l > functionSetBean.k() ? 0 : -1;
    }

    public String m() {
        return this.r;
    }

    public CharSequence l() {
        return this.k;
    }

    public void d(CharSequence charSequence) {
        this.k = charSequence;
    }

    public CharSequence n() {
        return this.p;
    }

    public void f(CharSequence charSequence) {
        this.p = charSequence;
    }

    public CharSequence c() {
        return this.e;
    }

    public void c(CharSequence charSequence) {
        this.e = charSequence;
    }

    public CharSequence e() {
        return this.f7075b;
    }

    public void a(CharSequence charSequence) {
        this.f7075b = charSequence;
    }

    public int p() {
        return this.q;
    }

    public void d(int i) {
        this.q = i;
    }

    public int a() {
        return this.f7076c;
    }

    public CharSequence t() {
        return this.s;
    }

    public void h(CharSequence charSequence) {
        this.s = charSequence;
    }

    public String i() {
        return this.f;
    }

    public int k() {
        return this.l;
    }

    public FunctionSetType q() {
        return this.g;
    }

    public ViewType r() {
        return this.y;
    }

    public void e(ViewType viewType) {
        this.y = viewType;
    }

    public void a(boolean z) {
        this.h = z;
    }

    public boolean g() {
        return this.h;
    }

    public void b(Drawable drawable) {
        this.n = drawable;
    }

    public Drawable j() {
        return this.n;
    }

    public void d(View view) {
        this.d = view;
    }

    public View d() {
        return this.d;
    }

    public void e(CharSequence charSequence) {
        this.i = charSequence;
    }

    public CharSequence b() {
        return this.i;
    }

    public CharSequence h() {
        return this.o;
    }

    public void b(CharSequence charSequence) {
        this.o = charSequence;
    }

    public String o() {
        return this.t;
    }

    public void b(String str) {
        this.t = str;
    }

    public Drawable f() {
        return this.m;
    }

    public void a(Drawable drawable) {
        this.m = drawable;
    }

    public String toString() {
        return "FunctionSetBean{mTitle='" + this.r + "', mTime='" + ((Object) this.k) + "', mData=" + ((Object) this.e) + ", mUnit='" + ((Object) this.s) + "', mDescription='" + this.f + "', mSortKey=" + this.l + ", mIsShowTag='" + this.j + "', mFunctionSetType=" + this.g + ", mViewType=" + this.y + ", mContext=" + this.f7074a + ", mIsShowRedDot=" + this.h + ", mCardView=" + this.d + ", mDataType='" + ((Object) this.i) + "', mUniqueCode=" + this.q + '}';
    }
}
