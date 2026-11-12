package d6;

import androidx.room.a0;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ld6/i;", "", "", "mask", "<init>", "(I)V", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f57760b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f57761c = new i(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f57762d = new i(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f57763e = new i(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57764a;

    public i(int i14) {
        this.f57764a = i14;
    }

    public final boolean a(i iVar) {
        int i14 = iVar.f57764a;
        int i15 = this.f57764a;
        return (i14 | i15) == i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return this.f57764a == ((i) obj).f57764a;
        }
        return false;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getF57764a() {
        return this.f57764a;
    }

    public final String toString() {
        int i14 = this.f57764a;
        if (i14 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((f57762d.f57764a & i14) != 0) {
            arrayList.add("Underline");
        }
        if ((i14 & f57763e.f57764a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return a0.m(new StringBuilder("TextDecoration["), i6.b.b(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld6/i$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
