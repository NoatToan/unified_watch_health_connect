package ap2;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FitPayAddCardActivity f11687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gp2.f f11688c;

    public /* synthetic */ d(FitPayAddCardActivity fitPayAddCardActivity, gp2.f fVar, int i14) {
        this.f11686a = i14;
        this.f11687b = fitPayAddCardActivity;
        this.f11688c = fVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    @Override // e23.a
    public final Object invoke() {
        String string;
        int i14 = this.f11686a;
        gp2.f fVar = this.f11688c;
        FitPayAddCardActivity fitPayAddCardActivity = this.f11687b;
        switch (i14) {
            case 0:
                d dVar = new d(fitPayAddCardActivity, fVar, 2);
                FitPayAddCardActivity.a aVar = FitPayAddCardActivity.f51376x;
                fitPayAddCardActivity.ia(false, dVar);
                break;
            case 1:
                FitPayAddCardActivity.a aVar2 = FitPayAddCardActivity.f51376x;
                Object obj = fVar.f78496a;
                String str = obj instanceof String ? (String) obj : null;
                FitPayAddCardActivity.a aVar3 = FitPayAddCardActivity.f51376x;
                FitPayAddCardActivity.a.a(aVar3).debug("handleCardDeleted: " + str);
                String string2 = fitPayAddCardActivity.getString(R.string.dialog_title_error);
                string2.getClass();
                String string3 = fitPayAddCardActivity.getString(R.string.card_deleted);
                string3.getClass();
                String string4 = fitPayAddCardActivity.getString(R.string.lbl_ok);
                string4.getClass();
                if (p005kotlin.jvm.internal.s.g(str, "FAILED_RETRIEVING_KEYS")) {
                    string2 = fitPayAddCardActivity.getString(R.string.unable_to_connect_to_device);
                    string2.getClass();
                    string3 = fitPayAddCardActivity.getString(R.string.please_make_sure_your_garmin_device_is_turned_on);
                    string3.getClass();
                    string4 = fitPayAddCardActivity.getString(R.string.lbl_ok);
                    string4.getClass();
                } else {
                    FitPayAddCardActivity.a.a(aVar3).debug("handleCardDeleted - Show Dialog with default message.");
                }
                fitPayAddCardActivity.ca(string2, string3, new o13.p<>(string4, new c(fitPayAddCardActivity, 4)));
                break;
            default:
                FitPayAddCardActivity.a aVar4 = FitPayAddCardActivity.f51376x;
                Object obj2 = fVar.f78496a;
                obj2.getClass();
                ArrayList arrayList = (ArrayList) obj2;
                FitPayAddCardActivity.a.a(FitPayAddCardActivity.f51376x).debug("handleUserEnteredBadData");
                StringBuilder sb3 = new StringBuilder(fitPayAddCardActivity.getString(R.string.card_setup_rejected));
                if (!arrayList.isEmpty()) {
                    sb3.append("\n");
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        switch ((String) it.next()) {
                            case "MISSING_REQUIRED_FIELD":
                                string = fitPayAddCardActivity.getString(R.string.security_code_required);
                                break;
                            case "MISSING_EXPIRY_MONTH":
                                string = fitPayAddCardActivity.getString(R.string.expiration_month_required);
                                break;
                            case "MISSING_EXPIRY_DATE":
                                string = fitPayAddCardActivity.getString(R.string.expiration_date_required);
                                break;
                            case "MISSING_EXPIRY_YEAR":
                                string = fitPayAddCardActivity.getString(R.string.expiration_year_required);
                                break;
                            case "MISSING_SECURITY_CODE":
                                string = fitPayAddCardActivity.getString(R.string.security_code_required);
                                break;
                            case "MISSING_CARDHOLDER_NAME":
                                string = fitPayAddCardActivity.getString(R.string.cardholder_name_required);
                                break;
                            default:
                                string = "";
                                break;
                        }
                        string.getClass();
                        sb3.append("\n - ".concat(string));
                    }
                }
                String string5 = sb3.toString();
                String string6 = fitPayAddCardActivity.getString(R.string.lbl_ok);
                string6.getClass();
                FitPayAddCardActivity.da(fitPayAddCardActivity, string5, new o13.p(string6, new c(fitPayAddCardActivity, 10)));
                break;
        }
        return Unit.INSTANCE;
    }
}
