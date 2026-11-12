package xz0;

import android.content.Context;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c22.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.e0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.notifications.model.InboxRequestItem;
import ei0.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import li0.l0;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yc.h3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lxz0/p;", "Lcom/garmin/android/apps/connectmobile/e0$b;", "", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem;", "", "<init>", "()V", "a", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends e0.b<String, InboxRequestItem<?>> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f192812n = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f192813b = new t0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f192814c = o13.m.b(new xh0.d(8));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f192815d = o13.m.b(new xh0.d(9));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a22.i f192816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xz0.c f192817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jm0.b f192818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tz0.a f192819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ve0.b f192820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final te0.d f192821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f12.l f192822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a0 f192823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0<Unit> f192824m;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f192825a;

        static {
            int[] iArr = new int[ue0.c.values().length];
            try {
                iArr[ue0.c.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ue0.c.ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f192825a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xz0/p$c", "Lli0/f;", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends li0.f {
        public c(b0 b0Var, List<? extends ki0.a.b.EnumC2007a> list, List<? extends ki0.a.b.EnumC2007a> list2) {
            super(b0Var, list, list2);
        }

        @Override // li0.f
        public final void l(int i14, String str) {
            o(str);
        }

        @Override // li0.f
        public final void n(String str, l0 l0Var) {
            o(str);
        }

        public final void o(String str) {
            Object next;
            p pVar = p.this;
            List<InboxRequestItem<?>> list = pVar.f192817f.f192758a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof InboxRequestItem.FollowRequest) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((InboxRequestItem.FollowRequest) next).getInboxRequestDTO().getDisplayName(), str));
            if (((InboxRequestItem.FollowRequest) next) != null) {
                pVar.a();
            }
        }
    }

    static {
        new a(null);
    }

    public p() {
        a22.i.f537b.getClass();
        this.f192816e = a22.i.a.a();
        this.f192817f = new xz0.c(null, null, false, 0, 15, null);
        this.f192818g = (jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null);
        this.f192819h = (tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null);
        this.f192820i = (ve0.b) KoinJavaComponent.get$default(ve0.b.class, null, null, 6, null);
        this.f192821j = (te0.d) KoinJavaComponent.get$default(te0.d.class, null, null, 6, null);
        f12.l.f68084a.getClass();
        this.f192822k = f12.l.a.a();
        this.f192823l = new a0(null, null, null, 7, null);
        this.f192824m = new y0<>();
        new c(v1.a(this), p13.w.c(ki0.a.b.EnumC2007a.DECLINE_REQUEST), p13.w.c(ki0.a.b.EnumC2007a.DECLINE_REQUEST_REVERTED));
    }

    public final void a() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "InboxRequestViewModel", "refresh");
        xz0.c cVar = this.f192817f;
        cVar.f192758a.clear();
        cVar.f192760c = true;
        e0.b.a aVar2 = this.f34755a;
        if (aVar2 != null) {
            aVar2.a(false);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.e0.b
    public final h3<String, InboxRequestItem<?>> x4(Context context) {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "InboxRequestViewModel", "createPagingSource ");
        return new h((sz0.a0) this.f192814c.getValue(), (re0.h) this.f192815d.getValue(), this.f192816e, new tz1.h(context, 20), this.f192817f);
    }

    public final synchronized void y4(Context context, InboxRequestItem<?> inboxRequestItem, boolean z14) {
        try {
            inboxRequestItem.getClass();
            xz0.c cVar = this.f192817f;
            int i14 = 0;
            cVar.f192760c = false;
            Iterator<InboxRequestItem<?>> it = cVar.f192758a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i14 = -1;
                    break;
                } else if (inboxRequestItem.equals(it.next())) {
                    break;
                } else {
                    i14++;
                }
            }
            if (i14 != -1) {
                this.f192817f.f192758a.set(i14, l.a(inboxRequestItem, context, Boolean.valueOf(z14)));
            }
            e0.b.a aVar = this.f34755a;
            if (aVar != null) {
                aVar.a(true);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void z4(Context context) {
        try {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "InboxRequestViewModel", "updateRequestViewed");
            xz0.c cVar = this.f192817f;
            cVar.f192760c = false;
            int size = cVar.f192758a.size();
            for (int i14 = 0; i14 < size; i14++) {
                InboxRequestItem<?> inboxRequestItem = this.f192817f.f192758a.get(i14);
                if (p005kotlin.jvm.internal.s.g(inboxRequestItem.getViewState().getRequestViewed(), Boolean.FALSE)) {
                    this.f192817f.f192758a.set(i14, l.a(inboxRequestItem, context, null));
                }
            }
            e0.b.a aVar2 = this.f34755a;
            if (aVar2 != null) {
                aVar2.a(true);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxz0/p$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_INBOX_REQUEST_PAGE_SIZE", "I", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
