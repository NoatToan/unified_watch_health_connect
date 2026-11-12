package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class pqk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinkedList<Object> f45838b = new LinkedList<>();

    public void e(Integer num) {
        this.f45838b.add(num);
    }

    public void d(Double d) {
        this.f45838b.add(d);
    }

    public void a(String str) {
        this.f45838b.add(str);
    }

    public boolean d() {
        return this.f45838b.isEmpty();
    }

    public boolean c() {
        if (d()) {
            return false;
        }
        Object objPeekFirst = this.f45838b.peekFirst();
        return (objPeekFirst instanceof Integer) || (objPeekFirst instanceof Double);
    }

    public boolean a() {
        return !d() && (this.f45838b.peekFirst() instanceof String);
    }

    public Number b() {
        if (!c()) {
            LogUtil.e("MultilingualAudio_BusinessInput", "first item is not number");
            return 0;
        }
        return (Number) this.f45838b.pollFirst();
    }

    public String e() {
        if (!a()) {
            LogUtil.e("MultilingualAudio_BusinessInput", "first item is not url");
            return "";
        }
        return (String) this.f45838b.pollFirst();
    }

    public pqk b(List<Integer> list) {
        if (list.isEmpty()) {
            return this;
        }
        if (this.f45838b.size() != list.size()) {
            LogUtil.e("MultilingualAudio_BusinessInput", "sequence size not equal to data size");
            return this;
        }
        LinkedList<Object> linkedList = new LinkedList<>();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(this.f45838b.get(it.next().intValue()));
        }
        pqk pqkVar = new pqk();
        pqkVar.f45838b = linkedList;
        return pqkVar;
    }

    public String toString() {
        return "BusinessInputParameter{mInputData=" + this.f45838b + '}';
    }
}
