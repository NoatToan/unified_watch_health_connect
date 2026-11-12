package qt2;

import e23.p;
import h53.c;
import java.util.Objects;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import pt2.f;
import st2.g;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lqt2/b;", "Lpt2/a;", "Lqt2/a;", "Lpt2/b;", "credentialsProvider", "<init>", "(Lpt2/b;)V", "b", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends pt2.a implements qt2.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zy2.b f147851d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f147852c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "com.garmin.livetrack.settings.SettingsManager$1", f = "SettingsManager.kt", l = {58}, m = "invokeSuspend")
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public rt2.a f147853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f147854b;

        public a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return b.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            rt2.a aVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f147854b;
            if (i14 == 0) {
                r.b(obj);
                rt2.a aVar3 = rt2.a.f154563a;
                f fVar = b.this.f147852c;
                this.f147853a = aVar3;
                this.f147854b = 1;
                Object objA = fVar.a(this);
                if (objA == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
                obj = objA;
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = this.f147853a;
                r.b(obj);
            }
            String str = (String) obj;
            aVar.getClass();
            str.getClass();
            if (str.length() == 0) {
                h.s("Customer GUID cannot be empty.");
                return null;
            }
            h53.b<String> bVar = rt2.a.f154566d;
            bVar.getClass();
            Object andSet = h53.b.f82140b.getAndSet(bVar, str);
            if (bVar.f82141a != c.a.f82142a) {
                Objects.toString(andSet);
            }
            if (!s.g(andSet, str)) {
                h53.b<g> bVar2 = rt2.a.f154564b;
                while (!bVar2.a(bVar2.b(), null)) {
                }
                h53.b<String> bVar3 = rt2.a.f154565c;
                while (!bVar3.a(bVar3.b(), null)) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new C2780b(null);
        f147851d = zy2.c.f207527a.a("LVT#SettingsManager");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(pt2.b bVar) throws Throwable {
        super(bVar);
        bVar.getClass();
        f fVar = bVar.f141039c;
        if (fVar == null) {
            h.s("LivetrackDelegate must be provided in AndroidCredentialsProvider for SettingsManager to function");
            throw null;
        }
        this.f147852c = fVar;
        f147851d.debug("SettingsManager created");
        ge1.b.W(t13.h.f161748a, new a(null));
    }

    /* JADX INFO: renamed from: qt2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqt2/b$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lzy2/k;", "LOGGER", "Lzy2/k;", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2780b {
        public /* synthetic */ C2780b(j jVar) {
            this();
        }

        private C2780b() {
        }
    }
}
