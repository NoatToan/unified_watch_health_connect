package ps2;

import android.content.SharedPreferences;
import ch.qos.logback.classic.Logger;
import com.garmin.garminpay.util.EnumTypeAdapterFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001d\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lps2/p;", "", "Lkotlin/Function1;", "", "Landroid/content/SharedPreferences;", "sharedPrefsFactory", "<init>", "(Le23/l;)V", "a", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f140532d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<String, SharedPreferences> f140533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f140534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f140535c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"ps2/q", "Lcom/google/gson/reflect/TypeToken;", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends TypeToken<hs2.a> {
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f140532d = gt2.b.f79005a.i("PAY#CORE#DeviceWalletMetadataCache");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(e23.l<? super String, ? extends SharedPreferences> lVar) {
        lVar.getClass();
        this.f140533a = lVar;
        this.f140534b = o13.m.b(new ov1.u(this, 17));
        this.f140535c = new byte[]{0};
    }

    public static hs2.a a(String str) {
        if (str != null) {
            try {
                Gson gsonCreate = new GsonBuilder().registerTypeAdapterFactory(new EnumTypeAdapterFactory()).create();
                gsonCreate.getClass();
                return (hs2.a) gsonCreate.fromJson(str, new b().getType());
            } catch (Throwable th3) {
                f140532d.warn("Failed to parse DeviceWalletMetadata, treat it as null", th3);
            }
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lps2/p$a;", "", "<init>", "()V", "", "WALLET_PREFS_NAME", "Ljava/lang/String;", "Lch/qos/logback/classic/Logger;", "LOGGER", "Lch/qos/logback/classic/Logger;", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
