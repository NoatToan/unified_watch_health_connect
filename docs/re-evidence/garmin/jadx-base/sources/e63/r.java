package e63;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u000bB+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Le63/r;", "Target", "Le63/l;", "Le63/b0;", "field", "", "", "values", "name", "<init>", "(Le63/b0;Ljava/util/List;Ljava/lang/String;)V", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class r<Target> implements l<Target> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0<Target> f63264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f63265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63266c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Le63/r$a;", "Lg63/a;", "", "<init>", "(Le63/r;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements g63.a<Target, String> {
        public a() {
        }

        @Override // g63.a
        public final String c(Object obj, String str) {
            String str2 = str;
            str2.getClass();
            r<Target> rVar = r.this;
            e63.b<Target, Integer> bVar = rVar.f63264a.f63229a;
            List<String> list = rVar.f63265b;
            int iIndexOf = list.indexOf(str2);
            int i14 = rVar.f63264a.f63230b;
            Integer numC = bVar.c(obj, Integer.valueOf(iIndexOf + i14));
            if (numC != null) {
                return list.get(numC.intValue() - i14);
            }
            return null;
        }

        @Override // g63.a
        /* JADX INFO: renamed from: getName */
        public final String getF63275b() {
            return r.this.f63266c;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.l<Target, String> {
        public b(Object obj) {
            super(1, obj, r.class, "getStringValue", "getStringValue(Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // e23.l
        public final String invoke(Object obj) {
            r rVar = (r) this.receiver;
            b0<Target> b0Var = rVar.f63264a;
            int iIntValue = b0Var.f63229a.b(obj).intValue();
            String str = (String) h0.e0(iIntValue - b0Var.f63230b, rVar.f63265b);
            if (str != null) {
                return str;
            }
            return am.j.o(b0Var.f63232d, " does not have a corresponding string representation", b71.i.i(iIntValue, "The value ", " of "));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(b0<? super Target> b0Var, List<String> list, String str) {
        b0Var.getClass();
        list.getClass();
        str.getClass();
        this.f63264a = b0Var;
        this.f63265b = list;
        this.f63266c = str;
        int size = list.size();
        int i14 = b0Var.f63231c;
        int i15 = b0Var.f63230b;
        if (size == (i14 - i15) + 1) {
            return;
        }
        throw new IllegalArgumentException(("The number of values (" + list.size() + ") in " + list + " does not match the range of the field (" + ((i14 - i15) + 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    @Override // e63.l
    public final f63.e<Target> a() {
        return new f63.j(new b(this));
    }

    @Override // e63.l
    public final g63.o<Target> b() {
        a aVar = new a();
        StringBuilder sb3 = new StringBuilder("one of ");
        List<String> list = this.f63265b;
        sb3.append(list);
        sb3.append(" for ");
        sb3.append(this.f63266c);
        return new g63.o<>(p13.w.c(new g63.u(list, aVar, sb3.toString())), j0.f134944a);
    }

    @Override // e63.l
    public final /* bridge */ /* synthetic */ n c() {
        return this.f63264a;
    }
}
