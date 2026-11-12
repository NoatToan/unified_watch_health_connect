package vk0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import e23.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import jk0.n;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import y22.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lvk0/k;", "<anonymous>", "(Lo53/b0;)Lvk0/k;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.util.GearPhotoUploadUtil$savePhotos$2", f = "GearPhotoUploadUtil.kt", l = {51, 69, 80}, m = "invokeSuspend", v = 2)
public final class a extends v13.i implements p<b0, t13.d<? super k>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f178541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f178542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f178543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f178544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f178545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Collection f178546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f178547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f178548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f178549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f178550j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List<n> f178551k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<x> f178552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p<List<String>, t13.d<? super v2<Unit>>, Object> f178553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p<String, t13.d<? super v2<Unit>>, Object> f178554n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q<String, zp0.f, t13.d<? super v2<n>>, Object> f178555o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Context f178556p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ bq0.c f178557q;

    /* JADX INFO: renamed from: vk0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.util.GearPhotoUploadUtil$savePhotos$2$deleteTasks$1$1", f = "GearPhotoUploadUtil.kt", l = {48}, m = "invokeSuspend", v = 2)
    public static final class C3335a extends v13.i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f178558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<String, t13.d<? super v2<Unit>>, Object> f178559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n f178560c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3335a(p<? super String, ? super t13.d<? super v2<Unit>>, ? extends Object> pVar, n nVar, t13.d<? super C3335a> dVar) {
            super(2, dVar);
            this.f178559b = pVar;
            this.f178560c = nVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C3335a(this.f178559b, this.f178560c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((C3335a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f178558a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            String str = this.f178560c.f99295a;
            this.f178558a = 1;
            Object objInvoke = this.f178559b.invoke(str, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ljk0/n;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.util.GearPhotoUploadUtil$savePhotos$2$uploadTasks$1$1", f = "GearPhotoUploadUtil.kt", l = {60}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super v2<? extends n>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f178561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q<String, zp0.f, t13.d<? super v2<n>>, Object> f178562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x f178563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f178564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ bq0.c f178565e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(q<? super String, ? super zp0.f, ? super t13.d<? super v2<n>>, ? extends Object> qVar, x xVar, Context context, bq0.c cVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f178562b = qVar;
            this.f178563c = xVar;
            this.f178564d = context;
            this.f178565e = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f178562b, this.f178563c, this.f178564d, this.f178565e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends n>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f178561a;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    String string = UUID.randomUUID().toString();
                    string.getClass();
                    q<String, zp0.f, t13.d<? super v2<n>>, Object> qVar = this.f178562b;
                    x xVar = this.f178563c;
                    Context context = this.f178564d;
                    bq0.c cVar = this.f178565e;
                    xVar.getClass();
                    context.getClass();
                    cVar.getClass();
                    zp0.f fVarA = cVar.a(context, new bq0.k(xVar.f194329a, string, "", 0.0d), null);
                    this.f178561a = 1;
                    obj = qVar.invoke(string, fVarA, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return (v2) obj;
            } catch (Exception e4) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GEAR;
                String message = e4.getMessage();
                aVar2.getClass();
                i2.a.e(a2Var, message);
                return new v2.a(e4, null, null, 6, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(List<n> list, List<x> list2, p<? super List<String>, ? super t13.d<? super v2<Unit>>, ? extends Object> pVar, p<? super String, ? super t13.d<? super v2<Unit>>, ? extends Object> pVar2, q<? super String, ? super zp0.f, ? super t13.d<? super v2<n>>, ? extends Object> qVar, Context context, bq0.c cVar, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f178551k = list;
        this.f178552l = list2;
        this.f178553m = pVar;
        this.f178554n = pVar2;
        this.f178555o = qVar;
        this.f178556p = context;
        this.f178557q = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a aVar = new a(this.f178551k, this.f178552l, this.f178553m, this.f178554n, this.f178555o, this.f178556p, this.f178557q, dVar);
        aVar.f178550j = obj;
        return aVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super k> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0179  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f6 -> B:41:0x00fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01a7 -> B:62:0x01ab). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vk0.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
