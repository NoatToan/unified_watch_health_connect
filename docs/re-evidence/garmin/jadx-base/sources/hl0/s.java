package hl0;

import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIInternationalGolf;
import java.util.ArrayList;
import o53.b0;
import okhttp3.ResponseBody;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.domain.GolfCourseMediumMapTypeUpdateCheckOperation$execute$1", f = "GolfCourseMediumMapTypeUpdateCheckOperation.kt", l = {50, 58}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f84326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public el0.c f84327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f84329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f84330e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f84330e = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s sVar = new s(this.f84330e, dVar);
        sVar.f84329d = obj;
        return sVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009e A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:6:0x0013, B:13:0x0026, B:38:0x0098, B:40:0x009e, B:42:0x00aa, B:44:0x00ae, B:46:0x00b6, B:16:0x002e, B:17:0x003e, B:19:0x0044, B:21:0x0050, B:23:0x0056, B:24:0x005a, B:25:0x005e, B:27:0x006d, B:29:0x0079, B:31:0x007d, B:33:0x0085), top: B:52:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:6:0x0013, B:13:0x0026, B:38:0x0098, B:40:0x009e, B:42:0x00aa, B:44:0x00ae, B:46:0x00b6, B:16:0x002e, B:17:0x003e, B:19:0x0044, B:21:0x0050, B:23:0x0056, B:24:0x005a, B:25:0x005e, B:27:0x006d, B:29:0x0079, B:31:0x007d, B:33:0x0085), top: B:52:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:6:0x0013, B:13:0x0026, B:38:0x0098, B:40:0x009e, B:42:0x00aa, B:44:0x00ae, B:46:0x00b6, B:16:0x002e, B:17:0x003e, B:19:0x0044, B:21:0x0050, B:23:0x0056, B:24:0x005a, B:25:0x005e, B:27:0x006d, B:29:0x0079, B:31:0x007d, B:33:0x0085), top: B:52:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c2, code lost:
    
        if (hl0.r.a(r5, r11, r10) == r1) goto L48;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        el0.c cVar;
        ArrayList arrayList2;
        el0.c cVar2;
        a0<ResponseBody> a0VarC;
        ResponseBody responseBody;
        String strString;
        b0 b0Var = (b0) this.f84329d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f84328c;
        r rVar = this.f84330e;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    cVar2 = this.f84327b;
                    arrayList2 = this.f84326a;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            ArrayList arrayList3 = new ArrayList();
            arrayList = new ArrayList();
            for (GDIInternationalGolf.CourseUpdateRequestInfo courseUpdateRequestInfo : rVar.f84323a) {
                if (courseUpdateRequestInfo.hasGlobalId()) {
                    if (courseUpdateRequestInfo.hasPartNumber()) {
                        arrayList3.add(courseUpdateRequestInfo);
                    } else {
                        arrayList.add(courseUpdateRequestInfo);
                    }
                }
            }
            cVar = (el0.c) KoinJavaComponent.get$default(el0.c.class, null, null, 6, null);
            if (!arrayList3.isEmpty()) {
                a0<ResponseBody> a0VarA = cVar.a(arrayList3);
                if (a0VarA.f25745a.isSuccessful()) {
                    ResponseBody responseBody2 = a0VarA.f25746b;
                    String strString2 = responseBody2 != null ? responseBody2.string() : null;
                    this.f84329d = b0Var;
                    this.f84326a = arrayList;
                    this.f84327b = cVar;
                    this.f84328c = 1;
                    if (r.a(rVar, strString2, this) != aVar) {
                        arrayList2 = arrayList;
                        cVar2 = cVar;
                    }
                }
                return aVar;
            }
            if (!arrayList.isEmpty()) {
                a0VarC = cVar.c(arrayList);
                if (a0VarC.f25745a.isSuccessful()) {
                    responseBody = a0VarC.f25746b;
                    if (responseBody != null) {
                        strString = responseBody.string();
                    } else {
                        strString = null;
                    }
                    this.f84329d = b0Var;
                    this.f84326a = null;
                    this.f84327b = null;
                    this.f84328c = 2;
                }
            }
            return Unit.INSTANCE;
            cVar = cVar2;
            arrayList = arrayList2;
            if (!arrayList.isEmpty()) {
                a0VarC = cVar.c(arrayList);
                if (a0VarC.f25745a.isSuccessful()) {
                    responseBody = a0VarC.f25746b;
                    if (responseBody != null) {
                        strString = responseBody.string();
                    } else {
                        strString = null;
                    }
                    this.f84329d = b0Var;
                    this.f84326a = null;
                    this.f84327b = null;
                    this.f84328c = 2;
                }
            }
        } catch (Exception e4) {
            a2 a2Var = a2.GOLF;
            i2.f36769a.getClass();
            i2.a.g(a2Var, "GlfCrsMediumUpdtCheckOp", e4);
        }
        return Unit.INSTANCE;
    }
}
