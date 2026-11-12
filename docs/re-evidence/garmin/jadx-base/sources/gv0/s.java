package gv0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$prepareSendRequest$1", f = "LiveTrackSettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pu0.b f79371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f79372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pu0.b f79373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pu0.b f79374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f79375e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f79376a;

        static {
            int[] iArr = new int[pu0.j.values().length];
            try {
                iArr[pu0.j.f141279f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pu0.j.f141281h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pu0.j.f141280g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f79376a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(pu0.b bVar, d dVar, pu0.b bVar2, pu0.b bVar3, boolean z14, t13.d<? super s> dVar2) {
        super(2, dVar2);
        this.f79371a = bVar;
        this.f79372b = dVar;
        this.f79373c = bVar2;
        this.f79374d = bVar3;
        this.f79375e = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f79371a, this.f79372b, this.f79373c, this.f79374d, this.f79375e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        pu0.b bVar = this.f79371a;
        String str = bVar.f141183a;
        if (str == null) {
            str = "";
        }
        int i14 = 1;
        boolean z14 = og.a.I(bVar).length() > 0;
        pu0.j jVarG = og.a.G(bVar);
        int i15 = jVarG == null ? -1 : a.f79376a[jVarG.ordinal()];
        d dVar = this.f79372b;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            p2 p2Var = dVar.A;
            yu0.d dVar2 = dVar.f79185c;
            while (true) {
                Object value3 = p2Var.getValue();
                dVar2.getClass();
                jVarG.getClass();
                int[] iArr = yu0.d.a.f199700a;
                int i16 = iArr[jVarG.ordinal()];
                String string = (i16 == i14 || i16 == 2 || i16 == 3) ? dVar2.f199699b.getString(R.string.livetrack_opted_out_contact) : "";
                String strK = og.a.K(bVar);
                dVar2.getClass();
                int i17 = iArr[jVarG.ordinal()];
                if (p2Var.b(value3, new k0.a(string, (i17 == i14 || i17 == 2 || i17 == 3) ? dVar2.f199699b.a(R.string.msg_livetrack_opted_out_contact, strK) : "", this.f79373c, bVar, this.f79374d, this.f79375e, z14))) {
                    break;
                }
                i14 = 1;
            }
        } else {
            boolean z15 = this.f79375e;
            if (z14) {
                p2 p2Var2 = dVar.A;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, new k0.b(str, z15)));
            } else {
                p2 p2Var3 = dVar.A;
                do {
                    value = p2Var3.getValue();
                } while (!p2Var3.b(value, new k0.c(this.f79373c, bVar, this.f79374d, z15)));
            }
        }
        return Unit.INSTANCE;
    }
}
