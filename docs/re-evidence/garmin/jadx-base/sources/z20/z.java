package z20;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.UpdateCoursePacebandsUseCase$invoke$1", f = "UpdateCoursePacebandsUseCase.kt", l = {28, 43}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<r53.j<? super List<? extends com.garmin.android.apps.connectmobile.pacepro.data.dto.a>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f201973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f201974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f201975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f201976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f201977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f201978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f201979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f201980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f201981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> f201982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a0 f201983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f201984l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> list, a0 a0Var, com.garmin.android.apps.connectmobile.courses.model.e eVar, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f201982j = list;
        this.f201983k = a0Var;
        this.f201984l = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        z zVar = new z(this.f201982j, this.f201983k, this.f201984l, dVar);
        zVar.f201981i = obj;
        return zVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super List<? extends com.garmin.android.apps.connectmobile.pacepro.data.dto.a>> jVar, t13.d<? super Unit> dVar) {
        return ((z) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x006c  */
    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:30:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:43:0x012f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0119 -> B:37:0x011c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z20.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
