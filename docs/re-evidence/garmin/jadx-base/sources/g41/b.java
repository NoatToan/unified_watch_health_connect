package g41;

import f12.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import w13.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lg41/b;", "Lg41/a;", "Lf12/l;", "prefs", "<init>", "(Lf12/l;)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements g41.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f75783a;

    static {
        new a(null);
    }

    public b(l lVar) {
        lVar.getClass();
        this.f75783a = lVar;
    }

    @Override // g41.a
    public final y31.a a() {
        String strA4 = this.f75783a.A4("key_ohrv_selected_overlays", "");
        Object obj = null;
        if (strA4 == null || strA4.length() <= 0) {
            return null;
        }
        c cVar = y31.a.f194366d;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            Object next = bVarN.next();
            if (s.g(String.valueOf(((y31.a) next).f194367a), strA4)) {
                obj = next;
                break;
            }
        }
        return (y31.a) obj;
    }

    @Override // g41.a
    public final void b(y31.a aVar) {
        String strValueOf;
        if (aVar == null || (strValueOf = String.valueOf(aVar.f194367a)) == null) {
            strValueOf = "";
        }
        this.f75783a.S("key_ohrv_selected_overlays", strValueOf);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lg41/b$a;", "", "<init>", "()V", "", "USER_OHRV_SELECTED_OVERLAYS", "Ljava/lang/String;", "EMPTY_STRING", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
