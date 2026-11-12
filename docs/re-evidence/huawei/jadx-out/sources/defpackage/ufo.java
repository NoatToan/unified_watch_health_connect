package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ufo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50037a;
    private final List<ufm> d;
    private final int e;

    public ufo(int i, String str, List<ufm> list) {
        this.e = i;
        this.f50037a = str;
        this.d = list;
    }

    public int d() {
        return this.e;
    }

    public String c() {
        return this.f50037a;
    }

    public List<ufm> a() {
        return this.d;
    }

    public String toString() {
        return "QuestionBean [questionId=" + this.e + ", description=" + this.f50037a + ", questionOptions=" + this.d + "]";
    }
}
