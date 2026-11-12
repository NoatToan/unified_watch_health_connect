package com.huami.nfc.applet.city;

import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.applet.CardInfo;
import com.huami.nfc.applet.TransEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\f"}, d2 = {"Lcom/huami/nfc/applet/city/ICityApplet;", "", "", "isInstalled", "", "getBalance", "Lcom/huami/nfc/applet/CardInfo;", "getCardInfo", "", "Lcom/huami/nfc/applet/TransEntity;", "getTransRecord", "getChargeRecord", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public interface ICityApplet {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Object> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                return "default charge record = []";
            }
        }

        @NotNull
        public static List<TransEntity> getChargeRecord(@NotNull ICityApplet iCityApplet) {
            LogcatKt.info$default(Logcat.INSTANCE, null, a.a, 1, null);
            return new ArrayList();
        }
    }

    int getBalance();

    @NotNull
    CardInfo getCardInfo();

    @NotNull
    List<TransEntity> getChargeRecord();

    @NotNull
    List<TransEntity> getTransRecord();

    boolean isInstalled();
}
