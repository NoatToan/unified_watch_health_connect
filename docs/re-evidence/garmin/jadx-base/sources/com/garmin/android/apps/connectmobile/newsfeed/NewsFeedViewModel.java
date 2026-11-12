package com.garmin.android.apps.connectmobile.newsfeed;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.e0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import fo1.f;
import ht1.v;
import hz0.m;
import hz0.q;
import java.util.Iterator;
import o13.r;
import o13.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;
import v13.i;
import vb.h;
import yc.h3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedViewModel;", "Lcom/garmin/android/apps/connectmobile/e0$b;", "", "Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedItem;", "<init>", "()V", "a", "PostUpdatingError", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NewsFeedViewModel extends e0.b<String, NewsFeedItem> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f39455j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wg0.a f39456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f39457c = (m) KoinJavaComponent.get$default(m.class, null, null, 6, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f39458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ei0.d f39459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f39460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qz0.a f39461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f39462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f39463i;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel$createPagingSource$1", f = "NewsFeedViewModel.kt", l = {294, 295}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public qz0.a f39464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f39465b;

        public b(t13.d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return NewsFeedViewModel.this.new b(dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            qz0.a aVar;
            qz0.a aVar2;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f39465b;
            NewsFeedViewModel newsFeedViewModel = NewsFeedViewModel.this;
            if (i14 == 0) {
                r.b(obj);
                aVar = newsFeedViewModel.f39461g;
                this.f39464a = aVar;
                this.f39465b = 1;
                obj = newsFeedViewModel.a3(this);
                if (obj != aVar3) {
                }
                return aVar3;
            }
            if (i14 == 1) {
                aVar = this.f39464a;
                r.b(obj);
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = this.f39464a;
                r.b(obj);
            }
            aVar2.f148602e = (nj1.e) obj;
            return Unit.INSTANCE;
            aVar.f148601d = (Integer) obj;
            qz0.a aVar4 = newsFeedViewModel.f39461g;
            this.f39464a = aVar4;
            this.f39465b = 2;
            Object objY4 = newsFeedViewModel.y4(this);
            if (objY4 != aVar3) {
                aVar2 = aVar4;
                obj = objY4;
                aVar2.f148602e = (nj1.e) obj;
                return Unit.INSTANCE;
            }
            return aVar3;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel", f = "NewsFeedViewModel.kt", l = {68}, m = "getMyFollowingsCount", v = 2)
    public static final class c extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f39467a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f39469c;

        public c(t13.d<? super c> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f39467a = obj;
            this.f39469c |= Integer.MIN_VALUE;
            return NewsFeedViewModel.this.a3(this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel", f = "NewsFeedViewModel.kt", l = {63}, m = "getUserPrivacySettings", v = 2)
    public static final class d extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f39470a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f39472c;

        public d(t13.d<? super d> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f39470a = obj;
            this.f39472c |= Integer.MIN_VALUE;
            return NewsFeedViewModel.this.y4(this);
        }
    }

    static {
        new a(null);
    }

    public NewsFeedViewModel() {
        f.f72522b.getClass();
        this.f39458d = f.a.a();
        this.f39459e = (ei0.d) KoinJavaComponent.get$default(ei0.d.class, null, null, 6, null);
        this.f39460f = o13.m.b(new v(15));
        com.garmin.android.apps.connectmobile.newsfeed.a.f39473a.getClass();
        this.f39461g = com.garmin.android.apps.connectmobile.newsfeed.a.f39474b;
        p2 p2VarA = q2.a(null);
        this.f39462h = p2VarA;
        this.f39463i = s.d(p2VarA);
    }

    public final void A4() {
        this.f39461g.f148607j = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a3(t13.d<? super Integer> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i14 = cVar.f39469c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f39469c = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objA3 = cVar.f39467a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar.f39469c;
        if (i15 == 0) {
            r.b(objA3);
            cVar.f39469c = 1;
            objA3 = this.f39459e.a3(cVar);
            if (objA3 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA3);
        }
        v2 v2Var = (v2) objA3;
        if (v2Var instanceof v2.b) {
            return (Integer) ((v2.b) v2Var).f47386a;
        }
        return null;
    }

    @Override // com.garmin.android.apps.connectmobile.e0.b
    public final h3<String, NewsFeedItem> x4(Context context) {
        return new qz0.b(this.f39457c, this.f39459e, this.f39461g, new b(null), new ho0.a(context, 2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object y4(t13.d<? super nj1.e> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i14 = dVar2.f39472c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar2.f39472c = i14 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objJ = dVar2.f39470a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar2.f39472c;
        if (i15 == 0) {
            r.b(objJ);
            dVar2.f39472c = 1;
            m mVar = this.f39457c;
            mVar.getClass();
            objJ = f0.J(mVar, new q(mVar, null), dVar2);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            return (nj1.e) ((v2.b) v2Var).f47386a;
        }
        return null;
    }

    public final void z4(wg0.a aVar) {
        aVar.getClass();
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "NewsFeedViewModel", "update");
        qz0.a aVar3 = this.f39461g;
        Iterator<NewsFeedItem> it = aVar3.f148598a.iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i14 = -1;
                break;
            }
            NewsFeedItem next = it.next();
            if (next instanceof NewsFeedItem.ActivityPost) {
                wg0.a activityPost = ((NewsFeedItem.ActivityPost) next).getActivityPost();
                activityPost.getClass();
                wg0.a.F.getClass();
                if (wg0.a.P.b(activityPost, aVar)) {
                    break;
                }
            }
            i14++;
        }
        if (i14 != -1) {
            aVar3.f148598a.set(i14, new NewsFeedItem.ActivityPost(aVar));
            A4();
            e0.b.a aVar4 = this.f34755a;
            if (aVar4 != null) {
                aVar4.a(true);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedViewModel$PostUpdatingError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "Generic", "ImageTooLarge", "Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedViewModel$PostUpdatingError$Generic;", "Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedViewModel$PostUpdatingError$ImageTooLarge;", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class PostUpdatingError extends Exception {
        public static final int $stable = 8;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedViewModel$PostUpdatingError$Generic;", "Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedViewModel$PostUpdatingError;", "<init>", "()V", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Generic extends PostUpdatingError {
            public static final int $stable = 8;

            public Generic() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedViewModel$PostUpdatingError$ImageTooLarge;", "Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedViewModel$PostUpdatingError;", "<init>", "()V", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ImageTooLarge extends PostUpdatingError {
            public static final int $stable = 8;

            public ImageTooLarge() {
                super(null);
            }
        }

        public /* synthetic */ PostUpdatingError(j jVar) {
            this();
        }

        private PostUpdatingError() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedViewModel$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
