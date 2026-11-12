package iv0;

import android.content.Context;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import java.util.List;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.recipients.RecipientsSectionKt$RecipientsSection$5$1", f = "RecipientsSection.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g3<List<qu0.e>> f95190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f95191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f95192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f95193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f95194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f95195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1<lv0.a> f95196g;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95197a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f95197a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(g3<? extends List<qu0.e>> g3Var, e23.a<Unit> aVar, e23.a<Unit> aVar2, Context context, boolean z14, e23.a<Unit> aVar3, p1<lv0.a> p1Var, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f95190a = g3Var;
        this.f95191b = aVar;
        this.f95192c = aVar2;
        this.f95193d = context;
        this.f95194e = z14;
        this.f95195f = aVar3;
        this.f95196g = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f95190a, this.f95191b, this.f95192c, this.f95193d, this.f95194e, this.f95195f, this.f95196g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        g3<List<qu0.e>> g3Var = this.f95190a;
        int i14 = a.f95197a[g3Var.f35300a.ordinal()];
        if (i14 != 1) {
            e23.a<Unit> aVar2 = this.f95192c;
            if (i14 == 2) {
                aVar2.invoke();
                List<qu0.e> list = g3Var.f35301b;
                if (list != null && list.isEmpty() && this.f95194e) {
                    this.f95195f.invoke();
                }
            } else {
                if (i14 != 3) {
                    u0.r();
                    return null;
                }
                aVar2.invoke();
                boolean zC = lv0.c.c(g3Var);
                Context context = this.f95193d;
                if (zC) {
                    String string = context.getString(R.string.lbl_admin_cannot_be_removed);
                    string.getClass();
                    String string2 = context.getString(R.string.msg_remove_admin_recipient);
                    string2.getClass();
                    this.f95196g.setValue(new lv0.a.b(string, string2));
                } else {
                    Toast.makeText(context, R.string.txt_error_occurred, 0).show();
                }
            }
        } else {
            this.f95191b.invoke();
        }
        return Unit.INSTANCE;
    }
}
