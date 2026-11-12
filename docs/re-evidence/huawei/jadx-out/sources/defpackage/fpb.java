package defpackage;

import com.huawei.ui.commonui.listener.OnClickSectionListener;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class fpb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Object> f34343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Object> f34344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Object> f34345c;
    private OnClickSectionListener d;
    private List<Object> e;
    private List<Map<Object, Object>> i;

    public fpb(List<Object> list, List<Object> list2, List<Object> list3, List<Map<Object, Object>> list4, List<Object> list5, OnClickSectionListener onClickSectionListener) {
        this.f34343a = list;
        this.f34344b = list2;
        this.e = list3;
        this.i = list4;
        this.f34345c = list5;
        this.d = onClickSectionListener;
    }

    public List<Object> a() {
        return this.f34343a;
    }

    public List<Object> e() {
        return this.f34344b;
    }

    public List<Object> b() {
        return this.e;
    }

    public List<Map<Object, Object>> h() {
        return this.i;
    }

    public List<Object> d() {
        return this.f34345c;
    }

    public OnClickSectionListener c() {
        return this.d;
    }
}
