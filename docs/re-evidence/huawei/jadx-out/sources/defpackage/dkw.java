package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
class dkw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f31922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    List<edx> f31923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f31924c;

    dkw() {
    }

    public List<edx> b() {
        return this.f31923b;
    }

    public void d(List<edx> list) {
        this.f31923b = list;
    }

    public String c() {
        return this.f31922a;
    }

    public void b(String str) {
        this.f31922a = str;
    }

    public void c(String str) {
        this.f31924c = str;
    }

    public String toString() {
        StringBuffer stringBufferAppend = new StringBuffer("IndexFileStruct{version='").append(this.f31922a);
        stringBufferAppend.append("', updatedTime='").append(this.f31924c);
        stringBufferAppend.append("', plugins='").append(this.f31923b.toString()).append("'}");
        return stringBufferAppend.toString();
    }
}
