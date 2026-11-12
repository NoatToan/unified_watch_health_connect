package fo2;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.util.GarminPayEnumTypeAdapter;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@GarminPayEnumTypeAdapter.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lfo2/x;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum x {
    ALIPAY { // from class: fo2.x.a

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f73135d = R.string.wallet_payment_alipay;

        @Override // fo2.x
        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF73135d() {
            return this.f73135d;
        }
    },
    WECHAT { // from class: fo2.x.b
        @Override // fo2.x
        /* JADX INFO: renamed from: a */
        public final int getF73135d() {
            throw new ns2.d("Won't be called");
        }
    };

    /* synthetic */ x(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract int getF73135d();
}
