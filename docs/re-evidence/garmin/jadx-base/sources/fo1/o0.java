package fo1;

import android.content.Context;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.feed.activity.exception.DeletedActivityException;
import com.garmin.android.apps.connectmobile.feed.activity.exception.PrivateActivityException;
import com.garmin.android.apps.connectmobile.feed.activity.exception.UnavailableReasonUnknownException;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.social.conversation.ConversationActivity;
import com.garmin.android.apps.connectmobile.social.conversation.exception.InvalidResourceIdException;
import com.garmin.android.apps.connectmobile.social.conversation.exception.InvalidResourceTypeException;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import r53.q2;
import yc.t2;
import yc.u2;
import yc.v2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0002:\u0001\u0011BO\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lfo1/o0;", "Landroidx/lifecycle/u1;", "", "Lam/c2;", "resourceType", "", "resourceId", "commentUuid", "Landroid/os/Parcelable;", "headerItem", "", "isMyActivity", "overrideShouldGoToLastComment", "openKeyboard", "allowNavigationToActivityDetails", "<init>", "(Lam/c2;Ljava/lang/String;Ljava/lang/String;Landroid/os/Parcelable;ZZZZ)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o0 extends androidx.lifecycle.u1 {
    public static final /* synthetic */ int H0 = 0;
    public boolean A;
    public int B;
    public boolean C;
    public long D;
    public boolean E;
    public final o13.t F;
    public final o13.t I;
    public final a22.i P;
    public final p2 T;
    public final e X;
    public final r53.u1 Y;
    public final r53.u1 Z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final am.c2 f72656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f72657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f72658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Parcelable f72659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f72660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f72661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f72662i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f72663j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final r53.u1 f72665k0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final fo1.f f72674v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f72675w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public mo1.d f72676x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f72677y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f72678z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f72654a = new l0(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f72655b = new c2(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f72664k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.lifecycle.y0<lj0.b> f72666l = new androidx.lifecycle.y0<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final androidx.lifecycle.y0<List<go1.w>> f72667m = new androidx.lifecycle.y0<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final androidx.lifecycle.y0<o13.p<List<go1.w>, Boolean>> f72668n = new androidx.lifecycle.y0<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.y0<o13.p<go1.w, Integer>> f72669o = new androidx.lifecycle.y0<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final androidx.lifecycle.y0<Integer> f72670p = new androidx.lifecycle.y0<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final androidx.lifecycle.y0<go1.w> f72671q = new androidx.lifecycle.y0<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final androidx.lifecycle.y0<Boolean> f72672r = new androidx.lifecycle.y0<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f72673t = new ArrayList();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72679a;

        static {
            int[] iArr = new int[am.c2.values().length];
            try {
                iArr[am.c2.ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[am.c2.NEWS_POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f72679a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "Lli0/l0;", "tempMap", "Lyc/v2;", "Lli0/d0;", "list", "<anonymous>", "(Ljava/util/Map;Lyc/v2;)Lyc/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$commentLikeFlow$1", f = "ConversationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.q<Map<String, ? extends li0.l0>, v2<li0.d0>, t13.d<? super v2<li0.d0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map f72680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ v2 f72681b;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lli0/d0;", "data", "<anonymous>", "(Lli0/d0;)Lli0/d0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$commentLikeFlow$1$1", f = "ConversationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<li0.d0, t13.d<? super li0.d0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f72682a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map<String, li0.l0> f72683b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map<String, li0.l0> map, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f72683b = map;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f72683b, dVar);
                aVar.f72682a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(li0.d0 d0Var, t13.d<? super li0.d0> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                li0.d0 d0Var = (li0.d0) this.f72682a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return li0.e0.f(d0Var, this.f72683b);
            }
        }

        public c(t13.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(Map<String, ? extends li0.l0> map, v2<li0.d0> v2Var, t13.d<? super v2<li0.d0>> dVar) {
            c cVar = new c(dVar);
            cVar.f72680a = map;
            cVar.f72681b = v2Var;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Map map = this.f72680a;
            v2 v2Var = this.f72681b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return yc.i0.e(v2Var, new a(map, null));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "Lli0/l0;", "tempMap", "Lyc/v2;", "Lli0/d0;", "list", "<anonymous>", "(Ljava/util/Map;Lyc/v2;)Lyc/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$defaultLikeFlow$1", f = "ConversationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.q<Map<String, ? extends li0.l0>, v2<li0.d0>, t13.d<? super v2<li0.d0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map f72684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ v2 f72685b;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lli0/d0;", "data", "<anonymous>", "(Lli0/d0;)Lli0/d0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$defaultLikeFlow$1$1", f = "ConversationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<li0.d0, t13.d<? super li0.d0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f72686a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map<String, li0.l0> f72687b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map<String, li0.l0> map, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f72687b = map;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f72687b, dVar);
                aVar.f72686a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(li0.d0 d0Var, t13.d<? super li0.d0> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                li0.d0 d0Var = (li0.d0) this.f72686a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return li0.e0.f(d0Var, this.f72687b);
            }
        }

        public d(t13.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(Map<String, ? extends li0.l0> map, v2<li0.d0> v2Var, t13.d<? super v2<li0.d0>> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f72684a = map;
            dVar2.f72685b = v2Var;
            return dVar2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Map map = this.f72684a;
            v2 v2Var = this.f72685b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return yc.i0.e(v2Var, new a(map, null));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"fo1/o0$e", "Lli0/f;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends li0.f {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$followAction$1$updateStateData$1", f = "ConversationViewModel.kt", l = {445}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f72689a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f72690b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f72691c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ li0.l0 f72692d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o0 o0Var, String str, li0.l0 l0Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f72690b = o0Var;
                this.f72691c = str;
                this.f72692d = l0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f72690b, this.f72691c, this.f72692d, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f72689a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    o0 o0Var = this.f72690b;
                    LinkedHashMap linkedHashMapN = p13.u0.n((Map) o0Var.T.getValue());
                    linkedHashMapN.put(this.f72691c, this.f72692d);
                    p2 p2Var = o0Var.T;
                    this.f72689a = 1;
                    p2Var.k(null, linkedHashMapN);
                    if (Unit.INSTANCE == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public e(o53.b0 b0Var) {
            super(b0Var, null, null, 6, null);
        }

        @Override // li0.f
        public final void l(int i14, String str) {
        }

        @Override // li0.f
        public final void n(String str, li0.l0 l0Var) {
            if (str == null || l0Var == null) {
                return;
            }
            o0 o0Var = o0.this;
            ge1.b.T(androidx.lifecycle.v1.a(o0Var), null, null, new a(o0Var, str, l0Var, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "Lli0/l0;", "tempMap", "Lyc/v2;", "Lli0/d0;", "list", "<anonymous>", "(Ljava/util/Map;Lyc/v2;)Lyc/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$groupActivityLikeFlow$1", f = "ConversationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.q<Map<String, ? extends li0.l0>, v2<li0.d0>, t13.d<? super v2<li0.d0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map f72693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ v2 f72694b;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lli0/d0;", "data", "<anonymous>", "(Lli0/d0;)Lli0/d0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$groupActivityLikeFlow$1$1", f = "ConversationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<li0.d0, t13.d<? super li0.d0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f72695a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map<String, li0.l0> f72696b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map<String, li0.l0> map, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f72696b = map;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f72696b, dVar);
                aVar.f72695a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(li0.d0 d0Var, t13.d<? super li0.d0> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                li0.d0 d0Var = (li0.d0) this.f72695a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return li0.e0.f(d0Var, this.f72696b);
            }
        }

        public f(t13.d<? super f> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(Map<String, ? extends li0.l0> map, v2<li0.d0> v2Var, t13.d<? super v2<li0.d0>> dVar) {
            f fVar = new f(dVar);
            fVar.f72693a = map;
            fVar.f72694b = v2Var;
            return fVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Map map = this.f72693a;
            v2 v2Var = this.f72694b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return yc.i0.e(v2Var, new a(map, null));
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0(am.c2 c2Var, String str, String str2, Parcelable parcelable, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f72656c = c2Var;
        this.f72657d = str;
        this.f72658e = str2;
        this.f72659f = parcelable;
        this.f72660g = z14;
        this.f72661h = z15;
        this.f72662i = z16;
        this.f72663j = z17;
        fo1.f.f72522b.getClass();
        this.f72674v = fo1.f.a.a();
        qo1.a.f145955b.getClass();
        qo1.a.C2749a.a();
        this.f72675w = 1;
        this.f72678z = true;
        this.D = -1L;
        this.F = o13.m.b(new fb1.d0(16));
        this.I = o13.m.b(new fb1.d0(17));
        a22.i.f537b.getClass();
        this.P = a22.i.a.a();
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        p2 p2VarA = q2.a(k0Var);
        this.T = p2VarA;
        this.X = new e(androidx.lifecycle.v1.a(this));
        int i14 = 62;
        p005kotlin.jvm.internal.j jVar = null;
        final int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        this.Y = new r53.u1(p2VarA, yc.o.a(new t2(new u2(10, i15, false, 0, i16, i17, i14, jVar), null, new e23.a(this) { // from class: fo1.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f72643b;

            {
                this.f72643b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        o0 o0Var = this.f72643b;
                        return new ho1.j(o0Var.D, o0Var.f72656c, o0Var.f72657d, o0Var.f72674v, o0Var.P, 1, 10);
                    case 1:
                        o0 o0Var2 = this.f72643b;
                        return new ho1.d(o0Var2.f72658e, o0Var2.f72674v, o0Var2.P, 1, 10);
                    default:
                        o0 o0Var3 = this.f72643b;
                        return new ho1.g(o0Var3.f72656c, o0Var3.f72657d, o0Var3.f72674v, o0Var3.P, 1, 10);
                }
            }
        }, 2, null).f196485a, androidx.lifecycle.v1.a(this)), new f(null));
        final int i18 = 1;
        this.Z = new r53.u1(p2VarA, yc.o.a(new t2(new u2(10, 0, false, 0, i16, i17, i14, jVar), null, new e23.a(this) { // from class: fo1.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f72643b;

            {
                this.f72643b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        o0 o0Var = this.f72643b;
                        return new ho1.j(o0Var.D, o0Var.f72656c, o0Var.f72657d, o0Var.f72674v, o0Var.P, 1, 10);
                    case 1:
                        o0 o0Var2 = this.f72643b;
                        return new ho1.d(o0Var2.f72658e, o0Var2.f72674v, o0Var2.P, 1, 10);
                    default:
                        o0 o0Var3 = this.f72643b;
                        return new ho1.g(o0Var3.f72656c, o0Var3.f72657d, o0Var3.f72674v, o0Var3.P, 1, 10);
                }
            }
        }, 2, null).f196485a, androidx.lifecycle.v1.a(this)), new c(null));
        final int i19 = 2;
        this.f72665k0 = new r53.u1(p2VarA, yc.o.a(new t2(new u2(10, 0, false, 0, i16, i17, i14, jVar), null, new e23.a(this) { // from class: fo1.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f72643b;

            {
                this.f72643b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        o0 o0Var = this.f72643b;
                        return new ho1.j(o0Var.D, o0Var.f72656c, o0Var.f72657d, o0Var.f72674v, o0Var.P, 1, 10);
                    case 1:
                        o0 o0Var2 = this.f72643b;
                        return new ho1.d(o0Var2.f72658e, o0Var2.f72674v, o0Var2.P, 1, 10);
                    default:
                        o0 o0Var3 = this.f72643b;
                        return new ho1.g(o0Var3.f72656c, o0Var3.f72657d, o0Var3.f72674v, o0Var3.P, 1, 10);
                }
            }
        }, i19, null).f196485a, androidx.lifecycle.v1.a(this)), new d(null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object A4(o0 o0Var, String str, ConversationCommentDTO conversationCommentDTO, v13.c cVar) {
        o1 o1Var;
        String str2 = o0Var.f72657d;
        am.c2 c2Var = o0Var.f72656c;
        if (cVar instanceof o1) {
            o1Var = (o1) cVar;
            int i14 = o1Var.f72699c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o1Var.f72699c = i14 - Integer.MIN_VALUE;
            } else {
                o1Var = new o1(o0Var, cVar);
            }
        } else {
            o1Var = new o1(o0Var, cVar);
        }
        o1 o1Var2 = o1Var;
        Object objJ = o1Var2.f72697a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = o1Var2.f72699c;
        if (i15 == 0) {
            o13.r.b(objJ);
            if (c2Var == null) {
                return new com.garmin.android.apps.connectmobile.v2.a(new InvalidResourceTypeException(c2Var), null, null, 6, null);
            }
            if (str2 == null) {
                return new com.garmin.android.apps.connectmobile.v2.a(new InvalidResourceIdException(str2), null, null, 6, null);
            }
            fo1.f fVar = o0Var.f72674v;
            o1Var2.f72699c = 1;
            fVar.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(fVar, new y(fVar, str, c2Var, str2, conversationCommentDTO, null), o1Var2);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objJ;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
            return v2Var;
        }
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            lc.u0.r();
            return null;
        }
        ConversationCommentDTO conversationCommentDTO2 = (ConversationCommentDTO) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
        conversationCommentDTO2.f44551f = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserFullName();
        f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
        String strZ4 = lVar.z4("PREMIUM_FRIEND");
        if (strZ4 == null) {
            strZ4 = lVar.q4();
        }
        String str3 = strZ4;
        conversationCommentDTO2.f44552g = str3;
        conversationCommentDTO2.f44561p = new b12.b(str3, null, null, null, null, 30, null);
        return v2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(o0 o0Var, com.garmin.android.apps.connectmobile.v2 v2Var, v13.c cVar) {
        c1 c1Var;
        List<ConversationCommentDTO> list;
        String str;
        com.garmin.android.apps.connectmobile.userprofile.model.j jVarD;
        o0Var.getClass();
        if (cVar instanceof c1) {
            c1Var = (c1) cVar;
            int i14 = c1Var.f72492e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c1Var.f72492e = i14 - Integer.MIN_VALUE;
            } else {
                c1Var = new c1(o0Var, cVar);
            }
        } else {
            c1Var = new c1(o0Var, cVar);
        }
        Object objA = c1Var.f72490c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c1Var.f72492e;
        if (i15 == 0) {
            o13.r.b(objA);
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
                return v2Var;
            }
            com.garmin.android.apps.connectmobile.v2.b bVar = (com.garmin.android.apps.connectmobile.v2.b) v2Var;
            List list2 = (List) bVar.f47386a;
            ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((ConversationCommentDTO) it.next()).f44558m);
            }
            List<String> listB1 = p13.h0.b1(p13.h0.f1(arrayList));
            a22.i iVar = o0Var.P;
            c1Var.f72488a = bVar;
            c1Var.f72489b = list2;
            c1Var.f72492e = 1;
            a22.i.a aVar2 = a22.i.f537b;
            objA = iVar.a(listB1, com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, c1Var);
            if (objA == aVar) {
                return aVar;
            }
            list = list2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = c1Var.f72489b;
            v2Var = c1Var.f72488a;
            o13.r.b(objA);
        }
        Map map = (Map) objA;
        for (ConversationCommentDTO conversationCommentDTO : list) {
            String str2 = conversationCommentDTO.f44558m;
            com.garmin.android.apps.connectmobile.userprofile.model.l lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(str2 != null ? new Integer(Integer.parseInt(str2)) : null);
            if (lVar == null || (jVarD = lVar.getProfileImageUrls()) == null || (str = jVarD.f46879h) == null) {
                str = conversationCommentDTO.f44552g;
            }
            String str3 = str;
            conversationCommentDTO.f44552g = str3;
            conversationCommentDTO.f44561p = new b12.b(str3, null, null, null, null, 30, null);
        }
        return v2Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009e, code lost:
    
        if (r14 == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c1, code lost:
    
        if (r14 == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e9, code lost:
    
        if (r14 == r0) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y4(o0 o0Var, Context context, am.c2 c2Var, String str, v13.c cVar) throws JSONException {
        m1 m1Var;
        o0 o0Var2;
        String str2;
        am.c2 c2Var2;
        Context context2;
        long j8;
        com.garmin.android.apps.connectmobile.v2 v2Var;
        o0 o0Var3;
        o0Var.getClass();
        if (cVar instanceof m1) {
            m1Var = (m1) cVar;
            int i14 = m1Var.f72637g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                m1Var.f72637g = i14 - Integer.MIN_VALUE;
            } else {
                m1Var = new m1(o0Var, cVar);
            }
        } else {
            m1Var = new m1(o0Var, cVar);
        }
        m1 m1Var2 = m1Var;
        Object objR = m1Var2.f72635e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = m1Var2.f72637g;
        if (i15 != 0) {
            if (i15 == 1) {
                j8 = m1Var2.f72634d;
                String str3 = m1Var2.f72633c;
                am.c2 c2Var3 = m1Var2.f72632b;
                context2 = m1Var2.f72631a;
                o13.r.b(objR);
                str2 = str3;
                c2Var2 = c2Var3;
                v2Var = (com.garmin.android.apps.connectmobile.v2) objR;
                if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                    com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = (com.garmin.android.apps.connectmobile.activities.newmodel.h) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
                    m1Var2.f72631a = null;
                    m1Var2.f72632b = null;
                    m1Var2.f72633c = null;
                    m1Var2.f72634d = j8;
                    m1Var2.f72637g = 2;
                    o0Var3 = o0Var;
                    objR = o0Var3.B4(context2, hVar, c2Var2, str2, m1Var2);
                }
            } else if (i15 == 2) {
                o13.r.b(objR);
                o0Var3 = o0Var;
            } else if (i15 == 3) {
                o13.r.b(objR);
                o0Var2 = o0Var;
                com.garmin.android.apps.connectmobile.v2 v2Var2 = (com.garmin.android.apps.connectmobile.v2) objR;
                if (v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.b) {
                    o0Var2.f72659f = (Parcelable) ((com.garmin.android.apps.connectmobile.v2.b) v2Var2).f47386a;
                }
            } else {
                if (i15 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objR);
                o0Var2 = o0Var;
                com.garmin.android.apps.connectmobile.v2 v2Var3 = (com.garmin.android.apps.connectmobile.v2) objR;
                if (v2Var3 instanceof com.garmin.android.apps.connectmobile.v2.b) {
                    o0Var2.f72659f = (Parcelable) ((com.garmin.android.apps.connectmobile.v2.b) v2Var3).f47386a;
                }
            }
            wg0.a aVar2 = (wg0.a) objR;
            if (aVar2 != null) {
                o0Var3.f72659f = aVar2;
            }
        } else {
            o13.r.b(objR);
            Parcelable parcelable = o0Var.f72659f;
            if (parcelable instanceof wg0.a) {
                if (o0Var.E) {
                    long j14 = Long.parseLong(str);
                    m1Var2.f72631a = context;
                    m1Var2.f72632b = c2Var;
                    m1Var2.f72633c = str;
                    m1Var2.f72634d = j14;
                    m1Var2.f72637g = 1;
                    objR = o0Var.D4(j14, m1Var2);
                    if (objR != aVar) {
                        str2 = str;
                        c2Var2 = c2Var;
                        context2 = context;
                        j8 = j14;
                        v2Var = (com.garmin.android.apps.connectmobile.v2) objR;
                        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = (com.garmin.android.apps.connectmobile.activities.newmodel.h) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
                            m1Var2.f72631a = null;
                            m1Var2.f72632b = null;
                            m1Var2.f72633c = null;
                            m1Var2.f72634d = j8;
                            m1Var2.f72637g = 2;
                            o0Var3 = o0Var;
                            objR = o0Var3.B4(context2, hVar2, c2Var2, str2, m1Var2);
                        }
                    }
                } else {
                    o0Var2 = o0Var;
                    if (((wg0.a) parcelable).f185063x) {
                        String strValueOf = String.valueOf(o0Var2.D);
                        m1Var2.f72631a = null;
                        m1Var2.f72632b = null;
                        m1Var2.f72633c = null;
                        m1Var2.f72637g = 3;
                        objR = o0Var2.F4(context, strValueOf, c2Var, m1Var2);
                    } else {
                        long j15 = Long.parseLong(str);
                        iz0.a aVarH4 = o0Var2.H4();
                        m1Var2.f72631a = null;
                        m1Var2.f72632b = null;
                        m1Var2.f72633c = null;
                        m1Var2.f72634d = j15;
                        m1Var2.f72637g = 4;
                        objR = aVarH4.r(context, j15, m1Var2);
                    }
                }
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object z4(o0 o0Var, ConversationCommentDTO conversationCommentDTO, t13.d dVar) {
        n1 n1Var;
        String str = o0Var.f72657d;
        am.c2 c2Var = o0Var.f72656c;
        if (dVar instanceof n1) {
            n1Var = (n1) dVar;
            int i14 = n1Var.f72646c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n1Var.f72646c = i14 - Integer.MIN_VALUE;
            } else {
                n1Var = new n1(o0Var, dVar);
            }
        } else {
            n1Var = new n1(o0Var, dVar);
        }
        n1 n1Var2 = n1Var;
        Object objJ = n1Var2.f72644a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = n1Var2.f72646c;
        if (i15 == 0) {
            o13.r.b(objJ);
            if (c2Var == null) {
                return new com.garmin.android.apps.connectmobile.v2.a(new InvalidResourceTypeException(c2Var), null, null, 6, null);
            }
            if (str == null) {
                return new com.garmin.android.apps.connectmobile.v2.a(new InvalidResourceIdException(str), null, null, 6, null);
            }
            fo1.f fVar = o0Var.f72674v;
            n1Var2.f72646c = 1;
            fVar.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(fVar, new x(fVar, c2Var, str, conversationCommentDTO, null), n1Var2);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objJ;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
            return v2Var;
        }
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            lc.u0.r();
            return null;
        }
        ConversationCommentDTO conversationCommentDTO2 = (ConversationCommentDTO) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
        conversationCommentDTO2.f44551f = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserFullName();
        f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
        String strZ4 = lVar.z4("PREMIUM_FRIEND");
        if (strZ4 == null) {
            strZ4 = lVar.q4();
        }
        String str2 = strZ4;
        conversationCommentDTO2.f44552g = str2;
        conversationCommentDTO2.f44561p = new b12.b(str2, null, null, null, null, 30, null);
        return v2Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0122  */
    /* JADX WARN: Code duplicated, block: B:54:0x0126  */
    /* JADX WARN: Code duplicated, block: B:55:0x014b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0173  */
    /* JADX WARN: Code duplicated, block: B:63:0x017a  */
    /* JADX WARN: Code duplicated, block: B:65:0x017e  */
    /* JADX WARN: Code duplicated, block: B:67:0x018a  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x0203  */
    /* JADX WARN: Code duplicated, block: B:85:0x020d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0232  */
    /* JADX WARN: Code duplicated, block: B:91:0x023c  */
    /* JADX WARN: Code duplicated, block: B:93:0x024c  */
    /* JADX WARN: Code duplicated, block: B:94:0x024f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [am.c2, java.lang.Object, java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v6, types: [am.c2, e23.a, java.lang.Object, java.lang.String, java.util.List, org.koin.core.qualifier.Qualifier] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    public final Object B4(Context context, com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, am.c2 c2Var, String str, v13.c cVar) {
        x0 x0Var;
        ActivityListItemDTO activityListItemDTOC;
        List<String> listM;
        Context context2;
        Object objB;
        String str2;
        am.c2 c2Var2;
        Context context3;
        List<String> list;
        String str3;
        am.c2 c2Var3;
        com.garmin.android.apps.connectmobile.v2 v2Var;
        ?? r15;
        int i14;
        Object objJ;
        Context context4;
        com.garmin.android.apps.connectmobile.v2 v2Var2;
        ActivityListItemDTO activityListItemDTO;
        Context context5;
        List<mo1.f> list2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String profileImageUrl;
        String userProfilePk;
        ?? r16;
        Map map;
        ActivityListItemDTO activityListItemDTO2;
        Map map2;
        GroupDTO.c cVar2;
        Context context6;
        Object objW;
        ActivityListItemDTO activityListItemDTO3;
        Map map3;
        Context context7;
        com.garmin.android.apps.connectmobile.v2 v2Var3;
        GroupDTO.c cVar3;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i15 = x0Var.f72859i;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                x0Var.f72859i = i15 - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(this, cVar);
            }
        } else {
            x0Var = new x0(this, cVar);
        }
        Object objA = x0Var.f72857g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = x0Var.f72859i;
        fo1.f fVar = this.f72674v;
        if (i16 == 0) {
            o13.r.b(objA);
            if (hVar == null || (activityListItemDTOC = am.s1.c(hVar)) == null) {
                return null;
            }
            listM = p13.x.m(String.valueOf(hVar.f29451d));
            fo1.e eVar = (fo1.e) KoinJavaComponent.get$default(fo1.e.class, null, null, 6, null);
            long j8 = hVar.f29448a;
            context2 = context;
            x0Var.f72851a = context2;
            x0Var.f72852b = c2Var;
            x0Var.f72853c = str;
            x0Var.f72854d = activityListItemDTOC;
            x0Var.f72855e = listM;
            x0Var.f72859i = 1;
            objB = eVar.b(j8, x0Var);
            if (objB != aVar) {
                str2 = str;
                c2Var2 = c2Var;
            }
            return aVar;
        }
        if (i16 == 1) {
            List<String> list3 = x0Var.f72855e;
            activityListItemDTOC = x0Var.f72854d;
            str2 = x0Var.f72853c;
            c2Var2 = x0Var.f72852b;
            Context context8 = x0Var.f72851a;
            o13.r.b(objA);
            listM = list3;
            context2 = context8;
            objB = objA;
        } else {
            if (i16 == 2) {
                list = x0Var.f72855e;
                activityListItemDTOC = x0Var.f72854d;
                str3 = x0Var.f72853c;
                c2Var3 = x0Var.f72852b;
                Context context9 = x0Var.f72851a;
                o13.r.b(objA);
                context3 = context9;
                v2Var = (com.garmin.android.apps.connectmobile.v2) objA;
                if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                    if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                        lc.u0.r();
                        return null;
                    }
                    mo1.d dVar = (mo1.d) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
                    activityListItemDTOC.T0 = dVar.getNumberOfComments();
                    activityListItemDTOC.S0 = dVar.getNumberOfLikes();
                    activityListItemDTOC.f29266g1 = dVar.getConversationPK();
                    activityListItemDTOC.f29263f1 = dVar.getUuid();
                    activityListItemDTOC.V0 = dVar.getLikedByUser();
                }
                x0Var.f72851a = context3;
                x0Var.f72852b = null;
                x0Var.f72853c = null;
                x0Var.f72854d = activityListItemDTOC;
                x0Var.f72855e = list;
                x0Var.f72859i = 3;
                fVar.getClass();
                r15 = 0;
                i14 = 4;
                objJ = com.garmin.android.apps.connectmobile.f0.J(fVar, new q(fVar, c2Var3, str3, null, null, true, null), x0Var);
                if (objJ != aVar) {
                    context4 = context3;
                    v2Var2 = (com.garmin.android.apps.connectmobile.v2) objJ;
                    if (!(v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                        if (!(v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.b)) {
                            lc.u0.r();
                            return r15;
                        }
                        list2 = (List) ((com.garmin.android.apps.connectmobile.v2.b) v2Var2).f47386a;
                        if (!list2.isEmpty()) {
                            arrayList = new ArrayList();
                            arrayList2 = new ArrayList();
                            arrayList3 = new ArrayList();
                            arrayList4 = new ArrayList();
                            for (mo1.f fVar2 : list2) {
                                arrayList.add(fVar2.getDisplayName());
                                arrayList2.add(fVar2.getFullName());
                                profileImageUrl = fVar2.getProfileImageUrl();
                                if (profileImageUrl == null) {
                                    profileImageUrl = "";
                                }
                                arrayList3.add(profileImageUrl);
                                userProfilePk = fVar2.getUserProfilePk();
                                if (userProfilePk != null) {
                                    list.add(userProfilePk);
                                    arrayList4.add(new Integer(Integer.parseInt(userProfilePk)));
                                }
                            }
                            activityListItemDTOC.W0 = arrayList;
                            activityListItemDTOC.X0 = arrayList2;
                            activityListItemDTOC.Y0 = arrayList3;
                            activityListItemDTOC.N1 = arrayList4;
                        }
                    }
                    x0Var.f72851a = context4;
                    x0Var.f72852b = r15;
                    x0Var.f72853c = r15;
                    x0Var.f72854d = activityListItemDTOC;
                    x0Var.f72855e = r15;
                    x0Var.f72859i = i14;
                    a22.i.a aVar2 = a22.i.f537b;
                    objA = this.P.a(list, com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, x0Var);
                    if (objA != aVar) {
                        activityListItemDTO = activityListItemDTOC;
                        context5 = context4;
                        r16 = r15;
                        map = (Map) objA;
                        if (I4()) {
                            jm0.b bVar = (jm0.b) KoinJavaComponent.get$default(jm0.b.class, r16, r16, 6, r16);
                            String strValueOf = String.valueOf(this.D);
                            x0Var.f72851a = context5;
                            x0Var.f72852b = r16;
                            x0Var.f72853c = r16;
                            x0Var.f72854d = activityListItemDTO;
                            x0Var.f72855e = r16;
                            x0Var.f72856f = map;
                            x0Var.f72859i = 5;
                            objW = bVar.w(strValueOf, x0Var);
                            if (objW != aVar) {
                                activityListItemDTO3 = activityListItemDTO;
                                map3 = map;
                                objA = objW;
                                context7 = context5;
                            }
                        } else {
                            activityListItemDTO2 = activityListItemDTO;
                            map2 = map;
                            cVar2 = GroupDTO.c.NOT_DEFINED;
                            context6 = context5;
                        }
                        activityListItemDTO2.f29272i1 *= (double) 100;
                        return wg0.j.b(activityListItemDTO2, context6, I4(), map2, cVar2, null, 16);
                    }
                }
                return aVar;
            }
            if (i16 == 3) {
                list = x0Var.f72855e;
                activityListItemDTOC = x0Var.f72854d;
                context4 = x0Var.f72851a;
                o13.r.b(objA);
                objJ = objA;
                i14 = 4;
                r15 = 0;
                v2Var2 = (com.garmin.android.apps.connectmobile.v2) objJ;
                if (!(v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                    if (!(v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.b)) {
                        lc.u0.r();
                        return r15;
                    }
                    list2 = (List) ((com.garmin.android.apps.connectmobile.v2.b) v2Var2).f47386a;
                    if (!list2.isEmpty()) {
                        arrayList = new ArrayList();
                        arrayList2 = new ArrayList();
                        arrayList3 = new ArrayList();
                        arrayList4 = new ArrayList();
                        while (r6.hasNext()) {
                            arrayList.add(fVar2.getDisplayName());
                            arrayList2.add(fVar2.getFullName());
                            profileImageUrl = fVar2.getProfileImageUrl();
                            if (profileImageUrl == null) {
                                profileImageUrl = "";
                            }
                            arrayList3.add(profileImageUrl);
                            userProfilePk = fVar2.getUserProfilePk();
                            if (userProfilePk != null) {
                                list.add(userProfilePk);
                                arrayList4.add(new Integer(Integer.parseInt(userProfilePk)));
                            }
                        }
                        activityListItemDTOC.W0 = arrayList;
                        activityListItemDTOC.X0 = arrayList2;
                        activityListItemDTOC.Y0 = arrayList3;
                        activityListItemDTOC.N1 = arrayList4;
                    }
                }
                x0Var.f72851a = context4;
                x0Var.f72852b = r15;
                x0Var.f72853c = r15;
                x0Var.f72854d = activityListItemDTOC;
                x0Var.f72855e = r15;
                x0Var.f72859i = i14;
                a22.i.a aVar3 = a22.i.f537b;
                objA = this.P.a(list, com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, x0Var);
                if (objA != aVar) {
                    activityListItemDTO = activityListItemDTOC;
                    context5 = context4;
                    r16 = r15;
                    map = (Map) objA;
                    if (I4()) {
                        jm0.b bVar2 = (jm0.b) KoinJavaComponent.get$default(jm0.b.class, r16, r16, 6, r16);
                        String strValueOf2 = String.valueOf(this.D);
                        x0Var.f72851a = context5;
                        x0Var.f72852b = r16;
                        x0Var.f72853c = r16;
                        x0Var.f72854d = activityListItemDTO;
                        x0Var.f72855e = r16;
                        x0Var.f72856f = map;
                        x0Var.f72859i = 5;
                        objW = bVar2.w(strValueOf2, x0Var);
                        if (objW != aVar) {
                            activityListItemDTO3 = activityListItemDTO;
                            map3 = map;
                            objA = objW;
                            context7 = context5;
                        }
                    } else {
                        activityListItemDTO2 = activityListItemDTO;
                        map2 = map;
                        cVar2 = GroupDTO.c.NOT_DEFINED;
                        context6 = context5;
                    }
                    activityListItemDTO2.f29272i1 *= (double) 100;
                    return wg0.j.b(activityListItemDTO2, context6, I4(), map2, cVar2, null, 16);
                }
                return aVar;
            }
            if (i16 == 4) {
                activityListItemDTO = x0Var.f72854d;
                context5 = x0Var.f72851a;
                o13.r.b(objA);
                r16 = 0;
                map = (Map) objA;
                if (I4()) {
                    jm0.b bVar3 = (jm0.b) KoinJavaComponent.get$default(jm0.b.class, r16, r16, 6, r16);
                    String strValueOf3 = String.valueOf(this.D);
                    x0Var.f72851a = context5;
                    x0Var.f72852b = r16;
                    x0Var.f72853c = r16;
                    x0Var.f72854d = activityListItemDTO;
                    x0Var.f72855e = r16;
                    x0Var.f72856f = map;
                    x0Var.f72859i = 5;
                    objW = bVar3.w(strValueOf3, x0Var);
                    if (objW != aVar) {
                        activityListItemDTO3 = activityListItemDTO;
                        map3 = map;
                        objA = objW;
                        context7 = context5;
                    }
                    return aVar;
                }
                activityListItemDTO2 = activityListItemDTO;
                map2 = map;
                cVar2 = GroupDTO.c.NOT_DEFINED;
                context6 = context5;
                activityListItemDTO2.f29272i1 *= (double) 100;
                return wg0.j.b(activityListItemDTO2, context6, I4(), map2, cVar2, null, 16);
            }
            if (i16 != 5) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map3 = x0Var.f72856f;
            activityListItemDTO3 = x0Var.f72854d;
            context7 = x0Var.f72851a;
            o13.r.b(objA);
        }
        v2Var3 = (com.garmin.android.apps.connectmobile.v2) objA;
        if (v2Var3 instanceof com.garmin.android.apps.connectmobile.v2.b) {
            cVar3 = ((GroupDTO) ((com.garmin.android.apps.connectmobile.v2.b) v2Var3).f47386a).f31578w;
            cVar3.getClass();
        } else {
            cVar3 = GroupDTO.c.NOT_DEFINED;
        }
        map2 = map3;
        cVar2 = cVar3;
        context6 = context7;
        activityListItemDTO2 = activityListItemDTO3;
        activityListItemDTO2.f29272i1 *= (double) 100;
        return wg0.j.b(activityListItemDTO2, context6, I4(), map2, cVar2, null, 16);
        com.garmin.android.apps.connectmobile.v2 v2Var4 = (com.garmin.android.apps.connectmobile.v2) objB;
        if (v2Var4 instanceof com.garmin.android.apps.connectmobile.v2.a) {
            activityListItemDTOC.f29298w = false;
            activityListItemDTOC.f29302y = false;
        } else {
            if (!(v2Var4 instanceof com.garmin.android.apps.connectmobile.v2.b)) {
                lc.u0.r();
                return null;
            }
            ps.k kVar = (ps.k) ((com.garmin.android.apps.connectmobile.v2.b) v2Var4).f47386a;
            activityListItemDTOC.f29298w = kVar.getPolylineDTO() != null;
            activityListItemDTOC.f29300x = kVar.getPolylineDTO();
            activityListItemDTOC.f29302y = kVar.getHeatmapDTO() != null;
            activityListItemDTOC.f29304z = kVar.getHeatmapDTO();
        }
        String strName = c2Var2.name();
        x0Var.f72851a = context2;
        x0Var.f72852b = c2Var2;
        x0Var.f72853c = str2;
        x0Var.f72854d = activityListItemDTOC;
        x0Var.f72855e = listM;
        x0Var.f72859i = 2;
        Object objA2 = fVar.a(strName, str2, x0Var);
        if (objA2 != aVar) {
            context3 = context2;
            list = listM;
            objA = objA2;
            str3 = str2;
            c2Var3 = c2Var2;
            v2Var = (com.garmin.android.apps.connectmobile.v2) objA;
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                    lc.u0.r();
                    return null;
                }
                mo1.d dVar2 = (mo1.d) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
                activityListItemDTOC.T0 = dVar2.getNumberOfComments();
                activityListItemDTOC.S0 = dVar2.getNumberOfLikes();
                activityListItemDTOC.f29266g1 = dVar2.getConversationPK();
                activityListItemDTOC.f29263f1 = dVar2.getUuid();
                activityListItemDTOC.V0 = dVar2.getLikedByUser();
            }
            x0Var.f72851a = context3;
            x0Var.f72852b = null;
            x0Var.f72853c = null;
            x0Var.f72854d = activityListItemDTOC;
            x0Var.f72855e = list;
            x0Var.f72859i = 3;
            fVar.getClass();
            r15 = 0;
            i14 = 4;
            objJ = com.garmin.android.apps.connectmobile.f0.J(fVar, new q(fVar, c2Var3, str3, null, null, true, null), x0Var);
            if (objJ != aVar) {
                context4 = context3;
                v2Var2 = (com.garmin.android.apps.connectmobile.v2) objJ;
                if (!(v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                    if (!(v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.b)) {
                        lc.u0.r();
                        return r15;
                    }
                    list2 = (List) ((com.garmin.android.apps.connectmobile.v2.b) v2Var2).f47386a;
                    if (!list2.isEmpty()) {
                        arrayList = new ArrayList();
                        arrayList2 = new ArrayList();
                        arrayList3 = new ArrayList();
                        arrayList4 = new ArrayList();
                        while (r6.hasNext()) {
                            arrayList.add(fVar2.getDisplayName());
                            arrayList2.add(fVar2.getFullName());
                            profileImageUrl = fVar2.getProfileImageUrl();
                            if (profileImageUrl == null) {
                                profileImageUrl = "";
                            }
                            arrayList3.add(profileImageUrl);
                            userProfilePk = fVar2.getUserProfilePk();
                            if (userProfilePk != null) {
                                list.add(userProfilePk);
                                arrayList4.add(new Integer(Integer.parseInt(userProfilePk)));
                            }
                        }
                        activityListItemDTOC.W0 = arrayList;
                        activityListItemDTOC.X0 = arrayList2;
                        activityListItemDTOC.Y0 = arrayList3;
                        activityListItemDTOC.N1 = arrayList4;
                    }
                }
                x0Var.f72851a = context4;
                x0Var.f72852b = r15;
                x0Var.f72853c = r15;
                x0Var.f72854d = activityListItemDTOC;
                x0Var.f72855e = r15;
                x0Var.f72859i = i14;
                a22.i.a aVar4 = a22.i.f537b;
                objA = this.P.a(list, com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, x0Var);
                if (objA != aVar) {
                    activityListItemDTO = activityListItemDTOC;
                    context5 = context4;
                    r16 = r15;
                    map = (Map) objA;
                    if (I4()) {
                        jm0.b bVar4 = (jm0.b) KoinJavaComponent.get$default(jm0.b.class, r16, r16, 6, r16);
                        String strValueOf4 = String.valueOf(this.D);
                        x0Var.f72851a = context5;
                        x0Var.f72852b = r16;
                        x0Var.f72853c = r16;
                        x0Var.f72854d = activityListItemDTO;
                        x0Var.f72855e = r16;
                        x0Var.f72856f = map;
                        x0Var.f72859i = 5;
                        objW = bVar4.w(strValueOf4, x0Var);
                        if (objW != aVar) {
                            activityListItemDTO3 = activityListItemDTO;
                            map3 = map;
                            objA = objW;
                            context7 = context5;
                            v2Var3 = (com.garmin.android.apps.connectmobile.v2) objA;
                            if (v2Var3 instanceof com.garmin.android.apps.connectmobile.v2.b) {
                                cVar3 = ((GroupDTO) ((com.garmin.android.apps.connectmobile.v2.b) v2Var3).f47386a).f31578w;
                                cVar3.getClass();
                            } else {
                                cVar3 = GroupDTO.c.NOT_DEFINED;
                            }
                            map2 = map3;
                            cVar2 = cVar3;
                            context6 = context7;
                            activityListItemDTO2 = activityListItemDTO3;
                        }
                    } else {
                        activityListItemDTO2 = activityListItemDTO;
                        map2 = map;
                        cVar2 = GroupDTO.c.NOT_DEFINED;
                        context6 = context5;
                    }
                    activityListItemDTO2.f29272i1 *= (double) 100;
                    return wg0.j.b(activityListItemDTO2, context6, I4(), map2, cVar2, null, 16);
                }
            }
        }
        return aVar;
    }

    public final androidx.lifecycle.j C4(String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        l0 l0Var = this.f72654a;
        l0Var.getClass();
        return o53.f0.N(new d0(l0Var, str, str2, str3, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object D4(long j8, v13.c cVar) throws JSONException {
        a1 a1Var;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i14 = a1Var.f72462c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a1Var.f72462c = i14 - Integer.MIN_VALUE;
            } else {
                a1Var = new a1(this, cVar);
            }
        } else {
            a1Var = new a1(this, cVar);
        }
        Object objA = a1Var.f72460a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a1Var.f72462c;
        if (i15 == 0) {
            o13.r.b(objA);
            fo1.e eVar = (fo1.e) this.I.getValue();
            a1Var.f72462c = 1;
            objA = eVar.a(j8, a1Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objA;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
            com.garmin.android.apps.connectmobile.v2.a aVar2 = (com.garmin.android.apps.connectmobile.v2.a) v2Var;
            Integer num = aVar2.f47384b;
            if (num != null && num.intValue() == 403) {
                return new com.garmin.android.apps.connectmobile.v2.a(new PrivateActivityException(), aVar2.f47384b, null, 4, null);
            }
            return (num != null && num.intValue() == 404) ? new com.garmin.android.apps.connectmobile.v2.a(new DeletedActivityException(), aVar2.f47384b, null, 4, null) : aVar2;
        }
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.v2.b bVar = (com.garmin.android.apps.connectmobile.v2.b) v2Var;
        JSONObject jSONObject = new JSONObject(new Gson().toJson((ps.r) bVar.f47386a));
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = new com.garmin.android.apps.connectmobile.activities.newmodel.h();
        hVar.k(jSONObject);
        return new com.garmin.android.apps.connectmobile.v2.b(hVar, bVar.f47387b, null, null, 12, null);
    }

    public final androidx.lifecycle.y0 E4(ConversationActivity conversationActivity, String str, am.c2 c2Var) {
        str.getClass();
        c2Var.getClass();
        androidx.lifecycle.y0 y0Var = new androidx.lifecycle.y0();
        w9.a aVarA = androidx.lifecycle.v1.a(this);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new f1(y0Var, this, conversationActivity, str, c2Var, null), 2);
        return y0Var;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0137  */
    /* JADX WARN: Code duplicated, block: B:53:0x013b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0144  */
    /* JADX WARN: Code duplicated, block: B:57:0x0153  */
    /* JADX WARN: Code duplicated, block: B:59:0x0160  */
    /* JADX WARN: Code duplicated, block: B:61:0x0164  */
    /* JADX WARN: Code duplicated, block: B:63:0x016c  */
    /* JADX WARN: Code duplicated, block: B:71:0x019e  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:85:0x021c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0221  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object F4(Context context, String str, am.c2 c2Var, v13.c cVar) throws JSONException {
        g1 g1Var;
        jm0.b bVar;
        am.c2 c2Var2;
        String str2;
        Context context2;
        Object obj;
        am.c2 c2Var3;
        Context context3;
        String str3;
        com.garmin.android.apps.connectmobile.v2 v2Var;
        Exception exc;
        int i14;
        com.garmin.android.apps.connectmobile.v2 v2Var2;
        com.garmin.android.apps.connectmobile.v2 v2Var3;
        String str4 = str;
        if (cVar instanceof g1) {
            g1Var = (g1) cVar;
            int i15 = g1Var.f72555j;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                g1Var.f72555j = i15 - Integer.MIN_VALUE;
            } else {
                g1Var = new g1(this, cVar);
            }
        } else {
            g1Var = new g1(this, cVar);
        }
        g1 g1Var2 = g1Var;
        Object objB4 = g1Var2.f72553h;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = g1Var2.f72555j;
        if (i16 == 0) {
            o13.r.b(objB4);
            String str5 = this.f72657d;
            if (str5 == null) {
                return new com.garmin.android.apps.connectmobile.v2.a(new Exception("resourceId is null"), null, null, 6, null);
            }
            jm0.b bVar2 = (jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null);
            g1Var2.f72546a = context;
            g1Var2.f72547b = str4;
            g1Var2.f72548c = c2Var;
            g1Var2.f72549d = str5;
            g1Var2.f72550e = bVar2;
            g1Var2.f72555j = 1;
            Object objW = bVar2.w(str4, g1Var2);
            if (objW != obj2) {
                bVar = bVar2;
                c2Var2 = c2Var;
                str2 = str5;
                context2 = context;
                obj = objW;
            }
            return obj2;
        }
        if (i16 == 1) {
            jm0.b bVar3 = g1Var2.f72550e;
            String str6 = g1Var2.f72549d;
            am.c2 c2Var4 = g1Var2.f72548c;
            String str7 = g1Var2.f72547b;
            context2 = g1Var2.f72546a;
            o13.r.b(objB4);
            bVar = bVar3;
            str4 = str7;
            str2 = str6;
            obj = objB4;
            c2Var2 = c2Var4;
        } else {
            if (i16 == 2) {
                str3 = g1Var2.f72549d;
                c2Var3 = g1Var2.f72548c;
                context3 = g1Var2.f72546a;
                o13.r.b(objB4);
                v2Var = (com.garmin.android.apps.connectmobile.v2) objB4;
                str2 = str3;
                if (v2Var == null) {
                    return new com.garmin.android.apps.connectmobile.v2.a(new Exception(fb1.c.n("Unsupported resource type: ", c2Var3.name())), null, null, 6, null);
                }
                if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                    com.garmin.android.apps.connectmobile.v2.b bVar4 = (com.garmin.android.apps.connectmobile.v2.b) v2Var;
                    wg0.a aVar = (wg0.a) bVar4.f47386a;
                    if (aVar == null) {
                    }
                }
                if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                    lc.u0.r();
                    return null;
                }
                exc = ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a;
                if (exc instanceof DeletedActivityException) {
                }
                return new com.garmin.android.apps.connectmobile.v2.a(exc, null, null, 6, null);
            }
            if (i16 == 3) {
                str3 = g1Var2.f72549d;
                c2Var3 = g1Var2.f72548c;
                context3 = g1Var2.f72546a;
                o13.r.b(objB4);
                v2Var = (com.garmin.android.apps.connectmobile.v2) objB4;
                str2 = str3;
                if (v2Var == null) {
                    return new com.garmin.android.apps.connectmobile.v2.a(new Exception(fb1.c.n("Unsupported resource type: ", c2Var3.name())), null, null, 6, null);
                }
                if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                    com.garmin.android.apps.connectmobile.v2.b bVar5 = (com.garmin.android.apps.connectmobile.v2.b) v2Var;
                    wg0.a aVar2 = (wg0.a) bVar5.f47386a;
                    return aVar2 == null ? new com.garmin.android.apps.connectmobile.v2.a(new UnavailableReasonUnknownException(), null, null, 6, null) : new com.garmin.android.apps.connectmobile.v2.b(aVar2, bVar5.f47387b, null, null, 12, null);
                }
                if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                    lc.u0.r();
                    return null;
                }
                exc = ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a;
                if ((exc instanceof DeletedActivityException) || c2Var3 != am.c2.ACTIVITY) {
                    return new com.garmin.android.apps.connectmobile.v2.a(exc, null, null, 6, null);
                }
                fo1.e eVar = (fo1.e) this.I.getValue();
                long j8 = Long.parseLong(str2);
                g1Var2.f72546a = context3;
                g1Var2.f72547b = null;
                g1Var2.f72548c = c2Var3;
                g1Var2.f72549d = null;
                g1Var2.f72550e = null;
                g1Var2.f72552g = 0;
                g1Var2.f72555j = 4;
                Object objA = eVar.a(j8, g1Var2);
                if (objA != obj2) {
                    objB4 = objA;
                    i14 = 0;
                    v2Var2 = (com.garmin.android.apps.connectmobile.v2) objB4;
                    if (v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.b) {
                        if (v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.a) {
                        }
                    }
                    com.garmin.android.apps.connectmobile.v2.b bVar6 = (com.garmin.android.apps.connectmobile.v2.b) v2Var2;
                    JSONObject jSONObject = new JSONObject(new Gson().toJson((ps.r) bVar6.f47386a));
                    com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = new com.garmin.android.apps.connectmobile.activities.newmodel.h();
                    hVar.k(jSONObject);
                    g1Var2.f72546a = null;
                    g1Var2.f72547b = null;
                    g1Var2.f72548c = null;
                    g1Var2.f72549d = null;
                    g1Var2.f72550e = null;
                    g1Var2.f72551f = bVar6;
                    g1Var2.f72552g = i14;
                    g1Var2.f72555j = 5;
                    objB4 = B4(context3, hVar, c2Var3, this.f72657d, g1Var2);
                    if (objB4 != obj2) {
                        v2Var3 = v2Var2;
                    }
                }
                return obj2;
            }
            if (i16 == 4) {
                i14 = g1Var2.f72552g;
                c2Var3 = g1Var2.f72548c;
                context3 = g1Var2.f72546a;
                o13.r.b(objB4);
                v2Var2 = (com.garmin.android.apps.connectmobile.v2) objB4;
                if (v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.b) {
                    return v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.a ? new com.garmin.android.apps.connectmobile.v2.a(((com.garmin.android.apps.connectmobile.v2.a) v2Var2).f47383a, null, null, 6, null) : new com.garmin.android.apps.connectmobile.v2.a(new UnavailableReasonUnknownException(), null, null, 6, null);
                }
                com.garmin.android.apps.connectmobile.v2.b bVar7 = (com.garmin.android.apps.connectmobile.v2.b) v2Var2;
                JSONObject jSONObject2 = new JSONObject(new Gson().toJson((ps.r) bVar7.f47386a));
                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = new com.garmin.android.apps.connectmobile.activities.newmodel.h();
                hVar2.k(jSONObject2);
                g1Var2.f72546a = null;
                g1Var2.f72547b = null;
                g1Var2.f72548c = null;
                g1Var2.f72549d = null;
                g1Var2.f72550e = null;
                g1Var2.f72551f = bVar7;
                g1Var2.f72552g = i14;
                g1Var2.f72555j = 5;
                objB4 = B4(context3, hVar2, c2Var3, this.f72657d, g1Var2);
                if (objB4 != obj2) {
                    v2Var3 = v2Var2;
                }
                return obj2;
            }
            if (i16 != 5) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var3 = g1Var2.f72551f;
            o13.r.b(objB4);
        }
        wg0.a aVar3 = (wg0.a) objB4;
        aVar3.getClass();
        return new com.garmin.android.apps.connectmobile.v2.b(aVar3, ((com.garmin.android.apps.connectmobile.v2.b) v2Var3).f47387b, null, null, 12, null);
        com.garmin.android.apps.connectmobile.v2 v2Var4 = (com.garmin.android.apps.connectmobile.v2) obj;
        GroupDTO.c cVar2 = v2Var4 instanceof com.garmin.android.apps.connectmobile.v2.b ? ((GroupDTO) ((com.garmin.android.apps.connectmobile.v2.b) v2Var4).f47386a).f31578w : GroupDTO.c.NOT_DEFINED;
        int i17 = b.f72679a[c2Var2.ordinal()];
        if (i17 == 1) {
            String str8 = str2;
            GroupDTO.c cVar3 = cVar2;
            Context context4 = context2;
            cVar3.getClass();
            g1Var2.f72546a = context4;
            g1Var2.f72547b = null;
            g1Var2.f72548c = c2Var2;
            g1Var2.f72549d = str8;
            g1Var2.f72550e = null;
            g1Var2.f72555j = 2;
            Object objF = bVar.f(context4, str4, str8, cVar3, g1Var2);
            if (objF != obj2) {
                c2Var3 = c2Var2;
                context3 = context4;
                objB4 = objF;
                str3 = str8;
                v2Var = (com.garmin.android.apps.connectmobile.v2) objB4;
                str2 = str3;
                if (v2Var == null) {
                    return new com.garmin.android.apps.connectmobile.v2.a(new Exception(fb1.c.n("Unsupported resource type: ", c2Var3.name())), null, null, 6, null);
                }
                if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                    com.garmin.android.apps.connectmobile.v2.b bVar8 = (com.garmin.android.apps.connectmobile.v2.b) v2Var;
                    wg0.a aVar4 = (wg0.a) bVar8.f47386a;
                    if (aVar4 == null) {
                    }
                }
                if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                    lc.u0.r();
                    return null;
                }
                exc = ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a;
                if (exc instanceof DeletedActivityException) {
                }
                return new com.garmin.android.apps.connectmobile.v2.a(exc, null, null, 6, null);
            }
        } else {
            if (i17 != 2) {
                c2Var3 = c2Var2;
                v2Var = null;
                context3 = context2;
                if (v2Var == null) {
                    return new com.garmin.android.apps.connectmobile.v2.a(new Exception(fb1.c.n("Unsupported resource type: ", c2Var3.name())), null, null, 6, null);
                }
                if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                    com.garmin.android.apps.connectmobile.v2.b bVar9 = (com.garmin.android.apps.connectmobile.v2.b) v2Var;
                    wg0.a aVar5 = (wg0.a) bVar9.f47386a;
                    if (aVar5 == null) {
                    }
                }
                if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                    lc.u0.r();
                    return null;
                }
                exc = ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a;
                if (exc instanceof DeletedActivityException) {
                }
                return new com.garmin.android.apps.connectmobile.v2.a(exc, null, null, 6, null);
            }
            cVar2.getClass();
            g1Var2.f72546a = context2;
            g1Var2.f72547b = null;
            g1Var2.f72548c = c2Var2;
            g1Var2.f72549d = str2;
            g1Var2.f72550e = null;
            g1Var2.f72555j = 3;
            String str9 = str2;
            Context context5 = context2;
            Object objG = bVar.g(context5, str4, str9, cVar2, g1Var2);
            context3 = context5;
            if (objG != obj2) {
                c2Var3 = c2Var2;
                objB4 = objG;
                str3 = str9;
                v2Var = (com.garmin.android.apps.connectmobile.v2) objB4;
                str2 = str3;
                if (v2Var == null) {
                    return new com.garmin.android.apps.connectmobile.v2.a(new Exception(fb1.c.n("Unsupported resource type: ", c2Var3.name())), null, null, 6, null);
                }
                if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                    com.garmin.android.apps.connectmobile.v2.b bVar10 = (com.garmin.android.apps.connectmobile.v2.b) v2Var;
                    wg0.a aVar6 = (wg0.a) bVar10.f47386a;
                    if (aVar6 == null) {
                    }
                }
                if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                    lc.u0.r();
                    return null;
                }
                exc = ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a;
                if (exc instanceof DeletedActivityException) {
                }
                return new com.garmin.android.apps.connectmobile.v2.a(exc, null, null, 6, null);
            }
        }
        return obj2;
    }

    public final androidx.lifecycle.y0 G4() {
        androidx.lifecycle.y0 y0Var = new androidx.lifecycle.y0();
        String str = this.f72657d;
        if (str == null) {
            y0Var.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            return y0Var;
        }
        this.E = true;
        long j8 = Long.parseLong(str);
        y0Var.j(g3.a.c(g3.f35298f));
        w9.a aVarA = androidx.lifecycle.v1.a(this);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new b1(this, j8, y0Var, null), 2);
        return y0Var;
    }

    public final iz0.a H4() {
        return (iz0.a) this.F.getValue();
    }

    public final boolean I4() {
        return this.D != -1;
    }

    public final void J4(String str) {
        str.getClass();
        ArrayList arrayList = this.f72673t;
        Iterator it = arrayList.iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i14 = -1;
                break;
            }
            ConversationCommentDTO conversationCommentDTO = ((go1.w) it.next()).f78313c;
            if (p005kotlin.jvm.internal.s.g(conversationCommentDTO != null ? conversationCommentDTO.f44546a : null, str)) {
                break;
            } else {
                i14++;
            }
        }
        if (i14 >= 0) {
            this.f72670p.j(Integer.valueOf(i14));
            arrayList.remove(i14);
        }
    }

    public final void K4(Context context, String str, ConversationCommentDTO conversationCommentDTO) {
        int iNextIndex;
        ArrayList arrayList = this.f72673t;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            ConversationCommentDTO conversationCommentDTO2 = ((go1.w) listIterator.previous()).f78313c;
            if (p005kotlin.jvm.internal.s.g(conversationCommentDTO2 != null ? conversationCommentDTO2.f44546a : null, str)) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex >= 0) {
            go1.w wVarB = m0.b(conversationCommentDTO, context, this.f72660g);
            this.f72669o.j(new o13.p<>(wVarB, Integer.valueOf(iNextIndex)));
            arrayList.set(iNextIndex, wVarB);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lfo1/o0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DISPLAY_COMMENT_PAGE_SIZE", "I", "DISPLAY_COMMENT_START_INDEX", "REQUEST_COMMENT_PAGE_SIZE", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
