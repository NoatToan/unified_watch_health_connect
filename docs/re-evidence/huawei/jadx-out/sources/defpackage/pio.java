package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class pio {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f45445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f45446b;
    List<phz> d;

    public List<phz> c() {
        return this.d;
    }

    public void c(List<phz> list) {
        this.d = list;
    }

    public String d() {
        return this.f45446b;
    }

    public void d(String str) {
        this.f45446b = str;
    }

    public void c(String str) {
        this.f45445a = str;
    }

    public String toString() {
        StringBuffer stringBufferAppend = new StringBuffer("IndexFileStruct{version='").append(this.f45446b);
        stringBufferAppend.append("', updatedTime='").append(this.f45445a);
        stringBufferAppend.append("', plugins='").append(this.d.toString()).append("'}");
        return stringBufferAppend.toString();
    }
}
