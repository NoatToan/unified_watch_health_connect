package uu;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import o53.c2;
import p005kotlin.Metadata;
import r53.a2;
import r53.b2;
import r53.p2;
import r53.q2;
import ty1.f1;
import yc.t2;
import yc.u2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Luu/q;", "Landroidx/lifecycle/u1;", "Lzu/i;", "connectionBadgeDetailsUseCase", "Lzu/p;", "myBadgeDetailsUseCase", "Lzu/g;", "compareBadgesUseCase", "Lzu/d;", "availableBadgesListUseCase", "Lzu/m;", "earnedBadgesUseCase", "Lav/g;", "badgesRepo", "Lzu/n;", "getBadgeFilterDataUseCase", "La22/i;", "userProfileRepo", "Lru/d;", "badgesDelegate", "<init>", "(Lzu/i;Lzu/p;Lzu/g;Lzu/d;Lzu/m;Lav/g;Lzu/n;La22/i;Lru/d;)V", "a", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zu.i f172736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zu.p f172737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zu.g f172738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zu.d f172739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zu.m f172740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final av.g f172741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zu.n f172742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a22.i f172743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ru.d f172744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c2 f172745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c2 f172746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c2 f172747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c2 f172748m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f172749n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b2 f172750o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a2 f172751p;

    static {
        new a(null);
    }

    public q(zu.i iVar, zu.p pVar, zu.g gVar, zu.d dVar, zu.m mVar, av.g gVar2, zu.n nVar, a22.i iVar2, ru.d dVar2) {
        iVar.getClass();
        pVar.getClass();
        gVar.getClass();
        dVar.getClass();
        mVar.getClass();
        gVar2.getClass();
        nVar.getClass();
        iVar2.getClass();
        dVar2.getClass();
        this.f172736a = iVar;
        this.f172737b = pVar;
        this.f172738c = gVar;
        this.f172739d = dVar;
        this.f172740e = mVar;
        this.f172741f = gVar2;
        this.f172742g = nVar;
        this.f172743h = iVar2;
        this.f172744i = dVar2;
        p2 p2VarA = q2.a(com.garmin.android.apps.connectmobile.badges.service.model.r.ALL);
        this.f172749n = p2VarA;
        this.f172750o = r53.s.d(p2VarA);
        this.f172751p = yc.o.a(new t2(new u2(100, 0, false, 0, 0, 0, 62, null), null, new f1(this, 17), 2, null).f196485a, v1.a(this));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Luu/q$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "PAGING_SIZE", "I", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
