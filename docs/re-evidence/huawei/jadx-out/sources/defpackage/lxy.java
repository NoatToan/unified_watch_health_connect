package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41103a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<lyb> f41104c = new ArrayList();
    private List<lye> d = new ArrayList();

    public int a() {
        return this.f41103a;
    }

    public void c(int i) {
        this.f41103a = i;
    }

    public List<lyb> d() {
        return this.f41104c;
    }

    public void a(List<lyb> list) {
        this.f41104c = list;
    }

    public List<lye> e() {
        return this.d;
    }

    public void c(List<lye> list) {
        this.d = list;
    }
}
