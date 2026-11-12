package jw;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ljw/z;", "Lew/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "", "jsonObject", "Ljw/y;", "postUserSettingsToGCCallback", "Loj1/a;", "settingsRepo", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;Ljava/lang/String;Ljw/y;Loj1/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f101317j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y f101318k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final oj1.a f101319l;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.biz.tasks.PostUserSettingsToGCTask", f = "PostUserSettingsToGCTask.kt", l = {23}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f101320a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f101322c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f101320a = obj;
            this.f101322c |= Integer.MIN_VALUE;
            return z.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, String str, y yVar, oj1.a aVar) {
        super(bVar);
        bVar.getClass();
        str.getClass();
        yVar.getClass();
        aVar.getClass();
        this.f101317j = str;
        this.f101318k = yVar;
        this.f101319l = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f101322c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f101322c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objA = aVar.f101320a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f101322c;
        if (i15 == 0) {
            o13.r.b(objA);
            RequestBody requestBodyCreate = RequestBody.INSTANCE.create(this.f101317j, MediaType.INSTANCE.parse("application/json"));
            aVar.f101322c = 1;
            objA = this.f101319l.a(requestBodyCreate, aVar);
            if (objA == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            this.f101318k.c();
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        if (v2Var instanceof v2.a) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, String str, y yVar) {
        this(bVar, str, yVar, null, 8, null);
        bVar.getClass();
        str.getClass();
        yVar.getClass();
    }

    public /* synthetic */ z(com.garmin.android.library.backgroundtaskmanagement.b bVar, String str, y yVar, oj1.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, str, yVar, (i14 & 8) != 0 ? oj1.c.a.a(oj1.c.f132368d) : aVar);
    }
}
