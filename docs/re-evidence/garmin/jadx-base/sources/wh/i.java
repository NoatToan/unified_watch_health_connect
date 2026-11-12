package wh;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\rB3\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lwh/i;", "", "", "statusCode", "", "Lwh/e;", "headers", "Lw63/g;", "bodySource", "Lw63/h;", "bodyString", "<init>", "(ILjava/util/List;Lw63/g;Lw63/h;)V", "a", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f185234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<e> f185235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w63.g f185236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w63.h f185237d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwh/i$a;", "", "", "statusCode", "<init>", "(I)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f185238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public w63.g f185239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f185240c = new ArrayList();

        public a(int i14) {
            this.f185238a = i14;
        }
    }

    private i(int i14, List<e> list, w63.g gVar, w63.h hVar) {
        this.f185234a = i14;
        this.f185235b = list;
        this.f185236c = gVar;
        this.f185237d = hVar;
    }

    public final w63.g a() {
        w63.g gVar = this.f185236c;
        if (gVar != null) {
            return gVar;
        }
        w63.h hVar = this.f185237d;
        if (hVar == null) {
            return null;
        }
        w63.e eVar = new w63.e();
        eVar.E(hVar);
        return eVar;
    }

    public /* synthetic */ i(int i14, List list, w63.g gVar, w63.h hVar, p005kotlin.jvm.internal.j jVar) {
        this(i14, list, gVar, hVar);
    }
}
