package tg0;

import android.widget.TextView;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import s70.r0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ltg0/c;", "Ltg0/d$b;", "", "text", "Lkotlin/Function1;", "Landroid/widget/TextView;", "", "viewConfigBlock", "<init>", "(Ljava/lang/String;Le23/l;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<TextView, Unit> f164495b;

    public /* synthetic */ c(String str, l lVar, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? new r0(str, 20) : lVar);
    }

    @Override // tg0.d.b
    public final l<TextView, Unit> b() {
        return this.f164495b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f164494a, cVar.f164494a) && s.g(this.f164495b, cVar.f164495b);
    }

    @Override // tg0.d.b
    /* JADX INFO: renamed from: getText, reason: from getter */
    public final String getF164494a() {
        return this.f164494a;
    }

    public final int hashCode() {
        return this.f164495b.hashCode() + (this.f164494a.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderTextModel(text=" + this.f164494a + ", viewConfigBlock=" + this.f164495b + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(String str, l<? super TextView, Unit> lVar) {
        str.getClass();
        lVar.getClass();
        this.f164494a = str;
        this.f164495b = lVar;
    }
}
