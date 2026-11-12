package k90;

import android.content.ContentValues;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.ClearDeviceTypePairingUseCase$invoke$2", f = "ClearDeviceTypePairingUseCase.kt", l = {26}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f103612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f103613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f103614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yl2.b f103615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t tVar, yl2.b bVar, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f103614c = tVar;
        this.f103615d = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u uVar = new u(this.f103614c, this.f103615d, dVar);
        uVar.f103613b = obj;
        return uVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f103613b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f103612a;
        yl2.b bVar = this.f103615d;
        t tVar = this.f103614c;
        if (i14 == 0) {
            o13.r.b(obj);
            rd2.i iVar = tVar.f103608a;
            String str = bVar.f197832a;
            iVar.getClass();
            if (!TextUtils.isEmpty(str)) {
                ContentValues contentValues = new ContentValues(6);
                contentValues.putNull("mac_address");
                contentValues.putNull("garmin_device_xml");
                contentValues.putNull("gble_ediv");
                contentValues.putNull("gble_ltk");
                contentValues.putNull("gble_rand");
                contentValues.put("is_connected", (Integer) 0);
                int iUpdate = 0;
                for (String str2 : str.split(",")) {
                    iUpdate += rd2.a.b().update("devices", contentValues, "product_nbr=?", new String[]{str2});
                }
                rd2.i.e(iUpdate);
                com.airbnb.lottie.animation.keyframe.a.r("clearPairingByProductNumbers: nbrRows [", iUpdate, "]", rd2.i.f152075b);
            }
            ed0.a aVar2 = ed0.a.f63825a;
            this.f103613b = b0Var;
            this.f103612a = 1;
            aVar2.getClass();
            if (ed0.a.j("ClearDeviceTypePairingUseCase ", this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        ArrayList arrayListE = ((da2.b) tVar.f103609b).e();
        ArrayList<DeviceProfile> arrayList = new ArrayList();
        for (Object obj2 : arrayListE) {
            if (yl2.b.b(p13.w.c(bVar)).contains(String.valueOf(((DeviceProfile) obj2).getF92744h()))) {
                arrayList.add(obj2);
            }
        }
        for (DeviceProfile deviceProfile : arrayList) {
            a2 a2Var = a2.DEVICE_SETUP;
            String str3 = "Disconnecting " + bVar + " with macAddress: " + deviceProfile.getMacAddress();
            i2.f36769a.getClass();
            i2.a.b(a2Var, "ClearDeviceTypePairingUseCase", str3);
            la2.j jVar = tVar.f103610c;
            String macAddress = deviceProfile.getMacAddress();
            macAddress.getClass();
            ((la2.e) jVar).e(macAddress);
        }
        return Unit.INSTANCE;
    }
}
