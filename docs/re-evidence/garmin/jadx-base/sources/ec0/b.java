package ec0;

import android.content.ContentValues;
import androidx.core.view.j;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.bleupgrade.BLEUpgradeCoordinator$clearGarminAuth$2$1", f = "BLEUpgradeCoordinator.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f63774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f63775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f63776c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f63775b = aVar;
        this.f63776c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f63775b, this.f63776c, dVar);
        bVar.f63774a = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        int iUpdate;
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        sd2.f fVar = this.f63775b.f63769c;
        Integer num = null;
        if (fVar != null) {
            String str2 = this.f63776c;
            rd2.i iVar = rd2.f.a().f152047c;
            long unitID = fVar.getUnitID();
            int connectionType = fVar.getConnectionType();
            iVar.getClass();
            Logger logger = rd2.i.f152075b;
            try {
                ContentValues contentValues = new ContentValues(4);
                contentValues.put("mac_address", str2);
                contentValues.put("gble_ediv", (byte[]) null);
                contentValues.put("gble_rand", (byte[]) null);
                contentValues.put("gble_ltk", (byte[]) null);
                String strValueOf = String.valueOf(unitID);
                if (connectionType != 1) {
                    str = connectionType != 2 ? PrivacyUpdateRequestError.UNKNOWN : "btc";
                } else {
                    str = "ble";
                }
                iUpdate = rd2.a.b().update("devices", contentValues, "unit_id=? AND connection_type=?", new String[]{strValueOf, str});
            } catch (Exception e4) {
                logger.error("updateBtConnectionInfo", (Throwable) e4);
                iUpdate = -1;
            }
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(unitID, "updateBtConnectionInfo: unitID [", "], macAddr [", str2);
            j.m(connectionType, iUpdate, "], connType [", "], nbrRows [", sbK);
            sbK.append("]");
            logger.debug(sbK.toString());
            rd2.i.e(iUpdate);
            num = new Integer(iUpdate);
        }
        String strG = a0.g(num, "5.- clearGarminAuth - updated: ");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "BLEUpgradeCoordinator", strG);
        zo0.g.f206137d.getClass();
        zo0.g.f206138e.set(true);
        return Unit.INSTANCE;
    }
}
