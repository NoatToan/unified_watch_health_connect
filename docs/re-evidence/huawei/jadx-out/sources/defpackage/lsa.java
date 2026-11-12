package defpackage;

import com.huawei.hwcommonmodel.datatypes.MsgImage;
import com.huawei.hwcommonmodel.datatypes.MsgText;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class lsa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<MsgText> f40750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40751c;
    private boolean d;
    private ArrayList<MsgImage> e;

    public lsa(int i, ArrayList<MsgImage> arrayList, ArrayList<MsgText> arrayList2, boolean z) {
        this.f40751c = i;
        this.e = arrayList;
        this.f40750b = arrayList2;
        this.d = z;
    }

    public int e() {
        return ((Integer) lst.d(Integer.valueOf(this.f40751c))).intValue();
    }

    public void c(int i) {
        this.f40751c = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public ArrayList<MsgText> c() {
        return (ArrayList) lst.d(this.f40750b);
    }

    public ArrayList<MsgImage> a() {
        return (ArrayList) lst.d(this.e);
    }

    public void c(boolean z) {
        this.d = ((Boolean) lst.d(Boolean.valueOf(z))).booleanValue();
    }

    public boolean b() {
        return ((Boolean) lst.d(Boolean.valueOf(this.d))).booleanValue();
    }
}
