package fi;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ci.j;
import ci.k;
import com.apollographql.apollo3.cache.normalized.sql.ApolloInitializer;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import wd.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\u000eB\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lfi/d;", "Lci/k;", "Ld03/d;", "driver", "<init>", "(Ld03/d;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "name", "Lvd/d$c;", "factory", "", "useNoBackupDirectory", "(Landroid/content/Context;Ljava/lang/String;Lvd/d$c;Z)V", "(Ljava/lang/String;)V", "apollo-normalized-cache-sqlite_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class d extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d03.d f71642b;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(String str) {
        ii.a.C1789a c1789aA = gi.a.a();
        c1789aA.getClass();
        ApolloInitializer.f28438a.getClass();
        Context context = ApolloInitializer.f28439b;
        if (context == null) {
            s.m(CoreConstants.CONTEXT_SCOPE_VALUE);
            throw null;
        }
        this(new c03.d(c1789aA, context, str, new f(), null, 0, false, 112, null));
    }

    @Override // ci.k
    public final j a() {
        d03.d dVar = this.f71642b;
        dVar.getClass();
        gi.a.a().getClass();
        ArrayList arrayList = new ArrayList();
        try {
            d03.c cVarG0 = dVar.g0(null, "SELECT name FROM sqlite_master WHERE type='table' ORDER BY name;", 0, null);
            while (cVarG0.next()) {
                try {
                    String string = cVarG0.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(string);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        jg.b.l(cVarG0, th3);
                        throw th4;
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            cVarG0.close();
        } catch (Exception e4) {
            ji.a.f98763a.invoke(new Exception("An exception occurred while looking up the table names", e4));
        }
        if (!arrayList.isEmpty() && !arrayList.contains("records")) {
            n23.j.t("Apollo: Cannot find the 'records' table? (found '", arrayList, "' instead)");
            return null;
        }
        hi.a.f83775a.getClass();
        s0.f105811a.b(hi.a.class);
        return new c(new gi.c(new ii.a(dVar).f93520c));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str) {
        this(context, str, null, false, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, vd.d.c cVar) {
        this(context, str, cVar, false, 8, null);
        context.getClass();
        cVar.getClass();
    }

    public d(d03.d dVar) {
        dVar.getClass();
        this.f71642b = dVar;
    }

    public /* synthetic */ d(String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "apollo.db" : str);
    }

    public /* synthetic */ d(Context context, String str, vd.d.c cVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? "apollo.db" : str, (i14 & 4) != 0 ? new f() : cVar, (i14 & 8) != 0 ? false : z14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context, String str, vd.d.c cVar, boolean z14) {
        context.getClass();
        cVar.getClass();
        ii.a.C1789a c1789aA = gi.a.a();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this(new c03.d(c1789aA, applicationContext, str, cVar, null, 0, z14, 48, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        this(context, null, null, false, 14, null);
        context.getClass();
    }
}
