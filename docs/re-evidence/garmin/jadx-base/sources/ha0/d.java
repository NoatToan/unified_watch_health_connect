package ha0;

import android.content.Context;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lha0/d;", "", "<init>", "()V", "a", "b", "Lha0/d$a;", "Lha0/d$b;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lha0/d$a;", "Lha0/d;", "Lkotlin/Function1;", "Landroid/content/Context;", "", "getLabel", "<init>", "(Le23/l;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l<Context, String> f82628a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Context, String> lVar) {
            super(null);
            lVar.getClass();
            this.f82628a = lVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f82628a, ((a) obj).f82628a);
        }

        public final int hashCode() {
            return this.f82628a.hashCode();
        }

        public final String toString() {
            return "Category(getLabel=" + this.f82628a + ")";
        }
    }

    public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private d() {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lha0/d$b;", "Lha0/d;", "Lkotlin/Function1;", "Landroid/content/Context;", "", "getLabel", "Lzf2/d;", "activityType", "", "isSelected", "<init>", "(Le23/l;Lzf2/d;Z)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l<Context, String> f82629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zf2.d f82630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f82631c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super Context, String> lVar, zf2.d dVar, boolean z14) {
            super(null);
            lVar.getClass();
            dVar.getClass();
            this.f82629a = lVar;
            this.f82630b = dVar;
            this.f82631c = z14;
        }

        public static b a(b bVar, int i14) {
            l<Context, String> lVar = bVar.f82629a;
            zf2.d dVar = bVar.f82630b;
            boolean z14 = (i14 & 4) != 0 ? bVar.f82631c : true;
            bVar.getClass();
            lVar.getClass();
            dVar.getClass();
            return new b(lVar, dVar, z14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f82629a, bVar.f82629a) && this.f82630b == bVar.f82630b && this.f82631c == bVar.f82631c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f82631c) + ((this.f82630b.hashCode() + (this.f82629a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            boolean z14 = this.f82631c;
            StringBuilder sb3 = new StringBuilder("Item(getLabel=");
            sb3.append(this.f82629a);
            sb3.append(", activityType=");
            sb3.append(this.f82630b);
            sb3.append(", isSelected=");
            return hb.a.k(sb3, z14, ")");
        }

        public /* synthetic */ b(l lVar, zf2.d dVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(lVar, dVar, (i14 & 4) != 0 ? false : z14);
        }
    }
}
