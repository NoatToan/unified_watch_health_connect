package cr0;

import java.util.ArrayList;
import java.util.Iterator;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcr0/i;", "", "Lcr0/c;", "encodingUtils", "Ldr0/a;", "instantInputBizManager", "Lcr0/b;", "deviceStatusFacade", "<init>", "(Lcr0/c;Ldr0/a;Lcr0/b;)V", "a", "instant-input_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f55336h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f55337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dr0.a f55338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f55339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f55340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f55341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f55342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k f55343g;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f55336h = gt2.b.f79005a.h("InstantInputService");
    }

    public i(c cVar, dr0.a aVar, b bVar) {
        cVar.getClass();
        aVar.getClass();
        bVar.getClass();
        this.f55337a = cVar;
        this.f55338b = aVar;
        this.f55339c = bVar;
        this.f55341e = new ArrayList();
    }

    public final void a(int i14) {
        f55336h.trace("updateView(" + i14 + ")");
        Iterator it = this.f55341e.iterator();
        while (it.hasNext()) {
            ((l) it.next()).j0(i14);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcr0/i$a;", "", "<init>", "()V", "", "VIEW_UPDATE_FLAG_SESSION_STATUS_CHANGED", "I", "VIEW_UPDATE_FLAG_CONNECTION_STATUS_CHANGED", "VIEW_UPDATE_FLAG_TEXT_CONTENT_CHANGED", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "instant-input_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
