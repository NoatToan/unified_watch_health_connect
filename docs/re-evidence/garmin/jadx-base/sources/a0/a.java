package a0;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import androidx.camera.core.CameraControl;
import androidx.camera.video.internal.audio.AudioStream;
import com.airbnb.lottie.LottieCompositionFactory;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.promotions.CampaignInfoFullScreenActivity;
import com.garmin.android.apps.connectmobile.z1;
import com.garmin.device.pairing.PairingException;
import com.garmin.feature.garminpay.ui.dev.devices.DevDevicesActivity;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.material.internal.ViewUtils;
import d53.w;
import fa.z;
import java.io.InputStream;
import l0.j;
import org.slf4j.Logger;
import p005kotlin.Unit;
import po.k;
import sm2.r;
import v.l;
import v.s;
import xk1.v;
import z0.a0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16c;

    public /* synthetic */ a(Object obj, boolean z14, int i14) {
        this.f14a = i14;
        this.f16c = obj;
        this.f15b = z14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = 0;
        switch (this.f14a) {
            case 0:
                d dVar = (d) this.f16c;
                boolean z14 = this.f15b;
                if (dVar.f22a != z14) {
                    dVar.f22a = z14;
                    if (!z14) {
                        CameraControl.OperationCanceledException operationCanceledException = new CameraControl.OperationCanceledException("The camera control has became inactive.");
                        androidx.concurrent.futures.b.a<Void> aVar = dVar.f28g;
                        if (aVar != null) {
                            aVar.d(operationCanceledException);
                            dVar.f28g = null;
                        }
                    } else if (dVar.f23b) {
                        l lVar = dVar.f24c;
                        lVar.getClass();
                        androidx.concurrent.futures.b.a aVar2 = new androidx.concurrent.futures.b.a();
                        androidx.concurrent.futures.b.d<T> dVar2 = new androidx.concurrent.futures.b.d<>(aVar2);
                        aVar2.f6080b = dVar2;
                        aVar2.f6079a = v.h.class;
                        try {
                            lVar.f173879c.execute(new v.i(lVar, aVar2, i14));
                            aVar2.f6079a = "updateSessionConfigAsync";
                        } catch (Exception e4) {
                            dVar2.a(e4);
                        }
                        j.f(dVar2).addListener(new c(dVar, i14), dVar.f25d);
                        dVar.f23b = false;
                    }
                    break;
                }
                break;
            case 1:
                androidx.camera.video.internal.audio.b.a aVar3 = (androidx.camera.video.internal.audio.b.a) this.f16c;
                boolean z15 = this.f15b;
                a0 a0Var = a0.this;
                if (a0Var.X != z15) {
                    a0Var.X = z15;
                    a0Var.y(true);
                }
                break;
            case 2:
                AudioStream.a aVar4 = (AudioStream.a) this.f16c;
                boolean z16 = this.f15b;
                androidx.camera.video.internal.audio.b bVar = androidx.camera.video.internal.audio.b.this;
                bVar.f5945q = z16;
                if (bVar.f5935g == androidx.camera.video.internal.audio.b.c.STARTED) {
                    bVar.a();
                }
                break;
            case 3:
                boolean z17 = this.f15b;
                com.garmin.android.apps.connectmobile.view.reusablecomponents.b bVar2 = (com.garmin.android.apps.connectmobile.view.reusablecomponents.b) this.f16c;
                EditText editText = bVar2.editText;
                if (!z17) {
                    String string = w.i0(editText.getText().toString()).toString();
                    editText.getClass();
                    editText.setText(string);
                    Unit unit = Unit.INSTANCE;
                    EditText editText2 = bVar2.f47701d;
                    editText2.getClass();
                    editText2.setText(string);
                    bVar2.b();
                }
                bVar2.mIsEditing = z17;
                bVar2.g();
                break;
            case 4:
                cd0.i iVar = (cd0.i) this.f16c;
                boolean z18 = this.f15b;
                i2.a(a2.DEVICES, "AbstractHandshakeCompleteStrategy", "saveAutoUploadPermission(" + z18 + ")");
                rd2.h hVarD = rd2.h.d();
                long jC = iVar.c();
                hVarD.getClass();
                rd2.h.g(jC, 1, z18);
                break;
            case 5:
                LottieCompositionFactory.lambda$fromJsonInputStream$7(this.f15b, (InputStream) this.f16c);
                break;
            case 6:
                ((z1) this.f16c).lambda$setToolbarFixedHeight$9(this.f15b);
                break;
            case 7:
                ((AudioRendererEventListener.EventDispatcher) this.f16c).lambda$skipSilenceEnabledChanged$7(this.f15b);
                break;
            case 8:
                ViewUtils.showKeyboard((View) this.f16c, this.f15b);
                break;
            case 9:
                DevDevicesActivity devDevicesActivity = (DevDevicesActivity) this.f16c;
                boolean z19 = this.f15b;
                int i15 = DevDevicesActivity.f51893l;
                hn2.c.ba(devDevicesActivity, Boolean.valueOf(z19), null, null, 14);
                break;
            case 10:
                androidx.media3.exoplayer.audio.b.a aVar5 = (androidx.media3.exoplayer.audio.b.a) this.f16c;
                boolean z24 = this.f15b;
                androidx.media3.exoplayer.audio.b bVar3 = aVar5.f8767b;
                int i16 = z.f70071a;
                bVar3.onSkipSilenceEnabledChanged(z24);
                break;
            case 11:
                kj0.c.f104944d.initialize((Context) this.f16c, this.f15b, false);
                break;
            case 12:
                k kVar = (k) this.f16c;
                boolean z25 = this.f15b;
                po.h.a aVar6 = kVar.f138918g;
                if (aVar6 != null) {
                    aVar6.a(z25);
                }
                break;
            case 13:
                sm2.l lVar2 = (sm2.l) this.f16c;
                boolean z26 = this.f15b;
                yl2.d dVar3 = lVar2.f160338d;
                Logger logger = lVar2.f160340f;
                logger.debug(".onFirstSyncFinished(" + z26 + ")");
                rm2.c cVar = lVar2.f160342h;
                if (!z26) {
                    if (cVar != null) {
                        cVar.m(qm2.k.SYNC_FAILED, yl2.e.SYNC_FAILURE, null);
                    }
                    lm2.g gVarC = lm2.h.c();
                    String f197656b = dVar3.getF197656b();
                    yl2.e eVar = yl2.e.SYNC_FAILURE;
                    f197656b.getClass();
                    ((fm2.c) gVarC).p(da2.j.FINISHED_WITH_FAILURE, f197656b, eVar, "Sync failed.");
                    logger.warn(".onFirstSyncFinished() -- sent milestone PAIRING FINISHED FAILURE to device.");
                    lVar2.f160326j.h(dVar3.getF197655a());
                    r.g(dVar3, cVar);
                    if (dVar3.f197839a.f145761c) {
                        lVar2.f160326j.g(lVar2.f160339e, dVar3.getF197655a(), dVar3.f(), null);
                    }
                    lVar2.e(new PairingException(lVar2, eVar));
                } else {
                    if (cVar != null) {
                        cVar.v(qm2.k.SYNC_FINISHED);
                    }
                    lVar2.d();
                }
                break;
            case 14:
                s sVar = (s) this.f16c;
                boolean z27 = this.f15b;
                sVar.Y = z27;
                if (z27) {
                    if (sVar.f174010e == s.g.PENDING_OPEN || sVar.f174010e == s.g.OPENING_WITH_ERROR) {
                        sVar.H(false);
                    }
                }
                break;
            default:
                CampaignInfoFullScreenActivity campaignInfoFullScreenActivity = (CampaignInfoFullScreenActivity) this.f16c;
                boolean z28 = this.f15b;
                CampaignInfoFullScreenActivity.a aVar7 = CampaignInfoFullScreenActivity.f41033o;
                campaignInfoFullScreenActivity.hideProgressOverlay();
                if (!z28) {
                    campaignInfoFullScreenActivity.ca().error("Failed to send email, popping error dialog: ");
                    androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(campaignInfoFullScreenActivity).create();
                    eVarCreate.setTitle(R.string.common_email_sending_error_title);
                    eVarCreate.h(campaignInfoFullScreenActivity.getString(R.string.common_email_sending_error_text));
                    eVarCreate.g(-1, campaignInfoFullScreenActivity.getString(R.string.lbl_ok), new v(6));
                    eVarCreate.show();
                } else {
                    campaignInfoFullScreenActivity.ca().debug("Successfully sent email: ");
                    androidx.appcompat.app.e eVarCreate2 = new androidx.appcompat.app.e.a(campaignInfoFullScreenActivity).create();
                    eVarCreate2.setTitle(R.string.common_email_sent_success_title);
                    eVarCreate2.h(campaignInfoFullScreenActivity.getString(R.string.common_email_sent_sucess_body));
                    eVarCreate2.g(-1, campaignInfoFullScreenActivity.getString(R.string.lbl_ok), new xg1.l(campaignInfoFullScreenActivity, 9));
                    eVarCreate2.show();
                }
                break;
        }
    }

    public /* synthetic */ a(boolean z14, Object obj, int i14) {
        this.f14a = i14;
        this.f15b = z14;
        this.f16c = obj;
    }
}
