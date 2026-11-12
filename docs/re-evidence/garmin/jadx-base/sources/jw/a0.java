package jw;

import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljw/a0;", "Lew/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "bizOperation", "Lcom/garmin/android/apps/connectmobile/userprofile/model/m;", "mSocialProfileDto", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;Lcom/garmin/android/apps/connectmobile/userprofile/model/m;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.userprofile.model.m f101220j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.biz.tasks.PostUserSocialProfileToGCTask", f = "PostUserSocialProfileToGCTask.kt", l = {19}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f101221a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f101223c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f101221a = obj;
            this.f101223c |= Integer.MIN_VALUE;
            return a0.this.d(this);
        }
    }

    static {
        Parcelable.Creator<com.garmin.android.apps.connectmobile.userprofile.model.m> creator = com.garmin.android.apps.connectmobile.userprofile.model.m.CREATOR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, com.garmin.android.apps.connectmobile.userprofile.model.m mVar) {
        super(bVar);
        bVar.getClass();
        mVar.getClass();
        this.f101220j = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) throws Throwable {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f101223c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f101223c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objE0 = aVar.f101221a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f101223c;
        if (i15 == 0) {
            o13.r.b(objE0);
            qo1.c.f145960d.getClass();
            qo1.c cVarA = qo1.c.a.a();
            aVar.f101223c = 1;
            cVarA.getClass();
            x53.c cVar = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new qo1.g(cVarA, this.f101220j, null), aVar);
            if (objE0 == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.b) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        if (v2Var instanceof v2.a) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
        u0.r();
        return null;
    }
}
