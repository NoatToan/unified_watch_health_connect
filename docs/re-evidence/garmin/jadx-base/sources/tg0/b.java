package tg0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ltg0/b;", "Ltg0/d;", "Ltg0/b$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ltg0/d$c;", "configurator", "<init>", "(Landroid/content/Context;Ltg0/d$c;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f164491a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, d.c cVar) {
        super(cVar);
        context.getClass();
        this.f164491a = context;
    }

    @Override // id1.c.a
    public final Class<a> a() {
        return a.class;
    }

    @Override // id1.c.a
    public final id1.c.AbstractC1775c<a> b(LayoutInflater layoutInflater, ViewGroup viewGroup, id1.c.d dVar) {
        layoutInflater.getClass();
        dVar.getClass();
        return new d.a(this, new TextView(this.f164491a), dVar);
    }

    public /* synthetic */ b(Context context, d.c cVar, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? null : cVar);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ltg0/b$a;", "Ltg0/d$b;", "", "text", "Lkotlin/Function1;", "Landroid/widget/TextView;", "", "viewConfigBlock", "<init>", "(Ljava/lang/String;Le23/l;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f164492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l<TextView, Unit> f164493b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, l<? super TextView, Unit> lVar) {
            str.getClass();
            this.f164492a = str;
            this.f164493b = lVar;
        }

        @Override // tg0.d.b
        public final l<TextView, Unit> b() {
            return this.f164493b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f164492a, aVar.f164492a) && s.g(this.f164493b, aVar.f164493b);
        }

        @Override // tg0.d.b
        /* JADX INFO: renamed from: getText, reason: from getter */
        public final String getF164492a() {
            return this.f164492a;
        }

        public final int hashCode() {
            int iHashCode = this.f164492a.hashCode() * 31;
            l<TextView, Unit> lVar = this.f164493b;
            return iHashCode + (lVar == null ? 0 : lVar.hashCode());
        }

        public final String toString() {
            return "RobotoTextModel(text=" + this.f164492a + ", viewConfigBlock=" + this.f164493b + ")";
        }

        public /* synthetic */ a(String str, l lVar, int i14, j jVar) {
            this(str, (i14 & 2) != 0 ? null : lVar);
        }
    }
}
