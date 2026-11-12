package au0;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f12909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12910c;

    public /* synthetic */ g(e23.l lVar, String str, int i14) {
        this.f12908a = i14;
        this.f12909b = lVar;
        this.f12910c = str;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Parcelable parcelable;
        int i14 = this.f12908a;
        int i15 = 17;
        e23.l lVar = this.f12909b;
        String str = this.f12910c;
        switch (i14) {
            case 0:
                Double d14 = (Double) obj;
                d14.doubleValue();
                lVar.invoke(d53.u.v(String.format("%.2f", Arrays.copyOf(new Object[]{d14}, 1)), ".", str, false));
                break;
            case 1:
                ((Boolean) obj).booleanValue();
                lVar.invoke(str);
                break;
            case 2:
                ((Boolean) obj).booleanValue();
                lVar.invoke(str);
                break;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                if (str2.length() != 0) {
                    str = str2;
                }
                lVar.invoke(str);
                break;
            case 4:
                ((Boolean) obj).booleanValue();
                lVar.invoke(str);
                break;
            case 5:
                f.a aVar = (f.a) obj;
                aVar.getClass();
                if (aVar.f67585a == -1) {
                    Intent intent = aVar.f67586b;
                    if (intent != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            parcelable = (Parcelable) intent.getParcelableExtra(str, Uri.class);
                        } else {
                            Parcelable parcelableExtra = intent.getParcelableExtra(str);
                            parcelable = (Uri) (parcelableExtra instanceof Uri ? parcelableExtra : null);
                        }
                        Uri uri = (Uri) parcelable;
                        if (uri != null) {
                            lVar.invoke(uri);
                        }
                    }
                } else {
                    lVar.invoke(null);
                }
                break;
            case 6:
                androidx.appcompat.app.e.a aVar2 = (androidx.appcompat.app.e.a) obj;
                aVar2.getClass();
                aVar2.setTitle(R.string.wallet_processing_request);
                aVar2.setMessage(aVar2.getContext().getString(R.string.wallet_message_processing_request_come_back_later, str));
                aVar2.setCancelable(false);
                aVar2.setPositiveButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e(lVar, 12));
                break;
            case 7:
                androidx.appcompat.app.e.a aVar3 = (androidx.appcompat.app.e.a) obj;
                aVar3.getClass();
                aVar3.setTitle(R.string.wallet_card_function_restricted_title);
                aVar3.setMessage(aVar3.getContext().getString(R.string.wallet_card_function_restricted_description, str, aVar3.getContext().getString(R.string.wallet_upgrade_now)));
                aVar3.setNegativeButton(R.string.common_button_later, new mt0.y(i15));
                aVar3.setPositiveButton(R.string.wallet_upgrade_now, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e(lVar, 13));
                break;
            case 8:
                androidx.appcompat.app.e.a aVar4 = (androidx.appcompat.app.e.a) obj;
                int i16 = vq2.b.f179457y0;
                aVar4.getClass();
                String string = aVar4.getContext().getString(R.string.connect_iq_device_is_busy);
                string.getClass();
                aVar4.setTitle(String.format(string, Arrays.copyOf(new Object[]{str}, 1)));
                aVar4.setMessage(aVar4.getContext().getString(R.string.connect_iq_music_setup_try_again));
                aVar4.setCancelable(false);
                aVar4.setPositiveButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e(lVar, i15));
                break;
            case 9:
                Double d15 = (Double) obj;
                d15.doubleValue();
                lVar.invoke(d53.u.v(String.format("%.2f", Arrays.copyOf(new Object[]{d15}, 1)), ".", str, false));
                break;
            default:
                String str3 = (String) obj;
                str3.getClass();
                if (!str3.equals(str)) {
                    lVar.invoke(str3);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(String str, e23.l lVar, int i14) {
        this.f12908a = i14;
        this.f12910c = str;
        this.f12909b = lVar;
    }
}
