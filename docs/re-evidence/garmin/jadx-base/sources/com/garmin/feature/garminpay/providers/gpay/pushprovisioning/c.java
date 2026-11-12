package com.garmin.feature.garminpay.providers.gpay.pushprovisioning;

import am.j;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.webkit.URLUtil;
import androidx.appcompat.app.e;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import d53.w;
import hl1.i;
import ho2.n;
import ho2.o;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import lc.u0;
import o13.p;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/pushprovisioning/c;", "", "<init>", "()V", "c", "d", "b", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f51190a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f51191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static AtomicReference<Boolean> f51192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference<String> f51193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference<String> f51194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicReference<String> f51195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static AtomicReference<String> f51196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static AtomicReference<Boolean> f51197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static AtomicReference<Boolean> f51198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static AtomicReference<InterfaceC1057c> f51199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static AtomicReference<Boolean> f51200k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicReference<String> f51201l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/pushprovisioning/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        APPROVED,
        REQUIRE_ADDITIONAL_AUTHENTICATION,
        DECLINED,
        CANCELLED,
        ERROR,
        DUPLICATE_REQUEST
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/pushprovisioning/c$b;", "Lcom/garmin/feature/garminpay/providers/gpay/pushprovisioning/c$c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements InterfaceC1057c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f51209a = new b();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/pushprovisioning/c$b$a;", "", "", "code", "<init>", "(Ljava/lang/String;II)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public enum a {
            SUCCESS(0),
            FAILURE(1);


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f51213a;

            a(int i14) {
                this.f51213a = i14;
            }
        }

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c$b$b, reason: collision with other inner class name */
        public static final /* synthetic */ class C1056b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f51214a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.APPROVED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f51214a = iArr;
            }
        }

        private b() {
        }

        @Override // com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.InterfaceC1057c
        public final void a(a aVar) {
            aVar.getClass();
            Logger logger = c.f51191b;
            logger.debug("DirectPushProvisioningPayload: appendDataToCallbackURLDPP: {}", aVar);
            c cVar = c.f51190a;
            cVar.getClass();
            String str = c.f51196g.get();
            if (str == null || str.length() == 0) {
                logger.debug("DirectPushProvisioningPayload: appendDataToCallbackURLDPP: Error - callbackURL cannot be null");
                return;
            }
            if (C1056b.f51214a[aVar.ordinal()] == 1) {
                cVar.getClass();
                c.f51196g.set(c.a(cVar, "result", "SUCCESS"));
                cVar.getClass();
                c.f51196g.set(c.a(cVar, "resultCode", String.valueOf(a.SUCCESS.f51213a)));
                return;
            }
            cVar.getClass();
            c.f51196g.set(c.a(cVar, "result", "ERROR"));
            cVar.getClass();
            c.f51196g.set(c.a(cVar, "resultCode", String.valueOf(a.FAILURE.f51213a)));
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 92648666;
        }

        public final String toString() {
            return "DirectPushProvisioningPayload";
        }
    }

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c$c, reason: collision with other inner class name */
    public interface InterfaceC1057c {
        void a(a aVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/pushprovisioning/c$d;", "Lcom/garmin/feature/garminpay/providers/gpay/pushprovisioning/c$c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements InterfaceC1057c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f51215a = new d();

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f51216a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.APPROVED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REQUIRE_ADDITIONAL_AUTHENTICATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.DECLINED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.CANCELLED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.DUPLICATE_REQUEST.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f51216a = iArr;
            }
        }

        private d() {
        }

        @Override // com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.InterfaceC1057c
        public final void a(a aVar) {
            aVar.getClass();
            Logger logger = c.f51191b;
            logger.debug("StandardPushProvisioningPayload: appendDataToCallbackURL: {}", aVar);
            c cVar = c.f51190a;
            cVar.getClass();
            String str = c.f51196g.get();
            if (str == null || str.length() == 0) {
                logger.debug("StandardPushProvisioningPayload: appendDataToCallbackURL: Error - callbackURL cannot be null");
                return;
            }
            cVar.getClass();
            String str2 = c.f51193d.get();
            cVar.getClass();
            String str3 = c.f51195f.get();
            if (str2 == null || str2.length() == 0) {
                logger.debug("StandardPushProvisioningPayload: appendDataToCallbackURL: Error - pushAccountReceipt cannot be null");
                return;
            }
            switch (a.f51216a[aVar.ordinal()]) {
                case 1:
                case 2:
                    if (str3 == null) {
                        logger.debug(e0.g("StandardPushProvisioningPayload: appendDataToCallbackURL: externalTokenReference is null: (", str2, ", ", str3, ")"));
                    } else {
                        logger.debug(e0.g("StandardPushProvisioningPayload: appendDataToCallbackURL: pushAccountReceipt(", str2, "), externalTokenReference(", str3, ")"));
                        String strConcat = (aVar.name() + "|").concat(str3);
                        cVar.getClass();
                        c.f51196g.set(c.a(cVar, "results[" + str2 + "]", strConcat));
                        com.airbnb.lottie.animation.keyframe.a.u("StandardPushProvisioningPayload: appendDataToCallbackURL: Data added to callback url(1): (results, ", aVar.name(), ")}", logger);
                    }
                    break;
                case 3:
                case 4:
                case 5:
                    logger.debug("StandardPushProvisioningPayload: appendDataToCallbackURL: pushAccountReceipt(" + str2 + ")");
                    String strO = j.o(str2, "]", new StringBuilder("results["));
                    String str4 = aVar.name();
                    cVar.getClass();
                    c.f51196g.set(c.a(cVar, strO, str4));
                    com.airbnb.lottie.animation.keyframe.a.u("StandardPushProvisioningPayload: appendDataToCallbackURL: Data added to callback url(2): (results, ", aVar.name(), ")}", logger);
                    break;
                case 6:
                    cVar.getClass();
                    c.f51196g.set(c.a(cVar, "results", aVar.name()));
                    break;
                default:
                    u0.r();
                    break;
            }
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1027273594;
        }

        public final String toString() {
            return "StandardPushProvisioningPayload";
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f51191b = gt2.b.f79005a.h("PAY#PushProvUtil");
        f51192c = new AtomicReference<>();
        f51193d = new AtomicReference<>();
        f51194e = new AtomicReference<>();
        f51195f = new AtomicReference<>();
        f51196g = new AtomicReference<>();
        f51197h = new AtomicReference<>();
        f51198i = new AtomicReference<>();
        f51199j = new AtomicReference<>();
        f51200k = new AtomicReference<>();
        f51201l = new AtomicReference<>();
    }

    private c() {
    }

    public static final String a(c cVar, String str, String str2) {
        Uri.Builder builderAppendQueryParameter;
        Uri uri;
        cVar.getClass();
        String str3 = f51196g.get();
        Uri uriBuild = null;
        Uri.Builder builderBuildUpon = (str3 == null || (uri = Uri.parse(str3)) == null) ? null : uri.buildUpon();
        if (builderBuildUpon != null && (builderAppendQueryParameter = builderBuildUpon.appendQueryParameter(str, str2)) != null) {
            uriBuild = builderAppendQueryParameter.build();
        }
        return String.valueOf(uriBuild);
    }

    public static void b(final Activity activity, boolean z14, final e23.a aVar) {
        p pVar;
        activity.getClass();
        f51191b.debug("bailOutForPushProv: cancelRequested: " + z14);
        Resources resources = activity.getResources();
        if (z14) {
            String str = f51196g.get();
            if (str == null || str.length() == 0) {
                pVar = new p(resources.getString(R.string.connections_cancel_request), new i(aVar, 2));
            } else {
                final int i14 = 0;
                pVar = new p(resources.getString(R.string.return_to_bank), new e23.p() { // from class: ho2.p
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i15 = i14;
                        Activity activity2 = activity;
                        e23.a aVar2 = aVar;
                        DialogInterface dialogInterface = (DialogInterface) obj;
                        ((Integer) obj2).intValue();
                        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                        switch (i15) {
                            case 0:
                                dialogInterface.getClass();
                                dialogInterface.dismiss();
                                if (aVar2 != null) {
                                    aVar2.invoke();
                                } else {
                                    activity2.setResult(0);
                                }
                                activity2.finish();
                                break;
                            case 1:
                                dialogInterface.getClass();
                                dialogInterface.dismiss();
                                if (aVar2 != null) {
                                    aVar2.invoke();
                                } else {
                                    activity2.setResult(13);
                                }
                                activity2.finish();
                                break;
                            default:
                                dialogInterface.getClass();
                                dialogInterface.dismiss();
                                if (aVar2 != null) {
                                    aVar2.invoke();
                                } else {
                                    activity2.setResult(13);
                                }
                                activity2.finish();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
            }
            br2.c cVar = br2.c.f19585a;
            String string = resources.getString(R.string.cancel_request);
            string.getClass();
            String string2 = resources.getString(R.string.your_card_will_not_be_added_to_garmin_pay);
            string2.getClass();
            e eVarQ = br2.c.q(cVar, activity, string, string2, pVar, new p(resources.getString(R.string.common_button_stay), new o(1)), null, false, 224);
            if (eVarQ != null) {
                eVarQ.show();
                return;
            }
            return;
        }
        String str2 = f51196g.get();
        if (str2 == null || str2.length() == 0) {
            c();
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        Boolean bool = f51197h.get();
        Boolean bool2 = Boolean.TRUE;
        if (s.g(bool, bool2)) {
            br2.c cVar2 = br2.c.f19585a;
            String string3 = resources.getString(R.string.you_will_be_returned_to_bank_app);
            string3.getClass();
            final int i15 = 1;
            e eVarQ2 = br2.c.q(cVar2, activity, "", string3, new p(resources.getString(R.string.lbl_ok), new e23.p() { // from class: ho2.p
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i16 = i15;
                    Activity activity2 = activity;
                    e23.a aVar2 = aVar;
                    DialogInterface dialogInterface = (DialogInterface) obj;
                    ((Integer) obj2).intValue();
                    com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar3 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                    switch (i16) {
                        case 0:
                            dialogInterface.getClass();
                            dialogInterface.dismiss();
                            if (aVar2 != null) {
                                aVar2.invoke();
                            } else {
                                activity2.setResult(0);
                            }
                            activity2.finish();
                            break;
                        case 1:
                            dialogInterface.getClass();
                            dialogInterface.dismiss();
                            if (aVar2 != null) {
                                aVar2.invoke();
                            } else {
                                activity2.setResult(13);
                            }
                            activity2.finish();
                            break;
                        default:
                            dialogInterface.getClass();
                            dialogInterface.dismiss();
                            if (aVar2 != null) {
                                aVar2.invoke();
                            } else {
                                activity2.setResult(13);
                            }
                            activity2.finish();
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
            if (eVarQ2 != null) {
                eVarQ2.show();
                return;
            }
            return;
        }
        if (s.g(f51198i.get(), bool2)) {
            return;
        }
        f51198i.set(bool2);
        f51192c.set(Boolean.FALSE);
        br2.c cVar3 = br2.c.f19585a;
        String string4 = resources.getString(R.string.return_to_bank_app);
        string4.getClass();
        final int i16 = 2;
        e eVarQ3 = br2.c.q(cVar3, activity, "", string4, new p(resources.getString(R.string.return_to_bank), new e23.p() { // from class: ho2.p
            @Override // e23.p
            public final Object invoke(Object obj, Object obj2) {
                int i17 = i16;
                Activity activity2 = activity;
                e23.a aVar2 = aVar;
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar4 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                switch (i17) {
                    case 0:
                        dialogInterface.getClass();
                        dialogInterface.dismiss();
                        if (aVar2 != null) {
                            aVar2.invoke();
                        } else {
                            activity2.setResult(0);
                        }
                        activity2.finish();
                        break;
                    case 1:
                        dialogInterface.getClass();
                        dialogInterface.dismiss();
                        if (aVar2 != null) {
                            aVar2.invoke();
                        } else {
                            activity2.setResult(13);
                        }
                        activity2.finish();
                        break;
                    default:
                        dialogInterface.getClass();
                        dialogInterface.dismiss();
                        if (aVar2 != null) {
                            aVar2.invoke();
                        } else {
                            activity2.setResult(13);
                        }
                        activity2.finish();
                        break;
                }
                return Unit.INSTANCE;
            }
        }), new p(resources.getString(R.string.common_button_stay), new o(2)), null, false, 224);
        if (eVarQ3 != null) {
            eVarQ3.show();
        }
    }

    public static void c() {
        f51191b.debug("removeCallbackInfo");
        f51196g = new AtomicReference<>();
        f51197h = new AtomicReference<>();
        f51198i = new AtomicReference<>();
        f51199j = new AtomicReference<>();
        f51200k = new AtomicReference<>();
        f51192c = new AtomicReference<>();
    }

    public static void d(Context context, a aVar, ho2.a aVar2) {
        Intent intent;
        Intent launchIntentForPackage;
        context.getClass();
        aVar.getClass();
        Logger logger = f51191b;
        logger.debug("returnToIssuerBankAppOrWebPage");
        try {
            InterfaceC1057c interfaceC1057c = f51199j.get();
            if (interfaceC1057c != null) {
                interfaceC1057c.a(aVar);
            }
            String str = f51196g.get();
            logger.debug("returnToIssuerBankAppOrWebPage: " + str);
            c();
            p pVar = null;
            if (str != null && w.z(str, ".action.", false)) {
                List listW = w.W(str, new String[]{".action."});
                pVar = new p(listW.get(0), "action." + listW.get(1));
            }
            if (pVar == null) {
                logger.debug("returnToIssuerBankAppOrWebPage: Callback does not come with with action");
                if (str == null) {
                    logger.error("returnToIssuerBankAppOrWebPage: callbackURL is null");
                    if (aVar2 != null) {
                        aVar2.invoke();
                        return;
                    }
                    return;
                }
                if (context.getPackageManager().getLaunchIntentForPackage(str) != null) {
                    logger.debug("returnToIssuerBankAppOrWebPage: For package ids");
                    launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
                } else {
                    if (URLUtil.isValidUrl(str)) {
                        logger.debug("returnToIssuerBankAppOrWebPage: For http or https formats");
                        intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(str));
                        intent.addFlags(268435456);
                    } else {
                        logger.debug("returnToIssuerBankAppOrWebPage: For myapp://action formats");
                        intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    }
                    launchIntentForPackage = intent;
                }
                if (launchIntentForPackage != null) {
                    context.startActivity(launchIntentForPackage);
                } else {
                    logger.error("returnToIssuerBankAppOrWebPage: intent is null");
                }
                ((Activity) context).finish();
                return;
            }
            Object obj = pVar.f128595b;
            Object obj2 = pVar.f128594a;
            logger.debug("returnToIssuerBankAppOrWebPage: Callback comes with package name appended with the action");
            wr2.b.f186831a.getClass();
            if (!wr2.b.b(context, (String) obj2)) {
                logger.debug("returnToIssuerBankAppOrWebPage: Issuer app is not installed");
                f51190a.getClass();
                e(context, (String) obj2);
                return;
            }
            logger.debug("returnToIssuerBankAppOrWebPage: Issuer app is installed, opening: (" + obj2 + "," + obj + ")");
            Intent intent2 = new Intent();
            intent2.setPackage((String) obj2);
            intent2.addFlags(268435456);
            intent2.setAction(obj2 + "." + obj);
            context.startActivity(intent2);
        } catch (Exception e4) {
            com.airbnb.lottie.animation.keyframe.a.z("returnToIssuerBankAppOrWebPage: exception: (", e4.getMessage(), ")", logger);
            String string = context.getString(R.string.dialog_title_error);
            String strD = p6.b.d(context, R.string.verification_failed, string);
            String string2 = context.getString(R.string.lbl_ok);
            string2.getClass();
            e eVarQ = br2.c.q(br2.c.f19585a, context, string, strD, new p(string2, new h51.a(29)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
            if (eVarQ != null) {
                eVarQ.show();
            }
        }
    }

    public static void e(Context context, String str) {
        String string = context.getString(R.string.wallet_title_app_not_installed);
        String strD = p6.b.d(context, R.string.wallet_install_app, string);
        String string2 = context.getString(R.string.os_app_store_android);
        e eVarQ = br2.c.q(br2.c.f19585a, context, string, strD, new p(string2, new n(context, str)), new p(p6.b.d(context, R.string.lbl_cancel, string2), new o(0)), null, false, 224);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }
}
