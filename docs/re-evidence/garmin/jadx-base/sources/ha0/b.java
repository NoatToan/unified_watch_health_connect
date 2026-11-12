package ha0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import ds.e0;
import e23.l;
import ho.q;
import java.net.InetAddress;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p5.h0;
import p5.k0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82621a;

    public /* synthetic */ b(int i14) {
        this.f82621a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f82621a) {
            case 0:
                c cVar = c.f82622a;
                ((Context) obj).getClass();
                return "Running";
            case 1:
                c cVar2 = c.f82622a;
                ((Context) obj).getClass();
                return "Strength Training";
            case 2:
                c cVar3 = c.f82622a;
                ((Context) obj).getClass();
                return "Bike";
            case 3:
                c cVar4 = c.f82622a;
                ((Context) obj).getClass();
                return "Cardio";
            case 4:
                c cVar5 = c.f82622a;
                ((Context) obj).getClass();
                return "Hike";
            case 5:
                c cVar6 = c.f82622a;
                ((Context) obj).getClass();
                return "Timed Activity";
            case 6:
                c cVar7 = c.f82622a;
                ((Context) obj).getClass();
                return "Walking";
            case 7:
                c cVar8 = c.f82622a;
                ((Context) obj).getClass();
                return "Cycling";
            case 8:
                c cVar9 = c.f82622a;
                ((Context) obj).getClass();
                return "Bike";
            case 9:
                c cVar10 = c.f82622a;
                ((Context) obj).getClass();
                return "Indoor Bike";
            case 10:
                Context context = (Context) obj;
                context.getClass();
                Parcelable.Creator<c22.i> creator = c22.i.CREATOR;
                String string = context.getString(R.string.lbl_popular);
                string.getClass();
                return string;
            case 11:
                d.b bVar = (d.b) obj;
                bVar.getClass();
                return bVar.f82630b;
            case 12:
                d.b bVar2 = (d.b) obj;
                bVar2.getClass();
                return d.b.a(bVar2, 7);
            case 13:
                InetAddress inetAddress = (InetAddress) obj;
                int i14 = hd2.a.f83436h;
                inetAddress.getClass();
                String hostAddress = inetAddress.getHostAddress();
                return hostAddress != null ? hostAddress : "";
            case 14:
                hd2.b bVar3 = hd2.b.f83444a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                String str = (String) obj;
                he2.a aVar = he2.a.f83529a;
                str.getClass();
                Logger logger = he2.a.f83531c;
                if (logger != null) {
                    logger.debug(str);
                }
                return Unit.INSTANCE;
            case 16:
                String str2 = (String) obj;
                hk2.b.a aVar2 = hk2.b.f84221i;
                str2.getClass();
                dk2.d.f60235m.getClass();
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    String string2 = jSONObject.getString("friendlyName");
                    string2.getClass();
                    String string3 = jSONObject.getString("macAddress");
                    string3.getClass();
                    String string4 = jSONObject.getString("productNumber");
                    string4.getClass();
                    String string5 = jSONObject.getJSONObject("device").getString("mAddress");
                    string5.getClass();
                    BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(string5);
                    remoteDevice.getClass();
                    return new dk2.d(string2, string3, string4, remoteDevice, jSONObject.has("serviceDataOptions") ? Integer.valueOf(jSONObject.getInt("serviceDataOptions")) : null, jSONObject.has("passkey") ? jSONObject.getString("passkey") : null, jSONObject.has("antId") ? Long.valueOf(jSONObject.getLong("antId")) : null, jSONObject.has("unitId") ? Long.valueOf(jSONObject.getLong("unitId")) : null, jSONObject.has("modelType") ? jSONObject.getString("modelType") : null, jSONObject.has("rssi") ? Integer.valueOf(jSONObject.getInt("rssi")) : null, jSONObject.has("btcAddress") ? jSONObject.getString("btcAddress") : null, jSONObject.has("discoveryMillis") ? Long.valueOf(jSONObject.getLong("discoveryMillis")) : null);
                } catch (JSONException unused) {
                    return null;
                }
            case 17:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                h0.h(k0Var);
                return Unit.INSTANCE;
            case 18:
                ((View) obj).getClass();
                return Unit.INSTANCE;
            case 19:
                oi0.b bVar4 = (oi0.b) obj;
                bVar4.getClass();
                bVar4.a();
                return Unit.INSTANCE;
            case 20:
                oi0.b bVar5 = (oi0.b) obj;
                bVar5.getClass();
                bVar5.a();
                return Unit.INSTANCE;
            case 21:
                oi0.b bVar6 = (oi0.b) obj;
                bVar6.getClass();
                bVar6.a();
                return Unit.INSTANCE;
            case 22:
                oi0.b bVar7 = (oi0.b) obj;
                bVar7.getClass();
                bVar7.K();
                return Unit.INSTANCE;
            case 23:
                oi0.b bVar8 = (oi0.b) obj;
                bVar8.getClass();
                bVar8.a();
                bVar8.l();
                return Unit.INSTANCE;
            case 24:
                e0.v("RxJava Error: ", ((Throwable) obj).getMessage(), hn2.c.f84546f);
                return Unit.INSTANCE;
            case 25:
                q qVar = q.f84665a;
                ((i53.c) obj).getClass();
                return Unit.INSTANCE;
            case 26:
                q qVar2 = q.f84665a;
                ((i53.c) obj).getClass();
                return Unit.INSTANCE;
            case 27:
                obj.getClass();
                return w.M(2, obj.toString());
            case 28:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            default:
                Context context2 = (Context) obj;
                context2.getClass();
                return new zw1.g(context2, null, 0, 6, null);
        }
    }
}
