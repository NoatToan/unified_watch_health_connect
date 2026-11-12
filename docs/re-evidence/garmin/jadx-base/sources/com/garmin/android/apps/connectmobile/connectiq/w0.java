package com.garmin.android.apps.connectmobile.connectiq;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.connectiq.ConnectIQ;
import com.garmin.android.connectiq.exception.InvalidStateException;
import com.garmin.android.connectiq.exception.ServiceUnavailableException;
import java.util.Objects;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f32078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0.c f32079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f32080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f32081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f32082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u0.b f32083g;

    public /* synthetic */ w0(z0 z0Var, z0.c cVar, long j8, String str, int i14, u0.b bVar, int i15) {
        this.f32077a = i15;
        this.f32078b = z0Var;
        this.f32079c = cVar;
        this.f32080d = j8;
        this.f32081e = str;
        this.f32082f = i14;
        this.f32083g = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f32077a;
        u0.b bVar = this.f32083g;
        int i15 = this.f32082f;
        String str = this.f32081e;
        long j8 = this.f32080d;
        z0.c cVar = this.f32079c;
        z0 z0Var = this.f32078b;
        switch (i14) {
            case 0:
                c cVar2 = bVar.f32034c;
                z0 z0Var2 = z0.f32114c;
                z0Var.getClass();
                try {
                    String strC = cVar2.c(z0.g(i15, cVar.f32126f, str, j8).toString());
                    if (!Objects.equals(strC, ConnectIQ.EXTRA_STATUS_SUCCESS)) {
                        i2.i("MonkeybrainsStateManager", "Received failure response from companion app service for open application for application: " + str + " response: " + strC);
                        cVar2.d();
                    }
                } catch (InvalidStateException e4) {
                    e = e4;
                    StringBuilder sbK = ds.e0.k(j8, "Failed to send open application response for device: ", " error: ");
                    sbK.append(e.getMessage());
                    i2.i("MonkeybrainsStateManager", sbK.toString());
                    cVar2.d();
                    return;
                } catch (ServiceUnavailableException e14) {
                    e = e14;
                    StringBuilder sbK2 = ds.e0.k(j8, "Failed to send open application response for device: ", " error: ");
                    sbK2.append(e.getMessage());
                    i2.i("MonkeybrainsStateManager", sbK2.toString());
                    cVar2.d();
                    return;
                } catch (JSONException e15) {
                    i2.i("MonkeybrainsStateManager", "Failed to create JSON object for open application response for device: " + j8);
                    cVar2.d();
                    o2.c.p(e15);
                    return;
                }
                break;
            default:
                c cVar3 = bVar.f32034c;
                z0 z0Var3 = z0.f32114c;
                z0Var.getClass();
                try {
                    String strC2 = cVar3.c(z0.d(i15, cVar.f32126f, str, j8).toString());
                    if (!Objects.equals(strC2, ConnectIQ.EXTRA_STATUS_SUCCESS)) {
                        i2.i("MonkeybrainsStateManager", "Received failure response from companion app service for application info for application: " + str + " response: " + strC2);
                        cVar3.d();
                    }
                } catch (InvalidStateException e16) {
                    e = e16;
                    StringBuilder sbK3 = ds.e0.k(j8, "Failed to send application info for device: ", " error: ");
                    sbK3.append(e.getMessage());
                    i2.i("MonkeybrainsStateManager", sbK3.toString());
                    cVar3.d();
                } catch (ServiceUnavailableException e17) {
                    e = e17;
                    StringBuilder sbK4 = ds.e0.k(j8, "Failed to send application info for device: ", " error: ");
                    sbK4.append(e.getMessage());
                    i2.i("MonkeybrainsStateManager", sbK4.toString());
                    cVar3.d();
                } catch (JSONException e18) {
                    i2.i("MonkeybrainsStateManager", "Failed to create JSON object for application info for device: " + j8);
                    cVar3.d();
                    o2.c.p(e18);
                    return;
                }
                break;
        }
    }
}
