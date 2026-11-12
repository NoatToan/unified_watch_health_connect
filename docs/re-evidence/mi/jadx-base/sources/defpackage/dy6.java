package defpackage;

import com.miui.circulate.api.bean.ExtraBundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class dy6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<Integer> f16051b;
    public final ExtraBundle c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<Integer> f16052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16053b;
        public ExtraBundle c;

        public b(Integer... numArr) {
            this.f16052a = new ArrayList(Arrays.asList(numArr));
        }

        public b d(int i) {
            this.f16053b = i | this.f16053b;
            return this;
        }

        public dy6 e() {
            return new dy6(this);
        }
    }

    public dy6(b bVar) {
        this.f16051b = bVar.f16052a;
        this.f16050a = bVar.f16053b;
        this.c = bVar.c;
    }
}
