package pc0;

import android.content.ContentValues;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lo53/i0;", "", "<anonymous>", "(Lo53/b0;)Lo53/i0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.repo.DevicesRepo$updateDbWithDeviceLastUploadToServerDate$2", f = "DevicesRepo.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.p<o53.b0, t13.d<? super o53.i0<? extends Integer>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f137252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f137253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f137254c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)I"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.repo.DevicesRepo$updateDbWithDeviceLastUploadToServerDate$2$1", f = "DevicesRepo.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Integer>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f137255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f137256b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, long j14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f137255a = j8;
            this.f137256b = j14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f137255a, this.f137256b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Integer> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            int i14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            rd2.i iVar = rd2.f.a().f152047c;
            long j8 = this.f137255a;
            long j14 = this.f137256b;
            iVar.getClass();
            Logger logger = rd2.i.f152075b;
            try {
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("lastUploadToServerTimestamp", Long.valueOf(j14));
                i14 = rd2.i.i(contentValues, j8);
            } catch (Exception e4) {
                logger.error("updateLastUploadToServerTimestamp", (Throwable) e4);
                i14 = -1;
            }
            StringBuilder sbW = v.h.w(i14, "updateLastUploadToServerTimestamp: unitID [", "], nbrRows [", j8);
            sbW.append("]");
            logger.debug(sbW.toString());
            rd2.i.e(i14);
            return new Integer(i14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(long j8, long j14, t13.d<? super l0> dVar) {
        super(2, dVar);
        this.f137253b = j8;
        this.f137254c = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l0 l0Var = new l0(this.f137253b, this.f137254c, dVar);
        l0Var.f137252a = obj;
        return l0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super o53.i0<? extends Integer>> dVar) {
        return ((l0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f137252a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        return ge1.b.j(b0Var, null, null, new a(this.f137253b, this.f137254c, null), 3);
    }
}
