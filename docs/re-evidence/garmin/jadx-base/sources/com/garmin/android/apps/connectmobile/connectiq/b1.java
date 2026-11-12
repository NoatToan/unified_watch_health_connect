package com.garmin.android.apps.connectmobile.connectiq;

import com.garmin.android.apps.connectmobile.audioprompts.AudioPromptsService;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.connectiq.ConnectIQ;
import com.garmin.android.connectiq.exception.InvalidStateException;
import com.garmin.android.connectiq.exception.ServiceUnavailableException;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31832a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f31833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f31836e;

    public /* synthetic */ b1(long j8, String str, byte[] bArr, u0.b bVar) {
        this.f31833b = j8;
        this.f31834c = str;
        this.f31835d = bArr;
        this.f31836e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31832a) {
            case 0:
                long j8 = this.f31833b;
                String str = (String) this.f31834c;
                byte[] bArr = (byte[]) this.f31835d;
                c cVar = ((u0.b) this.f31836e).f32034c;
                try {
                    String strC = cVar.c(z0.c(str, j8, bArr).toString());
                    if (Objects.equals(strC, ConnectIQ.EXTRA_STATUS_SUCCESS)) {
                        return;
                    }
                    i2.i("MonkeybrainsStateManager", "Received failure response from companion app service for application: " + str + " response: " + strC);
                    cVar.d();
                    return;
                } catch (InvalidStateException e4) {
                    e = e4;
                    StringBuilder sbK = ds.e0.k(j8, "Failed to send message received for unitId: ", " error: ");
                    sbK.append(e.getMessage());
                    i2.i("MonkeybrainsStateManager", sbK.toString());
                    cVar.d();
                    return;
                } catch (ServiceUnavailableException e14) {
                    e = e14;
                    StringBuilder sbK2 = ds.e0.k(j8, "Failed to send message received for unitId: ", " error: ");
                    sbK2.append(e.getMessage());
                    i2.i("MonkeybrainsStateManager", sbK2.toString());
                    cVar.d();
                    return;
                } catch (JSONException e15) {
                    i2.i("MonkeybrainsStateManager", "Failed to create JSON object for message received for unitId: " + j8);
                    cVar.d();
                    o2.c.p(e15);
                    return;
                }
            default:
                com.garmin.android.apps.connectmobile.audioprompts.b bVar = (com.garmin.android.apps.connectmobile.audioprompts.b) this.f31834c;
                hy.d dVar = (hy.d) this.f31835d;
                Locale locale = (Locale) this.f31836e;
                AudioPromptsService.e eVar = bVar.f30224b;
                if (eVar != null) {
                    AudioPromptsService audioPromptsService = AudioPromptsService.this;
                    x0 x0Var = new x0(dVar, eVar, locale, this.f31833b, audioPromptsService);
                    nu.h hVar = audioPromptsService.f30197d;
                    if (hVar == null) {
                        p005kotlin.jvm.internal.s.m("tts");
                        throw null;
                    }
                    if (hVar.getF127875c()) {
                        x0Var.run();
                        return;
                    } else {
                        audioPromptsService.f30201h.add(x0Var);
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ b1(com.garmin.android.apps.connectmobile.audioprompts.b bVar, hy.d dVar, Locale locale, long j8) {
        this.f31834c = bVar;
        this.f31835d = dVar;
        this.f31836e = locale;
        this.f31833b = j8;
    }
}
