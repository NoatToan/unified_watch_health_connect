package jh2;

import android.content.Context;
import android.util.SparseArray;
import ci2.m;
import ei2.h;
import hi2.d;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import zh2.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ljh2/a;", "", "Lci2/m;", "settingsFragment", "<init>", "(Lci2/m;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f98756e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f98757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<Map<String, Object>> f98758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray<p<String, Object>> f98759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f98760d;

    static {
        new C1899a(null);
    }

    public a(m mVar) {
        mVar.getClass();
        this.f98757a = new d("MenuController", null, 2, null);
        this.f98758b = new SparseArray<>();
        this.f98759c = new SparseArray<>();
        Context contextRequireContext = mVar.requireContext();
        contextRequireContext.getClass();
        this.f98760d = contextRequireContext;
    }

    public final h a(Context context, String str) {
        this.f98757a.getClass();
        e.f204807a.getClass();
        h hVarG = ((uc0.d) e.a()).g(context, str);
        if (hVarG == null) {
            return str.equals(mh2.h.MENU_DEFAULT.f118578a) ? true : str.equals(mh2.h.MENU_HELP.f118578a) ? new gi2.a(context) : new fi2.m(context);
        }
        return hVarG;
    }

    /* JADX INFO: renamed from: jh2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljh2/a$a;", "", "<init>", "()V", "", "MENU_SEARCH_ID", "I", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C1899a {
        public /* synthetic */ C1899a(j jVar) {
            this();
        }

        private C1899a() {
        }
    }
}
