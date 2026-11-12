package ho2;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.concurrent.atomic.AtomicReference;
import o53.f0;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PushProvMainActivity f84838b;

    public /* synthetic */ d(PushProvMainActivity pushProvMainActivity, int i14) {
        this.f84837a = i14;
        this.f84838b = pushProvMainActivity;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0270  */
    /* JADX WARN: Code duplicated, block: B:105:0x0288  */
    /* JADX WARN: Code duplicated, block: B:56:0x0161  */
    /* JADX WARN: Code duplicated, block: B:57:0x0163  */
    /* JADX WARN: Code duplicated, block: B:82:0x019d  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:94:0x020d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0265  */
    /* JADX WARN: Code duplicated, block: B:99:0x026c  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        io2.a aVar;
        io2.c cVar;
        io2.c cVar2;
        io2.f pushProvisioningPayload;
        androidx.appcompat.app.e eVarQ;
        m mVar;
        String str;
        boolean z14;
        io2.a aVar2;
        m mVar2;
        io2.c cVar3;
        io2.f pushProvisioningPayload2;
        io2.c cVar4;
        io2.f pushProvisioningPayload3;
        io2.a aVar3;
        String pushId;
        io2.c cVar5;
        io2.f pushProvisioningPayload4;
        String pushAccountReceipt;
        int i14 = this.f84837a;
        PushProvMainActivity pushProvMainActivity = this.f84838b;
        switch (i14) {
            case 0:
                PushProvMainActivity.a aVar4 = PushProvMainActivity.f51161t;
                if (((Boolean) obj).booleanValue()) {
                    io2.d dVar = pushProvMainActivity.f51166j;
                    String pushAccountReceipt2 = (dVar == null || (cVar2 = dVar.f94620a) == null || (pushProvisioningPayload = cVar2.getPushProvisioningPayload()) == null) ? null : pushProvisioningPayload.getPushAccountReceipt();
                    io2.d dVar2 = pushProvMainActivity.f51166j;
                    if (pushAccountReceipt2 == null) {
                        if ((dVar2 != null ? dVar2.f94621b : null) == null) {
                            pushProvMainActivity.fa();
                        } else if (dVar2 != null && (aVar = dVar2.f94621b) != null) {
                            ap2.h hVar = pushProvMainActivity.f51164h;
                            if (hVar == null) {
                                s.m("fitPayAddCardViewModel");
                                throw null;
                            }
                            ge1.b.T(v1.a(hVar), null, null, new ap2.m(hVar, aVar, null), 3);
                        }
                    } else if (dVar2 != null && (cVar = dVar2.f94620a) != null) {
                        ap2.h hVar2 = pushProvMainActivity.f51164h;
                        if (hVar2 == null) {
                            s.m("fitPayAddCardViewModel");
                            throw null;
                        }
                        ge1.b.T(v1.a(hVar2), null, null, new ap2.k(hVar2, cVar, null), 3);
                    }
                } else {
                    pushProvMainActivity.ka();
                }
                return Unit.INSTANCE;
            case 1:
                PushProvMainActivity.a aVar5 = PushProvMainActivity.f51161t;
                if (((Boolean) obj).booleanValue()) {
                    ge1.b.T(f0.w(pushProvMainActivity), null, null, new com.garmin.feature.garminpay.providers.gpay.pushprovisioning.b(pushProvMainActivity, null), 3);
                } else {
                    PushProvMainActivity.f51162v.error("onCreate: View Model not successfully initialized");
                    pushProvMainActivity.ka();
                }
                return Unit.INSTANCE;
            default:
                Logger logger = PushProvMainActivity.f51162v;
                PushProvMainActivity pushProvMainActivity2 = this.f84838b;
                logger.debug("pushProvDeepLinkData: " + pushProvMainActivity2.f51166j);
                pushProvMainActivity2.f51166j = (io2.d) obj;
                logger.debug("saveDeepLinkInfo");
                io2.d dVar3 = pushProvMainActivity2.f51166j;
                if (dVar3 != null && (cVar5 = dVar3.f94620a) != null && (pushProvisioningPayload4 = cVar5.getPushProvisioningPayload()) != null && (pushAccountReceipt = pushProvisioningPayload4.getPushAccountReceipt()) != null) {
                    com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                    com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51193d.set(pushAccountReceipt);
                }
                io2.d dVar4 = pushProvMainActivity2.f51166j;
                if (dVar4 != null && (aVar3 = dVar4.f94621b) != null && (pushId = aVar3.getPushId()) != null) {
                    com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                    com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51194e.set(pushId);
                }
                io2.d dVar5 = pushProvMainActivity2.f51166j;
                if (dVar5 != null && (cVar4 = dVar5.f94620a) != null && (pushProvisioningPayload3 = cVar4.getPushProvisioningPayload()) != null && pushProvisioningPayload3.getPushAccountReceipt() != null) {
                    com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                    com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51199j.set(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d.f51215a);
                }
                io2.d dVar6 = pushProvMainActivity2.f51166j;
                if (dVar6 != null && dVar6.f94621b != null) {
                    com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                    com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51199j.set(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.b.f51209a);
                }
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                AtomicReference<String> atomicReference = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51196g;
                io2.d dVar7 = pushProvMainActivity2.f51166j;
                atomicReference.set(dVar7 != null ? dVar7.f94626g : null);
                AtomicReference<Boolean> atomicReference2 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51197h;
                io2.d dVar8 = pushProvMainActivity2.f51166j;
                atomicReference2.set(dVar8 != null ? Boolean.valueOf(dVar8.f94627h) : null);
                AtomicReference<Boolean> atomicReference3 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51200k;
                io2.d dVar9 = pushProvMainActivity2.f51166j;
                atomicReference3.set(dVar9 != null ? Boolean.valueOf(dVar9.f94624e) : null);
                logger.debug("startPushProvFlow");
                zf.b.r();
                i2.c("shouldUsePushProvisioning");
                try {
                    gh2.i iVar = gh2.i.f77458c;
                    long jG = iVar.a().f77477b.g("garminpay_push_provisioning_android_version_release");
                    String strH = iVar.a().f77477b.h("garminpay_push_provisioning_gcm_version");
                    jc2.e.f98177a.getClass();
                    long j8 = Long.parseLong(jc2.e.a().split("\\.")[0]);
                    i2.c("shouldUsePushProvisioning - osName: " + ((String) jc2.e.f98178b.getValue()));
                    i2.c("shouldUsePushProvisioning - osVersion: " + j8);
                    Context context = GarminConnectMobileApp.f28688j;
                    if (context != null) {
                        try {
                            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                        } catch (PackageManager.NameNotFoundException e4) {
                            i2.i("AndroidDeviceUtil", e4.getMessage());
                            str = null;
                        }
                        if (c22.h.a(strH, str.split("-")[0]) >= 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (jG < j8 || !z14) {
                            logger.error("minimum GCM and Android versions are not met");
                            logger.debug("showGCMUpdateDialog");
                            br2.c cVar6 = br2.c.f19585a;
                            String string = pushProvMainActivity2.getString(R.string.forced_update_needed_title);
                            string.getClass();
                            String string2 = pushProvMainActivity2.getString(R.string.forced_update_info_message, pushProvMainActivity2.getString(R.string.google_play_store));
                            string2.getClass();
                            eVarQ = br2.c.q(cVar6, pushProvMainActivity2, string, string2, new o13.p(pushProvMainActivity2.getString(R.string.google_play_store), new b(pushProvMainActivity2, 8)), new o13.p(pushProvMainActivity2.getString(R.string.common_cancel), new b(pushProvMainActivity2, 9)), null, false, 224);
                            if (eVarQ != null) {
                                eVarQ.show();
                            }
                        } else {
                            io2.d dVar10 = pushProvMainActivity2.f51166j;
                            String pushAccountReceipt3 = (dVar10 == null || (cVar3 = dVar10.f94620a) == null || (pushProvisioningPayload2 = cVar3.getPushProvisioningPayload()) == null) ? null : pushProvisioningPayload2.getPushAccountReceipt();
                            if (pushAccountReceipt3 == null || pushAccountReceipt3.length() == 0) {
                                io2.d dVar11 = pushProvMainActivity2.f51166j;
                                String pushId2 = (dVar11 == null || (aVar2 = dVar11.f94621b) == null) ? null : aVar2.getPushId();
                                if (pushId2 == null || pushId2.length() == 0) {
                                    logger.error("both pushAccountReceipt and pushToken cannot be null");
                                    logger.debug("showUnableToAddCardDialog");
                                    br2.c cVar7 = br2.c.f19585a;
                                    String string3 = pushProvMainActivity2.getString(R.string.push_provision_unable_to_add_card);
                                    string3.getClass();
                                    String string4 = pushProvMainActivity2.getString(R.string.push_provision_could_not_be_added_long_text);
                                    string4.getClass();
                                    androidx.appcompat.app.e eVarQ2 = br2.c.q(cVar7, pushProvMainActivity2, string3, string4, new o13.p(pushProvMainActivity2.getString(R.string.lbl_ok), new b(pushProvMainActivity2, 11)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                                    if (eVarQ2 != null) {
                                        eVarQ2.show();
                                    }
                                } else {
                                    logger.debug("push provisioning is allow to continue for the current GCM and Android version");
                                    mVar2 = pushProvMainActivity2.f51165i;
                                    if (mVar2 != null) {
                                        s.m("pushProvViewModel");
                                        throw null;
                                    }
                                    if (mVar2.f84871b != null) {
                                        pushProvMainActivity2.f51169m.a();
                                    }
                                }
                            } else {
                                logger.debug("push provisioning is allow to continue for the current GCM and Android version");
                                mVar2 = pushProvMainActivity2.f51165i;
                                if (mVar2 != null) {
                                    s.m("pushProvViewModel");
                                    throw null;
                                }
                                if (mVar2.f84871b != null) {
                                    pushProvMainActivity2.f51169m.a();
                                }
                            }
                        }
                        mVar = pushProvMainActivity2.f51165i;
                        if (mVar == null) {
                            s.m("pushProvViewModel");
                            throw null;
                        }
                        logger.error("push provisioning cannot continue: " + (mVar.f84871b != null));
                        pushProvMainActivity2.fa();
                        break;
                    } else {
                        str = null;
                        if (c22.h.a(strH, str.split("-")[0]) >= 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (jG < j8) {
                            logger.error("minimum GCM and Android versions are not met");
                            logger.debug("showGCMUpdateDialog");
                            br2.c cVar8 = br2.c.f19585a;
                            String string5 = pushProvMainActivity2.getString(R.string.forced_update_needed_title);
                            string5.getClass();
                            String string6 = pushProvMainActivity2.getString(R.string.forced_update_info_message, pushProvMainActivity2.getString(R.string.google_play_store));
                            string6.getClass();
                            eVarQ = br2.c.q(cVar8, pushProvMainActivity2, string5, string6, new o13.p(pushProvMainActivity2.getString(R.string.google_play_store), new b(pushProvMainActivity2, 8)), new o13.p(pushProvMainActivity2.getString(R.string.common_cancel), new b(pushProvMainActivity2, 9)), null, false, 224);
                            if (eVarQ != null) {
                                eVarQ.show();
                            }
                            mVar = pushProvMainActivity2.f51165i;
                            if (mVar == null) {
                                s.m("pushProvViewModel");
                                throw null;
                            }
                            if (mVar.f84871b != null) {
                            }
                            logger.error("push provisioning cannot continue: " + (mVar.f84871b != null));
                            pushProvMainActivity2.fa();
                        } else {
                            logger.error("minimum GCM and Android versions are not met");
                            logger.debug("showGCMUpdateDialog");
                            br2.c cVar9 = br2.c.f19585a;
                            String string7 = pushProvMainActivity2.getString(R.string.forced_update_needed_title);
                            string7.getClass();
                            String string8 = pushProvMainActivity2.getString(R.string.forced_update_info_message, pushProvMainActivity2.getString(R.string.google_play_store));
                            string8.getClass();
                            eVarQ = br2.c.q(cVar9, pushProvMainActivity2, string7, string8, new o13.p(pushProvMainActivity2.getString(R.string.google_play_store), new b(pushProvMainActivity2, 8)), new o13.p(pushProvMainActivity2.getString(R.string.common_cancel), new b(pushProvMainActivity2, 9)), null, false, 224);
                            if (eVarQ != null) {
                                eVarQ.show();
                            }
                            mVar = pushProvMainActivity2.f51165i;
                            if (mVar == null) {
                                s.m("pushProvViewModel");
                                throw null;
                            }
                            if (mVar.f84871b != null) {
                            }
                            logger.error("push provisioning cannot continue: " + (mVar.f84871b != null));
                            pushProvMainActivity2.fa();
                        }
                    }
                } catch (Exception e14) {
                    i2.h("shouldUsePushProvisioning - error: " + e14.getMessage());
                }
                return Unit.INSTANCE;
        }
    }
}
