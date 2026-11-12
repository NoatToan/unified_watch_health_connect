package ib0;

import android.content.Context;
import androidx.lifecycle.u1;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.v2;
import com.google.accompanist.permissions.MultiplePermissionsState;
import gg1.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lib0/g;", "Landroidx/lifecycle/u1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "initialProfilePicture", "Lv90/d;", "profileImageUseCase", "Lv90/e;", "profileSetupDelegate", "Lv90/c;", "getProfilePicturePermissionsUseCase", "Lv90/b;", "convertToBitmapUseCase", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lv90/d;Lv90/e;Lv90/c;Lv90/b;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f92463l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v90.d f92464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v90.e f92465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v90.c f92466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v90.b f92467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f92468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f92469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f92470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f92471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f92472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f92473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f92474k;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92475a;

        static {
            int[] iArr = new int[jb0.b.values().length];
            try {
                iArr[jb0.b.f98104d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jb0.b.f98105e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jb0.b.f98103c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f92475a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lib0/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.profile.picture.ProfileImageViewModel$profileImageUiState$1", f = "ProfileImageViewModel.kt", l = {61}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<r53.j<? super f>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f92476a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super f> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            f fVar;
            jb0.c aVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f92476a;
            g gVar = g.this;
            if (i14 == 0) {
                o13.r.b(obj);
                v90.d dVar = gVar.f92464a;
                v0.T.getClass();
                String strB = v0.a.b().b();
                this.f92476a = 1;
                obj = dVar.b(strB, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                o13.p pVar = (o13.p) ((v2.b) v2Var).f47386a;
                List list = (List) pVar.f128594a;
                if (list.isEmpty()) {
                    p2 p2Var = gVar.f92473j;
                    do {
                        value2 = p2Var.getValue();
                    } while (!p2Var.b(value2, f.a((f) value2, null, null, null, 0L, 39)));
                } else {
                    ArrayList arrayList = new ArrayList(y.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((com.garmin.android.apps.connectmobile.userprofile.model.a) it.next()).getImage());
                    }
                    String image = ((com.garmin.android.apps.connectmobile.userprofile.model.a) pVar.f128595b).getImage();
                    p2 p2Var2 = gVar.f92473j;
                    do {
                        value3 = p2Var2.getValue();
                        fVar = (f) value3;
                        aVar = fVar.f92459c;
                        if (aVar == null) {
                            aVar = new jb0.c.a(image);
                        }
                    } while (!p2Var2.b(value3, f.a(fVar, i53.a.j(arrayList), null, aVar, 0L, 50)));
                }
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                p2 p2Var3 = gVar.f92473j;
                do {
                    value = p2Var3.getValue();
                } while (!p2Var3.b(value, f.a((f) value, null, null, null, 0L, 39)));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public g(Context context, String str, v90.d dVar, v90.e eVar, v90.c cVar, v90.b bVar) {
        context.getClass();
        dVar.getClass();
        eVar.getClass();
        cVar.getClass();
        bVar.getClass();
        this.f92464a = dVar;
        this.f92465b = eVar;
        this.f92466c = cVar;
        this.f92467d = bVar;
        this.f92468e = o13.m.b(new ho0.a(context, 4));
        this.f92469f = q2.a(null);
        this.f92470g = q2.a(null);
        Boolean bool = Boolean.FALSE;
        this.f92471h = q2.a(bool);
        this.f92472i = q2.a(bool);
        p2 p2VarA = q2.a(new f(null, null, null, false, false, 0L, 63, null));
        this.f92473j = p2VarA;
        r53.v vVar = new r53.v(new c(null), p2VarA);
        x53.c cVar2 = s0.f129406a;
        this.f92474k = r53.s.K(vVar, c0.a(x53.b.f189152a), k2.a.a(k2.f150703a, 2), new f(null, null, null, true, false, 0L, 55, null));
    }

    public static final void x4(g gVar, jb0.b bVar) {
        Object value;
        p2 p2Var = gVar.f92473j;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, f.a((f) value, null, new jb0.a.C1877a(bVar), null, 0L, 61)));
    }

    public final void A4(jb0.c cVar) {
        while (true) {
            p2 p2Var = this.f92473j;
            Object value = p2Var.getValue();
            jb0.c cVar2 = cVar;
            if (p2Var.b(value, f.a((f) value, null, null, cVar2, System.currentTimeMillis(), 27))) {
                return;
            } else {
                cVar = cVar2;
            }
        }
    }

    public final void y4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f92473j;
            value = p2Var.getValue();
        } while (!p2Var.b(value, f.a((f) value, null, null, null, 0L, 61)));
    }

    public final void z4(jb0.b bVar) {
        p2 p2Var;
        Object value;
        bVar.getClass();
        int i14 = b.f92475a[bVar.ordinal()];
        if (i14 == 1) {
            MultiplePermissionsState multiplePermissionsState = (MultiplePermissionsState) this.f92469f.getValue();
            if (multiplePermissionsState == null || multiplePermissionsState.getShouldShowRationale()) {
                return;
            }
        } else if (i14 != 2) {
            if (i14 == 3) {
                return;
            }
            u0.r();
            return;
        } else {
            MultiplePermissionsState multiplePermissionsState2 = (MultiplePermissionsState) this.f92470g.getValue();
            if (multiplePermissionsState2 == null || multiplePermissionsState2.getShouldShowRationale()) {
                return;
            }
        }
        do {
            p2Var = this.f92473j;
            value = p2Var.getValue();
        } while (!p2Var.b(value, f.a((f) value, null, new jb0.a.b(bVar), null, 0L, 61)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lib0/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "TEMP_FILE_NAME", "TEMP_FILE_EXTENSION", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
