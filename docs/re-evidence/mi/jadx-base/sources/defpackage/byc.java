package defpackage;

import com.miui.tsmclient.entity.MifareTag;
import com.miui.tsmclient.entity.ProbeParam;
import com.miui.tsmclient.entity.SectorKey;
import com.miui.tsmclient.sesdk.MifareClassicTag;
import com.xiaomi.fitness.nfc.bean.CardSwitcherBean;
import com.xiaomi.fitness.nfc.bean.NfcResponse;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface byc {
    int a(String str) throws Exception;

    void b(String str, int i, int i2, int i3, y64.o oVar);

    NfcResponse c(int i, byte[] bArr) throws Exception;

    void checkCRSStatus(ssg.b bVar);

    void closeTai(ssg.b<Boolean> bVar);

    void d(wrg wrgVar);

    void e(boolean z, wrg[] wrgVarArr);

    void f(String str, int i);

    NfcResponse g(byte[] bArr) throws Exception;

    void h(String str, int i, int i2, int i3);

    String i() throws Exception;

    boolean j(String str, int i) throws Exception;

    boolean k();

    CardSwitcherBean l(String str, int i) throws Exception;

    MifareClassicTag m(List<SectorKey> list) throws Exception;

    int n(int i, int i2, String str, String str2);

    void o(wrg wrgVar);

    void openTai(ssg.b<Boolean> bVar);

    void p(String str, int i);

    void pinStatus(ssg.b bVar);

    hsg q(ProbeParam probeParam) throws Exception;

    MifareTag r(int i) throws Exception;
}
