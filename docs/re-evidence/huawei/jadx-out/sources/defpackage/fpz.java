package defpackage;

import android.graphics.drawable.Drawable;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fpz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f34390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f34391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f34392c;
    private OnClickSectionListener d;
    private List<Drawable> e;
    private List<String> f;
    private List<String> g;
    private List<Integer> j;

    public fpz(List<Drawable> list, List<String> list2, List<String> list3, List<String> list4, List<Integer> list5, List<String> list6, List<Integer> list7, OnClickSectionListener onClickSectionListener) {
        this.e = list;
        this.f34392c = list2;
        this.g = list3;
        this.f34390a = list4;
        this.f34391b = list5;
        this.f = list6;
        this.j = list7;
        this.d = onClickSectionListener;
    }

    public List<Drawable> e() {
        return this.e;
    }

    public List<String> c() {
        return this.f34392c;
    }

    public List<String> a() {
        return this.f34390a;
    }

    public List<Integer> b() {
        return this.f34391b;
    }

    public List<String> h() {
        return this.f;
    }

    public List<Integer> j() {
        return this.j;
    }

    public OnClickSectionListener d() {
        return this.d;
    }
}
