package defpackage;

import com.xiaomi.hm.health.bt.model.HMAccessInfo;
import com.xiaomi.hm.health.bt.model.HMAidInfo;
import com.xiaomi.hm.health.bt.model.HMCardSwitchTime;
import com.xiaomi.hm.health.bt.model.HMCardTSResponse;
import com.xiaomi.hm.health.bt.profile.nfc.ApduResponse;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardConfig;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardIdent;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardInfo;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardStatus;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardType;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCStatus;
import com.xiaomi.hm.health.bt.profile.nfc.PasswordInteractionResponse;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class xbt implements gm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pct f38956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f38957b = false;

    public xbt(jet jetVar) {
        this.f38956a = null;
        this.f38956a = new pct(jetVar);
    }

    @Override // defpackage.gm
    public void a(@NotNull bj bjVar) {
    }

    @Override // defpackage.gm
    public boolean b() {
        return false;
    }

    @Override // defpackage.gm
    public synchronized PasswordInteractionResponse c() {
        PasswordInteractionResponse passwordInteractionResponseG;
        try {
            if (this.f38957b) {
                passwordInteractionResponseG = this.f38956a.G();
            } else {
                if (!this.f38956a.init()) {
                    return null;
                }
                passwordInteractionResponseG = this.f38956a.G();
                this.f38956a.deInit();
            }
            return passwordInteractionResponseG;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.gm
    public synchronized HMNFCCardInfo d() {
        HMNFCCardInfo hMNFCCardInfoD;
        try {
            if (this.f38957b) {
                hMNFCCardInfoD = this.f38956a.D();
            } else {
                if (!this.f38956a.init()) {
                    return null;
                }
                hMNFCCardInfoD = this.f38956a.D();
                this.f38956a.deInit();
            }
            return hMNFCCardInfoD;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.gm
    public synchronized HMNFCStatus disconnect() {
        int iB;
        iB = this.f38956a.B();
        this.f38956a.deInit();
        this.f38956a.m(null);
        this.f38957b = false;
        return new HMNFCStatus(iB);
    }

    @Override // defpackage.gm
    public synchronized boolean e() {
        boolean zC;
        try {
            if (this.f38957b) {
                zC = this.f38956a.C();
            } else {
                if (!this.f38956a.init()) {
                    return true;
                }
                zC = this.f38956a.C();
                this.f38956a.deInit();
            }
            return zC;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.gm
    public synchronized boolean f() {
        if (this.f38957b) {
            return this.f38956a.I();
        }
        if (!this.f38956a.init()) {
            return false;
        }
        boolean zI = this.f38956a.I();
        this.f38956a.deInit();
        return zI;
    }

    @Override // defpackage.gm
    public synchronized HMNFCStatus a(w1t w1tVar) {
        if (!this.f38956a.init()) {
            return null;
        }
        this.f38957b = true;
        this.f38956a.m(w1tVar);
        return new HMNFCStatus(this.f38956a.A());
    }

    @Override // defpackage.gm
    @NotNull
    public HMCardTSResponse<Boolean> b(@NotNull HMCardSwitchTime hMCardSwitchTime) {
        return new HMCardTSResponse<>(Boolean.FALSE, null);
    }

    @Override // defpackage.gm
    public synchronized ApduResponse a(byte[] bArr, int i, boolean z) {
        if (bArr != null) {
            if (bArr.length != 0) {
                return this.f38956a.c(bArr, i, z);
            }
        }
        return null;
    }

    @Override // defpackage.gm
    public synchronized ApduResponse a(byte[] bArr, int i) {
        if (bArr != null) {
            if (bArr.length != 0) {
                return this.f38956a.x(bArr, i);
            }
        }
        return null;
    }

    @Override // defpackage.gm
    public synchronized HMNFCCardStatus a(HMNFCCardConfig hMNFCCardConfig) {
        if (this.f38957b) {
            return this.f38956a.g(hMNFCCardConfig);
        }
        if (!this.f38956a.init()) {
            return null;
        }
        HMNFCCardStatus hMNFCCardStatusG = this.f38956a.g(hMNFCCardConfig);
        this.f38956a.deInit();
        return hMNFCCardStatusG;
    }

    @Override // defpackage.gm
    public synchronized boolean a(List<? extends HMNFCCardIdent> list, @NotNull HMNFCCardType hMNFCCardType) {
        if (this.f38957b) {
            return this.f38956a.t(list, hMNFCCardType);
        }
        if (!this.f38956a.init()) {
            return false;
        }
        boolean zT = this.f38956a.t(list, hMNFCCardType);
        this.f38956a.deInit();
        return zT;
    }

    @Override // defpackage.gm
    public synchronized ApduResponse a(byte[] bArr) {
        ApduResponse apduResponseY;
        try {
            if (this.f38957b) {
                apduResponseY = this.f38956a.y(bArr);
            } else {
                if (!this.f38956a.init()) {
                    return null;
                }
                apduResponseY = this.f38956a.y(bArr);
                this.f38956a.deInit();
            }
            return apduResponseY;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.gm
    public synchronized boolean a(String str) {
        boolean zS;
        try {
            if (this.f38957b) {
                zS = this.f38956a.s(str);
            } else {
                if (!this.f38956a.init()) {
                    return false;
                }
                zS = this.f38956a.s(str);
                this.f38956a.deInit();
            }
            return zS;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.gm
    public synchronized boolean a() {
        boolean zJ;
        try {
            if (this.f38957b) {
                zJ = this.f38956a.J();
            } else {
                if (!this.f38956a.init()) {
                    return false;
                }
                zJ = this.f38956a.J();
                this.f38956a.deInit();
            }
            return zJ;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.gm
    public boolean a(@NotNull HMAidInfo hMAidInfo) {
        return this.f38956a.q(hMAidInfo);
    }

    @Override // defpackage.gm
    public boolean a(@NotNull HMAccessInfo hMAccessInfo) {
        return this.f38956a.p(hMAccessInfo);
    }

    @Override // defpackage.gm
    @NotNull
    public HMCardTSResponse<List<HMCardSwitchTime>> a(@NotNull String str, int i) {
        return new HMCardTSResponse<>(null, null);
    }

    @Override // defpackage.gm
    @NotNull
    public HMCardTSResponse<Boolean> a(@NotNull HMCardSwitchTime hMCardSwitchTime) {
        return new HMCardTSResponse<>(Boolean.FALSE, null);
    }
}
