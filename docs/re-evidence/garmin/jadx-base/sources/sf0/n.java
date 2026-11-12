package sf0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface n {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ int f158870v0 = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf0/n$a;", "", "<init>", "()V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f158871a = 0;

        static {
            new a();
        }

        private a() {
        }
    }

    static {
        int i14 = a.f158871a;
    }

    default String K4() {
        return fz0.d.b(((g) this).U6()).toString();
    }

    default void k2(int i14, String str) {
        g gVar = (g) this;
        if (gVar.getParentFragmentManager().G("errorPopup") == null) {
            u20.e eVarV6 = u20.e.v6(gVar.getString(i14), str);
            eVarV6.f167882a = new sa2.b(gVar, 1);
            eVarV6.show(gVar.getParentFragmentManager(), "errorPopup");
        }
    }
}
