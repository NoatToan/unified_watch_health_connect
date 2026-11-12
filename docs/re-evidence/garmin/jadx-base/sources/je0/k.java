package je0;

import java.util.List;
import m63.u1;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lje0/k;", "", "", "mediaUuid", "", "Lje0/m;", "photoAccessList", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class k {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f98546c = {null, o13.m.a(o13.n.PUBLICATION, new j21.f(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<m> f98548b;

    public k(int i14, String str, List list, u1 u1Var) {
        this.f98547a = (i14 & 1) == 0 ? null : str;
        if ((i14 & 2) == 0) {
            this.f98548b = j0.f134944a;
        } else {
            this.f98548b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p005kotlin.jvm.internal.s.g(this.f98547a, kVar.f98547a) && p005kotlin.jvm.internal.s.g(this.f98548b, kVar.f98548b);
    }

    public final int hashCode() {
        String str = this.f98547a;
        return this.f98548b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return fb1.c.o("PetPhotoUploadResponse(mediaUuid=", this.f98547a, ", photoAccessList=", this.f98548b, ")");
    }

    /* JADX INFO: renamed from: je0.k$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lje0/k$b;", "", "<init>", "()V", "Li63/c;", "Lje0/k;", "serializer", "()Li63/c;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<k> serializer() {
            return a.f98549a;
        }

        private Companion() {
        }
    }

    public k() {
        this((String) null, (List) null, 3, (p005kotlin.jvm.internal.j) null);
    }

    public k(String str, List<m> list) {
        list.getClass();
        this.f98547a = str;
        this.f98548b = list;
    }

    public k(String str, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? j0.f134944a : list);
    }
}
