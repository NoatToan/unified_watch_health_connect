package so2;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardActivity;
import fo2.x;
import java.io.Serializable;
import o72.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import vb.h;
import yr2.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lso2/e;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f160484b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f160485c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SnowballAddCardActivity.d f160486a;

    static {
        int i14 = gt2.c.f79010a;
        f160485c = gt2.b.f79005a.h("PAY#SB#ProvisionIntroductionFrag");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_snowball_provision_introduction, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f160486a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String string;
        String string2;
        Serializable serializable;
        view2.getClass();
        Bundle arguments = getArguments();
        Logger logger = f160485c;
        if (arguments == null || (string = arguments.getString("extra.card_image_url")) == null) {
            logger.error("Failed to get card image url");
            return;
        }
        ImageView imageView = (ImageView) view2.findViewById(R.id.card_image);
        imageView.getClass();
        j.b(imageView, string, 30, 4);
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("extra.card_name")) == null) {
            logger.error("Failed to get card name");
            return;
        }
        hn2.c cVarF = t.F(this);
        if (cVarF == null) {
            logger.error("Failed to cast activity to GarminPayBaseActivity");
            return;
        }
        cVarF.W9(string2, hn2.c.a.BACK);
        cVarF.X9(true);
        ((TextView) view2.findViewById(R.id.description_title)).setText(getString(R.string.wallet_important_things, string2));
        Bundle arguments3 = getArguments();
        x xVar = null;
        if (arguments3 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments3.getSerializable("extra.payment_channel", x.class);
            } else {
                Serializable serializable2 = arguments3.getSerializable("extra.payment_channel");
                serializable = (x) (serializable2 instanceof x ? serializable2 : null);
            }
            xVar = (x) serializable;
        }
        xVar.getClass();
        ((TextView) view2.findViewById(R.id.description_line1)).setText(getString(R.string.wallet_important_things_payment_account_required, getString(xVar.getF73135d())));
        Bundle arguments4 = getArguments();
        if (arguments4 == null) {
            h.z("Least charge is not passed");
            return;
        }
        double d14 = arguments4.getDouble("extra.charge_at_least");
        TextView textView = (TextView) view2.findViewById(R.id.description_line2);
        ko2.c.f105778b.getClass();
        textView.setText(getString(R.string.wallet_important_things_least_initial_charge_amount, ko2.c.f(d14), getString(R.string.wallet_currency_cny)));
        Bundle arguments5 = getArguments();
        if (arguments5 == null) {
            h.z("Age before deletable days is not passed");
        } else {
            ((TextView) view2.findViewById(R.id.description_line3)).setText(getString(R.string.wallet_important_things_minimum_age_to_remove, String.valueOf(arguments5.getInt("extra.age_before_deletable_days"))));
            ((Button) view2.findViewById(R.id.next)).setOnClickListener(new oq.a(this, 27));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lso2/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "EXTRA_CARD_IMAGE_URL", "EXTRA_CARD_NAME", "EXTRA_PAYMENT_CHANNEL", "EXTRA_CHARGE_AT_LEAST", "EXTRA_AGE_BEFORE_DELETABLE_DAYS", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
